import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1043 = false;

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1044 = new int[6];

    @OriginalMember(owner = "kc", name = "j", descriptor = "[I")
    public int[] field1045 = new int[6];

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1046 = 128;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1047 = 128;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private static int field1036 = 3;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    private static int field1037 = 999;

    @OriginalMember(owner = "kc", name = "p", descriptor = "Ls;")
    public static LruCache field1051 = new LruCache(30, (byte) 4);

    @OriginalMember(owner = "kc", name = "c", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Ljc;")
    public SeqType field1042;

    @OriginalMember(owner = "kc", name = "d", descriptor = "[Lkc;")
    public static SpotAnimType[] field1039;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lub;I)V")
    public static void method320(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(0, arg0.method250("spotanim.dat", null, 8));
        field1038 = var2.method211();
        if (arg1 < field1036 || arg1 > field1036) {
            field1037 = -424;
        }
        if (field1039 == null) {
            field1039 = new SpotAnimType[field1038];
        }
        for (int var3 = 0; var3 < field1038; var3++) {
            if (field1039[var3] == null) {
                field1039[var3] = new SpotAnimType();
            }
            field1039[var3].field1040 = var3;
            field1039[var3].method321(var2, 0);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lkb;I)V")
    public void method321(Packet arg0, int arg1) {
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
                    this.field1041 = arg0.method211();
                } else if (var4 == 2) {
                    this.field1042 = SeqType.field1023[arg0.method211()];
                } else if (var4 == 3) {
                    this.field1043 = true;
                } else if (var4 == 4) {
                    this.field1046 = arg0.method211();
                } else if (var4 == 5) {
                    this.field1047 = arg0.method211();
                } else if (var4 == 6) {
                    this.field1048 = arg0.method211();
                } else if (var4 == 7) {
                    this.field1049 = arg0.method209();
                } else if (var4 == 8) {
                    this.field1050 = arg0.method209();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1044[var4 - 40] = arg0.method211();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1045[var4 - 50] = arg0.method211();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method322() {
        Model var1 = (Model) field1051.method102((long) this.field1040);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(0, this.field1041);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1044[0] != 0) {
                var2.method133(this.field1044[var3], this.field1045[var3]);
            }
        }
        field1051.method103((long) this.field1040, 1567, var2);
        return var2;
    }
}
