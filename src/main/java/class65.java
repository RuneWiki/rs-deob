import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class65 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1234 = 0;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1232 = Calendar.getInstance();

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Z")
    public static boolean field1236 = false;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field1241 = 0;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 6)
    public static final void method518(byte arg0) {
        class214.method1492((long) class267.field4371);
        if (arg0 != 55) {
            field1234 = -73;
        }
        field1235++;
        if (class88.field1566 != -1) {
            class344.method2418(class88.field1566, (byte) -86);
        }
        for (int var1 = 0; var1 < class87.field1522; var1++) {
            if (class213.field3524[var1]) {
                class117.field2084[var1] = true;
            }
            class237.field3877[var1] = class213.field3524[var1];
            class213.field3524[var1] = false;
        }
        class284.field4633 = -1;
        class353.field5640 = -1;
        class275.field4488 = null;
        client.field4594 = class267.field4371;
        if (class241.field4016) {
            class44.field911 = true;
        }
        if (class88.field1566 != -1) {
            class87.field1522 = 0;
            class72.method549(2);
        }
        if (class241.field4016) {
            class337.method2374();
        } else {
            class270.method1910();
        }
        class197.field3303 = 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 56)
    public static void method519(int arg0) {
        if (arg0 != -4391) {
            field1241 = 92;
        }
        field1232 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 74)
    public static final void method520(int arg0) {
        class349.field5586.method2429(true);
        field1237++;
        class257.field4202 = null;
        class222.field3671 = 1;
        int var1 = -24 / ((arg0 - 13) / 61);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILoe;B)Ljava/lang/String;", line = 94)
    public static final String method521(int arg0, class146 arg1, byte arg2) {
        field1233++;
        try {
            if (arg2 != 98) {
                method518((byte) -126);
            }
            int var3 = arg1.method1020(true);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field2435 += class56.field1112.method2301((byte) 72, var3, arg1.field2496, arg1.field2435, var4, 0);
            return class199.method1362(0, var3, var4, 2);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
