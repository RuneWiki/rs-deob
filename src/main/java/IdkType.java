import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1127 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1128 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1129 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1130 = false;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private static int field1122 = 16935;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private static boolean field1121;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1126;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1124;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lxb;I)V")
    public static void method375(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("idk.dat", null), field1121);
        field1123 = var2.method231();
        if (arg1 < 5 || arg1 > 5) {
            field1122 = -497;
        }
        if (field1124 == null) {
            field1124 = new IdkType[field1123];
        }
        for (int var3 = 0; var3 < field1123; var3++) {
            if (field1124[var3] == null) {
                field1124[var3] = new IdkType();
            }
            field1124[var3].method376(false, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLlb;)V")
    public void method376(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1125 = arg1.method229();
                } else if (var4 == 2) {
                    int var5 = arg1.method229();
                    this.field1126 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1126[var6] = arg1.method231();
                    }
                } else if (var4 == 3) {
                    this.field1130 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1127[var4 - 40] = arg1.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1128[var4 - 50] = arg1.method231();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1129[var4 - 60] = arg1.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1126 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1126.length; var4++) {
            if (!Model.method127(this.field1126[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method378(byte arg0) {
        if (this.field1126 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1126.length];
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < this.field1126.length; var4++) {
            var2[var4] = Model.method126((byte) 4, this.field1126[var4]);
        }
        Model var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new Model(var2, field1122, var2.length);
        }
        for (int var6 = 0; var6 < 6 && this.field1127[var6] != 0; var6++) {
            var5.method140(this.field1127[var6], this.field1128[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(B)Z")
    public boolean method379(byte arg0) {
        boolean var2 = true;
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            field1122 = 242;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1129[var4] != -1 && !Model.method127(this.field1129[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Leb;")
    public Model method380(int arg0) {
        Model[] var2 = new Model[5];
        if (arg0 != 35721) {
            field1121 = !field1121;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1129[var4] != -1) {
                var2[var3++] = Model.method126((byte) 4, this.field1129[var4]);
            }
        }
        Model var5 = new Model(var2, field1122, var3);
        for (int var6 = 0; var6 < 6 && this.field1127[var6] != 0; var6++) {
            var5.method140(this.field1127[var6], this.field1128[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field368) {
        }
    }
}
