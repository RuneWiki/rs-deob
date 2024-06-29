import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class14 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field167 = 0;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static volatile int field171 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[[I")
    public static int[][] field170;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
    public static final boolean method77(byte arg0, int arg1) {
        if (arg0 <= 93) {
            method79(57, (byte) 20);
        }
        field168++;
        if (arg1 == 33 || arg1 == 50 || arg1 == 49 || arg1 == 28 || arg1 == 1) {
            return true;
        } else {
            return arg1 == 16 || arg1 == 31 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method78(int arg0) {
        field170 = null;
        int var1 = -104 % ((arg0 - 66) / 57);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V")
    public static final void method79(int arg0, byte arg1) {
        field166++;
        if (class127.field1782 == arg0) {
            return;
        }
        class432.field6220 = class267.field3646 = class143.field2059[arg0];
        class408.field5920.method1765(50, (int) ((double) class432.field6220 * 34.46D));
        class25.field403 = new int[4][class432.field6220 >> 3][class267.field3646 >> 3];
        class262.field3580 = new int[class432.field6220][class267.field3646];
        field170 = new int[class432.field6220][class267.field3646];
        int var2 = 0;
        if (arg1 != 101) {
            method78(-28);
        }
        while (var2 < 4) {
            class24.field326[var2] = class260.method1603(95, class432.field6220, class267.field3646);
            var2++;
        }
        class8.field123 = new byte[4][class432.field6220][class267.field3646];
        class68.method465(class432.field6220, 4, class267.field3646, true);
        class142.method970(class267.field3646 >> 3, arg1 ^ 0xFFFF9E1A, class432.field6220 >> 3, class408.field5920);
        class127.field1782 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
    public static final void method80(int arg0, int arg1, int arg2, int arg3) {
        class142 var4 = class5.field79[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class81 var5 = var4.field2052;
        class81 var6 = var4.field2035;
        if (var5 != null) {
            var5.field1254 = var5.field1254 * arg3 / 16;
            var5.field1253 = var5.field1253 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field1254 = var6.field1254 * arg3 / 16;
            var6.field1253 = var6.field1253 * arg3 / 16;
        }
    }
}
