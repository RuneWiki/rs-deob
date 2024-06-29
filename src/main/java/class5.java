import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class5 extends class175 {

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Z")
    private boolean field65 = true;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "Z")
    private boolean field66 = true;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "Lij;")
    public static class50 field63 = class78.method578(124, "overlay)3dat");

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Lpe;")
    public static class100 field62 = new class100(5);

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Z")
    public static boolean field68 = true;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "Lij;")
    public static class50 field67 = class78.method578(127, "Nehmen");

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field60;
        int[] var3 = super.field2941.method1427(arg1 + 6465, arg0);
        if (arg1 != -27746) {
            field63 = null;
        }
        if (super.field2941.field3565) {
            int[] var4 = this.method1210(0, !this.field66 ? arg0 : -arg0 + class108.field1928, arg1 ^ -11529);
            if (!this.field65) {
                class105.method791(var4, 0, var3, 0, class211.field3514);
            } else {
                for (int var5 = 0; var5 < class211.field3514; ++var5) {
                    var3[var5] = var4[-var5 + class161.field2765];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIILaa;JLaa;Laa;)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3, class16 arg4, long arg5, class16 arg6, class16 arg7) {
        class200 var9 = new class200();
        var9.field3294 = arg4;
        var9.field3301 = arg1 * 128 + 64;
        var9.field3305 = arg2 * 128 + 64;
        var9.field3293 = arg3;
        var9.field3303 = arg5;
        var9.field3300 = arg6;
        var9.field3291 = arg7;
        int var10 = 0;
        class65 var11 = class59.field1089[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1244; ++var12) {
                class106 var13 = var11.field1236[var12];
                if ((var13.field1905 & 4194304L) == 4194304L) {
                    int var14 = var13.field1901.method126();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3299 = -var10;
        if (class59.field1089[arg0][arg1][arg2] == null) {
            class59.field1089[arg0][arg1][arg2] = new class65(arg0, arg1, arg2);
        }
        class59.field1089[arg0][arg1][arg2].field1237 = var9;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILce;IB)V")
    public static final void method31(int arg0, class10 arg1, int arg2, byte arg3) {
        if (~arg1.field278 == -1) {
            arg1.field241 = arg1.field260;
        } else if (arg1.field278 != 1) {
            if (arg1.field278 != 2) {
                if (~arg1.field278 == -4) {
                    arg1.field241 = arg1.field260 * arg0 >> 14;
                } else if (~arg1.field278 == -5) {
                    arg1.field241 = (arg1.field260 * arg0 >> 14) + (-arg1.field242 + arg0) / 2;
                } else {
                    arg1.field241 = -arg1.field242 + arg0 + -(arg1.field260 * arg0 >> 14);
                }
            } else {
                arg1.field241 = -arg1.field242 - arg1.field260 + arg0;
            }
        } else {
            arg1.field241 = (-arg1.field242 + arg0) / 2 + arg1.field260;
        }
        if (arg1.field182 == 0) {
            arg1.field272 = arg1.field282;
        } else if (~arg1.field182 != -2) {
            if (~arg1.field182 == -3) {
                arg1.field272 = -arg1.field282 + -arg1.field243 + arg2;
            } else if (~arg1.field182 != -4) {
                if (~arg1.field182 == -5) {
                    arg1.field272 = (arg1.field282 * arg2 >> 14) + (-arg1.field243 + arg2) / 2;
                } else {
                    arg1.field272 = -arg1.field243 + arg2 + -(arg1.field282 * arg2 >> 14);
                }
            } else {
                arg1.field272 = arg1.field282 * arg2 >> 14;
            }
        } else {
            arg1.field272 = (-arg1.field243 + arg2) / 2 + arg1.field282;
        }
        if (arg3 != 6) {
            method37(-46, 19, -10, 36);
        }
        if (class126.field2206 && (client.method605(arg1) != 0 || ~arg1.field227 == -1)) {
            if (arg1.field272 < 0) {
                arg1.field272 = 0;
            } else if (arg2 < arg1.field272 + arg1.field243) {
                arg1.field272 = arg2 - arg1.field243;
            }
            if (~arg1.field241 <= -1) {
                if (arg1.field242 + arg1.field241 > arg0) {
                    arg1.field241 = -arg1.field242 + arg0;
                }
            } else {
                arg1.field241 = 0;
            }
        }
        ++field56;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field58;
        if (arg1 != -20740) {
            field67 = null;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -111);
        if (super.field2920.field356) {
            int[][] var4 = this.method1206(0, !this.field66 ? arg0 : -arg0 + class108.field1928, (byte) 46);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            if (this.field65) {
                for (int var11 = 0; class211.field3514 > var11; ++var11) {
                    var10[var11] = var8[-var11 + class161.field2765];
                    var7[var11] = var6[-var11 + class161.field2765];
                    var9[var11] = var5[-var11 + class161.field2765];
                }
            } else {
                for (int var12 = 0; class211.field3514 > var12; ++var12) {
                    var10[var12] = var8[var12];
                    var7[var12] = var6[var12];
                    var9[var12] = var5[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIILig;Z)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3, class186 arg4, boolean arg5) {
        ++field57;
        if (~class6.field72 > -51) {
            if (arg4.field3034 != null && arg1 < arg4.field3034.length && arg4.field3034[arg1] != null) {
                int var6 = arg4.field3034[arg1][0];
                int var7 = var6 >> 8;
                if (arg4.field3034[arg1].length > 1) {
                    int var8 = (int) ((double) arg4.field3034[arg1].length * Math.random());
                    if (var8 > 0) {
                        var7 = arg4.field3034[arg1][var8];
                    }
                }
                int var9 = (var6 & 122) >> 4;
                int var10 = 15 & var6;
                if (~var10 == -1) {
                    if (arg5) {
                        class244.method1667(0, var9, (byte) -126, var7);
                    }
                } else if (~class203.field3379 != -1) {
                    class53.field965[class6.field72] = var7;
                    class10.field283[class6.field72] = var9;
                    class178.field2981[class6.field72] = arg2;
                    class187.field3077[class6.field72] = null;
                    int var11 = (arg3 + -64) / 128;
                    int var12 = (arg0 + -64) / 128;
                    class96.field1806[class6.field72] = (var11 << 16) + ((var12 << 8) - -var10);
                    ++class6.field72;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZI)V")
    public static final void method34(int arg0, int arg1, boolean arg2, int arg3) {
        ++field64;
        if (arg0 >= 8000 && ~arg0 >= -48001) {
            class106.field1920 = arg2;
            class101.field1864 = arg3;
            class160.field2755 = arg0;
            if (arg1 != -24096) {
                field63 = null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBI)V")
    public static final void method35(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (-arg2 + arg0 >= class177.field2953 && ~(arg0 + arg2) >= ~class224.field3773 && class100.field1855 <= -arg2 + arg4 && class97.field1816 >= arg2 + arg4) {
            class167.method1150(arg0, (byte) 51, arg4, arg1, arg2);
        } else {
            class56.method444(arg2, arg4, arg0, arg1, (byte) 122);
        }
        int var5 = 76 % ((arg3 - -69) / 42);
        ++field59;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[BZI)I")
    public static final int method36(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (arg2) {
            field62 = null;
        }
        ++field69;
        int var4 = -1;
        for (int var5 = arg0; ~var5 > ~arg3; ++var5) {
            var4 = class141.field2467[255 & (var4 ^ arg1[var5])] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)Z")
    public static final boolean method37(int arg0, int arg1, int arg2, int arg3) {
        if (!class56.method439(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class20.method149(var4 + 1, class245.field4257[arg0][arg1][arg2] + arg3, var5 + 1) && class20.method149(var4 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class20.method149(var4 + 128 - 1, class245.field4257[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class20.method149(var4 + 1, class245.field4257[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)V")
    public static void method38(int arg0) {
        field62 = null;
        field63 = null;
        if (arg0 != -27973) {
            field63 = null;
        }
        field67 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        ++field61;
        if (!arg0) {
            method35(20, -81, -26, (byte) 22, -126);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field2925 = ~arg2.method1487(255) == -2;
                }
            } else {
                this.field66 = arg2.method1487(255) == 1;
            }
        } else {
            this.field65 = ~arg2.method1487(255) == -2;
        }
    }
}
