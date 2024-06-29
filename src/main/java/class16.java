import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class16 {

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field272 = 0;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lih;")
    public class55 field274 = null;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
    public boolean field269 = false;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Z")
    public boolean field271 = false;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[S")
    public short[] field266;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[S")
    public short[] field275;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[S")
    public short[] field267;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[S")
    public short[] field276;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "[S")
    public short[] field268;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "[B")
    public byte[] field278;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "[S")
    private static short[] field273 = new short[500];

    @OriginalMember(owner = "client!em", name = "e", descriptor = "[S")
    private static short[] field270 = new short[500];

    @OriginalMember(owner = "client!em", name = "l", descriptor = "[S")
    private static short[] field277 = new short[500];

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[S")
    private static short[] field279 = new short[500];

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[S")
    private static short[] field281 = new short[500];

    @OriginalMember(owner = "client!em", name = "o", descriptor = "[B")
    private static byte[] field280 = new byte[500];

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V")
    public static void method153() {
        field277 = null;
        field270 = null;
        field281 = null;
        field273 = null;
        field279 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "([BLih;)V")
    public class16(byte[] arg0, class55 arg1) {
        this.field274 = arg1;
        try {
            class425 var3 = new class425(arg0);
            class425 var4 = new class425(arg0);
            var3.field5830 = 2;
            int var5 = var3.method2503(true);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5830 = var3.field5830 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field274.field890[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2503(true);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field277[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field270[var6] = var12;
                    } else {
                        field270[var6] = (short) var4.method2455(255);
                    }
                    if ((var11 & 0x2) == 0) {
                        field281[var6] = var12;
                    } else {
                        field281[var6] = (short) var4.method2455(255);
                    }
                    if ((var11 & 0x4) == 0) {
                        field273[var6] = var12;
                    } else {
                        field273[var6] = (short) var4.method2455(255);
                    }
                    field280[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field270[var6] = (short) (((field270[var6] & 0xFF) << 3) + (field270[var6] >> 8 & 0x7));
                        field281[var6] = (short) (((field281[var6] & 0xFF) << 3) + (field281[var6] >> 8 & 0x7));
                        field273[var6] = (short) (((field273[var6] & 0xFF) << 3) + (field273[var6] >> 8 & 0x7));
                        field270[var6] = (short) (field270[var6] << 3);
                        field281[var6] = (short) (field281[var6] << 3);
                        field273[var6] = (short) (field273[var6] << 3);
                    }
                    field279[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field279[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field269 = true;
                    } else if (var10 == 7) {
                        this.field271 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5830) {
                throw new RuntimeException();
            }
            this.field272 = var6;
            this.field266 = new short[var6];
            this.field275 = new short[var6];
            this.field267 = new short[var6];
            this.field276 = new short[var6];
            this.field268 = new short[var6];
            this.field278 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field266[var13] = field277[var13];
                this.field275[var13] = field270[var13];
                this.field267[var13] = field281[var13];
                this.field276[var13] = field273[var13];
                this.field268[var13] = field279[var13];
                this.field278[var13] = field280[var13];
            }
        } catch (Exception var14) {
            this.field272 = 0;
            this.field269 = false;
            this.field271 = false;
        }
    }
}
