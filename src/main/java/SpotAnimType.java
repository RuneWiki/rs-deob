import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private boolean field1150 = true;

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    private int field1151 = 848;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1158 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "[I")
    public int[] field1159 = new int[6];

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1160 = 128;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1161 = 128;

    @OriginalMember(owner = "pc", name = "p", descriptor = "Ls;")
    public static LruCache field1165 = new LruCache(30, 0);

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "pc", name = "o", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "pc", name = "h", descriptor = "Lnc;")
    public SeqType field1157;

    @OriginalMember(owner = "pc", name = "d", descriptor = "[Lpc;")
    public static SpotAnimType[] field1153;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILxb;)V")
    public static void method377(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 3, arg1.method294("spotanim.dat", null));
        field1152 = var2.method226();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1153 == null) {
            field1153 = new SpotAnimType[field1152];
        }
        for (int var4 = 0; var4 < field1152; var4++) {
            if (field1153[var4] == null) {
                field1153[var4] = new SpotAnimType();
            }
            field1153[var4].field1154 = var4;
            field1153[var4].method378(var2, -32477);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;I)V")
    public void method378(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1155 = arg0.method226();
                } else if (var3 == 2) {
                    this.field1156 = arg0.method226();
                    if (SeqType.field1131 != null) {
                        this.field1157 = SeqType.field1131[this.field1156];
                    }
                } else if (var3 == 4) {
                    this.field1160 = arg0.method226();
                } else if (var3 == 5) {
                    this.field1161 = arg0.method226();
                } else if (var3 == 6) {
                    this.field1162 = arg0.method226();
                } else if (var3 == 7) {
                    this.field1163 = arg0.method224();
                } else if (var3 == 8) {
                    this.field1164 = arg0.method224();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1158[var3 - 40] = arg0.method226();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1159[var3 - 50] = arg0.method226();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method379() {
        Model var1 = (Model) field1165.method101((long) this.field1154);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method125(this.field1150, this.field1155);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1158[0] != 0) {
                var2.method139(this.field1158[var3], this.field1159[var3]);
            }
        }
        field1165.method102((long) this.field1154, var2, this.field1151);
        return var2;
    }
}
