import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class146 extends class695 implements class761 {

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field1946;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "[[B")
    public static byte[][] field1945;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "[[[J")
    public static long[][][] field1947;

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lwh;ILjaclib/memory/Buffer;)V", line = 6)
    public class146(class148 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field1942 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lwh;I[BI)V", line = 14)
    public class146(class148 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1942 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)J", line = 28)
    public final long method941(int arg0) {
        if (arg0 != 19512) {
            return 85L;
        } else {
            ++field1943;
            return super.field9589.getAddress();
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V", line = 39)
    public static void method1016(boolean arg0) {
        field1946 = null;
        field1945 = null;
        if (arg0) {
            field1945 = null;
        }
        field1947 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I", line = 53)
    public final int method942(byte arg0) {
        ++field1948;
        if (arg0 >= -116) {
            field1947 = null;
        }
        return this.field1942;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I", line = 64)
    public final int method951(int arg0) {
        if (arg0 <= 35) {
            method1016(false);
        }
        ++field1941;
        return 0;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)Ltl;", line = 75)
    public static final class622 method1017(byte arg0) {
        ++field1940;
        if (class84.field1180 != null && class48.field691 != null) {
            class48.field691.method124(128, class84.field1180);
            class622 var1 = (class622) class48.field691.method126(-14656);
            if (var1 == null) {
                return null;
            } else {
                class519 var2 = class84.field1175.method864(114, var1.field8729);
                if (arg0 < 78) {
                    method1017((byte) -112);
                }
                return var2 != null && var2.field7409 && var2.method3065(class84.field1176, -111) ? var1 : class642.method3680(36);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[BI)V", line = 103)
    public final void method947(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 5089) {
            field1945 = null;
        }
        this.method3940(arg2, arg1);
        ++field1944;
        this.field1942 = arg0;
    }
}
