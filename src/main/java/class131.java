import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class131 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lqd;")
    public static class40 field2230 = class147.method1106(": ", (byte) -73);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 7)
    public static void method968(int arg0) {
        if (arg0 != 23989) {
            field2230 = (class40) null;
        }
        field2230 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 18)
    public static final boolean method969(int arg0) {
        field2229++;
        if (arg0 != 0) {
            field2230 = (class40) null;
        }
        try {
            if (class52.field1017 == 2) {
                if (class20.field339 == null) {
                    class20.field339 = class35.method304(class109.field1913, class309.field5182, class62.field1182);
                    if (class20.field339 == null) {
                        return false;
                    }
                }
                if (class282.field4755 == null) {
                    class282.field4755 = new class250(class306.field5137, class89.field1607);
                }
                if (class202.field3206.method614(class45.field877, 22050, (byte) -120, class20.field339, class282.field4755)) {
                    class202.field3206.method595(-1);
                    class202.field3206.method627(class95.field1708, (byte) -115);
                    class202.field3206.method591(class20.field339, true, class207.field3309);
                    class109.field1913 = null;
                    class52.field1017 = 0;
                    class20.field339 = null;
                    class282.field4755 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class202.field3206.method597((byte) -114);
            class282.field4755 = null;
            class52.field1017 = 0;
            class109.field1913 = null;
            class20.field339 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)V", line = 68)
    public static final void method970(int arg0, int arg1, int arg2) {
        field2228++;
        class192.field3098[arg1] = arg0;
        class170 var3 = (class170) class7.field100.method1405((byte) 115, (long) arg1);
        if (arg2 >= -36) {
            method969(-1);
        }
        if (var3 == null) {
            class170 var4 = new class170(class69.method535(true) + 500L);
            class7.field100.method1396(-19928, (long) arg1, var4);
        } else {
            var3.field2791 = class69.method535(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 103)
    public static final void method971(int arg0, int arg1) {
        field2231++;
        if (arg1 == 23141 && class303.field5075 == null || class303.field5075.length < arg0) {
            class303.field5075 = new int[arg0];
        }
    }
}
