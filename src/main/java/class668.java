import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class668 {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "[F")
    public static float[] field9487 = new float[4];

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V", line = 5)
    public static void method3754(byte arg0) {
        field9487 = null;
        if (arg0 != -91) {
            method3755(-47, 119, -67, 14, 121, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIB)V", line = 21)
    public static final void method3755(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field9486++;
        int var6 = arg2 - arg4;
        int var7 = arg1 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class473.method2664(arg2, arg3, arg4, (byte) -56, arg0);
            }
        } else if (var6 == 0) {
            class370.method2179(arg3, arg1, 2, arg4, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                int var10 = arg1;
                arg3 = arg4;
                arg4 = var9;
                arg1 = arg2;
                arg2 = var10;
            }
            if (arg3 > arg1) {
                int var11 = arg3;
                arg3 = arg1;
                int var12 = arg4;
                arg1 = var11;
                arg4 = arg2;
                arg2 = var12;
            }
            if (arg5 >= -43) {
                field9487 = null;
            }
            int var13 = arg4;
            int var14 = arg1 - arg3;
            int var15 = arg2 - arg4;
            int var16 = -(var14 >> 1);
            int var17 = arg4 < arg2 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg3; var19 <= arg1; var19++) {
                    class236.field3325[var19][var13] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg1; var18++) {
                    var16 += var15;
                    class236.field3325[var13][var18] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }
}
