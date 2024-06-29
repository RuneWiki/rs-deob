import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class202 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "Lem;")
    public static class206 field2855 = new class206(109, 17);

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Llh;")
    public static class487 field2856 = new class487(35, -1);

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "Ltp;")
    public static class494 field2857 = new class494();

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Lqk;")
    public static class16 field2859;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field2855 = null;
        field2859 = null;
        field2856 = null;
        if (arg0 == 109) {
            field2857 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)I")
    public final int method1326(int arg0) {
        field2852++;
        if (arg0 != -1) {
            method1325(-6);
        }
        return this.field2851;
    }

    @OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2853++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class202(String arg0, int arg1) {
        this.field2851 = arg1;
    }
}
