import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class73 extends class309 {

    @OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!vf", name = "tb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!vf", name = "ub", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!vf", name = "vb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!vf", name = "wb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!vf", name = "xb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!vf", name = "yb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!vf", name = "zb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!vf", name = "Ab", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!vf", name = "Bb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!vf", name = "Cb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!vf", name = "Db", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!vf", name = "Eb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!vf", name = "Fb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!vf", name = "Gb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!vf", name = "Hb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!vf", name = "Ib", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "[Lsa;")
    public static class542[] field1360;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method708(int arg0, byte arg1, int arg2) {
        int var3 = 109 / ((47 - arg1) / 34);
        ++field1372;
        return class399.method2438(arg0, arg2, 540800) || class586.method3358(55, arg0, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "()Z", line = 13)
    public final boolean method407() {
        ++field1375;
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V", line = 21)
    public final void method399(int arg0) {
        super.field4499[arg0].method1198((Runnable) null, 8);
        ++field1366;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 30)
    public final void method403(int arg0) {
        super.field4502 = arg0;
        ++field1365;
        super.field4499 = new class412[super.field4502];
        for (int var2 = 0; ~var2 > ~super.field4502; ++var2) {
            super.field4499[var2] = new class412(this);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 55)
    public final class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1374;
        return new class491(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 64)
    public final void method402(Canvas arg0) {
        ++field1361;
        class453 var2 = (class453) super.field4474.method740(0, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method911(-52);
            class453 var3 = class509.method2862(arg0, true);
            super.field4474.method737((long) arg0.hashCode(), (byte) 92, var3);
            if (super.field4475 == arg0 && super.field4517 == null) {
                super.field4471 = var3;
                super.field4497 = var3.field6566;
                super.field4481 = var3.field6565;
                super.field4515 = var3.field6564;
                this.method1930();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 89)
    public final void method394(Canvas arg0) {
        ++field1362;
        if (arg0 == null) {
            super.field4475 = null;
            super.field4471 = null;
            if (super.field4517 == null) {
                super.field4515 = null;
                super.field4481 = super.field4497 = 1;
                this.method1930();
            }
        } else {
            class453 var2 = (class453) super.field4474.method740(0, (long) arg0.hashCode());
            if (var2 != null) {
                super.field4471 = var2;
                super.field4475 = arg0;
                if (super.field4517 == null) {
                    super.field4481 = var2.field6565;
                    super.field4497 = var2.field6566;
                    super.field4515 = var2.field6564;
                    this.method1930();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 129)
    public final void method398(int arg0) {
        ++field1373;
        super.field4499[arg0].method1198(Thread.currentThread(), 8);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lkw;", line = 137)
    public final class174 method395(Runnable arg0) {
        ++field1364;
        for (int var2 = 0; ~super.field4502 < ~var2; ++var2) {
            if (super.field4499[var2].field2516 == arg0) {
                return super.field4499[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V", line = 156)
    public static void method709(boolean arg0) {
        if (!arg0) {
            method710((String) null, -122, (String) null, -113);
        }
        field1360 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V", line = 169)
    public final void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4) {
        ++field1367;
        class622[] var6 = new class622[arg0.length];
        for (int var7 = 0; ~var7 > ~arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class622) arg0[var7];
            }
        }
        class622 var8 = class622.method3533(this, var6);
        var8.method1446(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lld;IIII)Lr;", line = 192)
    public final class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1376;
        return new class622(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 204)
    public static final void method710(String arg0, int arg1, String arg2, int arg3) {
        class343.field4929 = arg1;
        class490.field6891 = 2;
        ++field1368;
        class480.method2765(false, 0, arg2, arg0);
        if (arg3 != -31566) {
            field1363 = -109;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V", line = 217)
    public final void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3) {
        ++field1371;
        class622[] var5 = new class622[arg0.length];
        for (int var6 = 0; ~arg0.length < ~var6; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class622) arg0[var6];
            }
        }
        class622 var7 = class622.method3533(this, var5);
        var7.method1446(arg1, arg2 != null ? arg2[0] : null, (class616) null, arg3);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V", line = 238)
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1377;
        class412 var8 = (class412) this.method395(Thread.currentThread());
        class613 var9 = var8.field6106;
        int var10 = -arg0 + arg2;
        int var11 = arg3 - arg1;
        int var12 = ~var10 <= -1 ? var10 : -var10;
        int var13 = ~var11 <= -1 ? var11 : -var11;
        int var14 = var12;
        if (~var13 < ~var12) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var15 >> 16) + var10;
            int var17 = (var11 << 16) / var14;
            int var18 = (var17 >> 16) + var11;
            if (var17 <= var15) {
                var15 = -var15;
            } else {
                var17 = -var17;
            }
            int var19 = arg5 * var17 >> 17;
            int var20 = arg5 * var17 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method3482();
            int var23 = arg5 * var15 + 1 >> 17;
            int var24 = arg1 - var9.method3474();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = var16 + var22 + -var20;
            int var28 = var16 + var22 - -var19;
            int var29 = var21 + var24;
            int var30 = var24 - var23;
            int var31 = -var23 + var24 - -var18;
            int var32 = var18 + var24 + var21;
            if (~arg6 != -1) {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field8704 = -(arg4 >>> 24) + 255;
            } else {
                var9.field8704 = 0;
            }
            var9.field8707 = var25 < 0 || ~var25 < ~var9.field8697 || var26 < 0 || var26 > var9.field8697 || ~var27 > -1 || ~var9.field8697 > ~var27;
            var9.method3484(var29, var30, var31, var25, var26, var27, arg4);
            var9.field8707 = var25 < 0 || var25 > var9.field8697 || ~var26 > -1 || ~var9.field8697 > ~var26 || var28 < 0 || ~var9.field8697 > ~var28;
            var9.method3484(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V", line = 317)
    public class73(Canvas arg0, class472 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "()V", line = 321)
    public final void method396() {
        ++field1369;
        super.field4514 = -super.field4489 + super.field4484;
        super.field4510 = super.field4512 - super.field4511;
        super.field4509 = -super.field4511 + super.field4483;
        super.field4516 = -super.field4489 + super.field4501;
        for (int var1 = 0; var1 < super.field4502; ++var1) {
            class613 var5 = ((class412) super.field4499[var1]).field6106;
            var5.field8698 = -super.field4512 + super.field4483;
            var5.field8705 = -super.field4512 + super.field4511;
            var5.field8697 = -super.field4484 + super.field4501;
            var5.field8694 = -super.field4484 + super.field4489;
        }
        int var2 = super.field4512 * super.field4481 - -super.field4484;
        for (int var3 = super.field4512; var3 < super.field4483; ++var3) {
            for (int var4 = 0; var4 < super.field4502; ++var4) {
                ((class412) super.field4499[var4]).field6106.field8706[var3 - super.field4512] = var2;
            }
            var2 += super.field4481;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIII)V", line = 364)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1370;
        class412 var11 = (class412) this.method395(Thread.currentThread());
        class613 var12 = var11.field6106;
        var12.field8707 = true;
        var12.field8696 = false;
        int var13 = arg6 >>> 24;
        if (~arg9 == -1 || arg9 == 1 && var13 == 255) {
            var12.field8703 = false;
            var12.field8704 = 0;
            var12.method3480(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else if (arg9 != 1) {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field8704 = 128;
            var12.field8703 = true;
            var12.method3480(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            var12.field8704 = 255 - var13;
            var12.field8703 = false;
            var12.method3480(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field8696 = true;
    }
}
