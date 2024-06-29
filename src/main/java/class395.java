import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class395 extends class594 {

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "[I")
    public int[] field5458;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "[I")
    public int[] field5456;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field5457 = new String[200];

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lba;")
    public static class607 field5459 = new class607(512);

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "F")
    public static float field5455;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Ljr;")
    public static class441 field5460;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
    public static void method2369(int arg0) {
        field5459 = null;
        field5457 = null;
        if (arg0 <= -92) {
            field5460 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)Z")
    public static final boolean method2370(boolean arg0) {
        if (!arg0) {
            field5455 = 0.47433197F;
        }
        field5454++;
        return class558.method3140("jaclib", (byte) -46) ? class558.method3140("hw3d", (byte) -46) : false;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II[I[I)V")
    public class395(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5458 = arg2;
        this.field5456 = arg3;
    }
}
