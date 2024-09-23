import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1129 = true;

    @OriginalMember(owner = "nc", name = "h", descriptor = "I")
    public int field1136 = -1;

    @OriginalMember(owner = "nc", name = "j", descriptor = "Z")
    public boolean field1138 = false;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1139 = 5;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1140 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1142 = 99;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1143 = -1;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1144 = -1;

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1133;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1134;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    private int[] field1135;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    public int[] field1137;

    @OriginalMember(owner = "nc", name = "c", descriptor = "[Lnc;")
    public static SeqType[] field1131;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILxb;)V")
    public static void method374(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 3, arg1.method294("seq.dat", null));
        if (arg0 <= 0) {
            return;
        }
        field1130 = var2.method226();
        if (field1131 == null) {
            field1131 = new SeqType[field1130];
        }
        for (int var3 = 0; var3 < field1130; var3++) {
            if (field1131[var3] == null) {
                field1131[var3] = new SeqType();
            }
            field1131[var3].method376(var2, -32477);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method375(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1135[arg1];
        if (var4 == 0) {
            AnimFrame var5 = AnimFrame.method47(this.field1129, this.field1133[arg1]);
            if (var5 != null) {
                var4 = this.field1135[arg1] = var5.field151;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Llb;I)V")
    public void method376(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method224();
                if (var4 == 0) {
                    if (this.field1132 == 0) {
                        this.field1132 = 1;
                        this.field1133 = new int[1];
                        this.field1133[0] = -1;
                        this.field1134 = new int[1];
                        this.field1134[0] = -1;
                        this.field1135 = new int[1];
                        this.field1135[0] = -1;
                    }
                    if (this.field1143 == -1) {
                        if (this.field1137 == null) {
                            this.field1143 = 0;
                        } else {
                            this.field1143 = 2;
                        }
                    }
                    if (this.field1144 == -1) {
                        if (this.field1137 != null) {
                            this.field1144 = 2;
                            return;
                        }
                        this.field1144 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1132 = arg0.method224();
                    this.field1133 = new int[this.field1132];
                    this.field1134 = new int[this.field1132];
                    this.field1135 = new int[this.field1132];
                    for (int var5 = 0; var5 < this.field1132; var5++) {
                        this.field1133[var5] = arg0.method226();
                        this.field1134[var5] = arg0.method226();
                        if (this.field1134[var5] == 65535) {
                            this.field1134[var5] = -1;
                        }
                        this.field1135[var5] = arg0.method226();
                    }
                } else if (var4 == 2) {
                    this.field1136 = arg0.method226();
                } else if (var4 == 3) {
                    int var6 = arg0.method224();
                    this.field1137 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1137[var7] = arg0.method224();
                    }
                    this.field1137[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1138 = true;
                } else if (var4 == 5) {
                    this.field1139 = arg0.method224();
                } else if (var4 == 6) {
                    this.field1140 = arg0.method226();
                } else if (var4 == 7) {
                    this.field1141 = arg0.method226();
                } else if (var4 == 8) {
                    this.field1142 = arg0.method224();
                } else if (var4 == 9) {
                    this.field1143 = arg0.method224();
                } else if (var4 == 10) {
                    this.field1144 = arg0.method224();
                } else if (var4 == 11) {
                    this.field1145 = arg0.method224();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
