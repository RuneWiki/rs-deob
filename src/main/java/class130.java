import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class130 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2047 = 2;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2048 = "Checking for updates - ";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lal;")
    public static class52 field2044 = new class52(30);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 7)
    public static void method958(int arg0) {
        if (arg0 == 2) {
            field2044 = null;
            field2048 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lmo;BLmo;)V", line = 18)
    public static final void method959(class447 arg0, byte arg1, class447 arg2) {
        class89.field1116 = arg2;
        field2045++;
        class354.field5452 = arg0;
        int var3 = -125 / ((-arg1 - 40) / 57);
        class89.field1116.method2758(36, 14535);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[B", line = 44)
    public static final synchronized byte[] method960(byte arg0, int arg1) {
        field2046++;
        if (arg0 != 36) {
            method960((byte) 69, 64);
        }
        if (arg1 == 100 && class250.field4082 > 0) {
            byte[] var2 = class224.field3733[--class250.field4082];
            class224.field3733[class250.field4082] = null;
            return var2;
        } else if (arg1 == 5000 && class115.field1600 > 0) {
            byte[] var3 = class265.field4265[--class115.field1600];
            class265.field4265[class115.field1600] = null;
            return var3;
        } else if (arg1 == 30000 && class203.field3277 > 0) {
            byte[] var4 = class245.field4022[--class203.field3277];
            class245.field4022[class203.field3277] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
