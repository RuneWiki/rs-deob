import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1146 = false;

    @OriginalMember(owner = "nc", name = "b", descriptor = "B")
    private byte field1147 = 4;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1155 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "Z")
    public boolean field1157 = false;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1158 = 5;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1160 = -1;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1161 = 99;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1162 = -1;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1163 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "Z")
    private static boolean field1148 = true;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "nc", name = "f", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "nc", name = "t", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "nc", name = "u", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1152;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1153;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "nc", name = "k", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[Lnc;")
    public static SeqType[] field1150;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLxb;)V")
    public static void method377(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method297("seq.dat", null), 15787);
        field1149 = var2.method229();
        if (field1150 == null) {
            field1150 = new SeqType[field1149];
        }
        for (int var3 = 0; var3 < field1149; var3++) {
            if (field1150[var3] == null) {
                field1150[var3] = new SeqType();
            }
            field1150[var3].method379(false, var2);
        }
        if (!arg0) {
            field1148 = !field1148;
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method378(int arg0, int arg1) {
        if (arg1 != 24425) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1154[arg0];
        if (var4 == 0) {
            AnimFrame var5 = AnimFrame.method47(this.field1152[arg0], this.field1147);
            if (var5 != null) {
                var4 = this.field1154[arg0] = var5.field148;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLlb;)V")
    public void method379(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method227();
                if (var3 == 0) {
                    if (this.field1151 == 0) {
                        this.field1151 = 1;
                        this.field1152 = new int[1];
                        this.field1152[0] = -1;
                        this.field1153 = new int[1];
                        this.field1153[0] = -1;
                        this.field1154 = new int[1];
                        this.field1154[0] = -1;
                    }
                    if (this.field1162 == -1) {
                        if (this.field1156 == null) {
                            this.field1162 = 0;
                        } else {
                            this.field1162 = 2;
                        }
                    }
                    if (this.field1163 == -1) {
                        if (this.field1156 != null) {
                            this.field1163 = 2;
                            return;
                        }
                        this.field1163 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1151 = arg1.method227();
                    this.field1152 = new int[this.field1151];
                    this.field1153 = new int[this.field1151];
                    this.field1154 = new int[this.field1151];
                    for (int var4 = 0; var4 < this.field1151; var4++) {
                        this.field1152[var4] = arg1.method229();
                        this.field1153[var4] = arg1.method229();
                        if (this.field1153[var4] == 65535) {
                            this.field1153[var4] = -1;
                        }
                        this.field1154[var4] = arg1.method229();
                    }
                } else if (var3 == 2) {
                    this.field1155 = arg1.method229();
                } else if (var3 == 3) {
                    int var5 = arg1.method227();
                    this.field1156 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1156[var6] = arg1.method227();
                    }
                    this.field1156[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1157 = true;
                } else if (var3 == 5) {
                    this.field1158 = arg1.method227();
                } else if (var3 == 6) {
                    this.field1159 = arg1.method229();
                } else if (var3 == 7) {
                    this.field1160 = arg1.method229();
                } else if (var3 == 8) {
                    this.field1161 = arg1.method227();
                } else if (var3 == 9) {
                    this.field1162 = arg1.method227();
                } else if (var3 == 10) {
                    this.field1163 = arg1.method227();
                } else if (var3 == 11) {
                    this.field1164 = arg1.method227();
                } else if (var3 == 12) {
                    this.field1165 = arg1.method232();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
