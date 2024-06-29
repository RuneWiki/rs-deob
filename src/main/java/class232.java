import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class232 implements class245 {

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lrj;")
    public class252 field3357;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lmq;")
    public class657 field3352;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3358 = new String[] { method1928(method1927(";\np\u0016_")), method1928(method1927(";\np\u0017_")), method1928(method1927(";\np\u0011_")), method1928(method1927("\f\u0010-n")), method1928(method1927("\u0007\u00053n")), method1928(method1927("$\u001528")), method1928(method1927("1Npz\n")), method1928(method1927(";\np\u0010_")), method1928(method1927(";\nph\u001e$\t*j_")) };

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3346 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3348 = -1;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lsb;")
    public static class261 field3356 = new class261(38, -2);

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "D")
    public static double field3351;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILd;ILha;III)V")
    public static final void method1924(int arg0, class673 arg1, int arg2, class18 arg3, int arg4, int arg5, int arg6) {
        try {
            field3347++;
            if (class511.field7506 < 100) {
                class337.method2711(true, arg1, arg3);
            }
            arg3.method208(arg5, arg0, arg2 + arg5, arg0 + arg6);
            if (class511.field7506 < 100) {
                byte var7 = 20;
                int var8 = arg2 / 2 + arg5;
                arg3.method237(arg5, arg0, arg2, arg6, -16777216, 0);
                int var9 = arg6 / 2 + arg0 - var7 - 18;
                arg3.method212(var8 - 152, var9, 304, 34, class529.field7680[class784.field11322].getRGB(), 0);
                arg3.method237(var8 - 150, var9 - -2, class511.field7506 * 3, 30, class160.field2052[class784.field11322].getRGB(), 0);
                class200.field2954.method1825(var7 + var9, var8, class111.field1443[class784.field11322].getRGB(), -1, (byte) -73, class537.field7848.method4068((byte) -54, class405.field5883));
            } else {
                if (arg4 < 50) {
                    field3346 = -6;
                }
                int var10 = class601.field8605 - ((int) ((float) arg2 / class534.field7736));
                int var11 = (int) ((float) arg6 / class534.field7736) + class30.field383;
                int var12 = class601.field8605 + ((int) ((float) arg2 / class534.field7736));
                class50.field712 = class30.field383 - ((int) ((float) arg6 / class534.field7736));
                class395.field5730 = (int) ((float) (arg2 * 2) / class534.field7736);
                class425.field6127 = (int) ((float) (arg6 * 2) / class534.field7736);
                class299.field4175 = class601.field8605 - ((int) ((float) arg2 / class534.field7736));
                int var13 = class30.field383 - (int) ((float) arg6 / class534.field7736);
                class534.method4053(var10 + class534.field7745, class534.field7751 + var11, class534.field7745 + var12, class534.field7751 + var13, arg5, arg0, arg2 + arg5, arg0 + arg6 + 1);
                class534.method4041(arg3);
                class524 var14 = class534.method4036(arg3);
                class121.method1089(0, var14, 0, 10, arg3);
                if (class147.field1894 > 0) {
                    class426.field6140--;
                    if (class426.field6140 == 0) {
                        class426.field6140 = 20;
                        class147.field1894--;
                    }
                }
                if (class453.field6626) {
                    int var15 = arg2 + arg5 - 5;
                    int var16 = arg0 + arg6 - 8;
                    class23.field279.method1819(-96, field3358[3] + class736.field10492, var15, 16776960, var16, -1);
                    int var22 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (var18 > 65536) {
                        var19 = 16711680;
                    }
                    class23.field279.method1819(-113, field3358[4] + var18 + "k", var15, var19, var22, -1);
                    var16 = var22 - 15;
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field3358[2] + arg0 + ',' + (arg1 == null ? field3358[5] : field3358[6]) + ',' + arg2 + ',' + (arg3 == null ? field3358[5] : field3358[6]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Luu;")
    public class240 method482(int arg0) {
        try {
            field3354++;
            return arg0 == 0 ? class583.field8420 : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3358[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIB)V")
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            field3355++;
            if (class101.field1360 == 1) {
                int var5 = arg1 / class567.field8258;
                int var6 = arg3 / class567.field8258;
                int var7 = arg0 / class389.field5670;
                int var8 = arg2 / class389.field5670;
                if (var5 < class419.field6030 && var6 >= 0 && class559.field8137 > var7 && var8 >= 0) {
                    if (class419.field6030 <= var6) {
                        var6 = class419.field6030 - 1;
                    }
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    if (var8 >= class559.field8137) {
                        var8 = class559.field8137 - 1;
                    }
                    int var9 = 35 / ((arg4 - 25) / 49);
                    for (int var10 = var7; var10 <= var8; var10++) {
                        int var11 = class80.method793(true, class559.field8137, var10 + class322.field4397) * class419.field6030;
                        for (int var12 = var5; var12 <= var6; var12++) {
                            int var13 = class80.method793(true, class419.field6030, class109.field1427 + var12) + var11;
                            class492.field7235[var13] = class613.field8768;
                        }
                    }
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field3358[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static void method1926(int arg0) {
        try {
            field3356 = null;
            if (arg0 != 9960) {
                field3356 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3358[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILrj;Lmq;II)V")
    public class232(int arg0, class252 arg1, class657 arg2, int arg3, int arg4) {
        try {
            this.field3349 = arg4;
            this.field3350 = arg0;
            this.field3357 = arg1;
            this.field3352 = arg2;
            this.field3353 = arg3;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3358[8] + arg0 + ',' + (arg1 == null ? field3358[5] : field3358[6]) + ',' + (arg2 == null ? field3358[5] : field3358[6]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1927(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1928(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
