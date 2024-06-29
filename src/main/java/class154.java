import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class154 extends class23 {

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    private int field2790 = 4;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    private int field2788 = 4;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "Llc;")
    private static class143 field2787 = class66.method374("Loaded interfaces", -1);

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field2779 = 0;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "J")
    public static long field2778 = 0L;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "[I")
    public static int[] field2784 = new int[4];

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "Llc;")
    public static class143 field2791 = field2787;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Llc;")
    public static class143 field2781;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "[Lwb;")
    public static class133[] field2789;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lh;IILq;)V")
    public static final void method1015(class190 arg0, int arg1, int arg2, class81 arg3) {
        ++field2780;
        class144 var4 = new class144();
        var4.field2573 = arg0.method1265(121);
        var4.field2585 = arg0.method1269(arg1 ^ -92);
        var4.field2582 = new int[var4.field2573];
        var4.field2581 = new int[var4.field2573];
        var4.field2591 = new class181[var4.field2573];
        var4.field2575 = new class181[var4.field2573];
        var4.field2578 = new int[var4.field2573];
        var4.field2574 = new byte[var4.field2573][][];
        if (arg1 == -2) {
            for (int var5 = 0; var5 < var4.field2573; ++var5) {
                try {
                    int var6 = arg0.method1265(arg1 ^ -120);
                    if (var6 != 0 && var6 != 1 && ~var6 != -3) {
                        if (var6 == 3 || ~var6 == -5) {
                            String var7 = new String(arg0.method1270((byte) 4).method889((byte) 6));
                            String var8 = new String(arg0.method1270((byte) -105).method889((byte) 6));
                            int var9 = arg0.method1265(arg1 ^ -123);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; ~var9 < ~var11; ++var11) {
                                var10[var11] = new String(arg0.method1270((byte) -102).method889((byte) 6));
                            }
                            byte[][] var12 = new byte[var9][];
                            if (var6 == 3) {
                                for (int var13 = 0; ~var9 < ~var13; ++var13) {
                                    int var14 = arg0.method1269(105);
                                    var12[var13] = new byte[var14];
                                    arg0.method1258(0, var12[var13], (byte) -105, var14);
                                }
                            }
                            var4.field2578[var5] = var6;
                            Class[] var15 = new Class[var9];
                            for (int var16 = 0; var16 < var9; ++var16) {
                                var15[var16] = class174.method1147(-39, var10[var16]);
                            }
                            var4.field2591[var5] = arg3.method457(-97, var15, class174.method1147(arg1 + -37, var7), var8);
                            var4.field2574[var5] = var12;
                        }
                    } else {
                        String var17 = new String(arg0.method1270((byte) -101).method889((byte) 6));
                        String var18 = new String(arg0.method1270((byte) -105).method889((byte) 6));
                        int var19 = 0;
                        if (~var6 == -2) {
                            var19 = arg0.method1269(57);
                        }
                        var4.field2578[var5] = var6;
                        var4.field2582[var5] = var19;
                        var4.field2575[var5] = arg3.method454(var18, class174.method1147(-39, var17), (byte) 115);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field2581[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field2581[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field2581[var5] = -3;
                } catch (Exception var23) {
                    var4.field2581[var5] = -4;
                } catch (Throwable var24) {
                    var4.field2581[var5] = -5;
                }
            }
            class79.field1429.method1290((byte) -44, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field2783;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2788 = arg0.method1265(121);
            }
        } else {
            this.field2790 = arg0.method1265(117);
        }
        if (!arg2) {
            method1015((class190) null, 1, 122, (class81) null);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field2782;
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int var4 = class72.field1359 / this.field2790;
            int var5 = class9.field179 / this.field2788;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method161(class9.field179 * var6 / var5, 0, 0);
            } else {
                var7 = this.method161(0, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class72.field1359 > var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class72.field1359 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var9[var16];
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public static final void method1016() {
        class90.field1630 = 0;
        label191: for (int var0 = 0; var0 < class136.field2392; ++var0) {
            class223 var1 = class164.field2944[var0];
            if (class37.field636 != null) {
                for (int var2 = 0; var2 < class37.field636.length; ++var2) {
                    if (class37.field636[var2] != -1000000 && (var1.field4063 <= class37.field636[var2] || var1.field4048 <= class37.field636[var2]) && (var1.field4060 <= class235.field4287[var2] || var1.field4055 <= class235.field4287[var2]) && (var1.field4060 >= class148.field2704[var2] || var1.field4055 >= class148.field2704[var2]) && (var1.field4043 <= class223.field4046[var2] || var1.field4057 <= class223.field4046[var2]) && (var1.field4043 >= class173.field3107[var2] || var1.field4057 >= class173.field3107[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4059 == 1) {
                int var3 = var1.field4051 - class139.field2430 + class208.field3824;
                if (var3 >= 0 && var3 <= class208.field3824 + class208.field3824) {
                    int var4 = var1.field4039 - class126.field2227 + class208.field3824;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4052 - class126.field2227 + class208.field3824;
                    if (var5 > class208.field3824 + class208.field3824) {
                        var5 = class208.field3824 + class208.field3824;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class168.field3007[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class40.field682 - var1.field4060;
                        if (var7 > 32) {
                            var1.field4044 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4044 = 2;
                            var7 = -var7;
                        }
                        var1.field4061 = (var1.field4043 - class264.field4751 << 8) / var7;
                        var1.field4064 = (var1.field4057 - class264.field4751 << 8) / var7;
                        var1.field4054 = (var1.field4063 - class266.field4782 << 8) / var7;
                        var1.field4056 = (var1.field4048 - class266.field4782 << 8) / var7;
                        class18.field319[class90.field1630++] = var1;
                    }
                }
            } else if (var1.field4059 == 2) {
                int var8 = var1.field4039 - class126.field2227 + class208.field3824;
                if (var8 >= 0 && var8 <= class208.field3824 + class208.field3824) {
                    int var9 = var1.field4051 - class139.field2430 + class208.field3824;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4053 - class139.field2430 + class208.field3824;
                    if (var10 > class208.field3824 + class208.field3824) {
                        var10 = class208.field3824 + class208.field3824;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class168.field3007[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class264.field4751 - var1.field4043;
                        if (var12 > 32) {
                            var1.field4044 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4044 = 4;
                            var12 = -var12;
                        }
                        var1.field4041 = (var1.field4060 - class40.field682 << 8) / var12;
                        var1.field4042 = (var1.field4055 - class40.field682 << 8) / var12;
                        var1.field4054 = (var1.field4063 - class266.field4782 << 8) / var12;
                        var1.field4056 = (var1.field4048 - class266.field4782 << 8) / var12;
                        class18.field319[class90.field1630++] = var1;
                    }
                }
            } else if (var1.field4059 == 4) {
                int var13 = var1.field4063 - class266.field4782;
                if (var13 > 128) {
                    int var14 = var1.field4039 - class126.field2227 + class208.field3824;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4052 - class126.field2227 + class208.field3824;
                    if (var15 > class208.field3824 + class208.field3824) {
                        var15 = class208.field3824 + class208.field3824;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4051 - class139.field2430 + class208.field3824;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4053 - class139.field2430 + class208.field3824;
                        if (var17 > class208.field3824 + class208.field3824) {
                            var17 = class208.field3824 + class208.field3824;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class168.field3007[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4044 = 5;
                            var1.field4041 = (var1.field4060 - class40.field682 << 8) / var13;
                            var1.field4042 = (var1.field4055 - class40.field682 << 8) / var13;
                            var1.field4061 = (var1.field4043 - class264.field4751 << 8) / var13;
                            var1.field4064 = (var1.field4057 - class264.field4751 << 8) / var13;
                            class18.field319[class90.field1630++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static void method1017(int arg0) {
        field2781 = null;
        field2789 = null;
        if (arg0 == 8) {
            field2784 = null;
            field2787 = null;
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field2785;
        if (arg0 >= -13) {
            this.method131(-79, -73);
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = class72.field1359 / this.field2790;
            int var5 = class9.field179 / this.field2788;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method155(class9.field179 * var6 / var5, (byte) 115, 0);
            } else {
                var7 = this.method155(0, (byte) 108, 0);
            }
            for (int var8 = 0; class72.field1359 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class72.field1359 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)Lqb;")
    public static final class85 method1018(int arg0, int arg1) {
        int var2 = 103 % ((-46 - arg0) / 34);
        ++field2786;
        class85 var3 = (class85) class277.field4894.method826((long) arg1, false);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class206.field3749.method41(-18328, class62.method352(arg1, 31635), class76.method439(arg1, 57));
            class85 var5 = new class85();
            var5.field1522 = arg1;
            if (var4 != null) {
                var5.method488(new class190(var4), (byte) -103);
            }
            var5.method493(112);
            class277.field4894.method827(-3, var5, (long) arg1);
            return var5;
        }
    }
}
