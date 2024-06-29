import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class109 extends class84 {

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Z")
    public volatile boolean field1519 = true;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Lql;")
    public static class224 field1518 = new class224(new byte[5000]);

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Lab;")
    public static class148 field1522 = new class148();

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
    public boolean field1517;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
    public boolean field1520;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    public static final void method700(boolean arg0) {
        int var1 = -1;
        if (arg0) {
            return;
        }
        while (var1 < class103.field1442) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class205.field2848[var1];
            }
            class88 var6 = class154.field2133[var5];
            if (var6 != null && var6.field3988 > 0) {
                var6.field3988--;
                if (var6.field3988 == 0) {
                    var6.field4049 = null;
                }
            }
            var1++;
        }
        field1516++;
        for (int var2 = 0; var2 < class92.field1283; var2++) {
            int var3 = class194.field2688[var2];
            class140 var4 = class119.field1679[var3];
            if (var4 != null && var4.field3988 > 0) {
                var4.field3988--;
                if (var4.field3988 == 0) {
                    var4.field4049 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(B)V")
    public static void method701(byte arg0) {
        field1522 = null;
        if (arg0 == 118) {
            field1518 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)I")
    public abstract int method143(int arg0);

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)[B")
    public abstract byte[] method142(int arg0);
}
