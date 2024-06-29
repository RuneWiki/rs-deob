import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!URXFHLNO")
public class class58 {

    @OriginalMember(owner = "client!URXFHLNO", name = "g", descriptor = "[LPJPXFVTH;")
    private class40[] field1511 = new class40[10];

    @OriginalMember(owner = "client!URXFHLNO", name = "b", descriptor = "B")
    private static byte field1506 = 45;

    @OriginalMember(owner = "client!URXFHLNO", name = "c", descriptor = "[LURXFHLNO;")
    private static class58[] field1507 = new class58[5000];

    @OriginalMember(owner = "client!URXFHLNO", name = "d", descriptor = "[I")
    public static int[] field1508 = new int[5000];

    @OriginalMember(owner = "client!URXFHLNO", name = "h", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client!URXFHLNO", name = "i", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!URXFHLNO", name = "f", descriptor = "LWNCFPLWV;")
    private static class63 field1510;

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "Z")
    private static boolean field1505;

    @OriginalMember(owner = "client!URXFHLNO", name = "e", descriptor = "[B")
    private static byte[] field1509;

    @OriginalMember(owner = "client!URXFHLNO", name = "<init>", descriptor = "(B)V")
    private class58(byte arg0) {
        if (arg0 != 45) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(BLWNCFPLWV;)V")
    public static final void method468(byte arg0, class63 arg1) {
        field1509 = new byte[441000];
        if (arg0 != -114) {
            field1505 = !field1505;
        }
        field1510 = new class63((byte) -58, field1509);
        class40.method385();
        while (true) {
            int var2 = arg1.method504();
            if (var2 == 65535) {
                return;
            }
            field1507[var2] = new class58(field1506);
            field1507[var2].method470(-934, arg1);
            field1508[var2] = field1507[var2].method471(4);
        }
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(III)LWNCFPLWV;")
    public static final class63 method469(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (field1507[arg0] == null) {
            return null;
        } else {
            class58 var3 = field1507[arg0];
            return var3.method472(false, arg2);
        }
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(ILWNCFPLWV;)V")
    private final void method470(int arg0, class63 arg1) {
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method502();
            if (var4 != 0) {
                arg1.field1571--;
                this.field1511[var3] = new class40();
                this.field1511[var3].method388(-934, arg1);
            }
        }
        this.field1512 = arg1.method504();
        this.field1513 = arg1.method504();
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(I)I")
    private final int method471(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1511[var3] != null && this.field1511[var3].field1136 / 20 < var2) {
                var2 = this.field1511[var3].field1136 / 20;
            }
        }
        if (this.field1512 < this.field1513 && this.field1512 / 20 < var2) {
            var2 = this.field1512 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1511[var4] != null) {
                this.field1511[var4].field1136 -= var2 * 20;
            }
        }
        if (arg0 < 4 || arg0 > 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1512 < this.field1513) {
            this.field1512 -= var2 * 20;
            this.field1513 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(ZI)LWNCFPLWV;")
    private final class63 method472(boolean arg0, int arg1) {
        int var3 = this.method473(arg1);
        field1510.field1571 = 0;
        field1510.method496(1380533830);
        field1510.method497(824, var3 + 36);
        field1510.method496(1463899717);
        field1510.method496(1718449184);
        field1510.method497(824, 16);
        field1510.method494(2, 1);
        field1510.method494(2, 1);
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1510.method497(824, 22050);
        field1510.method497(824, 22050);
        field1510.method494(2, 1);
        field1510.method494(2, 8);
        field1510.method496(1684108385);
        field1510.method497(824, var3);
        field1510.field1571 += var3;
        return field1510;
    }

    @OriginalMember(owner = "client!URXFHLNO", name = "b", descriptor = "(I)I")
    private final int method473(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1511[var3] != null && this.field1511[var3].field1136 + this.field1511[var3].field1135 > var2) {
                var2 = this.field1511[var3].field1136 + this.field1511[var3].field1135;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1512 * 22050 / 1000;
        int var6 = this.field1513 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1509[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1511[var9] != null) {
                int var15 = this.field1511[var9].field1135 * 22050 / 1000;
                int var16 = this.field1511[var9].field1136 * 22050 / 1000;
                int[] var17 = this.field1511[var9].method386(var15, this.field1511[var9].field1135);
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = (var17[var18] >> 8) + (field1509[var16 + var18 + 44] & 0xFF);
                    if ((var19 & 0xFFFFFF00) != 0) {
                        var19 = ~(var19 >> 31);
                    }
                    field1509[var16 + var18 + 44] = (byte) var19;
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
                field1509[var10 + var11] = field1509[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1509[var13 + var14] = field1509[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
