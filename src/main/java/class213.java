import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class213 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Luw;")
    public static class208 field2924 = new class208(17, 2);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Ldg;")
    public static class20 field2925 = new class20();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lmc;B)V", line = 4)
    public static final void method1415(class234 arg0, byte arg1) {
        if (arg1 != 58) {
            field2925 = null;
        }
        field2923++;
        byte[] var2 = new byte[24];
        if (class409.field5432 != null) {
            try {
                class409.field5432.method1442(0L, false);
                class409.field5432.method1439(var2, (byte) 56);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1530(0, 24, var2, 95);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 52)
    public static void method1416(int arg0) {
        field2924 = null;
        field2925 = null;
        if (arg0 <= 90) {
            field2924 = null;
        }
    }
}
