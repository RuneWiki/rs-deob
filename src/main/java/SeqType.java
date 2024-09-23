import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "g", descriptor = "I")
    public int field1154 = -1;

    @OriginalMember(owner = "nc", name = "i", descriptor = "Z")
    public boolean field1156 = false;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1157 = 5;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1158 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1160 = 99;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1161 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1162 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "nc", name = "q", descriptor = "Z")
    public static boolean field1164;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1152;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "nc", name = "b", descriptor = "[Lnc;")
    public static SeqType[] field1149;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lyb;I)V")
    public static void method383(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(45427, arg0.method309("seq.dat", null));
        field1148 = var2.method241();
        if (field1149 == null) {
            field1149 = new SeqType[field1148];
        }
        for (int var3 = 0; var3 < field1148; var3++) {
            if (field1149[var3] == null) {
                field1149[var3] = new SeqType();
            }
            field1149[var3].method385(var2, (byte) 66);
        }
        int var4 = 40 / arg1;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method384(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1153[arg1];
        if (var4 == 0) {
            AnimFrame var5 = AnimFrame.method61(0, this.field1151[arg1]);
            if (var5 != null) {
                var4 = this.field1153[arg1] = var5.field178;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lmb;B)V")
    public void method385(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method239();
                if (var3 == 0) {
                    if (this.field1150 == 0) {
                        this.field1150 = 1;
                        this.field1151 = new int[1];
                        this.field1151[0] = -1;
                        this.field1152 = new int[1];
                        this.field1152[0] = -1;
                        this.field1153 = new int[1];
                        this.field1153[0] = -1;
                    }
                    if (this.field1161 == -1) {
                        if (this.field1155 == null) {
                            this.field1161 = 0;
                        } else {
                            this.field1161 = 2;
                        }
                    }
                    if (this.field1162 == -1) {
                        if (this.field1155 != null) {
                            this.field1162 = 2;
                            return;
                        }
                        this.field1162 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1150 = arg0.method239();
                    this.field1151 = new int[this.field1150];
                    this.field1152 = new int[this.field1150];
                    this.field1153 = new int[this.field1150];
                    for (int var4 = 0; var4 < this.field1150; var4++) {
                        this.field1151[var4] = arg0.method241();
                        this.field1152[var4] = arg0.method241();
                        if (this.field1152[var4] == 65535) {
                            this.field1152[var4] = -1;
                        }
                        this.field1153[var4] = arg0.method241();
                    }
                } else if (var3 == 2) {
                    this.field1154 = arg0.method241();
                } else if (var3 == 3) {
                    int var5 = arg0.method239();
                    this.field1155 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1155[var6] = arg0.method239();
                    }
                    this.field1155[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1156 = true;
                } else if (var3 == 5) {
                    this.field1157 = arg0.method239();
                } else if (var3 == 6) {
                    this.field1158 = arg0.method241();
                } else if (var3 == 7) {
                    this.field1159 = arg0.method241();
                } else if (var3 == 8) {
                    this.field1160 = arg0.method239();
                } else if (var3 == 9) {
                    this.field1161 = arg0.method239();
                } else if (var3 == 10) {
                    this.field1162 = arg0.method239();
                } else if (var3 == 11) {
                    this.field1163 = arg0.method239();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
