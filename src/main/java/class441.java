import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class441 extends class383 {

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
    public String field6312;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
    public static int[] field6314 = new int[14];

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Lkg;")
    public static class179 field6313 = new class179(61, 7);

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Ll;")
    public static class16 field6315;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "[I")
    public static int[] field6318;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method2589(byte arg0) {
        field6314 = null;
        field6318 = null;
        field6315 = null;
        if (arg0 != 8) {
            field6315 = null;
        }
        field6313 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
    public static final void method2590(Object[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field6311++;
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if ((var9 & var10) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method2590(arg0, var6 - 1, arg2, -99, arg4);
            method2590(arg0, arg1, arg2, -78, var6 + 1);
        }
        if (arg3 > -39) {
            method2589((byte) 82);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class441() {
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class441(String arg0) {
        this.field6312 = arg0;
    }
}
