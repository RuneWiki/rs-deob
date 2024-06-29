import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class544 {

    @OriginalMember(owner = "client!su", name = "h", descriptor = "Loaa;")
    private class556 field7579;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "J")
    public long field7572;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field7577 = 0;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "[I")
    public static int[] field7578;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
    public static void method3221(byte arg0) {
        field7578 = null;
        if (arg0 != -64) {
            method3221((byte) -8);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Z")
    public static final boolean method3222(int arg0, int arg1, int arg2) {
        field7576++;
        if (arg2 != -1) {
            method3223(-43, -115);
        }
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7579.method3271(2, this.field7572);
        field7573++;
        super.finalize();
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
    public static final void method3223(int arg0, int arg1) {
        field7575++;
        int var2 = class533.field7336 - class730.field10105;
        if (var2 >= 100) {
            class362.field5225 = -1;
            class5.field30 = -1;
            class695.field9691 = 1;
            return;
        }
        int var3 = (int) class514.field7053;
        if (class480.field6649 >> 8 > var3) {
            var3 = class480.field6649 >> 8;
        }
        if (class412.field5778[4] && (class692.field9665[4] + 128) > var3) {
            var3 = class692.field9665[4] + 128;
        }
        int var4 = (int) class702.field9790 + class68.field748 & 0x3FFF;
        class461.method2776(class693.field9671, var4, var3, -23064, class548.field7650, arg0, class373.method2316(class724.field10031.field3470, class435.field6040, class724.field10031.field3460, arg1 - 180) - 200, (var3 >> 3) * 3 + 600 << 2);
        float var5 = 1.0F - ((float) ((arg1 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class412.field5779 = (int) ((float) (class412.field5779 - class164.field2096) * var5 + (float) class164.field2096);
        class479.field6645 = (int) ((float) (class479.field6645 - class270.field3902) * var5 + (float) class270.field3902);
        class472.field6537 = (int) ((float) (class472.field6537 - class379.field5437) * var5 + (float) class379.field5437);
        class497.field6818 = (int) ((float) (class497.field6818 - class773.field10652) * var5 + (float) class773.field10652);
        int var6 = class326.field4589 - class623.field8732;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class326.field4589 = (int) ((float) var6 * var5 + (float) class623.field8732);
        class326.field4589 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Loaa;JI)V")
    public class544(class556 arg0, long arg1, int arg2) {
        this.field7579 = arg0;
        this.field7572 = arg1;
    }
}
