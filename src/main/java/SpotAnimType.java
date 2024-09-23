import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1036 = -1;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1038 = false;

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1039 = new int[6];

    @OriginalMember(owner = "kc", name = "j", descriptor = "[I")
    public int[] field1040 = new int[6];

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1041 = 128;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1042 = 128;

    @OriginalMember(owner = "kc", name = "p", descriptor = "Ls;")
    public static LruCache field1046 = new LruCache(-24, 30);

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private static int field1031;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Ljc;")
    public SeqType field1037;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static SpotAnimType[] field1033;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILub;)V")
    public static void method328(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 64, arg1.method257(null, "spotanim.dat", -31149));
        if (arg0 != -5880) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1032 = var2.method218();
        if (field1033 == null) {
            field1033 = new SpotAnimType[field1032];
        }
        for (int var4 = 0; var4 < field1032; var4++) {
            if (field1033[var4] == null) {
                field1033[var4] = new SpotAnimType();
            }
            field1033[var4].field1034 = var4;
            field1033[var4].method329(var2, true);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lkb;Z)V")
    public void method329(Packet arg0, boolean arg1) {
        if (!arg1) {
            field1031 = 362;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1035 = arg0.method218();
                } else if (var3 == 2) {
                    this.field1036 = arg0.method218();
                    if (SeqType.field1018 != null) {
                        this.field1037 = SeqType.field1018[this.field1036];
                    }
                } else if (var3 == 3) {
                    this.field1038 = true;
                } else if (var3 == 4) {
                    this.field1041 = arg0.method218();
                } else if (var3 == 5) {
                    this.field1042 = arg0.method218();
                } else if (var3 == 6) {
                    this.field1043 = arg0.method218();
                } else if (var3 == 7) {
                    this.field1044 = arg0.method216();
                } else if (var3 == 8) {
                    this.field1045 = arg0.method216();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1039[var3 - 40] = arg0.method218();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1040[var3 - 50] = arg0.method218();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method330() {
        Model var1 = (Model) field1046.method103((long) this.field1034);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(this.field1035, (byte) 1);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1039[0] != 0) {
                var2.method134(this.field1039[var3], this.field1040[var3]);
            }
        }
        field1046.method104(var2, (long) this.field1034, false);
        return var2;
    }
}
