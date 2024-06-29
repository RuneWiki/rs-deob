import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class81 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Z")
    public static boolean field1187 = true;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[I")
    public static int[] field1184 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1188 = "Starting 3d Library";

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lfh;Z)V", line = 30)
    public static final void method544(class313 arg0, boolean arg1) {
        field1182++;
        byte[] var2 = new byte[24];
        if (class163.field2584 != null) {
            try {
                int var3 = 0;
                class163.field2584.method1756(0, 0L);
                class163.field2584.method1767(var2, -26770);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        if (!arg1) {
            field1188 = (String) null;
        }
        arg0.method2235((byte) 22, var2, 0, 24);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 75)
    public static void method545(byte arg0) {
        field1184 = null;
        field1188 = null;
        if (arg0 < 82) {
            method544((class313) null, false);
        }
    }
}
