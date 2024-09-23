import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1117 = false;

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    private int field1118 = -796;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1127 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1128 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1130 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1131 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1132 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1133 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1122;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1123;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1124;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1126;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1120;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lyb;B)V")
    public static void method381(Jagfile arg0, byte arg1) {
        if (arg1 != 127) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Packet var3 = new Packet((byte) -109, arg0.method308("seq.dat", null));
        field1119 = var3.method240();
        if (field1120 == null) {
            field1120 = new SeqType[field1119];
        }
        for (int var4 = 0; var4 < field1119; var4++) {
            if (field1120[var4] == null) {
                field1120[var4] = new SeqType();
            }
            field1120[var4].method383(168, var3);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        int var3 = this.field1124[arg1];
        if (arg0 != 0) {
            this.field1117 = !this.field1117;
        }
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method61(this.field1122[arg1], -404);
            if (var4 != null) {
                var3 = this.field1124[arg1] = var4.field164;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILmb;)V")
    public void method383(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            this.field1118 = 71;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    if (this.field1121 == 0) {
                        this.field1121 = 1;
                        this.field1122 = new int[1];
                        this.field1122[0] = -1;
                        this.field1123 = new int[1];
                        this.field1123[0] = -1;
                        this.field1124 = new int[1];
                        this.field1124[0] = -1;
                    }
                    if (this.field1132 == -1) {
                        if (this.field1126 == null) {
                            this.field1132 = 0;
                        } else {
                            this.field1132 = 2;
                        }
                    }
                    if (this.field1133 == -1) {
                        if (this.field1126 != null) {
                            this.field1133 = 2;
                            return;
                        }
                        this.field1133 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1121 = arg1.method238();
                    this.field1122 = new int[this.field1121];
                    this.field1123 = new int[this.field1121];
                    this.field1124 = new int[this.field1121];
                    for (int var4 = 0; var4 < this.field1121; var4++) {
                        this.field1122[var4] = arg1.method240();
                        this.field1123[var4] = arg1.method240();
                        if (this.field1123[var4] == 65535) {
                            this.field1123[var4] = -1;
                        }
                        this.field1124[var4] = arg1.method240();
                    }
                } else if (var3 == 2) {
                    this.field1125 = arg1.method240();
                } else if (var3 == 3) {
                    int var5 = arg1.method238();
                    this.field1126 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1126[var6] = arg1.method238();
                    }
                    this.field1126[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1127 = true;
                } else if (var3 == 5) {
                    this.field1128 = arg1.method238();
                } else if (var3 == 6) {
                    this.field1129 = arg1.method240();
                } else if (var3 == 7) {
                    this.field1130 = arg1.method240();
                } else if (var3 == 8) {
                    this.field1131 = arg1.method238();
                } else if (var3 == 9) {
                    this.field1132 = arg1.method238();
                } else if (var3 == 10) {
                    this.field1133 = arg1.method238();
                } else if (var3 == 11) {
                    this.field1134 = arg1.method238();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
