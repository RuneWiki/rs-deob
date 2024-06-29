import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class268 {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    private int field4771 = 0;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Z")
    public boolean field4779 = false;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Z")
    public boolean field4768 = false;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field4783 = -1;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lid;")
    public class149 field4780 = class16.field226;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field4764 = 128;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public int field4770 = -1;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field4765 = 0;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public int field4796 = -1;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
    public boolean field4797 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field4776 = -1;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "Z")
    public boolean field4801 = true;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    private int field4812 = 128;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    private int field4794 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    private int field4782 = 0;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public int field4803 = 0;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public int field4813 = -1;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    private int field4816 = 128;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public int field4772 = -1;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "B")
    private byte field4807 = 0;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field4800 = 0;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Z")
    public boolean field4804 = false;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Z")
    public boolean field4817 = false;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
    public boolean field4786 = false;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "Z")
    public boolean field4799 = true;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field4787 = 1;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public int field4806 = -1;

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "Z")
    public boolean field4822 = true;

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "[Lid;")
    public class149[] field4825 = new class149[5];

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "Z")
    private boolean field4824 = false;

    @OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
    public int field4830 = 0;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public int field4793 = -1;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    public int field4819 = -1;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Z")
    private boolean field4798 = false;

    @OriginalMember(owner = "client!jb", name = "rb", descriptor = "Z")
    public boolean field4832 = false;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public int field4814 = 16;

    @OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
    private int field4828 = 0;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public int field4820 = 1;

    @OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
    private int field4826 = -1;

    @OriginalMember(owner = "client!jb", name = "tb", descriptor = "I")
    public int field4834 = 0;

    @OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
    public int field4837 = -1;

    @OriginalMember(owner = "client!jb", name = "xb", descriptor = "I")
    private int field4838 = -1;

    @OriginalMember(owner = "client!jb", name = "qb", descriptor = "I")
    public int field4831 = 2;

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "I")
    public int field4823 = 0;

    @OriginalMember(owner = "client!jb", name = "ub", descriptor = "Z")
    public boolean field4835 = false;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "S")
    private short field4809 = -1;

    @OriginalMember(owner = "client!jb", name = "zb", descriptor = "Z")
    public boolean field4840 = true;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Lid;")
    public static class149 field4818 = class60.method382("Bitte entfernen Sie ", (byte) 121);

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field4815 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!jb", name = "ob", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!jb", name = "vb", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lnc;")
    private class85 field4785;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "[B")
    private byte[] field4791;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    public int[] field4767;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[I")
    private int[] field4808;

    @OriginalMember(owner = "client!jb", name = "mb", descriptor = "[I")
    public int[] field4827;

    @OriginalMember(owner = "client!jb", name = "yb", descriptor = "[I")
    private int[] field4839;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "[Lid;")
    public static class149[] field4802;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[S")
    private short[] field4775;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[S")
    private short[] field4788;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "[S")
    private short[] field4792;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "[S")
    private short[] field4821;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Z")
    public final boolean method1855(byte arg0) {
        field4781++;
        if (this.field4767 == null) {
            return this.field4793 != -1 || this.field4827 != null;
        }
        if (arg0 != -95) {
            this.field4799 = true;
        }
        for (int var2 = 0; var2 < this.field4767.length; var2++) {
            if (this.field4767[var2] != -1) {
                class268 var3 = class108.method755(11525, this.field4767[var2]);
                if (var3.field4793 != -1 || var3.field4827 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIZIIZI)Lvc;")
    public static final class190 method1856(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class261 var8 = class226.method1516(arg0, -28322);
        field4810++;
        if (arg2 > 1 && var8.field4632 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4610[var10] <= arg2 && var8.field4610[var10] != 0) {
                    var9 = var8.field4632[var10];
                }
            }
            if (var9 != -1) {
                var8 = class226.method1516(var9, -28322);
            }
        }
        class121 var11 = var8.method1801((byte) -72);
        if (var11 == null) {
            return null;
        }
        class46 var12 = null;
        if (var8.field4607 != -1) {
            var12 = (class46) method1856(var8.field4597, true, 10, true, 97, 1, false, 0);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4621 != -1) {
            var12 = (class46) method1856(var8.field4626, true, arg2, false, 120, arg5, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class72.field1250;
        int[] var14 = class72.field1254;
        int[] var15 = new int[4];
        int var16 = class72.field1256;
        class72.method456(var15);
        class46 var17 = new class46(36, 32);
        class72.method460(var17.field693, 36, 32);
        class235.method1584();
        class235.method1595(16, 16);
        int var18 = var8.field4643;
        if (arg4 <= 94) {
            field4815 = -100;
        }
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg5 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class235.field4112 = false;
        int var19 = class235.field4118[var8.field4631] * var18 >> 16;
        int var20 = class235.field4123[var8.field4631] * var18 >> 16;
        var11.method859(0, var8.field4627, var8.field4598, var8.field4631, var8.field4606, var8.field4602 + var20 - (var11.method53() / 2), var19 - -var8.field4602, -1L);
        if (arg5 >= 1) {
            var17.method272(1);
            if (arg5 >= 2) {
                var17.method272(16777215);
            }
            class72.method460(var17.field693, 36, 32);
        }
        if (arg7 != 0) {
            var17.method273(arg7);
        }
        if (var8.field4607 != -1) {
            var12.method263(0, 0);
        } else if (var8.field4621 != -1) {
            class72.method460(var12.field693, 36, 32);
            var17.method263(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field4645 == 1 || arg2 != 1) && arg2 != -1) {
            class170.field3148.method1168(class255.method1754(92, arg2), 0, 9, 16776960, 1);
        }
        class72.method460(var14, var13, var16);
        class72.method453(var15);
        class235.method1584();
        class235.field4112 = true;
        return var17;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([[IIIIZB[[ILch;IIZ)Lwj;")
    public final class6 method1857(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int[][] arg6, class282 arg7, int arg8, int arg9, boolean arg10) {
        field4766++;
        if (arg5 >= -38) {
            return null;
        }
        long var12;
        if (this.field4808 == null) {
            var12 = (long) ((this.field4773 << 10) + arg2);
        } else {
            var12 = (long) ((this.field4773 << 10) + (arg1 << 3) + arg2);
        }
        boolean var14;
        if (arg4 && this.field4798) {
            var12 |= Long.MIN_VALUE;
            var14 = true;
        } else {
            var14 = false;
        }
        class199 var15 = (class199) class102.field1796.method1293(var12, false);
        if (var15 == null) {
            class241 var16 = this.method1859(arg1, -30, arg2);
            if (var16 == null) {
                class276.field4933.field71 = null;
                return class276.field4933;
            }
            var16.method1669();
            if (arg1 == 10 && arg2 > 3) {
                var16.method1673(256);
            }
            if (var14) {
                var15 = var16;
                var16.field4209 = (short) (this.field4771 + 64);
                var16.field4206 = (short) (this.field4800 * 5 + 768);
                var16.method1663();
            } else {
                var15 = new class121(var16, this.field4771 + 64, this.field4800 * 5 + 768, -50, -10, -50);
            }
            class102.field1796.method1295(var12, var15, (byte) -71);
        }
        if (var14) {
            var15 = ((class241) var15).method1667();
        }
        if (this.field4807 != 0) {
            if ((var15 instanceof class121)) {
                var15 = ((class121) var15).method831(this.field4807, this.field4809, arg6, arg0, arg9, arg3, arg8, true);
            } else if (var15 instanceof class241) {
                var15 = ((class241) var15).method1660(this.field4807, this.field4809, arg6, arg0, arg9, arg3, arg8, true, false);
            }
        }
        class276.field4933.field71 = var15;
        return class276.field4933;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgd;IZ)V")
    private final void method1858(class74 arg0, int arg1, boolean arg2) {
        field4777++;
        if (arg1 == 1) {
            int var23 = arg0.method489((byte) -114);
            if (var23 > 0) {
                if (this.field4839 == null || class279.field4985) {
                    this.field4839 = new int[var23];
                    this.field4808 = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        this.field4839[var24] = arg0.method485(-2386);
                        this.field4808[var24] = arg0.method489((byte) -121);
                    }
                } else {
                    arg0.field1340 += var23 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field4780 = arg0.method529(-1);
        } else if (arg1 == 5) {
            int var21 = arg0.method489((byte) -117);
            if (var21 > 0) {
                if (this.field4839 == null || class279.field4985) {
                    this.field4808 = null;
                    this.field4839 = new int[var21];
                    for (int var22 = 0; var22 < var21; var22++) {
                        this.field4839[var22] = arg0.method485(-2386);
                    }
                } else {
                    arg0.field1340 += var21 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field4820 = arg0.method489((byte) -125);
        } else if (arg1 == 15) {
            this.field4787 = arg0.method489((byte) -69);
        } else if (arg1 == 17) {
            this.field4831 = 0;
            this.field4801 = false;
        } else if (arg1 == 18) {
            this.field4801 = false;
        } else if (arg1 == 19) {
            this.field4806 = arg0.method489((byte) 122);
        } else if (arg1 == 21) {
            this.field4807 = 1;
        } else if (arg1 == 22) {
            this.field4798 = true;
        } else if (arg1 == 23) {
            this.field4786 = true;
        } else if (arg1 == 24) {
            this.field4796 = arg0.method485(-2386);
            if (this.field4796 == 65535) {
                this.field4796 = -1;
            }
        } else if (arg1 == 27) {
            this.field4831 = 1;
        } else if (arg1 == 28) {
            this.field4814 = arg0.method489((byte) 123);
        } else if (arg1 == 29) {
            this.field4771 = arg0.method514((byte) 1);
        } else if (arg1 == 39) {
            this.field4800 = arg0.method514((byte) 1) * 5;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field4825[arg1 - 30] = arg0.method529(-1);
            if (this.field4825[arg1 - 30].method1048(-98, class183.field3300)) {
                this.field4825[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var4 = arg0.method489((byte) 120);
            this.field4821 = new short[var4];
            this.field4792 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4792[var5] = (short) arg0.method485(-2386);
                this.field4821[var5] = (short) arg0.method485(-2386);
            }
        } else if (arg1 == 41) {
            int var19 = arg0.method489((byte) -19);
            this.field4775 = new short[var19];
            this.field4788 = new short[var19];
            for (int var20 = 0; var20 < var19; var20++) {
                this.field4775[var20] = (short) arg0.method485(-2386);
                this.field4788[var20] = (short) arg0.method485(-2386);
            }
        } else if (arg1 == 42) {
            int var6 = arg0.method489((byte) 123);
            this.field4791 = new byte[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4791[var7] = arg0.method514((byte) 1);
            }
        } else if (arg1 == 60) {
            this.field4772 = arg0.method485(-2386);
        } else if (arg1 == 62) {
            this.field4824 = true;
        } else if (arg1 == 64) {
            this.field4840 = false;
        } else if (arg1 == 65) {
            this.field4764 = arg0.method485(-2386);
        } else if (arg1 == 66) {
            this.field4816 = arg0.method485(-2386);
        } else if (arg1 == 67) {
            this.field4812 = arg0.method485(-2386);
        } else if (arg1 == 69) {
            this.field4834 = arg0.method489((byte) -18);
        } else if (arg1 == 70) {
            this.field4794 = arg0.method526((byte) 108);
        } else if (arg1 == 71) {
            this.field4828 = arg0.method526((byte) 81);
        } else if (arg1 == 72) {
            this.field4782 = arg0.method526((byte) 89);
        } else if (arg1 == 73) {
            this.field4779 = true;
        } else if (arg1 == 74) {
            this.field4768 = true;
        } else if (arg1 == 75) {
            this.field4776 = arg0.method489((byte) -28);
        } else if (arg1 == 77 || arg1 == 92) {
            this.field4838 = arg0.method485(-2386);
            if (this.field4838 == 65535) {
                this.field4838 = -1;
            }
            int var16 = -1;
            this.field4826 = arg0.method485(-2386);
            if (this.field4826 == 65535) {
                this.field4826 = -1;
            }
            if (arg1 == 92) {
                var16 = arg0.method485(-2386);
                if (var16 == 65535) {
                    var16 = -1;
                }
            }
            int var17 = arg0.method489((byte) 91);
            this.field4767 = new int[var17 + 2];
            for (int var18 = 0; var18 <= var17; var18++) {
                this.field4767[var18] = arg0.method485(-2386);
                if (this.field4767[var18] == 65535) {
                    this.field4767[var18] = -1;
                }
            }
            this.field4767[var17 + 1] = var16;
        } else if (arg1 == 78) {
            this.field4793 = arg0.method485(-2386);
            this.field4830 = arg0.method489((byte) -96);
        } else if (arg1 == 79) {
            this.field4765 = arg0.method485(-2386);
            this.field4823 = arg0.method485(-2386);
            this.field4830 = arg0.method489((byte) 116);
            int var14 = arg0.method489((byte) 83);
            this.field4827 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4827[var15] = arg0.method485(-2386);
            }
        } else if (arg1 == 81) {
            this.field4807 = 2;
            this.field4809 = (short) (arg0.method489((byte) -115) * 256);
        } else if (arg1 != 82) {
            if (arg1 == 88) {
                this.field4822 = false;
            } else if (arg1 == 89) {
                this.field4799 = false;
            } else if (arg1 == 90) {
                this.field4804 = true;
            } else if (arg1 == 91) {
                this.field4832 = true;
            } else if (arg1 == 93) {
                this.field4807 = 3;
                this.field4809 = (short) arg0.method485(-2386);
            } else if (arg1 == 94) {
                this.field4807 = 4;
            } else if (arg1 == 95) {
                this.field4807 = 5;
            } else if (arg1 == 96) {
                this.field4797 = true;
            } else if (arg1 == 97) {
                this.field4835 = true;
            } else if (arg1 == 98) {
                this.field4817 = true;
            } else if (arg1 == 99) {
                this.field4813 = arg0.method489((byte) -81);
                this.field4783 = arg0.method485(-2386);
            } else if (arg1 == 100) {
                this.field4819 = arg0.method489((byte) -97);
                this.field4770 = arg0.method485(-2386);
            } else if (arg1 == 101) {
                this.field4803 = arg0.method489((byte) 112);
            } else if (arg1 == 102) {
                this.field4837 = arg0.method485(-2386);
            } else if (arg1 == 249) {
                int var8 = arg0.method489((byte) -59);
                if (this.field4785 == null) {
                    int var9 = class5.method30(116, var8);
                    this.field4785 = new class85(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method489((byte) 98) == 1;
                    int var12 = arg0.method525(65280);
                    class64 var13;
                    if (var11) {
                        var13 = new class15(arg0.method529(-1));
                    } else {
                        var13 = new class143(arg0.method498((byte) 127));
                    }
                    this.field4785.method638((byte) -89, var13, (long) var12);
                }
            }
        }
        if (arg2) {
            this.field4768 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Lcb;")
    private final class241 method1859(int arg0, int arg1, int arg2) {
        field4805++;
        boolean var4 = this.field4824;
        if (arg0 == 2 && arg2 > 3) {
            var4 = !var4;
        }
        class241 var5 = null;
        if (this.field4808 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field4839 == null) {
                return null;
            }
            int var9 = this.field4839.length;
            for (int var10 = 0; var10 < var9; var10++) {
                int var17 = this.field4839[var10];
                if (var4) {
                    var17 += 65536;
                }
                var5 = (class241) class25.field373.method1293((long) var17, false);
                if (var5 == null) {
                    var5 = class241.method1661(class259.field4555, var17 & 0xFFFF, 0);
                    if (var5 == null) {
                        return null;
                    }
                    if (var4) {
                        var5.method1662();
                    }
                    class25.field373.method1295((long) var17, var5, (byte) -71);
                }
                if (var9 > 1) {
                    class206.field3700[var10] = var5;
                }
            }
            if (var9 > 1) {
                var5 = new class241(class206.field3700, var9);
            }
        } else {
            int var6 = -1;
            for (int var7 = 0; var7 < this.field4808.length; var7++) {
                if (this.field4808[var7] == arg0) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == -1) {
                return null;
            }
            int var8 = this.field4839[var6];
            if (var4) {
                var8 += 65536;
            }
            var5 = (class241) class25.field373.method1293((long) var8, false);
            if (var5 == null) {
                var5 = class241.method1661(class259.field4555, var8 & 0xFFFF, 0);
                if (var5 == null) {
                    return null;
                }
                if (var4) {
                    var5.method1662();
                }
                class25.field373.method1295((long) var8, var5, (byte) -71);
            }
        }
        boolean var11;
        if (this.field4764 == 128 && this.field4816 == 128 && this.field4812 == 128) {
            var11 = false;
        } else {
            var11 = true;
        }
        boolean var12;
        if (this.field4794 == 0 && this.field4828 == 0 && this.field4782 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }
        class241 var13 = new class241(var5, arg2 == 0 && !var11 && !var12, this.field4792 == null, this.field4775 == null, true);
        if (arg0 == 4 && arg2 > 3) {
            var13.method1673(256);
            var13.method1679(45, 0, -45);
        }
        if (arg1 != -30) {
            return null;
        }
        int var14 = arg2 & 0x3;
        if (var14 == 1) {
            var13.method1659();
        } else if (var14 == 2) {
            var13.method1666();
        } else if (var14 == 3) {
            var13.method1670();
        }
        if (this.field4792 != null) {
            for (int var15 = 0; var15 < this.field4792.length; var15++) {
                if (this.field4791 == null || this.field4791.length <= var15) {
                    var13.method1677(this.field4792[var15], this.field4821[var15]);
                } else {
                    var13.method1677(this.field4792[var15], class109.field1888[this.field4791[var15] & 0xFF]);
                }
            }
        }
        if (this.field4775 != null) {
            for (int var16 = 0; var16 < this.field4775.length; var16++) {
                var13.method1672(this.field4775[var16], this.field4788[var16]);
            }
        }
        if (var11) {
            var13.method1657(this.field4764, this.field4816, this.field4812);
        }
        if (var12) {
            var13.method1679(this.field4794, this.field4828, this.field4782);
        }
        return var13;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4802 = null;
        if (arg0 > -1) {
            field4815 = -67;
        }
        field4818 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
    public final boolean method1861(byte arg0) {
        field4774++;
        if (this.field4839 == null) {
            return true;
        }
        if (arg0 != -20) {
            this.method1857((int[][]) null, 123, -50, -20, true, (byte) -88, (int[][]) null, (class282) null, 4, 108, true);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4839.length; var3++) {
            var2 &= class259.field4555.method1541(true, this.field4839[var3] & 0xFFFF, 0);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Z")
    public final boolean method1862(int arg0, int arg1) {
        if (arg0 != -30880) {
            this.method1861((byte) -23);
        }
        field4763++;
        if (this.field4808 != null) {
            for (int var5 = 0; var5 < this.field4808.length; var5++) {
                if (this.field4808[var5] == arg1) {
                    return class259.field4555.method1541(true, this.field4839[var5] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field4839 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field4839.length; var4++) {
                var3 &= class259.field4555.method1541(true, this.field4839[var4] & 0xFFFF, 0);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)Ljb;")
    public final class268 method1863(byte arg0) {
        field4833++;
        int var2 = -1;
        if (this.field4838 != -1) {
            var2 = class32.method192(22255, this.field4838);
        } else if (this.field4826 != -1) {
            var2 = class115.field1953[this.field4826];
        }
        if (var2 < 0 || (this.field4767.length - 1) <= var2 || this.field4767[var2] == -1) {
            int var3 = this.field4767[this.field4767.length - 1];
            return var3 == -1 ? null : class108.method755(11525, var3);
        } else {
            if (arg0 != -84) {
                method1869(2);
            }
            return class108.method755(arg0 ^ 0xFFFFD2A9, this.field4767[var2]);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII[[IIZIBLch;[[ILek;)Lwj;")
    public final class6 method1864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[][] arg6, int arg7, boolean arg8, int arg9, byte arg10, class282 arg11, int[][] arg12, class164 arg13) {
        field4829++;
        int var15 = 104 / ((arg10 + 59) / 60);
        long var16;
        if (this.field4808 == null) {
            var16 = (long) ((this.field4773 << 10) + arg7);
        } else {
            var16 = (long) ((arg1 << 3) + (this.field4773 << 10) + arg7);
        }
        class121 var18 = (class121) class279.field4981.method1293(var16, false);
        if (var18 == null) {
            class241 var19 = this.method1859(arg1, -30, arg7);
            if (var19 == null) {
                return null;
            }
            var18 = new class121(var19, this.field4771 + 64, this.field4800 * 5 + 768, -50, -10, -50);
            class279.field4981.method1295(var16, var18, (byte) -71);
        }
        boolean var20 = false;
        if (arg13 != null) {
            var18 = (class121) arg13.method1199(arg9, arg7, var18, arg3, arg2, false);
            var20 = true;
        }
        if (arg1 == 10 && arg7 > 3) {
            if (!var20) {
                var18 = (class121) var18.method843(true, true, true);
                var20 = true;
            }
            var18.method835(256);
        }
        if (this.field4807 != 0) {
            if (!var20) {
                boolean var21 = true;
                var18 = (class121) var18.method843(true, true, true);
            }
            var18 = var18.method831(this.field4807, this.field4809, arg6, arg12, arg5, arg0, arg4, false);
        }
        class276.field4933.field71 = var18;
        return class276.field4933;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII)I")
    public final int method1865(boolean arg0, int arg1, int arg2) {
        field4790++;
        if (this.field4785 == null) {
            return arg1;
        }
        class143 var4 = (class143) this.field4785.method639((byte) -70, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0) {
                this.field4772 = -15;
            }
            return var4.field2606;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public final void method1866(int arg0) {
        if (this.field4806 == -1) {
            this.field4806 = 0;
            if (this.field4839 != null && (this.field4808 == null || this.field4808[0] == 10)) {
                this.field4806 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field4825[var2] != null) {
                    this.field4806 = 1;
                    break;
                }
            }
        }
        field4836++;
        if (arg0 < 108) {
            this.field4837 = -102;
        }
        if (this.field4776 == -1) {
            this.field4776 = this.field4831 == 0 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgd;I)V")
    public final void method1867(class74 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method489((byte) -101);
            if (var3 == 0) {
                field4789++;
                if (arg1 != 7423) {
                    this.field4832 = true;
                    return;
                }
                return;
            }
            this.method1858(arg0, var3, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLid;I)Lid;")
    public final class149 method1868(byte arg0, class149 arg1, int arg2) {
        field4769++;
        if (this.field4785 == null) {
            return arg1;
        } else {
            class15 var4 = (class15) this.field4785.method639((byte) -52, (long) arg2);
            int var5 = -66 % ((arg0 - 33) / 53);
            return var4 == null ? arg1 : var4.field216;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)I")
    public static final int method1869(int arg0) {
        field4784++;
        try {
            if (~class22.field313 == arg0) {
                if (class81.method608(19644) - 5000L < class278.field4966) {
                    return 0;
                }
                class36.field542 = class272.field4900.method174(class47.field774, false, class75.field1362);
                class171.field3157 = class81.method608(19644);
                class22.field313 = 1;
            }
            if ((class171.field3157 + 30000L) < class81.method608(arg0 ^ 0xFFFFB343)) {
                return class161.method1186(1000, (byte) 116);
            }
            if (class22.field313 == 1) {
                if (class36.field542.field3358 == 2) {
                    return class161.method1186(1001, (byte) 112);
                }
                if (class36.field542.field3358 != 1) {
                    return -1;
                }
                class164.field3047 = new class205((Socket) class36.field542.field3357, class272.field4900);
                class208.field3720.field1340 = 0;
                class36.field542 = null;
                int var1 = 0;
                if (class237.field4149) {
                    var1 = class151.field2756;
                }
                class208.field3720.method494((byte) 4, 255);
                class208.field3720.method517(var1, 124);
                class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 121);
                if (class116.field1991 != null) {
                    class116.field1991.method974(arg0 + 1);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(0);
                }
                int var2 = class164.field3047.method1397(17506);
                if (class116.field1991 != null) {
                    class116.field1991.method974(arg0 + 1);
                }
                if (class79.field1476 != null) {
                    class79.field1476.method974(~arg0);
                }
                if (var2 != 0) {
                    return class161.method1186(var2, (byte) 73);
                }
                class22.field313 = 2;
            }
            if (class22.field313 == 2) {
                if (class164.field3047.method1392(arg0 ^ 0x24) < 2) {
                    return -1;
                }
                class23.field326 = class164.field3047.method1397(17506);
                class23.field326 <<= 0x8;
                class23.field326 += class164.field3047.method1397(17506);
                class184.field3325 = new byte[class23.field326];
                class175.field3210 = 0;
                class22.field313 = 3;
            }
            if (class22.field313 != 3) {
                return -1;
            }
            int var3 = class164.field3047.method1392(-95);
            if (var3 < 1) {
                return -1;
            }
            if (class23.field326 - class175.field3210 < var3) {
                var3 = class23.field326 - class175.field3210;
            }
            class164.field3047.method1395((byte) -115, class184.field3325, class175.field3210, var3);
            class175.field3210 += var3;
            if (class175.field3210 < class23.field326) {
                return -1;
            } else if (class188.method1286(class184.field3325, 1)) {
                class108.field1877 = new class208[class18.field262];
                int var4 = 0;
                for (int var5 = class78.field1461; var5 <= class140.field2551; var5++) {
                    class208 var6 = class255.method1757(var5, -111);
                    if (var6 != null) {
                        class108.field1877[var4++] = var6;
                    }
                }
                class164.field3047.method1398((byte) -86);
                class184.field3325 = null;
                class164.field3047 = null;
                class22.field313 = 0;
                class267.field4753 = 0;
                class278.field4966 = class81.method608(19644);
                return 0;
            } else {
                return class161.method1186(1002, (byte) 126);
            }
        } catch (IOException var7) {
            return class161.method1186(1003, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lgd;Z)Lna;")
    public static final class31 method1870(class74 arg0, boolean arg1) {
        field4811++;
        return arg1 ? null : new class31(arg0.method526((byte) 88), arg0.method526((byte) 112), arg0.method526((byte) 108), arg0.method526((byte) 102), arg0.method525(65280), arg0.method489((byte) 103));
    }
}
