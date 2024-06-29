import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public abstract class class1 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lub;")
    public static class15 field2 = new class15(64);

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field5 = 0;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "Lpm;")
    public static class349 field3 = new class349("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "[I")
    public static int[] field7 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "Lro;")
    public static class1 field6;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 5)
    public static void method1(int arg0) {
        int var1 = -104 % ((arg0 - 62) / 53);
        field4 = null;
        field6 = null;
        field7 = null;
        field3 = null;
        field2 = null;
    }
}
