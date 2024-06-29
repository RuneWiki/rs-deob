import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class180 {

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field2159;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "Lcea;")
    public static class180 field2163 = new class180("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "Lrg;")
    public static class548 field2164 = new class548(22, 7);

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!cea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2160++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class180(String arg0, String arg1, String arg2, String arg3) {
        this.field2159 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method987(int arg0, int arg1) {
        if (arg1 != 22) {
            this.toString();
        }
        field2162++;
        return this.field2159[arg0];
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2163 = null;
        if (arg0 != -17464) {
            method988(-84);
        }
        field2164 = null;
    }
}
