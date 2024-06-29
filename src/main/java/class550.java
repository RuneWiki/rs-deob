import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class550 extends class5 {

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public static int field7645 = -1;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    private int field7646;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
    private int field7647;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    private int field7648;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "[[I")
    public static int[][] field7650;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
    private final void method3034(int arg0, byte arg1) {
        this.field7647 = (arg0 & 255) << 4;
        this.field7648 = (65280 & arg0) >> 4;
        this.field7646 = arg0 >> 12 & 4080;
        ++field7651;
        if (arg1 != 6) {
            this.field7646 = -8;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method3035(byte arg0) {
        if (arg0 < -14) {
            field7650 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class550() {
        this(0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg0 != 1) {
            this.field7647 = 30;
        }
        if (arg2 == 0) {
            this.method3034(arg1.method3517(-1), (byte) 6);
        }
        ++field7652;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
    private class550(int arg0) {
        super(0, false);
        this.method3034(arg0, (byte) 6);
    }

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)I")
    public static final int method3036(int arg0) {
        ++field7649;
        if (class84.field1188) {
            return 6;
        } else if (class111.field1458 == null) {
            return 0;
        } else {
            int var1 = class111.field1458.field1873;
            if (class323.method1851(var1, 37)) {
                return 1;
            } else if (class497.method2674(var1, (byte) 84)) {
                return 2;
            } else if (class556.method3060(var1, 21922)) {
                return 3;
            } else if (class605.method3316(-1, var1)) {
                return 4;
            } else {
                if (arg0 != 4) {
                    method3035((byte) 31);
                }
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Lwr;")
    public static final class699 method3037(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class699 var4 = var3.field1021;
            var3.field1021 = null;
            class66.method393(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public static final void method3038(byte arg0) {
        int var1 = 109 % ((arg0 - -1) / 45);
        ++field7653;
        if (!class580.method3202(class504.field6675, 0) && !class581.method3205(-66, class504.field6675)) {
            int var2 = class376.field4748.field9758[0] >> 3;
            int var3 = class376.field4748.field9754[0] >> 3;
            if (~var2 <= -1 && ~(class431.field5395 >> 3) < ~var2 && ~var3 <= -1 && class452.field5802 >> 3 > var3) {
                class450.method2414(var2, var3, (byte) 118, 5000);
            } else {
                class450.method2414(class431.field5395 >> 4, class452.field5802 >> 4, (byte) 118, 0);
            }
        } else {
            class450.method2414(class20.field292 >> 12, class276.field3464 >> 12, (byte) 118, 5000);
        }
        class290.method1634(true);
        class587.method3234((byte) -38);
        class565.method3103((byte) 14);
        class138.method792(false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field7644;
        int[][] var3 = super.field135.method2706(arg0, -21);
        if (!arg1) {
            field7650 = null;
        }
        if (super.field135.field6667) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class657.field9287 > var7; ++var7) {
                var4[var7] = this.field7646;
                var5[var7] = this.field7648;
                var6[var7] = this.field7647;
            }
        }
        return var3;
    }
}
