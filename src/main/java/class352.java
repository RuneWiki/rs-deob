import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class352 implements class169 {

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "F")
    public static float field4942;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[I")
    public static int[] field4945;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "[[B")
    public static byte[][] field4941;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V", line = 6)
    public static void method2132(int arg0) {
        field4941 = null;
        field4945 = null;
        if (arg0 != 15463) {
            field4945 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lkq;", line = 18)
    public final class696 method726(int arg0) {
        field4943++;
        if (arg0 != -17) {
            field4941 = null;
        }
        return class333.field4636;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V", line = 31)
    public static final void method2133(int arg0, boolean arg1) {
        field4938++;
        if (class256.field3696 != null) {
            class256.field3696.method913(-10406);
            class256.field3696 = null;
        }
        class160.field2597 = 0;
        class293.method1795((byte) -106);
        class9.method52();
        for (int var2 = 0; var2 < 4; var2++) {
            class45.field609[var2].method3165(true);
        }
        class385.method2353((byte) 118, false);
        System.gc();
        class16.method193(arg0 ^ 0x7D4B, 2);
        class369.field5120 = false;
        class283.field3963 = -1;
        class468.method2768((byte) -110);
        if (arg0 != 32074) {
            return;
        }
        class136.method1041(-112, true);
        class443.field6420 = 0;
        class121.field1983 = 0;
        class521.field7681 = 0;
        class63.field917 = 0;
        class143.field2474 = 0;
        class316.field4372 = 0;
        for (int var3 = 0; var3 < class481.field6873.length; var3++) {
            class481.field6873[var3] = null;
        }
        class700.method3939(arg0 ^ 0xFFFF82CF);
        for (int var4 = 0; var4 < 2048; var4++) {
            class76.field1186[var4] = null;
        }
        class310.field4304 = 0;
        class314.field4359.method2821(1);
        class392.field5702 = 0;
        class480.field6870.method2821(arg0 - 32073);
        class25.method242(0);
        class189.field2958 = 0;
        class230.field3404.method1422((byte) -49);
        class451.method2627((byte) -30);
        class568.method3319((byte) 97);
        class586.field8574 = 0L;
        class533.field7844 = null;
        if (arg1) {
            class595.method3408((byte) 87, 12);
            return;
        }
        class595.method3408((byte) 80, 3);
        try {
            class157.method1180((byte) 92, class492.field7063, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IBI)Z", line = 110)
    public static final boolean method2134(int arg0, byte arg1, int arg2) {
        field4940++;
        if (arg1 >= -116) {
            return true;
        } else {
            return (arg0 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Z", line = 122)
    public static final boolean method2135(int arg0, byte arg1) {
        field4939++;
        if (arg1 == -122) {
            return arg0 == 7 || arg0 == 8 || arg0 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(I)V", line = 134)
    public class352(int arg0) {
        this.field4944 = arg0;
    }
}
