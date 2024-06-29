import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class144 extends class333 {

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Z")
    public static final boolean method793(int arg0, int arg1, int arg2) {
        field1595++;
        if (arg2 != -1) {
            method793(75, -110, 14);
        }
        return class227.method1365(arg1, (byte) -124, arg0) | (arg0 & 0x70000) != 0 || class662.method3678(arg1, arg0, 8);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method794(boolean arg0, String arg1, boolean arg2) {
        field1597++;
        if (arg1 == null || arg0) {
            return;
        }
        if (class46.field482 >= 100) {
            class340.method1964(4, class198.field2324.method1195((byte) 62, class504.field7267), 119);
            return;
        }
        String var3 = class6.method44(arg1, (byte) -83);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class46.field482; var4++) {
            String var9 = class6.method44(class319.field3937[var4], (byte) -83);
            if (var9 != null && var9.equals(var3)) {
                class340.method1964(4, arg1 + class198.field2325.method1195((byte) 62, class504.field7267), 93);
                return;
            }
            if (class551.field7876[var4] != null) {
                String var10 = class6.method44(class551.field7876[var4], (byte) -83);
                if (var10 != null && var10.equals(var3)) {
                    class340.method1964(4, arg1 + class198.field2325.method1195((byte) 62, class504.field7267), 110);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class699.field9804; var5++) {
            String var7 = class6.method44(class703.field9867[var5], (byte) -83);
            if (var7 != null && var7.equals(var3)) {
                class340.method1964(4, class198.field2330.method1195((byte) 62, class504.field7267) + arg1 + class198.field2331.method1195((byte) 62, class504.field7267), 111);
                return;
            }
            if (class597.field8405[var5] != null) {
                String var8 = class6.method44(class597.field8405[var5], (byte) -83);
                if (var8 != null && var8.equals(var3)) {
                    class340.method1964(4, class198.field2330.method1195((byte) 62, class504.field7267) + arg1 + class198.field2331.method1195((byte) 62, class504.field7267), 123);
                    return;
                }
            }
        }
        if (class6.method44(class362.field4859.field2893, (byte) -83).equals(var3)) {
            class340.method1964(4, class198.field2327.method1195((byte) 62, class504.field7267), 98);
            return;
        }
        class152.field1680++;
        class653 var6 = class699.method3845((byte) 45, class39.field395, class197.field2272);
        var6.field9158.method658(class72.method382(2018672392, arg1) + 1, (byte) 125);
        var6.field9158.method672((byte) 74, arg1);
        var6.field9158.method658(arg2 ? 1 : 0, (byte) 107);
        class568.method3220(var6, (byte) 107);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(II)V")
    public class144(int arg0, int arg1) {
        this.field1596 = arg1;
        this.field1594 = arg0;
    }
}
