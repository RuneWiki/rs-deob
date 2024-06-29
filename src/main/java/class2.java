import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 extends class36 {

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "mapview!aa", name = "p", descriptor = "Lr;")
    public static class33 field10 = class29.method192("Altar", (byte) 126);

    @OriginalMember(owner = "mapview!aa", name = "q", descriptor = "Lr;")
    public static class33 field11 = class29.method192("Farming shop", (byte) 126);

    @OriginalMember(owner = "mapview!aa", name = "r", descriptor = "Lr;")
    public static class33 field12 = class29.method192("Next page", (byte) 126);

    @OriginalMember(owner = "mapview!aa", name = "o", descriptor = "Lr;")
    public static class33 field9 = class29.method192("Short)2cut", (byte) 126);

    @OriginalMember(owner = "mapview!aa", name = "s", descriptor = "Lr;")
    public static class33 field13 = class29.method192("Helmet Shop", (byte) 126);

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(I)V", line = 4)
    public static void method13(int arg0) {
        field11 = null;
        field13 = null;
        field12 = null;
        field9 = null;
        field10 = null;
        if (arg0 < 121) {
            field11 = null;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(B)V", line = 44)
    public static final void method14(byte arg0) {
        class36.field494 = null;
        class22.field230 = null;
        class21.field219 = null;
        int var1 = -30 % ((62 - arg0) / 59);
        class25.field272 = null;
        class32.field448 = null;
        class11.field146 = null;
    }
}
