import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public int field925 = -1;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    public int[] field927 = new int[6];

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field928 = new int[6];

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field929 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "i", descriptor = "Z")
    public boolean field930 = false;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field922 = true;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    public int[] field926;

    @OriginalMember(owner = "gc", name = "c", descriptor = "[Lgc;")
    public static IdkType[] field924;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILub;)V")
    public static void method310(int arg0, Jagfile arg1) {
        if (arg0 < 9 || arg0 > 9) {
            return;
        }
        Packet var2 = new Packet(575, arg1.method250(null, 3, "idk.dat"));
        field923 = var2.method211();
        if (field924 == null) {
            field924 = new IdkType[field923];
        }
        for (int var3 = 0; var3 < field923; var3++) {
            if (field924[var3] == null) {
                field924[var3] = new IdkType();
            }
            field924[var3].method311(var2, (byte) 6);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lkb;B)V")
    public void method311(Packet arg0, byte arg1) {
        if (arg1 != 6) {
            field922 = !field922;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field925 = arg0.method209();
                } else if (var3 == 2) {
                    int var4 = arg0.method209();
                    this.field926 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field926[var5] = arg0.method211();
                    }
                } else if (var3 == 3) {
                    this.field930 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field927[var3 - 40] = arg0.method211();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field928[var3 - 50] = arg0.method211();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field929[var3 - 60] = arg0.method211();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method312() {
        if (this.field926 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field926.length];
        for (int var2 = 0; var2 < this.field926.length; var2++) {
            var1[var2] = new Model(-26552, this.field926[var2]);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(0, var1, var1.length);
        }
        for (int var4 = 0; var4 < 6 && this.field927[var4] != 0; var4++) {
            var3.method133(this.field927[var4], this.field928[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Leb;")
    public Model method313(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field929[var4] != -1) {
                var2[var3++] = new Model(-26552, this.field929[var4]);
            }
        }
        Model var5 = new Model(0, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field927[var6] != 0; var6++) {
            var5.method133(this.field927[var6], this.field928[var6]);
        }
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }
}
