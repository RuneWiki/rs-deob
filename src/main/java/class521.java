import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class521 extends class535 implements class68 {

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Lgs;")
    public class33 field7672;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
    private boolean field7659;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field7665 = 0;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
    public static int[] field7667 = new int[2048];

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "F")
    public static float field7660;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)I")
    public final int method338(int arg0) {
        if (arg0 <= 75) {
            return 41;
        } else {
            ++field7661;
            return this.field7672.field475;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        if (arg0 <= 121) {
            this.field7659 = true;
        }
        ++field7663;
        class334 var5 = this.field7672.method280((byte) -25, super.field7858, false, super.field7860, false, 131072, arg3);
        if (var5 == null) {
            return false;
        } else {
            class14 var6 = arg3.method751();
            var6.method141(super.field7860, super.field7855, super.field7858);
            return var5.method68(arg2, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        ++field7668;
        class334 var3 = this.field7672.method280((byte) -25, super.field7858, false, super.field7860, true, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class14 var4 = arg1.method751();
            var4.method141(super.field7860, super.field7855, super.field7858);
            class437 var5 = null;
            if (this.field7659) {
                var5 = class530.method3133(false, 1);
            }
            if (this.field7672.field474 != null) {
                class137 var6 = this.field7672.field474.method1533();
                arg1.method840(var3, var6, var4, var5 == null ? null : var5.field6608[0], 0);
            } else {
                var3.method53(var4, var5 != null ? var5.field6608[0] : null, 0);
            }
            int var7 = super.field7860 >> 7;
            int var8 = super.field7858 >> 7;
            this.field7672.method285(var8, var7, var8, arg1, true, var3, arg0, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
    public final int method332(int arg0) {
        ++field7666;
        if (arg0 != 6359) {
            field7665 = 66;
        }
        return this.field7672.field486;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lqa;I)V")
    public final void method330(class165 arg0, int arg1) {
        ++field7658;
        this.field7672.method282(false, arg0);
        if (arg1 != 14470) {
            this.method138((byte) -23, -54, -35, (class165) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        ++field7676;
        if (arg0 != 3583) {
            this.field7672 = null;
        }
        return this.field7672.method278(arg0 + -3584);
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
    public static void method3096(int arg0) {
        field7667 = null;
        if (arg0 >= -17) {
            method3098(12, false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILqa;I)Lka;")
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        ++field7678;
        if (arg2 != 14221) {
            this.method338(-38);
        }
        return this.field7672.method280((byte) -25, 0, false, 0, false, arg0, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        ++field7671;
        if (arg2 > -4) {
            this.method136(-9, (class165) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
    public final int method336(int arg0) {
        if (arg0 != -6130) {
            field7667 = null;
        }
        ++field7669;
        return this.field7672.field492;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3097(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7664;
        if (arg2 != -18540) {
            method3096(6);
        }
        if (class86.method587(-127, arg0)) {
            if (class41.field614[arg0] != null) {
                class457.method2773(arg8, arg1, 1, arg4, arg5, arg7, class41.field614[arg0], arg3, arg6, -1);
            } else {
                class457.method2773(arg8, arg1, 1, arg4, arg5, arg7, class263.field3690[arg0], arg3, arg6, -1);
            }
        } else if (~arg4 != 0) {
            class430.field6553[arg4] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class430.field6553[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLqa;)V")
    public final void method333(boolean arg0, class165 arg1) {
        ++field7670;
        this.field7672.method283(arg1, -116);
        if (!arg0) {
            this.method337(-61, (class165) null, -103);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IZ)Lko;")
    public static final class354 method3098(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field7675;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (~arg0 != -9) {
                                                if (~arg0 != -10) {
                                                    if (arg0 != 10) {
                                                        if (arg0 != 11) {
                                                            if (arg0 != 12) {
                                                                if (arg0 != 13) {
                                                                    if (arg0 != 14) {
                                                                        if (arg0 != 15) {
                                                                            if (~arg0 != -17) {
                                                                                if (arg0 != 17) {
                                                                                    if (arg0 != 18) {
                                                                                        if (~arg0 != -20) {
                                                                                            if (arg0 != 20) {
                                                                                                if (~arg0 != -22) {
                                                                                                    if (~arg0 != -23) {
                                                                                                        if (arg0 != 23) {
                                                                                                            if (~arg0 != -25) {
                                                                                                                if (~arg0 != -26) {
                                                                                                                    if (~arg0 != -27) {
                                                                                                                        if (~arg0 != -28) {
                                                                                                                            if (arg0 != 28) {
                                                                                                                                if (arg0 != 29) {
                                                                                                                                    if (~arg0 != -31) {
                                                                                                                                        if (~arg0 != -32) {
                                                                                                                                            if (arg0 != 32) {
                                                                                                                                                if (arg0 != 33) {
                                                                                                                                                    if (arg0 != 34) {
                                                                                                                                                        if (arg0 != 35) {
                                                                                                                                                            if (arg0 != 36) {
                                                                                                                                                                if (~arg0 != -38) {
                                                                                                                                                                    if (~arg0 != -39) {
                                                                                                                                                                        return ~arg0 == -40 ? new class377() : null;
                                                                                                                                                                    } else {
                                                                                                                                                                        return new class420();
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class511();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class48();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class216();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class64();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class513();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class46();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class31();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class57();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class263();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class92();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class88();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class364();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class321();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class281();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class432();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class45();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class235();
                                                                                                }
                                                                                            } else {
                                                                                                return new class388();
                                                                                            }
                                                                                        } else {
                                                                                            return new class369();
                                                                                        }
                                                                                    } else {
                                                                                        return new class149();
                                                                                    }
                                                                                } else {
                                                                                    return new class290();
                                                                                }
                                                                            } else {
                                                                                return new class332();
                                                                            }
                                                                        } else {
                                                                            return new class298();
                                                                        }
                                                                    } else {
                                                                        return new class465();
                                                                    }
                                                                } else {
                                                                    return new class232();
                                                                }
                                                            } else {
                                                                return new class301();
                                                            }
                                                        } else {
                                                            return new class127();
                                                        }
                                                    } else {
                                                        return new class329();
                                                    }
                                                } else {
                                                    return new class374();
                                                }
                                            } else {
                                                return new class421();
                                            }
                                        } else {
                                            return new class204();
                                        }
                                    } else {
                                        return new class288();
                                    }
                                } else {
                                    return new class243();
                                }
                            } else {
                                return new class523();
                            }
                        } else {
                            return new class378();
                        }
                    } else {
                        return new class112();
                    }
                } else {
                    return new class253();
                }
            } else {
                return new class505();
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
    public final void method334(int arg0) {
        ++field7674;
        if (arg0 != 29893) {
            this.field7659 = false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field7673;
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIZIII)V")
    public class521(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class337.method2185((byte) 69, arg9, arg8));
        this.field7672 = new class33(arg0, arg1, arg8, arg9, arg2, arg3, super.field7860, super.field7858, arg7, arg10);
        this.field7659 = arg1.field2930 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (arg0 != 0) {
            field7660 = -0.44316524F;
        }
        ++field7662;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        ++field7677;
        class334 var3 = this.field7672.method280((byte) -25, super.field7858, true, super.field7860, true, 262144, arg1);
        if (var3 != null) {
            int var4 = super.field7860 >> 7;
            int var5 = super.field7858 >> 7;
            this.field7672.method285(var5, var4, var5, arg1, false, var3, 0, var4);
        }
        if (arg0) {
            field7667 = null;
        }
    }
}
