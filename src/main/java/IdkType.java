import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private boolean field1130 = true;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1131 = false;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public int field1135 = -1;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1137 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1138 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1139 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1140 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private static int field1132 = 413;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1136;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[Llc;")
    public static IdkType[] field1134;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILxb;)V")
    public static void method375(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(false, arg1.method299("idk.dat", null));
        field1133 = var2.method231();
        if (field1134 == null) {
            field1134 = new IdkType[field1133];
        }
        for (int var3 = 0; var3 < field1133; var3++) {
            if (field1134[var3] == null) {
                field1134[var3] = new IdkType();
            }
            field1134[var3].method376(var2, false);
        }
        if (arg0 != 35102) {
            field1132 = -39;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;Z)V")
    public void method376(Packet arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1135 = arg0.method229();
                } else if (var3 == 2) {
                    int var4 = arg0.method229();
                    this.field1136 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1136[var5] = arg0.method231();
                    }
                } else if (var3 == 3) {
                    this.field1140 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1137[var3 - 40] = arg0.method231();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1138[var3 - 50] = arg0.method231();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1139[var3 - 60] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (this.field1136 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            this.field1130 = !this.field1130;
        }
        for (int var3 = 0; var3 < this.field1136.length; var3++) {
            if (!Model.method127(this.field1136[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method378(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        if (this.field1136 == null) {
            return null;
        }
        Model[] var3 = new Model[this.field1136.length];
        for (int var4 = 0; var4 < this.field1136.length; var4++) {
            var3[var4] = Model.method126(this.field1136[var4], 0);
        }
        Model var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new Model(var3.length, var3, (byte) 1);
        }
        for (int var6 = 0; var6 < 6 && this.field1137[var6] != 0; var6++) {
            var5.method140(this.field1137[var6], this.field1138[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1139[var3] != -1 && !Model.method127(this.field1139[var3])) {
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
            if (this.field1139[var4] != -1) {
                var2[var3++] = Model.method126(this.field1139[var4], 0);
            }
        }
        Model var5 = new Model(var3, var2, (byte) 1);
        if (arg0 < 4 || arg0 > 4) {
            this.field1131 = !this.field1131;
        }
        for (int var6 = 0; var6 < 6 && this.field1137[var6] != 0; var6++) {
            var5.method140(this.field1137[var6], this.field1138[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field368) {
        }
    }
}
