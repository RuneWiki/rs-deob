import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private boolean field1140 = true;

    @OriginalMember(owner = "pc", name = "b", descriptor = "B")
    private byte field1141 = 67;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1146 = -1;

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1148 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "[I")
    public int[] field1149 = new int[6];

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1150 = 128;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1151 = 128;

    @OriginalMember(owner = "pc", name = "p", descriptor = "Lt;")
    public static LruCache field1155 = new LruCache(30, 0);

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "pc", name = "o", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "pc", name = "h", descriptor = "Lnc;")
    public SeqType field1147;

    @OriginalMember(owner = "pc", name = "d", descriptor = "[Lpc;")
    public static SpotAnimType[] field1143;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLyb;)V")
    public static void method386(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(16, arg1.method309("spotanim.dat", null));
        if (!arg0) {
            return;
        }
        field1142 = var2.method241();
        if (field1143 == null) {
            field1143 = new SpotAnimType[field1142];
        }
        for (int var3 = 0; var3 < field1142; var3++) {
            if (field1143[var3] == null) {
                field1143[var3] = new SpotAnimType();
            }
            field1143[var3].field1144 = var3;
            field1143[var3].method387(891, var2);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILmb;)V")
    public void method387(int arg0, Packet arg1) {
        int var3 = 94 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1145 = arg1.method241();
                } else if (var4 == 2) {
                    this.field1146 = arg1.method241();
                    if (SeqType.field1121 != null) {
                        this.field1147 = SeqType.field1121[this.field1146];
                    }
                } else if (var4 == 4) {
                    this.field1150 = arg1.method241();
                } else if (var4 == 5) {
                    this.field1151 = arg1.method241();
                } else if (var4 == 6) {
                    this.field1152 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1153 = arg1.method239();
                } else if (var4 == 8) {
                    this.field1154 = arg1.method239();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1148[var4 - 40] = arg1.method241();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1149[var4 - 50] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Lfb;")
    public Model method388() {
        Model var1 = (Model) field1155.method115((long) this.field1144);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method139(this.field1140, this.field1145);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1148[0] != 0) {
                var2.method153(this.field1148[var3], this.field1149[var3]);
            }
        }
        field1155.method116(var2, (long) this.field1144, this.field1141);
        return var2;
    }
}
