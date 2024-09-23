import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1172 = -1;

    @OriginalMember(owner = "pc", name = "g", descriptor = "[I")
    public int[] field1174 = new int[6];

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1175 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    public int field1176 = 128;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1177 = 128;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Lt;")
    public static LruCache field1181 = new LruCache(0, 30);

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "pc", name = "f", descriptor = "Lnc;")
    public SeqType field1173;

    @OriginalMember(owner = "pc", name = "b", descriptor = "[Lpc;")
    public static SpotAnimType[] field1169;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lyb;I)V")
    public static void method386(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(45427, arg0.method309("spotanim.dat", null));
        field1168 = var2.method241();
        int var3 = 51 / arg1;
        if (field1169 == null) {
            field1169 = new SpotAnimType[field1168];
        }
        for (int var4 = 0; var4 < field1168; var4++) {
            if (field1169[var4] == null) {
                field1169[var4] = new SpotAnimType();
            }
            field1169[var4].field1170 = var4;
            field1169[var4].method387(var2, (byte) 66);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lmb;B)V")
    public void method387(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1171 = arg0.method241();
                } else if (var3 == 2) {
                    this.field1172 = arg0.method241();
                    if (SeqType.field1149 != null) {
                        this.field1173 = SeqType.field1149[this.field1172];
                    }
                } else if (var3 == 4) {
                    this.field1176 = arg0.method241();
                } else if (var3 == 5) {
                    this.field1177 = arg0.method241();
                } else if (var3 == 6) {
                    this.field1178 = arg0.method241();
                } else if (var3 == 7) {
                    this.field1179 = arg0.method239();
                } else if (var3 == 8) {
                    this.field1180 = arg0.method239();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1174[var3 - 40] = arg0.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1175[var3 - 50] = arg0.method241();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Lfb;")
    public Model method388() {
        Model var1 = (Model) field1181.method115((long) this.field1170);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method139(0, this.field1171);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1174[0] != 0) {
                var2.method153(this.field1174[var3], this.field1175[var3]);
            }
        }
        field1181.method116(true, (long) this.field1170, var2);
        return var2;
    }
}
