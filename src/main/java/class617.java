import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class617 {

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "Llk;")
    public static class545 field8960 = null;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field8959 = -1;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field8961 = -1;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lsb;")
    public static class266 field8957 = new class266(70, 2);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(III)Z")
    public static final boolean method3535(int arg0, int arg1, int arg2) {
        if (arg0 != 70) {
            method3535(-3, -83, -100);
        }
        field8958++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public static void method3536(int arg0) {
        int var1 = 15 / ((38 - arg0) / 63);
        field8960 = null;
        field8957 = null;
    }
}
