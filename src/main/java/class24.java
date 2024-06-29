import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 extends class59 {

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[Ls;")
    public class259[] field306;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Z")
    public static boolean field298 = false;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field302 = -1;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "Lle;")
    public static class233 field307;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public final boolean method128(int arg0, int arg1) {
        if (arg0 == 0) {
            field297++;
            return this.field306[arg1].field4210;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class111.method739((byte) -11, arg2);
        int var7 = arg2 - arg1;
        field300++;
        int var8 = arg3;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = -1;
        int var12 = var7;
        int var13 = -var7;
        int var14 = -1;
        int[] var15 = class78.field1180[arg6];
        int var16 = arg4 + var7;
        int var17 = arg4 - var7;
        class16.method97(-7, var15, var17, arg5, arg4 - arg2);
        class16.method97(arg3 - 7, var15, var16, arg0, var17);
        class16.method97(-7, var15, arg2 + arg4, arg5, var16);
        while (var9 > var8) {
            var11 += 2;
            var10 += var11;
            var14 += 2;
            var13 += var14;
            if (var13 >= 0 && var12 >= 1) {
                class182.field2861[var12] = var8;
                var12--;
                var13 -= var12 << 1;
            }
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var7) {
                    int[] var18 = class78.field1180[arg6 - var9];
                    int[] var19 = class78.field1180[arg6 + var9];
                    int var20 = class182.field2861[var9];
                    int var21 = arg4 + var8;
                    int var22 = arg4 - var8;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class16.method97(-7, var19, var24, arg5, var22);
                    class16.method97(-7, var19, var23, arg0, var24);
                    class16.method97(arg3 ^ 0xFFFFFFF9, var19, var21, arg5, var23);
                    class16.method97(arg3 ^ 0xFFFFFFF9, var18, var24, arg5, var22);
                    class16.method97(-7, var18, var23, arg0, var24);
                    class16.method97(-7, var18, var21, arg5, var23);
                } else {
                    int[] var25 = class78.field1180[arg6 + var9];
                    int[] var26 = class78.field1180[arg6 - var9];
                    int var27 = arg4 + var8;
                    int var28 = arg4 - var8;
                    class16.method97(-7, var25, var27, arg5, var28);
                    class16.method97(-7, var26, var27, arg5, var28);
                }
            }
            int[] var29 = class78.field1180[arg6 + var8];
            int[] var30 = class78.field1180[arg6 - var8];
            int var31 = arg4 + var9;
            int var32 = arg4 - var9;
            if (var7 > var8) {
                int var33 = var8 <= var12 ? var12 : class182.field2861[var8];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class16.method97(arg3 - 7, var29, var35, arg5, var32);
                class16.method97(arg3 ^ 0xFFFFFFF9, var29, var34, arg0, var35);
                class16.method97(-7, var29, var31, arg5, var34);
                class16.method97(-7, var30, var35, arg5, var32);
                class16.method97(-7, var30, var34, arg0, var35);
                class16.method97(-7, var30, var31, arg5, var34);
            } else {
                class16.method97(-7, var29, var31, arg5, var32);
                class16.method97(arg3 - 7, var30, var31, arg5, var32);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lvl;Lvl;IZ)V")
    public class24(class73 arg0, class73 arg1, int arg2, boolean arg3) {
        class220 var5 = new class220();
        int var6 = arg0.method481(2688, arg2);
        this.field306 = new class259[var6];
        int[] var7 = arg0.method480(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method501(-2, var7[var8], arg2);
            class275 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class275 var12 = (class275) var5.method1548(0); var12 != null; var12 = (class275) var5.method1549(-106)) {
                if (var12.field4462 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method513(-2, 0, var11);
                } else {
                    var13 = arg1.method513(-2, var11, 0);
                }
                var10 = new class275(var11, var13);
                var5.method1540(var10, (byte) -52);
            }
            this.field306[var7[var8]] = new class259(var9, var10);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Z")
    public final boolean method130(int arg0, int arg1) {
        if (arg0 != 1988062305) {
            field305 = -24;
        }
        field301++;
        return this.field306[arg1].field4206;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public static void method131(byte arg0) {
        if (arg0 >= 57) {
            field307 = null;
        }
    }
}
