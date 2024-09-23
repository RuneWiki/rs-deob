import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SHEJQUDB")
public class class50 {

    @OriginalMember(owner = "SHEJQUDB", name = "b", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "SHEJQUDB", name = "c", descriptor = "Z")
    private boolean field1419 = true;

    @OriginalMember(owner = "SHEJQUDB", name = "h", descriptor = "[LKWOZHDOE;")
    private class31[] field1424 = new class31[10];

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "I")
    private static int field1417 = 974;

    @OriginalMember(owner = "SHEJQUDB", name = "d", descriptor = "[LSHEJQUDB;")
    private static class50[] field1420 = new class50[5000];

    @OriginalMember(owner = "SHEJQUDB", name = "e", descriptor = "[I")
    public static int[] field1421 = new int[5000];

    @OriginalMember(owner = "SHEJQUDB", name = "i", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "SHEJQUDB", name = "j", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "SHEJQUDB", name = "g", descriptor = "LPGNBHFUF;")
    private static class42 field1423;

    @OriginalMember(owner = "SHEJQUDB", name = "f", descriptor = "[B")
    private static byte[] field1422;

    @OriginalMember(owner = "SHEJQUDB", name = "<init>", descriptor = "(I)V")
    private class50(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "(ILPGNBHFUF;)V")
    public static final void method496(int arg0, class42 arg1) {
        field1422 = new byte[441000];
        field1423 = new class42(5, field1422);
        if (arg0 != 0) {
            return;
        }
        class31.method373();
        while (true) {
            int var2 = arg1.method422();
            if (var2 == 65535) {
                return;
            }
            field1420[var2] = new class50(-373);
            field1420[var2].method498(arg1, field1417);
            field1421[var2] = field1420[var2].method499(2);
        }
    }

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "(III)LPGNBHFUF;")
    public static final class42 method497(int arg0, int arg1, int arg2) {
        int var3 = 1 / arg2;
        if (field1420[arg0] == null) {
            return null;
        } else {
            class50 var4 = field1420[arg0];
            return var4.method500(arg1, true);
        }
    }

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "(LPGNBHFUF;I)V")
    private final void method498(class42 arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method420();
            if (var5 != 0) {
                arg0.field1250--;
                this.field1424[var3] = new class31();
                this.field1424[var3].method376(arg0, field1417);
            }
        }
        int var4 = 25 / arg1;
        this.field1425 = arg0.method422();
        this.field1426 = arg0.method422();
    }

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "(I)I")
    private final int method499(int arg0) {
        if (arg0 != 2) {
            this.field1419 = !this.field1419;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1424[var3] != null && this.field1424[var3].field1063 / 20 < var2) {
                var2 = this.field1424[var3].field1063 / 20;
            }
        }
        if (this.field1425 < this.field1426 && this.field1425 / 20 < var2) {
            var2 = this.field1425 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1424[var4] != null) {
                this.field1424[var4].field1063 -= var2 * 20;
            }
        }
        if (this.field1425 < this.field1426) {
            this.field1425 -= var2 * 20;
            this.field1426 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "SHEJQUDB", name = "a", descriptor = "(IZ)LPGNBHFUF;")
    private final class42 method500(int arg0, boolean arg1) {
        int var3 = this.method501(arg0);
        field1423.field1250 = 0;
        field1423.method414(1380533830);
        field1423.method415(var3 + 36, -961);
        field1423.method414(1463899717);
        field1423.method414(1718449184);
        field1423.method415(16, -961);
        field1423.method412(-33050, 1);
        field1423.method412(-33050, 1);
        field1423.method415(22050, -961);
        field1423.method415(22050, -961);
        field1423.method412(-33050, 1);
        field1423.method412(-33050, 8);
        field1423.method414(1684108385);
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1423.method415(var3, -961);
        field1423.field1250 += var3;
        return field1423;
    }

    @OriginalMember(owner = "SHEJQUDB", name = "b", descriptor = "(I)I")
    private final int method501(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1424[var3] != null && this.field1424[var3].field1063 + this.field1424[var3].field1062 > var2) {
                var2 = this.field1424[var3].field1063 + this.field1424[var3].field1062;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1425 * 22050 / 1000;
        int var6 = this.field1426 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1422[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1424[var9] != null) {
                int var15 = this.field1424[var9].field1062 * 22050 / 1000;
                int var16 = this.field1424[var9].field1063 * 22050 / 1000;
                int[] var17 = this.field1424[var9].method374(var15, this.field1424[var9].field1062);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1422[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1422[var10 + var11] = field1422[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1422[var13 + var14] = field1422[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
