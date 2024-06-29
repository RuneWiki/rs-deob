import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends InputStream {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Laf;")
    public static class68 field1158 = new class68(4);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lqh;")
    public static class201 field1157;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method504(boolean arg0) {
        field1157 = null;
        field1158 = null;
        if (!arg0) {
            method504(false);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqh;I)Lia;")
    public static final class226 method505(int arg0, class201 arg1, int arg2) {
        field1159++;
        int var3 = 94 % ((10 - arg0) / 43);
        return class96.method714(arg2, (byte) 72, arg1) ? class202.method1387(-28724) : null;
    }

    @OriginalMember(owner = "client!ge", name = "read", descriptor = "()I")
    public final int read() {
        field1156++;
        class43.method358(30000L, false);
        return -1;
    }
}
