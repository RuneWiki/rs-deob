import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class165 extends class489 {

    @OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
    public static int field2594 = 1;

    @OriginalMember(owner = "client!ada", name = "R", descriptor = "F")
    public static float field2596 = 1.0F;

    @OriginalMember(owner = "client!ada", name = "Q", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method1246(int arg0, byte arg1) {
        field2595++;
        if (arg1 > 109 && class722.method4007(arg0, (byte) 84)) {
            class500.method2947(-1, class396.field5798[arg0], 24235);
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIILaba;)V", line = 29)
    public static final void method1247(int arg0, int arg1, int arg2, class177 arg3) {
        class384 var4 = class410.method2541(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field5573 = arg3;
        int var5 = class683.field9250 == class344.field4822 ? 1 : 0;
        if (arg3.method45(-93)) {
            if (arg3.method49((byte) 122)) {
                arg3.field5924 = class391.field5762[var5];
                class391.field5762[var5] = arg3;
                return;
            }
            arg3.field5924 = class362.field5206[var5];
            class362.field5206[var5] = arg3;
            class30.field778 = true;
            return;
        }
        arg3.field5924 = class375.field5310[var5];
        class375.field5310[var5] = arg3;
    }
}
