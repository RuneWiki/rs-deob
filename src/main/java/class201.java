import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class201 {

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public int field2825 = -1;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "[Z")
    public static boolean[] field2818 = new boolean[100];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public int field2826;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public static final void method1223(boolean arg0) {
        class1.method3();
        field2823++;
        if (!arg0) {
            method1223(false);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class428.field6075[var1].method962(15);
        }
        class408.method2420((byte) -128);
        class461.method2689((byte) 31);
        System.gc();
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1224(int arg0) {
        if (arg0 != -17897) {
            field2818 = null;
        }
        field2818 = null;
    }
}
