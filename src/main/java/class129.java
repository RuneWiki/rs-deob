import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class129 extends class62 {

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    private int field1785 = 4096;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private int field1788 = 2048;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    private int field1789 = 0;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    private int field1792 = 2048;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    private int field1787 = 0;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    private int field1786 = 12288;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    private int field1791 = 8192;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "Lh;")
    public static class572 field1793 = new class572("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "S")
    public static short field1795 = 1;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Ltca;")
    public static class150 field1796;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IBI)Z")
    private final boolean method905(int arg0, byte arg1, int arg2) {
        ++field1790;
        int var4 = (arg2 - -arg0) * this.field1786 >> 12;
        int var5 = class321.field4429[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field1786;
        int var7 = (var6 << 12) / this.field1791;
        if (arg1 > -58) {
            this.field1791 = 82;
        }
        int var8 = this.field1785 * var7 >> 12;
        return -arg0 + arg2 < var8 && -var8 < -arg0 + arg2;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field1794;
        int[] var3 = super.field774.method3086(arg0, arg1 + -656024163);
        if (arg1 != 656024161) {
            method907(28, -38, 13, (class113) null, (class113) null);
        }
        if (super.field774.field7499) {
            int var4 = class309.field4265[arg0] - 2048;
            for (int var5 = 0; ~var5 > ~class438.field5847; ++var5) {
                int var6 = class200.field2965[var5] + -2048;
                int var7 = this.field1792 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field1787 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 - 4096;
                int var13 = this.field1789 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field1788 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method906(var12, var9, class354.method2138(arg1, 656024089)) && !this.method905(var15, (byte) -126, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 == 6) {
                                        this.field1791 = arg0.method1045(true);
                                    }
                                } else {
                                    this.field1785 = arg0.method1045(true);
                                }
                            } else {
                                this.field1786 = arg0.method1045(true);
                            }
                        } else {
                            this.field1788 = arg0.method1045(true);
                        }
                    } else {
                        this.field1789 = arg0.method1045(true);
                    }
                } else {
                    this.field1787 = arg0.method1045(true);
                }
            } else {
                this.field1792 = arg0.method1045(true);
            }
            ++field1798;
        }
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field1797;
        class380.method2269(21815);
        if (arg0 >= -37) {
            this.method906(-128, -32, 21);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Z")
    private final boolean method906(int arg0, int arg1, int arg2) {
        ++field1784;
        if (arg2 <= 88) {
            this.method395(-41);
        }
        int var4 = (arg0 - arg1) * this.field1786 >> 12;
        int var5 = class321.field4429[(var4 * 255 & 1045090) >> 12];
        int var6 = (var5 << 12) / this.field1786;
        int var7 = (var6 << 12) / this.field1791;
        int var8 = this.field1785 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && arg1 - -arg0 > -var8;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILhu;Lhu;)V")
    public static final void method907(int arg0, int arg1, int arg2, class113 arg3, class113 arg4) {
        class205 var5 = class441.method2562(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3047 = arg3;
            var5.field3037 = arg4;
        }
    }

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)V")
    public static void method908(int arg0) {
        field1793 = null;
        if (arg0 != 3387) {
            field1793 = null;
        }
        field1796 = null;
    }
}
