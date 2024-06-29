import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class515 extends class270 {

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field7624 = -1;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[I")
    public static int[] field7623 = new int[4096];

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field7625;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7623[var0] = class381.method2408((byte) 127, var0);
        }
        field7625 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 3)
    public static void method3046(int arg0) {
        if (arg0 != -1) {
            field7625 = 113;
        }
        field7623 = null;
    }
}
