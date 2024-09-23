import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class IdkType {

    @OriginalMember(owner = "kc", name = "a", descriptor = "Z")
    private boolean field1059 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    private int field1060 = -797;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1063 = -1;

    @OriginalMember(owner = "kc", name = "g", descriptor = "[I")
    public int[] field1065 = new int[6];

    @OriginalMember(owner = "kc", name = "h", descriptor = "[I")
    public int[] field1066 = new int[6];

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1067 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "kc", name = "j", descriptor = "Z")
    public boolean field1068 = false;

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "kc", name = "f", descriptor = "[I")
    public int[] field1064;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static IdkType[] field1062;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lyb;I)V")
    public static void method366(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("idk.dat", null), true);
        int var3 = 65 / arg1;
        field1061 = var2.method233();
        if (field1062 == null) {
            field1062 = new IdkType[field1061];
        }
        for (int var4 = 0; var4 < field1061; var4++) {
            if (field1062[var4] == null) {
                field1062[var4] = new IdkType();
            }
            field1062[var4].method367(3251, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILmb;)V")
    public void method367(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method231();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1063 = arg1.method231();
                } else if (var4 == 2) {
                    int var5 = arg1.method231();
                    this.field1064 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1064[var6] = arg1.method233();
                    }
                } else if (var4 == 3) {
                    this.field1068 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1065[var4 - 40] = arg1.method233();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1066[var4 - 50] = arg1.method233();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1067[var4 - 60] = arg1.method233();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Z)Z")
    public boolean method368(boolean arg0) {
        if (this.field1064 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            this.field1059 = !this.field1059;
        }
        for (int var3 = 0; var3 < this.field1064.length; var3++) {
            if (!Model.method136(this.field1064[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(I)Lfb;")
    public Model method369(int arg0) {
        if (this.field1064 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1064.length];
        int var3 = 33 / arg0;
        for (int var4 = 0; var4 < this.field1064.length; var4++) {
            var2[var4] = Model.method135(this.field1064[var4], this.field1060);
        }
        Model var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new Model(var2.length, var2, (byte) 4);
        }
        for (int var6 = 0; var6 < 6 && this.field1065[var6] != 0; var6++) {
            var5.method149(this.field1065[var6], this.field1066[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "kc", name = "b", descriptor = "(I)Z")
    public boolean method370(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1067[var3] != -1 && !Model.method136(this.field1067[var3])) {
                var2 = false;
            }
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "kc", name = "b", descriptor = "(Z)Lfb;")
    public Model method371(boolean arg0) {
        Model[] var2 = new Model[5];
        if (!arg0) {
            throw new NullPointerException();
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1067[var4] != -1) {
                var2[var3++] = Model.method135(this.field1067[var4], this.field1060);
            }
        }
        Model var5 = new Model(var3, var2, (byte) 4);
        for (int var6 = 0; var6 < 6 && this.field1065[var6] != 0; var6++) {
            var5.method149(this.field1065[var6], this.field1066[var6]);
        }
        return var5;
    }
}
