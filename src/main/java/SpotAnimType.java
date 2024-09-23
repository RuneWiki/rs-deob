import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SpotAnimType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private int field1094 = -797;

    @OriginalMember(owner = "nc", name = "b", descriptor = "Z")
    private boolean field1095 = true;

    @OriginalMember(owner = "nc", name = "g", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "nc", name = "i", descriptor = "Z")
    public boolean field1102 = false;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1103 = new int[6];

    @OriginalMember(owner = "nc", name = "k", descriptor = "[I")
    public int[] field1104 = new int[6];

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1105 = 128;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1106 = 128;

    @OriginalMember(owner = "nc", name = "q", descriptor = "Lt;")
    public static LruCache field1110 = new LruCache(5, 30);

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "nc", name = "f", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "nc", name = "h", descriptor = "Lmc;")
    public SeqType field1101;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SpotAnimType[] field1097;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lyb;I)V")
    public static void method375(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("spotanim.dat", null), true);
        int var3 = 3 / arg1;
        field1096 = var2.method233();
        if (field1097 == null) {
            field1097 = new SpotAnimType[field1096];
        }
        for (int var4 = 0; var4 < field1096; var4++) {
            if (field1097[var4] == null) {
                field1097[var4] = new SpotAnimType();
            }
            field1097[var4].field1098 = var4;
            field1097[var4].method376(3251, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILmb;)V")
    public void method376(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            this.field1095 = !this.field1095;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1099 = arg1.method233();
                } else if (var3 == 2) {
                    this.field1100 = arg1.method233();
                    if (SeqType.field1081 != null) {
                        this.field1101 = SeqType.field1081[this.field1100];
                    }
                } else if (var3 == 3) {
                    this.field1102 = true;
                } else if (var3 == 4) {
                    this.field1105 = arg1.method233();
                } else if (var3 == 5) {
                    this.field1106 = arg1.method233();
                } else if (var3 == 6) {
                    this.field1107 = arg1.method233();
                } else if (var3 == 7) {
                    this.field1108 = arg1.method231();
                } else if (var3 == 8) {
                    this.field1109 = arg1.method231();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1103[var3 - 40] = arg1.method233();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1104[var3 - 50] = arg1.method233();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "()Lfb;")
    public Model method377() {
        Model var1 = (Model) field1110.method113((long) this.field1098);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method135(this.field1099, this.field1094);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1103[0] != 0) {
                var2.method149(this.field1103[var3], this.field1104[var3]);
            }
        }
        field1110.method114(var2, (long) this.field1098, 7);
        return var2;
    }
}
