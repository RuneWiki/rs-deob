import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WFTRMPWZ")
public class class55 {

    @OriginalMember(owner = "WFTRMPWZ", name = "c", descriptor = "I")
    private int field1486 = 10280;

    @OriginalMember(owner = "WFTRMPWZ", name = "i", descriptor = "[LEBTORROD;")
    private class15[] field1492 = new class15[10];

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "I")
    private static int field1484 = -302;

    @OriginalMember(owner = "WFTRMPWZ", name = "d", descriptor = "I")
    private static int field1487 = 777;

    @OriginalMember(owner = "WFTRMPWZ", name = "e", descriptor = "[LWFTRMPWZ;")
    private static class55[] field1488 = new class55[5000];

    @OriginalMember(owner = "WFTRMPWZ", name = "f", descriptor = "[I")
    public static int[] field1489 = new int[5000];

    @OriginalMember(owner = "WFTRMPWZ", name = "b", descriptor = "I")
    private static int field1485;

    @OriginalMember(owner = "WFTRMPWZ", name = "j", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "WFTRMPWZ", name = "k", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "WFTRMPWZ", name = "h", descriptor = "LZOMNSJJM;")
    private static class69 field1491;

    @OriginalMember(owner = "WFTRMPWZ", name = "g", descriptor = "[B")
    private static byte[] field1490;

    @OriginalMember(owner = "WFTRMPWZ", name = "<init>", descriptor = "(I)V")
    private class55(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(LZOMNSJJM;I)V")
    public static final void method448(class69 arg0, int arg1) {
        field1490 = new byte[441000];
        if (arg1 != 0) {
            field1487 = 0;
        }
        field1491 = new class69(field1490, field1484);
        class15.method208();
        while (true) {
            int var2 = arg0.method549();
            if (var2 == 65535) {
                return;
            }
            field1488[var2] = new class55(-890);
            field1488[var2].method450(arg0, (byte) 5);
            field1489[var2] = field1488[var2].method451((byte) -63);
        }
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(IBI)LZOMNSJJM;")
    public static final class69 method449(int arg0, byte arg1, int arg2) {
        if (arg1 != 15) {
            field1485 = 430;
        }
        if (field1488[arg2] == null) {
            return null;
        } else {
            class55 var3 = field1488[arg2];
            return var3.method452(10280, arg0);
        }
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(LZOMNSJJM;B)V")
    private final void method450(class69 arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method547();
            if (var5 != 0) {
                arg0.field1700--;
                this.field1492[var3] = new class15();
                this.field1492[var3].method211(arg0, (byte) 5);
            }
        }
        this.field1493 = arg0.method549();
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        this.field1494 = arg0.method549();
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(B)I")
    private final int method451(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1492[var3] != null && this.field1492[var3].field821 / 20 < var2) {
                var2 = this.field1492[var3].field821 / 20;
            }
        }
        if (this.field1493 < this.field1494 && this.field1493 / 20 < var2) {
            var2 = this.field1493 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field1492[var4] != null) {
                this.field1492[var4].field821 -= var2 * 20;
            }
        }
        if (arg0 != -63) {
            return 4;
        }
        if (this.field1493 < this.field1494) {
            this.field1493 -= var2 * 20;
            this.field1494 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(II)LZOMNSJJM;")
    private final class69 method452(int arg0, int arg1) {
        if (this.field1486 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.method453(arg1);
        field1491.field1700 = 0;
        field1491.method541(1380533830);
        field1491.method542(var4 + 36, 0);
        field1491.method541(1463899717);
        field1491.method541(1718449184);
        field1491.method542(16, 0);
        field1491.method539((byte) 118, 1);
        field1491.method539((byte) 118, 1);
        field1491.method542(22050, 0);
        field1491.method542(22050, 0);
        field1491.method539((byte) 118, 1);
        field1491.method539((byte) 118, 8);
        field1491.method541(1684108385);
        field1491.method542(var4, 0);
        field1491.field1700 += var4;
        return field1491;
    }

    @OriginalMember(owner = "WFTRMPWZ", name = "a", descriptor = "(I)I")
    private final int method453(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1492[var3] != null && this.field1492[var3].field821 + this.field1492[var3].field820 > var2) {
                var2 = this.field1492[var3].field821 + this.field1492[var3].field820;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field1493 * 22050 / 1000;
        int var6 = this.field1494 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field1490[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field1492[var9] != null) {
                int var15 = this.field1492[var9].field820 * 22050 / 1000;
                int var16 = this.field1492[var9].field821 * 22050 / 1000;
                int[] var17 = this.field1492[var9].method209(var15, this.field1492[var9].field820);
                for (int var18 = 0; var18 < var15; var18++) {
                    field1490[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field1490[var10 + var11] = field1490[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field1490[var13 + var14] = field1490[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
