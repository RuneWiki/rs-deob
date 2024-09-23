import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class IdkType {

    @OriginalMember(owner = "kc", name = "a", descriptor = "Z")
    private boolean field1048 = false;

    @OriginalMember(owner = "kc", name = "b", descriptor = "Z")
    private boolean field1049 = true;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1052 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "[I")
    public int[] field1054 = new int[6];

    @OriginalMember(owner = "kc", name = "h", descriptor = "[I")
    public int[] field1055 = new int[6];

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1056 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "kc", name = "j", descriptor = "Z")
    public boolean field1057 = false;

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "kc", name = "f", descriptor = "[I")
    public int[] field1053;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static IdkType[] field1051;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lyb;B)V")
    public static void method362(Jagfile arg0, byte arg1) {
        Packet var2 = new Packet(699, arg0.method295("idk.dat", null));
        field1050 = var2.method233();
        if (arg1 != 7) {
            return;
        }
        boolean var3 = false;
        if (field1051 == null) {
            field1051 = new IdkType[field1050];
        }
        for (int var4 = 0; var4 < field1050; var4++) {
            if (field1051[var4] == null) {
                field1051[var4] = new IdkType();
            }
            field1051[var4].method363(false, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLmb;)V")
    public void method363(boolean arg0, Packet arg1) {
        if (arg0) {
            this.field1049 = !this.field1049;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1052 = arg1.method231();
                } else if (var3 == 2) {
                    int var4 = arg1.method231();
                    this.field1053 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1053[var5] = arg1.method233();
                    }
                } else if (var3 == 3) {
                    this.field1057 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1054[var3 - 40] = arg1.method233();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1055[var3 - 50] = arg1.method233();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1056[var3 - 60] = arg1.method233();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(I)Z")
    public boolean method364(int arg0) {
        if (this.field1053 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            this.field1048 = !this.field1048;
        }
        for (int var3 = 0; var3 < this.field1053.length; var3++) {
            if (!Model.method136(this.field1053[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "kc", name = "b", descriptor = "(I)Lfb;")
    public Model method365(int arg0) {
        if (this.field1053 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1053.length];
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1053.length; var4++) {
            var2[var4] = Model.method135(this.field1053[var4], -30419);
        }
        Model var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new Model(var2.length, false, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field1054[var6] != 0; var6++) {
            var5.method149(this.field1054[var6], this.field1055[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "kc", name = "c", descriptor = "(I)Z")
    public boolean method366(int arg0) {
        if (arg0 != 0) {
            this.field1048 = !this.field1048;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1056[var3] != -1 && !Model.method136(this.field1056[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(B)Lfb;")
    public Model method367(byte arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1056[var4] != -1) {
                var2[var3++] = Model.method135(this.field1056[var4], -30419);
            }
        }
        Model var5 = new Model(var3, false, var2);
        if (arg0 == 9) {
            boolean var6 = false;
        } else {
            this.field1048 = !this.field1048;
        }
        for (int var7 = 0; var7 < 6 && this.field1054[var7] != 0; var7++) {
            var5.method149(this.field1054[var7], this.field1055[var7]);
        }
        return var5;
    }

    @OriginalMember(owner = "kc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field365) {
        }
    }
}
