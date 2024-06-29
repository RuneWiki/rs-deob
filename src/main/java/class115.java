import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class115 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lr;")
    private static class66 field2171 = class93.method641(43, "red:");

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lr;")
    public static class66 field2174 = field2171;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
    public static boolean field2177 = false;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Lr;")
    public static class66 field2170 = field2171;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lsg;")
    public static class247 field2173;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[S")
    public static short[] field2176;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method765(int arg0) {
        if (arg0 != 0) {
            field2174 = null;
        }
        field2173 = null;
        field2171 = null;
        field2170 = null;
        field2174 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method766(boolean arg0, byte arg1, byte[] arg2) {
        int var3 = -25 % ((-arg1 - 73) / 52);
        field2175++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class263.field4614) {
            try {
                class109 var4 = (class109) Class.forName("eg").getDeclaredConstructor().newInstance();
                var4.method441(arg2, true);
                return var4;
            } catch (Throwable var5) {
                class263.field4614 = true;
            }
        }
        return arg0 ? class86.method614(arg2, false) : arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static int method767(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
