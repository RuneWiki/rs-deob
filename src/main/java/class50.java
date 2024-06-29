import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class50 extends class446 {

    @OriginalMember(owner = "client!fw", name = "Db", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!fw", name = "R", descriptor = "Lbk;")
    public static class314 field411 = new class314();

    @OriginalMember(owner = "client!fw", name = "Gb", descriptor = "Z")
    public static boolean field429 = false;

    @OriginalMember(owner = "client!fw", name = "Hb", descriptor = "[I")
    public static int[] field430 = new int[6];

    @OriginalMember(owner = "client!fw", name = "pb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!fw", name = "qb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!fw", name = "rb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!fw", name = "sb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!fw", name = "tb", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!fw", name = "ub", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!fw", name = "vb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!fw", name = "wb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!fw", name = "xb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!fw", name = "yb", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!fw", name = "zb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!fw", name = "Ab", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!fw", name = "Bb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!fw", name = "Cb", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!fw", name = "Eb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!fw", name = "Fb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field421;
        class351 var11 = (class351) this.method276(Thread.currentThread());
        class579 var12 = var11.field4535;
        var12.field8453 = true;
        var12.field8445 = false;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || ~arg9 == -2 && ~var13 == -256) {
            var12.field8451 = false;
            var12.field8441 = 0;
            var12.method3375(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field8441 = 255 - var13;
            var12.field8451 = false;
            var12.method3375(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (~arg9 != -3) {
                throw new IllegalArgumentException();
            }
            var12.field8441 = 128;
            var12.field8451 = true;
            var12.method3375(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field8445 = true;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field412;
        return new class311(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)V")
    public static void method266(byte arg0) {
        field430 = null;
        field411 = null;
        if (arg0 != 17) {
            method266((byte) 85);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIII)V")
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field413;
        class351 var8 = (class351) this.method276(Thread.currentThread());
        class579 var9 = var8.field4535;
        int var10 = -arg0 + arg2;
        int var11 = -arg1 + arg3;
        int var12 = ~var10 > -1 ? -var10 : var10;
        int var13 = ~var11 <= -1 ? var11 : -var11;
        int var14 = var12;
        if (~var12 > ~var13) {
            var14 = var13;
        }
        if (~var14 != -1) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (~var15 > ~var16) {
                var16 = -var16;
            } else {
                var15 = -var15;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method3373();
            int var24 = arg1 - var9.method3372();
            int var25 = var23 - -var19;
            int var26 = -var20 + var23;
            int var27 = -var20 + var17 + var23;
            int var28 = var17 + var23 + var19;
            int var29 = var24 - -var21;
            int var30 = var24 - var22;
            int var31 = var24 - -var18 + -var22;
            int var32 = var18 + var24 + var21;
            if (~arg6 == -1) {
                var9.field8441 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field8441 = -(arg4 >>> 24) + 255;
            }
            var9.field8453 = var25 < 0 || ~var9.field8446 > ~var25 || var26 < 0 || ~var26 < ~var9.field8446 || ~var27 > -1 || ~var9.field8446 > ~var27;
            var9.method3370(var29, var30, var31, var25, var26, var27, arg4);
            var9.field8453 = var25 < 0 || ~var25 < ~var9.field8446 || ~var26 > -1 || var26 > var9.field8446 || var28 < 0 || var9.field8446 < var28;
            var9.method3370(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method268(Canvas arg0) {
        ++field420;
        class558 var2 = (class558) super.field6144.method2645((long) arg0.hashCode(), (byte) -108);
        if (var2 != null) {
            var2.method3187(true);
            class558 var3 = class82.method482(arg0, 127);
            super.field6144.method2640(1, (long) arg0.hashCode(), var3);
            if (super.field6142 == arg0 && super.field6152 == null) {
                super.field6172 = var3.field8221;
                super.field6155 = var3.field8219;
                super.field6147 = var3;
                super.field6171 = var3.field8218;
                this.method2614();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "()V")
    public final void method269() {
        super.field6158 = -super.field6174 + super.field6167;
        super.field6159 = -super.field6174 + super.field6150;
        super.field6183 = -super.field6164 + super.field6184;
        ++field417;
        super.field6169 = -super.field6164 + super.field6187;
        for (int var1 = 0; super.field6168 > var1; ++var1) {
            class579 var5 = ((class351) super.field6153[var1]).field4535;
            var5.field8446 = -super.field6187 + super.field6184;
            var5.field8448 = -super.field6187 + super.field6164;
            var5.field8450 = -super.field6150 + super.field6167;
            var5.field8444 = super.field6174 - super.field6150;
        }
        int var2 = super.field6171 * super.field6150 - -super.field6187;
        for (int var3 = super.field6150; var3 < super.field6167; ++var3) {
            for (int var4 = 0; ~super.field6168 < ~var4; ++var4) {
                ((class351) super.field6153[var4]).field4535.field8449[var3 - super.field6150] = var2;
            }
            var2 += super.field6171;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V")
    public final void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4) {
        ++field415;
        class227[] var6 = new class227[arg0.length];
        for (int var7 = 0; arg0.length > var7; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class227) arg0[var7];
            }
        }
        class227 var8 = class227.method1297(this, var6);
        var8.method409(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "()Z")
    public final boolean method271() {
        ++field422;
        return false;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
    public final void method272(int arg0) {
        super.field6168 = arg0;
        ++field424;
        super.field6153 = new class351[super.field6168];
        for (int var2 = 0; ~super.field6168 < ~var2; ++var2) {
            super.field6153[var2] = new class351(this);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V")
    public final void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3) {
        ++field428;
        class227[] var5 = new class227[arg0.length];
        for (int var6 = 0; ~arg0.length < ~var6; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class227) arg0[var6];
            }
        }
        class227 var7 = class227.method1297(this, var5);
        var7.method409(arg1, arg2 != null ? arg2[0] : null, (class400) null, arg3);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class50(Canvas arg0, class17 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method274(Canvas arg0) {
        if (arg0 != null) {
            class558 var2 = (class558) super.field6144.method2645((long) arg0.hashCode(), (byte) -97);
            if (var2 != null) {
                super.field6142 = arg0;
                super.field6147 = var2;
                if (super.field6152 == null) {
                    super.field6172 = var2.field8221;
                    super.field6171 = var2.field8218;
                    super.field6155 = var2.field8219;
                    this.method2614();
                }
            }
        } else {
            super.field6142 = null;
            super.field6147 = null;
            if (super.field6152 == null) {
                super.field6171 = super.field6155 = 1;
                super.field6172 = null;
                this.method2614();
            }
        }
        ++field416;
    }

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)V")
    public final void method275(int arg0) {
        super.field6153[arg0].method1470(true, (Runnable) null);
        ++field414;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvc;")
    public final class263 method276(Runnable arg0) {
        ++field419;
        for (int var2 = 0; ~var2 > ~super.field6168; ++var2) {
            if (super.field6153[var2].field3387 == arg0) {
                return super.field6153[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lei;IIII)Lr;")
    public final class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field427;
        return new class227(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field418;
        super.field6153[arg0].method1470(true, Thread.currentThread());
    }
}
