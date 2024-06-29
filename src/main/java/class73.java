import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class73 implements class489 {

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!jv", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field1132++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)I", line = 16)
    public static final int method549(int arg0, int arg1) {
        field1134++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            if (arg0 != -6411) {
                method550((byte) 101, 73);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V", line = 52)
    public static final void method550(byte arg0, int arg1) {
        field1131++;
        if (arg0 <= -10) {
            class382 var2 = class396.method2276(-22, 9, arg1);
            var2.method2228((byte) -55);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 72)
    public class73(String arg0, int arg1) {
        this.field1135 = arg1;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V", line = 82)
    public static final void method551(boolean arg0) {
        field1130++;
        class98.field1479.method3316(4, 5);
        class139.field2246.method1280(86, 5);
        class133.field2174.method528(5, 29057);
        class470.field6288.method1263((byte) 112, 5);
        class239.field3369.method282(true, 5);
        class193.field2826.method1045(5, 50);
        class636.field8570.method234(5, (byte) -95);
        class120.field2028.method3724(arg0, 5);
        class392.field5167.method609(-2821, 5);
        class597.field7937.method2928((byte) -107, 5);
        class674.field9537.method2321(5, true);
        class521.field6960.method1489(5, true);
        class457.field6215.method1594(5, (byte) -47);
        class282.field4001.method3059(103, 5);
        class156.field2470.method924(64, 5);
        class152.field2405.method1005((byte) 105, 5);
        class328.field4518.method2139(arg0, 5);
        class428.field5877.method2600((byte) -52, 5);
        class397.field5279.method3246((byte) -96, 5);
        class410.field5535.method721(!arg0, 5);
        class215.method1374(5, (byte) 79);
        class247.method1514((byte) -22, 50);
        class82.method681((byte) 99, 50);
        class690.method3837(5, -51);
        class66.method527(27555, 5);
        class24.field400.method3740((byte) 60, 5);
        class190.field2793.method3740((byte) 60, 5);
        class237.field3350.method3740((byte) 60, 5);
        class431.field5902.method3740((byte) 60, 5);
        class544.field7214.method3740((byte) 60, 5);
    }
}
