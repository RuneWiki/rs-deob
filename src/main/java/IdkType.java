import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    public int field964 = -1;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field966 = new int[6];

    @OriginalMember(owner = "gc", name = "i", descriptor = "[I")
    public int[] field967 = new int[6];

    @OriginalMember(owner = "gc", name = "j", descriptor = "[I")
    public int[] field968 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "k", descriptor = "Z")
    public boolean field969 = false;

    @OriginalMember(owner = "gc", name = "a", descriptor = "B")
    private static byte field959 = 8;

    @OriginalMember(owner = "gc", name = "b", descriptor = "B")
    private static byte field960 = 4;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    private static boolean field961 = true;

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field965;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[Lgc;")
    public static IdkType[] field963;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILub;)V")
    public static void method310(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field960, "idk.dat", null), 0);
        field962 = var2.method211();
        if (arg0 != 4) {
            return;
        }
        if (field963 == null) {
            field963 = new IdkType[field962];
        }
        for (int var3 = 0; var3 < field962; var3++) {
            if (field963[var3] == null) {
                field963[var3] = new IdkType();
            }
            field963[var3].method311(field959, var2);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BLkb;)V")
    public void method311(byte arg0, Packet arg1) {
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            field961 = !field961;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method209();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field964 = arg1.method209();
                } else if (var4 == 2) {
                    int var5 = arg1.method209();
                    this.field965 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field965[var6] = arg1.method211();
                    }
                } else if (var4 == 3) {
                    this.field969 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field966[var4 - 40] = arg1.method211();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field967[var4 - 50] = arg1.method211();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field968[var4 - 60] = arg1.method211();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method312() {
        if (this.field965 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field965.length];
        for (int var2 = 0; var2 < this.field965.length; var2++) {
            var1[var2] = new Model(this.field965[var2], 6);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(20363, var1, var1.length);
        }
        for (int var4 = 0; var4 < 6 && this.field966[var4] != 0; var4++) {
            var3.method133(this.field966[var4], this.field967[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Leb;")
    public Model method313(int arg0) {
        int var2 = 97 / arg0;
        Model[] var3 = new Model[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field968[var5] != -1) {
                var3[var4++] = new Model(this.field968[var5], 6);
            }
        }
        Model var6 = new Model(20363, var3, var4);
        for (int var7 = 0; var7 < 6 && this.field966[var7] != 0; var7++) {
            var6.method133(this.field966[var7], this.field967[var7]);
        }
        return var6;
    }
}
