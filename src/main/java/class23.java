import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 implements class300 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Ljava/lang/String;")
    private String field329;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lgda;")
    public static class53 field330 = new class53(48, 2);

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Z")
    private boolean field334;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)I", line = 4)
    public final int method146(int arg0) {
        field331++;
        int var2 = class70.method573(this.field329, 88);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        this.field334 = true;
        if (arg0 != 6340) {
            field330 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V", line = 22)
    public static void method147(int arg0) {
        if (arg0 != 48) {
            method147(26);
        }
        field330 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method148(byte arg0) {
        field333++;
        int var2 = 67 / ((arg0 + 64) / 55);
        return this.field334;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)Ldn;", line = 49)
    public final class516 method149(int arg0) {
        int var2 = -68 / ((arg0 + 19) / 60);
        field332++;
        return class516.field7357;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 62)
    public class23(String arg0) {
        this.field329 = arg0;
    }
}
