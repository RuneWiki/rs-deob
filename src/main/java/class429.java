import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class429 extends class331 {

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public int field6196 = 1;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "Z")
    public static boolean field6198 = false;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "Z")
    public static boolean field6201 = false;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "C")
    public char field6202;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILdg;)V")
    public final void method2703(int arg0, class236 arg1) {
        if (arg0 != 2) {
            this.field6202 = (char) 65510;
        }
        field6197++;
        while (true) {
            int var3 = arg1.method1574(-108);
            if (var3 == 0) {
                return;
            }
            this.method2705((byte) 112, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I")
    public static int method2704(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLdg;I)V")
    private final void method2705(byte arg0, class236 arg1, int arg2) {
        if (arg0 <= 21) {
            this.method2705((byte) 107, (class236) null, 31);
        }
        if (arg2 == 1) {
            this.field6202 = class8.method57(arg1.method1589(false), 16);
        } else if (arg2 == 2) {
            this.field6196 = 0;
        }
        field6199++;
    }
}
