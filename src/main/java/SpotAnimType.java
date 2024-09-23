import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1151 = -1;

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1153 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1154 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1155 = 128;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1156 = 128;

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    private static int field1146 = -474;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Ls;")
    public static LruCache field1160 = new LruCache(false, 30);

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "pc", name = "g", descriptor = "Lnc;")
    public SeqType field1152;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static SpotAnimType[] field1148;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lxb;I)V")
    public static void method378(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method295("spotanim.dat", null), 185);
        if (arg1 >= 0) {
            return;
        }
        field1147 = var2.method227();
        if (field1148 == null) {
            field1148 = new SpotAnimType[field1147];
        }
        for (int var3 = 0; var3 < field1147; var3++) {
            if (field1148[var3] == null) {
                field1148[var3] = new SpotAnimType();
            }
            field1148[var3].field1149 = var3;
            field1148[var3].method379(var2, (byte) 81);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;B)V")
    public void method379(Packet arg0, byte arg1) {
        if (arg1 != 81) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method225();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1150 = arg0.method227();
                } else if (var4 == 2) {
                    this.field1151 = arg0.method227();
                    if (SeqType.field1126 != null) {
                        this.field1152 = SeqType.field1126[this.field1151];
                    }
                } else if (var4 == 4) {
                    this.field1155 = arg0.method227();
                } else if (var4 == 5) {
                    this.field1156 = arg0.method227();
                } else if (var4 == 6) {
                    this.field1157 = arg0.method227();
                } else if (var4 == 7) {
                    this.field1158 = arg0.method225();
                } else if (var4 == 8) {
                    this.field1159 = arg0.method225();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1153[var4 - 40] = arg0.method227();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1154[var4 - 50] = arg0.method227();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method380() {
        Model var1 = (Model) field1160.method101((long) this.field1149);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method125(this.field1150, (byte) -104);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1153[0] != 0) {
                var2.method139(this.field1153[var3], this.field1154[var3]);
            }
        }
        field1160.method102(400, var2, (long) this.field1149);
        return var2;
    }
}
