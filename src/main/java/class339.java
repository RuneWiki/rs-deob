import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class339 extends class29 {

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "[I")
    private int[] field5264;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "[I")
    private int[] field5269;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lkh;")
    private class16 field5272;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lkh;")
    private class16 field5265;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lkh;")
    private class16 field5274;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "[Lkh;")
    private class16[] field5271;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "[I")
    public static int[] field5254 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field5257 = 0;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field5260 = 0;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field5253 = 0;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "J")
    public static volatile long field5266 = 0L;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Lok;")
    public static class160 field5273 = null;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field5267 = 0;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "[I")
    public static int[] field5258;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "[[[Li;")
    public static class230[][][] field5270;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZLmn;DILkb;)Lkg;", line = 4)
    public final class82 method2332(int arg0, int arg1, boolean arg2, class177 arg3, double arg4, int arg5, class39 arg6) {
        class147.method1030(255, arg4);
        class276.field4375 = arg3;
        class308.field4821 = arg6;
        field5256++;
        class93.method670((byte) 127, arg1, arg0);
        class82 var9 = new class82(arg0, arg1);
        if (arg5 != 23323) {
            this.method2337(-45, 0.8161803596314733D, -119, 121, false, (class39) null, (class177) null);
        }
        for (int var10 = 0; var10 < this.field5271.length; var10++) {
            this.field5271[var10].method105(arg0, arg1, -120);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg2) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5265.field191) {
                int[] var17 = this.field5265.method8(true, var12);
                var16 = var17;
                var14 = var17;
                var15 = var17;
            } else {
                int[][] var13 = this.field5265.method54(var12, (byte) 123);
                var14 = var13[0];
                var15 = var13[2];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field5274.field191) {
                var18 = this.field5274.method8(true, var12);
            } else {
                var18 = this.field5274.method54(var12, (byte) -18)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var16[var19] >> 4;
                int var22 = class19.field271[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class19.field271[var21];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class19.field271[var24];
                int var26;
                if (var22 == 0 && var23 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field4659[var11++] = (var26 << 24) + (var22 << 16) + (var23 << 8) + var25;
                if (arg2) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field5271.length; var27++) {
            this.field5271[var27].method68(-8090);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLmn;ILkb;DI)Ln;", line = 138)
    public final class298 method2333(int arg0, boolean arg1, class177 arg2, int arg3, class39 arg4, double arg5, int arg6) {
        class147.method1030(arg6 ^ 0xFF, arg5);
        class308.field4821 = arg4;
        field5251++;
        class276.field4375 = arg2;
        class93.method670((byte) 127, arg0, arg3);
        class298 var9 = new class298(arg3, arg0);
        for (int var10 = 0; var10 < this.field5271.length; var10++) {
            this.field5271[var10].method105(arg3, arg0, -121);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg1) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field5265.field191) {
                int[] var13 = this.field5265.method8(true, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field5265.method54(var12, (byte) 90);
                var16 = var17[0];
                var15 = var17[2];
                var14 = var17[1];
            }
            for (int var18 = 0; var18 != arg3; var18++) {
                int var19 = var16[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                int var20 = var15[var18] >> 4;
                if (var19 < 0) {
                    var19 = 0;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var14[var18] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = class19.field271[var19];
                int var23 = class19.field271[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class19.field271[var21];
                var9.field4659[var11++] = (var24 << 8) + (var22 << 16) + var23;
                if (arg1) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var25 = arg6; var25 < this.field5271.length; var25++) {
            this.field5271[var25].method68(-8090);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmn;BZZDIILkb;)[I", line = 256)
    public final int[] method2334(class177 arg0, byte arg1, boolean arg2, boolean arg3, double arg4, int arg5, int arg6, class39 arg7) {
        field5261++;
        class147.method1030(255, arg4);
        class276.field4375 = arg0;
        int[] var10 = new int[arg5 * arg6];
        class308.field4821 = arg7;
        class93.method670((byte) 127, arg6, arg5);
        for (int var11 = 0; var11 < this.field5271.length; var11++) {
            this.field5271[var11].method105(arg5, arg6, arg1 - 154);
        }
        int var12 = 0;
        byte var13;
        int var14;
        int var15;
        if (arg2) {
            var13 = -1;
            var14 = -1;
            var15 = arg5 - 1;
        } else {
            var14 = arg5;
            var15 = 0;
            var13 = 1;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg3) {
                var12 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field5265.field191) {
                int[] var21 = this.field5265.method8(true, var16);
                var18 = var21;
                var19 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field5265.method54(var16, (byte) -37);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var15; var22 != var14; var22 += var13) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                int var25 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class19.field271[var23];
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class19.field271[var24];
                int var28 = class19.field271[var25];
                var10[var12++] = (var26 << 16) + (var27 << 8) + var28;
                if (arg3) {
                    var12 += arg5 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field5271.length; var29++) {
            this.field5271[var29].method68(-8090);
        }
        if (arg1 != 32) {
            this.field5269 = (int[]) null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lok;Z)Z", line = 385)
    public static final boolean method2335(class160 arg0, boolean arg1) {
        if (!arg1) {
            return false;
        }
        field5268++;
        if (arg0.field2461 == 205) {
            class34.field448 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILc;Z)V", line = 411)
    public static final void method2336(int arg0, int arg1, class320 arg2, boolean arg3) {
        field5262++;
        if ((arg0 & 0x20) != 0) {
            int var4 = class336.field5213.method1394(false);
            int var5 = class336.field5213.method1399(-1172389784);
            int var6 = class336.field5213.method1393(3);
            int var7 = class336.field5213.field3129;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg2.field5003 != null && arg2.field5004 != null) {
                long var9 = class232.method1669(37, arg2.field5003);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var8 && (class288.field4549 && !class112.field1675 || class210.field3446)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class271.field4291; var12++) {
                            if (class157.field2424[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class269.field4252 == 0) {
                    class310.field4843.field3129 = 0;
                    class336.field5213.method1409((byte) 67, class310.field4843.field3128, var6, 0);
                    class310.field4843.field3129 = 0;
                    int var13 = -1;
                    String var15;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class218 var14 = class114.method788(class310.field4843, 0);
                        var13 = var14.field3498;
                        var15 = var14.field3496.method1982(class310.field4843, -1);
                    } else {
                        var15 = class143.method999(class98.method695(class305.method2134(125, class310.field4843), false));
                    }
                    arg2.field1949 = var15.trim();
                    arg2.field2028 = 150;
                    arg2.field2032 = var4 >> 8;
                    arg2.field1961 = var4 & 0xFF;
                    if (var5 == 2) {
                        class192.method1405(var15, var8 ? 17 : 1, (String) null, var13, "<img=1>" + arg2.method2240((byte) 115), 1637740768);
                    } else if (var5 == 1) {
                        class192.method1405(var15, var8 ? 17 : 1, (String) null, var13, "<img=0>" + arg2.method2240((byte) 115), 1637740768);
                    } else {
                        class192.method1405(var15, var8 ? 17 : 2, (String) null, var13, arg2.method2240((byte) 115), 1637740768);
                    }
                }
            }
            class336.field5213.field3129 = var6 + var7;
        }
        if ((arg0 & 0x1) != 0) {
            int var16 = class336.field5213.method1362(-61);
            int var17 = class336.field5213.method1399(-1172389784);
            arg2.method903(-70, var17, var16, class48.field648);
            arg2.field1992 = class48.field648 + 300;
            arg2.field2040 = class336.field5213.method1397((byte) -119);
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field1976 = class336.field5213.method1384(2104932360);
            if (arg2.field1976 == 65535) {
                arg2.field1976 = -1;
            }
        }
        if ((arg0 & 0x10) != 0) {
            arg2.field1949 = class336.field5213.method1355((byte) 127);
            if (arg2.field1949.charAt(0) == '~') {
                arg2.field1949 = arg2.field1949.substring(1);
                class245.method1740((byte) -117, 2, arg2.method2240((byte) 115), arg2.field1949);
            } else if (class13.field159 == arg2) {
                class245.method1740((byte) -120, 2, arg2.method2240((byte) 115), arg2.field1949);
            }
            arg2.field2032 = 0;
            arg2.field2028 = 150;
            arg2.field1961 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field1950 = class336.field5213.method1407(true);
            arg2.field1995 = class336.field5213.method1393(3);
            arg2.field1988 = class336.field5213.method1393(3);
            arg2.field1953 = class336.field5213.method1393(3);
            arg2.field1978 = class336.field5213.method1384(2104932360) + class48.field648;
            arg2.field1975 = class336.field5213.method1394(!arg3) + class48.field648;
            arg2.field1959 = class336.field5213.method1407(true);
            arg2.field2001 = 0;
            arg2.field1951 = 1;
        }
        if ((arg0 & 0x40) != 0) {
            arg2.field1964 = class336.field5213.method1396(-112);
            arg2.field2004 = class336.field5213.method1357(true);
        }
        if (!arg3) {
            field5254 = (int[]) null;
        }
        if ((arg0 & 0x100) != 0) {
            int var18 = class336.field5213.method1397((byte) -117);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = class336.field5213.method1384(2104932360);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = class336.field5213.method1399(-1172389784);
                var21[var22] = class336.field5213.method1357(true);
            }
            class46.method309(-1, var20, var19, arg2, var21);
        }
        if ((arg0 & 0x8) != 0) {
            int var24 = class336.field5213.method1357(true);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class336.field5213.method1407(true);
            class221.method1613(var25, arg2, var24, 24299);
        }
        if ((arg0 & 0x2) != 0) {
            int var26 = class336.field5213.method1393(3);
            byte[] var27 = new byte[var26];
            class192 var28 = new class192(var27);
            class336.field5213.method1376(var27, 0, 71, var26);
            class26.field379[arg1] = var28;
            arg2.method2238(var28, -123);
        }
        if ((arg0 & 0x400) != 0) {
            int var29 = class336.field5213.method1396(-118);
            int var30 = class336.field5213.method1360((byte) 97);
            if (var29 == 65535) {
                var29 = -1;
            }
            boolean var31 = true;
            if (var29 != -1 && arg2.field2022 != -1 && class37.method236(class264.method1881((byte) 122, var29).field302, 20254).field1197 < class37.method236(class264.method1881((byte) 115, arg2.field2022).field302, 20254).field1197) {
                var31 = false;
            }
            if (var31) {
                arg2.field2010 = var30 >> 16;
                arg2.field2022 = var29;
                arg2.field2024 = 1;
                arg2.field1945 = (var30 & 0xFFFF) + class48.field648;
                arg2.field1993 = 0;
                arg2.field1957 = 0;
                if (class48.field648 < arg2.field1945) {
                    arg2.field1957 = -1;
                }
                if (arg2.field2022 != -1 && class48.field648 == arg2.field1945) {
                    int var32 = class264.method1881((byte) 118, arg2.field2022).field302;
                    if (var32 != -1) {
                        class80 var33 = class37.method236(var32, 20254);
                        if (var33 != null && var33.field1209 != null) {
                            class253.method1789(19080, arg2.field1944, var33, 0, arg2.field1980, class13.field159 == arg2);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x800) != 0) {
            int var34 = class336.field5213.method1362(126);
            int var35 = class336.field5213.method1397((byte) -119);
            arg2.method903(-70, var35, var34, class48.field648);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IDIIZLkb;Lmn;)[I", line = 704)
    public final int[] method2337(int arg0, double arg1, int arg2, int arg3, boolean arg4, class39 arg5, class177 arg6) {
        field5252++;
        class147.method1030(255, arg1);
        class276.field4375 = arg6;
        class308.field4821 = arg5;
        int[] var9 = new int[arg0 * arg3 * 4];
        class93.method670((byte) 127, arg0, arg3);
        int var10 = 97 / ((-arg2 - 35) / 37);
        for (int var11 = 0; var11 < this.field5271.length; var11++) {
            this.field5271[var11].method105(arg3, arg0, -110);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg0; var13++) {
            if (arg4) {
                var12 = var13;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5265.field191) {
                int[] var14 = this.field5265.method8(true, var13);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field5265.method54(var13, (byte) 87);
                var15 = var18[1];
                var17 = var18[2];
                var16 = var18[0];
            }
            int[] var19;
            if (this.field5274.field191) {
                var19 = this.field5274.method8(true, var13);
            } else {
                var19 = this.field5274.method54(var13, (byte) -75)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class19.field271[var23];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var25 = class19.field271[var21];
                int var26 = class19.field271[var22];
                int var27;
                if (var26 == 0 && var24 == 0 && var25 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9[var12++] = (var24 << 8) + (var26 << 16) + (var27 << 24) + var25;
                if (arg4) {
                    var12 += arg3 - 1;
                }
            }
        }
        for (int var28 = 0; var28 < this.field5271.length; var28++) {
            this.field5271[var28].method68(-8090);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V", line = 837)
    public static void method2338(byte arg0) {
        field5254 = null;
        field5273 = null;
        field5270 = (class230[][][]) null;
        field5258 = null;
        if (arg0 != 108) {
            field5266 = 115L;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmn;ZIILkb;B)[F", line = 850)
    public final float[] method2339(class177 arg0, boolean arg1, int arg2, int arg3, class39 arg4, byte arg5) {
        class308.field4821 = arg4;
        field5255++;
        class276.field4375 = arg0;
        float[] var7 = new float[arg2 * arg3 * 4];
        if (arg5 != 72) {
            field5258 = (int[]) null;
        }
        class93.method670((byte) 127, arg2, arg3);
        for (int var8 = 0; var8 < this.field5271.length; var8++) {
            this.field5271[var8].method105(arg3, arg2, arg5 ^ 0xFFFFFFC8);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field5265.field191) {
                int[] var15 = this.field5265.method8(true, var10);
                var12 = var15;
                var13 = var15;
                var14 = var15;
            } else {
                int[][] var11 = this.field5265.method54(var10, (byte) 84);
                var12 = var11[0];
                var13 = var11[2];
                var14 = var11[1];
            }
            int[] var16;
            if (this.field5274.field191) {
                var16 = this.field5274.method8(true, var10);
            } else {
                var16 = this.field5274.method54(var10, (byte) 88)[0];
            }
            int[] var17;
            if (this.field5272.field191) {
                var17 = this.field5272.method8(true, var10);
            } else {
                var17 = this.field5272.method54(var10, (byte) -17)[0];
            }
            for (int var18 = arg3 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                if (var19 < 0.0F) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = var19;
                if (arg1) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field5271.length; var21++) {
            this.field5271[var21].method68(arg5 - 8162);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lcj;", line = 967)
    public static final class333 method2340(int arg0, int arg1) {
        class333 var2 = (class333) class210.field3442.method1619((long) arg1, 125);
        if (arg0 != -6047) {
            field5254 = (int[]) null;
        }
        field5259++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class230.field3665.method250(true, 30, arg1);
        class333 var4 = new class333();
        if (var3 != null) {
            var4.method2295(112, arg1, new class192(var3));
        }
        class210.field3442.method1621((long) arg1, -110, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lkb;Lmn;B)Z", line = 1004)
    public final boolean method2341(class39 arg0, class177 arg1, byte arg2) {
        if (arg2 < 105) {
            field5273 = (class160) null;
        }
        field5263++;
        if (class194.field3177 <= 0) {
            for (int var4 = 0; var4 < this.field5264.length; var4++) {
                if (!arg0.method246(false, this.field5264[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5264.length; var5++) {
                if (!arg0.method243(this.field5264[var5], false, class194.field3177)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5269.length; var6++) {
            if (!arg1.method59(0, this.field5269[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V", line = 1064)
    public class339() {
        this.field5264 = new int[0];
        this.field5269 = new int[0];
        this.field5272 = new class241(0);
        this.field5272.field205 = 1;
        this.field5265 = new class241();
        this.field5265.field205 = 1;
        this.field5274 = new class241();
        this.field5271 = new class16[] { this.field5265, this.field5274, this.field5272 };
        this.field5274.field205 = 1;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lim;)V", line = 1085)
    public class339(class192 arg0) {
        int var2 = arg0.method1399(-1172389784);
        int[][] var3 = new int[var2][];
        this.field5271 = new class16[var2];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class16 var7 = class125.method863(arg0, 11949);
            if (var7.method70(0) >= 0) {
                var4++;
            }
            if (var7.method113(-9079) >= 0) {
                var5++;
            }
            int var8 = var7.field198.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method1399(-1172389784);
            }
            this.field5271[var6] = var7;
        }
        this.field5269 = new int[var5];
        this.field5264 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class16 var13 = this.field5271[var12];
            int var14 = var13.field198.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field198[var15] = this.field5271[var3[var12][var15]];
            }
            int var16 = var13.method70(0);
            int var17 = var13.method113(-9079);
            if (var16 > 0) {
                this.field5264[var11++] = var16;
            }
            if (var17 > 0) {
                this.field5269[var10++] = var17;
            }
            var3[var12] = null;
        }
        this.field5265 = this.field5271[arg0.method1399(-1172389784)];
        int[][] var18 = (int[][]) null;
        this.field5274 = this.field5271[arg0.method1399(-1172389784)];
        this.field5272 = this.field5271[arg0.method1399(-1172389784)];
    }
}
