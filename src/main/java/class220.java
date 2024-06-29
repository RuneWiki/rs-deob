import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class220 extends OutputStream {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public static int[] field2623 = new int[50];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Ltf;")
    public static class701 field2624;

    @OriginalMember(owner = "client!ch", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2622++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lrb;)V")
    public static final void method1274(class383 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class321.field3949[var1]; var2++) {
                if (class469.field6711[var1][var2] == arg0) {
                    class567.method3216(class469.field6711[var1], var2 + 1, class469.field6711[var1], var2, class321.field3949[var1] - var2 - 1);
                    var10002 = class321.field3949[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class635.field8946[var1]; var3++) {
                if (class13.field115[var1][var3] == arg0) {
                    class567.method3216(class13.field115[var1], var3 + 1, class13.field115[var1], var3, class635.field8946[var1] - var3 - 1);
                    var10002 = class635.field8946[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class701.field9822[var1]; var4++) {
                if (class476.field6867[var1][var4] == arg0) {
                    class567.method3216(class476.field6867[var1], var4 + 1, class476.field6867[var1], var4, class701.field9822[var1] - var4 - 1);
                    var10002 = class701.field9822[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        if (arg0 != 15029) {
            method1275(-119);
        }
        field2623 = null;
        field2624 = null;
    }
}
