import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class290 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
    public static int[] field4466 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "Z")
    public static volatile boolean field4477 = true;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Z")
    public static boolean field4478 = false;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public int field4479;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public int field4484;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "Lug;")
    public static class253 field4476;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 5)
    public static final String method2031(int arg0, int arg1) {
        field4467++;
        if (arg1 > -79) {
            field4478 = true;
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFFA12) >> 16) + "." + ((arg0 & 0xFF9E) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 42)
    public static void method2032(int arg0) {
        field4466 = null;
        field4476 = null;
        if (arg0 != 16775698) {
            field4478 = false;
        }
    }
}
