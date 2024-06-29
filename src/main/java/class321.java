import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class321 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field5495 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    public static int[] field5494;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Lvb;", line = 10)
    public static final class74 method2230(int arg0, byte arg1) {
        field5496++;
        class74 var2 = (class74) class117.field2054.method2077(-13408, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field2223.method1016(class150.method1125((byte) -123, arg0), 100, class183.method1340((byte) 125, arg0));
        class74 var4 = new class74();
        var4.field1385 = arg0;
        if (var3 != null) {
            var4.method561(9431, new class41(var3));
        }
        var4.method555(83);
        if (arg1 > -23) {
            return (class74) null;
        } else {
            class117.field2054.method2074(var4, (long) arg0, -1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 38)
    public static void method2231(int arg0) {
        field5494 = null;
        int var1 = -43 / ((arg0 - 31) / 36);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)[Lab;", line = 61)
    public static final class290[] method2232(byte arg0) {
        field5497++;
        if (arg0 > -46) {
            return (class290[]) null;
        }
        class290[] var1 = new class290[class38.field691];
        for (int var2 = 0; var2 < class38.field691; var2++) {
            if (class253.field4323) {
                var1[var2] = new class2(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], class6.field92[var2], class305.field5270);
            } else {
                var1[var2] = new class232(class142.field2486, class153.field2740, class13.field172[var2], class307.field5283[var2], class94.field1692[var2], class62.field1093[var2], class6.field92[var2], class305.field5270);
            }
        }
        class183.method1343(255);
        return var1;
    }
}
