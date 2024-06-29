import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class157 extends class30 {

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "Z")
    public boolean field2754 = false;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Lia;")
    public static class257 field2752 = class28.method234(-121, "mapflag");

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Lia;")
    public static class257 field2748 = class28.method234(93, "::tele 0)1");

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "[Z")
    public static boolean[] field2747 = new boolean[100];

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Z")
    public static boolean field2751 = false;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lia;")
    public static class257 field2750 = class28.method234(74, "weiss:");

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V")
    public static final void method1095(int arg0) {
        field2749++;
        if (class131.field2347 != null || class78.field1516 != null) {
            return;
        }
        int var1 = class102.field1902;
        if (arg0 != 16496) {
            return;
        }
        if (class216.field3663) {
            if (var1 != 1) {
                int var2 = class245.field4253;
                int var3 = class102.field1904;
                if (class213.field3644 - 10 > var2 || (class182.field3152 + class213.field3644 + 10) < var2 || var3 < (class207.field3547 - 10) || class207.field3547 + class169.field2920 + 10 < var3) {
                    class216.field3663 = false;
                    class82.method617(class207.field3547, class182.field3152, (byte) -125, class169.field2920, class213.field3644);
                }
            }
            if (var1 == 1) {
                int var4 = class213.field3644;
                int var5 = class182.field3152;
                int var6 = class105.field1952;
                int var7 = class207.field3547;
                int var8 = class74.field1430;
                int var9 = -1;
                for (int var10 = 0; var10 < class199.field3407; var10++) {
                    int var11 = var7 + ((class199.field3407 + -1 + -var10) * 15) + 31;
                    if (var6 > var4 && var6 < (var4 + var5) && var8 > (var11 - 13) && var8 < (var11 + 3)) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class227.method1486(var9, arg0 ^ 0xFFFFBFFD);
                }
                class216.field3663 = false;
                class82.method617(class207.field3547, class182.field3152, (byte) -85, class169.field2920, class213.field3644);
                return;
            }
            return;
        }
        if (var1 == 1 && class199.field3407 > 0) {
            short var12 = class32.field616[class199.field3407 - 1];
            if (var12 == 38 || var12 == 40 || var12 == 23 || var12 == 57 || var12 == 36 || var12 == 41 || var12 == 29 || var12 == 13 || var12 == 42 || var12 == 17 || var12 == 32 || var12 == 1003) {
                int var13 = class12.field236[class199.field3407 - 1];
                int var14 = class227.field3817[class199.field3407 - 1];
                class44 var15 = class221.method1456(var14, (byte) -52);
                if (class26.method229(17431692, client.method590(var15)) || class114.method819(true, client.method590(var15))) {
                    class156.field2736 = false;
                    class95.field1790 = 0;
                    if (class131.field2347 != null) {
                        class257.method1718(false, class131.field2347);
                    }
                    class131.field2347 = class221.method1456(var14, (byte) -57);
                    class156.field2729 = class74.field1430;
                    class177.field3029 = var13;
                    class24.field464 = class105.field1952;
                    class257.method1718(false, class131.field2347);
                    return;
                }
            }
        }
        if (var1 == 1 && (class227.field3821 == 1 && class199.field3407 > 2 || class11.method123(class199.field3407 - 1, (byte) -90))) {
            var1 = 2;
        }
        if (var1 == 1 && class199.field3407 > 0) {
            class227.method1486(class199.field3407 - 1, arg0 ^ 0xFFFFBFE2);
        }
        if (var1 != 2 || class199.field3407 <= 0) {
            return;
        }
        class140.method954(0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lrd;IIIIIIZ)V")
    public static final void method1096(class122 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2206.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2206[var9] - class26.field512;
            int var23 = arg0.field2192[var9] - class18.field393;
            int var24 = arg0.field2187[var9] - class224.field3765;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2189 != null) {
                class122.field2197[var9] = var25;
                class122.field2204[var9] = var28;
                class122.field2199[var9] = var29;
            }
            class122.field2198[var9] = (var25 << 9) / var29 + class101.field1857;
            class122.field2195[var9] = (var28 << 9) / var29 + class101.field1861;
        }
        class101.field1868 = 0;
        int var10 = arg0.field2202.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2202[var11];
            int var13 = arg0.field2205[var11];
            int var14 = arg0.field2188[var11];
            int var15 = class122.field2198[var12];
            int var16 = class122.field2198[var13];
            int var17 = class122.field2198[var14];
            int var18 = class122.field2195[var12];
            int var19 = class122.field2195[var13];
            int var20 = class122.field2195[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (field2751 && class38.method311(class162.field2836 + class101.field1857, class139.field2479 + class101.field1861, var18, var19, var20, var15, var16, var17)) {
                    class156.field2741 = arg5;
                    class108.field2021 = arg6;
                }
                if (!arg7) {
                    class101.field1869 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class101.field1858 || var16 > class101.field1858 || var17 > class101.field1858) {
                        class101.field1869 = true;
                    }
                    if (arg0.field2189 == null || arg0.field2189[var11] == -1) {
                        if (arg0.field2191[var11] != 12345678) {
                            class101.method733(var18, var19, var20, var15, var16, var17, arg0.field2191[var11], arg0.field2201[var11], arg0.field2190[var11]);
                        }
                    } else if (!class152.field2649) {
                        int var21 = class101.field1870.method97(arg0.field2189[var11], 65535);
                        class101.method733(var18, var19, var20, var15, var16, var17, class19.method173(var21, arg0.field2191[var11]), class19.method173(var21, arg0.field2201[var11]), class19.method173(var21, arg0.field2190[var11]));
                    } else if (arg0.field2203) {
                        class101.method736(var18, var19, var20, var15, var16, var17, arg0.field2191[var11], arg0.field2201[var11], arg0.field2190[var11], class122.field2197[0], class122.field2197[1], class122.field2197[3], class122.field2204[0], class122.field2204[1], class122.field2204[3], class122.field2199[0], class122.field2199[1], class122.field2199[3], arg0.field2189[var11]);
                    } else {
                        class101.method736(var18, var19, var20, var15, var16, var17, arg0.field2191[var11], arg0.field2201[var11], arg0.field2190[var11], class122.field2197[var12], class122.field2197[var13], class122.field2197[var14], class122.field2204[var12], class122.field2204[var13], class122.field2204[var14], class122.field2199[var12], class122.field2199[var13], class122.field2199[var14], arg0.field2189[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method1097(boolean arg0) {
        field2747 = null;
        field2750 = null;
        if (arg0) {
            field2752 = null;
        }
        field2752 = null;
        field2748 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILad;)V")
    public static final void method1098(int arg0, class241 arg1) {
        field2745++;
        arg1.field4142 = false;
        if (arg1.field4170 != -1) {
            class31 var2 = class186.method1263(arg0 - 13, arg1.field4170);
            if (var2 == null || var2.field589 == null) {
                arg1.field4170 = -1;
            } else {
                arg1.field4131++;
                if (arg1.field4187 < var2.field589.length && arg1.field4131 > var2.field603[arg1.field4187]) {
                    arg1.field4131 = 1;
                    arg1.field4187++;
                    class132.method918(arg1.field4143, class137.field2441 == arg1, arg1.field4187, var2, arg0 - 115, arg1.field4177);
                }
                if (arg1.field4187 >= var2.field589.length) {
                    arg1.field4131 = 0;
                    arg1.field4187 = 0;
                    class132.method918(arg1.field4143, class137.field2441 == arg1, arg1.field4187, var2, 92, arg1.field4177);
                }
            }
        }
        if (arg1.field4172 != -1 && class7.field153 >= arg1.field4186) {
            if (arg1.field4150 < 0) {
                arg1.field4150 = 0;
            }
            int var3 = class152.method1059(arg1.field4172, true).field3713;
            if (var3 == -1) {
                arg1.field4172 = -1;
            } else {
                class31 var4 = class186.method1263(0, var3);
                if (var4 == null || var4.field589 == null) {
                    arg1.field4172 = -1;
                } else {
                    arg1.field4181++;
                    if (arg1.field4150 < var4.field589.length && arg1.field4181 > var4.field603[arg1.field4150]) {
                        arg1.field4181 = 1;
                        arg1.field4150++;
                        class132.method918(arg1.field4143, class137.field2441 == arg1, arg1.field4150, var4, arg0 + 80, arg1.field4177);
                    }
                    if (var4.field589.length <= arg1.field4150) {
                        arg1.field4172 = -1;
                    }
                }
            }
        }
        if (arg1.field4129 != -1 && arg1.field4144 <= 1) {
            class31 var5 = class186.method1263(arg0 - 13, arg1.field4129);
            if (var5.field595 == 1 && arg1.field4167 > 0 && class7.field153 >= arg1.field4155 && class7.field153 > arg1.field4122) {
                arg1.field4144 = 1;
                return;
            }
        }
        if (arg0 != 13) {
            return;
        }
        if (arg1.field4129 != -1 && arg1.field4144 == 0) {
            class31 var6 = class186.method1263(0, arg1.field4129);
            if (var6 == null || var6.field589 == null) {
                arg1.field4129 = -1;
            } else {
                arg1.field4139++;
                if (arg1.field4120 < var6.field589.length && arg1.field4139 > var6.field603[arg1.field4120]) {
                    arg1.field4120++;
                    arg1.field4139 = 1;
                    class132.method918(arg1.field4143, class137.field2441 == arg1, arg1.field4120, var6, arg0 + 84, arg1.field4177);
                }
                if (var6.field589.length <= arg1.field4120) {
                    arg1.field4127++;
                    arg1.field4120 -= var6.field586;
                    if (var6.field588 <= arg1.field4127) {
                        arg1.field4129 = -1;
                    } else if (arg1.field4120 >= 0 && arg1.field4120 < var6.field589.length) {
                        class132.method918(arg1.field4143, class137.field2441 == arg1, arg1.field4120, var6, 46, arg1.field4177);
                    } else {
                        arg1.field4129 = -1;
                    }
                }
                arg1.field4142 = var6.field609;
            }
        }
        if (arg1.field4144 > 0) {
            arg1.field4144--;
        }
    }
}
