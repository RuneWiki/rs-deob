import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class194 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field2740;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Z")
    public static boolean field2742 = false;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lhr;")
    public static class348 field2741;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)Z", line = 30)
    public static final boolean method1217(int arg0, byte arg1, int arg2) {
        field2743++;
        int var3 = 85 / ((-arg1 - 31) / 62);
        return class235.method1427(-65, arg2, arg0) || class147.method912(arg0, arg2, (byte) 82);
    }

    @OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;", line = 48)
    public final String toString() {
        field2745++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 86)
    public static final void method1218(int arg0) {
        field2739++;
        if (class272.field3805.length() == 0) {
            return;
        }
        class465.method2724(-26334, "--> " + class272.field3805);
        class400.method2384(8308, false, class272.field3805);
        class222.field3145 = arg0;
        class272.field3805 = "";
        class65.field973 = 0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 110)
    public static void method1219(byte arg0) {
        if (arg0 > -81) {
            method1217(-3, (byte) 10, -18);
        }
        field2741 = null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 135)
    public class194(String arg0, String arg1, String arg2, String arg3) {
        this.field2740 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Ljava/lang/String;", line = 151)
    public final String method1220(int arg0, int arg1) {
        if (arg0 == 2969) {
            field2744++;
            return this.field2740[arg1];
        } else {
            return null;
        }
    }
}
