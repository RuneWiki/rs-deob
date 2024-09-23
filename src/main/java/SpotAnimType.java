import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "b", descriptor = "Z")
    private boolean field1170 = true;

    @OriginalMember(owner = "pc", name = "g", descriptor = "I")
    public int field1175 = -1;

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1177 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "[I")
    public int[] field1178 = new int[6];

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1179 = 128;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1180 = 128;

    @OriginalMember(owner = "pc", name = "p", descriptor = "Ls;")
    public static LruCache field1184 = new LruCache(-739, 30);

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "pc", name = "o", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "pc", name = "h", descriptor = "Lnc;")
    public SeqType field1176;

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private static boolean field1169;

    @OriginalMember(owner = "pc", name = "d", descriptor = "[Lpc;")
    public static SpotAnimType[] field1172;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILxb;)V")
    public static void method384(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("spotanim.dat", null), -26728);
        field1171 = var2.method231();
        if (field1172 == null) {
            field1172 = new SpotAnimType[field1171];
        }
        for (int var3 = 0; var3 < field1171; var3++) {
            if (field1172[var3] == null) {
                field1172[var3] = new SpotAnimType();
            }
            field1172[var3].field1173 = var3;
            field1172[var3].method385(var2, 8);
        }
        if (arg0 != 0) {
            field1169 = !field1169;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;I)V")
    public void method385(Packet arg0, int arg1) {
        if (arg1 != 8) {
            this.field1170 = !this.field1170;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1174 = arg0.method231();
                } else if (var3 == 2) {
                    this.field1175 = arg0.method231();
                    if (SeqType.field1149 != null) {
                        this.field1176 = SeqType.field1149[this.field1175];
                    }
                } else if (var3 == 4) {
                    this.field1179 = arg0.method231();
                } else if (var3 == 5) {
                    this.field1180 = arg0.method231();
                } else if (var3 == 6) {
                    this.field1181 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1182 = arg0.method229();
                } else if (var3 == 8) {
                    this.field1183 = arg0.method229();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1177[var3 - 40] = arg0.method231();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1178[var3 - 50] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method386() {
        Model var1 = (Model) field1184.method101((long) this.field1173);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method126(true, this.field1174);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1177[0] != 0) {
                var2.method140(this.field1177[var3], this.field1178[var3]);
            }
        }
        field1184.method102((long) this.field1173, var2, 10514);
        return var2;
    }
}
