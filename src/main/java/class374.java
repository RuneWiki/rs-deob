import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class374 extends class272 {

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public int field5389 = 0;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Ldk;")
    public static class326 field5390 = new class326("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Ldk;")
    public static class326 field5392 = new class326("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILrp;)V")
    public final void method2278(int arg0, class276 arg1) {
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                field5388++;
                int var4 = 108 % ((-arg0 - 27) / 58);
                return;
            }
            this.method2280(arg1, var3, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class424.method2489(arg0, arg2 ^ 0x1);
        field5387++;
        int var7 = arg2;
        int var8 = arg0 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class128.field1676[arg5];
        int var16 = arg3 - var8;
        class103.method579((byte) 115, arg3 - arg0, var16, arg6, var15);
        int var17 = arg3 + var8;
        class103.method579((byte) 115, var16, var17, arg1, var15);
        class103.method579((byte) 115, var17, arg3 + arg0, arg6, var15);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class171.field2491[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class128.field1676[arg5 + var9];
                    int[] var19 = class128.field1676[arg5 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class103.method579((byte) 115, var21, var20, arg6, var18);
                    class103.method579((byte) 115, var21, var20, arg6, var19);
                } else {
                    int[] var22 = class128.field1676[arg5 + var9];
                    int[] var23 = class128.field1676[arg5 - var9];
                    int var24 = class171.field2491[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class103.method579((byte) 115, var26, var28, arg6, var22);
                    class103.method579((byte) 115, var28, var27, arg1, var22);
                    class103.method579((byte) 115, var27, var25, arg6, var22);
                    class103.method579((byte) 115, var26, var28, arg6, var23);
                    class103.method579((byte) 115, var28, var27, arg1, var23);
                    class103.method579((byte) 115, var27, var25, arg6, var23);
                }
            }
            int[] var29 = class128.field1676[arg5 + var7];
            int[] var30 = class128.field1676[arg5 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class171.field2491[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class103.method579((byte) 115, var32, var35, arg6, var29);
                class103.method579((byte) 115, var35, var34, arg1, var29);
                class103.method579((byte) 115, var34, var31, arg6, var29);
                class103.method579((byte) 115, var32, var35, arg6, var30);
                class103.method579((byte) 115, var35, var34, arg1, var30);
                class103.method579((byte) 115, var34, var31, arg6, var30);
            } else {
                class103.method579((byte) 115, var32, var31, arg6, var29);
                class103.method579((byte) 115, var32, var31, arg6, var30);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lrp;IB)V")
    private final void method2280(class276 arg0, int arg1, byte arg2) {
        if (arg1 == 2) {
            this.field5389 = arg0.method1729(65280);
        }
        field5391++;
        if (arg2 <= 115) {
            field5390 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)V")
    public static void method2281(byte arg0) {
        field5392 = null;
        field5390 = null;
        if (arg0 >= -105) {
            field5390 = null;
        }
    }
}
