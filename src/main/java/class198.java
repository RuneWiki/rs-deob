import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class198 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Laf;")
    public static class7 field3859 = new class7(64);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    public static int[] field3863 = new int[25];

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[J")
    public static long[] field3862 = new long[500];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[Ldi;")
    public static class40[] field3861;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIII)V")
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        class51.method350(arg3 - arg2, arg4, (byte) -127, class107.field1998[arg5], arg2 + arg3);
        field3860++;
        int var7 = arg2 * arg2;
        int var8 = arg1;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var7 << 1;
        int var12 = arg1 << 1;
        int var13 = var9 - (arg0 + var12) * var11;
        int var14 = (1 - var12) * var7 + var10;
        int var15 = var7 << 2;
        int var16 = ((arg1 << 1) - 3) * var11;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = (arg1 - 1) * var15;
        int var19 = var9 << 2;
        int var20 = (var6 + 1) * var19;
        while (var8 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var20;
                    var20 += var19;
                    var14 += var17;
                    var17 += var19;
                    var6++;
                }
            }
            if (var13 < 0) {
                var6++;
                var14 += var17;
                var17 += var19;
                var13 += var20;
                var20 += var19;
            }
            var14 += -var18;
            var13 += -var16;
            var8--;
            int var21 = arg5 - var8;
            int var22 = arg3 + var6;
            int var23 = arg3 - var6;
            int var24 = arg5 + var8;
            class51.method350(var23, arg4, (byte) -128, class107.field1998[var21], var22);
            class51.method350(var23, arg4, (byte) -120, class107.field1998[var24], var22);
            var16 -= var15;
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1315(int arg0, byte[] arg1) {
        field3857++;
        int var2 = arg1.length;
        if (arg0 != 18576) {
            method1315(-77, null);
        }
        byte[] var3 = new byte[var2];
        class85.method553(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field3862 = null;
        field3859 = null;
        if (arg0 > -113) {
            field3863 = null;
        }
        field3863 = null;
        field3861 = null;
    }
}
