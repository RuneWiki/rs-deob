import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class346 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
    public static int[] field4879 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lvq;")
    public static class22 field4881 = new class22();

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lja;ZI[BBI[Lc;)V")
    public static final void method2231(class90 arg0, boolean arg1, int arg2, byte[] arg3, byte arg4, int arg5, class158[] arg6) {
        field4880++;
        if (arg4 != -108) {
            method2232(-97);
        }
        class37 var7 = new class37(arg3);
        int var8 = -1;
        while (true) {
            int var9 = var7.method309(-1);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method316((byte) 104);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method271((byte) 124);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = var13 + arg2;
                int var19 = var12 + arg5;
                if (var18 > 0 && var19 > 0 && var18 < class183.field2703 - 1 && class66.field1056 - 1 > var19) {
                    class158 var20 = null;
                    if (!arg1) {
                        int var21 = var14;
                        if ((class278.field4176[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg6[var21];
                        }
                    }
                    class111.method966(var8, var18, var14, arg1, var19, var14, -1, (byte) 47, true, var16, var17, arg0, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method2232(int arg0) {
        field4879 = null;
        field4881 = null;
        if (arg0 < 84) {
            method2232(-49);
        }
    }
}
