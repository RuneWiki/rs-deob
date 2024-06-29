import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class250 extends class270 {

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "S")
    public static short field3615 = 320;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Lfg;")
    public static class18 field3610 = new class18(2);

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3618 = "Hidden";

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "[C")
    public static char[] field3619 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "Lpi;")
    public static class220 field3620;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "Lli;")
    public static class452 field3616;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3622;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "[Lfa;")
    private class398[] field3609;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[[I)V")
    private final void method1798(int arg0, int[][] arg1) {
        ++field3611;
        if (arg0 >= -50) {
            this.method78((byte) 23, (class37) null, 90);
        }
        int var3 = class161.field2445;
        int var4 = class364.field5188;
        class110.method964(arg1, 24800);
        class187.method1452(class267.field3997, -92, 0, class30.field442, 0);
        if (this.field3609 != null) {
            for (int var5 = 0; var5 < this.field3609.length; ++var5) {
                class398 var6 = this.field3609[var5];
                int var7 = var6.field5857;
                int var8 = var6.field5863;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method25(var3, -88, var4);
                    } else {
                        var6.method23(var3, var4, (byte) -121);
                    }
                } else if (~var8 <= -1) {
                    var6.method28(var4, var3, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLec;I)V")
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) 116, 25);
        }
        ++field3613;
        if (~arg2 == -1) {
            this.field3609 = new class398[arg1.method271((byte) 120)];
            for (int var4 = 0; var4 < this.field3609.length; ++var4) {
                int var5 = arg1.method271((byte) 116);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field3609[var4] = class324.method2147((byte) 102, arg1);
                            }
                        } else {
                            this.field3609[var4] = class231.method1718(-94, arg1);
                        }
                    } else {
                        this.field3609[var4] = class91.method775(arg1, true);
                    }
                } else {
                    this.field3609[var4] = class158.method1239((byte) 112, arg1);
                }
            }
        } else if (arg2 == 1) {
            super.field4055 = arg1.method271((byte) 126) == 1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
    public final int[] method81(byte arg0, int arg1) {
        ++field3612;
        int[] var3 = super.field4053.method396(arg1, -108);
        if (arg0 <= 26) {
            field3610 = null;
        }
        if (super.field4053.field815) {
            this.method1798(-75, super.field4053.method394(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field3614;
        int[][] var3 = super.field4046.method244(arg1, 126);
        if (!arg0) {
            field3616 = null;
        }
        if (super.field4046.field488) {
            int var4 = class161.field2445;
            int var5 = class364.field5188;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field4046.method243((byte) 18);
            this.method1798(-128, var6);
            for (int var8 = 0; ~class364.field5188 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class161.field2445; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class35.method254(var15 << 4, 4080);
                    var12[var14] = class35.method254(4080, var15 >> 4);
                    var11[var14] = class35.method254(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3608;
        if (arg0 >= 98) {
            if (arg2 >= 0 && ~arg1 <= -1 && arg2 < class183.field2703 + -1 && ~(class66.field1056 + -1) < ~arg1) {
                if (class443.field6447 == null) {
                    return;
                }
                if (~arg5 == -1) {
                    class395 var8 = (class395) class219.method1656(arg4, arg2, arg1);
                    class395 var9 = (class395) class321.method2143(arg4, arg2, arg1);
                    if (var8 != null && ~arg3 != -3) {
                        if (!(var8 instanceof class320)) {
                            class425.method2668(arg1, arg4, arg2, arg7, arg5, -6384, arg6, arg3, var8.method1013(false));
                        } else {
                            ((class320) var8).field4618.method2528(arg6, 4);
                        }
                    }
                    if (var9 != null) {
                        if (!(var9 instanceof class320)) {
                            class425.method2668(arg1, arg4, arg2, arg7, arg5, -6384, arg6, arg3, var9.method1013(false));
                            return;
                        }
                        ((class320) var9).field4618.method2528(arg6, 4);
                        return;
                    }
                    return;
                }
                if (~arg5 == -2) {
                    class395 var10 = (class395) class336.method2189(arg4, arg2, arg1);
                    if (var10 != null) {
                        if (var10 instanceof class211) {
                            ((class211) var10).field3128.method2528(arg6, 4);
                            return;
                        }
                        int var11 = var10.method1013(false);
                        if (arg3 != 4 && ~arg3 != -6) {
                            if (arg3 != 6) {
                                if (arg3 == 7) {
                                    class425.method2668(arg1, arg4, arg2, (3 & arg7 + 2) - -4, arg5, -6384, arg6, 4, var11);
                                    return;
                                }
                                if (~arg3 == -9) {
                                    class425.method2668(arg1, arg4, arg2, arg7 + 4, arg5, -6384, arg6, 4, var11);
                                    class425.method2668(arg1, arg4, arg2, (arg7 - -2 & 3) + 4, arg5, -6384, arg6, 4, var11);
                                    return;
                                }
                            } else {
                                class425.method2668(arg1, arg4, arg2, arg7 - -4, arg5, -6384, arg6, 4, var11);
                            }
                            return;
                        }
                        class425.method2668(arg1, arg4, arg2, arg7, arg5, -6384, arg6, 4, var11);
                        return;
                    }
                    return;
                }
                if (arg5 == 2) {
                    class395 var12 = (class395) class371.method2358(arg4, arg2, arg1, field3622 != null ? field3622 : (field3622 = method1801("sc")));
                    if (var12 != null) {
                        if (arg3 == 11) {
                            arg3 = 10;
                        }
                        if (!(var12 instanceof class381)) {
                            class425.method2668(arg1, arg4, arg2, arg7, arg5, -6384, arg6, arg3, var12.method1013(false));
                            return;
                        }
                        ((class381) var12).field5397.method2528(arg6, 4);
                        return;
                    }
                    return;
                }
                if (arg5 == 3) {
                    class395 var13 = (class395) class37.method311(arg4, arg2, arg1);
                    if (var13 != null) {
                        if (!(var13 instanceof class446)) {
                            class425.method2668(arg1, arg4, arg2, arg7, arg5, -6384, arg6, arg3, var13.method1013(false));
                            return;
                        }
                        ((class446) var13).field6483.method2528(arg6, 4);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(B)V")
    public static void method1800(byte arg0) {
        field3620 = null;
        field3610 = null;
        field3616 = null;
        if (arg0 < 46) {
            field3617 = 60;
        }
        field3618 = null;
        field3619 = null;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1801(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
