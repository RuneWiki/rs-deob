import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class103 {

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Z")
    public boolean field1471 = false;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field1473 = -1;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field1476 = 2;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field1481 = -1;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field1487 = -1;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
    public boolean field1489 = false;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field1490 = 5;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
    public boolean field1491 = false;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public int field1492 = 99;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field1486 = -1;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Z")
    public boolean field1480 = false;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public int field1496 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljn;")
    public class322 field1475;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public int[] field1467;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public int[] field1470;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public int[] field1472;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    public int[] field1482;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
    public int[] field1493;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
    private int[] field1495;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[Z")
    public boolean[] field1469;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "[[I")
    public int[][] field1488;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lka;IIIII)Lka;")
    public final class283 method692(class283 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 31798) {
            return null;
        }
        field1474++;
        int var7 = this.field1493[arg3];
        int var8 = this.field1472[arg3];
        class154 var9 = this.field1475.method1883(89, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method1147((byte) 1, arg2, true);
        }
        class154 var11 = null;
        if ((this.field1480 || class729.field10218) && arg4 != -1 && arg4 < this.field1472.length) {
            int var12 = this.field1472[arg4];
            var11 = this.field1475.method1883(-107, var12 >> 16);
            arg4 = var12 & 0xFFFF;
        }
        class154 var13 = null;
        class154 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field1495 != null) {
            if (arg3 < this.field1495.length) {
                var15 = this.field1495[arg3];
                if (var15 != 65535) {
                    var13 = this.field1475.method1883(arg1 - 31691, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field1480 || class729.field10218) && arg4 != -1 && arg4 < this.field1495.length) {
                var16 = this.field1495[arg4];
                if (var16 != 65535) {
                    var14 = this.field1475.method1883(-106, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field1489) {
            arg2 |= 0x200;
        }
        if (var9.method980((byte) -49, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method979(var10, 102)) {
            arg2 |= 0x100;
        }
        if (var9.method977(var10, 1)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method980((byte) -49, var15)) {
                arg2 |= 0x80;
            }
            if (var13.method979(var15, 103)) {
                arg2 |= 0x100;
            }
            if (var13.method977(var15, arg1 - 31797)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method980((byte) -49, arg4)) {
                arg2 |= 0x80;
            }
            if (var11.method979(arg4, 121)) {
                arg2 |= 0x100;
            }
            if (var11.method977(arg4, 1)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method980((byte) -49, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method979(var16, arg1 - 31678)) {
                arg2 |= 0x100;
            }
            if (var14.method977(var16, 1)) {
                arg2 |= 0x400;
            }
        }
        int var17 = arg2 | 0x20;
        class283 var18 = arg0.method1147((byte) 1, var17, true);
        var18.method1691(var9, arg5 - 1, var10, 0, arg4, var11, 65535, this.field1489, var7);
        if (var13 != null) {
            var18.method1691(var13, arg5 - 1, var15, 0, var16, var14, arg1 ^ 0x83C9, this.field1489, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public final void method693(int arg0) {
        if (arg0 != 2) {
            this.method692(null, 45, 42, 9, -49, -128);
        }
        if (this.field1486 == -1) {
            if (this.field1469 == null) {
                this.field1486 = 0;
            } else {
                this.field1486 = 2;
            }
        }
        if (this.field1481 == -1) {
            if (this.field1469 == null) {
                this.field1481 = 0;
            } else {
                this.field1481 = 2;
            }
        }
        field1466++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method694(boolean arg0, int arg1, byte arg2) {
        field1485++;
        if (arg0 && arg1 >= 0) {
            return arg2 >= -85 ? null : class333.method1929(arg0, 10, true, arg1);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIBILka;I)Lka;")
    public final class283 method695(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class283 arg6, int arg7) {
        field1478++;
        int var9 = this.field1493[arg2];
        int var10 = this.field1472[arg2];
        class154 var11 = this.field1475.method1883(-121, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method1147(arg4, arg1, true);
        }
        class154 var13 = null;
        if ((this.field1480 || class729.field10218) && arg5 != -1 && this.field1472.length > arg5) {
            int var14 = this.field1472[arg5];
            var13 = this.field1475.method1883(83, var14 >> 16);
            arg5 = var14 & 0xFFFF;
        }
        if (this.field1489) {
            arg1 |= 0x200;
        }
        if (var11.method980((byte) -49, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method979(var12, 107)) {
            arg1 |= 0x100;
        }
        if (arg7 <= 6) {
            method698((byte) -9);
        }
        if (var11.method977(var12, 1)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method980((byte) -49, arg5)) {
                arg1 |= 0x80;
            }
            if (var13.method979(arg5, 102)) {
                arg1 |= 0x100;
            }
            if (var13.method977(arg5, 1)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class283 var16 = arg6.method1147(arg4, var15, true);
        var16.method1691(var11, arg3 - 1, var12, arg0, arg5, var13, 65535, this.field1489, var9);
        return var16;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIII)I")
    public final int method696(boolean arg0, int arg1, int arg2, int arg3) {
        field1484++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field1472[arg3];
        class154 var8 = null;
        class154 var9 = this.field1475.method1883(arg2 + 16255, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (arg2 != -16365) {
            this.method695(-78, -10, -127, -60, (byte) 0, 38, null, -19);
        }
        if (var9 == null) {
            return var5;
        }
        if ((this.field1480 || class729.field10218) && arg1 != -1 && arg1 < this.field1472.length) {
            int var11 = this.field1472[arg1];
            var8 = this.field1475.method1883(arg2 + 16246, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field1489) {
            var5 |= 0x200;
        }
        if (var9.method980((byte) -49, var10)) {
            var5 |= 0x80;
        }
        if (var9.method979(var10, 115)) {
            var5 |= 0x100;
        }
        if (var9.method977(var10, arg2 + 16366)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method980((byte) -49, var6)) {
                var5 |= 0x80;
            }
            if (var8.method979(var6, 115)) {
                var5 |= 0x100;
            }
            if (var8.method977(var6, arg2 + 16366)) {
                var5 |= 0x400;
            }
        }
        if (this.field1495 != null && arg0) {
            if (arg3 < this.field1495.length) {
                int var12 = this.field1495[arg3];
                if (var12 != 65535) {
                    class154 var13 = this.field1475.method1883(arg2 + 16415, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method980((byte) -49, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method979(var14, 101)) {
                            var5 |= 0x100;
                        }
                        if (var13.method977(var14, arg2 ^ 0xFFFFC012)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field1480 || class729.field10218) && arg1 != -1 && arg1 < this.field1495.length) {
                int var15 = this.field1495[arg1];
                if (var15 != 65535) {
                    class154 var16 = this.field1475.method1883(-94, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method980((byte) -49, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method979(var17, 117)) {
                            var5 |= 0x100;
                        }
                        if (var16.method977(var17, 1)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILwu;)V")
    public static final void method697(int arg0, class557 arg1) {
        field1494++;
        class435.field5962 = arg1;
        if (arg0 != 0) {
            method698((byte) -9);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        if (arg0 >= -84) {
            return;
        }
        field1483++;
        if (class283.field3758 != null) {
            try {
                class283.field3758.close();
            } catch (IOException var1) {
            }
        }
        class283.field3758 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lvj;IZ)V")
    private final void method699(class26 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method694(true, 93, (byte) -59);
        }
        if (arg1 == 1) {
            int var4 = arg0.method193(2);
            this.field1493 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1493[var5] = arg0.method193(2);
            }
            this.field1472 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1472[var6] = arg0.method193(2);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1472[var7] = (arg0.method193(2) << 16) + this.field1472[var7];
            }
        } else if (arg1 == 2) {
            this.field1487 = arg0.method193(2);
        } else if (arg1 == 3) {
            this.field1469 = new boolean[256];
            int var18 = arg0.method194((byte) 119);
            for (int var19 = 0; var19 < var18; var19++) {
                this.field1469[arg0.method194((byte) 119)] = true;
            }
        } else if (arg1 == 5) {
            this.field1490 = arg0.method194((byte) 119);
        } else if (arg1 == 6) {
            this.field1473 = arg0.method193(2);
        } else if (arg1 == 7) {
            this.field1496 = arg0.method193(2);
        } else if (arg1 == 8) {
            this.field1492 = arg0.method194((byte) 119);
        } else if (arg1 == 9) {
            this.field1481 = arg0.method194((byte) 119);
        } else if (arg1 == 10) {
            this.field1486 = arg0.method194((byte) 119);
        } else if (arg1 == 11) {
            this.field1476 = arg0.method194((byte) 119);
        } else if (arg1 == 12) {
            int var8 = arg0.method194((byte) 119);
            this.field1495 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1495[var9] = arg0.method193(2);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field1495[var10] = (arg0.method193(2) << 16) + this.field1495[var10];
            }
        } else if (arg1 == 13) {
            int var11 = arg0.method193(2);
            this.field1488 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method194((byte) 119);
                if (var13 > 0) {
                    this.field1488[var12] = new int[var13];
                    this.field1488[var12][0] = arg0.method186((byte) 96);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field1488[var12][var14] = arg0.method193(2);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1489 = true;
        } else if (arg1 == 15) {
            this.field1480 = true;
        } else if (arg1 == 16) {
            this.field1491 = true;
        } else if (arg1 == 18) {
            this.field1471 = true;
        } else if (arg1 == 19) {
            if (this.field1467 == null) {
                this.field1467 = new int[this.field1488.length];
                for (int var15 = 0; var15 < this.field1488.length; var15++) {
                    this.field1467[var15] = 255;
                }
            }
            this.field1467[arg0.method194((byte) 119)] = arg0.method194((byte) 119);
        } else if (arg1 == 20) {
            if (this.field1482 == null || this.field1470 == null) {
                this.field1482 = new int[this.field1488.length];
                this.field1470 = new int[this.field1488.length];
                for (int var16 = 0; var16 < this.field1488.length; var16++) {
                    this.field1482[var16] = 256;
                    this.field1470[var16] = 256;
                }
            }
            int var17 = arg0.method194((byte) 119);
            this.field1482[var17] = arg0.method193(2);
            this.field1470[var17] = arg0.method193(2);
        }
        field1465++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(CB)I")
    public static final int method700(char arg0, byte arg1) {
        if (arg1 != -52) {
            method694(false, 14, (byte) -109);
        }
        field1479++;
        return arg0 >= '\u0000' && arg0 < class712.field10093.length ? class712.field10093[arg0] : -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILvj;)V")
    public final void method701(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                if (arg0 < 1) {
                    this.field1490 = 36;
                }
                field1477++;
                return;
            }
            this.method699(arg1, var3, false);
        }
    }
}
