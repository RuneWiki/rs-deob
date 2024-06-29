import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LXLAQKAC")
public class class33 {

    @OriginalMember(owner = "client!LXLAQKAC", name = "d", descriptor = "I")
    public int field1045 = -1;

    @OriginalMember(owner = "client!LXLAQKAC", name = "f", descriptor = "[I")
    public int[] field1047 = new int[6];

    @OriginalMember(owner = "client!LXLAQKAC", name = "g", descriptor = "[I")
    public int[] field1048 = new int[6];

    @OriginalMember(owner = "client!LXLAQKAC", name = "h", descriptor = "[I")
    public int[] field1049 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!LXLAQKAC", name = "i", descriptor = "Z")
    public boolean field1050 = false;

    @OriginalMember(owner = "client!LXLAQKAC", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "Z")
    private static boolean field1042;

    @OriginalMember(owner = "client!LXLAQKAC", name = "e", descriptor = "[I")
    public int[] field1046;

    @OriginalMember(owner = "client!LXLAQKAC", name = "c", descriptor = "[LLXLAQKAC;")
    public static class33[] field1044;

    @OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method335(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("idk.dat", null));
        if (arg0 != 8) {
            field1042 = !field1042;
        }
        field1043 = var2.method359();
        if (field1044 == null) {
            field1044 = new class33[field1043];
        }
        for (int var3 = 0; var3 < field1043; var3++) {
            if (field1044[var3] == null) {
                field1044[var3] = new class33();
            }
            field1044[var3].method336(403, var2);
        }
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public void method336(int arg0, class38 arg1) {
        int var3 = 95 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method357();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1045 = arg1.method357();
                } else if (var4 == 2) {
                    int var5 = arg1.method357();
                    this.field1046 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1046[var6] = arg1.method359();
                    }
                } else if (var4 == 3) {
                    this.field1050 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1047[var4 - 40] = arg1.method359();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1048[var4 - 50] = arg1.method359();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1049[var4 - 60] = arg1.method359();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(I)Z")
    public boolean method337(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1046 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1046.length; var3++) {
                if (!class42.method415(this.field1046[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "a", descriptor = "(Z)LPDVZPZLT;")
    public class42 method338(boolean arg0) {
        if (this.field1046 == null) {
            return null;
        }
        class42[] var2 = new class42[this.field1046.length];
        for (int var3 = 0; var3 < this.field1046.length; var3++) {
            var2[var3] = class42.method414(this.field1046[var3]);
        }
        class42 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class42(var2, var2.length, 0);
        }
        for (int var5 = 0; var5 < 6 && this.field1047[var5] != 0; var5++) {
            var4.method428(this.field1047[var5], this.field1048[var5]);
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "b", descriptor = "(I)Z")
    public boolean method339(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1049[var3] != -1 && !class42.method415(this.field1049[var3])) {
                var2 = false;
            }
        }
        int var4 = 22 / arg0;
        return var2;
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "c", descriptor = "(I)LPDVZPZLT;")
    public class42 method340(int arg0) {
        class42[] var2 = new class42[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1049[var4] != -1) {
                var2[var3++] = class42.method414(this.field1049[var4]);
            }
        }
        class42 var5 = new class42(var2, var3, 0);
        if (arg0 != 0) {
            field1042 = !field1042;
        }
        for (int var6 = 0; var6 < 6 && this.field1047[var6] != 0; var6++) {
            var5.method428(this.field1047[var6], this.field1048[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!LXLAQKAC", name = "<init>", descriptor = "()V")
    public class33() {
        if (class66.field1692) {
        }
    }
}
