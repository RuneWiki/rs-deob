import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class351 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[I")
    public static int[] field4784 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lrl;")
    public static class617 field4786;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method2121(int arg0) {
        class588.field8727 = 0;
        class618.field9137 = -1;
        if (arg0 != 865758566) {
            field4784 = null;
        }
        class349.field4776 = -1;
        field4785++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method2122(int arg0) {
        field4784 = null;
        field4786 = null;
        if (arg0 != -1550928892) {
            field4786 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
    public static final void method2123(int arg0, int arg1, int arg2, int arg3) {
        field4787++;
        String var4 = "tele " + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg0 > -6) {
            method2122(100);
        }
        class29.method198(13699, false, var4, true);
    }
}
