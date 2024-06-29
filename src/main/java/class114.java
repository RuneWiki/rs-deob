import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class114 {

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field1458 = 0;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    private int field1465 = -1;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lwo;")
    private class445 field1454 = new class445();

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
    public boolean field1468 = false;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[[[I")
    private int[][][] field1452;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[Lhl;")
    private class320[] field1467;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public static int[] field1450 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lwo;")
    public static class445 field1466 = new class445();

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lpm;")
    public static class131 field1455;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
    public final int[][] method669(int arg0, byte arg1) {
        field1457++;
        if (arg1 != 2) {
            method672((char) 65436, false);
        }
        if (this.field1460 == this.field1451) {
            this.field1468 = this.field1467[arg0] == null;
            this.field1467[arg0] = class187.field2603;
            return this.field1452[arg0];
        } else if (this.field1451 == 1) {
            this.field1468 = this.field1465 != arg0;
            this.field1465 = arg0;
            return this.field1452[0];
        } else {
            class320 var3 = this.field1467[arg0];
            if (var3 == null) {
                this.field1468 = true;
                if (this.field1458 >= this.field1451) {
                    class320 var4 = (class320) this.field1454.method2500((byte) -41);
                    var3 = new class320(arg0, var4.field4275);
                    this.field1467[var4.field4272] = null;
                    var4.method242(true);
                } else {
                    var3 = new class320(arg0, this.field1458);
                    this.field1458++;
                }
                this.field1467[arg0] = var3;
            } else {
                this.field1468 = false;
            }
            this.field1454.method2501(10020, var3);
            return this.field1452[var3.field4275];
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method670(boolean arg0) {
        field1462++;
        if (this.field1460 != this.field1451) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1451; var2++) {
            this.field1467[var2] = class187.field2603;
        }
        if (arg0) {
            field1464 = 122;
        }
        return this.field1452;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method671(int arg0) {
        field1453++;
        for (int var2 = 0; var2 < this.field1451; var2++) {
            this.field1452[var2][0] = null;
            this.field1452[var2][1] = null;
            this.field1452[var2][2] = null;
            this.field1452[var2] = null;
        }
        this.field1452 = null;
        if (arg0 <= 42) {
            this.method671(-86);
        }
        this.field1467 = null;
        this.field1454.method2512(-11558);
        this.field1454 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(CZ)Z")
    public static final boolean method672(char arg0, boolean arg1) {
        if (!arg1) {
            field1459 = -101;
        }
        field1461++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public static final void method673(int arg0, int arg1) {
        field1456++;
        class380 var2 = class162.field2320;
        synchronized (class162.field2320) {
            class162.field2320.method2179(false, arg1);
        }
        class380 var3 = class83.field970;
        synchronized (class83.field970) {
            class83.field970.method2179(false, arg1);
        }
        int var4 = -84 / ((-arg0 - 51) / 32);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method674(int arg0) {
        if (arg0 != 0) {
            field1455 = null;
        }
        field1450 = null;
        field1455 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(III)V")
    public class114(int arg0, int arg1, int arg2) {
        this.field1460 = arg1;
        this.field1451 = arg0;
        this.field1452 = new int[this.field1451][3][arg2];
        this.field1467 = new class320[this.field1460];
    }
}
