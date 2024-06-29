import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class68 extends class435 {

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "[B")
    public byte[] field1082;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "Ljda;")
    public static class77 field1081 = new class77("", 14);

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "[I")
    public static int[] field1085 = new int[1];

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "Lvh;")
    public static class125 field1084 = new class125(43, 8);

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method562(byte arg0) {
        int var1 = 76 % ((-arg0 - 11) / 53);
        field1085 = null;
        field1081 = null;
        field1084 = null;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)Lfu;")
    public static final class66 method563(byte arg0) {
        field1083++;
        if (class161.field2621 == null || class457.field6574 == null) {
            return null;
        }
        if (arg0 >= -56) {
            method564(null, -117, -64, -75, null);
        }
        class457.field6574.method2197(class161.field2621, (byte) -122);
        class66 var1 = (class66) class457.field6574.method2196(-1);
        if (var1 == null) {
            return null;
        } else {
            class30 var2 = class161.field2609.method2837(var1.field954, -79);
            return var2 != null && var2.field436 && var2.method274(true, class161.field2611) ? var1 : class641.method3604(5621);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method564(class427 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class687.field9745 == class340.field4723) {
            return;
        }
        int var5 = class621.field8841[arg1].method3861((byte) -11, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class682 var7 = class621.field8841[var6];
                if (var7 != null) {
                    var7.method1376(arg0, arg2, var5 - var7.method3861((byte) 86, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "([B)V")
    public class68(byte[] arg0) {
        this.field1082 = arg0;
    }
}
