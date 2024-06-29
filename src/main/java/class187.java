import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class187 {

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Llb;")
    public class109 field3810 = new class109();

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[I")
    public static int[] field3802 = new int[50];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Llb;")
    private class109 field3816;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lba;")
    public static class12 field3806;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[Lba;")
    public static class12[] field3813;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method1230(int arg0) {
        if (arg0 != -13057) {
            this.method1232(105);
        }
        field3815++;
        while (true) {
            class109 var2 = this.field3810.field2418;
            if (this.field3810 == var2) {
                return;
            }
            var2.method799(-24265);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Llb;")
    public final class109 method1231(int arg0) {
        field3803++;
        if (arg0 != -18652) {
            this.method1230(-2);
        }
        class109 var2 = this.field3816;
        if (this.field3810 == var2) {
            this.field3816 = null;
            return null;
        } else {
            this.field3816 = var2.field2421;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Llb;")
    public final class109 method1232(int arg0) {
        if (arg0 != 25831) {
            this.method1234(-109);
        }
        class109 var2 = this.field3810.field2418;
        field3801++;
        if (this.field3810 == var2) {
            this.field3816 = null;
            return null;
        } else {
            this.field3816 = var2.field2418;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Llb;ILlb;)V")
    public final void method1233(class109 arg0, int arg1, class109 arg2) {
        field3811++;
        if (arg2.field2421 != null) {
            arg2.method799(-24265);
        }
        if (arg1 != -1) {
            this.method1236((byte) 53, null);
        }
        arg2.field2418 = arg0;
        arg2.field2421 = arg0.field2421;
        arg2.field2421.field2418 = arg2;
        arg2.field2418.field2421 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Llb;")
    public final class109 method1234(int arg0) {
        class109 var2 = this.field3810.field2418;
        int var3 = -102 / ((-arg0 - 11) / 43);
        field3807++;
        if (this.field3810 == var2) {
            return null;
        } else {
            var2.method799(-24265);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILce;)Ldd;")
    public static final class35 method1235(int arg0, int arg1, class26 arg2) {
        field3814++;
        try {
            if (arg0 != 23889) {
                field3813 = null;
            }
            class35 var3 = new class35();
            var3.field758 = arg2.method259((byte) -112);
            if (var3.field758 > arg1) {
                var3.field758 = arg1;
            }
            var3.field730 = new byte[var3.field758];
            arg2.field527 += class125.field2734.method525(var3.field758, arg0 ^ 0xFFFFA2AE, var3.field730, arg2.field529, arg2.field527, 0);
            return var3;
        } catch (Exception var4) {
            return class108.field2405;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLlb;)V")
    public final void method1236(byte arg0, class109 arg1) {
        if (arg1.field2421 != null) {
            arg1.method799(-24265);
        }
        arg1.field2421 = this.field3810.field2421;
        arg1.field2418 = this.field3810;
        int var3 = 113 / ((arg0 - 65) / 53);
        field3812++;
        arg1.field2421.field2418 = arg1;
        arg1.field2418.field2421 = arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILlc;JLlc;Llc;)V")
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, class110 arg4, long arg5, class110 arg6, class110 arg7) {
        class100 var9 = new class100();
        var9.field2191 = arg4;
        var9.field2210 = arg1 * 128 + 64;
        var9.field2193 = arg2 * 128 + 64;
        var9.field2207 = arg3;
        var9.field2198 = arg5;
        var9.field2195 = arg6;
        var9.field2213 = arg7;
        short var10 = 0;
        class54 var11 = class191.field3853[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1218; var12++) {
                if ((var11.field1225[var12].field2822 & 0x400000L) == 4194304L && var11.field1225[var12].field2814 instanceof class81) {
                    class81 var13 = (class81) var11.field1225[var12].field2814;
                    var13.method608();
                    if (var13.field2440 < var10) {
                        var10 = var13.field2440;
                    }
                }
            }
        }
        var9.field2204 = -var10;
        if (class191.field3853[arg0][arg1][arg2] == null) {
            class191.field3853[arg0][arg1][arg2] = new class54(arg0, arg1, arg2);
        }
        class191.field3853[arg0][arg1][arg2].field1219 = var9;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Llb;")
    public final class109 method1238(int arg0) {
        if (arg0 != 22622) {
            this.method1238(48);
        }
        class109 var2 = this.field3816;
        field3805++;
        if (this.field3810 == var2) {
            this.field3816 = null;
            return null;
        } else {
            this.field3816 = var2.field2418;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(BLlb;)V")
    public final void method1239(byte arg0, class109 arg1) {
        if (arg1.field2421 != null) {
            arg1.method799(-24265);
        }
        if (arg0 < 115) {
            return;
        }
        arg1.field2418 = this.field3810.field2418;
        arg1.field2421 = this.field3810;
        arg1.field2421.field2418 = arg1;
        arg1.field2418.field2421 = arg1;
        field3804++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIII)V")
    public static final void method1240(boolean arg0, int arg1, int arg2, int arg3) {
        field3808++;
        if (arg2 < 128 || arg3 < 128 || arg2 > 13056 || arg3 > 13056) {
            class73.field1747 = -1;
            class35.field738 = -1;
            return;
        }
        int var4 = class73.method583(class175.field3585, arg3, arg2, (byte) 1) - arg1;
        int var5 = class11.field211[class116.field2593];
        if (!arg0) {
            method1237(-39, 47, -124, 87, null, -63L, null, null);
        }
        int var6 = var4 - class51.field1150;
        int var7 = arg2 - class26.field571;
        int var8 = arg3 - class8.field122;
        int var9 = class11.field211[class55.field1246];
        int var10 = class11.field201[class55.field1246];
        int var11 = var7 * var10 + var8 * var9 >> 16;
        int var12 = var8 * var10 - var7 * var9 >> 16;
        int var14 = class11.field201[class116.field2593];
        int var15 = var6 * var14 - var5 * var12 >> 16;
        int var16 = var5 * var6 + var12 * var14 >> 16;
        if (var16 >= 50) {
            class35.field738 = (var15 << 9) / var16 + 167;
            class73.field1747 = (var11 << 9) / var16 + 256;
        } else {
            class73.field1747 = -1;
            class35.field738 = -1;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Llb;")
    public final class109 method1241(byte arg0) {
        field3809++;
        class109 var2 = this.field3810.field2421;
        if (arg0 != -125) {
            method1240(true, -53, -54, -60);
        }
        if (this.field3810 == var2) {
            this.field3816 = null;
            return null;
        } else {
            this.field3816 = var2.field2421;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
    public static void method1242(int arg0) {
        field3806 = null;
        field3813 = null;
        if (arg0 > -40) {
            field3813 = null;
        }
        field3802 = null;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class187() {
        this.field3810.field2418 = this.field3810;
        this.field3810.field2421 = this.field3810;
    }
}
