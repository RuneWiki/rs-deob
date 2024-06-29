import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class141 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lvf;")
    public static class265 field2616 = class87.method582(-46, "scape main");

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lvf;")
    public static class265 field2624 = class87.method582(-46, ")4");

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2615 = 0;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field2621;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[I")
    public static int[] field2625;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[[[I")
    public static int[][][] field2619;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method971(int arg0) {
        class283.field4984 = null;
        class43.field963 = null;
        class276.field4879 = null;
        class16.field461 = null;
        field2622++;
        if (arg0 != 21092) {
            method971(-49);
        }
        class75.field1442 = null;
        class14.field423 = null;
        class81.field1528 = null;
        class70.field1345 = null;
        class177.field3160 = null;
        class282.field4966 = null;
        class11.field385 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
    public static final void method972(int arg0, int arg1) {
        field2617++;
        if (arg1 == 16944) {
            class178 var2 = class188.method1282(arg0, 3, arg1 + 261343536);
            var2.method1160(116);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2624 = null;
        if (arg0 != 1023) {
            field2616 = null;
        }
        field2616 = null;
        field2621 = null;
        field2625 = null;
        field2619 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V")
    public static final void method974(int arg0, int arg1, int arg2, int arg3) {
        class137 var4 = class200.field3577[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class200 var5 = var4.field2510;
        if (var5 != null) {
            var5.field3566 = var5.field3566 * arg3 / 16;
            var5.field3575 = var5.field3575 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
    public static final void method975(byte arg0, int arg1) {
        field2623++;
        if (arg0 != 21) {
            method971(-4);
        }
        if (class168.field3046 == null || arg1 > class168.field3046.length) {
            class168.field3046 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
    public static final int method976(int arg0, byte arg1) {
        field2618++;
        if (arg1 != -50) {
            method971(-30);
        }
        return arg0 & 0x3FF;
    }
}
