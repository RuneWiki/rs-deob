import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class614 extends class530 {

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public static int field8750 = 0;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Lqk;")
    public static class148 field8738 = new class148(48, 4);

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "Lhh;")
    public static class529 field8742;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "Z")
    public static boolean field8741;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lhg;I)V")
    public static final void method3598(class584 arg0, int arg1) {
        ++field8746;
        if (arg0.field8373 != null || arg0.field8355 != null) {
            boolean var2 = true;
            for (int var3 = arg1; var3 < arg0.field8373.length; ++var3) {
                int var4 = -1;
                if (arg0.field8373 != null) {
                    var4 = arg0.field8373[var3];
                }
                if (~var4 == 0) {
                    if (!arg0.method3484(-27492, -1, var3)) {
                        var2 = false;
                    }
                } else {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var10;
                    int var11;
                    if ((var4 & -1073741824) == -1073741824) {
                        int var7 = 268435455 & var4;
                        int var8 = var7 >> 14;
                        int var9 = var7 & 16383;
                        var10 = -256 - (var8 - class179.field2535) * 512 + arg0.field9490;
                        var11 = -((-class510.field7109 + var9) * 512) + -256 + arg0.field9489;
                    } else if (~(var4 & 32768) == -1) {
                        class15 var12 = (class15) class403.field5587.method1381(true, (long) var4);
                        if (var12 == null) {
                            arg0.method3484(arg1 + -27492, -1, var3);
                            continue;
                        }
                        class55 var13 = var12.field204;
                        var10 = -var13.field9490 + arg0.field9490;
                        var11 = -var13.field9489 + arg0.field9489;
                    } else {
                        int var14 = 32767 & var4;
                        class655 var15 = class40.field563[var14];
                        if (var15 == null) {
                            arg0.method3484(-27492, -1, var3);
                            continue;
                        }
                        var11 = arg0.field9489 - var15.field9489;
                        var10 = -var15.field9490 + arg0.field9490;
                    }
                    if (var10 != 0 || ~var11 != -1) {
                        arg0.method3484(arg1 + -27492, 16383 & (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D), var3);
                    }
                }
            }
            if (var2) {
                arg0.field8373 = null;
                arg0.field8355 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIII)V")
    public static final void method3599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class490.field6592 >= ~arg3 && arg3 <= class116.field1628) {
            int var5 = class325.method1901(arg2, class675.field9512, class395.field5484, true);
            int var6 = class325.method1901(arg4, class675.field9512, class395.field5484, true);
            class184.method1228(var5, arg3, var6, (byte) 113, arg0);
        }
        if (arg1 >= -50) {
            field8750 = -61;
        }
        ++field8743;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (!arg0) {
            this.method3604(false);
        }
        ++field8737;
        int var2 = super.field7418.method2254((byte) -58).method1895(1);
        if (var2 < 96) {
            super.field7419 = 0;
        }
        if (~super.field7419 < -2 && var2 < 128) {
            super.field7419 = 1;
        }
        if (~super.field7419 < -3 && var2 < 192) {
            super.field7419 = 2;
        }
        if (~super.field7419 > -1 || super.field7419 > 3) {
            super.field7419 = this.method74(0);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)Leia;")
    public static final class748 method3600(int arg0, byte arg1) {
        ++field8747;
        if (arg1 < 64) {
            method3603(68, false, 115, 127);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 != -9) {
                                            if (arg0 != 9) {
                                                if (~arg0 != -11) {
                                                    if (~arg0 != -12) {
                                                        if (~arg0 != -13) {
                                                            if (~arg0 != -14) {
                                                                if (arg0 != 14) {
                                                                    if (~arg0 != -16) {
                                                                        if (~arg0 != -17) {
                                                                            if (~arg0 != -18) {
                                                                                if (~arg0 != -19) {
                                                                                    if (arg0 != 19) {
                                                                                        if (~arg0 != -21) {
                                                                                            if (arg0 != 21) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (arg0 != 23) {
                                                                                                        if (~arg0 != -25) {
                                                                                                            if (arg0 != 25) {
                                                                                                                if (~arg0 != -27) {
                                                                                                                    if (arg0 != 27) {
                                                                                                                        if (arg0 != 28) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (arg0 != 31) {
                                                                                                                                        if (~arg0 != -33) {
                                                                                                                                            if (~arg0 != -34) {
                                                                                                                                                if (arg0 != 34) {
                                                                                                                                                    if (~arg0 != -36) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (~arg0 != -38) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    return arg0 == 39 ? new class562() : null;
                                                                                                                                                                } else {
                                                                                                                                                                    return new class695();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class543();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class123();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class453();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class278();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class229();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class186();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class509();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class666();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class70();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class147();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class76();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class506();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class625();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class289();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class176();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class259();
                                                                                                }
                                                                                            } else {
                                                                                                return new class717();
                                                                                            }
                                                                                        } else {
                                                                                            return new class582();
                                                                                        }
                                                                                    } else {
                                                                                        return new class149();
                                                                                    }
                                                                                } else {
                                                                                    return new class464();
                                                                                }
                                                                            } else {
                                                                                return new class615();
                                                                            }
                                                                        } else {
                                                                            return new class536();
                                                                        }
                                                                    } else {
                                                                        return new class573();
                                                                    }
                                                                } else {
                                                                    return new class296();
                                                                }
                                                            } else {
                                                                return new class568();
                                                            }
                                                        } else {
                                                            return new class275();
                                                        }
                                                    } else {
                                                        return new class316();
                                                    }
                                                } else {
                                                    return new class223();
                                                }
                                            } else {
                                                return new class554();
                                            }
                                        } else {
                                            return new class72();
                                        }
                                    } else {
                                        return new class305();
                                    }
                                } else {
                                    return new class116();
                                }
                            } else {
                                return new class413();
                            }
                        } else {
                            return new class5();
                        }
                    } else {
                        return new class164();
                    }
                } else {
                    return new class418();
                }
            } else {
                return new class195();
            }
        } else {
            return new class429();
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
    public static void method3601(int arg0) {
        if (arg0 == 48) {
            field8738 = null;
            field8742 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)I")
    public final int method3602(int arg0) {
        if (arg0 != 0) {
            method3598((class584) null, 42);
        }
        ++field8740;
        return super.field7419;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZII)Z")
    public static final boolean method3603(int arg0, boolean arg1, int arg2, int arg3) {
        ++field8749;
        if (class57.field802 && class238.field3315) {
            if (~class129.field1762 > -101) {
                return false;
            } else {
                int var4 = class573.field8104[arg3][arg2][arg0];
                if (-class582.field8284 == var4) {
                    return false;
                } else if (class582.field8284 == var4) {
                    return true;
                } else if (class52.field741 == class435.field5969) {
                    return false;
                } else {
                    if (arg1) {
                        field8738 = null;
                    }
                    int var5 = arg2 << class509.field7106;
                    int var6 = arg0 << class509.field7106;
                    if (class640.method3720(var5 + 1, var5 + 1, class96.field1402 + var6 + -1, true, class52.field741[arg3].method1959(125, arg0 + 1, arg2 + 1), class96.field1402 + var6 + -1, class52.field741[arg3].method1959(127, arg0, arg2), class96.field1402 + -1 + var5, var6 + 1, class52.field741[arg3].method1959(124, arg0 + 1, arg2)) && class640.method3720(class96.field1402 + -1 + var5, var5 + 1, var6 + 1, !arg1, class52.field741[arg3].method1959(125, arg0, arg2 + 1), var6 - 1 + class96.field1402, class52.field741[arg3].method1959(123, arg0, arg2), class96.field1402 + -1 + var5, var6 + 1, class52.field741[arg3].method1959(125, arg0 - -1, arg2 + 1))) {
                        ++class27.field355;
                        class573.field8104[arg3][arg2][arg0] = class582.field8284;
                        return true;
                    } else {
                        class573.field8104[arg3][arg2][arg0] = -class582.field8284;
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field8741 = true;
        }
        ++field8739;
        return 0;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(Z)Z")
    public final boolean method3604(boolean arg0) {
        ++field8745;
        int var2 = super.field7418.method2254((byte) -58).method1895(1);
        if (!arg0) {
            field8738 = null;
        }
        return var2 >= 96;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lah;)V")
    public class614(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        if (arg1 >= -38) {
            method3601(20);
        }
        ++field8748;
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(ILah;)V")
    public class614(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field8744;
        int var3 = super.field7418.method2254((byte) -58).method1895(1);
        int var4 = 51 % ((63 - arg1) / 60);
        if (~var3 > -97) {
            return 3;
        } else if (arg0 > 1 && ~var3 > -129) {
            return 3;
        } else {
            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
        }
    }
}
