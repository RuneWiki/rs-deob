import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class682 extends class666 {

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "[I")
    public static int[] field9684 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "Lpr;")
    public static class407 field9678 = new class407(74, -2);

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "Z")
    public static boolean field9687 = false;

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "I")
    private int field9679;

    @OriginalMember(owner = "client!hda", name = "G", descriptor = "I")
    private int field9680;

    @OriginalMember(owner = "client!hda", name = "H", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "I")
    private int field9682;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "Ljo;")
    public static class303 field9686;

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V", line = 6)
    private class682(int arg0) {
        super(0, false);
        this.method3808(arg0, 0);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILiaa;Z)V", line = 17)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 == -1) {
            this.method3808(arg1.method2524(3), 0);
        }
        if (!arg2) {
            this.method3808(-61, 69);
        }
        ++field9681;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V", line = 45)
    public class682() {
        this(0);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)[[I", line = 50)
    public final int[][] method1251(int arg0, byte arg1) {
        if (arg1 != 98) {
            return null;
        } else {
            ++field9683;
            int[][] var3 = super.field9471.method3639(104, arg0);
            if (super.field9471.field9180) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class501.field7222; ++var7) {
                    var4[var7] = this.field9682;
                    var5[var7] = this.field9680;
                    var6[var7] = this.field9679;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)V", line = 88)
    private final void method3808(int arg0, int arg1) {
        this.field9679 = arg0 << 4 & 4080;
        if (arg1 == 0) {
            ++field9677;
            this.field9680 = 4080 & arg0 >> 4;
            this.field9682 = (16711680 & arg0) >> 12;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V", line = 104)
    public static void method3809(byte arg0) {
        field9678 = null;
        field9686 = null;
        field9684 = null;
        if (arg0 != -72) {
            field9684 = null;
        }
    }
}
