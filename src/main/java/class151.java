import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class151 {

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lhw;")
    public class87 field2492 = new class87();

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[[I")
    public static int[][] field2495;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "J")
    public static long field2491;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "F")
    public static float field2494;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lka;")
    public static class332 field2496;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lph;")
    public static class459 field2493;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Llt;")
    public static class480 field2485;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Lhw;")
    private class87 field2498;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field2493 = null;
        field2495 = null;
        field2496 = null;
        field2485 = null;
        if (arg0 != 64512) {
            method1108(-21, 57, -103, 2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
    public final int method1106(int arg0) {
        field2489++;
        int var2 = 0;
        class87 var3 = this.field2492.field1778;
        if (arg0 <= 74) {
            this.method1111(-48);
        }
        while (this.field2492 != var3) {
            var3 = var3.field1778;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Lhw;")
    public final class87 method1107(int arg0) {
        if (arg0 != -26598) {
            field2493 = null;
        }
        field2486++;
        class87 var2 = this.field2498;
        if (this.field2492 == var2) {
            this.field2498 = null;
            return null;
        } else {
            this.field2498 = var2.field1778;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)I")
    public static final int method1108(int arg0, int arg1, int arg2, int arg3) {
        field2484++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg1 & 0x7F) * var4 >> 7;
        if (arg2 != -18404) {
            field2496 = null;
        }
        int var6 = (arg1 & 0x380) * var4 + ((arg0 & 0x380) * arg3) >> 7;
        int var7 = (arg0 & 0xFC00) * arg3 + (arg1 & 0xFC00) * var4 >> 7;
        return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILhw;)V")
    public final void method1109(int arg0, class87 arg1) {
        if (arg1.field1780 != null) {
            arg1.method804((byte) 123);
        }
        if (arg0 != -16823) {
            field2496 = null;
        }
        field2488++;
        arg1.field1778 = this.field2492;
        arg1.field1780 = this.field2492.field1780;
        arg1.field1780.field1778 = arg1;
        arg1.field1778.field1780 = arg1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1110(byte[] arg0, int arg1) {
        field2499++;
        int var2 = arg0.length;
        if (arg1 <= 101) {
            method1110(null, 67);
        }
        byte[] var3 = new byte[var2];
        class394.method2448(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Lhw;")
    public final class87 method1111(int arg0) {
        field2497++;
        class87 var2 = this.field2492.field1778;
        if (this.field2492 == var2) {
            this.field2498 = null;
            return null;
        }
        this.field2498 = var2.field1778;
        if (arg0 != 0) {
            method1105(115);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method1112(byte arg0) {
        if (arg0 <= 42) {
            this.method1112((byte) -11);
        }
        while (true) {
            class87 var2 = this.field2492.field1778;
            if (this.field2492 == var2) {
                field2490++;
                this.field2498 = null;
                return;
            }
            var2.method804((byte) -78);
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class151() {
        this.field2492.field1778 = this.field2492;
        this.field2492.field1780 = this.field2492;
    }

    static {
        new class309("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field2495 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
        field2491 = -1L;
    }
}
