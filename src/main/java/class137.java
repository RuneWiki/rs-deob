import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class137 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lea;")
    public static class38 field2868 = class9.method46((byte) 110, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lea;")
    public static class38 field2873 = class9.method46((byte) 103, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lea;")
    private static class38 field2869 = class9.method46((byte) 105, "Please try again)3");

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lea;")
    private static class38 field2872 = class9.method46((byte) 104, " has logged out)3");

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lea;")
    public static class38 field2879 = field2869;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Lea;")
    public static class38 field2881 = class9.method46((byte) 105, "p11_full");

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Lea;")
    public static class38 field2882 = field2872;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field2875;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lea;")
    public class38 field2866;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lk;")
    public static class89 field2880;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
    public boolean field2867;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[Lfa;")
    public static class47[] field2877;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static final void method989(byte arg0) {
        for (int var1 = 0; var1 < class90.field2056; var1++) {
            int var2 = class96.field2163[var1];
            class102 var3 = class105.field2343[var2];
            int var4 = class192.field3794.method509(arg0 + 28);
            if ((var4 & 0x10) != 0) {
                int var5 = class192.field3794.method487(2);
                int var6 = class192.field3794.method463((byte) 35);
                if (var5 == 65535) {
                    var5 = -1;
                }
                if (var3.field395 == var5 && var5 != -1) {
                    int var7 = class139.method997(-19, var5).field2918;
                    if (var7 == 1) {
                        var3.field417 = 0;
                        var3.field420 = 0;
                        var3.field429 = var6;
                        var3.field399 = 0;
                    }
                    if (var7 == 2) {
                        var3.field399 = 0;
                    }
                } else if (var5 == -1 || var3.field395 == -1 || class139.method997(-36, var5).field2920 >= class139.method997(126, var3.field395).field2920) {
                    var3.field395 = var5;
                    var3.field399 = 0;
                    var3.field380 = var3.field385;
                    var3.field417 = 0;
                    var3.field429 = var6;
                    var3.field420 = 0;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field393 = class192.field3794.method511(18);
                if (var3.field393 == 65535) {
                    var3.field393 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field2298 = class188.method1268(-119, class192.field3794.method487(2));
                var3.field418 = var3.field2298.field3159;
                var3.field436 = var3.field2298.field3143;
                var3.field400 = var3.field2298.field3137;
                var3.field408 = var3.field2298.field3149;
                var3.field423 = var3.field2298.field3173;
                var3.field441 = var3.field2298.field3129;
                var3.field426 = var3.field2298.field3152;
                var3.field416 = var3.field2298.field3175;
                var3.field397 = var3.field2298.field3130;
            }
            if ((var4 & 0x40) != 0) {
                var3.field427 = class192.field3794.method487(2);
                var3.field419 = class192.field3794.method487(2);
            }
            if ((var4 & 0x80) != 0) {
                int var8 = class192.field3794.method509(116);
                int var9 = class192.field3794.method483((byte) 31);
                var3.method107(class45.field1098, var8, (byte) 104, var9);
                var3.field437 = class45.field1098 + 300;
                var3.field432 = class192.field3794.method509(118);
                var3.field430 = class192.field3794.method498(255);
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class192.field3794.method483((byte) 91);
                int var11 = class192.field3794.method483((byte) 110);
                var3.method107(class45.field1098, var10, (byte) -48, var11);
                var3.field437 = class45.field1098 + 300;
                var3.field432 = class192.field3794.method483((byte) 90);
                var3.field430 = class192.field3794.method483((byte) -128);
            }
            if ((var4 & 0x1) != 0) {
                var3.field434 = class192.field3794.method475((byte) 57);
                var3.field402 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field376 = class192.field3794.method515(-1739943584);
                int var12 = class192.field3794.method467(arg0 + 8100);
                var3.field404 = 0;
                var3.field392 = (var12 & 0xFFFF) + class45.field1098;
                var3.field394 = 0;
                if (var3.field392 > class45.field1098) {
                    var3.field394 = -1;
                }
                if (var3.field376 == 65535) {
                    var3.field376 = -1;
                }
                var3.field433 = var12 >> 16;
            }
        }
        if (arg0 != 91) {
            field2869 = null;
        }
        field2870++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILre;ZIILfh;)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3, class157 arg4, boolean arg5, int arg6, int arg7, class54 arg8) {
        field2876++;
        if (class31.field610 && (class3.field104[0][arg7][arg6] & 0x2) == 0) {
            if ((class3.field104[arg3][arg7][arg6] & 0x10) != 0) {
                return;
            }
            if (class123.method923(115, arg3, arg7, arg6) != class115.field2537) {
                return;
            }
        }
        if (class111.field2491 > arg3) {
            class111.field2491 = arg3;
        }
        class106 var9 = class70.method553(arg0, 28067);
        int var10;
        int var11;
        if (arg2 == 1 || arg2 == 3) {
            var11 = var9.field2405;
            var10 = var9.field2393;
        } else {
            var10 = var9.field2405;
            var11 = var9.field2393;
        }
        int var12;
        int var13;
        if (arg7 + var11 > 104) {
            var12 = arg7;
            var13 = arg7 + 1;
        } else {
            var13 = (var11 + 1 >> 1) + arg7;
            var12 = (var11 >> 1) + arg7;
        }
        int var14;
        int var15;
        if (arg6 + var10 > 104) {
            var14 = arg6;
            var15 = arg6 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg6;
            var14 = (var10 >> 1) + arg6;
        }
        int[][] var16 = class154.field3209[arg3];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg7 << 7) + (var11 << 6);
        if (arg5) {
            method989((byte) -34);
        }
        int var19 = (arg6 << 7) + (arg0 << 14) + arg7 + 1073741824;
        int var20 = (arg6 << 7) + (var10 << 6);
        if (var9.field2388 == 0) {
            var19 += Integer.MIN_VALUE;
        }
        int var21 = (arg2 << 6) + arg1;
        if (var9.field2381 == 1) {
            var21 += 256;
        }
        if (var9.method862(-9383)) {
            class188.method1264(0, arg3, arg2, var9, arg7, arg6);
        }
        if (arg1 == 22) {
            if (!class31.field610 || var9.field2388 != 0 || var9.field2402 == 1 || var9.field2390) {
                class52 var22;
                if (var9.field2392 == -1 && var9.field2364 == null) {
                    var22 = var9.method863(var20, 64, 22, var17, var18, var16, arg2);
                } else {
                    var22 = new class112(arg0, 22, arg2, arg3, arg7, arg6, var9.field2392, true, null);
                }
                arg4.method1122(arg3, arg7, arg6, var17, var22, var19, var21);
                if (var9.field2402 == 1 && arg8 != null) {
                    arg8.method399(26108, arg6, arg7);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class52 var45;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var45 = var9.method863(var20, 64, 10, var17, var18, var16, arg2);
            } else {
                var45 = new class112(arg0, 10, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            if (var45 != null && arg4.method1100(arg3, arg7, arg6, var17, var11, var10, var45, arg1 == 11 ? 256 : 0, var19, var21) && var9.field2356) {
                int var46 = 15;
                if (var45 instanceof class159) {
                    var46 = ((class159) var45).method1145() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var11; var47++) {
                    for (int var48 = 0; var48 <= var10; var48++) {
                        if (var46 > class162.field3371[arg3][arg7 + var47][arg6 + var48]) {
                            class162.field3371[arg3][arg7 + var47][arg6 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method400(arg6, var10, -1, var11, arg7, var9.field2362);
            }
        } else if (arg1 >= 12) {
            class52 var23;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var23 = var9.method863(var20, 64, arg1, var17, var18, var16, arg2);
            } else {
                var23 = new class112(arg0, arg1, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1100(arg3, arg7, arg6, var17, 1, 1, var23, 0, var19, var21);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0) {
                class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 2340);
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method400(arg6, var10, -1, var11, arg7, var9.field2362);
            }
        } else if (arg1 == 0) {
            class52 var24;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var24 = var9.method863(var20, 64, 0, var17, var18, var16, arg2);
            } else {
                var24 = new class112(arg0, 0, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1090(arg3, arg7, arg6, var17, var24, null, class114.field2533[arg2], 0, var19, var21);
            if (arg2 == 0) {
                if (var9.field2356) {
                    class162.field3371[arg3][arg7][arg6] = 50;
                    class162.field3371[arg3][arg7][arg6 + 1] = 50;
                }
                if (var9.field2409) {
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 585);
                }
            } else if (arg2 == 1) {
                if (var9.field2356) {
                    class162.field3371[arg3][arg7][arg6 + 1] = 50;
                    class162.field3371[arg3][arg7 + 1][arg6 + 1] = 50;
                }
                if (var9.field2409) {
                    class10.field232[arg3][arg7][arg6 + 1] = class94.method794(class10.field232[arg3][arg7][arg6 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var9.field2356) {
                    class162.field3371[arg3][arg7 + 1][arg6] = 50;
                    class162.field3371[arg3][arg7 + 1][arg6 + 1] = 50;
                }
                if (var9.field2409) {
                    class10.field232[arg3][arg7 + 1][arg6] = class94.method794(class10.field232[arg3][arg7 + 1][arg6], 585);
                }
            } else if (arg2 == 3) {
                if (var9.field2356) {
                    class162.field3371[arg3][arg7][arg6] = 50;
                    class162.field3371[arg3][arg7 + 1][arg6] = 50;
                }
                if (var9.field2409) {
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 1170);
                }
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method394(arg6, (byte) -105, var9.field2362, arg1, arg7, arg2);
            }
            if (var9.field2387 != 16) {
                arg4.method1097(arg3, arg7, arg6, var9.field2387);
            }
        } else if (arg1 == 1) {
            class52 var25;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var25 = var9.method863(var20, 64, 1, var17, var18, var16, arg2);
            } else {
                var25 = new class112(arg0, 1, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1090(arg3, arg7, arg6, var17, var25, null, class193.field3804[arg2], 0, var19, var21);
            if (var9.field2356) {
                if (arg2 == 0) {
                    class162.field3371[arg3][arg7][arg6 + 1] = 50;
                } else if (arg2 == 1) {
                    class162.field3371[arg3][arg7 + 1][arg6 + 1] = 50;
                } else if (arg2 == 2) {
                    class162.field3371[arg3][arg7 + 1][arg6] = 50;
                } else if (arg2 == 3) {
                    class162.field3371[arg3][arg7][arg6] = 50;
                }
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method394(arg6, (byte) -124, var9.field2362, arg1, arg7, arg2);
            }
        } else if (arg1 == 2) {
            int var26 = arg2 + 1 & 0x3;
            class52 var27;
            class52 var28;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var27 = var9.method863(var20, 64, 2, var17, var18, var16, arg2 + 4);
                var28 = var9.method863(var20, 64, 2, var17, var18, var16, var26);
            } else {
                var27 = new class112(arg0, 2, arg2 + 4, arg3, arg7, arg6, var9.field2392, true, null);
                var28 = new class112(arg0, 2, var26, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1090(arg3, arg7, arg6, var17, var27, var28, class114.field2533[arg2], class114.field2533[var26], var19, var21);
            if (var9.field2409) {
                if (arg2 == 0) {
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 585);
                    class10.field232[arg3][arg7][arg6 + 1] = class94.method794(class10.field232[arg3][arg7][arg6 + 1], 1170);
                } else if (arg2 == 1) {
                    class10.field232[arg3][arg7][arg6 + 1] = class94.method794(class10.field232[arg3][arg7][arg6 + 1], 1170);
                    class10.field232[arg3][arg7 + 1][arg6] = class94.method794(class10.field232[arg3][arg7 + 1][arg6], 585);
                } else if (arg2 == 2) {
                    class10.field232[arg3][arg7 + 1][arg6] = class94.method794(class10.field232[arg3][arg7 + 1][arg6], 585);
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 1170);
                } else if (arg2 == 3) {
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 1170);
                    class10.field232[arg3][arg7][arg6] = class94.method794(class10.field232[arg3][arg7][arg6], 585);
                }
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method394(arg6, (byte) 89, var9.field2362, arg1, arg7, arg2);
            }
            if (var9.field2387 != 16) {
                arg4.method1097(arg3, arg7, arg6, var9.field2387);
            }
        } else if (arg1 == 3) {
            class52 var29;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var29 = var9.method863(var20, 64, 3, var17, var18, var16, arg2);
            } else {
                var29 = new class112(arg0, 3, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1090(arg3, arg7, arg6, var17, var29, null, class193.field3804[arg2], 0, var19, var21);
            if (var9.field2356) {
                if (arg2 == 0) {
                    class162.field3371[arg3][arg7][arg6 + 1] = 50;
                } else if (arg2 == 1) {
                    class162.field3371[arg3][arg7 + 1][arg6 + 1] = 50;
                } else if (arg2 == 2) {
                    class162.field3371[arg3][arg7 + 1][arg6] = 50;
                } else if (arg2 == 3) {
                    class162.field3371[arg3][arg7][arg6] = 50;
                }
            }
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method394(arg6, (byte) -126, var9.field2362, arg1, arg7, arg2);
            }
        } else if (arg1 == 9) {
            class52 var30;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var30 = var9.method863(var20, 64, arg1, var17, var18, var16, arg2);
            } else {
                var30 = new class112(arg0, arg1, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1100(arg3, arg7, arg6, var17, 1, 1, var30, 0, var19, var21);
            if (var9.field2402 != 0 && arg8 != null) {
                arg8.method400(arg6, var10, -1, var11, arg7, var9.field2362);
            }
            if (var9.field2387 != 16) {
                arg4.method1097(arg3, arg7, arg6, var9.field2387);
            }
        } else if (arg1 == 4) {
            class52 var31;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var31 = var9.method863(var20, 64, 4, var17, var18, var16, arg2);
            } else {
                var31 = new class112(arg0, 4, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1098(arg3, arg7, arg6, var17, var31, null, class114.field2533[arg2], 0, 0, 0, var19, var21);
        } else if (arg1 == 5) {
            int var32 = 16;
            int var33 = arg4.method1127(arg3, arg7, arg6);
            if (var33 != 0) {
                var32 = class70.method553(var33 >> 14 & 0x7FFF, 28067).field2387;
            }
            class52 var34;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var34 = var9.method863(var20, 64, 4, var17, var18, var16, arg2);
            } else {
                var34 = new class112(arg0, 4, arg2, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1098(arg3, arg7, arg6, var17, var34, null, class114.field2533[arg2], 0, class22.field466[arg2] * var32, class35.field748[arg2] * var32, var19, var21);
        } else if (arg1 == 6) {
            int var35 = 8;
            int var36 = arg4.method1127(arg3, arg7, arg6);
            if (var36 != 0) {
                var35 = class70.method553(var36 >> 14 & 0x7FFF, 28067).field2387 / 2;
            }
            class52 var37;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var37 = var9.method863(var20, 64, 4, var17, var18, var16, arg2 + 4);
            } else {
                var37 = new class112(arg0, 4, arg2 + 4, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1098(arg3, arg7, arg6, var17, var37, null, 256, arg2, class115.field2539[arg2] * var35, class84.field1988[arg2] * var35, var19, var21);
        } else if (arg1 == 7) {
            int var38 = arg2 + 2 & 0x3;
            class52 var39;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var39 = var9.method863(var20, 64, 4, var17, var18, var16, var38 + 4);
            } else {
                var39 = new class112(arg0, 4, var38 + 4, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1098(arg3, arg7, arg6, var17, var39, null, 256, var38, 0, 0, var19, var21);
        } else if (arg1 == 8) {
            int var40 = 8;
            int var41 = arg4.method1127(arg3, arg7, arg6);
            if (var41 != 0) {
                var40 = class70.method553(var41 >> 14 & 0x7FFF, 28067).field2387 / 2;
            }
            int var42 = arg2 + 2 & 0x3;
            class52 var43;
            class52 var44;
            if (var9.field2392 == -1 && var9.field2364 == null) {
                var43 = var9.method863(var20, 64, 4, var17, var18, var16, arg2 + 4);
                var44 = var9.method863(var20, 64, 4, var17, var18, var16, var42 + 4);
            } else {
                var43 = new class112(arg0, 4, arg2 + 4, arg3, arg7, arg6, var9.field2392, true, null);
                var44 = new class112(arg0, 4, var42 + 4, arg3, arg7, arg6, var9.field2392, true, null);
            }
            arg4.method1098(arg3, arg7, arg6, var17, var43, var44, 256, arg2, class115.field2539[arg2] * var40, class84.field1988[arg2] * var40, var19, var21);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static void method991(byte arg0) {
        field2873 = null;
        field2877 = null;
        if (arg0 != 125) {
            method990(23, -61, -54, 110, null, true, -58, 16, null);
        }
        field2868 = null;
        field2872 = null;
        field2869 = null;
        field2881 = null;
        field2880 = null;
        field2879 = null;
        field2882 = null;
    }
}
