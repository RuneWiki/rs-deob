import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static volatile int field462 = -1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "[I")
    public static int[] field469 = new int[100];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
    public static boolean field463 = false;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    public static int[] field471 = new int[2048];

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
    public static int[] field473 = new int[50];

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lid;")
    private static class60 field476 = class11.method72("Loading )2 please wait)3", (byte) 97);

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lid;")
    public static class60 field465 = field476;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lie;")
    public static class61 field467;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lid;I)[Lid;")
    public static final class60[] method154(class60[] arg0, int arg1) {
        if (arg1 != -30876) {
            field463 = false;
        }
        class60[] var2 = new class60[5];
        field466++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class104.method853(class81.method682(arg1, 30967), new class60[] { class98.method774((byte) -121, var3), class97.field2384 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class104.method853(-78, new class60[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)V")
    public static final void method155(byte arg0, int arg1, int arg2) {
        field475++;
        if (class106.field2625 != 2) {
            return;
        }
        if (arg0 != 42) {
            method155((byte) -70, -97, -67);
        }
        class44.method343((byte) -77, (class151.field3396 - class144.field3240 << 7) + class100.field2422, class8.field116 * 2, (class12.field229 - class41.field1095 << 7) + class153.field3448);
        if (class146.field3284 > -1 && class82.field2065 % 20 < 10) {
            class25.field612[0].method29(class146.field3284 + arg2 - 12, arg1 + -28 - -class109.field2660);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)V")
    public static final void method156(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -65) {
            method160(-69, 15, 43);
        }
        class139.method1080((byte) 88);
        field472++;
        class130.method1021(arg3, arg2, class50.field1274.field698 + arg3, arg2 - -class50.field1274.field695);
        if (class46.field1200 == 2 || class46.field1200 == 5) {
            class130.method1028(arg3 + 25, arg2 + 5, 0, class62.field1553, class89.field2222);
        } else {
            int var4 = class157.field3590 + class151.field3394 & 0x7FF;
            int var5 = class107.field2640.field854 / 32 + 48;
            int var6 = 464 - class107.field2640.field828 / 32;
            class30.field700.method36(arg3 + 25, arg2 - -5, 146, 151, var5, var6, var4, class145.field3271 + 256, class62.field1553, class89.field2222);
            for (int var7 = 0; var7 < class64.field1608; var7++) {
                int var37 = class90.field2252[var7] * 4 + 2 - class107.field2640.field854 / 32;
                int var38 = class74.field1792[var7] * 4 + 2 - class107.field2640.field828 / 32;
                class64.method493(arg2, arg3, class42.field1120[var7], (byte) 61, var37, var38);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class66 var34 = class107.field2637[class46.field1222][var8][var33];
                    if (var34 != null) {
                        int var35 = var33 * 4 + 2 - class107.field2640.field828 / 32;
                        int var36 = var8 * 4 + 2 - class107.field2640.field854 / 32;
                        class64.method493(arg2, arg3, class109.field2652[0], (byte) 25, var36, var35);
                    }
                }
            }
            for (int var9 = 0; var9 < class72.field1748; var9++) {
                class53 var29 = class5.field83[class1.field1[var9]];
                if (var29 != null && var29.method2((byte) 37)) {
                    class154 var30 = var29.field1337;
                    if (var30 != null && var30.field3499 != null) {
                        var30 = var30.method1169(-14424);
                    }
                    if (var30 != null && var30.field3494 && var30.field3497) {
                        int var31 = var29.field854 / 32 - class107.field2640.field854 / 32;
                        int var32 = var29.field828 / 32 - class107.field2640.field828 / 32;
                        class64.method493(arg2, arg3, class109.field2652[1], (byte) 59, var31, var32);
                    }
                }
            }
            for (int var10 = 0; var10 < class44.field1170; var10++) {
                class1 var21 = class81.field2016[class121.field2781[var10]];
                if (var21 != null && var21.method2((byte) 37)) {
                    int var22 = var21.field854 / 32 - class107.field2640.field854 / 32;
                    int var23 = var21.field828 / 32 - class107.field2640.field828 / 32;
                    boolean var24 = false;
                    long var25 = var21.field21.method430(80);
                    for (int var27 = 0; var27 < class103.field2502; var27++) {
                        if (class136.field3082[var27] == var25 && class89.field2210[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class107.field2640.field4 != 0 && var21.field4 != 0 && class107.field2640.field4 == var21.field4) {
                        var28 = true;
                    }
                    if (var24) {
                        class64.method493(arg2, arg3, class109.field2652[3], (byte) -120, var22, var23);
                    } else if (var28) {
                        class64.method493(arg2, arg3, class109.field2652[4], (byte) -97, var22, var23);
                    } else {
                        class64.method493(arg2, arg3, class109.field2652[2], (byte) 100, var22, var23);
                    }
                }
            }
            if (class106.field2625 != 0 && class82.field2065 % 20 < 10) {
                if (class106.field2625 == 1 && class75.field1799 >= 0 && class5.field83.length > class75.field1799) {
                    class53 var11 = class5.field83[class75.field1799];
                    if (var11 != null) {
                        int var12 = var11.field854 / 32 - class107.field2640.field854 / 32;
                        int var13 = var11.field828 / 32 - class107.field2640.field828 / 32;
                        class141.method1099(arg3, var13, class72.field1732[1], (byte) -114, var12, arg2);
                    }
                }
                if (class106.field2625 == 2) {
                    int var14 = (class12.field229 - class41.field1095) * 4 + 2 - class107.field2640.field854 / 32;
                    int var15 = (class151.field3396 - class144.field3240) * 4 + 2 - class107.field2640.field828 / 32;
                    class141.method1099(arg3, var15, class72.field1732[1], (byte) -67, var14, arg2);
                }
                if (class106.field2625 == 10 && class145.field3263 >= 0 && class81.field2016.length > class145.field3263) {
                    class1 var16 = class81.field2016[class145.field3263];
                    if (var16 != null) {
                        int var17 = var16.field828 / 32 - class107.field2640.field828 / 32;
                        int var18 = var16.field854 / 32 - class107.field2640.field854 / 32;
                        class141.method1099(arg3, var17, class72.field1732[1], (byte) -67, var18, arg2);
                    }
                }
            }
            if (class48.field1267 != 0) {
                int var19 = class48.field1267 * 4 + 2 - class107.field2640.field854 / 32;
                int var20 = class59.field1438 * 4 + 2 - class107.field2640.field828 / 32;
                class64.method493(arg2, arg3, class72.field1732[0], (byte) 110, var19, var20);
            }
            class130.method1015(arg3 + 93 + 4, arg2 + 82 + -4, 3, 3, 16777215);
        }
        if (class46.field1200 < 3) {
            class60.field1468.method36(arg3, arg2, 33, 33, 25, 25, class157.field3590, 256, class124.field2840, class61.field1548);
        } else {
            class130.method1028(arg3, arg2, 0, class124.field2840, class61.field1548);
        }
        if (class32.field757[arg0]) {
            class50.field1274.method224(arg3, arg2);
        }
        class47.field1237[arg0] = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static final void method157(byte arg0) {
        field468++;
        int var1 = 0;
        if (arg0 != -6) {
            field470 = -19;
        }
        while (var1 < class35.field884) {
            int var2 = field471[var1];
            class53 var3 = class5.field83[var2];
            int var4 = class56.field1393.method829((byte) 28);
            if ((var4 & 0x8) != 0) {
                int var5 = class56.field1393.method823((byte) 118);
                int var6 = class56.field1393.method849(arg0 ^ 0xFFFFFFFB);
                var3.method269(var6, arg0 + 1, var5, class82.field2065);
                var3.field815 = class82.field2065 + 300;
                var3.field837 = class56.field1393.method823((byte) -123);
                var3.field880 = class56.field1393.method823((byte) 122);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1337 = class73.method562(class56.field1393.method850((byte) 123), (byte) 103);
                var3.field832 = var3.field1337.field3455;
                var3.field810 = var3.field1337.field3461;
                var3.field859 = var3.field1337.field3486;
                var3.field871 = var3.field1337.field3495;
                var3.field816 = var3.field1337.field3468;
                var3.field876 = var3.field1337.field3470;
                var3.field813 = var3.field1337.field3485;
                var3.field825 = var3.field1337.field3496;
                var3.field872 = var3.field1337.field3463;
            }
            if ((var4 & 0x80) != 0) {
                int var7 = class56.field1393.method831(false);
                int var8 = class56.field1393.method831(false);
                var3.method269(var8, -5, var7, class82.field2065);
                var3.field815 = class82.field2065 + 300;
                var3.field837 = class56.field1393.method829((byte) -108);
                var3.field880 = class56.field1393.method849(1);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class56.field1393.method850((byte) 124);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class56.field1393.method831(false);
                if (var3.field806 == var9 && var9 != -1) {
                    int var11 = class44.method344(var9, (byte) -120).field1208;
                    if (var11 == 1) {
                        var3.field811 = 0;
                        var3.field853 = 0;
                        var3.field858 = 0;
                        var3.field842 = var10;
                    }
                    if (var11 == 2) {
                        var3.field853 = 0;
                    }
                } else if (var9 == -1 || var3.field806 == -1 || class44.method344(var9, (byte) -50).field1199 >= class44.method344(var3.field806, (byte) -97).field1199) {
                    var3.field842 = var10;
                    var3.field811 = 0;
                    var3.field806 = var9;
                    var3.field853 = 0;
                    var3.field858 = 0;
                    var3.field844 = var3.field843;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field861 = class56.field1393.method841(27330);
                var3.field831 = 100;
            }
            if ((var4 & 0x2) != 0) {
                var3.field807 = class56.field1393.method810(-1384376976);
                if (var3.field807 == 65535) {
                    var3.field807 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field887 = class56.field1393.method808(-20054);
                var3.field848 = class56.field1393.method808(-20054);
            }
            if ((var4 & 0x40) != 0) {
                var3.field839 = class56.field1393.method808(arg0 - 20048);
                int var12 = class56.field1393.method840(true);
                var3.field846 = class82.field2065 + (var12 & 0xFFFF);
                var3.field860 = 0;
                if (var3.field839 == 65535) {
                    var3.field839 = -1;
                }
                var3.field850 = 0;
                if (var3.field846 > class82.field2065) {
                    var3.field850 = -1;
                }
                var3.field830 = var12 >> 16;
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method158(byte arg0) {
        field467 = null;
        field469 = null;
        field473 = null;
        field465 = null;
        if (arg0 < -71) {
            field476 = null;
            field471 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        class112.field2686 = new class66();
        if (arg0 != 39) {
            method158((byte) -30);
        }
        field464++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
    public static final void method160(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg1);
        if (arg2 != 8) {
            return;
        }
        class93 var5 = (class93) class32.field741.method716((byte) 40, var3);
        field474++;
        if (var5 != null) {
            class104.field2547.method1149(var5, 1);
        }
    }
}
