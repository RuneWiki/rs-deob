import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class194 {

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lpca;")
    private class653 field2329 = new class653(128);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Ljo;")
    private class303 field2328;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lkfa;")
    public static class549 field2326 = new class549(83, 4);

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "Lpr;")
    public static class407 field2333 = new class407(62, 6);

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "Lkfa;")
    public static class549 field2334 = new class549(41, -1);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "Ljo;")
    public static class303 field2332;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLfp;)V")
    public static final void method1111(byte arg0, class292 arg1) {
        field2327++;
        arg1.field3789 = 0;
        if (arg1.field3782 != -1) {
            class576 var2 = class618.field8696.method124(24006, arg1.field3782);
            if (var2 == null || var2.field8216 == null) {
                arg1.field3779 = false;
                arg1.field3782 = -1;
            } else {
                label402: {
                    arg1.field3820++;
                    if (arg1.field3773 < var2.field8216.length && arg1.field3820 > var2.field8208[arg1.field3773]) {
                        arg1.field3820 = 1;
                        arg1.field3738++;
                        arg1.field3773++;
                        class259.method1473(arg1.field4641, (byte) 1, var2, arg1.field4647, arg1.field4638, arg1.field3773, class377.field4914 == arg1);
                    }
                    if (var2.field8216.length <= arg1.field3773) {
                        arg1.field3773 = 0;
                        arg1.field3820 = 0;
                        if (arg1.field3779) {
                            arg1.field3782 = arg1.method1653(1).method2653((byte) -97);
                            if (arg1.field3782 == -1) {
                                arg1.field3779 = false;
                                break label402;
                            }
                            var2 = class618.field8696.method124(24006, arg1.field3782);
                        }
                        class259.method1473(arg1.field4641, (byte) 1, var2, arg1.field4647, arg1.field4638, arg1.field3773, class377.field4914 == arg1);
                    }
                    arg1.field3738 = arg1.field3773 + 1;
                    if (var2.field8216.length <= arg1.field3738) {
                        arg1.field3738 = 0;
                    }
                }
            }
        }
        if (arg1.field3774 != -1 && arg1.field3801 <= class469.field6549) {
            class135 var3 = class203.field2487.method2045((byte) 110, arg1.field3774);
            int var4 = var3.field1516;
            if (var4 == -1) {
                arg1.field3774 = -1;
            } else {
                label404: {
                    class576 var5 = class618.field8696.method124(24006, var4);
                    if (var3.field1520) {
                        if (var5.field8232 == 3) {
                            if (arg1.field3840 > 0 && class469.field6549 >= arg1.field3783 && class469.field6549 > arg1.field3826) {
                                arg1.field3774 = -1;
                                break label404;
                            }
                        } else if (var5.field8232 == 1 && arg1.field3840 > 0 && arg1.field3783 <= class469.field6549 && class469.field6549 > arg1.field3826) {
                            arg1.field3801 = class469.field6549 + 1;
                            break label404;
                        }
                    }
                    if (var5 == null || var5.field8216 == null) {
                        arg1.field3774 = -1;
                    } else {
                        if (arg1.field3813 < 0) {
                            arg1.field3813 = 0;
                            class259.method1473(arg1.field4641, (byte) 1, var5, arg1.field4647, arg1.field4638, 0, class377.field4914 == arg1);
                        }
                        arg1.field3804++;
                        if (var5.field8216.length > arg1.field3813 && arg1.field3804 > var5.field8208[arg1.field3813]) {
                            arg1.field3813++;
                            arg1.field3804 = 1;
                            class259.method1473(arg1.field4641, (byte) 1, var5, arg1.field4647, arg1.field4638, arg1.field3813, class377.field4914 == arg1);
                        }
                        if (arg1.field3813 >= var5.field8216.length) {
                            if (var3.field1520) {
                                arg1.field3796++;
                                arg1.field3813 -= var5.field8227;
                                if (var5.field8210 <= arg1.field3796) {
                                    arg1.field3774 = -1;
                                } else if (arg1.field3813 >= 0 && var5.field8216.length > arg1.field3813) {
                                    class259.method1473(arg1.field4641, (byte) 1, var5, arg1.field4647, arg1.field4638, arg1.field3813, class377.field4914 == arg1);
                                } else {
                                    arg1.field3774 = -1;
                                }
                            } else {
                                arg1.field3774 = -1;
                            }
                        }
                        arg1.field3793 = arg1.field3813 + 1;
                        if (arg1.field3793 >= var5.field8216.length) {
                            if (var3.field1520) {
                                arg1.field3793 -= var5.field8227;
                                if (var5.field8210 <= (arg1.field3796 + 1)) {
                                    arg1.field3793 = -1;
                                } else if (arg1.field3793 < 0 || var5.field8216.length <= arg1.field3793) {
                                    arg1.field3793 = -1;
                                }
                            } else {
                                arg1.field3793 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3785 != -1 && class469.field6549 >= arg1.field3775) {
            class135 var6 = class203.field2487.method2045((byte) -126, arg1.field3785);
            int var7 = var6.field1516;
            if (var7 == -1) {
                arg1.field3785 = -1;
            } else {
                label407: {
                    class576 var8 = class618.field8696.method124(24006, var7);
                    if (var6.field1520) {
                        if (var8.field8232 == 3) {
                            if (arg1.field3840 > 0 && class469.field6549 >= arg1.field3783 && arg1.field3826 < class469.field6549) {
                                arg1.field3785 = -1;
                                break label407;
                            }
                        } else if (var8.field8232 == 1 && arg1.field3840 > 0 && class469.field6549 >= arg1.field3783 && class469.field6549 > arg1.field3826) {
                            arg1.field3775 = class469.field6549 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field8216 == null) {
                        arg1.field3785 = -1;
                    } else {
                        if (arg1.field3743 < 0) {
                            arg1.field3743 = 0;
                            class259.method1473(arg1.field4641, (byte) 1, var8, arg1.field4647, arg1.field4638, 0, class377.field4914 == arg1);
                        }
                        arg1.field3823++;
                        if (arg1.field3743 < var8.field8216.length && var8.field8208[arg1.field3743] < arg1.field3823) {
                            arg1.field3743++;
                            arg1.field3823 = 1;
                            class259.method1473(arg1.field4641, (byte) 1, var8, arg1.field4647, arg1.field4638, arg1.field3743, class377.field4914 == arg1);
                        }
                        if (arg1.field3743 >= var8.field8216.length) {
                            if (var6.field1520) {
                                arg1.field3818++;
                                arg1.field3743 -= var8.field8227;
                                if (arg1.field3818 >= var8.field8210) {
                                    arg1.field3785 = -1;
                                } else if (arg1.field3743 >= 0 && arg1.field3743 < var8.field8216.length) {
                                    class259.method1473(arg1.field4641, (byte) 1, var8, arg1.field4647, arg1.field4638, arg1.field3743, class377.field4914 == arg1);
                                } else {
                                    arg1.field3785 = -1;
                                }
                            } else {
                                arg1.field3785 = -1;
                            }
                        }
                        arg1.field3821 = arg1.field3743 + 1;
                        if (arg1.field3821 >= var8.field8216.length) {
                            if (var6.field1520) {
                                arg1.field3821 -= var8.field8227;
                                if (var8.field8210 <= arg1.field3818 + 1) {
                                    arg1.field3821 = -1;
                                } else if (arg1.field3821 < 0 || var8.field8216.length <= arg1.field3821) {
                                    arg1.field3821 = -1;
                                }
                            } else {
                                arg1.field3821 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field3778 != -1 && arg1.field3797 <= 1) {
            class576 var9 = class618.field8696.method124(24006, arg1.field3778);
            if (var9.field8232 == 3) {
                if (arg1.field3840 > 0 && arg1.field3783 <= class469.field6549 && arg1.field3826 < class469.field6549) {
                    arg1.field3778 = -1;
                }
            } else if (var9.field8232 == 1 && arg1.field3840 > 0 && arg1.field3783 <= class469.field6549 && class469.field6549 > arg1.field3826) {
                arg1.field3797 = 2;
            }
        }
        if (arg1.field3778 != -1 && arg1.field3797 == 0) {
            class576 var10 = class618.field8696.method124(24006, arg1.field3778);
            if (var10 == null || var10.field8216 == null) {
                arg1.field3778 = -1;
            } else {
                arg1.field3810++;
                if (var10.field8216.length > arg1.field3744 && var10.field8208[arg1.field3744] < arg1.field3810) {
                    arg1.field3810 = 1;
                    arg1.field3744++;
                    class259.method1473(arg1.field4641, (byte) 1, var10, arg1.field4647, arg1.field4638, arg1.field3744, class377.field4914 == arg1);
                }
                if (var10.field8216.length <= arg1.field3744) {
                    arg1.field3754++;
                    arg1.field3744 -= var10.field8227;
                    if (var10.field8210 <= arg1.field3754) {
                        arg1.field3778 = -1;
                    } else if (arg1.field3744 >= 0 && var10.field8216.length > arg1.field3744) {
                        class259.method1473(arg1.field4641, (byte) 1, var10, arg1.field4647, arg1.field4638, arg1.field3744, class377.field4914 == arg1);
                    } else {
                        arg1.field3778 = -1;
                    }
                }
                arg1.field3758 = arg1.field3744 + 1;
                if (var10.field8216.length <= arg1.field3758) {
                    arg1.field3758 -= var10.field8227;
                    if (var10.field8210 <= arg1.field3754 + 1) {
                        arg1.field3758 = -1;
                    } else if (arg1.field3758 < 0 || var10.field8216.length <= arg1.field3758) {
                        arg1.field3758 = -1;
                    }
                }
                arg1.field3789 = var10.field8226;
            }
        }
        if (arg0 > -22) {
            field2333 = null;
        }
        if (arg1.field3797 > 0) {
            arg1.field3797--;
        }
        for (int var11 = 0; var11 < arg1.field3776.length; var11++) {
            class179 var12 = arg1.field3776[var11];
            if (var12 != null) {
                if (var12.field2214 > 0) {
                    var12.field2214--;
                } else {
                    class576 var13 = class618.field8696.method124(24006, var12.field2211);
                    if (var13 == null || var13.field8216 == null) {
                        arg1.field3776[var11] = null;
                    } else {
                        var12.field2210++;
                        if (var13.field8216.length > var12.field2217 && var13.field8208[var12.field2217] < var12.field2210) {
                            var12.field2210 = 1;
                            var12.field2217++;
                            class259.method1473(arg1.field4641, (byte) 1, var13, arg1.field4647, arg1.field4638, var12.field2217, class377.field4914 == arg1);
                        }
                        if (var13.field8216.length <= var12.field2217) {
                            var12.field2213++;
                            var12.field2217 -= var13.field8227;
                            if (var13.field8210 <= var12.field2213) {
                                arg1.field3776[var11] = null;
                            } else if (var12.field2217 >= 0 && var13.field8216.length > var12.field2217) {
                                class259.method1473(arg1.field4641, (byte) 1, var13, arg1.field4647, arg1.field4638, var12.field2217, class377.field4914 == arg1);
                            } else {
                                arg1.field3776[var11] = null;
                            }
                        }
                        var12.field2212 = var12.field2217 + 1;
                        if (var13.field8216.length <= var12.field2212) {
                            var12.field2212 -= var13.field8227;
                            if (var12.field2213 + 1 >= var13.field8210) {
                                var12.field2212 = -1;
                            } else if (var12.field2212 < 0 || var12.field2212 >= var13.field8216.length) {
                                var12.field2212 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lpn;")
    public final class678 method1112(int arg0, int arg1) {
        field2330++;
        class653 var3 = this.field2329;
        class678 var4;
        synchronized (this.field2329) {
            var4 = (class678) this.field2329.method3690((byte) -87, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2328.method1719(class459.method2621((byte) 73, arg0), class384.method2110(arg0, 0), 4);
        class678 var6 = new class678();
        if (var5 != null) {
            var6.method3790(new class452(var5), -1);
        }
        class653 var7 = this.field2329;
        synchronized (this.field2329) {
            if (arg1 < 92) {
                field2333 = null;
            }
            this.field2329.method3683(var6, (byte) 119, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2334 = null;
        if (arg0 >= -31) {
            method1114(-97);
        }
        field2326 = null;
        field2332 = null;
        field2333 = null;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        if (arg0 != 22722) {
            method1111((byte) -110, null);
        }
        field2331++;
        class514.method2942(arg0 ^ 0x58A1);
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class194(class207 arg0, int arg1, class303 arg2) {
        this.field2328 = arg2;
        if (this.field2328 != null) {
            int var4 = this.field2328.method1740((byte) 41) - 1;
            this.field2328.method1727(-77, var4);
        }
    }
}
