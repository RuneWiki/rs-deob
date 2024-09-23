import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SpotAnimType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private int field1082 = 7;

    @OriginalMember(owner = "nc", name = "f", descriptor = "I")
    public int field1087 = -1;

    @OriginalMember(owner = "nc", name = "h", descriptor = "Z")
    public boolean field1089 = false;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    public int[] field1090 = new int[6];

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1091 = new int[6];

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1092 = 128;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1093 = 128;

    @OriginalMember(owner = "nc", name = "p", descriptor = "Lt;")
    public static LruCache field1097 = new LruCache(false, 30);

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "nc", name = "g", descriptor = "Lmc;")
    public SeqType field1088;

    @OriginalMember(owner = "nc", name = "c", descriptor = "[Lnc;")
    public static SpotAnimType[] field1084;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lyb;B)V")
    public static void method371(Jagfile arg0, byte arg1) {
        if (arg1 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        Packet var4 = new Packet(699, arg0.method295("spotanim.dat", null));
        field1083 = var4.method233();
        if (field1084 == null) {
            field1084 = new SpotAnimType[field1083];
        }
        for (int var5 = 0; var5 < field1083; var5++) {
            if (field1084[var5] == null) {
                field1084[var5] = new SpotAnimType();
            }
            field1084[var5].field1085 = var5;
            field1084[var5].method372(false, var4);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLmb;)V")
    public void method372(boolean arg0, Packet arg1) {
        if (arg0) {
            this.field1082 = 187;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1086 = arg1.method233();
                } else if (var3 == 2) {
                    this.field1087 = arg1.method233();
                    if (SeqType.field1069 != null) {
                        this.field1088 = SeqType.field1069[this.field1087];
                    }
                } else if (var3 == 3) {
                    this.field1089 = true;
                } else if (var3 == 4) {
                    this.field1092 = arg1.method233();
                } else if (var3 == 5) {
                    this.field1093 = arg1.method233();
                } else if (var3 == 6) {
                    this.field1094 = arg1.method233();
                } else if (var3 == 7) {
                    this.field1095 = arg1.method231();
                } else if (var3 == 8) {
                    this.field1096 = arg1.method231();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1090[var3 - 40] = arg1.method233();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1091[var3 - 50] = arg1.method233();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "()Lfb;")
    public Model method373() {
        Model var1 = (Model) field1097.method113((long) this.field1085);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method135(this.field1086, -30419);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1090[0] != 0) {
                var2.method149(this.field1090[var3], this.field1091[var3]);
            }
        }
        field1097.method114((long) this.field1085, true, var2);
        return var2;
    }
}
