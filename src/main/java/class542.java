import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class542 extends class477 implements class267 {

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Lji;")
    public class472 field7913;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "Z")
    private boolean field7926;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "[I")
    public static int[] field7927 = new int[8];

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        ++field7922;
        return arg0 ? null : this.field7913.method2945(0, arg2, false, (byte) -7, 0, false, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        this.field7913.method2938(-117, arg1);
        if (arg0 != -6682) {
            method3194(-76, -13, -70, (byte) -60, -117, -15, (byte[]) null);
        }
        ++field7925;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        if (arg0 != 18) {
            return -19;
        } else {
            ++field7928;
            return this.field7913.field7232;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field7929;
        class536 var3 = this.field7913.method2945(super.field7303, 262144, true, (byte) -7, super.field7300, true, arg1);
        if (arg0 != -1) {
            this.method102(63, (class497) null);
        }
        if (var3 != null) {
            int var4 = super.field7300 >> 7;
            int var5 = super.field7303 >> 7;
            this.field7913.method2940(var4, var4, var5, arg1, var3, -115, var5, false);
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lza;Loq;IIIIIZIII)V")
    public class542(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class128.method794(arg8, -49, arg9));
        this.field7913 = new class472(arg0, arg1, arg8, arg9, arg2, arg3, super.field7300, super.field7303, arg7, arg10);
        this.field7926 = ~arg1.field2079 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        ++field7912;
        if (arg0) {
            this.method107(true, (class497) null, 8);
        }
        return false;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIBII[B)V")
    public static final void method3194(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, byte[] arg6) {
        ++field7923;
        if (~arg5 < -1 && !class357.method2363(-88, arg5)) {
            throw new IllegalArgumentException("");
        } else if (~arg1 < -1 && !class357.method2363(-47, arg1)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class202.method1381(-32842, arg0);
            int var8 = 0;
            int var9 = arg1 <= arg5 ? arg1 : arg5;
            int var10 = arg5 >> 1;
            int var11 = -60 / ((-67 - arg3) / 35);
            int var12 = arg1 >> 1;
            byte[] var13 = arg6;
            byte[] var14 = new byte[var10 * var12 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var8, arg2, arg5, arg1, 0, arg0, 5121, var13, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var15 = arg5 * var7;
                byte[] var16 = var14;
                for (int var17 = 0; var7 > var17; ++var17) {
                    int var18 = var17;
                    int var19 = var17;
                    int var20 = var17 - -var15;
                    for (int var21 = 0; var21 < var12; ++var21) {
                        for (int var22 = 0; ~var10 < ~var22; ++var22) {
                            byte var23 = var13[var19];
                            int var24 = var7 + var19;
                            int var25 = var13[var24] + var23;
                            int var26 = var13[var20] + var25;
                            var19 = var7 + var24;
                            int var27 = var7 + var20;
                            int var28 = var13[var27] + var26;
                            var20 = var7 + var27;
                            var14[var18] = (byte) (var28 >> 2);
                            var18 += var7;
                        }
                        var19 += var15;
                        var20 += var15;
                    }
                }
                var14 = var13;
                var13 = var16;
                arg1 = var12;
                arg5 = var10;
                var12 >>= 1;
                var10 >>= 1;
                var9 >>= 1;
                ++var8;
            }
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        ++field7924;
        this.field7913.method2941(false, arg0);
        if (arg1 != 26768) {
            this.method106((byte) 110);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        ++field7918;
        if (arg0 < 87) {
            this.method97(53, (class497) null);
        }
        return this.field7913.field7233;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field7915;
        if (arg0 != 287) {
            this.method103(14);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
    public static void method3195(int arg0) {
        if (arg0 != 544) {
            method3194(-67, 14, -15, (byte) -40, 117, -55, (byte[]) null);
        }
        field7927 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (arg0) {
            method3195(43);
        }
        ++field7917;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 < 53) {
            return -44;
        } else {
            ++field7911;
            return this.field7913.field7227;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        int var8 = 124 % ((27 - arg4) / 32);
        ++field7920;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field7916;
        return arg0 >= -95 ? true : this.field7913.method2946(115);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field7921;
        class536 var3 = this.field7913.method2945(super.field7303, 2048, false, (byte) -7, super.field7300, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            class205 var4 = arg1.method1231();
            var4.method158(super.field7300, super.field7304, super.field7303);
            class514 var5 = null;
            if (this.field7926) {
                var5 = class104.method706(0, 1);
            }
            if (this.field7913.field7222 == null) {
                var3.method295(var4, var5 != null ? var5.field7629[0] : null, 0);
            } else {
                class519 var6 = this.field7913.field7222.method2354();
                arg1.method1291(var3, var6, var4, var5 == null ? null : var5.field7629[0], 0);
            }
            if (arg0 != 2) {
                this.method938(-8, (class497) null, 29, true, (byte) -89, 76, (class484) null);
            }
            int var7 = super.field7300 >> 7;
            int var8 = super.field7303 >> 7;
            this.field7913.method2940(var7, var7, var8, arg1, var3, -113, var8, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field7914;
        if (arg1 != 32689) {
            this.field7913 = null;
        }
        class536 var5 = this.field7913.method2945(super.field7303, 131072, false, (byte) -7, super.field7300, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class205 var6 = arg3.method1231();
            var6.method158(super.field7300, super.field7304, super.field7303);
            return var5.method298(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
    public static final boolean method3196(int arg0, int arg1, int arg2) {
        ++field7919;
        if (arg1 != -15252) {
            method3195(67);
        }
        return (arg2 & 24) != 0 | ~(arg2 & 544) == -545;
    }
}
