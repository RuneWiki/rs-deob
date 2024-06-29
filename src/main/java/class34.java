import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MFQVDWNR")
public class class34 {

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "Z")
    private boolean field1128 = true;

    @OriginalMember(owner = "client!MFQVDWNR", name = "b", descriptor = "Z")
    private boolean field1129 = false;

    @OriginalMember(owner = "client!MFQVDWNR", name = "c", descriptor = "B")
    private byte field1130 = -99;

    @OriginalMember(owner = "client!MFQVDWNR", name = "i", descriptor = "[LQWSZQDKL;")
    private class43[] field1136 = new class43[10];

    @OriginalMember(owner = "client!MFQVDWNR", name = "d", descriptor = "Z")
    private static boolean field1131 = true;

    @OriginalMember(owner = "client!MFQVDWNR", name = "e", descriptor = "[LMFQVDWNR;")
    private static class34[] field1132 = new class34[5000];

    @OriginalMember(owner = "client!MFQVDWNR", name = "f", descriptor = "[I")
    public static int[] field1133 = new int[5000];

    @OriginalMember(owner = "client!MFQVDWNR", name = "j", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!MFQVDWNR", name = "k", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client!MFQVDWNR", name = "h", descriptor = "LPQBRPYKE;")
    private static class41 field1135;

    @OriginalMember(owner = "client!MFQVDWNR", name = "g", descriptor = "[B")
    private static byte[] field1134;

    @OriginalMember(owner = "client!MFQVDWNR", name = "<init>", descriptor = "(B)V")
    private class34(byte arg0) {
        if (arg0 != 125) {
            this.field1128 = !this.field1128;
        }
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(BLPQBRPYKE;)V")
    public static final void method280(byte arg0, class41 arg1) {
        field1134 = new byte[441000];
        field1135 = new class41(888, field1134);
        class43.method399();
        if (arg0 != -82) {
            return;
        }
        while (true) {
            int var2 = arg1.method342();
            if (var2 == 65535) {
                return;
            }
            field1132[var2] = new class34((byte) 125);
            field1132[var2].method282(arg1, false);
            field1133[var2] = field1132[var2].method283(false);
        }
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(IBI)LPQBRPYKE;")
    public static final class41 method281(int arg0, byte arg1, int arg2) {
        if (arg1 != -75) {
            field1131 = !field1131;
        }
        if (field1132[arg0] == null) {
            return null;
        } else {
            class34 var3 = field1132[arg0];
            return var3.method284(true, arg2);
        }
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(LPQBRPYKE;Z)V")
    private final void method282(class41 arg0, boolean arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method340();
            if (var4 != 0) {
                arg0.field1241--;
                this.field1136[var3] = new class43();
                this.field1136[var3].method402(arg0, false);
            }
        }
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1137 = arg0.method342();
        this.field1138 = arg0.method342();
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(Z)I")
    private final int method283(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1136[var3] != null && this.field1136[var3].field1315 / 20 < var2) {
                var2 = this.field1136[var3].field1315 / 20;
            }
        }
        if (this.field1137 < this.field1138 && this.field1137 / 20 < var2) {
            var2 = this.field1137 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1136[var4] != null) {
                this.field1136[var4].field1315 -= var2 * 20;
            }
        }
        if (arg0) {
            return 3;
        }
        if (this.field1137 < this.field1138) {
            this.field1137 -= var2 * 20;
            this.field1138 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(ZI)LPQBRPYKE;")
    private final class41 method284(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1129 = !this.field1129;
        }
        int var3 = this.method285(arg1);
        field1135.field1241 = 0;
        field1135.method334(1380533830);
        field1135.method335(var3 + 36, (byte) 1);
        field1135.method334(1463899717);
        field1135.method334(1718449184);
        field1135.method335(16, (byte) 1);
        field1135.method332(-46595, 1);
        field1135.method332(-46595, 1);
        field1135.method335(22050, (byte) 1);
        field1135.method335(22050, (byte) 1);
        field1135.method332(-46595, 1);
        field1135.method332(-46595, 8);
        field1135.method334(1684108385);
        field1135.method335(var3, (byte) 1);
        field1135.field1241 += var3;
        return field1135;
    }

    @OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(I)I")
    private final int method285(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1136[var3] != null && this.field1136[var3].field1315 + this.field1136[var3].field1314 > var2) {
                var2 = this.field1136[var3].field1315 + this.field1136[var3].field1314;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1137 * 22050 / 1000;
        int var6 = this.field1138 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1134[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1136[var9] != null) {
                int var15 = this.field1136[var9].field1314 * 22050 / 1000;
                int var16 = this.field1136[var9].field1315 * 22050 / 1000;
                int[] var17 = this.field1136[var9].method400(var15, this.field1136[var9].field1314);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1134[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1134[var16 + var18 + 44] = (byte) var19;
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
                field1134[var10 + var11] = field1134[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1134[var13 + var14] = field1134[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
