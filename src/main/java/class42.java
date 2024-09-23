import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NMXKUYSC")
public class class42 {

    @OriginalMember(owner = "NMXKUYSC", name = "b", descriptor = "I")
    private int field1156 = 5;

    @OriginalMember(owner = "NMXKUYSC", name = "i", descriptor = "I")
    public int field1163 = -1;

    @OriginalMember(owner = "NMXKUYSC", name = "k", descriptor = "Z")
    public boolean field1165 = false;

    @OriginalMember(owner = "NMXKUYSC", name = "l", descriptor = "I")
    public int field1166 = 5;

    @OriginalMember(owner = "NMXKUYSC", name = "m", descriptor = "I")
    public int field1167 = -1;

    @OriginalMember(owner = "NMXKUYSC", name = "n", descriptor = "I")
    public int field1168 = -1;

    @OriginalMember(owner = "NMXKUYSC", name = "o", descriptor = "I")
    public int field1169 = 99;

    @OriginalMember(owner = "NMXKUYSC", name = "p", descriptor = "I")
    public int field1170 = -1;

    @OriginalMember(owner = "NMXKUYSC", name = "q", descriptor = "I")
    public int field1171 = -1;

    @OriginalMember(owner = "NMXKUYSC", name = "r", descriptor = "I")
    public int field1172 = 2;

    @OriginalMember(owner = "NMXKUYSC", name = "a", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "NMXKUYSC", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "NMXKUYSC", name = "e", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "NMXKUYSC", name = "s", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "NMXKUYSC", name = "t", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "NMXKUYSC", name = "f", descriptor = "[I")
    public int[] field1160;

    @OriginalMember(owner = "NMXKUYSC", name = "g", descriptor = "[I")
    public int[] field1161;

    @OriginalMember(owner = "NMXKUYSC", name = "h", descriptor = "[I")
    private int[] field1162;

    @OriginalMember(owner = "NMXKUYSC", name = "j", descriptor = "[I")
    public int[] field1164;

    @OriginalMember(owner = "NMXKUYSC", name = "d", descriptor = "[LNMXKUYSC;")
    public static class42[] field1158;

    @OriginalMember(owner = "NMXKUYSC", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method414(int arg0, class7 arg1) {
        class62 var2 = new class62(-417, arg1.method180("seq.dat", null));
        field1157 = var2.method523();
        if (field1158 == null) {
            field1158 = new class42[field1157];
        }
        for (int var3 = 0; var3 < field1157; var3++) {
            if (field1158[var3] == null) {
                field1158[var3] = new class42();
            }
            field1158[var3].method416((byte) 5, var2);
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "NMXKUYSC", name = "a", descriptor = "(IB)I")
    public int method415(int arg0, byte arg1) {
        int var3 = this.field1162[arg0];
        if (arg1 != 6) {
            return this.field1155;
        }
        boolean var4 = false;
        if (var3 == 0) {
            class71 var5 = class71.method584(this.field1160[arg0], 0);
            if (var5 != null) {
                var3 = this.field1162[arg0] = var5.field1696;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "NMXKUYSC", name = "a", descriptor = "(BLXOUQUKZW;)V")
    public void method416(byte arg0, class62 arg1) {
        if (arg0 != 5) {
            this.field1156 = 391;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method521();
                if (var3 == 0) {
                    if (this.field1159 == 0) {
                        this.field1159 = 1;
                        this.field1160 = new int[1];
                        this.field1160[0] = -1;
                        this.field1161 = new int[1];
                        this.field1161[0] = -1;
                        this.field1162 = new int[1];
                        this.field1162[0] = -1;
                    }
                    if (this.field1170 == -1) {
                        if (this.field1164 == null) {
                            this.field1170 = 0;
                        } else {
                            this.field1170 = 2;
                        }
                    }
                    if (this.field1171 == -1) {
                        if (this.field1164 != null) {
                            this.field1171 = 2;
                            return;
                        }
                        this.field1171 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1159 = arg1.method521();
                    this.field1160 = new int[this.field1159];
                    this.field1161 = new int[this.field1159];
                    this.field1162 = new int[this.field1159];
                    for (int var4 = 0; var4 < this.field1159; var4++) {
                        this.field1160[var4] = arg1.method523();
                        this.field1161[var4] = arg1.method523();
                        if (this.field1161[var4] == 65535) {
                            this.field1161[var4] = -1;
                        }
                        this.field1162[var4] = arg1.method523();
                    }
                } else if (var3 == 2) {
                    this.field1163 = arg1.method523();
                } else if (var3 == 3) {
                    int var5 = arg1.method521();
                    this.field1164 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1164[var6] = arg1.method521();
                    }
                    this.field1164[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1165 = true;
                } else if (var3 == 5) {
                    this.field1166 = arg1.method521();
                } else if (var3 == 6) {
                    this.field1167 = arg1.method523();
                } else if (var3 == 7) {
                    this.field1168 = arg1.method523();
                } else if (var3 == 8) {
                    this.field1169 = arg1.method521();
                } else if (var3 == 9) {
                    this.field1170 = arg1.method521();
                } else if (var3 == 10) {
                    this.field1171 = arg1.method521();
                } else if (var3 == 11) {
                    this.field1172 = arg1.method521();
                } else if (var3 == 12) {
                    this.field1173 = arg1.method526();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
