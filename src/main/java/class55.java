import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 extends class37 {

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Z")
    public static boolean field1132 = false;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "[Z")
    public static boolean[] field1138 = new boolean[5];

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
    public static volatile boolean field1133 = true;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1135 = 1;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "Lo;")
    public static class84 field1149 = class15.method124("and choose the (Wcreate account(W", 255);

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "J")
    public static volatile long field1143 = 0L;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1145 = 50;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
    public static int[] field1147 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "[I")
    public static int[] field1152 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "[I")
    public static int[] field1137 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Lo;")
    public static class84 field1153 = class15.method124("backright1", 255);

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
    public static int[] field1148 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "[Lo;")
    public static class84[] field1136 = new class84[field1145];

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
    public static int[] field1150 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
    public static int[] field1142 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
    public static int[] field1141 = new int[field1145];

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lja;")
    public class55 field1139;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "Lja;")
    public class55 field1155;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
    public static int[] field1154;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[BBII)V", line = 18)
    public static final void method458(boolean arg0, byte[] arg1, byte arg2, int arg3, int arg4) {
        field1144++;
        if (arg2 != 102) {
            field1143 = 14L;
        }
        if (class127.field2813 == null) {
            return;
        }
        if (class73.field1533 >= 0) {
            arg3 -= 20;
            if (arg3 < 1) {
                arg3 = 1;
            }
            class21.field387 = arg3;
            if (class73.field1533 == 0) {
                class61.field1274 = 0;
            } else {
                int var5 = class50.method436(class73.field1533, (byte) 85);
                int var6 = var5 - class122.field2731;
                class61.field1274 = (class61.field1274 + var6 + 3600 - 1) / class61.field1274;
            }
            class30.field600 = arg1;
            class27.field539 = arg0;
            class33.field653 = arg4;
        } else if (class21.field387 == 0) {
            class85.method679(arg0, 0, arg4, arg1);
        } else {
            class30.field600 = arg1;
            class27.field539 = arg0;
            class33.field653 = arg4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 68)
    public static void method459(int arg0) {
        field1152 = null;
        if (arg0 != -5563) {
            method460(-51);
        }
        field1149 = null;
        field1136 = null;
        field1141 = null;
        field1137 = null;
        field1154 = null;
        field1153 = null;
        field1147 = null;
        field1140 = null;
        field1148 = null;
        field1138 = null;
        field1142 = null;
        field1150 = null;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 120)
    public static final void method460(int arg0) {
        field1134++;
        int var1 = class65.field1405.method986(59, 8);
        if (arg0 != -918) {
            field1149 = null;
        }
        if (class107.field2257 > var1) {
            for (int var2 = var1; var2 < class107.field2257; var2++) {
                class61.field1273[class15.field274++] = class85.field1949[var2];
            }
        }
        if (var1 > class107.field2257) {
            throw new RuntimeException("gppov1");
        }
        class107.field2257 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class85.field1949[var3];
            class63 var5 = class119.field2643[var4];
            int var6 = class65.field1405.method986(-78, 1);
            if (var6 == 0) {
                class85.field1949[class107.field2257++] = var4;
                var5.field1379 = class128.field2837;
            } else {
                int var7 = class65.field1405.method986(-74, 2);
                if (var7 == 0) {
                    class85.field1949[class107.field2257++] = var4;
                    var5.field1379 = class128.field2837;
                    class117.field2552[class62.field1290++] = var4;
                } else if (var7 == 1) {
                    class85.field1949[class107.field2257++] = var4;
                    var5.field1379 = class128.field2837;
                    int var8 = class65.field1405.method986(-115, 3);
                    var5.method509(var8, (byte) 68, false);
                    int var9 = class65.field1405.method986(-117, 1);
                    if (var9 == 1) {
                        class117.field2552[class62.field1290++] = var4;
                    }
                } else if (var7 == 2) {
                    class85.field1949[class107.field2257++] = var4;
                    var5.field1379 = class128.field2837;
                    int var10 = class65.field1405.method986(arg0 + 970, 3);
                    var5.method509(var10, (byte) 68, true);
                    int var11 = class65.field1405.method986(-87, 3);
                    var5.method509(var11, (byte) 68, true);
                    int var12 = class65.field1405.method986(arg0 ^ 0xFFFFFC31, 1);
                    if (var12 == 1) {
                        class117.field2552[class62.field1290++] = var4;
                    }
                } else if (var7 == 3) {
                    class61.field1273[class15.field274++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 227)
    public final void method461(int arg0) {
        field1151++;
        if (this.field1155 == null) {
            return;
        }
        int var2 = -20 % ((15 - arg0) / 33);
        this.field1155.field1139 = this.field1139;
        this.field1139.field1155 = this.field1155;
        this.field1139 = null;
        this.field1155 = null;
    }
}
