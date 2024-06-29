import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class108 {

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lnh;")
    public static class53 field2077 = new class53(128);

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field2078 = 0;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lfc;")
    public static class118 field2079 = new class118();

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[Lod;")
    public static class90[] field2076;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[[Lwj;")
    public static class6[][] field2070;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method767(byte arg0) {
        field2072++;
        class96.method700(false, -26);
        boolean var1 = true;
        class23.field578 = 0;
        for (int var2 = 0; var2 < class164.field3086.length; var2++) {
            if (class48.field1037[var2] != -1 && class164.field3086[var2] == null) {
                class164.field3086[var2] = class149.field2777.method1084((byte) -127, class48.field1037[var2], 0);
                if (class164.field3086[var2] == null) {
                    var1 = false;
                    class23.field578++;
                }
            }
            if (class84.field1641[var2] != -1 && class51.field1073[var2] == null) {
                class51.field1073[var2] = class149.field2777.method1091(0, 0, class84.field1641[var2], class171.field3165[var2]);
                if (class51.field1073[var2] == null) {
                    var1 = false;
                    class23.field578++;
                }
            }
            if (class117.field2260 != null && class257.field4569[var2] == null && class117.field2260[var2] != -1) {
                class257.field4569[var2] = class149.field2777.method1091(0, 0, class117.field2260[var2], class171.field3165[var2]);
                if (class257.field4569[var2] == null) {
                    var1 = false;
                    class23.field578++;
                }
            }
        }
        if (class65.field1291 == null || !class56.field1139.method1098(class109.method783(2, new class86[] { class65.field1291.field3795, class42.field946 }), (byte) -96)) {
            class23.field579 = null;
        } else if (class56.field1139.method1072(class109.method783(2, new class86[] { class65.field1291.field3795, class42.field946 }), 65)) {
            class23.field579 = class100.method724(class56.field1139, true, class109.method783(2, new class86[] { class65.field1291.field3795, class42.field946 }));
        } else {
            var1 = false;
            class23.field578++;
        }
        if (!var1) {
            class132.field2497 = 1;
            return;
        }
        boolean var3 = true;
        class169.field3124 = 0;
        for (int var4 = 0; var4 < class164.field3086.length; var4++) {
            byte[] var20 = class51.field1073[var4];
            if (var20 != null) {
                int var21 = (class168.field3103[var4] >> 8) * 64 - class252.field4481;
                int var22 = (class168.field3103[var4] & 0xFF) * 64 - class79.field1554;
                if (class214.field3867) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class59.method428(var20, true, var21, var22);
            }
        }
        if (!var3) {
            class132.field2497 = 2;
            return;
        }
        if (class132.field2497 != 0) {
            class46.method361((byte) -36, class109.method783(2, new class86[] { class272.field4768, class191.field3392 }), true);
        }
        boolean var5 = false;
        class7.method51(21966);
        class17.method135(false);
        class248.method1681(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class122.field2388[var6].method76(false);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class86.field1693[var7][var18][var19] = 0;
                }
            }
        }
        class165.method1191(false, 85);
        class7.method51(21966);
        System.gc();
        class96.method700(true, -26);
        class80.method564((byte) -101, false);
        if (!class214.field3867) {
            class23.method169((byte) 115, false);
            class96.method700(true, -26);
            class20.method154(false, 21);
            if (class257.field4569 != null) {
                class107.method766(63);
            }
        }
        if (class214.field3867) {
            class79.method557((byte) -125, false);
            class96.method700(true, -26);
            class220.method1555(16775690, false);
        }
        class17.method135(false);
        class96.method700(true, -26);
        class133.method944(-24, class122.field2388, false);
        class96.method700(true, -26);
        int var8 = class86.field1703;
        if (class180.field3244 < var8) {
            var8 = class180.field3244;
        }
        if (class180.field3244 - 1 > var8) {
            int var9 = class180.field3244 - 1;
        }
        if (class171.method1225(-121)) {
            class121.method857(0);
        } else {
            class121.method857(class86.field1703);
        }
        class69.method499(0);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class234.method1621(var10, var17, 64);
            }
        }
        class100.method721(-127);
        if (arg0 >= -76) {
            method771((class151) null, 91, 64);
        }
        class7.method51(21966);
        class213.method1510(0);
        class17.method135(false);
        if (class138.field2627 != null && class248.field4415 != null && class84.field1634 == 25) {
            class36.field809.method1356(102, true);
            class263.field4666++;
            class36.field809.method1406(1472534024, 1057001181);
        }
        if (!class214.field3867) {
            int var11 = (class249.field4446 - 6) / 8;
            int var12 = (class249.field4446 + 6) / 8;
            int var13 = (class149.field2780 + 6) / 8;
            int var14 = (class149.field2780 - 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var14 - 1; var16 <= (var13 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var14 || var16 > var13) {
                        class149.field2777.method1087(class109.method783(2, new class86[] { class111.field2119, class4.method26(false, var15), class67.field1319, class4.method26(false, var16) }), true);
                        class149.field2777.method1087(class109.method783(2, new class86[] { class234.field4222, class4.method26(false, var15), class67.field1319, class4.method26(false, var16) }), true);
                    }
                }
            }
        }
        if (class84.field1634 == 28) {
            class138.method983(10, (byte) 102);
        } else {
            class138.method983(30, (byte) 102);
            if (class248.field4415 != null) {
                class36.field809.method1356(74, true);
            }
        }
        class7.method51(21966);
        class142.method1012((byte) -7);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILqk;IIZIII)V")
    public static final void method768(int arg0, int arg1, class200 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        int var9 = -111 / (arg7 / 45);
        field2075++;
        if (arg0 < 0 || arg0 >= 104 || arg8 < 0 || arg8 >= 104) {
            while (true) {
                int var12 = arg2.method1408((byte) -24);
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg2.method1408((byte) -101);
                    return;
                }
                if (var12 <= 49) {
                    arg2.method1408((byte) -114);
                }
            }
        }
        if (!arg5) {
            class86.field1693[arg1][arg0][arg8] = 0;
        }
        while (true) {
            int var10 = arg2.method1408((byte) -123);
            if (var10 == 0) {
                if (arg5) {
                    class35.field796[0][arg0][arg8] = class78.field1536[0][arg0][arg8];
                    return;
                } else if (arg1 == 0) {
                    class35.field796[0][arg0][arg8] = -class73.method536(556238 - (-arg8 - arg3), 97, arg0 + arg4 + 932731) * 8;
                    return;
                } else {
                    class35.field796[arg1][arg0][arg8] = class35.field796[arg1 - 1][arg0][arg8] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg2.method1408((byte) -120);
                if (!arg5) {
                    if (var11 == 1) {
                        var11 = 0;
                    }
                    if (arg1 == 0) {
                        class35.field796[0][arg0][arg8] = -var11 * 8;
                        return;
                    }
                    class35.field796[arg1][arg0][arg8] = class35.field796[arg1 - 1][arg0][arg8] - (var11 * 8);
                    return;
                }
                class35.field796[0][arg0][arg8] = var11 * 8 + class78.field1536[0][arg0][arg8];
                return;
            }
            if (var10 <= 49) {
                class219.field3928[arg1][arg0][arg8] = arg2.method1412((byte) 110);
                class41.field922[arg1][arg0][arg8] = (byte) ((var10 - 2) / 4);
                class10.field315[arg1][arg0][arg8] = (byte) class1.method5(3, var10 + arg6 - 2);
            } else if (var10 > 81) {
                class44.field988[arg1][arg0][arg8] = (byte) (var10 - 81);
            } else if (!arg5) {
                class86.field1693[arg1][arg0][arg8] = (byte) (var10 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lbj;B)V")
    public static final void method769(class151 arg0, byte arg1) {
        if (arg1 == 123) {
            class159.field2982 = arg0;
            field2074++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZBILbj;II)V")
    public static final void method770(boolean arg0, byte arg1, int arg2, class151 arg3, int arg4, int arg5) {
        class83.field1622 = 10000;
        class171.field3143 = arg4;
        class272.field4766 = arg2;
        field2073++;
        if (arg1 != -82) {
            field2070 = null;
        }
        class45.field1007 = 1;
        class187.field3315 = arg3;
        class177.field3208 = arg0;
        class135.field2592 = arg5;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lbj;II)Lqc;")
    public static final class62 method771(class151 arg0, int arg1, int arg2) {
        field2069++;
        if (class81.method570(14, arg0, arg1)) {
            if (arg2 > -111) {
                method769((class151) null, (byte) -108);
            }
            return class138.method988((byte) 80);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method772(boolean arg0) {
        field2076 = null;
        field2079 = null;
        field2077 = null;
        if (!arg0) {
            method770(false, (byte) -69, -89, (class151) null, 66, 39);
        }
        field2070 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIZII)V")
    public static final void method773(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2071++;
        long var6 = class5.method30(arg2, arg5, arg4);
        if (var6 != 0L) {
            int var8 = ((int) var6 & 0x7C440) >> 14;
            int var9 = ((int) var6 & 0x367244) >> 20;
            int var10 = arg0;
            int[] var11 = class131.field2493;
            int var12 = 24624 - (-(arg5 * 4) - (103 - arg4) * 512 * 4);
            if (var6 > 0L) {
                var10 = arg1;
            }
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class117 var14 = class268.method1845(var13, (byte) -58);
            if (var14.field2292 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1539] = var10;
                    }
                }
            } else {
                class101 var15 = null;
                if (!var14.field2286) {
                    var15 = class272.field4767[var14.field2292];
                } else if (var9 == 0) {
                    var15 = class272.field4767[var14.field2292];
                } else if (var9 == 1) {
                    var15 = class209.field3781[var14.field2292];
                } else if (var9 == 2) {
                    var15 = class114.field2185[var14.field2292];
                } else if (var9 == 3) {
                    var15 = class66.field1314[var14.field2292];
                }
                if (var15 != null) {
                    int var16 = (var14.field2273 * 4 - var15.field1217) / 2;
                    int var17 = (var14.field2307 * 4 - var15.field1227) / 2;
                    var15.method447((arg5 * 4) + var17 + 48, (104 - (arg4 - -var14.field2273)) * 4 + 48 + var16);
                }
            }
        }
        long var18 = class215.method1525(arg2, arg5, arg4);
        if (!arg3) {
            method768(-98, -17, (class200) null, -29, 77, true, -8, -65, -33);
        }
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class117 var23 = class268.method1845(var22, (byte) -66);
            if (var23.field2292 != -1) {
                class101 var24 = null;
                if (!var23.field2286) {
                    var24 = class272.field4767[var23.field2292];
                } else if (var20 == 0) {
                    var24 = class272.field4767[var23.field2292];
                } else if (var20 == 1) {
                    var24 = class209.field3781[var23.field2292];
                } else if (var20 == 2) {
                    var24 = class114.field2185[var23.field2292];
                } else if (var20 == 3) {
                    var24 = class66.field1314[var23.field2292];
                }
                if (var24 != null) {
                    int var25 = (var23.field2307 * 4 - var24.field1227) / 2;
                    int var26 = (var23.field2273 * 4 - var24.field1217) / 2;
                    var24.method447(arg5 * 4 + var25 + 48, (-arg4 + 104 + -var23.field2273) * 4 + 48 + var26);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                int[] var28 = class131.field2493;
                int var29 = arg5 * 4 + (103 - arg4) * 512 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 513] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        long var30 = class218.method1537(arg2, arg5, arg4);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x37982B) >> 20;
        int var33 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class117 var34 = class268.method1845(var33, (byte) -43);
        if (var34.field2292 == -1) {
            return;
        }
        class101 var35 = null;
        if (!var34.field2286) {
            var35 = class272.field4767[var34.field2292];
        } else if (var32 == 0) {
            var35 = class272.field4767[var34.field2292];
        } else if (var32 == 1) {
            var35 = class209.field3781[var34.field2292];
        } else if (var32 == 2) {
            var35 = class114.field2185[var34.field2292];
        } else if (var32 == 3) {
            var35 = class66.field1314[var34.field2292];
        }
        if (var35 != null) {
            int var36 = (var34.field2307 * 4 - var35.field1227) / 2;
            int var37 = (var34.field2273 * 4 - var35.field1217) / 2;
            var35.method447((arg5 * 4) + var36 + 48, (104 - var34.field2273 + -arg4) * 4 + 48 + var37);
            return;
        }
    }
}
