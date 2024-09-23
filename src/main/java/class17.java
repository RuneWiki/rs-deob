import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EINNWKRR")
public class class17 {

    @OriginalMember(owner = "EINNWKRR", name = "h", descriptor = "Z")
    public boolean field660 = false;

    @OriginalMember(owner = "EINNWKRR", name = "i", descriptor = "Z")
    public boolean field661 = true;

    @OriginalMember(owner = "EINNWKRR", name = "k", descriptor = "Z")
    public boolean field663 = false;

    @OriginalMember(owner = "EINNWKRR", name = "n", descriptor = "Z")
    public boolean field666 = false;

    @OriginalMember(owner = "EINNWKRR", name = "o", descriptor = "I")
    public int field667 = -1;

    @OriginalMember(owner = "EINNWKRR", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "EINNWKRR", name = "c", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "EINNWKRR", name = "f", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "EINNWKRR", name = "g", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "EINNWKRR", name = "j", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "EINNWKRR", name = "l", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "EINNWKRR", name = "m", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "EINNWKRR", name = "e", descriptor = "Ljava/lang/String;")
    public String field657;

    @OriginalMember(owner = "EINNWKRR", name = "d", descriptor = "[I")
    public static int[] field656;

    @OriginalMember(owner = "EINNWKRR", name = "b", descriptor = "[LEINNWKRR;")
    public static class17[] field654;

    @OriginalMember(owner = "EINNWKRR", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method223(int arg0, class26 arg1) {
        class31 var2 = new class31(arg1.method289("varp.dat", null), 8);
        int var3 = 75 / arg0;
        field655 = 0;
        field653 = var2.method308();
        if (field654 == null) {
            field654 = new class17[field653];
        }
        if (field656 == null) {
            field656 = new int[field653];
        }
        for (int var4 = 0; var4 < field653; var4++) {
            if (field654[var4] == null) {
                field654[var4] = new class17();
            }
            field654[var4].method224(var4, 0, var2);
        }
        if (var2.field900.length != var2.field901) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "EINNWKRR", name = "a", descriptor = "(IILJHKSAGUC;)V")
    public void method224(int arg0, int arg1, class31 arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method306();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field658 = arg2.method306();
            } else if (var5 == 2) {
                this.field659 = arg2.method306();
            } else if (var5 == 3) {
                this.field660 = true;
                field656[field655++] = arg0;
            } else if (var5 == 4) {
                this.field661 = false;
            } else if (var5 == 5) {
                this.field662 = arg2.method308();
            } else if (var5 == 6) {
                this.field663 = true;
            } else if (var5 == 7) {
                this.field664 = arg2.method311();
            } else if (var5 == 8) {
                this.field665 = 1;
                this.field666 = true;
            } else if (var5 == 10) {
                this.field657 = arg2.method313();
            } else if (var5 == 11) {
                this.field666 = true;
            } else if (var5 == 12) {
                this.field667 = arg2.method311();
            } else if (var5 == 13) {
                this.field665 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
