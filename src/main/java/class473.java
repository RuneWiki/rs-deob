import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class473 {

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
    public int field6752 = 8;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
    public int field6753 = 16777215;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "I")
    public static int field6751 = 0;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "F")
    public static float field6757;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
    public int field6749;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "J")
    public static long field6761;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "Z")
    public boolean field6750;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "[I")
    public static int[] field6759;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BLmo;)V")
    public final void method2778(byte arg0, class695 arg1) {
        field6758++;
        if (arg0 != -57) {
            return;
        }
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                return;
            }
            this.method2779(var3, arg1, arg0 + 6681);
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILmo;I)V")
    private final void method2779(int arg0, class695 arg1, int arg2) {
        if (arg2 != 6624) {
            return;
        }
        if (arg0 == 1) {
            this.field6752 = arg1.method3847((byte) 118);
        } else if (arg0 == 2) {
            this.field6750 = true;
        } else if (arg0 == 3) {
            this.field6756 = arg1.method3814(false);
            this.field6755 = arg1.method3814(false);
            this.field6749 = arg1.method3814(false);
        } else if (arg0 == 4) {
            this.field6760 = arg1.method3826(false);
        } else if (arg0 == 5) {
            this.field6762 = arg1.method3847((byte) 118);
        } else if (arg0 == 6) {
            this.field6753 = arg1.method3873(arg2 ^ 0x191F);
        }
        field6754++;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V")
    public static void method2780(boolean arg0) {
        field6759 = null;
        if (!arg0) {
            method2780(true);
        }
    }
}
