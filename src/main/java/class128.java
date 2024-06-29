import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class128 extends class331 {

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "[I")
    public static int[] field1554 = new int[14];

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public int field1559;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Ltq;")
    public static class376 field1548;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Ljava/lang/String;")
    public String field1547;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "[I")
    public int[] field1555;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "[I")
    public int[] field1561;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[Lva;")
    public class288[] field1552;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "[Ljava/lang/String;")
    public String[] field1557;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 24)
    public static final void method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1550++;
        int var6 = arg3 - arg4;
        int var7 = arg2 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class341.method2191(arg5, true, arg1, arg4, arg3);
            }
        } else if (var6 == 0) {
            class46.method273(arg2, 22, arg1, arg5, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg4;
                int var10 = arg2;
                arg4 = var9;
                arg2 = arg3;
                arg3 = var10;
            }
            if (arg2 < arg5) {
                int var11 = arg5;
                int var12 = arg4;
                arg5 = arg2;
                arg2 = var11;
                arg4 = arg3;
                arg3 = var12;
            }
            int var13 = arg4;
            int var14 = arg2 - arg5;
            int var15 = arg3 - arg4;
            if (arg0 <= -68) {
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg3 <= arg4 ? -1 : 1;
                if (var8) {
                    for (int var19 = arg5; var19 <= arg2; var19++) {
                        class291.field4067[var19][var13] = arg1;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg2; var18++) {
                        class291.field4067[var13][var18] = arg1;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 143)
    public static void method795(int arg0) {
        field1548 = null;
        if (arg0 >= -5) {
            field1548 = null;
        }
        field1554 = null;
    }
}
