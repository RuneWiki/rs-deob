import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class35 extends class129 {

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    private final int field606;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    private final int field610;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "I")
    private final int field615;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    private final int field613;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "Lcc;")
    public static class209 field608 = class95.method669(84, "<col=ff9040>");

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "Lcc;")
    public static class209 field611 = class95.method669(106, " weitere Optionen");

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[[B")
    public static byte[][] field614 = new byte[250][];

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method270(byte arg0) {
        field608 = null;
        field614 = null;
        field611 = null;
        if (arg0 != 40) {
            method271(104, 1);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        int var4 = this.field613 * arg1 >> 12;
        int var5 = this.field610 * arg1 >> 12;
        ++field617;
        int var6 = this.field606 * arg2 >> 12;
        if (arg0 < -106) {
            int var7 = this.field615 * arg2 >> 12;
            class42.method320((byte) -93, var5, var6, var7, var4, super.field2478, super.field2481);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
    public final void method96(int arg0, int arg1, int arg2) {
        ++field607;
        int var4 = this.field613 * arg0 >> 12;
        int var5 = this.field610 * arg0 >> 12;
        int var6 = -90 / ((37 - arg2) / 32);
        int var7 = this.field615 * arg1 >> 12;
        int var8 = this.field606 * arg1 >> 12;
        class245.method1707(super.field2475, super.field2481, var4, super.field2478, var8, var7, -118, var5);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)V")
    public final void method100(int arg0, int arg1, int arg2) {
        int var4 = this.field610 * arg2 >> 12;
        int var5 = this.field613 * arg2 >> 12;
        ++field609;
        int var6 = this.field615 * arg0 >> 12;
        if (arg1 != 100) {
            field611 = null;
        }
        int var7 = this.field606 * arg0 >> 12;
        class9.method80(var7, (byte) 109, super.field2475, var5, var6, var4);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field606 = arg1;
        this.field610 = arg0;
        this.field615 = arg3;
        this.field613 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)I")
    public static final int method271(int arg0, int arg1) {
        if (arg0 != -3236) {
            field608 = null;
        }
        ++field612;
        return 255 & arg1;
    }
}
