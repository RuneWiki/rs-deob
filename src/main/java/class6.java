import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BDUNOHSG")
public class class6 {

    @OriginalMember(owner = "BDUNOHSG", name = "b", descriptor = "Z")
    private boolean field97 = true;

    @OriginalMember(owner = "BDUNOHSG", name = "c", descriptor = "I")
    private int field98 = 25292;

    @OriginalMember(owner = "BDUNOHSG", name = "d", descriptor = "I")
    private int field99 = -948;

    @OriginalMember(owner = "BDUNOHSG", name = "g", descriptor = "I")
    public int field102 = -1;

    @OriginalMember(owner = "BDUNOHSG", name = "i", descriptor = "[I")
    public int[] field104 = new int[6];

    @OriginalMember(owner = "BDUNOHSG", name = "j", descriptor = "[I")
    public int[] field105 = new int[6];

    @OriginalMember(owner = "BDUNOHSG", name = "k", descriptor = "[I")
    public int[] field106 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "BDUNOHSG", name = "l", descriptor = "Z")
    public boolean field107 = false;

    @OriginalMember(owner = "BDUNOHSG", name = "a", descriptor = "I")
    private static int field96 = 8;

    @OriginalMember(owner = "BDUNOHSG", name = "e", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "BDUNOHSG", name = "h", descriptor = "[I")
    public int[] field103;

    @OriginalMember(owner = "BDUNOHSG", name = "f", descriptor = "[LBDUNOHSG;")
    public static class6[] field101;

    @OriginalMember(owner = "BDUNOHSG", name = "a", descriptor = "(LBYZSQZUF;Z)V")
    public static void method22(class7 arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class24 var3 = new class24(0, arg0.method29("idk.dat", null));
        field100 = var3.method240();
        if (field101 == null) {
            field101 = new class6[field100];
        }
        for (int var4 = 0; var4 < field100; var4++) {
            if (field101[var4] == null) {
                field101[var4] = new class6();
            }
            field101[var4].method23(field96, var3);
        }
    }

    @OriginalMember(owner = "BDUNOHSG", name = "a", descriptor = "(ILIMUIZRAF;)V")
    public void method23(int arg0, class24 arg1) {
        if (arg0 != 8) {
            this.field99 = -494;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field102 = arg1.method238();
                } else if (var3 == 2) {
                    int var4 = arg1.method238();
                    this.field103 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field103[var5] = arg1.method240();
                    }
                } else if (var3 == 3) {
                    this.field107 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field104[var3 - 40] = arg1.method240();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field105[var3 - 50] = arg1.method240();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field106[var3 - 60] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "BDUNOHSG", name = "a", descriptor = "(I)Z")
    public boolean method24(int arg0) {
        int var2 = 46 / arg0;
        if (this.field103 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field103.length; var4++) {
            if (!class67.method549(this.field103[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "BDUNOHSG", name = "a", descriptor = "(Z)LYABPKWWG;")
    public class67 method25(boolean arg0) {
        if (this.field103 == null) {
            return null;
        }
        class67[] var2 = new class67[this.field103.length];
        if (!arg0) {
            this.field99 = -253;
        }
        for (int var3 = 0; var3 < this.field103.length; var3++) {
            var2[var3] = class67.method548(this.field103[var3], (byte) -27);
        }
        class67 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class67(var2, true, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field104[var5] != 0; var5++) {
            var4.method562(this.field104[var5], this.field105[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "BDUNOHSG", name = "b", descriptor = "(I)Z")
    public boolean method26(int arg0) {
        if (this.field98 != arg0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field106[var3] != -1 && !class67.method549(this.field106[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "BDUNOHSG", name = "c", descriptor = "(I)LYABPKWWG;")
    public class67 method27(int arg0) {
        class67[] var2 = new class67[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field106[var4] != -1) {
                var2[var3++] = class67.method548(this.field106[var4], (byte) -27);
            }
        }
        class67 var5 = new class67(var2, true, var3);
        for (int var6 = 0; var6 < 6 && this.field104[var6] != 0; var6++) {
            var5.method562(this.field104[var6], this.field105[var6]);
        }
        if (arg0 != 3) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }
}
