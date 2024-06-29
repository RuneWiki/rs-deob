import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class396 extends class497 {

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "Lin;")
    public static class78 field5579 = null;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Lbda;", line = 5)
    public static final class467 method2322(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5536;
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lor;Lma;IIIIIIIIII)V", line = 17)
    public class396(class594 arg0, class12 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5578 = arg11;
        this.field5583 = arg10;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V", line = 28)
    public static void method2323(byte arg0) {
        if (arg0 >= -108) {
            method2327(null, null, -72, null, null);
        }
        field5579 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lhg;", line = 41)
    public static final class643 method2324(int arg0, int arg1) {
        field5584++;
        class643 var2 = new class643(arg1, false);
        if (arg0 != -32519) {
            field5579 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)Loh;", line = 54)
    public final class370 method640(int arg0) {
        field5577++;
        if (arg0 != 58) {
            method2322(-63, 64, 105);
        }
        return class373.field5025;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIII)V", line = 65)
    public static final void method2325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class409.method2386(arg1, (byte) 102);
        field5581++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = arg0;
        int var14 = -1;
        int[] var15 = class344.field4599[arg5];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class470.method2660(arg3 - arg1, var16, var15, (byte) 11, arg2);
        class470.method2660(var16, var17, var15, (byte) 11, arg6);
        class470.method2660(var17, arg3 + arg1, var15, (byte) 11, arg2);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class95.field1336[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class344.field4599[arg5 + var9];
                    int[] var19 = class344.field4599[arg5 - var9];
                    int var20 = class95.field1336[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class470.method2660(var22, var24, var18, (byte) 11, arg2);
                    class470.method2660(var24, var23, var18, (byte) 11, arg6);
                    class470.method2660(var23, var21, var18, (byte) 11, arg2);
                    class470.method2660(var22, var24, var19, (byte) 11, arg2);
                    class470.method2660(var24, var23, var19, (byte) 11, arg6);
                    class470.method2660(var23, var21, var19, (byte) 11, arg2);
                } else {
                    int[] var25 = class344.field4599[arg5 + var9];
                    int[] var26 = class344.field4599[arg5 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class470.method2660(var28, var27, var25, (byte) 11, arg2);
                    class470.method2660(var28, var27, var26, (byte) 11, arg2);
                }
            }
            int[] var29 = class344.field4599[arg5 + var7];
            int[] var30 = class344.field4599[arg5 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class470.method2660(var32, var31, var29, (byte) 11, arg2);
                class470.method2660(var32, var31, var30, (byte) 11, arg2);
            } else {
                int var33 = var11 < var7 ? class95.field1336[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class470.method2660(var32, var35, var29, (byte) 11, arg2);
                class470.method2660(var35, var34, var29, (byte) 11, arg6);
                class470.method2660(var34, var31, var29, (byte) 11, arg2);
                class470.method2660(var32, var35, var30, (byte) 11, arg2);
                class470.method2660(var35, var34, var30, (byte) 11, arg6);
                class470.method2660(var34, var31, var30, (byte) 11, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILsea;II)Lqea;", line = 191)
    public static final class112 method2326(int arg0, class648 arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            field5579 = null;
        }
        field5580++;
        class501 var4 = new class501(arg1.method3654(arg0 - 15623, arg2, arg3));
        class112 var5 = new class112(arg3, var4.method2851((byte) -81), var4.method2851((byte) -124), var4.method2840(false), var4.method2840(false), var4.method2874((byte) -75) == 1, var4.method2874((byte) -75), var4.method2874((byte) -75));
        int var6 = var4.method2874((byte) -75);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field1561.method1441(new class48(var4.method2874((byte) -75), var4.method2845(-1), var4.method2845(arg0 ^ 0xFFFFFFF7), var4.method2845(-1), var4.method2845(arg0 - 9), var4.method2845(arg0 ^ 0xFFFFFFF7), var4.method2845(-1), var4.method2845(-1), var4.method2845(-1)), 0);
        }
        var5.method808((byte) 80);
        return var5;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lsea;Lsea;ILsea;Lsea;)V", line = 218)
    public static final void method2327(class648 arg0, class648 arg1, int arg2, class648 arg3, class648 arg4) {
        field5576++;
        class554.field7474 = arg0;
        class393.field5550 = arg3;
        class290.field3993 = arg1;
        class167.field2439 = new class78[class290.field3993.method3649((byte) 112)][];
        class210.field2970 = new boolean[class290.field3993.method3649((byte) 112)];
        if (arg2 <= 99) {
            method2324(-25, -53);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLjava/awt/Canvas;Lfa;Lsea;)Lr;", line = 241)
    public static final class166 method2328(int arg0, boolean arg1, Canvas arg2, class212 arg3, class648 arg4) {
        field5582++;
        if (!class456.method2602(768)) {
            throw new RuntimeException("");
        } else if (class28.method266(arg1, "jaggl")) {
            if (!arg1) {
                field5579 = null;
            }
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class147 var8 = new class147(var5, arg2, var6, arg3, arg4, arg0);
            var8.method2204(-95);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
