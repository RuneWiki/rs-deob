import java.awt.Canvas;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 extends class41 {

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!ic", name = "sb", descriptor = "[B")
    public byte[] field1495;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "Lu;")
    public static class135 field1486 = class87.method676((byte) -62, "");

    @OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Lu;")
    public static class135 field1503 = class87.method676((byte) -51, "headicons_hint");

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ic", name = "qb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ic", name = "rb", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ic", name = "tb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ic", name = "ub", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ic", name = "vb", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ic", name = "xb", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ic", name = "yb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ic", name = "zb", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ic", name = "Bb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ic", name = "Cb", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ic", name = "Db", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ic", name = "Fb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1484;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[I")
    public static int[] field1451;

    @OriginalMember(owner = "client!ic", name = "Eb", descriptor = "[I")
    public static int[] field1507;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)J")
    public final long method444(int arg0) {
        field1460++;
        if (arg0 == 0) {
            long var2 = (long) this.method498((byte) 7) & 0xFFFFFFFFL;
            long var4 = (long) this.method498((byte) -26) & 0xFFFFFFFFL;
            return (var2 << 32) + var4;
        } else {
            return -58L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public static final void method445(int arg0) {
        if (arg0 != -128) {
            method495(-38, (byte) 116, -45, 15, 29);
        }
        field1446++;
        try {
            Graphics var1 = field1484.getGraphics();
            class116.field2765.method94(arg0 ^ 0x4534, 357, var1, 17);
        } catch (Exception var2) {
            field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
    public final int method446(byte arg0) {
        field1450++;
        this.field1485 += 2;
        int var2 = ((this.field1495[this.field1485 - 2] & 0xFF) << 8) + (this.field1495[this.field1485 - 1] & 0xFF);
        if (arg0 != -99) {
            this.method472((byte) -23);
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)I")
    public final int method447(int arg0) {
        this.field1485 += 2;
        int var2 = ((this.field1495[this.field1485 - 1] & 0xFF) << 8) + (arg0 & this.field1495[this.field1485 - 2] - 128);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        field1466++;
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        this.field1495[this.field1485++] = (byte) (arg0 >> 8);
        this.field1495[this.field1485++] = (byte) (arg0 + 128);
        field1449++;
        if (!arg1) {
            this.method473((byte) 59, -86);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILbc;II)V")
    public static final void method449(int arg0, class11 arg1, int arg2, int arg3) {
        field1479++;
        if (arg1 == null) {
            return;
        }
        int var4 = arg0 * arg0 + arg2 * arg2;
        int var5 = class5.field126 + class22.field550 & 0x7FF;
        if (var4 > 6400) {
            return;
        }
        int var6 = class51.field1203[var5];
        int var7 = var6 * 256 / (class48.field1143 + 256);
        int var8 = class51.field1213[var5];
        int var9 = 104 / ((12 - arg3) / 48);
        int var10 = var8 * 256 / (class48.field1143 + 256);
        int var11 = arg2 * var10 + arg0 * var7 >> 16;
        int var12 = arg2 * var7 - arg0 * var10 >> 16;
        if (var4 > 2500) {
            arg1.method74(class49.field1175, var11 + 94 + 4 - arg1.field269 / 2, -(arg1.field265 / 2) + -4 + -var12 + 83);
        } else {
            arg1.method76(var11 + 94 + 4 - arg1.field269 / 2, -var12 - 4 + -(arg1.field265 / 2) + 83);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)I")
    public final int method450(byte arg0) {
        if (arg0 == -71) {
            int var2 = this.field1495[this.field1485] & 0xFF;
            field1469++;
            return var2 >= 128 ? this.method483((byte) 24) - 32768 : this.method480(0);
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
    public final void method451(int arg0, byte arg1) {
        this.field1495[this.field1485++] = (byte) (arg0 >> 8);
        field1506++;
        if (arg1 != 28) {
            this.method464(85);
        }
        this.field1495[this.field1485++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    public final void method452(int arg0, int arg1) {
        field1456++;
        if (arg1 != 255) {
            field1451 = null;
        }
        this.field1495[this.field1485++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
    public final void method453(boolean arg0, int arg1) {
        if ((arg1 & 0xFFFFFF80) != 0) {
            if ((arg1 & 0xFFFFC000) != 0) {
                if ((arg1 & 0xFFE00000) != 0) {
                    if ((arg1 & 0xF0000000) != 0) {
                        this.method452(arg1 >>> 28 | 0x80, 255);
                    }
                    this.method452(arg1 >>> 21 | 0x80, 255);
                }
                this.method452(arg1 >>> 14 | 0x80, 255);
            }
            this.method452(arg1 >>> 7 | 0x80, 255);
        }
        this.method452(arg1 & 0x7F, 255);
        field1459++;
        if (arg0) {
            this.method473((byte) -47, 125);
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)I")
    public final int method454(int arg0) {
        field1470++;
        this.field1485 += 2;
        int var2 = ((this.field1495[this.field1485 - 2] & 0xFF) << 8) + (this.field1495[this.field1485 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        int var3 = 12 / ((arg0 - 24) / 55);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
    public final int method455(boolean arg0) {
        field1475++;
        this.field1485 += 3;
        if (!arg0) {
            this.method444(-42);
        }
        return (this.field1495[this.field1485 - 1] & 0xFF) + (((this.field1495[this.field1485 - 3] & 0xFF) << 16) + ((this.field1495[this.field1485 - 2] & 0xFF) << 8));
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)I")
    public final int method456(byte arg0) {
        if (arg0 <= 37) {
            return -26;
        } else {
            field1448++;
            return -this.field1495[this.field1485++] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public final void method457(BigInteger arg0, BigInteger arg1, int arg2) {
        field1468++;
        int var4 = this.field1485;
        this.field1485 = 0;
        byte[] var5 = new byte[var4];
        this.method482(var4, 0, var5, false);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1485 = arg2;
        this.method452(var8.length, arg2 + 255);
        this.method481(0, false, var8, var8.length);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
    public final void method458(int arg0, int arg1) {
        if (arg0 <= 126) {
            this.method472((byte) 10);
        }
        this.field1495[this.field1485++] = (byte) arg1;
        field1504++;
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        this.field1495[this.field1485++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)V")
    public final void method459(long arg0, byte arg1) {
        if (arg1 == -45) {
            field1488++;
            this.method458(127, (int) (arg0 >> 32));
            this.method458(127, (int) arg0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lu;I)V")
    public final void method460(class135 arg0, int arg1) {
        field1462++;
        this.field1485 += arg0.method1083(this.field1485, true, 0, this.field1495, arg0.method1063(-64));
        this.field1495[this.field1485++] = 0;
        if (arg1 < 0) {
            this.field1495 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
    public final void method461(int arg0, long arg1) {
        this.field1495[this.field1485++] = (byte) (arg1 >> 56);
        field1500++;
        this.field1495[this.field1485++] = (byte) (arg1 >> 48);
        this.field1495[this.field1485++] = (byte) (arg1 >> 40);
        this.field1495[this.field1485++] = (byte) (arg1 >> 32);
        this.field1495[this.field1485++] = (byte) (arg1 >> 24);
        if (arg0 != 11739) {
            this.field1485 = 82;
        }
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        this.field1495[this.field1485++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB[I)V")
    public final void method462(int arg0, int arg1, byte arg2, int[] arg3) {
        int var5 = (arg0 - arg1) / 8;
        field1498++;
        int var6 = this.field1485;
        this.field1485 = arg1;
        if (arg2 <= 61) {
            return;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method498((byte) -113);
            int var9 = -1640531527;
            int var10 = this.method498((byte) 123);
            int var11 = -957401312;
            int var12 = 32;
            while (var12-- > 0) {
                var10 -= var11 + arg3[var11 >>> 11 & 0x3] ^ (var8 << 4 ^ var8 >>> 5) - -var8;
                var11 -= var9;
                var8 -= arg3[var11 & 0x3] + var11 ^ (var10 >>> 5 ^ var10 << 4) + var10;
            }
            this.field1485 -= 8;
            this.method463(83, var8);
            this.method463(71, var10);
        }
        this.field1485 = var6;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) {
        field1471++;
        this.field1495[this.field1485++] = (byte) (arg1 >> 24);
        if (arg0 <= 18) {
            this.method477(93, 89);
        }
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        this.field1495[this.field1485++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)I")
    public final int method464(int arg0) {
        this.field1485 += arg0;
        field1480++;
        return (this.field1495[this.field1485 - 2] & 0xFF) + (((this.field1495[this.field1485 - 3] & 0xFF) << 24) - (-((this.field1495[this.field1485 - 4] & 0xFF) << 16) - ((this.field1495[this.field1485 - 1] & 0xFF) << 8)));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([BBII)V")
    public final void method465(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1496++;
        int var5 = arg2 + arg3 - 1;
        if (arg1 == 62) {
            while (var5 >= arg2) {
                arg0[var5] = this.field1495[this.field1485++];
                var5--;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)V")
    public final void method466(int arg0, int arg1) {
        if (arg0 < 102) {
            field1486 = null;
        }
        this.field1495[this.field1485++] = (byte) (128 - arg1);
        field1463++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)V")
    public final void method467(int arg0, byte arg1) {
        field1508++;
        this.field1495[this.field1485 - arg0 - 4] = (byte) (arg0 >> 24);
        if (arg1 != -2) {
            field1451 = null;
        }
        this.field1495[this.field1485 - arg0 - 3] = (byte) (arg0 >> 16);
        this.field1495[this.field1485 - arg0 - 2] = (byte) (arg0 >> 8);
        this.field1495[this.field1485 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)I")
    public final int method468(byte arg0) {
        this.field1485 += 4;
        field1457++;
        int var2 = 25 % ((31 - arg0) / 61);
        return ((this.field1495[this.field1485 - 4] & 0xFF) << 8) + (this.field1495[this.field1485 - 3] & 0xFF) + ((this.field1495[this.field1485 + -2] & 0xFF) << 24) + ((this.field1495[this.field1485 + -1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)I")
    public final int method469(int arg0) {
        field1453++;
        if (arg0 != -128) {
            this.method461(124, 96L);
        }
        return this.field1495[this.field1485++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
    public final void method470(byte arg0, int arg1) {
        field1465++;
        this.field1495[this.field1485++] = (byte) arg1;
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        int var3 = 115 % ((arg0 + 12) / 60);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method471(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class130) {
            class130 var2 = (class130) arg0;
            var3 = var2.field3128 + " | ";
            arg0 = var2.field3111;
        } else {
            var3 = "";
        }
        field1502++;
        if (arg1 != -112) {
            method492(null, -2, 0, null);
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)I")
    public final int method472(byte arg0) {
        field1452++;
        if (arg0 >= -27) {
            this.method452(56, -94);
        }
        this.field1485 += 2;
        return ((this.field1495[this.field1485 - 1] & 0xFF) << 8) + (this.field1495[this.field1485 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)I")
    public final int method473(byte arg0, int arg1) {
        if (arg0 == -81) {
            field1499++;
            int var3 = class93.method755(-106, this.field1495, this.field1485, arg1);
            this.method463(116, var3);
            return var3;
        } else {
            return -87;
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)V")
    public final void method474(int arg0, int arg1) {
        field1473++;
        if (arg0 > -39) {
            this.method491(-79);
        }
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        this.field1495[this.field1485++] = (byte) (arg1 >> 24);
        this.field1495[this.field1485++] = (byte) arg1;
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)B")
    public final byte method475(int arg0) {
        if (arg0 == -49152) {
            field1490++;
            return this.field1495[this.field1485++];
        } else {
            return 19;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)V")
    public final void method476(int arg0, boolean arg1) {
        if (arg1) {
            this.field1495 = null;
        }
        field1501++;
        this.field1495[this.field1485 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(II)V")
    public final void method477(int arg0, int arg1) {
        field1497++;
        this.field1495[this.field1485++] = (byte) (arg1 + 128);
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        if (arg0 != 1407478024) {
            method445(-22);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZI)V")
    public final void method478(boolean arg0, int arg1) {
        field1491++;
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        if (arg0) {
            this.field1495[this.field1485++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)I")
    public final int method479(int arg0) {
        int var2 = this.field1495[this.field1485] & 0xFF;
        field1487++;
        return arg0 > var2 ? this.method480(0) - 64 : this.method483((byte) 24) + -49152;
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)I")
    public final int method480(int arg0) {
        field1478++;
        if (arg0 != 0) {
            this.field1495 = null;
        }
        return this.field1495[this.field1485++] & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ[BI)V")
    public final void method481(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            field1482++;
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                this.field1495[this.field1485++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BZ)V")
    public final void method482(int arg0, int arg1, byte[] arg2, boolean arg3) {
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field1495[this.field1485++];
        }
        if (arg3) {
            this.method446((byte) -51);
        }
        field1472++;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(B)I")
    public final int method483(byte arg0) {
        this.field1485 += 2;
        if (arg0 != 24) {
            this.field1485 = 78;
        }
        field1489++;
        return ((this.field1495[this.field1485 - 2] & 0xFF) << 8) + (this.field1495[this.field1485 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(B)I")
    public final int method484(byte arg0) {
        if (arg0 <= 118) {
            this.field1495 = null;
        }
        field1455++;
        return 128 - this.field1495[this.field1485++] & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIB)I")
    public static final int method485(int arg0, int arg1, int arg2, byte arg3) {
        field1458++;
        int var4 = arg0 & arg2 - 1;
        int var5 = 24 / ((-arg3 - 70) / 44);
        int var6 = arg0 / arg2;
        int var7 = arg1 / arg2;
        int var8 = class5.method23(true, var7, var6);
        int var9 = class5.method23(true, var7, var6 + 1);
        int var10 = arg2 - 1 & arg1;
        int var11 = class5.method23(true, var7 + 1, var6);
        int var12 = class5.method23(true, var7 + 1, var6 + 1);
        int var13 = class20.method157(var8, arg2, var4, 256, var9);
        int var14 = class20.method157(var11, arg2, var4, 256, var12);
        return class20.method157(var13, arg2, var10, 256, var14);
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "(I)B")
    public final byte method486(int arg0) {
        if (arg0 <= 3) {
            this.field1495 = null;
        }
        field1494++;
        return (byte) (128 - this.field1495[this.field1485++]);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(BI)V")
    public final void method487(byte arg0, int arg1) {
        field1464++;
        if (arg0 <= 119) {
            method492(null, 59, 10, null);
        }
        if (arg1 >= 0 && arg1 < 128) {
            this.method452(arg1, 255);
        } else if (arg1 >= 0 && arg1 < 32768) {
            this.method451(arg1 + 32768, (byte) 28);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)I")
    public final int method488(int arg0) {
        if (arg0 != -28134) {
            this.method448(-70, false);
        }
        this.field1485 += 2;
        field1492++;
        return ((this.field1495[this.field1485 - 1] & 0xFF) << 8) + (this.field1495[this.field1485 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)V")
    public static void method489(int arg0) {
        field1486 = null;
        field1451 = null;
        int var1 = -114 % ((19 - arg0) / 35);
        field1507 = null;
        field1503 = null;
        field1484 = null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(I)V")
    public class59(int arg0) {
        this.field1485 = 0;
        this.field1495 = class32.method259(arg0, -9);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(BI)V")
    public final void method490(byte arg0, int arg1) {
        this.field1495[this.field1485++] = (byte) (arg1 >> 8);
        this.field1495[this.field1485++] = (byte) arg1;
        this.field1495[this.field1485++] = (byte) (arg1 >> 24);
        field1481++;
        this.field1495[this.field1485++] = (byte) (arg1 >> 16);
        if (arg0 != -94) {
            field1503 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
    public class59(byte[] arg0) {
        this.field1495 = arg0;
        this.field1485 = 0;
    }

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "(I)I")
    public final int method491(int arg0) {
        this.field1485 += arg0;
        field1505++;
        return ((this.field1495[this.field1485 - 2] & 0xFF) << 8) + (this.field1495[this.field1485 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;IILde;)V")
    public static final void method492(class59 arg0, int arg1, int arg2, class27 arg3) {
        class68 var4 = new class68();
        var4.field1658 = arg0.method480(0);
        field1461++;
        var4.field1672 = arg0.method498((byte) 123);
        var4.field1690 = new int[var4.field1658];
        var4.field1669 = new class64[var4.field1658];
        var4.field1660 = new int[var4.field1658];
        var4.field1676 = new int[var4.field1658];
        var4.field1671 = new class64[var4.field1658];
        var4.field1679 = new byte[var4.field1658][][];
        for (int var5 = 0; var5 < var4.field1658; var5++) {
            try {
                int var6 = arg0.method480(arg1 ^ 0x7F);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method496(-115).method1093(arg1 ^ 0x399A));
                    String var8 = new String(arg0.method496(94).method1093(14821));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method498((byte) 125);
                    }
                    var4.field1676[var5] = var6;
                    var4.field1690[var5] = var9;
                    var4.field1669[var5] = arg3.method226(class124.method972(var7, -121), var8, -24656);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method496(-108).method1093(14821));
                    String var11 = new String(arg0.method496(-90).method1093(14821));
                    int var12 = arg0.method480(arg1 - 127);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method496(arg1 - 219).method1093(14821));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method498((byte) 124);
                            var15[var16] = new byte[var17];
                            arg0.method482(var17, 0, var15[var16], false);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field1676[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class124.method972(var13[var19], -124);
                    }
                    var4.field1671[var5] = arg3.method221(class124.method972(var10, -123), (byte) 93, var18, var11);
                    var4.field1679[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1660[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1660[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1660[var5] = -3;
            } catch (Exception var23) {
                var4.field1660[var5] = -4;
            } catch (Throwable var24) {
                var4.field1660[var5] = -5;
            }
        }
        class3.field91.method185(var4, -27557);
        if (arg1 != 127) {
            method449(-122, null, -3, 127);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
    public final int method493(boolean arg0) {
        field1483++;
        this.field1485 += 4;
        return arg0 ? 25 : ((this.field1495[this.field1485 - 3] & 0xFF) << 8) + ((this.field1495[this.field1485 - 2] & 0xFF) << 16) + ((this.field1495[this.field1485 + -1] & 0xFF) << 24) + (this.field1495[this.field1485 + -4] & 0xFF);
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(B)I")
    public final int method494(byte arg0) {
        field1477++;
        if (arg0 != -22) {
            return -2;
        }
        byte var2 = this.field1495[this.field1485++];
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var3 | var2 & 0x7F) << 7;
            var2 = this.field1495[this.field1485++];
        }
        return var3 | var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBIII)V")
    public static final void method495(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1447++;
        if (arg1 > -12) {
            return;
        }
        for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
            for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class52.field1241[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class68.field1682[0][var6][var5] = class68.field1682[0][var6 - 1][var5];
                    }
                    if (arg3 + arg4 == var6 && var6 < 103) {
                        class68.field1682[0][var6][var5] = class68.field1682[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class68.field1682[0][var6][var5] = class68.field1682[0][var6][var5 - 1];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class68.field1682[0][var6][var5] = class68.field1682[0][var6][var5 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "(I)Lu;")
    public final class135 method496(int arg0) {
        field1467++;
        int var2 = -101 % ((-arg0 - 47) / 34);
        int var3 = this.field1485;
        while (this.field1495[this.field1485++] != 0) {
        }
        return class98.method801(this.field1495, 22060, this.field1485 - var3 - 1, var3);
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(B)B")
    public final byte method497(byte arg0) {
        field1476++;
        return arg0 > -79 ? 67 : (byte) (this.field1495[this.field1485++] - 128);
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(B)I")
    public final int method498(byte arg0) {
        this.field1485 += 4;
        int var2 = 4 % ((64 - arg0) / 57);
        field1474++;
        return (this.field1495[this.field1485 - 1] & 0xFF) + ((this.field1495[this.field1485 - 2] & 0xFF) << 8) + ((this.field1495[this.field1485 - 3] & 0xFF) << 16) + ((this.field1495[this.field1485 - 4] & 0xFF) << 24);
    }
}
