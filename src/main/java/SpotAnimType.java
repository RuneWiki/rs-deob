import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pc")
public class SpotAnimType {

    @OriginalMember(owner = "pc", name = "f", descriptor = "I")
    public int field1168 = -1;

    @OriginalMember(owner = "pc", name = "h", descriptor = "[I")
    public int[] field1170 = new int[6];

    @OriginalMember(owner = "pc", name = "i", descriptor = "[I")
    public int[] field1171 = new int[6];

    @OriginalMember(owner = "pc", name = "j", descriptor = "I")
    public int field1172 = 128;

    @OriginalMember(owner = "pc", name = "k", descriptor = "I")
    public int field1173 = 128;

    @OriginalMember(owner = "pc", name = "a", descriptor = "Z")
    private static boolean field1163 = true;

    @OriginalMember(owner = "pc", name = "o", descriptor = "Ls;")
    public static LruCache field1177 = new LruCache(30, (byte) 1);

    @OriginalMember(owner = "pc", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "pc", name = "d", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "pc", name = "e", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "pc", name = "l", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "pc", name = "m", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "pc", name = "n", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "pc", name = "g", descriptor = "Lnc;")
    public SeqType field1169;

    @OriginalMember(owner = "pc", name = "c", descriptor = "[Lpc;")
    public static SpotAnimType[] field1165;

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ZLxb;)V")
    public static void method384(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("spotanim.dat", null), (byte) -93);
        if (arg0) {
            field1163 = !field1163;
        }
        field1164 = var2.method231();
        if (field1165 == null) {
            field1165 = new SpotAnimType[field1164];
        }
        for (int var3 = 0; var3 < field1164; var3++) {
            if (field1165[var3] == null) {
                field1165[var3] = new SpotAnimType();
            }
            field1165[var3].field1166 = var3;
            field1165[var3].method385(210, var2);
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "(ILlb;)V")
    public void method385(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1167 = arg1.method231();
                } else if (var4 == 2) {
                    this.field1168 = arg1.method231();
                    if (SeqType.field1143 != null) {
                        this.field1169 = SeqType.field1143[this.field1168];
                    }
                } else if (var4 == 4) {
                    this.field1172 = arg1.method231();
                } else if (var4 == 5) {
                    this.field1173 = arg1.method231();
                } else if (var4 == 6) {
                    this.field1174 = arg1.method231();
                } else if (var4 == 7) {
                    this.field1175 = arg1.method229();
                } else if (var4 == 8) {
                    this.field1176 = arg1.method229();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1170[var4 - 40] = arg1.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1171[var4 - 50] = arg1.method231();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "pc", name = "a", descriptor = "()Leb;")
    public Model method386() {
        Model var1 = (Model) field1177.method101((long) this.field1166);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method126((byte) -14, this.field1167);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1170[0] != 0) {
                var2.method140(this.field1170[var3], this.field1171[var3]);
            }
        }
        field1177.method102(var2, 0, (long) this.field1166);
        return var2;
    }
}
