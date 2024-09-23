import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public int field946 = -1;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    public int[] field948 = new int[6];

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field949 = new int[6];

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field950 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "i", descriptor = "Z")
    public boolean field951 = false;

    @OriginalMember(owner = "gc", name = "a", descriptor = "I")
    private static int field943 = 3;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[I")
    public int[] field947;

    @OriginalMember(owner = "gc", name = "c", descriptor = "[Lgc;")
    public static IdkType[] field945;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lub;I)V")
    public static void method310(Jagfile arg0, int arg1) {
        if (field943 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(0, arg0.method250("idk.dat", null, 8));
        field944 = var3.method211();
        if (field945 == null) {
            field945 = new IdkType[field944];
        }
        for (int var4 = 0; var4 < field944; var4++) {
            if (field945[var4] == null) {
                field945[var4] = new IdkType();
            }
            field945[var4].method311(var3, 0);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lkb;I)V")
    public void method311(Packet arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method209();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field946 = arg0.method209();
                } else if (var4 == 2) {
                    int var5 = arg0.method209();
                    this.field947 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field947[var6] = arg0.method211();
                    }
                } else if (var4 == 3) {
                    this.field951 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field948[var4 - 40] = arg0.method211();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field949[var4 - 50] = arg0.method211();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field950[var4 - 60] = arg0.method211();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method312() {
        if (this.field947 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field947.length];
        for (int var2 = 0; var2 < this.field947.length; var2++) {
            var1[var2] = new Model(0, this.field947[var2]);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(6, var1.length, var1);
        }
        for (int var4 = 0; var4 < 6 && this.field948[var4] != 0; var4++) {
            var3.method133(this.field948[var4], this.field949[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Leb;")
    public Model method313(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field950[var4] != -1) {
                var2[var3++] = new Model(0, this.field950[var4]);
            }
        }
        Model var5 = new Model(6, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field948[var6] != 0; var6++) {
            var5.method133(this.field948[var6], this.field949[var6]);
        }
        return var5;
    }
}
