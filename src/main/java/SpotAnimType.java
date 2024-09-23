import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1160 = -1;

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1162 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1163 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1164 = 128;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1165 = 128;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Ls;")
    public static LruCache field1169 = new LruCache((byte) 8, 30);

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "pc", name = "g", descriptor = "Lnc;")
    public SeqType field1161;

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private static boolean field1155;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static SpotAnimType[] field1157;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Lxb;I)V")
    public static void method384(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("spotanim.dat", null), 58);
        field1156 = var2.method231();
        if (field1157 == null) {
            field1157 = new SpotAnimType[field1156];
        }
        for (int var3 = 0; var3 < field1156; var3++) {
            if (field1157[var3] == null) {
                field1157[var3] = new SpotAnimType();
            }
            field1157[var3].field1158 = var3;
            field1157[var3].method385(var2, 913);
        }
        while (arg1 >= 0) {
            field1155 = !field1155;
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(Llb;I)V")
    public void method385(Packet arg0, int arg1) {
        int var3 = 93 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1159 = arg0.method231();
                } else if (var4 == 2) {
                    this.field1160 = arg0.method231();
                    if (SeqType.field1135 != null) {
                        this.field1161 = SeqType.field1135[this.field1160];
                    }
                } else if (var4 == 4) {
                    this.field1164 = arg0.method231();
                } else if (var4 == 5) {
                    this.field1165 = arg0.method231();
                } else if (var4 == 6) {
                    this.field1166 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1167 = arg0.method229();
                } else if (var4 == 8) {
                    this.field1168 = arg0.method229();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1162[var4 - 40] = arg0.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1163[var4 - 50] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method386() {
        Model var1 = (Model) field1169.method101((long) this.field1158);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method126(this.field1159, 1);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1162[0] != 0) {
                var2.method140(this.field1162[var3], this.field1163[var3]);
            }
        }
        field1169.method102((long) this.field1158, 0, var2);
        return var2;
    }
}
