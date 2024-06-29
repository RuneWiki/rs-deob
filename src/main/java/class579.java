import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class579 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field7899;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "B")
    public byte field7898;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field7891;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "S")
    public short field7895;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Z")
    public boolean field7892;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "S")
    public short field7897;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "S")
    public short field7893;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "B")
    public byte field7894;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 11)
    public static final void method3278(int arg0) {
        field7896++;
        if (!class506.field7094) {
            return;
        }
        class347 var1 = class90.method717(class294.field4170, class658.field8875, (byte) -42);
        if (var1 != null && var1.field5025 != null) {
            class158 var2 = new class158();
            var2.field2128 = var1.field5025;
            var2.field2137 = var1;
            class727.method4005(var2);
        }
        class634.field8567 = -1;
        class506.field7094 = false;
        class2.field22 = arg0;
        if (var1 != null) {
            class151.method1062((byte) -116, var1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 49)
    public class579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field7899 = arg0;
        this.field7898 = (byte) arg8;
        this.field7891 = arg10;
        this.field7895 = (short) arg4;
        this.field7892 = arg9;
        this.field7897 = (short) arg6;
        this.field7893 = (short) arg5;
        this.field7894 = (byte) arg7;
    }
}
