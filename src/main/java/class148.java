import java.awt.event.ActionEvent;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("q")
public class class148 extends class85 {

    @OriginalMember(owner = "q", name = "R", descriptor = "I")
    private int field2845 = 0;

    @OriginalMember(owner = "q", name = "W", descriptor = "I")
    private int field2848 = 4;

    @OriginalMember(owner = "q", name = "fb", descriptor = "Z")
    private boolean field2857 = true;

    @OriginalMember(owner = "q", name = "Q", descriptor = "[I")
    private int[] field2844 = new int[512];

    @OriginalMember(owner = "q", name = "gb", descriptor = "I")
    private int field2858 = 4;

    @OriginalMember(owner = "q", name = "eb", descriptor = "I")
    private int field2856 = 4;

    @OriginalMember(owner = "q", name = "ab", descriptor = "I")
    private int field2852 = 1638;

    @OriginalMember(owner = "q", name = "cb", descriptor = "Ltf;")
    public static class181 field2854 = new class181();

    @OriginalMember(owner = "q", name = "ib", descriptor = "Llf;")
    public static class109 field2860 = class35.method275("Spieler kann nicht gefunden werden: ", 2);

    @OriginalMember(owner = "q", name = "hb", descriptor = "I")
    public static int field2859 = 2;

    @OriginalMember(owner = "q", name = "pb", descriptor = "Llf;")
    public static class109 field2867 = class35.method275("sich mit einer anderen Welt zu verbinden)3", 2);

    @OriginalMember(owner = "q", name = "T", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "q", name = "U", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "q", name = "X", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "q", name = "Y", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "q", name = "Z", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "q", name = "db", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "q", name = "jb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "q", name = "kb", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "q", name = "lb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "q", name = "mb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "q", name = "ob", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "q", name = "bb", descriptor = "[I")
    private int[] field2853;

    @OriginalMember(owner = "q", name = "nb", descriptor = "[I")
    private int[] field2865;

    @OriginalMember(owner = "q", name = "<init>", descriptor = "()V")
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        ++field2846;
        if (super.field1736.field2253) {
            int var4 = this.field2856 << 12;
            int var5 = this.field2858 << 12;
            int var6 = class54.field1083[arg1] * this.field2858;
            for (int var7 = 0; ~var7 > ~class57.field1152; ++var7) {
                int var8 = 0;
                int var9 = class47.field980[var7] * this.field2856;
                for (int var10 = 0; ~this.field2848 < ~var10; ++var10) {
                    int var11 = this.field2865[var10];
                    int var12 = this.field2853[var10];
                    int var13 = this.method1036(-28254, var4 * var11 >> 12, var6 * var11 >> 12, var9 * var11 >> 12, var5 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field2857) {
                    var8 = 2048 - -(var8 >> 1);
                }
                var3[var7] = var8;
            }
        }
        return arg0 > -49 ? null : var3;
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IZIILvg;III)V")
    public static final void method1032(int arg0, boolean arg1, int arg2, int arg3, class200 arg4, int arg5, int arg6, int arg7) {
        ++field2847;
        if (class194.field3716) {
            class202.field3983 = 32;
        } else {
            class202.field3983 = 0;
        }
        class194.field3716 = false;
        if (arg1) {
            if (~class206.field4043 != -1) {
                if (~arg5 >= ~arg2 && arg5 + 16 > arg2 && ~arg6 >= ~arg7 && ~arg7 > ~(arg6 - -16)) {
                    arg4.field3945 -= 4;
                    class115.method851(arg4, -23101);
                } else if (~arg2 <= ~arg5 && ~(arg5 + 16) < ~arg2 && ~arg7 <= ~(arg6 - -arg3 - 16) && arg7 < arg3 + arg6) {
                    arg4.field3945 += 4;
                    class115.method851(arg4, -23101);
                } else if (~(-class202.field3983 + arg5) >= ~arg2 && arg2 < arg5 + 16 + class202.field3983 && arg6 + 16 <= arg7 && arg3 + -16 + arg6 > arg7) {
                    int var8 = (arg3 - 32) * arg3 / arg0;
                    if (var8 < 8) {
                        var8 = 8;
                    }
                    int var9 = -arg6 + arg7 + -(var8 / 2) + -16;
                    int var10 = -32 - var8 + arg3;
                    arg4.field3945 = (-arg3 + arg0) * var9 / var10;
                    class115.method851(arg4, -23101);
                    class194.field3716 = true;
                }
            }
            if (~class46.field963 != -1) {
                int var11 = arg4.field3881;
                if (-var11 + arg5 <= arg2 && arg7 >= arg6 && arg2 < arg5 + 16 && ~(arg3 + arg6) <= ~arg7) {
                    arg4.field3945 += class46.field963 * 45;
                    class115.method851(arg4, -23101);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "e", descriptor = "(I)I")
    public static final int method1033(int arg0) {
        ++field2851;
        int var1 = 24 / ((arg0 - -4) / 34);
        return 6;
    }

    @OriginalMember(owner = "q", name = "f", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2854 = null;
        field2860 = null;
        field2867 = null;
        if (arg0 != -16) {
            field2859 = -46;
        }
    }

    @OriginalMember(owner = "q", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        this.method1037(arg0 + -25733);
        ++field2855;
        if (arg0 == 25614) {
            this.method1039(arg0 + -25612);
        }
    }

    @OriginalMember(owner = "q", name = "c", descriptor = "(III)Z")
    public static final boolean method1035(int arg0, int arg1, int arg2) {
        ++field2863;
        if (arg2 != 255) {
            return true;
        } else {
            return ~(arg0 >> arg1 + 1 & 1) != -1;
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(IIIII)I")
    private final int method1036(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2866;
        int var6 = arg3 & -4096;
        int var7 = arg3 - var6;
        int var8 = -4096 & arg2;
        int var9 = arg2 - var8;
        int var10 = -4096 & arg4;
        int var11 = arg1 & -4096;
        int var12 = var8 >> 12;
        int var13 = var12 + 1;
        int var14 = var12 & 255;
        int var15 = var6 >> 12;
        int var16 = var15 - -1;
        if (~var16 <= ~(var11 >> 12)) {
            var16 = 0;
        }
        int var17 = var15 & 255;
        int var18 = var16 & 255;
        if (~(var10 >> 12) >= ~var13) {
            var13 = 0;
        }
        int var19 = this.field2844[this.field2844[var14] + var18] % 4;
        int var20 = this.field2844[var17 - -this.field2844[var14]] % 4;
        int var21 = var13 & 255;
        int var22 = this.field2844[var18 - -this.field2844[var21]] % 4;
        int var23 = this.field2844[this.field2844[var21] + var17] % 4;
        if (arg0 != -28254) {
            field2859 = -16;
        }
        int var24 = class88.method655(var7, var9, class192.field3679[var20], 4003);
        int var25 = class88.method655(var7 - 4096, var9, class192.field3679[var19], 4003);
        int var26 = class88.method655(var7, var9 + -4096, class192.field3679[var23], 4003);
        int var27 = class88.method655(var7 - 4096, var9 + -4096, class192.field3679[var22], 4003);
        int var28 = class84.method535(arg0 ^ 21597, var7);
        int var29 = class84.method535(arg0 + 13405, var9);
        int var30 = class88.method656(var24, 667494220, var28, var25);
        int var31 = class88.method656(var26, 667494220, var28, var27);
        return class88.method656(var30, 667494220, var29, var31);
    }

    @OriginalMember(owner = "q", name = "g", descriptor = "(I)V")
    private final void method1037(int arg0) {
        ++field2861;
        Random var2 = new Random((long) this.field2845);
        if (arg0 >= -61) {
            method1032(20, true, -94, 63, (class200) null, 74, -28, 99);
        }
        for (int var3 = 0; ~var3 > -256; ++var3) {
            this.field2844[var3] = -1;
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class123.method882(255, var2, true);
            } while (this.field2844[var5] != -1);
            this.field2844[var5 + 255] = this.field2844[var5] = var4;
        }
    }

    @OriginalMember(owner = "q", name = "h", descriptor = "(I)V")
    public static final void method1038(int arg0) {
        class193.field3692 = arg0;
        for (int var1 = 0; var1 < class103.field2036; ++var1) {
            for (int var2 = 0; var2 < class65.field1245; ++var2) {
                if (class78.field1550[arg0][var1][var2] == null) {
                    class78.field1550[arg0][var1][var2] = new class3(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 <= -120) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field2858 = arg2.method598((byte) 94);
                                    }
                                } else {
                                    this.field2856 = arg2.method598((byte) 110);
                                }
                            } else {
                                this.field2845 = arg2.method598((byte) 105);
                            }
                        } else {
                            this.field2856 = this.field2858 = arg2.method598((byte) 69);
                        }
                    } else {
                        this.field2852 = arg2.method577(true);
                        if (~this.field2852 > -1) {
                            this.field2853 = new int[this.field2848];
                            for (int var5 = 0; ~var5 > ~this.field2848; ++var5) {
                                this.field2853[var5] = arg2.method577(true);
                            }
                        }
                    }
                } else {
                    this.field2848 = arg2.method598((byte) 115);
                }
            } else {
                this.field2857 = arg2.method598((byte) 85) == 1;
            }
            ++field2849;
        }
    }

    @OriginalMember(owner = "q", name = "i", descriptor = "(I)V")
    private final void method1039(int arg0) {
        if (arg0 != 2) {
            this.method1036(-53, -82, -23, 123, 27);
        }
        ++field2850;
        if (this.field2852 <= 0) {
            if (this.field2853 != null && ~this.field2853.length == ~this.field2848) {
                this.field2865 = new int[this.field2848];
                for (int var2 = 0; ~this.field2848 < ~var2; ++var2) {
                    this.field2865[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field2853 = new int[this.field2848];
            this.field2865 = new int[this.field2848];
            for (int var3 = 0; ~var3 > ~this.field2848; ++var3) {
                this.field2853[var3] = (int) (Math.pow((double) (this.field2852 / 4096), (double) var3) * 4096.0D);
                this.field2865[var3] = (int) (Math.pow(2.0D, (double) var3) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "q", name = "a", descriptor = "(Lke;ILjava/lang/Object;)V")
    public static final void method1040(class99 arg0, int arg1, Object arg2) {
        ++field2864;
        if (arg0.field1997 != null) {
            for (int var3 = arg1; ~var3 > -51 && arg0.field1997.peekEvent() != null; ++var3) {
                class54.method354(1L, 107);
            }
            if (arg2 != null) {
                arg0.field1997.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        }
    }
}
