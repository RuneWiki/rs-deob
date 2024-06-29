import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TBRIOEDI")
public class class56 {

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "I")
    private int field1473 = -20315;

    @OriginalMember(owner = "client!TBRIOEDI", name = "b", descriptor = "Z")
    private boolean field1474 = false;

    @OriginalMember(owner = "client!TBRIOEDI", name = "c", descriptor = "B")
    private byte field1475 = 19;

    @OriginalMember(owner = "client!TBRIOEDI", name = "e", descriptor = "I")
    private int field1477 = -762;

    @OriginalMember(owner = "client!TBRIOEDI", name = "f", descriptor = "I")
    private int field1478 = 47368;

    @OriginalMember(owner = "client!TBRIOEDI", name = "g", descriptor = "I")
    private int field1479 = 2;

    @OriginalMember(owner = "client!TBRIOEDI", name = "h", descriptor = "Z")
    private boolean field1480 = false;

    @OriginalMember(owner = "client!TBRIOEDI", name = "n", descriptor = "[LYXUDALYQ;")
    private class69[] field1486 = new class69[10];

    @OriginalMember(owner = "client!TBRIOEDI", name = "d", descriptor = "I")
    private static int field1476 = -762;

    @OriginalMember(owner = "client!TBRIOEDI", name = "i", descriptor = "Z")
    private static boolean field1481 = true;

    @OriginalMember(owner = "client!TBRIOEDI", name = "j", descriptor = "[LTBRIOEDI;")
    private static class56[] field1482 = new class56[5000];

    @OriginalMember(owner = "client!TBRIOEDI", name = "k", descriptor = "[I")
    public static int[] field1483 = new int[5000];

    @OriginalMember(owner = "client!TBRIOEDI", name = "o", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!TBRIOEDI", name = "p", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!TBRIOEDI", name = "m", descriptor = "LFTMSICIZ;")
    private static class13 field1485;

    @OriginalMember(owner = "client!TBRIOEDI", name = "l", descriptor = "[B")
    private static byte[] field1484;

    @OriginalMember(owner = "client!TBRIOEDI", name = "<init>", descriptor = "(I)V")
    private class56(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(ZLFTMSICIZ;)V")
    public static final void method462(boolean arg0, class13 arg1) {
        if (!arg0) {
            field1481 = !field1481;
        }
        field1484 = new byte[441000];
        field1485 = new class13(field1484, (byte) 3);
        class69.method572();
        while (true) {
            int var2 = arg1.method215();
            if (var2 == 65535) {
                return;
            }
            field1482[var2] = new class56(field1476);
            field1482[var2].method464(arg1, 799);
            field1483[var2] = field1482[var2].method465(47368);
        }
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(ZII)LFTMSICIZ;")
    public static final class13 method463(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1482[arg1] == null) {
            return null;
        } else {
            class56 var4 = field1482[arg1];
            return var4.method466(arg2, -16409);
        }
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(LFTMSICIZ;I)V")
    private final void method464(class13 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1480 = !this.field1480;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method213();
            if (var4 != 0) {
                arg0.field643--;
                this.field1486[var3] = new class69();
                this.field1486[var3].method575(arg0, 799);
            }
        }
        this.field1487 = arg0.method215();
        this.field1488 = arg0.method215();
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(I)I")
    private final int method465(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1486[var3] != null && this.field1486[var3].field1698 / 20 < var2) {
                var2 = this.field1486[var3].field1698 / 20;
            }
        }
        if (this.field1487 < this.field1488 && this.field1487 / 20 < var2) {
            var2 = this.field1487 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1486[var4] != null) {
                this.field1486[var4].field1698 -= var2 * 20;
            }
        }
        if (this.field1478 != arg0) {
            this.field1474 = !this.field1474;
        }
        if (this.field1487 < this.field1488) {
            this.field1487 -= var2 * 20;
            this.field1488 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(II)LFTMSICIZ;")
    private final class13 method466(int arg0, int arg1) {
        int var3 = this.method467(arg0);
        field1485.field643 = 0;
        field1485.method207(1380533830);
        field1485.method208(true, var3 + 36);
        if (arg1 != -16409) {
            throw new NullPointerException();
        }
        field1485.method207(1463899717);
        field1485.method207(1718449184);
        field1485.method208(true, 16);
        field1485.method205(this.field1473, 1);
        field1485.method205(this.field1473, 1);
        field1485.method208(true, 22050);
        field1485.method208(true, 22050);
        field1485.method205(this.field1473, 1);
        field1485.method205(this.field1473, 8);
        field1485.method207(1684108385);
        field1485.method208(true, var3);
        field1485.field643 += var3;
        return field1485;
    }

    @OriginalMember(owner = "client!TBRIOEDI", name = "b", descriptor = "(I)I")
    private final int method467(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1486[var3] != null && this.field1486[var3].field1698 + this.field1486[var3].field1697 > var2) {
                var2 = this.field1486[var3].field1698 + this.field1486[var3].field1697;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1487 * 22050 / 1000;
        int var6 = this.field1488 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1484[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1486[var9] != null) {
                int var15 = this.field1486[var9].field1697 * 22050 / 1000;
                int var16 = this.field1486[var9].field1698 * 22050 / 1000;
                int[] var17 = this.field1486[var9].method573(var15, this.field1486[var9].field1697);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1484[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1484[var16 + var18 + 44] = (byte) var19;
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
                field1484[var10 + var11] = field1484[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1484[var13 + var14] = field1484[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
