import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RHGWIWMQ")
public class class51 {

    @OriginalMember(owner = "RHGWIWMQ", name = "d", descriptor = "I")
    public int field1448 = -1;

    @OriginalMember(owner = "RHGWIWMQ", name = "f", descriptor = "[I")
    public int[] field1450 = new int[6];

    @OriginalMember(owner = "RHGWIWMQ", name = "g", descriptor = "[I")
    public int[] field1451 = new int[6];

    @OriginalMember(owner = "RHGWIWMQ", name = "h", descriptor = "[I")
    public int[] field1452 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "RHGWIWMQ", name = "i", descriptor = "Z")
    public boolean field1453 = false;

    @OriginalMember(owner = "RHGWIWMQ", name = "a", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "RHGWIWMQ", name = "b", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "RHGWIWMQ", name = "e", descriptor = "[I")
    public int[] field1449;

    @OriginalMember(owner = "RHGWIWMQ", name = "c", descriptor = "[LRHGWIWMQ;")
    public static class51[] field1447;

    @OriginalMember(owner = "RHGWIWMQ", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method476(class37 arg0, byte arg1) {
        class3 var2 = new class3(false, arg0.method429("idk.dat", null));
        field1446 = var2.method17();
        if (arg1 != 0) {
            return;
        }
        if (field1447 == null) {
            field1447 = new class51[field1446];
        }
        for (int var3 = 0; var3 < field1446; var3++) {
            if (field1447[var3] == null) {
                field1447[var3] = new class51();
            }
            field1447[var3].method477(674, var2);
        }
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    public void method477(int arg0, class3 arg1) {
        int var3 = 1 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method15();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1448 = arg1.method15();
                } else if (var4 == 2) {
                    int var5 = arg1.method15();
                    this.field1449 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1449[var6] = arg1.method17();
                    }
                } else if (var4 == 3) {
                    this.field1453 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1450[var4 - 40] = arg1.method17();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1451[var4 - 50] = arg1.method17();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1452[var4 - 60] = arg1.method17();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "a", descriptor = "(I)Z")
    public boolean method478(int arg0) {
        if (this.field1449 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 6 || arg0 > 6) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1449.length; var3++) {
            if (!class26.method329(this.field1449[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "b", descriptor = "(I)LJLNSJQDR;")
    public class26 method479(int arg0) {
        if (this.field1449 == null) {
            return null;
        }
        class26[] var2 = new class26[this.field1449.length];
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1449.length; var3++) {
            var2[var3] = class26.method328(1, this.field1449[var3]);
        }
        class26 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class26(9, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1450[var5] != 0; var5++) {
            var4.method342(this.field1450[var5], this.field1451[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "c", descriptor = "(I)Z")
    public boolean method480(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1452[var3] != -1 && !class26.method329(this.field1452[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "d", descriptor = "(I)LJLNSJQDR;")
    public class26 method481(int arg0) {
        class26[] var2 = new class26[5];
        if (arg0 != 719) {
            this.field1445 = 70;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1452[var4] != -1) {
                var2[var3++] = class26.method328(1, this.field1452[var4]);
            }
        }
        class26 var5 = new class26(9, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1450[var6] != 0; var6++) {
            var5.method342(this.field1450[var6], this.field1451[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "RHGWIWMQ", name = "<init>", descriptor = "()V")
    public class51() {
        if (class38.field1228) {
        }
    }
}
