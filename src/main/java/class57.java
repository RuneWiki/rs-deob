import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class57 extends class27 {

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    private int field938 = 6;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lkb;")
    private static class93 field932 = class76.method390("Loaded textures", 0);

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lkb;")
    public static class93 field929 = field932;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "Lkb;")
    public static class93 field930 = class76.method390(")3runescape)3com", 0);

    @OriginalMember(owner = "client!g", name = "X", descriptor = "Lkb;")
    public static class93 field935 = class76.method390("Registrierter Benutzer", 0);

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lkb;")
    public static class93 field933 = class76.method390("<col=00ff00>", 0);

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Lkb;")
    public static class93 field934 = class76.method390("Weiter", 0);

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field925;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 126, arg0);
            int[] var5 = this.method145(1, (byte) 126, arg0);
            for (int var6 = 0; var6 < class159.field3209; ++var6) {
                var3[var6] = this.method305(var4[var6], (byte) 111, var5[var6]);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(ZI)Lha;")
    public static final class66 method304(boolean arg0, int arg1) {
        class66 var2 = (class66) class171.field3392.method680((long) arg1, (byte) 18);
        ++field931;
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            return null;
        } else {
            byte[] var3 = class170.field3377.method461(1, (byte) 101, arg1);
            class66 var4 = new class66();
            if (var3 != null) {
                var4.method348(new class158(var3), arg1, (byte) 98);
            }
            class171.field3392.method678(!arg0, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IBI)I")
    private final int method305(int arg0, byte arg1, int arg2) {
        ++field927;
        int var4 = this.field938;
        if (var4 != 1) {
            if (var4 != 2) {
                if (var4 != 3) {
                    if (~var4 != -5) {
                        if (~var4 != -6) {
                            if (~var4 != -7) {
                                if (~var4 != -8) {
                                    if (~var4 != -9) {
                                        if (var4 != 9) {
                                            if (~var4 != -11) {
                                                if (var4 != 11) {
                                                    if (var4 == 12) {
                                                        return arg0 + arg2 + -(arg0 * arg2 >> 11);
                                                    } else {
                                                        if (arg1 < 109) {
                                                            this.method305(21, (byte) -30, 19);
                                                        }
                                                        return arg0;
                                                    }
                                                } else {
                                                    return ~arg0 < ~arg2 ? -arg2 + arg0 : -arg0 + arg2;
                                                }
                                            } else {
                                                return arg0 > arg2 ? arg0 : arg2;
                                            }
                                        } else {
                                            return arg2 > arg0 ? arg0 : arg2;
                                        }
                                    } else {
                                        return arg0 != 0 ? -((-arg2 + 4096 << 12) / arg0) + 4096 : 0;
                                    }
                                } else {
                                    return arg0 != 4096 ? (arg2 << 12) / (-arg0 + 4096) : 4096;
                                }
                            } else {
                                return arg2 < 2048 ? arg0 * arg2 >> 11 : -((-arg0 + 4096) * (-arg2 + 4096) >> 11) + 4096;
                            }
                        } else {
                            return -((-arg0 + 4096) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return ~arg2 != -1 ? (arg0 << 12) / arg2 : 4096;
                    }
                } else {
                    return arg0 * arg2 >> 12;
                }
            } else {
                return -arg2 + arg0;
            }
        } else {
            return arg0 - -arg2;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field435 = ~arg2.method1054(128) == -2;
            }
        } else {
            this.field938 = arg2.method1054(128);
        }
        if (arg0 < 106) {
            this.method15((byte) -83, 101, (class158) null);
        }
        ++field937;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method306(int arg0) {
        field934 = null;
        if (arg0 != 118054252) {
            field936 = 36;
        }
        field933 = null;
        field929 = null;
        field932 = null;
        field930 = null;
        field935 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class57() {
        super(2, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int[][] var3 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[][] var4 = this.method152(arg1, 0, 121);
            int[][] var5 = this.method152(arg1, 1, 84);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            for (int var15 = 0; ~class159.field3209 < ~var15; ++var15) {
                var6[var15] = this.method305(var9[var15], (byte) 122, var12[var15]);
                var7[var15] = this.method305(var10[var15], (byte) 110, var13[var15]);
                var8[var15] = this.method305(var11[var15], (byte) 125, var14[var15]);
            }
        }
        ++field926;
        int var16 = -39 / ((42 - arg0) / 54);
        return var3;
    }
}
