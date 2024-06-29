import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class141 {

    @OriginalMember(owner = "client!da", name = "V", descriptor = "Lkd;")
    private static class73 field665 = class126.method1070((byte) -66, "purple:");

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lkd;")
    private static class73 field658 = class126.method1070((byte) -66, "Enter name of player to add to list");

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lkd;")
    private static class73 field654 = class126.method1070((byte) -66, "Invalid username or password)3");

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lkd;")
    public static class73 field653 = field665;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "Lkd;")
    public static class73 field669 = field658;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "Lkd;")
    private static class73 field673 = class126.method1070((byte) -66, "Ok");

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "Lkd;")
    public static class73 field677 = field665;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "Lkd;")
    public static class73 field660 = class126.method1070((byte) -66, "(U(Y");

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static volatile int field647 = 0;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lkd;")
    public static class73 field655 = field673;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lkd;")
    public static class73 field667 = class126.method1070((byte) -66, "_");

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field671 = -1;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Lkd;")
    public static class73 field680 = class126.method1070((byte) -66, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!da", name = "I", descriptor = "Lkd;")
    public static class73 field652 = field654;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "Lkd;")
    public static class73 field674 = class126.method1070((byte) -66, "(U");

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Lq;")
    public static class111 field670;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "Lbc;")
    public static class11 field679;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "Lwa;")
    public class149 field649;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Li;")
    public class56 field668;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "Li;")
    public class56 field675;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "[I")
    public int[] field657;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    public final void method191(byte arg0) {
        field672++;
        if (arg0 < 20) {
            this.method191((byte) 23);
        }
        int var2 = this.field651;
        class149 var3 = this.field649.method1201((byte) 102);
        if (var3 == null) {
            this.field657 = null;
            this.field648 = 0;
            this.field656 = 0;
            this.field651 = -1;
            this.field645 = 0;
        } else {
            this.field657 = var3.field3653;
            this.field645 = var3.field3669;
            this.field651 = var3.field3668;
            this.field648 = var3.field3670 * 128;
            this.field656 = var3.field3651;
        }
        if (this.field651 != var2 && this.field668 != null) {
            class21.field575.method916(this.field668);
            this.field668 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static void method192(byte arg0) {
        field653 = null;
        field680 = null;
        field667 = null;
        field655 = null;
        field670 = null;
        field660 = null;
        field658 = null;
        field654 = null;
        field679 = null;
        field673 = null;
        field669 = null;
        field665 = null;
        field674 = null;
        field652 = null;
        int var1 = -69 / ((arg0 + 15) / 49);
        field677 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)Lgd;")
    public static final class46 method193(int arg0) {
        field662++;
        if (arg0 != 128) {
            field680 = null;
        }
        class46 var1 = new class46(class132.field3315, class72.field1819, class2.field150, class24.field682, class92.field2382);
        class57.method492(-4202);
        return var1;
    }
}
