import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class121 extends class59 {

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    private int field2367 = 3216;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "[I")
    private int[] field2363 = new int[3];

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    private int field2362 = 4096;

    @OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
    private int field2382 = 3216;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "Z")
    public static boolean field2369 = false;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lb;")
    public static class11 field2371 = new class11(128);

    @OriginalMember(owner = "client!nd", name = "hb", descriptor = "[I")
    public static int[] field2374 = new int[200];

    @OriginalMember(owner = "client!nd", name = "jb", descriptor = "[[I")
    public static int[][] field2376 = new int[104][104];

    @OriginalMember(owner = "client!nd", name = "nb", descriptor = "Z")
    public static boolean field2380 = true;

    @OriginalMember(owner = "client!nd", name = "mb", descriptor = "Z")
    public static boolean field2379 = false;

    @OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lsd;")
    public static class166 field2383 = class135.method935("Geben Sie Ihren Benutzernamen", 0);

    @OriginalMember(owner = "client!nd", name = "ib", descriptor = "Lsd;")
    public static class166 field2375 = class135.method935("au", 0);

    @OriginalMember(owner = "client!nd", name = "kb", descriptor = "Lsd;")
    private static class166 field2377 = class135.method935("Loaded wordpack", 0);

    @OriginalMember(owner = "client!nd", name = "lb", descriptor = "Lsd;")
    public static class166 field2378 = class135.method935("weiss:", 0);

    @OriginalMember(owner = "client!nd", name = "rb", descriptor = "Lsd;")
    public static class166 field2384 = field2377;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!nd", name = "ob", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIB)I")
    public static final int method869(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -77) {
            return -77;
        } else {
            if (arg1 > 179) {
                arg2 /= 2;
            }
            ++field2366;
            if (arg1 > 192) {
                arg2 /= 2;
            }
            if (~arg1 < -218) {
                arg2 /= 2;
            }
            if (arg1 > 243) {
                arg2 /= 2;
            }
            return arg1 / 2 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field2361;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2367 = arg0.method405(2);
                }
            } else {
                this.field2382 = arg0.method405(2);
            }
        } else {
            this.field2362 = arg0.method405(2);
        }
        if (arg1 < 18) {
            this.method287(-73);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)V")
    public static final void method870(int arg0, int arg1, int arg2) {
        ++field2370;
        class165 var3 = class111.field2144[class165.field3130][arg2][arg0];
        if (var3 == null) {
            class131.field2556.method611(class165.field3130, arg2, arg0);
        } else {
            class34 var4 = null;
            int var5 = arg1;
            for (class34 var6 = (class34) var3.method1109((byte) -122); var6 != null; var6 = (class34) var3.method1115((byte) 120)) {
                class57 var11 = class3.method19(var6.field642, true);
                int var12 = var11.field1127;
                if (~var11.field1137 == -2) {
                    var12 = (var6.field652 - -1) * var12;
                }
                if (var12 > var5) {
                    var5 = var12;
                    var4 = var6;
                }
            }
            if (var4 == null) {
                class131.field2556.method611(class165.field3130, arg2, arg0);
            } else {
                var3.method1105(1208005, var4);
                class34 var7 = null;
                class34 var8 = (class34) var3.method1109((byte) -85);
                class34 var9 = null;
                int var10 = (arg0 << 7) + arg2 + 1610612736;
                while (var8 != null) {
                    if (var4.field642 != var8.field642) {
                        if (var9 == null) {
                            var9 = var8;
                        }
                        if (~var8.field642 != ~var9.field642 && var7 == null) {
                            var7 = var8;
                        }
                    }
                    var8 = (class34) var3.method1115((byte) -115);
                }
                class131.field2556.method596(class165.field3130, arg2, arg0, class119.method864(arg2 * 128 + 64, arg0 * 128 - -64, class165.field3130, true), var4, var10, var9, var7);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class121() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
    private final void method871(int arg0) {
        double var2 = Math.cos((double) (this.field2367 / 4096));
        this.field2363[0] = (int) (var2 * Math.sin((double) (this.field2382 / 4096)) * 4096.0D);
        this.field2363[1] = (int) (var2 * Math.cos((double) (this.field2382 / 4096)) * 4096.0D);
        ++field2359;
        this.field2363[2] = (int) (Math.sin((double) (this.field2367 / 4096)) * 4096.0D);
        int var4 = this.field2363[0] * this.field2363[0] >> 12;
        int var5 = this.field2363[1] * this.field2363[1] >> 12;
        int var6 = this.field2363[2] * this.field2363[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (arg0 != var7) {
            this.field2363[0] = (this.field2363[0] << 12) / var7;
            this.field2363[2] = (this.field2363[2] << 12) / var7;
            this.field2363[1] = (this.field2363[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    public static final void method872(boolean arg0) {
        ++field2364;
        if (class153.field2949 != null) {
            class153.field2949.method1170(false);
        }
        if (class89.field1761 != null) {
            class89.field1761.method1170(false);
        }
        if (arg0) {
            field2374 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method873(int arg0, Component arg1) {
        ++field2372;
        arg1.removeKeyListener(class4.field80);
        arg1.removeFocusListener(class4.field80);
        if (arg0 == -22727) {
            class62.field1284 = -1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILud;)V")
    public static final void method874(int arg0, class184 arg1) {
        arg1.field3534 = false;
        if (arg0 != 3532) {
            field2377 = null;
        }
        if (~arg1.field3491 != 0) {
            class62 var2 = class110.method798(arg1.field3491, 12);
            if (var2 != null && var2.field1279 != null) {
                ++arg1.field3506;
                if (~arg1.field3531 > ~var2.field1279.length && ~var2.field1268[arg1.field3531] > ~arg1.field3506) {
                    arg1.field3506 = 1;
                    ++arg1.field3531;
                    class115.method836(arg0 ^ -3506, class41.field728 == arg1, arg1.field3531, arg1.field3513, var2, arg1.field3526);
                }
                if (arg1.field3531 >= var2.field1279.length) {
                    arg1.field3506 = 0;
                    arg1.field3531 = 0;
                    class115.method836(110, class41.field728 == arg1, arg1.field3531, arg1.field3513, var2, arg1.field3526);
                }
            } else {
                arg1.field3491 = -1;
            }
        }
        ++field2373;
        if (arg1.field3501 != -1 && class49.field910 >= arg1.field3533) {
            if (arg1.field3550 < 0) {
                arg1.field3550 = 0;
            }
            int var3 = class12.method77(arg1.field3501, 13).field2275;
            if (~var3 == 0) {
                arg1.field3501 = -1;
            } else {
                class62 var4 = class110.method798(var3, 12);
                if (var4 != null && var4.field1279 != null) {
                    ++arg1.field3517;
                    if (arg1.field3550 < var4.field1279.length && arg1.field3517 > var4.field1268[arg1.field3550]) {
                        arg1.field3517 = 1;
                        ++arg1.field3550;
                        class115.method836(-107, class41.field728 == arg1, arg1.field3550, arg1.field3513, var4, arg1.field3526);
                    }
                    if (~arg1.field3550 <= ~var4.field1279.length && (~arg1.field3550 > -1 || ~var4.field1279.length >= ~arg1.field3550)) {
                        arg1.field3501 = -1;
                    }
                } else {
                    arg1.field3501 = -1;
                }
            }
        }
        if (arg1.field3543 != -1 && ~arg1.field3530 >= -2) {
            class62 var5 = class110.method798(arg1.field3543, 12);
            if (~var5.field1271 == -2 && ~arg1.field3483 < -1 && ~arg1.field3475 >= ~class49.field910 && arg1.field3479 < class49.field910) {
                arg1.field3530 = 1;
                return;
            }
        }
        if (~arg1.field3543 != 0 && arg1.field3530 == 0) {
            class62 var6 = class110.method798(arg1.field3543, 12);
            if (var6 != null && var6.field1279 != null) {
                ++arg1.field3519;
                if (var6.field1279.length > arg1.field3529 && var6.field1268[arg1.field3529] < arg1.field3519) {
                    arg1.field3519 = 1;
                    ++arg1.field3529;
                    class115.method836(arg0 + -3575, class41.field728 == arg1, arg1.field3529, arg1.field3513, var6, arg1.field3526);
                }
                if (arg1.field3529 >= var6.field1279.length) {
                    ++arg1.field3547;
                    arg1.field3529 -= var6.field1267;
                    if (var6.field1277 <= arg1.field3547) {
                        arg1.field3543 = -1;
                    } else if (~arg1.field3529 <= -1 && ~var6.field1279.length < ~arg1.field3529) {
                        class115.method836(arg0 ^ 3515, class41.field728 == arg1, arg1.field3529, arg1.field3513, var6, arg1.field3526);
                    } else {
                        arg1.field3543 = -1;
                    }
                }
                arg1.field3534 = var6.field1270;
            } else {
                arg1.field3543 = -1;
            }
        }
        if (arg1.field3530 > 0) {
            --arg1.field3530;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        if (arg1 >= -124) {
            field2369 = true;
        }
        ++field2368;
        int[] var3 = super.field1219.method721(arg0, -127);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0 + -1 & class137.field2679, 0);
            int[] var5 = this.method499(0, arg0, 0);
            int[] var6 = this.method499(0, arg0 + 1 & class137.field2679, 0);
            for (int var7 = 0; ~class98.field1879 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2362;
                int var9 = (var5[class187.field3571 & var7 + 1] + -var5[var7 - 1 & class187.field3571]) * this.field2362;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var12 - -var13 - -4096) / 4096)) * 4096.0D);
                int var15;
                int var16;
                int var17;
                if (~var14 == -1) {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                } else {
                    var15 = var9 / var14;
                    var16 = 16777216 / var14;
                    var17 = var8 / var14;
                }
                int var18 = this.field2363[0] * var15 >> 12;
                int var19 = this.field2363[1] * var17 >> 12;
                int var20 = this.field2363[2] * var16 >> 12;
                var3[var7] = var18 + var20 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.method871(0);
        ++field2365;
        if (arg0 != 23459) {
            field2376 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(III)Lvd;")
    public static final class193 method875(int arg0, int arg1, int arg2) {
        ++field2381;
        if (arg2 < 93) {
            return null;
        } else {
            class193 var3 = class90.method701(-31355, arg1);
            if (~arg0 == 0) {
                return var3;
            } else {
                return var3 != null && var3.field3829 != null && ~var3.field3829.length < ~arg0 ? var3.field3829[arg0] : null;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method876(byte arg0) {
        field2383 = null;
        field2384 = null;
        field2371 = null;
        field2378 = null;
        field2374 = null;
        field2376 = null;
        field2375 = null;
        int var1 = 53 % ((arg0 - 81) / 45);
        field2377 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)Lt;")
    public static final class171 method877(byte arg0, int arg1) {
        int var2 = -70 / ((arg0 - 31) / 58);
        class171 var3 = (class171) class110.field2135.method64((byte) 28, (long) arg1);
        ++field2360;
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class131.field2564.method353(5, arg1, -120);
            class171 var5 = new class171();
            if (var4 != null) {
                var5.method1188(-3993, new class53(var4));
            }
            class110.field2135.method67(var5, 15266, (long) arg1);
            return var5;
        }
    }
}
