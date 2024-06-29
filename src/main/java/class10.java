import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class36 {

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Lig;")
    public static class206 field84 = new class206(28, 2);

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "Lhb;")
    public static class629 field85 = new class629(3, 6);

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "Lsd;")
    private class80 field83;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method53(int arg0) {
        field85 = null;
        int var1 = 39 / (arg0 / 37);
        field84 = null;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILrt;I)V")
    private final void method54(int arg0, class194 arg1, int arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method1177(255);
            if (this.field83 == null) {
                int var5 = class367.method2354(-224121456, var4);
                this.field83 = new class80(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1177(255) == 1;
                int var8 = arg1.method1180(-832631516);
                class324 var9;
                if (var7) {
                    var9 = new class621(arg1.method1218(false));
                } else {
                    var9 = new class388(arg1.method1178(-230315992));
                }
                this.field83.method520((byte) -111, var9, (long) var8);
            }
        }
        int var10 = 18 / ((60 - arg2) / 60);
        field81++;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method55(int arg0, String arg1, int arg2) {
        field88++;
        if (arg2 != 1) {
            field84 = null;
        }
        if (this.field83 == null) {
            return arg1;
        } else {
            class621 var4 = (class621) this.field83.method524((byte) 126, (long) arg0);
            return var4 == null ? arg1 : var4.field8996;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)Z")
    public static final boolean method56(int arg0, int arg1) {
        if (arg1 != 3521) {
            field85 = null;
        }
        field87++;
        return arg0 == 6 || arg0 == 7 || arg0 == 8;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IB)V")
    public static final void method57(int arg0, byte arg1) {
        field82++;
        int var2 = 106 / ((arg1 + 82) / 37);
        if (!class227.method1477(arg0, -1)) {
            return;
        }
        class593[] var3 = class297.field4403[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class593 var5 = var3[var4];
            if (var5 != null) {
                var5.field8524 = 0;
                var5.field8571 = 1;
                var5.field8631 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Loa;Lva;IIIII)V")
    public static final void method58(class605 arg0, class429 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class637.field9161 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class588.field8441) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class91.field1047 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class99 var15 = class431.field6408[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class435.field6449[var12].method259(var13, var14) + class435.field6449[var12].method259(var13 + 1, var14) + class435.field6449[var12].method259(var13, var14 + 1) + class435.field6449[var12].method259(var13 + 1, var14 + 1)) / 4 - (class435.field6449[arg2].method259(arg3, arg4) + class435.field6449[arg2].method259(arg3 + 1, arg4) + class435.field6449[arg2].method259(arg3, arg4 + 1) + class435.field6449[arg2].method259(arg3 + 1, arg4 + 1)) / 4;
                                    class599 var17 = var15.field1168;
                                    class599 var18 = var15.field1176;
                                    if (var17 != null && var17.method84(1630)) {
                                        arg1.method86(7, (var13 - arg3) * class193.field2559 + (1 - arg5) * class170.field2095, (var14 - arg4) * class193.field2559 + (1 - arg6) * class170.field2095, var17, arg0, var7, var16);
                                    }
                                    if (var18 != null && var18.method84(1630)) {
                                        arg1.method86(7, (var13 - arg3) * class193.field2559 + (1 - arg5) * class170.field2095, (var14 - arg4) * class193.field2559 + (1 - arg6) * class170.field2095, var18, arg0, var7, var16);
                                    }
                                    for (class104 var19 = var15.field1167; var19 != null; var19 = var19.field1251) {
                                        class144 var20 = var19.field1253;
                                        if (var20 != null && var20.method84(1630) && (var20.field1773 == var13 || var8 == var13) && (var20.field1758 == var14 || var10 == var14)) {
                                            int var21 = var20.field1762 + 1 - var20.field1773;
                                            int var22 = var20.field1761 + 1 - var20.field1758;
                                            arg1.method86(7, (var20.field1773 - arg3) * class193.field2559 + (var21 - arg5) * class170.field2095, (var20.field1758 - arg4) * class193.field2559 + (var22 - arg6) * class170.field2095, var20, arg0, var7, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIZII)V")
    public static final void method59(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field86++;
        if ((arg4 ? class595.field8694.field6529 : class595.field8694.field6532) != 0 && arg5 != 0 && class220.field3015 < 50 && arg0 != -1) {
            class526.field7632[class220.field3015++] = new class85((byte) (arg4 ? 3 : 2), arg0, arg5, arg1, arg3, arg6);
        }
        int var7 = -4 % ((-arg2 - 46) / 55);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLrt;)V")
    public final void method60(boolean arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                field90++;
                if (!arg0) {
                    this.method60(false, null);
                    return;
                }
                return;
            }
            this.method54(var3, arg1, -91);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZII)I")
    public final int method61(boolean arg0, int arg1, int arg2) {
        field89++;
        if (this.field83 == null) {
            return arg2;
        }
        class388 var4 = (class388) this.field83.method524((byte) 87, (long) arg1);
        if (arg0) {
            return var4 == null ? arg2 : var4.field5965;
        } else {
            return -74;
        }
    }
}
