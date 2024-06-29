import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class44 {

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "J")
    public long field780 = 0L;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Z")
    public static boolean[] field774 = new boolean[5];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lr;")
    public static class66 field781 = class93.method641(43, "(Y<)4col>");

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Z")
    public static volatile boolean field770 = true;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field785 = -1;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lr;")
    public static class66 field788 = null;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lra;")
    public static class40 field778 = null;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "[I")
    public static int[] field794 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Lr;")
    private static class66 field783 = class93.method641(43, "white:");

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Lr;")
    public static class66 field796 = field783;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lr;")
    public static class66 field773 = field783;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "La;")
    public class20 field779;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[[B")
    public static byte[][] field777;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)I")
    public static final int method316(int arg0, int arg1, int arg2) {
        if (arg0 != 503159455) {
            method319((byte) 112);
        }
        field798++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static final void method317(int arg0) {
        class163.method1102((byte) 108);
        field772++;
        System.gc();
        class112.method755(arg0, (byte) -68);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llh;I)V")
    public static final void method318(class249 arg0, int arg1) {
        field795++;
        if (class59.field991 != null) {
            try {
                class59.field991.method964(0L, arg1 - 23);
                class59.field991.method959(24, 0, arg0.field4335, arg0.field4350);
            } catch (Exception var2) {
            }
        }
        arg0.field4335 += arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        class208.field3605.method1613((byte) 94);
        int var1 = 60 / ((-arg0 - 53) / 38);
        field784++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static void method320(int arg0) {
        field788 = null;
        field796 = null;
        if (arg0 != 24) {
            field794 = null;
        }
        field783 = null;
        field794 = null;
        field777 = null;
        field781 = null;
        field773 = null;
        field774 = null;
    }
}
