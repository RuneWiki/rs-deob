import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MYEMYBYY")
public class class39 {

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "I")
    private int field1150 = -776;

    @OriginalMember(owner = "client!MYEMYBYY", name = "g", descriptor = "[LUJYLHBCS;")
    private class59[] field1156 = new class59[10];

    @OriginalMember(owner = "client!MYEMYBYY", name = "b", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!MYEMYBYY", name = "c", descriptor = "[LMYEMYBYY;")
    private static class39[] field1152 = new class39[5000];

    @OriginalMember(owner = "client!MYEMYBYY", name = "d", descriptor = "[I")
    public static int[] field1153 = new int[5000];

    @OriginalMember(owner = "client!MYEMYBYY", name = "h", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!MYEMYBYY", name = "i", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!MYEMYBYY", name = "f", descriptor = "LEYMNCFMK;")
    private static class18 field1155;

    @OriginalMember(owner = "client!MYEMYBYY", name = "e", descriptor = "[B")
    private static byte[] field1154;

    @OriginalMember(owner = "client!MYEMYBYY", name = "<init>", descriptor = "(B)V")
    private class39(byte arg0) {
        if (arg0 != 38) {
            this.field1151 = -157;
        }
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(LEYMNCFMK;Z)V")
    public static final void method403(class18 arg0, boolean arg1) {
        field1154 = new byte[441000];
        field1155 = new class18(field1154, 0);
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class59.method527();
        while (true) {
            int var3 = arg0.method241();
            if (var3 == 65535) {
                return;
            }
            field1152[var3] = new class39((byte) 38);
            field1152[var3].method405((byte) 5, arg0);
            field1153[var3] = field1152[var3].method406(true);
        }
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(IZI)LEYMNCFMK;")
    public static final class18 method404(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1152[arg0] == null) {
            return null;
        } else {
            class39 var4 = field1152[arg0];
            return var4.method407(29861, arg2);
        }
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(BLEYMNCFMK;)V")
    private final void method405(byte arg0, class18 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var6 = arg1.method239();
            if (var6 != 0) {
                arg1.field794--;
                this.field1156[var3] = new class59();
                this.field1156[var3].method530((byte) 5, arg1);
            }
        }
        this.field1157 = arg1.method241();
        this.field1158 = arg1.method241();
        if (arg0 == 5) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(Z)I")
    private final int method406(boolean arg0) {
        int var2 = 9999999;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1156[var4] != null && this.field1156[var4].field1478 / 20 < var2) {
                var2 = this.field1156[var4].field1478 / 20;
            }
        }
        if (this.field1157 < this.field1158 && this.field1157 / 20 < var2) {
            var2 = this.field1157 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1156[var5] != null) {
                this.field1156[var5].field1478 -= var2 * 20;
            }
        }
        if (this.field1157 < this.field1158) {
            this.field1157 -= var2 * 20;
            this.field1158 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(II)LEYMNCFMK;")
    private final class18 method407(int arg0, int arg1) {
        int var3 = this.method408(arg1);
        field1155.field794 = 0;
        field1155.method233(1380533830);
        field1155.method234(var3 + 36, this.field1150);
        field1155.method233(1463899717);
        field1155.method233(1718449184);
        field1155.method234(16, this.field1150);
        field1155.method231(-17359, 1);
        if (arg0 != 29861) {
            this.field1151 = 105;
        }
        field1155.method231(-17359, 1);
        field1155.method234(22050, this.field1150);
        field1155.method234(22050, this.field1150);
        field1155.method231(-17359, 1);
        field1155.method231(-17359, 8);
        field1155.method233(1684108385);
        field1155.method234(var3, this.field1150);
        field1155.field794 += var3;
        return field1155;
    }

    @OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(I)I")
    private final int method408(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1156[var3] != null && this.field1156[var3].field1478 + this.field1156[var3].field1477 > var2) {
                var2 = this.field1156[var3].field1478 + this.field1156[var3].field1477;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1157 * 22050 / 1000;
        int var6 = this.field1158 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1154[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1156[var9] != null) {
                int var15 = this.field1156[var9].field1477 * 22050 / 1000;
                int var16 = this.field1156[var9].field1478 * 22050 / 1000;
                int[] var17 = this.field1156[var9].method528(var15, this.field1156[var9].field1477);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1154[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1154[var16 + var18 + 44] = (byte) var19;
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
                field1154[var10 + var11] = field1154[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1154[var13 + var14] = field1154[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
