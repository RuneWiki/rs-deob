import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class422 extends class694 {

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    private int field5963 = -1;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Loj;")
    public static class346 field5960 = new class346(512);

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    private int field5955;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field5959;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "[I")
    private int[] field5961;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLkf;)I")
    public static final int method2400(byte arg0, class229 arg1) {
        ++field5962;
        if (arg0 != 61) {
            field5960 = null;
        }
        if (class145.field2161 == arg1) {
            return 6407;
        } else if (class583.field8126 != arg1) {
            if (class381.field5355 != arg1) {
                if (class94.field1240 == arg1) {
                    return 6409;
                } else if (class312.field4637 == arg1) {
                    return 6410;
                } else if (class283.field3931 == arg1) {
                    return 6145;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                return 6406;
            }
        } else {
            return 6408;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method2401(byte arg0) {
        field5960 = null;
        if (arg0 != 85) {
            field5960 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class422() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final void method14(int arg0) {
        ++field5958;
        super.method14(arg0);
        this.field5961 = null;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
    public final int method2402(int arg0) {
        if (arg0 != 18289) {
            field5960 = null;
        }
        ++field5957;
        return this.field5963;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field5956;
        if (arg0 != -22151) {
            this.field5955 = 39;
        }
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int var4 = this.field5959 * (~class250.field3529 != ~this.field5955 ? this.field5955 * arg1 / class250.field3529 : arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class465.field6544 == ~this.field5959) {
                for (int var8 = 0; var8 < class465.field6544; ++var8) {
                    int var9 = this.field5961[var4++];
                    var7[var8] = class249.method1537(255, var9) << 4;
                    var6[var8] = class249.method1537(var9 >> 4, 4080);
                    var5[var8] = class249.method1537(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class465.field6544; ++var10) {
                    int var11 = this.field5959 * var10 / class465.field6544;
                    int var12 = this.field5961[var4 + var11];
                    var7[var10] = class249.method1537(var12, 255) << 4;
                    var6[var10] = class249.method1537(var12 >> 4, 4080);
                    var5[var10] = class249.method1537(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field5954;
        int var4 = -37 / ((58 - arg2) / 63);
        if (arg0 == 0) {
            this.field5963 = arg1.method743((byte) -85);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public final void method2403(int arg0, int arg1, int arg2) {
        ++field5964;
        super.method2403(arg0, arg1, arg2);
        if (arg2 != -256) {
            this.field5959 = 49;
        }
        if (~this.field5963 <= -1 && class277.field3882 != null) {
            int var4 = class277.field3882.method588(-26679, this.field5963).field3823 ? 64 : 128;
            this.field5961 = class277.field3882.method586(this.field5963, var4, 1.0F, var4, false, 102);
            this.field5955 = var4;
            this.field5959 = var4;
        }
    }
}
