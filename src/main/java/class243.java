import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class class243 {

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)V", line = 6)
    public static final void method1582(int arg0, byte arg1, int arg2) {
        if (arg1 != 16) {
            method1587(-128);
        }
        field3496++;
        class54 var3 = class442.method2651(arg2, 14, -13208);
        var3.method480(0);
        var3.field934 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIZ)V", line = 20)
    public static final void method1583(int arg0, int arg1, boolean arg2) {
        field3495++;
        class328 var3 = class475.method2847(arg0, arg2, (byte) 118);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 <= 21) {
            return;
        }
        while (var3.field4957.length > var4) {
            var3.field4957[var4] = -1;
            var3.field4960[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1587(int arg0) {
        field3497++;
        if (class427.field6349 != null) {
            class427.field6349.method663(32);
        }
        if (class199.field2921 != null) {
            class199.field2921.method663(32);
        }
        if (arg0 != 0) {
            method1587(-116);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)Z")
    public abstract boolean method1584(int arg0, int arg1);

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Lec;")
    public abstract class156 method1585(byte arg0);

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public abstract void method1586(byte arg0);

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(B)V")
    public abstract void method1588(byte arg0);
}
