import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HARRRJHW")
public class class26 {

    @OriginalMember(owner = "HARRRJHW", name = "a", descriptor = "I")
    private int field946 = 411;

    @OriginalMember(owner = "HARRRJHW", name = "i", descriptor = "I")
    public int field954 = -1;

    @OriginalMember(owner = "HARRRJHW", name = "k", descriptor = "Z")
    public boolean field956 = false;

    @OriginalMember(owner = "HARRRJHW", name = "l", descriptor = "I")
    public int field957 = 5;

    @OriginalMember(owner = "HARRRJHW", name = "m", descriptor = "I")
    public int field958 = -1;

    @OriginalMember(owner = "HARRRJHW", name = "n", descriptor = "I")
    public int field959 = -1;

    @OriginalMember(owner = "HARRRJHW", name = "o", descriptor = "I")
    public int field960 = 99;

    @OriginalMember(owner = "HARRRJHW", name = "p", descriptor = "I")
    public int field961 = -1;

    @OriginalMember(owner = "HARRRJHW", name = "q", descriptor = "I")
    public int field962 = -1;

    @OriginalMember(owner = "HARRRJHW", name = "r", descriptor = "I")
    public int field963 = 2;

    @OriginalMember(owner = "HARRRJHW", name = "b", descriptor = "I")
    private static int field947 = 623;

    @OriginalMember(owner = "HARRRJHW", name = "c", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "HARRRJHW", name = "e", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "HARRRJHW", name = "s", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "HARRRJHW", name = "t", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "HARRRJHW", name = "f", descriptor = "[I")
    public int[] field951;

    @OriginalMember(owner = "HARRRJHW", name = "g", descriptor = "[I")
    public int[] field952;

    @OriginalMember(owner = "HARRRJHW", name = "h", descriptor = "[I")
    private int[] field953;

    @OriginalMember(owner = "HARRRJHW", name = "j", descriptor = "[I")
    public int[] field955;

    @OriginalMember(owner = "HARRRJHW", name = "d", descriptor = "[LHARRRJHW;")
    public static class26[] field949;

    @OriginalMember(owner = "HARRRJHW", name = "a", descriptor = "(LDYBMLHQM;Z)V")
    public static void method274(class16 arg0, boolean arg1) {
        class29 var2 = new class29((byte) -28, arg0.method248("seq.dat", null));
        field948 = var2.method310();
        if (arg1) {
            field947 = -126;
        }
        if (field949 == null) {
            field949 = new class26[field948];
        }
        for (int var3 = 0; var3 < field948; var3++) {
            if (field949[var3] == null) {
                field949[var3] = new class26();
            }
            field949[var3].method276(6, var2);
        }
    }

    @OriginalMember(owner = "HARRRJHW", name = "a", descriptor = "(II)I")
    public int method275(int arg0, int arg1) {
        int var3 = this.field953[arg1];
        if (arg0 <= 0) {
            return 2;
        }
        if (var3 == 0) {
            class5 var4 = class5.method15(this.field946, this.field951[arg1]);
            if (var4 != null) {
                var3 = this.field953[arg1] = var4.field42;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "HARRRJHW", name = "a", descriptor = "(ILINLHDAGO;)V")
    public void method276(int arg0, class29 arg1) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method308();
                if (var4 == 0) {
                    if (this.field950 == 0) {
                        this.field950 = 1;
                        this.field951 = new int[1];
                        this.field951[0] = -1;
                        this.field952 = new int[1];
                        this.field952[0] = -1;
                        this.field953 = new int[1];
                        this.field953[0] = -1;
                    }
                    if (this.field961 == -1) {
                        if (this.field955 == null) {
                            this.field961 = 0;
                        } else {
                            this.field961 = 2;
                        }
                    }
                    if (this.field962 == -1) {
                        if (this.field955 != null) {
                            this.field962 = 2;
                            return;
                        }
                        this.field962 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field950 = arg1.method308();
                    this.field951 = new int[this.field950];
                    this.field952 = new int[this.field950];
                    this.field953 = new int[this.field950];
                    for (int var5 = 0; var5 < this.field950; var5++) {
                        this.field951[var5] = arg1.method310();
                        this.field952[var5] = arg1.method310();
                        if (this.field952[var5] == 65535) {
                            this.field952[var5] = -1;
                        }
                        this.field953[var5] = arg1.method310();
                    }
                } else if (var4 == 2) {
                    this.field954 = arg1.method310();
                } else if (var4 == 3) {
                    int var6 = arg1.method308();
                    this.field955 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field955[var7] = arg1.method308();
                    }
                    this.field955[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field956 = true;
                } else if (var4 == 5) {
                    this.field957 = arg1.method308();
                } else if (var4 == 6) {
                    this.field958 = arg1.method310();
                } else if (var4 == 7) {
                    this.field959 = arg1.method310();
                } else if (var4 == 8) {
                    this.field960 = arg1.method308();
                } else if (var4 == 9) {
                    this.field961 = arg1.method308();
                } else if (var4 == 10) {
                    this.field962 = arg1.method308();
                } else if (var4 == 11) {
                    this.field963 = arg1.method308();
                } else if (var4 == 12) {
                    this.field964 = arg1.method313();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
