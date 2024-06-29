import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WTXWLORU")
public class class64 {

    @OriginalMember(owner = "client!WTXWLORU", name = "d", descriptor = "I")
    private int field1673 = -560;

    @OriginalMember(owner = "client!WTXWLORU", name = "i", descriptor = "[LTDNGNEZO;")
    private class57[] field1678 = new class57[10];

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "Z")
    private static boolean field1670 = true;

    @OriginalMember(owner = "client!WTXWLORU", name = "b", descriptor = "Z")
    private static boolean field1671 = true;

    @OriginalMember(owner = "client!WTXWLORU", name = "c", descriptor = "I")
    private static int field1672 = -472;

    @OriginalMember(owner = "client!WTXWLORU", name = "e", descriptor = "[LWTXWLORU;")
    private static class64[] field1674 = new class64[5000];

    @OriginalMember(owner = "client!WTXWLORU", name = "f", descriptor = "[I")
    public static int[] field1675 = new int[5000];

    @OriginalMember(owner = "client!WTXWLORU", name = "j", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!WTXWLORU", name = "k", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!WTXWLORU", name = "h", descriptor = "LMVHXDWGI;")
    private static class38 field1677;

    @OriginalMember(owner = "client!WTXWLORU", name = "g", descriptor = "[B")
    private static byte[] field1676;

    @OriginalMember(owner = "client!WTXWLORU", name = "<init>", descriptor = "(Z)V")
    private class64(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(BLMVHXDWGI;)V")
    public static final void method580(byte arg0, class38 arg1) {
        field1676 = new byte[441000];
        field1677 = new class38(0, field1676);
        class57.method543();
        if (arg0 != 8) {
            return;
        }
        while (true) {
            int var2 = arg1.method359();
            if (var2 == 65535) {
                return;
            }
            field1674[var2] = new class64(field1671);
            field1674[var2].method582(403, arg1);
            field1675[var2] = field1674[var2].method583(field1672);
        }
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(ZII)LMVHXDWGI;")
    public static final class38 method581(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1670 = !field1670;
        }
        if (field1674[arg2] == null) {
            return null;
        } else {
            class64 var3 = field1674[arg2];
            return var3.method584(arg1, false);
        }
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(ILMVHXDWGI;)V")
    private final void method582(int arg0, class38 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method357();
            if (var4 != 0) {
                arg1.field1161--;
                this.field1678[var3] = new class57();
                this.field1678[var3].method546(403, arg1);
            }
        }
        this.field1679 = arg1.method359();
        if (arg0 <= 0) {
            this.field1673 = -467;
        }
        this.field1680 = arg1.method359();
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(I)I")
    private final int method583(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1678[var3] != null && this.field1678[var3].field1584 / 20 < var2) {
                var2 = this.field1678[var3].field1584 / 20;
            }
        }
        if (arg0 >= 0) {
            return 4;
        }
        if (this.field1679 < this.field1680 && this.field1679 / 20 < var2) {
            var2 = this.field1679 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1678[var4] != null) {
                this.field1678[var4].field1584 -= var2 * 20;
            }
        }
        if (this.field1679 < this.field1680) {
            this.field1679 -= var2 * 20;
            this.field1680 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(IZ)LMVHXDWGI;")
    private final class38 method584(int arg0, boolean arg1) {
        int var3 = this.method585(arg0);
        field1677.field1161 = 0;
        field1677.method351(1380533830);
        field1677.method352(var3 + 36, (byte) 8);
        field1677.method351(1463899717);
        field1677.method351(1718449184);
        field1677.method352(16, (byte) 8);
        if (arg1) {
            throw new NullPointerException();
        }
        field1677.method349((byte) 6, 1);
        field1677.method349((byte) 6, 1);
        field1677.method352(22050, (byte) 8);
        field1677.method352(22050, (byte) 8);
        field1677.method349((byte) 6, 1);
        field1677.method349((byte) 6, 8);
        field1677.method351(1684108385);
        field1677.method352(var3, (byte) 8);
        field1677.field1161 += var3;
        return field1677;
    }

    @OriginalMember(owner = "client!WTXWLORU", name = "b", descriptor = "(I)I")
    private final int method585(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1678[var3] != null && this.field1678[var3].field1584 + this.field1678[var3].field1583 > var2) {
                var2 = this.field1678[var3].field1584 + this.field1678[var3].field1583;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1679 * 22050 / 1000;
        int var6 = this.field1680 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1676[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1678[var9] != null) {
                int var15 = this.field1678[var9].field1583 * 22050 / 1000;
                int var16 = this.field1678[var9].field1584 * 22050 / 1000;
                int[] var17 = this.field1678[var9].method544(var15, this.field1678[var9].field1583);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1676[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1676[var10 + var11] = field1676[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1676[var13 + var14] = field1676[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
