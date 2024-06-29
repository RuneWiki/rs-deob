import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class26 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public int field236 = 0;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lfh;")
    public class210 field237 = null;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
    public boolean field248 = false;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
    public boolean field247 = false;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "[S")
    public short[] field246;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[S")
    public short[] field238;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
    public short[] field243;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
    public short[] field241;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[S")
    public short[] field244;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[B")
    public byte[] field245;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[S")
    private static short[] field235 = new short[500];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[S")
    private static short[] field234 = new short[500];

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[S")
    private static short[] field239 = new short[500];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[B")
    private static byte[] field240 = new byte[500];

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[S")
    private static short[] field242 = new short[500];

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[S")
    private static short[] field249 = new short[500];

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BLfh;)V", line = 58)
    public class26(byte[] arg0, class210 arg1) {
        this.field237 = arg1;
        try {
            class250 var3 = new class250(arg0);
            class250 var4 = new class250(arg0);
            var3.field3389 = 2;
            int var5 = var3.method1350(31351);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field3389 = var3.field3389 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field237.field2852[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method1350(31351);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field239[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field235[var6] = var12;
                    } else {
                        field235[var6] = (short) var4.method1340((byte) 39);
                    }
                    if ((var11 & 0x2) == 0) {
                        field234[var6] = var12;
                    } else {
                        field234[var6] = (short) var4.method1340((byte) 36);
                    }
                    if ((var11 & 0x4) == 0) {
                        field249[var6] = var12;
                    } else {
                        field249[var6] = (short) var4.method1340((byte) 33);
                    }
                    field240[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field235[var6] = (short) (((field235[var6] & 0xFF) << 3) + (field235[var6] >> 8 & 0x7));
                        field234[var6] = (short) (((field234[var6] & 0xFF) << 3) + (field234[var6] >> 8 & 0x7));
                        field249[var6] = (short) (((field249[var6] & 0xFF) << 3) + (field249[var6] >> 8 & 0x7));
                        field235[var6] = (short) (field235[var6] << 3);
                        field234[var6] = (short) (field234[var6] << 3);
                        field249[var6] = (short) (field249[var6] << 3);
                    }
                    field242[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field242[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field248 = true;
                    } else if (var10 == 7) {
                        this.field247 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field3389) {
                throw new RuntimeException();
            }
            this.field236 = var6;
            this.field246 = new short[var6];
            this.field238 = new short[var6];
            this.field243 = new short[var6];
            this.field241 = new short[var6];
            this.field244 = new short[var6];
            this.field245 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field246[var13] = field239[var13];
                this.field238[var13] = field235[var13];
                this.field243[var13] = field234[var13];
                this.field241[var13] = field249[var13];
                this.field244[var13] = field242[var13];
                this.field245[var13] = field240[var13];
            }
        } catch (Exception var14) {
            this.field236 = 0;
            this.field248 = false;
            this.field247 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 20)
    public static void method131() {
        field239 = null;
        field235 = null;
        field234 = null;
        field249 = null;
        field242 = null;
        field240 = null;
    }
}
