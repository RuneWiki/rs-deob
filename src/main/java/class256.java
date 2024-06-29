import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class256 extends class208 {

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private int field3283;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lmh;")
    private class537 field3287;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    private int field3288;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lkh;")
    private class15 field3290;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI)[B")
    public static final byte[] method1443(int arg0, int arg1, byte[] arg2, int arg3) {
        field3281++;
        byte[] var4;
        if (arg0 > 0) {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg2[arg0 + var5];
            }
        } else {
            var4 = arg2;
        }
        class566 var6 = new class566();
        var6.method3305(-99);
        var6.method3300(var4, (byte) -109, (long) (arg1 * 8));
        byte[] var7 = new byte[64];
        var6.method3299(var7, false, arg3);
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
    public static final Object method1444(byte arg0, boolean arg1, byte[] arg2) {
        if (arg0 < 55) {
            return null;
        }
        field3282++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class463.field6473) {
            try {
                class124 var3 = (class124) Class.forName("pu").getDeclaredConstructor().newInstance();
                var3.method713(arg2, 4818);
                return var3;
            } catch (Throwable var4) {
                class463.field6473 = true;
            }
        }
        return arg1 ? class252.method1428(28726, arg2) : arg2;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBZ)Lct;")
    public static final class125 method1445(int arg0, byte arg1, boolean arg2) {
        if (arg1 >= -12) {
            return null;
        } else {
            field3295++;
            long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
            return (class125) class394.field5207.method2645(var3, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(FB)F")
    public static final float method1446(float arg0, byte arg1) {
        if (arg1 <= 41) {
            method1447(54, 26, 42, (byte) -20, -117, -25);
        }
        field3286++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lkh;")
    public final class15 method1201(byte arg0) {
        field3293++;
        if (arg0 != 51) {
            this.field3284 = -17;
        }
        if (this.field3290 == null) {
            class266.field3464[0] = this.field3284;
            class266.field3464[5] = this.field3289;
            class266.field3464[4] = this.field3288;
            class17 var2 = this.field3287.field2481;
            class266.field3464[3] = this.field3292;
            class266.field3464[2] = this.field3283;
            class266.field3464[1] = this.field3294;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method118(class266.field3464[var5], (byte) 113)) {
                    return null;
                }
                class217 var7 = var2.method119(-110, class266.field3464[var5]);
                int var8 = var7.field2642 ? 64 : 128;
                if (var7.field2654 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class22.field151[var6] = var2.method120(var4, false, 1.0F, class266.field3464[var6], var4, 99);
            }
            this.field3290 = new class15(this.field3287, 6407, var4, var3, class22.field151);
        }
        return this.field3290;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIBII)V")
    public static final void method1447(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3291++;
        int var6 = arg2 - arg1;
        int var7 = arg0 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class443.method2598(arg2, (byte) 127, arg1, arg5, arg4);
            }
        } else if (var6 == 0) {
            class78.method456(-2, arg4, arg5, arg1, arg0);
        } else if (arg3 >= 69) {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                int var10 = arg0;
                arg5 = arg1;
                arg0 = arg2;
                arg1 = var9;
                arg2 = var10;
            }
            if (arg5 > arg0) {
                int var11 = arg5;
                int var12 = arg1;
                arg5 = arg0;
                arg1 = arg2;
                arg0 = var11;
                arg2 = var12;
            }
            int var13 = arg1;
            int var14 = arg0 - arg5;
            int var15 = arg2 - arg1;
            int var16 = -(var14 >> 1);
            int var17 = arg2 > arg1 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg5; var18 <= arg0; var18++) {
                    class328.field4287[var18][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg0; var19++) {
                    var16 += var15;
                    class328.field4287[var13][var19] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lmh;IIIIII)V")
    public class256(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3292 = arg4;
        this.field3283 = arg3;
        this.field3284 = arg1;
        this.field3289 = arg6;
        this.field3287 = arg0;
        this.field3294 = arg2;
        this.field3288 = arg5;
    }
}
