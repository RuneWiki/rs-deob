import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class80 extends class287 {

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
    public static boolean field1324 = true;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "J")
    public static long field1321 = 0L;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field1326 = -1;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public static int field1328 = 0;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "Lic;")
    public static class160 field1327 = new class160(5);

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Ljava/lang/String;")
    public String field1323;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "Ljava/lang/String;")
    public String field1330;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1329;
        if (arg4 == 122369068) {
            if (arg2 == arg9 && arg5 == arg6 && ~arg3 == ~arg8 && arg0 == arg7) {
                class47.method400(arg5, arg9, true, arg1, arg8, arg7);
            } else {
                int var10 = arg9;
                int var11 = arg5;
                int var12 = arg5 * 3;
                int var13 = arg9 * 3;
                int var14 = arg2 * 3;
                int var15 = arg6 * 3;
                int var16 = arg3 * 3;
                int var17 = arg8 - var16 + var14 - arg9;
                int var18 = arg0 * 3;
                int var19 = -arg5 + var15 + -var18 + arg7;
                int var20 = var18 - (var15 - -var15) - -var12;
                int var21 = -var14 + var16 + -var14 + var13;
                int var22 = -var13 + var14;
                int var23 = -var12 + var15;
                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var21 * var25;
                    int var27 = var20 * var25;
                    int var28 = var24 * var25 >> 12;
                    int var29 = var17 * var28;
                    int var30 = var19 * var28;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = (var29 - -var26 - -var31 >> 12) + arg9;
                    int var34 = (var30 - -var32 + var27 >> 12) + arg5;
                    class47.method400(var11, var10, true, arg1, var33, var34);
                    var10 = var33;
                    var11 = var34;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZB)V")
    public static final void method643(boolean arg0, byte arg1) {
        ++field1320;
        class201.field3274 = arg0;
        class279.field4434 = !class9.method50(false);
        if (arg1 != -124) {
            method644(112);
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public static void method644(int arg0) {
        if (arg0 == 15655) {
            field1327 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)Lpk;")
    public final class43 method645(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field1319;
            return class282.field4463[super.field4598];
        }
    }
}
