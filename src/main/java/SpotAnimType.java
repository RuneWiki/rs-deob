import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "i", descriptor = "Z")
    public boolean field1047 = false;

    @OriginalMember(owner = "kc", name = "j", descriptor = "[I")
    public int[] field1048 = new int[6];

    @OriginalMember(owner = "kc", name = "k", descriptor = "[I")
    public int[] field1049 = new int[6];

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1050 = 128;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1051 = 128;

    @OriginalMember(owner = "kc", name = "a", descriptor = "B")
    private static byte field1039 = 6;

    @OriginalMember(owner = "kc", name = "c", descriptor = "Z")
    private static boolean field1041 = true;

    @OriginalMember(owner = "kc", name = "q", descriptor = "Ls;")
    public static LruCache field1055 = new LruCache(17295, 30);

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    private static int field1040;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "kc", name = "g", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "kc", name = "p", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Ljc;")
    public SeqType field1046;

    @OriginalMember(owner = "kc", name = "e", descriptor = "[Lkc;")
    public static SpotAnimType[] field1043;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILub;)V")
    public static void method319(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method249("spotanim.dat", true, null), field1041);
        if (arg0 != 0) {
            return;
        }
        field1042 = var2.method210();
        if (field1043 == null) {
            field1043 = new SpotAnimType[field1042];
        }
        for (int var3 = 0; var3 < field1042; var3++) {
            if (field1043[var3] == null) {
                field1043[var3] = new SpotAnimType();
            }
            field1043[var3].field1044 = var3;
            field1043[var3].method320(field1039, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(BLkb;)V")
    public void method320(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            field1040 = -458;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method208();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1045 = arg1.method210();
                } else if (var3 == 2) {
                    this.field1046 = SeqType.field1026[arg1.method210()];
                } else if (var3 == 3) {
                    this.field1047 = true;
                } else if (var3 == 4) {
                    this.field1050 = arg1.method210();
                } else if (var3 == 5) {
                    this.field1051 = arg1.method210();
                } else if (var3 == 6) {
                    this.field1052 = arg1.method210();
                } else if (var3 == 7) {
                    this.field1053 = arg1.method208();
                } else if (var3 == 8) {
                    this.field1054 = arg1.method208();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1048[var3 - 40] = arg1.method210();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1049[var3 - 50] = arg1.method210();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method321() {
        Model var1 = (Model) field1055.method101((long) this.field1044);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field1045, true);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1048[0] != 0) {
                var2.method132(this.field1048[var3], this.field1049[var3]);
            }
        }
        field1055.method102((long) this.field1044, var2, (byte) 3);
        return var2;
    }
}
