import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class75 {

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public int field1068 = -1;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
    public static boolean field1058 = false;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[J")
    public static long[] field1057 = new long[100];

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field1060 = new int[1000];

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[[I")
    public static int[][] field1059 = new int[128][128];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lho;")
    public class343 field1062;

    // $FF: synthetic field
    @OriginalMember(owner = "client!og", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field1069;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[I")
    public int[] field1065;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field1064;

    // $FF: synthetic method
    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method591(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method584(int arg0, byte arg1) {
        field1055++;
        int var2 = -86 / ((arg1 + 25) / 42);
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 14)
    public static final String method585(String arg0, int arg1) {
        field1061++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class114.method858(arg0.charAt(var2), arg1 ^ 0xFFFFB797)) {
            var2++;
        }
        while (var3 > var2 && class114.method858(arg0.charAt(var3 - 1), 18536)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class32.method237(true, var7)) {
                char var8 = class94.method765(true, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (~var5.length() == arg1) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I", line = 67)
    public static final int method586(byte arg0) {
        if (arg0 != 72) {
            return 8;
        }
        field1056++;
        if (class26.field358 == null) {
            return class102.field1605 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 85)
    public static final void method587() {
        for (int var0 = 0; var0 < class384.field5507; var0++) {
            if (!class159.field2417[var0]) {
                class433 var1 = class231.field3229[var0];
                class447 var2 = var1.field6257;
                int var3 = var1.field6258;
                int var4 = var2.method2636((byte) 44) - class392.field5656;
                int var5 = (var4 * 2 >> class295.field3991) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2633(0) - var4 >> class295.field3991;
                int var9 = var2.method2638(21981) - var4 >> class295.field3991;
                int var10 = var2.method2638(21981) + var4 >> class295.field3991;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class177.field2664) {
                    var10 = class177.field2664 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6263[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class124.field1916) {
                        var16 = class124.field1916 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class434 var19 = class377.method2254(var3, var17, var11, field1069 == null ? (field1069 = method591("tn")) : field1069);
                        if (var19 != null && var19.field6293 != 0) {
                            if (var19.field6293 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6263[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6263[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field6263[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6263[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class159.field2417[var0] = true;
                class492.field7122[var3].method75(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 265)
    public static void method588(int arg0) {
        field1059 = null;
        if (arg0 == 3) {
            field1060 = null;
            field1057 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lza;I)V", line = 277)
    public static final void method589(class295 arg0, int arg1) {
        field1067++;
        int var2 = class110.field1797;
        int var3 = class27.field371;
        int var4 = class72.field1031;
        int var5 = class334.field4880 - 3;
        byte var6 = 20;
        if (class418.field6058 == null || class38.field573 == null) {
            if (class509.field7453.method2517(class437.field6307, (byte) -68) && class509.field7453.method2517(class410.field5804, (byte) -15)) {
                class418.field6058 = arg0.method555(class396.method2353(class509.field7453, class437.field6307, 0), true);
                class396 var7 = class396.method2353(class509.field7453, class410.field5804, 0);
                class38.field573 = arg0.method555(var7, true);
                var7.method2344();
                class83.field1271 = arg0.method555(var7, true);
            } else {
                arg0.method508(var2, var3, var4, var6, class230.field3219 | 255 - class224.field3170 << 24, 1);
            }
        }
        if (class418.field6058 != null && class38.field573 != null) {
            int var8 = (var4 - class38.field573.method205() * 2) / class418.field6058.method205();
            for (int var9 = 0; var9 < var8; var9++) {
                class418.field6058.method2142(class38.field573.method205() + var2 + var9 * class418.field6058.method205(), var3);
            }
            class38.field573.method2142(var2, var3);
            class83.field1271.method2142(var2 + var4 - class83.field1271.method205(), var3);
        }
        class108.field1751.method1769(var3 + 14, var2 + 3, class41.field608.method1126(class486.field6998, (byte) -19), class351.field5102 | 0xFF000000, 0, -1);
        arg0.method508(var2, var3 + var6, var4, var5 - var6, class230.field3219 | -class224.field3170 + 255 << 24, 1);
        int var10 = class113.field1820.method55((byte) -37);
        if (arg1 <= 28) {
            method590(61);
        }
        int var11 = class113.field1820.method62((byte) 109);
        int var12 = 0;
        for (class440 var13 = (class440) class391.field5638.method3137(0); var13 != null; var13 = (class440) class391.field5638.method3132(0)) {
            int var31 = (class527.field7690 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > var31 - 13 && (var31 + 4) > var11 && var13.field6339) {
                arg0.method508(var2, var31 - 12, var4, 16, 255 - class102.field1609 << 24 | class92.field1515, 1);
            }
            var12++;
        }
        if ((class296.field4001 == null || class533.field7852 == null || class203.field2934 == null) && class509.field7453.method2517(class421.field6089, (byte) -41) && class509.field7453.method2517(class301.field4114, (byte) -91) && class509.field7453.method2517(class358.field5163, (byte) -77)) {
            class396 var14 = class396.method2353(class509.field7453, class301.field4114, 0);
            class533.field7852 = arg0.method555(var14, true);
            var14.method2344();
            class97.field1553 = arg0.method555(var14, true);
            class296.field4001 = arg0.method555(class396.method2353(class509.field7453, class421.field6089, 0), true);
            class396 var15 = class396.method2353(class509.field7453, class358.field5163, 0);
            class203.field2934 = arg0.method555(var15, true);
            var15.method2344();
            class487.field7055 = arg0.method555(var15, true);
        }
        if (class296.field4001 != null && class533.field7852 != null && class203.field2934 != null) {
            int var16 = (var4 - (class203.field2934.method205() * 2)) / class296.field4001.method205();
            for (int var17 = 0; var17 < var16; var17++) {
                class296.field4001.method2142(class203.field2934.method205() + var2 + class296.field4001.method205() * var17, var3 + (var5 - class296.field4001.method200()));
            }
            int var18 = (var5 - class203.field2934.method200() - var6) / class533.field7852.method200();
            for (int var19 = 0; var19 < var18; var19++) {
                class533.field7852.method2142(var2, var3 + var6 + (var19 * class533.field7852.method200()));
                class97.field1553.method2142(var2 - (class97.field1553.method205() - var4), var3 + var6 - -(class533.field7852.method200() * var19));
            }
            class203.field2934.method2142(var2, var5 + var3 - class203.field2934.method200());
            class487.field7055.method2142(var2 - (class203.field2934.method205() - var4), var3 + var5 + -class203.field2934.method200());
        }
        int var20 = 0;
        for (class440 var21 = (class440) class391.field5638.method3137(0); var21 != null; var21 = (class440) class391.field5638.method3132(0)) {
            int var22 = (class527.field7690 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class351.field5102 | 0xFF000000;
            if (var10 > var2 && (var2 + var4) > var10 && var11 > var22 - 13 && var11 < (var22 + 4) && var21.field6339) {
                var23 = class426.field6203 | 0xFF000000;
            }
            int[] var24 = null;
            if (class302.method1752(-124, var21.field6337)) {
                var24 = class534.field7872.method3089((int) var21.field6334, -67).field4072;
            } else if (var21.field6336 != -1) {
                var24 = class534.field7872.method3089(var21.field6336, 8).field4072;
            } else if (class339.method2062((byte) 108, var21.field6337)) {
                class326 var25 = (class326) class281.field3826.method1592((byte) -25, (long) ((int) var21.field6334));
                if (var25 != null) {
                    class209 var26 = var25.field4455;
                    class83 var27 = var26.field2976;
                    if (var27.field1272 != null) {
                        var27 = var27.method655(class309.field4200, (byte) 124);
                    }
                    if (var27 != null) {
                        var24 = var27.field1278;
                    }
                }
            } else if (class288.method1653(var21.field6337, (byte) -61)) {
                Object var28 = null;
                class103 var29;
                if (var21.field6337 == 1009) {
                    var29 = class452.field6629.method603((byte) 103, (int) var21.field6334);
                } else {
                    var29 = class452.field6629.method603((byte) 110, (int) (var21.field6334 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field1613 != null) {
                    var29 = var29.method795(-31036, class309.field4200);
                }
                if (var29 != null) {
                    var24 = var29.field1650;
                }
            }
            String var30 = class219.method1368(var21, (byte) 55);
            if (var24 != null) {
                var30 = var30 + class413.method2430(0, var24);
            }
            class108.field1751.method1760(class288.field3907, var2 + 3, class271.field3684, var23, var30, -4713, var22, 0);
            var20++;
            if (var21.field6340) {
                class108.field1749.method2142(var2 + class80.field1127.method416(8364, var30) + 5, var22 + -12);
            }
        }
        class346.method2084(false, class72.field1031, class110.field1797, class334.field4880, class27.field371);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 483)
    public static final void method590(int arg0) {
        if (arg0 < 92) {
            return;
        }
        if (class494.field7155 == 2) {
            class63.method421(3, true);
        } else if (class494.field7155 == 6) {
            class63.method421(7, true);
        } else if (class494.field7155 == 9) {
            class63.method421(10, true);
        }
        field1066++;
    }
}
