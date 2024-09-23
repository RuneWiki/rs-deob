import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hc")
public class SpotAnimType {

    @OriginalMember(owner = "hc", name = "f", descriptor = "Z")
    public boolean field956 = false;

    @OriginalMember(owner = "hc", name = "g", descriptor = "[I")
    public int[] field957 = new int[6];

    @OriginalMember(owner = "hc", name = "h", descriptor = "[I")
    public int[] field958 = new int[6];

    @OriginalMember(owner = "hc", name = "i", descriptor = "Ls;")
    public static LruCache field959 = new LruCache(-24094, 30);

    @OriginalMember(owner = "hc", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "hc", name = "c", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "hc", name = "d", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "hc", name = "e", descriptor = "Lgc;")
    public SeqType field955;

    @OriginalMember(owner = "hc", name = "b", descriptor = "[Lhc;")
    public static SpotAnimType[] field952;

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ZLub;)V")
    public static void method297(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method242((byte) 6, null, "spotanim.dat"), 4);
        field951 = var2.method203();
        if (field952 == null) {
            field952 = new SpotAnimType[field951];
        }
        for (int var3 = 0; var3 < field951; var3++) {
            if (field952[var3] == null) {
                field952[var3] = new SpotAnimType();
            }
            field952[var3].field953 = var3;
            field952[var3].method298(213, var2);
        }
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "(ILkb;)V")
    public void method298(int arg0, Packet arg1) {
        int var3 = 90 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method201();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field954 = arg1.method203();
                } else if (var4 == 2) {
                    this.field955 = SeqType.field938[arg1.method203()];
                } else if (var4 == 3) {
                    this.field956 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field957[var4 - 40] = arg1.method203();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field958[var4 - 50] = arg1.method203();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "hc", name = "a", descriptor = "()Leb;")
    public Model method299() {
        Model var1 = (Model) field959.method99((long) this.field953);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field954, 298);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field957[0] != 0) {
                var2.method129(this.field957[var3], this.field958[var3]);
            }
        }
        field959.method100((long) this.field953, 7, var2);
        return var2;
    }
}
