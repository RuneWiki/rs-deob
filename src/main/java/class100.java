import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class100 {

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "[I")
    public static int[] field1232 = new int[13];

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "Lda;")
    public static class423 field1234;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "[Lac;")
    public static class712[] field1233;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z", line = 9)
    public static final boolean method674(int arg0) {
        if (arg0 <= 70) {
            field1233 = null;
        }
        field1230++;
        try {
            return class168.method1054(92);
        } catch (IOException var4) {
            class238.method1491((byte) 91);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class730.field10219 == null ? -1 : class730.field10219.method563((byte) -108)) + "," + (class455.field6380 == null ? -1 : class455.field6380.method563((byte) 90)) + "," + (class508.field7186 == null ? -1 : class508.field7186.method563((byte) -117)) + " - " + class677.field9199 + "," + (class339.field4374.field435[0] + class63.field851) + "," + (class339.field4374.field426[0] + class753.field10509) + " - ";
            for (int var3 = 0; var3 < class677.field9199 && var3 < 50; var3++) {
                var2 = var2 + class24.field414.field2325[var3] + ",";
            }
            class486.method2844((byte) -1, var2, var5);
            class650.method3509(false, (byte) -74);
            return true;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V", line = 51)
    public static void method675(byte arg0) {
        if (arg0 == 97) {
            field1232 = null;
            field1234 = null;
            field1233 = null;
        }
    }
}
