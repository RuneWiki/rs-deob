import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KTJKDKKM")
public class class25 {

    @OriginalMember(owner = "KTJKDKKM", name = "a", descriptor = "Z")
    private boolean field964 = false;

    @OriginalMember(owner = "KTJKDKKM", name = "i", descriptor = "Z")
    public boolean field972 = false;

    @OriginalMember(owner = "KTJKDKKM", name = "j", descriptor = "Z")
    public boolean field973 = true;

    @OriginalMember(owner = "KTJKDKKM", name = "l", descriptor = "Z")
    public boolean field975 = false;

    @OriginalMember(owner = "KTJKDKKM", name = "o", descriptor = "Z")
    public boolean field978 = false;

    @OriginalMember(owner = "KTJKDKKM", name = "p", descriptor = "I")
    public int field979 = -1;

    @OriginalMember(owner = "KTJKDKKM", name = "q", descriptor = "Z")
    public boolean field980 = true;

    @OriginalMember(owner = "KTJKDKKM", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "KTJKDKKM", name = "d", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "KTJKDKKM", name = "g", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "KTJKDKKM", name = "h", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "KTJKDKKM", name = "k", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "KTJKDKKM", name = "m", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "KTJKDKKM", name = "n", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "KTJKDKKM", name = "f", descriptor = "Ljava/lang/String;")
    public String field969;

    @OriginalMember(owner = "KTJKDKKM", name = "e", descriptor = "[I")
    public static int[] field968;

    @OriginalMember(owner = "KTJKDKKM", name = "c", descriptor = "[LKTJKDKKM;")
    public static class25[] field966;

    @OriginalMember(owner = "KTJKDKKM", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method267(class18 arg0, byte arg1) {
        class30 var2 = new class30(true, arg0.method249("varp.dat", null));
        field967 = 0;
        field965 = var2.method298();
        if (arg1 != 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field966 == null) {
            field966 = new class25[field965];
        }
        if (field968 == null) {
            field968 = new int[field965];
        }
        for (int var4 = 0; var4 < field965; var4++) {
            if (field966[var4] == null) {
                field966[var4] = new class25();
            }
            field966[var4].method268(10762, var4, var2);
        }
        if (var2.field1091.length != var2.field1092) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "KTJKDKKM", name = "a", descriptor = "(IILMLYYHULT;)V")
    public void method268(int arg0, int arg1, class30 arg2) {
        if (arg0 != 10762) {
            this.field964 = !this.field964;
        }
        while (true) {
            int var4 = arg2.method296();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field970 = arg2.method296();
            } else if (var4 == 2) {
                this.field971 = arg2.method296();
            } else if (var4 == 3) {
                this.field972 = true;
                field968[field967++] = arg1;
            } else if (var4 == 4) {
                this.field973 = false;
            } else if (var4 == 5) {
                this.field974 = arg2.method298();
            } else if (var4 == 6) {
                this.field975 = true;
            } else if (var4 == 7) {
                this.field976 = arg2.method301();
            } else if (var4 == 8) {
                this.field977 = 1;
                this.field978 = true;
            } else if (var4 == 10) {
                this.field969 = arg2.method303();
            } else if (var4 == 11) {
                this.field978 = true;
            } else if (var4 == 12) {
                this.field979 = arg2.method301();
            } else if (var4 == 13) {
                this.field977 = 2;
                this.field978 = true;
            } else if (var4 == 14) {
                this.field980 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
