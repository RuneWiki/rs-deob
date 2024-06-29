import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class407 extends class207 {

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "Z")
    public static boolean field5770;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Lrb;")
    public static class283 field5771;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "Z")
    public static boolean field5772;

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[I")
    public static int[] field5773;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static void method2388(byte arg0) {
        if (arg0 <= 77) {
            method2388((byte) 84);
        }
        field5771 = null;
        field5773 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)V")
    public static final void method2389(byte arg0, int arg1) {
        field5768++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        if (arg0 <= 37) {
            method2389((byte) 121, 6);
        }
        class330.field4488 = arg1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ[II[I)V")
    public static final void method2390(int arg0, boolean arg1, int[] arg2, int arg3, int[] arg4) {
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg3; var10++) {
                if (arg2[var10] < (var10 & var9) + var7) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method2390(arg0, true, arg2, var6 - 1, arg4);
            method2390(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (!arg1) {
            field5772 = false;
        }
        field5769++;
    }

    static {
        new class157("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field5770 = false;
        field5771 = new class283(41, 2);
        field5772 = false;
        field5773 = new int[1000];
    }
}
