import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class61 extends class30 {

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    private int field781 = 8;

    @OriginalMember(owner = "client!co", name = "fb", descriptor = "I")
    private int field799 = 4;

    @OriginalMember(owner = "client!co", name = "eb", descriptor = "I")
    private int field798 = 409;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    private int field779 = 204;

    @OriginalMember(owner = "client!co", name = "bb", descriptor = "I")
    private int field795 = 81;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    private int field788 = 0;

    @OriginalMember(owner = "client!co", name = "jb", descriptor = "I")
    private int field803 = 1024;

    @OriginalMember(owner = "client!co", name = "kb", descriptor = "I")
    private int field804 = 1024;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!co", name = "Y", descriptor = "Lne;")
    public static class172 field792 = null;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "Z")
    public static boolean field786 = false;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!co", name = "cb", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!co", name = "db", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!co", name = "gb", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!co", name = "hb", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!co", name = "ib", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "Ljava/lang/String;")
    public static String field790;

    @OriginalMember(owner = "client!co", name = "Z", descriptor = "[I")
    private int[] field793;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "[[I")
    private int[][] field784;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "[[I")
    private int[][] field785;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)V")
    public static void method396(int arg0) {
        field792 = null;
        if (arg0 != 0) {
            field800 = 107;
        }
        field790 = null;
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)V")
    public static final void method397(int arg0) {
        class375.field5665 = null;
        class377.field5697 = null;
        class385.field5812 = false;
        ++field797;
        class385.field5817 = null;
        if (arg0 != -14965) {
            field792 = null;
        }
        class7.field91 = null;
        class35.field430 = null;
        class193.method1356((byte) 118);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BILmo;)Lpo;")
    public static final class331 method398(byte arg0, int arg1, class447 arg2) {
        ++field777;
        byte[] var3 = arg2.method2776(0, arg1);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -57 % ((arg0 - 59) / 42);
            return new class331(var3);
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
    public final void method111(byte arg0) {
        this.method400(false);
        ++field802;
        if (arg0 <= 90) {
            this.field784 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 <= 49) {
            field787 = 72;
        }
        ++field789;
        int[] var3 = super.field371.method2367((byte) -88, arg0);
        if (super.field371.field5586) {
            int var4 = 0;
            int var5;
            for (var5 = class132.field2064[arg0] + this.field788; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field781 < ~var4 && this.field793[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field793[var4];
            int var9 = this.field793[var4 + -1];
            if (this.field794 + var9 < var5 && var5 < -this.field794 + var8) {
                for (int var10 = 0; var10 < class369.field5610; ++var10) {
                    int var11 = !var7 ? -this.field803 : this.field803;
                    int var12 = 0;
                    int var13;
                    for (var13 = class79.field995[var10] - -(this.field801 * var11 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field799 > var12 && this.field784[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field784[var6][var14];
                    int var16 = this.field784[var6][var12];
                    if (this.field794 + var15 < var13 && ~var13 > ~(-this.field794 + var16)) {
                        var3[var10] = this.field785[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class408.method2558(var3, 0, class369.field5610, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
    public static final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~arg2 <= ~class406.field6033 && ~class185.field3005 <= ~arg1 && class99.field1378 <= arg4 && ~class396.field5925 <= ~arg3) {
            if (~arg6 != -2) {
                class161.method1122(arg3, false, arg2, arg1, arg4, arg6, arg5);
            } else {
                class308.method2068(arg1, (byte) 96, arg3, arg4, arg5, arg2);
            }
        } else if (~arg6 == -2) {
            class80.method503(arg5, arg4, arg3, arg1, 24935, arg2);
        } else {
            class250.method1729(arg6, arg3, arg4, arg1, arg5, (byte) -51, arg2);
        }
        int var7 = 19 / ((73 - arg0) / 38);
        ++field791;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(Z)V")
    private final void method400(boolean arg0) {
        ++field783;
        Random var2 = new Random((long) this.field781);
        this.field801 = 4096 / this.field799;
        this.field794 = this.field795 / 2;
        this.field778 = 4096 / this.field781;
        int var3 = this.field801 / 2;
        int var4 = this.field778 / 2;
        this.field793 = new int[this.field781 + 1];
        if (arg0) {
            this.field778 = 72;
        }
        this.field784 = new int[this.field781][this.field799 + 1];
        this.field785 = new int[this.field781][this.field799];
        this.field793[0] = 0;
        for (int var5 = 0; var5 < this.field781; ++var5) {
            if (var5 > 0) {
                int var6 = this.field778;
                int var7 = (-2048 + class105.method797(var2, -26, 4096)) * this.field779 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field793[var5] = this.field793[var5 - 1] + var8;
            }
            this.field784[var5][0] = 0;
            for (int var9 = 0; ~this.field799 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field801;
                    int var11 = (class105.method797(var2, -59, 4096) + -2048) * this.field798 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field784[var5][var9] = this.field784[var5][var9 + -1] + var12;
                }
                this.field785[var5][var9] = this.field804 > 0 ? -class105.method797(var2, -81, this.field804) + 4096 : 4096;
            }
            this.field784[var5][this.field799] = 4096;
        }
        this.field793[this.field781] = 4096;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)V")
    public static final void method401(int arg0, boolean arg1) {
        ++field796;
        if (!arg1 == class358.field5479) {
            class358.field5479 = arg1;
            if (arg0 <= 107) {
                field800 = 121;
            }
            class41.method272((byte) 101);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field782;
        if (arg1 != 6456) {
            this.field788 = -38;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field804 = arg0.method1272((byte) -64);
                                    }
                                } else {
                                    this.field795 = arg0.method1272((byte) -65);
                                }
                            } else {
                                this.field788 = arg0.method1272((byte) -124);
                            }
                        } else {
                            this.field803 = arg0.method1272((byte) -92);
                        }
                    } else {
                        this.field779 = arg0.method1272((byte) -84);
                    }
                } else {
                    this.field798 = arg0.method1272((byte) -82);
                }
            } else {
                this.field781 = arg0.method1322(false);
            }
        } else {
            this.field799 = arg0.method1322(false);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLjg;)Lfj;")
    public static final class394 method402(boolean arg0, class186 arg1) {
        ++field780;
        if (arg0) {
            field786 = false;
        }
        return new class394(arg1.method1276((byte) 102), arg1.method1276((byte) 121), arg1.method1276((byte) -124), arg1.method1276((byte) 92), arg1.method1275(-1), arg1.method1322(false));
    }
}
