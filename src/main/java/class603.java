import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public abstract class class603 implements class134 {

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lfs;")
    public class514 field8689;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Ljn;")
    public class668 field8685;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Ljn;")
    private class668 field8688;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Lwo;")
    public static class690 field8697 = new class690(80, -2);

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Lgga;")
    public static class265 field8698 = new class265();

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "Z")
    public static boolean field8699 = false;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field8700 = 0;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    private int field8695;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "J")
    private long field8686;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lla;")
    private class419 field8692;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
    public static final void method3474(int arg0, byte arg1) {
        field8694++;
        if (class578.field8437 == arg0) {
            return;
        }
        class473.field6604 = class205.field2465 = class689.field9826[arg0];
        class628.method3607(121);
        class40.field748 = new int[class473.field6604][class205.field2465];
        class310.field4099 = new int[class473.field6604][class205.field2465];
        class50.field831 = new int[4][class473.field6604 >> 3][class205.field2465 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class349.field4642[var2] = class517.method3063(class205.field2465, (byte) -53, class473.field6604);
        }
        class257.field3493 = new byte[4][class473.field6604][class205.field2465];
        class115.method824(4, (byte) 85, class473.field6604, class205.field2465);
        class555.method3249(class205.field2465 >> 3, class68.field1045, class473.field6604 >> 3, true);
        if (arg1 != 19) {
            field8699 = false;
        }
        class578.field8437 = arg0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public static void method3475(boolean arg0) {
        if (arg0) {
            field8697 = null;
        }
        field8697 = null;
        field8698 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)Lrfa;")
    public static final class182 method3476(int arg0, int arg1, int arg2) {
        class433 var3 = class281.field3808[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6218;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZII)V")
    public abstract void method755(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZZ)V")
    public abstract void method751(int arg0, int arg1, boolean arg2, boolean arg3);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public void method749(int arg0) {
        field8687++;
        if (arg0 != 27471) {
            method3476(65, -3, 45);
        }
        class50 var2 = class217.method1321(this.field8688, true, this.field8689.field7537);
        this.field8692 = class68.field1045.method258(var2, class495.method2878(this.field8685, this.field8689.field7537), true);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZ)V")
    public final void method893(byte arg0, boolean arg1) {
        field8691++;
        int var3 = this.field8689.field7533.method3298(false, class589.field8535, this.field8689.field7540) + this.field8689.field7530;
        int var4 = this.field8689.field7535.method1080(this.field8689.field7528, class6.field60, -91) + this.field8689.field7532;
        this.method751(var3, var4, arg1, true);
        if (arg0 != -61) {
            this.method753(34);
        }
        this.method755(1, arg1, var3, var4);
        String var5 = class91.field1282.method3288((byte) -123);
        if (class301.method1787((byte) -72) - this.field8686 > 10000L) {
            var5 = var5 + " (" + class91.field1282.method3289((byte) -81).method1434(10067) + ")";
        }
        this.field8692.method2525(var3 + (this.field8689.field7540 / 2), this.field8689.field7528 / 2 + 4 + var4 + this.field8689.field7529, var5, this.field8689.field7538, -1, 126);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
    public boolean method753(int arg0) {
        field8693++;
        boolean var2 = true;
        if (!this.field8685.method3802(this.field8689.field7537, (byte) -73)) {
            var2 = false;
        }
        if (!this.field8688.method3802(this.field8689.field7537, (byte) 120)) {
            var2 = false;
        }
        if (arg0 != -29791) {
            method3478(123, false, -66, -112);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I")
    public final int method3477(int arg0) {
        field8696++;
        int var2 = class91.field1282.method3281((byte) -72);
        int var3 = var2 * 100;
        if (this.field8695 == var2 && var2 != 0) {
            int var4 = class91.field1282.method3282(103);
            if (var2 < var4) {
                long var5 = this.field8686 - class91.field1282.method3284((byte) 102);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class301.method1787((byte) -38) - this.field8686) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + ((long) (var2 * 100)));
                    }
                }
            }
        } else {
            this.field8695 = var2;
            this.field8686 = class301.method1787((byte) 79);
        }
        if (arg0 != -11833) {
            this.field8688 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(IZII)V")
    public static final void method3478(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        field8690++;
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        class393.field5309 = var5;
        if (class586.field8507 == 2) {
            class89.field1250 = var6;
            class569.field8329 = var5;
            class377.field5071 = var4;
        }
        class115.field1495 = var6;
        class651.method3667(-23378);
        class447.field6335 = arg1;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljn;Ljn;Lfs;)V")
    public class603(class668 arg0, class668 arg1, class514 arg2) {
        this.field8689 = arg2;
        this.field8685 = arg0;
        this.field8688 = arg1;
    }
}
