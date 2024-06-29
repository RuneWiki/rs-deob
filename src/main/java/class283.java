import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class283 extends class325 {

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    private int field4178 = 0;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    private int field4181 = 1;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    private int field4186 = 0;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
    public static int[] field4183 = new int[3];

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "Z")
    public static boolean field4180 = false;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLkf;)[I", line = 3)
    public static final int[] method1815(byte arg0, class267 arg1) {
        ++field4187;
        class376 var2 = new class376(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; ++var4) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method2380(65280, 10);
        var2.method2354(var3[0], (byte) 54);
        var2.method2354(var3[1], (byte) 77);
        var2.method2354(var3[2], (byte) 102);
        var2.method2354(var3[3], (byte) 112);
        for (int var5 = 0; var5 < 10; ++var5) {
            var2.method2354((int) (9.9999999E7D * Math.random()), (byte) 75);
        }
        var2.method2415(false, (int) (9.9999999E7D * Math.random()));
        var2.method2367(class46.field696, class384.field5620, (byte) 90);
        if (arg0 < 26) {
            method1816(100, -60, (byte) -127);
        }
        arg1.field3938.method2403(var2.field5518, var2.field5459, 128, 0);
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 88)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 52)
    public final void method101(boolean arg0) {
        class38.method266(arg0);
        if (arg0) {
            ++field4188;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(IIB)Z", line = 77)
    public static final boolean method1816(int arg0, int arg1, byte arg2) {
        if (arg2 != -12) {
            return false;
        } else {
            ++field4189;
            return (2048 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lgaa;Z)V", line = 95)
    public static final void method1817(class315 arg0, boolean arg1) {
        arg0.method1990(arg1);
        ++field4179;
        int var2 = class363.field5292;
        class73 var3 = class551.field7456 = class599.field8149[var2] = new class73();
        var3.field1812 = var2;
        int var4 = arg0.method1993(-1, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (268419765 & var4) >> 14;
        var3.field1890[0] = -class121.field1765 + var6;
        int var7 = var4 & 16383;
        var3.field2257 = (var3.field1890[0] << 9) + (var3.method655(-128) << 8);
        var3.field1884[0] = -class230.field3147 + var7;
        var3.field2259 = (var3.field1884[0] << 9) - -(var3.method655(-127) << 8);
        class610.field8296 = var3.field2250 = var3.field2244 = var5;
        if (class74.method661(var3.field1890[0], var3.field1884[0], 1)) {
            ++var3.field2244;
        }
        if (class81.field1149[var2] != null) {
            var3.method643(class81.field1149[var2], true);
        }
        class571.field7608 = 0;
        class79.field1136[class571.field7608++] = var2;
        class256.field3832[var2] = 0;
        class741.field10225 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg0.method1993(-1, 18);
                int var10 = var9 >> 16;
                int var11 = (65299 & var9) >> 8;
                int var12 = 255 & var9;
                class349 var13 = class94.field1342[var8] = new class349();
                var13.field5124 = -1;
                var13.field5121 = false;
                var13.field5122 = 0;
                var13.field5126 = (var10 << 28) + (var11 << 14) + var12;
                var13.field5127 = false;
                class613.field8313[class741.field10225++] = var8;
                class256.field3832[var8] = 0;
            }
        }
        arg0.method1984(-128);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[I", line = 167)
    public final int[] method100(byte arg0, int arg1) {
        ++field4182;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            int var4 = class621.field8370[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class261.field3874 < ~var6; ++var6) {
                int var7 = class556.field7498[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4178 == 0) {
                    var9 = (var7 - var4) * this.field4181;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field4181 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (this.field4186 != 0) {
                    if (this.field4186 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class406.field5886[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 <= 21) {
            this.field4181 = -120;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 237)
    public static void method1818(int arg0) {
        field4183 = null;
        if (arg0 != 1) {
            method1818(-29);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lgw;Laj;Ldr;Laj;Laj;I)Z", line = 247)
    public static final boolean method1819(class182 arg0, class333 arg1, class751 arg2, class333 arg3, class333 arg4, int arg5) {
        class27.field406 = arg1;
        class348.field5114 = new int[16];
        ++field4177;
        class207.field2705 = arg2;
        class433.field6139 = arg3;
        class30.field431 = arg4;
        class454.field6313 = arg0;
        if (arg5 != 1158) {
            method1817((class315) null, false);
        }
        for (int var6 = 0; ~var6 > -17; ++var6) {
            class348.field5114[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljp;IB)V", line = 274)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 >= -41) {
            method1820(56);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field4181 = arg0.method2398(-1372747256);
                }
            } else {
                this.field4186 = arg0.method2398(-1372747256);
            }
        } else {
            this.field4178 = arg0.method2398(-1372747256);
        }
        ++field4185;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 320)
    public static final void method1820(int arg0) {
        class174.field2339 = null;
        ++field4184;
        if (arg0 != 18) {
            method1817((class315) null, false);
        }
    }
}
