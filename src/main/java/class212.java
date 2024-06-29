import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class212 extends class303 {

    @OriginalMember(owner = "client!nm", name = "ic", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!nm", name = "kc", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!nm", name = "lc", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!nm", name = "mc", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!nm", name = "nc", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!nm", name = "oc", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!nm", name = "pc", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!nm", name = "sc", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!nm", name = "uc", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!nm", name = "vc", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!nm", name = "rc", descriptor = "Lmn;")
    public class161 field3346;

    @OriginalMember(owner = "client!nm", name = "qc", descriptor = "Lug;")
    public static class253 field3345;

    @OriginalMember(owner = "client!nm", name = "jc", descriptor = "[Luj;")
    public static class169[] field3338;

    @OriginalMember(owner = "client!nm", name = "tc", descriptor = "[[[I")
    public static int[][][] field3348;

    @OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        field3342++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILmn;)V", line = 15)
    public final void method1541(int arg0, class161 arg1) {
        this.field3346 = arg1;
        int var3 = -36 / ((-arg0 - 4) / 47);
        if (this.field4668 != null) {
            this.field4668.method1102();
        }
        field3350++;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 29)
    public static void method1542(int arg0) {
        field3338 = null;
        if (arg0 != 0) {
            method1543((class303) null, (byte) 127);
        }
        field3345 = null;
        field3348 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lh;B)V", line = 42)
    public static final void method1543(class303 arg0, byte arg1) {
        field3339++;
        arg0.field4686 = false;
        if (arg0.field4724 != -1) {
            class281 var2 = class295.method2064(0, arg0.field4724);
            if (var2 == null || var2.field4319 == null) {
                arg0.field4724 = -1;
            } else {
                arg0.field4723++;
                if (var2.field4319.length > arg0.field4725 && var2.field4328[arg0.field4725] < arg0.field4723) {
                    arg0.field4725++;
                    arg0.field4651++;
                    arg0.field4723 = 1;
                    class91.method658(var2, true, class146.field2310 == arg0, arg0.field4698, arg0.field4725, arg0.field4731);
                }
                if (var2.field4319.length <= arg0.field4725) {
                    arg0.field4725 = 0;
                    arg0.field4723 = 0;
                    class91.method658(var2, true, class146.field2310 == arg0, arg0.field4698, arg0.field4725, arg0.field4731);
                }
                arg0.field4651 = arg0.field4725 + 1;
                if (var2.field4319.length <= arg0.field4651) {
                    arg0.field4651 = 0;
                }
            }
        }
        if (arg0.field4703 != -1 && arg0.field4732 <= class229.field3595) {
            class234 var3 = class9.method124(arg0.field4703, 1431655765);
            int var4 = var3.field3647;
            if (var4 == -1) {
                arg0.field4703 = -1;
            } else {
                label316: {
                    class281 var5 = class295.method2064(0, var4);
                    if (var3.field3644) {
                        if (var5.field4316 == 3) {
                            if (arg0.field4695 > 0 && arg0.field4658 <= class229.field3595 && arg0.field4722 < class229.field3595) {
                                arg0.field4703 = -1;
                                break label316;
                            }
                        } else if (var5.field4316 == 1 && arg0.field4695 > 0 && class229.field3595 >= arg0.field4658 && arg0.field4722 < class229.field3595) {
                            arg0.field4732 = class229.field3595 + 1;
                            break label316;
                        }
                    }
                    if (var5 == null || var5.field4319 == null) {
                        arg0.field4703 = -1;
                    } else {
                        if (arg0.field4679 < 0) {
                            arg0.field4679 = 0;
                            class91.method658(var5, true, class146.field2310 == arg0, arg0.field4698, 0, arg0.field4731);
                        }
                        arg0.field4704++;
                        if (arg0.field4679 < var5.field4319.length && arg0.field4704 > var5.field4328[arg0.field4679]) {
                            arg0.field4679++;
                            arg0.field4704 = 1;
                            class91.method658(var5, true, class146.field2310 == arg0, arg0.field4698, arg0.field4679, arg0.field4731);
                        }
                        if (var5.field4319.length <= arg0.field4679) {
                            if (var3.field3644) {
                                arg0.field4679 -= var5.field4339;
                                arg0.field4735++;
                                if (var5.field4331 <= arg0.field4735) {
                                    arg0.field4703 = -1;
                                } else if (arg0.field4679 >= 0 && arg0.field4679 < var5.field4319.length) {
                                    class91.method658(var5, true, class146.field2310 == arg0, arg0.field4698, arg0.field4679, arg0.field4731);
                                } else {
                                    arg0.field4703 = -1;
                                }
                            } else {
                                arg0.field4703 = -1;
                            }
                        }
                        arg0.field4712 = arg0.field4679 + 1;
                        if (var5.field4319.length <= arg0.field4712) {
                            if (var3.field3644) {
                                arg0.field4712 -= var5.field4339;
                                if (var5.field4331 <= arg0.field4735 + 1) {
                                    arg0.field4712 = -1;
                                } else if (arg0.field4712 < 0 || arg0.field4712 >= var5.field4319.length) {
                                    arg0.field4712 = -1;
                                }
                            } else {
                                arg0.field4712 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field4653 != -1 && arg0.field4739 <= 1) {
            class281 var6 = class295.method2064(arg1 - 67, arg0.field4653);
            if (var6.field4316 == 3) {
                if (arg0.field4695 > 0 && class229.field3595 >= arg0.field4658 && arg0.field4722 < class229.field3595) {
                    arg0.field4653 = -1;
                }
            } else if (var6.field4316 == 1 && arg0.field4695 > 0 && arg0.field4658 <= class229.field3595 && class229.field3595 > arg0.field4722) {
                arg0.field4739 = 1;
            }
        }
        if (arg0.field4653 != -1 && arg0.field4739 == 0) {
            class281 var7 = class295.method2064(0, arg0.field4653);
            if (var7 == null || var7.field4319 == null) {
                arg0.field4653 = -1;
            } else {
                arg0.field4655++;
                if (var7.field4319.length > arg0.field4648 && var7.field4328[arg0.field4648] < arg0.field4655) {
                    arg0.field4655 = 1;
                    arg0.field4648++;
                    class91.method658(var7, true, class146.field2310 == arg0, arg0.field4698, arg0.field4648, arg0.field4731);
                }
                if (arg0.field4648 >= var7.field4319.length) {
                    arg0.field4648 -= var7.field4339;
                    arg0.field4711++;
                    if (var7.field4331 <= arg0.field4711) {
                        arg0.field4653 = -1;
                    } else if (arg0.field4648 >= 0 && var7.field4319.length > arg0.field4648) {
                        class91.method658(var7, true, class146.field2310 == arg0, arg0.field4698, arg0.field4648, arg0.field4731);
                    } else {
                        arg0.field4653 = -1;
                    }
                }
                arg0.field4719 = arg0.field4648 + 1;
                if (arg0.field4719 >= var7.field4319.length) {
                    arg0.field4719 -= var7.field4339;
                    if (var7.field4331 <= arg0.field4711 + 1) {
                        arg0.field4719 = -1;
                    } else if (arg0.field4719 < 0 || arg0.field4719 >= var7.field4319.length) {
                        arg0.field4719 = -1;
                    }
                }
                arg0.field4686 = var7.field4318;
            }
        }
        if (arg1 != 67) {
            method1547(104, -87);
        }
        if (arg0.field4739 > 0) {
            arg0.field4739--;
        }
        for (int var8 = 0; var8 < arg0.field4705.length; var8++) {
            class11 var9 = arg0.field4705[var8];
            if (var9 != null) {
                if (var9.field200 > 0) {
                    var9.field200--;
                } else {
                    class281 var10 = class295.method2064(arg1 - 67, var9.field198);
                    if (var10 == null || var10.field4319 == null) {
                        arg0.field4705[var8] = null;
                    } else {
                        var9.field199++;
                        if (var9.field201 < var10.field4319.length && var10.field4328[var9.field201] < var9.field199) {
                            var9.field199 = 1;
                            var9.field201++;
                            class91.method658(var10, true, class146.field2310 == arg0, arg0.field4698, var9.field201, arg0.field4731);
                        }
                        if (var10.field4319.length <= var9.field201) {
                            var9.field201 -= var10.field4339;
                            var9.field204++;
                            if (var9.field204 >= var10.field4331) {
                                arg0.field4705[var8] = null;
                            } else if (var9.field201 >= 0 && var9.field201 < var10.field4319.length) {
                                class91.method658(var10, true, class146.field2310 == arg0, arg0.field4698, var9.field201, arg0.field4731);
                            } else {
                                arg0.field4705[var8] = null;
                            }
                        }
                        var9.field209 = var9.field201 + 1;
                        if (var9.field209 >= var10.field4319.length) {
                            var9.field209 -= var10.field4339;
                            if (var10.field4331 <= (var9.field204 + 1)) {
                                var9.field209 = -1;
                            } else if (var9.field209 < 0 || var10.field4319.length <= var9.field209) {
                                var9.field209 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()I", line = 346)
    public final int method397() {
        field3340++;
        return this.field4656;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)I", line = 354)
    public final int method1544(byte arg0) {
        field3349++;
        if (class27.field409 != 0 && this.field3346.field2585 != null) {
            class161 var2 = this.field3346.method1192(-1);
            if (var2 != null && var2.field2604 != -1) {
                return var2.field2604;
            }
        }
        int var3 = -46 % ((arg0 - 42) / 56);
        return this.field4684;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(IB)V", line = 378)
    public static final void method1545(int arg0, byte arg1) {
        field3343++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class214.method1559(true);
        } else if (arg0 == 2) {
            class130.method962(2235);
        } else if (arg0 == 3) {
            class101.method704((byte) -111);
        } else {
            throw new RuntimeException();
        }
        int var2 = -1 / ((arg1 - 21) / 59);
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)Z", line = 416)
    public final boolean method1546(byte arg0) {
        if (arg0 != 96) {
            method1543((class303) null, (byte) 8);
        }
        field3341++;
        return this.field3346 != null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V", line = 430)
    public static final void method1547(int arg0, int arg1) {
        field3337++;
        class81.field1115.method1353(arg0 ^ 0x3, arg1);
        if (arg0 != -4) {
            field3348 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 441)
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3347++;
        if (this.field3346 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 462)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        field3344++;
        if (this.field3346 == null) {
            return;
        }
        class281 var13 = this.field4653 != -1 && this.field4739 == 0 ? class295.method2064(0, this.field4653) : null;
        class281 var14 = this.field4724 == -1 || this.field4724 == this.method2100(2000117776).field1451 && var13 != null ? null : class295.method2064(0, this.field4724);
        class89 var15 = this.field3346.method1194(this.field4651, var13, var14, this.field4648, this.field4655, 8, this.field4705, this.field4723, this.field4719, this.field4725);
        if (var15 == null) {
            return;
        }
        this.field4656 = var15.method397();
        class161 var16 = this.field3346;
        if (var16.field2585 != null) {
            var16 = var16.method1192(-1);
        }
        if (class95.field1259 && var16.field2553) {
            class89 var17 = class243.method1744(this.field3346.field2599, this.field3346.field2614, this.field4731, arg0, this.field4686, 115, this.field3346.field2555, var15, var14 == null ? var13 : var14, this.field4698, this.field3346.field2563, this.field4747, this.field3346.field2576, var14 == null ? this.field4648 : this.field4725);
            if (class109.field1458) {
                float var18 = class109.method781();
                float var19 = class109.method772();
                class109.method768();
                class109.method760(var18, var19 - 150.0F);
                var17.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4668);
                class109.method776();
                class109.method760(var18, var19);
            } else {
                var17.method410(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4668);
            }
        }
        class89 var20 = null;
        this.method2096(var15, -1);
        this.method2092(-2, var15, arg0);
        if (this.field4703 != -1 && this.field4679 != -1) {
            class234 var21 = class9.method124(this.field4703, 1431655765);
            var20 = var21.method1683(19687, this.field4704, this.field4712, this.field4679);
            if (var20 != null) {
                var20.method407(0, -this.field4685, 0);
                if (var21.field3642) {
                    if (class287.field4429 != 0) {
                        var20.method391(class287.field4429);
                    }
                    if (class41.field565 != 0) {
                        var20.method386(class41.field565);
                    }
                    if (class57.field806 != 0) {
                        var20.method407(0, class57.field806, 0);
                    }
                }
            }
        }
        if (!class109.field1458) {
            if (var20 != null) {
                var15 = ((class53) var15).method400(var20);
            }
            if (this.field3346.field2555 == 1) {
                var15.field1204 = true;
            }
            var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
            return;
        }
        if (this.field3346.field2555 == 1) {
            var15.field1204 = true;
        }
        var15.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
        if (var20 != null) {
            if (this.field3346.field2555 == 1) {
                var20.field1204 = true;
            }
            var20.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4668);
        }
    }
}
