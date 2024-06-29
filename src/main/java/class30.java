import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field447 = 0;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field446 = -50;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Z")
    public boolean field441;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method435(int arg0, int arg1, int arg2) {
        if (arg0 < 52) {
            field446 = -60;
        }
        field442++;
        return class177.method1433(arg2, arg1, 19) | (arg1 & 0x800) != 0 || class653.method3762(arg1, -100, arg2);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 22)
    public static final void method436(byte arg0) {
        field448++;
        if (class200.field3260 <= 0) {
            class66.field855 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class589.field8381.length; var2++) {
                if (class589.field8381[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class200.field3260;
                    var1++;
                    if (var10000 == ~var1) {
                        class66.field855 = class589.field8381[var2].substring(class589.field8381[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        int var3 = 87 / ((arg0 + 37) / 32);
    }
}
