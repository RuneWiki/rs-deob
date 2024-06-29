import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class116 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lva;")
    private static class121 field2635 = class107.method797("Loading fonts )2 ", -10983);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public static boolean field2632 = false;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ln;")
    public static class78 field2637 = null;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public static int[] field2639 = new int[4000];

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field2641 = -1;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lva;")
    private static class121 field2642 = class107.method797("Loading interfaces )2 ", -10983);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lva;")
    public static class121 field2631 = field2642;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field2646 = 0;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lva;")
    public static class121 field2634 = field2635;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lm;")
    public static class72 field2636;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field2633;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
    public static boolean field2644;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[I")
    public static int[] field2643;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 33)
    public static void method883(int arg0) {
        field2636 = null;
        field2631 = null;
        field2634 = null;
        field2643 = null;
        field2642 = null;
        field2639 = null;
        field2635 = null;
        if (arg0 <= -125) {
            field2633 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)[B", line = 84)
    public static final synchronized byte[] method884(boolean arg0, int arg1) {
        field2638++;
        if (!arg0) {
            field2644 = true;
        }
        if (arg1 == 100 && class80.field1862 > 0) {
            byte[] var2 = class20.field539[--class80.field1862];
            class20.field539[class80.field1862] = null;
            return var2;
        } else if (arg1 == 5000 && class29.field781 > 0) {
            byte[] var3 = class41.field938[--class29.field781];
            class41.field938[class29.field781] = null;
            return var3;
        } else if (arg1 == 30000 && class101.field2266 > 0) {
            byte[] var4 = client.field438[--class101.field2266];
            client.field438[class101.field2266] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
