import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class490 extends class659 {

    @OriginalMember(owner = "client!eka", name = "r", descriptor = "[B")
    public byte[] field6823;

    @OriginalMember(owner = "client!eka", name = "t", descriptor = "J")
    public static long field6825;

    @OriginalMember(owner = "client!eka", name = "u", descriptor = "Luq;")
    public static class172 field6826;

    @OriginalMember(owner = "client!eka", name = "s", descriptor = "Lef;")
    public static class513 field6824;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V")
    public static void method2866(int arg0) {
        field6824 = null;
        if (arg0 != 0) {
            field6826 = null;
        }
        field6826 = null;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)V")
    public static final void method2867(int arg0, int arg1, int arg2) {
        boolean var3 = class443.field6387[0][arg1][arg2] != null && class443.field6387[0][arg1][arg2].field2526 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class443.field6387[var4][arg1][arg2] == null) {
                class194 var5 = class443.field6387[var4][arg1][arg2] = new class194(var4);
                if (var3) {
                    var5.field2521++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "([B)V")
    public class490(byte[] arg0) {
        this.field6823 = arg0;
    }
}
