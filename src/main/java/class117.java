import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class117 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public int field2065 = -1;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Lsb;")
    public static class266 field2068 = new class266(67, -1);

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "Lom;")
    public static class344 field2085;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "Lsl;")
    private class427 field2087;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "Ljava/lang/String;")
    private String field2076;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "Ljava/lang/String;")
    private String field2080;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "[I")
    private int[] field2067;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[I")
    private int[] field2072;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
    private int[] field2077;

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "[I")
    private int[] field2082;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "[I")
    private int[] field2083;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "[I")
    private int[] field2088;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "[I")
    private int[] field2089;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "[I")
    private int[] field2090;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field2070;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field2079;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "[[I")
    private int[][] field2066;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "[[I")
    private int[][] field2073;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "[[I")
    private int[][] field2086;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
    public static final void method1022(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2074++;
        class545 var5 = class183.method1339(arg4, (byte) 111, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field7736 != null) {
            class476 var6 = new class476();
            var6.field6842 = var5.field7736;
            var6.field6844 = arg0;
            var6.field6846 = arg3;
            var6.field6850 = var5;
            class683.method3847(var6);
        }
        if (class199.field3098 != 10 || !client.method1825(var5).method3527(arg3 - 1, 1776287617)) {
            return;
        }
        if (arg3 == 1) {
            class427.field6151++;
            class275 var7 = class185.method1355(0, class118.field2118, class395.field5772);
            class646.method3689(arg2, arg4, var7, arg1, var5.field7702);
            class140.method1141(var7, 19321);
        }
        if (arg3 == 2) {
            class433.field6255++;
            class275 var8 = class185.method1355(0, class319.field4692, class395.field5772);
            class646.method3689(arg2, arg4, var8, true, var5.field7702);
            class140.method1141(var8, 19321);
        }
        if (arg3 == 3) {
            class363.field5396++;
            class275 var9 = class185.method1355(0, class706.field9930, class395.field5772);
            class646.method3689(arg2, arg4, var9, true, var5.field7702);
            class140.method1141(var9, 19321);
        }
        if (arg3 == 4) {
            class697.field9816++;
            class275 var10 = class185.method1355(0, class645.field9280, class395.field5772);
            class646.method3689(arg2, arg4, var10, arg1, var5.field7702);
            class140.method1141(var10, 19321);
        }
        if (arg3 == 5) {
            class127.field2319++;
            class275 var11 = class185.method1355(0, class1.field193, class395.field5772);
            class646.method3689(arg2, arg4, var11, true, var5.field7702);
            class140.method1141(var11, 19321);
        }
        if (arg3 == 6) {
            class609.field8865++;
            class275 var12 = class185.method1355(0, class39.field1060, class395.field5772);
            class646.method3689(arg2, arg4, var12, true, var5.field7702);
            class140.method1141(var12, 19321);
        }
        if (!arg1) {
            method1025(-74, -93);
        }
        if (arg3 == 7) {
            class430.field6213++;
            class275 var13 = class185.method1355(0, class11.field565, class395.field5772);
            class646.method3689(arg2, arg4, var13, true, var5.field7702);
            class140.method1141(var13, 19321);
        }
        if (arg3 == 8) {
            class430.field6211++;
            class275 var14 = class185.method1355(0, class386.field5661, class395.field5772);
            class646.method3689(arg2, arg4, var14, true, var5.field7702);
            class140.method1141(var14, 19321);
        }
        if (arg3 == 9) {
            class342.field5091++;
            class275 var15 = class185.method1355(0, class281.field4180, class395.field5772);
            class646.method3689(arg2, arg4, var15, true, var5.field7702);
            class140.method1141(var15, 19321);
        }
        if (arg3 == 10) {
            class617.field8956++;
            class275 var16 = class185.method1355(0, class165.field2753, class395.field5772);
            class646.method3689(arg2, arg4, var16, true, var5.field7702);
            class140.method1141(var16, 19321);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILqh;)V")
    public final void method1023(int arg0, class61 arg1) {
        if (arg0 < 92) {
            return;
        }
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                field2081++;
                return;
            }
            this.method1028(arg1, -20922, var3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(DI)V")
    public static final void method1024(double arg0, int arg1) {
        if (class478.field6866 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class560.field7908[var3] = var4 <= 255 ? var4 : 255;
            }
            class478.field6866 = arg0;
        }
        field2084++;
        if (arg1 != -1973) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lba;")
    public static final class356 method1025(int arg0, int arg1) {
        field2091++;
        class356 var2 = (class356) class111.field2009.method783(121, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -46) {
            field2085 = null;
        }
        byte[] var3 = class481.field6912.method2216(arg0, 0, true);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class356 var4;
        try {
            var4 = class681.method3827(var3, (byte) 107);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg0);
        }
        class111.field2009.method780((long) arg0, (byte) -77, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public final void method1026(byte arg0) {
        field2078++;
        if (arg0 > -47) {
            method1025(58, -14);
        }
        if (this.field2080 == null) {
            this.field2080 = this.field2076;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
    public static void method1027(boolean arg0) {
        field2068 = null;
        field2085 = null;
        if (!arg0) {
            method1029(-79, 73, 25);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lqh;II)V")
    private final void method1028(class61 arg0, int arg1, int arg2) {
        field2069++;
        if (arg1 != -20922) {
            this.method1028(null, 55, -31);
        }
        if (arg2 == 1) {
            this.field2076 = arg0.method739(-2);
        } else if (arg2 == 2) {
            this.field2080 = arg0.method739(-2);
        } else if (arg2 == 3) {
            int var22 = arg0.method732(arg1 ^ 0x21598E9E);
            this.field2086 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2086[var23][0] = arg0.method723((byte) -25);
                this.field2086[var23][1] = arg0.method730(-120);
                this.field2086[var23][2] = arg0.method730(104);
            }
        } else if (arg2 == 4) {
            int var20 = arg0.method732(-559537960);
            this.field2073 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field2073[var21][0] = arg0.method723((byte) -25);
                this.field2073[var21][1] = arg0.method730(105);
                this.field2073[var21][2] = arg0.method730(95);
            }
        } else if (arg2 == 5) {
            arg0.method723((byte) -25);
            return;
        } else if (arg2 == 6) {
            arg0.method732(arg1 - 559517038);
            return;
        } else if (arg2 == 7) {
            arg0.method732(arg1 - 559517038);
            return;
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method732(-559537960);
                return;
            }
            if (arg2 == 10) {
                int var4 = arg0.method732(-559537960);
                this.field2082 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2082[var5] = arg0.method730(121);
                }
                return;
            }
            if (arg2 == 12) {
                arg0.method730(95);
                return;
            }
            if (arg2 != 13) {
                if (arg2 == 14) {
                    int var6 = arg0.method732(-559537960);
                    this.field2066 = new int[var6][2];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field2066[var7][0] = arg0.method732(arg1 - 559517038);
                        this.field2066[var7][1] = arg0.method732(-559537960);
                    }
                    return;
                }
                if (arg2 == 15) {
                    arg0.method723((byte) -25);
                    return;
                }
                if (arg2 == 17) {
                    this.field2065 = arg0.method723((byte) -25);
                } else if (arg2 == 18) {
                    int var8 = arg0.method732(-559537960);
                    this.field2088 = new int[var8];
                    this.field2083 = new int[var8];
                    this.field2079 = new String[var8];
                    this.field2089 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field2089[var9] = arg0.method730(arg1 + 20867);
                        this.field2083[var9] = arg0.method730(arg1 + 21023);
                        this.field2088[var9] = arg0.method730(89);
                        this.field2079[var9] = arg0.method747(14598);
                    }
                    return;
                } else if (arg2 == 19) {
                    int var10 = arg0.method732(-559537960);
                    this.field2070 = new String[var10];
                    this.field2090 = new int[var10];
                    this.field2072 = new int[var10];
                    this.field2077 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field2077[var11] = arg0.method730(arg1 + 21042);
                        this.field2090[var11] = arg0.method730(-79);
                        this.field2072[var11] = arg0.method730(-83);
                        this.field2070[var11] = arg0.method747(14598);
                    }
                    return;
                } else if (arg2 == 249) {
                    int var12 = arg0.method732(arg1 - 559517038);
                    if (this.field2087 == null) {
                        int var13 = class455.method2740(-1675135295, var12);
                        this.field2087 = new class427(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg0.method732(-559537960) == 1;
                        int var16 = arg0.method740((byte) 75);
                        class425 var17;
                        if (var15) {
                            var17 = new class426(arg0.method747(arg1 + 35520));
                        } else {
                            var17 = new class149(arg0.method730(-46));
                        }
                        this.field2087.method2598(var17, (long) var16, (byte) 8);
                    }
                    return;
                }
                return;
            }
            int var18 = arg0.method732(-559537960);
            this.field2067 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field2067[var19] = arg0.method723((byte) -25);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)Z")
    public static final boolean method1029(int arg0, int arg1, int arg2) {
        field2071++;
        if (arg0 != 0) {
            field2075 = 126;
        }
        boolean var3 = (arg1 & 0x37) == 0 ? class357.method2289((byte) 21, arg1, arg2) : class25.method487(false, arg1, arg2);
        return var3 | (arg2 & 0x10000) != 0 | class457.method2742(arg2, -124, arg1);
    }
}
