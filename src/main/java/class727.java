import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class727 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field10184 = 0;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIB[Ljava/lang/Object;[I)V", line = 13)
    public static final void method4030(int arg0, int arg1, byte arg2, Object[] arg3, int[] arg4) {
        int var5 = 108 / ((arg2 - 35) / 39);
        if (arg0 > arg1) {
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg1;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var8;
            Object var9 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if ((var10 & var11) + var8 > arg4[var11]) {
                    int var12 = arg4[var11];
                    arg4[var11] = arg4[var7];
                    arg4[var7] = var12;
                    Object var13 = arg3[var11];
                    arg3[var11] = arg3[var7];
                    arg3[var7++] = var13;
                }
            }
            arg4[arg0] = arg4[var7];
            arg4[var7] = var8;
            arg3[arg0] = arg3[var7];
            arg3[var7] = var9;
            method4030(var7 - 1, arg1, (byte) -23, arg3, arg4);
            method4030(arg0, var7 + 1, (byte) 103, arg3, arg4);
        }
        field10183++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILtia;)Ltia;")
    public abstract class16 method1220(int arg0, class16 arg1);
}
