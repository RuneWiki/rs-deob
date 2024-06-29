import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public static int[] field55 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Luf;")
    public static class176 field57;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method52(int arg0) {
        if (arg0 != 0) {
            field55 = null;
        }
        field55 = null;
        field57 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
    public static final boolean method53(int arg0) {
        if (arg0 != 24890) {
            return false;
        }
        field56++;
        try {
            return class226.method1505(-29067);
        } catch (IOException var4) {
            class227.method1509(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class146.field2259 + "," + class32.field524 + "," + class86.field1415 + " - " + class79.field1329 + "," + (class118.field1828 + class261.field4058.field4204[0]) + "," + (class261.field4058.field4143[0] + class129.field2008) + " - ";
            for (int var3 = 0; var3 < class79.field1329 && var3 < 50; var3++) {
                var2 = var2 + class239.field3692.field583[var3] + ",";
            }
            class223.method1490(var5, var2, (byte) -101);
            class118.method850((byte) -127);
            return true;
        }
    }
}
