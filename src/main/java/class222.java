import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class222 {

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "Z")
    public static boolean field3146 = false;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method1377(int arg0, byte arg1) {
        field3147++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1 == 106) {
            return class404.method2636(74, arg0);
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1378(int arg0, int arg1) {
        field3150++;
        if (class293.field4245 == arg1) {
            return;
        }
        class324.field4652 = class336.field4964 = class73.field988[arg1];
        class35.field574.method2097(50, (int) ((double) class324.field4652 * 34.46D));
        class395.field5941 = new int[class324.field4652][class336.field4964];
        class445.field6484 = new int[4][class324.field4652 >> 3][class336.field4964 >> 3];
        class313.field4477 = new int[class324.field4652][class336.field4964];
        for (int var2 = 0; var2 < 4; var2++) {
            class119.field1605[var2] = class139.method936(false, class324.field4652, class336.field4964);
        }
        class115.field1566 = new byte[4][class324.field4652][class336.field4964];
        class35.method288(class336.field4964, class324.field4652, arg0, (byte) 106);
        class309.method1932(class336.field4964 >> 3, class324.field4652 >> 3, 123, class35.field574);
        class293.field4245 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)[B", line = 52)
    public static final synchronized byte[] method1379(int arg0, int arg1) {
        field3149++;
        if (arg1 == 100 && class234.field3285 > 0) {
            byte[] var2 = class419.field6224[--class234.field3285];
            class419.field6224[class234.field3285] = null;
            return var2;
        }
        if (arg0 != -23323) {
            method1377(-90, (byte) -56);
        }
        if (arg1 == 5000 && class417.field6220 > 0) {
            byte[] var3 = class45.field668[--class417.field6220];
            class45.field668[class417.field6220] = null;
            return var3;
        } else if (arg1 == 30000 && class249.field3545 > 0) {
            byte[] var4 = class387.field5782[--class249.field3545];
            class387.field5782[class249.field3545] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V", line = 95)
    public static final void method1380(byte arg0) {
        field3145++;
        class24 var1 = class73.field989;
        synchronized (class73.field989) {
            if (arg0 < 90) {
                field3146 = true;
            }
            class73.field989.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIZ)I", line = 109)
    public static final int method1381(int arg0, int arg1, boolean arg2) {
        field3144++;
        int var3 = arg0 >>> 31;
        if (!arg2) {
            method1377(33, (byte) -103);
        }
        return (arg0 + var3) / arg1 - var3;
    }
}
