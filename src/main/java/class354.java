import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class354 extends class312 {

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Z")
    public static boolean field4824 = false;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4827 = 0;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[Lf;")
    public static class529[] field4830;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lbs;II)V", line = 4)
    public static final void method1960(class483 arg0, int arg1, int arg2) {
        field4828++;
        int var3 = 56 / ((arg2 + 58) / 60);
        if (class408.field5647) {
            arg1 = 0;
            class408.field5647 = false;
        }
        if (class83.field1158 != null && class83.field1158.method2851((byte) -49, arg0)) {
            return;
        }
        class83.field1158 = arg0;
        class66.field914 = class333.method1850(-3562);
        class509.field7473 = arg1;
        class16.field175 = arg1;
        if (class16.field175 == 0) {
            class164.method1020(true);
            return;
        }
        class83.field1157 = class107.field1466;
        class88.field1209 = class95.field1309;
        class337.field4648 = class118.field1588;
        class302.field4141 = class168.field2380;
        class350.field4792 = class365.field5131;
        class346.field4745 = class378.field5319;
        class159.field2285 = class238.field3272;
        class113.field1534 = class66.field916;
        class131.field1802 = class13.field164;
        class97.field1344 = class66.field913;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V", line = 48)
    public static final void method1961(int arg0, byte arg1) {
        field4825++;
        if (arg1 <= 39) {
            method1961(-109, (byte) -76);
        }
        class279.field3768 = -1;
        class52.field706 = 100;
        class210.field2971 = arg0;
        class319.field4418 = 3;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLlh;)V", line = 62)
    public static final void method1962(boolean arg0, class365 arg1) {
        field4829++;
        if (!arg0) {
            field4830 = null;
        }
        for (int var2 = 0; var2 < class91.field1227; var2++) {
            int var3 = arg1.method2065(false);
            int var4 = arg1.method2062((byte) 14);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class377.field5317[var3] != null) {
                class377.field5317[var3].field3239 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 91)
    public static void method1963(int arg0) {
        if (arg0 != 28746) {
            field4827 = 83;
        }
        field4830 = null;
    }
}
