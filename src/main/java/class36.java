import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LCRVYGCP")
public class class36 {

    @OriginalMember(owner = "LCRVYGCP", name = "h", descriptor = "I")
    public int field958 = -1;

    @OriginalMember(owner = "LCRVYGCP", name = "j", descriptor = "Z")
    public boolean field960 = false;

    @OriginalMember(owner = "LCRVYGCP", name = "k", descriptor = "I")
    public int field961 = 5;

    @OriginalMember(owner = "LCRVYGCP", name = "l", descriptor = "I")
    public int field962 = -1;

    @OriginalMember(owner = "LCRVYGCP", name = "m", descriptor = "I")
    public int field963 = -1;

    @OriginalMember(owner = "LCRVYGCP", name = "n", descriptor = "I")
    public int field964 = 99;

    @OriginalMember(owner = "LCRVYGCP", name = "o", descriptor = "I")
    public int field965 = -1;

    @OriginalMember(owner = "LCRVYGCP", name = "p", descriptor = "I")
    public int field966 = -1;

    @OriginalMember(owner = "LCRVYGCP", name = "q", descriptor = "I")
    public int field967 = 2;

    @OriginalMember(owner = "LCRVYGCP", name = "a", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "LCRVYGCP", name = "b", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "LCRVYGCP", name = "d", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "LCRVYGCP", name = "r", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "LCRVYGCP", name = "s", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "LCRVYGCP", name = "e", descriptor = "[I")
    public int[] field955;

    @OriginalMember(owner = "LCRVYGCP", name = "f", descriptor = "[I")
    public int[] field956;

    @OriginalMember(owner = "LCRVYGCP", name = "g", descriptor = "[I")
    private int[] field957;

    @OriginalMember(owner = "LCRVYGCP", name = "i", descriptor = "[I")
    public int[] field959;

    @OriginalMember(owner = "LCRVYGCP", name = "c", descriptor = "[LLCRVYGCP;")
    public static class36[] field953;

    @OriginalMember(owner = "LCRVYGCP", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method360(int arg0, class26 arg1) {
        int var2 = 46 / arg0;
        class31 var3 = new class31(arg1.method289("seq.dat", null), 8);
        field952 = var3.method308();
        if (field953 == null) {
            field953 = new class36[field952];
        }
        for (int var4 = 0; var4 < field952; var4++) {
            if (field953[var4] == null) {
                field953[var4] = new class36();
            }
            field953[var4].method362(var3, 0);
        }
    }

    @OriginalMember(owner = "LCRVYGCP", name = "a", descriptor = "(II)I")
    public int method361(int arg0, int arg1) {
        int var3 = this.field957[arg1];
        if (arg0 < 6 || arg0 > 6) {
            return this.field951;
        }
        if (var3 == 0) {
            class18 var4 = class18.method228(false, this.field955[arg1]);
            if (var4 != null) {
                var3 = this.field957[arg1] = var4.field672;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "LCRVYGCP", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public void method362(class31 arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method306();
                if (var4 == 0) {
                    if (this.field954 == 0) {
                        this.field954 = 1;
                        this.field955 = new int[1];
                        this.field955[0] = -1;
                        this.field956 = new int[1];
                        this.field956[0] = -1;
                        this.field957 = new int[1];
                        this.field957[0] = -1;
                    }
                    if (this.field965 == -1) {
                        if (this.field959 == null) {
                            this.field965 = 0;
                        } else {
                            this.field965 = 2;
                        }
                    }
                    if (this.field966 == -1) {
                        if (this.field959 != null) {
                            this.field966 = 2;
                            return;
                        }
                        this.field966 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field954 = arg0.method306();
                    this.field955 = new int[this.field954];
                    this.field956 = new int[this.field954];
                    this.field957 = new int[this.field954];
                    for (int var5 = 0; var5 < this.field954; var5++) {
                        this.field955[var5] = arg0.method308();
                        this.field956[var5] = arg0.method308();
                        if (this.field956[var5] == 65535) {
                            this.field956[var5] = -1;
                        }
                        this.field957[var5] = arg0.method308();
                    }
                } else if (var4 == 2) {
                    this.field958 = arg0.method308();
                } else if (var4 == 3) {
                    int var6 = arg0.method306();
                    this.field959 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field959[var7] = arg0.method306();
                    }
                    this.field959[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field960 = true;
                } else if (var4 == 5) {
                    this.field961 = arg0.method306();
                } else if (var4 == 6) {
                    this.field962 = arg0.method308();
                } else if (var4 == 7) {
                    this.field963 = arg0.method308();
                } else if (var4 == 8) {
                    this.field964 = arg0.method306();
                } else if (var4 == 9) {
                    this.field965 = arg0.method306();
                } else if (var4 == 10) {
                    this.field966 = arg0.method306();
                } else if (var4 == 11) {
                    this.field967 = arg0.method306();
                } else if (var4 == 12) {
                    this.field968 = arg0.method311();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
