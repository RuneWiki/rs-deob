import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class621 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field8896 = 8;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field8889 = 16777215;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Ldh;")
    public static class320 field8900 = new class320(68, -2);

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lhs;")
    public static class325 field8902 = new class325(1, 2);

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "Ldh;")
    public static class320 field8903 = new class320(6, 6);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field8890;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field8894;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field8895;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field8897;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public int field8901;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lpea;")
    public static class722 field8891;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Z")
    public boolean field8893;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILig;)V", line = 4)
    private final void method3551(int arg0, int arg1, class244 arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg1 == 1) {
            this.field8896 = arg2.method1476(-103);
        } else if (arg1 == 2) {
            this.field8893 = true;
        } else if (arg1 == 3) {
            this.field8895 = arg2.method1466((byte) 31);
            this.field8901 = arg2.method1466((byte) 31);
            this.field8897 = arg2.method1466((byte) 31);
        } else if (arg1 == 4) {
            this.field8890 = arg2.method1423(-101);
        } else if (arg1 == 5) {
            this.field8894 = arg2.method1476(-75);
        } else if (arg1 == 6) {
            this.field8889 = arg2.method1458((byte) 50);
        }
        field8898++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 52)
    public static final String method3552(String arg0, int arg1) {
        field8888++;
        if (arg1 > -22) {
            return null;
        }
        String var2 = class652.method3699(class186.method1146(true, arg0), 0);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)Z", line = 70)
    public static final boolean method3553(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field8892++;
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 94)
    public static void method3554(int arg0) {
        field8902 = null;
        field8903 = null;
        field8900 = null;
        if (arg0 < -78) {
            field8891 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILig;)V", line = 110)
    public final void method3555(int arg0, class244 arg1) {
        field8887++;
        while (true) {
            int var3 = arg1.method1423(arg0 - 98);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field8901 = 7;
                    return;
                }
            }
            this.method3551(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ltp;ILha;II)V", line = 131)
    public static final void method3556(class532 arg0, int arg1, class58 arg2, int arg3, int arg4) {
        field8899++;
        class485 var5 = arg0.method3127(arg2, (byte) -42);
        if (var5 == null) {
            return;
        }
        int var6 = -107 / ((arg3 + 55) / 55);
        arg2.method432(arg1, arg4, arg0.field7658 + arg1, arg0.field7573 + arg4);
        if (class125.field1308 == 2 || class125.field1308 == 5 || class638.field9164 == null) {
            arg2.method389(-16777216, var5, arg1, arg4);
            return;
        }
        int var7;
        int var8;
        int var9;
        int var10;
        if (class496.field7014 == 4) {
            var9 = class175.field2062;
            var10 = class246.field2994;
            var7 = (int) (-class227.field2590) & 0x3FFF;
            var8 = 4096;
        } else {
            var7 = (int) (-class227.field2590) + class34.field367 & 0x3FFF;
            var8 = 4096 - (class730.field10216 * 16);
            var9 = class90.field937.field4635;
            var10 = class90.field937.field4629;
        }
        int var11 = -(class489.field6976 * 2) - (-((var9 / 128) + 48) - 208);
        int var12 = class153.field1677 * 4 + 48 - (var10 / 128) - (class153.field1677 + -104) * 2;
        class638.field9164.method823((float) arg0.field7658 / 2.0F + (float) arg1, (float) arg0.field7573 / 2.0F + (float) arg4, (float) var11, (float) var12, var8, var7 << 2, var5, arg1, arg4);
        for (class716 var13 = (class716) class224.field2568.method1719(65280); var13 != null; var13 = (class716) class224.field2568.method1723(-20665)) {
            int var59 = var13.field10054;
            int var60 = ((class230.field2685.field9449[var59] & 0xFFFF1E8) >> 14) - class464.field6624;
            int var61 = (class230.field2685.field9449[var59] & 0x3FFF) - class181.field2144;
            int var62 = var60 * 4 + 2 - (var9 / 128);
            int var63 = var61 * 4 + 2 - var10 / 128;
            class496.method2958(var62, arg2, class230.field2685.field9446[var59], arg1, arg0, var63, -111, arg4, var5);
        }
        for (int var14 = 0; var14 < class732.field10252; var14++) {
            int var56 = class494.field7002[var14] * 4 + 2 - (var9 / 128);
            int var57 = class360.field4623[var14] * 4 + 2 - (var10 / 128);
            class316 var58 = class445.field6442.method3972((byte) 109, class227.field2593[var14]);
            if (var58.field4045 != null) {
                var58 = var58.method1886(class722.field10125, -114);
                if (var58 == null || var58.field4000 == -1) {
                    continue;
                }
            }
            class496.method2958(var56, arg2, var58.field4000, arg1, arg0, var57, -121, arg4, var5);
        }
        for (class723 var15 = (class723) class450.field6490.method1753(0); var15 != null; var15 = (class723) class450.field6490.method1755(-126)) {
            int var51 = (int) (var15.field1522 >> 28 & 0x3L);
            if (class85.field904 == var51) {
                int var52 = (int) (var15.field1522 & 0x3FFFL) - class464.field6624;
                int var53 = (int) (var15.field1522 >> 14 & 0x3FFFL) - class181.field2144;
                int var54 = var52 * 4 + 2 - (var9 / 128);
                int var55 = var53 * 4 + 2 - (var10 / 128);
                class13.method58(var54, arg0, arg4, false, arg1, var55, var5, class1.field7[0]);
            }
        }
        for (int var16 = 0; var16 < class302.field3784; var16++) {
            class151 var46 = (class151) class253.field3052.method1754(false, (long) class272.field3359[var16]);
            if (var46 != null) {
                class197 var47 = var46.field1661;
                if (var47.method1178(413252706) && class90.field937.field4628 == var47.field4628) {
                    class326 var48 = var47.field2293;
                    if (var48 != null && var48.field4199 != null) {
                        var48 = var48.method1939(true, class722.field10125);
                    }
                    if (var48 != null && var48.field4219 && var48.field4160) {
                        int var49 = var47.field4635 / 128 - (var9 / 128);
                        int var50 = var47.field4629 / 128 - (var10 / 128);
                        if (var48.field4204 == -1) {
                            class13.method58(var49, arg0, arg4, false, arg1, var50, var5, class1.field7[1]);
                        } else {
                            class496.method2958(var49, arg2, var48.field4204, arg1, arg0, var50, -84, arg4, var5);
                        }
                    }
                }
            }
        }
        int var17 = class585.field8256;
        int[] var18 = class399.field5459;
        for (int var19 = 0; var19 < var17; var19++) {
            class183 var38 = class75.field792[var18[var19]];
            if (var38 != null && var38.method1138(413252706) && !var38.field2184 && class90.field937 != var38 && class90.field937.field4628 == var38.field4628) {
                int var39 = var38.field4635 / 128 - (var9 / 128);
                int var40 = var38.field4629 / 128 - (var10 / 128);
                boolean var41 = false;
                for (int var42 = 0; var42 < class752.field10524; var42++) {
                    if (var38.field2157.equals(class19.field175[var42]) && class272.field3356[var42] != 0) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                for (int var44 = 0; var44 < class422.field6150; var44++) {
                    if (var38.field2157.equals(class75.field795[var44].field9495)) {
                        var43 = true;
                        break;
                    }
                }
                boolean var45 = false;
                if (class90.field937.field2167 != 0 && var38.field2167 != 0 && class90.field937.field2167 == var38.field2167) {
                    var45 = true;
                }
                if (var38.field2176) {
                    class13.method58(var39, arg0, arg4, false, arg1, var40, var5, class1.field7[6]);
                } else if (var41) {
                    class13.method58(var39, arg0, arg4, false, arg1, var40, var5, class1.field7[3]);
                } else if (var43) {
                    class13.method58(var39, arg0, arg4, false, arg1, var40, var5, class1.field7[5]);
                } else if (var45) {
                    class13.method58(var39, arg0, arg4, false, arg1, var40, var5, class1.field7[4]);
                } else {
                    class13.method58(var39, arg0, arg4, false, arg1, var40, var5, class1.field7[2]);
                }
            }
        }
        class210[] var20 = class115.field1203;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class210 var24 = var20[var21];
            if (var24 != null && var24.field2471 != 0 && (class392.field5398 % 20) < 10) {
                if (var24.field2471 == 1) {
                    class151 var25 = (class151) class253.field3052.method1754(false, (long) var24.field2481);
                    if (var25 != null) {
                        class197 var26 = var25.field1661;
                        int var27 = var26.field4635 / 128 - (var9 / 128);
                        int var28 = var26.field4629 / 128 - (var10 / 128);
                        class315.method1880(var24.field2480, arg1, var5, 360000L, arg0, var28, arg4, var27, (byte) 55);
                    }
                }
                if (var24.field2471 == 2) {
                    int var29 = var24.field2470 / 128 - (var9 / 128);
                    int var30 = var24.field2479 / 128 - var10 / 128;
                    long var31 = (long) (var24.field2472 << 7);
                    long var33 = var31 * var31;
                    class315.method1880(var24.field2480, arg1, var5, var33, arg0, var30, arg4, var29, (byte) 124);
                }
                if (var24.field2471 == 10 && var24.field2481 >= 0 && class75.field792.length > var24.field2481) {
                    class183 var35 = class75.field792[var24.field2481];
                    if (var35 != null) {
                        int var36 = var35.field4635 / 128 - (var9 / 128);
                        int var37 = var35.field4629 / 128 - (var10 / 128);
                        class315.method1880(var24.field2480, arg1, var5, 360000L, arg0, var37, arg4, var36, (byte) 122);
                    }
                }
            }
        }
        if (class496.field7014 == 4) {
            return;
        }
        if (class471.field6718 != 0) {
            int var22 = class471.field6718 * 4 + (class90.field937.method1128(-1) * 2 - 2) + 2 - (var9 / 128);
            int var23 = (class75.field796 * 4 + ((class90.field937.method1128(-1) + -1) * 2) - (var10 / 128)) + 2;
            class13.method58(var22, arg0, arg4, false, arg1, var23, var5, class411.field5616[class115.field1202 ? 1 : 0]);
        }
        if (!class90.field937.field2184) {
            arg2.method410(-1, arg1 + (arg0.field7658 / 2) - 1, 3, 102, arg0.field7573 / 2 + arg4 - 1, 3);
            return;
        }
    }
}
