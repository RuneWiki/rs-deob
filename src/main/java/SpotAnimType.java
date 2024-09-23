import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private boolean field1175 = true;

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1180 = -1;

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1182 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1183 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1184 = 128;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1185 = 128;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Ls;")
    public static LruCache field1189 = new LruCache(30, false);

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "pc", name = "g", descriptor = "Lnc;")
    public SeqType field1181;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static SpotAnimType[] field1177;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILxb;)V")
    public static void method384(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(false, arg1.method299("spotanim.dat", null));
        field1176 = var2.method231();
        if (arg0 != 35102) {
            return;
        }
        if (field1177 == null) {
            field1177 = new SpotAnimType[field1176];
        }
        for (int var3 = 0; var3 < field1176; var3++) {
            if (field1177[var3] == null) {
                field1177[var3] = new SpotAnimType();
            }
            field1177[var3].field1178 = var3;
            field1177[var3].method385(var2, false);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;Z)V")
    public void method385(Packet arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1179 = arg0.method231();
                } else if (var4 == 2) {
                    this.field1180 = arg0.method231();
                    if (SeqType.field1155 != null) {
                        this.field1181 = SeqType.field1155[this.field1180];
                    }
                } else if (var4 == 4) {
                    this.field1184 = arg0.method231();
                } else if (var4 == 5) {
                    this.field1185 = arg0.method231();
                } else if (var4 == 6) {
                    this.field1186 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1187 = arg0.method229();
                } else if (var4 == 8) {
                    this.field1188 = arg0.method229();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1182[var4 - 40] = arg0.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1183[var4 - 50] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method386() {
        Model var1 = (Model) field1189.method101((long) this.field1178);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method126(this.field1179, 0);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1182[0] != 0) {
                var2.method140(this.field1182[var3], this.field1183[var3]);
            }
        }
        field1189.method102(var2, (long) this.field1178, this.field1175);
        return var2;
    }
}
