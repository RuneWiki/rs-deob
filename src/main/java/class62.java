import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WBMSJJDO")
public class class62 {

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "Z")
    private boolean field1544 = false;

    @OriginalMember(owner = "client!WBMSJJDO", name = "h", descriptor = "[LFFMSWDBM;")
    private class13[] field1551 = new class13[10];

    @OriginalMember(owner = "client!WBMSJJDO", name = "b", descriptor = "I")
    private static int field1545 = 166;

    @OriginalMember(owner = "client!WBMSJJDO", name = "c", descriptor = "I")
    private static int field1546 = 8;

    @OriginalMember(owner = "client!WBMSJJDO", name = "d", descriptor = "[LWBMSJJDO;")
    private static class62[] field1547 = new class62[5000];

    @OriginalMember(owner = "client!WBMSJJDO", name = "e", descriptor = "[I")
    public static int[] field1548 = new int[5000];

    @OriginalMember(owner = "client!WBMSJJDO", name = "i", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!WBMSJJDO", name = "j", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!WBMSJJDO", name = "g", descriptor = "LTQYMAXSO;")
    private static class53 field1550;

    @OriginalMember(owner = "client!WBMSJJDO", name = "f", descriptor = "[B")
    private static byte[] field1549;

    @OriginalMember(owner = "client!WBMSJJDO", name = "<init>", descriptor = "(Z)V")
    private class62(boolean arg0) {
        if (!arg0) {
            field1545 = 362;
        }
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(BLTQYMAXSO;)V")
    public static final void method544(byte arg0, class53 arg1) {
        if (arg0 != -109) {
            field1546 = 472;
        }
        field1549 = new byte[441000];
        field1550 = new class53(field1549, -631);
        class13.method195();
        while (true) {
            int var2 = arg1.method470();
            if (var2 == 65535) {
                return;
            }
            field1547[var2] = new class62(true);
            field1547[var2].method546(3, arg1);
            field1548[var2] = field1547[var2].method547(0);
        }
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(BII)LTQYMAXSO;")
    public static final class53 method545(byte arg0, int arg1, int arg2) {
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            field1545 = -437;
        }
        if (field1547[arg2] == null) {
            return null;
        } else {
            class62 var4 = field1547[arg2];
            return var4.method548(arg1, 20468);
        }
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(ILTQYMAXSO;)V")
    private final void method546(int arg0, class53 arg1) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method468();
            if (var4 != 0) {
                arg1.field1457--;
                this.field1551[var3] = new class13();
                this.field1551[var3].method198(3, arg1);
            }
        }
        this.field1552 = arg1.method470();
        this.field1553 = arg1.method470();
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(I)I")
    private final int method547(int arg0) {
        if (arg0 != 0) {
            return 2;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1551[var3] != null && this.field1551[var3].field694 / 20 < var2) {
                var2 = this.field1551[var3].field694 / 20;
            }
        }
        if (this.field1552 < this.field1553 && this.field1552 / 20 < var2) {
            var2 = this.field1552 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1551[var4] != null) {
                this.field1551[var4].field694 -= var2 * 20;
            }
        }
        if (this.field1552 < this.field1553) {
            this.field1552 -= var2 * 20;
            this.field1553 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(II)LTQYMAXSO;")
    private final class53 method548(int arg0, int arg1) {
        int var3 = this.method549(arg0);
        field1550.field1457 = 0;
        field1550.method462(1380533830);
        field1550.method463(var3 + 36, true);
        if (arg1 != 20468) {
            this.field1544 = !this.field1544;
        }
        field1550.method462(1463899717);
        field1550.method462(1718449184);
        field1550.method463(16, true);
        field1550.method460(1, -22089);
        field1550.method460(1, -22089);
        field1550.method463(22050, true);
        field1550.method463(22050, true);
        field1550.method460(1, -22089);
        field1550.method460(8, -22089);
        field1550.method462(1684108385);
        field1550.method463(var3, true);
        field1550.field1457 += var3;
        return field1550;
    }

    @OriginalMember(owner = "client!WBMSJJDO", name = "b", descriptor = "(I)I")
    private final int method549(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1551[var3] != null && this.field1551[var3].field694 + this.field1551[var3].field693 > var2) {
                var2 = this.field1551[var3].field694 + this.field1551[var3].field693;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1552 * 22050 / 1000;
        int var6 = this.field1553 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1549[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1551[var9] != null) {
                int var15 = this.field1551[var9].field693 * 22050 / 1000;
                int var16 = this.field1551[var9].field694 * 22050 / 1000;
                int[] var17 = this.field1551[var9].method196(var15, this.field1551[var9].field693);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1549[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1549[var10 + var11] = field1549[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1549[var13 + var14] = field1549[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
