import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CGWBYVFN")
public class class9 {

    @OriginalMember(owner = "CGWBYVFN", name = "a", descriptor = "B")
    private byte field159 = 44;

    @OriginalMember(owner = "CGWBYVFN", name = "j", descriptor = "I")
    public int field168 = -1;

    @OriginalMember(owner = "CGWBYVFN", name = "l", descriptor = "Z")
    public boolean field170 = false;

    @OriginalMember(owner = "CGWBYVFN", name = "m", descriptor = "I")
    public int field171 = 5;

    @OriginalMember(owner = "CGWBYVFN", name = "n", descriptor = "I")
    public int field172 = -1;

    @OriginalMember(owner = "CGWBYVFN", name = "o", descriptor = "I")
    public int field173 = -1;

    @OriginalMember(owner = "CGWBYVFN", name = "p", descriptor = "I")
    public int field174 = 99;

    @OriginalMember(owner = "CGWBYVFN", name = "q", descriptor = "I")
    public int field175 = -1;

    @OriginalMember(owner = "CGWBYVFN", name = "r", descriptor = "I")
    public int field176 = -1;

    @OriginalMember(owner = "CGWBYVFN", name = "s", descriptor = "I")
    public int field177 = 2;

    @OriginalMember(owner = "CGWBYVFN", name = "d", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "CGWBYVFN", name = "f", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "CGWBYVFN", name = "t", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "CGWBYVFN", name = "u", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "CGWBYVFN", name = "b", descriptor = "Z")
    private static boolean field160;

    @OriginalMember(owner = "CGWBYVFN", name = "c", descriptor = "Z")
    private static boolean field161;

    @OriginalMember(owner = "CGWBYVFN", name = "g", descriptor = "[I")
    public int[] field165;

    @OriginalMember(owner = "CGWBYVFN", name = "h", descriptor = "[I")
    public int[] field166;

    @OriginalMember(owner = "CGWBYVFN", name = "i", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "CGWBYVFN", name = "k", descriptor = "[I")
    public int[] field169;

    @OriginalMember(owner = "CGWBYVFN", name = "e", descriptor = "[LCGWBYVFN;")
    public static class9[] field163;

    @OriginalMember(owner = "CGWBYVFN", name = "a", descriptor = "(LOTSGNSQM;Z)V")
    public static void method22(class41 arg0, boolean arg1) {
        if (arg1) {
            field160 = !field160;
        }
        class68 var2 = new class68(arg0.method376("seq.dat", null), -103);
        field162 = var2.method551();
        if (field163 == null) {
            field163 = new class9[field162];
        }
        for (int var3 = 0; var3 < field162; var3++) {
            if (field163[var3] == null) {
                field163[var3] = new class9();
            }
            field163[var3].method24((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "CGWBYVFN", name = "a", descriptor = "(BI)I")
    public int method23(byte arg0, int arg1) {
        if (arg0 != 2) {
            field161 = !field161;
        }
        int var3 = this.field167[arg1];
        if (var3 == 0) {
            class55 var4 = class55.method454(true, this.field165[arg1]);
            if (var4 != null) {
                var3 = this.field167[arg1] = var4.field1368;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "CGWBYVFN", name = "a", descriptor = "(BLYOXDZEVD;)V")
    public void method24(byte arg0, class68 arg1) {
        if (this.field159 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method549();
                if (var4 == 0) {
                    if (this.field164 == 0) {
                        this.field164 = 1;
                        this.field165 = new int[1];
                        this.field165[0] = -1;
                        this.field166 = new int[1];
                        this.field166[0] = -1;
                        this.field167 = new int[1];
                        this.field167[0] = -1;
                    }
                    if (this.field175 == -1) {
                        if (this.field169 == null) {
                            this.field175 = 0;
                        } else {
                            this.field175 = 2;
                        }
                    }
                    if (this.field176 == -1) {
                        if (this.field169 != null) {
                            this.field176 = 2;
                            return;
                        }
                        this.field176 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field164 = arg1.method549();
                    this.field165 = new int[this.field164];
                    this.field166 = new int[this.field164];
                    this.field167 = new int[this.field164];
                    for (int var5 = 0; var5 < this.field164; var5++) {
                        this.field165[var5] = arg1.method551();
                        this.field166[var5] = arg1.method551();
                        if (this.field166[var5] == 65535) {
                            this.field166[var5] = -1;
                        }
                        this.field167[var5] = arg1.method551();
                    }
                } else if (var4 == 2) {
                    this.field168 = arg1.method551();
                } else if (var4 == 3) {
                    int var6 = arg1.method549();
                    this.field169 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field169[var7] = arg1.method549();
                    }
                    this.field169[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field170 = true;
                } else if (var4 == 5) {
                    this.field171 = arg1.method549();
                } else if (var4 == 6) {
                    this.field172 = arg1.method551();
                } else if (var4 == 7) {
                    this.field173 = arg1.method551();
                } else if (var4 == 8) {
                    this.field174 = arg1.method549();
                } else if (var4 == 9) {
                    this.field175 = arg1.method549();
                } else if (var4 == 10) {
                    this.field176 = arg1.method549();
                } else if (var4 == 11) {
                    this.field177 = arg1.method549();
                } else if (var4 == 12) {
                    this.field178 = arg1.method554();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
