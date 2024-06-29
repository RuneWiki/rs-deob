import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class301 extends class162 {

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[B")
    public byte[] field4939;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field4937 = 0;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[I")
    public static int[] field4941 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field4934 = 0;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "Lwa;")
    public static class281 field4938 = new class281();

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lsl;")
    public static class19 field4942;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Lh;")
    public static class294 field4936;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4940;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V")
    public static void method2078(boolean arg0) {
        field4941 = null;
        field4940 = null;
        field4942 = null;
        field4936 = null;
        field4938 = null;
        if (!arg0) {
            field4934 = 5;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static final void method2079(byte arg0) {
        field4935++;
        for (int var1 = 0; var1 < 5; var1++) {
            class99.field1483[var1] = false;
        }
        class92.field1402 = 1;
        class310.field5018 = -1;
        if (arg0 != -64) {
            field4937 = 24;
        }
        class163.field2566 = 0;
        class286.field4767 = 0;
        class117.field1778 = -1;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "([B)V")
    public class301(byte[] arg0) {
        this.field4939 = arg0;
    }
}
