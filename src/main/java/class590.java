import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class590 extends class56 {

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    private int field8315 = 8192;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    private int field8310 = 0;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    private int field8318 = 2048;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    private int field8320 = 4096;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    private int field8319 = 2048;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    private int field8312 = 12288;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    private int field8313 = 0;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "Lqfa;")
    public static class98 field8308 = new class98(7, 3);

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "F")
    public static float field8323 = 1.0F;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(III)Z", line = 3)
    private final boolean method3335(int arg0, int arg1, int arg2) {
        ++field8316;
        int var4 = (arg0 + arg1) * this.field8312 >> 12;
        if (arg2 != -956730100) {
            this.method364(-42);
        }
        int var5 = class97.field1172[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field8312;
        int var7 = (var6 << 12) / this.field8315;
        int var8 = this.field8320 * var7 >> 12;
        return arg1 - arg0 < var8 && -var8 < -arg0 + arg1;
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)V", line = 23)
    public static void method3336(int arg0) {
        if (arg0 >= -39) {
            method3339(-89, 2);
        }
        field8308 = null;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Ltga;", line = 34)
    public static final class56 method3337(int arg0, int arg1) {
        ++field8311;
        if (arg0 > -12) {
            method3336(-105);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 != -9) {
                                            if (arg1 != 9) {
                                                if (~arg1 != -11) {
                                                    if (arg1 != 11) {
                                                        if (arg1 != 12) {
                                                            if (~arg1 != -14) {
                                                                if (~arg1 != -15) {
                                                                    if (arg1 != 15) {
                                                                        if (~arg1 != -17) {
                                                                            if (~arg1 != -18) {
                                                                                if (arg1 != 18) {
                                                                                    if (arg1 != 19) {
                                                                                        if (arg1 != 20) {
                                                                                            if (~arg1 != -22) {
                                                                                                if (arg1 != 22) {
                                                                                                    if (arg1 != 23) {
                                                                                                        if (arg1 != 24) {
                                                                                                            if (arg1 != 25) {
                                                                                                                if (arg1 != 26) {
                                                                                                                    if (~arg1 != -28) {
                                                                                                                        if (arg1 != 28) {
                                                                                                                            if (arg1 != 29) {
                                                                                                                                if (~arg1 != -31) {
                                                                                                                                    if (~arg1 != -32) {
                                                                                                                                        if (~arg1 != -33) {
                                                                                                                                            if (~arg1 != -34) {
                                                                                                                                                if (arg1 != 34) {
                                                                                                                                                    if (~arg1 != -36) {
                                                                                                                                                        if (arg1 != 36) {
                                                                                                                                                            if (~arg1 != -38) {
                                                                                                                                                                if (arg1 != 38) {
                                                                                                                                                                    return ~arg1 == -40 ? new class1() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class567();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class590();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class577();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class589();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class407();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class246();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class422();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class695();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class600();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class184();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class660();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class239();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class718();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class642();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class426();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class598();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class363();
                                                                                                }
                                                                                            } else {
                                                                                                return new class5();
                                                                                            }
                                                                                        } else {
                                                                                            return new class614();
                                                                                        }
                                                                                    } else {
                                                                                        return new class260();
                                                                                    }
                                                                                } else {
                                                                                    return new class643();
                                                                                }
                                                                            } else {
                                                                                return new class29();
                                                                            }
                                                                        } else {
                                                                            return new class579();
                                                                        }
                                                                    } else {
                                                                        return new class580();
                                                                    }
                                                                } else {
                                                                    return new class148();
                                                                }
                                                            } else {
                                                                return new class277();
                                                            }
                                                        } else {
                                                            return new class540();
                                                        }
                                                    } else {
                                                        return new class373();
                                                    }
                                                } else {
                                                    return new class127();
                                                }
                                            } else {
                                                return new class370();
                                            }
                                        } else {
                                            return new class588();
                                        }
                                    } else {
                                        return new class34();
                                    }
                                } else {
                                    return new class662();
                                }
                            } else {
                                return new class312();
                            }
                        } else {
                            return new class123();
                        }
                    } else {
                        return new class74();
                    }
                } else {
                    return new class499();
                }
            } else {
                return new class411();
            }
        } else {
            return new class504();
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V", line = 356)
    public class590() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)[I", line = 360)
    public final int[] method24(int arg0, boolean arg1) {
        ++field8322;
        if (!arg1) {
            return null;
        } else {
            int[] var3 = super.field673.method3270(arg0, (byte) -42);
            if (super.field673.field8073) {
                int var4 = class720.field10000[arg0] + -2048;
                for (int var5 = 0; ~var5 > ~class328.field4576; ++var5) {
                    int var6 = class132.field1945[var5] - 2048;
                    int var7 = this.field8318 + var6;
                    int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                    int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                    int var10 = var4 - -this.field8313;
                    int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                    int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                    int var13 = this.field8310 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = var14 > 2048 ? var14 + -4096 : var14;
                    int var16 = this.field8319 + var4;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method3338(var9, -1712624916, var12) && !this.method3335(var15, var18, -956730100) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILee;I)V", line = 413)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            field8323 = 0.109181575F;
        }
        ++field8321;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field8315 = arg1.method3757((byte) -65);
                                }
                            } else {
                                this.field8320 = arg1.method3757((byte) -65);
                            }
                        } else {
                            this.field8312 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field8319 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field8310 = arg1.method3757((byte) -65);
                }
            } else {
                this.field8313 = arg1.method3757((byte) -65);
            }
        } else {
            this.field8318 = arg1.method3757((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "(III)Z", line = 497)
    private final boolean method3338(int arg0, int arg1, int arg2) {
        ++field8317;
        int var4 = (arg2 - arg0) * this.field8312 >> 12;
        int var5 = class97.field1172[255 & var4 * 255 >> 12];
        if (arg1 != -1712624916) {
            method3337(-94, 53);
        }
        int var6 = (var5 << 12) / this.field8312;
        int var7 = (var6 << 12) / this.field8315;
        int var8 = this.field8320 * var7 >> 12;
        return ~var8 < ~(arg0 + arg2) && ~(arg0 - -arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(II)I", line = 516)
    public static final int method3339(int arg0, int arg1) {
        if (arg0 != -10391) {
            return -113;
        } else {
            ++field8309;
            return 127 & arg1 >> 11;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 540)
    public final void method364(int arg0) {
        if (arg0 != 7) {
            this.field8320 = -122;
        }
        ++field8314;
        class135.method965(false);
    }
}
