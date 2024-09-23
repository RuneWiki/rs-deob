import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BZONLWPM")
public class class5 {

    @OriginalMember(owner = "BZONLWPM", name = "a", descriptor = "Z")
    private boolean field65 = true;

    @OriginalMember(owner = "BZONLWPM", name = "h", descriptor = "I")
    public int field72 = -1;

    @OriginalMember(owner = "BZONLWPM", name = "j", descriptor = "Z")
    public boolean field74 = false;

    @OriginalMember(owner = "BZONLWPM", name = "k", descriptor = "I")
    public int field75 = 5;

    @OriginalMember(owner = "BZONLWPM", name = "l", descriptor = "I")
    public int field76 = -1;

    @OriginalMember(owner = "BZONLWPM", name = "m", descriptor = "I")
    public int field77 = -1;

    @OriginalMember(owner = "BZONLWPM", name = "n", descriptor = "I")
    public int field78 = 99;

    @OriginalMember(owner = "BZONLWPM", name = "o", descriptor = "I")
    public int field79 = -1;

    @OriginalMember(owner = "BZONLWPM", name = "p", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "BZONLWPM", name = "q", descriptor = "I")
    public int field81 = 2;

    @OriginalMember(owner = "BZONLWPM", name = "b", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "BZONLWPM", name = "d", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "BZONLWPM", name = "r", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "BZONLWPM", name = "s", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "BZONLWPM", name = "e", descriptor = "[I")
    public int[] field69;

    @OriginalMember(owner = "BZONLWPM", name = "f", descriptor = "[I")
    public int[] field70;

    @OriginalMember(owner = "BZONLWPM", name = "g", descriptor = "[I")
    private int[] field71;

    @OriginalMember(owner = "BZONLWPM", name = "i", descriptor = "[I")
    public int[] field73;

    @OriginalMember(owner = "BZONLWPM", name = "c", descriptor = "[LBZONLWPM;")
    public static class5[] field67;

    @OriginalMember(owner = "BZONLWPM", name = "a", descriptor = "(ILTKEGJSFV;)V")
    public static void method26(int arg0, class58 arg1) {
        class15 var2 = new class15(arg1.method542("seq.dat", null), false);
        field66 = var2.method263();
        if (field67 == null) {
            field67 = new class5[field66];
        }
        for (int var3 = 0; var3 < field66; var3++) {
            if (field67[var3] == null) {
                field67[var3] = new class5();
            }
            field67[var3].method28(var2, true);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "BZONLWPM", name = "a", descriptor = "(IB)I")
    public int method27(int arg0, byte arg1) {
        int var3 = this.field71[arg0];
        if (arg1 != -127) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            class31 var5 = class31.method348(this.field69[arg0]);
            if (var5 != null) {
                var3 = this.field71[arg0] = var5.field916;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "BZONLWPM", name = "a", descriptor = "(LEGCCHUZS;Z)V")
    public void method28(class15 arg0, boolean arg1) {
        if (!arg1) {
            this.field65 = !this.field65;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method261();
                if (var3 == 0) {
                    if (this.field68 == 0) {
                        this.field68 = 1;
                        this.field69 = new int[1];
                        this.field69[0] = -1;
                        this.field70 = new int[1];
                        this.field70[0] = -1;
                        this.field71 = new int[1];
                        this.field71[0] = -1;
                    }
                    if (this.field79 == -1) {
                        if (this.field73 == null) {
                            this.field79 = 0;
                        } else {
                            this.field79 = 2;
                        }
                    }
                    if (this.field80 == -1) {
                        if (this.field73 != null) {
                            this.field80 = 2;
                            return;
                        }
                        this.field80 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field68 = arg0.method261();
                    this.field69 = new int[this.field68];
                    this.field70 = new int[this.field68];
                    this.field71 = new int[this.field68];
                    for (int var4 = 0; var4 < this.field68; var4++) {
                        this.field69[var4] = arg0.method263();
                        this.field70[var4] = arg0.method263();
                        if (this.field70[var4] == 65535) {
                            this.field70[var4] = -1;
                        }
                        this.field71[var4] = arg0.method263();
                    }
                } else if (var3 == 2) {
                    this.field72 = arg0.method263();
                } else if (var3 == 3) {
                    int var5 = arg0.method261();
                    this.field73 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field73[var6] = arg0.method261();
                    }
                    this.field73[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field74 = true;
                } else if (var3 == 5) {
                    this.field75 = arg0.method261();
                } else if (var3 == 6) {
                    this.field76 = arg0.method263();
                } else if (var3 == 7) {
                    this.field77 = arg0.method263();
                } else if (var3 == 8) {
                    this.field78 = arg0.method261();
                } else if (var3 == 9) {
                    this.field79 = arg0.method261();
                } else if (var3 == 10) {
                    this.field80 = arg0.method261();
                } else if (var3 == 11) {
                    this.field81 = arg0.method261();
                } else if (var3 == 12) {
                    this.field82 = arg0.method266();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
