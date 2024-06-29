import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    private int field105 = 0;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    private int field104 = -1;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lid;")
    public static class149 field88 = class60.method382("::breakcon", (byte) 31);

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lid;")
    public static class149 field95 = class60.method382("headicons_prayer", (byte) 84);

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lid;")
    private static class149 field94 = class60.method382("Sat", (byte) 4);

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lid;")
    private static class149 field90 = class60.method382("Thu", (byte) 88);

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lid;")
    private static class149 field108 = class60.method382("Fri", (byte) 88);

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[J")
    public static long[] field107 = new long[100];

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Z")
    public static boolean field111 = true;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lid;")
    private static class149 field93 = class60.method382("Wed", (byte) 126);

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lid;")
    private static class149 field110 = class60.method382("Tue", (byte) 120);

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lid;")
    private static class149 field101 = class60.method382("Sun", (byte) 28);

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Z")
    public static boolean field99 = true;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lid;")
    private static class149 field112 = class60.method382("Mon", (byte) 100);

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[Lid;")
    public static class149[] field98 = new class149[] { field101, field112, field110, field93, field90, field108, field94 };

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lid;")
    public static class149 field89 = class60.method382("Gegenstand f-Ur Mitglieder", (byte) 83);

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
    public static int[] field103;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V")
    private final void method40(int arg0, byte arg1) {
        field109++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF4D) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var3 > var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var9 < var7) {
            var9 = var7;
        }
        double var15 = 0.0D;
        if (var11 > var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field102 = (int) (var17 * 256.0D);
        int var19 = -66 / ((30 - arg1) / 49);
        if (this.field102 < 0) {
            this.field102 = 0;
        } else if (this.field102 > 255) {
            this.field102 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        this.field91 = (int) (var15 * 256.0D);
        double var20 = var13 / 6.0D;
        if (this.field91 < 0) {
            this.field91 = 0;
        } else if (this.field91 > 255) {
            this.field91 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field100 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field100 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field100 < 1) {
            this.field100 = 1;
        }
        this.field92 = (int) ((double) this.field100 * var20);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
    public static final void method41(int arg0, int arg1) {
        if (arg1 < 73) {
            return;
        }
        for (class64 var2 = class122.field2152.method633((byte) 25); var2 != null; var2 = class122.field2152.method630(11)) {
            if (((long) arg0) == (var2.field1148 >> 48 & 0xFFFFL)) {
                var2.method401((byte) -118);
            }
        }
        field96++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILgd;I)V")
    private final void method42(int arg0, int arg1, class74 arg2, int arg3) {
        if (arg1 == 1) {
            this.field105 = arg2.method525(65280);
            this.method40(this.field105, (byte) -72);
        } else if (arg1 == 2) {
            this.field104 = arg2.method485(-2386);
            if (this.field104 == 65535) {
                this.field104 = -1;
            }
        } else if (arg1 == 3) {
            arg2.method485(-2386);
        }
        field113++;
        if (arg3 < 109) {
            field89 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method43(byte arg0) {
        field112 = null;
        field88 = null;
        field93 = null;
        field94 = null;
        field107 = null;
        field89 = null;
        field90 = null;
        field98 = null;
        if (arg0 > -112) {
            method41(-10, 108);
        }
        field101 = null;
        field103 = null;
        field108 = null;
        field110 = null;
        field95 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLgd;I)V")
    public final void method44(byte arg0, class74 arg1, int arg2) {
        int var4 = 92 / ((arg0 - 63) / 46);
        while (true) {
            int var5 = arg1.method489((byte) -47);
            if (var5 == 0) {
                field97++;
                return;
            }
            this.method42(arg2, var5, arg1, 120);
        }
    }
}
