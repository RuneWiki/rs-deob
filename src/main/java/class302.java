import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class302 extends class205 implements class185 {

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "Lck;")
    public class436 field4551;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "Z")
    private boolean field4553;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "S")
    public static short field4542 = 1;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "Loe;")
    public static class127 field4561 = new class127(47, 0);

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "Loe;")
    public static class127 field4563 = new class127(2, -2);

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "[Lig;")
    public static class154[] field4562;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)I", line = 4)
    public final int method170(boolean arg0) {
        if (!arg0) {
            this.method165(19, (class318) null, (class59) null, true, false, -97, -38);
        }
        ++field4558;
        return this.field4551.field6421;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLqq;)V", line = 16)
    public final void method176(boolean arg0, class318 arg1) {
        this.field4551.method2549(10, arg1);
        ++field4548;
        if (!arg0) {
            this.field4551 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)V", line = 28)
    public final void method168(int arg0) {
        int var2 = 49 % ((-53 - arg0) / 62);
        ++field4546;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)Z", line = 39)
    public final boolean method164(int arg0) {
        ++field4550;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z", line = 51)
    public final boolean method161(int arg0) {
        if (arg0 != 15275) {
            this.method169((byte) -2, (class318) null);
        }
        ++field4560;
        return this.field4551.method2542(-1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLqq;)Lkm;", line = 62)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field4545;
        class198 var3 = this.field4551.method2550(true, super.field3222, super.field3218, arg1, -95, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class496 var4 = arg1.method1976();
            var4.method198(super.field3218, super.field3214, super.field3222);
            class227 var5 = null;
            if (this.field4553) {
                var5 = class145.method951(1, 0);
            }
            if (arg0 > -11) {
                this.field4553 = false;
            }
            if (this.field4551.field6402 == null) {
                var3.method461(var4, var5 == null ? null : var5.field3476[0], 0);
            } else {
                class372 var6 = this.field4551.field6402.method2882();
                arg1.method1983(var3, var6, var4, var5 != null ? var5.field3476[0] : null, 0);
            }
            this.field4551.method2548(super.field3219, super.field3225, -400, super.field3227, var3, true, arg1, super.field3220);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ZLqq;)V", line = 101)
    public final void method172(boolean arg0, class318 arg1) {
        ++field4543;
        class198 var3 = this.field4551.method2550(true, super.field3222, super.field3218, arg1, -12, true, 262144);
        if (arg0) {
            this.method161(92);
        }
        if (var3 != null) {
            this.field4551.method2548(super.field3219, super.field3225, -400, super.field3227, var3, false, arg1, super.field3220);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 118)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        if (arg4) {
            ++field4556;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V", line = 129)
    public static void method1816(boolean arg0) {
        field4563 = null;
        if (arg0) {
            method1816(false);
        }
        field4561 = null;
        field4562 = null;
    }

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)I", line = 141)
    public final int method333(int arg0) {
        ++field4555;
        if (arg0 != 0) {
            method1816(false);
        }
        return this.field4551.method2543(4);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Let;", line = 155)
    public static final class404 method1817(byte arg0, int arg1) {
        ++field4547;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (~arg1 != -9) {
                                            if (~arg1 != -10) {
                                                if (arg1 != 10) {
                                                    if (arg1 != 11) {
                                                        if (~arg1 != -13) {
                                                            if (arg1 != 13) {
                                                                if (arg1 != 14) {
                                                                    if (~arg1 != -16) {
                                                                        if (arg1 != 16) {
                                                                            if (arg1 != 17) {
                                                                                if (arg1 != 18) {
                                                                                    if (~arg1 != -20) {
                                                                                        if (arg1 != 20) {
                                                                                            if (arg1 != 21) {
                                                                                                if (arg1 != 22) {
                                                                                                    if (~arg1 != -24) {
                                                                                                        if (arg1 != 24) {
                                                                                                            if (arg1 != 25) {
                                                                                                                if (~arg1 != -27) {
                                                                                                                    if (arg1 != 27) {
                                                                                                                        if (~arg1 != -29) {
                                                                                                                            if (arg1 != 29) {
                                                                                                                                if (arg1 != 30) {
                                                                                                                                    if (arg1 != 31) {
                                                                                                                                        if (arg1 != 32) {
                                                                                                                                            if (~arg1 != -34) {
                                                                                                                                                if (~arg1 != -35) {
                                                                                                                                                    if (~arg1 != -36) {
                                                                                                                                                        if (~arg1 != -37) {
                                                                                                                                                            if (~arg1 != -38) {
                                                                                                                                                                if (~arg1 != -39) {
                                                                                                                                                                    if (arg1 == 39) {
                                                                                                                                                                        return new class469();
                                                                                                                                                                    } else {
                                                                                                                                                                        if (arg0 <= 70) {
                                                                                                                                                                            method1817((byte) -128, -31);
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class150();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class341();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class512();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class309();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class369();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class292();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class386();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class119();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class275();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class158();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class181();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class506();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class145();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class502();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class495();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class106();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class410();
                                                                                                }
                                                                                            } else {
                                                                                                return new class16();
                                                                                            }
                                                                                        } else {
                                                                                            return new class401();
                                                                                        }
                                                                                    } else {
                                                                                        return new class402();
                                                                                    }
                                                                                } else {
                                                                                    return new class321();
                                                                                }
                                                                            } else {
                                                                                return new class497();
                                                                            }
                                                                        } else {
                                                                            return new class18();
                                                                        }
                                                                    } else {
                                                                        return new class484();
                                                                    }
                                                                } else {
                                                                    return new class461();
                                                                }
                                                            } else {
                                                                return new class39();
                                                            }
                                                        } else {
                                                            return new class38();
                                                        }
                                                    } else {
                                                        return new class226();
                                                    }
                                                } else {
                                                    return new class474();
                                                }
                                            } else {
                                                return new class193();
                                            }
                                        } else {
                                            return new class247();
                                        }
                                    } else {
                                        return new class132();
                                    }
                                } else {
                                    return new class383();
                                }
                            } else {
                                return new class505();
                            }
                        } else {
                            return new class326();
                        }
                    } else {
                        return new class306();
                    }
                } else {
                    return new class117();
                }
            } else {
                return new class317();
            }
        } else {
            return new class17();
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lqq;I)V", line = 474)
    public final void method171(class318 arg0, int arg1) {
        if (arg1 != 1577) {
            field4561 = null;
        }
        this.field4551.method2547(-12, arg0);
        ++field4544;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 485)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return null;
        } else {
            ++field4554;
            return this.field4551.method2550(false, 0, 0, arg0, -75, false, arg2);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)I", line = 498)
    public final int method174(byte arg0) {
        ++field4549;
        if (arg0 < 113) {
            this.method172(false, (class318) null);
        }
        return this.field4551.field6400;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V", line = 509)
    public final void method163(int arg0) {
        if (arg0 != 8793) {
            method1817((byte) 36, 97);
        }
        ++field4559;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lqq;Lin;IIIIIZIIIIIII)V", line = 519)
    public class302(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field960 == 1, class496.method2985(arg12, arg13, -10));
        this.field4551 = new class436(arg0, arg1, arg12, arg13, super.field3217, arg3, arg4, arg6, arg7, arg14);
        this.field4553 = arg1.field895 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)I", line = 538)
    public final int method173(int arg0) {
        ++field4557;
        if (arg0 != 1438) {
            this.field4553 = false;
        }
        return this.field4551.field6391;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lqq;BII)Z", line = 554)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        ++field4552;
        class198 var5 = this.field4551.method2550(false, super.field3222, super.field3218, arg0, arg1 + -32, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != -44) {
                this.method170(false);
            }
            class496 var6 = arg0.method1976();
            var6.method198(super.field3218, super.field3214, super.field3222);
            return var5.method495(arg2, arg3, var6, false);
        }
    }
}
