import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class281 {

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field4458 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field4459 = 0;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "F")
    public static float field4457;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[[B")
    public static byte[][] field4451;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1874(int arg0) {
        field4451 = null;
        if (arg0 <= 68) {
            method1876(50);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILeh;)V")
    public static final void method1875(int arg0, class137 arg1) {
        int var2 = 56 % ((1 - arg0) / 55);
        class195.field3114 = arg1;
        field4460++;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Lnl;")
    public static final class216 method1876(int arg0) {
        field4456++;
        class273.field4371 = arg0;
        return class91.method499(0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method1877(byte arg0) {
        field4455++;
        Container var1;
        if (class46.field586 != null) {
            var1 = class46.field586;
        } else if (class41.field517 == null) {
            var1 = class194.field3107.field609;
        } else {
            var1 = class41.field517;
        }
        if (arg0 != 14) {
            method1879(-73, (byte) 64);
        }
        class137.field2161 = var1.getSize().width;
        class83.field1033 = var1.getSize().height;
        if (class41.field517 == var1) {
            Insets var2 = class41.field517.getInsets();
            class137.field2161 -= var2.right + var2.left;
            class83.field1033 -= var2.top + var2.bottom;
        }
        if (class192.method1326((byte) -89) < 2) {
            class181.field2887 = (class137.field2161 - 765) / 2;
            class228.field3647 = 0;
            class283.field4517 = 765;
            class292.field4640 = 503;
        } else {
            class292.field4640 = class83.field1033;
            class181.field2887 = 0;
            class283.field4517 = class137.field2161;
            class228.field3647 = 0;
        }
        class221.field3551.setSize(class283.field4517, class292.field4640);
        if (class41.field517 == var1) {
            Insets var3 = class41.field517.getInsets();
            class221.field3551.setLocation(class181.field2887 + var3.left, class228.field3647 + var3.top);
        } else {
            class221.field3551.setLocation(class181.field2887, class228.field3647);
        }
        if (class164.field2602 != -1) {
            class138.method961(-81, true);
        }
        class144.method1007(true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static final void method1878(boolean arg0) {
        if (arg0) {
            field4459 = 9;
        }
        field4453++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public static final void method1879(int arg0, byte arg1) {
        field4452++;
        class233 var2 = class114.method746(arg0, 1228126432, 2);
        if (arg1 != 123) {
            field4454 = 53;
        }
        var2.method1653(false);
    }
}
