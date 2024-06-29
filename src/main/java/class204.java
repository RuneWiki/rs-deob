import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class204 {

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    private int field3577 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public int field3555;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[Lof;")
    public class253[] field3568;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Ljd;")
    public static class85 field3553 = class221.method1499("gleiten:", (byte) -100);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Ljd;")
    public static class85 field3557 = class221.method1499("Benutzen", (byte) 98);

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Ljd;")
    public static class85 field3570 = class221.method1499("::fps ", (byte) -88);

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
    public static int[] field3560 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[J")
    public static long[] field3572 = new long[100];

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3559 = 99;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Ljd;")
    public static class85 field3561 = class221.method1499("<)4col> x", (byte) 111);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "J")
    private long field3571;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lof;")
    private class253 field3558;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Lof;")
    private class253 field3575;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Ljb;")
    public static class255 field3576;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Ltk;")
    public static class50 field3567;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Lof;")
    public final class253 method1392(byte arg0) {
        this.field3577 = 0;
        field3565++;
        if (arg0 != -120) {
            this.method1394((byte) 75);
        }
        return this.method1399(-128);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lof;JI)V")
    public final void method1393(class253 arg0, long arg1, int arg2) {
        field3566++;
        if (arg0.field4372 != null) {
            arg0.method1753(arg2 ^ 0x3B8);
        }
        class253 var5 = this.field3568[(int) ((long) (this.field3555 - 1) & arg1)];
        arg0.field4370 = var5;
        arg0.field4372 = var5.field4372;
        arg0.field4377 = arg1;
        if (arg2 != 817) {
            this.method1396(75);
        }
        arg0.field4372.field4370 = arg0;
        arg0.field4370.field4372 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public final void method1394(byte arg0) {
        field3574++;
        if (arg0 != 47) {
            field3559 = 18;
        }
        for (int var2 = 0; var2 < this.field3555; var2++) {
            class253 var3 = this.field3568[var2];
            while (true) {
                class253 var4 = var3.field4370;
                if (var3 == var4) {
                    break;
                }
                var4.method1753(arg0 + 90);
            }
        }
        this.field3575 = null;
        this.field3558 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lof;")
    public final class253 method1395(int arg0) {
        field3564++;
        if (this.field3558 == null) {
            return null;
        }
        class253 var2 = this.field3568[(int) (this.field3571 & (long) (this.field3555 - arg0))];
        while (this.field3558 != var2) {
            if (this.field3558.field4377 == this.field3571) {
                class253 var3 = this.field3558;
                this.field3558 = this.field3558.field4370;
                return var3;
            }
            this.field3558 = this.field3558.field4370;
        }
        this.field3558 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
    public final int method1396(int arg0) {
        if (arg0 != 0) {
            field3572 = null;
        }
        field3556++;
        return this.field3555;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3553 = null;
        field3576 = null;
        if (arg0 != -32580) {
            method1397(-24);
        }
        field3572 = null;
        field3567 = null;
        field3560 = null;
        field3570 = null;
        field3561 = null;
        field3557 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)Lof;")
    public final class253 method1398(int arg0, long arg1) {
        this.field3571 = arg1;
        field3554++;
        class253 var4 = this.field3568[(int) (arg1 & (long) (this.field3555 - 1))];
        this.field3558 = var4.field4370;
        if (arg0 != 1) {
            return null;
        }
        while (this.field3558 != var4) {
            if (this.field3558.field4377 == arg1) {
                class253 var5 = this.field3558;
                this.field3558 = this.field3558.field4370;
                return var5;
            }
            this.field3558 = this.field3558.field4370;
        }
        this.field3558 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Lof;")
    public final class253 method1399(int arg0) {
        if (arg0 >= -120) {
            return null;
        }
        field3573++;
        if (this.field3577 > 0 && this.field3568[this.field3577 - 1] != this.field3575) {
            class253 var2 = this.field3575;
            this.field3575 = var2.field4370;
            return var2;
        }
        while (this.field3555 > this.field3577) {
            class253 var3 = this.field3568[this.field3577++].field4370;
            if (this.field3568[this.field3577 - 1] != var3) {
                this.field3575 = var3.field4370;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class204(int arg0) {
        this.field3555 = arg0;
        this.field3568 = new class253[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class253 var3 = this.field3568[var2] = new class253();
            var3.field4370 = var3;
            var3.field4372 = var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I")
    public final int method1400(int arg0) {
        int var2 = 0;
        field3563++;
        if (arg0 != 1) {
            field3572 = null;
        }
        for (int var3 = 0; var3 < this.field3555; var3++) {
            class253 var4 = this.field3568[var3];
            class253 var5 = var4.field4370;
            while (var4 != var5) {
                var5 = var5.field4370;
                var2++;
            }
        }
        return var2;
    }
}
