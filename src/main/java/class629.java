import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class629 extends class253 {

    @OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
    private int field8801 = 0;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    private int field8797 = 0;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Z")
    private boolean field8786 = true;

    @OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
    private int field8804 = 0;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    private int field8794 = 0;

    @OriginalMember(owner = "client!cd", name = "Fb", descriptor = "Z")
    public boolean field8817 = false;

    @OriginalMember(owner = "client!cd", name = "Db", descriptor = "I")
    private int field8815 = -1;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    private int field8789 = 0;

    @OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
    private int field8799;

    @OriginalMember(owner = "client!cd", name = "ub", descriptor = "I")
    public int field8806;

    @OriginalMember(owner = "client!cd", name = "zb", descriptor = "Lgf;")
    private class73 field8811;

    @OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Z")
    public static boolean field8814 = false;

    @OriginalMember(owner = "client!cd", name = "qb", descriptor = "Ljn;")
    public static class134 field8802 = new class134(4, -2);

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!cd", name = "mb", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!cd", name = "tb", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!cd", name = "vb", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!cd", name = "yb", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!cd", name = "Bb", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!cd", name = "Eb", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lju;")
    private class388 field8788;

    @OriginalMember(owner = "client!cd", name = "Gb", descriptor = "Z")
    public static boolean field8818;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method88(int arg0, class473 arg1, int arg2, int arg3) {
        ++field8796;
        if (arg2 != -31634) {
            this.field8817 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = -122 / ((arg0 - 69) / 48);
        ++field8805;
        return this.field8797;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Loq;IZILha;II)V")
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        if (arg6 <= 96) {
            this.field8815 = 53;
        }
        ++field8810;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public final void method81(byte arg0) {
        ++field8787;
        if (arg0 == 29) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lha;Loo;Lka;B)V")
    private final void method3611(class473 arg0, class12 arg1, class231 arg2, byte arg3) {
        arg2.method1581(arg1);
        if (arg3 >= -16) {
            this.field8811 = null;
        }
        ++field8808;
        class626[] var5 = arg2.method1579();
        class426[] var6 = arg2.method1543();
        if ((this.field8788 == null || this.field8788.field5531) && (var5 != null || var6 != null)) {
            this.field8788 = class388.method2408(class533.field7336, true);
        }
        if (this.field8788 != null) {
            this.field8788.method2401(arg0, (long) class533.field7336, var5, var6, false);
            this.field8788.method2403(super.field3467, super.field3745, super.field3754, super.field3758, super.field3755);
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        if (arg0 != 25833) {
            return false;
        } else {
            ++field8798;
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method3612(byte arg0) {
        if (arg0 != 22) {
            method3614(-59, -31, (class432) null);
        }
        field8802 = null;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
    public final void method3613(int arg0, int arg1) {
        ++field8791;
        if (!this.field8817) {
            this.field8804 += arg1;
            while (this.field8811.field817[this.field8794] < this.field8804) {
                this.field8804 -= this.field8811.field817[this.field8794];
                ++this.field8794;
                if (this.field8811.field816.length <= this.field8794) {
                    this.field8817 = true;
                    break;
                }
            }
            if (arg0 != -12) {
                this.field8789 = 117;
            }
            if (!this.field8817) {
                class538.method3196(this, this.field8794, true, this.field8811);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lha;I)Ltja;")
    public final class491 method72(class473 arg0, int arg1) {
        if (arg1 != -5047) {
            method3614(-99, -104, (class432) null);
        }
        ++field8793;
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field8788 != null) {
            this.field8788.method2407();
        }
        ++field8790;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(Z)Z")
    public final boolean method83(boolean arg0) {
        ++field8795;
        return arg0;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)I")
    public final int method78(byte arg0) {
        if (arg0 >= -31) {
            this.field8804 = 95;
        }
        ++field8803;
        return this.field8801;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lha;I)V")
    public final void method76(class473 arg0, int arg1) {
        int var3 = -83 / ((arg1 - -30) / 42);
        ++field8809;
        class231 var4 = this.method3617(6, 0, this.field8799, arg0);
        if (var4 != null) {
            class12 var5 = arg0.method153();
            var5.method50(super.field3470, super.field3464, super.field3460);
            this.method3611(arg0, var5, var4, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILgs;)V")
    public static final void method3614(int arg0, int arg1, class432 arg2) {
        ++field8816;
        if (arg0 <= 99) {
            method3612((byte) -73);
        }
        boolean var3 = arg2.method2591(-30, 1) == 1;
        if (var3) {
            class363.field5236[class688.field9599++] = arg1;
        }
        int var4 = arg2.method2591(-30, 2);
        class723 var5 = class413.field5787[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field9963 = false;
            } else if (~class173.field2193 == ~arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class119 var6 = class293.field4306[arg1] = new class119();
                var6.field1592 = (var5.field9219[0] + class444.field6151 >> 6 << 14) + (var5.field3467 << 28) + (var5.field9214[0] + class236.field3535 >> 6);
                if (var5.field10013 == -1) {
                    var6.field1587 = var5.field9128.method3257(-25113);
                } else {
                    var6.field1587 = var5.field10013;
                }
                var6.field1586 = var5.field9996;
                var6.field1590 = var5.field9137;
                var6.field1591 = var5.field10008;
                if (var5.field9974 > 0) {
                    class157.method1013(var5, 0);
                }
                class413.field5787[arg1] = null;
                if (arg2.method2591(-30, 1) != 0) {
                    class455.method2744(arg1, 805306368, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2591(-30, 3);
            int var8 = var5.field9219[0];
            int var9 = var5.field9214[0];
            if (~var7 == -1) {
                --var8;
                --var9;
            } else if (var7 == 1) {
                --var9;
            } else if (~var7 != -3) {
                if (var7 != 3) {
                    if (~var7 != -5) {
                        if (var7 == 5) {
                            ++var9;
                            --var8;
                        } else if (var7 != 6) {
                            if (var7 == 7) {
                                ++var8;
                                ++var9;
                            }
                        } else {
                            ++var9;
                        }
                    } else {
                        ++var8;
                    }
                } else {
                    --var8;
                }
            } else {
                ++var8;
                --var9;
            }
            if (!var3) {
                var5.method4027(var9, var8, 0, class305.field4419[arg1]);
            } else {
                var5.field9977 = var9;
                var5.field9963 = true;
                var5.field9978 = var8;
            }
        } else if (~var4 == -3) {
            int var10 = arg2.method2591(-30, 4);
            int var11 = var5.field9219[0];
            int var12 = var5.field9214[0];
            if (~var10 != -1) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (var10 != 3) {
                            if (var10 == 4) {
                                var11 += 2;
                                var12 -= 2;
                            } else if (var10 != 5) {
                                if (~var10 != -7) {
                                    if (~var10 != -8) {
                                        if (~var10 == -9) {
                                            var11 += 2;
                                        } else if (var10 == 9) {
                                            ++var12;
                                            var11 -= 2;
                                        } else if (~var10 == -11) {
                                            var11 += 2;
                                            ++var12;
                                        } else if (~var10 != -12) {
                                            if (var10 != 12) {
                                                if (var10 != 13) {
                                                    if (var10 == 14) {
                                                        ++var11;
                                                        var12 += 2;
                                                    } else if (~var10 == -16) {
                                                        var11 += 2;
                                                        var12 += 2;
                                                    }
                                                } else {
                                                    var12 += 2;
                                                }
                                            } else {
                                                --var11;
                                                var12 += 2;
                                            }
                                        } else {
                                            var11 -= 2;
                                            var12 += 2;
                                        }
                                    } else {
                                        var11 -= 2;
                                    }
                                } else {
                                    var11 += 2;
                                    --var12;
                                }
                            } else {
                                var11 -= 2;
                                --var12;
                            }
                        } else {
                            var12 -= 2;
                            ++var11;
                        }
                    } else {
                        var12 -= 2;
                    }
                } else {
                    --var11;
                    var12 -= 2;
                }
            } else {
                var12 -= 2;
                var11 -= 2;
            }
            if (var3) {
                var5.field9978 = var11;
                var5.field9963 = true;
                var5.field9977 = var12;
            } else {
                var5.method4027(var12, var11, 0, class305.field4419[arg1]);
            }
        } else {
            int var13 = arg2.method2591(-30, 1);
            if (~var13 == -1) {
                int var14 = arg2.method2591(-30, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 1020) >> 5;
                if (~var16 < -16) {
                    var16 -= 32;
                }
                int var17 = var14 & 31;
                if (~var17 < -16) {
                    var17 -= 32;
                }
                int var18 = var5.field9219[0] + var16;
                int var19 = var5.field9214[0] - -var17;
                if (!var3) {
                    var5.method4027(var19, var18, 0, class305.field4419[arg1]);
                } else {
                    var5.field9963 = true;
                    var5.field9978 = var18;
                    var5.field9977 = var19;
                }
                var5.field3467 = var5.field3469 = (byte) (3 & var5.field3467 + var15);
                if (class123.method865(var18, var19, 107)) {
                    ++var5.field3469;
                }
                if (class173.field2193 == arg1) {
                    if (~class435.field6040 != ~var5.field3467) {
                        class282.field4043 = true;
                    }
                    class435.field6040 = var5.field3467;
                }
            } else {
                int var20 = arg2.method2591(-30, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 268433314) >> 14;
                int var23 = 16383 & var20;
                int var24 = (var5.field9219[0] + var22 - -class444.field6151 & 16383) + -class444.field6151;
                int var25 = (var5.field9214[0] + class236.field3535 - -var23 & 16383) - class236.field3535;
                if (!var3) {
                    var5.method4027(var25, var24, 0, class305.field4419[arg1]);
                } else {
                    var5.field9963 = true;
                    var5.field9977 = var25;
                    var5.field9978 = var24;
                }
                var5.field3467 = var5.field3469 = (byte) (var5.field3467 + var21 & 3);
                if (class123.method865(var24, var25, 121)) {
                    ++var5.field3469;
                }
                if (~class173.field2193 == ~arg1) {
                    class435.field6040 = var5.field3467;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public final void method3615(boolean arg0) {
        if (this.field8788 != null) {
            this.field8788.method2407();
        }
        if (!arg0) {
            this.field8797 = 68;
        }
        ++field8800;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILha;)Lrk;")
    public final class289 method74(int arg0, class473 arg1) {
        ++field8812;
        class231 var3 = this.method3617(6, 2048 | (~this.field8789 != -1 ? 5 : 0), this.field8799, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 < 75) {
                field8802 = null;
            }
            if (this.field8789 != 0) {
                var3.method1542(this.field8789 * 2048);
            }
            class12 var4 = arg1.method153();
            var4.method50(super.field3470, super.field3464, super.field3460);
            this.method3611(arg1, var4, var3, (byte) -126);
            class289 var5 = class122.method863(1, (byte) 82, false);
            if (class529.field7284) {
                var3.method1580(var4, var5.field4255[0], class775.field10662, 0);
            } else {
                var3.method1586(var4, var5.field4255[0], 0);
            }
            if (this.field8788 != null) {
                class714 var6 = this.field8788.method2402();
                if (!class529.field7284) {
                    arg1.method253(var6);
                } else {
                    arg1.method134(var6, class775.field10662);
                }
            }
            this.field8786 = var3.method1575();
            this.field8801 = var3.method1576();
            this.field8797 = var3.method1539();
            return var5;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Z")
    public final boolean method80(int arg0) {
        ++field8792;
        if (arg0 <= 63) {
            this.method88(51, (class473) null, -32, 115);
        }
        return this.field8786;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8799 = arg0;
        this.field8789 = arg12;
        this.field8806 = arg1 + arg2;
        class346 var14 = class576.field8094.method4137((byte) -117, this.field8799);
        int var15 = var14.field5023;
        if (var15 == -1) {
            this.field8817 = true;
        } else {
            this.field8811 = class571.field8029.method3695(var15, (byte) -109);
            this.field8817 = false;
        }
        if (this.field8806 == arg2) {
            class538.method3196(this, this.field8794, true, this.field8811);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method3616(boolean arg0, String arg1) {
        if (arg0) {
            method3616(true, (String) null);
        }
        ++field8813;
        if (class74.field826 == null) {
            class547.method3234(88);
        }
        class192.field2384.setTime(new Date(class683.method3903((byte) 4)));
        int var2 = class192.field2384.get(11);
        int var3 = class192.field2384.get(12);
        int var4 = class192.field2384.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class24.method105(arg1, 19478, '\n');
        for (int var7 = 0; ~var7 > ~var6.length; ++var7) {
            for (int var8 = class371.field5343; var8 > 0; --var8) {
                class74.field826[var8] = class74.field826[var8 - 1];
            }
            class74.field826[0] = var5 + ": " + var6[var7];
            if (class240.field3577 != null) {
                try {
                    class240.field3577.write(class233.method1595(class74.field826[0] + "\n", false));
                } catch (IOException var9) {
                }
            }
            if (class371.field5343 < class74.field826.length + -1) {
                if (~class534.field7390 < -1) {
                    ++class534.field7390;
                }
                ++class371.field5343;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILha;)Lka;")
    private final class231 method3617(int arg0, int arg1, int arg2, class473 arg3) {
        ++field8807;
        class346 var5 = class576.field8094.method4137((byte) -117, arg2);
        class418 var6 = class95.field1115[super.field3467];
        if (arg0 != 6) {
            this.finalize();
        }
        class418 var7 = super.field3469 < 3 ? class95.field1115[super.field3469 - -1] : null;
        return this.field8817 ? var5.method2182(super.field3470, super.field3460, var7, super.field3464, true, -1, class571.field8029, arg1, 1, var6, 0, -1, arg3) : var5.method2182(super.field3470, super.field3460, var7, super.field3464, true, this.field8815, class571.field8029, arg1, 1, var6, this.field8804, this.field8794, arg3);
    }
}
