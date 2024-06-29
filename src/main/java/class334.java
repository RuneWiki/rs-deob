import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class334 {

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public int field4792 = -1;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public int field4795 = -1;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    private int field4794 = -1;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    private int field4799 = -1;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    private int field4791 = -1;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "Z")
    public boolean field4803 = true;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "I")
    public int field4809 = -1;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "I")
    public int field4790 = -1;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "Z")
    public boolean field4805 = true;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    public int field4811 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    public int field4816 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    public int field4812 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    public int field4808 = 0;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    private int field4793 = -1;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    private int field4798 = -1;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
    public boolean field4819 = false;

    @OriginalMember(owner = "client!so", name = "V", descriptor = "I")
    public int field4823 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!so", name = "W", descriptor = "Z")
    public boolean field4824 = true;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "[Ljava/lang/String;")
    public String[] field4796 = new String[5];

    @OriginalMember(owner = "client!so", name = "D", descriptor = "[I")
    public static int[] field4807 = new int[4096];

    @OriginalMember(owner = "client!so", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4814 = null;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    private int field4802;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!so", name = "X", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Lqp;")
    public class302 field4787;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "Lwb;")
    private class45 field4815;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "Ljava/lang/String;")
    public String field4784;

    @OriginalMember(owner = "client!so", name = "U", descriptor = "Ljava/lang/String;")
    public String field4822;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
    public static int[] field4780;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
    public int[] field4782;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "[Lmn;")
    public static class85[] field4806;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public final void method2020(byte arg0) {
        if (this.field4782 != null) {
            for (int var2 = 0; var2 < this.field4782.length; var2 += 2) {
                if (this.field4782[var2] < this.field4811) {
                    this.field4811 = this.field4782[var2];
                } else if (this.field4782[var2] > this.field4816) {
                    this.field4816 = this.field4782[var2];
                }
                if (this.field4823 > this.field4782[var2 + 1]) {
                    this.field4823 = this.field4782[var2 + 1];
                } else if (this.field4782[var2 + 1] > this.field4812) {
                    this.field4812 = this.field4782[var2 + 1];
                }
            }
        }
        if (arg0 != 104) {
            this.method2027((class179) null, (byte) -41);
        }
        field4813++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lvt;II)V")
    private final void method2021(class179 arg0, int arg1, int arg2) {
        int var4 = -57 / ((arg2 + 54) / 55);
        field4825++;
        if (arg1 == 1) {
            this.field4809 = arg0.method916(21933);
        } else if (arg1 == 2) {
            this.field4792 = arg0.method916(21933);
        } else if (arg1 == 3) {
            this.field4822 = arg0.method907(-27652);
        } else if (arg1 == 4) {
            this.field4778 = arg0.method899((byte) -77);
        } else if (arg1 == 5) {
            this.field4790 = arg0.method899((byte) -30);
            return;
        } else if (arg1 == 6) {
            this.field4808 = arg0.method895((byte) -111);
            return;
        } else if (arg1 == 7) {
            int var13 = arg0.method895((byte) -91);
            if ((var13 & 0x1) == 0) {
                this.field4805 = false;
            }
            if ((var13 & 0x2) == 2) {
                this.field4819 = true;
                return;
            }
        } else if (arg1 == 8) {
            this.field4824 = arg0.method895((byte) -85) == 1;
            return;
        } else if (arg1 == 9) {
            this.field4794 = arg0.method916(21933);
            if (this.field4794 == 65535) {
                this.field4794 = -1;
            }
            this.field4793 = arg0.method916(21933);
            if (this.field4793 == 65535) {
                this.field4793 = -1;
            }
            this.field4781 = arg0.method939((byte) -61);
            this.field4802 = arg0.method939((byte) 125);
            return;
        } else if (arg1 < 10 || arg1 > 14) {
            if (arg1 != 15) {
                if (arg1 != 16) {
                    if (arg1 != 17) {
                        if (arg1 == 18) {
                            this.field4799 = arg0.method916(21933);
                            return;
                        }
                        if (arg1 != 19) {
                            if (arg1 == 20) {
                                this.field4798 = arg0.method916(21933);
                                if (this.field4798 == 65535) {
                                    this.field4798 = -1;
                                }
                                this.field4791 = arg0.method916(21933);
                                if (this.field4791 == 65535) {
                                    this.field4791 = -1;
                                }
                                this.field4818 = arg0.method939((byte) 100);
                                this.field4804 = arg0.method939((byte) -102);
                                return;
                            }
                            if (arg1 != 21) {
                                if (arg1 == 22) {
                                    this.field4788 = arg0.method939((byte) -118);
                                } else if (arg1 == 249) {
                                    int var7 = arg0.method895((byte) -84);
                                    if (this.field4815 == null) {
                                        int var8 = class93.method459(-719824240, var7);
                                        this.field4815 = new class45(var8);
                                    }
                                    for (int var9 = 0; var9 < var7; var9++) {
                                        boolean var10 = arg0.method895((byte) -77) == 1;
                                        int var11 = arg0.method899((byte) -16);
                                        class147 var12;
                                        if (var10) {
                                            var12 = new class373(arg0.method907(-27652));
                                        } else {
                                            var12 = new class363(arg0.method939((byte) 74));
                                        }
                                        this.field4815.method234(-54, (long) var11, var12);
                                    }
                                    return;
                                }
                                return;
                            }
                            this.field4821 = arg0.method939((byte) -118);
                            return;
                        }
                        this.field4795 = arg0.method916(21933);
                        return;
                    }
                    this.field4784 = arg0.method907(-27652);
                    return;
                }
                this.field4803 = false;
                return;
            }
            int var5 = arg0.method895((byte) -80);
            this.field4782 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field4782[var6] = arg0.method906(-126);
            }
            this.field4783 = arg0.method939((byte) 97);
            this.field4785 = arg0.method939((byte) 85);
            return;
        } else {
            this.field4796[arg1 - 10] = arg0.method907(-27652);
            return;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public static void method2022(byte arg0) {
        if (arg0 <= 31) {
            field4780 = null;
        }
        field4780 = null;
        field4807 = null;
        field4814 = null;
        field4806 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method2023(byte arg0, String arg1, int arg2) {
        field4801++;
        if (this.field4815 == null) {
            return arg1;
        } else {
            int var4 = 27 % ((69 - arg0) / 42);
            class373 var5 = (class373) this.field4815.method233(81, (long) arg2);
            return var5 == null ? arg1 : var5.field5332;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;Lkd;II)Lgj;")
    public static final class405 method2024(String arg0, class355 arg1, int arg2, int arg3) {
        if (arg3 <= 48) {
            return null;
        }
        field4817++;
        if (arg2 == 0) {
            return arg1.method2162(arg0, (byte) -122);
        } else if (arg2 == 1) {
            try {
                class336.method2040(-19485, new Object[] { (new URL(arg1.field5106.getCodeBase(), arg0)).toString() }, "openjs", arg1.field5106);
                class405 var4 = new class405();
                var4.field5759 = 1;
                return var4;
            } catch (Throwable var10) {
                class405 var5 = new class405();
                var5.field5759 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg1.field5106.getAppletContext().showDocument(new URL(arg1.field5106.getCodeBase(), arg0), "_blank");
                class405 var6 = new class405();
                var6.field5759 = 1;
                return var6;
            } catch (Exception var11) {
                class405 var7 = new class405();
                var7.field5759 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class336.method2038(arg1.field5106, -127, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg1.field5106.getAppletContext().showDocument(new URL(arg1.field5106.getCodeBase(), arg0), "_top");
                class405 var8 = new class405();
                var8.field5759 = 1;
                return var8;
            } catch (Exception var12) {
                class405 var9 = new class405();
                var9.field5759 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Loj;IZ)Lrg;")
    public final class395 method2025(class280 arg0, int arg1, boolean arg2) {
        field4820++;
        int var4 = arg2 ? this.field4792 : this.field4809;
        int var5 = var4 | arg0.field4075 << 29;
        if (arg1 != 29784) {
            this.field4805 = true;
        }
        class395 var6 = (class395) this.field4787.field4486.method1163((byte) 111, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field4787.field4485.method2758(var4, -1)) {
            class473 var7 = class473.method2795(this.field4787.field4485, var4, 0);
            if (var7 != null) {
                var6 = arg0.method1426(var7, true);
                this.field4787.field4486.method1172((long) var5, arg1 ^ 0x7459, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILeh;)Z")
    public final boolean method2026(int arg0, class130 arg1) {
        if (arg0 != 2) {
            return false;
        }
        field4810++;
        int var3;
        if (this.field4793 == -1) {
            if (this.field4794 == -1) {
                return true;
            }
            var3 = arg1.method620(this.field4794, 42);
        } else {
            var3 = arg1.method621(this.field4793, arg0 ^ 0xFFFFFFFD);
        }
        if (var3 < this.field4781 || var3 > this.field4802) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field4791 == -1) {
            if (this.field4798 == -1) {
                return true;
            }
            var5 = arg1.method620(this.field4798, arg0 + 91);
        } else {
            var5 = arg1.method621(this.field4791, -1);
        }
        return this.field4818 <= var5 && this.field4804 >= var5;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lvt;B)V")
    public final void method2027(class179 arg0, byte arg1) {
        if (arg1 >= -77) {
            return;
        }
        field4779++;
        while (true) {
            int var3 = arg0.method895((byte) -85);
            if (var3 == 0) {
                return;
            }
            this.method2021(arg0, var3, -116);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLoj;)Lrg;")
    public final class395 method2028(byte arg0, class280 arg1) {
        field4797++;
        class395 var3 = (class395) this.field4787.field4486.method1163((byte) -80, (long) (this.field4799 | 0x20000 | arg1.field4075 << 29));
        int var4 = 8 % ((-arg0 - 17) / 48);
        if (var3 != null) {
            return var3;
        }
        this.field4787.field4485.method2758(this.field4799, -1);
        class473 var5 = class473.method2795(this.field4787.field4485, this.field4799, 0);
        if (var5 != null) {
            var3 = arg1.method1426(var5, true);
            this.field4787.field4486.method1172((long) (arg1.field4075 << 29 | 0x20000 | this.field4799), 1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)I")
    public final int method2029(int arg0, int arg1, int arg2) {
        field4789++;
        if (this.field4815 == null) {
            return arg2;
        } else if (arg0 == -1) {
            class363 var4 = (class363) this.field4815.method233(-71, (long) arg1);
            return var4 == null ? arg2 : var4.field5221;
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lg;Lg;I)V")
    public static final void method2030(class470 arg0, class470 arg1, int arg2) {
        class368.field5258 = arg0;
        if (arg2 == 1) {
            field4786++;
            class419.field6035 = arg1;
        }
    }
}
