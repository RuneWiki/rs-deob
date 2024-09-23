import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ETTRSMMZ")
public class class13 {

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "I")
    private int field663 = -261;

    @OriginalMember(owner = "ETTRSMMZ", name = "c", descriptor = "I")
    private int field665 = 30484;

    @OriginalMember(owner = "ETTRSMMZ", name = "d", descriptor = "I")
    private int field666 = 9;

    @OriginalMember(owner = "ETTRSMMZ", name = "j", descriptor = "[LQGBENKJV;")
    private class43[] field672 = new class43[10];

    @OriginalMember(owner = "ETTRSMMZ", name = "e", descriptor = "B")
    private static byte field667 = -107;

    @OriginalMember(owner = "ETTRSMMZ", name = "f", descriptor = "[LETTRSMMZ;")
    private static class13[] field668 = new class13[5000];

    @OriginalMember(owner = "ETTRSMMZ", name = "g", descriptor = "[I")
    public static int[] field669 = new int[5000];

    @OriginalMember(owner = "ETTRSMMZ", name = "k", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "ETTRSMMZ", name = "l", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "ETTRSMMZ", name = "i", descriptor = "LMQZHAILV;")
    private static class33 field671;

    @OriginalMember(owner = "ETTRSMMZ", name = "b", descriptor = "Z")
    private static boolean field664;

    @OriginalMember(owner = "ETTRSMMZ", name = "h", descriptor = "[B")
    private static byte[] field670;

    @OriginalMember(owner = "ETTRSMMZ", name = "<init>", descriptor = "(Z)V")
    private class13(boolean arg0) {
        if (arg0) {
            this.field666 = -358;
        }
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(LMQZHAILV;B)V")
    public static final void method224(class33 arg0, byte arg1) {
        field670 = new byte[441000];
        if (arg1 != 51) {
            return;
        }
        field671 = new class33(true, field670);
        class43.method381();
        while (true) {
            int var2 = arg0.method327();
            if (var2 == 65535) {
                return;
            }
            field668[var2] = new class13(false);
            field668[var2].method226(arg0, -261);
            field669[var2] = field668[var2].method227((byte) 97);
        }
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(BII)LMQZHAILV;")
    public static final class33 method225(byte arg0, int arg1, int arg2) {
        if (field667 != arg0) {
            field664 = !field664;
        }
        if (field668[arg2] == null) {
            return null;
        } else {
            class13 var3 = field668[arg2];
            return var3.method228(0, arg1);
        }
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(LMQZHAILV;I)V")
    private final void method226(class33 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method325();
            if (var5 != 0) {
                arg0.field945--;
                this.field672[var3] = new class43();
                this.field672[var3].method384(arg0, -261);
            }
        }
        this.field673 = arg0.method327();
        this.field674 = arg0.method327();
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(B)I")
    private final int method227(byte arg0) {
        int var2 = 9999999;
        if (arg0 != 97) {
            field664 = !field664;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field672[var3] != null && this.field672[var3].field1037 / 20 < var2) {
                var2 = this.field672[var3].field1037 / 20;
            }
        }
        if (this.field673 < this.field674 && this.field673 / 20 < var2) {
            var2 = this.field673 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field672[var4] != null) {
                this.field672[var4].field1037 -= var2 * 20;
            }
        }
        if (this.field673 < this.field674) {
            this.field673 -= var2 * 20;
            this.field674 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(II)LMQZHAILV;")
    private final class33 method228(int arg0, int arg1) {
        int var3 = this.method229(arg1);
        field671.field945 = 0;
        field671.method319(1380533830);
        field671.method320(var3 + 36, (byte) 3);
        field671.method319(1463899717);
        field671.method319(1718449184);
        field671.method320(16, (byte) 3);
        field671.method317(1, false);
        field671.method317(1, false);
        field671.method320(22050, (byte) 3);
        field671.method320(22050, (byte) 3);
        field671.method317(1, false);
        field671.method317(8, false);
        field671.method319(1684108385);
        field671.method320(var3, (byte) 3);
        field671.field945 += var3;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return field671;
    }

    @OriginalMember(owner = "ETTRSMMZ", name = "a", descriptor = "(I)I")
    private final int method229(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field672[var3] != null && this.field672[var3].field1037 + this.field672[var3].field1036 > var2) {
                var2 = this.field672[var3].field1037 + this.field672[var3].field1036;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field673 * 22050 / 1000;
        int var6 = this.field674 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field670[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field672[var9] != null) {
                int var15 = this.field672[var9].field1036 * 22050 / 1000;
                int var16 = this.field672[var9].field1037 * 22050 / 1000;
                int[] var17 = this.field672[var9].method382(var15, this.field672[var9].field1036);
                for (int var18 = 0; var18 < var15; var18++) {
                    field670[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field670[var10 + var11] = field670[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field670[var13 + var14] = field670[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
