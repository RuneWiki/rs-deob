import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class399 extends class729 {

    @OriginalMember(owner = "client!rfa", name = "P", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBC)I")
    public static final int method2465(int arg0, byte arg1, char arg2) {
        field5925++;
        if (arg1 > -103) {
            field5924 = 17;
        }
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var4 = Character.toLowerCase(arg2);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIII)V")
    public static final void method2466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5926++;
        int var6 = arg2 - arg5;
        int var7 = arg1 - arg4;
        if (~var7 == arg3) {
            if (var6 != 0) {
                class25.method137(arg4, arg5, arg0, arg2, 26);
            }
        } else if (var6 == 0) {
            class755.method4204(false, arg5, arg4, arg1, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg4;
                arg4 = arg5;
                int var10 = arg1;
                arg1 = arg2;
                arg5 = var9;
                arg2 = var10;
            }
            if (arg4 > arg1) {
                int var11 = arg4;
                arg4 = arg1;
                int var12 = arg5;
                arg1 = var11;
                arg5 = arg2;
                arg2 = var12;
            }
            int var13 = arg5;
            int var14 = arg1 - arg4;
            int var15 = arg2 - arg5;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg2 > arg5 ? 1 : -1;
            if (var8) {
                for (int var18 = arg4; var18 <= arg1; var18++) {
                    class77.field1131[var18][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg1; var19++) {
                    class77.field1131[var13][var19] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(JJ)J")
    public static long method2467(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
