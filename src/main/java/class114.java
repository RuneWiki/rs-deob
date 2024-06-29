import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class114 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[Lj;")
    public static class153[] field1778 = new class153[2048];

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Luf;")
    public static class168 field1785 = class148.method1019(-1720, "Schlie-8en");

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1783 = -1;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Luf;")
    public static class168 field1780 = class148.method1019(-1720, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1786 = 0;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    public static int[] field1781 = new int[2];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lj;")
    public static class153 field1779;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method832(int arg0, int arg1) {
        if (arg1 == -1) {
            field1784++;
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 16)
    public static void method833(int arg0) {
        field1778 = null;
        field1780 = null;
        field1779 = null;
        field1781 = null;
        field1785 = null;
        if (arg0 != -24135) {
            method836(103);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZII)V", line = 32)
    public static final void method834(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1777++;
        if (class282.field4739 == arg2 && class144.field2221 == arg6 && class199.field3288 == arg3 || class155.method1102(10)) {
            return;
        }
        class282.field4739 = arg2;
        class144.field2221 = arg6;
        class199.field3288 = arg3;
        if (class155.method1102(-123)) {
            class199.field3288 = 0;
        }
        if (arg4) {
            class109.method810(28, 8858);
        } else {
            class109.method810(25, 8858);
        }
        class113.method830(true, 13, class70.field920);
        int var7 = class276.field4641;
        int var8 = class182.field2916;
        class276.field4641 = arg6 * 8 - 48;
        class182.field2916 = (arg2 - 6) * 8;
        class262.field4453 = class14.method55(true, class282.field4739 * 8, class144.field2221 * 8);
        int var9 = class182.field2916 - var8;
        int var10 = class182.field2916;
        int var11 = class276.field4641 - var7;
        int var12 = class276.field4641;
        if (arg4) {
            class2.field15 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class22 var14 = class190.field3065[var13];
                if (var14 != null) {
                    var14.field3027 -= var9 * 128;
                    var14.field3021 -= var11 * 128;
                    if (var14.field3027 >= 0 && var14.field3027 <= 13184 && var14.field3021 >= 0 && var14.field3021 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field3020[var15] -= var9;
                            var14.field3033[var15] -= var11;
                        }
                        class116.field1814[class2.field15++] = var13;
                    } else {
                        class190.field3065[var13].field267 = null;
                        class190.field3065[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class22 var17 = class190.field3065[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field3020[var18] -= var9;
                        var17.field3033[var18] -= var11;
                    }
                    var17.field3021 -= var11 * 128;
                    var17.field3027 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class54 var20 = class9.field117[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field3020[var21] -= var9;
                    var20.field3033[var21] -= var11;
                }
                var20.field3021 -= var11 * 128;
                var20.field3027 -= var9 * 128;
            }
        }
        if (arg5 < 82) {
            field1785 = (class168) null;
        }
        byte var22 = 1;
        byte var23 = 0;
        byte var24 = 0;
        byte var25 = 104;
        byte var26 = 104;
        byte var27 = 1;
        if (var9 < 0) {
            var22 = -1;
            var25 = -1;
            var24 = 103;
        }
        if (var11 < 0) {
            var26 = -1;
            var23 = 103;
            var27 = -1;
        }
        class79.field1127 = arg3;
        class266.field4489.method1334(false, arg1, (byte) -111, arg0);
        for (int var28 = var24; var28 != var25; var28 += var22) {
            for (int var29 = var23; var29 != var26; var29 += var27) {
                int var30 = var28 + var9;
                int var31 = var11 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class71.field952[var32][var28][var29] = class71.field952[var32][var30][var31];
                    } else {
                        class71.field952[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class117 var33 = (class117) class31.field369.method442(65293); var33 != null; var33 = (class117) class31.field369.method440(3)) {
            var33.field1829 -= var11;
            var33.field1828 -= var9;
            if (var33.field1828 < 0 || var33.field1829 < 0 || var33.field1828 >= 104 || var33.field1829 >= 104) {
                var33.method124((byte) 118);
            }
        }
        class36.field414 = 0;
        if (arg4) {
            class253.field4340 -= var11;
            class233.field3748 -= var9;
            class165.field2645 -= var11;
            class262.field4452 -= var9;
        } else {
            class289.field4867 = 1;
        }
        if (class151.field2348 != 0) {
            class151.field2348 -= var9;
            class215.field3509 -= var11;
        }
        if (arg4 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class39.method215(-27197);
        }
        class124.field1923 = -1;
        class1.field2.method453(255);
        class53.field655.method453(255);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V", line = 294)
    public static final void method835(int arg0, int arg1) {
        field1787++;
        class49 var2 = new class49(512, 512);
        int[] var3 = var2.field598;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = ((52736 - var6 * 512) * 4) + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class159.field2520[arg0][var8][var6] & 0x18) == 0) {
                    class278.method1922(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class159.field2520[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class278.method1922(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method276();
        int var9 = ((int) (Math.random() * 20.0D)) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 228;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var11 = 1;
        int var12 = 74 / ((46 - arg1) / 54);
        while (var11 < 103) {
            for (int var13 = 1; var13 < 103; var13++) {
                if ((class159.field2520[arg0][var13][var11] & 0x18) == 0) {
                    class298.method2046(var11, var10, arg0, var13, true, var9);
                }
                if (arg0 < 3 && (class159.field2520[arg0 + 1][var13][var11] & 0x8) != 0) {
                    class298.method2046(var11, var10, arg0 + 1, var13, true, var9);
                }
            }
            var11++;
        }
        class262.field4443 = 0;
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                long var16 = class91.method648(class79.field1127, var14, var15);
                if (var16 != 0L) {
                    class161 var18 = class15.method64(Integer.MAX_VALUE & (int) (var16 >>> 32), false);
                    int var19 = var18.field2556;
                    if (var18.field2553 != null) {
                        for (int var20 = 0; var20 < var18.field2553.length; var20++) {
                            if (var18.field2553[var20] != -1) {
                                class161 var21 = class15.method64(var18.field2553[var20], false);
                                if (var21.field2556 >= 0) {
                                    var19 = var21.field2556;
                                    break;
                                }
                            }
                        }
                    }
                    if (var19 >= 0) {
                        int var22 = var14;
                        int var23 = var15;
                        if (var19 != 22 && var19 != 29 && var19 != 34 && var19 != 36 && var19 != 46 && var19 != 47 && var19 != 48) {
                            int[][] var24 = class140.field2176[class79.field1127].field4317;
                            for (int var25 = 0; var25 < 10; var25++) {
                                int var26 = (int) (Math.random() * 4.0D);
                                if (var26 == 0 && var22 > 0 && var22 > (var14 - 3) && (var24[var22 - 1][var23] & 0x12C0108) == 0) {
                                    var22--;
                                }
                                if (var26 == 1 && var22 < 103 && (var14 + 3) > var22 && (var24[var22 + 1][var23] & 0x12C0180) == 0) {
                                    var22++;
                                }
                                if (var26 == 2 && var23 > 0 && var15 - 3 < var23 && (var24[var22][var23 - 1] & 0x12C0102) == 0) {
                                    var23--;
                                }
                                if (var26 == 3 && var23 < 103 && (var15 + 3) > var23 && (var24[var22][var23 + 1] & 0x12C0120) == 0) {
                                    var23++;
                                }
                            }
                        }
                        class274.field4617[class262.field4443] = var18.field2579;
                        class216.field3528[class262.field4443] = var22;
                        class274.field4611[class262.field4443] = var23;
                        class262.field4443++;
                    }
                }
            }
        }
        for (int var27 = 0; var27 < var4; var27++) {
            if (var3[var27] == 0) {
                var3[var27] = 1;
            }
        }
        class207.field3394 = new class258(var2);
        class277.field4657 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 507)
    public static final void method836(int arg0) {
        if (class193.field3143 == 10) {
            class109.method810(28, 8858);
        }
        field1782++;
        if (arg0 <= -116 && class193.field3143 == 30) {
            class109.method810(25, 8858);
        }
    }
}
