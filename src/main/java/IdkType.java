import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    private int field945 = 638;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    public int field948 = -1;

    @OriginalMember(owner = "gc", name = "i", descriptor = "[I")
    public int[] field950 = new int[6];

    @OriginalMember(owner = "gc", name = "j", descriptor = "[I")
    public int[] field951 = new int[6];

    @OriginalMember(owner = "gc", name = "k", descriptor = "[I")
    public int[] field952 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "a", descriptor = "B")
    private static byte field942 = 6;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private static boolean field943 = true;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    private static boolean field944 = true;

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field949;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[Lgc;")
    public static IdkType[] field947;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILub;)V")
    public static void method309(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("idk.dat", true, null), field944);
        field946 = var2.method210();
        if (arg0 != 0) {
            field943 = !field943;
        }
        if (field947 == null) {
            field947 = new IdkType[field946];
        }
        for (int var3 = 0; var3 < field946; var3++) {
            if (field947[var3] == null) {
                field947[var3] = new IdkType();
            }
            field947[var3].method310(field942, var2);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BLkb;)V")
    public void method310(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method208();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field948 = arg1.method208();
                } else if (var3 == 2) {
                    int var4 = arg1.method208();
                    this.field949 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field949[var5] = arg1.method210();
                    }
                } else if (var3 >= 40 && var3 < 50) {
                    this.field950[var3 - 40] = arg1.method210();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field951[var3 - 50] = arg1.method210();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field952[var3 - 60] = arg1.method210();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method311() {
        if (this.field949 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field949.length];
        for (int var2 = 0; var2 < this.field949.length; var2++) {
            var1[var2] = new Model(this.field949[var2], true);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(16925, var1.length, var1);
        }
        for (int var4 = 0; var4 < 6 && this.field950[var4] != 0; var4++) {
            var3.method132(this.field950[var4], this.field951[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(B)Leb;")
    public Model method312(byte arg0) {
        if (arg0 != 88) {
            this.field945 = 199;
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field952[var4] != -1) {
                var2[var3++] = new Model(this.field952[var4], true);
            }
        }
        Model var5 = new Model(16925, var3, var2);
        for (int var6 = 0; var6 < 6 && this.field950[var6] != 0; var6++) {
            var5.method132(this.field950[var6], this.field951[var6]);
        }
        return var5;
    }
}
