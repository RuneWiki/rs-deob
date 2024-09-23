import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FGIDBWCJ")
public class class12 {

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "Z")
    private boolean field728 = false;

    @OriginalMember(owner = "FGIDBWCJ", name = "e", descriptor = "I")
    public int field732 = -1;

    @OriginalMember(owner = "FGIDBWCJ", name = "g", descriptor = "[I")
    public int[] field734 = new int[6];

    @OriginalMember(owner = "FGIDBWCJ", name = "h", descriptor = "[I")
    public int[] field735 = new int[6];

    @OriginalMember(owner = "FGIDBWCJ", name = "i", descriptor = "[I")
    public int[] field736 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "FGIDBWCJ", name = "j", descriptor = "Z")
    public boolean field737 = false;

    @OriginalMember(owner = "FGIDBWCJ", name = "b", descriptor = "I")
    private static int field729 = 1;

    @OriginalMember(owner = "FGIDBWCJ", name = "c", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "FGIDBWCJ", name = "f", descriptor = "[I")
    public int[] field733;

    @OriginalMember(owner = "FGIDBWCJ", name = "d", descriptor = "[LFGIDBWCJ;")
    public static class12[] field731;

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "(LDTIATKJO;I)V")
    public static void method184(class8 arg0, int arg1) {
        class14 var2 = new class14(-527, arg0.method168("idk.dat", null));
        if (arg1 < 1 || arg1 > 1) {
            field729 = 259;
        }
        field730 = var2.method204();
        if (field731 == null) {
            field731 = new class12[field730];
        }
        for (int var3 = 0; var3 < field730; var3++) {
            if (field731[var3] == null) {
                field731[var3] = new class12();
            }
            field731[var3].method185(var2, 0);
        }
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "(LGHHPHSRU;I)V")
    public void method185(class14 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method202();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field732 = arg0.method202();
                } else if (var3 == 2) {
                    int var4 = arg0.method202();
                    this.field733 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field733[var5] = arg0.method204();
                    }
                } else if (var3 == 3) {
                    this.field737 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field734[var3 - 40] = arg0.method204();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field735[var3 - 50] = arg0.method204();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field736[var3 - 60] = arg0.method204();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "(B)Z")
    public boolean method186(byte arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field733 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field733.length; var4++) {
            if (!class35.method392(this.field733[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "b", descriptor = "(B)LOQIGXOFQ;")
    public class35 method187(byte arg0) {
        if (arg0 != 81) {
            this.field728 = !this.field728;
        }
        if (this.field733 == null) {
            return null;
        }
        class35[] var2 = new class35[this.field733.length];
        for (int var3 = 0; var3 < this.field733.length; var3++) {
            var2[var3] = class35.method391(this.field733[var3]);
        }
        class35 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class35(var2.length, -537, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field734[var5] != 0; var5++) {
            var4.method405(this.field734[var5], this.field735[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "(I)Z")
    public boolean method188(int arg0) {
        boolean var2 = true;
        int var3 = 10 / arg0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field736[var4] != -1 && !class35.method392(this.field736[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public class35 method189(boolean arg0) {
        class35[] var2 = new class35[5];
        if (!arg0) {
            throw new NullPointerException();
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field736[var4] != -1) {
                var2[var3++] = class35.method391(this.field736[var4]);
            }
        }
        class35 var5 = new class35(var3, -537, var2);
        for (int var6 = 0; var6 < 6 && this.field734[var6] != 0; var6++) {
            var5.method405(this.field734[var6], this.field735[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "FGIDBWCJ", name = "<init>", descriptor = "()V")
    public class12() {
        if (class4.field57) {
        }
    }
}
