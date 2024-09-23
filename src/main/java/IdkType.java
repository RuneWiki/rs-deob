import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1104 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1106 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1107 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1108 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1109 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private static int field1100 = -474;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1105;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1103;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lxb;I)V")
    public static void method369(Jagfile arg0, int arg1) {
        if (arg1 >= 0) {
            field1100 = -83;
        }
        Packet var2 = new Packet(arg0.method295("idk.dat", null), 185);
        field1102 = var2.method227();
        if (field1103 == null) {
            field1103 = new IdkType[field1102];
        }
        for (int var3 = 0; var3 < field1102; var3++) {
            if (field1103[var3] == null) {
                field1103[var3] = new IdkType();
            }
            field1103[var3].method370(var2, (byte) 81);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;B)V")
    public void method370(Packet arg0, byte arg1) {
        if (arg1 != 81) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method225();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1104 = arg0.method225();
                } else if (var3 == 2) {
                    int var4 = arg0.method225();
                    this.field1105 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1105[var5] = arg0.method227();
                    }
                } else if (var3 == 3) {
                    this.field1109 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1106[var3 - 40] = arg0.method227();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1107[var3 - 50] = arg0.method227();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1108[var3 - 60] = arg0.method227();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method371(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1105 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1105.length; var3++) {
                if (!Model.method126(this.field1105[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Leb;")
    public Model method372(boolean arg0) {
        if (this.field1105 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1105.length];
        for (int var3 = 0; var3 < this.field1105.length; var3++) {
            var2[var3] = Model.method125(this.field1105[var3], (byte) -104);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model((byte) 3, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1106[var5] != 0; var5++) {
            var4.method139(this.field1106[var5], this.field1107[var5]);
        }
        if (!arg0) {
            field1100 = -65;
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method373(int arg0) {
        boolean var2 = true;
        if (arg0 <= 0) {
            this.field1101 = 263;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1108[var3] != -1 && !Model.method126(this.field1108[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(B)Leb;")
    public Model method374(byte arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1108[var4] != -1) {
                var2[var3++] = Model.method125(this.field1108[var4], (byte) -104);
            }
        }
        Model var5 = new Model((byte) 3, var3, var2);
        if (arg0 != -57) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < 6 && this.field1106[var7] != 0; var7++) {
            var5.method139(this.field1106[var7], this.field1107[var7]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field360) {
        }
    }
}
