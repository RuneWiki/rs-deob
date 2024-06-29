import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class407 {

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lju;")
    public static class137 field5585 = new class137(10, 3);

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lvl;")
    public static class15 field5587 = new class15(46, 12);

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lvl;")
    public static class15 field5589 = new class15(12, 8);

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
    public static int[] field5591 = new int[5];

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field5593 = 0;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[Lnf;")
    public static class604[] field5584;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method2426(int arg0) {
        if (arg0 != 3) {
            field5589 = null;
        }
        field5587 = null;
        field5591 = null;
        field5589 = null;
        field5584 = null;
        field5585 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILgj;Ld;IILjava/awt/Canvas;)Lha;")
    public static final class66 method2427(int arg0, class662 arg1, class162 arg2, int arg3, int arg4, Canvas arg5) {
        field5586++;
        int var6 = arg0;
        int var7 = 0;
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class66.method504(6343, var6, arg2, arg1, arg3, var7, arg5, arg4);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BIIII)V")
    public static final void method2428(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -13) {
            field5587 = null;
        }
        field5588++;
        class281 var5 = class54.method395((byte) -53, (long) arg2 << 32 | (long) arg3, 19);
        var5.method1821((byte) 51);
        var5.field3910 = arg1;
        var5.field3901 = arg4;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public static final void method2429(int arg0) throws class789 {
        int var1 = 61 % ((arg0 - 23) / 62);
        field5590++;
        if (class278.field3847 == 1) {
            class369.field5000.method561(class112.field2110, class361.field4925);
        } else {
            class369.field5000.method561(0, 0);
        }
    }
}
