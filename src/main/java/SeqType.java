import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1140 = false;

    @OriginalMember(owner = "nc", name = "b", descriptor = "Z")
    private boolean field1141 = false;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1148 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1150 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1151 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1152 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1153 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1154 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1155 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "nc", name = "t", descriptor = "Z")
    public static boolean field1159;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1145;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1146;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1147;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1149;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1143;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLxb;)V")
    public static void method381(boolean arg0, Jagfile arg1) {
        if (arg0) {
            return;
        }
        Packet var2 = new Packet(arg1.method299("seq.dat", null), (byte) -93);
        field1142 = var2.method231();
        if (field1143 == null) {
            field1143 = new SeqType[field1142];
        }
        for (int var3 = 0; var3 < field1142; var3++) {
            if (field1143[var3] == null) {
                field1143[var3] = new SeqType();
            }
            field1143[var3].method383(210, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(BI)I")
    public int method382(byte arg0, int arg1) {
        if (arg0 != -97) {
            this.field1140 = !this.field1140;
        }
        int var3 = this.field1147[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47((byte) -14, this.field1145[arg1]);
            if (var4 != null) {
                var3 = this.field1147[arg1] = var4.field149;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILlb;)V")
    public void method383(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field1141 = !this.field1141;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method229();
                if (var3 == 0) {
                    if (this.field1144 == 0) {
                        this.field1144 = 1;
                        this.field1145 = new int[1];
                        this.field1145[0] = -1;
                        this.field1146 = new int[1];
                        this.field1146[0] = -1;
                        this.field1147 = new int[1];
                        this.field1147[0] = -1;
                    }
                    if (this.field1155 == -1) {
                        if (this.field1149 == null) {
                            this.field1155 = 0;
                        } else {
                            this.field1155 = 2;
                        }
                    }
                    if (this.field1156 == -1) {
                        if (this.field1149 != null) {
                            this.field1156 = 2;
                            return;
                        }
                        this.field1156 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1144 = arg1.method229();
                    this.field1145 = new int[this.field1144];
                    this.field1146 = new int[this.field1144];
                    this.field1147 = new int[this.field1144];
                    for (int var4 = 0; var4 < this.field1144; var4++) {
                        this.field1145[var4] = arg1.method231();
                        this.field1146[var4] = arg1.method231();
                        if (this.field1146[var4] == 65535) {
                            this.field1146[var4] = -1;
                        }
                        this.field1147[var4] = arg1.method231();
                    }
                } else if (var3 == 2) {
                    this.field1148 = arg1.method231();
                } else if (var3 == 3) {
                    int var5 = arg1.method229();
                    this.field1149 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1149[var6] = arg1.method229();
                    }
                    this.field1149[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1150 = true;
                } else if (var3 == 5) {
                    this.field1151 = arg1.method229();
                } else if (var3 == 6) {
                    this.field1152 = arg1.method231();
                } else if (var3 == 7) {
                    this.field1153 = arg1.method231();
                } else if (var3 == 8) {
                    this.field1154 = arg1.method229();
                } else if (var3 == 9) {
                    this.field1155 = arg1.method229();
                } else if (var3 == 10) {
                    this.field1156 = arg1.method229();
                } else if (var3 == 11) {
                    this.field1157 = arg1.method229();
                } else if (var3 == 12) {
                    this.field1158 = arg1.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
