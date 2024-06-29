import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class343 extends class287 {

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public static int field4961 = 0;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "Lkc;")
    public static class157 field4963 = new class157("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "Lde;")
    public static class10 field4965 = new class10(8, 0, 4, 1);

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "Lhi;")
    public static class45 field4966 = new class45(62, 8);

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "Lkc;")
    public static class157 field4967 = new class157("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4969 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!ho", name = "q", descriptor = "Lub;")
    public class301 field4950;

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "Ljava/lang/String;")
    public String field4959;

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "[I")
    public int[] field4952;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "[I")
    public int[] field4953;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "[Lew;")
    public class270[] field4956;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "[Ljava/lang/String;")
    public String[] field4962;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 11)
    public static void method2072(byte arg0) {
        field4965 = null;
        field4963 = null;
        field4969 = null;
        field4967 = null;
        if (arg0 > -120) {
            method2073(110, 98);
        }
        field4966 = null;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Leg;", line = 25)
    public static final class34 method2073(int arg0, int arg1) {
        field4957++;
        if (arg0 == 0) {
            return new class159();
        } else if (arg0 == 1) {
            return new class37();
        } else if (arg0 == 2) {
            return new class366();
        } else if (arg0 == 3) {
            return new class454();
        } else if (arg0 == 4) {
            return new class450();
        } else if (arg0 == 5) {
            return new class202();
        } else if (arg0 == 6) {
            return new class267();
        } else if (arg0 == 7) {
            return new class9();
        } else if (arg0 == 8) {
            return new class478();
        } else if (arg0 == 9) {
            return new class160();
        } else if (arg0 == 10) {
            return new class535();
        } else if (arg0 == 11) {
            return new class38();
        } else if (arg0 == 12) {
            return new class183();
        } else if (arg0 == 13) {
            return new class455();
        } else if (arg0 == 14) {
            return new class56();
        } else if (arg0 == 15) {
            return new class165();
        } else if (arg0 == 16) {
            return new class176();
        } else if (arg0 == 17) {
            return new class273();
        } else if (arg0 == 18) {
            return new class311();
        } else if (arg0 == 19) {
            return new class457();
        } else if (arg0 == 20) {
            return new class470();
        } else if (arg0 == 21) {
            return new class533();
        } else if (arg0 == 22) {
            return new class375();
        } else if (arg0 == 23) {
            return new class369();
        } else if (arg0 == 24) {
            return new class117();
        } else if (arg0 == 25) {
            return new class243();
        } else if (arg0 == 26) {
            return new class108();
        } else if (arg0 == 27) {
            return new class217();
        } else if (arg0 == 28) {
            return new class30();
        } else if (arg0 == 29) {
            return new class497();
        } else if (arg0 == 30) {
            return new class286();
        } else if (arg0 == 31) {
            return new class409();
        } else if (arg0 == 32) {
            return new class78();
        } else if (arg0 == 33) {
            return new class210();
        } else if (arg0 == 34) {
            return new class315();
        } else if (arg0 == 35) {
            return new class525();
        } else if (arg0 == 36) {
            return new class340();
        } else if (arg0 == 37) {
            return new class134();
        } else if (arg0 == 38) {
            return new class24();
        } else if (arg0 == 39) {
            return new class329();
        } else {
            if (arg1 != 5255) {
                field4968 = -36;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIZ)V", line = 368)
    public static final void method2074(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 1012) {
            class47.method310(class483.field6963, arg0, arg2);
        } else if (arg1 == 1003) {
            class47.method310(class441.field6358, arg0, arg2);
        } else if (arg1 == 1004) {
            class47.method310(class364.field5230, arg0, arg2);
        } else if (arg1 == 1010) {
            class47.method310(class146.field2185, arg0, arg2);
        } else if (arg1 == 1008) {
            class47.method310(class183.field2721, arg0, arg2);
        }
        if (!arg3) {
            method2072((byte) -25);
        }
        field4964++;
    }
}
