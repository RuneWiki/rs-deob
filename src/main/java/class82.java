import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class82 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lbe;")
    private static class283 field1393 = class153.method941(-52, "Loaded config");

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lbe;")
    public static class283 field1387 = field1393;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lt;")
    public static class239 field1391 = new class239(16);

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1397 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[B")
    public byte[] field1385;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[B")
    public byte[] field1394;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "[[[I")
    public static int[][][] field1398;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 26)
    public static void method533(int arg0) {
        field1387 = null;
        field1393 = null;
        field1391 = null;
        if (arg0 == 24) {
            field1398 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V", line = 50)
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class119.method762(arg5, 5);
        field1390++;
        int var7 = 0;
        if (arg1 != 120164129) {
            return;
        }
        int var8 = -arg5;
        int var9 = arg5;
        int var10 = arg5 - arg4;
        int var11 = -1;
        int var12 = -1;
        int[] var13 = class97.field1636[arg6];
        if (var10 < 0) {
            var10 = 0;
        }
        int var14 = var10;
        int var15 = -var10;
        int var16 = arg0 - var10;
        class114.method742(30197, arg0 - arg5, var13, var16, arg3);
        int var17 = arg0 + var10;
        class114.method742(30197, var16, var13, var17, arg2);
        class114.method742(30197, var17, var13, arg0 + arg5, arg3);
        while (var9 > var7) {
            var11 += 2;
            var15 += var11;
            if (var15 >= 0 && var14 >= 1) {
                class79.field1367[var14] = var7;
                var14--;
                var15 -= var14 << 1;
            }
            var7++;
            var12 += 2;
            var8 += var12;
            if (var8 >= 0) {
                var9--;
                var8 -= var9 << 1;
                if (var10 > var9) {
                    int[] var18 = class97.field1636[arg6 + var9];
                    int[] var19 = class97.field1636[arg6 - var9];
                    int var20 = class79.field1367[var9];
                    int var21 = arg0 + var7;
                    int var22 = arg0 + var20;
                    int var23 = arg0 - var7;
                    int var24 = arg0 - var20;
                    class114.method742(30197, var23, var18, var24, arg3);
                    class114.method742(30197, var24, var18, var22, arg2);
                    class114.method742(30197, var22, var18, var21, arg3);
                    class114.method742(30197, var23, var19, var24, arg3);
                    class114.method742(30197, var24, var19, var22, arg2);
                    class114.method742(30197, var22, var19, var21, arg3);
                } else {
                    int[] var25 = class97.field1636[arg6 + var9];
                    int[] var26 = class97.field1636[arg6 - var9];
                    int var27 = arg0 + var7;
                    int var28 = arg0 - var7;
                    class114.method742(30197, var28, var25, var27, arg3);
                    class114.method742(arg1 ^ 0x729FAD4, var28, var26, var27, arg3);
                }
            }
            int[] var29 = class97.field1636[arg6 + var7];
            int var30 = arg0 - var9;
            int[] var31 = class97.field1636[arg6 - var7];
            int var32 = arg0 + var9;
            if (var10 <= var7) {
                class114.method742(30197, var30, var29, var32, arg3);
                class114.method742(arg1 ^ 0x729FAD4, var30, var31, var32, arg3);
            } else {
                int var33 = var14 >= var7 ? var14 : class79.field1367[var7];
                int var34 = arg0 - var33;
                class114.method742(arg1 - 120133932, var30, var29, var34, arg3);
                int var35 = arg0 + var33;
                class114.method742(30197, var34, var29, var35, arg2);
                class114.method742(30197, var35, var29, var32, arg3);
                class114.method742(30197, var30, var31, var34, arg3);
                class114.method742(30197, var34, var31, var35, arg2);
                class114.method742(30197, var35, var31, var32, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 186)
    public static final void method535(byte arg0) {
        class182.field3132.method937((byte) -61);
        field1388++;
        for (int var1 = 0; var1 < 32; var1++) {
            class45.field612[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class157.field2586[var2] = 0L;
        }
        if (arg0 == 5) {
            class182.field3128 = 0;
        }
    }
}
