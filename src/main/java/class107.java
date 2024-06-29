import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class107 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lvc;")
    public static class137 field2483 = class45.method325("compass", -46);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lvc;")
    public static class137 field2485 = class45.method325("@or1@", -46);

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lvc;")
    public static class137 field2492 = class45.method325("sch-Utteln:", -46);

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lvc;")
    public static class137 field2489 = class45.method325("(U2", -46);

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lvc;")
    public static class137 field2496 = class45.method325("blinken3:", -46);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "J")
    public long field2490;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lqc;")
    public class107 field2499;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lqc;")
    public class107 field2500;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lvd;")
    public static class138 field2491;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Loa;")
    public static class93 field2482;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method775(byte arg0) {
        field2491 = null;
        field2492 = null;
        field2496 = null;
        field2483 = null;
        field2485 = null;
        if (arg0 <= -52) {
            field2482 = null;
            field2489 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method776(int arg0) {
        field2487++;
        if (this.field2499 == null) {
            return;
        }
        this.field2499.field2500 = this.field2500;
        if (arg0 == 0) {
            this.field2500.field2499 = this.field2499;
            this.field2500 = null;
            this.field2499 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Z")
    public static final boolean method777(byte arg0, int arg1) {
        field2495++;
        int var2 = -7 % ((34 - arg0) / 63);
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z")
    public final boolean method778(byte arg0) {
        field2488++;
        int var2 = -86 % ((41 - arg0) / 36);
        return this.field2499 != null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[BZI)V")
    public static final void method779(byte arg0, byte[] arg1, boolean arg2, int arg3) {
        field2494++;
        if (class143.field3362 == null) {
            return;
        }
        if (arg0 < 60) {
            method777((byte) -27, -6);
        }
        if (class142.field3352 >= 0) {
            class143.field3362.method158((byte) 116);
            class47.field1055 = 20;
            class142.field3352 = -1;
            class12.field259 = 0;
            class12.field273 = null;
        }
        if (arg1 == null) {
            return;
        }
        if (class47.field1055 > 0) {
            class143.field3362.method154(false, arg3);
            class47.field1055 = 0;
        }
        class142.field3352 = arg3;
        class143.field3362.method159(17, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public static final int method780(int arg0, int arg1, int arg2) {
        field2484++;
        if (arg2 != 12345678) {
            return 86;
        } else if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
