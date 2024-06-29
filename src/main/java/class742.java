import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class742 extends class214 {

    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
    private int field10406 = 0;

    @OriginalMember(owner = "client!ufa", name = "H", descriptor = "I")
    private int field10410 = 4096;

    @OriginalMember(owner = "client!ufa", name = "K", descriptor = "[Z")
    public static boolean[] field10413 = new boolean[8];

    @OriginalMember(owner = "client!ufa", name = "E", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!ufa", name = "F", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!ufa", name = "G", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!ufa", name = "I", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!ufa", name = "J", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I[IB[II)V", line = 4)
    public static final void method4155(int arg0, int[] arg1, byte arg2, int[] arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
            for (int var10 = arg0; ~var10 > ~arg4; ++var10) {
                if ((var10 & var9) + var7 > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method4155(arg0, arg1, (byte) -76, arg3, var6 + -1);
            method4155(var6 - -1, arg1, (byte) -79, arg3, arg4);
        }
        if (arg2 >= -35) {
            method4157();
        }
        ++field10408;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "()V", line = 61)
    public class742() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)V", line = 65)
    public static void method4156(int arg0) {
        field10413 = null;
        if (arg0 != 8) {
            method4157();
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "()V", line = 77)
    public static final void method4157() {
        for (int var0 = 0; var0 < class266.field4132; ++var0) {
            class559 var1 = class81.field1166[var0];
            class35.method201(var1, true);
            class81.field1166[var0] = null;
        }
        class266.field4132 = 0;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IB)[I", line = 94)
    public final int[] method64(int arg0, byte arg1) {
        ++field10412;
        if (arg1 != 5) {
            field10413 = null;
        }
        int[] var3 = super.field3544.method3869(arg0, -116);
        if (super.field3544.field9836) {
            int[] var4 = this.method1545(arg0, 0, arg1 + -6);
            for (int var5 = 0; class626.field8787 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field10406 <= var6 && var6 <= this.field10410 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)Lfe;", line = 129)
    public static final class636 method4158(int arg0, boolean arg1) {
        ++field10407;
        class636[] var2 = class60.method592(4);
        if (arg1) {
            method4156(-6);
        }
        for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
            class636 var4 = var2[var3];
            if (~var4.field8937 == ~arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZI)Z", line = 155)
    public static final boolean method4159(int arg0, boolean arg1, int arg2) {
        ++field10411;
        if (!arg1) {
            field10413 = null;
        }
        if (!(class476.method2896(arg2, 24, arg0) | ~(65536 & arg2) != -1) && !class217.method1555(arg2, arg0, !arg1)) {
            return ~(arg0 & 55) == -1 && class496.method3008(arg0, 45056, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILofa;I)V", line = 177)
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field10409;
        if (arg0 <= 92) {
            this.field10410 = -35;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field10410 = arg1.method1989((byte) -125);
            }
        } else {
            this.field10406 = arg1.method1989((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "()V", line = 215)
    public static final void method4160() {
        byte var0 = 10;
        byte var1 = 30;
        if (class26.field267 != 0 && class35.field332 != null) {
            class478.field6933.method331(class192.field3327);
            for (int var2 = 0; var2 < class671.field9501.length; ++var2) {
                class478.field6933.method3194(-21151, class192.field3327[1], class671.field9501[var2] + class436.field6358[var2], -256, class192.field3327[3] - class192.field3327[1]);
            }
            for (int var3 = 0; var3 < class644.field9188; ++var3) {
                class328 var11 = class573.field8132[var3];
                class478.field6933.method337(var11.field4839[0], var11.field4832[0], var11.field4835[0], class141.field2212);
                class478.field6933.method337(var11.field4839[1], var11.field4832[1], var11.field4835[1], class414.field6092);
                class478.field6933.method337(var11.field4839[2], var11.field4832[2], var11.field4835[2], class124.field1908);
                class478.field6933.method337(var11.field4839[3], var11.field4832[3], var11.field4835[3], class546.field7810);
                if (class141.field2212[2] != -1 && class414.field6092[2] != -1 && class124.field1908[2] != -1 && class546.field7810[2] != -1) {
                    int var12 = -65536;
                    if (var11.field4850 == 4) {
                        var12 = -16776961;
                    }
                    class478.field6933.method3187(class141.field2212[1], class414.field6092[0], class141.field2212[0], var12, 96, class414.field6092[1]);
                    class478.field6933.method3187(class414.field6092[1], class124.field1908[0], class414.field6092[0], var12, 117, class124.field1908[1]);
                    class478.field6933.method3187(class124.field1908[1], class546.field7810[0], class124.field1908[0], var12, 107, class546.field7810[1]);
                    class478.field6933.method3187(class546.field7810[1], class141.field2212[0], class546.field7810[0], var12, 91, class141.field2212[1]);
                    class478.field6933.method3187(class141.field2212[1], class124.field1908[0], class141.field2212[0], var12, 119, class124.field1908[1]);
                }
            }
            class35.field332.method2483(-256, var0, "Dynamic: " + class266.field4132 + "/" + 5000, var1 + 45, -57, -16777216);
            class35.field332.method2483(-256, var0, "Total Opaque Onscreen: " + class641.field9058 + "/" + 10000, var1 + 60, -56, -16777216);
            class35.field332.method2483(-256, var0, "Total Trans Onscreen: " + class8.field77 + "/" + 5000, var1 + 75, -36, -16777216);
            class35.field332.method2483(-256, var0, "Occluders: " + (class757.field10543 + class19.field199) + " Active: " + class644.field9188, var1 + 90, -117, -16777216);
            class35.field332.method2483(-256, var0, "Occluded: Ground:" + class331.field4876 + " Walls: " + class685.field9683 + " CPs: " + class200.field3412 + " Pixels: " + class699.field9884, var1 + 105, -109, -16777216);
            class35.field332.method2483(-256, var0, "Occlude Calc Took: " + class494.field7157 / 1000L + "us", var1 + 120, -52, -16777216);
            if (class26.field267 == 2 && class117.field1804 != null) {
                for (int var4 = 0; var4 < class117.field1804.length; ++var4) {
                    float var6 = (float) class117.field1804[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class117.field1804[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class34 var5 = class478.field6933.method3185(0, class117.field1804, false, class753.field10491, class124.field1907, class124.field1907);
                var5.method48(var0, 170, 1, 0, 0);
            }
        }
    }
}
