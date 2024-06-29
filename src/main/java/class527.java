import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class527 {

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field6657 = 0;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Ltl;")
    public static class580 field6656 = new class580();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lpfa;")
    public static class275 field6658;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
    public static final void method2845(Object[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            method2845(null, -116, null, -16, -29);
        }
        field6654++;
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg3; var10++) {
            if (arg2[var10] < (var10 & var9) + var7) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                Object var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var8;
        method2845(arg0, arg1, arg2, var6 - 1, 0);
        method2845(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILji;)V")
    public final void method2846(int arg0, class572 arg1) {
        if (arg0 != -1) {
            this.method2846(97, null);
        }
        while (true) {
            int var3 = arg1.method3097((byte) 12);
            if (var3 == 0) {
                field6659++;
                return;
            }
            this.method2847(var3, arg1, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILji;B)V")
    private final void method2847(int arg0, class572 arg1, byte arg2) {
        if (arg0 == 5) {
            this.field6657 = arg1.method3031(-1);
        }
        field6655++;
        if (arg2 > -1) {
            field6656 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
    public static final void method2848(byte arg0, int arg1, int arg2) {
        field6653++;
        if (class528.field6661 != arg1) {
            class136.field1654 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class136.field1654[var3] = (var3 << 12) / arg1;
            }
            class528.field6661 = arg1;
            class376.field4836 = arg1 - 1;
            class437.field5500 = arg1 * 32;
        }
        if (class383.field4916 != arg2) {
            if (class528.field6661 == arg2) {
                class596.field8003 = class136.field1654;
            } else {
                class596.field8003 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class596.field8003[var4] = (var4 << 12) / arg2;
                }
            }
            class251.field3236 = arg2 - 1;
            class383.field4916 = arg2;
        }
        if (arg0 != -112) {
            method2848((byte) 42, -118, -73);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2849(byte arg0) {
        field6658 = null;
        field6656 = null;
        int var1 = -9 % ((arg0 + 46) / 33);
    }
}
