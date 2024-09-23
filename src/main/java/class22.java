import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GTYZUNUD")
public class class22 {

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "B")
    private byte field834 = -77;

    @OriginalMember(owner = "GTYZUNUD", name = "c", descriptor = "I")
    private int field836 = -44;

    @OriginalMember(owner = "GTYZUNUD", name = "i", descriptor = "[LCYFJILLF;")
    private class11[] field842 = new class11[10];

    @OriginalMember(owner = "GTYZUNUD", name = "b", descriptor = "Z")
    private static boolean field835 = true;

    @OriginalMember(owner = "GTYZUNUD", name = "e", descriptor = "[LGTYZUNUD;")
    private static class22[] field838 = new class22[5000];

    @OriginalMember(owner = "GTYZUNUD", name = "f", descriptor = "[I")
    public static int[] field839 = new int[5000];

    @OriginalMember(owner = "GTYZUNUD", name = "j", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "GTYZUNUD", name = "k", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "GTYZUNUD", name = "h", descriptor = "LEILHLJCE;")
    private static class17 field841;

    @OriginalMember(owner = "GTYZUNUD", name = "d", descriptor = "Z")
    private static boolean field837;

    @OriginalMember(owner = "GTYZUNUD", name = "g", descriptor = "[B")
    private static byte[] field840;

    @OriginalMember(owner = "GTYZUNUD", name = "<init>", descriptor = "(Z)V")
    private class22(boolean arg0) {
        if (arg0) {
            field835 = true;
        }
    }

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "(ILEILHLJCE;)V")
    public static final void method297(int arg0, class17 arg1) {
        field840 = new byte[441000];
        while (arg0 >= 0) {
        }
        field841 = new class17(field840, -26583);
        class11.method182();
        while (true) {
            int var2 = arg1.method226();
            if (var2 == 65535) {
                return;
            }
            field838[var2] = new class22(field837);
            field838[var2].method299(arg1, (byte) -50);
            field839[var2] = field838[var2].method300(0);
        }
    }

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "(BII)LEILHLJCE;")
    public static final class17 method298(byte arg0, int arg1, int arg2) {
        if (arg0 != 37) {
            field835 = true;
        }
        if (field838[arg2] == null) {
            return null;
        } else {
            class22 var3 = field838[arg2];
            return var3.method301(9, arg1);
        }
    }

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "(LEILHLJCE;B)V")
    private final void method299(class17 arg0, byte arg1) {
        if (arg1 != -50) {
            this.field836 = 212;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method224();
            if (var4 != 0) {
                arg0.field779--;
                this.field842[var3] = new class11();
                this.field842[var3].method185(arg0, (byte) -50);
            }
        }
        this.field843 = arg0.method226();
        this.field844 = arg0.method226();
    }

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "(I)I")
    private final int method300(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = 9999999;
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field842[var4] != null && this.field842[var4].field668 / 20 < var3) {
                var3 = this.field842[var4].field668 / 20;
            }
        }
        if (this.field843 < this.field844 && this.field843 / 20 < var3) {
            var3 = this.field843 / 20;
        }
        if (var3 == 9999999 || var3 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field842[var5] != null) {
                this.field842[var5].field668 -= var3 * 20;
            }
        }
        if (this.field843 < this.field844) {
            this.field843 -= var3 * 20;
            this.field844 -= var3 * 20;
        }
        return var3;
    }

    @OriginalMember(owner = "GTYZUNUD", name = "a", descriptor = "(II)LEILHLJCE;")
    private final class17 method301(int arg0, int arg1) {
        int var3 = this.method302(arg1);
        field841.field779 = 0;
        field841.method218(1380533830);
        field841.method219(var3 + 36, 303);
        field841.method218(1463899717);
        field841.method218(1718449184);
        field841.method219(16, 303);
        field841.method216(1, this.field834);
        field841.method216(1, this.field834);
        field841.method219(22050, 303);
        field841.method219(22050, 303);
        if (arg0 != 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field841.method216(1, this.field834);
        field841.method216(8, this.field834);
        field841.method218(1684108385);
        field841.method219(var3, 303);
        field841.field779 += var3;
        return field841;
    }

    @OriginalMember(owner = "GTYZUNUD", name = "b", descriptor = "(I)I")
    private final int method302(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field842[var3] != null && this.field842[var3].field668 + this.field842[var3].field667 > var2) {
                var2 = this.field842[var3].field668 + this.field842[var3].field667;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field843 * 22050 / 1000;
        int var6 = this.field844 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field840[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field842[var9] != null) {
                int var15 = this.field842[var9].field667 * 22050 / 1000;
                int var16 = this.field842[var9].field668 * 22050 / 1000;
                int[] var17 = this.field842[var9].method183(var15, this.field842[var9].field667);
                for (int var18 = 0; var18 < var15; var18++) {
                    field840[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field840[var10 + var11] = field840[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field840[var13 + var14] = field840[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
