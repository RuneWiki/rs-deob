import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class763 extends class751 {

    @OriginalMember(owner = "client!eja", name = "F", descriptor = "Z")
    public static boolean field10506 = false;

    @OriginalMember(owner = "client!eja", name = "G", descriptor = "[S")
    public static short[] field10507 = new short[] { 8, 48, 49, 51, 52, 58, 11, 16 };

    @OriginalMember(owner = "client!eja", name = "A", descriptor = "I")
    private int field10501;

    @OriginalMember(owner = "client!eja", name = "B", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!eja", name = "C", descriptor = "I")
    private int field10503;

    @OriginalMember(owner = "client!eja", name = "D", descriptor = "I")
    private int field10504;

    @OriginalMember(owner = "client!eja", name = "E", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!eja", name = "H", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!eja", name = "I", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!eja", name = "J", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "()V", line = 3)
    public class763() {
        this(0);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILrv;I)V", line = 7)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field10509;
        int var4 = -13 / ((arg0 - 25) / 63);
        if (~arg2 == -1) {
            this.method4198((byte) 2, arg1.method833(-3));
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(I)V", line = 34)
    private class763(int arg0) {
        super(0, false);
        this.method4198((byte) -91, arg0);
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)V", line = 47)
    private final void method4198(byte arg0, int arg1) {
        ++field10502;
        this.field10503 = (255 & arg1) << 4;
        int var3 = -120 % ((45 - arg0) / 33);
        this.field10504 = arg1 >> 4 & 4080;
        this.field10501 = (16711680 & arg1) >> 12;
    }

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(IB)[[I", line = 60)
    public final int[][] method147(int arg0, byte arg1) {
        ++field10508;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            field10506 = true;
        }
        if (super.field10409.field8481) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class673.field9452 > var7; ++var7) {
                var4[var7] = this.field10501;
                var5[var7] = this.field10504;
                var6[var7] = this.field10503;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "(I)V", line = 98)
    public static void method4199(int arg0) {
        if (arg0 == 492193860) {
            field10507 = null;
        }
    }
}
