import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class162 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[J")
    public static long[] field2626 = new long[100];

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field2633 = 1;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public static int[] field2631;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1217(boolean arg0) {
        field2631 = null;
        if (arg0) {
            field2633 = -91;
        }
        field2626 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 19)
    public static final void method1218(Component arg0, byte arg1) {
        field2628++;
        Method var2 = class6.field103;
        if (arg1 >= -109) {
            field2626 = (long[]) null;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class121.field1857);
        arg0.addFocusListener(class121.field1857);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 78)
    public static final void method1219(int arg0) {
        field2632++;
        class85.field1236.method1141((byte) 51, 6);
        class85.field1236.method1738((byte) 68, 0L);
        if (arg0 != 45) {
            field2633 = 109;
        }
        class172.field2770++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 97)
    public static final void method1220(int arg0, int arg1) {
        field2627++;
        class330.field5072.method741(arg0, (byte) -126);
        class121.field1862.method741(arg0, (byte) -108);
        if (arg1 != 128) {
            field2626 = (long[]) null;
        }
        class91.field1321.method741(arg0, (byte) -95);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljd;I)Z", line = 120)
    public static final boolean method1221(class95 arg0, int arg1) {
        if (arg1 != 29243) {
            method1217(false);
        }
        field2630++;
        return arg0.method707(class67.field976, (byte) 127);
    }
}
