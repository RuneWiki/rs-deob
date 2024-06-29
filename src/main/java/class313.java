import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class313 extends class251 {

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
    public static boolean field4658 = false;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Z")
    public static boolean field4662 = false;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[Z")
    public static boolean[] field4661 = new boolean[200];

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZ)V", line = 11)
    public static final void method2187(int arg0, int arg1, int arg2, boolean arg3) {
        class110 var4 = class96.method758(arg0, (byte) -96, arg1, arg2);
        field4657++;
        if (arg3 || var4 == null) {
            return;
        }
        class318.field4791 = new String[var4.field1604];
        class191.field2780 = new int[var4.field1598];
        if (var4.field1597 == 15 || var4.field1597 == 17 || var4.field1597 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class197.field2855 != null) {
                var5 = class197.field2855.field5495;
                var6 = class197.field2855.field5585;
            }
            class191.field2780[1] = class165.field2353 - var6;
            class191.field2780[0] = class56.field815 - var5;
        }
        class257.method1895(200000, var4, 4);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V", line = 46)
    public static void method2188(byte arg0) {
        if (arg0 != -68) {
            field4662 = false;
        }
        field4661 = null;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)V", line = 59)
    public static final void method2189(int arg0, int arg1) {
        class95 var2 = class227.method1699(arg0, arg0 - 1855723182, arg1);
        field4660++;
        var2.method743(arg0 - 14);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqf;IIZ)V", line = 71)
    public static final void method2190(class359 arg0, int arg1, int arg2, boolean arg3) {
        field4664++;
        if (!arg3 || class331.field5041 != null || class15.field246 || arg0 == null || class248.method1826(arg0, (byte) 46) == null) {
            return;
        }
        class331.field5041 = arg0;
        class51.field764 = class248.method1826(arg0, (byte) 21);
        class175.field2515 = false;
        class355.field5447 = arg1;
        class32.field464 = 0;
        class117.field1663 = arg2;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)J", line = 98)
    public static final long method2191(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null || var3.field2390 == null ? 0L : var3.field2390.field1195;
    }
}
