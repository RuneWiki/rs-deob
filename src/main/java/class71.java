import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class71 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1093 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "F")
    public static float field1096;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "[[B")
    public static byte[][] field1094;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V", line = 16)
    public static final void method448(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1097++;
        int var6 = arg5 - arg2;
        int var7 = arg0 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class15.method83(arg4, arg2, arg5, arg3, 1);
            }
        } else if (var6 == 0) {
            class53.method372(arg0, arg2, arg3, arg4, true);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg3;
                int var10 = arg0;
                arg0 = arg5;
                arg3 = arg2;
                arg2 = var9;
                arg5 = var10;
            }
            if (arg0 < arg3) {
                int var11 = arg2;
                arg2 = arg5;
                int var12 = arg3;
                arg5 = var11;
                arg3 = arg0;
                arg0 = var12;
            }
            int var13 = arg0 - arg3;
            int var14 = arg5 - arg2;
            int var15 = arg2;
            int var16 = -(var13 >> 1);
            if (arg1 > -57) {
                field1096 = 0.9381562F;
            }
            if (var14 < 0) {
                var14 = -var14;
            }
            int var17 = arg2 >= arg5 ? -1 : 1;
            if (var8) {
                for (int var19 = arg3; var19 <= arg0; var19++) {
                    var16 += var14;
                    class73.field1117[var19][var15] = arg4;
                    if (var16 > 0) {
                        var16 -= var13;
                        var15 += var17;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg0; var18++) {
                    var16 += var14;
                    class73.field1117[var15][var18] = arg4;
                    if (var16 > 0) {
                        var16 -= var13;
                        var15 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 147)
    public static void method450(int arg0) {
        if (arg0 != -4856) {
            field1096 = 0.5721733F;
        }
        field1094 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public abstract int method449(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method451(int arg0);
}
