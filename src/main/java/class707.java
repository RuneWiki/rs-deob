import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class707 extends class362 {

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    private int field9724 = -1;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lvl;")
    public static class15 field9712 = new class15(47, -1);

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "[I")
    public static int[] field9722 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lul;")
    public static class599 field9721 = new class599(1);

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field9726 = new String[100];

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Lfja;")
    public static class783 field9725 = new class783(29, 1);

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    private int field9718;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    private int field9720;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field9728;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Lct;")
    public static class157 field9716;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lsaa;")
    public static class347 field9727;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Lwu;")
    public static class394 field9714;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[I")
    private int[] field9713;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
    public final int method2219(byte arg0) {
        ++field9715;
        return arg0 != 11 ? -102 : this.field9724;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public final void method400(byte arg0) {
        super.method400((byte) -87);
        ++field9717;
        if (arg0 >= -67) {
            this.method400((byte) -90);
        }
        this.field9713 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field9719;
        if (arg1 < 57) {
            return null;
        } else {
            int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
            if (super.field4938.field7848) {
                int var4 = (class555.field7845 != this.field9720 ? this.field9720 * arg0 / class555.field7845 : arg0) * this.field9718;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class769.field10597 != ~this.field9718) {
                    for (int var8 = 0; var8 < class769.field10597; ++var8) {
                        int var9 = this.field9718 * var8 / class769.field10597;
                        int var10 = this.field9713[var4 + var9];
                        var7[var8] = class204.method1456(4080, var10 << 4);
                        var6[var8] = class204.method1456(var10, 65280) >> 4;
                        var5[var8] = class204.method1456(var10 >> 12, 4080);
                    }
                } else {
                    for (int var11 = 0; class769.field10597 > var11; ++var11) {
                        int var12 = this.field9713[var4++];
                        var7[var11] = class204.method1456(255, var12) << 4;
                        var6[var11] = class204.method1456(4080, var12 >> 4);
                        var5[var11] = class204.method1456(var12, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method3950(byte arg0) {
        field9725 = null;
        field9727 = null;
        field9712 = null;
        field9716 = null;
        field9726 = null;
        field9722 = null;
        field9721 = null;
        field9714 = null;
        if (arg0 > -110) {
            method3950((byte) -68);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field9728;
        if (~arg1 == arg2) {
            this.field9724 = arg0.method763(85);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method2220(int arg0, int arg1, int arg2) {
        super.method2220(arg0, arg1, arg2);
        if (arg0 != -256) {
            this.method2220(-116, 20, 74);
        }
        ++field9723;
        if (this.field9724 >= 0 && class609.field8505 != null) {
            int var4 = class609.field8505.method1270(this.field9724, true).field4248 ? 64 : 128;
            this.field9713 = class609.field8505.method1269(1.0F, var4, false, this.field9724, var4, true);
            this.field9720 = var4;
            this.field9718 = var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class707() {
        super(0, false);
    }
}
