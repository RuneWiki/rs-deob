import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class48 extends class98 {

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "Z")
    public volatile boolean field644 = true;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "F")
    public static float field640;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "Lfa;")
    public static class214 field645;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Z")
    public boolean field643;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "Z")
    public static boolean field646;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "Z")
    public boolean field648;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "[Lob;")
    public static class686[] field647;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method552(boolean arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)I")
    public abstract int method553(int arg0);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    public static void method554(int arg0) {
        field645 = null;
        field647 = null;
        if (arg0 != -15415) {
            method554(17);
        }
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
    public static final void method555(int arg0) {
        field642++;
        if (class476.field7061 != null) {
            return;
        }
        Container var1;
        if (class598.field8470 != null) {
            var1 = class598.field8470;
        } else if (class450.field6772 == null) {
            var1 = class64.field825;
        } else {
            var1 = class450.field6772;
        }
        class235.field3727 = var1.getSize().width;
        class101.field1659 = var1.getSize().height;
        if (class598.field8470 == var1) {
            Insets var2 = class598.field8470.getInsets();
            class235.field3727 -= var2.right + var2.left;
            class101.field1659 -= var2.top + var2.bottom;
        }
        if (class33.method452(2) == 1) {
            class425.field6468 = 0;
            class290.field4596 = (class235.field3727 - class585.field8333) / 2;
            class259.field4147 = class95.field1487;
            class56.field732 = class585.field8333;
        } else {
            class255.method1805((byte) -91);
        }
        if (class660.field9192 != class182.field3060) {
            boolean var10000;
            if (class56.field732 < 1024 && class259.field4147 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class271.field4377.setSize(class56.field732, class259.field4147);
        if (class627.field8857 != null) {
            class627.field8857.method291(class271.field4377);
        }
        if (class598.field8470 == var1) {
            Insets var3 = class598.field8470.getInsets();
            class271.field4377.setLocation(class290.field4596 + var3.left, class425.field6468 + var3.top);
        } else {
            class271.field4377.setLocation(class290.field4596, class425.field6468);
        }
        if (class528.field7706 != -1) {
            class351.method2359((byte) 92, true);
        }
        if (arg0 != -769) {
            method554(-37);
        }
        class502.method3057(-9629);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(B)Lqk;")
    public static final class16 method556(byte arg0) {
        field639++;
        int var1 = 115 % ((-arg0 - 80) / 46);
        return class252.field4036;
    }
}
