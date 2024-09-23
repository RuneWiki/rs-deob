import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DWUJPTWU")
public class class14 {

    @OriginalMember(owner = "DWUJPTWU", name = "h", descriptor = "I")
    public int field661 = -1;

    @OriginalMember(owner = "DWUJPTWU", name = "j", descriptor = "Z")
    public boolean field663 = false;

    @OriginalMember(owner = "DWUJPTWU", name = "k", descriptor = "I")
    public int field664 = 5;

    @OriginalMember(owner = "DWUJPTWU", name = "l", descriptor = "I")
    public int field665 = -1;

    @OriginalMember(owner = "DWUJPTWU", name = "m", descriptor = "I")
    public int field666 = -1;

    @OriginalMember(owner = "DWUJPTWU", name = "n", descriptor = "I")
    public int field667 = 99;

    @OriginalMember(owner = "DWUJPTWU", name = "o", descriptor = "I")
    public int field668 = -1;

    @OriginalMember(owner = "DWUJPTWU", name = "p", descriptor = "I")
    public int field669 = -1;

    @OriginalMember(owner = "DWUJPTWU", name = "q", descriptor = "I")
    public int field670 = 2;

    @OriginalMember(owner = "DWUJPTWU", name = "a", descriptor = "Z")
    private static boolean field654 = true;

    @OriginalMember(owner = "DWUJPTWU", name = "b", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "DWUJPTWU", name = "d", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "DWUJPTWU", name = "r", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "DWUJPTWU", name = "s", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "DWUJPTWU", name = "e", descriptor = "[I")
    public int[] field658;

    @OriginalMember(owner = "DWUJPTWU", name = "f", descriptor = "[I")
    public int[] field659;

    @OriginalMember(owner = "DWUJPTWU", name = "g", descriptor = "[I")
    private int[] field660;

    @OriginalMember(owner = "DWUJPTWU", name = "i", descriptor = "[I")
    public int[] field662;

    @OriginalMember(owner = "DWUJPTWU", name = "c", descriptor = "[LDWUJPTWU;")
    public static class14[] field656;

    @OriginalMember(owner = "DWUJPTWU", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method214(int arg0, class60 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class43 var3 = new class43(arg1.method506("seq.dat", null), 0);
        field655 = var3.method332();
        if (field656 == null) {
            field656 = new class14[field655];
        }
        for (int var4 = 0; var4 < field655; var4++) {
            if (field656[var4] == null) {
                field656[var4] = new class14();
            }
            field656[var4].method216(var3, field654);
        }
    }

    @OriginalMember(owner = "DWUJPTWU", name = "a", descriptor = "(II)I")
    public int method215(int arg0, int arg1) {
        int var3 = this.field660[arg0];
        if (arg1 != 0) {
            return 2;
        }
        if (var3 == 0) {
            class3 var4 = class3.method4(this.field658[arg0]);
            if (var4 != null) {
                var3 = this.field660[arg0] = var4.field18;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "DWUJPTWU", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public void method216(class43 arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method330();
                if (var4 == 0) {
                    if (this.field657 == 0) {
                        this.field657 = 1;
                        this.field658 = new int[1];
                        this.field658[0] = -1;
                        this.field659 = new int[1];
                        this.field659[0] = -1;
                        this.field660 = new int[1];
                        this.field660[0] = -1;
                    }
                    if (this.field668 == -1) {
                        if (this.field662 == null) {
                            this.field668 = 0;
                        } else {
                            this.field668 = 2;
                        }
                    }
                    if (this.field669 == -1) {
                        if (this.field662 != null) {
                            this.field669 = 2;
                            return;
                        }
                        this.field669 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field657 = arg0.method330();
                    this.field658 = new int[this.field657];
                    this.field659 = new int[this.field657];
                    this.field660 = new int[this.field657];
                    for (int var5 = 0; var5 < this.field657; var5++) {
                        this.field658[var5] = arg0.method332();
                        this.field659[var5] = arg0.method332();
                        if (this.field659[var5] == 65535) {
                            this.field659[var5] = -1;
                        }
                        this.field660[var5] = arg0.method332();
                    }
                } else if (var4 == 2) {
                    this.field661 = arg0.method332();
                } else if (var4 == 3) {
                    int var6 = arg0.method330();
                    this.field662 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field662[var7] = arg0.method330();
                    }
                    this.field662[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field663 = true;
                } else if (var4 == 5) {
                    this.field664 = arg0.method330();
                } else if (var4 == 6) {
                    this.field665 = arg0.method332();
                } else if (var4 == 7) {
                    this.field666 = arg0.method332();
                } else if (var4 == 8) {
                    this.field667 = arg0.method330();
                } else if (var4 == 9) {
                    this.field668 = arg0.method330();
                } else if (var4 == 10) {
                    this.field669 = arg0.method330();
                } else if (var4 == 11) {
                    this.field670 = arg0.method330();
                } else if (var4 == 12) {
                    this.field671 = arg0.method335();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
