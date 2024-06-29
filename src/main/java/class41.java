import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PVVHTYPN")
public class class41 {

    @OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "I")
    private int field1145 = 9;

    @OriginalMember(owner = "client!PVVHTYPN", name = "h", descriptor = "I")
    public int field1152 = -1;

    @OriginalMember(owner = "client!PVVHTYPN", name = "j", descriptor = "Z")
    public boolean field1154 = false;

    @OriginalMember(owner = "client!PVVHTYPN", name = "k", descriptor = "I")
    public int field1155 = 5;

    @OriginalMember(owner = "client!PVVHTYPN", name = "l", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "client!PVVHTYPN", name = "m", descriptor = "I")
    public int field1157 = -1;

    @OriginalMember(owner = "client!PVVHTYPN", name = "n", descriptor = "I")
    public int field1158 = 99;

    @OriginalMember(owner = "client!PVVHTYPN", name = "o", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "client!PVVHTYPN", name = "p", descriptor = "I")
    public int field1160 = -1;

    @OriginalMember(owner = "client!PVVHTYPN", name = "q", descriptor = "I")
    public int field1161 = 2;

    @OriginalMember(owner = "client!PVVHTYPN", name = "b", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!PVVHTYPN", name = "d", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!PVVHTYPN", name = "r", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!PVVHTYPN", name = "s", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!PVVHTYPN", name = "e", descriptor = "[I")
    public int[] field1149;

    @OriginalMember(owner = "client!PVVHTYPN", name = "f", descriptor = "[I")
    public int[] field1150;

    @OriginalMember(owner = "client!PVVHTYPN", name = "g", descriptor = "[I")
    private int[] field1151;

    @OriginalMember(owner = "client!PVVHTYPN", name = "i", descriptor = "[I")
    public int[] field1153;

    @OriginalMember(owner = "client!PVVHTYPN", name = "c", descriptor = "[LPVVHTYPN;")
    public static class41[] field1147;

    @OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(BLRPFMUSNN;)V")
    public static void method389(byte arg0, class49 arg1) {
        if (arg0 != -114) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class63 var3 = new class63((byte) -58, arg1.method414("seq.dat", null));
        field1146 = var3.method504();
        if (field1147 == null) {
            field1147 = new class41[field1146];
        }
        for (int var4 = 0; var4 < field1146; var4++) {
            if (field1147[var4] == null) {
                field1147[var4] = new class41();
            }
            field1147[var4].method391(-934, var3);
        }
    }

    @OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(IB)I")
    public int method390(int arg0, byte arg1) {
        if (arg1 != -99) {
            return this.field1145;
        }
        int var3 = this.field1151[arg0];
        if (var3 == 0) {
            class6 var4 = class6.method177(this.field1149[arg0]);
            if (var4 != null) {
                var3 = this.field1151[arg0] = var4.field592;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!PVVHTYPN", name = "a", descriptor = "(ILWNCFPLWV;)V")
    public void method391(int arg0, class63 arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method502();
                if (var4 == 0) {
                    if (this.field1148 == 0) {
                        this.field1148 = 1;
                        this.field1149 = new int[1];
                        this.field1149[0] = -1;
                        this.field1150 = new int[1];
                        this.field1150[0] = -1;
                        this.field1151 = new int[1];
                        this.field1151[0] = -1;
                    }
                    if (this.field1159 == -1) {
                        if (this.field1153 == null) {
                            this.field1159 = 0;
                        } else {
                            this.field1159 = 2;
                        }
                    }
                    if (this.field1160 == -1) {
                        if (this.field1153 != null) {
                            this.field1160 = 2;
                            return;
                        }
                        this.field1160 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1148 = arg1.method502();
                    this.field1149 = new int[this.field1148];
                    this.field1150 = new int[this.field1148];
                    this.field1151 = new int[this.field1148];
                    for (int var5 = 0; var5 < this.field1148; var5++) {
                        this.field1149[var5] = arg1.method504();
                        this.field1150[var5] = arg1.method504();
                        if (this.field1150[var5] == 65535) {
                            this.field1150[var5] = -1;
                        }
                        this.field1151[var5] = arg1.method504();
                    }
                } else if (var4 == 2) {
                    this.field1152 = arg1.method504();
                } else if (var4 == 3) {
                    int var6 = arg1.method502();
                    this.field1153 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1153[var7] = arg1.method502();
                    }
                    this.field1153[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1154 = true;
                } else if (var4 == 5) {
                    this.field1155 = arg1.method502();
                } else if (var4 == 6) {
                    this.field1156 = arg1.method504();
                } else if (var4 == 7) {
                    this.field1157 = arg1.method504();
                } else if (var4 == 8) {
                    this.field1158 = arg1.method502();
                } else if (var4 == 9) {
                    this.field1159 = arg1.method502();
                } else if (var4 == 10) {
                    this.field1160 = arg1.method502();
                } else if (var4 == 11) {
                    this.field1161 = arg1.method502();
                } else if (var4 == 12) {
                    this.field1162 = arg1.method507();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
