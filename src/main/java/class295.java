import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class295 extends class252 {

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "Lc;")
    public class112 field4810;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field4805 = 0;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[I")
    public static int[] field4812 = new int[5];

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field4806 = 0;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Z")
    public static boolean field4817 = true;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public int field4808;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "[I")
    public static int[] field4819;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
    public static final int method2025(int arg0, int arg1) {
        if (arg0 < 46) {
            method2025(101, -72);
        }
        field4804++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public final void method2026(int arg0, int arg1, int arg2, int arg3) {
        this.field4820 = arg2;
        this.field4814 = arg1;
        this.field4815 = arg3;
        if (arg0 == -18636) {
            field4803++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
    public static void method2027(int arg0) {
        field4812 = null;
        if (arg0 != 5) {
            method2027(45);
        }
        field4819 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lc;Lga;)V")
    public class295(class112 arg0, class181 arg1) {
        this.field4810 = arg0;
    }
}
