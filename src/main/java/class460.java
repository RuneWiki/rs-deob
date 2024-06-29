import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class460 extends class446 {

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!ac", name = "zb", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!ac", name = "Ab", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!ac", name = "Bb", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!ac", name = "Cb", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!ac", name = "Db", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!ac", name = "Fb", descriptor = "I")
    private int field6355;

    @OriginalMember(owner = "client!ac", name = "Gb", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!ac", name = "Hb", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ac", name = "Ib", descriptor = "I")
    private int field6358;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "[I")
    public int[] field6340;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "()Z")
    public final boolean method271() {
        ++field6343;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method2682(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= -56) {
            field6344 = -32;
        }
        ++field6352;
        if (~arg1 == ~arg4) {
            class540.method3148(arg2, arg5, arg6, arg7, 23240, arg1, arg0);
        } else if (~(arg7 - arg1) <= ~class470.field6589 && arg1 + arg7 <= class592.field8588 && class563.field8282 <= -arg4 + arg0 && class271.field3513 >= arg0 + arg4) {
            class249.method1396(arg0, arg2, arg1, arg4, arg5, false, arg7, arg6);
        } else {
            class580.method3379(arg5, arg2, arg0, arg7, -1, arg6, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "()V")
    public final void method1166() {
        ++field6353;
        int var1 = this.field6340.length;
        int var2 = -var1 + var1 & 7;
        int var3 = 0;
        while (var2 > var3) {
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
            this.field6340[var3++] = Integer.MAX_VALUE;
        }
        while (~var1 < ~var3) {
            this.field6340[var3++] = Integer.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvc;")
    public final class263 method276(Runnable arg0) {
        ++field6338;
        for (int var2 = 0; var2 < super.field6168; ++var2) {
            if (super.field6153[var2].field3387 == arg0) {
                return super.field6153[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final void method275(int arg0) {
        super.field6153[arg0].method1470(true, (Runnable) null);
        ++field6357;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6341;
        class442 var11 = (class442) this.method276(Thread.currentThread());
        class304 var12 = var11.field6097;
        var12.field3884 = false;
        var12.field3885 = true;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || ~arg9 == -2 && var13 == 255) {
            var12.field3875 = 0;
            var12.field3880 = false;
            var12.method1688(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else if (~arg9 != -2) {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field3875 = 128;
            var12.field3880 = true;
            var12.method1688(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        } else {
            var12.field3880 = false;
            var12.field3875 = -var13 + 255;
            var12.method1688(arg1, arg3, arg5, arg0, arg2, arg4, 0, 0, 0, arg6, arg7, arg8);
        }
        var12.field3884 = true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6345;
        class442 var8 = (class442) this.method276(Thread.currentThread());
        class304 var9 = var8.field6097;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = var11 < 0 ? -var11 : var11;
        int var14 = var12;
        if (var13 > var12) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var16 < ~var15) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 - -1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1680();
            int var24 = arg1 - var9.method1692();
            int var25 = var23 - -var19;
            int var26 = var23 - var20;
            int var27 = var17 + var23 + -var20;
            int var28 = var23 - (-var17 - var19);
            int var29 = var24 - -var21;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var21 + var24 - -var18;
            if (arg6 != 0) {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field3875 = -(arg4 >>> 24) + 255;
            } else {
                var9.field3875 = 0;
            }
            var9.field3885 = ~var25 > -1 || var9.field3873 < var25 || var26 < 0 || ~var26 < ~var9.field3873 || ~var27 > -1 || var27 > var9.field3873;
            var9.method1687(var29, var30, var31, var25, var26, var27, 0, 0, 0, arg4);
            var9.field3885 = var25 < 0 || ~var9.field3873 > ~var25 || var26 < 0 || ~var26 < ~var9.field3873 || var28 < 0 || ~var28 < ~var9.field3873;
            var9.method1687(var29, var31, var32, var25, var27, var28, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lei;IIII)Lr;")
    public final class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6339;
        return new class635(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V")
    public final void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4) {
        ++field6346;
        class635[] var6 = new class635[arg0.length];
        for (int var7 = 0; arg0.length > var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class635) arg0[var7];
            }
        }
        class635 var8 = class635.method3649(this, var6);
        var8.method409(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V")
    public final void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method69(arg1, arg2 == null ? null : arg2[0], arg3);
            }
        }
        ++field6356;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6354;
        return new class491(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "(I)V")
    public static final void method2683(int arg0) {
        ++class559.field8230;
        ++field6348;
        if (arg0 <= 18) {
            field6344 = -39;
        }
        class418.method2378(17984, class541.field7902);
        class136.field1663.method2115(class567.field8326, 3324);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method268(Canvas arg0) {
        ++field6350;
        class558 var2 = (class558) super.field6144.method2645((long) arg0.hashCode(), (byte) -87);
        if (var2 != null) {
            var2.method3187(true);
            class558 var3 = class82.method482(arg0, 127);
            super.field6144.method2640(1, (long) arg0.hashCode(), var3);
            if (super.field6142 == arg0 && super.field6152 == null) {
                super.field6171 = var3.field8218;
                super.field6147 = var3;
                super.field6155 = var3.field8219;
                super.field6172 = var3.field8221;
                this.method2614();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field6347;
        super.field6153[arg0].method1470(true, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "()V")
    public final void method269() {
        super.field6169 = -super.field6164 + super.field6187;
        super.field6183 = -super.field6164 + super.field6184;
        super.field6158 = -super.field6174 + super.field6167;
        ++field6342;
        super.field6159 = -super.field6174 + super.field6150;
        for (int var1 = 0; ~super.field6168 < ~var1; ++var1) {
            class304 var5 = ((class442) super.field6153[var1]).field6097;
            var5.field3882 = -super.field6187 + super.field6164;
            var5.field3878 = -super.field6150 + super.field6174;
            var5.field3873 = super.field6184 - super.field6187;
            var5.field3886 = -super.field6150 + super.field6167;
        }
        int var2 = super.field6171 * super.field6150 + super.field6187;
        for (int var3 = super.field6150; ~var3 > ~super.field6167; ++var3) {
            for (int var4 = 0; ~super.field6168 < ~var4; ++var4) {
                ((class442) super.field6153[var4]).field6097.field3879[-super.field6150 + var3] = var2;
            }
            var2 += super.field6171;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class460(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final void method272(int arg0) {
        ++field6349;
        super.field6168 = arg0;
        super.field6153 = new class442[super.field6168];
        for (int var2 = 0; ~super.field6168 < ~var2; ++var2) {
            super.field6153[var2] = new class442(this);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method274(Canvas arg0) {
        ++field6351;
        if (arg0 == null) {
            super.field6142 = null;
            super.field6147 = null;
            if (super.field6152 == null) {
                super.field6172 = null;
                this.field6358 = this.field6355 = 1;
                super.field6171 = super.field6155 = 1;
                this.method2614();
            }
        } else {
            class558 var2 = (class558) super.field6144.method2645((long) arg0.hashCode(), (byte) -83);
            if (var2 != null) {
                super.field6142 = arg0;
                super.field6147 = var2;
                if (super.field6152 == null) {
                    super.field6171 = var2.field8218;
                    super.field6155 = var2.field8219;
                    super.field6172 = var2.field8221;
                    if (~this.field6358 != ~super.field6171 || this.field6355 != super.field6155) {
                        this.field6358 = super.field6171;
                        this.field6355 = super.field6155;
                        this.field6340 = new int[this.field6358 * this.field6355];
                    }
                    this.method2614();
                    return;
                }
            }
        }
    }
}
