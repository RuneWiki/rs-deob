import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DFQOFKQS")
public class class12 {

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "B")
    private byte field665 = 44;

    @OriginalMember(owner = "DFQOFKQS", name = "b", descriptor = "I")
    private int field666 = -26246;

    @OriginalMember(owner = "DFQOFKQS", name = "c", descriptor = "B")
    private byte field667 = 5;

    @OriginalMember(owner = "DFQOFKQS", name = "d", descriptor = "Z")
    private boolean field668 = false;

    @OriginalMember(owner = "DFQOFKQS", name = "i", descriptor = "[LYPPCWCLI;")
    private class69[] field673 = new class69[10];

    @OriginalMember(owner = "DFQOFKQS", name = "e", descriptor = "[LDFQOFKQS;")
    private static class12[] field669 = new class12[5000];

    @OriginalMember(owner = "DFQOFKQS", name = "f", descriptor = "[I")
    public static int[] field670 = new int[5000];

    @OriginalMember(owner = "DFQOFKQS", name = "j", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "DFQOFKQS", name = "k", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "DFQOFKQS", name = "h", descriptor = "LYOXDZEVD;")
    private static class68 field672;

    @OriginalMember(owner = "DFQOFKQS", name = "g", descriptor = "[B")
    private static byte[] field671;

    @OriginalMember(owner = "DFQOFKQS", name = "<init>", descriptor = "(Z)V")
    private class12(boolean arg0) {
        if (arg0) {
            this.field668 = !this.field668;
        }
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(LYOXDZEVD;Z)V")
    public static final void method168(class68 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field671 = new byte[441000];
        field672 = new class68(field671, -103);
        class69.method585();
        while (true) {
            int var2 = arg0.method551();
            if (var2 == 65535) {
                return;
            }
            field669[var2] = new class12(false);
            field669[var2].method170((byte) 44, arg0);
            field670[var2] = field669[var2].method171((byte) 7);
        }
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(III)LYOXDZEVD;")
    public static final class68 method169(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            throw new NullPointerException();
        } else if (field669[arg1] == null) {
            return null;
        } else {
            class12 var3 = field669[arg1];
            return var3.method172(arg0, (byte) 5);
        }
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(BLYOXDZEVD;)V")
    private final void method170(byte arg0, class68 arg1) {
        if (this.field665 != arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method549();
            if (var4 != 0) {
                arg1.field1612--;
                this.field673[var3] = new class69();
                this.field673[var3].method588((byte) 44, arg1);
            }
        }
        this.field674 = arg1.method551();
        this.field675 = arg1.method551();
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(B)I")
    private final int method171(byte arg0) {
        int var2 = 9999999;
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field673[var5] != null && this.field673[var5].field1645 / 20 < var2) {
                var2 = this.field673[var5].field1645 / 20;
            }
        }
        if (this.field674 < this.field675 && this.field674 / 20 < var2) {
            var2 = this.field674 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var6 = 0; var6 < 10; var6++) {
            if (this.field673[var6] != null) {
                this.field673[var6].field1645 -= var2 * 20;
            }
        }
        if (this.field674 < this.field675) {
            this.field674 -= var2 * 20;
            this.field675 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(IB)LYOXDZEVD;")
    private final class68 method172(int arg0, byte arg1) {
        int var3 = this.method173(arg0);
        field672.field1612 = 0;
        field672.method543(1380533830);
        field672.method544(var3 + 36, (byte) 38);
        field672.method543(1463899717);
        field672.method543(1718449184);
        field672.method544(16, (byte) 38);
        field672.method541(1, (byte) -105);
        field672.method541(1, (byte) -105);
        if (this.field667 != arg1) {
            this.field666 = 390;
        }
        field672.method544(22050, (byte) 38);
        field672.method544(22050, (byte) 38);
        field672.method541(1, (byte) -105);
        field672.method541(8, (byte) -105);
        field672.method543(1684108385);
        field672.method544(var3, (byte) 38);
        field672.field1612 += var3;
        return field672;
    }

    @OriginalMember(owner = "DFQOFKQS", name = "a", descriptor = "(I)I")
    private final int method173(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field673[var3] != null && this.field673[var3].field1645 + this.field673[var3].field1644 > var2) {
                var2 = this.field673[var3].field1645 + this.field673[var3].field1644;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field674 * 22050 / 1000;
        int var6 = this.field675 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field671[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field673[var9] != null) {
                int var15 = this.field673[var9].field1644 * 22050 / 1000;
                int var16 = this.field673[var9].field1645 * 22050 / 1000;
                int[] var17 = this.field673[var9].method586(var15, this.field673[var9].field1644);
                for (int var18 = 0; var18 < var15; var18++) {
                    field671[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field671[var10 + var11] = field671[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field671[var13 + var14] = field671[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
