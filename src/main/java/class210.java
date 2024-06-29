import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class210 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3203 = -1;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
    public static int[] field3204 = new int[4096];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[S")
    public static short[] field3201;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 9)
    public static void method1428(int arg0) {
        field3201 = null;
        if (arg0 == -1) {
            field3204 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lsi;I)V", line = 22)
    public static final void method1429(class264 arg0, int arg1) {
        field3202++;
        class264 var2 = class268.method1886(12, arg0);
        if (arg1 != -1) {
            method1428(-27);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class243.field3838;
            var4 = class233.field3712;
        } else {
            var3 = var2.field4236;
            var4 = var2.field4223;
        }
        class46.method352(arg0, var4, var3, (byte) -110, false);
        class355.method2479((byte) -16, var4, arg0, var3);
    }
}
