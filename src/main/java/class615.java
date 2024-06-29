import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class615 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field8950 = 0;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
    public static int[] field8951 = new int[1];

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Z")
    public static boolean field8952;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 18)
    public static final void method3550(int arg0) {
        class526.field7632 = new class85[arg0];
        field8954++;
        class220.field3015 = 0;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 27)
    public static void method3551(int arg0) {
        if (arg0 != 26708) {
            field8950 = -82;
        }
        field8951 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lkea;I)V", line = 38)
    public static final void method3552(class203 arg0, int arg1) {
        class287.field3977 = 0;
        class621.field8993 = 0;
        field8949++;
        class132.field1661 = new class567();
        class472.field6987 = new class516[1024];
        class324.field4682 = new class211[class535.field7726[class178.field2192] + 1];
        class31.field350 = 0;
        class158.field1956 = 0;
        class263.method1739(arg0, -127);
        class250.method1649((byte) -88, arg0);
        int var2 = -40 / ((arg1 - 34) / 46);
    }
}
