import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class200 extends class134 {

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lmu;")
    public static class303 field2376;

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lkda;)V", line = 4)
    public class200(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lha;Ld;IIIBI)V", line = 7)
    public static final void method1105(class60 arg0, class152 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class491.field6703 < 100) {
            class525.method2910(arg0, arg1, 107);
        }
        ++field2381;
        arg0.method426(arg3, arg2, arg3 + arg6, arg2 + arg4);
        if (class491.field6703 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg3;
            int var9 = arg4 / 2 + arg2 + -var7 + -18;
            arg0.method447(arg3, arg2, arg6, arg4, -16777216, 0);
            arg0.method391(var8 + -152, var9, 304, 34, class182.field2231[class11.field67].getRGB(), 0);
            arg0.method447(var8 - 150, var9 - -2, class491.field6703 * 3, 30, class728.field10167[class11.field67].getRGB(), 0);
            class214.field2575.method479(class557.field7846[class11.field67].getRGB(), class755.field10498.method4201(class723.field10095, (byte) 25), var8, -1, (byte) -50, var7 + var9);
        } else {
            int var10 = class510.field6893 - (int) ((float) arg6 / class642.field8936);
            int var11 = (int) ((float) arg4 / class642.field8936) + class450.field6297;
            int var12 = (int) ((float) arg6 / class642.field8936) + class510.field6893;
            class191.field2306 = -((int) ((float) arg4 / class642.field8936)) + class450.field6297;
            class487.field6677 = (int) ((float) (arg6 * 2) / class642.field8936);
            class561.field7923 = (int) ((float) (arg4 * 2) / class642.field8936);
            int var13 = 103 % ((arg5 - -12) / 36);
            int var14 = -((int) ((float) arg4 / class642.field8936)) + class450.field6297;
            class18.field124 = -((int) ((float) arg6 / class642.field8936)) + class510.field6893;
            class642.method3622(class642.field8947 + var10, class642.field8950 + var11, class642.field8947 + var12, class642.field8950 + var14, arg3, arg2, arg3 + arg6, arg2 + arg4 + 1);
            class642.method3623(arg0);
            class108 var15 = class642.method3629(arg0);
            class656.method3712(0, arg0, var15, -1, 0);
            if (~class41.field420 < -1) {
                --class354.field4718;
                if (class354.field4718 == 0) {
                    --class41.field420;
                    class354.field4718 = 20;
                }
            }
            if (class518.field6978) {
                int var16 = arg3 - 5 + arg6;
                int var17 = arg2 + -8 + arg4;
                class399.field5650.method462(16776960, 0, var16, -1, "Fps:" + class573.field8071, var17);
                int var21 = var17 - 15;
                Runtime var18 = Runtime.getRuntime();
                int var19 = (int) ((var18.totalMemory() + -var18.freeMemory()) / 1024L);
                int var20 = 16776960;
                if (~var19 < -65537) {
                    var20 = 16711680;
                }
                class399.field5650.method462(var20, 0, var16, -1, "Mem:" + var19 + "k", var21);
                var17 = var21 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(ILkda;)V", line = 87)
    public class200(int arg0, class391 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I", line = 90)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return -116;
        } else {
            ++field2378;
            return 1;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V", line = 101)
    public final void method55(int arg0, int arg1) {
        ++field2379;
        int var3 = -101 % ((arg0 - -26) / 41);
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V", line = 117)
    public final void method60(byte arg0) {
        if (~super.field1708 != -2 && ~super.field1708 != -1) {
            super.field1708 = this.method58(0);
        }
        ++field2375;
        if (arg0 < 118) {
            method1107(103, 107);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIILni;IZB)V", line = 130)
    public static final void method1106(int arg0, int arg1, int arg2, class522 arg3, int arg4, boolean arg5, byte arg6) {
        int var7 = 25 % ((35 - arg6) / 51);
        if (~arg4 >= -1) {
            class257.method1547(arg3, arg5, arg0, arg2, arg1, -16523);
        } else {
            class520.field6997 = null;
            class526.field7068 = arg2;
            class226.field2934 = 1;
            class476.field6580 = arg3;
            class122.field1593 = arg1;
            class669.field9309 = arg5;
            class302.field4082 = arg0;
            class276.field3683 = class68.field755.method4029(-16257) / arg4;
            if (class276.field3683 < 1) {
                class276.field3683 = 1;
            }
        }
        ++field2380;
    }

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "(II)Ljava/lang/String;", line = 159)
    public static final String method1107(int arg0, int arg1) {
        ++field2374;
        String var2 = Integer.toString(arg0);
        if (arg1 != 16474) {
            field2376 = null;
        }
        for (int var3 = var2.length() + -3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class755.field10513.method4201(class723.field10095, (byte) 25) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class755.field10515.method4201(class723.field10095, (byte) 25) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(II)I", line = 194)
    public final int method57(int arg0, int arg1) {
        ++field2377;
        if (arg1 != 29053) {
            field2376 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)V", line = 205)
    public static void method1108(byte arg0) {
        if (arg0 != -58) {
            field2376 = null;
        }
        field2376 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)I", line = 215)
    public final int method1109(byte arg0) {
        ++field2382;
        if (arg0 < 119) {
            field2376 = null;
        }
        return super.field1708;
    }
}
