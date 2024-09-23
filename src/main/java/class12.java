import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EJAYDEWE")
public class class12 {

    @OriginalMember(owner = "EJAYDEWE", name = "c", descriptor = "I")
    private int field661 = -820;

    @OriginalMember(owner = "EJAYDEWE", name = "h", descriptor = "[LSNQOEFQG;")
    private class51[] field666 = new class51[10];

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "I")
    private static int field659 = 8;

    @OriginalMember(owner = "EJAYDEWE", name = "d", descriptor = "[LEJAYDEWE;")
    private static class12[] field662 = new class12[5000];

    @OriginalMember(owner = "EJAYDEWE", name = "e", descriptor = "[I")
    public static int[] field663 = new int[5000];

    @OriginalMember(owner = "EJAYDEWE", name = "i", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "EJAYDEWE", name = "j", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "EJAYDEWE", name = "g", descriptor = "LIMUIZRAF;")
    private static class24 field665;

    @OriginalMember(owner = "EJAYDEWE", name = "b", descriptor = "Z")
    private static boolean field660;

    @OriginalMember(owner = "EJAYDEWE", name = "f", descriptor = "[B")
    private static byte[] field664;

    @OriginalMember(owner = "EJAYDEWE", name = "<init>", descriptor = "(Z)V")
    private class12(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(LIMUIZRAF;Z)V")
    public static final void method203(class24 arg0, boolean arg1) {
        field664 = new byte[441000];
        field665 = new class24(0, field664);
        class51.method458();
        if (arg1) {
            return;
        }
        while (true) {
            int var2 = arg0.method240();
            if (var2 == 65535) {
                return;
            }
            field662[var2] = new class12(true);
            field662[var2].method205(field659, arg0);
            field663[var2] = field662[var2].method206(field660);
        }
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(BII)LIMUIZRAF;")
    public static final class24 method204(byte arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            throw new NullPointerException();
        } else if (field662[arg1] == null) {
            return null;
        } else {
            class12 var3 = field662[arg1];
            return var3.method207(arg2, -777);
        }
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(ILIMUIZRAF;)V")
    private final void method205(int arg0, class24 arg1) {
        if (arg0 != 8) {
            this.field661 = -35;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method238();
            if (var4 != 0) {
                arg1.field832--;
                this.field666[var3] = new class51();
                this.field666[var3].method461(field659, arg1);
            }
        }
        this.field667 = arg1.method240();
        this.field668 = arg1.method240();
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(Z)I")
    private final int method206(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field666[var3] != null && this.field666[var3].field1339 / 20 < var2) {
                var2 = this.field666[var3].field1339 / 20;
            }
        }
        if (this.field667 < this.field668 && this.field667 / 20 < var2) {
            var2 = this.field667 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field666[var4] != null) {
                this.field666[var4].field1339 -= var2 * 20;
            }
        }
        if (arg0) {
            field659 = 346;
        }
        if (this.field667 < this.field668) {
            this.field667 -= var2 * 20;
            this.field668 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(II)LIMUIZRAF;")
    private final class24 method207(int arg0, int arg1) {
        int var3 = this.method208(arg0);
        field665.field832 = 0;
        field665.method232(1380533830);
        field665.method233(var3 + 36, 0);
        field665.method232(1463899717);
        field665.method232(1718449184);
        field665.method233(16, 0);
        field665.method230(1, 793);
        field665.method230(1, 793);
        field665.method233(22050, 0);
        field665.method233(22050, 0);
        field665.method230(1, 793);
        field665.method230(8, 793);
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field665.method232(1684108385);
        field665.method233(var3, 0);
        field665.field832 += var3;
        return field665;
    }

    @OriginalMember(owner = "EJAYDEWE", name = "a", descriptor = "(I)I")
    private final int method208(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field666[var3] != null && this.field666[var3].field1339 + this.field666[var3].field1338 > var2) {
                var2 = this.field666[var3].field1339 + this.field666[var3].field1338;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field667 * 22050 / 1000;
        int var6 = this.field668 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field664[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field666[var9] != null) {
                int var15 = this.field666[var9].field1338 * 22050 / 1000;
                int var16 = this.field666[var9].field1339 * 22050 / 1000;
                int[] var17 = this.field666[var9].method459(var15, this.field666[var9].field1338);
                for (int var18 = 0; var18 < var15; var18++) {
                    field664[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field664[var10 + var11] = field664[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field664[var13 + var14] = field664[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
