import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class159 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2691 = "Connecting to update server";

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
    public static int[] field2692 = new int[14];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Ljava/awt/Image;")
    public static Image field2694;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lbn;")
    public static class75[] field2695;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLek;)V", line = 8)
    public static final void method1144(byte arg0, class206 arg1) {
        if (arg0 < -77) {
            field2689++;
            class25.field645 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1145(int arg0) {
        if (arg0 == 19492) {
            class201.field3370 = null;
            field2694 = null;
            field2690++;
            class346.field5522 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method1146(boolean arg0) {
        if (!arg0) {
            method1146(false);
        }
        class106.method785();
        class105.field1928 = new class67[8];
        field2693++;
        class105.field1928[1] = new class333();
        class105.field1928[2] = new class29();
        class105.field1928[3] = new class64();
        class105.field1928[4] = new class169();
        class105.field1928[5] = new class344();
        class105.field1928[6] = new class45();
        class105.field1928[7] = new class44();
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 70)
    public static void method1147(int arg0) {
        if (arg0 < 17) {
            method1145(-23);
        }
        field2695 = null;
        field2692 = null;
        field2691 = null;
        field2694 = null;
    }
}
