import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class41 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[Z")
    public static boolean[] field610 = new boolean[5];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    public static int[] field608 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[Ldl;")
    public static class30[] field612 = new class30[4];

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Ltl;")
    public static class59 field609 = class85.method639("overlay2", 9588);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lme;")
    public static class295 field611;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[I")
    public static int[] field615;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 16)
    public static final void method263(int arg0) {
        class238.field3974 = arg0;
        for (int var1 = 0; var1 < class120.field2000; var1++) {
            for (int var2 = 0; var2 < class78.field1244; var2++) {
                if (class120.field2010[arg0][var1][var2] == null) {
                    class120.field2010[arg0][var1][var2] = new class245(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 54)
    public static void method264(int arg0) {
        field612 = null;
        field608 = null;
        field609 = null;
        field615 = null;
        field610 = null;
        if (arg0 == 2267) {
            field611 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 70)
    public static final void method265(int arg0) {
        field614++;
        class291.field4977.method1482((byte) 30);
        if (arg0 > -83) {
            method265(-14);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIIIIII)V", line = 82)
    public static final void method266(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class245.method1736((byte) 116, arg1);
        int var7 = 0;
        field613++;
        int var8 = arg1 - arg2;
        int var9 = arg1;
        int var10 = -arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg0 != 79) {
            return;
        }
        int var14 = -1;
        int[] var15 = class163.field2662[arg3];
        int var16 = arg5 - var8;
        class174.method1283(7, arg6, var15, arg5 - arg1, var16);
        int var17 = arg5 + var8;
        class174.method1283(7, arg4, var15, var16, var17);
        class174.method1283(7, arg6, var15, var17, arg1 + arg5);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class147.field2401[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class163.field2662[arg3 - var9];
                    int var19 = class147.field2401[var9];
                    int var20 = arg5 + var7;
                    int[] var21 = class163.field2662[arg3 + var9];
                    int var22 = arg5 - var7;
                    int var23 = arg5 - var19;
                    class174.method1283(7, arg6, var21, var22, var23);
                    int var24 = arg5 + var19;
                    class174.method1283(7, arg4, var21, var23, var24);
                    class174.method1283(7, arg6, var21, var24, var20);
                    class174.method1283(7, arg6, var18, var22, var23);
                    class174.method1283(7, arg4, var18, var23, var24);
                    class174.method1283(7, arg6, var18, var24, var20);
                } else {
                    int[] var25 = class163.field2662[arg3 + var9];
                    int[] var26 = class163.field2662[arg3 - var9];
                    int var27 = arg5 - var7;
                    int var28 = arg5 + var7;
                    class174.method1283(7, arg6, var25, var27, var28);
                    class174.method1283(7, arg6, var26, var27, var28);
                }
            }
            int[] var29 = class163.field2662[arg3 + var7];
            int[] var30 = class163.field2662[arg3 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class147.field2401[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class174.method1283(7, arg6, var29, var32, var35);
                class174.method1283(7, arg4, var29, var35, var34);
                class174.method1283(7, arg6, var29, var34, var31);
                class174.method1283(7, arg6, var30, var32, var35);
                class174.method1283(arg0 - 72, arg4, var30, var35, var34);
                class174.method1283(7, arg6, var30, var34, var31);
            } else {
                class174.method1283(7, arg6, var29, var32, var31);
                class174.method1283(7, arg6, var30, var32, var31);
            }
        }
    }
}
