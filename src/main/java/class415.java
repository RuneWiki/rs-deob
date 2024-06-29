import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class415 extends class120 {

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIII)V", line = 4)
    public static final void method2439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5689++;
        int var8 = arg6 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class740.field10254 - class377.field5279) * var8 / 100 + class377.field5279;
        int var10 = arg0 * var9 >> 8;
        class349.field4956 = class349.field4948 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        if (arg1 != -722150064) {
            return;
        }
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class253.field3634[var11] * -var10 >> 14;
            var15 = class253.field3633[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class253.field3634[var12] * var15 >> 14;
            var15 = class253.field3633[var12] * var15 >> 14;
        }
        class389.field5439 = 0;
        class286.field4204 = arg7 - var15;
        class642.field9037 = arg2;
        class243.field3482 = arg3 - var14;
        class99.field1437 = arg4;
        class733.field10199 = arg5 - var13;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lkja;Z)V", line = 63)
    public static final void method2440(class373 arg0, boolean arg1) {
        for (int var2 = 0; var2 < class518.field7114; var2++) {
            int var3 = class125.field2148[var2];
            class21 var4 = class588.field8451[var3];
            int var5 = arg0.method2557(14929);
            if ((var5 & 0x20) != 0) {
                var5 += arg0.method2557(14929) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg0.method2557(14929) << 16;
            }
            class58.method620(var3, (byte) 50, var5, arg0, var4);
        }
        field5690++;
        if (arg1) {
            method2440(null, false);
        }
    }
}
