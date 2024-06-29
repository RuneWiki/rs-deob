import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class642 {

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "Lpja;")
    public static class43 field8889 = new class43(4);

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "Lws;")
    public static class379 field8891 = new class379();

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lnf;")
    public static class604 field8890;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V", line = 3)
    public static void method3568(byte arg0) {
        field8891 = null;
        if (arg0 == 127) {
            field8889 = null;
            field8890 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 17)
    public static final String method3569(int arg0, int arg1, boolean arg2) {
        if (arg1 > -69) {
            return null;
        } else {
            field8886++;
            return arg2 && arg0 >= 0 ? class728.method4039(arg2, arg0, (byte) 38, 10) : Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lct;[[BI)V", line = 40)
    public static final void method3570(class157 arg0, byte[][] arg1, int arg2) {
        field8885++;
        int var3 = -104 % ((arg2 + 70) / 40);
        for (int var4 = 0; var4 < arg0.field7090; var4++) {
            class204.method1458(-17818);
            for (int var5 = 0; var5 < (class483.field6515 >> 3); var5++) {
                for (int var6 = 0; var6 < class65.field926 >> 3; var6++) {
                    int var7 = class220.field3229[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field7093 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class201.field3055.length; var13++) {
                                if (class201.field3055[var13] == var12 && arg1[var13] != null) {
                                    arg0.method1215((var11 & 0x7) * 8, var6 * 8, arg1[var13], class711.field9798, var4, (var10 & 0x7) * 8, -19629, var8, var9, var5 * 8, class95.field1472);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIBI)I", line = 110)
    public static final int method3571(int arg0, int arg1, byte arg2, int arg3) {
        field8887++;
        if (class394.field5442 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class64.field907;
        int var7 = arg0 - class64.field914;
        class508 var8 = (class508) class64.field888.method3589((byte) -127);
        int var9 = -13 / ((-arg2 - 22) / 56);
        while (var8 != null) {
            if (var8.field6973 == arg1) {
                int var10 = var8.field6978;
                int var11 = var8.field6984;
                int var12 = class64.field914 + var11 | var10 - -class64.field907 << 14;
                int var13 = (var6 - var10) * (var6 - var10) + (var7 - var11) * (var7 - var11);
                if (var4 < 0 || var5 > var13) {
                    var5 = var13;
                    var4 = var12;
                }
            }
            var8 = (class508) class64.field888.method3591(0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([I[IIII)V", line = 159)
    public static final void method3572(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= -55) {
            field8889 = null;
        }
        if (arg4 < arg3) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (arg1[var10] < var7 + (var10 & var9)) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method3572(arg0, arg1, -107, var6 - 1, arg4);
            method3572(arg0, arg1, -95, arg3, var6 + 1);
        }
        field8884++;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V", line = 223)
    public static final void method3573(int arg0) {
        field8888++;
        int var1 = 0;
        if (class111.field1911 != null) {
            var1 = class111.field1911.field6758.method1364((byte) 124);
        }
        if (arg0 != 800) {
            field8889 = null;
        }
        if (var1 == 2) {
            int var2 = class760.field10464 <= 800 ? class760.field10464 : 800;
            class732.field10098 = var2;
            class596.field8354 = (class760.field10464 - var2) / 2;
            int var3 = class540.field7360 <= 600 ? class540.field7360 : 600;
            class108.field1697 = var3;
            class41.field665 = 0;
        } else if (var1 == 1) {
            int var4 = class760.field10464 > 1024 ? 1024 : class760.field10464;
            int var5 = class540.field7360 > 768 ? 768 : class540.field7360;
            class596.field8354 = (class760.field10464 - var4) / 2;
            class732.field10098 = var4;
            class41.field665 = 0;
            class108.field1697 = var5;
        } else {
            class108.field1697 = class540.field7360;
            class732.field10098 = class760.field10464;
            class41.field665 = 0;
            class596.field8354 = 0;
        }
    }
}
