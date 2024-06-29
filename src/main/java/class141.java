import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class141 extends class209 {

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "Lgk;")
    public static class265 field2180 = null;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "Luf;")
    public static class168 field2181 = class148.method1019(-1720, "leuchten1:");

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field2178 = 0;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Luf;")
    private static class168 field2185 = class148.method1019(-1720, "scroll:");

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Luf;")
    public static class168 field2179 = field2185;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "Luf;")
    public static class168 field2182 = field2185;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Luf;")
    public static class168 field2186 = class148.method1019(-1720, "document)3cookie=(R");

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "Ldk;")
    public static class241 field2177;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIILdk;)[Lha;", line = 6)
    public static final class49[] method970(byte arg0, int arg1, int arg2, class241 arg3) {
        field2184++;
        if (arg0 != 86) {
            method970((byte) -98, -61, 96, (class241) null);
        }
        return class28.method148(arg1, arg3, arg2, arg0 ^ 0xFFFFFF8C) ? class57.method321(2) : null;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 20)
    public static final void method971(int arg0) {
        class194.field3147.method1431((byte) 126);
        if (arg0 > -56) {
            field2179 = (class168) null;
        }
        field2183++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 32)
    public static void method973(boolean arg0) {
        field2177 = null;
        field2186 = null;
        field2185 = null;
        field2179 = null;
        field2182 = null;
        field2180 = null;
        field2181 = null;
        if (arg0) {
            field2182 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method972(int arg0);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Z")
    public abstract boolean method974(int arg0);
}
