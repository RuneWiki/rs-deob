import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    private int field1131 = -22323;

    @OriginalMember(owner = "nc", name = "c", descriptor = "Z")
    private boolean field1132 = true;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1139 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "Z")
    public boolean field1141 = false;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1142 = 5;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1143 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1144 = -1;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1145 = 99;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1146 = -1;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1147 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private static int field1130 = 1000;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "nc", name = "f", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "nc", name = "t", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "nc", name = "u", descriptor = "Z")
    public static boolean field1150;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1136;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1137;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    private int[] field1138;

    @OriginalMember(owner = "nc", name = "k", descriptor = "[I")
    public int[] field1140;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[Lnc;")
    public static SeqType[] field1134;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lxb;I)V")
    public static void method381(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(field1130, arg0.method299("seq.dat", null));
        field1133 = var2.method231();
        if (field1134 == null) {
            field1134 = new SeqType[field1133];
        }
        for (int var3 = 0; var3 < field1133; var3++) {
            if (field1134[var3] == null) {
                field1134[var3] = new SeqType();
            }
            field1134[var3].method383(8, var2);
        }
        if (arg1 < 0 || arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        if (arg0 != 36967) {
            this.field1132 = !this.field1132;
        }
        int var3 = this.field1138[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1136[arg1], this.field1131);
            if (var4 != null) {
                var3 = this.field1138[arg1] = var4.field152;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILlb;)V")
    public void method383(int arg0, Packet arg1) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method229();
                if (var4 == 0) {
                    if (this.field1135 == 0) {
                        this.field1135 = 1;
                        this.field1136 = new int[1];
                        this.field1136[0] = -1;
                        this.field1137 = new int[1];
                        this.field1137[0] = -1;
                        this.field1138 = new int[1];
                        this.field1138[0] = -1;
                    }
                    if (this.field1146 == -1) {
                        if (this.field1140 == null) {
                            this.field1146 = 0;
                        } else {
                            this.field1146 = 2;
                        }
                    }
                    if (this.field1147 == -1) {
                        if (this.field1140 != null) {
                            this.field1147 = 2;
                            return;
                        }
                        this.field1147 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1135 = arg1.method229();
                    this.field1136 = new int[this.field1135];
                    this.field1137 = new int[this.field1135];
                    this.field1138 = new int[this.field1135];
                    for (int var5 = 0; var5 < this.field1135; var5++) {
                        this.field1136[var5] = arg1.method231();
                        this.field1137[var5] = arg1.method231();
                        if (this.field1137[var5] == 65535) {
                            this.field1137[var5] = -1;
                        }
                        this.field1138[var5] = arg1.method231();
                    }
                } else if (var4 == 2) {
                    this.field1139 = arg1.method231();
                } else if (var4 == 3) {
                    int var6 = arg1.method229();
                    this.field1140 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1140[var7] = arg1.method229();
                    }
                    this.field1140[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1141 = true;
                } else if (var4 == 5) {
                    this.field1142 = arg1.method229();
                } else if (var4 == 6) {
                    this.field1143 = arg1.method231();
                } else if (var4 == 7) {
                    this.field1144 = arg1.method231();
                } else if (var4 == 8) {
                    this.field1145 = arg1.method229();
                } else if (var4 == 9) {
                    this.field1146 = arg1.method229();
                } else if (var4 == 10) {
                    this.field1147 = arg1.method229();
                } else if (var4 == 11) {
                    this.field1148 = arg1.method229();
                } else if (var4 == 12) {
                    this.field1149 = arg1.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
