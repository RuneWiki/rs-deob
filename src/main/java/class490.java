import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class490 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lpn;")
    public static class72 field6928 = new class72(22, 6);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[[[I")
    public static int[][][] field6929 = new int[2][][];

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2883(byte arg0) {
        field6929 = null;
        field6928 = null;
        int var1 = 59 / ((26 - arg0) / 57);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static final void method2884(int arg0) {
        if (arg0 != 5571) {
            field6929 = null;
        }
        field6927++;
        class180.field2228 = new class166();
    }
}
