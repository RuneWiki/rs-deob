import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class344 extends class539 implements class602 {

    @OriginalMember(owner = "client!hs", name = "lb", descriptor = "Z")
    private boolean field4828 = false;

    @OriginalMember(owner = "client!hs", name = "W", descriptor = "Ljp;")
    public class374 field4813;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "Z")
    private boolean field4808;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "[I")
    public static int[] field4804 = new int[1];

    @OriginalMember(owner = "client!hs", name = "nb", descriptor = "I")
    public static int field4830 = 0;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "D")
    public static double field4807;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!hs", name = "U", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!hs", name = "V", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!hs", name = "X", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!hs", name = "Y", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!hs", name = "ab", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!hs", name = "bb", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!hs", name = "cb", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!hs", name = "db", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!hs", name = "fb", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!hs", name = "gb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!hs", name = "hb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!hs", name = "ib", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!hs", name = "jb", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!hs", name = "kb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!hs", name = "mb", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!hs", name = "ob", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!hs", name = "Z", descriptor = "Lln;")
    private class398 field4816;

    @OriginalMember(owner = "client!hs", name = "eb", descriptor = "[I")
    public static int[] field4821;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLjca;)V")
    public final void method2181(byte arg0, class711 arg1) {
        this.field4813.method2349(arg1, true);
        int var3 = 122 / ((arg0 - -24) / 39);
        ++field4815;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Z")
    public final boolean method1747(byte arg0) {
        ++field4822;
        int var2 = 36 % ((arg0 - -41) / 60);
        return this.field4813.method2353(-1);
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
    public final int method1748(int arg0) {
        ++field4814;
        if (arg0 != 5875) {
            this.field4813 = null;
        }
        return this.field4813.field5447;
    }

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "(I)V")
    public static void method2182(int arg0) {
        field4821 = null;
        field4804 = null;
        if (arg0 != -1) {
            field4804 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public final void method1745(boolean arg0) {
        ++field4824;
        if (!arg0) {
            this.field4813 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILfq;BIILha;Z)V")
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        ++field4823;
        if (arg2 == -103) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lha;Llp;IIIIIZIIIIIII)V")
    public class344(class66 arg0, class412 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5856 == 1, class522.method3034(arg13, 2, arg12));
        this.field4813 = new class374(arg0, arg1, arg12, arg13, super.field2813, arg3, this, arg7, arg14);
        this.field4808 = ~arg1.field5905 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "(I)Z")
    public final boolean method777(int arg0) {
        ++field4809;
        int var2 = -29 / ((-34 - arg0) / 59);
        return this.field4828;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(Lha;B)Lpia;")
    public final class104 method114(class66 arg0, byte arg1) {
        ++field4811;
        class497 var3 = this.field4813.method2341(arg1 ^ 2, arg0, false, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 115) {
                this.field4808 = true;
            }
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            class104 var5 = class568.method3241(1, (byte) -101, this.field4808);
            this.field4813.method2347(true, super.field7466, super.field7455, var4, arg0, super.field7453, super.field7467, (byte) -118, var3);
            if (!class408.field5786) {
                var3.method254(var4, var5.field1479[0], 0);
            } else {
                var3.method258(var4, var5.field1479[0], class72.field972, 0);
            }
            if (this.field4813.field5452 != null) {
                class586 var6 = this.field4813.field5452.method1057();
                if (!class408.field5786) {
                    arg0.method534(var6);
                } else {
                    arg0.method524(var6, class72.field972);
                }
            }
            this.field4828 = var3.method272() || this.field4813.field5452 != null;
            if (this.field4816 != null) {
                class478.method2827(true, super.field2802, var3, this.field4816, super.field2810, super.field2815);
            } else {
                this.field4816 = class122.method882(var3, super.field2810, super.field2802, super.field2815, -124);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field4831;
        if (arg0 != -13127) {
            this.method1745(true);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)I")
    public final int method1744(int arg0) {
        if (arg0 != 21215) {
            return 86;
        } else {
            ++field4827;
            return this.field4813.field5474;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lha;B)V")
    public final void method1752(class66 arg0, byte arg1) {
        ++field4825;
        this.field4813.method2352((byte) -93, arg0);
        if (arg1 > -17) {
            this.method774((byte) 69);
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        ++field4810;
        if (arg0 != -34) {
            this.method1747((byte) -68);
        }
        return false;
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
    public final int method1750(int arg0) {
        if (arg0 != 29244) {
            return -49;
        } else {
            ++field4817;
            return this.field4813.field5456;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(Lha;B)V")
    public final void method131(class66 arg0, byte arg1) {
        if (arg1 != 53) {
            field4807 = -0.4785167099835216D;
        }
        ++field4819;
        class497 var3 = this.field4813.method2341(arg1 + 8, arg0, true, 262144, true);
        if (var3 != null) {
            class109 var4 = arg0.method475();
            var4.method814(super.field2802, super.field2815, super.field2810);
            this.field4813.method2347(false, super.field7466, super.field7455, var4, arg0, super.field7453, super.field7467, (byte) -118, var3);
        }
    }

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        if (arg0 > -70) {
            return false;
        } else {
            ++field4826;
            return false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field4820;
        class497 var5 = this.field4813.method2341(56, arg1, false, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class109 var6 = arg1.method475();
            if (arg2 != 6238) {
                return false;
            } else {
                var6.method814(super.field2802, super.field2815, super.field2810);
                return class408.field5786 ? var5.method245(arg0, arg3, var6, false, 0, class72.field972) : var5.method248(arg0, arg3, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(Lha;B)Lln;")
    public final class398 method119(class66 arg0, byte arg1) {
        if (arg1 > -35) {
            return null;
        } else {
            ++field4805;
            return this.field4816;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V")
    public static final void method2183(int arg0, byte arg1, int arg2) {
        ++field4829;
        if (class752.field10166 < class752.field10160) {
            class752.field10166 = (float) ((double) class752.field10166 / 30.0D + (double) class752.field10166);
            if (class752.field10160 < class752.field10166) {
                class752.field10166 = class752.field10160;
            }
            class642.method3536(-1);
            class752.field10165 = (int) class752.field10166 >> 1;
            class752.field10167 = class786.method4308(class752.field10165, -1);
        } else if (class752.field10166 > class752.field10160) {
            class752.field10166 = (float) ((double) class752.field10166 - (double) class752.field10166 / 30.0D);
            if (class752.field10166 < class752.field10160) {
                class752.field10166 = class752.field10160;
            }
            class642.method3536(-114);
            class752.field10165 = (int) class752.field10166 >> 1;
            class752.field10167 = class786.method4308(class752.field10165, -1);
        }
        if (class313.field4423 != -1 && class213.field2800 != -1) {
            int var3 = -class720.field9789 + class313.field4423;
            if (var3 < 2 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = class213.field2800 - class81.field1129;
            if (var4 < 2 || ~var4 < -3) {
                var4 /= 8;
            }
            class720.field9789 += var3;
            if (~var3 == -1 && ~var4 == -1) {
                class213.field2800 = -1;
                class313.field4423 = -1;
            }
            class81.field1129 -= -var4;
            class642.method3536(16);
        }
        if (arg1 == -93) {
            if (~class419.field6021 >= -1) {
                class163.field2163 = -1;
                class672.field9007 = -1;
            } else {
                --class7.field54;
                if (~class7.field54 == -1) {
                    class7.field54 = 100;
                    --class419.field6021;
                }
            }
            if (class284.field4084 && class735.field9966 != null) {
                for (class265 var5 = (class265) class735.field9966.method679((byte) -86); var5 != null; var5 = (class265) class735.field9966.method681(-61)) {
                    class349 var6 = class752.field10153.method2074(104, var5.field3891.field2885);
                    if (!var5.method1781(2, arg2, arg0)) {
                        if (var5.field3891.field2891) {
                            var5.field3891.field2891 = false;
                            class727.method4014(class408.field5783, var5.field3891.field2885, var6.field5098);
                        }
                    } else {
                        if (var6.field5067 != null) {
                            if (var6.field5067[4] != null) {
                                class26.method147(-1, true, var6.field5067[4], (long) var5.field3891.field2885, 1001, 0, var6.field5060, (long) var5.field3891.field2885, false, var6.field5098, arg1 + 92, -1, false);
                            }
                            if (var6.field5067[3] != null) {
                                class26.method147(-1, true, var6.field5067[3], (long) var5.field3891.field2885, 1011, 0, var6.field5060, (long) var5.field3891.field2885, false, var6.field5098, -1, -1, false);
                            }
                            if (var6.field5067[2] != null) {
                                class26.method147(-1, true, var6.field5067[2], (long) var5.field3891.field2885, 1010, 0, var6.field5060, (long) var5.field3891.field2885, false, var6.field5098, -1, -1, false);
                            }
                            if (var6.field5067[1] != null) {
                                class26.method147(-1, true, var6.field5067[1], (long) var5.field3891.field2885, 1007, 0, var6.field5060, (long) var5.field3891.field2885, false, var6.field5098, -1, -1, false);
                            }
                            if (var6.field5067[0] != null) {
                                class26.method147(-1, true, var6.field5067[0], (long) var5.field3891.field2885, 1006, 0, var6.field5060, (long) var5.field3891.field2885, false, var6.field5098, arg1 ^ 92, -1, false);
                            }
                        }
                        if (!var5.field3891.field2891) {
                            var5.field3891.field2891 = true;
                            class727.method4014(class560.field7673, var5.field3891.field2885, var6.field5098);
                        }
                        if (var5.field3891.field2891) {
                            class727.method4014(class267.field3913, var5.field3891.field2885, var6.field5098);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)I")
    public final int method774(byte arg0) {
        if (arg0 != 115) {
            return -109;
        } else {
            ++field4812;
            return this.field4813.method2351(94);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lha;B)V")
    public final void method1742(class66 arg0, byte arg1) {
        if (arg1 < 68) {
            field4804 = null;
        }
        this.field4813.method2343(arg0, false);
        ++field4818;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)I")
    public final int method767(boolean arg0) {
        ++field4806;
        return arg0 ? -20 : this.field4813.method2342(true);
    }
}
