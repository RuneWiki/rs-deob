import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class411 extends class56 {

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field5801 = 0;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Z")
    public static boolean field5804 = false;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field5805;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    private int field5806;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    private int field5808;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method5(int arg0, int arg1) {
        ++field5802;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class328.field4576; ++var7) {
                var4[var7] = this.field5806;
                var5[var7] = this.field5805;
                var6[var7] = this.field5808;
            }
        }
        if (arg1 != 1) {
            this.method5(21, -71);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V", line = 43)
    private class411(int arg0) {
        super(0, false);
        this.method2534((byte) -106, arg0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)V", line = 52)
    private final void method2534(byte arg0, int arg1) {
        this.field5808 = (arg1 & 255) << 4;
        this.field5806 = (16711680 & arg1) >> 12;
        if (arg0 >= -62) {
            field5807 = 107;
        }
        ++field5803;
        this.field5805 = 4080 & arg1 >> 4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILee;I)V", line = 77)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg2 == 0) {
            this.method2534((byte) -109, arg1.method3756(false));
        }
        if (arg0 == 3731) {
            ++field5809;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 104)
    public class411() {
        this(0);
    }
}
