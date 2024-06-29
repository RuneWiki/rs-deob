import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class189 extends class41 {

    @OriginalMember(owner = "client!aba", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2277 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!aba", name = "r", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Loga;I)V")
    public final void method331(class500 arg0, int arg1) {
        field2276++;
        if (arg1 != 55) {
            this.field2272 = 52;
        }
        arg0.method2964((byte) 109, this.field2274, this.field2272);
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public static void method1246(int arg0) {
        if (arg0 != 19589) {
            field2275 = -102;
        }
        field2277 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILes;)V")
    public final void method329(int arg0, class403 arg1) {
        field2273++;
        this.field2272 = arg1.method2381((byte) 34);
        if (arg0 != -3999) {
            this.method331(null, 0);
        }
        this.field2274 = arg1.method2381((byte) 46);
    }
}
