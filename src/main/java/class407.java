import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class407 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Z")
    public static boolean field5593 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILcr;)V", line = 3)
    public static final void method2367(int arg0, class403 arg1) {
        field5592++;
        if (arg0 != -12319) {
            field5593 = false;
        }
        if (!class32.field529) {
            return;
        }
        if (arg1.field5437 != null) {
            class403 var2 = class381.method2261(arg0 ^ 0x19AE, class196.field2749, class94.field1415);
            if (var2 != null) {
                class353 var3 = new class353();
                var3.field4772 = arg1.field5437;
                var3.field4770 = arg1;
                var3.field4764 = var2;
                class122.method893(var3);
            }
        }
        class490.field6813++;
        class118.method822(92, class202.field2801);
        class193.field2708.method2214(arg0 + 12428, arg1.field5431);
        class193.field2708.method2246(arg1.field5553, (byte) -99);
        class193.field2708.method2241(0, arg1.field5530);
        class193.field2708.method2188(class94.field1415, 127);
        class193.field2708.method2214(73, class196.field2749);
        class193.field2708.method2198(class246.field3275, (byte) -23);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(FIF[FIFIIIIF)V")
    public abstract void method2368(float arg0, int arg1, float arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float arg10);
}
