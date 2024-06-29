import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class218 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Z")
    public boolean field3039 = false;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lsn;")
    public class328 field3047 = null;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field3046 = 0;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Z")
    public boolean field3048 = false;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[S")
    public short[] field3042;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[S")
    public short[] field3050;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[S")
    public short[] field3044;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[S")
    public short[] field3045;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[S")
    public short[] field3038;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[B")
    public byte[] field3036;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[S")
    private static short[] field3037 = new short[500];

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[B")
    private static byte[] field3043 = new byte[500];

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[S")
    private static short[] field3040 = new short[500];

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[S")
    private static short[] field3041 = new short[500];

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[S")
    private static short[] field3049 = new short[500];

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "[S")
    private static short[] field3051 = new short[500];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V", line = 24)
    public static void method1433() {
        field3041 = null;
        field3049 = null;
        field3040 = null;
        field3037 = null;
        field3051 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([BLsn;)V", line = 58)
    public class218(byte[] arg0, class328 arg1) {
        this.field3047 = arg1;
        try {
            class341 var3 = new class341(arg0);
            class341 var4 = new class341(arg0);
            var3.field5049 = 2;
            int var5 = var3.method2233((byte) 104);
            int var6 = 0;
            int var7 = -1;
            int var8 = -1;
            var4.field5049 = var3.field5049 + var5;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = this.field3047.field4838[var9];
                if (var10 == 0) {
                    var7 = var9;
                }
                int var11 = var3.method2233((byte) 104);
                if (var11 > 0) {
                    if (var10 == 0) {
                        var8 = var9;
                    }
                    field3041[var6] = (short) var9;
                    short var12 = 0;
                    if (var10 == 3) {
                        var12 = 128;
                    }
                    if ((var11 & 0x1) == 0) {
                        field3049[var6] = var12;
                    } else {
                        field3049[var6] = (short) var4.method2247((byte) -98);
                    }
                    if ((var11 & 0x2) == 0) {
                        field3040[var6] = var12;
                    } else {
                        field3040[var6] = (short) var4.method2247((byte) -80);
                    }
                    if ((var11 & 0x4) == 0) {
                        field3037[var6] = var12;
                    } else {
                        field3037[var6] = (short) var4.method2247((byte) -51);
                    }
                    field3043[var6] = (byte) (var11 >>> 3 & 0x3);
                    if (var10 == 2) {
                        field3049[var6] = (short) (((field3049[var6] & 0xFF) << 3) + (field3049[var6] >> 8 & 0x7));
                        field3040[var6] = (short) (((field3040[var6] & 0xFF) << 3) + (field3040[var6] >> 8 & 0x7));
                        field3037[var6] = (short) (((field3037[var6] & 0xFF) << 3) + (field3037[var6] >> 8 & 0x7));
                        field3049[var6] = (short) (field3049[var6] << 3);
                        field3040[var6] = (short) (field3040[var6] << 3);
                        field3037[var6] = (short) (field3037[var6] << 3);
                    }
                    field3051[var6] = -1;
                    if (var10 == 1 || var10 == 2 || var10 == 3) {
                        if (var7 > var8) {
                            field3051[var6] = (short) var7;
                            var8 = var7;
                        }
                    } else if (var10 == 5) {
                        this.field3039 = true;
                    } else if (var10 == 7) {
                        this.field3048 = true;
                    }
                    var6++;
                }
            }
            if (arg0.length != var4.field5049) {
                throw new RuntimeException();
            }
            this.field3046 = var6;
            this.field3042 = new short[var6];
            this.field3050 = new short[var6];
            this.field3044 = new short[var6];
            this.field3045 = new short[var6];
            this.field3038 = new short[var6];
            this.field3036 = new byte[var6];
            for (int var13 = 0; var13 < var6; var13++) {
                this.field3042[var13] = field3041[var13];
                this.field3050[var13] = field3049[var13];
                this.field3044[var13] = field3040[var13];
                this.field3045[var13] = field3037[var13];
                this.field3038[var13] = field3051[var13];
                this.field3036[var13] = field3043[var13];
            }
        } catch (Exception var14) {
            this.field3046 = 0;
            this.field3039 = false;
            this.field3048 = false;
        }
    }
}
