import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class650 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Lfc;")
    public static class235 field9204 = new class235(113, -2);

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lof;")
    public static class568 field9205 = new class568(1, 2);

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[Lxa;")
    public static class461[] field9206;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method3617(byte arg0) {
        field9205 = null;
        int var1 = 117 / ((-arg0 - 4) / 56);
        field9204 = null;
        field9206 = null;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
    public static final void method3618(int arg0, int arg1) {
        class459.field6498 = arg0;
        field9202++;
        if (arg1 == -1) {
            class82.field1152.method1997(arg1 + 2);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
    public static final boolean method3619(int arg0) {
        if (arg0 != -51) {
            return false;
        }
        field9203++;
        try {
            return class295.method1845(-65536);
        } catch (IOException var4) {
            class196.method1321(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class290.field4382 == null ? -1 : class290.field4382.method1481(false)) + "," + (class324.field4794 == null ? -1 : class324.field4794.method1481(false)) + "," + (class182.field2681 == null ? -1 : class182.field2681.method1481(false)) + " - " + class532.field7250 + "," + (class253.field3576.field6483[0] + class511.field6989) + "," + (class253.field3576.field6477[0] + class124.field1726) + " - ";
            for (int var3 = 0; class532.field7250 > var3 && var3 < 50; var3++) {
                var2 = var2 + class602.field8356.field1316[var3] + ",";
            }
            class139.method985((byte) -64, var2, var5);
            class528.method2930(false, 2);
            return true;
        }
    }
}
