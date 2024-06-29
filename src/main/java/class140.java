import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class140 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2027 = "Connecting to update server";

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2028 = -1;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZLve;)Le;")
    public static final class137 method931(int arg0, boolean arg1, class233 arg2) {
        if (!arg1) {
            field2028 = -127;
        }
        field2033++;
        byte[] var3 = arg2.method1514(arg0, -21664);
        return var3 == null ? null : new class137(var3);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method932(int arg0) {
        int var1 = 120 / ((arg0 - 2) / 32);
        field2027 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lth;B)V")
    public static final void method933(class72 arg0, byte arg1) {
        field2031++;
        if (arg1 != -9) {
            return;
        }
        for (class30 var2 = (class30) class210.field3019.method656(107); var2 != null; var2 = (class30) class210.field3019.method650(126)) {
            if (var2.field431 == arg0) {
                if (var2.field438 != null) {
                    class152.field2201.method279(var2.field438);
                    var2.field438 = null;
                }
                var2.method1706(-80);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method934(int arg0, boolean arg1) {
        field2030++;
        if (arg1) {
            return null;
        } else if (arg0 == 100 && class25.field331 > 0) {
            byte[] var2 = class103.field1536[--class25.field331];
            class103.field1536[class25.field331] = null;
            return var2;
        } else if (arg0 == 5000 && class214.field3082 > 0) {
            byte[] var3 = class172.field2464[--class214.field3082];
            class172.field2464[class214.field3082] = null;
            return var3;
        } else if (arg0 == 30000 && class269.field4205 > 0) {
            byte[] var4 = class153.field2208[--class269.field4205];
            class153.field2208[class269.field4205] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
