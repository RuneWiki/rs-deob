import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "j", descriptor = "Z")
    public boolean field1065 = false;

    @OriginalMember(owner = "kc", name = "k", descriptor = "[I")
    public int[] field1066 = new int[6];

    @OriginalMember(owner = "kc", name = "l", descriptor = "[I")
    public int[] field1067 = new int[6];

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1068 = 128;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1069 = 128;

    @OriginalMember(owner = "kc", name = "a", descriptor = "B")
    private static byte field1056 = 8;

    @OriginalMember(owner = "kc", name = "b", descriptor = "B")
    private static byte field1057 = 4;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    private static int field1059 = -715;

    @OriginalMember(owner = "kc", name = "r", descriptor = "Ls;")
    public static LruCache field1073 = new LruCache(2, 30);

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "kc", name = "g", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "kc", name = "h", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "kc", name = "p", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "kc", name = "q", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "kc", name = "i", descriptor = "Ljc;")
    public SeqType field1064;

    @OriginalMember(owner = "kc", name = "c", descriptor = "Z")
    private static boolean field1058;

    @OriginalMember(owner = "kc", name = "f", descriptor = "[Lkc;")
    public static SpotAnimType[] field1061;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILub;)V")
    public static void method320(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method250(field1057, "spotanim.dat", null), 0);
        field1060 = var2.method211();
        if (arg0 < 4 || arg0 > 4) {
            field1058 = !field1058;
        }
        if (field1061 == null) {
            field1061 = new SpotAnimType[field1060];
        }
        for (int var3 = 0; var3 < field1060; var3++) {
            if (field1061[var3] == null) {
                field1061[var3] = new SpotAnimType();
            }
            field1061[var3].field1062 = var3;
            field1061[var3].method321(field1056, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(BLkb;)V")
    public void method321(byte arg0, Packet arg1) {
        if (arg0 != 8) {
            field1059 = 178;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method209();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1063 = arg1.method211();
                } else if (var3 == 2) {
                    this.field1064 = SeqType.field1043[arg1.method211()];
                } else if (var3 == 3) {
                    this.field1065 = true;
                } else if (var3 == 4) {
                    this.field1068 = arg1.method211();
                } else if (var3 == 5) {
                    this.field1069 = arg1.method211();
                } else if (var3 == 6) {
                    this.field1070 = arg1.method211();
                } else if (var3 == 7) {
                    this.field1071 = arg1.method209();
                } else if (var3 == 8) {
                    this.field1072 = arg1.method209();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1066[var3 - 40] = arg1.method211();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1067[var3 - 50] = arg1.method211();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method322() {
        Model var1 = (Model) field1073.method102((long) this.field1062);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field1063, 6);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1066[0] != 0) {
                var2.method133(this.field1066[var3], this.field1067[var3]);
            }
        }
        field1073.method103(var2, (long) this.field1062, -21658);
        return var2;
    }
}
