import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OWCBJDUM")
public class class53 {

    @OriginalMember(owner = "OWCBJDUM", name = "b", descriptor = "Z")
    private boolean field1288 = true;

    @OriginalMember(owner = "OWCBJDUM", name = "c", descriptor = "I")
    private int field1289 = 17642;

    @OriginalMember(owner = "OWCBJDUM", name = "i", descriptor = "[LLQCMEXCE;")
    private class38[] field1295 = new class38[10];

    @OriginalMember(owner = "OWCBJDUM", name = "a", descriptor = "Z")
    private static boolean field1287 = true;

    @OriginalMember(owner = "OWCBJDUM", name = "d", descriptor = "Z")
    private static boolean field1290 = true;

    @OriginalMember(owner = "OWCBJDUM", name = "e", descriptor = "[LOWCBJDUM;")
    private static class53[] field1291 = new class53[5000];

    @OriginalMember(owner = "OWCBJDUM", name = "f", descriptor = "[I")
    public static int[] field1292 = new int[5000];

    @OriginalMember(owner = "OWCBJDUM", name = "j", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "OWCBJDUM", name = "k", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "OWCBJDUM", name = "h", descriptor = "LXGRGMPUQ;")
    private static class69 field1294;

    @OriginalMember(owner = "OWCBJDUM", name = "g", descriptor = "[B")
    private static byte[] field1293;

    @OriginalMember(owner = "OWCBJDUM", name = "<init>", descriptor = "(Z)V")
    private class53(boolean arg0) {
        if (arg0) {
            this.field1288 = !this.field1288;
        }
    }

    @OriginalMember(owner = "OWCBJDUM", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public static final void method328(boolean arg0, class69 arg1) {
        field1293 = new byte[441000];
        field1294 = new class69(field1293, -82);
        if (!arg0) {
            field1290 = !field1290;
        }
        class38.method310();
        while (true) {
            int var2 = arg1.method467();
            if (var2 == 65535) {
                return;
            }
            field1291[var2] = new class53(false);
            field1291[var2].method330(field1287, arg1);
            field1292[var2] = field1291[var2].method331(0);
        }
    }

    @OriginalMember(owner = "OWCBJDUM", name = "a", descriptor = "(III)LXGRGMPUQ;")
    public static final class69 method329(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            throw new NullPointerException();
        } else if (field1291[arg1] == null) {
            return null;
        } else {
            class53 var3 = field1291[arg1];
            return var3.method332(-335, arg0);
        }
    }

    @OriginalMember(owner = "OWCBJDUM", name = "b", descriptor = "(ZLXGRGMPUQ;)V")
    private final void method330(boolean arg0, class69 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method465();
            if (var4 != 0) {
                arg1.field1652--;
                this.field1295[var3] = new class38();
                this.field1295[var3].method313(field1287, arg1);
            }
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field1296 = arg1.method467();
        this.field1297 = arg1.method467();
    }

    @OriginalMember(owner = "OWCBJDUM", name = "a", descriptor = "(I)I")
    private final int method331(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1295[var3] != null && this.field1295[var3].field1120 / 20 < var2) {
                var2 = this.field1295[var3].field1120 / 20;
            }
        }
        if (arg0 < 0 || arg0 > 0) {
            return 1;
        }
        if (this.field1296 < this.field1297 && this.field1296 / 20 < var2) {
            var2 = this.field1296 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1295[var4] != null) {
                this.field1295[var4].field1120 -= var2 * 20;
            }
        }
        if (this.field1296 < this.field1297) {
            this.field1296 -= var2 * 20;
            this.field1297 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "OWCBJDUM", name = "a", descriptor = "(II)LXGRGMPUQ;")
    private final class69 method332(int arg0, int arg1) {
        int var3 = this.method333(arg1);
        field1294.field1652 = 0;
        field1294.method459(1380533830);
        field1294.method460(var3 + 36, 750);
        field1294.method459(1463899717);
        field1294.method459(1718449184);
        field1294.method460(16, 750);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        field1294.method457(-48022, 1);
        field1294.method457(-48022, 1);
        field1294.method460(22050, 750);
        field1294.method460(22050, 750);
        field1294.method457(-48022, 1);
        field1294.method457(-48022, 8);
        field1294.method459(1684108385);
        field1294.method460(var3, 750);
        field1294.field1652 += var3;
        return field1294;
    }

    @OriginalMember(owner = "OWCBJDUM", name = "b", descriptor = "(I)I")
    private final int method333(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1295[var3] != null && this.field1295[var3].field1120 + this.field1295[var3].field1119 > var2) {
                var2 = this.field1295[var3].field1120 + this.field1295[var3].field1119;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1296 * 22050 / 1000;
        int var6 = this.field1297 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1293[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1295[var9] != null) {
                int var15 = this.field1295[var9].field1119 * 22050 / 1000;
                int var16 = this.field1295[var9].field1120 * 22050 / 1000;
                int[] var17 = this.field1295[var9].method311(var15, this.field1295[var9].field1119);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1293[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1293[var10 + var11] = field1293[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1293[var13 + var14] = field1293[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
