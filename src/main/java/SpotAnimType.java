import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class SpotAnimType {

    @OriginalMember(owner = "oc", name = "e", descriptor = "I")
    public int field1145 = -1;

    @OriginalMember(owner = "oc", name = "g", descriptor = "Z")
    public boolean field1147 = false;

    @OriginalMember(owner = "oc", name = "h", descriptor = "[I")
    public int[] field1148 = new int[6];

    @OriginalMember(owner = "oc", name = "i", descriptor = "[I")
    public int[] field1149 = new int[6];

    @OriginalMember(owner = "oc", name = "j", descriptor = "I")
    public int field1150 = 128;

    @OriginalMember(owner = "oc", name = "k", descriptor = "I")
    public int field1151 = 128;

    @OriginalMember(owner = "oc", name = "o", descriptor = "Lt;")
    public static LruCache field1155 = new LruCache(30, (byte) 3);

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "oc", name = "c", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "oc", name = "d", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "oc", name = "l", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "oc", name = "m", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "oc", name = "n", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "oc", name = "f", descriptor = "Lnc;")
    public SeqType field1146;

    @OriginalMember(owner = "oc", name = "b", descriptor = "[Loc;")
    public static SpotAnimType[] field1142;

    @OriginalMember(owner = "oc", name = "a", descriptor = "(ILyb;)V")
    public static void method384(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method308("spotanim.dat", null), false);
        field1141 = var2.method240();
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1142 == null) {
            field1142 = new SpotAnimType[field1141];
        }
        for (int var4 = 0; var4 < field1141; var4++) {
            if (field1142[var4] == null) {
                field1142[var4] = new SpotAnimType();
            }
            field1142[var4].field1143 = var4;
            field1142[var4].method385(true, var2);
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(ZLmb;)V")
    public void method385(boolean arg0, Packet arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1144 = arg1.method240();
                } else if (var4 == 2) {
                    this.field1145 = arg1.method240();
                    if (SeqType.field1125 != null) {
                        this.field1146 = SeqType.field1125[this.field1145];
                    }
                } else if (var4 == 3) {
                    this.field1147 = true;
                } else if (var4 == 4) {
                    this.field1150 = arg1.method240();
                } else if (var4 == 5) {
                    this.field1151 = arg1.method240();
                } else if (var4 == 6) {
                    this.field1152 = arg1.method240();
                } else if (var4 == 7) {
                    this.field1153 = arg1.method238();
                } else if (var4 == 8) {
                    this.field1154 = arg1.method238();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1148[var4 - 40] = arg1.method240();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1149[var4 - 50] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "()Lfb;")
    public Model method386() {
        Model var1 = (Model) field1155.method114((long) this.field1143);
        if (var1 != null) {
            return var1;
        }
        Model var2 = Model.method138(this.field1144, -58);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1148[0] != 0) {
                var2.method152(this.field1148[var3], this.field1149[var3]);
            }
        }
        field1155.method115(false, var2, (long) this.field1143);
        return var2;
    }
}
