import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class SpotAnimType {

    @OriginalMember(owner = "oc", name = "a", descriptor = "Z")
    private boolean field1136 = true;

    @OriginalMember(owner = "oc", name = "f", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "oc", name = "h", descriptor = "Z")
    public boolean field1143 = false;

    @OriginalMember(owner = "oc", name = "i", descriptor = "[I")
    public int[] field1144 = new int[6];

    @OriginalMember(owner = "oc", name = "j", descriptor = "[I")
    public int[] field1145 = new int[6];

    @OriginalMember(owner = "oc", name = "k", descriptor = "I")
    public int field1146 = 128;

    @OriginalMember(owner = "oc", name = "l", descriptor = "I")
    public int field1147 = 128;

    @OriginalMember(owner = "oc", name = "p", descriptor = "Lt;")
    public static LruCache field1151 = new LruCache(30, 1);

    @OriginalMember(owner = "oc", name = "b", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "oc", name = "d", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "oc", name = "e", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "oc", name = "m", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "oc", name = "n", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "oc", name = "o", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "oc", name = "g", descriptor = "Lnc;")
    public SeqType field1142;

    @OriginalMember(owner = "oc", name = "c", descriptor = "[Loc;")
    public static SpotAnimType[] field1138;

    @OriginalMember(owner = "oc", name = "a", descriptor = "(Lyb;B)V")
    public static void method384(Jagfile arg0, byte arg1) {
        if (arg1 != 127) {
            return;
        }
        Packet var2 = new Packet((byte) -109, arg0.method308("spotanim.dat", null));
        field1137 = var2.method240();
        if (field1138 == null) {
            field1138 = new SpotAnimType[field1137];
        }
        for (int var3 = 0; var3 < field1137; var3++) {
            if (field1138[var3] == null) {
                field1138[var3] = new SpotAnimType();
            }
            field1138[var3].field1139 = var3;
            field1138[var3].method385(168, var2);
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(ILmb;)V")
    public void method385(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field1136 = !this.field1136;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1140 = arg1.method240();
                } else if (var3 == 2) {
                    this.field1141 = arg1.method240();
                    if (SeqType.field1120 != null) {
                        this.field1142 = SeqType.field1120[this.field1141];
                    }
                } else if (var3 == 3) {
                    this.field1143 = true;
                } else if (var3 == 4) {
                    this.field1146 = arg1.method240();
                } else if (var3 == 5) {
                    this.field1147 = arg1.method240();
                } else if (var3 == 6) {
                    this.field1148 = arg1.method240();
                } else if (var3 == 7) {
                    this.field1149 = arg1.method238();
                } else if (var3 == 8) {
                    this.field1150 = arg1.method238();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1144[var3 - 40] = arg1.method240();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1145[var3 - 50] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "()Lfb;")
    public Model method386() {
        Model var1 = (Model) field1151.method114((long) this.field1139);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method138(this.field1140, -404);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1144[0] != 0) {
                var2.method152(this.field1144[var3], this.field1145[var3]);
            }
        }
        field1151.method115(var2, (long) this.field1139, 39399);
        return var2;
    }
}
