import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PJCTWSQI")
public class class43 {

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "Z")
    private boolean field1240 = false;

    @OriginalMember(owner = "PJCTWSQI", name = "e", descriptor = "I")
    public int field1244 = -1;

    @OriginalMember(owner = "PJCTWSQI", name = "g", descriptor = "[I")
    public int[] field1246 = new int[6];

    @OriginalMember(owner = "PJCTWSQI", name = "h", descriptor = "[I")
    public int[] field1247 = new int[6];

    @OriginalMember(owner = "PJCTWSQI", name = "i", descriptor = "[I")
    public int[] field1248 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "PJCTWSQI", name = "j", descriptor = "Z")
    public boolean field1249 = false;

    @OriginalMember(owner = "PJCTWSQI", name = "b", descriptor = "I")
    private static int field1241 = 162;

    @OriginalMember(owner = "PJCTWSQI", name = "c", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "PJCTWSQI", name = "f", descriptor = "[I")
    public int[] field1245;

    @OriginalMember(owner = "PJCTWSQI", name = "d", descriptor = "[LPJCTWSQI;")
    public static class43[] field1243;

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "(ILSYUGXMZF;)V")
    public static void method468(int arg0, class55 arg1) {
        class30 var2 = new class30(arg1.method551("idk.dat", null), -982);
        while (arg0 >= 0) {
            field1241 = -276;
        }
        field1242 = var2.method351();
        if (field1243 == null) {
            field1243 = new class43[field1242];
        }
        for (int var3 = 0; var3 < field1242; var3++) {
            if (field1243[var3] == null) {
                field1243[var3] = new class43();
            }
            field1243[var3].method469(var2, 1);
        }
    }

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "(LKHOMSBHW;I)V")
    public void method469(class30 arg0, int arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1244 = arg0.method349();
                } else if (var3 == 2) {
                    int var4 = arg0.method349();
                    this.field1245 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1245[var5] = arg0.method351();
                    }
                } else if (var3 == 3) {
                    this.field1249 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1246[var3 - 40] = arg0.method351();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1247[var3 - 50] = arg0.method351();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1248[var3 - 60] = arg0.method351();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "(I)Z")
    public boolean method470(int arg0) {
        if (this.field1245 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            field1241 = -71;
        }
        for (int var3 = 0; var3 < this.field1245.length; var3++) {
            if (!class17.method286(this.field1245[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public class17 method471(byte arg0) {
        if (this.field1245 == null) {
            return null;
        }
        class17[] var2 = new class17[this.field1245.length];
        for (int var3 = 0; var3 < this.field1245.length; var3++) {
            var2[var3] = class17.method285(this.field1245[var3], 8);
        }
        class17 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class17(var2, false, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1246[var5] != 0; var5++) {
            var4.method299(this.field1246[var5], this.field1247[var5]);
        }
        if (arg0 != -23) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "PJCTWSQI", name = "a", descriptor = "(Z)Z")
    public boolean method472(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1248[var3] != -1 && !class17.method286(this.field1248[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "PJCTWSQI", name = "b", descriptor = "(Z)LGEUHTGZJ;")
    public class17 method473(boolean arg0) {
        class17[] var2 = new class17[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1248[var4] != -1) {
                var2[var3++] = class17.method285(this.field1248[var4], 8);
            }
        }
        class17 var5 = new class17(var2, false, var3);
        for (int var6 = 0; var6 < 6 && this.field1246[var6] != 0; var6++) {
            var5.method299(this.field1246[var6], this.field1247[var6]);
        }
        if (arg0) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "PJCTWSQI", name = "<init>", descriptor = "()V")
    public class43() {
        if (class1.field4) {
        }
    }
}
