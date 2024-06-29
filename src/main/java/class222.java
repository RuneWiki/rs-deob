import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class222 {

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public static int[] field3384 = new int[25];

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3382 = "slide:";

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lii;")
    public static class250 field3383 = new class250(8);

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lgi;")
    public static class310 field3381;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Ljd;")
    public static class95 field3389;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lse;", line = 6)
    public static final class108 method1576(int arg0, byte arg1) {
        field3385++;
        class108 var2 = (class108) class67.field966.method747((long) arg0, (byte) 91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class255.field3897.method696(class158.method1187((byte) -31, arg0), (byte) 114, class176.method1328(arg0, arg1 - 5551));
        class108 var4 = new class108();
        var4.field1598 = arg0;
        if (var3 != null) {
            var4.method824(new class254(var3), arg1 + 22);
        }
        var4.method827(false);
        if (var4.field1571 != -1) {
            var4.method813(method1576(var4.field1571, (byte) 92), -1, method1576(var4.field1580, (byte) 92));
        }
        if (var4.field1636 != -1) {
            var4.method821(false, method1576(var4.field1568, (byte) 92), method1576(var4.field1636, (byte) 92));
        }
        if (!class278.field4323 && var4.field1575) {
            var4.field1581 = false;
            var4.field1611 = class134.field2041;
            var4.field1595 = class276.field4286;
            var4.field1635 = 0;
            var4.field1630 = class328.field5060;
        }
        class67.field966.method744(var4, -15692, (long) arg0);
        if (arg1 != 92) {
            method1579(-108);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "([Ljava/lang/Object;Z[I)V", line = 53)
    public static final void method1577(Object[] arg0, boolean arg1, int[] arg2) {
        class48.method363(arg2, arg0, 0, -769538808, arg2.length - 1);
        field3390++;
        if (arg1) {
            method1577((Object[]) null, true, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 68)
    public static final void method1578(int arg0) {
        class25.field276 = true;
        field3387++;
        if (arg0 != -13559) {
            field3382 = (String) null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 85)
    public static void method1579(int arg0) {
        field3389 = null;
        field3384 = null;
        field3381 = null;
        if (arg0 > 0) {
            field3383 = null;
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(IB)I", line = 100)
    public static final int method1580(int arg0, byte arg1) {
        field3386++;
        class207 var2 = class28.method212((byte) -96, arg0);
        int var3 = var2.field3174;
        int var4 = var2.field3181;
        int var5 = var2.field3182;
        int var6 = class23.field256[var5 - var4];
        if (arg1 < 43) {
            method1579(-35);
        }
        return class154.field2330[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I", line = 121)
    public static final int method1581(int arg0, int arg1) {
        if (arg1 != 1) {
            field3383 = (class250) null;
        }
        field3380++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V", line = 137)
    public static final void method1582(boolean arg0) {
        field3388++;
        class40.field586.method752(arg0);
    }
}
