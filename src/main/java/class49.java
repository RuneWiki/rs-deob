import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QJLULATA")
public class class49 {

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client!QJLULATA", name = "b", descriptor = "I")
    private int field1421 = 4;

    @OriginalMember(owner = "client!QJLULATA", name = "h", descriptor = "[LKEVJJMXF;")
    private class31[] field1427 = new class31[10];

    @OriginalMember(owner = "client!QJLULATA", name = "c", descriptor = "B")
    private static byte field1422 = 6;

    @OriginalMember(owner = "client!QJLULATA", name = "d", descriptor = "[LQJLULATA;")
    private static class49[] field1423 = new class49[5000];

    @OriginalMember(owner = "client!QJLULATA", name = "e", descriptor = "[I")
    public static int[] field1424 = new int[5000];

    @OriginalMember(owner = "client!QJLULATA", name = "i", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client!QJLULATA", name = "j", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client!QJLULATA", name = "g", descriptor = "LIUVBENCV;")
    private static class25 field1426;

    @OriginalMember(owner = "client!QJLULATA", name = "f", descriptor = "[B")
    private static byte[] field1425;

    @OriginalMember(owner = "client!QJLULATA", name = "<init>", descriptor = "(Z)V")
    private class49(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(LIUVBENCV;I)V")
    public static final void method446(class25 arg0, int arg1) {
        field1425 = new byte[441000];
        field1426 = new class25(field1425, 713);
        class31.method327();
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var2 = arg0.method247();
            if (var2 == 65535) {
                return;
            }
            field1423[var2] = new class49(true);
            field1423[var2].method448(arg0, (byte) 1);
            field1424[var2] = field1423[var2].method449(10400);
        }
    }

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(III)LIUVBENCV;")
    public static final class25 method447(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1423[arg2] == null) {
            return null;
        } else {
            class49 var4 = field1423[arg2];
            return var4.method450(arg0, field1422);
        }
    }

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(LIUVBENCV;B)V")
    private final void method448(class25 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method245();
            if (var5 != 0) {
                arg0.field837--;
                this.field1427[var3] = new class31();
                this.field1427[var3].method330(arg0, (byte) 1);
            }
        }
        this.field1428 = arg0.method247();
        this.field1429 = arg0.method247();
        if (arg1 == 1) {
            boolean var4 = false;
        } else {
            this.field1420 = !this.field1420;
        }
    }

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(I)I")
    private final int method449(int arg0) {
        if (arg0 != 10400) {
            this.field1421 = -118;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1427[var3] != null && this.field1427[var3].field1018 / 20 < var2) {
                var2 = this.field1427[var3].field1018 / 20;
            }
        }
        if (this.field1428 < this.field1429 && this.field1428 / 20 < var2) {
            var2 = this.field1428 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1427[var4] != null) {
                this.field1427[var4].field1018 -= var2 * 20;
            }
        }
        if (this.field1428 < this.field1429) {
            this.field1428 -= var2 * 20;
            this.field1429 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!QJLULATA", name = "a", descriptor = "(IB)LIUVBENCV;")
    private final class25 method450(int arg0, byte arg1) {
        int var3 = this.method451(arg0);
        field1426.field837 = 0;
        field1426.method239(1380533830);
        field1426.method240(246, var3 + 36);
        field1426.method239(1463899717);
        field1426.method239(1718449184);
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        field1426.method240(246, 16);
        field1426.method237(1, 1);
        field1426.method237(1, 1);
        field1426.method240(246, 22050);
        field1426.method240(246, 22050);
        field1426.method237(1, 1);
        field1426.method237(1, 8);
        field1426.method239(1684108385);
        field1426.method240(246, var3);
        field1426.field837 += var3;
        return field1426;
    }

    @OriginalMember(owner = "client!QJLULATA", name = "b", descriptor = "(I)I")
    private final int method451(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1427[var3] != null && this.field1427[var3].field1018 + this.field1427[var3].field1017 > var2) {
                var2 = this.field1427[var3].field1018 + this.field1427[var3].field1017;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1428 * 22050 / 1000;
        int var6 = this.field1429 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1425[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1427[var9] != null) {
                int var15 = this.field1427[var9].field1017 * 22050 / 1000;
                int var16 = this.field1427[var9].field1018 * 22050 / 1000;
                int[] var17 = this.field1427[var9].method328(var15, this.field1427[var9].field1017);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1425[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1425[var16 + var18 + 44] = (byte) var19;
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
                field1425[var10 + var11] = field1425[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1425[var13 + var14] = field1425[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
