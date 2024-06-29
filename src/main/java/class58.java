import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class58 extends class149 {

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    private int field779 = -1;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "Ljb;")
    public static class499 field775 = null;

    @OriginalMember(owner = "client!kt", name = "S", descriptor = "[[S")
    public static short[][] field784;

    @OriginalMember(owner = "client!kt", name = "U", descriptor = "Z")
    public static boolean field786;

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "[I")
    public int[] field785;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)Z")
    public final boolean method394(int arg0) {
        if (arg0 != 29874) {
            this.field776 = 16;
        }
        ++field777;
        if (this.field785 != null) {
            return true;
        } else if (this.field779 >= 0) {
            class476 var2 = ~class66.field914 <= -1 ? class476.method2845(class250.field3470, class66.field914, this.field779) : class476.method2855(class250.field3470, this.field779);
            var2.method2853();
            this.field785 = var2.method2843();
            this.field776 = var2.field6928;
            this.field782 = var2.field6933;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field775 = null;
        if (arg0 < 89) {
            method395((byte) -38);
        }
        field784 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)[[I")
    public int[][] method139(byte arg0, int arg1) {
        ++field778;
        if (arg0 >= -45) {
            field786 = true;
        }
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664 && this.method394(29874)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class150.field2159 == this.field776 ? arg1 : this.field776 * arg1 / class150.field2159) * this.field782;
            if (class316.field4838 != this.field782) {
                for (int var8 = 0; var8 < class316.field4838; ++var8) {
                    int var9 = this.field782 * var8 / class316.field4838;
                    int var10 = this.field785[var7 + var9];
                    var6[var8] = class494.method2942(4080, var10 << 4);
                    var5[var8] = class494.method2942(65280, var10) >> 4;
                    var4[var8] = class494.method2942(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class316.field4838; ++var11) {
                    int var12 = this.field785[var7++];
                    var6[var11] = class494.method2942(255, var12) << 4;
                    var5[var11] = class494.method2942(var12, 65280) >> 4;
                    var4[var11] = class494.method2942(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 == -1) {
            this.field779 = arg2.method631(10494);
        }
        ++field783;
        if (arg1 != 35) {
            this.field785 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
    public final int method396(int arg0) {
        ++field780;
        if (arg0 != -1) {
            field781 = 83;
        }
        return this.field779;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
    public final void method397(byte arg0) {
        super.method397(arg0);
        ++field774;
        this.field785 = null;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
    public class58() {
        super(0, false);
    }

    static {
        new class375("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field784 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
        field786 = false;
    }
}
