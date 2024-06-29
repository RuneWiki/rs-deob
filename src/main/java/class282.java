import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class282 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field4183 = false;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[B")
    public static byte[] field4185 = new byte[2048];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1860(int arg0, int arg1) {
        field4182++;
        if (arg1 == 100 && class575.field8350 > 0) {
            byte[] var2 = class649.field9369[--class575.field8350];
            class649.field9369[class575.field8350] = null;
            return var2;
        } else if (~arg1 == arg0 && class620.field8980 > 0) {
            byte[] var3 = class483.field6918[--class620.field8980];
            class483.field6918[class620.field8980] = null;
            return var3;
        } else if (arg1 == 30000 && class677.field9616 > 0) {
            byte[] var4 = class499.field7103[--class677.field9616];
            class499.field7103[class677.field9616] = null;
            return var4;
        } else {
            if (class339.field5056 != null) {
                for (int var5 = 0; var5 < class264.field3868.length; var5++) {
                    if (class264.field3868[var5] == arg1 && class398.field5797[var5] > 0) {
                        byte[] var6 = class339.field5056[var5][--class398.field5797[var5]];
                        class339.field5056[var5][class398.field5797[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B[B)V")
    public static final synchronized void method1861(byte arg0, byte[] arg1) {
        if (arg0 > -119) {
            return;
        }
        field4184++;
        if (arg1.length == 100 && class575.field8350 < 1000) {
            class649.field9369[class575.field8350++] = arg1;
        } else if (arg1.length == 5000 && class620.field8980 < 250) {
            class483.field6918[class620.field8980++] = arg1;
        } else if (arg1.length == 30000 && class677.field9616 < 50) {
            class499.field7103[class677.field9616++] = arg1;
        } else if (class339.field5056 != null) {
            for (int var2 = 0; var2 < class264.field3868.length; var2++) {
                if (class264.field3868[var2] == arg1.length && class339.field5056[var2].length > class398.field5797[var2]) {
                    class339.field5056[var2][class398.field5797[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method1862(int arg0) {
        if (arg0 > -91) {
            method1863(null, -58);
        }
        field4185 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1863(byte[] arg0, int arg1) {
        if (arg1 != -31830) {
            method1861((byte) -111, null);
        }
        field4186++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class692.method3873(arg0, 0, var3, 0, var2);
        return var3;
    }
}
