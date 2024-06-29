import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class70 extends class99 {

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field1408 = -1;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "[I")
    public static int[] field1404 = new int[1000];

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lr;")
    public static class66 field1407 = class93.method641(43, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field1411 = 2;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "[J")
    public static long[] field1414 = new long[500];

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "[[[I")
    public static int[][][] field1409;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public static void method509(int arg0) {
        if (arg0 == 0) {
            field1409 = null;
            field1407 = null;
            field1414 = null;
            field1404 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            this.method510(64, 69, 4);
        }
        ++field1403;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            for (int var4 = 0; var4 < class199.field3432; ++var4) {
                this.method510(var4, arg0 + 2109, arg1);
                int[] var5 = this.method682(0, class209.field3623, 29149);
                var3[var4] = var5[class93.field1793];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field1410;
        if (!arg1) {
            field1414 = null;
        }
        int[][] var3 = super.field1946.method823(arg0, (byte) -126);
        if (super.field1946.field2297) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class199.field3432; ++var7) {
                this.method510(var7, 2048, arg0);
                int[][] var8 = this.method683(-79, 0, class209.field3623);
                var4[var7] = var8[0][class93.field1793];
                var5[var7] = var8[1][class93.field1793];
                var6[var7] = var8[2][class93.field1793];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field1413;
        if (~arg1 == arg2) {
            super.field1938 = ~arg0.method1677(-6677) == -2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V")
    private final void method510(int arg0, int arg1, int arg2) {
        ++field1406;
        int var4 = class10.field120[arg0];
        int var5 = class19.field261[arg2];
        float var6 = (float) Math.atan2((double) (var4 - arg1), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class93.field1793 = arg0;
            class209.field3623 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class209.field3623 = arg0;
            class93.field1793 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class209.field3623 = arg0;
            class93.field1793 = -arg2 + class199.field3432;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class93.field1793 = arg0;
            class209.field3623 = class16.field223 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class93.field1793 = -arg0 + class199.field3432;
            class209.field3623 = -arg2 + class16.field223;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class209.field3623 = -arg0 + class16.field223;
            class93.field1793 = class199.field3432 - arg2;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class93.field1793 = arg2;
            class209.field3623 = -arg0 + class16.field223;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class209.field3623 = arg2;
            class93.field1793 = -arg0 + class199.field3432;
        }
        class93.field1793 &= class98.field1914;
        class209.field3623 &= class45.field833;
    }
}
