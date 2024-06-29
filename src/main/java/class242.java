import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class242 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
    public static short[] field3532 = new short[256];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBII)V")
    public static final void method1674(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3530++;
        if (arg2 < 66) {
            method1674(119, -53, (byte) -62, 54, -62);
        }
        if (arg1 >= class140.field2314 && class536.field7419 >= arg1) {
            int var5 = class486.method2865(class479.field6682, arg0, class58.field1150, -123);
            int var6 = class486.method2865(class479.field6682, arg4, class58.field1150, 123);
            class344.method2168(var6, var5, -76, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field3532 = null;
        if (arg0 < 118) {
            field3532 = null;
        }
    }
}
