import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class711 extends class667 {

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    private int field9934 = -1;

    @OriginalMember(owner = "client!nea", name = "L", descriptor = "[C")
    public static char[] field9943 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!nea", name = "I", descriptor = "I")
    public static int field9940 = 0;

    @OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!nea", name = "J", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!nea", name = "K", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!nea", name = "M", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!nea", name = "N", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!nea", name = "O", descriptor = "I")
    private int field9946;

    @OriginalMember(owner = "client!nea", name = "P", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!nea", name = "Q", descriptor = "I")
    private int field9948;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "Leq;")
    public static class209 field9935;

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "[I")
    private int[] field9937;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V")
    public final void method3745(boolean arg0) {
        super.method3745(arg0);
        ++field9938;
        this.field9937 = null;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
    public class711() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
    public final void method3742(int arg0, int arg1, int arg2) {
        super.method3742(arg0, arg1, arg2);
        ++field9947;
        if (~this.field9934 <= -1 && class128.field1937 != null) {
            int var4 = class128.field1937.method1154(-113, this.field9934).field7706 ? 64 : 128;
            this.field9937 = class128.field1937.method1151(1.0F, var4, false, arg2 + -44718, this.field9934, var4);
            this.field9948 = var4;
            this.field9946 = var4;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(II)V")
    public static final void method3971(int arg0, int arg1) {
        class590.field8288 = arg0;
        if (arg1 < 90) {
            method3971(103, 19);
        }
        class320.field4554 = -1;
        ++field9936;
        class320.field4554 = -1;
        class63.method682((byte) 126);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLwk;)Z")
    public static final boolean method3972(byte arg0, class141 arg1) {
        ++field9933;
        class414 var2 = class66.field1181.method131(2, arg1.method1109((byte) 88));
        if (~var2.field5755 == 0) {
            return true;
        } else {
            if (arg0 >= -122) {
                field9943 = null;
            }
            class720 var3 = class93.field1631.method797(var2.field5755, false);
            return var3.field10085 == -1 ? true : var3.method4016(true);
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)V")
    public static final void method3973(int arg0) {
        ++field9939;
        class206.field2950 = 0;
        if (arg0 != 11813) {
            method3975((class149) null, -18, -21, (Canvas) null);
        }
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class196.field2807[var1] = null;
            class50.field735[var1] = 1;
            class722.field10086[var1] = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)I")
    public final int method3746(int arg0) {
        if (arg0 != 27019) {
            return -127;
        } else {
            ++field9941;
            return this.field9934;
        }
    }

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)V")
    public static void method3974(int arg0) {
        field9935 = null;
        field9943 = null;
        if (arg0 != -1) {
            method3973(-13);
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lud;II)V")
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            if (~arg2 == -1) {
                this.field9934 = arg0.method253(-13900);
            }
            ++field9942;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method777(boolean arg0, int arg1) {
        ++field9944;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (super.field9357.field5178) {
            int var4 = this.field9948 * (class694.field9758 == this.field9946 ? arg1 : this.field9946 * arg1 / class694.field9758);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class77.field1455 != ~this.field9948) {
                for (int var8 = 0; ~class77.field1455 < ~var8; ++var8) {
                    int var9 = this.field9948 * var8 / class77.field1455;
                    int var10 = this.field9937[var4 + var9];
                    var7[var8] = class555.method3246(255, var10) << 4;
                    var6[var8] = class555.method3246(4080, var10 >> 4);
                    var5[var8] = class555.method3246(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class77.field1455; ++var11) {
                    int var12 = this.field9937[var4++];
                    var7[var11] = class555.method3246(var12 << 4, 4080);
                    var6[var11] = class555.method3246(4080, var12 >> 4);
                    var5[var11] = class555.method3246(4080, var12 >> 12);
                }
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ld;IILjava/awt/Canvas;)Lha;")
    public static final class58 method3975(class149 arg0, int arg1, int arg2, Canvas arg3) {
        ++field9945;
        if (arg1 != -22023) {
            field9935 = null;
        }
        return new class594(arg3, arg0, arg2);
    }
}
