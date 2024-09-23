import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class SpotAnimType {

    @OriginalMember(owner = "kc", name = "f", descriptor = "I")
    public int field1046 = -1;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Z")
    public boolean field1048 = false;

    @OriginalMember(owner = "kc", name = "i", descriptor = "[I")
    public int[] field1049 = new int[6];

    @OriginalMember(owner = "kc", name = "j", descriptor = "[I")
    public int[] field1050 = new int[6];

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1051 = 128;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1052 = 128;

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private static int field1041 = 473;

    @OriginalMember(owner = "kc", name = "p", descriptor = "Ls;")
    public static LruCache field1056 = new LruCache((byte) 0, 30);

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "kc", name = "o", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Ljc;")
    public SeqType field1047;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static SpotAnimType[] field1043;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(Lub;I)V")
    public static void method328(Jagfile arg0, int arg1) {
        int var2 = 91 / arg1;
        Packet var3 = new Packet(363, arg0.read("spotanim.dat", null, (byte) 2));
        field1042 = var3.method218();
        if (field1043 == null) {
            field1043 = new SpotAnimType[field1042];
        }
        for (int var4 = 0; var4 < field1042; var4++) {
            if (field1043[var4] == null) {
                field1043[var4] = new SpotAnimType();
            }
            field1043[var4].field1044 = var4;
            field1043[var4].method329(false, var3);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLkb;)V")
    public void method329(boolean arg0, Packet arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method216();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1045 = arg1.method218();
                } else if (var4 == 2) {
                    this.field1046 = arg1.method218();
                    if (SeqType.field1028 != null) {
                        this.field1047 = SeqType.field1028[this.field1046];
                    }
                } else if (var4 == 3) {
                    this.field1048 = true;
                } else if (var4 == 4) {
                    this.field1051 = arg1.method218();
                } else if (var4 == 5) {
                    this.field1052 = arg1.method218();
                } else if (var4 == 6) {
                    this.field1053 = arg1.method218();
                } else if (var4 == 7) {
                    this.field1054 = arg1.method216();
                } else if (var4 == 8) {
                    this.field1055 = arg1.method216();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1049[var4 - 40] = arg1.method218();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1050[var4 - 50] = arg1.method218();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "()Leb;")
    public Model method330() {
        Model var1 = (Model) field1056.method103((long) this.field1044);
        if (var1 != null) {
            return var1;
        }
        Model var2 = new Model(false, this.field1045);
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1049[0] != 0) {
                var2.method134(this.field1049[var3], this.field1050[var3]);
            }
        }
        field1056.method104(6, (long) this.field1044, var2);
        return var2;
    }
}
