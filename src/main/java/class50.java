import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PWXXEHUE")
public class class50 {

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "Z")
    private boolean field1107 = true;

    @OriginalMember(owner = "PWXXEHUE", name = "b", descriptor = "I")
    private int field1108 = 9;

    @OriginalMember(owner = "PWXXEHUE", name = "h", descriptor = "[LQCXYCZNF;")
    private class53[] field1114 = new class53[10];

    @OriginalMember(owner = "PWXXEHUE", name = "d", descriptor = "[LPWXXEHUE;")
    private static class50[] field1110 = new class50[5000];

    @OriginalMember(owner = "PWXXEHUE", name = "e", descriptor = "[I")
    public static int[] field1111 = new int[5000];

    @OriginalMember(owner = "PWXXEHUE", name = "c", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "PWXXEHUE", name = "i", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "PWXXEHUE", name = "j", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "PWXXEHUE", name = "g", descriptor = "LJHKSAGUC;")
    private static class31 field1113;

    @OriginalMember(owner = "PWXXEHUE", name = "f", descriptor = "[B")
    private static byte[] field1112;

    @OriginalMember(owner = "PWXXEHUE", name = "<init>", descriptor = "(I)V")
    private class50(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(ILJHKSAGUC;)V")
    public static final void method398(int arg0, class31 arg1) {
        field1112 = new byte[441000];
        field1113 = new class31(field1112, 8);
        class53.method413();
        int var2 = 67 / arg0;
        while (true) {
            int var3 = arg1.method308();
            if (var3 == 65535) {
                return;
            }
            field1110[var3] = new class50(310);
            field1110[var3].method400(arg1, 0);
            field1111[var3] = field1110[var3].method401((byte) -13);
        }
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(III)LJHKSAGUC;")
    public static final class31 method399(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (field1110[arg0] == null) {
            return null;
        } else {
            class50 var3 = field1110[arg0];
            return var3.method402(-17105, arg2);
        }
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(LJHKSAGUC;I)V")
    private final void method400(class31 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method306();
            if (var4 != 0) {
                arg0.field901--;
                this.field1114[var3] = new class53();
                this.field1114[var3].method416(arg0, 0);
            }
        }
        this.field1115 = arg0.method308();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1116 = arg0.method308();
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(B)I")
    private final int method401(byte arg0) {
        int var2 = 9999999;
        if (arg0 != -13) {
            this.field1109 = -106;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1114[var3] != null && this.field1114[var3].field1149 / 20 < var2) {
                var2 = this.field1114[var3].field1149 / 20;
            }
        }
        if (this.field1115 < this.field1116 && this.field1115 / 20 < var2) {
            var2 = this.field1115 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1114[var4] != null) {
                this.field1114[var4].field1149 -= var2 * 20;
            }
        }
        if (this.field1115 < this.field1116) {
            this.field1115 -= var2 * 20;
            this.field1116 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(II)LJHKSAGUC;")
    private final class31 method402(int arg0, int arg1) {
        int var3 = this.method403(arg1);
        field1113.field901 = 0;
        field1113.method300(1380533830);
        field1113.method301(var3 + 36, true);
        field1113.method300(1463899717);
        field1113.method300(1718449184);
        field1113.method301(16, true);
        field1113.method298(1, 4);
        field1113.method298(1, 4);
        if (arg0 != -17105) {
            throw new NullPointerException();
        }
        field1113.method301(22050, true);
        field1113.method301(22050, true);
        field1113.method298(1, 4);
        field1113.method298(8, 4);
        field1113.method300(1684108385);
        field1113.method301(var3, true);
        field1113.field901 += var3;
        return field1113;
    }

    @OriginalMember(owner = "PWXXEHUE", name = "a", descriptor = "(I)I")
    private final int method403(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1114[var3] != null && this.field1114[var3].field1149 + this.field1114[var3].field1148 > var2) {
                var2 = this.field1114[var3].field1149 + this.field1114[var3].field1148;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1115 * 22050 / 1000;
        int var6 = this.field1116 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1112[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1114[var9] != null) {
                int var15 = this.field1114[var9].field1148 * 22050 / 1000;
                int var16 = this.field1114[var9].field1149 * 22050 / 1000;
                int[] var17 = this.field1114[var9].method414(var15, this.field1114[var9].field1148);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1112[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1112[var10 + var11] = field1112[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1112[var13 + var14] = field1112[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
