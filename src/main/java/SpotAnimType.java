import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1169 = -1;

    @OriginalMember(owner = "pc", name = "g", descriptor = "[I")
    public int[] field1171 = new int[6];

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1172 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "I")
    public int field1173 = 128;

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1174 = 128;

    @OriginalMember(owner = "pc", name = "n", descriptor = "Ls;")
    public static LruCache field1178 = new LruCache(false, 30);

    @OriginalMember(owner = "pc", name = "a", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "pc", name = "c", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "pc", name = "f", descriptor = "Lnc;")
    public SeqType field1170;

    @OriginalMember(owner = "pc", name = "b", descriptor = "[Lpc;")
    public static SpotAnimType[] field1166;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method384(Jagfile arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        Packet var2 = new Packet(-49365, arg0.method299("spotanim.dat", null));
        field1165 = var2.method231();
        if (field1166 == null) {
            field1166 = new SpotAnimType[field1165];
        }
        for (int var3 = 0; var3 < field1165; var3++) {
            if (field1166[var3] == null) {
                field1166[var3] = new SpotAnimType();
            }
            field1166[var3].field1167 = var3;
            field1166[var3].method385(var2, false);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;Z)V")
    public void method385(Packet arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1168 = arg0.method231();
                } else if (var3 == 2) {
                    this.field1169 = arg0.method231();
                    if (SeqType.field1145 != null) {
                        this.field1170 = SeqType.field1145[this.field1169];
                    }
                } else if (var3 == 4) {
                    this.field1173 = arg0.method231();
                } else if (var3 == 5) {
                    this.field1174 = arg0.method231();
                } else if (var3 == 6) {
                    this.field1175 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1176 = arg0.method229();
                } else if (var3 == 8) {
                    this.field1177 = arg0.method229();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1171[var3 - 40] = arg0.method231();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1172[var3 - 50] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method386() {
        Model var1 = (Model) field1178.method101((long) this.field1167);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method126(0, this.field1168);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1171[0] != 0) {
                var2.method140(this.field1171[var3], this.field1172[var3]);
            }
        }
        field1178.method102(true, (long) this.field1167, var2);
        return var2;
    }
}
