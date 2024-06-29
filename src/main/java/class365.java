import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class365 extends class436 {

    @OriginalMember(owner = "client!te", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field5117 = new String[200];

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Ltc;")
    public static class196 field5111 = new class196();

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field5119;

    // $FF: synthetic field
    @OriginalMember(owner = "client!te", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5120;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[[I")
    public final int[][] method85(int arg0, int arg1) {
        ++field5116;
        if (arg0 != -13348) {
            field5117 = null;
        }
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class43.field653; ++var7) {
                this.method2348(true, arg1, var7);
                int[][] var8 = this.method2731(class176.field2486, false, 0);
                var4[var7] = var8[0][class214.field2848];
                var5[var7] = var8[1][class214.field2848];
                var6[var7] = var8[2][class214.field2848];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method2343(int arg0) {
        field5111 = null;
        int var1 = 50 / ((arg0 - -50) / 48);
        field5117 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILlh;)V")
    public static final void method2344(int arg0, class308 arg1) {
        ++field5112;
        if (class5.field79 != null) {
            class161 var2 = null;
            if (~arg1.field4216 == -1) {
                var2 = (class161) class57.method381(arg1.field4229, arg1.field4233, arg1.field4232);
            }
            if (arg1.field4216 == 1) {
                var2 = (class161) class3.method13(arg1.field4229, arg1.field4233, arg1.field4232);
            }
            if (arg1.field4216 == 2) {
                var2 = (class161) class32.method245(arg1.field4229, arg1.field4233, arg1.field4232, field5120 != null ? field5120 : (field5120 = method2349("tr")));
            }
            if (arg1.field4216 == arg0) {
                var2 = (class161) class207.method1350(arg1.field4229, arg1.field4233, arg1.field4232);
            }
            if (var2 == null) {
                arg1.field4219 = 0;
                arg1.field4220 = -1;
                arg1.field4228 = 0;
            } else {
                arg1.field4220 = var2.method126(-13482);
                arg1.field4219 = var2.method123((byte) 127);
                arg1.field4228 = var2.method124(-11197);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static final void method2345(int arg0) {
        class240.field3337 = null;
        class62.field973 = null;
        int var1 = -71 % ((arg0 - -75) / 46);
        class141.field2017 = null;
        ++field5109;
        class181.field2539 = null;
        class412.field5986 = null;
        class167.field2394 = null;
        class374.field5345 = null;
        class58.field826 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2346(int arg0, int arg1, int arg2, int arg3) {
        if (!class326.method2050(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class249.field3456[arg0].method275(arg1, arg2) - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class167.field2387) {
                        if (!class431.method2709(var4, var6, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class431.method2709(var4, var7, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class431.method2709(var4, var8, var5)) {
                        return false;
                    }
                    if (!class431.method2709(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class180.field2514) {
                        if (!class431.method2709(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class431.method2709(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class431.method2709(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class431.method2709(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class167.field2387) {
                        if (!class431.method2709(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class431.method2709(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class431.method2709(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class431.method2709(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class180.field2514) {
                        if (!class431.method2709(var4, var6, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class431.method2709(var4, var7, var5)) {
                            return false;
                        }
                        if (!class431.method2709(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class431.method2709(var4, var8, var5)) {
                        return false;
                    }
                    if (!class431.method2709(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class431.method2709(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class431.method2709(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class431.method2709(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class431.method2709(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class431.method2709(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class365() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field5110;
        int[] var3 = super.field6258.method2688((byte) -88, arg0);
        if (arg1 != 18338) {
            return null;
        } else {
            if (super.field6258.field6138) {
                for (int var4 = 0; var4 < class43.field653; ++var4) {
                    this.method2348(true, arg0, var4);
                    int[] var5 = this.method2729(0, 0, class176.field2486);
                    var3[var4] = var5[class214.field2848];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZII)V")
    public static final void method2347(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class35.field543 = 0L;
        if (arg1 == -31718) {
            ++field5113;
            int var5 = class162.method1075(-45);
            if (arg3 == 3 || ~var5 == -4) {
                arg2 = true;
            }
            if (!class408.field5920.method1740()) {
                arg2 = true;
            }
            class442.method2773(arg2, var5, 9148, arg3, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)V")
    private final void method2348(boolean arg0, int arg1, int arg2) {
        ++field5119;
        if (arg0) {
            int var4 = class249.field3455[arg2];
            int var5 = class32.field499[arg1];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class214.field2848 = arg2;
                class176.field2486 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class176.field2486 = arg2;
                class214.field2848 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class214.field2848 = -arg1 + class43.field653;
                class176.field2486 = arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class176.field2486 = -arg1 + class123.field1728;
                class214.field2848 = arg2;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class176.field2486 = -arg1 + class123.field1728;
                class214.field2848 = -arg2 + class43.field653;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class176.field2486 = -arg2 + class123.field1728;
                class214.field2848 = class43.field653 - arg1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class176.field2486 = -arg2 + class123.field1728;
                class214.field2848 = arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class176.field2486 = arg1;
                class214.field2848 = -arg2 + class43.field653;
            }
            class176.field2486 &= class190.field2634;
            class214.field2848 &= class278.field3758;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            field5117 = null;
        }
        ++field5114;
        if (~arg1 == -1) {
            super.field6256 = arg2.method2429(0) == 1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2349(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
