import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class SpotAnimType {

    @OriginalMember(owner = "gc", name = "i", descriptor = "Z")
    public boolean field948 = false;

    @OriginalMember(owner = "gc", name = "j", descriptor = "[I")
    public int[] field949 = new int[6];

    @OriginalMember(owner = "gc", name = "k", descriptor = "[I")
    public int[] field950 = new int[6];

    @OriginalMember(owner = "gc", name = "c", descriptor = "B")
    private static byte field942 = 2;

    @OriginalMember(owner = "gc", name = "l", descriptor = "Lr;")
    public static LruCache field951 = new LruCache(-947, 30);

    @OriginalMember(owner = "gc", name = "d", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "gc", name = "f", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "gc", name = "g", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "gc", name = "h", descriptor = "Lfc;")
    public SeqType field947;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field940;

    @OriginalMember(owner = "gc", name = "b", descriptor = "Z")
    private static boolean field941;

    @OriginalMember(owner = "gc", name = "e", descriptor = "[Lgc;")
    public static SpotAnimType[] field944;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Ltb;I)V")
    public static void method281(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method225(0, null, "spotanim.dat"), (byte) 63);
        field943 = var2.method187();
        if (field944 == null) {
            field944 = new SpotAnimType[field943];
        }
        for (int var3 = 0; var3 < field943; var3++) {
            if (field944[var3] == null) {
                field944[var3] = new SpotAnimType();
            }
            field944[var3].field945 = var3;
            field944[var3].method282((byte) 4, var2);
        }
        if (arg1 != -47511) {
            field940 = !field940;
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(BLjb;)V")
    public void method282(byte arg0, Packet arg1) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.method185();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field946 = arg1.method187();
                } else if (var4 == 2) {
                    this.field947 = SeqType.field927[arg1.method187()];
                } else if (var4 == 3) {
                    this.field948 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field949[var4 - 40] = arg1.method187();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field950[var4 - 50] = arg1.method187();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Ldb;")
    public Model method283() {
        Model var1 = (Model) field951.method84((long) this.field945);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field946, field941);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field949[0] != 0) {
                var2.method115(this.field949[var3], this.field950[var3]);
            }
        }
        field951.method85(var2, (long) this.field945, field942);
        return var2;
    }
}
