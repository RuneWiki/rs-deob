import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    private int field1152 = -325;

    @OriginalMember(owner = "nc", name = "b", descriptor = "Z")
    private boolean field1153 = true;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1160 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1162 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1163 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1164 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1165 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1166 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1167 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1168 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "nc", name = "s", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "nc", name = "t", descriptor = "Z")
    public static boolean field1171;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1157;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1158;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1159;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1161;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1155;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILxb;)V")
    public static void method381(int arg0, Jagfile arg1) {
        if (arg0 != 35102) {
            return;
        }
        Packet var2 = new Packet(false, arg1.method299("seq.dat", null));
        field1154 = var2.method231();
        if (field1155 == null) {
            field1155 = new SeqType[field1154];
        }
        for (int var3 = 0; var3 < field1154; var3++) {
            if (field1155[var3] == null) {
                field1155[var3] = new SeqType();
            }
            field1155[var3].method383(var2, false);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(II)I")
    public int method382(int arg0, int arg1) {
        int var3 = this.field1159[arg0];
        if (arg1 <= 0) {
            this.field1152 = 465;
        }
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(this.field1157[arg0], 0);
            if (var4 != null) {
                var3 = this.field1159[arg0] = var4.field153;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Llb;Z)V")
    public void method383(Packet arg0, boolean arg1) {
        if (arg1) {
            this.field1153 = !this.field1153;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    if (this.field1156 == 0) {
                        this.field1156 = 1;
                        this.field1157 = new int[1];
                        this.field1157[0] = -1;
                        this.field1158 = new int[1];
                        this.field1158[0] = -1;
                        this.field1159 = new int[1];
                        this.field1159[0] = -1;
                    }
                    if (this.field1167 == -1) {
                        if (this.field1161 == null) {
                            this.field1167 = 0;
                        } else {
                            this.field1167 = 2;
                        }
                    }
                    if (this.field1168 == -1) {
                        if (this.field1161 != null) {
                            this.field1168 = 2;
                            return;
                        }
                        this.field1168 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1156 = arg0.method229();
                    this.field1157 = new int[this.field1156];
                    this.field1158 = new int[this.field1156];
                    this.field1159 = new int[this.field1156];
                    for (int var4 = 0; var4 < this.field1156; var4++) {
                        this.field1157[var4] = arg0.method231();
                        this.field1158[var4] = arg0.method231();
                        if (this.field1158[var4] == 65535) {
                            this.field1158[var4] = -1;
                        }
                        this.field1159[var4] = arg0.method231();
                    }
                } else if (var3 == 2) {
                    this.field1160 = arg0.method231();
                } else if (var3 == 3) {
                    int var5 = arg0.method229();
                    this.field1161 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1161[var6] = arg0.method229();
                    }
                    this.field1161[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1162 = true;
                } else if (var3 == 5) {
                    this.field1163 = arg0.method229();
                } else if (var3 == 6) {
                    this.field1164 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1165 = arg0.method231();
                } else if (var3 == 8) {
                    this.field1166 = arg0.method229();
                } else if (var3 == 9) {
                    this.field1167 = arg0.method229();
                } else if (var3 == 10) {
                    this.field1168 = arg0.method229();
                } else if (var3 == 11) {
                    this.field1169 = arg0.method229();
                } else if (var3 == 12) {
                    this.field1170 = arg0.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
