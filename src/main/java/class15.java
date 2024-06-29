import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class15 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field243 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Z")
    public boolean field247 = false;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
    public boolean field253 = false;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
    public boolean field256 = false;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lsp;")
    public class509 field246 = null;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[S")
    public short[] field248;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "[S")
    public short[] field242;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[S")
    public short[] field252;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[S")
    public short[] field254;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[S")
    public short[] field244;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[B")
    public byte[] field255;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[S")
    private static short[] field241 = new short[500];

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[S")
    private static short[] field249 = new short[500];

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[S")
    private static short[] field250 = new short[500];

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[S")
    private static short[] field251 = new short[500];

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[S")
    private static short[] field245 = new short[500];

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[B")
    private static byte[] field257 = new byte[500];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
    public static void method97() {
        field245 = null;
        field241 = null;
        field251 = null;
        field249 = null;
        field250 = null;
        field257 = null;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([BLsp;)V")
    public class15(byte[] arg0, class509 arg1) {
        this.field246 = arg1;
        try {
            class88 var3 = new class88(arg0);
            class88 var4 = new class88(arg0);
            var3.field1176 = 2;
            int var5 = var3.method617(2);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field1176 = var3.field1176 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field246.field7467[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method617(2);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field245[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3 || var10 == 10) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field241[var6] = var12;
                    } else {
                        field241[var6] = (short) var4.method602(false);
                    }
                    if ((var11 & 0x2) == 0) {
                        field251[var6] = var12;
                    } else {
                        field251[var6] = (short) var4.method602(false);
                    }
                    if ((var11 & 0x4) == 0) {
                        field249[var6] = var12;
                    } else {
                        field249[var6] = (short) var4.method602(false);
                    }
                    field257[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2 || var10 == 9) {
                        field241[var6] = (short) (((field241[var6] & 0xFF) << 3) + (field241[var6] >> 8 & 0x7));
                        field251[var6] = (short) (((field251[var6] & 0xFF) << 3) + (field251[var6] >> 8 & 0x7));
                        field249[var6] = (short) (((field249[var6] & 0xFF) << 3) + (field249[var6] >> 8 & 0x7));
                        field241[var6] = (short) (field241[var6] << 3);
                        field251[var6] = (short) (field251[var6] << 3);
                        field249[var6] = (short) (field249[var6] << 3);
                    }
                    field250[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field250[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field256 = true;
                    } else if (var10 == 7) {
                        this.field247 = true;
                    } else if (var10 == 9 || var10 == 10 || var10 == 8) {
                        this.field253 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field1176) {
                throw new RuntimeException();
            }
            this.field243 = var6;
            this.field248 = new short[var6];
            this.field242 = new short[var6];
            this.field252 = new short[var6];
            this.field254 = new short[var6];
            this.field244 = new short[var6];
            this.field255 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field248[var13] = field245[var13];
                this.field242[var13] = field241[var13];
                this.field252[var13] = field251[var13];
                this.field254[var13] = field249[var13];
                this.field244[var13] = field250[var13];
                this.field255[var13] = field257[var13];
            }
        } catch (Exception var14) {
            this.field243 = 0;
            this.field256 = false;
            this.field247 = false;
        }
    }
}
