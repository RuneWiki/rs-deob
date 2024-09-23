import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1118 = true;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1126 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1128 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1129 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1130 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1131 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1132 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1133 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1134 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "nc", name = "b", descriptor = "Z")
    private static boolean field1119;

    @OriginalMember(owner = "nc", name = "s", descriptor = "Z")
    public static boolean field1136;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1123;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1124;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1125;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1127;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1121;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLyb;)V")
    public static void method383(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(16, arg1.method309("seq.dat", null));
        field1120 = var2.method241();
        if (!arg0) {
            field1119 = true;
        }
        if (field1121 == null) {
            field1121 = new SeqType[field1120];
        }
        for (int var3 = 0; var3 < field1120; var3++) {
            if (field1121[var3] == null) {
                field1121[var3] = new SeqType();
            }
            field1121[var3].method385(891, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(IB)I")
    public int method384(int arg0, byte arg1) {
        if (arg1 == 2) {
            boolean var3 = false;
        }
        int var4 = this.field1125[arg0];
        if (var4 == 0) {
            AnimFrame var5 = AnimFrame.method61(this.field1118, this.field1123[arg0]);
            if (var5 != null) {
                var4 = this.field1125[arg0] = var5.field167;
            }
        }
        if (var4 == 0) {
            var4 = 1;
        }
        return var4;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILmb;)V")
    public void method385(int arg0, Packet arg1) {
        int var3 = 99 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    if (this.field1122 == 0) {
                        this.field1122 = 1;
                        this.field1123 = new int[1];
                        this.field1123[0] = -1;
                        this.field1124 = new int[1];
                        this.field1124[0] = -1;
                        this.field1125 = new int[1];
                        this.field1125[0] = -1;
                    }
                    if (this.field1133 == -1) {
                        if (this.field1127 == null) {
                            this.field1133 = 0;
                        } else {
                            this.field1133 = 2;
                        }
                    }
                    if (this.field1134 == -1) {
                        if (this.field1127 != null) {
                            this.field1134 = 2;
                            return;
                        }
                        this.field1134 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1122 = arg1.method239();
                    this.field1123 = new int[this.field1122];
                    this.field1124 = new int[this.field1122];
                    this.field1125 = new int[this.field1122];
                    for (int var5 = 0; var5 < this.field1122; var5++) {
                        this.field1123[var5] = arg1.method241();
                        this.field1124[var5] = arg1.method241();
                        if (this.field1124[var5] == 65535) {
                            this.field1124[var5] = -1;
                        }
                        this.field1125[var5] = arg1.method241();
                    }
                } else if (var4 == 2) {
                    this.field1126 = arg1.method241();
                } else if (var4 == 3) {
                    int var6 = arg1.method239();
                    this.field1127 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1127[var7] = arg1.method239();
                    }
                    this.field1127[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1128 = true;
                } else if (var4 == 5) {
                    this.field1129 = arg1.method239();
                } else if (var4 == 6) {
                    this.field1130 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1131 = arg1.method241();
                } else if (var4 == 8) {
                    this.field1132 = arg1.method239();
                } else if (var4 == 9) {
                    this.field1133 = arg1.method239();
                } else if (var4 == 10) {
                    this.field1134 = arg1.method239();
                } else if (var4 == 11) {
                    this.field1135 = arg1.method239();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
