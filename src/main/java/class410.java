import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class410 extends class62 {

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    private int field5603 = 4;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    private int field5615 = 4;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field5609 = 104;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field5613 = -1;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "Liaa;")
    public static class423 field5611;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[I[ILcb;)Lwi;", line = 8)
    public static final class398 method2409(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, class444 arg5) {
        if (arg2 <= 1) {
            field5611 = null;
        }
        ++field5606;
        if (!arg5.method2633((byte) 126, class194.field2874, class613.field9072)) {
            int[] var6 = new int[arg0 * arg1];
            for (int var7 = 0; arg1 > var7; ++var7) {
                int var8 = arg0 * var7 + arg3[var7];
                for (int var9 = 0; arg4[var7] > var9; ++var9) {
                    var6[var8++] = -16777216;
                }
            }
            return new class398(arg5, arg0, arg1, var6);
        } else {
            byte[] var10 = new byte[arg0 * arg1];
            for (int var11 = 0; arg1 > var11; ++var11) {
                int var12 = arg0 * var11 - -arg3[var11];
                for (int var13 = 0; arg4[var11] > var13; ++var13) {
                    var10[var12++] = -1;
                }
            }
            return new class398(arg5, arg0, arg1, var10);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(CI)C", line = 72)
    public static final char method2410(char arg0, int arg1) {
        ++field5614;
        if (arg1 >= -97) {
            method2413(111);
        }
        if (~arg0 == -199) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (~arg0 == -339) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZII)V", line = 101)
    public static final void method2411(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field5607;
        if (~arg0 > ~arg1) {
            for (int var5 = arg0; var5 < arg1; ++var5) {
                class604.field8993[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; ++var6) {
                class604.field8993[var6][arg3] = arg4;
            }
        }
        if (arg2) {
            method2413(-11);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lgw;II)V", line = 137)
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field5610;
        if (arg1 == -1) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field5603 = arg0.method1032((byte) -33);
                }
            } else {
                this.field5615 = arg0.method1032((byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V", line = 171)
    public static void method2412(int arg0) {
        if (arg0 == -5096) {
            field5611 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 182)
    public class410() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I", line = 190)
    public final int[][] method409(int arg0, byte arg1) {
        ++field5612;
        if (arg1 > -20) {
            this.method13(-28, 65);
        }
        int[][] var3 = super.field772.method2906(8, arg0);
        if (super.field772.field6899) {
            int var4 = class438.field5847 / this.field5615;
            int var5 = class14.field148 / this.field5603;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method407(0, (byte) 41, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method407(0, (byte) 41, class14.field148 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class438.field5847 > var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class438.field5847 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V", line = 258)
    public static final void method2413(int arg0) {
        ++field5602;
        if (class99.field1448 == null) {
            Container var1;
            if (class390.field5382 == null) {
                var1 = class442.field5896.field4568;
            } else {
                var1 = class390.field5382;
            }
            class384.field5289 = var1.getSize().width;
            class625.field9202 = var1.getSize().height;
            if (class390.field5382 == var1) {
                Insets var2 = class390.field5382.getInsets();
                class625.field9202 -= var2.top + var2.bottom;
                class384.field5289 -= var2.right + var2.left;
            }
            if (~class609.method3580(true) == -2) {
                class104.field1513 = (class384.field5289 - class214.field3159) / 2;
                class47.field562 = class347.field4760;
                class587.field8700 = 0;
                class165.field2605 = class214.field3159;
            } else if (class467.field6579 < 96 && ~class526.field7533 == -1) {
                int var3 = class384.field5289 <= 1024 ? class384.field5289 : 1024;
                class104.field1513 = (-var3 + class384.field5289) / 2;
                class165.field2605 = var3;
                int var4 = ~class625.field9202 < -769 ? 768 : class625.field9202;
                class47.field562 = var4;
                class587.field8700 = 0;
            } else {
                class47.field562 = class625.field9202;
                class104.field1513 = 0;
                class587.field8700 = 0;
                class165.field2605 = class384.field5289;
            }
            if (arg0 == 768) {
                if (class577.field8514 != class186.field2781) {
                    boolean var10000;
                    if (class165.field2605 < 1024 && class47.field562 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class79.field1069.setSize(class165.field2605, class47.field562);
                if (class99.field1445 != null) {
                    class99.field1445.method503(class79.field1069);
                }
                if (class390.field5382 == var1) {
                    Insets var5 = class390.field5382.getInsets();
                    class79.field1069.setLocation(var5.left - -class104.field1513, class587.field8700 + var5.top);
                } else {
                    class79.field1069.setLocation(class104.field1513, class587.field8700);
                }
                if (~class340.field4708 != 0) {
                    class600.method3545(false, true);
                }
                class286.method1779(-126);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I", line = 356)
    public final int[] method13(int arg0, int arg1) {
        ++field5608;
        if (arg1 != 656024161) {
            this.method13(-76, -34);
        }
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int var4 = class438.field5847 / this.field5615;
            int var5 = class14.field148 / this.field5603;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method408(class14.field148 * var6 / var5, 0, (byte) -69);
            } else {
                var7 = this.method408(0, 0, (byte) -69);
            }
            for (int var8 = 0; class438.field5847 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class438.field5847 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
