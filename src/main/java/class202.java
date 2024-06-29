import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class202 implements class330 {

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lki;")
    public static class498 field2923 = new class498(17, 3);

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field2925 = -1;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "Lri;")
    public static class73 field2924 = new class73(103, 4);

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "F")
    public static float field2926;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Lje;")
    public static class275 field2927;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "Lf;")
    public static class529 field2920;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 3)
    public static void method1374(int arg0) {
        if (arg0 == 4) {
            field2923 = null;
            field2920 = null;
            field2927 = null;
            field2924 = null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        field2922++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
    public class202(String arg0, int arg1) {
        this.field2921 = arg1;
    }
}
