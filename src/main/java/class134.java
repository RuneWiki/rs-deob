import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class134 extends class320 {

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field1973;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "[I")
    public static int[] field1968 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "[Z")
    public static boolean[] field1963 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1965 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "[Lqd;")
    public static class200[] field1970 = new class200[4];

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field1966;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "Z")
    public static boolean field1971;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "[[[B")
    public static byte[][][] field1969;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IZILnm;)V", line = 4)
    public static final void method980(int arg0, boolean arg1, int arg2, class212 arg3) {
        field1967++;
        if (arg1) {
            method980(121, false, -124, (class212) null);
        }
        if (arg3.field4653 == arg2 && arg2 != -1) {
            class281 var4 = class295.method2064(0, arg2);
            int var5 = var4.field4321;
            if (var5 == 1) {
                arg3.field4711 = 0;
                arg3.field4648 = 0;
                arg3.field4655 = 0;
                arg3.field4739 = arg0;
                arg3.field4719 = 1;
                class91.method658(var4, true, false, arg3.field4698, arg3.field4648, arg3.field4731);
            }
            if (var5 == 2) {
                arg3.field4711 = 0;
            }
        } else if (arg2 == -1 || arg3.field4653 == -1 || class295.method2064(0, arg2).field4338 >= class295.method2064(0, arg3.field4653).field4338) {
            arg3.field4653 = arg2;
            arg3.field4655 = 0;
            arg3.field4739 = arg0;
            arg3.field4695 = arg3.field4710;
            arg3.field4711 = 0;
            arg3.field4719 = 1;
            arg3.field4648 = 0;
            if (arg3.field4653 != -1) {
                class91.method658(class295.method2064(0, arg3.field4653), !arg1, false, arg3.field4698, arg3.field4648, arg3.field4731);
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "(I)Z", line = 66)
    public final boolean method335(int arg0) {
        field1964++;
        if (arg0 <= 21) {
            method980(76, true, 100, (class212) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 85)
    public final Object method334(int arg0) {
        field1972++;
        if (arg0 != 16349) {
            this.method335(-36);
        }
        return this.field1973;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V", line = 101)
    public static void method981(byte arg0) {
        field1966 = null;
        if (arg0 != -94) {
            field1970 = (class200[]) null;
        }
        field1970 = null;
        field1963 = null;
        field1969 = (byte[][][]) null;
        field1965 = null;
        field1968 = null;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 124)
    public class134(Object arg0) {
        this.field1973 = arg0;
    }
}
