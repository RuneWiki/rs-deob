import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class138 extends class132 {

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public int field2676;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lr;")
    public static class178 field2664;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lt;")
    public class198 field2668;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Lt;")
    public class198 field2675;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Lab;")
    public static class3 field2679;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Lfj;")
    public class65 field2680;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public int[] field2667;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public static void method870(int arg0) {
        field2664 = null;
        field2679 = null;
        if (arg0 != -9406) {
            method870(39);
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public final void method871(int arg0) {
        if (arg0 < 76) {
            method870(-105);
        }
        field2674++;
        int var2 = this.field2676;
        class65 var3 = this.field2680.method439((byte) 84);
        if (var3 == null) {
            this.field2676 = -1;
            this.field2666 = 0;
            this.field2663 = 0;
            this.field2665 = 0;
            this.field2667 = null;
        } else {
            this.field2663 = var3.field1231;
            this.field2667 = var3.field1232;
            this.field2666 = var3.field1229;
            this.field2676 = var3.field1199;
            this.field2665 = var3.field1224 * 128;
        }
        if (this.field2676 != var2 && this.field2675 != null) {
            class18.field443.method754(this.field2675);
            this.field2675 = null;
        }
    }
}
