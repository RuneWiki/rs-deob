import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class51 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Z")
    public static boolean field756 = false;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lwe;")
    public static class24 field755 = new class24(32);

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field757 = "Loading world list data";

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lqj;")
    public static class238 field758;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lnr;Lcb;IIIII)V")
    public static final void method352(class437 arg0, class387 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class137.field1817 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class308.field4403) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class413.field6175 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class10 var15 = class343.field5032[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class88.field1226[var12].method781(var13, var14) + class88.field1226[var12].method781(var13 + 1, var14) + class88.field1226[var12].method781(var13, var14 + 1) + class88.field1226[var12].method781(var13 + 1, var14 + 1)) / 4 - (class88.field1226[arg2].method781(arg3, arg4) + class88.field1226[arg2].method781(arg3 + 1, arg4) + class88.field1226[arg2].method781(arg3, arg4 + 1) + class88.field1226[arg2].method781(arg3 + 1, arg4 + 1)) / 4;
                                    class349 var17 = var15.field117;
                                    class349 var18 = var15.field120;
                                    if (var17 != null && var17.method151((byte) -115)) {
                                        arg1.method153((byte) -118, arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, var7, var17, var16);
                                    }
                                    if (var18 != null && var18.method151((byte) -115)) {
                                        arg1.method153((byte) -121, arg0, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, var7, var18, var16);
                                    }
                                    for (class39 var19 = var15.field109; var19 != null; var19 = var19.field627) {
                                        class361 var20 = var19.field621;
                                        if (var20 != null && var20.method151((byte) -115) && (var20.field5296 == var13 || var8 == var13) && (var20.field5288 == var14 || var10 == var14)) {
                                            int var21 = var20.field5293 + 1 - var20.field5296;
                                            int var22 = var20.field5286 + 1 - var20.field5288;
                                            arg1.method153((byte) -124, arg0, (var20.field5288 - arg4) * 128 + (var22 - arg6) * 64, (var20.field5296 - arg3) * 128 + (var21 - arg5) * 64, var7, var20, var16);
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

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method353(int arg0) {
        if (arg0 == 6044) {
            field757 = null;
            field755 = null;
            field758 = null;
        }
    }
}
