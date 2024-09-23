import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "g", descriptor = "I")
    public int field1140 = -1;

    @OriginalMember(owner = "nc", name = "i", descriptor = "Z")
    public boolean field1142 = false;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1143 = 5;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1144 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1145 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1146 = 99;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1147 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1148 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "nc", name = "r", descriptor = "Z")
    public static boolean field1151;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[I")
    public int[] field1137;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1138;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    private int[] field1139;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1141;

    @OriginalMember(owner = "nc", name = "b", descriptor = "[Lnc;")
    public static SeqType[] field1135;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lxb;I)V")
    public static void method381(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("seq.dat", null), 58);
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field1134 = var2.method231();
        if (field1135 == null) {
            field1135 = new SeqType[field1134];
        }
        for (int var3 = 0; var3 < field1134; var3++) {
            if (field1135[var3] == null) {
                field1135[var3] = new SeqType();
            }
            field1135[var3].method383(var2, 913);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        int var3 = this.field1139[arg0];
        if (arg1 != 0) {
            return 0;
        }
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1137[arg0], 1);
            if (var4 != null) {
                var3 = this.field1139[arg0] = var4.field153;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Llb;I)V")
    public void method383(Packet arg0, int arg1) {
        int var3 = 69 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    if (this.field1136 == 0) {
                        this.field1136 = 1;
                        this.field1137 = new int[1];
                        this.field1137[0] = -1;
                        this.field1138 = new int[1];
                        this.field1138[0] = -1;
                        this.field1139 = new int[1];
                        this.field1139[0] = -1;
                    }
                    if (this.field1147 == -1) {
                        if (this.field1141 == null) {
                            this.field1147 = 0;
                        } else {
                            this.field1147 = 2;
                        }
                    }
                    if (this.field1148 == -1) {
                        if (this.field1141 != null) {
                            this.field1148 = 2;
                            return;
                        }
                        this.field1148 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1136 = arg0.method229();
                    this.field1137 = new int[this.field1136];
                    this.field1138 = new int[this.field1136];
                    this.field1139 = new int[this.field1136];
                    for (int var5 = 0; var5 < this.field1136; var5++) {
                        this.field1137[var5] = arg0.method231();
                        this.field1138[var5] = arg0.method231();
                        if (this.field1138[var5] == 65535) {
                            this.field1138[var5] = -1;
                        }
                        this.field1139[var5] = arg0.method231();
                    }
                } else if (var4 == 2) {
                    this.field1140 = arg0.method231();
                } else if (var4 == 3) {
                    int var6 = arg0.method229();
                    this.field1141 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1141[var7] = arg0.method229();
                    }
                    this.field1141[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1142 = true;
                } else if (var4 == 5) {
                    this.field1143 = arg0.method229();
                } else if (var4 == 6) {
                    this.field1144 = arg0.method231();
                } else if (var4 == 7) {
                    this.field1145 = arg0.method231();
                } else if (var4 == 8) {
                    this.field1146 = arg0.method229();
                } else if (var4 == 9) {
                    this.field1147 = arg0.method229();
                } else if (var4 == 10) {
                    this.field1148 = arg0.method229();
                } else if (var4 == 11) {
                    this.field1149 = arg0.method229();
                } else if (var4 == 12) {
                    this.field1150 = arg0.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
