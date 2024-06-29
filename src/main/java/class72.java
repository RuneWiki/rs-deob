import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class72 extends class118 {

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    private int field938 = 204;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    private int field941 = 1024;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    private int field952 = 81;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    private int field946 = 8;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    private int field947 = 1024;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    private int field955 = 4;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    private int field944 = 0;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    private int field960 = 409;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "Lcm;")
    public static class382 field937 = new class382(32);

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "Z")
    public static boolean field956 = false;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field959 = 1406;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "[Ljava/lang/String;")
    public static String[] field962 = new String[100];

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field957;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field963;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[[I")
    private int[][] field948;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "[[I")
    private int[][] field961;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class72() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)V")
    public static void method476(byte arg0) {
        if (arg0 > -84) {
            field956 = false;
        }
        field962 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)I")
    public static final int method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field945;
        int var7 = arg1 & arg6;
        if (~(1 & arg3) == -2) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (~var7 == -2) {
            return -arg0 + 7 + 1 + -arg4;
        } else {
            return var7 == 2 ? 1 - arg2 + -arg5 + 7 : arg0;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static final void method478(byte arg0) {
        ++field942;
        for (class38 var1 = (class38) class362.field5331.method2514((byte) 61); var1 != null; var1 = (class38) class362.field5331.method2511(98)) {
            if (class277.field4216 == null) {
                var1.method625((byte) -50);
            } else if (var1.field471 <= class26.field332) {
                int var2 = class423.field6228[var1.field455];
                if (~var2 != -1) {
                    if (~var2 == -2) {
                        class337 var3 = class213.method1245(var1.field470, var1.field472, var1.field453);
                        if (var3 instanceof class82) {
                            class360.method2171(var1.field470, var1.field472, var1.field453);
                            class82 var4 = (class82) var3;
                            if (var4.field1097 != null) {
                                class299.method1851(var1.field470, var1.field472, var1.field453, var4.field1097, (class337) null);
                            }
                        }
                    } else if (~var2 != -3) {
                        if (var2 == 3) {
                            class316 var5 = class386.method2385(var1.field470, var1.field472, var1.field453);
                            if (var5 instanceof class401) {
                                class54.method312(var1.field470, var1.field472, var1.field453);
                                class401 var6 = (class401) var5;
                                if (var6.field5970 != null) {
                                    class301.method1857(var1.field470, var1.field472, var1.field453, var6.field5970);
                                }
                            }
                        }
                    } else {
                        class141 var7 = class51.method293(var1.field470, var1.field472, var1.field453, field963 != null ? field963 : (field963 = method481("rc")));
                        if (var7 instanceof class314) {
                            class62.method335(var1.field470, var1.field472, var1.field453, field963 != null ? field963 : (field963 = method481("rc")));
                            class314 var8 = (class314) var7;
                            if (var8.field4744 != null) {
                                class50.method287(var8.field4744, false);
                            }
                        }
                    }
                } else {
                    class233 var9 = class37.method211(var1.field470, var1.field472, var1.field453);
                    if (var9 instanceof class302) {
                        class276.method1710(var1.field470, var1.field472, var1.field453);
                        class302 var10 = (class302) var9;
                        if (var10.field4555 != null) {
                            class266.method1649(var1.field470, var1.field472, var1.field453, var10.field4555, (class233) null);
                        }
                    }
                }
                var1.method625((byte) -50);
            } else if (class26.field332 == var1.field466) {
                int var11 = class423.field6228[var1.field455];
                if (var11 != 0) {
                    if (var11 == 1) {
                        class337 var19 = class213.method1245(var1.field470, var1.field472, var1.field453);
                        if (var19 instanceof class82) {
                            var1.method625((byte) -50);
                        } else if (class82.method527(var1.field470, var1.field472, var1.field453) != null) {
                            var1.method625((byte) -50);
                        } else {
                            class82 var20 = new class82(var1.field455, var1.field454, var1.field464, var1.field460, var1.field473, var19);
                            class299.method1851(var1.field470, var1.field472, var1.field453, var20, (class337) null);
                        }
                    } else if (~var11 == -3) {
                        class141 var12 = class51.method293(var1.field470, var1.field472, var1.field453, field963 != null ? field963 : (field963 = method481("rc")));
                        if (var12 instanceof class314) {
                            var1.method625((byte) -50);
                        } else {
                            class62.method335(var1.field470, var1.field472, var1.field453, field963 != null ? field963 : (field963 = method481("rc")));
                            class85 var13 = class411.method2575(0, var1.field461);
                            int var14;
                            int var15;
                            if (~var1.field454 != -2 && ~var1.field454 != -4) {
                                var14 = var13.field1122;
                                var15 = var13.field1197;
                            } else {
                                var15 = var13.field1122;
                                var14 = var13.field1197;
                            }
                            class314 var16 = new class314(var1.field455, var1.field454, var1.field470, var1.field464, var1.field460, var1.field473, var1.field472, var1.field472 - -var15 + -1, var1.field453, var1.field453 - -var14 + -1, var12);
                            class50.method287(var16, false);
                        }
                    } else if (var11 == 3) {
                        class316 var17 = class386.method2385(var1.field470, var1.field472, var1.field453);
                        if (var17 instanceof class401) {
                            var1.method625((byte) -50);
                        } else {
                            class401 var18 = new class401(var1.field464, var1.field460, var1.field473, var17);
                            class301.method1857(var1.field470, var1.field472, var1.field453, var18);
                        }
                    }
                } else {
                    class233 var21 = class37.method211(var1.field470, var1.field472, var1.field453);
                    if (var21 instanceof class302) {
                        var1.method625((byte) -50);
                    } else if (class115.method694(var1.field470, var1.field472, var1.field453) != null) {
                        var1.method625((byte) -50);
                    } else {
                        class302 var22 = new class302(var1.field455, var1.field454, var1.field464, var1.field460, var1.field473, var21);
                        class266.method1649(var1.field470, var1.field472, var1.field453, var22, (class233) null);
                    }
                }
            }
        }
        if (arg0 < 78) {
            method479(-69, -79, -66, -64, -38, -11, -92);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIII)V")
    public static final void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field950;
        class54 var7 = (class54) class168.field2405.method2127(-1489721243);
        if (arg4 < 120) {
            method479(-96, 57, 117, 112, -110, -58, -59);
        }
        while (var7 != null) {
            if (~var7.field724 >= ~class26.field332) {
                var7.method2759((byte) -25);
            } else {
                class341.method2085(var7.field732 * 2, (var7.field721 << 7) + 64, arg3, arg1 >> 1, 84, (var7.field728 << 7) - -64, arg0 >> 1, arg6, var7.field722);
                class161.field2244.method858(-3700, var7.field726 | -16777216, 0, class212.field3189[1] + arg2, arg5 - -class212.field3189[0], var7.field725);
            }
            var7 = (class54) class168.field2405.method2126(-73);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field940;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field947 = arg2.method2323(-40);
                                    }
                                } else {
                                    this.field952 = arg2.method2323(-108);
                                }
                            } else {
                                this.field944 = arg2.method2323(-84);
                            }
                        } else {
                            this.field941 = arg2.method2323(-13);
                        }
                    } else {
                        this.field938 = arg2.method2323(-13);
                    }
                } else {
                    this.field960 = arg2.method2323(-58);
                }
            } else {
                this.field946 = arg2.method2343(arg1 ^ 254);
            }
        } else {
            this.field955 = arg2.method2343(255);
        }
        if (arg1 != 1) {
            this.field946 = 63;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field939;
        if (arg0 != 1) {
            this.method24(-51, -21, (class385) null);
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int var4 = 0;
            int var5;
            for (var5 = class160.field2210[arg1] - -this.field944; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field946 > var4 && var5 >= this.field936[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field936[var4];
            int var9 = this.field936[var4 + -1];
            if (~(this.field953 + var9) > ~var5 && -this.field953 + var8 > var5) {
                for (int var10 = 0; ~class440.field6474 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field941 : this.field941;
                    int var13;
                    for (var13 = class6.field73[var10] - -(this.field954 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field955 && this.field948[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field948[var6][var14];
                    int var16 = this.field948[var6][var11];
                    if (var15 - -this.field953 < var13 && -this.field953 + var16 > var13) {
                        var3[var10] = this.field961[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class129.method766(var3, 0, class440.field6474, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    private final void method480(byte arg0) {
        if (arg0 > -21) {
            method478((byte) -23);
        }
        ++field943;
        Random var2 = new Random((long) this.field946);
        this.field953 = this.field952 / 2;
        this.field954 = 4096 / this.field955;
        this.field951 = 4096 / this.field946;
        int var3 = this.field954 / 2;
        this.field961 = new int[this.field946][this.field955];
        this.field948 = new int[this.field946][this.field955 - -1];
        this.field936 = new int[this.field946 + 1];
        int var4 = this.field951 / 2;
        this.field936[0] = 0;
        for (int var5 = 0; var5 < this.field946; ++var5) {
            if (var5 > 0) {
                int var6 = this.field951;
                int var7 = (-2048 + class330.method2028(116, 4096, var2)) * this.field938 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field936[var5] = this.field936[var5 + -1] + var8;
            }
            this.field948[var5][0] = 0;
            for (int var9 = 0; this.field955 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field954;
                    int var11 = (-2048 + class330.method2028(94, 4096, var2)) * this.field960 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field948[var5][var9] = this.field948[var5][var9 + -1] + var12;
                }
                this.field961[var5][var9] = ~this.field947 < -1 ? 4096 + -class330.method2028(92, this.field947, var2) : 4096;
            }
            this.field948[var5][this.field955] = 4096;
        }
        this.field936[this.field946] = 4096;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field949;
        this.method480((byte) -118);
        if (arg0 < 103) {
            this.field941 = 73;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method481(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
