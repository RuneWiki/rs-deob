import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class270 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field4742 = 5;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field4746 = 2;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field4748 = -1;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public int field4756 = -1;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field4745 = -1;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field4760 = 99;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Z")
    private boolean field4743 = false;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
    public boolean field4764 = false;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public int field4771 = -1;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public int field4772 = -1;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
    public static int[] field4762 = new int[2];

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Loa;")
    public static class99 field4754 = class221.method1463(2844, "scape main");

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public int[] field4740;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    private int[] field4747;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    public int[] field4749;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    private int[] field4767;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[[I")
    public int[][] field4752;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILtg;Z)Lvd;")
    public static final class4 method1779(int arg0, int arg1, class182 arg2, boolean arg3) {
        field4750++;
        if (arg3) {
            return null;
        } else if (class153.method1016(arg0, 21451, arg2, arg1)) {
            return class185.method1268(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILcl;Z)Lcl;")
    public final class195 method1780(int arg0, class195 arg1, boolean arg2) {
        int var4 = this.field4740[arg0];
        field4759++;
        class39 var5 = class82.method564(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method230(true, true);
        }
        if (!arg2) {
            method1779(-113, -94, (class182) null, false);
        }
        class195 var7 = arg1.method230(!var5.method305(64, var6), !this.field4743);
        var7.method228(var5, var6, this.field4743);
        return var7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLik;)V")
    public final void method1781(boolean arg0, class261 arg1) {
        field4741++;
        while (true) {
            int var3 = arg1.method1693((byte) -87);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.field4747 = null;
                    return;
                }
            }
            this.method1784(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method1782(byte arg0) {
        field4770++;
        int var1 = 84 / ((-arg0 - 12) / 62);
        class250.field4315.method1813(-1);
        class237.field4100.method1813(-1);
        class116.field2053.method1813(-1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLtg;)Lpi;")
    public static final class139 method1783(int arg0, byte arg1, class182 arg2) {
        if (arg1 != -7) {
            method1791(57, (class144) null, 37, (class144) null, -33, true, true);
        }
        field4758++;
        return class65.method434(arg1 - 51, arg0, arg2) ? class254.method1642(-87) : null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLik;I)V")
    private final void method1784(boolean arg0, class261 arg1, int arg2) {
        field4763++;
        if (!arg0) {
            method1791(-107, (class144) null, 38, (class144) null, -24, false, false);
        }
        if (arg2 == 1) {
            int var4 = arg1.method1740((byte) 74);
            this.field4749 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4749[var5] = arg1.method1740((byte) 46);
            }
            this.field4740 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4740[var6] = arg1.method1740((byte) 72);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4740[var7] = (arg1.method1740((byte) 74) << 16) + this.field4740[var7];
            }
        } else if (arg2 == 2) {
            this.field4771 = arg1.method1740((byte) 75);
        } else if (arg2 == 3) {
            int var15 = arg1.method1693((byte) 117);
            this.field4747 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4747[var16] = arg1.method1693((byte) 54);
            }
            this.field4747[var15] = 9999999;
        } else if (arg2 == 4) {
            this.field4764 = true;
        } else if (arg2 == 5) {
            this.field4742 = arg1.method1693((byte) -102);
        } else if (arg2 == 6) {
            this.field4756 = arg1.method1740((byte) 64);
        } else if (arg2 == 7) {
            this.field4745 = arg1.method1740((byte) 57);
        } else if (arg2 == 8) {
            this.field4760 = arg1.method1693((byte) -123);
        } else if (arg2 == 9) {
            this.field4772 = arg1.method1693((byte) -103);
        } else if (arg2 == 10) {
            this.field4748 = arg1.method1693((byte) -119);
        } else if (arg2 == 11) {
            this.field4746 = arg1.method1693((byte) 96);
        } else if (arg2 == 12) {
            int var8 = arg1.method1693((byte) -109);
            this.field4767 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4767[var9] = arg1.method1740((byte) 59);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4767[var10] = (arg1.method1740((byte) 83) << 16) + this.field4767[var10];
            }
        } else if (arg2 == 13) {
            int var11 = arg1.method1740((byte) 83);
            this.field4752 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method1693((byte) 72);
                if (var13 > 0) {
                    this.field4752[var12] = new int[var13];
                    this.field4752[var12][0] = arg1.method1747(false);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4752[var12][var14] = arg1.method1740((byte) 117);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4743 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1785(int arg0) {
        field4762 = null;
        if (arg0 == -12) {
            field4754 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public final void method1786(int arg0) {
        if (this.field4748 == -1) {
            if (this.field4747 == null) {
                this.field4748 = 0;
            } else {
                this.field4748 = 2;
            }
        }
        field4751++;
        if (this.field4772 == -1) {
            if (this.field4747 == null) {
                this.field4772 = 0;
            } else {
                this.field4772 = 2;
            }
        }
        if (arg0 != 2) {
            this.method1792(-98, (class195) null, -92);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILcl;II)Lcl;")
    public final class195 method1787(int arg0, class195 arg1, int arg2, int arg3) {
        field4769++;
        int var5 = this.field4740[arg0];
        class39 var6 = class82.method564(0, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method230(true, true);
        }
        class195 var8 = arg1.method230(!var6.method305(124, var7), !this.field4743);
        int var9 = arg2 & 0x3;
        if (var9 == 1) {
            var8.method229();
        } else if (var9 == 2) {
            var8.method204();
        } else if (var9 == 3) {
            var8.method217();
        }
        var8.method228(var6, var7, this.field4743);
        if (var9 == 1) {
            var8.method217();
        } else if (var9 == 2) {
            var8.method204();
        } else if (var9 == 3) {
            var8.method229();
        }
        int var10 = -48 % ((arg3 + 43) / 61);
        return var8;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field4768++;
        if (arg2 > arg1) {
            int var7 = (arg1 + arg2) / 2;
            int var8 = arg1;
            class144 var9 = class106.field1776[var7];
            class106.field1776[var7] = class106.field1776[arg2];
            class106.field1776[arg2] = var9;
            for (int var10 = arg1; var10 < arg2; var10++) {
                if (method1791(arg0, class106.field1776[var10], 27346, var9, arg4, arg5, arg6) <= 0) {
                    class144 var11 = class106.field1776[var10];
                    class106.field1776[var10] = class106.field1776[var8];
                    class106.field1776[var8++] = var11;
                }
            }
            class106.field1776[arg2] = class106.field1776[var8];
            class106.field1776[var8] = var9;
            method1788(arg0, arg1, var8 - 1, -128, arg4, arg5, arg6);
            method1788(arg0, var8 + 1, arg2, -121, arg4, arg5, arg6);
        }
        if (arg3 >= -116) {
            field4753 = 114;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjb;IILcl;)Lcl;")
    public final class195 method1789(int arg0, class270 arg1, int arg2, int arg3, class195 arg4) {
        if (arg0 != -10976) {
            return null;
        }
        field4744++;
        int var6 = this.field4740[arg3];
        class39 var7 = class82.method564(0, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1780(arg2, arg4, true);
        }
        int var9 = arg1.field4740[arg2];
        class39 var10 = class82.method564(arg0 + 10976, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class195 var12 = arg4.method230(!var7.method305(4, var8), !this.field4743);
            var12.method228(var7, var8, this.field4743);
            return var12;
        } else {
            class195 var13 = arg4.method230(!var7.method305(18, var8) & !var10.method305(64, var11), !this.field4743 & !arg1.field4743);
            var13.method227(var7, var8, var10, var11, this.field4747, arg1.field4743 | this.field4743);
            return var13;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lcl;II)Lcl;")
    public final class195 method1790(class195 arg0, int arg1, int arg2) {
        int var4 = -4 % ((-arg1 - 45) / 33);
        int var5 = this.field4740[arg2];
        field4765++;
        class39 var6 = class82.method564(0, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method230(true, true);
        }
        int var8 = 0;
        class39 var9 = null;
        if (this.field4767 != null && this.field4767.length > arg2) {
            int var10 = this.field4767[arg2];
            var9 = class82.method564(0, var10 >> 16);
            var8 = var10 & 0xFFFF;
        }
        if (var9 == null || var8 == 65535) {
            class195 var12 = arg0.method230(!var6.method305(-123, var7), !this.field4743);
            var12.method228(var6, var7, this.field4743);
            return var12;
        } else {
            class195 var11 = arg0.method230(!var6.method305(107, var7) & !var9.method305(88, var8), !this.field4743);
            var11.method228(var6, var7, this.field4743);
            var11.method228(var9, var8, this.field4743);
            return var11;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILw;ILw;IZZ)I")
    private static final int method1791(int arg0, class144 arg1, int arg2, class144 arg3, int arg4, boolean arg5, boolean arg6) {
        int var7 = class77.method541(arg1, arg3, true, arg6, arg4);
        field4757++;
        if (var7 == 0) {
            if (arg2 != 27346) {
                method1788(-106, 91, -99, -117, 56, false, false);
            }
            if (arg0 == -1) {
                return 0;
            } else {
                int var8 = class77.method541(arg1, arg3, true, arg5, arg0);
                return arg5 ? -var8 : var8;
            }
        } else if (arg6) {
            return -var7;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILcl;I)Lcl;")
    public final class195 method1792(int arg0, class195 arg1, int arg2) {
        int var4 = this.field4740[arg0];
        field4766++;
        if (arg2 != -30734) {
            this.field4747 = null;
        }
        class39 var5 = class82.method564(0, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method211(true, true);
        } else {
            class195 var7 = arg1.method211(!var5.method305(-122, var6), !this.field4743);
            var7.method228(var5, var6, this.field4743);
            return var7;
        }
    }
}
