import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class393 {

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "I")
    public static int field5800 = 0;

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "Lmga;")
    public static class739 field5802 = new class739(55, 0);

    @OriginalMember(owner = "client!gka", name = "e", descriptor = "[[I")
    public static int[][] field5803 = new int[128][128];

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "([I[IBII)V")
    public static final void method2483(int[] arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 1) {
            return;
        }
        if (arg3 > arg4) {
            int var5 = (arg4 + arg3) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if ((var10 & var9) + var7 > arg1[var10]) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2483(arg0, arg1, (byte) 1, var6 - 1, arg4);
            method2483(arg0, arg1, (byte) 1, arg3, var6 + 1);
        }
        field5801++;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V")
    public static void method2484(int arg0) {
        field5803 = null;
        field5802 = null;
        if (arg0 != 2) {
            method2484(52);
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(BI)V")
    public static final void method2485(byte arg0, int arg1) {
        class5.field53 = new int[arg1];
        field5799++;
        class597.field8135 = new int[arg1];
        class364.field5305 = new int[arg1];
        if (arg0 == -82) {
            class778.field10683 = new int[arg1];
            class121.field1768 = new int[arg1];
        }
    }
}
