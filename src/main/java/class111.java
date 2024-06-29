import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class111 {

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public int field1535 = 99;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public int field1536 = -1;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
    public boolean field1530 = false;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Z")
    public boolean field1541 = false;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public int field1542 = 2;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public int field1545 = -1;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field1521 = 5;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public int field1552 = -1;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "Z")
    public boolean field1543 = false;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
    public boolean field1529 = false;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public int field1550 = -1;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "Z")
    public static volatile boolean field1548 = true;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Lqb;")
    public static class117 field1528 = new class117(16);

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "Lnk;")
    public static class16 field1549;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Z")
    public static boolean field1532;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
    public int[] field1524;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "[I")
    public int[] field1533;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "[I")
    private int[] field1547;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "[I")
    public static int[] field1553;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "[Z")
    public boolean[] field1522;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "[[I")
    public int[][] field1539;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "[[[B")
    public static byte[][][] field1554;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 17)
    public static void method716(boolean arg0) {
        field1549 = null;
        if (arg0) {
            field1553 = null;
            field1554 = (byte[][][]) null;
            field1528 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZILbf;I)Lbf;", line = 30)
    public final class362 method717(int arg0, boolean arg1, int arg2, class362 arg3, int arg4) {
        field1544++;
        int var6 = this.field1524[arg2];
        int var7 = this.field1533[arg2];
        class293 var8 = class352.method2437(-924, var7 >> 16);
        if (!arg1) {
            method716(true);
        }
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method810(true, true, true);
        }
        class293 var10 = null;
        int var11 = 0;
        class293 var12 = null;
        int var13 = 0;
        class293 var14 = null;
        if ((this.field1530 || class325.field5215) && arg4 != -1 && arg4 < this.field1533.length) {
            int var15 = this.field1533[arg4];
            var14 = class352.method2437(-924, var15 >> 16);
            arg4 = var15 & 0xFFFF;
        }
        if (this.field1547 != null) {
            if (arg2 < this.field1547.length) {
                var11 = this.field1547[arg2];
                if (var11 != 65535) {
                    var10 = class352.method2437(-924, var11 >> 16);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field1530 || class325.field5215) && arg4 != -1 && arg4 < this.field1547.length) {
                var13 = this.field1547[arg4];
                if (var13 != 65535) {
                    var12 = class352.method2437(-924, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method2091(-122, var9);
        boolean var17 = !var8.method2088(var9, (byte) 39);
        if (var10 != null) {
            var16 &= !var10.method2091(-97, var11);
            var17 &= !var10.method2088(var11, (byte) 39);
        }
        if (var14 != null) {
            var16 &= !var14.method2091(-94, arg4);
            var17 &= !var14.method2088(arg4, (byte) 39);
        }
        if (var12 != null) {
            var16 &= !var12.method2091(-50, var13);
            var17 &= !var12.method2088(var13, (byte) 39);
        }
        class362 var18 = arg3.method810(var16, var17, !this.field1529);
        var18.method2524(var8, var9, var14, arg4, arg0 - 1, var6, this.field1529);
        if (var10 != null) {
            var18.method2524(var10, var11, var12, var13, arg0 - 1, var6, this.field1529);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V", line = 140)
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1531++;
        class279 var5 = class147.method1085(arg3, -19443, arg1);
        var5.method1989(0);
        var5.field4388 = arg4;
        var5.field4397 = arg2;
        var5.field4394 = arg0;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Llf;Z)V", line = 152)
    public final void method719(class143 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1043(true);
            if (var3 == 0) {
                field1546++;
                return;
            }
            this.method724(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 178)
    public final void method720(byte arg0) {
        if (this.field1551 == -1) {
            if (this.field1522 == null) {
                this.field1551 = 0;
            } else {
                this.field1551 = 2;
            }
        }
        if (arg0 != -65) {
            return;
        }
        field1523++;
        if (this.field1550 != -1) {
            return;
        }
        if (this.field1522 == null) {
            this.field1550 = 0;
        } else {
            this.field1550 = 2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLbf;IIII)Lbf;", line = 220)
    public final class362 method721(byte arg0, class362 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= 120) {
            this.method717(28, false, -50, (class362) null, 63);
        }
        field1527++;
        int var7 = this.field1524[arg2];
        int var8 = this.field1533[arg2];
        class293 var9 = class352.method2437(-924, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method844(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class293 var12 = null;
        if ((this.field1530 || class325.field5215) && arg3 != -1 && arg3 < this.field1533.length) {
            int var13 = this.field1533[arg3];
            var12 = class352.method2437(-924, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class362 var14;
        if (var12 == null) {
            var14 = arg1.method844(!var9.method2091(-128, var10), !var9.method2088(var10, (byte) 39), !this.field1529);
        } else {
            var14 = arg1.method844(!var9.method2091(-55, var10) & !var12.method2091(-65, arg3), !var9.method2088(var10, (byte) 39) & !var12.method2088(arg3, (byte) 39), !this.field1529);
        }
        if (class272.field4317 && this.field1529) {
            if (var11 == 1) {
                ((class124) var14).method819();
            } else if (var11 == 2) {
                ((class124) var14).method835();
            } else if (var11 == 3) {
                ((class124) var14).method840();
            }
        } else if (var11 == 1) {
            var14.method800();
        } else if (var11 == 2) {
            var14.method809();
        } else if (var11 == 3) {
            var14.method826();
        }
        var14.method2524(var9, var10, var12, arg3, arg5 - 1, var7, this.field1529);
        if (class272.field4317 && this.field1529) {
            if (var11 == 1) {
                ((class124) var14).method840();
            } else if (var11 == 2) {
                ((class124) var14).method835();
            } else if (var11 == 3) {
                ((class124) var14).method819();
            }
        } else if (var11 == 1) {
            var14.method826();
        } else if (var11 == 2) {
            var14.method809();
        } else if (var11 == 3) {
            var14.method800();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIILbf;I)Lbf;", line = 318)
    public final class362 method722(boolean arg0, int arg1, int arg2, class362 arg3, int arg4) {
        field1525++;
        int var6 = this.field1524[arg2];
        int var7 = this.field1533[arg2];
        class293 var8 = class352.method2437(-924, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method797(true, true, true);
        }
        class293 var10 = null;
        if ((this.field1530 || class325.field5215) && arg4 != -1 && arg4 < this.field1533.length) {
            int var11 = this.field1533[arg4];
            var10 = class352.method2437(-924, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class362 var12;
        if (var10 == null) {
            var12 = arg3.method797(!var8.method2091(-90, var9), !var8.method2088(var9, (byte) 39), !this.field1529);
        } else {
            var12 = arg3.method797(!var8.method2091(-39, var9) & !var10.method2091(-57, arg4), !var8.method2088(var9, (byte) 39) & !var10.method2088(arg4, (byte) 39), !this.field1529);
        }
        var12.method2524(var8, var9, var10, arg4, arg1 - 1, var6, this.field1529);
        if (!arg0) {
            this.method719((class143) null, false);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBILbf;I)Lbf;", line = 357)
    public final class362 method723(int arg0, int arg1, byte arg2, int arg3, class362 arg4, int arg5) {
        field1526++;
        int var7 = this.field1524[arg5];
        int var8 = this.field1533[arg5];
        class293 var9 = class352.method2437(-924, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method810(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class293 var12 = null;
        if ((this.field1530 || class325.field5215) && arg0 != -1 && arg0 < this.field1533.length) {
            int var13 = this.field1533[arg0];
            var12 = class352.method2437(-924, var13 >> 16);
            arg0 = var13 & 0xFFFF;
        }
        class362 var14;
        if (var12 == null) {
            var14 = arg4.method810(!var9.method2091(-44, var10), !var9.method2088(var10, (byte) 39), !this.field1529);
        } else {
            var14 = arg4.method810(!var9.method2091(-35, var10) & !var12.method2091(-72, arg0), !var9.method2088(var10, (byte) 39) & !var12.method2088(arg0, (byte) 39), !this.field1529);
        }
        if (this.field1529 && class272.field4317) {
            if (var11 == 1) {
                ((class124) var14).method819();
            } else if (var11 == 2) {
                ((class124) var14).method835();
            } else if (var11 == 3) {
                ((class124) var14).method840();
            }
        } else if (var11 == 1) {
            var14.method800();
        } else if (var11 == 2) {
            var14.method809();
        } else if (var11 == 3) {
            var14.method826();
        }
        var14.method2524(var9, var10, var12, arg0, arg3 - 1, var7, this.field1529);
        if (this.field1529 && class272.field4317) {
            if (var11 == 1) {
                ((class124) var14).method840();
            } else if (var11 == 2) {
                ((class124) var14).method835();
            } else if (var11 == 3) {
                ((class124) var14).method819();
            }
        } else if (var11 == 1) {
            var14.method826();
        } else if (var11 == 2) {
            var14.method809();
        } else if (var11 == 3) {
            var14.method800();
        }
        int var15 = 118 % ((arg2 + 42) / 63);
        return var14;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLlf;I)V", line = 464)
    private final void method724(boolean arg0, class143 arg1, int arg2) {
        field1537++;
        if (!arg0) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg1.method1051(1);
            this.field1524 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1524[var5] = arg1.method1051(1);
            }
            this.field1533 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1533[var6] = arg1.method1051(1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1533[var7] += arg1.method1051(1) << 16;
            }
        } else if (arg2 == 2) {
            this.field1552 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field1522 = new boolean[256];
            int var8 = arg1.method1043(arg0);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1522[arg1.method1043(true)] = true;
            }
        } else if (arg2 == 4) {
            this.field1541 = true;
        } else if (arg2 == 5) {
            this.field1521 = arg1.method1043(true);
        } else if (arg2 == 6) {
            this.field1545 = arg1.method1051(1);
        } else if (arg2 == 7) {
            this.field1536 = arg1.method1051(1);
        } else if (arg2 == 8) {
            this.field1535 = arg1.method1043(arg0);
        } else if (arg2 == 9) {
            this.field1550 = arg1.method1043(true);
        } else if (arg2 == 10) {
            this.field1551 = arg1.method1043(true);
        } else if (arg2 == 11) {
            this.field1542 = arg1.method1043(true);
        } else if (arg2 == 12) {
            int var14 = arg1.method1043(true);
            this.field1547 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field1547[var15] = arg1.method1051(1);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field1547[var16] = (arg1.method1051(1) << 16) + this.field1547[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method1051(1);
            this.field1539 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method1043(true);
                if (var12 > 0) {
                    this.field1539[var11] = new int[var12];
                    this.field1539[var11][0] = arg1.method1017((byte) 101);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field1539[var11][var13] = arg1.method1051(1);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field1529 = true;
        } else if (arg2 == 15) {
            this.field1530 = true;
        } else if (arg2 == 16) {
            this.field1543 = true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 641)
    public static final void method725(int arg0) {
        if (arg0 != 13402) {
            field1532 = true;
        }
        field1538++;
        if (!class241.field3699 && class296.field4656 != 2) {
            try {
                class198.method1380((byte) 94, "tbrefresh", class5.field59);
            } catch (Throwable var2) {
            }
        }
    }
}
