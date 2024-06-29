import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class100 {

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    private int field1567 = 0;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "[Ldh;")
    public class120[] field1563;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[I")
    public static int[] field1553 = new int[500];

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[J")
    public static long[] field1555 = new long[256];

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "[I")
    public static int[] field1556 = new int[50];

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Z")
    public static boolean field1558 = false;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[Li;")
    public static class56[] field1566;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "J")
    private long field1546;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Ldh;")
    private class120 field1560;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Ldh;")
    private class120 field1564;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILdh;J)V")
    public final void method662(int arg0, class120 arg1, long arg2) {
        field1548++;
        if (arg1.field1749 != null) {
            arg1.method784(false);
        }
        class120 var5 = this.field1563[(int) (arg2 & (long) (this.field1549 - 1))];
        arg1.field1750 = arg2;
        if (arg0 == 0) {
            arg1.field1749 = var5.field1749;
            arg1.field1752 = var5;
            arg1.field1749.field1752 = arg1;
            arg1.field1752.field1749 = arg1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILdh;Ldh;)V")
    public static final void method663(int arg0, class120 arg1, class120 arg2) {
        if (arg1.field1749 != null) {
            arg1.method784(false);
        }
        arg1.field1752 = arg2;
        field1559++;
        arg1.field1749 = arg2.field1749;
        arg1.field1749.field1752 = arg1;
        if (arg0 != 0) {
            method667((byte) 41);
        }
        arg1.field1752.field1749 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    public final int method664(int arg0) {
        field1557++;
        return arg0 == -1 ? this.field1549 : -57;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BJ)Ldh;")
    public final class120 method665(byte arg0, long arg1) {
        field1561++;
        this.field1546 = arg1;
        int var4 = 94 % ((29 - arg0) / 48);
        class120 var5 = this.field1563[(int) ((long) (this.field1549 - 1) & arg1)];
        for (this.field1560 = var5.field1752; this.field1560 != var5; this.field1560 = this.field1560.field1752) {
            if (this.field1560.field1750 == arg1) {
                class120 var6 = this.field1560;
                this.field1560 = this.field1560.field1752;
                return var6;
            }
        }
        this.field1560 = null;
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Ldh;")
    public final class120 method666(int arg0) {
        int var2 = 27 / ((arg0 + 58) / 61);
        field1554++;
        if (this.field1567 > 0 && this.field1563[this.field1567 - 1] != this.field1564) {
            class120 var3 = this.field1564;
            this.field1564 = var3.field1752;
            return var3;
        }
        while (this.field1567 < this.field1549) {
            class120 var4 = this.field1563[this.field1567++].field1752;
            if (this.field1563[this.field1567 - 1] != var4) {
                this.field1564 = var4.field1752;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        field1553 = null;
        field1555 = null;
        if (arg0 >= -121) {
            field1555 = null;
        }
        field1556 = null;
        field1566 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I")
    public final int method668(byte arg0) {
        field1562++;
        int var2 = 0;
        if (arg0 > -126) {
            return 14;
        }
        for (int var3 = 0; var3 < this.field1549; var3++) {
            class120 var4 = this.field1563[var3];
            for (class120 var5 = var4.field1752; var5 != var4; var5 = var5.field1752) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Ldh;")
    public final class120 method669(int arg0) {
        field1547++;
        if (this.field1560 == null) {
            return null;
        }
        class120 var2 = this.field1563[(int) (this.field1546 & (long) (this.field1549 - 1))];
        while (this.field1560 != var2) {
            if (this.field1560.field1750 == this.field1546) {
                class120 var3 = this.field1560;
                this.field1560 = this.field1560.field1752;
                return var3;
            }
            this.field1560 = this.field1560.field1752;
        }
        if (arg0 != -20677) {
            this.method666(-78);
        }
        this.field1560 = null;
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public final void method670(int arg0) {
        if (arg0 < 19) {
            this.method668((byte) -51);
        }
        field1550++;
        for (int var2 = 0; var2 < this.field1549; var2++) {
            class120 var3 = this.field1563[var2];
            while (true) {
                class120 var4 = var3.field1752;
                if (var3 == var4) {
                    break;
                }
                var4.method784(false);
            }
        }
        this.field1564 = null;
        this.field1560 = null;
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)Ldh;")
    public final class120 method671(int arg0) {
        this.field1567 = arg0;
        field1552++;
        return this.method666(-123);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        this.field1563 = new class120[arg0];
        this.field1549 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class120 var3 = this.field1563[var2] = new class120();
            var3.field1749 = var3;
            var3.field1752 = var3;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1555[var0] = var1;
        }
        field1565 = 0;
        field1566 = new class56[32768];
    }
}
