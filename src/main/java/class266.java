import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class266 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3377 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lwp;")
    public static class453 field3380 = new class453(6, 6);

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3378++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(II)V")
    public class266(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z")
    public static final boolean method1547(boolean arg0) {
        field3379++;
        try {
            if (!arg0) {
                method1548((byte) -68);
            }
            return class262.method1517(-1);
        } catch (IOException var4) {
            class695.method3919(7);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class11.field192 == null ? -1 : class11.field192.method2424(25569)) + "," + (class71.field965 == null ? -1 : class71.field965.method2424(25569)) + "," + (class533.field7187 == null ? -1 : class533.field7187.method2424(25569)) + " - " + class8.field162 + "," + (class376.field4748.field9758[0] + class145.field1879) + "," + (class376.field4748.field9754[0] + class630.field8817) + " - ";
            for (int var3 = 0; class8.field162 > var3 && var3 < 50; var3++) {
                var2 = var2 + class298.field3671.field8804[var3] + ",";
            }
            class106.method597(var2, -2, var5);
            class413.method2189((byte) 114, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1548(byte arg0) {
        field3377 = null;
        if (arg0 <= 25) {
            method1547(false);
        }
        field3380 = null;
    }
}
