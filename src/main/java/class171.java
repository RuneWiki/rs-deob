import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class171 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "F")
    public static float field2747 = 0.0F;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2748 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Laf;")
    public static class190 field2754;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[[I")
    public static int[][] field2755;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lpk;I)V", line = 15)
    public static final void method1274(class120 arg0, int arg1) {
        field2751++;
        if (arg1 < 58) {
            field2749 = 4;
        }
        class91.field1472 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1275(byte arg0, int arg1) {
        field2746++;
        if (arg0 != -31) {
            method1276(99, (byte) 35);
        }
        class307 var2 = (class307) class340.field5253.method79((long) arg1, (byte) 0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4871.length; var3++) {
                var2.field4871[var3] = -1;
                var2.field4867[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Ltk;", line = 64)
    public static final class266 method1276(int arg0, byte arg1) {
        field2752++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        int var4 = -112 / ((arg1 + 63) / 52);
        if (class110.field1789[var2] == null || class110.field1789[var2][var3] == null) {
            boolean var5 = class309.method2186(26080, var2);
            if (!var5) {
                return null;
            }
        }
        return class110.field1789[var2][var3];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 87)
    public static void method1277(int arg0) {
        field2754 = null;
        if (arg0 == -18686) {
            field2755 = (int[][]) null;
        }
    }
}
