import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class118 extends class569 {

    @OriginalMember(owner = "client!vr", name = "Cb", descriptor = "Lig;")
    public static class206 field1475 = null;

    @OriginalMember(owner = "client!vr", name = "ob", descriptor = "[B")
    public static byte[] field1461 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vr", name = "rb", descriptor = "F")
    public static float field1464;

    @OriginalMember(owner = "client!vr", name = "T", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!vr", name = "pb", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!vr", name = "qb", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!vr", name = "sb", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!vr", name = "tb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!vr", name = "vb", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!vr", name = "wb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!vr", name = "xb", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!vr", name = "yb", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!vr", name = "zb", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!vr", name = "Ab", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!vr", name = "Bb", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!vr", name = "Db", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!vr", name = "Eb", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!vr", name = "Fb", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!vr", name = "Gb", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!vr", name = "Ib", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!vr", name = "Hb", descriptor = "Loo;")
    public static class543 field1480;

    @OriginalMember(owner = "client!vr", name = "ub", descriptor = "[[S")
    public static short[][] field1467;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lor;IIII)Lba;")
    public final class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1477;
        return new class584(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "()V")
    public final void method728() {
        ++field1466;
        super.field8182 = -super.field8180 + super.field8196;
        super.field8179 = -super.field8208 + super.field8190;
        super.field8192 = -super.field8208 + super.field8194;
        super.field8201 = -super.field8180 + super.field8168;
        for (int var1 = 0; ~super.field8167 < ~var1; ++var1) {
            class578 var5 = ((class365) super.field8203[var1]).field5523;
            var5.field8342 = super.field8208 - super.field8190;
            var5.field8340 = -super.field8196 + super.field8168;
            var5.field8346 = super.field8180 - super.field8196;
            var5.field8335 = -super.field8190 + super.field8194;
        }
        int var2 = super.field8205 * super.field8196 + super.field8190;
        for (int var3 = super.field8196; ~var3 > ~super.field8168; ++var3) {
            for (int var4 = 0; var4 < super.field8167; ++var4) {
                ((class365) super.field8203[var4]).field5523.field8338[-super.field8196 + var3] = var2;
            }
            var2 += super.field8205;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII)V")
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1476;
        class365 var8 = (class365) this.method732(Thread.currentThread());
        class578 var9 = var8.field5523;
        int var10 = arg2 - arg0;
        int var11 = -arg1 + arg3;
        int var12 = var10 < 0 ? -var10 : var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (~var12 > ~var13) {
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
            int var20 = arg5 * var17 - -1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg0 - var9.method3363();
            int var23 = arg5 * var15 - -1 >> 17;
            int var24 = arg1 - var9.method3356();
            int var25 = var19 + var22;
            int var26 = -var20 + var22;
            int var27 = var16 + var22 + -var20;
            int var28 = var22 - -var16 + var19;
            int var29 = var24 - -var21;
            int var30 = var24 - var23;
            int var31 = -var23 + var18 + var24;
            int var32 = var21 + var24 + var18;
            if (arg6 == 0) {
                var9.field8347 = 0;
            } else {
                if (~arg6 != -2) {
                    throw new IllegalArgumentException();
                }
                var9.field8347 = -(arg4 >>> 24) + 255;
            }
            var9.field8345 = var25 < 0 || ~var9.field8335 > ~var25 || ~var26 > -1 || ~var26 < ~var9.field8335 || var27 < 0 || ~var27 < ~var9.field8335;
            var9.method3358(var29, var30, var31, var25, var26, var27, arg4);
            var9.field8345 = var25 < 0 || var25 > var9.field8335 || ~var26 > -1 || ~var9.field8335 > ~var26 || ~var28 > -1 || ~var28 < ~var9.field8335;
            var9.method3358(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V")
    public final void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3) {
        ++field1460;
        class584[] var5 = new class584[arg0.length];
        for (int var6 = 0; ~var6 > ~arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class584) arg0[var6];
            }
        }
        class584 var7 = class584.method3399(this, var5);
        var7.method2373(arg1, arg2 != null ? arg2[0] : null, (class33) null, arg3);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class465.field6917 = arg0;
        class193.field2559 = 1 << class465.field6917;
        class170.field2095 = class193.field2559 >> 1;
        class582.field8384 = (int) Math.sqrt((double) (class170.field2095 * class170.field2095 + class170.field2095 * class170.field2095));
        class564.field8047 = class193.field2559 >> 2;
        class103.field1229 = class193.field2559;
        class588.field8441 = arg2;
        class91.field1047 = arg3;
        class224.field3164 = arg4;
        class326.field4699 = new class99[arg1][class588.field8441][class91.field1047];
        class544.field7780 = new class132[arg1];
        if (arg5) {
            client.field3599 = new int[class588.field8441][class91.field1047];
            class136.field1696 = new byte[class588.field8441][class91.field1047];
            class184.field2290 = new short[class588.field8441][class91.field1047];
            class327.field4722 = new class99[1][class588.field8441][class91.field1047];
            class492.field7164 = new class132[1];
        } else {
            client.field3599 = null;
            class136.field1696 = null;
            class184.field2290 = null;
            class327.field4722 = null;
            class492.field7164 = null;
        }
        if (arg6) {
            class207.field2784 = new long[arg1][arg2][arg3];
            class48.field512 = new class49[65535];
            class499.field7273 = new boolean[65535];
            class351.field5007 = 0;
        } else {
            class207.field2784 = null;
            class48.field512 = null;
            class499.field7273 = null;
            class351.field5007 = 0;
        }
        class199.method1266(false);
        class92.field1069 = new class262[1000];
        class126.field1564 = 0;
        class490.field7147 = new class262[1000];
        class467.field6928 = 0;
        class326.field4697 = new int[arg1][class588.field8441 + 1][class91.field1047 + 1];
        class392.field6000 = new class144[5000];
        class392.field6001 = 0;
        class437.field6505 = new boolean[class224.field3164 + class224.field3164 + 1][class224.field3164 + class224.field3164 + 1];
        class270.field3789 = new boolean[class224.field3164 + class224.field3164 + 2][class224.field3164 + class224.field3164 + 2];
        class453.field6777 = null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V")
    public class118(Canvas arg0, class462 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method347(Canvas arg0) {
        ++field1462;
        class437 var2 = (class437) super.field8166.method524((byte) 127, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2108(true);
            class437 var3 = class521.method3081((byte) 25, arg0);
            super.field8166.method520((byte) -95, var3, (long) arg0.hashCode());
            if (super.field8162 == arg0 && super.field8188 == null) {
                super.field8198 = var3.field6501;
                super.field8205 = var3.field6506;
                super.field8174 = var3.field6504;
                super.field8161 = var3;
                this.method3306();
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "()Z")
    public final boolean method370() {
        ++field1465;
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method361(Canvas arg0) {
        if (arg0 == null) {
            super.field8162 = null;
            super.field8161 = null;
            if (super.field8188 == null) {
                super.field8205 = super.field8198 = 1;
                super.field8174 = null;
                this.method3306();
            }
        } else {
            class437 var2 = (class437) super.field8166.method524((byte) 86, (long) arg0.hashCode());
            if (var2 != null) {
                super.field8161 = var2;
                super.field8162 = arg0;
                if (super.field8188 == null) {
                    super.field8205 = var2.field6506;
                    super.field8198 = var2.field6501;
                    super.field8174 = var2.field6504;
                    this.method3306();
                }
            }
        }
        ++field1469;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method730(byte arg0) {
        field1461 = null;
        field1475 = null;
        field1480 = null;
        if (arg0 != -22) {
            method730((byte) 121);
        }
        field1467 = null;
    }

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "(I)V")
    public final void method348(int arg0) {
        ++field1471;
        super.field8167 = arg0;
        super.field8203 = new class365[super.field8167];
        for (int var2 = 0; ~var2 > ~super.field8167; ++var2) {
            super.field8203[var2] = new class365(this);
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
    public final void method345(int arg0) {
        super.field8203[arg0].method3033(8191, Thread.currentThread());
        ++field1463;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1470;
        class365 var11 = (class365) this.method732(Thread.currentThread());
        class578 var12 = var11.field5523;
        int var13 = arg2 - super.field8179;
        int var14 = arg3 - super.field8182;
        var12.field8343 = false;
        int var15 = arg1 - super.field8182;
        int var16 = arg5 - super.field8182;
        int var17 = arg4 - super.field8179;
        var12.field8345 = true;
        int var18 = arg0 - super.field8179;
        int var19 = arg6 >>> 24;
        if (~arg9 == -1 || arg9 == 1 && ~var19 == -256) {
            var12.field8347 = 0;
            var12.field8341 = false;
            var12.method3367(var15, var14, var16, var18, var13, var17, arg6, arg7, arg8);
        } else if (~arg9 == -2) {
            var12.field8341 = false;
            var12.field8347 = -var19 + 255;
            var12.method3367(var15, var14, var16, var18, var13, var17, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field8347 = 128;
            var12.field8341 = true;
            var12.method3367(var15, var14, var16, var18, var13, var17, arg6, arg7, arg8);
        }
        var12.field8343 = true;
    }

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "(I)V")
    public static final void method731(int arg0) {
        for (int var1 = arg0; var1 < class220.field3015; ++var1) {
            class85 var2 = class526.field7632[var1];
            boolean var3 = false;
            if (var2.field968 != null) {
                if (!var2.field968.method2109(11574)) {
                    var3 = true;
                }
            } else {
                --var2.field960;
                if (~var2.field960 > ~(!var2.method553(-3) ? -10 : -1500)) {
                    var3 = true;
                } else {
                    if (~var2.field967 == -2 && var2.field962 == null) {
                        var2.field962 = class205.method1317(class573.field8275, var2.field964, 0);
                        if (var2.field962 == null) {
                            continue;
                        }
                        var2.field960 += var2.field962.method1315();
                    } else if (var2.method553(-3) && (var2.field963 == null || var2.field965 == null)) {
                        if (var2.field963 == null) {
                            var2.field963 = class654.method3725(class110.field1356, var2.field964);
                        }
                        if (var2.field963 == null) {
                            continue;
                        }
                        if (var2.field965 == null) {
                            var2.field965 = var2.field963.method3733(new int[] { 22050 });
                            if (var2.field965 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field960 < 0) {
                        int var5;
                        if (var2.field969 != 0) {
                            int var4 = var2.field969 >> 24 & 3;
                            if (class439.field6548.field1757 != var4) {
                                var5 = 0;
                            } else {
                                int var6 = 130560 & var2.field969 << 9;
                                int var7 = (16748867 & var2.field969) >> 16;
                                int var8 = (var7 << 9) + 256 + -class439.field6548.field1764;
                                if (~var8 > -1) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field969 & 65286) >> 8;
                                int var10 = (var9 << 9) + 256 + -class439.field6548.field1768;
                                if (~var10 > -1) {
                                    var10 = -var10;
                                }
                                int var11 = var10 + -512 + var8;
                                if (~var6 > ~var11) {
                                    var2.field960 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (-var11 + var6) * var2.field970 * class595.field8694.field6544 / var6 >> 8;
                            }
                        } else {
                            var5 = var2.field970 * (~var2.field967 == -4 ? class595.field8694.field6529 : class595.field8694.field6532) >> 8;
                        }
                        if (var5 > 0) {
                            class534 var12 = null;
                            if (var2.field967 != 1) {
                                if (var2.method553(-3)) {
                                    var12 = var2.field965;
                                }
                            } else {
                                var12 = var2.field962.method1316().method3117(class94.field1116);
                            }
                            class189 var13 = var2.field968 = class189.method1089(var12, 100, var5);
                            var13.method1112(var2.field961 + -1);
                            class44.field469.method936(var13);
                        }
                    }
                }
            }
            if (var3) {
                --class220.field3015;
                for (int var14 = var1; var14 < class220.field3015; ++var14) {
                    class526.field7632[var14] = class526.field7632[var14 + 1];
                }
                --var1;
            }
        }
        ++field1479;
        if (class93.field1095 && !class448.method2781(105)) {
            if (~class595.field8694.field6562 != -1 && class169.field2064 != -1) {
                class254.method1692(class169.field2064, (byte) -60, class150.field1846, 0, false, class595.field8694.field6562);
            }
            class93.field1095 = false;
        } else if (class595.field8694.field6562 != 0 && ~class169.field2064 != 0 && !class448.method2781(28)) {
            ++class147.field1808;
            class308.method2044(class421.field6306, -7434);
            class468.field6960.method1223(true, class169.field2064);
            class169.field2064 = -1;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V")
    public final void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4) {
        ++field1468;
        class584[] var6 = new class584[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class584) arg0[var7];
            }
        }
        class584 var8 = class584.method3399(this, var6);
        var8.method2373(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1481;
        return new class48(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public final void method296(int arg0) {
        super.field8203[arg0].method3033(8191, (Runnable) null);
        ++field1478;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lnw;")
    public final class509 method732(Runnable arg0) {
        ++field1472;
        for (int var2 = 0; var2 < super.field8167; ++var2) {
            if (super.field8203[var2].field7408 == arg0) {
                return super.field8203[var2];
            }
        }
        return null;
    }
}
