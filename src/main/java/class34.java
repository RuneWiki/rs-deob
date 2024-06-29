import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KSVXFIAD")
public class class34 {

    @OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "Z")
    private boolean field1137 = true;

    @OriginalMember(owner = "client!KSVXFIAD", name = "b", descriptor = "I")
    private int field1138 = 1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "i", descriptor = "I")
    public int field1145 = -1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "k", descriptor = "Z")
    public boolean field1147 = false;

    @OriginalMember(owner = "client!KSVXFIAD", name = "l", descriptor = "I")
    public int field1148 = 5;

    @OriginalMember(owner = "client!KSVXFIAD", name = "m", descriptor = "I")
    public int field1149 = -1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "n", descriptor = "I")
    public int field1150 = -1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "o", descriptor = "I")
    public int field1151 = 99;

    @OriginalMember(owner = "client!KSVXFIAD", name = "p", descriptor = "I")
    public int field1152 = -1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "q", descriptor = "I")
    public int field1153 = -1;

    @OriginalMember(owner = "client!KSVXFIAD", name = "r", descriptor = "I")
    public int field1154 = 2;

    @OriginalMember(owner = "client!KSVXFIAD", name = "c", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!KSVXFIAD", name = "e", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!KSVXFIAD", name = "s", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!KSVXFIAD", name = "t", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!KSVXFIAD", name = "f", descriptor = "[I")
    public int[] field1142;

    @OriginalMember(owner = "client!KSVXFIAD", name = "g", descriptor = "[I")
    public int[] field1143;

    @OriginalMember(owner = "client!KSVXFIAD", name = "h", descriptor = "[I")
    private int[] field1144;

    @OriginalMember(owner = "client!KSVXFIAD", name = "j", descriptor = "[I")
    public int[] field1146;

    @OriginalMember(owner = "client!KSVXFIAD", name = "d", descriptor = "[LKSVXFIAD;")
    public static class34[] field1140;

    @OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method374(byte arg0, class32 arg1) {
        if (arg0 != -3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class59 var3 = new class59(859, arg1.method372("seq.dat", null));
        field1139 = var3.method531();
        if (field1140 == null) {
            field1140 = new class34[field1139];
        }
        for (int var4 = 0; var4 < field1139; var4++) {
            if (field1140[var4] == null) {
                field1140[var4] = new class34();
            }
            field1140[var4].method376(var3, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(BI)I")
    public int method375(byte arg0, int arg1) {
        int var3 = this.field1144[arg1];
        if (arg0 != -37) {
            this.field1137 = !this.field1137;
        }
        if (var3 == 0) {
            class47 var4 = class47.method466(this.field1142[arg1]);
            if (var4 != null) {
                var3 = this.field1144[arg1] = var4.field1348;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!KSVXFIAD", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public void method376(class59 arg0, byte arg1) {
        if (arg1 != 4) {
            this.field1138 = 263;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method529();
                if (var3 == 0) {
                    if (this.field1141 == 0) {
                        this.field1141 = 1;
                        this.field1142 = new int[1];
                        this.field1142[0] = -1;
                        this.field1143 = new int[1];
                        this.field1143[0] = -1;
                        this.field1144 = new int[1];
                        this.field1144[0] = -1;
                    }
                    if (this.field1152 == -1) {
                        if (this.field1146 == null) {
                            this.field1152 = 0;
                        } else {
                            this.field1152 = 2;
                        }
                    }
                    if (this.field1153 == -1) {
                        if (this.field1146 != null) {
                            this.field1153 = 2;
                            return;
                        }
                        this.field1153 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field1141 = arg0.method529();
                    this.field1142 = new int[this.field1141];
                    this.field1143 = new int[this.field1141];
                    this.field1144 = new int[this.field1141];
                    for (int var4 = 0; var4 < this.field1141; var4++) {
                        this.field1142[var4] = arg0.method531();
                        this.field1143[var4] = arg0.method531();
                        if (this.field1143[var4] == 65535) {
                            this.field1143[var4] = -1;
                        }
                        this.field1144[var4] = arg0.method531();
                    }
                } else if (var3 == 2) {
                    this.field1145 = arg0.method531();
                } else if (var3 == 3) {
                    int var5 = arg0.method529();
                    this.field1146 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1146[var6] = arg0.method529();
                    }
                    this.field1146[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field1147 = true;
                } else if (var3 == 5) {
                    this.field1148 = arg0.method529();
                } else if (var3 == 6) {
                    this.field1149 = arg0.method531();
                } else if (var3 == 7) {
                    this.field1150 = arg0.method531();
                } else if (var3 == 8) {
                    this.field1151 = arg0.method529();
                } else if (var3 == 9) {
                    this.field1152 = arg0.method529();
                } else if (var3 == 10) {
                    this.field1153 = arg0.method529();
                } else if (var3 == 11) {
                    this.field1154 = arg0.method529();
                } else if (var3 == 12) {
                    this.field1155 = arg0.method534();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
