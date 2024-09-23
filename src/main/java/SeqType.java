import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    private int field1123 = 16146;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1130 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1132 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1133 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1134 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1135 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1136 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1137 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private static int field1122 = -39972;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1139;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1127;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1128;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1129;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1131;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1125;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILyb;)V")
    public static void method381(int arg0, Jagfile arg1) {
        if (arg0 < 3 || arg0 > 3) {
            field1122 = -3;
        }
        Packet var2 = new Packet(arg1.method308("seq.dat", null), false);
        field1124 = var2.method240();
        if (field1125 == null) {
            field1125 = new SeqType[field1124];
        }
        for (int var3 = 0; var3 < field1124; var3++) {
            if (field1125[var3] == null) {
                field1125[var3] = new SeqType();
            }
            field1125[var3].method383(true, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        if (arg1 != 0) {
            return this.field1123;
        }
        int var3 = this.field1129[arg0];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method61(this.field1127[arg0], -58);
            if (var4 != null) {
                var3 = this.field1129[arg0] = var4.field165;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLmb;)V")
    public void method383(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    if (this.field1126 == 0) {
                        this.field1126 = 1;
                        this.field1127 = new int[1];
                        this.field1127[0] = -1;
                        this.field1128 = new int[1];
                        this.field1128[0] = -1;
                        this.field1129 = new int[1];
                        this.field1129[0] = -1;
                    }
                    if (this.field1137 == -1) {
                        if (this.field1131 == null) {
                            this.field1137 = 0;
                        } else {
                            this.field1137 = 2;
                        }
                    }
                    if (this.field1138 == -1) {
                        if (this.field1131 != null) {
                            this.field1138 = 2;
                            return;
                        }
                        this.field1138 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1126 = arg1.method238();
                    this.field1127 = new int[this.field1126];
                    this.field1128 = new int[this.field1126];
                    this.field1129 = new int[this.field1126];
                    for (int var4 = 0; var4 < this.field1126; var4++) {
                        this.field1127[var4] = arg1.method240();
                        this.field1128[var4] = arg1.method240();
                        if (this.field1128[var4] == 65535) {
                            this.field1128[var4] = -1;
                        }
                        this.field1129[var4] = arg1.method240();
                    }
                } else if (var3 == 2) {
                    this.field1130 = arg1.method240();
                } else if (var3 == 3) {
                    int var5 = arg1.method238();
                    this.field1131 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1131[var6] = arg1.method238();
                    }
                    this.field1131[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1132 = true;
                } else if (var3 == 5) {
                    this.field1133 = arg1.method238();
                } else if (var3 == 6) {
                    this.field1134 = arg1.method240();
                } else if (var3 == 7) {
                    this.field1135 = arg1.method240();
                } else if (var3 == 8) {
                    this.field1136 = arg1.method238();
                } else if (var3 == 9) {
                    this.field1137 = arg1.method238();
                } else if (var3 == 10) {
                    this.field1138 = arg1.method238();
                } else if (var3 == 11) {
                    this.field1139 = arg1.method238();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
