import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class409 extends InputStream {

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "[[B")
    public static byte[][] field5811 = new byte[250][];

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public static int field5813 = -1;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[Li;")
    public static class37[] field5812;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public static void method2384(int arg0) {
        field5812 = null;
        field5811 = null;
        if (arg0 < 120) {
            field5813 = 12;
        }
    }

    @OriginalMember(owner = "client!lv", name = "read", descriptor = "()I")
    public final int read() {
        field5809++;
        class519.method2960(-38, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)I")
    public static final int method2385(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class259.field3519 - 1; var2++) {
            if (arg0 < class645.field8917[var2] + class479.field6610[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class259.field3519 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)V")
    public static final void method2386(int arg0, byte arg1) {
        if (class95.field1336 == null || class95.field1336.length < arg0) {
            class95.field1336 = new int[arg0];
        }
        if (arg1 != 102) {
            field5808 = 15;
        }
        field5810++;
    }
}
