import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GCYXYCPV")
public class class18 {

    @OriginalMember(owner = "GCYXYCPV", name = "d", descriptor = "I")
    public int field780 = -1;

    @OriginalMember(owner = "GCYXYCPV", name = "f", descriptor = "[I")
    public int[] field782 = new int[6];

    @OriginalMember(owner = "GCYXYCPV", name = "g", descriptor = "[I")
    public int[] field783 = new int[6];

    @OriginalMember(owner = "GCYXYCPV", name = "h", descriptor = "[I")
    public int[] field784 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "GCYXYCPV", name = "i", descriptor = "Z")
    public boolean field785 = false;

    @OriginalMember(owner = "GCYXYCPV", name = "a", descriptor = "Z")
    private static boolean field777 = true;

    @OriginalMember(owner = "GCYXYCPV", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "GCYXYCPV", name = "e", descriptor = "[I")
    public int[] field781;

    @OriginalMember(owner = "GCYXYCPV", name = "c", descriptor = "[LGCYXYCPV;")
    public static class18[] field779;

    @OriginalMember(owner = "GCYXYCPV", name = "a", descriptor = "(ZLXRWUKRPO;)V")
    public static void method221(boolean arg0, class65 arg1) {
        if (arg0) {
            field777 = !field777;
        }
        class21 var2 = new class21(arg1.method581("idk.dat", null), -49015);
        field778 = var2.method246();
        if (field779 == null) {
            field779 = new class18[field778];
        }
        for (int var3 = 0; var3 < field778; var3++) {
            if (field779[var3] == null) {
                field779[var3] = new class18();
            }
            field779[var3].method222((byte) 8, var2);
        }
    }

    @OriginalMember(owner = "GCYXYCPV", name = "a", descriptor = "(BLGLMIQHJI;)V")
    public void method222(byte arg0, class21 arg1) {
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            field777 = !field777;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method244();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field780 = arg1.method244();
                } else if (var4 == 2) {
                    int var5 = arg1.method244();
                    this.field781 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field781[var6] = arg1.method246();
                    }
                } else if (var4 == 3) {
                    this.field785 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field782[var4 - 40] = arg1.method246();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field783[var4 - 50] = arg1.method246();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field784[var4 - 60] = arg1.method246();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "GCYXYCPV", name = "a", descriptor = "(B)Z")
    public boolean method223(byte arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field781 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field781.length; var4++) {
            if (!class53.method501(this.field781[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "GCYXYCPV", name = "b", descriptor = "(B)LVHYCWIPJ;")
    public class53 method224(byte arg0) {
        if (this.field781 == null) {
            return null;
        }
        class53[] var2 = new class53[this.field781.length];
        for (int var3 = 0; var3 < this.field781.length; var3++) {
            var2[var3] = class53.method500((byte) 5, this.field781[var3]);
        }
        class53 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class53(var2.length, var2, -11616);
        }
        for (int var5 = 0; var5 < 6 && this.field782[var5] != 0; var5++) {
            var4.method514(this.field782[var5], this.field783[var5]);
        }
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "GCYXYCPV", name = "a", descriptor = "(I)Z")
    public boolean method225(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field784[var3] != -1 && !class53.method501(this.field784[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "GCYXYCPV", name = "b", descriptor = "(I)LVHYCWIPJ;")
    public class53 method226(int arg0) {
        class53[] var2 = new class53[5];
        int var3 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field784[var4] != -1) {
                var2[var3++] = class53.method500((byte) 5, this.field784[var4]);
            }
        }
        class53 var5 = new class53(var3, var2, -11616);
        for (int var6 = 0; var6 < 6 && this.field782[var6] != 0; var6++) {
            var5.method514(this.field782[var6], this.field783[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "GCYXYCPV", name = "<init>", descriptor = "()V")
    public class18() {
        if (class62.field1590) {
        }
    }
}
