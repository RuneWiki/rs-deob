import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private int field1108 = -22323;

    @OriginalMember(owner = "lc", name = "d", descriptor = "Z")
    private boolean field1109 = true;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1112 = -1;

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1114 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1115 = new int[6];

    @OriginalMember(owner = "lc", name = "k", descriptor = "[I")
    public int[] field1116 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1117 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1106 = 1000;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private static int field1107 = 926;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1113;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[Llc;")
    public static IdkType[] field1111;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lxb;I)V")
    public static void method375(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(field1106, arg0.method299("idk.dat", null));
        if (arg1 != 0) {
            field1107 = 197;
        }
        field1110 = var2.method231();
        if (field1111 == null) {
            field1111 = new IdkType[field1110];
        }
        for (int var3 = 0; var3 < field1110; var3++) {
            if (field1111[var3] == null) {
                field1111[var3] = new IdkType();
            }
            field1111[var3].method376(8, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILlb;)V")
    public void method376(int arg0, Packet arg1) {
        if (arg0 < 8 || arg0 > 8) {
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
                    this.field1112 = arg1.method229();
                } else if (var4 == 2) {
                    int var5 = arg1.method229();
                    this.field1113 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1113[var6] = arg1.method231();
                    }
                } else if (var4 == 3) {
                    this.field1117 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1114[var4 - 40] = arg1.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1115[var4 - 50] = arg1.method231();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1116[var4 - 60] = arg1.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (this.field1113 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 8) {
            this.field1109 = !this.field1109;
        }
        for (int var3 = 0; var3 < this.field1113.length; var3++) {
            if (!Model.method127(this.field1113[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Leb;")
    public Model method378(boolean arg0) {
        if (arg0) {
            this.field1109 = !this.field1109;
        }
        if (this.field1113 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1113.length];
        for (int var3 = 0; var3 < this.field1113.length; var3++) {
            var2[var3] = Model.method126(this.field1113[var3], this.field1108);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2.length, -550, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1114[var5] != 0; var5++) {
            var4.method140(this.field1114[var5], this.field1115[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        boolean var2 = true;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1116[var4] != -1 && !Model.method127(this.field1116[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(Z)Leb;")
    public Model method380(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1116[var4] != -1) {
                var2[var3++] = Model.method126(this.field1116[var4], this.field1108);
            }
        }
        Model var5 = new Model(var3, -550, var2);
        for (int var6 = 0; var6 < 6 && this.field1114[var6] != 0; var6++) {
            var5.method140(this.field1114[var6], this.field1115[var6]);
        }
        return var5;
    }
}
