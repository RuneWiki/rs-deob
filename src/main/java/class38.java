import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NUMTWBFA")
public class class38 {

    @OriginalMember(owner = "client!NUMTWBFA", name = "d", descriptor = "I")
    private int field1184 = -39349;

    @OriginalMember(owner = "client!NUMTWBFA", name = "e", descriptor = "Z")
    private boolean field1185 = false;

    @OriginalMember(owner = "client!NUMTWBFA", name = "f", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "client!NUMTWBFA", name = "g", descriptor = "I")
    private int field1187 = 105;

    @OriginalMember(owner = "client!NUMTWBFA", name = "l", descriptor = "[LUXJRWLQU;")
    private class57[] field1192 = new class57[10];

    @OriginalMember(owner = "client!NUMTWBFA", name = "h", descriptor = "[LNUMTWBFA;")
    private static class38[] field1188 = new class38[5000];

    @OriginalMember(owner = "client!NUMTWBFA", name = "i", descriptor = "[I")
    public static int[] field1189 = new int[5000];

    @OriginalMember(owner = "client!NUMTWBFA", name = "m", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!NUMTWBFA", name = "n", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!NUMTWBFA", name = "k", descriptor = "LLBBVYYXO;")
    private static class32 field1191;

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "Z")
    private static boolean field1181;

    @OriginalMember(owner = "client!NUMTWBFA", name = "b", descriptor = "Z")
    private static boolean field1182;

    @OriginalMember(owner = "client!NUMTWBFA", name = "c", descriptor = "Z")
    private static boolean field1183;

    @OriginalMember(owner = "client!NUMTWBFA", name = "j", descriptor = "[B")
    private static byte[] field1190;

    @OriginalMember(owner = "client!NUMTWBFA", name = "<init>", descriptor = "(Z)V")
    private class38(boolean arg0) {
        if (arg0) {
            this.field1186 = !this.field1186;
        }
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(LLBBVYYXO;I)V")
    public static final void method432(class32 arg0, int arg1) {
        field1190 = new byte[441000];
        field1191 = new class32((byte) 114, field1190);
        class57.method532();
        if (arg1 != 5) {
            return;
        }
        while (true) {
            int var2 = arg0.method371();
            if (var2 == 65535) {
                return;
            }
            field1188[var2] = new class38(field1182);
            field1188[var2].method434(arg0, (byte) 59);
            field1189[var2] = field1188[var2].method435(field1183);
        }
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(III)LLBBVYYXO;")
    public static final class32 method433(int arg0, int arg1, int arg2) {
        if (arg1 < 7 || arg1 > 7) {
            field1181 = !field1181;
        }
        if (field1188[arg2] == null) {
            return null;
        } else {
            class38 var3 = field1188[arg2];
            return var3.method436(arg0, false);
        }
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(LLBBVYYXO;B)V")
    private final void method434(class32 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method369();
            if (var5 != 0) {
                arg0.field1032--;
                this.field1192[var3] = new class57();
                this.field1192[var3].method535(arg0, (byte) 59);
            }
        }
        this.field1193 = arg0.method371();
        this.field1194 = arg0.method371();
        if (arg1 != 59) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(Z)I")
    private final int method435(boolean arg0) {
        if (arg0) {
            this.field1185 = !this.field1185;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1192[var3] != null && this.field1192[var3].field1469 / 20 < var2) {
                var2 = this.field1192[var3].field1469 / 20;
            }
        }
        if (this.field1193 < this.field1194 && this.field1193 / 20 < var2) {
            var2 = this.field1193 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1192[var4] != null) {
                this.field1192[var4].field1469 -= var2 * 20;
            }
        }
        if (this.field1193 < this.field1194) {
            this.field1193 -= var2 * 20;
            this.field1194 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(IZ)LLBBVYYXO;")
    private final class32 method436(int arg0, boolean arg1) {
        int var3 = this.method437(arg0);
        field1191.field1032 = 0;
        field1191.method363(1380533830);
        field1191.method364(var3 + 36, 6);
        field1191.method363(1463899717);
        field1191.method363(1718449184);
        field1191.method364(16, 6);
        field1191.method361(true, 1);
        field1191.method361(true, 1);
        field1191.method364(22050, 6);
        field1191.method364(22050, 6);
        field1191.method361(true, 1);
        field1191.method361(true, 8);
        field1191.method363(1684108385);
        field1191.method364(var3, 6);
        if (arg1) {
            throw new NullPointerException();
        }
        field1191.field1032 += var3;
        return field1191;
    }

    @OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(I)I")
    private final int method437(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1192[var3] != null && this.field1192[var3].field1469 + this.field1192[var3].field1468 > var2) {
                var2 = this.field1192[var3].field1469 + this.field1192[var3].field1468;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1193 * 22050 / 1000;
        int var6 = this.field1194 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1190[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1192[var9] != null) {
                int var15 = this.field1192[var9].field1468 * 22050 / 1000;
                int var16 = this.field1192[var9].field1469 * 22050 / 1000;
                int[] var17 = this.field1192[var9].method533(var15, this.field1192[var9].field1468);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1190[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1190[var10 + var11] = field1190[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1190[var13 + var14] = field1190[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
