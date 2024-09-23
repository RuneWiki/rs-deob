import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "g", descriptor = "I")
    public int field1150 = -1;

    @OriginalMember(owner = "nc", name = "i", descriptor = "Z")
    public boolean field1152 = false;

    @OriginalMember(owner = "nc", name = "j", descriptor = "I")
    public int field1153 = 5;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1154 = -1;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1155 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1156 = 99;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1157 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1158 = -1;

    @OriginalMember(owner = "nc", name = "a", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "nc", name = "r", descriptor = "Z")
    public static boolean field1161;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[I")
    public int[] field1147;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1148;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "nc", name = "b", descriptor = "[Lnc;")
    public static SeqType[] field1145;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method381(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(-49365, arg0.method299("seq.dat", null));
        field1144 = var2.method231();
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field1145 == null) {
            field1145 = new SeqType[field1144];
        }
        for (int var4 = 0; var4 < field1144; var4++) {
            if (field1145[var4] == null) {
                field1145[var4] = new SeqType();
            }
            field1145[var4].method383(var2, false);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(IZ)I")
    public int method382(int arg0, boolean arg1) {
        if (!arg1) {
            return 3;
        }
        int var3 = this.field1149[arg0];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method47(0, this.field1147[arg0]);
            if (var4 != null) {
                var3 = this.field1149[arg0] = var4.field156;
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
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method229();
                if (var3 == 0) {
                    if (this.field1146 == 0) {
                        this.field1146 = 1;
                        this.field1147 = new int[1];
                        this.field1147[0] = -1;
                        this.field1148 = new int[1];
                        this.field1148[0] = -1;
                        this.field1149 = new int[1];
                        this.field1149[0] = -1;
                    }
                    if (this.field1157 == -1) {
                        if (this.field1151 == null) {
                            this.field1157 = 0;
                        } else {
                            this.field1157 = 2;
                        }
                    }
                    if (this.field1158 == -1) {
                        if (this.field1151 != null) {
                            this.field1158 = 2;
                            return;
                        }
                        this.field1158 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1146 = arg0.method229();
                    this.field1147 = new int[this.field1146];
                    this.field1148 = new int[this.field1146];
                    this.field1149 = new int[this.field1146];
                    for (int var4 = 0; var4 < this.field1146; var4++) {
                        this.field1147[var4] = arg0.method231();
                        this.field1148[var4] = arg0.method231();
                        if (this.field1148[var4] == 65535) {
                            this.field1148[var4] = -1;
                        }
                        this.field1149[var4] = arg0.method231();
                    }
                } else if (var3 == 2) {
                    this.field1150 = arg0.method231();
                } else if (var3 == 3) {
                    int var5 = arg0.method229();
                    this.field1151 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1151[var6] = arg0.method229();
                    }
                    this.field1151[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1152 = true;
                } else if (var3 == 5) {
                    this.field1153 = arg0.method229();
                } else if (var3 == 6) {
                    this.field1154 = arg0.method231();
                } else if (var3 == 7) {
                    this.field1155 = arg0.method231();
                } else if (var3 == 8) {
                    this.field1156 = arg0.method229();
                } else if (var3 == 9) {
                    this.field1157 = arg0.method229();
                } else if (var3 == 10) {
                    this.field1158 = arg0.method229();
                } else if (var3 == 11) {
                    this.field1159 = arg0.method229();
                } else if (var3 == 12) {
                    this.field1160 = arg0.method234();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
