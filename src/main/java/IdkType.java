import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private int field1112 = 440;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1113 = false;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public int field1117 = -1;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1119 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1120 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1121 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1122 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "Z")
    private static boolean field1114 = true;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1118;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[Llc;")
    public static IdkType[] field1116;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lxb;I)V")
    public static void method375(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("idk.dat", null), 58);
        field1115 = var2.method231();
        if (field1116 == null) {
            field1116 = new IdkType[field1115];
        }
        for (int var3 = 0; var3 < field1115; var3++) {
            if (field1116[var3] == null) {
                field1116[var3] = new IdkType();
            }
            field1116[var3].method376(var2, 913);
        }
        if (arg1 >= 0) {
            field1114 = !field1114;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;I)V")
    public void method376(Packet arg0, int arg1) {
        int var3 = 9 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1117 = arg0.method229();
                } else if (var4 == 2) {
                    int var5 = arg0.method229();
                    this.field1118 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1118[var6] = arg0.method231();
                    }
                } else if (var4 == 3) {
                    this.field1122 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1119[var4 - 40] = arg0.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1120[var4 - 50] = arg0.method231();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1121[var4 - 60] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Z")
    public boolean method377(boolean arg0) {
        if (this.field1118 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            this.field1112 = -370;
        }
        for (int var3 = 0; var3 < this.field1118.length; var3++) {
            if (!Model.method127(this.field1118[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(Z)Leb;")
    public Model method378(boolean arg0) {
        if (this.field1118 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1118.length];
        for (int var3 = 0; var3 < this.field1118.length; var3++) {
            var2[var3] = Model.method126(this.field1118[var3], 1);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model((byte) 2, var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1119[var5] != 0; var5++) {
            var4.method140(this.field1119[var5], this.field1120[var5]);
        }
        if (arg0) {
            this.field1113 = !this.field1113;
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method379(byte arg0) {
        boolean var2 = true;
        if (arg0 != 7) {
            this.field1113 = !this.field1113;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1121[var3] != -1 && !Model.method127(this.field1121[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Leb;")
    public Model method380(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1121[var4] != -1) {
                var2[var3++] = Model.method126(this.field1121[var4], 1);
            }
        }
        Model var5 = new Model((byte) 2, var2, var3);
        if (arg0 != 0) {
            this.field1112 = 451;
        }
        for (int var6 = 0; var6 < 6 && this.field1119[var6] != 0; var6++) {
            var5.method140(this.field1119[var6], this.field1120[var6]);
        }
        return var5;
    }
}
