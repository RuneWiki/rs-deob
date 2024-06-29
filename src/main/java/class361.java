import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class361 implements class69 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public static int[] field4950 = new int[8];

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[[B")
    public static byte[][] field4952 = new byte[1000][];

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lqa;Lco;IIIII)V")
    public static final void method2002(class162 arg0, class76 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class401.field5574 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class469.field6860) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class472.field6900 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class61 var15 = class385.field5410[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class383.field5391[var12].method221(var13, var14) + class383.field5391[var12].method221(var13 + 1, var14) + class383.field5391[var12].method221(var13, var14 + 1) + class383.field5391[var12].method221(var13 + 1, var14 + 1)) / 4 - (class383.field5391[arg2].method221(arg3, arg4) + class383.field5391[arg2].method221(arg3 + 1, arg4) + class383.field5391[arg2].method221(arg3, arg4 + 1) + class383.field5391[arg2].method221(arg3 + 1, arg4 + 1)) / 4;
                                    class134 var17 = var15.field814;
                                    class134 var18 = var15.field832;
                                    if (var17 != null && var17.method399(false)) {
                                        arg1.method394((var14 - arg4) * class234.field3248 + (1 - arg6) * class77.field1110, var16, var17, (var13 - arg3) * class234.field3248 + (1 - arg5) * class77.field1110, arg0, var7, true);
                                    }
                                    if (var18 != null && var18.method399(false)) {
                                        arg1.method394((var14 - arg4) * class234.field3248 + (1 - arg6) * class77.field1110, var16, var18, (var13 - arg3) * class234.field3248 + (1 - arg5) * class77.field1110, arg0, var7, true);
                                    }
                                    for (class302 var19 = var15.field819; var19 != null; var19 = var19.field4140) {
                                        class33 var20 = var19.field4136;
                                        if (var20 != null && var20.method399(false) && (var20.field463 == var13 || var8 == var13) && (var20.field468 == var14 || var10 == var14)) {
                                            int var21 = var20.field456 + 1 - var20.field463;
                                            int var22 = var20.field471 + 1 - var20.field468;
                                            arg1.method394((var20.field468 - arg4) * class234.field3248 + (var22 - arg6) * class77.field1110, var16, var20, (var20.field463 - arg3) * class234.field3248 + (var21 - arg5) * class77.field1110, arg0, var7, true);
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

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(JLtk;I[I)Ljava/lang/String;")
    public final String method430(long arg0, class228 arg1, int arg2, int[] arg3) {
        field4949++;
        if (class48.field658 == arg1) {
            class42 var6 = class455.field6640.method1497(arg3[0], 507131584);
            return var6.method266((int) arg0, -5);
        } else if (class250.field3480 == arg1 || class31.field440 == arg1) {
            class316 var7 = class75.field1097.method823(false, (int) arg0);
            return var7.field4345;
        } else if (class135.field1953 == arg1 || class234.field3246 == arg1 || class169.field2402 == arg1) {
            return class455.field6640.method1497(arg3[0], 507131584).method266((int) arg0, arg2 + 24512);
        } else {
            if (arg2 != -24517) {
                this.method430(-88L, null, 90, null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIII)Z")
    public static final boolean method2003(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 > -5) {
            method2002(null, null, 44, -28, -121, -124, -27);
        }
        field4951++;
        if ((class456.field6661[0][arg1][arg2] & 0x2) != 0) {
            return true;
        } else if ((class456.field6661[arg4][arg1][arg2] & 0x10) == 0) {
            return class285.method1625(54, arg4, arg1, arg2) == arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)V")
    public static final void method2004(boolean arg0, int arg1) {
        if (arg1 > -127) {
            return;
        }
        field4948++;
        class356.method1978((byte) 16, class209.field2958);
        class146.field2081++;
        for (class14 var2 = (class14) class269.field3690.method981(0); var2 != null; var2 = (class14) class269.field3690.method989(0)) {
            if (!var2.method2944((byte) 119)) {
                var2 = (class14) class269.field3690.method981(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field166 == 0) {
                class114.method733((byte) -90, true, var2, arg0);
            }
        }
        if (class347.field4748 != null) {
            class150.method952((byte) -82, class347.field4748);
            class347.field4748 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4952 = null;
        if (arg0 >= -99) {
            method2005(-106);
        }
        field4950 = null;
    }
}
