import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1123 = false;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1131 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1133 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1134 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1135 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1136 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1137 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1138 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1139 = -1;

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    private static int field1124 = -474;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "nc", name = "t", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1128;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1129;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1130;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1132;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1126;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lxb;I)V")
    public static void method375(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method295("seq.dat", null), 185);
        while (arg1 >= 0) {
            field1124 = -463;
        }
        field1125 = var2.method227();
        if (field1126 == null) {
            field1126 = new SeqType[field1125];
        }
        for (int var3 = 0; var3 < field1125; var3++) {
            if (field1126[var3] == null) {
                field1126[var3] = new SeqType();
            }
            field1126[var3].method377(var2, (byte) 81);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method376(int arg0, int arg1) {
        while (arg0 >= 0) {
            field1124 = 468;
        }
        int var3 = this.field1130[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1128[arg1], (byte) -104);
            if (var4 != null) {
                var3 = this.field1130[arg1] = var4.field150;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Llb;B)V")
    public void method377(Packet arg0, byte arg1) {
        if (arg1 != 81) {
            this.field1123 = !this.field1123;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method225();
                if (var3 == 0) {
                    if (this.field1127 == 0) {
                        this.field1127 = 1;
                        this.field1128 = new int[1];
                        this.field1128[0] = -1;
                        this.field1129 = new int[1];
                        this.field1129[0] = -1;
                        this.field1130 = new int[1];
                        this.field1130[0] = -1;
                    }
                    if (this.field1138 == -1) {
                        if (this.field1132 == null) {
                            this.field1138 = 0;
                        } else {
                            this.field1138 = 2;
                        }
                    }
                    if (this.field1139 == -1) {
                        if (this.field1132 != null) {
                            this.field1139 = 2;
                            return;
                        }
                        this.field1139 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1127 = arg0.method225();
                    this.field1128 = new int[this.field1127];
                    this.field1129 = new int[this.field1127];
                    this.field1130 = new int[this.field1127];
                    for (int var4 = 0; var4 < this.field1127; var4++) {
                        this.field1128[var4] = arg0.method227();
                        this.field1129[var4] = arg0.method227();
                        if (this.field1129[var4] == 65535) {
                            this.field1129[var4] = -1;
                        }
                        this.field1130[var4] = arg0.method227();
                    }
                } else if (var3 == 2) {
                    this.field1131 = arg0.method227();
                } else if (var3 == 3) {
                    int var5 = arg0.method225();
                    this.field1132 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1132[var6] = arg0.method225();
                    }
                    this.field1132[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1133 = true;
                } else if (var3 == 5) {
                    this.field1134 = arg0.method225();
                } else if (var3 == 6) {
                    this.field1135 = arg0.method227();
                } else if (var3 == 7) {
                    this.field1136 = arg0.method227();
                } else if (var3 == 8) {
                    this.field1137 = arg0.method225();
                } else if (var3 == 9) {
                    this.field1138 = arg0.method225();
                } else if (var3 == 10) {
                    this.field1139 = arg0.method225();
                } else if (var3 == 11) {
                    this.field1140 = arg0.method225();
                } else if (var3 == 12) {
                    this.field1141 = arg0.method230();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
