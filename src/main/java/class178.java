import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class178 extends class470 {

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Luq;")
    public static class111 field2695 = new class111();

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lao;")
    public static class188 field2701 = new class188(81, 12);

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "B")
    public byte field2696;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "F")
    public static float field2703;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lmg;")
    public static class100 field2699;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lti;")
    public class303 field2697;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[[I")
    public static int[][] field2702;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 5)
    public static void method1265(int arg0) {
        if (arg0 > -89) {
            field2703 = 1.2181414F;
        }
        field2695 = null;
        field2701 = null;
        field2702 = null;
        field2699 = null;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)[B", line = 20)
    public final byte[] method1266(int arg0) {
        ++field2700;
        if (!super.field6915 && this.field2697.field4333 >= this.field2697.field4326.length - this.field2696) {
            if (arg0 != 100) {
                this.method1266(-101);
            }
            return this.field2697.field4326;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)I", line = 45)
    public final int method1267(boolean arg0) {
        if (!arg0) {
            return 11;
        } else {
            ++field2694;
            return this.field2697 == null ? 0 : this.field2697.field4333 * 100 / (this.field2697.field4326.length - this.field2696);
        }
    }
}
