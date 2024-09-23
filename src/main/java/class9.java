import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CSHXCUHU")
public class class9 {

    @OriginalMember(owner = "CSHXCUHU", name = "e", descriptor = "I")
    public int field618 = -1;

    @OriginalMember(owner = "CSHXCUHU", name = "g", descriptor = "[I")
    public int[] field620 = new int[6];

    @OriginalMember(owner = "CSHXCUHU", name = "h", descriptor = "[I")
    public int[] field621 = new int[6];

    @OriginalMember(owner = "CSHXCUHU", name = "i", descriptor = "[I")
    public int[] field622 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "CSHXCUHU", name = "j", descriptor = "Z")
    public boolean field623 = false;

    @OriginalMember(owner = "CSHXCUHU", name = "b", descriptor = "Z")
    private static boolean field615 = true;

    @OriginalMember(owner = "CSHXCUHU", name = "a", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "CSHXCUHU", name = "c", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "CSHXCUHU", name = "f", descriptor = "[I")
    public int[] field619;

    @OriginalMember(owner = "CSHXCUHU", name = "d", descriptor = "[LCSHXCUHU;")
    public static class9[] field617;

    @OriginalMember(owner = "CSHXCUHU", name = "a", descriptor = "(LFNOQZAYQ;I)V")
    public static void method169(class14 arg0, int arg1) {
        class11 var2 = new class11(arg0.method246("idk.dat", null), field615);
        field616 = var2.method191();
        int var3 = 66 / arg1;
        if (field617 == null) {
            field617 = new class9[field616];
        }
        for (int var4 = 0; var4 < field616; var4++) {
            if (field617[var4] == null) {
                field617[var4] = new class9();
            }
            field617[var4].method170(var2, -25);
        }
    }

    @OriginalMember(owner = "CSHXCUHU", name = "a", descriptor = "(LDNRIFKTO;I)V")
    public void method170(class11 arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method189();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field618 = arg0.method189();
                } else if (var3 == 2) {
                    int var4 = arg0.method189();
                    this.field619 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field619[var5] = arg0.method191();
                    }
                } else if (var3 == 3) {
                    this.field623 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field620[var3 - 40] = arg0.method191();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field621[var3 - 50] = arg0.method191();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field622[var3 - 60] = arg0.method191();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "CSHXCUHU", name = "a", descriptor = "(I)Z")
    public boolean method171(int arg0) {
        if (arg0 >= 0) {
            this.field614 = -245;
        }
        if (this.field619 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field619.length; var3++) {
            if (!class55.method419(this.field619[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "CSHXCUHU", name = "b", descriptor = "(I)LSNMMQNPZ;")
    public class55 method172(int arg0) {
        if (this.field619 == null) {
            return null;
        }
        class55[] var2 = new class55[this.field619.length];
        int var3 = 42 / arg0;
        for (int var4 = 0; var4 < this.field619.length; var4++) {
            var2[var4] = class55.method418(this.field619[var4]);
        }
        class55 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class55(var2.length, false, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field620[var6] != 0; var6++) {
            var5.method432(this.field620[var6], this.field621[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "CSHXCUHU", name = "c", descriptor = "(I)Z")
    public boolean method173(int arg0) {
        int var2 = 9 / arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field622[var4] != -1 && !class55.method419(this.field622[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "CSHXCUHU", name = "a", descriptor = "(Z)LSNMMQNPZ;")
    public class55 method174(boolean arg0) {
        class55[] var2 = new class55[5];
        int var3 = 0;
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field622[var4] != -1) {
                var2[var3++] = class55.method418(this.field622[var4]);
            }
        }
        class55 var5 = new class55(var3, false, var2);
        for (int var6 = 0; var6 < 6 && this.field620[var6] != 0; var6++) {
            var5.method432(this.field620[var6], this.field621[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "CSHXCUHU", name = "<init>", descriptor = "()V")
    public class9() {
        if (class2.field14) {
        }
    }
}
