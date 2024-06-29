import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class203 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public boolean field3330 = true;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Z")
    public boolean field3326 = true;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field3331 = -1;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field3327 = -1;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public int field3333 = 8;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Z")
    public boolean field3332 = false;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public int field3336 = 128;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public int field3337 = 1190717;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public int field3341 = 0;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field3340 = 16;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "[I")
    public static int[] field3339;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1416(int arg0) {
        field3329++;
        if (arg0 == 21419) {
            class34.method164();
            class34.method169();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V", line = 40)
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3324++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        if (arg4 != 4949) {
            method1422(7);
        }
        int var9 = class54.method301(class65.field874, arg1 + arg2, class150.field2331, arg4 ^ 0xFFFFEC8E);
        int var10 = class54.method301(class65.field874, arg1 - arg2, class150.field2331, 110);
        class133.method925(14678, var10, arg3, var9, class284.field4810[arg0]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class9.field112 && var11 <= class44.field538) {
                    int var13 = class54.method301(class65.field874, arg1 + var5, class150.field2331, 75);
                    int var14 = class54.method301(class65.field874, arg1 - var5, class150.field2331, arg4 ^ 0x132A);
                    if (var12 <= class44.field538) {
                        class133.method925(14678, var14, arg3, var13, class284.field4810[var12]);
                    }
                    if (var11 >= class9.field112) {
                        class133.method925(arg4 ^ 0x2A03, var14, arg3, var13, class284.field4810[var11]);
                    }
                }
                var7 -= var6 << 1;
            }
            var5++;
            int var15 = arg0 + var5;
            int var16 = arg0 - var5;
            if (var15 >= class9.field112 && var16 <= class44.field538) {
                int var17 = class54.method301(class65.field874, arg1 + var6, class150.field2331, -118);
                int var18 = class54.method301(class65.field874, arg1 - var6, class150.field2331, 72);
                if (var15 <= class44.field538) {
                    class133.method925(14678, var18, arg3, var17, class284.field4810[var15]);
                }
                if (class9.field112 <= var16) {
                    class133.method925(14678, var18, arg3, var17, class284.field4810[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 116)
    public static final void method1418(int arg0) {
        if (arg0 != -28919) {
            return;
        }
        field3338++;
        try {
            if (class278.field4671 == null) {
                class278.field4671 = new class116(class51.field622, class134.method938((byte) -125, new class168[] { class190.method1344(arg0 ^ 0x7B92), class144.field2219 }).method1218((byte) 127));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class278.field4671 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 143)
    public static final void method1419(boolean arg0) {
        for (class51 var1 = (class51) class1.field2.method442(65293); var1 != null; var1 = (class51) class1.field2.method440(3)) {
            class155 var2 = var1.field617;
            if (class79.field1127 != var2.field2454 || var2.field2453) {
                var1.method124((byte) 113);
            } else if (field3335 >= var2.field2433) {
                var2.method1103(class274.field4619, 2);
                if (var2.field2453) {
                    var1.method124((byte) 67);
                } else {
                    class2.method6(var2.field2454, var2.field2451, var2.field2458, var2.field2450, 60, var2, 0, -1L, false);
                }
            }
        }
        if (!arg0) {
            field3328 = 71;
        }
        field3334++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBILj;)V", line = 176)
    private final void method1420(int arg0, byte arg1, int arg2, class153 arg3) {
        if (arg1 != 103) {
            this.field3337 = 80;
        }
        if (arg0 == 1) {
            this.field3341 = class22.method115(16711935, arg3.method1088(-30917));
        } else if (arg0 == 2) {
            this.field3327 = arg3.method1042((byte) -116);
        } else if (arg0 == 3) {
            this.field3327 = arg3.method1069(112);
            if (this.field3327 == 65535) {
                this.field3327 = -1;
            }
        } else if (arg0 == 5) {
            this.field3330 = false;
        } else if (arg0 == 7) {
            this.field3331 = class22.method115(arg1 ^ 0xFF0098, arg3.method1088(-30917));
        } else if (arg0 == 8) {
            class199.field3287 = arg2;
        } else if (arg0 == 9) {
            this.field3336 = arg3.method1069(75);
        } else if (arg0 == 10) {
            this.field3326 = false;
        } else if (arg0 == 11) {
            this.field3333 = arg3.method1042((byte) 109);
        } else if (arg0 == 12) {
            this.field3332 = true;
        } else if (arg0 == 13) {
            this.field3337 = arg3.method1088(-30917);
        } else if (arg0 == 14) {
            this.field3340 = arg3.method1042((byte) 111);
        }
        field3325++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILj;I)V", line = 259)
    public final void method1421(int arg0, class153 arg1, int arg2) {
        if (arg2 != 13) {
            this.field3333 = 43;
        }
        while (true) {
            int var4 = arg1.method1042((byte) -118);
            if (var4 == 0) {
                field3323++;
                return;
            }
            this.method1420(var4, (byte) 103, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 299)
    public static void method1422(int arg0) {
        field3339 = null;
        if (arg0 != 2) {
            method1422(-11);
        }
    }
}
