import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class133 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public static int[] field2361 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lp;")
    public static class280 field2358 = class18.method140((byte) -118, ": ");

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lp;")
    public static class280 field2360 = class18.method140((byte) -124, "Stufe: ");

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2366 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[[S")
    public static short[][] field2359;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method920(Component arg0, int arg1) {
        int var2 = 100 % ((-arg1 - 13) / 55);
        field2363++;
        arg0.addMouseListener(class45.field750);
        arg0.addMouseMotionListener(class45.field750);
        arg0.addFocusListener(class45.field750);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method102(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
    public abstract int method101(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2360 = null;
        if (arg0 >= 78) {
            field2359 = null;
            field2361 = null;
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static final void method922(int arg0) {
        if (class266.field4684 < 0) {
            class277.field4818 = -1;
            class97.field1558 = -1;
            class266.field4684 = 0;
        }
        field2364++;
        if (class47.field779 < class266.field4684) {
            class266.field4684 = class47.field779;
            class97.field1558 = -1;
            class277.field4818 = -1;
        }
        if (arg0 < ~class47.field780) {
            class47.field780 = 0;
            class277.field4818 = -1;
            class97.field1558 = -1;
        }
        if (class74.field1222 < class47.field780) {
            class97.field1558 = -1;
            class277.field4818 = -1;
            class47.field780 = class74.field1222;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
    public static final void method923(boolean arg0, int arg1) {
        field2362++;
        if (class122.field2148 == arg0) {
            return;
        }
        class122.field2148 = arg0;
        class124.method865((byte) -92);
        if (arg1 >= -55) {
            method922(-29);
        }
    }
}
