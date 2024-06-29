import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 extends class699 {

    @OriginalMember(owner = "client!iha", name = "P", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!iha", name = "Y", descriptor = "I")
    public int field253 = 0;

    @OriginalMember(owner = "client!iha", name = "fb", descriptor = "I")
    public int field260 = -1;

    @OriginalMember(owner = "client!iha", name = "gb", descriptor = "I")
    private int field261 = 0;

    @OriginalMember(owner = "client!iha", name = "ab", descriptor = "I")
    public int field255 = -1;

    @OriginalMember(owner = "client!iha", name = "O", descriptor = "Lea;")
    public static class547 field243 = new class547(65, -1);

    @OriginalMember(owner = "client!iha", name = "bb", descriptor = "Llga;")
    public static class712 field256 = new class712(73, 8);

    @OriginalMember(owner = "client!iha", name = "hb", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!iha", name = "A", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!iha", name = "L", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!iha", name = "M", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!iha", name = "Q", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!iha", name = "R", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!iha", name = "S", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!iha", name = "T", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!iha", name = "U", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!iha", name = "V", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!iha", name = "W", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!iha", name = "X", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!iha", name = "Z", descriptor = "I")
    public int field254;

    @OriginalMember(owner = "client!iha", name = "cb", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!iha", name = "db", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!iha", name = "eb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!iha", name = "ib", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!iha", name = "jb", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)Z")
    public final boolean method123(int arg0) {
        ++field241;
        int var2 = -91 % ((-76 - arg0) / 47);
        return false;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;II)Lcda;")
    public static final class173 method124(String arg0, int arg1, int arg2) {
        ++field250;
        class173 var3;
        try {
            var3 = (class173) Class.forName("wt").newInstance();
        } catch (Throwable var4) {
            var3 = new class434();
        }
        var3.field2149 = arg2;
        if (arg1 != 0) {
            return null;
        } else {
            var3.field2143 = arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIB)Z")
    public static final boolean method125(int arg0, int arg1, byte arg2) {
        ++field242;
        if (arg2 != -15) {
            return false;
        } else {
            return ~(262144 & arg0) != -1 | class571.method3212(arg0, 6, arg1) || class90.method644(55, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        ++field246;
        return arg0 != 6540 ? true : this.field244;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field240;
        class603 var3 = class413.method2383(super.field2175, super.field2170 >> class443.field6172, super.field2165 >> class443.field6172);
        if (var3 != null && var3.field8410.field10431) {
            int var4 = var3.field8410.method132(0);
            if (this.field253 != var4) {
                super.field2178 -= this.field253;
                super.field2178 += var4;
                this.field253 = var4;
            }
        }
        class10 var5 = arg0.method410();
        var5.method24();
        if (arg1 > -12) {
            return null;
        } else {
            if (var3 == null || !var3.field8410.field10431) {
                boolean var6 = false;
                boolean var7 = false;
                boolean var8 = false;
                class281 var9 = class25.field188[super.field2167];
                int var10 = this.field261 << 1;
                int var12 = -var10 / 2;
                int var13 = -var10 / 2;
                int var14 = var9.method1683(super.field2170 - -var12, super.field2165 - -var13, true);
                int var15 = var10 / 2;
                int var16 = -var10 / 2;
                int var17 = var9.method1683(super.field2170 + var15, super.field2165 - -var16, true);
                int var18 = -var10 / 2;
                int var19 = var10 / 2;
                int var20 = var9.method1683(super.field2170 - -var18, super.field2165 - -var19, true);
                int var21 = var10 / 2;
                int var22 = var10 / 2;
                int var23 = var9.method1683(super.field2170 + var21, super.field2165 + var22, true);
                int var24 = var17 <= var14 ? var17 : var14;
                int var25 = ~var23 >= ~var20 ? var23 : var20;
                int var26 = ~var17 > ~var23 ? var17 : var23;
                int var27 = ~var14 > ~var20 ? var14 : var20;
                if (var10 != 0) {
                    int var28 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (var24 - var25), (double) var10));
                    if (~var28 != -1) {
                        var5.method38(var28);
                    }
                }
                if (~var10 != -1) {
                    int var29 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (-var26 + var27), (double) var10));
                    if (var29 != 0) {
                        var5.method23(-var29);
                    }
                }
                int var30 = var14 + var23;
                if (~var30 < ~(var17 + var20)) {
                    var30 = var17 + var20;
                }
                int var31 = (var30 >> 1) - super.field2178;
                if (~var31 != -1) {
                    var5.method39(0, var31, 0);
                }
            }
            var5.method39(super.field2170, super.field2178 + -10, super.field2165);
            class62 var32 = class413.method2384(3, (byte) -47, true);
            this.field244 = false;
            this.field261 = 0;
            if (~this.field260 != 0) {
                class472 var33 = class761.field10628.method4169(this.field260, (byte) -118).method3946(0, 2048, 0, (class300) null, -1, arg0, this.field247, 128, (class34) null);
                if (var33 != null) {
                    if (!class670.field9312) {
                        var33.method230(var5, var32.field678[2], 0);
                    } else {
                        var33.method243(var5, var32.field678[2], class661.field9249, 0);
                    }
                    this.field244 |= var33.method219();
                    this.field261 = var33.method212();
                }
            }
            if (this.field255 != -1) {
                class472 var34 = class761.field10628.method4169(this.field255, (byte) -122).method3946(0, 2048, 0, (class300) null, -1, arg0, this.field264, 128, (class34) null);
                if (var34 != null) {
                    if (!class670.field9312) {
                        var34.method230(var5, var32.field678[1], 0);
                    } else {
                        var34.method243(var5, var32.field678[1], class661.field9249, 0);
                    }
                    this.field244 |= var34.method219();
                    if (var34.method212() > this.field261) {
                        this.field261 = var34.method212();
                    }
                }
            }
            class472 var35 = class761.field10628.method4169(this.field254, (byte) -121).method3946(0, 2048, 0, (class300) null, -1, arg0, this.field251, 128, (class34) null);
            if (var35 != null) {
                if (class670.field9312) {
                    var35.method243(var5, var32.field678[0], class661.field9249, 0);
                } else {
                    var35.method230(var5, var32.field678[0], 0);
                }
                this.field244 |= var35.method219();
                if (~var35.method212() < ~this.field261) {
                    this.field261 = var35.method212();
                }
            }
            return var32;
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        if (arg0) {
            field256 = null;
        }
        ++field259;
        return this.field261;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
    public static final void method129(byte arg0) {
        ++field257;
        class262 var1 = class70.field759;
        synchronized (class70.field759) {
            if (arg0 == 60) {
                class70.field759.method1575((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)I")
    public final int method130(int arg0) {
        if (arg0 != -14240) {
            return 114;
        } else {
            ++field252;
            class697 var2 = class761.field10628.method4169(this.field254, (byte) -116);
            int var3 = var2.field9774;
            if (this.field255 != -1) {
                class697 var4 = class761.field10628.method4169(this.field255, (byte) -122);
                if (~var4.field9774 < ~var3) {
                    var3 = var4.field9774;
                }
            }
            if (~this.field260 != 0) {
                class697 var5 = class761.field10628.method4169(this.field260, (byte) -118);
                if (~var3 > ~var5.field9774) {
                    var3 = var5.field9774;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        ++field245;
        if (arg2 < 59) {
            this.method132(-84);
        }
        class10 var5 = arg1.method410();
        var5.method33(super.field2170, super.field2178 + -10, super.field2165);
        class697 var6 = class761.field10628.method4169(this.field254, (byte) -118);
        class472 var7 = var6.method3946(0, 131072, 0, (class300) null, -1, arg1, this.field251, 128, (class34) null);
        if (var7 != null && (class670.field9312 ? var7.method196(arg0, arg3, var5, true, var6.field9774, class661.field9249) : var7.method206(arg0, arg3, var5, true, var6.field9774))) {
            return true;
        } else {
            if (~this.field255 != 0) {
                class697 var8 = class761.field10628.method4169(this.field255, (byte) -121);
                class472 var9 = var8.method3946(0, 131072, 0, (class300) null, -1, arg1, this.field264, 128, (class34) null);
                if (var9 != null && (class670.field9312 ? var9.method196(arg0, arg3, var5, true, var8.field9774, class661.field9249) : var9.method206(arg0, arg3, var5, true, var8.field9774))) {
                    return true;
                }
            }
            if (this.field260 != -1) {
                class697 var10 = class761.field10628.method4169(this.field260, (byte) -127);
                class472 var11 = var10.method3946(0, 131072, 0, (class300) null, -1, arg1, this.field247, 128, (class34) null);
                if (var11 != null && (class670.field9312 ? var11.method196(arg0, arg3, var5, true, var10.field9774, class661.field9249) : var11.method206(arg0, arg3, var5, true, var10.field9774))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)I")
    public final int method132(int arg0) {
        if (arg0 != 0) {
            this.field260 = 51;
        }
        ++field258;
        return -10;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILem;IIIIILha;IIII)V")
    public static final void method133(int arg0, class227 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class60 arg7, int arg8, int arg9, int arg10, int arg11) {
        if (~arg6 < ~arg11 && arg6 < arg3 + arg11 && arg8 > arg4 + -13 && arg8 < arg4 + 3 && arg1.field2942) {
            arg10 = arg2;
        }
        ++field249;
        int[] var12 = null;
        if (!class425.method2435(119, arg1.field2948)) {
            if (arg1.field2946 == -1) {
                if (!class641.method3607(arg1.field2948, (byte) -87)) {
                    if (class422.method2408(arg1.field2948, false)) {
                        Object var13 = null;
                        class685 var14;
                        if (~arg1.field2948 == -1010) {
                            var14 = class707.field9894.method4109((int) arg1.field2945, (byte) 119);
                        } else {
                            var14 = class707.field9894.method4109((int) (2147483647L & arg1.field2945 >>> 32), (byte) 119);
                        }
                        if (var14.field9528 != null) {
                            var14 = var14.method3875(class386.field5455, (byte) -66);
                        }
                        if (var14 != null) {
                            var12 = var14.field9539;
                        }
                    }
                } else {
                    class706 var15 = (class706) class681.field9475.method2552((long) ((int) arg1.field2945), -1);
                    if (var15 != null) {
                        class215 var16 = var15.field9890;
                        class274 var17 = var16.field2589;
                        if (var17.field3616 != null) {
                            var17 = var17.method1637(class386.field5455, (byte) 32);
                        }
                        if (var17 != null) {
                            var12 = var17.field3668;
                        }
                    }
                }
            } else {
                var12 = class761.field10628.method4169(arg1.field2946, (byte) -117).field9762;
            }
        } else {
            var12 = class761.field10628.method4169((int) arg1.field2945, (byte) -127).field9762;
        }
        String var18 = class656.method3714((byte) -124, arg1);
        if (var12 != null) {
            var18 = var18 + class41.method247(0, var12);
        }
        class214.field2575.method477(arg4, class385.field5414, arg9, var18, arg10, arg11 + 3, (byte) 18, class587.field8211);
        if (arg1.field2941) {
            class15.field112.method3859(class616.field8643.method2216(var18, 118) + arg11 - -5, arg4 + -12);
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        if (arg0 != -53) {
            this.method134((byte) -91, (class60) null);
        }
        ++field248;
        return null;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(B)V")
    public static void method135(byte arg0) {
        if (arg0 == -37) {
            field243 = null;
            field256 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        int var3 = 5 % ((53 - arg1) / 46);
        ++field263;
    }
}
