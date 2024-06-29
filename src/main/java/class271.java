import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class271 extends class260 {

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "Z")
    private boolean field4778 = true;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Z")
    private boolean field4785 = true;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "[I")
    public static int[] field4775 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Loh;")
    public static class263 field4779 = class253.method1681(-121, "<br>(X");

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Loh;")
    public static class263 field4783 = class253.method1681(-118, "Opened titlescreen)3");

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field4786 = 0;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "Lsb;")
    public static class216 field4773 = new class216(64);

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    public static int field4789 = 0;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "Ltf;")
    public static class104 field4784;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "Lue;")
    public static class86 field4787;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        class154.field2792.method1516(arg0 + -36, 111);
        for (class266 var1 = (class266) class212.field3797.method38(24172); var1 != null; var1 = (class266) class212.field3797.method36(104)) {
            if (var1.field4640 == 0) {
                class218.method1488(var1, true, true);
            }
        }
        if (arg0 != 0) {
            method1847((byte) 36, 12);
        }
        ++field4774;
        if (class113.field2121 != null) {
            class220.method1508(class113.field2121, (byte) -116);
            class113.field2121 = null;
        }
        ++class136.field2486;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4505 = arg2.method1301(-8317) == 1;
                }
            } else {
                this.field4785 = arg2.method1301(arg1 ^ -13882) == 1;
            }
        } else {
            this.field4778 = arg2.method1301(-8317) == 1;
        }
        if (arg1 != 5701) {
            field4786 = 43;
        }
        ++field4782;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class271() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        ++field4780;
        int[][] var3 = super.field4509.method1667(arg0, arg1 ^ arg1);
        if (super.field4509.field4346) {
            int[][] var4 = this.method1712((byte) 114, 0, this.field4785 ? -arg0 + class277.field4846 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            if (this.field4778) {
                for (int var11 = 0; ~class49.field1052 < ~var11; ++var11) {
                    var6[var11] = var5[-var11 + class166.field3024];
                    var7[var11] = var10[-var11 + class166.field3024];
                    var9[var11] = var8[-var11 + class166.field3024];
                }
            } else {
                for (int var12 = 0; var12 < class49.field1052; ++var12) {
                    var6[var12] = var5[var12];
                    var7[var12] = var10[var12];
                    var9[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILoh;I)V")
    public static final void method1846(int arg0, class263 arg1, int arg2) {
        ++field4781;
        class263 var3 = arg1.method1743(false).method1761(122);
        boolean var4 = false;
        for (int var5 = arg0; ~var5 > ~class41.field911; ++var5) {
            class137 var6 = class151.field2725[class249.field4354[var5]];
            if (var6 != null && var6.field2508 != null && var6.field2508.method1766(-1, var3)) {
                class131.method845(false, class229.field4018.field4713[0], 2, 1, var6.field4714[0], 1, class229.field4018.field4714[0], var6.field4713[0], 0, 0, 0, (byte) -94);
                if (~arg2 != -2) {
                    if (arg2 == 4) {
                        class154.field2792.method1516(62, 25);
                        class154.field2792.method1280(class249.field4354[var5], (byte) -105);
                        ++class249.field4347;
                    } else if (~arg2 == -6) {
                        ++class14.field360;
                        class154.field2792.method1516(-39, 52);
                        class154.field2792.method1276(class249.field4354[var5], -127);
                    } else if (~arg2 == -7) {
                        ++class157.field2824;
                        class154.field2792.method1516(arg0 + -58, 108);
                        class154.field2792.method1325(false, class249.field4354[var5]);
                    } else if (arg2 == 7) {
                        class154.field2792.method1516(104, 185);
                        ++class12.field336;
                        class154.field2792.method1280(class249.field4354[var5], (byte) 123);
                    }
                } else {
                    ++class125.field2308;
                    class154.field2792.method1516(81, 230);
                    class154.field2792.method1325(false, class249.field4354[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class120.method774(0, class124.method797(-74, new class263[] { class119.field2207, var3 }), -11292, class20.field459);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1847(byte arg0, int arg1) {
        int var2 = 35 % ((arg0 - -15) / 59);
        ++field4777;
        if (~arg1 > -33) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return ~arg1 > -130 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            method1848((class70) null);
        }
        ++field4776;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(this.field4785 ? -arg0 + class277.field4846 : arg0, 0, false);
            if (!this.field4778) {
                class149.method979(var4, 0, var3, 0, class49.field1052);
            } else {
                for (int var5 = 0; class49.field1052 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class166.field3024];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ltd;)V")
    public static final void method1848(class70 arg0) {
        for (int var1 = arg0.field1405; var1 <= arg0.field1418; ++var1) {
            for (int var2 = arg0.field1403; var2 <= arg0.field1413; ++var2) {
                class2 var3 = class18.field417[arg0.field1399][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field27; ++var4) {
                        if (var3.field37[var4] == arg0) {
                            --var3.field27;
                            for (int var5 = var4; var5 < var3.field27; ++var5) {
                                var3.field37[var5] = var3.field37[var5 + 1];
                                var3.field36[var5] = var3.field36[var5 + 1];
                            }
                            var3.field37[var3.field27] = null;
                            break;
                        }
                    }
                    var3.field41 = 0;
                    for (int var6 = 0; var6 < var3.field27; ++var6) {
                        var3.field41 |= var3.field36[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)V")
    public static void method1849(int arg0) {
        field4783 = null;
        field4784 = null;
        field4779 = null;
        field4775 = null;
        field4773 = null;
        if (arg0 != 1) {
            field4788 = -80;
        }
        field4787 = null;
    }
}
