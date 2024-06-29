import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class497 extends class478 implements class534 {

    @OriginalMember(owner = "client!hg", name = "gb", descriptor = "Z")
    private boolean field7211;

    @OriginalMember(owner = "client!hg", name = "bb", descriptor = "B")
    private byte field7206;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "B")
    private byte field7179;

    @OriginalMember(owner = "client!hg", name = "U", descriptor = "S")
    private short field7199;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "Z")
    private boolean field7180;

    @OriginalMember(owner = "client!hg", name = "P", descriptor = "B")
    private byte field7194;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "Z")
    private boolean field7181;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
    private boolean field7186;

    @OriginalMember(owner = "client!hg", name = "T", descriptor = "Lka;")
    public class336 field7198;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "Lia;")
    private class424 field7177;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field7188 = -1;

    @OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
    public static int field7205 = 0;

    @OriginalMember(owner = "client!hg", name = "eb", descriptor = "[I")
    public static int[] field7209 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!hg", name = "R", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!hg", name = "V", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!hg", name = "W", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!hg", name = "Y", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!hg", name = "Z", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!hg", name = "cb", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!hg", name = "db", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!hg", name = "fb", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!hg", name = "S", descriptor = "Lem;")
    private class154 field7197;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)Z")
    public final boolean method547(int arg0) {
        int var2 = -116 % ((arg0 - -73) / 39);
        ++field7207;
        return this.field7186;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
    public static final void method2911(int arg0) {
        ++field7183;
        if (class167.field2517 == null) {
            class167.field2517 = new int[65536];
            if (arg0 == -21464) {
                double var1 = 0.7D + -0.015D + Math.random() * 0.03D;
                for (int var3 = 0; ~var3 > -65537; ++var3) {
                    double var4 = (double) ((var3 & 65494) >> 10) / 64.0D + 0.0078125D;
                    double var6 = (double) (7 & var3 >> 7) / 8.0D + 0.0625D;
                    double var8 = (double) (127 & var3) / 128.0D;
                    double var10 = var8;
                    double var12 = var8;
                    double var14 = var8;
                    if (var6 != 0.0D) {
                        double var16;
                        if (!(var8 < 0.5D)) {
                            var16 = var6 + var8 + -(var6 * var8);
                        } else {
                            var16 = (var6 + 1.0D) * var8;
                        }
                        double var18 = var8 * 2.0D + -var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            --var20;
                        }
                        double var24 = var4 - 0.3333333333333333D;
                        if (var4 * 6.0D < 1.0D) {
                            var12 = (-var18 + var16) * 6.0D * var4 + var18;
                        } else if (!(var4 * 2.0D < 1.0D)) {
                            if (var4 * 3.0D < 2.0D) {
                                var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                            } else {
                                var12 = var18;
                            }
                        } else {
                            var12 = var16;
                        }
                        if (var24 < 0.0D) {
                            ++var24;
                        }
                        if (var20 * 6.0D < 1.0D) {
                            var10 = (var16 - var18) * 6.0D * var20 + var18;
                        } else if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if (!(var20 * 3.0D < 2.0D)) {
                            var10 = var18;
                        } else {
                            var10 = (-var18 + var16) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                        }
                        if (var24 * 6.0D < 1.0D) {
                            var14 = (-var18 + var16) * 6.0D * var24 + var18;
                        } else if (!(var24 * 2.0D < 1.0D)) {
                            if (!(var24 * 3.0D < 2.0D)) {
                                var14 = var18;
                            } else {
                                var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var32 << 16) + (var33 << 8) + var34;
                    class167.field2517[var3] = var35;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final void method548(int arg0) {
        if (this.field7198 != null) {
            this.field7198.method1162();
        }
        int var2 = -105 % ((-37 - arg0) / 34);
        ++field7182;
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
    public static void method2912(byte arg0) {
        field7209 = null;
        if (arg0 != -94) {
            method2912((byte) -41);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLqa;)V")
    public final void method557(byte arg0, class167 arg1) {
        ++field7190;
        Object var3 = null;
        class424 var5;
        if (this.field7177 == null && this.field7186) {
            class335 var4 = this.method2916(true, true, 262144, arg1);
            var5 = var4 == null ? null : var4.field4962;
        } else {
            var5 = this.field7177;
            this.field7177 = null;
        }
        if (var5 != null) {
            class354.method2211(var5, this.field7194, super.field6961, super.field6965, (boolean[]) null);
        }
        int var6 = -72 / ((13 - arg0) / 59);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        this.field7181 = arg0;
        ++field7208;
        if (this.field7198 != null) {
            this.field7198.method1133(this.field7198.method1166() & -65537);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lqa;I)V")
    public final void method551(class167 arg0, int arg1) {
        if (arg1 > 62) {
            ++field7187;
            Object var3 = null;
            class424 var5;
            if (this.field7177 == null && this.field7186) {
                class335 var4 = this.method2916(true, true, 262144, arg0);
                var5 = var4 == null ? null : var4.field4962;
            } else {
                var5 = this.field7177;
                this.field7177 = null;
            }
            if (var5 != null) {
                class359.method2231(var5, this.field7194, super.field6961, super.field6965, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        if (arg0 != -14322) {
            this.method548(59);
        }
        ++field7201;
        return this.method2914(72, arg2, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)I")
    public final int method559(byte arg0) {
        ++field7200;
        if (arg0 <= 3) {
            this.method556(108);
        }
        return this.field7179;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        if (this.field7197 == null) {
            this.field7197 = class332.method2104(super.field6954, this.method2914(115, 0, arg0), super.field6965, super.field6961, 127);
        }
        ++field7185;
        if (arg1 > -117) {
            this.field7194 = 7;
        }
        return this.field7197;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)Z")
    public static final boolean method2913(int arg0) {
        ++field7178;
        return class92.field1478 != arg0 ? true : class336.field4972.method1442(20845);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILqa;)Lka;")
    private final class336 method2914(int arg0, int arg1, class167 arg2) {
        ++field7204;
        if (this.field7198 != null && arg2.method252(this.field7198.method1166(), arg1) == 0) {
            return this.field7198;
        } else if (arg0 < 20) {
            return null;
        } else {
            class335 var4 = this.method2916(true, false, arg1, arg2);
            return var4 != null ? var4.field4960 : null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lqa;Lku;IIIIIZIIIIIIZ)V")
    public class497(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3866 == 1, class452.method2696(arg13, arg12, true));
        this.field7211 = arg1.field3872 != 0 && !arg7;
        this.field7206 = (byte) arg13;
        this.field7179 = (byte) arg12;
        this.field7199 = (short) arg1.field3882;
        this.field7180 = arg7;
        this.field7194 = (byte) arg3;
        this.field7181 = arg14;
        this.field7186 = arg0.method346() && arg1.field3929 && !this.field7180 && class220.field3371.method1213((byte) -35, class74.field1211) != 0;
        int var16 = 2048;
        if (this.field7181) {
            var16 |= 65536;
        }
        class335 var17 = this.method2916(true, this.field7186, var16, arg0);
        if (var17 != null) {
            this.field7198 = var17.field4960;
            this.field7177 = var17.field4962;
            if (this.field7181) {
                this.field7198 = this.field7198.method1154((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)I")
    public final int method1792(boolean arg0) {
        if (arg0) {
            return 57;
        } else {
            ++field7184;
            return this.field7198 != null ? this.field7198.method1130() : 0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        if (arg4) {
            field7189 = 103;
        }
        if (arg5 instanceof class403) {
            class403 var8 = (class403) arg5;
            if (this.field7198 != null && var8.field5751 != null) {
                this.field7198.method1157(var8.field5751, arg2, arg0, arg1, arg6);
            }
        } else if (arg5 instanceof class497) {
            class497 var9 = (class497) arg5;
            if (this.field7198 != null && var9.field7198 != null) {
                this.field7198.method1157(var9.field7198, arg2, arg0, arg1, arg6);
            }
        }
        ++field7212;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field7193;
        if (this.field7198 == null) {
            return null;
        } else {
            class15 var3 = arg1.method312();
            var3.method47(super.field6961, super.field6954, super.field6965);
            class166 var4 = null;
            if (this.field7211) {
                var4 = class392.method2363(arg0 ^ 3317, 1);
            }
            this.field7198.method1142(var3, var4 == null ? null : var4.field2497[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)I")
    public final int method561(byte arg0) {
        ++field7192;
        if (arg0 != -85) {
            this.method1792(true);
        }
        return this.field7199 & 65535;
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)I")
    public final int method2915(byte arg0) {
        ++field7203;
        if (arg0 > -22) {
            field7189 = -22;
        }
        return this.field7198 == null ? 15 : this.field7198.method1150() / 4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field7210;
        if (arg2 <= 42) {
            return false;
        } else {
            class336 var5 = this.method2914(106, 131072, arg3);
            if (var5 != null) {
                class15 var6 = arg3.method312();
                var6.method47(super.field6961, super.field6954, super.field6965);
                return var5.method1131(arg1, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
    public final int method560(int arg0) {
        ++field7191;
        return arg0 != -29863 ? -68 : this.field7206;
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.method561((byte) 98);
        }
        ++field7195;
        return this.field7181;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 < -119) {
            ++field7202;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZILqa;)Lso;")
    private final class335 method2916(boolean arg0, boolean arg1, int arg2, class167 arg3) {
        ++field7196;
        class261 var5 = class277.field4139.method569((byte) 91, 65535 & this.field7199);
        if (!arg0) {
            return null;
        } else {
            class24 var6;
            class24 var7;
            if (!this.field7180) {
                if (this.field7194 >= 3) {
                    var6 = null;
                } else {
                    var6 = class393.field5594[this.field7194 + 1];
                }
                var7 = class393.field5594[this.field7194];
            } else {
                var6 = class393.field5594[0];
                var7 = class477.field6942[this.field7194];
            }
            return var5.method1691(var6, arg3, -82, super.field6961, var7, this.field7179 == 11 ? 10 : this.field7179, arg2, super.field6954, super.field6965, arg1, ~this.field7179 != -12 ? this.field7206 : this.field7206 + 4);
        }
    }
}
