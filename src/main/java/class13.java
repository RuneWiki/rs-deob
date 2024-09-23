import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DQSOHZWU")
public class class13 {

    @OriginalMember(owner = "DQSOHZWU", name = "b", descriptor = "I")
    private int field628 = 9;

    @OriginalMember(owner = "DQSOHZWU", name = "c", descriptor = "Z")
    private boolean field629 = true;

    @OriginalMember(owner = "DQSOHZWU", name = "d", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "DQSOHZWU", name = "g", descriptor = "I")
    public int field633 = -1;

    @OriginalMember(owner = "DQSOHZWU", name = "i", descriptor = "[I")
    public int[] field635 = new int[6];

    @OriginalMember(owner = "DQSOHZWU", name = "j", descriptor = "[I")
    public int[] field636 = new int[6];

    @OriginalMember(owner = "DQSOHZWU", name = "k", descriptor = "[I")
    public int[] field637 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "DQSOHZWU", name = "l", descriptor = "Z")
    public boolean field638 = false;

    @OriginalMember(owner = "DQSOHZWU", name = "a", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "DQSOHZWU", name = "e", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "DQSOHZWU", name = "h", descriptor = "[I")
    public int[] field634;

    @OriginalMember(owner = "DQSOHZWU", name = "f", descriptor = "[LDQSOHZWU;")
    public static class13[] field632;

    @OriginalMember(owner = "DQSOHZWU", name = "a", descriptor = "(ILHRXSNEYZ;)V")
    public static void method213(int arg0, class26 arg1) {
        class31 var2 = new class31(arg1.method289("idk.dat", null), 8);
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field631 = var2.method308();
        if (field632 == null) {
            field632 = new class13[field631];
        }
        for (int var4 = 0; var4 < field631; var4++) {
            if (field632[var4] == null) {
                field632[var4] = new class13();
            }
            field632[var4].method214(var2, 0);
        }
    }

    @OriginalMember(owner = "DQSOHZWU", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public void method214(class31 arg0, int arg1) {
        if (arg1 != 0) {
            this.field628 = 328;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method306();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field633 = arg0.method306();
                } else if (var3 == 2) {
                    int var4 = arg0.method306();
                    this.field634 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field634[var5] = arg0.method308();
                    }
                } else if (var3 == 3) {
                    this.field638 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field635[var3 - 40] = arg0.method308();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field636[var3 - 50] = arg0.method308();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field637[var3 - 60] = arg0.method308();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "DQSOHZWU", name = "a", descriptor = "(Z)Z")
    public boolean method215(boolean arg0) {
        if (arg0) {
            this.field628 = 429;
        }
        if (this.field634 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field634.length; var3++) {
            if (!class59.method455(this.field634[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "DQSOHZWU", name = "a", descriptor = "(I)LRTQSBWRH;")
    public class59 method216(int arg0) {
        if (arg0 != 23345) {
            this.field630 = !this.field630;
        }
        if (this.field634 == null) {
            return null;
        }
        class59[] var2 = new class59[this.field634.length];
        for (int var3 = 0; var3 < this.field634.length; var3++) {
            var2[var3] = class59.method454(false, this.field634[var3]);
        }
        class59 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class59(var2.length, var2, this.field627);
        }
        for (int var5 = 0; var5 < 6 && this.field635[var5] != 0; var5++) {
            var4.method468(this.field635[var5], this.field636[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "DQSOHZWU", name = "b", descriptor = "(I)Z")
    public boolean method217(int arg0) {
        while (arg0 >= 0) {
            this.field628 = -326;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field637[var3] != -1 && !class59.method455(this.field637[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "DQSOHZWU", name = "b", descriptor = "(Z)LRTQSBWRH;")
    public class59 method218(boolean arg0) {
        class59[] var2 = new class59[5];
        if (!arg0) {
            throw new NullPointerException();
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field637[var4] != -1) {
                var2[var3++] = class59.method454(false, this.field637[var4]);
            }
        }
        class59 var5 = new class59(var3, var2, this.field627);
        for (int var6 = 0; var6 < 6 && this.field635[var6] != 0; var6++) {
            var5.method468(this.field635[var6], this.field636[var6]);
        }
        return var5;
    }
}
