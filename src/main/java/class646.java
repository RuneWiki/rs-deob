import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class646 extends class548 {

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field9037 = 0;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "[I")
    public static int[] field9036 = new int[5];

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "Lv;")
    public static class165 field9038 = new class165();

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)Lug;", line = 4)
    public static final class472 method3699(int arg0, int arg1, int arg2) {
        if (class59.field688[arg0][arg1][arg2] == null) {
            boolean var3 = class59.field688[0][arg1][arg2] != null && class59.field688[0][arg1][arg2].field6549 != null;
            if (var3 && arg0 >= class266.field3869 - 1) {
                return null;
            }
            class208.method1321(arg0, arg1, arg2);
        }
        return class59.field688[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILsha;II)V", line = 22)
    public static final void method3700(int arg0, class115 arg1, int arg2, int arg3) {
        field9035++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 5) {
            method3700(-74, null, 78, 51);
        }
        if (arg1.field1538 != null) {
            class114 var4 = new class114();
            var4.field1384 = arg1.field1538;
            var4.field1378 = arg1;
            class700.method3959(var4);
        }
        class50.field602 = arg1.field1427;
        class326.field4586 = arg1.field1482;
        class81.field913 = arg1.field1458;
        class773.field10644 = true;
        class213.field2954 = arg1.field1526;
        class774.field10657 = arg3;
        class539.field7462 = arg1.field1446;
        class358.field5156 = arg2;
        class43.method336(-1, arg1);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 61)
    public static void method3701(byte arg0) {
        field9038 = null;
        field9036 = null;
        if (arg0 < 59) {
            method3701((byte) 14);
        }
    }
}
