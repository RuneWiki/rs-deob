import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class SeqType {

    @OriginalMember(owner = "oc", name = "i", descriptor = "I")
    public int field1141 = -1;

    @OriginalMember(owner = "oc", name = "k", descriptor = "Z")
    public boolean field1143 = false;

    @OriginalMember(owner = "oc", name = "l", descriptor = "I")
    public int field1144 = 5;

    @OriginalMember(owner = "oc", name = "m", descriptor = "I")
    public int field1145 = -1;

    @OriginalMember(owner = "oc", name = "n", descriptor = "I")
    public int field1146 = -1;

    @OriginalMember(owner = "oc", name = "o", descriptor = "I")
    public int field1147 = 99;

    @OriginalMember(owner = "oc", name = "p", descriptor = "I")
    public int field1148 = -1;

    @OriginalMember(owner = "oc", name = "q", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    private static int field1133 = 6771;

    @OriginalMember(owner = "oc", name = "b", descriptor = "Z")
    private static boolean field1134 = true;

    @OriginalMember(owner = "oc", name = "c", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "oc", name = "e", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "oc", name = "r", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "oc", name = "s", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "oc", name = "f", descriptor = "[I")
    public int[] field1138;

    @OriginalMember(owner = "oc", name = "g", descriptor = "[I")
    public int[] field1139;

    @OriginalMember(owner = "oc", name = "h", descriptor = "[I")
    private int[] field1140;

    @OriginalMember(owner = "oc", name = "j", descriptor = "[I")
    public int[] field1142;

    @OriginalMember(owner = "oc", name = "d", descriptor = "[Loc;")
    public static SeqType[] field1136;

    @OriginalMember(owner = "oc", name = "a", descriptor = "(ILyb;)V")
    public static void method378(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method298("seq.dat", null), true);
        field1135 = var2.method230();
        if (field1136 == null) {
            field1136 = new SeqType[field1135];
        }
        for (int var3 = 0; var3 < field1135; var3++) {
            if (field1136[var3] == null) {
                field1136[var3] = new SeqType();
            }
            field1136[var3].method380((byte) 44, var2);
        }
        if (field1133 != arg0) {
            field1134 = !field1134;
        }
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(II)I")
    public int method379(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 1) {
            return field1133;
        }
        int var3 = this.field1140[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1138[arg1], 196);
            if (var4 != null) {
                var3 = this.field1140[arg1] = var4.field156;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "oc", name = "a", descriptor = "(BLmb;)V")
    public void method380(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method228();
                if (var3 == 0) {
                    if (this.field1137 == 0) {
                        this.field1137 = 1;
                        this.field1138 = new int[1];
                        this.field1138[0] = -1;
                        this.field1139 = new int[1];
                        this.field1139[0] = -1;
                        this.field1140 = new int[1];
                        this.field1140[0] = -1;
                    }
                    if (this.field1148 == -1) {
                        if (this.field1142 == null) {
                            this.field1148 = 0;
                        } else {
                            this.field1148 = 2;
                        }
                    }
                    if (this.field1149 == -1) {
                        if (this.field1142 != null) {
                            this.field1149 = 2;
                            return;
                        }
                        this.field1149 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1137 = arg1.method228();
                    this.field1138 = new int[this.field1137];
                    this.field1139 = new int[this.field1137];
                    this.field1140 = new int[this.field1137];
                    for (int var4 = 0; var4 < this.field1137; var4++) {
                        this.field1138[var4] = arg1.method230();
                        this.field1139[var4] = arg1.method230();
                        if (this.field1139[var4] == 65535) {
                            this.field1139[var4] = -1;
                        }
                        this.field1140[var4] = arg1.method230();
                    }
                } else if (var3 == 2) {
                    this.field1141 = arg1.method230();
                } else if (var3 == 3) {
                    int var5 = arg1.method228();
                    this.field1142 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1142[var6] = arg1.method228();
                    }
                    this.field1142[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1143 = true;
                } else if (var3 == 5) {
                    this.field1144 = arg1.method228();
                } else if (var3 == 6) {
                    this.field1145 = arg1.method230();
                } else if (var3 == 7) {
                    this.field1146 = arg1.method230();
                } else if (var3 == 8) {
                    this.field1147 = arg1.method228();
                } else if (var3 == 9) {
                    this.field1148 = arg1.method228();
                } else if (var3 == 10) {
                    this.field1149 = arg1.method228();
                } else if (var3 == 11) {
                    this.field1150 = arg1.method228();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
