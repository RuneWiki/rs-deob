import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private boolean field1170 = false;

    @OriginalMember(owner = "pc", name = "b", descriptor = "B")
    private byte field1171 = 4;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1176 = -1;

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1178 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "[I")
    public int[] field1179 = new int[6];

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1180 = 128;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1181 = 128;

    @OriginalMember(owner = "pc", name = "p", descriptor = "Ls;")
    public static LruCache field1185 = new LruCache((byte) 7, 30);

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "pc", name = "o", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "pc", name = "h", descriptor = "Lnc;")
    public SeqType field1177;

    @OriginalMember(owner = "pc", name = "d", descriptor = "[Lpc;")
    public static SpotAnimType[] field1173;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLxb;)V")
    public static void method380(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method297("spotanim.dat", null), 15787);
        field1172 = var2.method229();
        if (!arg0) {
            return;
        }
        if (field1173 == null) {
            field1173 = new SpotAnimType[field1172];
        }
        for (int var3 = 0; var3 < field1172; var3++) {
            if (field1173[var3] == null) {
                field1173[var3] = new SpotAnimType();
            }
            field1173[var3].field1174 = var3;
            field1173[var3].method381(false, var2);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLlb;)V")
    public void method381(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method227();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1175 = arg1.method229();
                } else if (var3 == 2) {
                    this.field1176 = arg1.method229();
                    if (SeqType.field1150 != null) {
                        this.field1177 = SeqType.field1150[this.field1176];
                    }
                } else if (var3 == 4) {
                    this.field1180 = arg1.method229();
                } else if (var3 == 5) {
                    this.field1181 = arg1.method229();
                } else if (var3 == 6) {
                    this.field1182 = arg1.method229();
                } else if (var3 == 7) {
                    this.field1183 = arg1.method227();
                } else if (var3 == 8) {
                    this.field1184 = arg1.method227();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1178[var3 - 40] = arg1.method229();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1179[var3 - 50] = arg1.method229();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method382() {
        Model var1 = (Model) field1185.method101((long) this.field1174);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method125(this.field1175, this.field1171);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1178[0] != 0) {
                var2.method139(this.field1178[var3], this.field1179[var3]);
            }
        }
        field1185.method102((long) this.field1174, (byte) 76, var2);
        return var2;
    }
}
