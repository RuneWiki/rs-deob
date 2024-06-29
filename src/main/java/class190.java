import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class190 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2649 = "shake:";

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[C")
    public static char[] field2647 = new char[128];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
    public static boolean field2652 = false;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Ll;")
    public static class315 field2644;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 3)
    public static final void method1264(int arg0, int arg1, int arg2) {
        field2650++;
        if (arg1 != -2684) {
            field2644 = null;
        }
        class238 var3 = class144.field1829[arg0][arg2];
        if (var3 != null) {
            class132.field1735 = var3.field3345;
            class290.field4392 = var3.field3343;
            class321.field4785 = var3.field3336;
        }
        class184.method1195((byte) -24);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I", line = 26)
    public static final int method1265(int arg0) {
        field2651++;
        return arg0 == 23620 ? class162.field2150 : 61;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqc;BII)V", line = 37)
    public static final void method1266(class163 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 127) {
            return;
        }
        field2646++;
        if (arg0.field2148 == arg2 && arg2 != -1) {
            class233 var4 = class73.method597(arg2, arg1 ^ 0xFFFFFF80);
            int var5 = var4.field3239;
            if (var5 == 1) {
                arg0.field2132 = 0;
                arg0.field2151 = arg3;
                arg0.field2173 = 0;
                arg0.field2144 = 0;
                arg0.field2161 = 1;
                class379.method2476(arg0.field2144, false, false, arg0.field5930, var4, arg0.field5921);
            }
            if (var5 == 2) {
                arg0.field2173 = 0;
                return;
            }
        } else if (arg2 == -1 || arg0.field2148 == -1 || class73.method597(arg2, -1).field3250 >= class73.method597(arg0.field2148, -1).field3250) {
            arg0.field2144 = 0;
            arg0.field2151 = arg3;
            arg0.field2161 = 1;
            arg0.field2132 = 0;
            arg0.field2198 = arg0.field2202;
            arg0.field2173 = 0;
            arg0.field2148 = arg2;
            if (arg0.field2148 == -1) {
                return;
            }
            class379.method2476(arg0.field2144, false, false, arg0.field5930, class73.method597(arg0.field2148, -1), arg0.field5921);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 105)
    public static void method1269(int arg0) {
        field2647 = null;
        field2644 = null;
        if (arg0 != 0) {
            field2649 = null;
        }
        field2649 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BZ)V")
    public abstract void method1267(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1268(int arg0);
}
