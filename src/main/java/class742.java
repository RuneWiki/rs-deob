import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class742 extends class739 {

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    private int field10352 = 32768;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "Llc;")
    public static class435 field10350 = new class435(29, -2);

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "[[I")
    public static int[][] field10353 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field10346;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field10349;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "[[[I")
    public static int[][][] field10347;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field10351;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field10320 = arg0.method2886(true) == 1;
            }
        } else {
            this.field10352 = arg0.method2882(arg2 ^ -2) << 4;
        }
        if (arg2 != 1) {
            method4133(-14);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field10348;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int[] var4 = this.method4127(arg1, 68, 1);
            int[] var5 = this.method4127(arg1, 120, 2);
            for (int var6 = 0; class399.field5703 > var6; ++var6) {
                int var7 = (var4[var6] & 4081) >> 4;
                int var8 = var5[var6] * this.field10352 >> 12;
                int var9 = class195.field2853[var7] * var8 >> 12;
                int var10 = class624.field8880[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class423.field6029;
                int var12 = arg1 - -(var10 >> 12) & class311.field4223;
                int[] var13 = this.method4127(var12, 65, 0);
                var3[var6] = var13[var11];
            }
        }
        if (arg0) {
            this.method113(18, 117);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        class451.method2765(8);
        if (arg0 > 53) {
            ++field10346;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class742() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
    public static void method4133(int arg0) {
        field10347 = null;
        field10353 = null;
        field10350 = null;
        if (arg0 != -100523764) {
            method4133(-110);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[[I")
    public final int[][] method113(int arg0, int arg1) {
        ++field10349;
        if (arg1 != 8213) {
            field10350 = null;
        }
        int[][] var3 = super.field10328.method2106(arg0, true);
        if (super.field10328.field4727) {
            int[] var4 = this.method4127(arg0, arg1 + -8111, 1);
            int[] var5 = this.method4127(arg0, 124, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class399.field5703; ++var9) {
                int var10 = (var4[var9] * 255 & 1047768) >> 12;
                int var11 = var5[var9] * this.field10352 >> 12;
                int var12 = class195.field2853[var10] * var11 >> 12;
                int var13 = class624.field8880[var10] * var11 >> 12;
                int var14 = class423.field6029 & (var12 >> 12) + var9;
                int var15 = class311.field4223 & (var13 >> 12) + arg0;
                int[][] var16 = this.method4124(var15, 0, true);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
