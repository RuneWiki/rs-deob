import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class248 extends class297 {

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field3159 = (int) (class97.method654((byte) 47) / 1000L);

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Ljava/lang/String;")
    public String field3165;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "S")
    public short field3160;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
    public static int[] field3162;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
    public static int[] field3164;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lmb;IIIII)V")
    public static final void method1519(class410 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class126.field1511 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class90.field1142) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class665.field9107 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class73 var14 = class495.field7002[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class517.field7282[var11].method2381(-125, var12, var13) + class517.field7282[var11].method2381(-93, var12 + 1, var13) + class517.field7282[var11].method2381(-95, var12, var13 + 1) + class517.field7282[var11].method2381(-92, var12 + 1, var13 + 1)) / 4 - (class517.field7282[arg1].method2381(-92, arg2, arg3) + class517.field7282[arg1].method2381(-127, arg2 + 1, arg3) + class517.field7282[arg1].method2381(-109, arg2, arg3 + 1) + class517.field7282[arg1].method2381(-128, arg2 + 1, arg3 + 1)) / 4;
                                    class525 var16 = var14.field973;
                                    class525 var17 = var14.field961;
                                    if (var16 != null && var16.method516((byte) -111)) {
                                        arg0.method514(var6, 12473, var16, class618.field8660, (var12 - arg2) * class431.field6109 + (1 - arg4) * class5.field54, (var13 - arg3) * class431.field6109 + (1 - arg5) * class5.field54, var15);
                                    }
                                    if (var17 != null && var17.method516((byte) -113)) {
                                        arg0.method514(var6, 12473, var17, class618.field8660, (var12 - arg2) * class431.field6109 + (1 - arg4) * class5.field54, (var13 - arg3) * class431.field6109 + (1 - arg5) * class5.field54, var15);
                                    }
                                    for (class456 var18 = var14.field969; var18 != null; var18 = var18.field6389) {
                                        class451 var19 = var18.field6384;
                                        if (var19 != null && var19.method516((byte) -89) && (var19.field6321 == var12 || var7 == var12) && (var19.field6328 == var13 || var9 == var13)) {
                                            int var20 = var19.field6322 + 1 - var19.field6321;
                                            int var21 = var19.field6324 + 1 - var19.field6328;
                                            arg0.method514(var6, 12473, var19, class618.field8660, (var19.field6321 - arg2) * class431.field6109 + (var20 - arg4) * class5.field54, (var19.field6328 - arg3) * class431.field6109 + (var21 - arg5) * class5.field54, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1520(int arg0) {
        field3162 = null;
        field3164 = null;
        if (arg0 != -27444) {
            field3164 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkba;B)V")
    public static final void method1521(class24 arg0, byte arg1) {
        if ((arg0 instanceof class124)) {
            class124 var3 = (class124) arg0;
            if (var3.field1486 != null) {
                class348.method2038(class339.field4374.field5779 != var3.field5779, (byte) 125, var3);
            }
        } else if (arg0 instanceof class546) {
            class546 var2 = (class546) arg0;
            class654.method3532(var2, (byte) 14, class339.field4374.field5779 != var2.field5779);
        }
        if (arg1 >= 117) {
            field3161++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class248(String arg0, int arg1) {
        this.field3165 = arg0;
        this.field3160 = (short) arg1;
    }
}
