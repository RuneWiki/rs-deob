import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class105 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Lik;")
    public static class410 field1538 = new class410(64);

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1551 = "glow2:";

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "Lci;")
    public class388 field1545;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "Lka;")
    public static class407 field1550;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Lrk;")
    public static class427 field1544;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Lee;")
    public static class441 field1540;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "[I")
    public int[] field1529;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "[I")
    public int[] field1530;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "[I")
    public int[] field1534;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "[I")
    public int[] field1537;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "[I")
    public int[] field1546;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "[I")
    public int[] field1548;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "[Lci;")
    public class388[] field1549;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[[I")
    public int[][] field1532;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "[[I")
    public int[][] field1535;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
    public static final void method883() {
        class273.field3670 = 0;
        label191: for (int var0 = 0; var0 < class223.field3091; var0++) {
            class76 var1 = class421.field5894[var0];
            if (class154.field2341 != null) {
                for (int var2 = 0; var2 < class154.field2341.length; var2++) {
                    if (class154.field2341[var2] != -1000000 && (var1.field1141 <= class154.field2341[var2] || var1.field1127 <= class154.field2341[var2]) && (var1.field1135 <= class273.field3663[var2] || var1.field1149 <= class273.field3663[var2]) && (var1.field1135 >= class341.field4656[var2] || var1.field1149 >= class341.field4656[var2]) && (var1.field1140 <= class360.field4897[var2] || var1.field1150 <= class360.field4897[var2]) && (var1.field1140 >= class373.field5244[var2] || var1.field1150 >= class373.field5244[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field1146 == 1) {
                int var3 = var1.field1128 + class303.field4107 - class134.field1914;
                if (var3 >= 0 && var3 <= class303.field4107 + class303.field4107) {
                    int var4 = var1.field1138 + class303.field4107 - class31.field516;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1126 + class303.field4107 - class31.field516;
                    if (var5 > class303.field4107 + class303.field4107) {
                        var5 = class303.field4107 + class303.field4107;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class227.field3147[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class128.field1814 - var1.field1135;
                        if (var7 > 32) {
                            var1.field1142 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1142 = 2;
                            var7 = -var7;
                        }
                        var1.field1125 = (var1.field1140 - class81.field1200 << 8) / var7;
                        var1.field1145 = (var1.field1150 - class81.field1200 << 8) / var7;
                        var1.field1148 = (var1.field1141 - class331.field4501 << 8) / var7;
                        var1.field1147 = (var1.field1127 - class331.field4501 << 8) / var7;
                        class147.field2262[class273.field3670++] = var1;
                    }
                }
            } else if (var1.field1146 == 2) {
                int var8 = var1.field1138 + class303.field4107 - class31.field516;
                if (var8 >= 0 && var8 <= class303.field4107 + class303.field4107) {
                    int var9 = var1.field1128 + class303.field4107 - class134.field1914;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1134 + class303.field4107 - class134.field1914;
                    if (var10 > class303.field4107 + class303.field4107) {
                        var10 = class303.field4107 + class303.field4107;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class227.field3147[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class81.field1200 - var1.field1140;
                        if (var12 > 32) {
                            var1.field1142 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1142 = 4;
                            var12 = -var12;
                        }
                        var1.field1143 = (var1.field1135 - class128.field1814 << 8) / var12;
                        var1.field1144 = (var1.field1149 - class128.field1814 << 8) / var12;
                        var1.field1148 = (var1.field1141 - class331.field4501 << 8) / var12;
                        var1.field1147 = (var1.field1127 - class331.field4501 << 8) / var12;
                        class147.field2262[class273.field3670++] = var1;
                    }
                }
            } else if (var1.field1146 == 4) {
                int var13 = var1.field1141 - class331.field4501;
                if (var13 > 128) {
                    int var14 = var1.field1138 + class303.field4107 - class31.field516;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1126 + class303.field4107 - class31.field516;
                    if (var15 > class303.field4107 + class303.field4107) {
                        var15 = class303.field4107 + class303.field4107;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1128 + class303.field4107 - class134.field1914;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1134 + class303.field4107 - class134.field1914;
                        if (var17 > class303.field4107 + class303.field4107) {
                            var17 = class303.field4107 + class303.field4107;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class227.field3147[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1142 = 5;
                            var1.field1143 = (var1.field1135 - class128.field1814 << 8) / var13;
                            var1.field1144 = (var1.field1149 - class128.field1814 << 8) / var13;
                            var1.field1125 = (var1.field1140 - class81.field1200 << 8) / var13;
                            var1.field1145 = (var1.field1150 - class81.field1200 << 8) / var13;
                            class147.field2262[class273.field3670++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
    public static final void method884(int arg0, int arg1) {
        field1531++;
        class410 var2 = field1538;
        synchronized (field1538) {
            field1538.method2533(arg0);
            field1538 = new class410(arg1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[B)V")
    private final void method885(int arg0, byte[] arg1) {
        field1539++;
        class289 var3 = new class289(class377.method2349((byte) -103, arg1));
        int var4 = var3.method1861((byte) -72);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1543 = var3.method1856((byte) 73);
        } else {
            this.field1543 = 0;
        }
        int var5 = var3.method1861((byte) -72);
        this.field1542 = var3.method1853(113);
        int var6 = 0;
        int var7 = -1;
        this.field1546 = new int[this.field1542];
        if (arg0 != 8) {
            return;
        }
        for (int var8 = 0; var8 < this.field1542; var8++) {
            this.field1546[var8] = var6 += var3.method1853(-102);
            if (var7 < this.field1546[var8]) {
                var7 = this.field1546[var8];
            }
        }
        this.field1547 = var7 + 1;
        this.field1529 = new int[this.field1547];
        this.field1548 = new int[this.field1547];
        this.field1534 = new int[this.field1547];
        this.field1537 = new int[this.field1547];
        this.field1532 = new int[this.field1547][];
        if (var5 != 0) {
            this.field1530 = new int[this.field1547];
            for (int var9 = 0; var9 < this.field1547; var9++) {
                this.field1530[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1542; var10++) {
                this.field1530[this.field1546[var10]] = var3.method1856((byte) 116);
            }
            this.field1545 = new class388(this.field1530);
        }
        for (int var11 = 0; var11 < this.field1542; var11++) {
            this.field1537[this.field1546[var11]] = var3.method1856((byte) 118);
        }
        for (int var12 = 0; var12 < this.field1542; var12++) {
            this.field1534[this.field1546[var12]] = var3.method1856((byte) 41);
        }
        for (int var13 = 0; var13 < this.field1542; var13++) {
            this.field1529[this.field1546[var13]] = var3.method1853(class331.method2109(arg0, -90));
        }
        for (int var14 = 0; var14 < this.field1542; var14++) {
            int var21 = this.field1546[var14];
            int var22 = this.field1529[var21];
            int var23 = 0;
            int var24 = -1;
            this.field1532[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field1532[var21][var25] = var23 += var3.method1853(124);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field1548[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field1532[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1549 = new class388[var7 + 1];
        this.field1535 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field1542; var15++) {
            int var16 = this.field1546[var15];
            int var17 = this.field1529[var16];
            this.field1535[var16] = new int[this.field1548[var16]];
            for (int var18 = 0; var18 < this.field1548[var16]; var18++) {
                this.field1535[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1532[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1532[var16][var19];
                }
                this.field1535[var16][var20] = var3.method1856((byte) 57);
            }
            this.field1549[var16] = new class388(this.field1535[var16]);
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "([BI)V")
    public class105(byte[] arg0, int arg1) {
        this.field1536 = class362.method2279((byte) -115, arg0, arg0.length);
        if (this.field1536 != arg1) {
            throw new RuntimeException();
        }
        this.method885(8, arg0);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        field1550 = null;
        field1544 = null;
        field1540 = null;
        field1551 = null;
        field1538 = null;
        if (arg0 != 110) {
            method883();
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)V")
    public static final void method887(byte arg0, int arg1) {
        field1533++;
        int var2 = class414.field5793 - class191.field2746;
        if (var2 >= 100) {
            class184.field2675 = 1;
            return;
        }
        int var3 = (int) class47.field810;
        if (arg0 != 11) {
            return;
        }
        if (var3 < (class127.field1802 >> 8)) {
            var3 = class127.field1802 >> 8;
        }
        if (class22.field408[4] && (class367.field5044[4] + 128) > var3) {
            var3 = class367.field5044[4] + 128;
        }
        int var4 = (int) class313.field4229 + class228.field3169 & 0x3FFF;
        class340.method2165(var3, ((var3 >> 3) * 3) + 600, var4, (byte) 127, arg1, class241.field3334, class22.method281(arg0 - 10, class69.field1046, class95.field1379.field3167, class95.field1379.field3176) - 50, class153.field2327);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class374.field5261 = (int) ((float) (class374.field5261 - class113.field1606) * var5 + (float) class113.field1606);
        class356.field4842 = (int) ((float) (class356.field4842 - class441.field6354) * var5 + (float) class441.field6354);
        class443.field6389 = (int) ((float) (class443.field6389 - class187.field2708) * var5 + (float) class187.field2708);
        class167.field2488 = (int) ((float) (class167.field2488 - class345.field4680) * var5 + (float) class345.field4680);
        int var6 = class286.field3837 - class393.field5506;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class286.field3837 = (int) ((float) var6 * var5 + (float) class393.field5506);
        class286.field3837 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
    public static final void method888(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1541++;
        class450 var5 = class59.method540(arg1, arg4, 1000);
        var5.method2800(256);
        var5.field6503 = arg0;
        var5.field6498 = arg3;
        var5.field6509 = arg2;
    }
}
