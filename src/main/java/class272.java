import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class272 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field4748 = -1;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Z")
    public boolean field4755 = false;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field4758 = 5;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public int field4765 = -1;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Z")
    private boolean field4766 = false;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4750 = 99;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public int field4754 = -1;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public int field4767 = -1;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field4749 = -1;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public int field4773 = 2;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4747 = 0;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field4775 = 0;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lhe;")
    public static class94 field4753 = new class94(100);

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "Lca;")
    public static class98 field4776 = null;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "Z")
    public static boolean field4777 = true;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lhm;")
    public static class20 field4751;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    private int[] field4757;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[I")
    public int[] field4764;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "[I")
    private int[] field4772;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "[I")
    public int[] field4774;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "[[I")
    public int[][] field4763;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBILke;)Lke;", line = 11)
    public final class113 method1960(int arg0, byte arg1, int arg2, class113 arg3) {
        int var5 = this.field4774[arg0];
        class284 var6 = class291.method2083(var5 >> 16, -44);
        if (arg1 != -109) {
            field4776 = (class98) null;
        }
        int var7 = var5 & 0xFFFF;
        field4762++;
        if (var6 == null) {
            return arg3.method313(true, true);
        }
        int var8 = arg2 & 0x3;
        class113 var9 = arg3.method313(!var6.method2039(var7, (byte) 108), !this.field4766);
        if (var8 == 1) {
            var9.method299();
        } else if (var8 == 2) {
            var9.method297();
        } else if (var8 == 3) {
            var9.method316();
        }
        var9.method284(var6, var7, this.field4766);
        if (var8 == 1) {
            var9.method316();
        } else if (var8 == 2) {
            var9.method297();
        } else if (var8 == 3) {
            var9.method299();
        }
        return var9;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lrm;I)V", line = 60)
    public final void method1961(class249 arg0, int arg1) {
        if (arg1 <= 84) {
            method1970((class262) null, (class262) null, 109);
        }
        field4752++;
        while (true) {
            int var3 = arg0.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method1964((byte) -83, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)I", line = 84)
    public static final int method1962(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field4771++;
        if (arg2 == var4) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 108)
    public static void method1963(byte arg0) {
        field4753 = null;
        field4776 = null;
        if (arg0 < 3) {
            method1963((byte) -119);
        }
        field4751 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BILrm;)V", line = 124)
    private final void method1964(byte arg0, int arg1, class249 arg2) {
        field4760++;
        if (arg1 == 1) {
            int var4 = arg2.method1712(-1);
            this.field4764 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4764[var5] = arg2.method1712(-1);
            }
            this.field4774 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4774[var6] = arg2.method1712(-1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4774[var7] = (arg2.method1712(-1) << 16) + this.field4774[var7];
            }
        } else if (arg1 == 2) {
            this.field4765 = arg2.method1712(-1);
        } else if (arg1 == 3) {
            int var8 = arg2.method1731(true);
            this.field4757 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4757[var9] = arg2.method1731(true);
            }
            this.field4757[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field4755 = true;
        } else if (arg1 == 5) {
            this.field4758 = arg2.method1731(true);
        } else if (arg1 == 6) {
            this.field4767 = arg2.method1712(-1);
        } else if (arg1 == 7) {
            this.field4754 = arg2.method1712(-1);
        } else if (arg1 == 8) {
            this.field4750 = arg2.method1731(true);
        } else if (arg1 == 9) {
            this.field4749 = arg2.method1731(true);
        } else if (arg1 == 10) {
            this.field4748 = arg2.method1731(true);
        } else if (arg1 == 11) {
            this.field4773 = arg2.method1731(true);
        } else if (arg1 == 12) {
            int var14 = arg2.method1731(true);
            this.field4772 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4772[var15] = arg2.method1712(-1);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4772[var16] += arg2.method1712(-1) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method1712(-1);
            this.field4763 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg2.method1731(true);
                if (var12 > 0) {
                    this.field4763[var11] = new int[var12];
                    this.field4763[var11][0] = arg2.method1749(false);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4763[var11][var13] = arg2.method1712(-1);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field4766 = true;
        }
        if (arg0 >= -33) {
            this.field4764 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lke;II)Lke;", line = 287)
    public final class113 method1965(class113 arg0, int arg1, int arg2) {
        field4769++;
        int var4 = this.field4774[arg2];
        class284 var5 = class291.method2083(var4 >> 16, -69);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method313(true, true);
        }
        class284 var7 = null;
        int var8 = 0;
        if (this.field4772 != null && this.field4772.length > arg2) {
            int var9 = this.field4772[arg2];
            var7 = class291.method2083(var9 >> 16, -95);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class113 var11 = arg0.method313(!var5.method2039(var6, (byte) -122), !this.field4766);
            var11.method284(var5, var6, this.field4766);
            return var11;
        }
        class113 var10 = arg0.method313(!var5.method2039(var6, (byte) -77) & !var7.method2039(var8, (byte) -41), !this.field4766);
        var10.method284(var5, var6, this.field4766);
        var10.method284(var7, var8, this.field4766);
        if (arg1 != -14500) {
            this.field4774 = (int[]) null;
        }
        return var10;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBLke;)Lke;", line = 353)
    public final class113 method1966(int arg0, byte arg1, class113 arg2) {
        int var4 = this.field4774[arg0];
        class284 var5 = class291.method2083(var4 >> 16, -86);
        int var6 = -96 % ((arg1 - 14) / 50);
        int var7 = var4 & 0xFFFF;
        field4746++;
        if (var5 == null) {
            return arg2.method288(true, true);
        } else {
            class113 var8 = arg2.method288(!var5.method2039(var7, (byte) 99), !this.field4766);
            var8.method284(var5, var7, this.field4766);
            return var8;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 373)
    public final void method1967(byte arg0) {
        field4756++;
        if (arg0 != 59) {
            this.field4757 = (int[]) null;
        }
        if (this.field4748 == -1) {
            if (this.field4757 == null) {
                this.field4748 = 0;
            } else {
                this.field4748 = 2;
            }
        }
        if (this.field4749 != -1) {
            return;
        }
        if (this.field4757 == null) {
            this.field4749 = 0;
        } else {
            this.field4749 = 2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lke;ZI)Lke;", line = 406)
    public final class113 method1968(class113 arg0, boolean arg1, int arg2) {
        int var4 = this.field4774[arg2];
        class284 var5 = class291.method2083(var4 >> 16, -102);
        if (arg1) {
            field4753 = (class94) null;
        }
        field4761++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method313(true, true);
        } else {
            class113 var7 = arg0.method313(!var5.method2039(var6, (byte) -124), !this.field4766);
            var7.method284(var5, var6, this.field4766);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLjh;ILke;)Lke;", line = 428)
    public final class113 method1969(int arg0, boolean arg1, class272 arg2, int arg3, class113 arg4) {
        field4768++;
        int var6 = this.field4774[arg0];
        class284 var7 = class291.method2083(var6 >> 16, -78);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1968(arg4, !arg1, arg3);
        }
        int var9 = arg2.field4774[arg3];
        class284 var10 = class291.method2083(var9 >> 16, -20);
        if (!arg1) {
            field4775 = 62;
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class113 var12 = arg4.method313(!var7.method2039(var8, (byte) 123), !this.field4766);
            var12.method284(var7, var8, this.field4766);
            return var12;
        } else {
            class113 var13 = arg4.method313(!var7.method2039(var8, (byte) -127) & !var10.method2039(var11, (byte) 111), !arg2.field4766 & !this.field4766);
            var13.method286(var7, var8, var10, var11, this.field4757, arg2.field4766 | this.field4766);
            return var13;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lik;Lik;I)V", line = 460)
    public static final void method1970(class262 arg0, class262 arg1, int arg2) {
        class3.field49 = arg1;
        field4759++;
        int var3 = 38 % ((43 - arg2) / 35);
        class233.field4123 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIIII)V", line = 471)
    public static final void method1971(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4770++;
        int var6 = class174.method1236(class266.field4677, arg5, class166.field2984, -6219);
        int var7 = class174.method1236(class266.field4677, arg1, class166.field2984, -6219);
        if (!arg0) {
            field4776 = (class98) null;
        }
        int var8 = class174.method1236(class260.field4593, arg2, class79.field1202, -6219);
        int var9 = class174.method1236(class260.field4593, arg4, class79.field1202, -6219);
        for (int var10 = var6; var10 <= var7; var10++) {
            class209.method1452(var9, class106.field1839[var10], 7, var8, arg3);
        }
    }
}
