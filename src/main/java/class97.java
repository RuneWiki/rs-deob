import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class97 extends class232 {

    @OriginalMember(owner = "client!aja", name = "V", descriptor = "I")
    private int field1422 = 4;

    @OriginalMember(owner = "client!aja", name = "K", descriptor = "I")
    private int field1431 = 4;

    @OriginalMember(owner = "client!aja", name = "cb", descriptor = "[Ljava/lang/String;")
    private static final String[] field1436 = new String[] { method936(method935("Q\u000e\u0012\u0012\t\u0018")), method936(method935("Q\u000e\u0012\u0012\u0003\u0018")), method936(method935("Q\u000e\u0012\u0012\u000e\u0018")), method936(method935("KJ]\u00122")), method936(method935("^\u0011\u001fP")), method936(method935("Q\u000e\u0012\u0012\n\u0018")), method936(method935("Q\u000e\u0012\u0012\u000b\u0018")), method936(method935("Q\u000e\u0012\u0012\r\u0018")) };

    @OriginalMember(owner = "client!aja", name = "R", descriptor = "F")
    public static float field1419 = 1.0F;

    @OriginalMember(owner = "client!aja", name = "U", descriptor = "I")
    public static int field1430 = 50;

    @OriginalMember(owner = "client!aja", name = "W", descriptor = "[I")
    public static int[] field1425 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field1427 = new String[field1430];

    @OriginalMember(owner = "client!aja", name = "X", descriptor = "[I")
    public static int[] field1423 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "P", descriptor = "[I")
    public static int[] field1424 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "bb", descriptor = "[I")
    public static int[] field1416 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "G", descriptor = "[I")
    public static int[] field1415 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "O", descriptor = "[I")
    public static int[] field1420 = new int[field1430];

    @OriginalMember(owner = "client!aja", name = "Y", descriptor = "Lhl;")
    public static class556 field1414 = new class556(45, 12);

    @OriginalMember(owner = "client!aja", name = "S", descriptor = "Lqr;")
    public static class69 field1432 = new class69(16);

    @OriginalMember(owner = "client!aja", name = "H", descriptor = "[I")
    public static int[] field1433 = new int[5];

    @OriginalMember(owner = "client!aja", name = "I", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!aja", name = "ab", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!aja", name = "M", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!aja", name = "N", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!aja", name = "Q", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!aja", name = "J", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!aja", name = "Z", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!aja", name = "L", descriptor = "[[Lmj;")
    public static class683[][] field1434;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 10)
    public static final void method932(String arg0, int arg1) {
        try {
            ++field1417;
            class487 var2 = class411.method3295(false);
            var2.field7362.method1678(class245.field3789.field3568, 65280);
            var2.field7362.method1650((byte) -95, 0);
            int var3 = var2.field7362.field2799;
            var2.field7362.method1650((byte) -95, 656);
            int[] var4 = class50.method518(arg1 ^ 90, var2);
            int var5 = var2.field7362.field2799;
            var2.field7362.method1681(arg0, 23137);
            var2.field7362.method1678(class795.field11624, 65280);
            var2.field7362.field2799 += 7;
            var2.field7362.method1679(var4, var5, var2.field7362.field2799, -612867131);
            var2.field7362.method1662(8, -var3 + var2.field7362.field2799);
            class185.field2943.method1546(var2, 1);
            class232.field3607 = 0;
            class667.field9488 = arg1;
            class494.field7431 = 1;
            class268.field4323 = -3;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1436[6] + (arg0 != null ? field1436[3] : field1436[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IB)[I", line = 39)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1426;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                method934((byte) 39, -61, 42);
            }
            if (super.field3601.field6907) {
                int var4 = class449.field6969 / this.field1422;
                int var5 = class742.field10920 / this.field1431;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method2022(class742.field10920 * var6 / var5, 0, 0);
                } else {
                    var7 = this.method2022(0, 0, arg1 + -123);
                }
                for (int var8 = 0; var8 < class449.field6969; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var7[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class449.field6969 * var9 / var4];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field1436[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILwq;I)V", line = 96)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 <= 96) {
                field1423 = null;
            }
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field1431 = arg1.method1645((byte) -93);
                }
            } else {
                this.field1422 = arg1.method1645((byte) -80);
            }
            ++field1428;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1436[5] + arg0 + ',' + (arg1 != null ? field1436[3] : field1436[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(B)V", line = 132)
    public static void method933(byte arg0) {
        try {
            field1425 = null;
            field1433 = null;
            field1424 = null;
            field1434 = null;
            field1416 = null;
            field1427 = null;
            if (arg0 != -77) {
                method933((byte) 74);
            }
            field1415 = null;
            field1420 = null;
            field1423 = null;
            field1414 = null;
            field1432 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1436[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(BII)Z", line = 152)
    public static final boolean method934(byte arg0, int arg1, int arg2) {
        try {
            ++field1429;
            if (~arg1 == -12) {
                arg1 = 10;
            }
            if (arg0 <= 117) {
                field1419 = 0.049572118F;
            }
            class362 var3 = class370.field5999.method4002(-96, arg2);
            if (~arg1 <= -6 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method3001(-111, arg1);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1436[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "()V", line = 174)
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(II)[[I", line = 182)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field1418;
            if (arg0 != -3093) {
                return null;
            } else {
                int[][] var3 = super.field3599.method1580(arg1, (byte) -83);
                if (super.field3599.field2743) {
                    int var4 = class449.field6969 / this.field1422;
                    int var5 = class742.field10920 / this.field1431;
                    int[][] var6;
                    if (~var5 >= -1) {
                        var6 = this.method2023((byte) 107, 0, 0);
                    } else {
                        int var7 = arg1 % var5;
                        var6 = this.method2023((byte) 120, class742.field10920 * var7 / var5, 0);
                    }
                    int[] var8 = var6[0];
                    int[] var9 = var6[1];
                    int[] var10 = var6[2];
                    int[] var11 = var3[0];
                    int[] var12 = var3[1];
                    int[] var13 = var3[2];
                    for (int var14 = 0; var14 < class449.field6969; ++var14) {
                        int var15;
                        if (var4 <= 0) {
                            var15 = 0;
                        } else {
                            int var16 = var14 % var4;
                            var15 = class449.field6969 * var16 / var4;
                        }
                        var11[var14] = var8[var15];
                        var12[var14] = var9[var15];
                        var13[var14] = var10[var15];
                    }
                }
                return var3;
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field1436[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method935(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method936(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
