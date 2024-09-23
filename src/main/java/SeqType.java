import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class SeqType {

    @OriginalMember(owner = "mc", name = "a", descriptor = "I")
    private int field1079 = -797;

    @OriginalMember(owner = "mc", name = "h", descriptor = "I")
    public int field1086 = -1;

    @OriginalMember(owner = "mc", name = "j", descriptor = "Z")
    public boolean field1088 = false;

    @OriginalMember(owner = "mc", name = "k", descriptor = "I")
    public int field1089 = 5;

    @OriginalMember(owner = "mc", name = "l", descriptor = "I")
    public int field1090 = -1;

    @OriginalMember(owner = "mc", name = "m", descriptor = "I")
    public int field1091 = -1;

    @OriginalMember(owner = "mc", name = "n", descriptor = "I")
    public int field1092 = 99;

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "mc", name = "d", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "mc", name = "o", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "mc", name = "e", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "mc", name = "f", descriptor = "[I")
    public int[] field1084;

    @OriginalMember(owner = "mc", name = "g", descriptor = "[I")
    private int[] field1085;

    @OriginalMember(owner = "mc", name = "i", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "mc", name = "c", descriptor = "[Lmc;")
    public static SeqType[] field1081;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Lyb;I)V")
    public static void method372(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("seq.dat", null), true);
        int var3 = 94 / arg1;
        field1080 = var2.method233();
        if (field1081 == null) {
            field1081 = new SeqType[field1080];
        }
        for (int var4 = 0; var4 < field1080; var4++) {
            if (field1081[var4] == null) {
                field1081[var4] = new SeqType();
            }
            field1081[var4].method374(3251, var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ZI)I")
    public int method373(boolean arg0, int arg1) {
        int var3 = this.field1085[arg1];
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            AnimFrame var5 = AnimFrame.method60(this.field1083[arg1], this.field1079);
            if (var5 != null) {
                var3 = this.field1085[arg1] = var5.field157;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILmb;)V")
    public void method374(int arg0, Packet arg1) {
        if (arg0 != 3251) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method231();
                if (var3 == 0) {
                    if (this.field1082 == 0) {
                        this.field1082 = 1;
                        this.field1083 = new int[1];
                        this.field1083[0] = -1;
                        this.field1084 = new int[1];
                        this.field1084[0] = -1;
                        this.field1085 = new int[1];
                        this.field1085[0] = -1;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1082 = arg1.method231();
                    this.field1083 = new int[this.field1082];
                    this.field1084 = new int[this.field1082];
                    this.field1085 = new int[this.field1082];
                    for (int var4 = 0; var4 < this.field1082; var4++) {
                        this.field1083[var4] = arg1.method233();
                        this.field1084[var4] = arg1.method233();
                        if (this.field1084[var4] == 65535) {
                            this.field1084[var4] = -1;
                        }
                        this.field1085[var4] = arg1.method233();
                    }
                } else if (var3 == 2) {
                    this.field1086 = arg1.method233();
                } else if (var3 == 3) {
                    int var5 = arg1.method231();
                    this.field1087 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1087[var6] = arg1.method231();
                    }
                    this.field1087[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1088 = true;
                } else if (var3 == 5) {
                    this.field1089 = arg1.method231();
                } else if (var3 == 6) {
                    this.field1090 = arg1.method233();
                } else if (var3 == 7) {
                    this.field1091 = arg1.method233();
                } else if (var3 == 8) {
                    this.field1092 = arg1.method231();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
