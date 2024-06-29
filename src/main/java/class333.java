import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class333 {

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "Lbj;")
    private class256 field4851 = null;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    private boolean field4821;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Lms;")
    private class792 field4825;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field4852 = 0;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[Ljava/lang/Object;")
    private Object[] field4830;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4819;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public final boolean method2087(int arg0, int arg1) {
        field4827++;
        if (!this.method2121((byte) -13, arg0)) {
            return false;
        } else if (this.field4830[arg0] == null) {
            this.method2097(arg0, -13);
            if (arg1 == 0) {
                return this.field4830[arg0] != null;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Z")
    private final boolean method2088(int arg0) {
        if (arg0 < 31) {
            return true;
        }
        field4838++;
        if (this.field4851 == null) {
            this.field4851 = this.field4825.method1969((byte) 86);
            if (this.field4851 == null) {
                return false;
            }
            this.field4830 = new Object[this.field4851.field3827];
            this.field4819 = new Object[this.field4851.field3827][];
        }
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)I")
    public static final int method2089(int arg0, int arg1) {
        if (arg0 != -2040428310) {
            field4852 = 50;
        }
        field4815++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)I")
    public final int method2090(int arg0, boolean arg1) {
        field4833++;
        if (arg1) {
            this.field4825 = null;
        }
        return this.method2121((byte) -13, arg0) ? this.field4851.field3821[arg0] : 0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
    public static final void method2091(int arg0, int arg1, int arg2) {
        field4841++;
        class16 var3 = class94.method753(17, 13175, (long) arg2);
        var3.method119(-108);
        if (arg0 < -106) {
            var3.field237 = arg1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method2092(String arg0, boolean arg1) {
        field4840++;
        if (!this.method2088(45)) {
            return -1;
        } else if (arg1) {
            return -52;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4851.field3817.method3837(-1, class15.method107(var3, 6));
            return this.method2121((byte) -13, var4) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final void method2093(int arg0) {
        field4843++;
        if (this.field4830 != null) {
            for (int var2 = 0; var2 < this.field4830.length; var2++) {
                this.field4830[var2] = null;
            }
        }
        if (arg0 >= -49) {
            this.method2111(null, null, 122);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
    public final int method2094(byte arg0) {
        if (arg0 != -115) {
            method2089(-78, -8);
        }
        field4824++;
        return this.method2088(47) ? this.field4851.field3821.length : -1;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)[B")
    public final byte[] method2095(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            this.method2104(-16, 85);
        }
        field4835++;
        return this.method2109(arg0, null, arg1, -2);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIZ)V")
    public final void method2096(boolean arg0, int arg1, boolean arg2) {
        if (arg1 <= 21) {
            return;
        }
        field4846++;
        if (!this.method2088(51)) {
            return;
        }
        if (arg0) {
            this.field4851.field3831 = null;
            this.field4851.field3824 = null;
        }
        if (arg2) {
            this.field4851.field3826 = null;
            this.field4851.field3817 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
    private final void method2097(int arg0, int arg1) {
        if (this.field4821) {
            this.field4830[arg0] = this.field4825.method1963(127, arg0);
        } else {
            this.field4830[arg0] = class229.method1498(this.field4825.method1963(125, arg0), false, -137);
        }
        field4832++;
        int var3 = 100 % ((-arg1 - 55) / 36);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2098(byte arg0, String arg1) {
        field4829++;
        if (!this.method2088(107)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4851.field3817.method3837(-1, class15.method107(var3, 6));
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 < 64) {
                this.field4830 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)V")
    private final void method2099(int arg0, int arg1) {
        this.field4825.method1970(arg1 + arg1, arg0);
        field4814++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)I")
    public final int method2100(byte arg0, int arg1) {
        field4849++;
        if (!this.method2088(39)) {
            return -1;
        } else if (arg0 < 68) {
            return 115;
        } else {
            int var3 = this.field4851.field3817.method3837(-1, arg1);
            return this.method2121((byte) -13, var3) ? var3 : -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)Z")
    private final boolean method2101(int arg0, byte arg1, int arg2) {
        field4834++;
        if (!this.method2088(84)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field4851.field3821.length && this.field4851.field3821[arg2] > arg0) {
            if (arg1 != -19) {
                field4852 = 30;
            }
            return true;
        } else if (class697.field9781) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2102(int arg0, String arg1) {
        field4848++;
        if (this.method2088(118)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4851.field3817.method3837(-1, class15.method107(var3, arg0 + 6));
            this.method2099(var4, arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)I")
    public final int method2103(int arg0) {
        field4823++;
        if (!this.method2088(104)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4830.length; var4++) {
            if (this.field4851.field3815[var4] > 0) {
                var2 += 100;
                var3 += this.method2107(var4, true);
            }
        }
        int var5 = 33 % ((arg0 + 64) / 51);
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(II)Z")
    public final boolean method2104(int arg0, int arg1) {
        field4842++;
        if (!this.method2088(94)) {
            return false;
        } else if (this.field4851.field3821.length == 1) {
            return this.method2120(-5241, arg1, 0);
        } else if (!this.method2121((byte) -13, arg1)) {
            return false;
        } else if (this.field4851.field3821[arg1] == 1) {
            return this.method2120(-5241, 0, arg1);
        } else {
            int var3 = 29 / ((arg0 + 36) / 55);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public final boolean method2105(String arg0, byte arg1, String arg2) {
        field4831++;
        if (!this.method2088(81)) {
            return false;
        }
        if (arg1 < 83) {
            this.method2109(80, null, 10, -65);
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4851.field3817.method3837(-1, class15.method107(var4, 6));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field4851.field3831[var6].method3837(-1, class15.method107(var5, 6));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    private final boolean method2106(String arg0, String arg1, byte arg2) {
        field4820++;
        if (!this.method2088(122)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4851.field3817.method3837(arg2 ^ 0x4E, class15.method107(var4, 6));
        if (!this.method2121((byte) -13, var6)) {
            return false;
        }
        if (arg2 != -79) {
            this.method2106(null, null, (byte) 28);
        }
        int var7 = this.field4851.field3831[var6].method3837(-1, class15.method107(var5, 6));
        return this.method2120(-5241, var7, var6);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IZ)I")
    private final int method2107(int arg0, boolean arg1) {
        field4813++;
        if (!this.method2121((byte) -13, arg0)) {
            return 0;
        } else if (arg1) {
            return this.field4830[arg0] == null ? this.field4825.method1966((byte) -34, arg0) : 100;
        } else {
            return 59;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)[I")
    public final int[] method2108(boolean arg0, int arg1) {
        field4826++;
        if (!this.method2121((byte) -13, arg1)) {
            return null;
        }
        int[] var3 = this.field4851.field3834[arg1];
        if (var3 == null) {
            var3 = new int[this.field4851.field3815[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        if (!arg0) {
            this.method2109(-16, null, -39, -21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[III)[B")
    public final byte[] method2109(int arg0, int[] arg1, int arg2, int arg3) {
        field4818++;
        if (!this.method2101(arg0, (byte) -19, arg2)) {
            return null;
        } else if (arg3 == -2) {
            if (this.field4819[arg2] == null || this.field4819[arg2][arg0] == null) {
                boolean var5 = this.method2118(arg2, arg0, (byte) 106, arg1);
                if (!var5) {
                    this.method2097(arg2, arg3 + 32);
                    boolean var6 = this.method2118(arg2, arg0, (byte) 106, arg1);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = class113.method846(this.field4819[arg2][arg0], false, arg3 ^ 0xFFFFFFEE);
            if (this.field4844 == 1) {
                this.field4819[arg2][arg0] = null;
                if (this.field4851.field3821[arg2] == 1) {
                    this.field4819[arg2] = null;
                }
            } else if (this.field4844 == 2) {
                this.field4819[arg2] = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method2110(boolean arg0, String arg1) {
        field4847++;
        if (!this.method2088(59)) {
            return false;
        } else if (arg0) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4851.field3817.method3837(-1, class15.method107(var3, 6));
            return this.method2087(var4, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method2111(String arg0, String arg1, int arg2) {
        field4812++;
        if (!this.method2088(72)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4851.field3817.method3837(-1, class15.method107(var4, arg2 ^ 0x5));
        if (!this.method2121((byte) -13, var6)) {
            return null;
        }
        if (arg2 != 3) {
            this.method2115((byte) -77, null);
        }
        int var7 = this.field4851.field3831[var6].method3837(-1, class15.method107(var5, 6));
        return this.method2095(var7, var6, arg2 - 2);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
    public final int method2112(int arg0) {
        if (arg0 != 255) {
            return -7;
        }
        field4816++;
        if (!this.method2088(arg0 ^ 0x91)) {
            throw new IllegalStateException("");
        }
        return this.field4851.field3818;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)Z")
    public final boolean method2113(boolean arg0) {
        field4828++;
        if (!this.method2088(84)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            return true;
        }
        while (this.field4851.field3825.length > var3) {
            int var4 = this.field4851.field3825[var3];
            if (this.field4830[var4] == null) {
                this.method2097(var4, 67);
                if (this.field4830[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(IZ)[B")
    public final byte[] method2114(int arg0, boolean arg1) {
        field4822++;
        if (!this.method2088(42)) {
            return null;
        } else if (this.field4851.field3821.length == 1) {
            return this.method2095(arg0, 0, 1);
        } else if (!this.method2121((byte) -13, arg0)) {
            return null;
        } else if (this.field4851.field3821[arg0] == 1) {
            return this.method2095(0, arg0, 1);
        } else if (arg1) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2115(byte arg0, String arg1) {
        field4836++;
        int var3 = this.method2092("", false);
        if (arg0 < 96) {
            return false;
        } else if (var3 == -1) {
            return this.method2106("", arg1, (byte) -79);
        } else {
            return this.method2106(arg1, "", (byte) -79);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method2116(int arg0, String arg1) {
        field4837++;
        if (this.method2088(70)) {
            String var3 = arg1.toLowerCase();
            int var4 = 100 / ((arg0 - 43) / 55);
            int var5 = this.field4851.field3817.method3837(-1, class15.method107(var3, 6));
            return this.method2107(var5, true);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(II)V")
    public final void method2117(int arg0, int arg1) {
        field4839++;
        if (arg1 != -200) {
            this.method2112(-24);
        }
        if (this.method2121((byte) -13, arg0) && this.field4819 != null) {
            this.field4819[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB[I)Z")
    private final boolean method2118(int arg0, int arg1, byte arg2, int[] arg3) {
        field4850++;
        if (!this.method2121((byte) -13, arg0)) {
            return false;
        } else if (this.field4830[arg0] == null) {
            return false;
        } else {
            int var5 = this.field4851.field3815[arg0];
            int[] var6 = this.field4851.field3834[arg0];
            if (this.field4819[arg0] == null) {
                this.field4819[arg0] = new Object[this.field4851.field3821[arg0]];
            }
            if (arg2 < 99) {
                this.field4825 = null;
            }
            Object[] var7 = this.field4819[arg0];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
                var11 = class113.method846(this.field4830[arg0], true, 16);
                class376 var12 = new class376(var11);
                var12.method2378(5, var12.field5518.length, -89, arg3);
            } else {
                var11 = class113.method846(this.field4830[arg0], false, 16);
            }
            byte[] var13;
            try {
                var13 = class496.method2870(75, var11);
            } catch (RuntimeException var49) {
                throw class285.method1823(var49, "T3 - " + (arg3 != null) + "," + arg0 + "," + var11.length + "," + class744.method4120((byte) 127, var11.length, var11) + "," + class744.method4120((byte) 125, var11.length - 2, var11) + "," + this.field4851.field3822[arg0] + "," + this.field4851.field3818);
            }
            if (this.field4821) {
                this.field4830[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4844 == 0) {
                    var7[var15] = class229.method1498(var13, false, -137);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4844 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * 4 * var17;
                class376 var19 = new class376(var13);
                int var20 = 0;
                var19.field5459 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method2384(10);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg1 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field5459 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method2384(33);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg1 == var32) {
                            class278.method1796(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * var34 * 4;
                class376 var36 = new class376(var13);
                var36.field5459 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method2384(31);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field5459 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method2384(108);
                        class278.method1796(var13, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field4844 == 0) {
                        var7[var48] = class229.method1498(var41[var47], false, -137);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public final void method2119(boolean arg0) {
        if (this.field4819 != null) {
            for (int var2 = 0; var2 < this.field4819.length; var2++) {
                this.field4819[var2] = null;
            }
        }
        field4845++;
        if (arg0) {
            this.field4821 = true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)Z")
    public final boolean method2120(int arg0, int arg1, int arg2) {
        field4811++;
        if (!this.method2101(arg1, (byte) -19, arg2)) {
            return false;
        } else if (this.field4819[arg2] != null && this.field4819[arg2][arg1] != null) {
            return true;
        } else if (this.field4830[arg2] == null) {
            if (arg0 != -5241) {
                this.field4851 = null;
            }
            this.method2097(arg2, arg0 ^ 0xFFFFEBB3);
            return this.field4830[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(BI)Z")
    private final boolean method2121(byte arg0, int arg1) {
        if (arg0 != -13) {
            this.method2097(96, -113);
        }
        field4817++;
        if (!this.method2088(67)) {
            return false;
        } else if (arg1 >= 0 && this.field4851.field3821.length > arg1 && this.field4851.field3821[arg1] != 0) {
            return true;
        } else if (class697.field9781) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lms;ZI)V")
    public class333(class792 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4844 = arg2;
        this.field4821 = arg1;
        this.field4825 = arg0;
    }
}
