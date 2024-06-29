import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SHTECHVG")
public class class53 {

    @OriginalMember(owner = "client!SHTECHVG", name = "c", descriptor = "I")
    private int field1401 = -223;

    @OriginalMember(owner = "client!SHTECHVG", name = "d", descriptor = "I")
    private int field1402 = -340;

    @OriginalMember(owner = "client!SHTECHVG", name = "e", descriptor = "I")
    private int field1403 = 577;

    @OriginalMember(owner = "client!SHTECHVG", name = "j", descriptor = "[LDWRVLVYL;")
    private class13[] field1408 = new class13[10];

    @OriginalMember(owner = "client!SHTECHVG", name = "b", descriptor = "Z")
    private static boolean field1400 = true;

    @OriginalMember(owner = "client!SHTECHVG", name = "f", descriptor = "[LSHTECHVG;")
    private static class53[] field1404 = new class53[5000];

    @OriginalMember(owner = "client!SHTECHVG", name = "g", descriptor = "[I")
    public static int[] field1405 = new int[5000];

    @OriginalMember(owner = "client!SHTECHVG", name = "k", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!SHTECHVG", name = "l", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!SHTECHVG", name = "i", descriptor = "LTKPFKOXP;")
    private static class59 field1407;

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "Z")
    private static boolean field1399;

    @OriginalMember(owner = "client!SHTECHVG", name = "h", descriptor = "[B")
    private static byte[] field1406;

    @OriginalMember(owner = "client!SHTECHVG", name = "<init>", descriptor = "(Z)V")
    private class53(boolean arg0) {
        if (arg0) {
            this.field1401 = 110;
        }
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(BLTKPFKOXP;)V")
    public static final void method476(byte arg0, class59 arg1) {
        field1406 = new byte[441000];
        field1407 = new class59(859, field1406);
        class13.method188();
        if (arg0 != -3) {
            field1399 = !field1399;
        }
        while (true) {
            int var2 = arg1.method531();
            if (var2 == 65535) {
                return;
            }
            field1404[var2] = new class53(false);
            field1404[var2].method478(arg1, (byte) 4);
            field1405[var2] = field1404[var2].method479(31724);
        }
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(IIZ)LTKPFKOXP;")
    public static final class59 method477(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1404[arg1] == null) {
            return null;
        } else {
            class53 var4 = field1404[arg1];
            return var4.method480(arg0, false);
        }
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(LTKPFKOXP;B)V")
    private final void method478(class59 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method529();
            if (var4 != 0) {
                arg0.field1589--;
                this.field1408[var3] = new class13();
                this.field1408[var3].method191(arg0, (byte) 4);
            }
        }
        this.field1409 = arg0.method531();
        if (arg1 != 4) {
            this.field1403 = -80;
        }
        this.field1410 = arg0.method531();
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(I)I")
    private final int method479(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1408[var3] != null && this.field1408[var3].field723 / 20 < var2) {
                var2 = this.field1408[var3].field723 / 20;
            }
        }
        if (arg0 != 31724) {
            this.field1401 = 216;
        }
        if (this.field1409 < this.field1410 && this.field1409 / 20 < var2) {
            var2 = this.field1409 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1408[var4] != null) {
                this.field1408[var4].field723 -= var2 * 20;
            }
        }
        if (this.field1409 < this.field1410) {
            this.field1409 -= var2 * 20;
            this.field1410 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(IZ)LTKPFKOXP;")
    private final class59 method480(int arg0, boolean arg1) {
        int var3 = this.method481(arg0);
        field1407.field1589 = 0;
        field1407.method523(1380533830);
        field1407.method524(var3 + 36, (byte) 1);
        if (arg1) {
            this.field1402 = -478;
        }
        field1407.method523(1463899717);
        field1407.method523(1718449184);
        field1407.method524(16, (byte) 1);
        field1407.method521(1, 454);
        field1407.method521(1, 454);
        field1407.method524(22050, (byte) 1);
        field1407.method524(22050, (byte) 1);
        field1407.method521(1, 454);
        field1407.method521(8, 454);
        field1407.method523(1684108385);
        field1407.method524(var3, (byte) 1);
        field1407.field1589 += var3;
        return field1407;
    }

    @OriginalMember(owner = "client!SHTECHVG", name = "b", descriptor = "(I)I")
    private final int method481(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1408[var3] != null && this.field1408[var3].field723 + this.field1408[var3].field722 > var2) {
                var2 = this.field1408[var3].field723 + this.field1408[var3].field722;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1409 * 22050 / 1000;
        int var6 = this.field1410 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1406[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1408[var9] != null) {
                int var15 = this.field1408[var9].field722 * 22050 / 1000;
                int var16 = this.field1408[var9].field723 * 22050 / 1000;
                int[] var17 = this.field1408[var9].method189(var15, this.field1408[var9].field722);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1406[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1406[var10 + var11] = field1406[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1406[var13 + var14] = field1406[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
