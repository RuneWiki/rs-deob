import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class84 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lvh;")
    public static class328 field1166 = new class328(4);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method650(int arg0) {
        if (arg0 != -27642) {
            method651(85, -73);
        }
        field1166 = null;
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1164++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z")
    public static final boolean method651(int arg0, int arg1) {
        if (arg0 != 4) {
            method650(-54);
        }
        field1165++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }
}
