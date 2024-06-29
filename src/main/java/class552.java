import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class552 extends class739 {

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!pha", name = "A", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[[I", line = 5)
    public final int[][] method113(int arg0, int arg1) {
        ++field8043;
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class399.field5703; ++var7) {
                this.method3323(var7, arg0, arg1 + -22287);
                int[][] var8 = this.method4124(class728.field10227, 0, true);
                var4[var7] = var8[0][class566.field8194];
                var5[var7] = var8[1][class566.field8194];
                var6[var7] = var8[2][class566.field8194];
            }
        }
        if (arg1 != 8213) {
            method3321(-15, 9, -21);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(III)Z", line = 47)
    public static final boolean method3321(int arg0, int arg1, int arg2) {
        ++field8048;
        if (arg2 != 28889) {
            return true;
        } else {
            return ~(arg0 & 2048) != -1 | class378.method2346(arg1, 88, arg0) || class584.method3437(arg1, arg0, arg2 ^ -28917);
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZI)[I", line = 58)
    public final int[] method445(boolean arg0, int arg1) {
        ++field8045;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            for (int var4 = 0; ~class399.field5703 < ~var4; ++var4) {
                this.method3323(var4, arg1, -14074);
                int[] var5 = this.method4127(class728.field10227, 66, 0);
                var3[var4] = var5[class566.field8194];
            }
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIZIB)V", line = 96)
    public static final void method3322(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        ++field8044;
        long var6 = (long) ((!arg3 ? 0 : Integer.MIN_VALUE) | arg0);
        class37 var8 = (class37) class475.field6761.method4020(var6, (byte) -106);
        if (var8 == null) {
            var8 = new class37();
            class475.field6761.method4022(var8, 83, var6);
        }
        if (arg2 >= var8.field334.length) {
            int[] var9 = new int[arg2 - -1];
            int[] var10 = new int[arg2 - -1];
            for (int var11 = 0; var8.field334.length > var11; ++var11) {
                var9[var11] = var8.field334[var11];
                var10[var11] = var8.field332[var11];
            }
            for (int var12 = var8.field334.length; arg2 > var12; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field334 = var9;
            var8.field332 = var10;
        }
        var8.field334[arg2] = arg4;
        int var13 = 40 % ((arg5 - 13) / 45);
        var8.field332[arg2] = arg1;
    }

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "(III)V", line = 147)
    private final void method3323(int arg0, int arg1, int arg2) {
        if (arg2 == -14074) {
            ++field8046;
            int var4 = class604.field8580[arg0];
            int var5 = class19.field185[arg1];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class728.field10227 = arg1;
                class566.field8194 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class566.field8194 = arg1;
                class728.field10227 = arg0;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class566.field8194 = -arg1 + class399.field5703;
                class728.field10227 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class566.field8194 = arg0;
                class728.field10227 = -arg1 + class505.field7350;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class566.field8194 = class399.field5703 - arg0;
                class728.field10227 = -arg1 + class505.field7350;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class728.field10227 = -arg0 + class505.field7350;
                class566.field8194 = -arg1 + class399.field5703;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class728.field10227 = class505.field7350 - arg0;
                class566.field8194 = arg1;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class728.field10227 = arg1;
                class566.field8194 = -arg0 + class399.field5703;
            }
            class566.field8194 &= class423.field6029;
            class728.field10227 &= class311.field4223;
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V", line = 221)
    public class552() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lsl;IB)V", line = 225)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field8047;
        if (arg2 == 1) {
            if (arg1 == 0) {
                super.field10320 = arg0.method2886(true) == 1;
            }
        }
    }
}
