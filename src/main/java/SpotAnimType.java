import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qc")
public class SpotAnimType {

    @OriginalMember(owner = "qc", name = "a", descriptor = "Z")
    private boolean field1155 = true;

    @OriginalMember(owner = "qc", name = "g", descriptor = "I")
    public int field1161 = -1;

    @OriginalMember(owner = "qc", name = "i", descriptor = "[I")
    public int[] field1163 = new int[6];

    @OriginalMember(owner = "qc", name = "j", descriptor = "[I")
    public int[] field1164 = new int[6];

    @OriginalMember(owner = "qc", name = "k", descriptor = "I")
    public int field1165 = 128;

    @OriginalMember(owner = "qc", name = "l", descriptor = "I")
    public int field1166 = 128;

    @OriginalMember(owner = "qc", name = "b", descriptor = "I")
    private static int field1156 = 6771;

    @OriginalMember(owner = "qc", name = "p", descriptor = "Ls;")
    public static LruCache field1170 = new LruCache(30, false);

    @OriginalMember(owner = "qc", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "qc", name = "e", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "qc", name = "f", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "qc", name = "m", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "qc", name = "n", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "qc", name = "o", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "qc", name = "h", descriptor = "Loc;")
    public SeqType field1162;

    @OriginalMember(owner = "qc", name = "d", descriptor = "[Lqc;")
    public static SpotAnimType[] field1158;

    @OriginalMember(owner = "qc", name = "a", descriptor = "(ILyb;)V")
    public static void method381(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method298("spotanim.dat", null), true);
        field1157 = var2.method230();
        if (field1156 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1158 == null) {
            field1158 = new SpotAnimType[field1157];
        }
        for (int var4 = 0; var4 < field1157; var4++) {
            if (field1158[var4] == null) {
                field1158[var4] = new SpotAnimType();
            }
            field1158[var4].field1159 = var4;
            field1158[var4].method382((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "(BLmb;)V")
    public void method382(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            this.field1155 = !this.field1155;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method228();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1160 = arg1.method230();
                } else if (var3 == 2) {
                    this.field1161 = arg1.method230();
                    if (SeqType.field1136 != null) {
                        this.field1162 = SeqType.field1136[this.field1161];
                    }
                } else if (var3 == 4) {
                    this.field1165 = arg1.method230();
                } else if (var3 == 5) {
                    this.field1166 = arg1.method230();
                } else if (var3 == 6) {
                    this.field1167 = arg1.method230();
                } else if (var3 == 7) {
                    this.field1168 = arg1.method228();
                } else if (var3 == 8) {
                    this.field1169 = arg1.method228();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1163[var3 - 40] = arg1.method230();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1164[var3 - 50] = arg1.method230();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "qc", name = "a", descriptor = "()Leb;")
    public Model method383() {
        Model var1 = (Model) field1170.method101((long) this.field1159);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method125(this.field1160, 196);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1163[0] != 0) {
                var2.method139(this.field1163[var3], this.field1164[var3]);
            }
        }
        field1170.method102(var2, (long) this.field1159, true);
        return var2;
    }
}
