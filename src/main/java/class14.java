import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GQYCHOQW")
public class class14 {

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "Z")
    private boolean field720 = true;

    @OriginalMember(owner = "GQYCHOQW", name = "b", descriptor = "I")
    private int field721 = -22626;

    @OriginalMember(owner = "GQYCHOQW", name = "g", descriptor = "[LIRCSYKHE;")
    private class22[] field726 = new class22[10];

    @OriginalMember(owner = "GQYCHOQW", name = "c", descriptor = "[LGQYCHOQW;")
    private static class14[] field722 = new class14[5000];

    @OriginalMember(owner = "GQYCHOQW", name = "d", descriptor = "[I")
    public static int[] field723 = new int[5000];

    @OriginalMember(owner = "GQYCHOQW", name = "h", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "GQYCHOQW", name = "i", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "GQYCHOQW", name = "f", descriptor = "LBJPWOXRJ;")
    private static class3 field725;

    @OriginalMember(owner = "GQYCHOQW", name = "e", descriptor = "[B")
    private static byte[] field724;

    @OriginalMember(owner = "GQYCHOQW", name = "<init>", descriptor = "(I)V")
    private class14(int arg0) {
        if (arg0 <= 0) {
            this.field720 = !this.field720;
        }
    }

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "(LBJPWOXRJ;B)V")
    public static final void method235(class3 arg0, byte arg1) {
        field724 = new byte[441000];
        field725 = new class3(false, field724);
        if (arg1 != 0) {
            return;
        }
        boolean var2 = false;
        class22.method311();
        while (true) {
            int var3 = arg0.method17();
            if (var3 == 65535) {
                return;
            }
            field722[var3] = new class14(107);
            field722[var3].method237(674, arg0);
            field723[var3] = field722[var3].method238(-178);
        }
    }

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "(III)LBJPWOXRJ;")
    public static final class3 method236(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (field722[arg2] == null) {
            return null;
        } else {
            class14 var3 = field722[arg2];
            return var3.method239((byte) 3, arg1);
        }
    }

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    private final void method237(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            this.field721 = 248;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method15();
            if (var4 != 0) {
                arg1.field20--;
                this.field726[var3] = new class22();
                this.field726[var3].method314(674, arg1);
            }
        }
        this.field727 = arg1.method17();
        this.field728 = arg1.method17();
    }

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "(I)I")
    private final int method238(int arg0) {
        int var2 = 9999999;
        if (arg0 >= 0) {
            this.field721 = -180;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field726[var3] != null && this.field726[var3].field881 / 20 < var2) {
                var2 = this.field726[var3].field881 / 20;
            }
        }
        if (this.field727 < this.field728 && this.field727 / 20 < var2) {
            var2 = this.field727 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field726[var4] != null) {
                this.field726[var4].field881 -= var2 * 20;
            }
        }
        if (this.field727 < this.field728) {
            this.field727 -= var2 * 20;
            this.field728 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "GQYCHOQW", name = "a", descriptor = "(BI)LBJPWOXRJ;")
    private final class3 method239(byte arg0, int arg1) {
        int var3 = this.method240(arg1);
        field725.field20 = 0;
        field725.method9(1380533830);
        field725.method10(266, var3 + 36);
        field725.method9(1463899717);
        field725.method9(1718449184);
        field725.method10(266, 16);
        field725.method7(1, 0);
        field725.method7(1, 0);
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field721 = -199;
        }
        field725.method10(266, 22050);
        field725.method10(266, 22050);
        field725.method7(1, 0);
        field725.method7(8, 0);
        field725.method9(1684108385);
        field725.method10(266, var3);
        field725.field20 += var3;
        return field725;
    }

    @OriginalMember(owner = "GQYCHOQW", name = "b", descriptor = "(I)I")
    private final int method240(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field726[var3] != null && this.field726[var3].field881 + this.field726[var3].field880 > var2) {
                var2 = this.field726[var3].field881 + this.field726[var3].field880;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field727 * 22050 / 1000;
        int var6 = this.field728 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field724[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field726[var9] != null) {
                int var15 = this.field726[var9].field880 * 22050 / 1000;
                int var16 = this.field726[var9].field881 * 22050 / 1000;
                int[] var17 = this.field726[var9].method312(var15, this.field726[var9].field880);
                for (int var18 = 0; var18 < var15; var18++) {
                    field724[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field724[var10 + var11] = field724[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field724[var13 + var14] = field724[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
