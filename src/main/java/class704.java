import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class704 extends class219 implements class83 {

    @OriginalMember(owner = "client!eca", name = "W", descriptor = "Z")
    private boolean field9905 = false;

    @OriginalMember(owner = "client!eca", name = "K", descriptor = "Lui;")
    public class210 field9893;

    @OriginalMember(owner = "client!eca", name = "Y", descriptor = "Z")
    private boolean field9907;

    @OriginalMember(owner = "client!eca", name = "L", descriptor = "Lqfa;")
    public static class85 field9894 = new class85(12, 6);

    @OriginalMember(owner = "client!eca", name = "cb", descriptor = "I")
    public static int field9911 = 0;

    @OriginalMember(owner = "client!eca", name = "eb", descriptor = "[[[I")
    public static int[][][] field9913 = new int[2][][];

    @OriginalMember(owner = "client!eca", name = "fb", descriptor = "F")
    public static float field9914;

    @OriginalMember(owner = "client!eca", name = "I", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!eca", name = "M", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!eca", name = "O", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!eca", name = "P", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!eca", name = "Q", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!eca", name = "R", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!eca", name = "S", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!eca", name = "T", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!eca", name = "U", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!eca", name = "V", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!eca", name = "X", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!eca", name = "Z", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!eca", name = "ab", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!eca", name = "bb", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!eca", name = "db", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!eca", name = "gb", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!eca", name = "hb", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!eca", name = "ib", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!eca", name = "N", descriptor = "Lbm;")
    private class98 field9896;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field9916;
        if (arg0 > -38) {
            this.method524(124);
        }
        return this.field9893.method1467(0);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        if (arg0 > 60) {
            ++field9897;
            this.field9893.method1463(false, arg1);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        this.field9893.method1464(arg0, -1);
        if (arg1) {
            field9911 = 59;
        }
        ++field9906;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        ++field9904;
        if (!arg0) {
            method3935(false);
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        if (arg0 != -105) {
            return -51;
        } else {
            ++field9891;
            return this.field9893.field3203;
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = -91 % ((arg0 - 43) / 44);
        ++field9899;
        return this.field9893.field3193;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (arg0 != -29645) {
            return null;
        } else {
            ++field9898;
            return this.field9896;
        }
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = -18 / ((-36 - arg0) / 53);
        ++field9908;
        return this.field9905;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 <= 73) {
            this.method455(-103, -64, (class697) null, 54, 53, (class167) null, false);
        }
        ++field9909;
        return this.field9893.method1468((byte) 61);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZII)V")
    public class704(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field1267);
        this.field9893 = new class210(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field9907 = ~arg1.field1290 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        if (arg1 != -1008) {
            this.method455(100, -69, (class697) null, -15, -71, (class167) null, true);
        }
        ++field9915;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        ++field9895;
        if (!arg0) {
            field9914 = 1.072816F;
        }
        return this.field9893.method1472(-43);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        if (arg0 != 52) {
            this.method845(53);
        }
        ++field9903;
        return this.field9893.field3212;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field9900;
        int var5 = 122 / ((-30 - arg1) / 36);
        class55 var6 = this.field9893.method1470(131072, (byte) 123, super.field9815, arg0, false, false, super.field9806);
        if (var6 == null) {
            return false;
        } else {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806, super.field9809, super.field9815);
            return !class7.field521 ? var6.method358(arg2, arg3, var7, false) : var6.method318(arg2, arg3, var7, false, class477.field6857);
        }
    }

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        if (arg0 >= -15) {
            this.method522((byte) -61);
        }
        ++field9917;
        return false;
    }

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (arg0 >= -12) {
            field9914 = -0.6813228F;
        }
        ++field9910;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field9892;
        class55 var3 = this.field9893.method1470(2048, (byte) 98, super.field9815, arg1, false, true, super.field9806);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method53();
            var4.method905(super.field9806, super.field9809, super.field9815);
            class531 var5 = null;
            if (this.field9907) {
                var5 = class370.method2347(1, (byte) -127);
            }
            int var6 = super.field9806 >> 9;
            int var7 = super.field9815 >> 9;
            this.field9893.method1473(var6, var6, var7, arg1, var4, var7, var3, 0, true);
            if (arg0 != 92160000) {
                return null;
            } else {
                if (!class7.field521) {
                    var3.method334(var4, var5 == null ? null : var5.field7451[0], 0);
                } else {
                    var3.method317(var4, var5 != null ? var5.field7451[0] : null, class477.field6857, 0);
                }
                if (this.field9893.field3222 != null) {
                    class518 var8 = this.field9893.field3222.method582();
                    if (!class7.field521) {
                        arg1.method123(var8);
                    } else {
                        arg1.method72(var8, class477.field6857);
                    }
                }
                this.field9905 = var3.method363() || this.field9893.field3222 != null;
                if (this.field9896 == null) {
                    this.field9896 = class86.method857(super.field9815, -1, super.field9809, var3, super.field9806);
                } else {
                    class653.method3724(super.field9806, super.field9809, 30955, var3, this.field9896, super.field9815);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(FIIFIIFI)[F")
    public static final float[] method3934(float arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, int arg7) {
        ++field9902;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[arg7] = var10;
        var8[4] = 1.0F;
        var8[3] = 0.0F;
        var8[2] = var11;
        var8[6] = -var11;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var18 = -var16 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg1 / var19;
            }
            var13[6] = var14 * var15 * var18;
            var13[0] = var14 * var14 * var18 + var16;
            var13[3] = -var15 * var17;
            var13[5] = var14 * var17;
            var13[1] = var15 * var17;
            var13[8] = var15 * var15 * var18 + var16;
            var13[2] = var14 * var15 * var18;
            var13[4] = var16;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[8] *= arg0;
        var9[5] *= arg3;
        var9[2] *= arg6;
        var9[4] *= arg3;
        var9[7] *= arg0;
        var9[0] *= arg6;
        var9[1] *= arg6;
        var9[6] *= arg0;
        var9[3] *= arg3;
        return var9;
    }

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "(Z)V")
    public static void method3935(boolean arg0) {
        if (arg0) {
            field9913 = null;
            field9894 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            this.field9893 = null;
        }
        ++field9912;
        return false;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field9901;
        class55 var3 = this.field9893.method1470(262144, (byte) 86, super.field9815, arg1, true, true, super.field9806);
        if (var3 != null) {
            int var4 = super.field9806 >> 9;
            int var5 = super.field9815 >> 9;
            class396 var6 = arg1.method53();
            var6.method905(super.field9806, super.field9809, super.field9815);
            this.field9893.method1473(var4, var4, var5, arg1, var6, var5, var3, 0, false);
        }
        if (arg0) {
            this.method447(82);
        }
    }
}
