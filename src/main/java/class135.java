import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lrf;")
    private class124 field2954 = new class124();

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lpe;")
    public static class109 field2948 = class141.method1120("Passwort: ", 0);

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lpe;")
    private static class109 field2953 = class141.method1120("Please enter your password)3", 0);

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lpe;")
    public static class109 field2950 = class141.method1120("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2956 = -1;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[I")
    public static int[] field2947 = new int[500];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lpe;")
    public static class109 field2949 = field2953;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lwa;")
    public static class154 field2944;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lna;")
    public static class91 field2934;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[[[B")
    public static byte[][][] field2939;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field2939 = null;
        field2949 = null;
        field2950 = null;
        field2948 = null;
        field2953 = null;
        field2944 = null;
        if (arg0 == -6660) {
            field2934 = null;
            field2947 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BZ)Lwf;")
    public static final class159 method1073(byte[] arg0, boolean arg1) {
        field2943++;
        if (arg0 == null) {
            return null;
        } else {
            class159 var2 = new class159(arg0, class107.field2246, class152.field3342, class57.field1142, class120.field2668, class131.field2879, class92.field1970);
            class46.method413(-18078);
            return arg1 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lrf;")
    public final class124 method1074(int arg0) {
        int var2 = 13 % ((66 - arg0) / 56);
        field2940++;
        class124 var3 = this.field2954.field2742;
        if (this.field2954 == var3) {
            return null;
        } else {
            var3.method1006((byte) -17);
            return var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lrf;Z)V")
    public final void method1075(class124 arg0, boolean arg1) {
        if (arg0.field2739 != null) {
            arg0.method1006((byte) 36);
        }
        field2942++;
        arg0.field2742 = this.field2954.field2742;
        arg0.field2739 = this.field2954;
        arg0.field2739.field2742 = arg0;
        arg0.field2742.field2739 = arg0;
        if (!arg1) {
            method1076(71, 64, -13);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method1076(int arg0, int arg1, int arg2) {
        field2952++;
        class145 var3 = (class145) class25.field613.method505((byte) -46, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 <= arg0 && var3.field3174.length > arg0) {
            return var3.field3174[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILrf;)V")
    public final void method1077(int arg0, class124 arg1) {
        if (arg1.field2739 != null) {
            arg1.method1006((byte) 52);
        }
        field2937++;
        if (arg0 != 0) {
            this.method1079(88);
        }
        arg1.field2739 = this.field2954.field2739;
        arg1.field2742 = this.field2954;
        arg1.field2739.field2742 = arg1;
        arg1.field2742.field2739 = arg1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lna;ZLna;Lie;Lna;)Z")
    public static final boolean method1078(class91 arg0, boolean arg1, class91 arg2, class61 arg3, class91 arg4) {
        field2945++;
        class18.field450 = arg0;
        class121.field2676 = arg2;
        class156.field3606 = arg3;
        if (arg1) {
            return false;
        } else {
            class144.field3159 = arg4;
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Lrf;")
    public final class124 method1079(int arg0) {
        class124 var2 = this.field2954.field2742;
        field2955++;
        if (arg0 <= 106) {
            return null;
        } else if (this.field2954 == var2) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class135() {
        this.field2954.field2739 = this.field2954;
        this.field2954.field2742 = this.field2954;
    }
}
