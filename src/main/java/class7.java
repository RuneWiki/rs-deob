import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BLFCIBLQ")
public class class7 {

    @OriginalMember(owner = "BLFCIBLQ", name = "b", descriptor = "I")
    private int field75 = 4006;

    @OriginalMember(owner = "BLFCIBLQ", name = "g", descriptor = "I")
    public int field80 = -1;

    @OriginalMember(owner = "BLFCIBLQ", name = "i", descriptor = "[I")
    public int[] field82 = new int[6];

    @OriginalMember(owner = "BLFCIBLQ", name = "j", descriptor = "[I")
    public int[] field83 = new int[6];

    @OriginalMember(owner = "BLFCIBLQ", name = "k", descriptor = "[I")
    public int[] field84 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "BLFCIBLQ", name = "l", descriptor = "Z")
    public boolean field85 = false;

    @OriginalMember(owner = "BLFCIBLQ", name = "a", descriptor = "Z")
    private static boolean field74 = true;

    @OriginalMember(owner = "BLFCIBLQ", name = "c", descriptor = "Z")
    private static boolean field76 = true;

    @OriginalMember(owner = "BLFCIBLQ", name = "d", descriptor = "Z")
    private static boolean field77 = true;

    @OriginalMember(owner = "BLFCIBLQ", name = "e", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "BLFCIBLQ", name = "h", descriptor = "[I")
    public int[] field81;

    @OriginalMember(owner = "BLFCIBLQ", name = "f", descriptor = "[LBLFCIBLQ;")
    public static class7[] field79;

    @OriginalMember(owner = "BLFCIBLQ", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method17(boolean arg0, class44 arg1) {
        if (!arg0) {
            field76 = !field76;
        }
        class69 var2 = new class69(arg1.method317("idk.dat", null), -82);
        field78 = var2.method467();
        if (field79 == null) {
            field79 = new class7[field78];
        }
        for (int var3 = 0; var3 < field78; var3++) {
            if (field79[var3] == null) {
                field79[var3] = new class7();
            }
            field79[var3].method18(field74, var2);
        }
    }

    @OriginalMember(owner = "BLFCIBLQ", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public void method18(boolean arg0, class69 arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method465();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field80 = arg1.method465();
                } else if (var4 == 2) {
                    int var5 = arg1.method465();
                    this.field81 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field81[var6] = arg1.method467();
                    }
                } else if (var4 == 3) {
                    this.field85 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field82[var4 - 40] = arg1.method467();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field83[var4 - 50] = arg1.method467();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field84[var4 - 60] = arg1.method467();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "BLFCIBLQ", name = "a", descriptor = "(I)Z")
    public boolean method19(int arg0) {
        if (this.field81 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            field76 = !field76;
        }
        for (int var3 = 0; var3 < this.field81.length; var3++) {
            if (!class66.method408(this.field81[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "BLFCIBLQ", name = "a", descriptor = "(B)LVYUQHOMO;")
    public class66 method20(byte arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (this.field81 == null) {
            return null;
        }
        class66[] var3 = new class66[this.field81.length];
        for (int var4 = 0; var4 < this.field81.length; var4++) {
            var3[var4] = class66.method407(this.field81[var4]);
        }
        class66 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class66(var3, this.field75, var3.length);
        }
        for (int var6 = 0; var6 < 6 && this.field82[var6] != 0; var6++) {
            var5.method421(this.field82[var6], this.field83[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "BLFCIBLQ", name = "b", descriptor = "(I)Z")
    public boolean method21(int arg0) {
        boolean var2 = true;
        if (arg0 <= 0) {
            field74 = !field74;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field84[var3] != -1 && !class66.method408(this.field84[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "BLFCIBLQ", name = "b", descriptor = "(B)LVYUQHOMO;")
    public class66 method22(byte arg0) {
        class66[] var2 = new class66[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field84[var4] != -1) {
                var2[var3++] = class66.method407(this.field84[var4]);
            }
        }
        class66 var5 = new class66(var2, this.field75, var3);
        for (int var6 = 0; var6 < 6 && this.field82[var6] != 0; var6++) {
            var5.method421(this.field82[var6], this.field83[var6]);
        }
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return var5;
    }
}
