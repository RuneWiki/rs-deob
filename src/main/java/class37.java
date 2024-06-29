import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PQTJDTHH")
public class class37 {

    @OriginalMember(owner = "client!PQTJDTHH", name = "g", descriptor = "I")
    public int field1118 = -1;

    @OriginalMember(owner = "client!PQTJDTHH", name = "i", descriptor = "Z")
    public boolean field1120 = false;

    @OriginalMember(owner = "client!PQTJDTHH", name = "j", descriptor = "I")
    public int field1121 = 5;

    @OriginalMember(owner = "client!PQTJDTHH", name = "k", descriptor = "I")
    public int field1122 = -1;

    @OriginalMember(owner = "client!PQTJDTHH", name = "l", descriptor = "I")
    public int field1123 = -1;

    @OriginalMember(owner = "client!PQTJDTHH", name = "m", descriptor = "I")
    public int field1124 = 99;

    @OriginalMember(owner = "client!PQTJDTHH", name = "n", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "client!PQTJDTHH", name = "o", descriptor = "I")
    public int field1126 = -1;

    @OriginalMember(owner = "client!PQTJDTHH", name = "p", descriptor = "I")
    public int field1127 = 2;

    @OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!PQTJDTHH", name = "c", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!PQTJDTHH", name = "q", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!PQTJDTHH", name = "r", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!PQTJDTHH", name = "d", descriptor = "[I")
    public int[] field1115;

    @OriginalMember(owner = "client!PQTJDTHH", name = "e", descriptor = "[I")
    public int[] field1116;

    @OriginalMember(owner = "client!PQTJDTHH", name = "f", descriptor = "[I")
    private int[] field1117;

    @OriginalMember(owner = "client!PQTJDTHH", name = "h", descriptor = "[I")
    public int[] field1119;

    @OriginalMember(owner = "client!PQTJDTHH", name = "b", descriptor = "[LPQTJDTHH;")
    public static class37[] field1113;

    @OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(ZLAKPFVPPG;)V")
    public static void method404(boolean arg0, class2 arg1) {
        class13 var2 = new class13(arg1.method7("seq.dat", null), (byte) 3);
        field1112 = var2.method215();
        if (!arg0) {
            return;
        }
        if (field1113 == null) {
            field1113 = new class37[field1112];
        }
        for (int var3 = 0; var3 < field1112; var3++) {
            if (field1113[var3] == null) {
                field1113[var3] = new class37();
            }
            field1113[var3].method406(var2, 799);
        }
    }

    @OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(II)I")
    public int method405(int arg0, int arg1) {
        if (arg0 >= 0) {
            return 3;
        }
        int var3 = this.field1117[arg1];
        if (var3 == 0) {
            class53 var4 = class53.method454(this.field1115[arg1]);
            if (var4 != null) {
                var3 = this.field1117[arg1] = var4.field1404;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!PQTJDTHH", name = "a", descriptor = "(LFTMSICIZ;I)V")
    public void method406(class13 arg0, int arg1) {
        int var3 = 44 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method213();
                if (var4 == 0) {
                    if (this.field1114 == 0) {
                        this.field1114 = 1;
                        this.field1115 = new int[1];
                        this.field1115[0] = -1;
                        this.field1116 = new int[1];
                        this.field1116[0] = -1;
                        this.field1117 = new int[1];
                        this.field1117[0] = -1;
                    }
                    if (this.field1125 == -1) {
                        if (this.field1119 == null) {
                            this.field1125 = 0;
                        } else {
                            this.field1125 = 2;
                        }
                    }
                    if (this.field1126 == -1) {
                        if (this.field1119 != null) {
                            this.field1126 = 2;
                            return;
                        }
                        this.field1126 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1114 = arg0.method213();
                    this.field1115 = new int[this.field1114];
                    this.field1116 = new int[this.field1114];
                    this.field1117 = new int[this.field1114];
                    for (int var5 = 0; var5 < this.field1114; var5++) {
                        this.field1115[var5] = arg0.method215();
                        this.field1116[var5] = arg0.method215();
                        if (this.field1116[var5] == 65535) {
                            this.field1116[var5] = -1;
                        }
                        this.field1117[var5] = arg0.method215();
                    }
                } else if (var4 == 2) {
                    this.field1118 = arg0.method215();
                } else if (var4 == 3) {
                    int var6 = arg0.method213();
                    this.field1119 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1119[var7] = arg0.method213();
                    }
                    this.field1119[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1120 = true;
                } else if (var4 == 5) {
                    this.field1121 = arg0.method213();
                } else if (var4 == 6) {
                    this.field1122 = arg0.method215();
                } else if (var4 == 7) {
                    this.field1123 = arg0.method215();
                } else if (var4 == 8) {
                    this.field1124 = arg0.method213();
                } else if (var4 == 9) {
                    this.field1125 = arg0.method213();
                } else if (var4 == 10) {
                    this.field1126 = arg0.method213();
                } else if (var4 == 11) {
                    this.field1127 = arg0.method213();
                } else if (var4 == 12) {
                    this.field1128 = arg0.method218();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
