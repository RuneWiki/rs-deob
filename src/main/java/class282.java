import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class282 {

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "Lmaa;")
    public static class508 field4089 = new class508(12, 4);

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "[I")
    public static int[] field4090 = new int[4096];

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field4088;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4090[var0] = class526.method3129(true, var0);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V", line = 7)
    public static void method1881(int arg0) {
        int var1 = 84 % ((-arg0 - 76) / 48);
        field4089 = null;
        field4090 = null;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BIIII)V", line = 17)
    public static final void method1882(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4087++;
        if (arg0 != 34) {
            method1883(-105, (byte) 20, -5);
        }
        for (int var5 = 0; var5 < class381.field5461; var5++) {
            Rectangle var6 = class210.field2741[var5];
            if (arg4 < (var6.x + var6.width) && arg4 + arg3 > var6.x && (var6.y + var6.height) > arg2 && (arg2 + arg1) > var6.y) {
                class669.field9236[var5] = true;
            }
        }
        class483.method2944(arg3 + arg4, arg1 + arg2, arg4, arg2, arg0 - 35);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBI)I", line = 42)
    public static final int method1883(int arg0, byte arg1, int arg2) {
        field4088++;
        int var3 = arg2 >>> 31;
        if (arg1 > -25) {
            field4089 = null;
        }
        return (arg2 + var3) / arg0 - var3;
    }
}
