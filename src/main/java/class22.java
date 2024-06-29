import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class417 {

    @OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
    public static boolean field207 = false;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "Llu;")
    public static class610 field213 = new class610(7, 6);

    @OriginalMember(owner = "client!an", name = "x", descriptor = "Z")
    public static boolean field222 = false;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "[I")
    public int[] field208;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "[I")
    public int[] field209;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "[I")
    public int[] field218;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "[Lqo;")
    public class21[] field214;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "[Lqo;")
    public class21[] field220;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "[[[B")
    public byte[][][] field221;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[[[J")
    public static long[][][] field219;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 6)
    public static final void method135(int arg0) {
        field211++;
        int var1 = class632.field9278.method1045(true);
        int var2 = class632.field9278.method1005(11022);
        class599.field8841 = class632.field9278.method1046((byte) -43);
        int var3 = class632.field9278.method1024(-253);
        boolean var4 = class632.field9278.method1046((byte) -43) == 1;
        class479.method2886(true);
        class18.method118(-28206, var2);
        if (arg0 != 4543) {
            return;
        }
        class632.field9278.method3416(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class146.field2125 >> 3); var20++) {
                for (int var21 = 0; var21 < (class410.field5609 >> 3); var21++) {
                    int var22 = class632.field9278.method3417(1, (byte) -86);
                    if (var22 == 1) {
                        class123.field1726[var5][var20][var21] = class632.field9278.method3417(26, (byte) -86);
                    } else {
                        class123.field1726[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class632.field9278.method3421(124);
        int var6 = (class333.field4615 - class632.field9278.field2177) / 16;
        class555.field8270 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class555.field8270[var7][var19] = class632.field9278.method1026(-917302120);
            }
        }
        class2.field12 = new byte[var6][];
        class25.field247 = null;
        class490.field6977 = new byte[var6][];
        class406.field5551 = new byte[var6][];
        class92.field1374 = new int[var6];
        class8.field81 = new int[var6];
        class451.field6353 = new int[var6];
        class58.field741 = new byte[var6][];
        class365.field5036 = new int[var6];
        class618.field9132 = null;
        class340.field4706 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class146.field2125 >> 3; var10++) {
                for (int var11 = 0; var11 < (class410.field5609 >> 3); var11++) {
                    int var12 = class123.field1726[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFCCA) >> 14;
                        int var14 = (var12 & 0x3FFC) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class340.field4706[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class340.field4706[var8] = var15;
                            int var17 = (var15 & 0xFF75) >> 8;
                            int var18 = var15 & 0xFF;
                            class451.field6353[var8] = class282.field3952.method1967(-1, "m" + var17 + "_" + var18);
                            class365.field5036[var8] = class282.field3952.method1967(-1, "l" + var17 + "_" + var18);
                            class8.field81[var8] = class282.field3952.method1967(arg0 - 4544, "um" + var17 + "_" + var18);
                            class92.field1374[var8] = class282.field3952.method1967(-1, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class221.method1427(var1, 8, 10, var3, var4);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILks;ILgba;)V", line = 157)
    public static final void method136(int arg0, int arg1, class373 arg2, int arg3, class574 arg4) {
        field215++;
        if (arg1 != -6043) {
            field222 = true;
        }
        if ((arg0 & 0x8) != 0) {
            int var5 = arg4.method1005(11022);
            byte[] var6 = new byte[var5];
            class148 var7 = new class148(var6);
            arg4.method1007(var6, arg1 + 6171, 0, var5);
            class110.field1568[arg3] = var7;
            arg2.method2229(-20966, var7);
        }
        byte var8 = -1;
        if ((arg0 & 0x8000) != 0) {
            arg2.field1889 = arg4.method1052((byte) 100);
            arg2.field1915 = arg4.method1062(-21188);
            arg2.field1928 = arg4.method1068((byte) -127);
            arg2.field1853 = arg4.method1033((byte) -13);
            arg2.field1874 = arg4.method1016(arg1 + 6165) + class617.field9123;
            arg2.field1857 = arg4.method1045(true) + class617.field9123;
            arg2.field1932 = arg4.method1046((byte) -43);
            arg2.field1947 = 0;
            if (arg2.field5122) {
                arg2.field1928 += arg2.field5158;
                arg2.field1953 = 0;
                arg2.field1853 += arg2.field5153;
                arg2.field1915 += arg2.field5153;
                arg2.field1889 += arg2.field5158;
            } else {
                arg2.field1889 += arg2.field1957[0];
                arg2.field1853 += arg2.field1955[0];
                arg2.field1953 = 1;
                arg2.field1928 += arg2.field1957[0];
                arg2.field1915 += arg2.field1955[0];
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var9 = arg4.method1045(true);
            int var10 = arg4.method1005(11022);
            int var11 = arg4.method1005(11022);
            int var12 = arg4.field2177;
            boolean var13 = (var9 & 0x8000) != 0;
            if (arg2.field5138 != null && arg2.field5127 != null) {
                boolean var14 = false;
                if (var10 <= 1) {
                    if (!var13 && !(!class266.field3763 || class510.field7259) || class228.field3340) {
                        var14 = true;
                    } else if (class190.method1305(arg2.field5138, (byte) -72)) {
                        var14 = true;
                    }
                }
                if (!var14 && class193.field2862 == 0) {
                    class18.field165.field2177 = 0;
                    arg4.method1071(class18.field165.field2146, (byte) -119, var11, 0);
                    class18.field165.field2177 = 0;
                    int var15 = -1;
                    String var16;
                    if (var13) {
                        var9 &= 0x7FFF;
                        class169 var17 = class279.method1747(class18.field165, false);
                        var15 = var17.field2638;
                        var16 = var17.field2641.method169(false, class18.field165);
                    } else {
                        var16 = class438.method2552(0, class518.method3067(class18.field165, (byte) 118));
                    }
                    arg2.field1867 = var16.trim();
                    arg2.field1902 = 150;
                    arg2.field1850 = var9 >> 8;
                    arg2.field1865 = var9 & 0xFF;
                    int var18;
                    if (var10 == 1 || var10 == 2) {
                        var18 = var13 ? 17 : 1;
                    } else {
                        var18 = var13 ? 17 : 2;
                    }
                    if (var10 == 2) {
                        class253.method1627("<img=1>" + arg2.method2224(1, false), null, var16, "<img=1>" + arg2.method2228(true, -1), 0, 0, var18, var15);
                    } else if (var10 == 1) {
                        class253.method1627("<img=0>" + arg2.method2224(1, false), null, var16, "<img=0>" + arg2.method2228(true, arg1 + 6042), 0, 0, var18, var15);
                    } else {
                        class253.method1627(arg2.method2224(1, false), null, var16, arg2.method2228(true, arg1 + 6042), 0, 0, var18, var15);
                    }
                }
            }
            arg4.field2177 = var11 + var12;
        }
        if ((arg0 & 0x800) != 0) {
            int var19 = arg4.method1042((byte) 124);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg4.method1015(-252);
            int var21 = arg4.method1032((byte) -33);
            arg2.method948(var20, -115, false, var21, var19);
        }
        if ((arg0 & 0x2000) != 0) {
            int var22 = arg4.method1042((byte) 106);
            arg2.field1910 = arg4.method1032((byte) -33);
            arg2.field1868 = arg4.method1061(-127);
            arg2.field1934 = var22 & 0x7FFF;
            arg2.field1870 = (var22 & 0x8000) != 0;
            arg2.field1922 = class617.field9123 + arg2.field1910 + arg2.field1934;
        }
        if ((arg0 & 0x20000) != 0) {
            int var23 = arg4.method1045(true);
            int var24 = arg4.method1018(false);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var25 = arg4.method1005(arg1 + 17065);
            arg2.method948(var24, arg1 + 5984, true, var25, var23);
        }
        if ((arg0 & 0x1) != 0) {
            int var26 = arg4.method1024(arg1 + 5790);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = arg4.method1046((byte) -43);
            class39.method251(var26, (byte) 70, var27, arg2);
        }
        if ((arg0 & 0x4) != 0) {
            arg2.field5120 = arg4.method1045(true);
            if (arg2.field1953 == 0) {
                arg2.method955(arg2.field5120, -92);
                arg2.field5120 = -1;
            }
        }
        if ((arg0 & 0x80) != 0) {
            class432.field5787[arg3] = arg4.method1062(class354.method2138(arg1, 17753));
        }
        if ((arg0 & 0x40000) != 0) {
            arg2.field1905 = arg4.method1068((byte) -128);
            arg2.field1881 = arg4.method1033((byte) -13);
            arg2.field1875 = arg4.method1033((byte) -13);
            arg2.field1855 = (byte) arg4.method1061(-127);
            arg2.field1944 = class617.field9123 + arg4.method1016(9);
            arg2.field1892 = class617.field9123 + arg4.method1016(127);
        }
        if ((arg0 & 0x10000) != 0) {
            int var28 = arg4.method1061(-124);
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = arg4.method1016(arg1 ^ 0xFFFFE81B);
                if (var33 == 65535) {
                    var33 = -1;
                }
                var29[var32] = var33;
                var30[var32] = arg4.method1032((byte) -33);
                var31[var32] = arg4.method1024(-253);
            }
            class274.method1719(var30, var31, var29, (byte) -57, arg2);
        }
        if ((arg0 & 0x100) != 0) {
            var8 = arg4.method1052((byte) 79);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field5124 = arg4.method1032((byte) -33) == 1;
        }
        if ((arg0 & 0x10) != 0) {
            int var34 = arg4.method1055(1957696096);
            int var35 = arg4.method1005(11022);
            arg2.method954(var34, -91, class617.field9123, var35);
            arg2.field1906 = class617.field9123 + 300;
            arg2.field1925 = arg4.method1046((byte) -43);
        }
        if ((arg0 & 0x400) != 0) {
            int var36 = class617.field9123;
            int var37 = arg4.method1055(1957696096);
            int var38 = arg4.method1032((byte) -33);
            arg2.method954(var37, -71, var36, var38);
        }
        if ((arg0 & 0x2) != 0) {
            int var39 = arg4.method1042((byte) 119);
            if (var39 == 65535) {
                var39 = -1;
            }
            arg2.field1923 = var39;
        }
        if ((arg0 & 0x4000) != 0) {
            arg2.field1867 = arg4.method1023(-29153);
            if (arg2.field1867.charAt(0) == '~') {
                arg2.field1867 = arg2.field1867.substring(1);
                class336.method2053(arg2.method2228(true, -1), arg2.method2224(1, false), 2, 99, 0, arg2.field1867);
            } else if (class541.field8119 == arg2) {
                class336.method2053(arg2.method2228(true, -1), arg2.method2224(1, false), 2, 31, 0, arg2.field1867);
            }
            arg2.field1850 = 0;
            arg2.field1865 = 0;
            arg2.field1902 = 150;
        }
        if (!arg2.field5122) {
            return;
        }
        if (var8 == 127) {
            arg2.method2231(arg2.field5153, arg2.field5158, (byte) 62);
            return;
        }
        byte var40;
        if (var8 == -1) {
            var40 = class432.field5787[arg3];
        } else {
            var40 = var8;
        }
        arg2.method2230(arg2.field5153, 39, arg2.field5158, var40);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lus;B)I", line = 495)
    public static final int method137(class1 arg0, byte arg1) {
        field212++;
        if (class296.field4074 == arg0) {
            return 7681;
        } else if (class132.field1816 == arg0) {
            return 8448;
        } else if (class471.field6648 == arg0) {
            return 34165;
        } else if (class533.field7939 == arg0) {
            return 260;
        } else if (class316.field4345 == arg0) {
            return 34023;
        } else {
            int var2 = 8 / (arg1 / 38);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V", line = 539)
    public static void method138(boolean arg0) {
        field219 = null;
        field213 = null;
        if (arg0) {
            method138(true);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLgba;)V", line = 553)
    public static final void method139(byte arg0, class574 arg1) {
        field210++;
        int var2 = 0;
        arg1.method3416(8);
        for (int var3 = 0; var3 < class551.field8224; var3++) {
            int var15 = class314.field4332[var3];
            if ((class316.field4347[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class316.field4347[var15] = (byte) class473.method2847(class316.field4347[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method3417(1, (byte) -86);
                    if (var16 == 0) {
                        var2 = class482.method2902(arg1, (byte) -47);
                        class316.field4347[var15] = (byte) class473.method2847(class316.field4347[var15], 2);
                    } else {
                        class453.method2753(arg1, (byte) 88, var15);
                    }
                }
            }
        }
        arg1.method3421(127);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method3416(arg0 - 30);
        for (int var4 = 0; var4 < class551.field8224; var4++) {
            int var13 = class314.field4332[var4];
            if ((class316.field4347[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class316.field4347[var13] = (byte) class473.method2847(class316.field4347[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method3417(1, (byte) -86);
                    if (var14 == 0) {
                        var2 = class482.method2902(arg1, (byte) -47);
                        class316.field4347[var13] = (byte) class473.method2847(class316.field4347[var13], 2);
                    } else {
                        class453.method2753(arg1, (byte) 88, var13);
                    }
                }
            }
        }
        arg1.method3421(126);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method3416(8);
        for (int var5 = 0; var5 < class527.field7664; var5++) {
            int var11 = class185.field2775[var5];
            if ((class316.field4347[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class316.field4347[var11] = (byte) class473.method2847(class316.field4347[var11], 2);
                } else {
                    int var12 = arg1.method3417(1, (byte) -86);
                    if (var12 == 0) {
                        var2 = class482.method2902(arg1, (byte) -47);
                        class316.field4347[var11] = (byte) class473.method2847(class316.field4347[var11], 2);
                    } else if (class102.method768(var11, arg1, arg0 ^ 0x25)) {
                        class316.field4347[var11] = (byte) class473.method2847(class316.field4347[var11], 2);
                    }
                }
            }
        }
        arg1.method3421(arg0 + 88);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method3416(8);
        for (int var6 = 0; var6 < class527.field7664; var6++) {
            int var9 = class185.field2775[var6];
            if ((class316.field4347[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class316.field4347[var9] = (byte) class473.method2847(class316.field4347[var9], 2);
                    var2--;
                } else {
                    int var10 = arg1.method3417(1, (byte) -86);
                    if (var10 == 0) {
                        var2 = class482.method2902(arg1, (byte) -47);
                        class316.field4347[var9] = (byte) class473.method2847(class316.field4347[var9], 2);
                    } else if (class102.method768(var9, arg1, 3)) {
                        class316.field4347[var9] = (byte) class473.method2847(class316.field4347[var9], 2);
                    }
                }
            }
        }
        arg1.method3421(125);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class527.field7664 = 0;
        class551.field8224 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class316.field4347[var7] = (byte) (class316.field4347[var7] >> 1);
            class373 var8 = class293.field4036[var7];
            if (var8 == null) {
                class185.field2775[class527.field7664++] = var7;
            } else {
                class314.field4332[class551.field8224++] = var7;
            }
        }
        if (arg0 != 38) {
            field213 = null;
        }
    }
}
