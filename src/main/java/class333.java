import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class333 {

    @OriginalMember(owner = "client!st", name = "b", descriptor = "[I")
    public static int[] field4516 = new int[25];

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Lsca;")
    public static class432 field4519;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method2044(byte arg0) {
        field4516 = null;
        field4519 = null;
        int var1 = -27 % ((arg0 - 90) / 35);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILha;II)V")
    public static final void method2045(int arg0, int arg1, int arg2, class543 arg3, int arg4, int arg5) {
        arg3.method297(arg1, arg2, arg1 + arg4, arg0 + arg2);
        field4515++;
        arg3.method3263((byte) -104, arg1, arg0, arg4, arg2, -16777216);
        if (class499.field7172 < 100) {
            return;
        }
        float var6 = (float) class664.field9509 / (float) class664.field9508;
        int var7 = arg4;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg2;
        int var10 = (arg4 - var7) / 2 + arg1;
        if (class311.field4214 == null || class311.field4214.method777() != arg4 || class311.field4214.method787() != arg0) {
            class664.method3797(class664.field9502, class664.field9498 + class664.field9509, class664.field9508 + class664.field9502, class664.field9498, var10, var9, var10 + var7, var8 + var9);
            class664.method3802(arg3);
            class311.field4214 = arg3.method359(var10, var9, var7, var8, false);
        }
        class311.field4214.method3128(var10, var9);
        int var11 = class542.field7857 * var7 / class664.field9508;
        int var12 = class362.field5295 * var8 / class664.field9509;
        int var13 = class541.field7848 * var7 / class664.field9508 + var10;
        int var14 = var9 + var8 - (class493.field7103 * var8 / class664.field9509) - var12;
        int var15 = -1996554240;
        if (arg5 != -28963) {
            return;
        }
        if (class528.field7683 == class48.field790) {
            var15 = -1996488705;
        }
        arg3.method397(var13, var14, var11, var12, var15, 1);
        arg3.method305(var13, var14, var11, var12, var15, 0);
        if (class672.field9575 <= 0) {
            return;
        }
        int var16;
        if (class556.field8080 > 50) {
            var16 = (100 - class556.field8080) * 5;
        } else {
            var16 = class556.field8080 * 5;
        }
        for (class241 var17 = (class241) class664.field9495.method3565(109); var17 != null; var17 = (class241) class664.field9495.method3561((byte) 82)) {
            class463 var18 = class664.field9482.method2687(var17.field3562, arg5 + 28999);
            if (class610.method3550((byte) -33, var18)) {
                if (class727.field10217 == var17.field3562) {
                    int var19 = var17.field3571 * var7 / class664.field9508 + var10;
                    int var20 = (class664.field9509 - var17.field3568) * var8 / class664.field9509 + var9;
                    arg3.method3263((byte) -101, var19 - 2, 4, 4, var20 - 2, var16 << 24 | 0xFFFF00);
                } else if (class68.field1054 != -1 && class68.field1054 == var18.field6597) {
                    int var21 = var17.field3571 * var7 / class664.field9508 + var10;
                    int var22 = (class664.field9509 - var17.field3568) * var8 / class664.field9509 + var9;
                    arg3.method3263((byte) -115, var21 - 2, 4, 4, var22 - 2, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }
}
