import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class181 extends class466 {

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field2567 = -1;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Ldv;")
    public static class566 field2569 = new class566(68, 2);

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Lej;")
    public static class104 field2572 = new class104(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Lqm;")
    public static class124 field2574;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
    private int[] field2568;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method1078(int arg0) {
        if (arg0 > -89) {
            this.method6((class11) null, 65, -83);
        }
        super.method1078(-119);
        ++field2565;
        this.field2568 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field2571;
        if (arg1 != -5062) {
            this.method1137(-91, -44, 50);
        }
        if (~arg2 == -1) {
            this.field2567 = arg0.method93((byte) 116);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field2574 = null;
        if (arg0 != -75) {
            method1136((byte) 19);
        }
        field2572 = null;
        field2569 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V")
    public final void method1137(int arg0, int arg1, int arg2) {
        super.method1137(arg0, arg1, arg2);
        ++field2570;
        if (this.field2567 >= 0 && class309.field4175 != null) {
            int var4 = !class309.field4175.method190((byte) -89, this.field2567).field2965 ? 128 : 64;
            this.field2568 = class309.field4175.method186(false, this.field2567, 10350, var4, var4, 1.0F);
            this.field2566 = var4;
            this.field2563 = var4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
    public final int method1138(byte arg0) {
        if (arg0 < 65) {
            this.method33(113, false);
        }
        ++field2564;
        return this.field2567;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field2573;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            this.field2563 = 32;
        }
        if (super.field6569.field1934) {
            int var4 = (~class564.field7814 == ~this.field2566 ? arg0 : this.field2566 * arg0 / class564.field7814) * this.field2563;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class312.field4207 == this.field2563) {
                for (int var8 = 0; var8 < class312.field4207; ++var8) {
                    int var9 = this.field2568[var4++];
                    var7[var8] = class589.method3454(255, var9) << 4;
                    var6[var8] = class589.method3454(var9 >> 4, 4080);
                    var5[var8] = class589.method3454(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class312.field4207; ++var10) {
                    int var11 = this.field2563 * var10 / class312.field4207;
                    int var12 = this.field2568[var4 + var11];
                    var7[var10] = class589.method3454(var12 << 4, 4080);
                    var6[var10] = class589.method3454(4080, var12 >> 4);
                    var5[var10] = class589.method3454(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    static {
        new class104("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }
}
