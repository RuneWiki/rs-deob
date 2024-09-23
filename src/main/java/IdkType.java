import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public int field1088 = -1;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1090 = new int[6];

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1091 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1092 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "i", descriptor = "Z")
    public boolean field1093 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1085 = 2;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[I")
    public int[] field1089;

    @OriginalMember(owner = "lc", name = "c", descriptor = "[Llc;")
    public static IdkType[] field1087;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method377(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(arg0.method309("idk.dat", null), 337);
        field1086 = var2.method241();
        if (!arg1) {
            field1085 = 404;
        }
        if (field1087 == null) {
            field1087 = new IdkType[field1086];
        }
        for (int var3 = 0; var3 < field1086; var3++) {
            if (field1087[var3] == null) {
                field1087[var3] = new IdkType();
            }
            field1087[var3].method378(0, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILmb;)V")
    public void method378(int arg0, Packet arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1088 = arg1.method239();
                } else if (var3 == 2) {
                    int var4 = arg1.method239();
                    this.field1089 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1089[var5] = arg1.method241();
                    }
                } else if (var3 == 3) {
                    this.field1093 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1090[var3 - 40] = arg1.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1091[var3 - 50] = arg1.method241();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1092[var3 - 60] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        if (arg0 >= 0) {
            field1085 = 465;
        }
        if (this.field1089 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1089.length; var3++) {
            if (!Model.method140(this.field1089[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Lfb;")
    public Model method380(byte arg0) {
        if (this.field1089 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1089.length];
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1089.length; var3++) {
            var2[var3] = Model.method139(this.field1089[var3], (byte) -18);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model((byte) 1, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1090[var5] != 0; var5++) {
            var4.method153(this.field1090[var5], this.field1091[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method381(int arg0) {
        int var2 = 59 / arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1092[var4] != -1 && !Model.method140(this.field1092[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)Lfb;")
    public Model method382(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1092[var4] != -1) {
                var2[var3++] = Model.method139(this.field1092[var4], (byte) -18);
            }
        }
        Model var5 = new Model((byte) 1, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field1090[var6] != 0; var6++) {
            var5.method153(this.field1090[var6], this.field1091[var6]);
        }
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field375) {
        }
    }
}
