import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class168 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2661 = "cyan:";

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Lrk;")
    public static class270 field2664 = new class270(64);

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lqh;")
    public static class201 field2662;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lqh;")
    public static class201 field2665;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lhi;")
    public static class220 field2668;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public static final int method1155(int arg0, int arg1) {
        field2666++;
        class173 var2 = class34.method289(arg0, (byte) -94);
        if (arg1 <= 82) {
            return -57;
        }
        int var3 = var2.field2729;
        int var4 = var2.field2724;
        int var5 = var2.field2730;
        int var6 = class285.field4504[var5 - var4];
        return class82.field1289[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1156(boolean arg0) {
        if (!arg0) {
            method1157();
        }
        field2661 = null;
        field2665 = null;
        field2668 = null;
        field2662 = null;
        field2664 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public static final void method1157() {
        if (class66.field1083 != null) {
            for (int var0 = 0; var0 < class66.field1083.length; var0++) {
                for (int var1 = 0; var1 < class241.field3894; var1++) {
                    for (int var2 = 0; var2 < class129.field2084; var2++) {
                        class66.field1083[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class76.field1215 != null) {
            for (int var3 = 0; var3 < class76.field1215.length; var3++) {
                for (int var4 = 0; var4 < class241.field3894; var4++) {
                    for (int var5 = 0; var5 < class129.field2084; var5++) {
                        class76.field1215[var3][var4][var5] = null;
                    }
                }
            }
        }
        class179.field2821 = 0;
        if (class34.field541 != null) {
            for (int var6 = 0; var6 < class179.field2821; var6++) {
                class34.field541[var6] = null;
            }
        }
        if (class155.field2505 != null) {
            for (int var7 = 0; var7 < class78.field1260; var7++) {
                class155.field2505[var7] = null;
            }
            class78.field1260 = 0;
        }
        if (class87.field1394 != null) {
            for (int var8 = 0; var8 < class87.field1394.length; var8++) {
                class87.field1394[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILqh;)V")
    public static final void method1158(int arg0, class201 arg1) {
        class189.field3059 = arg1.method1373(107, "runes");
        field2667++;
        if (arg0 != 0) {
            field2662 = null;
        }
    }
}
