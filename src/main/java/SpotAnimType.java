import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1133 = -1;

    @OriginalMember(owner = "pc", name = "g", descriptor = "[I")
    public int[] field1135 = new int[6];

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1136 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    public int field1137 = 128;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1138 = 128;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Lt;")
    public static LruCache field1142 = new LruCache(0, 30);

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "pc", name = "f", descriptor = "Lnc;")
    public SeqType field1134;

    @OriginalMember(owner = "pc", name = "b", descriptor = "[Lpc;")
    public static SpotAnimType[] field1130;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method386(Jagfile arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet(arg0.method309("spotanim.dat", null), 337);
        field1129 = var3.method241();
        if (field1130 == null) {
            field1130 = new SpotAnimType[field1129];
        }
        for (int var4 = 0; var4 < field1129; var4++) {
            if (field1130[var4] == null) {
                field1130[var4] = new SpotAnimType();
            }
            field1130[var4].field1131 = var4;
            field1130[var4].method387(0, var3);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILmb;)V")
    public void method387(int arg0, Packet arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1132 = arg1.method241();
                } else if (var4 == 2) {
                    this.field1133 = arg1.method241();
                    if (SeqType.field1110 != null) {
                        this.field1134 = SeqType.field1110[this.field1133];
                    }
                } else if (var4 == 4) {
                    this.field1137 = arg1.method241();
                } else if (var4 == 5) {
                    this.field1138 = arg1.method241();
                } else if (var4 == 6) {
                    this.field1139 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1140 = arg1.method239();
                } else if (var4 == 8) {
                    this.field1141 = arg1.method239();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1135[var4 - 40] = arg1.method241();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1136[var4 - 50] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Lfb;")
    public Model method388() {
        Model var1 = (Model) field1142.method115((long) this.field1131);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method139(this.field1132, (byte) -18);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1135[0] != 0) {
                var2.method153(this.field1135[var3], this.field1136[var3]);
            }
        }
        field1142.method116(-630, (long) this.field1131, var2);
        return var2;
    }
}
