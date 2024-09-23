import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AWDRZEFD")
public class class3 {

    @OriginalMember(owner = "AWDRZEFD", name = "h", descriptor = "[LKMJDCQND;")
    private class31[] field78 = new class31[10];

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "I")
    private static int field71 = 4;

    @OriginalMember(owner = "AWDRZEFD", name = "b", descriptor = "I")
    private static int field72 = 935;

    @OriginalMember(owner = "AWDRZEFD", name = "c", descriptor = "I")
    private static int field73 = 4;

    @OriginalMember(owner = "AWDRZEFD", name = "d", descriptor = "[LAWDRZEFD;")
    private static class3[] field74 = new class3[5000];

    @OriginalMember(owner = "AWDRZEFD", name = "e", descriptor = "[I")
    public static int[] field75 = new int[5000];

    @OriginalMember(owner = "AWDRZEFD", name = "i", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "AWDRZEFD", name = "j", descriptor = "I")
    private int field80;

    @OriginalMember(owner = "AWDRZEFD", name = "g", descriptor = "LKHOMSBHW;")
    private static class30 field77;

    @OriginalMember(owner = "AWDRZEFD", name = "f", descriptor = "[B")
    private static byte[] field76;

    @OriginalMember(owner = "AWDRZEFD", name = "<init>", descriptor = "(I)V")
    private class3(int arg0) {
        int var2 = 45 / arg0;
    }

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "(ILKHOMSBHW;)V")
    public static final void method8(int arg0, class30 arg1) {
        if (arg0 >= 0) {
            return;
        }
        field76 = new byte[441000];
        field77 = new class30(field76, -982);
        class31.method390();
        while (true) {
            int var2 = arg1.method351();
            if (var2 == 65535) {
                return;
            }
            field74[var2] = new class3(field72);
            field74[var2].method10(arg1, 1);
            field75[var2] = field74[var2].method11(-29271);
        }
    }

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "(III)LKHOMSBHW;")
    public static final class30 method9(int arg0, int arg1, int arg2) {
        if (field73 != arg0) {
            field71 = 176;
        }
        if (field74[arg1] == null) {
            return null;
        } else {
            class3 var3 = field74[arg1];
            return var3.method12(arg2, 338);
        }
    }

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "(LKHOMSBHW;I)V")
    private final void method10(class30 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method349();
            if (var4 != 0) {
                arg0.field1065--;
                this.field78[var3] = new class31();
                this.field78[var3].method393(arg0, 1);
            }
        }
        if (arg1 < 1 || arg1 > 1) {
            throw new NullPointerException();
        }
        this.field79 = arg0.method351();
        this.field80 = arg0.method351();
    }

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "(I)I")
    private final int method11(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field78[var3] != null && this.field78[var3].field1096 / 20 < var2) {
                var2 = this.field78[var3].field1096 / 20;
            }
        }
        if (this.field79 < this.field80 && this.field79 / 20 < var2) {
            var2 = this.field79 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field78[var4] != null) {
                this.field78[var4].field1096 -= var2 * 20;
            }
        }
        if (arg0 != -29271) {
            field72 = 97;
        }
        if (this.field79 < this.field80) {
            this.field79 -= var2 * 20;
            this.field80 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "AWDRZEFD", name = "a", descriptor = "(II)LKHOMSBHW;")
    private final class30 method12(int arg0, int arg1) {
        int var3 = this.method13(arg0);
        field77.field1065 = 0;
        field77.method343(1380533830);
        field77.method344(var3 + 36, 8);
        field77.method343(1463899717);
        field77.method343(1718449184);
        field77.method344(16, 8);
        field77.method341(1, (byte) -63);
        field77.method341(1, (byte) -63);
        field77.method344(22050, 8);
        int var4 = 1 / arg1;
        field77.method344(22050, 8);
        field77.method341(1, (byte) -63);
        field77.method341(8, (byte) -63);
        field77.method343(1684108385);
        field77.method344(var3, 8);
        field77.field1065 += var3;
        return field77;
    }

    @OriginalMember(owner = "AWDRZEFD", name = "b", descriptor = "(I)I")
    private final int method13(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field78[var3] != null && this.field78[var3].field1096 + this.field78[var3].field1095 > var2) {
                var2 = this.field78[var3].field1096 + this.field78[var3].field1095;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field79 * 22050 / 1000;
        int var6 = this.field80 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field76[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field78[var9] != null) {
                int var15 = this.field78[var9].field1095 * 22050 / 1000;
                int var16 = this.field78[var9].field1096 * 22050 / 1000;
                int[] var17 = this.field78[var9].method391(var15, this.field78[var9].field1095);
                for (int var18 = 0; var18 < var15; var18++) {
                    field76[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field76[var10 + var11] = field76[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field76[var13 + var14] = field76[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
