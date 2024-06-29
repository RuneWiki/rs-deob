import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class431 extends class326 {

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field5877 = 503;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "Z")
    public static boolean field5876 = false;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    private int field5873;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    private int field5874;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    private int field5878;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Z")
    public static boolean field5879;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(IB)V")
    private final void method2549(int arg0, byte arg1) {
        if (arg1 > -100) {
            this.field5878 = -126;
        }
        this.field5878 = (arg0 & 255) << 4;
        this.field5873 = (65280 & arg0) >> 4;
        this.field5874 = arg0 >> 12 & 4080;
        ++field5880;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
    public static final int method2550(int arg0, int arg1, int arg2, int arg3) {
        ++field5875;
        int var4 = ((arg2 & 16711935) * arg0 & -16711936 | (65280 & arg2) * arg0 & 16711680) >>> 8;
        if (arg1 != -31673) {
            method2550(-19, -10, 16, -120);
        }
        int var5 = -arg0 + 255;
        return ((-16711936 & (arg3 & 16711935) * var5 | (arg3 & 65280) * var5 & 16711680) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    private class431(int arg0) {
        super(0, false);
        this.method2549(arg0, (byte) -115);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        ++field5881;
        int[][] var3 = super.field4343.method2356(arg0, 99);
        if (arg1 > -52) {
            this.method33(1, (class32) null, 37);
        }
        if (super.field4343.field5336) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class181.field2495; ++var7) {
                var4[var7] = this.field5874;
                var5[var7] = this.field5873;
                var6[var7] = this.field5878;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 >= -3) {
            this.field5873 = 26;
        }
        if (arg0 == 0) {
            this.method2549(arg1.method219(-116), (byte) -122);
        }
        ++field5882;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class431() {
        this(0);
    }
}
