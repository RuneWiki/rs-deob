import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class307 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[[I")
    public static int[][] field3792 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Llj;")
    public static class60 field3797;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static final void method1766(boolean arg0) {
        field3794++;
        if (class619.field8759 != null) {
            return;
        }
        Container var1;
        if (class503.field7242 != null) {
            var1 = class503.field7242;
        } else if (class591.field8347 == null) {
            var1 = class188.field2161;
        } else {
            var1 = class591.field8347;
        }
        class338.field4245 = var1.getSize().width;
        class533.field7491 = var1.getSize().height;
        if (arg0) {
            method1766(true);
        }
        if (class503.field7242 == var1) {
            Insets var2 = class503.field7242.getInsets();
            class338.field4245 -= var2.right + var2.left;
            class533.field7491 -= var2.top + var2.bottom;
        }
        if (class201.method1206(82) == 1) {
            class5.field57 = (class338.field4245 - class267.field3329) / 2;
            class146.field1618 = class267.field3329;
            class338.field4244 = class87.field873;
            class434.field6130 = 0;
        } else {
            class131.method744((byte) 113);
        }
        if (class364.field4875 != class337.field4237) {
            boolean var10000;
            if (class146.field1618 < 1024 && class338.field4244 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class41.field407.setSize(class146.field1618, class338.field4244);
        if (class701.field9813 != null) {
            class701.field9813.method956(class41.field407);
        }
        if (class503.field7242 == var1) {
            Insets var3 = class503.field7242.getInsets();
            class41.field407.setLocation(class5.field57 + var3.left, class434.field6130 + var3.top);
        } else {
            class41.field407.setLocation(class5.field57, class434.field6130);
        }
        if (class209.field2466 != -1) {
            class175.method1067(true, 2620);
        }
        class80.method421(0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        if (arg0 != -125) {
            field3791 = -62;
        }
        field3792 = null;
        field3797 = null;
    }

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3795++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method1768(int arg0, int arg1) {
        field3796++;
        if (arg1 != -11609) {
            method1767((byte) -43);
        }
        if (class255.method1506(arg0, (byte) 113)) {
            class518.method2945((byte) -96, -1, class102.field1106[arg0]);
        }
    }
}
