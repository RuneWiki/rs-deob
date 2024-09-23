import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private int field1118 = 77;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private int field1119 = 3;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private int field1120 = -8322;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1124 = -1;

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1126 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1127 = new int[6];

    @OriginalMember(owner = "lc", name = "k", descriptor = "[I")
    public int[] field1128 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1129 = false;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "lc", name = "d", descriptor = "Z")
    private static boolean field1121;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1125;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[Llc;")
    public static IdkType[] field1123;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLxb;)V")
    public static void method375(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("idk.dat", null), (byte) -93);
        field1122 = var2.method231();
        if (field1123 == null) {
            field1123 = new IdkType[field1122];
        }
        for (int var3 = 0; var3 < field1122; var3++) {
            if (field1123[var3] == null) {
                field1123[var3] = new IdkType();
            }
            field1123[var3].method376(210, var2);
        }
        if (arg0) {
            field1121 = !field1121;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILlb;)V")
    public void method376(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field1120 = -78;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1124 = arg1.method229();
                } else if (var3 == 2) {
                    int var4 = arg1.method229();
                    this.field1125 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1125[var5] = arg1.method231();
                    }
                } else if (var3 == 3) {
                    this.field1129 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1126[var3 - 40] = arg1.method231();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1127[var3 - 50] = arg1.method231();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1128[var3 - 60] = arg1.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (arg0 <= 0) {
            field1121 = !field1121;
        }
        if (this.field1125 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1125.length; var3++) {
            if (!Model.method127(this.field1125[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method378(byte arg0) {
        if (arg0 != 1) {
            field1121 = !field1121;
        }
        if (this.field1125 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1125.length];
        for (int var3 = 0; var3 < this.field1125.length; var3++) {
            var2[var3] = Model.method126((byte) -14, this.field1125[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2, var2.length, false);
        }
        for (int var5 = 0; var5 < 6 && this.field1126[var5] != 0; var5++) {
            var4.method140(this.field1126[var5], this.field1127[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        boolean var2 = true;
        if (this.field1119 != arg0) {
            this.field1120 = 216;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1128[var3] != -1 && !Model.method127(this.field1128[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)Leb;")
    public Model method380(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        if (arg0 < 9 || arg0 > 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1128[var5] != -1) {
                var2[var3++] = Model.method126((byte) -14, this.field1128[var5]);
            }
        }
        Model var6 = new Model(var2, var3, false);
        for (int var7 = 0; var7 < 6 && this.field1126[var7] != 0; var7++) {
            var6.method140(this.field1126[var7], this.field1127[var7]);
        }
        return var6;
    }
}
