import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class286 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lmt;")
    public static class276 field4184 = new class276(15, 0, 1, 0);

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4188 = new String[5];

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[F")
    public static float[] field4187 = new float[4];

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method1766(byte arg0) {
        if (arg0 > -58) {
            method1767(null, -18);
        }
        field4184 = null;
        field4187 = null;
        field4188 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([[II)V")
    public static final void method1767(int[][] arg0, int arg1) {
        field4185++;
        int var2 = -70 % ((arg1 + 9) / 56);
        class112.field1523 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ldw;I)Ldw;")
    public abstract class513 method1758(class513 arg0, int arg1);
}
