import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class IdkType {

    @OriginalMember(owner = "dc", name = "c", descriptor = "I")
    public int field864 = -1;

    @OriginalMember(owner = "dc", name = "e", descriptor = "[I")
    public int[] field866 = new int[6];

    @OriginalMember(owner = "dc", name = "f", descriptor = "[I")
    public int[] field867 = new int[6];

    @OriginalMember(owner = "dc", name = "g", descriptor = "[I")
    public int[] field868 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "dc", name = "d", descriptor = "[I")
    public int[] field865;

    @OriginalMember(owner = "dc", name = "b", descriptor = "[Ldc;")
    public static IdkType[] field863;

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ZLub;)V")
    public static void method287(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "idk.dat"), 4);
        field862 = var2.method203();
        if (field863 == null) {
            field863 = new IdkType[field862];
        }
        for (int var3 = 0; var3 < field862; var3++) {
            if (field863[var3] == null) {
                field863[var3] = new IdkType();
            }
            field863[var3].method288(213, var2);
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILkb;)V")
    public void method288(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method201();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field864 = arg1.method201();
                } else if (var4 == 2) {
                    int var5 = arg1.method201();
                    this.field865 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field865[var6] = arg1.method203();
                    }
                } else if (var4 >= 40 && var4 < 50) {
                    this.field866[var4 - 40] = arg1.method203();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field867[var4 - 50] = arg1.method203();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field868[var4 - 60] = arg1.method203();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "()Leb;")
    public Model method289() {
        if (this.field865 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field865.length];
        for (int var2 = 0; var2 < this.field865.length; var2++) {
            var1[var2] = new Model(this.field865[var2], 298);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(false, var1.length, var1);
        }
        for (int var4 = 0; var4 < 6 && this.field866[var4] != 0; var4++) {
            var3.method129(this.field866[var4], this.field867[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(I)Leb;")
    public Model method290(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field868[var4] != -1) {
                var2[var3++] = new Model(this.field868[var4], 298);
            }
        }
        Model var5 = new Model(false, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field866[var6] != 0; var6++) {
            var5.method129(this.field866[var6], this.field867[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "dc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field289) {
        }
    }
}
