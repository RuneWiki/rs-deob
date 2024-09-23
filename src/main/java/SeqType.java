import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "nc", name = "h", descriptor = "I")
    public int field1117 = -1;

    @OriginalMember(owner = "nc", name = "j", descriptor = "Z")
    public boolean field1119 = false;

    @OriginalMember(owner = "nc", name = "k", descriptor = "I")
    public int field1120 = 5;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1121 = -1;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1122 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1123 = 99;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1124 = -1;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "nc", name = "b", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "nc", name = "d", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "nc", name = "r", descriptor = "Z")
    public static boolean field1127;

    @OriginalMember(owner = "nc", name = "e", descriptor = "[I")
    public int[] field1114;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1115;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    private int[] field1116;

    @OriginalMember(owner = "nc", name = "i", descriptor = "[I")
    public int[] field1118;

    @OriginalMember(owner = "nc", name = "c", descriptor = "[Lnc;")
    public static SeqType[] field1112;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ZLyb;)V")
    public static void method383(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method309("seq.dat", null), (byte) 3);
        field1111 = var2.method241();
        if (field1112 == null) {
            field1112 = new SeqType[field1111];
        }
        for (int var3 = 0; var3 < field1111; var3++) {
            if (field1112[var3] == null) {
                field1112[var3] = new SeqType();
            }
            field1112[var3].method385(9, var2);
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(BI)I")
    public int method384(byte arg0, int arg1) {
        if (arg0 != -103) {
            this.field1110 = !this.field1110;
        }
        int var3 = this.field1116[arg1];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method61(0, this.field1114[arg1]);
            if (var4 != null) {
                var3 = this.field1116[arg1] = var4.field164;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILmb;)V")
    public void method385(int arg0, Packet arg1) {
        if (arg0 < 9 || arg0 > 9) {
            this.field1110 = !this.field1110;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    if (this.field1113 == 0) {
                        this.field1113 = 1;
                        this.field1114 = new int[1];
                        this.field1114[0] = -1;
                        this.field1115 = new int[1];
                        this.field1115[0] = -1;
                        this.field1116 = new int[1];
                        this.field1116[0] = -1;
                    }
                    if (this.field1124 == -1) {
                        if (this.field1118 == null) {
                            this.field1124 = 0;
                        } else {
                            this.field1124 = 2;
                        }
                    }
                    if (this.field1125 == -1) {
                        if (this.field1118 != null) {
                            this.field1125 = 2;
                            return;
                        }
                        this.field1125 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1113 = arg1.method239();
                    this.field1114 = new int[this.field1113];
                    this.field1115 = new int[this.field1113];
                    this.field1116 = new int[this.field1113];
                    for (int var4 = 0; var4 < this.field1113; var4++) {
                        this.field1114[var4] = arg1.method241();
                        this.field1115[var4] = arg1.method241();
                        if (this.field1115[var4] == 65535) {
                            this.field1115[var4] = -1;
                        }
                        this.field1116[var4] = arg1.method241();
                    }
                } else if (var3 == 2) {
                    this.field1117 = arg1.method241();
                } else if (var3 == 3) {
                    int var5 = arg1.method239();
                    this.field1118 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1118[var6] = arg1.method239();
                    }
                    this.field1118[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1119 = true;
                } else if (var3 == 5) {
                    this.field1120 = arg1.method239();
                } else if (var3 == 6) {
                    this.field1121 = arg1.method241();
                } else if (var3 == 7) {
                    this.field1122 = arg1.method241();
                } else if (var3 == 8) {
                    this.field1123 = arg1.method239();
                } else if (var3 == 9) {
                    this.field1124 = arg1.method239();
                } else if (var3 == 10) {
                    this.field1125 = arg1.method239();
                } else if (var3 == 11) {
                    this.field1126 = arg1.method239();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
