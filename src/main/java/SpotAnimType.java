import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private boolean field1152 = false;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1157 = -1;

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1159 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1160 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1161 = 128;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1162 = 128;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Ls;")
    public static LruCache field1166 = new LruCache(30, 0);

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "pc", name = "g", descriptor = "Lnc;")
    public SeqType field1158;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static SpotAnimType[] field1154;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLxb;)V")
    public static void method377(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method294("spotanim.dat", null), (byte) 1);
        field1153 = var2.method226();
        if (field1154 == null) {
            field1154 = new SpotAnimType[field1153];
        }
        for (int var3 = 0; var3 < field1153; var3++) {
            if (field1154[var3] == null) {
                field1154[var3] = new SpotAnimType();
            }
            field1154[var3].field1155 = var3;
            field1154[var3].method378((byte) 2, var2);
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(BLlb;)V")
    public void method378(byte arg0, Packet arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field1152 = !this.field1152;
        }
        while (true) {
            while (true) {
                int var4 = arg1.method224();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1156 = arg1.method226();
                } else if (var4 == 2) {
                    this.field1157 = arg1.method226();
                    if (SeqType.field1133 != null) {
                        this.field1158 = SeqType.field1133[this.field1157];
                    }
                } else if (var4 == 4) {
                    this.field1161 = arg1.method226();
                } else if (var4 == 5) {
                    this.field1162 = arg1.method226();
                } else if (var4 == 6) {
                    this.field1163 = arg1.method226();
                } else if (var4 == 7) {
                    this.field1164 = arg1.method224();
                } else if (var4 == 8) {
                    this.field1165 = arg1.method224();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1159[var4 - 40] = arg1.method226();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1160[var4 - 50] = arg1.method226();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method379() {
        Model var1 = (Model) field1166.method101((long) this.field1155);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method125(this.field1156, 6);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1159[0] != 0) {
                var2.method139(this.field1159[var3], this.field1160[var3]);
            }
        }
        field1166.method102(201, (long) this.field1155, var2);
        return var2;
    }
}
