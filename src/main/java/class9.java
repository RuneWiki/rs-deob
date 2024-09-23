import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EJHGNUGE")
public class class9 {

    @OriginalMember(owner = "EJHGNUGE", name = "a", descriptor = "I")
    private int field680 = -439;

    @OriginalMember(owner = "EJHGNUGE", name = "h", descriptor = "I")
    public int field687 = -1;

    @OriginalMember(owner = "EJHGNUGE", name = "j", descriptor = "Z")
    public boolean field689 = false;

    @OriginalMember(owner = "EJHGNUGE", name = "k", descriptor = "I")
    public int field690 = 5;

    @OriginalMember(owner = "EJHGNUGE", name = "l", descriptor = "I")
    public int field691 = -1;

    @OriginalMember(owner = "EJHGNUGE", name = "m", descriptor = "I")
    public int field692 = -1;

    @OriginalMember(owner = "EJHGNUGE", name = "n", descriptor = "I")
    public int field693 = 99;

    @OriginalMember(owner = "EJHGNUGE", name = "o", descriptor = "I")
    public int field694 = -1;

    @OriginalMember(owner = "EJHGNUGE", name = "p", descriptor = "I")
    public int field695 = -1;

    @OriginalMember(owner = "EJHGNUGE", name = "q", descriptor = "I")
    public int field696 = 2;

    @OriginalMember(owner = "EJHGNUGE", name = "b", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "EJHGNUGE", name = "d", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "EJHGNUGE", name = "r", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "EJHGNUGE", name = "s", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "EJHGNUGE", name = "e", descriptor = "[I")
    public int[] field684;

    @OriginalMember(owner = "EJHGNUGE", name = "f", descriptor = "[I")
    public int[] field685;

    @OriginalMember(owner = "EJHGNUGE", name = "g", descriptor = "[I")
    private int[] field686;

    @OriginalMember(owner = "EJHGNUGE", name = "i", descriptor = "[I")
    public int[] field688;

    @OriginalMember(owner = "EJHGNUGE", name = "c", descriptor = "[LEJHGNUGE;")
    public static class9[] field682;

    @OriginalMember(owner = "EJHGNUGE", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method240(int arg0, class55 arg1) {
        class30 var2 = new class30(arg1.method551("seq.dat", null), -982);
        if (arg0 >= 0) {
            return;
        }
        field681 = var2.method351();
        if (field682 == null) {
            field682 = new class9[field681];
        }
        for (int var3 = 0; var3 < field681; var3++) {
            if (field682[var3] == null) {
                field682[var3] = new class9();
            }
            field682[var3].method242(var2, 1);
        }
    }

    @OriginalMember(owner = "EJHGNUGE", name = "a", descriptor = "(ZI)I")
    public int method241(boolean arg0, int arg1) {
        int var3 = this.field686[arg1];
        if (!arg0) {
            return this.field680;
        }
        if (var3 == 0) {
            class48 var4 = class48.method503(this.field684[arg1], 8);
            if (var4 != null) {
                var3 = this.field686[arg1] = var4.field1304;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "EJHGNUGE", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public void method242(class30 arg0, int arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method349();
                if (var3 == 0) {
                    if (this.field683 == 0) {
                        this.field683 = 1;
                        this.field684 = new int[1];
                        this.field684[0] = -1;
                        this.field685 = new int[1];
                        this.field685[0] = -1;
                        this.field686 = new int[1];
                        this.field686[0] = -1;
                    }
                    if (this.field694 == -1) {
                        if (this.field688 == null) {
                            this.field694 = 0;
                        } else {
                            this.field694 = 2;
                        }
                    }
                    if (this.field695 == -1) {
                        if (this.field688 != null) {
                            this.field695 = 2;
                            return;
                        }
                        this.field695 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field683 = arg0.method349();
                    this.field684 = new int[this.field683];
                    this.field685 = new int[this.field683];
                    this.field686 = new int[this.field683];
                    for (int var4 = 0; var4 < this.field683; var4++) {
                        this.field684[var4] = arg0.method351();
                        this.field685[var4] = arg0.method351();
                        if (this.field685[var4] == 65535) {
                            this.field685[var4] = -1;
                        }
                        this.field686[var4] = arg0.method351();
                    }
                } else if (var3 == 2) {
                    this.field687 = arg0.method351();
                } else if (var3 == 3) {
                    int var5 = arg0.method349();
                    this.field688 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field688[var6] = arg0.method349();
                    }
                    this.field688[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field689 = true;
                } else if (var3 == 5) {
                    this.field690 = arg0.method349();
                } else if (var3 == 6) {
                    this.field691 = arg0.method351();
                } else if (var3 == 7) {
                    this.field692 = arg0.method351();
                } else if (var3 == 8) {
                    this.field693 = arg0.method349();
                } else if (var3 == 9) {
                    this.field694 = arg0.method349();
                } else if (var3 == 10) {
                    this.field695 = arg0.method349();
                } else if (var3 == 11) {
                    this.field696 = arg0.method349();
                } else if (var3 == 12) {
                    this.field697 = arg0.method354();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
