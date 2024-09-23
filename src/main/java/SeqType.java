import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nc")
public class SeqType {

    @OriginalMember(owner = "nc", name = "a", descriptor = "Z")
    private boolean field1107 = true;

    @OriginalMember(owner = "nc", name = "i", descriptor = "I")
    public int field1115 = -1;

    @OriginalMember(owner = "nc", name = "k", descriptor = "Z")
    public boolean field1117 = false;

    @OriginalMember(owner = "nc", name = "l", descriptor = "I")
    public int field1118 = 5;

    @OriginalMember(owner = "nc", name = "m", descriptor = "I")
    public int field1119 = -1;

    @OriginalMember(owner = "nc", name = "n", descriptor = "I")
    public int field1120 = -1;

    @OriginalMember(owner = "nc", name = "o", descriptor = "I")
    public int field1121 = 99;

    @OriginalMember(owner = "nc", name = "p", descriptor = "I")
    public int field1122 = -1;

    @OriginalMember(owner = "nc", name = "q", descriptor = "I")
    public int field1123 = -1;

    @OriginalMember(owner = "nc", name = "c", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "nc", name = "e", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "nc", name = "r", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "nc", name = "b", descriptor = "Z")
    private static boolean field1108;

    @OriginalMember(owner = "nc", name = "s", descriptor = "Z")
    public static boolean field1125;

    @OriginalMember(owner = "nc", name = "f", descriptor = "[I")
    public int[] field1112;

    @OriginalMember(owner = "nc", name = "g", descriptor = "[I")
    public int[] field1113;

    @OriginalMember(owner = "nc", name = "h", descriptor = "[I")
    private int[] field1114;

    @OriginalMember(owner = "nc", name = "j", descriptor = "[I")
    public int[] field1116;

    @OriginalMember(owner = "nc", name = "d", descriptor = "[Lnc;")
    public static SeqType[] field1110;

    @OriginalMember(owner = "nc", name = "a", descriptor = "(Lyb;Z)V")
    public static void method383(Jagfile arg0, boolean arg1) {
        if (!arg1) {
            field1108 = !field1108;
        }
        Packet var2 = new Packet(arg0.method309("seq.dat", null), 337);
        field1109 = var2.method241();
        if (field1110 == null) {
            field1110 = new SeqType[field1109];
        }
        for (int var3 = 0; var3 < field1109; var3++) {
            if (field1110[var3] == null) {
                field1110[var3] = new SeqType();
            }
            field1110[var3].method385(0, var2);
        }
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(IZ)I")
    public int method384(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1107 = !this.field1107;
        }
        int var3 = this.field1114[arg0];
        if (var3 == 0) {
            AnimFrame var4 = AnimFrame.method61(this.field1112[arg0], (byte) -18);
            if (var4 != null) {
                var3 = this.field1114[arg0] = var4.field158;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "nc", name = "a", descriptor = "(ILmb;)V")
    public void method385(int arg0, Packet arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    if (this.field1111 == 0) {
                        this.field1111 = 1;
                        this.field1112 = new int[1];
                        this.field1112[0] = -1;
                        this.field1113 = new int[1];
                        this.field1113[0] = -1;
                        this.field1114 = new int[1];
                        this.field1114[0] = -1;
                    }
                    if (this.field1122 == -1) {
                        if (this.field1116 == null) {
                            this.field1122 = 0;
                        } else {
                            this.field1122 = 2;
                        }
                    }
                    if (this.field1123 == -1) {
                        if (this.field1116 != null) {
                            this.field1123 = 2;
                            return;
                        }
                        this.field1123 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1111 = arg1.method239();
                    this.field1112 = new int[this.field1111];
                    this.field1113 = new int[this.field1111];
                    this.field1114 = new int[this.field1111];
                    for (int var5 = 0; var5 < this.field1111; var5++) {
                        this.field1112[var5] = arg1.method241();
                        this.field1113[var5] = arg1.method241();
                        if (this.field1113[var5] == 65535) {
                            this.field1113[var5] = -1;
                        }
                        this.field1114[var5] = arg1.method241();
                    }
                } else if (var4 == 2) {
                    this.field1115 = arg1.method241();
                } else if (var4 == 3) {
                    int var6 = arg1.method239();
                    this.field1116 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1116[var7] = arg1.method239();
                    }
                    this.field1116[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1117 = true;
                } else if (var4 == 5) {
                    this.field1118 = arg1.method239();
                } else if (var4 == 6) {
                    this.field1119 = arg1.method241();
                } else if (var4 == 7) {
                    this.field1120 = arg1.method241();
                } else if (var4 == 8) {
                    this.field1121 = arg1.method239();
                } else if (var4 == 9) {
                    this.field1122 = arg1.method239();
                } else if (var4 == 10) {
                    this.field1123 = arg1.method239();
                } else if (var4 == 11) {
                    this.field1124 = arg1.method239();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
