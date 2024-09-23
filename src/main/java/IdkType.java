import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class IdkType {

    @OriginalMember(owner = "cc", name = "e", descriptor = "I")
    public int field853 = -1;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[I")
    public int[] field855 = new int[6];

    @OriginalMember(owner = "cc", name = "h", descriptor = "[I")
    public int[] field856 = new int[6];

    @OriginalMember(owner = "cc", name = "i", descriptor = "[I")
    public int[] field857 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field849;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field850;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public int[] field854;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    public static IdkType[] field852;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Ltb;I)V")
    public static void method271(Jagfile arg0, int arg1) {
        if (arg1 != -47511) {
            field849 = !field849;
        }
        Packet var2 = new Packet(arg0.method225(0, null, "idk.dat"), (byte) 63);
        field851 = var2.method187();
        if (field852 == null) {
            field852 = new IdkType[field851];
        }
        for (int var3 = 0; var3 < field851; var3++) {
            if (field852[var3] == null) {
                field852[var3] = new IdkType();
            }
            field852[var3].method272((byte) 4, var2);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BLjb;)V")
    public void method272(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method185();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field853 = arg1.method185();
                } else if (var4 == 2) {
                    int var5 = arg1.method185();
                    this.field854 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field854[var6] = arg1.method187();
                    }
                } else if (var4 >= 40 && var4 < 50) {
                    this.field855[var4 - 40] = arg1.method187();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field856[var4 - 50] = arg1.method187();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field857[var4 - 60] = arg1.method187();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "()Ldb;")
    public Model method273() {
        if (this.field854 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field854.length];
        for (int var2 = 0; var2 < this.field854.length; var2++) {
            var1[var2] = new Model(this.field854[var2], field850);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(var1.length, false, var1);
        }
        for (int var4 = 0; var4 < 6 && this.field855[var4] != 0; var4++) {
            var3.method115(this.field855[var4], this.field856[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)Ldb;")
    public Model method274(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field857[var4] != -1) {
                var2[var3++] = new Model(this.field857[var4], field850);
            }
        }
        Model var5 = new Model(var3, false, var2);
        for (int var6 = 0; var6 < 6 && this.field855[var6] != 0; var6++) {
            var5.method115(this.field855[var6], this.field856[var6]);
        }
        return var5;
    }
}
