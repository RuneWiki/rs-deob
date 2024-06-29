import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class141 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "B")
    private byte field2723;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lsg;")
    public static class30 field2726 = class167.method1221((byte) 33, "name_icons");

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lsg;")
    private static class30 field2729 = class167.method1221((byte) 33, " is already on your ignore list)3");

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lsg;")
    public static class30 field2727 = field2729;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Lvi;")
    public static class5 field2734 = new class5(0, 0);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "[Lpj;")
    public static class152[] field2736;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "[Lgj;")
    public static class192[] field2732;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field2727 = null;
        field2736 = null;
        if (arg0 > -6) {
            method1051(108);
        }
        field2732 = null;
        field2726 = null;
        field2729 = null;
        field2734 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)I")
    public final int method1052(byte arg0) {
        field2735++;
        return arg0 <= 87 ? -124 : this.field2723 & 0x7;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)I")
    public final int method1053(byte arg0) {
        field2721++;
        int var2 = 75 % ((arg0 + 24) / 50);
        return (this.field2723 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class141() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Laa;)V")
    public class141(class8 arg0) {
        this.field2723 = arg0.method98(1);
        this.field2737 = arg0.method65((byte) 121);
        this.field2725 = arg0.method70(65280);
        this.field2728 = arg0.method70(65280);
        this.field2724 = arg0.method70(65280);
        this.field2733 = arg0.method70(65280);
    }
}
