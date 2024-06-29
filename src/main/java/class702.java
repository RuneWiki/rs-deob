import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class702 {

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "[S")
    private static short[] field9894 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "[S")
    private static short[] field9897 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "[S")
    private static short[] field9896 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "[S")
    private static short[] field9893 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "[[S")
    public static short[][] field9890 = new short[][] { field9897, field9894, field9893, field9896 };

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "Llj;")
    public static class570 field9895 = new class570(6, 0, 4, 2);

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field9898;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 3)
    public static void method3884(int arg0) {
        field9890 = null;
        field9896 = null;
        field9893 = null;
        field9894 = null;
        field9895 = null;
        if (arg0 != 4309) {
            field9893 = null;
        }
        field9897 = null;
        field9898 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V", line = 28)
    public static final void method3885(byte arg0) {
        field9891++;
        int var1 = 0;
        if (arg0 != -98) {
            field9894 = null;
        }
        if (class344.field4718 != null) {
            var1 = class344.field4718.method1558((byte) 90, class571.field7587);
        }
        if (var1 == 2) {
            int var4 = class559.field7427 > 800 ? 800 : class559.field7427;
            int var5 = class164.field2569 > 600 ? 600 : class164.field2569;
            class367.field4976 = (class559.field7427 - var4) / 2;
            class627.field8461 = var4;
            class149.field2387 = var5;
            class251.field3464 = 0;
        } else if (var1 == 1) {
            int var2 = class559.field7427 <= 1024 ? class559.field7427 : 1024;
            int var3 = class164.field2569 > 768 ? 768 : class164.field2569;
            class367.field4976 = (class559.field7427 - var2) / 2;
            class627.field8461 = var2;
            class149.field2387 = var3;
            class251.field3464 = 0;
        } else {
            class251.field3464 = 0;
            class367.field4976 = 0;
            class627.field8461 = class559.field7427;
            class149.field2387 = class164.field2569;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)Z", line = 90)
    public static final boolean method3886(int arg0, byte arg1) {
        field9892++;
        if (arg1 != 34) {
            return true;
        } else if (arg0 == 8 || arg0 == 20 || arg0 == 18 || arg0 == 44 || arg0 == 51) {
            return true;
        } else {
            return arg0 == 25 || arg0 == 1012;
        }
    }
}
