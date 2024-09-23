import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private int field1126 = 10514;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private int field1127 = 9;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1130 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1132 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1133 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1134 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1135 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1129;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILxb;)V")
    public static void method375(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("idk.dat", null), -26728);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1128 = var2.method231();
        if (field1129 == null) {
            field1129 = new IdkType[field1128];
        }
        for (int var4 = 0; var4 < field1128; var4++) {
            if (field1129[var4] == null) {
                field1129[var4] = new IdkType();
            }
            field1129[var4].method376(var2, 8);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;I)V")
    public void method376(Packet arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            this.field1126 = 20;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1130 = arg0.method229();
                } else if (var3 == 2) {
                    int var4 = arg0.method229();
                    this.field1131 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1131[var5] = arg0.method231();
                    }
                } else if (var3 == 3) {
                    this.field1135 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1132[var3 - 40] = arg0.method231();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1133[var3 - 50] = arg0.method231();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1134[var3 - 60] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method377(byte arg0) {
        if (this.field1131 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -41) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1131.length; var3++) {
            if (!Model.method127(this.field1131[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Leb;")
    public Model method378(int arg0) {
        if (arg0 >= 0) {
            this.field1126 = -326;
        }
        if (this.field1131 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1131.length];
        for (int var3 = 0; var3 < this.field1131.length; var3++) {
            var2[var3] = Model.method126(true, this.field1131[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2.length, -314, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1132[var5] != 0; var5++) {
            var4.method140(this.field1132[var5], this.field1133[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1134[var3] != -1 && !Model.method127(this.field1134[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)Leb;")
    public Model method380(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1134[var4] != -1) {
                var2[var3++] = Model.method126(true, this.field1134[var4]);
            }
        }
        if (this.field1127 != arg0) {
            this.field1127 = -438;
        }
        Model var5 = new Model(var3, -314, var2);
        for (int var6 = 0; var6 < 6 && this.field1132[var6] != 0; var6++) {
            var5.method140(this.field1132[var6], this.field1133[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field363) {
        }
    }
}
