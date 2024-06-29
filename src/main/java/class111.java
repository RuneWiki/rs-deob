import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class111 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public int field1533 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field1536 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field1531 = 2048;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field1537 = 2048;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field1534 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "[I")
    public static int[] field1539 = new int[99];

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Ldf;")
    public static class85 field1540;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lfc;IZI)V")
    public static final void method791(class199 arg0, int arg1, boolean arg2, int arg3) {
        class271.field4017[arg3][arg1] = arg0;
        if (arg2) {
            field1540 = null;
        }
        field1532++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)V")
    public static final void method792(int arg0, int arg1, boolean arg2) {
        field1542++;
        class243 var3 = class46.method378(arg1, arg2, false);
        if (var3 != null) {
            for (int var4 = arg0; var4 < var3.field3599.length; var4++) {
                var3.field3599[var4] = -1;
                var3.field3607[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method793(boolean arg0) {
        field1534 = null;
        if (arg0) {
            method791((class199) null, -47, false, -3);
        }
        field1540 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lat;II)V")
    public final void method794(class256 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1738((byte) 103);
            if (var4 == 0) {
                field1538++;
                if (arg2 != -21971) {
                    this.field1536 = 5;
                    return;
                }
                return;
            }
            this.method795(arg0, -9943, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lat;III)V")
    private final void method795(class256 arg0, int arg1, int arg2, int arg3) {
        field1535++;
        if (arg1 != -9943) {
            return;
        }
        if (arg3 == 1) {
            this.field1536 = arg0.method1738((byte) -82);
        } else if (arg3 == 2) {
            this.field1531 = arg0.method1767(arg1 ^ 0x8CEF27A1);
        } else if (arg3 == 3) {
            this.field1537 = arg0.method1767(1930493576);
        } else if (arg3 == 4) {
            this.field1533 = arg0.method1747((byte) 12);
            return;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1539[var1] = var0 / 4;
        }
    }
}
