import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class581 {

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field8200 = 0;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "F")
    public static float field8198;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method3305(int arg0, int arg1) {
        field8199++;
        class612.field8586 = arg1;
        class714 var2 = class90.field1079;
        synchronized (class90.field1079) {
            class90.field1079.method4023((byte) -126);
            if (arg0 != 15094) {
                field8200 = 96;
            }
        }
        class714 var3 = class668.field9073;
        synchronized (class668.field9073) {
            class668.field9073.method4023((byte) 84);
        }
    }

    @OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8197++;
        throw new IllegalStateException();
    }
}
