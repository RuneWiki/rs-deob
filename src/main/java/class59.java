import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VYSYBHPS")
public class class59 {

    @OriginalMember(owner = "VYSYBHPS", name = "b", descriptor = "Z")
    private boolean field1578 = false;

    @OriginalMember(owner = "VYSYBHPS", name = "c", descriptor = "B")
    private byte field1579 = 64;

    @OriginalMember(owner = "VYSYBHPS", name = "h", descriptor = "[LUFBSEXDM;")
    private class51[] field1584 = new class51[10];

    @OriginalMember(owner = "VYSYBHPS", name = "a", descriptor = "I")
    private static int field1577 = 8;

    @OriginalMember(owner = "VYSYBHPS", name = "d", descriptor = "[LVYSYBHPS;")
    private static class59[] field1580 = new class59[5000];

    @OriginalMember(owner = "VYSYBHPS", name = "e", descriptor = "[I")
    public static int[] field1581 = new int[5000];

    @OriginalMember(owner = "VYSYBHPS", name = "i", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "VYSYBHPS", name = "j", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "VYSYBHPS", name = "g", descriptor = "LGHHPHSRU;")
    private static class14 field1583;

    @OriginalMember(owner = "VYSYBHPS", name = "f", descriptor = "[B")
    private static byte[] field1582;

    @OriginalMember(owner = "VYSYBHPS", name = "<init>", descriptor = "(I)V")
    private class59(int arg0) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "VYSYBHPS", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public static final void method527(class14 arg0, int arg1) {
        field1582 = new byte[441000];
        if (arg1 < 1 || arg1 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        field1583 = new class14(-527, field1582);
        class51.method495();
        while (true) {
            int var3 = arg0.method204();
            if (var3 == 65535) {
                return;
            }
            field1580[var3] = new class59(4);
            field1580[var3].method529(arg0, 0);
            field1581[var3] = field1580[var3].method530(-7091);
        }
    }

    @OriginalMember(owner = "VYSYBHPS", name = "a", descriptor = "(III)LGHHPHSRU;")
    public static final class14 method528(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            field1577 = 309;
        }
        if (field1580[arg2] == null) {
            return null;
        } else {
            class59 var3 = field1580[arg2];
            return var3.method531(arg0, true);
        }
    }

    @OriginalMember(owner = "VYSYBHPS", name = "b", descriptor = "(LGHHPHSRU;I)V")
    private final void method529(class14 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method202();
            if (var4 != 0) {
                arg0.field769--;
                this.field1584[var3] = new class51();
                this.field1584[var3].method498(arg0, 0);
            }
        }
        this.field1585 = arg0.method204();
        this.field1586 = arg0.method204();
    }

    @OriginalMember(owner = "VYSYBHPS", name = "a", descriptor = "(I)I")
    private final int method530(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1584[var3] != null && this.field1584[var3].field1509 / 20 < var2) {
                var2 = this.field1584[var3].field1509 / 20;
            }
        }
        if (arg0 != -7091) {
            this.field1578 = !this.field1578;
        }
        if (this.field1585 < this.field1586 && this.field1585 / 20 < var2) {
            var2 = this.field1585 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1584[var4] != null) {
                this.field1584[var4].field1509 -= var2 * 20;
            }
        }
        if (this.field1585 < this.field1586) {
            this.field1585 -= var2 * 20;
            this.field1586 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "VYSYBHPS", name = "a", descriptor = "(IZ)LGHHPHSRU;")
    private final class14 method531(int arg0, boolean arg1) {
        int var3 = this.method532(arg0);
        if (!arg1) {
            this.field1578 = !this.field1578;
        }
        field1583.field769 = 0;
        field1583.method196(1380533830);
        field1583.method197((byte) 10, var3 + 36);
        field1583.method196(1463899717);
        field1583.method196(1718449184);
        field1583.method197((byte) 10, 16);
        field1583.method194(1, 4);
        field1583.method194(1, 4);
        field1583.method197((byte) 10, 22050);
        field1583.method197((byte) 10, 22050);
        field1583.method194(1, 4);
        field1583.method194(8, 4);
        field1583.method196(1684108385);
        field1583.method197((byte) 10, var3);
        field1583.field769 += var3;
        return field1583;
    }

    @OriginalMember(owner = "VYSYBHPS", name = "b", descriptor = "(I)I")
    private final int method532(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1584[var3] != null && this.field1584[var3].field1509 + this.field1584[var3].field1508 > var2) {
                var2 = this.field1584[var3].field1509 + this.field1584[var3].field1508;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1585 * 22050 / 1000;
        int var6 = this.field1586 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1582[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1584[var9] != null) {
                int var15 = this.field1584[var9].field1508 * 22050 / 1000;
                int var16 = this.field1584[var9].field1509 * 22050 / 1000;
                int[] var17 = this.field1584[var9].method496(var15, this.field1584[var9].field1508);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1582[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1582[var10 + var11] = field1582[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1582[var13 + var14] = field1582[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
