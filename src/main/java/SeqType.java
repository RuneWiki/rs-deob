import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "g", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "nc", name = "i", descriptor = "Z")
    public boolean field1140 = false;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1141 = 5;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1142 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1143 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1144 = 99;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1145 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1146 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[I")
    public int[] field1135;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1136;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    private int[] field1137;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1139;

    @OriginalMember(owner = "nc", name = "b", descriptor = "[Lnc;")
    public static SeqType[] field1133;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLxb;)V")
    public static void method374(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method294("seq.dat", null), (byte) 1);
        field1132 = var2.method226();
        if (arg0) {
            return;
        }
        if (field1133 == null) {
            field1133 = new SeqType[field1132];
        }
        for (int var3 = 0; var3 < field1132; var3++) {
            if (field1133[var3] == null) {
                field1133[var3] = new SeqType();
            }
            field1133[var3].method376((byte) 2, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method375(int arg0, int arg1) {
        if (arg1 != 41645) {
            return 4;
        }
        int var3 = this.field1137[arg0];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1135[arg0], 6);
            if (var4 != null) {
                var3 = this.field1137[arg0] = var4.field149;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(BLlb;)V")
    public void method376(byte arg0, Packet arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            while (true) {
                int var5 = arg1.method224();
                if (var5 == 0) {
                    if (this.field1134 == 0) {
                        this.field1134 = 1;
                        this.field1135 = new int[1];
                        this.field1135[0] = -1;
                        this.field1136 = new int[1];
                        this.field1136[0] = -1;
                        this.field1137 = new int[1];
                        this.field1137[0] = -1;
                    }
                    if (this.field1145 == -1) {
                        if (this.field1139 == null) {
                            this.field1145 = 0;
                        } else {
                            this.field1145 = 2;
                        }
                    }
                    if (this.field1146 == -1) {
                        if (this.field1139 != null) {
                            this.field1146 = 2;
                            return;
                        }
                        this.field1146 = 0;
                        return;
                    }
                    return;
                }
                if (var5 == 1) {
                    this.field1134 = arg1.method224();
                    this.field1135 = new int[this.field1134];
                    this.field1136 = new int[this.field1134];
                    this.field1137 = new int[this.field1134];
                    for (int var6 = 0; var6 < this.field1134; var6++) {
                        this.field1135[var6] = arg1.method226();
                        this.field1136[var6] = arg1.method226();
                        if (this.field1136[var6] == 65535) {
                            this.field1136[var6] = -1;
                        }
                        this.field1137[var6] = arg1.method226();
                    }
                } else if (var5 == 2) {
                    this.field1138 = arg1.method226();
                } else if (var5 == 3) {
                    int var7 = arg1.method224();
                    this.field1139 = new int[var7 + 1];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1139[var8] = arg1.method224();
                    }
                    this.field1139[var7] = 9999999;
                } else if (var5 == 4) {
                    this.field1140 = true;
                } else if (var5 == 5) {
                    this.field1141 = arg1.method224();
                } else if (var5 == 6) {
                    this.field1142 = arg1.method226();
                } else if (var5 == 7) {
                    this.field1143 = arg1.method226();
                } else if (var5 == 8) {
                    this.field1144 = arg1.method224();
                } else if (var5 == 9) {
                    this.field1145 = arg1.method224();
                } else if (var5 == 10) {
                    this.field1146 = arg1.method224();
                } else if (var5 == 11) {
                    this.field1147 = arg1.method224();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var5);
                }
            }
        }
    }
}
