import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1135 = -1;

    @OriginalMember(owner = "pc", name = "g", descriptor = "[I")
    public int[] field1137 = new int[6];

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1138 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    public int field1139 = 128;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1140 = 128;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Lt;")
    public static LruCache field1144 = new LruCache((byte) 3, 30);

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "pc", name = "f", descriptor = "Lnc;")
    public SeqType field1136;

    @OriginalMember(owner = "pc", name = "b", descriptor = "[Lpc;")
    public static SpotAnimType[] field1132;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLyb;)V")
    public static void method386(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(arg1.method309("spotanim.dat", null), (byte) 3);
        field1131 = var3.method241();
        if (field1132 == null) {
            field1132 = new SpotAnimType[field1131];
        }
        for (int var4 = 0; var4 < field1131; var4++) {
            if (field1132[var4] == null) {
                field1132[var4] = new SpotAnimType();
            }
            field1132[var4].field1133 = var4;
            field1132[var4].method387(9, var3);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILmb;)V")
    public void method387(int arg0, Packet arg1) {
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1134 = arg1.method241();
                } else if (var3 == 2) {
                    this.field1135 = arg1.method241();
                    if (SeqType.field1112 != null) {
                        this.field1136 = SeqType.field1112[this.field1135];
                    }
                } else if (var3 == 4) {
                    this.field1139 = arg1.method241();
                } else if (var3 == 5) {
                    this.field1140 = arg1.method241();
                } else if (var3 == 6) {
                    this.field1141 = arg1.method241();
                } else if (var3 == 7) {
                    this.field1142 = arg1.method239();
                } else if (var3 == 8) {
                    this.field1143 = arg1.method239();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1137[var3 - 40] = arg1.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1138[var3 - 50] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Lfb;")
    public Model method388() {
        Model var1 = (Model) field1144.method115((long) this.field1133);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method139(0, this.field1134);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1137[0] != 0) {
                var2.method153(this.field1137[var3], this.field1138[var3]);
            }
        }
        field1144.method116(var2, false, (long) this.field1133);
        return var2;
    }
}
