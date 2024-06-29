import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class394 extends class1 {

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    private int field5487;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    private int field5489;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    private int field5494;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public static int field5493 = 0;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field5486 = 0;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V")
    public static final void method2247(int arg0, int arg1) {
        class222.field3213 = false;
        class268.field3802 = 1;
        class457.field6471 = 0;
        ++field5484;
        if (arg0 == -203790036) {
            class674.field9486 = -1;
            class7.field68 = null;
            class599.field8326 = arg1;
            class630.field8791 = -1;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZI)V")
    public final void method2(int arg0, boolean arg1, int arg2) {
        ++field5492;
        int var4 = this.field5490 * arg0 >> 12;
        int var5 = this.field5489 * arg0 >> 12;
        if (!arg1) {
            field5486 = -54;
        }
        int var6 = this.field5494 * arg2 >> 12;
        int var7 = this.field5487 * arg2 >> 12;
        class36.method170(super.field7, 8191, var7, var6, var5, var4);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IIIIIII)V")
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5487 = arg3;
        this.field5489 = arg2;
        this.field5490 = arg0;
        this.field5494 = arg1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZ)V")
    public final void method8(int arg0, int arg1, boolean arg2) {
        ++field5485;
        int var4 = this.field5490 * arg1 >> 12;
        if (arg2) {
            this.field5487 = 67;
        }
        int var5 = this.field5489 * arg1 >> 12;
        int var6 = this.field5494 * arg0 >> 12;
        int var7 = this.field5487 * arg0 >> 12;
        class232.method1469(var7, super.field4, var5, var4, super.field2, var6, true);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIZBII)V")
    public static final void method2248(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        ++field5491;
        long var6 = (long) (arg5 | (!arg2 ? 0 : Integer.MIN_VALUE));
        class421 var8 = (class421) class587.field8203.method2061(-17305, var6);
        if (var8 == null) {
            var8 = new class421();
            class587.field8203.method2063(var6, 1, var8);
        }
        int var9 = -28 / ((arg3 - 17) / 56);
        if (var8.field5945.length <= arg1) {
            int[] var10 = new int[arg1 + 1];
            int[] var11 = new int[arg1 - -1];
            for (int var12 = 0; ~var12 > ~var8.field5945.length; ++var12) {
                var10[var12] = var8.field5945[var12];
                var11[var12] = var8.field5946[var12];
            }
            for (int var13 = var8.field5945.length; var13 < arg1; ++var13) {
                var10[var13] = -1;
                var11[var13] = 0;
            }
            var8.field5945 = var10;
            var8.field5946 = var11;
        }
        var8.field5945[arg1] = arg0;
        var8.field5946[arg1] = arg4;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)V")
    public final void method6(int arg0, int arg1, int arg2) {
        ++field5488;
        int var4 = this.field5490 * arg1 >> 12;
        int var5 = this.field5489 * arg1 >> 12;
        if (arg0 >= -96) {
            this.method6(-33, -60, 37);
        }
        int var6 = this.field5494 * arg2 >> 12;
        int var7 = this.field5487 * arg2 >> 12;
        class105.method798((byte) 126, super.field7, var4, var6, super.field4, var5, var7, super.field2);
    }
}
