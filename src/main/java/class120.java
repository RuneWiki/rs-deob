import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class120 {

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "[I")
    public static int[] field1493 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Lsd;")
    public static class74 field1491 = new class74(20, -2);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method581(String arg0, int arg1) throws ClassNotFoundException {
        field1492++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg1 != 30827) {
                field1491 = null;
            }
            if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILkd;)V")
    public static final void method582(int arg0, class355 arg1) {
        field1489++;
        class11 var2 = null;
        try {
            class405 var3 = arg1.method2154(-79);
            while (var3.field5759 == 0) {
                class85.method433(1L, 85);
            }
            if (~var3.field5759 == arg0) {
                var2 = (class11) var3.field5755;
                class179 var4 = class216.method1205((byte) -90);
                var2.method87(var4.field2159, var4.field2206, 0, 114);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method86((byte) -107);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1491 = null;
        if (arg0 != -2) {
            field1490 = -15;
        }
        field1493 = null;
    }
}
