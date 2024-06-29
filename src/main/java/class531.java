import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class531 {

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field7487 = 0;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Lrda;")
    public static class692 field7485;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field7490;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
    public static final int method3162(int arg0) {
        field7486++;
        if (arg0 != 8306) {
            method3164(20);
        }
        class66 var1 = class363.field4526;
        boolean var2 = false;
        if (class118.field1503.field10665.method1903(arg0 - 8306) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class151.method1082(null, 0, false, 0, null, var3);
            var2 = true;
        }
        long var4 = class349.method2069(true);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method554(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class349.method2069(true) - var4);
        var1.method600(0, 0, 785580130, -16777216, 100, 100);
        if (var2) {
            var1.method559((byte) 1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([Ltf;I)V")
    public static final void method3163(class312[] arg0, int arg1) {
        field7489++;
        class495.field6889 = arg0.length;
        class256.field3026 = new class312[class495.field6889 + 10];
        class644.field8774 = new int[class495.field6889 + 10];
        class211.method1335(arg0, 0, class256.field3026, 0, class495.field6889);
        if (arg1 != -25468) {
            return;
        }
        for (int var2 = 0; var2 < class495.field6889; var2++) {
            class644.field8774[var2] = class256.field3026[var2].method1636();
        }
        for (int var3 = class495.field6889; var3 < class256.field3026.length; var3++) {
            class644.field8774[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7488++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
    public static final void method3164(int arg0) {
        if (class521.field7389.field9260) {
            class730.field10230 = 96;
        } else {
            try {
                Method var1 = (field7490 == null ? (field7490 = method3168("java.lang.Runtime")) : field7490).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class730.field10230 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 == -13918) {
            field7482++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FIIFIFLfba;IFFB)[B")
    public static final byte[] method3165(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, class27 arg6, int arg7, float arg8, float arg9, byte arg10) {
        if (arg10 >= -122) {
            field7487 = -79;
        }
        field7483++;
        byte[] var11 = new byte[arg1 * arg4 * arg2];
        class677.method3811(0, arg5, arg7, arg6, arg2, arg0, var11, arg9, arg1, arg4, 0, arg3, arg8);
        return var11;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public static void method3166(byte arg0) {
        int var1 = -3 % ((arg0 - 29) / 47);
        field7485 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZII)V")
    public static final void method3167(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field7487 = 92;
        }
        int var4 = class118.field1503.field10668.method1581(0) * arg3 >> 8;
        field7484++;
        if (var4 == 0 || arg2 == -1) {
            return;
        }
        if (!class52.field712 && class36.field542 != -1 && class728.method4115((byte) 119) && !class144.method1060((byte) -124)) {
            class604.field8150 = class367.method2135(-77);
            class502 var5 = class82.method774(class604.field8150, 95);
            class455.method2752(true, var5, (byte) -98);
        }
        class227.method1391(class385.field4939, 0, (byte) -101, var4, false, arg2);
        class459.method2778(-1, 255, 0);
        class52.field712 = true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3168(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
