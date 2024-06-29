import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 extends OutputStream {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lrh;")
    public static class275 field824 = new class275(9, 0, 4, 1);

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
    public static boolean field827 = false;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIILwq;)V", line = 5)
    public static final void method370(boolean arg0, int arg1, int arg2, class176 arg3) {
        if (class26.field382) {
            class330 var4 = class466.field6628 == -1 ? null : class788.field10824.method1609(class466.field6628, -70);
            if (client.method2049(arg3).method3750((byte) -101) && (class641.field9043 & 0x20) != 0 && (var4 == null || arg3.method1316((byte) 123, var4.field4920, class466.field6628) != var4.field4920)) {
                class502.method2933(57, class373.field5373 + " -> " + arg3.field2662, true, arg3.field2540, 6947, class361.field5239, class75.field1013, (long) (arg3.field2588 | arg3.field2612 << 0), false, false, arg3.field2612, arg3.field2588, 0L);
                class509.field7254++;
            }
        }
        field826++;
        int var5 = 9;
        if (!arg0) {
            return;
        }
        while (var5 >= 5) {
            String var9 = class766.method4216(arg3, var5, -1);
            if (var9 != null) {
                class114.field1434++;
                class502.method2933(1009, arg3.field2662, true, arg3.field2540, 6947, var9, class25.method194(var5, arg3, (byte) 91), (long) (arg3.field2612 << 0 | arg3.field2588), false, false, arg3.field2612, arg3.field2588, (long) (var5 + 1));
            }
            var5--;
        }
        String var6 = class573.method3324((byte) 122, arg3);
        if (var6 != null) {
            class316.field4711++;
            class502.method2933(60, arg3.field2662, true, arg3.field2540, 6947, var6, arg3.field2651, (long) (arg3.field2612 << 0 | arg3.field2588), false, false, arg3.field2612, arg3.field2588, 0L);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class766.method4216(arg3, var7, -1);
            if (var8 != null) {
                class502.method2933(19, arg3.field2662, true, arg3.field2540, 6947, var8, class25.method194(var7, arg3, (byte) 86), (long) (arg3.field2588 | arg3.field2612 << 0), false, false, arg3.field2612, arg3.field2588, (long) (var7 + 1));
                class114.field1434++;
            }
        }
        if (!client.method2049(arg3).method3753(10)) {
            return;
        }
        if (arg3.field2503 == null) {
            class502.method2933(10, "", true, arg3.field2540, 6947, class674.field9561.method3825((byte) -10, class526.field7494), -1, (long) (arg3.field2612 << 0 | arg3.field2588), false, false, arg3.field2612, arg3.field2588, 0L);
        } else {
            class502.method2933(10, "", true, arg3.field2540, 6947, arg3.field2503, -1, (long) (arg3.field2612 << 0 | arg3.field2588), false, false, arg3.field2612, arg3.field2588, 0L);
        }
        class683.field9706++;
    }

    @OriginalMember(owner = "client!vg", name = "write", descriptor = "(I)V", line = 81)
    public final void write(int arg0) throws IOException {
        field823++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 91)
    public static void method371(boolean arg0) {
        if (!arg0) {
            field824 = null;
        }
        field824 = null;
    }
}
