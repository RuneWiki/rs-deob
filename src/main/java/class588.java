import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class588 extends class739 {

    @OriginalMember(owner = "client!nw", name = "T", descriptor = "I")
    private int field8245 = -1;

    @OriginalMember(owner = "client!nw", name = "G", descriptor = "[[I")
    public static int[][] field8232 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nw", name = "N", descriptor = "[[I")
    public static int[][] field8239 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nw", name = "E", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!nw", name = "F", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!nw", name = "H", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!nw", name = "I", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!nw", name = "J", descriptor = "I")
    private int field8235;

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!nw", name = "L", descriptor = "I")
    private int field8237;

    @OriginalMember(owner = "client!nw", name = "M", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!nw", name = "P", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!nw", name = "Q", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!nw", name = "R", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!nw", name = "S", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!nw", name = "O", descriptor = "[I")
    private int[] field8240;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I")
    public final int method3336(int arg0) {
        ++field8238;
        if (arg0 != -1) {
            this.field8245 = -22;
        }
        return this.field8245;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
    public class588() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field8233;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 < 26) {
            method3340(-103, 6, -13, 95, -120, 99, 29);
        }
        if (super.field10312.field4922) {
            int var4 = (~class549.field7672 == ~this.field8235 ? arg1 : this.field8235 * arg1 / class549.field7672) * this.field8237;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class29.field523 != this.field8237) {
                for (int var8 = 0; var8 < class29.field523; ++var8) {
                    int var9 = this.field8237 * var8 / class29.field523;
                    int var10 = this.field8240[var4 + var9];
                    var7[var8] = class702.method3949(255, var10) << 4;
                    var6[var8] = class702.method3949(65280, var10) >> 4;
                    var5[var8] = class702.method3949(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class29.field523 > var11; ++var11) {
                    int var12 = this.field8240[var4++];
                    var7[var11] = class702.method3949(4080, var12 << 4);
                    var6[var11] = class702.method3949(var12, 65280) >> 4;
                    var5[var11] = class702.method3949(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lria;I)Lria;")
    public static final class288 method3337(class288 arg0, int arg1) {
        ++field8242;
        if (arg1 != 1) {
            return null;
        } else {
            class288 var2 = client.method1830(arg0);
            if (var2 == null) {
                var2 = arg0.field3719;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BII)V")
    public final void method3338(byte arg0, int arg1, int arg2) {
        ++field8234;
        super.method3338(arg0, arg1, arg2);
        if (~this.field8245 <= -1 && class712.field9870 != null) {
            int var4 = !class712.field9870.method1072(this.field8245, true).field7460 ? 128 : 64;
            this.field8240 = class712.field9870.method1069(var4, this.field8245, false, var4, 1.0F, 6766);
            this.field8237 = var4;
            this.field8235 = var4;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field8245 = arg0.method2566(-2);
        }
        if (arg2 == -3) {
            ++field8236;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
    public final void method1886(boolean arg0) {
        super.method1886(arg0);
        ++field8244;
        if (arg0) {
            this.field8240 = null;
        }
        this.field8240 = null;
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(III)V")
    public static final void method3339(int arg0, int arg1, int arg2) {
        ++field8241;
        if (class722.field10048 != class293.field3867) {
            if (class648.method3633(0, 1, 0, -3, false, arg1, 1, arg0, 17829)) {
                return;
            }
            class648.method3633(0, 1, 0, -2, false, arg1, 1, arg0, 17829);
        } else {
            if (class648.method3633(0, 1, 0, -2, false, arg1, 1, arg0, 17829)) {
                return;
            }
            class648.method3633(0, 1, 0, -3, false, arg1, 1, arg0, arg2 + 43478);
        }
        if (arg2 != -25649) {
            field8239 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -21876) {
            field8239 = null;
        }
        class683.field9521 = arg1;
        class689.field9592 = arg3;
        class165.field2300 = arg0;
        class510.field7190 = arg6;
        class155.field2117 = arg2;
        class639.field8842 = arg5;
        ++field8231;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IB)V")
    public static final void method3341(int arg0, byte arg1) {
        class136.field1950 = -1;
        class35.field563 = 3;
        ++field8230;
        class389.field4973 = arg0;
        if (arg1 != -15) {
            field8239 = null;
        }
        class601.field8362 = 100;
    }

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)V")
    public static void method3342(int arg0) {
        field8239 = null;
        if (arg0 != 0) {
            method3340(92, 55, -57, 26, 44, -27, 68);
        }
        field8232 = null;
    }

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "(III)Z")
    public static final boolean method3343(int arg0, int arg1, int arg2) {
        ++field8243;
        if (arg0 != 1248) {
            method3343(-113, -21, -33);
        }
        return class532.method3055(arg2, true, arg1) & class31.method206(11137, arg2, arg1);
    }
}
