import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class87 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public int field1508 = 99;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public int field1503 = 2;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field1511 = -1;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field1507 = -1;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public int field1519 = -1;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public int field1510 = -1;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
    public boolean field1523 = false;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
    public boolean field1501 = false;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
    public boolean field1509 = false;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public int field1527 = 5;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Z")
    public boolean field1505 = false;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public int field1525 = -1;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Loe;")
    public static class127 field1515 = new class127(68, -1);

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lnc;")
    public class21 field1513;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "[I")
    public int[] field1512;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "[I")
    public int[] field1526;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "[Z")
    public boolean[] field1528;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[[I")
    public int[][] field1502;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILcd;III)Lcd;")
    public final class198 method611(int arg0, int arg1, class198 arg2, int arg3, int arg4, int arg5) {
        field1506++;
        int var7 = this.field1526[arg3];
        int var8 = this.field1512[arg3];
        class312 var9 = this.field1513.method108(var8 >> 16, 3);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method511((byte) 1, arg1, true);
        }
        int var11 = 86 % ((38 - arg0) / 50);
        class312 var12 = null;
        if ((this.field1523 || class4.field43) && arg5 != -1 && this.field1512.length > arg5) {
            int var13 = this.field1512[arg5];
            var12 = this.field1513.method108(var13 >> 16, 3);
            arg5 = var13 & 0xFFFF;
        }
        class312 var14 = null;
        class312 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (this.field1500 != null) {
            if (arg3 < this.field1500.length) {
                var16 = this.field1500[arg3];
                if (var16 != 65535) {
                    var14 = this.field1513.method108(var16 >> 16, 3);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field1523 || class4.field43) && arg5 != -1 && arg5 < this.field1500.length) {
                var17 = this.field1500[arg5];
                if (var17 != 65535) {
                    var15 = this.field1513.method108(var17 >> 16, 3);
                    var17 &= 0xFFFF;
                }
            }
        }
        if (this.field1501) {
            arg1 |= 0x200;
        }
        if (var9.method1863(false, var10)) {
            arg1 |= 0x80;
        }
        if (var9.method1867(var10, -53)) {
            arg1 |= 0x100;
        }
        if (var9.method1865(-120, var10)) {
            arg1 |= 0x400;
        }
        if (var14 != null) {
            if (var14.method1863(false, var16)) {
                arg1 |= 0x80;
            }
            if (var14.method1867(var16, 127)) {
                arg1 |= 0x100;
            }
            if (var14.method1865(-37, var16)) {
                arg1 |= 0x400;
            }
        }
        if (var12 != null) {
            if (var12.method1863(false, arg5)) {
                arg1 |= 0x80;
            }
            if (var12.method1867(arg5, 88)) {
                arg1 |= 0x100;
            }
            if (var12.method1865(-33, arg5)) {
                arg1 |= 0x400;
            }
        }
        if (var15 != null) {
            if (var15.method1863(false, var17)) {
                arg1 |= 0x80;
            }
            if (var15.method1867(var17, 119)) {
                arg1 |= 0x100;
            }
            if (var15.method1865(-41, var17)) {
                arg1 |= 0x400;
            }
        }
        int var18 = arg1 | 0x20;
        class198 var19 = arg2.method511((byte) 1, var18, true);
        var19.method1232(0, var7, (byte) -113, var12, var10, arg4 - 1, arg5, this.field1501, var9);
        if (var14 != null) {
            var19.method1232(0, var7, (byte) -111, var15, var16, arg4 - 1, var17, this.field1501, var14);
        }
        return var19;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[Lig;)V")
    public static final void method612(byte arg0, class154[] arg1) {
        field1522++;
        class306.field4637 = arg1.length;
        class302.field4562 = new class154[class306.field4637 + 10];
        class156.field2452 = new int[class306.field4637 + 10];
        class356.method2183(arg1, 0, class302.field4562, 0, class306.field4637);
        int var2 = 0;
        if (arg0 != 85) {
            method614(-45, null, 7, null, null, -10);
        }
        while (class306.field4637 > var2) {
            class156.field2452[var2] = class302.field4562[var2].method989();
            var2++;
        }
        for (int var3 = class306.field4637; var3 < class302.field4562.length; var3++) {
            class156.field2452[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public final void method613(boolean arg0) {
        if (this.field1525 == -1) {
            if (this.field1528 == null) {
                this.field1525 = 0;
            } else {
                this.field1525 = 2;
            }
        }
        if (arg0) {
            this.method617(-29, null);
        }
        if (this.field1519 == -1) {
            if (this.field1528 == null) {
                this.field1519 = 0;
            } else {
                this.field1519 = 2;
            }
        }
        field1518++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILbl;I[I[II)Lgn;")
    public static final class475 method614(int arg0, class442 arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        field1514++;
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = arg0; var7 < arg5; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class475(arg1, arg2, arg5, var6);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIIZ)I")
    public final int method615(byte arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != 17) {
            this.method611(80, -112, null, 54, -17, -84);
        }
        field1517++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1512[arg2];
        class312 var8 = null;
        class312 var9 = this.field1513.method108(var7 >> 16, 3);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field1523 || class4.field43) && arg1 != -1 && this.field1512.length > arg1) {
            int var11 = this.field1512[arg1];
            var8 = this.field1513.method108(var11 >> 16, arg0 - 14);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1501) {
            var5 |= 0x200;
        }
        if (var9.method1863(false, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1867(var10, arg0 - 42)) {
            var5 |= 0x100;
        }
        if (var9.method1865(-118, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1863(false, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1867(var6, 95)) {
                var5 |= 0x100;
            }
            if (var8.method1865(-103, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field1500 != null && arg3) {
            if (arg2 < this.field1500.length) {
                int var12 = this.field1500[arg2];
                if (var12 != 65535) {
                    class312 var13 = this.field1513.method108(var12 >> 16, arg0 - 14);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1863(false, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1867(var14, -12)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1865(-77, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1523 || class4.field43) && arg1 != -1 && this.field1500.length > arg1) {
                int var15 = this.field1500[arg1];
                if (var15 != 65535) {
                    class312 var16 = this.field1513.method108(var15 >> 16, 3);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1863(false, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1867(var17, arg0 ^ 0xFFFFFF88)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1865(arg0 ^ 0xFFFFFFC5, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILha;I)V")
    private final void method616(int arg0, class40 arg1, int arg2) {
        if (arg2 > -51) {
            return;
        }
        if (arg0 == 1) {
            int var4 = arg1.method254((byte) -39);
            this.field1526 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1526[var5] = arg1.method254((byte) -45);
            }
            this.field1512 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1512[var6] = arg1.method254((byte) -100);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1512[var7] += arg1.method254((byte) -44) << 16;
            }
        } else if (arg0 == 2) {
            this.field1511 = arg1.method254((byte) -46);
        } else if (arg0 == 3) {
            this.field1528 = new boolean[256];
            int var15 = arg1.method257((byte) 30);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1528[arg1.method257((byte) 56)] = true;
            }
        } else if (arg0 == 4) {
            this.field1505 = true;
        } else if (arg0 == 5) {
            this.field1527 = arg1.method257((byte) 90);
        } else if (arg0 == 6) {
            this.field1510 = arg1.method254((byte) -73);
        } else if (arg0 == 7) {
            this.field1507 = arg1.method254((byte) -60);
        } else if (arg0 == 8) {
            this.field1508 = arg1.method257((byte) 77);
        } else if (arg0 == 9) {
            this.field1519 = arg1.method257((byte) 61);
        } else if (arg0 == 10) {
            this.field1525 = arg1.method257((byte) 83);
        } else if (arg0 == 11) {
            this.field1503 = arg1.method257((byte) 110);
        } else if (arg0 == 12) {
            int var8 = arg1.method257((byte) 83);
            this.field1500 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1500[var9] = arg1.method254((byte) -94);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1500[var10] += arg1.method254((byte) -70) << 16;
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method254((byte) -62);
            this.field1502 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method257((byte) 39);
                if (var13 > 0) {
                    this.field1502[var12] = new int[var13];
                    this.field1502[var12][0] = arg1.method224(-2);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1502[var12][var14] = arg1.method254((byte) -67);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1501 = true;
        } else if (arg0 == 15) {
            this.field1523 = true;
        } else if (arg0 == 16) {
            this.field1509 = true;
        }
        field1520++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILha;)V")
    public final void method617(int arg0, class40 arg1) {
        field1504++;
        if (arg0 <= 5) {
            this.field1500 = null;
        }
        while (true) {
            int var3 = arg1.method257((byte) 60);
            if (var3 == 0) {
                return;
            }
            this.method616(var3, arg1, -110);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBLcd;IIIII)Lcd;")
    public final class198 method618(int arg0, byte arg1, class198 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1516++;
        int var9 = this.field1526[arg6];
        int var10 = this.field1512[arg6];
        class312 var11 = this.field1513.method108(var10 >> 16, 3);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method511(arg1, arg7, true);
        }
        if (arg5 != -408) {
            this.method611(-16, 59, null, 68, 74, 75);
        }
        class312 var13 = null;
        if ((this.field1523 || class4.field43) && arg4 != -1 && this.field1512.length > arg4) {
            int var14 = this.field1512[arg4];
            var13 = this.field1513.method108(var14 >> 16, 3);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field1501) {
            arg7 |= 0x200;
        }
        if (var11.method1863(false, var12)) {
            arg7 |= 0x80;
        }
        if (var11.method1867(var12, 102)) {
            arg7 |= 0x100;
        }
        if (var11.method1865(-124, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1863(false, arg4)) {
                arg7 |= 0x80;
            }
            if (var13.method1867(arg4, arg5 + 515)) {
                arg7 |= 0x100;
            }
            if (var13.method1865(-66, arg4)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class198 var16 = arg2.method511(arg1, var15, true);
        var16.method1232(arg0, var9, (byte) -37, var13, var12, arg3 - 1, arg4, this.field1501, var11);
        return var16;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method619(byte arg0) {
        field1515 = null;
        if (arg0 > -114) {
            field1515 = null;
        }
    }
}
