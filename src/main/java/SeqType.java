import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "h", descriptor = "I")
    public int field1154 = -1;

    @OriginalMember(owner = "nc", name = "j", descriptor = "Z")
    public boolean field1156 = false;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1157 = 5;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1158 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1160 = 99;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1161 = -1;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1162 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "nc", name = "s", descriptor = "Z")
    public static boolean field1165;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1152;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "nc", name = "c", descriptor = "[Lnc;")
    public static SeqType[] field1149;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILxb;)V")
    public static void method381(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("seq.dat", null), -26728);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1148 = var2.method231();
        if (field1149 == null) {
            field1149 = new SeqType[field1148];
        }
        for (int var4 = 0; var4 < field1148; var4++) {
            if (field1149[var4] == null) {
                field1149[var4] = new SeqType();
            }
            field1149[var4].method383(var2, 8);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field1147 = -245;
        }
        int var3 = this.field1153[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(true, this.field1151[arg1]);
            if (var4 != null) {
                var3 = this.field1153[arg1] = var4.field152;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Llb;I)V")
    public void method383(Packet arg0, int arg1) {
        if (arg1 != 8) {
            this.field1147 = -320;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
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
                    this.field1150 = arg0.method229();
                    this.field1151 = new int[this.field1150];
                    this.field1152 = new int[this.field1150];
                    this.field1153 = new int[this.field1150];
                    for (int var4 = 0; var4 < this.field1150; var4++) {
                        this.field1151[var4] = arg0.method231();
                        this.field1152[var4] = arg0.method231();
                        if (this.field1152[var4] == 65535) {
                            this.field1152[var4] = -1;
                        }
                        this.field1153[var4] = arg0.method231();
                    }
                } else if (var3 == 2) {
                    this.field1154 = arg0.method231();
                } else if (var3 == 3) {
                    int var5 = arg0.method229();
                    this.field1155 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1155[var6] = arg0.method229();
                    }
                    this.field1155[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1156 = true;
                } else if (var3 == 5) {
                    this.field1157 = arg0.method229();
                } else if (var3 == 6) {
                    this.field1158 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1159 = arg0.method231();
                } else if (var3 == 8) {
                    this.field1160 = arg0.method229();
                } else if (var3 == 9) {
                    this.field1161 = arg0.method229();
                } else if (var3 == 10) {
                    this.field1162 = arg0.method229();
                } else if (var3 == 11) {
                    this.field1163 = arg0.method229();
                } else if (var3 == 12) {
                    this.field1164 = arg0.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
