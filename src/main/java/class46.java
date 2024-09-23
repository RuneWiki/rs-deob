import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QQGIMXLX")
public class class46 {

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "I")
    private int field1269 = 16191;

    @OriginalMember(owner = "QQGIMXLX", name = "c", descriptor = "I")
    private int field1271 = 49272;

    @OriginalMember(owner = "QQGIMXLX", name = "d", descriptor = "B")
    private byte field1272 = 9;

    @OriginalMember(owner = "QQGIMXLX", name = "i", descriptor = "[LVSTUETUV;")
    private class62[] field1277 = new class62[10];

    @OriginalMember(owner = "QQGIMXLX", name = "e", descriptor = "[LQQGIMXLX;")
    private static class46[] field1273 = new class46[5000];

    @OriginalMember(owner = "QQGIMXLX", name = "f", descriptor = "[I")
    public static int[] field1274 = new int[5000];

    @OriginalMember(owner = "QQGIMXLX", name = "b", descriptor = "I")
    private static int field1270;

    @OriginalMember(owner = "QQGIMXLX", name = "j", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "QQGIMXLX", name = "k", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "QQGIMXLX", name = "h", descriptor = "LLDILQFVA;")
    private static class34 field1276;

    @OriginalMember(owner = "QQGIMXLX", name = "g", descriptor = "[B")
    private static byte[] field1275;

    @OriginalMember(owner = "QQGIMXLX", name = "<init>", descriptor = "(I)V")
    private class46(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(ILLDILQFVA;)V")
    public static final void method502(int arg0, class34 arg1) {
        field1275 = new byte[441000];
        field1276 = new class34(field1275, field1270);
        class62.method557();
        if (arg0 <= 0) {
            return;
        }
        while (true) {
            int var2 = arg1.method404();
            if (var2 == 65535) {
                return;
            }
            field1273[var2] = new class46(684);
            field1273[var2].method504(arg1, 16191);
            field1274[var2] = field1273[var2].method505(true);
        }
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(IIZ)LLDILQFVA;")
    public static final class34 method503(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            throw new NullPointerException();
        } else if (field1273[arg0] == null) {
            return null;
        } else {
            class46 var3 = field1273[arg0];
            return var3.method506(false, arg1);
        }
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(LLDILQFVA;I)V")
    private final void method504(class34 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method402();
            if (var4 != 0) {
                arg0.field1073--;
                this.field1277[var3] = new class62();
                this.field1277[var3].method560(arg0, 16191);
            }
        }
        if (this.field1269 != arg1) {
            throw new NullPointerException();
        }
        this.field1278 = arg0.method404();
        this.field1279 = arg0.method404();
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(Z)I")
    private final int method505(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1277[var3] != null && this.field1277[var3].field1563 / 20 < var2) {
                var2 = this.field1277[var3].field1563 / 20;
            }
        }
        if (this.field1278 < this.field1279 && this.field1278 / 20 < var2) {
            var2 = this.field1278 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1277[var4] != null) {
                this.field1277[var4].field1563 -= var2 * 20;
            }
        }
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1278 < this.field1279) {
            this.field1278 -= var2 * 20;
            this.field1279 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(ZI)LLDILQFVA;")
    private final class34 method506(boolean arg0, int arg1) {
        int var3 = this.method507(arg1);
        field1276.field1073 = 0;
        field1276.method396(1380533830);
        field1276.method397(-793, var3 + 36);
        field1276.method396(1463899717);
        field1276.method396(1718449184);
        field1276.method397(-793, 16);
        field1276.method394(1, this.field1271);
        if (arg0) {
            throw new NullPointerException();
        }
        field1276.method394(1, this.field1271);
        field1276.method397(-793, 22050);
        field1276.method397(-793, 22050);
        field1276.method394(1, this.field1271);
        field1276.method394(8, this.field1271);
        field1276.method396(1684108385);
        field1276.method397(-793, var3);
        field1276.field1073 += var3;
        return field1276;
    }

    @OriginalMember(owner = "QQGIMXLX", name = "a", descriptor = "(I)I")
    private final int method507(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1277[var3] != null && this.field1277[var3].field1563 + this.field1277[var3].field1562 > var2) {
                var2 = this.field1277[var3].field1563 + this.field1277[var3].field1562;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1278 * 22050 / 1000;
        int var6 = this.field1279 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1275[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1277[var9] != null) {
                int var15 = this.field1277[var9].field1562 * 22050 / 1000;
                int var16 = this.field1277[var9].field1563 * 22050 / 1000;
                int[] var17 = this.field1277[var9].method558(var15, this.field1277[var9].field1562);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1275[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1275[var10 + var11] = field1275[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1275[var13 + var14] = field1275[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
