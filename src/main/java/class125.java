import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class125 extends class46 {

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Lmb;")
    public static class132 field2319 = class166.method1092("Lade Schrifts-=tze )2 ", 113);

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field2321 = 0;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lmb;")
    private static class132 field2334 = class166.method1092("Sorry invited players only)3", 114);

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lmb;")
    public static class132 field2331 = class166.method1092("<col=ff3000>", 118);

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lmb;")
    public static class132 field2333 = field2334;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lmb;")
    private static class132 field2340 = class166.method1092("Please use a different world)3", 120);

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lmb;")
    public static class132 field2338 = field2340;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "Lmb;")
    public static class132 field2318 = class166.method1092("document)3cookie=(R", 121);

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lmb;")
    public static class132 field2326 = field2340;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Lmb;")
    public class132 field2323;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljava/awt/Frame;")
    public static Frame field2322;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
    public int[] field2317;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "[I")
    public int[] field2324;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "[I")
    public int[] field2332;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[I")
    public int[] field2335;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
    public static int[] field2337;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILmf;Lmf;IIIIJ)V")
    public static final void method817(int arg0, int arg1, int arg2, int arg3, class136 arg4, class136 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class220 var12 = new class220();
        var12.field4022 = arg10;
        var12.field4009 = arg1 * 128 + 64;
        var12.field4011 = arg2 * 128 + 64;
        var12.field4006 = arg3;
        var12.field4023 = arg4;
        var12.field4019 = arg5;
        var12.field4017 = arg6;
        var12.field4004 = arg7;
        var12.field4010 = arg8;
        var12.field4018 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class101.field1900[var13][arg1][arg2] == null) {
                class101.field1900[var13][arg1][arg2] = new class169(var13, arg1, arg2);
            }
        }
        class101.field1900[arg0][arg1][arg2].field3099 = var12;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)I")
    public static final int method818(int arg0, int arg1, byte arg2) {
        field2339++;
        if (arg2 != 71) {
            return 117;
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method819(int arg0, int arg1) {
        field2330++;
        if (!class137.method933(256, arg1)) {
            return;
        }
        class96[] var2 = class97.field1866[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class96 var4 = var2[var3];
            if (var4 != null) {
                var4.field1813 = 0;
                var4.field1758 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lic;IIIIIII)V")
    public static final void method820(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8;
        int var9 = var8 = (arg6 << 7) - class213.field3897;
        int var10;
        int var11 = var10 = (arg7 << 7) - class191.field3537;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14;
        int var15 = var14 = var11 + 128;
        int var16 = class78.field1364[arg1][arg6][arg7] - class58.field975;
        int var17 = class78.field1364[arg1][arg6 + 1][arg7] - class58.field975;
        int var18 = class78.field1364[arg1][arg6 + 1][arg7 + 1] - class58.field975;
        int var19 = class78.field1364[arg1][arg6][arg7 + 1] - class58.field975;
        int var20 = arg4 * var11 + arg5 * var9 >> 16;
        int var21 = arg5 * var11 - arg4 * var9 >> 16;
        int var23 = arg3 * var16 - arg2 * var21 >> 16;
        int var24 = arg2 * var16 + arg3 * var21 >> 16;
        if (var24 < 50) {
            return;
        }
        int var26 = arg4 * var10 + arg5 * var13 >> 16;
        int var27 = arg5 * var10 - arg4 * var13 >> 16;
        int var29 = arg3 * var17 - arg2 * var27 >> 16;
        int var30 = arg2 * var17 + arg3 * var27 >> 16;
        if (var30 < 50) {
            return;
        }
        int var32 = arg4 * var15 + arg5 * var12 >> 16;
        int var33 = arg5 * var15 - arg4 * var12 >> 16;
        int var35 = arg3 * var18 - arg2 * var33 >> 16;
        int var36 = arg2 * var18 + arg3 * var33 >> 16;
        if (var36 < 50) {
            return;
        }
        int var38 = arg4 * var14 + arg5 * var8 >> 16;
        int var39 = arg5 * var14 - arg4 * var8 >> 16;
        int var41 = arg3 * var19 - arg2 * var39 >> 16;
        int var42 = arg2 * var19 + arg3 * var39 >> 16;
        if (var42 < 50) {
            return;
        }
        int var44 = (var20 << 9) / var24 + class50.field856;
        int var45 = (var23 << 9) / var24 + class50.field849;
        int var46 = (var26 << 9) / var30 + class50.field856;
        int var47 = (var29 << 9) / var30 + class50.field849;
        int var48 = (var32 << 9) / var36 + class50.field856;
        int var49 = (var35 << 9) / var36 + class50.field849;
        int var50 = (var38 << 9) / var42 + class50.field856;
        int var51 = (var41 << 9) / var42 + class50.field849;
        class50.field848 = 0;
        if ((var47 - var51) * (var48 - var50) - (var46 - var50) * (var49 - var51) > 0) {
            if (class154.field2818 && class217.method1355(class50.field856 + class171.field3192, class50.field849 + class17.field259, var49, var51, var47, var48, var50, var46)) {
                class140.field2618 = arg6;
                class6.field60 = arg7;
            }
            class50.field852 = false;
            if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > class50.field861 || var50 > class50.field861 || var46 > class50.field861) {
                class50.field852 = true;
            }
            if (arg0.field1601 == -1) {
                if (arg0.field1616 != 12345678) {
                    class50.method335(var49, var51, var47, var48, var50, var46, arg0.field1616, arg0.field1619, arg0.field1620);
                }
            } else if (class182.field3352) {
                int var52 = class50.field859.method489(arg0.field1601, (byte) -46);
                class50.method335(var49, var51, var47, var48, var50, var46, class144.method968(var52, arg0.field1616), class144.method968(var52, arg0.field1619), class144.method968(var52, arg0.field1620));
            } else if (arg0.field1609) {
                class50.method337(var49, var51, var47, var48, var50, var46, arg0.field1616, arg0.field1619, arg0.field1620, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1601);
            } else {
                class50.method337(var49, var51, var47, var48, var50, var46, arg0.field1616, arg0.field1619, arg0.field1620, var32, var38, var26, var35, var41, var29, var36, var42, var30, arg0.field1601);
            }
        }
        if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
            return;
        }
        if (class154.field2818 && class217.method1355(class50.field856 + class171.field3192, class50.field849 + class17.field259, var45, var47, var51, var44, var46, var50)) {
            class140.field2618 = arg6;
            class6.field60 = arg7;
        }
        class50.field852 = false;
        if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > class50.field861 || var46 > class50.field861 || var50 > class50.field861) {
            class50.field852 = true;
        }
        if (arg0.field1601 != -1) {
            if (!class182.field3352) {
                class50.method337(var45, var47, var51, var44, var46, var50, arg0.field1617, arg0.field1620, arg0.field1619, var20, var26, var38, var23, var29, var41, var24, var30, var42, arg0.field1601);
                return;
            }
            int var53 = class50.field859.method489(arg0.field1601, (byte) -59);
            class50.method335(var45, var47, var51, var44, var46, var50, class144.method968(var53, arg0.field1617), class144.method968(var53, arg0.field1620), class144.method968(var53, arg0.field1619));
        } else if (arg0.field1617 != 12345678) {
            class50.method335(var45, var47, var51, var44, var46, var50, arg0.field1617, arg0.field1620, arg0.field1619);
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)I")
    public final int method821(boolean arg0, int arg1) {
        field2328++;
        if (this.field2332 == null) {
            return -1;
        }
        if (!arg0) {
            field2326 = null;
        }
        for (int var3 = 0; var3 < this.field2332.length; var3++) {
            if (this.field2317[var3] == arg1) {
                return this.field2332[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lpb;III)Lbf;")
    public static final class18 method822(class165 arg0, int arg1, int arg2, int arg3) {
        field2325++;
        if (arg3 != 0) {
            field2326 = null;
        }
        return class172.method1122(arg1, arg0, arg2, true) ? class159.method1033((byte) 84) : null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILkd;)V")
    public final void method823(int arg0, class112 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method716(-1308);
            if (var3 == 0) {
                field2329++;
                return;
            }
            this.method827(var3, arg1, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static final void method824(byte arg0) {
        class222.field4044 = null;
        class52.field886 = null;
        class218.field3984 = null;
        class47.field816 = null;
        class70.field1171 = 0;
        int var1 = 126 % ((arg0 - 31) / 62);
        class154.field2813 = null;
        field2320++;
        class24.field369 = null;
        class215.field3917 = null;
        client.field543 = null;
        class74.field1222 = null;
        class198.field3681 = null;
        class231.field4165.method130(12040);
        class138.field2584.method130(12040);
        class73.field1221 = null;
        class217.field3973 = null;
        class159.field2898 = null;
        class32.field500 = null;
        class137.field2574 = null;
        class75.field1243 = null;
        class24.field344 = null;
        class82.field1383 = null;
        class153.field2796 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I")
    public final int method825(byte arg0, int arg1) {
        field2336++;
        if (this.field2335 == null) {
            return -1;
        }
        int var3 = 11 / ((arg0 - 41) / 62);
        for (int var4 = 0; var4 < this.field2335.length; var4++) {
            if (this.field2324[var4] == arg1) {
                return this.field2335[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Z")
    public static final boolean method826(boolean arg0) {
        field2327++;
        try {
            if (class39.field633 == 2) {
                if (class192.field3592 == null) {
                    class192.field3592 = class146.method980(class25.field405, class55.field940, class88.field1545);
                    if (class192.field3592 == null) {
                        return false;
                    }
                }
                if (class106.field1973 == null) {
                    class106.field1973 = new class54(class88.field1537, class140.field2624);
                }
                if (class34.field556.method160(class192.field3592, 22050, class106.field1973, 65280, class60.field1024)) {
                    class34.field556.method174((byte) 106);
                    class34.field556.method155(true, class52.field881);
                    class34.field556.method164(class192.field3592, class45.field785, 68);
                    class106.field1973 = null;
                    class25.field405 = null;
                    class192.field3592 = null;
                    class39.field633 = 0;
                    return true;
                }
            }
            if (!arg0) {
                field2318 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class34.field556.method184((byte) -6);
            class106.field1973 = null;
            class192.field3592 = null;
            class39.field633 = 0;
            class25.field405 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILkd;B)V")
    private final void method827(int arg0, class112 arg1, byte arg2) {
        field2316++;
        if (arg2 != -59) {
            return;
        }
        if (arg0 == 1) {
            this.field2323 = arg1.method720((byte) 124);
        } else if (arg0 == 2) {
            int var4 = arg1.method716(-1308);
            this.field2335 = new int[var4];
            this.field2324 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2335[var5] = arg1.method739(53);
                int var6 = arg1.method716(-1308);
                if (var6 == 0) {
                    this.field2324[var5] = -1;
                } else {
                    this.field2324[var5] = var6;
                }
            }
            return;
        } else if (arg0 == 3) {
            int var7 = arg1.method716(-1308);
            this.field2317 = new int[var7];
            this.field2332 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2332[var8] = arg1.method739(class122.method804(arg2, -94));
                int var9 = arg1.method716(-1308);
                if (var9 == 0) {
                    this.field2317[var8] = -1;
                } else {
                    this.field2317[var8] = var9;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)V")
    public static void method828(byte arg0) {
        if (arg0 > -93) {
            field2333 = null;
        }
        field2331 = null;
        field2338 = null;
        field2333 = null;
        field2340 = null;
        field2322 = null;
        field2337 = null;
        field2318 = null;
        field2326 = null;
        field2319 = null;
        field2334 = null;
    }
}
