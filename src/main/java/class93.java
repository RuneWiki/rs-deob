import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class93 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "[I")
    public static int[] field1679 = new int[32];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 6)
    public static void method682(int arg0) {
        field1679 = null;
        int var1 = -113 / ((81 - arg0) / 45);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BZ)V", line = 36)
    public static final void method683(byte arg0, boolean arg1) {
        int var2 = -32 % ((arg0 + 22) / 46);
        for (int var3 = 0; var3 < class311.field5357; var3++) {
            class279 var4 = class187.field3281[class141.field2480[var3]];
            long var5 = (long) class141.field2480[var3] << 32 | 0x20000000L;
            if (var4 != null && var4.method519(109) && var4.field4860.field1414 == arg1 && var4.field4860.method559(-6228)) {
                int var7 = var4.field1192 >> 7;
                int var8 = var4.field1197 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.method515(5373952) == 1 && (var4.field1192 & 0x7F) == 64 && (var4.field1197 & 0x7F) == 64) {
                        if (class67.field1241[var7][var8] == class78.field1469) {
                            continue;
                        }
                        class67.field1241[var7][var8] = class78.field1469;
                    }
                    if (!var4.field4860.field1419) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field1243 = class297.method2080(var4.field1192, 117, class255.field4377, var4.field1197);
                    class78.method587(class255.field4377, var4.field1192, var4.field1197, var4.field1243, var4.method515(5373952) * 64 + 60 - 64, var4, var4.field1191, var5, var4.field1226);
                }
            }
        }
        field1678++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 88)
    public static final void method684(byte arg0) {
        field1681++;
        if (arg0 != 96) {
            method683((byte) -6, false);
        }
        class145.field2564.method1748(0);
        class180.field3187.method531(-1);
        class70.field1284.method531(-1);
    }
}
