import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class253 extends class354 {

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    private int field3519;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lnj;II)V", line = 3)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field3518;
        if (arg2 != 1638) {
            field3514 = -97;
        }
        if (~arg1 == -1) {
            this.method1644(-20849, arg0.method1090(-1));
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 31)
    public class253() {
        this(0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 37)
    private final void method1644(int arg0, int arg1) {
        ++field3520;
        if (arg0 != -20849) {
            this.method272((class164) null, 72, 28);
        }
        this.field3521 = arg1 >> 4 & 4080;
        this.field3517 = (16711680 & arg1) >> 12;
        this.field3519 = arg1 << 4 & 4080;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[[I", line = 51)
    public final int[][] method354(int arg0, byte arg1) {
        ++field3516;
        int[][] var3 = super.field5474.method2414((byte) -122, arg0);
        int var4 = -32 / ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class531.field7814 > var8; ++var8) {
                var5[var8] = this.field3517;
                var6[var8] = this.field3521;
                var7[var8] = this.field3519;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V", line = 95)
    private class253(int arg0) {
        super(0, false);
        this.method1644(-20849, arg0);
    }
}
