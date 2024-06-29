import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class195 extends class748 {

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!qga", name = "I", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!qga", name = "J", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!qga", name = "K", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!qga", name = "L", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qga", name = "M", descriptor = "I")
    private int field2823;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(II)V", line = 3)
    private final void method1321(int arg0, int arg1) {
        this.field2818 = (255 & arg0) << 4;
        this.field2823 = (16711680 & arg0) >> 12;
        this.field2820 = 4080 & arg0 >> 4;
        ++field2819;
        if (arg1 != 191679300) {
            this.method445(27, 107);
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(I)V", line = 22)
    private class195(int arg0) {
        super(0, false);
        this.method1321(arg0, 191679300);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZLvj;)V", line = 30)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg0 == 0) {
            this.method1321(arg2.method186((byte) 108), 191679300);
        }
        if (!arg1) {
            ++field2822;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)[[I", line = 57)
    public final int[][] method445(int arg0, int arg1) {
        ++field2821;
        if (arg1 != 0) {
            this.method20(-12, true, (class26) null);
        }
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (super.field10420.field1979) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class424.field5889 < ~var7; ++var7) {
                var4[var7] = this.field2823;
                var5[var7] = this.field2820;
                var6[var7] = this.field2818;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V", line = 97)
    public class195() {
        this(0);
    }
}
