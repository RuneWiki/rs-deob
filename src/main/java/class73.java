import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class73 {

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public int field1203 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public int field1209 = -1;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Z")
    public boolean field1205 = true;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field1198 = -1;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lp;")
    public static class280 field1202 = class18.method140((byte) -121, "Continuer");

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lp;")
    public static class280 field1207 = class18.method140((byte) -119, " <col=00ff80>");

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field1204 = 0;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BILlj;)V")
    public final void method539(byte arg0, int arg1, class25 arg2) {
        field1211++;
        while (true) {
            int var4 = arg2.method189((byte) -103);
            if (var4 == 0) {
                if (arg0 == -105) {
                    return;
                } else {
                    field1194 = 104;
                    return;
                }
            }
            this.method541(arg2, var4, arg1, -13);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > arg1) {
            class162.method1151(arg4, arg3, 110, arg1, class91.field1484[arg0]);
        } else {
            class162.method1151(arg1, arg3, arg2 + 3240, arg4, class91.field1484[arg0]);
        }
        field1195++;
        if (arg2 != -3123) {
            field1206 = false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Llj;III)V")
    private final void method541(class25 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field1203 = class113.method793(true, arg0.method230(arg3 + 15059));
        } else if (arg1 == 2) {
            this.field1209 = arg0.method189((byte) -103);
        } else if (arg1 == 3) {
            this.field1209 = arg0.method193((byte) 77);
            if (this.field1209 == 65535) {
                this.field1209 = -1;
            }
        } else if (arg1 == 5) {
            this.field1205 = false;
        } else if (arg1 == 7) {
            this.field1198 = class113.method793(true, arg0.method230(arg3 ^ 0xFFFFC535));
        } else if (arg1 == 8) {
            class126.field2213 = arg2;
        } else if (arg1 == 9) {
            arg0.method193((byte) 77);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg0.method189((byte) -103);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg0.method230(arg3 + 15059);
                } else if (arg1 == 14) {
                    arg0.method189((byte) -103);
                }
            }
        }
        field1193++;
        if (arg3 != -13) {
            this.method541((class25) null, -60, 67, 79);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    private static final void method542(int arg0) {
        if (arg0 >= -70) {
            method542(12);
        }
        if (class162.field2858 == 30) {
            class90.method641((byte) 66, 25);
        }
        field1199++;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)Llk;")
    public static final class82 method543(int arg0) {
        field1201++;
        if (arg0 != 2) {
            field1206 = true;
        }
        class5 var1 = new class5(class93.field1512, class221.field3828, class243.field4263[0], class124.field2172[0], class97.field1562[0], class57.field915[0], class182.field3178[0], class16.field309);
        class126.method868(arg0 - 15436);
        return var1;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method544(int arg0) {
        field1207 = null;
        field1202 = null;
        if (arg0 != 6) {
            field1206 = true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILk;)V")
    public static final void method545(int arg0, int arg1, class178 arg2) {
        field1210++;
        Object[] var3 = arg2.field3107;
        int var4 = (Integer) var3[0];
        class182 var5 = class251.method1693(0, var4);
        if (var5 == null) {
            return;
        }
        class267.field4690 = 0;
        int var6 = 0;
        if (arg1 != -5310) {
            field1204 = 76;
        }
        int[] var7 = var5.field3185;
        int var8 = -1;
        int var9 = 0;
        int[] var10 = var5.field3193;
        byte var11 = -1;
        try {
            class18.field326 = new class280[var5.field3191];
            int var12 = 0;
            class208.field3594 = new int[var5.field3197];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field3098;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field3097;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field3106 == null ? -1 : arg2.field3106.field1964;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field3090;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field3106 == null ? -1 : arg2.field3106.field1955;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field3095 == null ? -1 : arg2.field3095.field1964;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field3095 == null ? -1 : arg2.field3095.field1955;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field3109;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field3103;
                    }
                    class208.field3594[var12++] = var16;
                } else if (var3[var14] instanceof class280) {
                    class280 var15 = (class280) var3[var14];
                    if (var15.method1888(class185.field3258, 25648)) {
                        var15 = arg2.field3110;
                    }
                    class18.field326[var13++] = var15;
                }
            }
            int var17 = 0;
            label3866: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var503 = var7[var8];
                if (var503 < 100) {
                    if (var503 == 0) {
                        class154.field2677[var6++] = var10[var8];
                        continue;
                    }
                    if (var503 == 1) {
                        int var18 = var10[var8];
                        class154.field2677[var6++] = class17.field314[var18];
                        continue;
                    }
                    if (var503 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class58.method414(var19, 7, class154.field2677[var6]);
                        continue;
                    }
                    if (var503 == 3) {
                        class159.field2770[var9++] = var5.field3186[var8];
                        continue;
                    }
                    if (var503 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var503 == 7) {
                        var6 -= 2;
                        if (class154.field2677[var6 + 1] != class154.field2677[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 8) {
                        var6 -= 2;
                        if (class154.field2677[var6 + 1] == class154.field2677[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 9) {
                        var6 -= 2;
                        if (class154.field2677[var6 + 1] > class154.field2677[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 10) {
                        var6 -= 2;
                        if (class154.field2677[var6] > class154.field2677[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 21) {
                        if (class267.field4690 == 0) {
                            return;
                        }
                        class165 var20 = class44.field730[--class267.field4690];
                        var8 = var20.field2891;
                        class18.field326 = var20.field2892;
                        class208.field3594 = var20.field2887;
                        var5 = var20.field2893;
                        var10 = var5.field3193;
                        var7 = var5.field3185;
                        continue;
                    }
                    if (var503 == 25) {
                        int var21 = var10[var8];
                        class154.field2677[var6++] = class45.method341(var21, -14715);
                        continue;
                    }
                    if (var503 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class225.method1516((byte) -27, class154.field2677[var6], var22);
                        continue;
                    }
                    if (var503 == 31) {
                        var6 -= 2;
                        if (class154.field2677[var6 + 1] >= class154.field2677[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 32) {
                        var6 -= 2;
                        if (class154.field2677[var6] >= class154.field2677[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var503 == 33) {
                        class154.field2677[var6++] = class208.field3594[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var503 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class208.field3594[var10001] = class154.field2677[var6];
                        continue;
                    }
                    if (var503 == 35) {
                        class159.field2770[var9++] = class18.field326[var10[var8]];
                        continue;
                    }
                    if (var503 == 36) {
                        var10001 = var10[var8];
                        var9--;
                        class18.field326[var10001] = class159.field2770[var9];
                        continue;
                    }
                    if (var503 == 37) {
                        int var23 = var10[var8];
                        var9 -= var23;
                        class280 var24 = class97.method687(6827, var23, class159.field2770, var9);
                        class159.field2770[var9++] = var24;
                        continue;
                    }
                    if (var503 == 38) {
                        var6--;
                        continue;
                    }
                    if (var503 == 39) {
                        var9--;
                        continue;
                    }
                    if (var503 == 40) {
                        int var25 = var10[var8];
                        class182 var26 = class251.method1693(0, var25);
                        int[] var27 = new int[var26.field3197];
                        class280[] var28 = new class280[var26.field3191];
                        for (int var29 = 0; var29 < var26.field3182; var29++) {
                            var27[var29] = class154.field2677[var6 + var29 - var26.field3182];
                        }
                        for (int var30 = 0; var30 < var26.field3180; var30++) {
                            var28[var30] = class159.field2770[var9 + var30 - var26.field3180];
                        }
                        var9 -= var26.field3180;
                        var6 -= var26.field3182;
                        class165 var31 = new class165();
                        var31.field2887 = class208.field3594;
                        var31.field2891 = var8;
                        var31.field2893 = var5;
                        var31.field2892 = class18.field326;
                        if (class44.field730.length <= class267.field4690) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class44.field730[class267.field4690++] = var31;
                        var7 = var26.field3185;
                        class18.field326 = var28;
                        class208.field3594 = var27;
                        var10 = var26.field3193;
                        continue;
                    }
                    if (var503 == 42) {
                        class154.field2677[var6++] = class262.field4621[var10[var8]];
                        continue;
                    }
                    if (var503 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class262.field4621[var32] = class154.field2677[var6];
                        class191.method1322(var32, false);
                        continue;
                    }
                    if (var503 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class154.field2677[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class243.field4271[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3866;
                                }
                                class183.field3223[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class154.field2677[var6];
                        if (var39 >= 0 && var39 < class243.field4271[var38]) {
                            class154.field2677[var6++] = class183.field3223[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class154.field2677[var6];
                        if (var41 >= 0 && var41 < class243.field4271[var40]) {
                            class183.field3223[var40][var41] = class154.field2677[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var503 == 47) {
                        class280 var42 = class17.field315[var10[var8]];
                        if (var42 == null) {
                            var42 = class185.field3254;
                        }
                        class159.field2770[var9++] = var42;
                        continue;
                    }
                    if (var503 == 48) {
                        int var43 = var10[var8];
                        var9--;
                        class17.field315[var43] = class159.field2770[var9];
                        class102.method719((byte) -84, var43);
                        continue;
                    }
                    if (var503 == 51) {
                        class19 var44 = var5.field3179[var10[var8]];
                        var6--;
                        class190 var45 = (class190) var44.method150((long) class154.field2677[var6], -72);
                        if (var45 != null) {
                            var8 += var45.field3329;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                int var10000;
                if (var503 < 300) {
                    if (var503 == 100) {
                        var6 -= 3;
                        int var47 = class154.field2677[var6];
                        int var48 = class154.field2677[var6 + 1];
                        int var49 = class154.field2677[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class113 var50 = class233.method1569(65535, var47);
                        if (var50.field1865 == null) {
                            var50.field1865 = new class113[var49 + 1];
                        }
                        if (var50.field1865.length <= var49) {
                            class113[] var51 = new class113[var49 + 1];
                            for (int var52 = 0; var52 < var50.field1865.length; var52++) {
                                var51[var52] = var50.field1865[var52];
                            }
                            var50.field1865 = var51;
                        }
                        if (var49 > 0 && var50.field1865[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class113 var53 = new class113();
                        var53.field1998 = var53.field1964 = var50.field1964;
                        var53.field2008 = true;
                        var53.field1955 = var49;
                        var53.field1879 = var48;
                        var50.field1865[var49] = var53;
                        if (var46) {
                            class276.field4784 = var53;
                        } else {
                            class101.field1646 = var53;
                        }
                        class242.method1642((byte) 65, var50);
                        continue;
                    }
                    if (var503 == 101) {
                        class113 var54 = var46 ? class276.field4784 : class101.field1646;
                        if (var54.field1955 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class113 var55 = class233.method1569(65535, var54.field1964);
                        var55.field1865[var54.field1955] = null;
                        class242.method1642((byte) 93, var55);
                        continue;
                    }
                    if (var503 == 102) {
                        var10000 = arg1 + 70845;
                        var6--;
                        class113 var56 = class233.method1569(var10000, class154.field2677[var6]);
                        var56.field1865 = null;
                        class242.method1642((byte) 33, var56);
                        continue;
                    }
                    if (var503 == 200) {
                        var6 -= 2;
                        int var57 = class154.field2677[var6];
                        int var58 = class154.field2677[var6 + 1];
                        class113 var59 = class224.method1509(var57, var58, (byte) -128);
                        if (var59 != null && var58 != -1) {
                            class154.field2677[var6++] = 1;
                            if (var46) {
                                class276.field4784 = var59;
                            } else {
                                class101.field1646 = var59;
                            }
                            continue;
                        }
                        class154.field2677[var6++] = 0;
                        continue;
                    }
                    if (var503 == 201) {
                        var6--;
                        int var60 = class154.field2677[var6];
                        class113 var61 = class233.method1569(65535, var60);
                        if (var61 == null) {
                            class154.field2677[var6++] = 0;
                        } else {
                            class154.field2677[var6++] = 1;
                            if (var46) {
                                class276.field4784 = var61;
                            } else {
                                class101.field1646 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var503 < 500) {
                    if (var503 == 403) {
                        var6 -= 2;
                        int var492 = class154.field2677[var6];
                        if (var492 >= 7) {
                            var492 -= 7;
                        }
                        int var493 = class154.field2677[var6 + 1];
                        class262.field4631.field2481.method1207((byte) 115, var492, var493);
                        continue;
                    }
                    if (var503 == 404) {
                        var6 -= 2;
                        int var494 = class154.field2677[var6];
                        int var495 = class154.field2677[var6 + 1];
                        class262.field4631.field2481.method1212(var495, 98, var494);
                        continue;
                    }
                    if (var503 == 410) {
                        var6--;
                        boolean var496 = class154.field2677[var6] != 0;
                        class262.field4631.field2481.method1210(var496, 1);
                        continue;
                    }
                } else if (!(var503 < 1000 || var503 >= 1100) || !(var503 < 2000 || var503 >= 2100)) {
                    class113 var62;
                    if (var503 < 2000) {
                        var62 = var46 ? class276.field4784 : class101.field1646;
                    } else {
                        var503 -= 1000;
                        var10000 = arg1 ^ 0xFFFF14BD;
                        var6--;
                        var62 = class233.method1569(var10000, class154.field2677[var6]);
                    }
                    if (var503 == 1000) {
                        var6 -= 4;
                        var62.field2022 = class154.field2677[var6];
                        var62.field1881 = class154.field2677[var6 + 1];
                        int var63 = class154.field2677[var6 + 2];
                        int var64 = class154.field2677[var6 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        var62.field2000 = (byte) var63;
                        var62.field1937 = (byte) var64;
                        class242.method1642((byte) 122, var62);
                        class173.method1193(arg1 ^ 0xFFFFEB43, var62);
                        if (var62.field1955 == -1) {
                            class97.method683(11, var62.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1001) {
                        var6 -= 4;
                        var62.field2005 = class154.field2677[var6];
                        var62.field1957 = class154.field2677[var6 + 1];
                        var62.field1949 = 0;
                        var62.field1917 = 0;
                        int var65 = class154.field2677[var6 + 3];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        int var66 = class154.field2677[var6 + 2];
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field2021 = (byte) var66;
                        var62.field1895 = (byte) var65;
                        class242.method1642((byte) 25, var62);
                        class173.method1193(1, var62);
                        if (var62.field1879 == 0) {
                            class231.method1559(false, var62, true);
                        }
                        continue;
                    }
                    if (var503 == 1003) {
                        var6--;
                        boolean var67 = class154.field2677[var6] == 1;
                        if (var62.field1924 != var67) {
                            var62.field1924 = var67;
                            class242.method1642((byte) 41, var62);
                        }
                        if (var62.field1955 == -1) {
                            class113.method790(var62.field1964, -121);
                        }
                        continue;
                    }
                    if (var503 == 1004) {
                        var6 -= 2;
                        var62.field1944 = class154.field2677[var6];
                        var62.field1903 = class154.field2677[var6 + 1];
                        class242.method1642((byte) 60, var62);
                        class173.method1193(1, var62);
                        if (var62.field1879 == 0) {
                            class231.method1559(false, var62, true);
                        }
                        continue;
                    }
                    if (var503 == 1005) {
                        var6--;
                        var62.field1942 = class154.field2677[var6] == 1;
                        continue;
                    }
                } else if (!(var503 < 1100 || var503 >= 1200) || !(var503 < 2100 || var503 >= 2200)) {
                    class113 var489;
                    if (var503 >= 2000) {
                        var10000 = arg1 ^ 0xFFFF14BD;
                        var6--;
                        var489 = class233.method1569(var10000, class154.field2677[var6]);
                        var503 -= 1000;
                    } else {
                        var489 = var46 ? class276.field4784 : class101.field1646;
                    }
                    if (var503 == 1100) {
                        var6 -= 2;
                        var489.field1877 = class154.field2677[var6];
                        if (var489.field1890 - var489.field1869 < var489.field1877) {
                            var489.field1877 = var489.field1890 - var489.field1869;
                        }
                        if (var489.field1877 < 0) {
                            var489.field1877 = 0;
                        }
                        var489.field2025 = class154.field2677[var6 + 1];
                        if ((var489.field1875 - var489.field1995) < var489.field2025) {
                            var489.field2025 = var489.field1875 - var489.field1995;
                        }
                        if (var489.field2025 < 0) {
                            var489.field2025 = 0;
                        }
                        class242.method1642((byte) 70, var489);
                        if (var489.field1955 == -1) {
                            class134.method928(arg1 + 5322, var489.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1101) {
                        var6--;
                        var489.field1921 = class154.field2677[var6];
                        class242.method1642((byte) 64, var489);
                        if (var489.field1955 == -1) {
                            class13.method114(var489.field1964, (byte) -99);
                        }
                        continue;
                    }
                    if (var503 == 1102) {
                        var6--;
                        var489.field1986 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 36, var489);
                        continue;
                    }
                    if (var503 == 1103) {
                        var6--;
                        var489.field1978 = class154.field2677[var6];
                        class242.method1642((byte) 118, var489);
                        continue;
                    }
                    if (var503 == 1104) {
                        var6--;
                        var489.field1925 = class154.field2677[var6];
                        class242.method1642((byte) 89, var489);
                        continue;
                    }
                    if (var503 == 1105) {
                        var6--;
                        var489.field1996 = class154.field2677[var6];
                        class242.method1642((byte) 37, var489);
                        continue;
                    }
                    if (var503 == 1106) {
                        var6--;
                        var489.field2006 = class154.field2677[var6];
                        class242.method1642((byte) 64, var489);
                        continue;
                    }
                    if (var503 == 1107) {
                        var6--;
                        var489.field1902 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 45, var489);
                        continue;
                    }
                    if (var503 == 1108) {
                        var489.field1923 = 1;
                        var6--;
                        var489.field1970 = class154.field2677[var6];
                        class242.method1642((byte) 45, var489);
                        if (var489.field1955 == -1) {
                            class27.method241(-89, var489.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1109) {
                        var6 -= 6;
                        var489.field1997 = class154.field2677[var6];
                        var489.field2015 = class154.field2677[var6 + 1];
                        var489.field1885 = class154.field2677[var6 + 2];
                        var489.field1918 = class154.field2677[var6 + 3];
                        var489.field1870 = class154.field2677[var6 + 4];
                        var489.field1947 = class154.field2677[var6 + 5];
                        class242.method1642((byte) 58, var489);
                        if (var489.field1955 == -1) {
                            class142.method980(2732, var489.field1964);
                            class83.method604(-14006, var489.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1110) {
                        var6--;
                        int var490 = class154.field2677[var6];
                        if (var489.field2007 != var490) {
                            var489.field2007 = var490;
                            var489.field1884 = 0;
                            var489.field1912 = 0;
                            class242.method1642((byte) 22, var489);
                        }
                        if (var489.field1955 == -1) {
                            class120.method856((byte) 125, var489.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1111) {
                        var6--;
                        var489.field1984 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 31, var489);
                        continue;
                    }
                    if (var503 == 1112) {
                        var9--;
                        class280 var491 = class159.field2770[var9];
                        if (!var491.method1888(var489.field2017, 25648)) {
                            var489.field2017 = var491;
                            class242.method1642((byte) 108, var489);
                        }
                        if (var489.field1955 == -1) {
                            class278.method1847(var489.field1964, (byte) -111);
                        }
                        continue;
                    }
                    if (var503 == 1113) {
                        var6--;
                        var489.field1907 = class154.field2677[var6];
                        class242.method1642((byte) 54, var489);
                        continue;
                    }
                    if (var503 == 1114) {
                        var6 -= 3;
                        var489.field1872 = class154.field2677[var6];
                        var489.field1868 = class154.field2677[var6 + 1];
                        var489.field1883 = class154.field2677[var6 + 2];
                        class242.method1642((byte) 91, var489);
                        continue;
                    }
                    if (var503 == 1115) {
                        var6--;
                        var489.field1958 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 113, var489);
                        continue;
                    }
                    if (var503 == 1116) {
                        var6--;
                        var489.field1981 = class154.field2677[var6];
                        class242.method1642((byte) 102, var489);
                        continue;
                    }
                    if (var503 == 1117) {
                        var6--;
                        var489.field1966 = class154.field2677[var6];
                        class242.method1642((byte) 66, var489);
                        continue;
                    }
                    if (var503 == 1118) {
                        var6--;
                        var489.field2030 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 70, var489);
                        continue;
                    }
                    if (var503 == 1119) {
                        var6--;
                        var489.field1874 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 115, var489);
                        continue;
                    }
                    if (var503 == 1120) {
                        var6 -= 2;
                        var489.field1890 = class154.field2677[var6];
                        var489.field1875 = class154.field2677[var6 + 1];
                        class242.method1642((byte) 36, var489);
                        if (var489.field1879 == 0) {
                            class231.method1559(false, var489, true);
                        }
                        continue;
                    }
                    if (var503 == 1121) {
                        class242.method1642((byte) 118, var489);
                        var6 -= 2;
                        continue;
                    }
                    if (var503 == 1122) {
                        var6--;
                        var489.field1988 = class154.field2677[var6] == 1;
                        class242.method1642((byte) 77, var489);
                        continue;
                    }
                    if (var503 == 1123) {
                        var6--;
                        var489.field1947 = class154.field2677[var6];
                        class242.method1642((byte) 103, var489);
                        if (var489.field1955 == -1) {
                            class142.method980(2732, var489.field1964);
                        }
                        continue;
                    }
                } else if (!(var503 < 1200 || var503 >= 1300) || !(var503 < 2200 || var503 >= 2300)) {
                    class113 var485;
                    if (var503 < 2000) {
                        var485 = var46 ? class276.field4784 : class101.field1646;
                    } else {
                        var10000 = arg1 + 70845;
                        var6--;
                        var485 = class233.method1569(var10000, class154.field2677[var6]);
                        var503 -= 1000;
                    }
                    class242.method1642((byte) 49, var485);
                    if (var503 == 1200 || var503 == 1205) {
                        var6 -= 2;
                        int var486 = class154.field2677[var6];
                        int var487 = class154.field2677[var6 + 1];
                        if (var485.field1955 == -1) {
                            class160.method1142(var485.field1964, 2);
                            class142.method980(2732, var485.field1964);
                            class83.method604(-14006, var485.field1964);
                        }
                        if (var486 == -1) {
                            var485.field1923 = 1;
                            var485.field1983 = -1;
                            var485.field1970 = -1;
                        } else {
                            var485.field1983 = var486;
                            var485.field1993 = var487;
                            class220 var488 = class23.method177((byte) -89, var486);
                            var485.field1885 = var488.field3816;
                            var485.field1870 = var488.field3785;
                            var485.field1918 = var488.field3762;
                            var485.field1997 = var488.field3810;
                            if (var503 == 1205) {
                                var485.field1916 = false;
                            } else {
                                var485.field1916 = true;
                            }
                            var485.field2015 = var488.field3777;
                            var485.field1947 = var488.field3807;
                            if (var485.field1949 > 0) {
                                var485.field1947 = var485.field1947 * 32 / var485.field1949;
                            } else if (var485.field2005 > 0) {
                                var485.field1947 = var485.field1947 * 32 / var485.field2005;
                            }
                        }
                        continue;
                    }
                    if (var503 == 1201) {
                        var485.field1923 = 2;
                        var6--;
                        var485.field1970 = class154.field2677[var6];
                        if (var485.field1955 == -1) {
                            class27.method241(-37, var485.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1202) {
                        var485.field1923 = 3;
                        var485.field1970 = class262.field4631.field2481.method1217((byte) -126);
                        if (var485.field1955 == -1) {
                            class27.method241(-118, var485.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1203) {
                        var485.field1923 = 6;
                        var6--;
                        var485.field1970 = class154.field2677[var6];
                        if (var485.field1955 == -1) {
                            class27.method241(arg1 + 5235, var485.field1964);
                        }
                        continue;
                    }
                    if (var503 == 1204) {
                        var485.field1923 = 5;
                        var6--;
                        var485.field1970 = class154.field2677[var6];
                        if (var485.field1955 == -1) {
                            class27.method241(-83, var485.field1964);
                        }
                        continue;
                    }
                } else if (var503 >= 1300 && var503 < 1400 || var503 >= 2300 && var503 < 2400) {
                    class113 var479;
                    if (var503 >= 2000) {
                        var6--;
                        var479 = class233.method1569(65535, class154.field2677[var6]);
                        var503 -= 1000;
                    } else {
                        var479 = var46 ? class276.field4784 : class101.field1646;
                    }
                    if (var503 == 1300) {
                        var6--;
                        int var480 = class154.field2677[var6] - 1;
                        if (var480 >= 0 && var480 <= 9) {
                            var9--;
                            var479.method795(var480, class159.field2770[var9], arg1 + 5310);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var503 == 1301) {
                        var6 -= 2;
                        int var481 = class154.field2677[var6];
                        int var482 = class154.field2677[var6 + 1];
                        var479.field1894 = class224.method1509(var481, var482, (byte) -126);
                        continue;
                    }
                    if (var503 == 1302) {
                        var6--;
                        var479.field1973 = class154.field2677[var6] == 1;
                        continue;
                    }
                    if (var503 == 1303) {
                        var6--;
                        var479.field1913 = class154.field2677[var6];
                        continue;
                    }
                    if (var503 == 1304) {
                        var6--;
                        var479.field1934 = class154.field2677[var6];
                        continue;
                    }
                    if (var503 == 1305) {
                        var9--;
                        var479.field1904 = class159.field2770[var9];
                        continue;
                    }
                    if (var503 == 1306) {
                        var9--;
                        var479.field1990 = class159.field2770[var9];
                        continue;
                    }
                    if (var503 == 1307) {
                        var479.field1945 = null;
                        continue;
                    }
                    if (var503 == 1309) {
                        var6--;
                        int var483 = class154.field2677[var6];
                        var6--;
                        int var484 = class154.field2677[var6];
                        if (var484 >= 1 && var484 <= 10) {
                            var479.method797(var483, (byte) 59, var484 - 1);
                        }
                        continue;
                    }
                } else {
                    if (var503 >= 1400 && var503 < 1500 || var503 >= 2400 && var503 < 2500) {
                        class113 var472;
                        if (var503 < 2000) {
                            var472 = var46 ? class276.field4784 : class101.field1646;
                        } else {
                            var503 -= 1000;
                            var6--;
                            var472 = class233.method1569(65535, class154.field2677[var6]);
                        }
                        var9--;
                        class280 var473 = class159.field2770[var9];
                        int[] var474 = null;
                        if (var473.method1889(-1) > 0 && var473.method1899(var473.method1889(-1) - 1, (byte) -28) == 89) {
                            var6--;
                            int var475 = class154.field2677[var6];
                            if (var475 > 0) {
                                var474 = new int[var475];
                                while ((var475--) > 0) {
                                    var6--;
                                    var474[var475] = class154.field2677[var6];
                                }
                            }
                            var473 = var473.method1864(var473.method1889(arg1 + 5309) - 1, 0, (byte) -67);
                        }
                        Object[] var476 = new Object[var473.method1889(-1) + 1];
                        for (int var477 = var476.length - 1; var477 >= 1; var477--) {
                            if (var473.method1899(var477 - 1, (byte) -28) == 115) {
                                var9--;
                                var476[var477] = class159.field2770[var9];
                            } else {
                                var6--;
                                var476[var477] = Integer.valueOf(class154.field2677[var6]);
                            }
                        }
                        var6--;
                        int var478 = class154.field2677[var6];
                        if (var478 == -1) {
                            var476 = null;
                        } else {
                            var476[0] = Integer.valueOf(var478);
                        }
                        var472.field1971 = true;
                        if (var503 == 1400) {
                            var472.field2002 = var476;
                        } else if (var503 == 1401) {
                            var472.field1946 = var476;
                        } else if (var503 == 1402) {
                            var472.field1922 = var476;
                        } else if (var503 == 1403) {
                            var472.field1938 = var476;
                        } else if (var503 == 1404) {
                            var472.field1954 = var476;
                        } else if (var503 == 1405) {
                            var472.field1985 = var476;
                        } else if (var503 == 1406) {
                            var472.field2009 = var476;
                        } else if (var503 == 1407) {
                            var472.field1893 = var476;
                            var472.field2027 = var474;
                        } else if (var503 == 1408) {
                            var472.field1919 = var476;
                        } else if (var503 == 1409) {
                            var472.field1861 = var476;
                        } else if (var503 == 1410) {
                            var472.field2013 = var476;
                        } else if (var503 == 1411) {
                            var472.field1965 = var476;
                        } else if (var503 == 1412) {
                            var472.field1948 = var476;
                        } else if (var503 == 1414) {
                            var472.field2032 = var474;
                            var472.field1961 = var476;
                        } else if (var503 == 1415) {
                            var472.field1980 = var476;
                            var472.field1867 = var474;
                        } else if (var503 == 1416) {
                            var472.field1932 = var476;
                        } else if (var503 == 1417) {
                            var472.field2014 = var476;
                        } else if (var503 == 1418) {
                            var472.field1936 = var476;
                        } else if (var503 == 1419) {
                            var472.field1927 = var476;
                        } else if (var503 == 1420) {
                            var472.field1928 = var476;
                        } else if (var503 == 1421) {
                            var472.field1952 = var476;
                        } else if (var503 == 1422) {
                            var472.field1882 = var476;
                        } else if (var503 == 1423) {
                            var472.field1953 = var476;
                        } else if (var503 == 1424) {
                            var472.field1933 = var476;
                        } else if (var503 == 1425) {
                            var472.field1905 = var476;
                        } else if (var503 == 1426) {
                            var472.field1901 = var476;
                        } else if (var503 == 1427) {
                            var472.field2019 = var476;
                        } else if (var503 == 1428) {
                            var472.field1967 = var476;
                            var472.field1974 = var474;
                        } else if (var503 == 1429) {
                            var472.field1926 = var476;
                            var472.field1941 = var474;
                        }
                        continue;
                    }
                    if (var503 < 1600) {
                        class113 var471 = var46 ? class276.field4784 : class101.field1646;
                        if (var503 == 1500) {
                            class154.field2677[var6++] = var471.field1900;
                            continue;
                        }
                        if (var503 == 1501) {
                            class154.field2677[var6++] = var471.field1897;
                            continue;
                        }
                        if (var503 == 1502) {
                            class154.field2677[var6++] = var471.field1869;
                            continue;
                        }
                        if (var503 == 1503) {
                            class154.field2677[var6++] = var471.field1995;
                            continue;
                        }
                        if (var503 == 1504) {
                            class154.field2677[var6++] = var471.field1924 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 1505) {
                            class154.field2677[var6++] = var471.field1998;
                            continue;
                        }
                    } else if (var503 < 1700) {
                        class113 var68 = var46 ? class276.field4784 : class101.field1646;
                        if (var503 == 1600) {
                            class154.field2677[var6++] = var68.field1877;
                            continue;
                        }
                        if (var503 == 1601) {
                            class154.field2677[var6++] = var68.field2025;
                            continue;
                        }
                        if (var503 == 1602) {
                            class159.field2770[var9++] = var68.field2017;
                            continue;
                        }
                        if (var503 == 1603) {
                            class154.field2677[var6++] = var68.field1890;
                            continue;
                        }
                        if (var503 == 1604) {
                            class154.field2677[var6++] = var68.field1875;
                            continue;
                        }
                        if (var503 == 1605) {
                            class154.field2677[var6++] = var68.field1947;
                            continue;
                        }
                        if (var503 == 1606) {
                            class154.field2677[var6++] = var68.field1885;
                            continue;
                        }
                        if (var503 == 1607) {
                            class154.field2677[var6++] = var68.field1870;
                            continue;
                        }
                        if (var503 == 1608) {
                            class154.field2677[var6++] = var68.field1918;
                            continue;
                        }
                        if (var503 == 1609) {
                            class154.field2677[var6++] = var68.field1978;
                            continue;
                        }
                        if (var503 == 1610) {
                            class154.field2677[var6++] = var68.field1997;
                            continue;
                        }
                        if (var503 == 1611) {
                            class154.field2677[var6++] = var68.field2015;
                            continue;
                        }
                        if (var503 == 1612) {
                            class154.field2677[var6++] = var68.field1996;
                            continue;
                        }
                    } else if (var503 < 1800) {
                        class113 var69 = var46 ? class276.field4784 : class101.field1646;
                        if (var503 == 1700) {
                            class154.field2677[var6++] = var69.field1983;
                            continue;
                        }
                        if (var503 == 1701) {
                            if (var69.field1983 == -1) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = var69.field1993;
                            }
                            continue;
                        }
                        if (var503 == 1702) {
                            class154.field2677[var6++] = var69.field1955;
                            continue;
                        }
                    } else if (var503 < 1900) {
                        class113 var70 = var46 ? class276.field4784 : class101.field1646;
                        if (var503 == 1800) {
                            class154.field2677[var6++] = class140.method972((byte) 100, client.method1099(var70));
                            continue;
                        }
                        if (var503 == 1801) {
                            var6--;
                            int var71 = class154.field2677[var6];
                            int var504 = var71 - 1;
                            if (var70.field1945 != null && var70.field1945.length > var504 && var70.field1945[var504] != null) {
                                class159.field2770[var9++] = var70.field1945[var504];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 1802) {
                            if (var70.field1904 == null) {
                                class159.field2770[var9++] = class8.field182;
                            } else {
                                class159.field2770[var9++] = var70.field1904;
                            }
                            continue;
                        }
                    } else if (var503 < 2600) {
                        var6--;
                        class113 var72 = class233.method1569(65535, class154.field2677[var6]);
                        if (var503 == 2500) {
                            class154.field2677[var6++] = var72.field1900;
                            continue;
                        }
                        if (var503 == 2501) {
                            class154.field2677[var6++] = var72.field1897;
                            continue;
                        }
                        if (var503 == 2502) {
                            class154.field2677[var6++] = var72.field1869;
                            continue;
                        }
                        if (var503 == 2503) {
                            class154.field2677[var6++] = var72.field1995;
                            continue;
                        }
                        if (var503 == 2504) {
                            class154.field2677[var6++] = var72.field1924 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 2505) {
                            class154.field2677[var6++] = var72.field1998;
                            continue;
                        }
                    } else if (var503 < 2700) {
                        var6--;
                        class113 var73 = class233.method1569(65535, class154.field2677[var6]);
                        if (var503 == 2600) {
                            class154.field2677[var6++] = var73.field1877;
                            continue;
                        }
                        if (var503 == 2601) {
                            class154.field2677[var6++] = var73.field2025;
                            continue;
                        }
                        if (var503 == 2602) {
                            class159.field2770[var9++] = var73.field2017;
                            continue;
                        }
                        if (var503 == 2603) {
                            class154.field2677[var6++] = var73.field1890;
                            continue;
                        }
                        if (var503 == 2604) {
                            class154.field2677[var6++] = var73.field1875;
                            continue;
                        }
                        if (var503 == 2605) {
                            class154.field2677[var6++] = var73.field1947;
                            continue;
                        }
                        if (var503 == 2606) {
                            class154.field2677[var6++] = var73.field1885;
                            continue;
                        }
                        if (var503 == 2607) {
                            class154.field2677[var6++] = var73.field1870;
                            continue;
                        }
                        if (var503 == 2608) {
                            class154.field2677[var6++] = var73.field1918;
                            continue;
                        }
                        if (var503 == 2609) {
                            class154.field2677[var6++] = var73.field1978;
                            continue;
                        }
                        if (var503 == 2610) {
                            class154.field2677[var6++] = var73.field1997;
                            continue;
                        }
                        if (var503 == 2611) {
                            class154.field2677[var6++] = var73.field2015;
                            continue;
                        }
                        if (var503 == 2612) {
                            class154.field2677[var6++] = var73.field1996;
                            continue;
                        }
                    } else if (var503 < 2800) {
                        if (var503 == 2700) {
                            var6--;
                            class113 var461 = class233.method1569(65535, class154.field2677[var6]);
                            class154.field2677[var6++] = var461.field1983;
                            continue;
                        }
                        if (var503 == 2701) {
                            var10000 = arg1 ^ 0xFFFF14BD;
                            var6--;
                            class113 var462 = class233.method1569(var10000, class154.field2677[var6]);
                            if (var462.field1983 == -1) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = var462.field1993;
                            }
                            continue;
                        }
                        if (var503 == 2702) {
                            var6--;
                            int var463 = class154.field2677[var6];
                            class144 var464 = (class144) class261.field4614.method150((long) var463, 102);
                            if (var464 == null) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = 1;
                            }
                            continue;
                        }
                        if (var503 == 2703) {
                            var10000 = arg1 ^ 0xFFFF14BD;
                            var6--;
                            class113 var465 = class233.method1569(var10000, class154.field2677[var6]);
                            if (var465.field1865 == null) {
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            int var466 = var465.field1865.length;
                            for (int var467 = 0; var467 < var465.field1865.length; var467++) {
                                if (var465.field1865[var467] == null) {
                                    var466 = var467;
                                    break;
                                }
                            }
                            class154.field2677[var6++] = var466;
                            continue;
                        }
                        if (var503 == 2704 || var503 == 2705) {
                            var6 -= 2;
                            int var468 = class154.field2677[var6];
                            int var469 = class154.field2677[var6 + 1];
                            class144 var470 = (class144) class261.field4614.method150((long) var468, 97);
                            if (var470 != null && var470.field2517 == var469) {
                                class154.field2677[var6++] = 1;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                    } else if (var503 < 2900) {
                        var6--;
                        class113 var74 = class233.method1569(65535, class154.field2677[var6]);
                        if (var503 == 2800) {
                            class154.field2677[var6++] = class140.method972((byte) 100, client.method1099(var74));
                            continue;
                        }
                        if (var503 == 2801) {
                            var6--;
                            int var75 = class154.field2677[var6];
                            int var505 = var75 - 1;
                            if (var74.field1945 != null && var505 < var74.field1945.length && var74.field1945[var505] != null) {
                                class159.field2770[var9++] = var74.field1945[var505];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 2802) {
                            if (var74.field1904 == null) {
                                class159.field2770[var9++] = class8.field182;
                            } else {
                                class159.field2770[var9++] = var74.field1904;
                            }
                            continue;
                        }
                    } else if (var503 < 3200) {
                        if (var503 == 3100) {
                            var9--;
                            class280 var76 = class159.field2770[var9];
                            class188.method1312(arg1 ^ 0x42952D8E, 0, class8.field182, var76);
                            continue;
                        }
                        if (var503 == 3101) {
                            var6 -= 2;
                            class100.method713(class154.field2677[var6], class262.field4631, class154.field2677[var6 + 1], arg1 + 5309);
                            continue;
                        }
                        if (var503 == 3103) {
                            class275.method1827((byte) 32);
                            continue;
                        }
                        if (var503 == 3104) {
                            class76.field1251++;
                            int var77 = 0;
                            var9--;
                            class280 var78 = class159.field2770[var9];
                            if (var78.method1867(-120)) {
                                var77 = var78.method1863(115);
                            }
                            class34.field627.method551(127, true);
                            class34.field627.method231(11510, var77);
                            continue;
                        }
                        if (var503 == 3105) {
                            class243.field4264++;
                            var9--;
                            class280 var79 = class159.field2770[var9];
                            class34.field627.method551(142, true);
                            class34.field627.method219(var79.method1896(127), 125);
                            continue;
                        }
                        if (var503 == 3106) {
                            class153.field2639++;
                            var9--;
                            class280 var80 = class159.field2770[var9];
                            class34.field627.method551(182, true);
                            class34.field627.method227(-20435, var80.method1889(-1) + 1);
                            class34.field627.method195(var80, -66);
                            continue;
                        }
                        if (var503 == 3107) {
                            var6--;
                            int var81 = class154.field2677[var6];
                            var9--;
                            class280 var82 = class159.field2770[var9];
                            class182.method1270((byte) 46, var81, var82);
                            continue;
                        }
                        if (var503 == 3108) {
                            var6 -= 3;
                            int var83 = class154.field2677[var6];
                            int var84 = class154.field2677[var6 + 1];
                            int var85 = class154.field2677[var6 + 2];
                            class113 var86 = class233.method1569(arg1 ^ 0xFFFF14BD, var85);
                            class261.method1766(var86, var84, 0, var83);
                            continue;
                        }
                        if (var503 == 3109) {
                            var6 -= 2;
                            int var87 = class154.field2677[var6];
                            int var88 = class154.field2677[var6 + 1];
                            class113 var89 = var46 ? class276.field4784 : class101.field1646;
                            class261.method1766(var89, var88, 0, var87);
                            continue;
                        }
                        if (var503 == 3110) {
                            class67.field1118++;
                            var6--;
                            int var90 = class154.field2677[var6];
                            class34.field627.method551(195, true);
                            class34.field627.method214(-3, var90);
                            continue;
                        }
                    } else if (var503 < 3300) {
                        if (var503 == 3200) {
                            var6 -= 3;
                            class2.method45(class154.field2677[var6 + 2], true, class154.field2677[var6], class154.field2677[var6 + 1]);
                            continue;
                        }
                        if (var503 == 3201) {
                            var6--;
                            class267.method1797(class154.field2677[var6], (byte) 100);
                            continue;
                        }
                        if (var503 == 3202) {
                            var6 -= 2;
                            class65.method447(class154.field2677[var6], class154.field2677[var6 + 1], -19392);
                            continue;
                        }
                    } else if (var503 < 3400) {
                        if (var503 == 3300) {
                            class154.field2677[var6++] = class117.field2104;
                            continue;
                        }
                        if (var503 == 3301) {
                            var6 -= 2;
                            int var427 = class154.field2677[var6];
                            int var428 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class89.method632(-1, var428, var427);
                            continue;
                        }
                        if (var503 == 3302) {
                            var6 -= 2;
                            int var429 = class154.field2677[var6];
                            int var430 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class55.method406(-9325, var429, var430);
                            continue;
                        }
                        if (var503 == 3303) {
                            var6 -= 2;
                            int var431 = class154.field2677[var6];
                            int var432 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class261.method1765(var431, -92, var432);
                            continue;
                        }
                        if (var503 == 3304) {
                            var6--;
                            int var433 = class154.field2677[var6];
                            class154.field2677[var6++] = class83.method596(class234.method1572(arg1, -5305), var433).field4203;
                            continue;
                        }
                        if (var503 == 3305) {
                            var6--;
                            int var434 = class154.field2677[var6];
                            class154.field2677[var6++] = class157.field2733[var434];
                            continue;
                        }
                        if (var503 == 3306) {
                            var6--;
                            int var435 = class154.field2677[var6];
                            class154.field2677[var6++] = class259.field4589[var435];
                            continue;
                        }
                        if (var503 == 3307) {
                            var6--;
                            int var436 = class154.field2677[var6];
                            class154.field2677[var6++] = class46.field758[var436];
                            continue;
                        }
                        if (var503 == 3308) {
                            int var437 = class231.field4013;
                            int var438 = (class262.field4631.field4791 >> 7) + class49.field806;
                            int var439 = (class262.field4631.field4793 >> 7) + class91.field1480;
                            class154.field2677[var6++] = (var438 << 14) + (var437 << 28) + var439;
                            continue;
                        }
                        if (var503 == 3309) {
                            var6--;
                            int var440 = class154.field2677[var6];
                            class154.field2677[var6++] = class214.method1432(var440 >> 14, 16383);
                            continue;
                        }
                        if (var503 == 3310) {
                            var6--;
                            int var441 = class154.field2677[var6];
                            class154.field2677[var6++] = var441 >> 28;
                            continue;
                        }
                        if (var503 == 3311) {
                            var6--;
                            int var442 = class154.field2677[var6];
                            class154.field2677[var6++] = class214.method1432(var442, 16383);
                            continue;
                        }
                        if (var503 == 3312) {
                            class154.field2677[var6++] = class29.field541 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3313) {
                            var6 -= 2;
                            int var443 = class154.field2677[var6] + 32768;
                            int var444 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class89.method632(-1, var444, var443);
                            continue;
                        }
                        if (var503 == 3314) {
                            var6 -= 2;
                            int var445 = class154.field2677[var6] + 32768;
                            int var446 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class55.method406(-9325, var445, var446);
                            continue;
                        }
                        if (var503 == 3315) {
                            var6 -= 2;
                            int var447 = class154.field2677[var6] + 32768;
                            int var448 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class261.method1765(var447, -76, var448);
                            continue;
                        }
                        if (var503 == 3316) {
                            if (class129.field2238 >= 2) {
                                class154.field2677[var6++] = class129.field2238;
                            } else {
                                class154.field2677[var6++] = 0;
                            }
                            continue;
                        }
                        if (var503 == 3317) {
                            class154.field2677[var6++] = class230.field3974;
                            continue;
                        }
                        if (var503 == 3318) {
                            class154.field2677[var6++] = class105.field1741;
                            continue;
                        }
                        if (var503 == 3321) {
                            class154.field2677[var6++] = class211.field3620;
                            continue;
                        }
                        if (var503 == 3322) {
                            class154.field2677[var6++] = class20.field373;
                            continue;
                        }
                        if (var503 == 3323) {
                            if (class147.field2559 >= 5 && class147.field2559 <= 9) {
                                class154.field2677[var6++] = 1;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3324) {
                            if (class147.field2559 >= 5 && class147.field2559 <= 9) {
                                class154.field2677[var6++] = class147.field2559;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3325) {
                            class154.field2677[var6++] = class215.field3711 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3326) {
                            class154.field2677[var6++] = class262.field4631.field2455;
                            continue;
                        }
                        if (var503 == 3327) {
                            class154.field2677[var6++] = class262.field4631.field2481.field3064 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3328) {
                            class154.field2677[var6++] = class280.field4950 && !class44.field739 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3329) {
                            class154.field2677[var6++] = class159.field2773 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3330) {
                            var6--;
                            int var449 = class154.field2677[var6];
                            class154.field2677[var6++] = class85.method611(true, var449);
                            continue;
                        }
                        if (var503 == 3331) {
                            var6 -= 2;
                            int var450 = class154.field2677[var6];
                            int var451 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class22.method172(var451, var450, (byte) -95, false);
                            continue;
                        }
                        if (var503 == 3332) {
                            var6 -= 2;
                            int var452 = class154.field2677[var6 + 1];
                            int var453 = class154.field2677[var6];
                            class154.field2677[var6++] = class22.method172(var452, var453, (byte) -88, true);
                            continue;
                        }
                        if (var503 == 3333) {
                            class154.field2677[var6++] = class109.field1828;
                            continue;
                        }
                        if (var503 == 3335) {
                            class154.field2677[var6++] = class269.field4725;
                            continue;
                        }
                        if (var503 == 3336) {
                            var6 -= 4;
                            int var454 = class154.field2677[var6 + 3];
                            int var455 = class154.field2677[var6 + 2];
                            int var456 = class154.field2677[var6];
                            int var457 = class154.field2677[var6 + 1];
                            int var458 = (var457 << 14) + var456;
                            int var459 = (var455 << 28) + var458;
                            int var460 = var454 + var459;
                            class154.field2677[var6++] = var460;
                            continue;
                        }
                        if (var503 == 3337) {
                            class154.field2677[var6++] = class108.field1778;
                            continue;
                        }
                    } else if (var503 < 3500) {
                        if (var503 == 3400) {
                            var6 -= 2;
                            int var410 = class154.field2677[var6];
                            int var411 = class154.field2677[var6 + 1];
                            class283 var412 = class267.method1793(arg1 ^ 0xFFFFEB42, var410);
                            class159.field2770[var9++] = var412.method1923(-2005222424, var411);
                            continue;
                        }
                        if (var503 == 3408) {
                            var6 -= 4;
                            int var413 = class154.field2677[var6];
                            int var414 = class154.field2677[var6 + 2];
                            int var415 = class154.field2677[var6 + 3];
                            int var416 = class154.field2677[var6 + 1];
                            class283 var417 = class267.method1793(0, var414);
                            if (var417.field4986 == var413 && var417.field4987 == var416) {
                                if (var416 == 115) {
                                    class159.field2770[var9++] = var417.method1923(-2005222424, var415);
                                } else {
                                    class154.field2677[var6++] = var417.method1914(var415, class234.method1572(arg1, 5359));
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var503 == 3409) {
                            var6 -= 3;
                            int var418 = class154.field2677[var6];
                            int var419 = class154.field2677[var6 + 1];
                            int var420 = class154.field2677[var6 + 2];
                            if (var419 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class283 var421 = class267.method1793(arg1 + 5310, var419);
                            if (var421.field4987 != var418) {
                                throw new RuntimeException("C3409-1");
                            }
                            class154.field2677[var6++] = var421.method1922(var420, -180) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3410) {
                            var9--;
                            class280 var422 = class159.field2770[var9];
                            var6--;
                            int var423 = class154.field2677[var6];
                            if (var423 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class283 var424 = class267.method1793(0, var423);
                            if (var424.field4987 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class154.field2677[var6++] = var424.method1918(126, var422) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3411) {
                            var6--;
                            int var425 = class154.field2677[var6];
                            class283 var426 = class267.method1793(0, var425);
                            class154.field2677[var6++] = var426.field4969.method145(0);
                            continue;
                        }
                    } else if (var503 < 3700) {
                        if (var503 == 3600) {
                            if (class86.field1406 == 0) {
                                class154.field2677[var6++] = -2;
                            } else if (class86.field1406 == 1) {
                                class154.field2677[var6++] = -1;
                            } else {
                                class154.field2677[var6++] = class208.field3590;
                            }
                            continue;
                        }
                        if (var503 == 3601) {
                            var6--;
                            int var91 = class154.field2677[var6];
                            if (class86.field1406 == 2 && var91 < class208.field3590) {
                                class159.field2770[var9++] = class129.field2236[var91];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 3602) {
                            var6--;
                            int var92 = class154.field2677[var6];
                            if (class86.field1406 == 2 && var92 < class208.field3590) {
                                class154.field2677[var6++] = class50.field826[var92];
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3603) {
                            var6--;
                            int var93 = class154.field2677[var6];
                            if (class86.field1406 == 2 && class208.field3590 > var93) {
                                class154.field2677[var6++] = class200.field3497[var93];
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3604) {
                            var9--;
                            class280 var94 = class159.field2770[var9];
                            var6--;
                            int var95 = class154.field2677[var6];
                            class197.method1347(var94, false, var95);
                            continue;
                        }
                        if (var503 == 3605) {
                            var9--;
                            class280 var96 = class159.field2770[var9];
                            class107.method749(var96.method1896(arg1 ^ 0xFFFFEB17), arg1 - 23286);
                            continue;
                        }
                        if (var503 == 3606) {
                            var9--;
                            class280 var97 = class159.field2770[var9];
                            class184.method1277(false, var97.method1896(115));
                            continue;
                        }
                        if (var503 == 3607) {
                            var9--;
                            class280 var98 = class159.field2770[var9];
                            class1.method38(127, var98.method1896(83));
                            continue;
                        }
                        if (var503 == 3608) {
                            var9--;
                            class280 var99 = class159.field2770[var9];
                            class52.method381((byte) -108, var99.method1896(80));
                            continue;
                        }
                        if (var503 == 3609) {
                            var9--;
                            class280 var100 = class159.field2770[var9];
                            if (var100.method1897(false, class82.field1347) || var100.method1897(false, class193.field3414)) {
                                var100 = var100.method1870((byte) -122, 7);
                            }
                            class154.field2677[var6++] = class66.method457(var100, true) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3610) {
                            var6--;
                            int var101 = class154.field2677[var6];
                            if (class86.field1406 == 2 && var101 < class208.field3590) {
                                class159.field2770[var9++] = class30.field571[var101];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 3611) {
                            if (class231.field4030 == null) {
                                class159.field2770[var9++] = class8.field182;
                            } else {
                                class159.field2770[var9++] = class231.field4030.method1881((byte) 123);
                            }
                            continue;
                        }
                        if (var503 == 3612) {
                            if (class231.field4030 == null) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = class215.field3716;
                            }
                            continue;
                        }
                        if (var503 == 3613) {
                            var6--;
                            int var102 = class154.field2677[var6];
                            if (class231.field4030 != null && var102 < class215.field3716) {
                                class159.field2770[var9++] = class59.field950[var102].field846.method1881((byte) 125);
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 3614) {
                            var6--;
                            int var103 = class154.field2677[var6];
                            if (class231.field4030 != null && class215.field3716 > var103) {
                                class154.field2677[var6++] = class59.field950[var103].field838;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3615) {
                            var6--;
                            int var104 = class154.field2677[var6];
                            if (class231.field4030 != null && var104 < class215.field3716) {
                                class154.field2677[var6++] = class59.field950[var104].field847;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3616) {
                            class154.field2677[var6++] = class204.field3541;
                            continue;
                        }
                        if (var503 == 3617) {
                            var9--;
                            class280 var105 = class159.field2770[var9];
                            class189.method1315(var105, -126);
                            continue;
                        }
                        if (var503 == 3618) {
                            class154.field2677[var6++] = class112.field1838;
                            continue;
                        }
                        if (var503 == 3619) {
                            var9--;
                            class280 var106 = class159.field2770[var9];
                            class118.method846(var106.method1896(arg1 + 5378), -1026649567);
                            continue;
                        }
                        if (var503 == 3620) {
                            class60.method424(arg1 ^ 0xFFFFEB23);
                            continue;
                        }
                        if (var503 == 3621) {
                            if (class86.field1406 == 0) {
                                class154.field2677[var6++] = -1;
                            } else {
                                class154.field2677[var6++] = class273.field4753;
                            }
                            continue;
                        }
                        if (var503 == 3622) {
                            var6--;
                            int var107 = class154.field2677[var6];
                            if (class86.field1406 != 0 && var107 < class273.field4753) {
                                class159.field2770[var9++] = class152.method1071(93, class76.field1248[var107]).method1881((byte) 119);
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 3623) {
                            var9--;
                            class280 var108 = class159.field2770[var9];
                            if (var108.method1897(false, class82.field1347) || var108.method1897(false, class193.field3414)) {
                                var108 = var108.method1870((byte) -122, 7);
                            }
                            class154.field2677[var6++] = class7.method76((byte) 123, var108) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3624) {
                            var6--;
                            int var109 = class154.field2677[var6];
                            if (class59.field950 != null && var109 < class215.field3716 && class59.field950[var109].field846.method1887((byte) 32, class262.field4631.field2458)) {
                                class154.field2677[var6++] = 1;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3625) {
                            if (class169.field2956 == null) {
                                class159.field2770[var9++] = class8.field182;
                            } else {
                                class159.field2770[var9++] = class169.field2956.method1881((byte) 119);
                            }
                            continue;
                        }
                        if (var503 == 3626) {
                            var6--;
                            int var110 = class154.field2677[var6];
                            if (class231.field4030 != null && var110 < class215.field3716) {
                                class159.field2770[var9++] = class59.field950[var110].field842;
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 3627) {
                            var6--;
                            int var111 = class154.field2677[var6];
                            if (class86.field1406 == 2 && var111 >= 0 && var111 < class208.field3590) {
                                class154.field2677[var6++] = class158.field2757[var111] ? 1 : 0;
                                continue;
                            }
                            class154.field2677[var6++] = 0;
                            continue;
                        }
                        if (var503 == 3628) {
                            var9--;
                            class280 var112 = class159.field2770[var9];
                            if (var112.method1897(false, class82.field1347) || var112.method1897(false, class193.field3414)) {
                                var112 = var112.method1870((byte) -122, 7);
                            }
                            class154.field2677[var6++] = class81.method592(-1, var112);
                            continue;
                        }
                        if (var503 == 3629) {
                            class154.field2677[var6++] = class201.field3514;
                            continue;
                        }
                    } else if (var503 < 4000) {
                        if (var503 == 3903) {
                            var6--;
                            int var113 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var113].method1774((byte) -38);
                            continue;
                        }
                        if (var503 == 3904) {
                            var6--;
                            int var114 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var114].field4623;
                            continue;
                        }
                        if (var503 == 3905) {
                            var6--;
                            int var115 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var115].field4620;
                            continue;
                        }
                        if (var503 == 3906) {
                            var6--;
                            int var116 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var116].field4622;
                            continue;
                        }
                        if (var503 == 3907) {
                            var6--;
                            int var117 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var117].field4633;
                            continue;
                        }
                        if (var503 == 3908) {
                            var6--;
                            int var118 = class154.field2677[var6];
                            class154.field2677[var6++] = class244.field4296[var118].field4625;
                            continue;
                        }
                        if (var503 == 3910) {
                            var6--;
                            int var119 = class154.field2677[var6];
                            int var120 = class244.field4296[var119].method1776(6696);
                            class154.field2677[var6++] = var120 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3911) {
                            var6--;
                            int var121 = class154.field2677[var6];
                            int var122 = class244.field4296[var121].method1776(6696);
                            class154.field2677[var6++] = var122 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3912) {
                            var6--;
                            int var123 = class154.field2677[var6];
                            int var124 = class244.field4296[var123].method1776(6696);
                            class154.field2677[var6++] = var124 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 3913) {
                            var6--;
                            int var125 = class154.field2677[var6];
                            int var126 = class244.field4296[var125].method1776(arg1 ^ 0xFFFFF16A);
                            class154.field2677[var6++] = var126 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var503 < 4100) {
                        if (var503 == 4000) {
                            var6 -= 2;
                            int var365 = class154.field2677[var6 + 1];
                            int var366 = class154.field2677[var6];
                            class154.field2677[var6++] = var365 + var366;
                            continue;
                        }
                        if (var503 == 4001) {
                            var6 -= 2;
                            int var367 = class154.field2677[var6];
                            int var368 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var367 - var368;
                            continue;
                        }
                        if (var503 == 4002) {
                            var6 -= 2;
                            int var369 = class154.field2677[var6 + 1];
                            int var370 = class154.field2677[var6];
                            class154.field2677[var6++] = var369 * var370;
                            continue;
                        }
                        if (var503 == 4003) {
                            var6 -= 2;
                            int var371 = class154.field2677[var6];
                            int var372 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var371 / var372;
                            continue;
                        }
                        if (var503 == 4004) {
                            var6--;
                            int var373 = class154.field2677[var6];
                            class154.field2677[var6++] = (int) ((double) var373 * Math.random());
                            continue;
                        }
                        if (var503 == 4005) {
                            var6--;
                            int var374 = class154.field2677[var6];
                            class154.field2677[var6++] = (int) (Math.random() * (double) (var374 + 1));
                            continue;
                        }
                        if (var503 == 4006) {
                            var6 -= 5;
                            int var375 = class154.field2677[var6 + 1];
                            int var376 = class154.field2677[var6];
                            int var377 = class154.field2677[var6 + 2];
                            int var378 = class154.field2677[var6 + 3];
                            int var379 = class154.field2677[var6 + 4];
                            class154.field2677[var6++] = (var375 - var376) * (var379 - var377) / (var378 - var377) + var376;
                            continue;
                        }
                        if (var503 == 4007) {
                            var6 -= 2;
                            long var380 = (long) class154.field2677[var6 + 1];
                            long var382 = (long) class154.field2677[var6];
                            class154.field2677[var6++] = (int) (var380 * var382 / 100L + var382);
                            continue;
                        }
                        if (var503 == 4008) {
                            var6 -= 2;
                            int var384 = class154.field2677[var6 + 1];
                            int var385 = class154.field2677[var6];
                            class154.field2677[var6++] = class160.method1143(0x1 << var384, var385);
                            continue;
                        }
                        if (var503 == 4009) {
                            var6 -= 2;
                            int var386 = class154.field2677[var6];
                            int var387 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class214.method1432(var386, -(0x1 << var387) - 1);
                            continue;
                        }
                        if (var503 == 4010) {
                            var6 -= 2;
                            int var388 = class154.field2677[var6 + 1];
                            int var389 = class154.field2677[var6];
                            class154.field2677[var6++] = class214.method1432(0x1 << var388, var389) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var503 == 4011) {
                            var6 -= 2;
                            int var390 = class154.field2677[var6];
                            int var391 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var390 % var391;
                            continue;
                        }
                        if (var503 == 4012) {
                            var6 -= 2;
                            int var392 = class154.field2677[var6];
                            int var393 = class154.field2677[var6 + 1];
                            if (var392 == 0) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = (int) Math.pow((double) var392, (double) var393);
                            }
                            continue;
                        }
                        if (var503 == 4013) {
                            var6 -= 2;
                            int var394 = class154.field2677[var6];
                            int var395 = class154.field2677[var6 + 1];
                            if (var394 == 0) {
                                class154.field2677[var6++] = 0;
                            } else if (var395 == 0) {
                                class154.field2677[var6++] = Integer.MAX_VALUE;
                            } else {
                                class154.field2677[var6++] = (int) Math.pow((double) var394, 1.0D / (double) var395);
                            }
                            continue;
                        }
                        if (var503 == 4014) {
                            var6 -= 2;
                            int var396 = class154.field2677[var6];
                            int var397 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class214.method1432(var396, var397);
                            continue;
                        }
                        if (var503 == 4015) {
                            var6 -= 2;
                            int var398 = class154.field2677[var6];
                            int var399 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class160.method1143(var398, var399);
                            continue;
                        }
                        if (var503 == 4016) {
                            var6 -= 2;
                            int var400 = class154.field2677[var6];
                            int var401 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var400 >= var401 ? var401 : var400;
                            continue;
                        }
                        if (var503 == 4017) {
                            var6 -= 2;
                            int var402 = class154.field2677[var6];
                            int var403 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var403 < var402 ? var402 : var403;
                            continue;
                        }
                        if (var503 == 4018) {
                            var6 -= 3;
                            long var404 = (long) class154.field2677[var6];
                            long var406 = (long) class154.field2677[var6 + 2];
                            long var408 = (long) class154.field2677[var6 + 1];
                            class154.field2677[var6++] = (int) (var404 * var406 / var408);
                            continue;
                        }
                    } else if (var503 < 4200) {
                        if (var503 == 4100) {
                            var9--;
                            class280 var127 = class159.field2770[var9];
                            var6--;
                            int var128 = class154.field2677[var6];
                            class159.field2770[var9++] = class30.method266(new class280[] { var127, class249.method1685((byte) -128, var128) }, (byte) -87);
                            continue;
                        }
                        if (var503 == 4101) {
                            var9 -= 2;
                            class280 var129 = class159.field2770[var9];
                            class280 var130 = class159.field2770[var9 + 1];
                            class159.field2770[var9++] = class30.method266(new class280[] { var129, var130 }, (byte) -87);
                            continue;
                        }
                        if (var503 == 4102) {
                            var9--;
                            class280 var131 = class159.field2770[var9];
                            var6--;
                            int var132 = class154.field2677[var6];
                            class159.field2770[var9++] = class30.method266(new class280[] { var131, class106.method741(var132, true, (byte) 125) }, (byte) -87);
                            continue;
                        }
                        if (var503 == 4103) {
                            var9--;
                            class280 var133 = class159.field2770[var9];
                            class159.field2770[var9++] = var133.method1854(-66);
                            continue;
                        }
                        if (var503 == 4104) {
                            var6--;
                            int var134 = class154.field2677[var6];
                            long var135 = ((long) var134 + 11745L) * 86400000L;
                            class113.field1915.setTime(new Date(var135));
                            int var137 = class113.field1915.get(5);
                            int var138 = class113.field1915.get(2);
                            int var139 = class113.field1915.get(1);
                            class159.field2770[var9++] = class30.method266(new class280[] { class249.method1685((byte) 74, var137), class40.field685, class102.field1697[var138], class40.field685, class249.method1685((byte) -97, var139) }, (byte) -87);
                            continue;
                        }
                        if (var503 == 4105) {
                            var9 -= 2;
                            class280 var140 = class159.field2770[var9];
                            class280 var141 = class159.field2770[var9 + 1];
                            if (class262.field4631.field2481 != null && class262.field4631.field2481.field3064) {
                                class159.field2770[var9++] = var141;
                                continue;
                            }
                            class159.field2770[var9++] = var140;
                            continue;
                        }
                        if (var503 == 4106) {
                            var6--;
                            int var142 = class154.field2677[var6];
                            class159.field2770[var9++] = class249.method1685((byte) -114, var142);
                            continue;
                        }
                        if (var503 == 4107) {
                            var9 -= 2;
                            class154.field2677[var6++] = class159.field2770[var9].method1859(arg1 + 5429, class159.field2770[var9 - -1]);
                            continue;
                        }
                        if (var503 == 4108) {
                            var6 -= 2;
                            int var143 = class154.field2677[var6];
                            var9--;
                            class280 var144 = class159.field2770[var9];
                            int var145 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class157.method1116(-18666, var145).method533(var144, var143);
                            continue;
                        }
                        if (var503 == 4109) {
                            var6 -= 2;
                            var9--;
                            class280 var146 = class159.field2770[var9];
                            int var147 = class154.field2677[var6];
                            int var148 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = class157.method1116(-18666, var148).method511(var146, var147);
                            continue;
                        }
                        if (var503 == 4110) {
                            var9 -= 2;
                            class280 var149 = class159.field2770[var9 + 1];
                            class280 var150 = class159.field2770[var9];
                            var6--;
                            if (class154.field2677[var6] == 1) {
                                class159.field2770[var9++] = var150;
                            } else {
                                class159.field2770[var9++] = var149;
                            }
                            continue;
                        }
                        if (var503 == 4111) {
                            var9--;
                            class280 var151 = class159.field2770[var9];
                            class159.field2770[var9++] = class72.method538(var151);
                            continue;
                        }
                        if (var503 == 4112) {
                            var9--;
                            class280 var152 = class159.field2770[var9];
                            var6--;
                            int var153 = class154.field2677[var6];
                            if (var153 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class159.field2770[var9++] = var152.method1871(8662, var153);
                            continue;
                        }
                        if (var503 == 4113) {
                            var6--;
                            int var154 = class154.field2677[var6];
                            class154.field2677[var6++] = class238.method1595((byte) -127, var154) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4114) {
                            var6--;
                            int var155 = class154.field2677[var6];
                            class154.field2677[var6++] = class32.method279(-98, var155) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4115) {
                            var6--;
                            int var156 = class154.field2677[var6];
                            class154.field2677[var6++] = class56.method408(var156, false) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4116) {
                            var6--;
                            int var157 = class154.field2677[var6];
                            class154.field2677[var6++] = class249.method1684((byte) 120, var157) ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4117) {
                            var9--;
                            class280 var158 = class159.field2770[var9];
                            if (var158 == null) {
                                class154.field2677[var6++] = 0;
                            } else {
                                class154.field2677[var6++] = var158.method1889(arg1 + 5309);
                            }
                            continue;
                        }
                        if (var503 == 4118) {
                            var6 -= 2;
                            var9--;
                            class280 var159 = class159.field2770[var9];
                            int var160 = class154.field2677[var6];
                            int var161 = class154.field2677[var6 + 1];
                            class159.field2770[var9++] = var159.method1864(var161, var160, (byte) -54);
                            continue;
                        }
                        if (var503 == 4119) {
                            var9--;
                            class280 var162 = class159.field2770[var9];
                            class280 var163 = class52.method384((byte) 113, var162.method1889(-1));
                            boolean var164 = false;
                            for (int var165 = 0; var165 < var162.method1889(-1); var165++) {
                                int var166 = var162.method1899(var165, (byte) -28);
                                if (var166 == 60) {
                                    var164 = true;
                                } else if (var166 == 62) {
                                    var164 = false;
                                } else if (!var164) {
                                    var163.method1858(var166, -16212);
                                }
                            }
                            var163.method1876((byte) 65);
                            class159.field2770[var9++] = var163;
                            continue;
                        }
                        if (var503 == 4120) {
                            var6 -= 2;
                            var9--;
                            class280 var167 = class159.field2770[var9];
                            int var168 = class154.field2677[var6];
                            int var169 = class154.field2677[var6 + 1];
                            class154.field2677[var6++] = var167.method1874(var168, var169, (byte) -90);
                            continue;
                        }
                        if (var503 == 4121) {
                            var9 -= 2;
                            class280 var170 = class159.field2770[var9 + 1];
                            class280 var171 = class159.field2770[var9];
                            var6--;
                            int var172 = class154.field2677[var6];
                            class154.field2677[var6++] = var171.method1891(-25007, var172, var170);
                            continue;
                        }
                        if (var503 == 4122) {
                            var6--;
                            int var173 = class154.field2677[var6];
                            class154.field2677[var6++] = class269.method1803((byte) 88, var173);
                            continue;
                        }
                        if (var503 == 4123) {
                            var6--;
                            int var174 = class154.field2677[var6];
                            class154.field2677[var6++] = class249.method1680(var174, (byte) 113);
                            continue;
                        }
                        if (var503 == 4124) {
                            var6--;
                            boolean var175 = class154.field2677[var6] != 0;
                            var6--;
                            int var176 = class154.field2677[var6];
                            class159.field2770[var9++] = class149.method1033(class269.field4725, false, (long) var176, 0, var175);
                            continue;
                        }
                    } else if (var503 < 4300) {
                        if (var503 == 4200) {
                            var6--;
                            int var177 = class154.field2677[var6];
                            class159.field2770[var9++] = class23.method177((byte) -128, var177).field3818;
                            continue;
                        }
                        if (var503 == 4201) {
                            var6 -= 2;
                            int var178 = class154.field2677[var6];
                            int var179 = class154.field2677[var6 + 1];
                            class220 var180 = class23.method177((byte) -80, var178);
                            if (var179 >= 1 && var179 <= 5 && var180.field3814[var179 - 1] != null) {
                                class159.field2770[var9++] = var180.field3814[var179 - 1];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 4202) {
                            var6 -= 2;
                            int var181 = class154.field2677[var6];
                            int var182 = class154.field2677[var6 + 1];
                            class220 var183 = class23.method177((byte) -127, var181);
                            if (var182 >= 1 && var182 <= 5 && var183.field3779[var182 - 1] != null) {
                                class159.field2770[var9++] = var183.field3779[var182 - 1];
                                continue;
                            }
                            class159.field2770[var9++] = class8.field182;
                            continue;
                        }
                        if (var503 == 4203) {
                            var6--;
                            int var184 = class154.field2677[var6];
                            class154.field2677[var6++] = class23.method177((byte) -115, var184).field3783;
                            continue;
                        }
                        if (var503 == 4204) {
                            var6--;
                            int var185 = class154.field2677[var6];
                            class154.field2677[var6++] = class23.method177((byte) -91, var185).field3805 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4205) {
                            var6--;
                            int var186 = class154.field2677[var6];
                            class220 var187 = class23.method177((byte) -87, var186);
                            if (var187.field3801 == -1 && var187.field3768 >= 0) {
                                class154.field2677[var6++] = var187.field3768;
                                continue;
                            }
                            class154.field2677[var6++] = var186;
                            continue;
                        }
                        if (var503 == 4206) {
                            var6--;
                            int var188 = class154.field2677[var6];
                            class220 var189 = class23.method177((byte) -79, var188);
                            if (var189.field3801 >= 0 && var189.field3768 >= 0) {
                                class154.field2677[var6++] = var189.field3768;
                                continue;
                            }
                            class154.field2677[var6++] = var188;
                            continue;
                        }
                        if (var503 == 4207) {
                            var6--;
                            int var190 = class154.field2677[var6];
                            class154.field2677[var6++] = class23.method177((byte) -97, var190).field3782 ? 1 : 0;
                            continue;
                        }
                        if (var503 == 4208) {
                            var6 -= 2;
                            int var191 = class154.field2677[var6];
                            int var192 = class154.field2677[var6 + 1];
                            class27 var193 = class159.method1131((byte) -114, var192);
                            if (var193.method243(-18424)) {
                                class159.field2770[var9++] = class23.method177((byte) -106, var191).method1475(var192, var193.field518, class234.method1572(arg1, -5310));
                            } else {
                                class154.field2677[var6++] = class23.method177((byte) -128, var191).method1464(var192, var193.field515, (byte) -113);
                            }
                            continue;
                        }
                        if (var503 == 4210) {
                            var9--;
                            class280 var194 = class159.field2770[var9];
                            var6--;
                            int var195 = class154.field2677[var6];
                            class126.method873(var194, var195 == 1, -251);
                            class154.field2677[var6++] = class83.field1364;
                            continue;
                        }
                        if (var503 == 4211) {
                            if (class59.field956 != null && class175.field3033 < class83.field1364) {
                                class154.field2677[var6++] = class214.method1432(class59.field956[class175.field3033++], 65535);
                                continue;
                            }
                            class154.field2677[var6++] = -1;
                            continue;
                        }
                        if (var503 == 4212) {
                            class175.field3033 = 0;
                            continue;
                        }
                    } else if (var503 < 4400) {
                        if (var503 == 4300) {
                            var6 -= 2;
                            int var196 = class154.field2677[var6];
                            int var197 = class154.field2677[var6 + 1];
                            class27 var198 = class159.method1131((byte) -69, var197);
                            if (var198.method243(-18424)) {
                                class159.field2770[var9++] = class265.method1785(var196, true).method1713(124, var197, var198.field518);
                            } else {
                                class154.field2677[var6++] = class265.method1785(var196, true).method1727(var197, var198.field515, true);
                            }
                            continue;
                        }
                        if (var503 == 4301) {
                            var6--;
                            int var199 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var199, true).field4472;
                            continue;
                        }
                        if (var503 == 4302) {
                            var6--;
                            int var200 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var200, true).field4510;
                            continue;
                        }
                        if (var503 == 4303) {
                            var6--;
                            int var201 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var201, true).field4462;
                            continue;
                        }
                        if (var503 == 4304) {
                            var6--;
                            int var202 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var202, true).field4479;
                            continue;
                        }
                        if (var503 == 4305) {
                            var6--;
                            int var203 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var203, true).field4468;
                            continue;
                        }
                        if (var503 == 4306) {
                            var6--;
                            int var204 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var204, true).field4475;
                            continue;
                        }
                        if (var503 == 4307) {
                            var6--;
                            int var205 = class154.field2677[var6];
                            class154.field2677[var6++] = class265.method1785(var205, true).field4520;
                            continue;
                        }
                    } else if (var503 < 4500) {
                        if (var503 == 4400) {
                            var6 -= 2;
                            int var206 = class154.field2677[var6 + 1];
                            int var207 = class154.field2677[var6];
                            class27 var208 = class159.method1131((byte) -123, var206);
                            if (var208.method243(-18424)) {
                                class159.field2770[var9++] = class32.method277((byte) -93, var207).method899(-2, var208.field518, var206);
                            } else {
                                class154.field2677[var6++] = class32.method277((byte) -128, var207).method907(var206, var208.field515, 0);
                            }
                            continue;
                        }
                    } else if (var503 >= 4600) {
                        if (var503 < 5100) {
                            if (var503 == 5000) {
                                class154.field2677[var6++] = class161.field2823;
                                continue;
                            }
                            if (var503 == 5001) {
                                class180.field3144++;
                                var6 -= 3;
                                class161.field2823 = class154.field2677[var6];
                                class31.field574 = class154.field2677[var6 + 1];
                                class164.field2886 = class154.field2677[var6 + 2];
                                class34.field627.method551(55, true);
                                class34.field627.method227(-20435, class161.field2823);
                                class34.field627.method227(-20435, class31.field574);
                                class34.field627.method227(-20435, class164.field2886);
                                continue;
                            }
                            if (var503 == 5002) {
                                var6 -= 2;
                                int var209 = class154.field2677[var6 + 1];
                                int var210 = class154.field2677[var6];
                                class83.field1374++;
                                var9--;
                                class280 var211 = class159.field2770[var9];
                                class34.field627.method551(76, true);
                                class34.field627.method219(var211.method1896(127), -89);
                                class34.field627.method227(-20435, var210 - 1);
                                class34.field627.method227(-20435, var209);
                                continue;
                            }
                            if (var503 == 5003) {
                                var6--;
                                int var212 = class154.field2677[var6];
                                class280 var213 = null;
                                if (var212 < 100) {
                                    var213 = class27.field521[var212];
                                }
                                if (var213 == null) {
                                    var213 = class8.field182;
                                }
                                class159.field2770[var9++] = var213;
                                continue;
                            }
                            if (var503 == 5004) {
                                var6--;
                                int var214 = class154.field2677[var6];
                                int var215 = -1;
                                if (var214 < 100 && class27.field521[var214] != null) {
                                    var215 = class176.field3067[var214];
                                }
                                class154.field2677[var6++] = var215;
                                continue;
                            }
                            if (var503 == 5005) {
                                class154.field2677[var6++] = class31.field574;
                                continue;
                            }
                            if (var503 == 5008) {
                                var9--;
                                class280 var216 = class159.field2770[var9];
                                if (var216.method1897(false, class9.field196)) {
                                    class43.method325(var216, (byte) -103);
                                    continue;
                                }
                                if (class129.field2238 == 0 && (class280.field4950 && !class44.field739 || class159.field2773)) {
                                    continue;
                                }
                                class207.field3586++;
                                class280 var217 = var216.method1854(-66);
                                byte var218 = 0;
                                byte var219 = 0;
                                if (var217.method1897(false, class124.field2175)) {
                                    var218 = 0;
                                    var216 = var216.method1870((byte) -122, class124.field2175.method1889(-1));
                                } else if (var217.method1897(false, class58.field941)) {
                                    var216 = var216.method1870((byte) -122, class58.field941.method1889(-1));
                                    var218 = 1;
                                } else if (var217.method1897(false, class266.field4683)) {
                                    var216 = var216.method1870((byte) -122, class266.field4683.method1889(-1));
                                    var218 = 2;
                                } else if (var217.method1897(false, class134.field2371)) {
                                    var218 = 3;
                                    var216 = var216.method1870((byte) -122, class134.field2371.method1889(-1));
                                } else if (var217.method1897(false, class200.field3505)) {
                                    var218 = 4;
                                    var216 = var216.method1870((byte) -122, class200.field3505.method1889(arg1 ^ 0x14BD));
                                } else if (var217.method1897(false, class230.field3986)) {
                                    var218 = 5;
                                    var216 = var216.method1870((byte) -122, class230.field3986.method1889(-1));
                                } else if (var217.method1897(false, class273.field4750)) {
                                    var218 = 6;
                                    var216 = var216.method1870((byte) -122, class273.field4750.method1889(-1));
                                } else if (var217.method1897(false, class15.field291)) {
                                    var216 = var216.method1870((byte) -122, class15.field291.method1889(-1));
                                    var218 = 7;
                                } else if (var217.method1897(false, class59.field948)) {
                                    var218 = 8;
                                    var216 = var216.method1870((byte) -122, class59.field948.method1889(arg1 + 5309));
                                } else if (var217.method1897(false, class46.field770)) {
                                    var216 = var216.method1870((byte) -122, class46.field770.method1889(arg1 + 5309));
                                    var218 = 9;
                                } else if (var217.method1897(false, class178.field3102)) {
                                    var218 = 10;
                                    var216 = var216.method1870((byte) -122, class178.field3102.method1889(arg1 ^ 0x14BD));
                                } else if (var217.method1897(false, class115.field2085)) {
                                    var218 = 11;
                                    var216 = var216.method1870((byte) -122, class115.field2085.method1889(-1));
                                } else if (class269.field4725 != 0) {
                                    if (var217.method1897(false, class124.field2166)) {
                                        var218 = 0;
                                        var216 = var216.method1870((byte) -122, class124.field2166.method1889(-1));
                                    } else if (var217.method1897(false, class58.field935)) {
                                        var216 = var216.method1870((byte) -122, class58.field935.method1889(-1));
                                        var218 = 1;
                                    } else if (var217.method1897(false, class266.field4675)) {
                                        var218 = 2;
                                        var216 = var216.method1870((byte) -122, class266.field4675.method1889(-1));
                                    } else if (var217.method1897(false, class134.field2373)) {
                                        var218 = 3;
                                        var216 = var216.method1870((byte) -122, class134.field2373.method1889(arg1 + 5309));
                                    } else if (var217.method1897(false, class200.field3502)) {
                                        var218 = 4;
                                        var216 = var216.method1870((byte) -122, class200.field3502.method1889(-1));
                                    } else if (var217.method1897(false, class230.field3965)) {
                                        var218 = 5;
                                        var216 = var216.method1870((byte) -122, class230.field3965.method1889(-1));
                                    } else if (var217.method1897(false, class273.field4752)) {
                                        var216 = var216.method1870((byte) -122, class273.field4752.method1889(-1));
                                        var218 = 6;
                                    } else if (var217.method1897(false, class15.field285)) {
                                        var218 = 7;
                                        var216 = var216.method1870((byte) -122, class15.field285.method1889(-1));
                                    } else if (var217.method1897(false, class59.field953)) {
                                        var218 = 8;
                                        var216 = var216.method1870((byte) -122, class59.field953.method1889(-1));
                                    } else if (var217.method1897(false, class46.field754)) {
                                        var216 = var216.method1870((byte) -122, class46.field754.method1889(arg1 ^ 0x14BD));
                                        var218 = 9;
                                    } else if (var217.method1897(false, class178.field3088)) {
                                        var218 = 10;
                                        var216 = var216.method1870((byte) -122, class178.field3088.method1889(-1));
                                    } else if (var217.method1897(false, class115.field2083)) {
                                        var218 = 11;
                                        var216 = var216.method1870((byte) -122, class115.field2083.method1889(-1));
                                    }
                                }
                                class280 var220 = var216.method1854(-66);
                                if (var220.method1897(false, class271.field4739)) {
                                    var219 = 1;
                                    var216 = var216.method1870((byte) -122, class271.field4739.method1889(-1));
                                } else if (var220.method1897(false, class61.field989)) {
                                    var219 = 2;
                                    var216 = var216.method1870((byte) -122, class61.field989.method1889(-1));
                                } else if (var220.method1897(false, class60.field966)) {
                                    var216 = var216.method1870((byte) -122, class60.field966.method1889(-1));
                                    var219 = 3;
                                } else if (var220.method1897(false, class161.field2816)) {
                                    var219 = 4;
                                    var216 = var216.method1870((byte) -122, class161.field2816.method1889(-1));
                                } else if (var220.method1897(false, class211.field3622)) {
                                    var216 = var216.method1870((byte) -122, class211.field3622.method1889(arg1 + 5309));
                                    var219 = 5;
                                } else if (class269.field4725 != 0) {
                                    if (var220.method1897(false, class271.field4735)) {
                                        var216 = var216.method1870((byte) -122, class271.field4735.method1889(-1));
                                        var219 = 1;
                                    } else if (var220.method1897(false, class61.field993)) {
                                        var219 = 2;
                                        var216 = var216.method1870((byte) -122, class61.field993.method1889(arg1 ^ 0x14BD));
                                    } else if (var220.method1897(false, class60.field977)) {
                                        var216 = var216.method1870((byte) -122, class60.field977.method1889(-1));
                                        var219 = 3;
                                    } else if (var220.method1897(false, class161.field2815)) {
                                        var216 = var216.method1870((byte) -122, class161.field2815.method1889(-1));
                                        var219 = 4;
                                    } else if (var220.method1897(false, class211.field3627)) {
                                        var216 = var216.method1870((byte) -122, class211.field3627.method1889(-1));
                                        var219 = 5;
                                    }
                                }
                                class34.field627.method551(239, true);
                                class34.field627.method227(-20435, 0);
                                int var221 = class34.field627.field481;
                                class34.field627.method227(-20435, var218);
                                class34.field627.method227(-20435, var219);
                                class145.method999(var216, class34.field627, (byte) -117);
                                class34.field627.method184((byte) 98, class34.field627.field481 - var221);
                                continue;
                            }
                            if (var503 == 5009) {
                                var9 -= 2;
                                class280 var222 = class159.field2770[var9];
                                class280 var223 = class159.field2770[var9 + 1];
                                if (class129.field2238 != 0 || (!class280.field4950 || class44.field739) && !class159.field2773) {
                                    class34.field627.method551(10, true);
                                    class155.field2704++;
                                    class34.field627.method227(-20435, 0);
                                    int var224 = class34.field627.field481;
                                    class34.field627.method219(var222.method1896(68), 43);
                                    class145.method999(var223, class34.field627, (byte) -114);
                                    class34.field627.method184((byte) 101, class34.field627.field481 - var224);
                                }
                                continue;
                            }
                            if (var503 == 5010) {
                                var6--;
                                int var225 = class154.field2677[var6];
                                class280 var226 = null;
                                if (var225 < 100) {
                                    var226 = class266.field4678[var225];
                                }
                                if (var226 == null) {
                                    var226 = class8.field182;
                                }
                                class159.field2770[var9++] = var226;
                                continue;
                            }
                            if (var503 == 5011) {
                                class280 var227 = null;
                                var6--;
                                int var228 = class154.field2677[var6];
                                if (var228 < 100) {
                                    var227 = class164.field2884[var228];
                                }
                                if (var227 == null) {
                                    var227 = class8.field182;
                                }
                                class159.field2770[var9++] = var227;
                                continue;
                            }
                            if (var503 == 5012) {
                                var6--;
                                int var229 = class154.field2677[var6];
                                int var230 = -1;
                                if (var229 < 100) {
                                    var230 = class60.field962[var229];
                                }
                                class154.field2677[var6++] = var230;
                                continue;
                            }
                            if (var503 == 5015) {
                                class280 var231;
                                if (class262.field4631 == null || class262.field4631.field2458 == null) {
                                    var231 = class229.field3961;
                                } else {
                                    var231 = class262.field4631.method979(-113);
                                }
                                class159.field2770[var9++] = var231;
                                continue;
                            }
                            if (var503 == 5016) {
                                class154.field2677[var6++] = class164.field2886;
                                continue;
                            }
                            if (var503 == 5017) {
                                class154.field2677[var6++] = class107.field1767;
                                continue;
                            }
                            if (var503 == 5050) {
                                var6--;
                                int var232 = class154.field2677[var6];
                                class159.field2770[var9++] = class131.method909(10766, var232).field1745;
                                continue;
                            }
                            if (var503 == 5051) {
                                var6--;
                                int var233 = class154.field2677[var6];
                                class105 var234 = class131.method909(arg1 + 16076, var233);
                                if (var234.field1743 == null) {
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var234.field1743.length;
                                }
                                continue;
                            }
                            if (var503 == 5052) {
                                var6 -= 2;
                                int var235 = class154.field2677[var6 + 1];
                                int var236 = class154.field2677[var6];
                                class105 var237 = class131.method909(10766, var236);
                                int var238 = var237.field1743[var235];
                                class154.field2677[var6++] = var238;
                                continue;
                            }
                            if (var503 == 5053) {
                                var6--;
                                int var239 = class154.field2677[var6];
                                class105 var240 = class131.method909(10766, var239);
                                if (var240.field1740 == null) {
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var240.field1740.length;
                                }
                                continue;
                            }
                            if (var503 == 5054) {
                                var6 -= 2;
                                int var241 = class154.field2677[var6 + 1];
                                int var242 = class154.field2677[var6];
                                class154.field2677[var6++] = class131.method909(arg1 + 16076, var242).field1740[var241];
                                continue;
                            }
                            if (var503 == 5055) {
                                var6--;
                                int var243 = class154.field2677[var6];
                                class159.field2770[var9++] = class180.method1238((byte) -111, var243).method1046((byte) -81);
                                continue;
                            }
                            if (var503 == 5056) {
                                var6--;
                                int var244 = class154.field2677[var6];
                                class150 var245 = class180.method1238((byte) -111, var244);
                                if (var245.field2594 == null) {
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var245.field2594.length;
                                }
                                continue;
                            }
                            if (var503 == 5057) {
                                var6 -= 2;
                                int var246 = class154.field2677[var6];
                                int var247 = class154.field2677[var6 + 1];
                                class154.field2677[var6++] = class180.method1238((byte) -111, var246).field2594[var247];
                                continue;
                            }
                            if (var503 == 5058) {
                                class54.field885 = new class229();
                                var6--;
                                class54.field885.field3964 = class154.field2677[var6];
                                class54.field885.field3956 = class180.method1238((byte) -111, class54.field885.field3964);
                                class54.field885.field3955 = new int[class54.field885.field3956.method1041(-120)];
                                continue;
                            }
                            if (var503 == 5059) {
                                class34.field627.method551(120, true);
                                class178.field3087++;
                                class34.field627.method227(-20435, 0);
                                int var248 = class34.field627.field481;
                                class34.field627.method227(-20435, 0);
                                class34.field627.method214(-3, class54.field885.field3964);
                                class54.field885.field3956.method1044(class54.field885.field3955, class34.field627, -114);
                                class34.field627.method184((byte) 100, class34.field627.field481 - var248);
                                continue;
                            }
                            if (var503 == 5060) {
                                var9--;
                                class280 var249 = class159.field2770[var9];
                                class180.field3138++;
                                class34.field627.method551(9, true);
                                class34.field627.method227(-20435, 0);
                                int var250 = class34.field627.field481;
                                class34.field627.method219(var249.method1896(arg1 ^ 0xFFFFEB3D), 103);
                                class34.field627.method214(-3, class54.field885.field3964);
                                class54.field885.field3956.method1044(class54.field885.field3955, class34.field627, -92);
                                class34.field627.method184((byte) 88, class34.field627.field481 - var250);
                                continue;
                            }
                            if (var503 == 5061) {
                                class34.field627.method551(120, true);
                                class34.field627.method227(-20435, 0);
                                class178.field3087++;
                                int var251 = class34.field627.field481;
                                class34.field627.method227(-20435, 1);
                                class34.field627.method214(-3, class54.field885.field3964);
                                class54.field885.field3956.method1044(class54.field885.field3955, class34.field627, -127);
                                class34.field627.method184((byte) 107, class34.field627.field481 - var251);
                                continue;
                            }
                            if (var503 == 5062) {
                                var6 -= 2;
                                int var252 = class154.field2677[var6];
                                int var253 = class154.field2677[var6 + 1];
                                class154.field2677[var6++] = class131.method909(arg1 + 16076, var252).field1746[var253];
                                continue;
                            }
                            if (var503 == 5063) {
                                var6 -= 2;
                                int var254 = class154.field2677[var6];
                                int var255 = class154.field2677[var6 + 1];
                                class154.field2677[var6++] = class131.method909(10766, var254).field1738[var255];
                                continue;
                            }
                            if (var503 == 5064) {
                                var6 -= 2;
                                int var256 = class154.field2677[var6];
                                int var257 = class154.field2677[var6 + 1];
                                if (var257 == -1) {
                                    class154.field2677[var6++] = -1;
                                } else {
                                    class154.field2677[var6++] = class131.method909(10766, var256).method737(var257, class234.method1572(arg1, 17474));
                                }
                                continue;
                            }
                            if (var503 == 5065) {
                                var6 -= 2;
                                int var258 = class154.field2677[var6];
                                int var259 = class154.field2677[var6 + 1];
                                if (var259 == -1) {
                                    class154.field2677[var6++] = -1;
                                } else {
                                    class154.field2677[var6++] = class131.method909(10766, var258).method735(var259, 0);
                                }
                                continue;
                            }
                            if (var503 == 5066) {
                                var6--;
                                int var260 = class154.field2677[var6];
                                class154.field2677[var6++] = class180.method1238((byte) -111, var260).method1041(-106);
                                continue;
                            }
                            if (var503 == 5067) {
                                var6 -= 2;
                                int var261 = class154.field2677[var6];
                                int var262 = class154.field2677[var6 + 1];
                                int var263 = class180.method1238((byte) -111, var261).method1035(var262, -26430);
                                class154.field2677[var6++] = var263;
                                continue;
                            }
                            if (var503 == 5068) {
                                var6 -= 2;
                                int var264 = class154.field2677[var6 + 1];
                                int var265 = class154.field2677[var6];
                                class54.field885.field3955[var265] = var264;
                                continue;
                            }
                            if (var503 == 5069) {
                                var6 -= 2;
                                int var266 = class154.field2677[var6];
                                int var267 = class154.field2677[var6 + 1];
                                class54.field885.field3955[var266] = var267;
                                continue;
                            }
                            if (var503 == 5070) {
                                var6 -= 3;
                                int var268 = class154.field2677[var6 + 1];
                                int var269 = class154.field2677[var6];
                                int var270 = class154.field2677[var6 + 2];
                                class150 var271 = class180.method1238((byte) -111, var269);
                                if (var271.method1035(var268, -26430) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class154.field2677[var6++] = var271.method1038(var268, var270, (byte) -114);
                                continue;
                            }
                            if (var503 == 5071) {
                                var9--;
                                class280 var272 = class159.field2770[var9];
                                var6--;
                                boolean var273 = class154.field2677[var6] == 1;
                                class184.method1283(var272, 26814, var273);
                                class154.field2677[var6++] = class83.field1364;
                                continue;
                            }
                            if (var503 == 5072) {
                                if (class59.field956 != null && class175.field3033 < class83.field1364) {
                                    class154.field2677[var6++] = class214.method1432(65535, class59.field956[class175.field3033++]);
                                    continue;
                                }
                                class154.field2677[var6++] = -1;
                                continue;
                            }
                            if (var503 == 5073) {
                                class175.field3033 = 0;
                                continue;
                            }
                        } else if (var503 < 5200) {
                            if (var503 == 5100) {
                                if (class88.field1431[86]) {
                                    class154.field2677[var6++] = 1;
                                } else {
                                    class154.field2677[var6++] = 0;
                                }
                                continue;
                            }
                            if (var503 == 5101) {
                                if (class88.field1431[82]) {
                                    class154.field2677[var6++] = 1;
                                } else {
                                    class154.field2677[var6++] = 0;
                                }
                                continue;
                            }
                            if (var503 == 5102) {
                                if (class88.field1431[81]) {
                                    class154.field2677[var6++] = 1;
                                } else {
                                    class154.field2677[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var503 < 5300) {
                            if (var503 == 5200) {
                                var6--;
                                class117.method842(class154.field2677[var6], (byte) -120);
                                continue;
                            }
                            if (var503 == 5201) {
                                class154.field2677[var6++] = class13.method113((byte) 81);
                                continue;
                            }
                            if (var503 == 5202) {
                                var6--;
                                class85.method609(50, class154.field2677[var6]);
                                continue;
                            }
                            if (var503 == 5203) {
                                var9--;
                                class98.method691((byte) 95, class159.field2770[var9]);
                                continue;
                            }
                            if (var503 == 5204) {
                                class159.field2770[var9 - 1] = class145.method997(true, class159.field2770[var9 - 1]);
                                continue;
                            }
                            if (var503 == 5205) {
                                var9--;
                                class52.method382(61, class159.field2770[var9]);
                                continue;
                            }
                            if (var503 == 5206) {
                                var6--;
                                int var274 = class154.field2677[var6];
                                class103 var275 = class19.method153(var274 & 0x3FFF, var274 >> 14 & 0x3FFF, (byte) -97);
                                if (var275 == null) {
                                    class159.field2770[var9++] = class8.field182;
                                } else {
                                    class159.field2770[var9++] = var275.field1716;
                                }
                                continue;
                            }
                            if (var503 == 5207) {
                                var9--;
                                class103 var276 = class6.method70(0, class159.field2770[var9]);
                                if (var276 != null && var276.field1718 != null) {
                                    class159.field2770[var9++] = var276.field1718;
                                    continue;
                                }
                                class159.field2770[var9++] = class8.field182;
                                continue;
                            }
                            if (var503 == 5208) {
                                class154.field2677[var6++] = class92.field1488;
                                class154.field2677[var6++] = class273.field4748;
                                continue;
                            }
                            if (var503 == 5209) {
                                class154.field2677[var6++] = class266.field4684 + class113.field2023;
                                class154.field2677[var6++] = class74.field1222 - (1 - class243.field4268) - class47.field780;
                                continue;
                            }
                            if (var503 == 5210) {
                                class103 var277 = class248.method1678((byte) -30);
                                if (var277 == null) {
                                    class154.field2677[var6++] = 0;
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var277.field1713 * 64;
                                    class154.field2677[var6++] = var277.field1702 * 64;
                                }
                                continue;
                            }
                            if (var503 == 5211) {
                                class103 var278 = class248.method1678((byte) -30);
                                if (var278 == null) {
                                    class154.field2677[var6++] = 0;
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var278.field1706 - var278.field1704;
                                    class154.field2677[var6++] = var278.field1703 - var278.field1719;
                                }
                                continue;
                            }
                            if (var503 == 5212) {
                                int var279 = class226.method1521((byte) -59);
                                int var280 = 0;
                                class280 var281;
                                if (var279 == -1) {
                                    var281 = class8.field182;
                                } else {
                                    var281 = class14.field280.field3238[var279];
                                    var280 = class14.field280.method1275(119, var279);
                                }
                                class280 var282 = var281.method1894(class266.field4676, class241.field4228, (byte) -85);
                                class159.field2770[var9++] = var282;
                                class154.field2677[var6++] = var280;
                                continue;
                            }
                            if (var503 == 5213) {
                                int var283 = 0;
                                int var284 = class74.method555(-1);
                                class280 var285;
                                if (var284 == -1) {
                                    var285 = class8.field182;
                                } else {
                                    var285 = class14.field280.field3238[var284];
                                    var283 = class14.field280.method1275(118, var284);
                                }
                                class280 var286 = var285.method1894(class266.field4676, class241.field4228, (byte) -10);
                                class159.field2770[var9++] = var286;
                                class154.field2677[var6++] = var283;
                                continue;
                            }
                            if (var503 == 5214) {
                                var6--;
                                int var287 = class154.field2677[var6];
                                class126.method874(var287 & 0x3FFF, true, var287 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var503 == 5215) {
                                var9--;
                                class280 var288 = class159.field2770[var9];
                                var6--;
                                int var289 = class154.field2677[var6];
                                class31 var290 = class27.method246(var289 & 0x3FFF, true, (var289 & 0xFFFE3D0) >> 14);
                                boolean var291 = false;
                                for (class103 var292 = (class103) var290.method274((byte) -118); var292 != null; var292 = (class103) var290.method272(true)) {
                                    if (var292.field1716.method1887((byte) 32, var288)) {
                                        var291 = true;
                                        break;
                                    }
                                }
                                if (var291) {
                                    class154.field2677[var6++] = 1;
                                } else {
                                    class154.field2677[var6++] = 0;
                                }
                                continue;
                            }
                            if (var503 == 5216) {
                                var6--;
                                int var293 = class154.field2677[var6];
                                class240.method1633(var293, 16);
                                continue;
                            }
                            if (var503 == 5217) {
                                var6--;
                                int var294 = class154.field2677[var6];
                                if (class9.method99(var294, 65408)) {
                                    class154.field2677[var6++] = 1;
                                } else {
                                    class154.field2677[var6++] = 0;
                                }
                                continue;
                            }
                            if (var503 == 5218) {
                                class103 var295 = class248.method1678((byte) -30);
                                if (var295 == null) {
                                    class154.field2677[var6++] = -1;
                                } else {
                                    class154.field2677[var6++] = var295.field1714;
                                }
                                continue;
                            }
                            if (var503 == 5219) {
                                var9--;
                                class184.method1278((byte) -57, class159.field2770[var9]);
                                continue;
                            }
                        } else if (var503 < 5400) {
                            if (var503 == 5300) {
                                var6 -= 2;
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            if (var503 == 5301) {
                                continue;
                            }
                            if (var503 == 5302) {
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            if (var503 == 5303) {
                                var6--;
                                class154.field2677[var6++] = 0;
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            if (var503 == 5305) {
                                byte var296 = -1;
                                class154.field2677[var6++] = var296;
                                continue;
                            }
                            if (var503 == 5306) {
                                class154.field2677[var6++] = class210.method1410(arg1 + 5310);
                                continue;
                            }
                            if (var503 == 5307) {
                                var6--;
                                int var297 = class154.field2677[var6];
                                if (var297 < 0 || var297 > 2) {
                                    var297 = 0;
                                }
                                class27.method245(-1, false, -1, false, var297);
                                continue;
                            }
                            if (var503 == 5308) {
                                class154.field2677[var6++] = class98.field1573;
                                continue;
                            }
                            if (var503 == 5309) {
                                var6--;
                                int var298 = class154.field2677[var6];
                                if (var298 < 0 || var298 > 2) {
                                    var298 = 0;
                                }
                                class98.field1573 = var298;
                                class47.method351(class118.field2117, -583);
                                continue;
                            }
                        } else if (var503 < 5500) {
                            if (var503 == 5400) {
                                class196.field3433++;
                                var9 -= 2;
                                class280 var299 = class159.field2770[var9];
                                class280 var300 = class159.field2770[var9 + 1];
                                var6--;
                                int var301 = class154.field2677[var6];
                                class34.field627.method551(234, true);
                                class34.field627.method227(-20435, (class169.method1175(var299, false) + class169.method1175(var300, false)) + 1);
                                class34.field627.method195(var299, -66);
                                class34.field627.method195(var300, -66);
                                class34.field627.method227(-20435, var301);
                                continue;
                            }
                            if (var503 == 5401) {
                                var6 -= 2;
                                class125.field2195[class154.field2677[var6]] = (short) class283.method1915((byte) -12, class154.field2677[var6 + 1]);
                                class243.method1653(116);
                                class238.method1592(true);
                                class54.method397(-17);
                                class155.method1106(-107);
                                class51.method379((byte) 24);
                                continue;
                            }
                            if (var503 == 5405) {
                                var6 -= 2;
                                int var302 = class154.field2677[var6 + 1];
                                int var303 = class154.field2677[var6];
                                if (var303 >= 0 && var303 < 2) {
                                    class269.field4719[var303] = new int[var302 << 1][4];
                                }
                                continue;
                            }
                            if (var503 == 5406) {
                                var6 -= 7;
                                int var304 = class154.field2677[var6 + 2];
                                int var305 = class154.field2677[var6 + 3];
                                int var306 = class154.field2677[var6];
                                int var307 = class154.field2677[var6 + 1] << 1;
                                int var308 = class154.field2677[var6 + 4];
                                int var309 = class154.field2677[var6 + 5];
                                int var310 = class154.field2677[var6 + 6];
                                if (var306 >= 0 && var306 < 2 && class269.field4719[var306] != null && var307 >= 0 && class269.field4719[var306].length > var307) {
                                    class269.field4719[var306][var307] = new int[] { class214.method1432(16383, var304 >> 14) * 128, var305, class214.method1432(var304, 16383) * 128, var310 };
                                    class269.field4719[var306][var307 + 1] = new int[] { class214.method1432(var308 >> 14, 16383) * 128, var309, class214.method1432(var308, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var503 == 5407) {
                                var6--;
                                int var311 = class269.field4719[class154.field2677[var6]].length >> 1;
                                class154.field2677[var6++] = var311;
                                continue;
                            }
                            if (var503 == 5411) {
                                if (class153.field2656 == null) {
                                    class199.method1370(class74.method549((byte) -120), false, -1);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var503 == 5419) {
                                class280 var312 = class8.field182;
                                if (class101.field1648 != null) {
                                    var312 = class97.method680(-95, class101.field1648.field3023);
                                    try {
                                        if (class101.field1648.field3028 != null) {
                                            byte[] var313 = ((String) class101.field1648.field3028).getBytes("ISO-8859-1");
                                            var312 = class153.method1084(0, var313, 0, var313.length);
                                        }
                                    } catch (UnsupportedEncodingException var501) {
                                    }
                                }
                                class159.field2770[var9++] = var312;
                                continue;
                            }
                            if (var503 == 5420) {
                                class154.field2677[var6++] = class198.field3469 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 5421) {
                                var6--;
                                boolean var314 = class154.field2677[var6] == 1;
                                var9--;
                                class280 var315 = class159.field2770[var9];
                                class280 var316 = class30.method266(new class280[] { class74.method549((byte) -128), var315 }, (byte) -87);
                                if (class153.field2656 != null || var314 && class198.field3469 != 3 && class198.field3457.startsWith("win") && !class47.field783) {
                                    class57.field918 = var314;
                                    class101.field1643 = var316;
                                    class255.field4509 = class118.field2117.method1360(15815, new String(var316.method1898((byte) -104), "ISO-8859-1"));
                                    continue;
                                }
                                class199.method1370(var316, var314, -1);
                                continue;
                            }
                            if (var503 == 5422) {
                                var9 -= 2;
                                class280 var317 = class159.field2770[var9 + 1];
                                class280 var318 = class159.field2770[var9];
                                var6--;
                                int var319 = class154.field2677[var6];
                                if (var318.method1889(-1) > 0) {
                                    if (class15.field288 == null) {
                                        class15.field288 = new class280[class260.field4604[class283.field4992]];
                                    }
                                    class15.field288[var319] = var318;
                                }
                                if (var317.method1889(-1) > 0) {
                                    if (class214.field3674 == null) {
                                        class214.field3674 = new class280[class260.field4604[class283.field4992]];
                                    }
                                    class214.field3674[var319] = var317;
                                }
                                continue;
                            }
                            if (var503 == 5423) {
                                var9--;
                                class159.field2770[var9].method1901(arg1 ^ 0xFFFFEB42);
                                continue;
                            }
                            if (var503 == 5424) {
                                var6 -= 11;
                                class128.field2230 = class154.field2677[var6];
                                class134.field2376 = class154.field2677[var6 + 1];
                                class62.field1015 = class154.field2677[var6 + 2];
                                class199.field3483 = class154.field2677[var6 + 3];
                                class118.field2115 = class154.field2677[var6 + 4];
                                class231.field4020 = class154.field2677[var6 + 5];
                                class3.field96 = class154.field2677[var6 + 6];
                                class235.field4095 = class154.field2677[var6 + 7];
                                class231.field4021 = class154.field2677[var6 + 8];
                                class222.field3851 = class154.field2677[var6 + 9];
                                class214.field3668 = class154.field2677[var6 + 10];
                                class220.field3778.method1262(class118.field2115, (byte) 93);
                                class220.field3778.method1262(class231.field4020, (byte) 93);
                                class220.field3778.method1262(class3.field96, (byte) 93);
                                class220.field3778.method1262(class235.field4095, (byte) 93);
                                class220.field3778.method1262(class231.field4021, (byte) 93);
                                class148.field2567 = true;
                                continue;
                            }
                            if (var503 == 5425) {
                                class21.method167(arg1 ^ 0x800014BD);
                                class148.field2567 = false;
                                continue;
                            }
                            if (var503 == 5426) {
                                var6--;
                                class122.field2153 = class154.field2677[var6];
                                continue;
                            }
                            if (var503 == 5427) {
                                var6 -= 2;
                                class248.field4347 = class154.field2677[var6];
                                class127.field2225 = class154.field2677[var6 + 1];
                                continue;
                            }
                        } else if (var503 < 5600) {
                            if (var503 == 5500) {
                                var6 -= 4;
                                int var350 = class154.field2677[var6 + 2];
                                int var351 = class154.field2677[var6 + 1];
                                int var352 = class154.field2677[var6];
                                int var353 = class154.field2677[var6 + 3];
                                class108.method752((byte) 78, var351, false, (var352 & 0x3FFF) - class91.field1480, var353, var350, ((var352 & 0xFFFE206) >> 14) - class49.field806);
                                continue;
                            }
                            if (var503 == 5501) {
                                var6 -= 4;
                                int var354 = class154.field2677[var6];
                                int var355 = class154.field2677[var6 + 1];
                                int var356 = class154.field2677[var6 + 3];
                                int var357 = class154.field2677[var6 + 2];
                                class203.method1388(((var354 & 0xFFFFCD8) >> 14) - class49.field806, var356, (byte) -47, (var354 & 0x3FFF) - class91.field1480, var355, var357);
                                continue;
                            }
                            if (var503 == 5502) {
                                var6 -= 6;
                                int var358 = class154.field2677[var6];
                                if (var358 >= 2) {
                                    throw new RuntimeException();
                                }
                                class178.field3094 = var358;
                                int var359 = class154.field2677[var6 + 1];
                                if (var359 + 1 >= class269.field4719[class178.field3094].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class279.field4881 = 0;
                                class78.field1263 = var359;
                                class40.field687 = class154.field2677[var6 + 2];
                                class115.field2086 = class154.field2677[var6 + 3];
                                int var360 = class154.field2677[var6 + 4];
                                if (var360 >= 2) {
                                    throw new RuntimeException();
                                }
                                class187.field3281 = var360;
                                int var361 = class154.field2677[var6 + 5];
                                if (var361 + 1 >= class269.field4719[class187.field3281].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class117.field2105 = var361;
                                class4.field113 = 3;
                                continue;
                            }
                            if (var503 == 5503) {
                                class33.method281(20555);
                                continue;
                            }
                            if (var503 == 5504) {
                                var6 -= 2;
                                class220.field3759 = class154.field2677[var6];
                                class25.field487 = class154.field2677[var6 + 1];
                                if (class4.field113 == 2) {
                                    class220.field3827 = class25.field487;
                                    class8.field170 = class220.field3759;
                                }
                                class57.method410(303);
                                continue;
                            }
                            if (var503 == 5505) {
                                class154.field2677[var6++] = class220.field3759;
                                continue;
                            }
                            if (var503 == 5506) {
                                class154.field2677[var6++] = class25.field487;
                                continue;
                            }
                        } else if (var503 < 5700) {
                            if (var503 == 5600) {
                                var9 -= 2;
                                class280 var346 = class159.field2770[var9];
                                class280 var347 = class159.field2770[var9 + 1];
                                var6--;
                                int var348 = class154.field2677[var6];
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0 && class94.field1525 == 0) {
                                    class129.method887(var346, (byte) -52, var347, var348);
                                }
                                continue;
                            }
                            if (var503 == 5601) {
                                class187.method1301(true);
                                continue;
                            }
                            if (var503 == 5602) {
                                if (class264.field4663 == 0) {
                                    class8.field148 = -2;
                                }
                                continue;
                            }
                            if (var503 == 5603) {
                                var6 -= 4;
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0 && class94.field1525 == 0) {
                                    class86.method618(class154.field2677[var6 + 1], (byte) -122, class154.field2677[var6], class154.field2677[var6 + 3], class154.field2677[var6 + 2]);
                                }
                                continue;
                            }
                            if (var503 == 5604) {
                                var9--;
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0 && class94.field1525 == 0) {
                                    class130.method904((byte) 79, class159.field2770[var9].method1896(101));
                                }
                                continue;
                            }
                            if (var503 == 5605) {
                                var6 -= 4;
                                var9 -= 2;
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0 && class94.field1525 == 0) {
                                    class201.method1379(class154.field2677[var6 + 3], class159.field2770[var9].method1896(68), arg1 ^ 0xFFFF89A0, class154.field2677[var6 + 2], class154.field2677[var6], class154.field2677[var6 + 1], class159.field2770[var9 + 1]);
                                }
                                continue;
                            }
                            if (var503 == 5606) {
                                if (class133.field2366 == 0) {
                                    class120.field2128 = -2;
                                }
                                continue;
                            }
                            if (var503 == 5607) {
                                class154.field2677[var6++] = class8.field148;
                                continue;
                            }
                            if (var503 == 5608) {
                                class154.field2677[var6++] = class80.field1316;
                                continue;
                            }
                            if (var503 == 5609) {
                                class154.field2677[var6++] = class120.field2128;
                                continue;
                            }
                            if (var503 == 5610) {
                                for (int var349 = 0; var349 < 5; var349++) {
                                    class159.field2770[var9++] = class13.field271.length > var349 ? class13.field271[var349].method1881((byte) 122) : class8.field182;
                                }
                                class13.field271 = null;
                                continue;
                            }
                            if (var503 == 5611) {
                                class154.field2677[var6++] = class86.field1419;
                                continue;
                            }
                        } else if (var503 < 6100) {
                            if (var503 == 6001) {
                                var6--;
                                int var320 = class154.field2677[var6];
                                if (var320 < 1) {
                                    var320 = 1;
                                }
                                if (var320 > 4) {
                                    var320 = 4;
                                }
                                class120.field2126 = var320;
                                if (class120.field2126 == 1) {
                                    class146.method1019(0.9F);
                                }
                                if (class120.field2126 == 2) {
                                    class146.method1019(0.8F);
                                }
                                if (class120.field2126 == 3) {
                                    class146.method1019(0.7F);
                                }
                                if (class120.field2126 == 4) {
                                    class146.method1019(0.6F);
                                }
                                class238.method1592(true);
                                class47.method351(class118.field2117, arg1 ^ 0x16FB);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6002) {
                                var10000 = arg1 + 5182;
                                var6--;
                                class250.method1688(var10000, class154.field2677[var6] == 1);
                                class124.method865((byte) -123);
                                method542(-120);
                                class136.method939((byte) 6);
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6003) {
                                var6--;
                                class140.field2430 = class154.field2677[var6] == 1;
                                class136.method939((byte) 6);
                                class47.method351(class118.field2117, arg1 + 4727);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6005) {
                                var6--;
                                class12.field252 = class154.field2677[var6] == 1;
                                method542(arg1 ^ 0x14C4);
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6006) {
                                var6--;
                                class83.field1376 = class154.field2677[var6] == 1;
                                ((class215) class146.field2539).method1447(!class83.field1376, true);
                                class47.method351(class118.field2117, arg1 + 4727);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6007) {
                                var6--;
                                class160.field2810 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6008) {
                                var6--;
                                class2.field80 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6009) {
                                var6--;
                                class81.field1332 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6010) {
                                var6--;
                                class215.field3720 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6011) {
                                var6--;
                                int var321 = class154.field2677[var6];
                                if (var321 < 0 || var321 > 2) {
                                    var321 = 0;
                                }
                                class17.field316 = var321;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6012) {
                                var6--;
                                class273.field4754 = class154.field2677[var6] == 1;
                                if (class120.field2126 == 1) {
                                    class146.method1019(0.9F);
                                }
                                if (class120.field2126 == 2) {
                                    class146.method1019(0.8F);
                                }
                                if (class120.field2126 == 3) {
                                    class146.method1019(0.7F);
                                }
                                if (class120.field2126 == 4) {
                                    class146.method1019(0.6F);
                                }
                                method542(-99);
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6014) {
                                var6--;
                                class183.field3219 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6015) {
                                var6--;
                                class3.field101 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, arg1 ^ 0x16FB);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6016) {
                                var6--;
                                int var322 = class154.field2677[var6];
                                if (var322 < 0 || var322 > 2) {
                                    var322 = 0;
                                }
                                class128.field2234 = var322;
                                continue;
                            }
                            if (var503 == 6017) {
                                var6--;
                                class157.field2752 = class154.field2677[var6] == 1;
                                class7.method78(22050);
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6018) {
                                var6--;
                                int var323 = class154.field2677[var6];
                                if (var323 < 0) {
                                    var323 = 0;
                                }
                                if (var323 > 127) {
                                    var323 = 127;
                                }
                                class261.field4617 = var323;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6019) {
                                var6--;
                                int var324 = class154.field2677[var6];
                                if (var324 < 0) {
                                    var324 = 0;
                                }
                                if (var324 > 255) {
                                    var324 = 255;
                                }
                                if (class188.field3307 != var324) {
                                    if (class188.field3307 == 0 && class243.field4270 != -1) {
                                        class112.method785(class243.field4270, class184.field3246, false, 0, 10000, var324);
                                        class54.field893 = false;
                                    } else if (var324 == 0) {
                                        class245.method1666((byte) 116);
                                        class54.field893 = false;
                                    } else {
                                        class267.method1794(var324, arg1 ^ 0xFFFFEB42);
                                    }
                                    class188.field3307 = var324;
                                }
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6020) {
                                var6--;
                                int var325 = class154.field2677[var6];
                                if (var325 < 0) {
                                    var325 = 0;
                                }
                                if (var325 > 127) {
                                    var325 = 127;
                                }
                                class54.field892 = var325;
                                class47.method351(class118.field2117, -583);
                                class194.field3424 = false;
                                continue;
                            }
                            if (var503 == 6021) {
                                var6--;
                                class197.field3442 = class154.field2677[var6] == 1;
                                class136.method939((byte) 6);
                                continue;
                            }
                            if (var503 == 6023) {
                                var6--;
                                int var326 = class154.field2677[var6];
                                boolean var327 = false;
                                if (var326 < 0) {
                                    var326 = 0;
                                }
                                if (var326 > 2) {
                                    var326 = 2;
                                }
                                if (class142.field2494 < 96) {
                                    var326 = 0;
                                    var327 = true;
                                }
                                class95.method670(var326);
                                class47.method351(class118.field2117, arg1 + 4727);
                                class194.field3424 = false;
                                class154.field2677[var6++] = var327 ? 0 : 1;
                                continue;
                            }
                            if (var503 == 6024) {
                                var6--;
                                int var328 = class154.field2677[var6];
                                if (var328 < 0 || var328 > 2) {
                                    var328 = 0;
                                }
                                class9.field190 = var328;
                                class47.method351(class118.field2117, arg1 ^ 0x16FB);
                                continue;
                            }
                            if (var503 == 6028) {
                                var6--;
                                class190.field3332 = class154.field2677[var6] != 0;
                                class47.method351(class118.field2117, -583);
                                continue;
                            }
                        } else if (var503 < 6200) {
                            if (var503 == 6101) {
                                class154.field2677[var6++] = class120.field2126;
                                continue;
                            }
                            if (var503 == 6102) {
                                class154.field2677[var6++] = class215.method1436(104) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6103) {
                                class154.field2677[var6++] = class140.field2430 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6105) {
                                class154.field2677[var6++] = class12.field252 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6106) {
                                class154.field2677[var6++] = class83.field1376 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6107) {
                                class154.field2677[var6++] = class160.field2810 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6108) {
                                class154.field2677[var6++] = class2.field80 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6109) {
                                class154.field2677[var6++] = class81.field1332 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6110) {
                                class154.field2677[var6++] = class215.field3720 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6111) {
                                class154.field2677[var6++] = class17.field316;
                                continue;
                            }
                            if (var503 == 6112) {
                                class154.field2677[var6++] = class273.field4754 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6114) {
                                class154.field2677[var6++] = class183.field3219 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6115) {
                                class154.field2677[var6++] = class3.field101 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6116) {
                                class154.field2677[var6++] = class128.field2234;
                                continue;
                            }
                            if (var503 == 6117) {
                                class154.field2677[var6++] = class157.field2752 ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6118) {
                                class154.field2677[var6++] = class261.field4617;
                                continue;
                            }
                            if (var503 == 6119) {
                                class154.field2677[var6++] = class188.field3307;
                                continue;
                            }
                            if (var503 == 6120) {
                                class154.field2677[var6++] = class54.field892;
                                continue;
                            }
                            if (var503 == 6121) {
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            if (var503 == 6123) {
                                class154.field2677[var6++] = class95.method669();
                                continue;
                            }
                            if (var503 == 6124) {
                                class154.field2677[var6++] = class9.field190;
                                continue;
                            }
                            if (var503 == 6128) {
                                class154.field2677[var6++] = class190.field3332 ? 1 : 0;
                                continue;
                            }
                        } else if (var503 < 6300) {
                            if (var503 == 6200) {
                                var6 -= 2;
                                class157.field2735 = (short) class154.field2677[var6];
                                if (class157.field2735 <= 0) {
                                    class157.field2735 = 256;
                                }
                                class120.field2136 = (short) class154.field2677[var6 + 1];
                                if (class120.field2136 <= 0) {
                                    class120.field2136 = 205;
                                }
                                continue;
                            }
                            if (var503 == 6201) {
                                var6 -= 2;
                                class240.field4197 = (short) class154.field2677[var6];
                                if (class240.field4197 <= 0) {
                                    class240.field4197 = 256;
                                }
                                class102.field1678 = (short) class154.field2677[var6 + 1];
                                if (class102.field1678 <= 0) {
                                    class102.field1678 = 320;
                                }
                                continue;
                            }
                            if (var503 == 6202) {
                                var6 -= 4;
                                class58.field940 = (short) class154.field2677[var6];
                                if (class58.field940 <= 0) {
                                    class58.field940 = 1;
                                }
                                class181.field3172 = (short) class154.field2677[var6 + 1];
                                if (class181.field3172 <= 0) {
                                    class181.field3172 = 32767;
                                } else if (class181.field3172 < class58.field940) {
                                    class181.field3172 = class58.field940;
                                }
                                class17.field319 = (short) class154.field2677[var6 + 2];
                                if (class17.field319 <= 0) {
                                    class17.field319 = 1;
                                }
                                class169.field2952 = (short) class154.field2677[var6 + 3];
                                if (class169.field2952 <= 0) {
                                    class169.field2952 = 32767;
                                } else if (class169.field2952 < class17.field319) {
                                    class169.field2952 = class17.field319;
                                }
                                continue;
                            }
                            if (var503 == 6203) {
                                class140.method974((byte) -108, 0, class157.field2740.field1869, 0, false, class157.field2740.field1995);
                                class154.field2677[var6++] = class225.field3888;
                                class154.field2677[var6++] = class175.field3038;
                                continue;
                            }
                            if (var503 == 6204) {
                                class154.field2677[var6++] = class240.field4197;
                                class154.field2677[var6++] = class102.field1678;
                                continue;
                            }
                            if (var503 == 6205) {
                                class154.field2677[var6++] = class157.field2735;
                                class154.field2677[var6++] = class120.field2136;
                                continue;
                            }
                        } else if (var503 < 6400) {
                            if (var503 == 6300) {
                                class154.field2677[var6++] = (int) (class77.method569((byte) 99) / 60000L);
                                continue;
                            }
                            if (var503 == 6301) {
                                class154.field2677[var6++] = (int) (class77.method569((byte) -118) / 86400000L) - 11745;
                                continue;
                            }
                            if (var503 == 6302) {
                                var6 -= 3;
                                int var341 = class154.field2677[var6];
                                int var342 = class154.field2677[var6 + 1];
                                int var343 = class154.field2677[var6 + 2];
                                class113.field1915.clear();
                                class113.field1915.set(11, 12);
                                class113.field1915.set(var343, var342, var341);
                                class154.field2677[var6++] = (int) (class113.field1915.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var503 == 6303) {
                                class113.field1915.clear();
                                class113.field1915.setTime(new Date(class77.method569((byte) -9)));
                                class154.field2677[var6++] = class113.field1915.get(1);
                                continue;
                            }
                            if (var503 == 6304) {
                                var6--;
                                int var344 = class154.field2677[var6];
                                boolean var345 = true;
                                if (var344 < 0) {
                                    var345 = ((var344 + 1) % 4) == 0;
                                } else if (var344 < 1582) {
                                    var345 = (var344 % 4) == 0;
                                } else if (var344 % 4 != 0) {
                                    var345 = false;
                                } else if ((var344 % 100) != 0) {
                                    var345 = true;
                                } else if ((var344 % 400) != 0) {
                                    var345 = false;
                                }
                                class154.field2677[var6++] = var345 ? 1 : 0;
                                continue;
                            }
                        } else if (var503 < 6500) {
                            if (var503 == 6405) {
                                class154.field2677[var6++] = class169.method1179((byte) -80) ? 1 : 0;
                                continue;
                            }
                            if (var503 == 6406) {
                                class154.field2677[var6++] = class261.method1768(56) ? 1 : 0;
                                continue;
                            }
                        } else if (var503 < 6600) {
                            if (var503 == 6500) {
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0) {
                                    class154.field2677[var6++] = class263.method1781((byte) 122) == -1 ? 0 : 1;
                                    continue;
                                }
                                class154.field2677[var6++] = 1;
                                continue;
                            }
                            if (var503 == 6501) {
                                class2 var329 = class185.method1286(-13661);
                                if (var329 == null) {
                                    class154.field2677[var6++] = -1;
                                    class154.field2677[var6++] = 0;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var329.field88;
                                    class154.field2677[var6++] = var329.field1545;
                                    class159.field2770[var9++] = var329.field92;
                                    class145 var330 = var329.method46(0);
                                    class154.field2677[var6++] = var330.field2534;
                                    class159.field2770[var9++] = var330.field2538;
                                    class154.field2677[var6++] = var329.field1553;
                                }
                                continue;
                            }
                            if (var503 == 6502) {
                                class2 var331 = class214.method1435((byte) 35);
                                if (var331 == null) {
                                    class154.field2677[var6++] = -1;
                                    class154.field2677[var6++] = 0;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var331.field88;
                                    class154.field2677[var6++] = var331.field1545;
                                    class159.field2770[var9++] = var331.field92;
                                    class145 var332 = var331.method46(0);
                                    class154.field2677[var6++] = var332.field2534;
                                    class159.field2770[var9++] = var332.field2538;
                                    class154.field2677[var6++] = var331.field1553;
                                }
                                continue;
                            }
                            if (var503 == 6503) {
                                var6--;
                                int var333 = class154.field2677[var6];
                                if (class162.field2858 == 10 && class189.field3317 == 0 && class264.field4663 == 0 && class133.field2366 == 0) {
                                    class154.field2677[var6++] = class201.method1377((byte) 112, var333) ? 1 : 0;
                                    continue;
                                }
                                class154.field2677[var6++] = 0;
                                continue;
                            }
                            if (var503 == 6504) {
                                var6--;
                                class64.field1053 = class154.field2677[var6];
                                class47.method351(class118.field2117, -583);
                                continue;
                            }
                            if (var503 == 6505) {
                                class154.field2677[var6++] = class64.field1053;
                                continue;
                            }
                            if (var503 == 6506) {
                                var6--;
                                int var334 = class154.field2677[var6];
                                class2 var335 = class180.method1242(var334, 108);
                                if (var335 == null) {
                                    class154.field2677[var6++] = -1;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                    class159.field2770[var9++] = class8.field182;
                                    class154.field2677[var6++] = 0;
                                } else {
                                    class154.field2677[var6++] = var335.field1545;
                                    class159.field2770[var9++] = var335.field92;
                                    class145 var336 = var335.method46(0);
                                    class154.field2677[var6++] = var336.field2534;
                                    class159.field2770[var9++] = var336.field2538;
                                    class154.field2677[var6++] = var335.field1553;
                                }
                                continue;
                            }
                            if (var503 == 6507) {
                                var6 -= 4;
                                boolean var337 = class154.field2677[var6 + 3] == 1;
                                boolean var338 = class154.field2677[var6 + 1] == 1;
                                int var339 = class154.field2677[var6];
                                int var340 = class154.field2677[var6 + 2];
                                class241.method1635(var337, var340, (byte) -78, var339, var338);
                                continue;
                            }
                        } else if (var503 < 6700) {
                            if (var503 == 6600) {
                                var6--;
                                class185.field3267 = class154.field2677[var6] == 1;
                                class47.method351(class118.field2117, arg1 ^ 0x16FB);
                                continue;
                            }
                            if (var503 == 6601) {
                                class154.field2677[var6++] = class185.field3267 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var503 == 4500) {
                        var6 -= 2;
                        int var362 = class154.field2677[var6 + 1];
                        int var363 = class154.field2677[var6];
                        class27 var364 = class159.method1131((byte) -125, var362);
                        if (var364.method243(arg1 ^ 0x534A)) {
                            class159.field2770[var9++] = class131.method911((byte) -117, var363).method370(-81, var362, var364.field518);
                        } else {
                            class154.field2677[var6++] = class131.method911((byte) -125, var363).method368(var364.field515, true, var362);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var502) {
            if (var5.field3198 == null) {
                if (class128.field2232 != 0) {
                    class188.method1312(arg1 ^ 0x42952D8E, 0, class8.field182, class67.field1119);
                }
                class207.method1398("CS2 - scr:" + var5.field2827 + " op:" + var11, arg1 + 5284, var502);
            } else {
                class280 var498 = class52.method384((byte) -65, 30);
                var498.method1902(1, class201.field3521).method1902(1, var5.field3198);
                for (int var499 = class267.field4690 - 1; var499 >= 0; var499--) {
                    var498.method1902(1, class269.field4717).method1902(arg1 + 5311, class44.field730[var499].field2893.field3198);
                }
                if (var11 == 40) {
                    int var500 = var10[var8];
                    var498.method1902(1, class74.field1227).method1902(1, class249.method1685((byte) 74, var500));
                }
                if (class128.field2232 != 0) {
                    class188.method1312(arg1 ^ 0x42952D8E, 0, class8.field182, class30.method266(new class280[] { class234.field4077, var5.field3198 }, (byte) -87));
                }
                class207.method1398("CS2 - scr:" + var5.field2827 + " op:" + var11 + new String(var498.method1898((byte) -104)), 78, var502);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method546(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 != -27635) {
            field1206 = true;
        }
        field1197++;
        System.exit(1);
    }
}
