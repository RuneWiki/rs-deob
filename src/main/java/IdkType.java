import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    private boolean field948 = false;

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    public int field951 = -1;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field953 = new int[6];

    @OriginalMember(owner = "gc", name = "i", descriptor = "[I")
    public int[] field954 = new int[6];

    @OriginalMember(owner = "gc", name = "j", descriptor = "[I")
    public int[] field955 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "k", descriptor = "Z")
    public boolean field956 = false;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private static int field947 = 473;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field946;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field952;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[Lgc;")
    public static IdkType[] field950;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lub;I)V")
    public static void method318(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(363, arg0.read("idk.dat", null, (byte) 2));
        field949 = var2.method218();
        if (field950 == null) {
            field950 = new IdkType[field949];
        }
        for (int var3 = 0; var3 < field949; var3++) {
            if (field950[var3] == null) {
                field950[var3] = new IdkType();
            }
            field950[var3].method319(false, var2);
        }
        int var4 = 87 / arg1;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ZLkb;)V")
    public void method319(boolean arg0, Packet arg1) {
        if (arg0) {
            field946 = 65;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field951 = arg1.method216();
                } else if (var3 == 2) {
                    int var4 = arg1.method216();
                    this.field952 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field952[var5] = arg1.method218();
                    }
                } else if (var3 == 3) {
                    this.field956 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field953[var3 - 40] = arg1.method218();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field954[var3 - 50] = arg1.method218();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field955[var3 - 60] = arg1.method218();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method320() {
        if (this.field952 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field952.length];
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            var1[var2] = new Model(false, this.field952[var2]);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(0, var1, var1.length);
        }
        for (int var4 = 0; var4 < 6 && this.field953[var4] != 0; var4++) {
            var3.method134(this.field953[var4], this.field954[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Z)Leb;")
    public Model method321(boolean arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field955[var4] != -1) {
                var2[var3++] = new Model(false, this.field955[var4]);
            }
        }
        Model var5 = new Model(0, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field953[var6] != 0; var6++) {
            var5.method134(this.field953[var6], this.field954[var6]);
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }
}
