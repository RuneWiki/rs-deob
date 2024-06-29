import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class203 extends class751 {

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    private int field2965 = 2048;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    private int field2966 = 1024;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    private int field2971 = 3072;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "Ltga;")
    public static class64 field2970 = new class64(32);

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "Lgf;")
    public static class289 field2975;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "Lkl;")
    public static class87 field2976;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 5)
    public final void method1454(byte arg0) {
        this.field2965 = -this.field2966 + this.field2971;
        ++field2977;
        if (arg0 <= 123) {
            field2973 = 89;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I", line = 16)
    public final int[] method365(int arg0, int arg1) {
        ++field2968;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            return null;
        } else {
            if (super.field10405.field8923) {
                int[] var4 = this.method4173(arg0, (byte) -117, 0);
                for (int var5 = 0; var5 < class673.field9452; ++var5) {
                    var3[var5] = (var4[var5] * this.field2965 >> 12) + this.field2966;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 53)
    public static void method1455(int arg0) {
        field2970 = null;
        if (arg0 != 0) {
            field2970 = null;
        }
        field2976 = null;
        field2975 = null;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 70)
    public class203() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)[[I", line = 74)
    public final int[][] method147(int arg0, byte arg1) {
        if (arg1 != 57) {
            this.method147(31, (byte) 15);
        }
        ++field2967;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class673.field9452 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field2965 >> 12) + this.field2966;
                var9[var11] = (var6[var11] * this.field2965 >> 12) + this.field2966;
                var10[var11] = this.field2966 - -(var7[var11] * this.field2965 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB)V", line = 120)
    public static final void method1456(int arg0, int arg1, byte arg2) {
        if (arg2 >= -23) {
            method1456(60, -65, (byte) -54);
        }
        ++field2964;
        class678 var3 = class630.method3597(29636, 15, 0L);
        var3.method3834((byte) -113);
        var3.field9649 = arg1;
        var3.field9639 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILrv;I)V", line = 148)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field2972;
        int var4 = -78 / ((arg0 - 25) / 63);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field10415 = ~arg1.method842(2384) == -2;
                }
            } else {
                this.field2971 = arg1.method898((byte) -119);
            }
        } else {
            this.field2966 = arg1.method898((byte) -100);
        }
    }
}
