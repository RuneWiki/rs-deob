import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 implements class124 {

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
    private boolean field1501 = true;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Llc;")
    public static class69 field1513 = method470((byte) -105, "flash2:");

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Llc;")
    public static class69 field1518 = method470((byte) -121, "Loading wordpack )2 0(U");

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
    public static boolean field1519 = false;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Llc;")
    public static class69 field1508 = method470((byte) -123, "Accept trade @whi@");

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lmd;")
    public static class76 field1526 = new class76();

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "Llc;")
    public static class69 field1536 = method470((byte) -118, "backhmid2");

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Llc;")
    public static class69 field1539 = method470((byte) -126, "To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3");

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "Lfe;")
    public static class36 field1535 = new class36(50);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "Llc;")
    public static class69 field1541 = method470((byte) -101, "red:");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public int field1523;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field1538;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field1542;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[B")
    public byte[] field1488;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[Lcb;")
    public static class15[] field1540;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "[Lda;")
    public static class20[] field1537;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)J")
    private final long method459(int arg0) {
        field1511++;
        if (arg0 != 11489) {
            field1541 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1523; var4++) {
            var2 = (var2 << 5) + ((long) (this.field1488[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Llc;")
    public final class69 method460(boolean arg0) {
        field1525++;
        class69 var2 = new class69();
        boolean var3 = true;
        var2.field1523 = this.field1523;
        var2.field1488 = new byte[this.field1523];
        for (int var4 = 0; var4 < this.field1523; var4++) {
            byte var5 = this.field1488[var4];
            if (var5 == 95) {
                var2.field1488[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1488[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field1488[var4] = var5;
            }
        }
        if (arg0) {
            field1519 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llc;I)Z")
    public final boolean method461(class69 arg0, int arg1) {
        field1498++;
        if (this.field1523 < arg0.field1523) {
            return false;
        }
        int var3 = this.field1523 - arg0.field1523;
        int var4 = 0;
        if (arg1 != 32654) {
            method488(true, null, (byte) -11, null);
        }
        while (var4 < arg0.field1523) {
            if (this.field1488[var3 + var4] != arg0.field1488[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Llc;")
    private final class69 method462(byte arg0) {
        field1491++;
        long var2 = this.method459(11489);
        synchronized (field1542 == null ? (field1542 = method496("lc")) : field1542) {
            if (class51.field1123 == null) {
                class51.field1123 = new class98(4096);
            } else {
                for (class47 var5 = (class47) class51.field1123.method744(-1, var2); var5 != null; var5 = (class47) class51.field1123.method739(true)) {
                    if (this.method463((byte) -107, var5.field980)) {
                        return var5.field980;
                    }
                }
            }
            class47 var7 = new class47();
            var7.field980 = this;
            this.field1501 = false;
            class51.field1123.method745(var7, var2, -1);
            if (arg0 >= -50) {
                this.method462((byte) -26);
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1521++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLlc;)Z")
    public final boolean method463(byte arg0, class69 arg1) {
        field1506++;
        if (arg1 == null) {
            return false;
        } else if (this.field1523 == arg1.field1523) {
            if (!this.field1501 || !arg1.field1501) {
                if (this.field1514 == 0) {
                    this.field1514 = this.method489(18661);
                    if (this.field1514 == 0) {
                        this.field1514 = 1;
                    }
                }
                if (arg1.field1514 == 0) {
                    arg1.field1514 = arg1.method489(18661);
                    if (arg1.field1514 == 0) {
                        arg1.field1514 = 1;
                    }
                }
                if (this.field1514 != arg1.field1514) {
                    return false;
                }
            }
            if (arg0 >= -51) {
                this.method492(-120, 121, (byte) 15);
            }
            for (int var3 = 0; var3 < this.field1523; var3++) {
                if (this.field1488[var3] != arg1.field1488[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public final int method464(int arg0, int arg1) {
        field1512++;
        if (arg1 != 0) {
            this.field1523 = 25;
        }
        return this.method492(0, arg0, (byte) 47);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)J")
    public final long method465(int arg0) {
        field1507++;
        if (arg0 != 1) {
            field1526 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1523 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1488[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Z")
    public final boolean method466(int arg0) {
        field1489++;
        if (arg0 != 10) {
            field1535 = null;
        }
        return this.method483(10, (byte) 114);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method467(int arg0, byte arg1, int arg2, Graphics arg3) {
        field1517++;
        int var5 = 26 % ((arg1 - 62) / 46);
        String var6;
        try {
            var6 = new String(this.field1488, 0, this.field1523, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var6 = new String(this.field1488, 0, this.field1523);
        }
        arg3.drawString(var6, arg0, arg2);
    }

    @OriginalMember(owner = "client!lc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1503++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)I")
    public final int method468(boolean arg0) {
        if (arg0) {
            this.method478(null, 57);
        }
        field1510++;
        return this.method482(10, 3725);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Llc;")
    public final class69 method469(int arg0, byte arg1) {
        field1529++;
        if (arg1 >= -68) {
            field1508 = null;
        }
        class69 var3 = new class69();
        var3.field1488 = new byte[this.field1523 + 1];
        var3.field1523 = this.field1523 + 1;
        class48.method316(this.field1488, 0, var3.field1488, 0, this.field1523);
        var3.field1488[this.field1523] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)Llc;")
    public static final class69 method470(byte arg0, String arg1) {
        field1531++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class69 var4 = new class69();
        int var5 = 0;
        var4.field1488 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1488[var4.field1523++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else {
                var4.field1488[var4.field1523++] = (byte) var6;
            }
        }
        var4.method475(-112);
        if (arg0 >= -94) {
            field1508 = null;
        }
        return var4.method462((byte) -63);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZB)V")
    public static final void method471(boolean arg0, byte arg1) {
        field1499++;
        class72.field1602 = arg0;
        if (arg1 < 107) {
            field1536 = null;
        }
        if (!class72.field1602) {
            int var2 = class3.field22.method670(-118);
            int var3 = (class103.field2224 - class3.field22.field2061) / 16;
            class27.field587 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class27.field587[var4][var14] = class3.field22.method667(5811);
                }
            }
            int var5 = class3.field22.method670(-119);
            int var6 = class3.field22.method670(-120);
            int var7 = class3.field22.method709(-119);
            int var8 = class3.field22.method665(8666);
            class67.field1419 = new byte[var3][];
            class19.field416 = new byte[var3][];
            class93.field2029 = new int[var3];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && (var5 / 8) == 48) {
                var9 = true;
            }
            class68.field1485 = new int[var3];
            class18.field377 = new int[var3];
            int var10 = 0;
            if (var8 / 8 == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class18.field377[var10] = var13;
                        class68.field1485[var10] = class106.field2301.method400(class46.method305(20025, new class69[] { class76.field1710, class106.method791(var11, (byte) -37), class26.field567, class106.method791(var12, (byte) -126) }), (byte) 99);
                        class93.field2029[var10] = class106.field2301.method400(class46.method305(20025, new class69[] { class53.field1143, class106.method791(var11, (byte) -104), class26.field567, class106.method791(var12, (byte) -101) }), (byte) 118);
                        var10++;
                    }
                }
            }
            class47.method314(var2, var8, var6, var5, (byte) -46, var7);
            return;
        }
        int var15 = class3.field22.method705(-35);
        class3.field22.method175(20375);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class3.field22.method181(1, 8);
                    if (var37 == 1) {
                        class71.field1594[var16][var35][var36] = class3.field22.method181(26, 8);
                    } else {
                        class71.field1594[var16][var35][var36] = -1;
                    }
                }
            }
        }
        class3.field22.method176((byte) -110);
        int var17 = (class103.field2224 - class3.field22.field2061) / 16;
        class27.field587 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class27.field587[var18][var34] = class3.field22.method698(-1986049440);
            }
        }
        int var19 = class3.field22.method709(-79);
        int var20 = class3.field22.method671(-116);
        int var21 = class3.field22.method705(-25);
        int var22 = class3.field22.method671(-120);
        class93.field2029 = new int[var17];
        class18.field377 = new int[var17];
        class67.field1419 = new byte[var17][];
        class19.field416 = new byte[var17][];
        class68.field1485 = new int[var17];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class71.field1594[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 3 & 0x7FF;
                        int var29 = var27 >> 14 & 0x3FF;
                        int var30 = (var29 / 8 << 8) + (var28 / 8);
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class18.field377[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 & 0xFF;
                            class18.field377[var23] = var30;
                            int var33 = var30 >> 8 & 0xFF;
                            class68.field1485[var23] = class106.field2301.method400(class46.method305(20025, new class69[] { class76.field1710, class106.method791(var33, (byte) -53), class26.field567, class106.method791(var32, (byte) -98) }), (byte) 119);
                            class93.field2029[var23] = class106.field2301.method400(class46.method305(20025, new class69[] { class53.field1143, class106.method791(var33, (byte) -63), class26.field567, class106.method791(var32, (byte) -77) }), (byte) 47);
                            var23++;
                        }
                    }
                }
            }
        }
        class47.method314(var15, var21, var20, var22, (byte) -46, var19);
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Llc;")
    public final class69 method472(int arg0) {
        field1530++;
        class69 var2 = new class69();
        var2.field1523 = this.field1523;
        var2.field1488 = new byte[this.field1523];
        int var3 = -19 / ((arg0 + 37) / 55);
        for (int var4 = 0; var4 < this.field1523; var4++) {
            var2.field1488[var4] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Llc;I)I")
    public final int method473(class69 arg0, int arg1) {
        if (arg1 != 0) {
            method491(-21);
        }
        field1509++;
        return this.method479((byte) -119, 0, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLlc;)Z")
    public final boolean method474(boolean arg0, class69 arg1) {
        field1496++;
        if (arg1 == null) {
            return false;
        } else if (this.field1523 != arg1.field1523) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            for (int var3 = 0; var3 < this.field1523; var3++) {
                byte var4 = this.field1488[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1488[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Llc;")
    private final class69 method475(int arg0) {
        field1495++;
        if (!this.field1501) {
            throw new IllegalArgumentException();
        }
        this.field1514 = 0;
        int var2 = -91 / ((arg0 + 67) / 32);
        if (this.field1488.length != this.field1523) {
            byte[] var3 = new byte[this.field1523];
            class48.method316(this.field1488, 0, var3, 0, this.field1523);
            this.field1488 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)Llc;")
    public final class69 method476(boolean arg0) {
        field1516++;
        if (!arg0) {
            this.method460(true);
        }
        class69 var2 = new class69();
        var2.field1488 = new byte[12];
        var2.field1523 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1523; var4++) {
            if (this.field1488[var4] >= 65 && this.field1488[var4] <= 90) {
                var2.field1488[var3++] = (byte) (this.field1488[var4] + 97 - 65);
                var2.field1523 = var3;
            } else if (this.field1488[var4] >= 97 && this.field1488[var4] <= 122 || this.field1488[var4] >= 48 && this.field1488[var4] <= 57) {
                var2.field1488[var3++] = this.field1488[var4];
                var2.field1523 = var3;
            } else if (var3 > 0) {
                var2.field1488[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Llc;")
    public final class69 method477(int arg0, int arg1, int arg2) {
        field1504++;
        if (arg0 != 63) {
            this.method490(-44, null);
        }
        class69 var4 = new class69();
        var4.field1488 = new byte[arg1 - arg2];
        var4.field1523 = arg1 - arg2;
        class48.method316(this.field1488, arg2, var4.field1488, 0, var4.field1523);
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method478(FontMetrics arg0, int arg1) {
        if (arg1 < 31) {
            field1519 = true;
        }
        field1533++;
        String var3;
        try {
            var3 = new String(this.field1488, 0, this.field1523, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1488, 0, this.field1523);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILlc;)I")
    private final int method479(byte arg0, int arg1, class69 arg2) {
        field1527++;
        int[] var4 = new int[arg2.field1523];
        int[] var5 = new int[arg2.field1523];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field1523;
        }
        for (int var8 = 1; var8 <= arg2.field1523; var8++) {
            var4[var8 - 1] = (arg2.field1523 << 1) - var8;
            var6[class23.method151(arg2.field1488[var8 - 1], 255)] = arg2.field1523 - var8;
        }
        int var9 = arg2.field1523 + 1;
        if (arg0 != -119) {
            return 114;
        }
        for (int var10 = arg2.field1523; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg2.field1523 && arg2.field1488[var9 - 1] != arg2.field1488[var10 - 1]) {
                if (arg2.field1523 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg2.field1523 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field1523 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field1488[var14 - 1] != arg2.field1488[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (arg2.field1523 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg2.field1523 + var11 - var18) {
                    var4[var18 - 1] = arg2.field1523 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 + -1];
            var12 = var5[var12 - 1];
        }
        int var17;
        for (int var16 = arg2.field1523 + arg1 - 1; var16 < this.field1523; var16 += Math.max(var6[this.field1488[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field1523 - 1; var17 >= 0 && this.field1488[var16] == arg2.field1488[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)I")
    public final int method480(int arg0, boolean arg1) {
        if (arg1) {
            this.method482(84, 27);
        }
        field1505++;
        return this.field1488[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[B")
    public final byte[] method481(byte arg0) {
        if (arg0 != -95) {
            this.field1514 = 90;
        }
        field1493++;
        byte[] var2 = new byte[this.field1523];
        class48.method316(this.field1488, 0, var2, 0, this.field1523);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1492++;
        return this.method489(18661);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    private final int method482(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field1502++;
        if (arg1 != 3725) {
            return 36;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1523; var6++) {
            int var7 = this.field1488[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)Z")
    private final boolean method483(int arg0, byte arg1) {
        field1494++;
        if (arg1 < 61) {
            this.hashCode();
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1523; var6++) {
            int var7 = this.field1488[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(Z)Llc;")
    public final class69 method484(boolean arg0) {
        field1538++;
        int var2;
        for (var2 = 0; var2 < this.field1523 && this.field1488[var2] >= 0 && this.field1488[var2] <= 32; var2++) {
        }
        int var3;
        for (var3 = this.field1523; var3 > var2 && this.field1488[var3 - 1] >= 0 && this.field1488[var3 - 1] <= 32; var3--) {
        }
        class69 var4 = new class69();
        var4.field1523 = var3 - var2;
        var4.field1488 = new byte[var4.field1523];
        for (int var5 = 0; var5 < var4.field1523; var5++) {
            var4.field1488[var5] = this.field1488[var2 + var5];
        }
        if (arg0) {
            this.method485((byte) 121);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Llc;")
    public final class69 method485(byte arg0) {
        field1515++;
        class69 var2 = new class69();
        boolean var3 = true;
        var2.field1523 = this.field1523;
        var2.field1488 = new byte[this.field1523];
        for (int var4 = 0; var4 < this.field1523; var4++) {
            byte var5 = this.field1488[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var3) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
            var2.field1488[var4] = var5;
        }
        if (arg0 > -75) {
            method491(33);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(IB)Llc;")
    public final class69 method486(int arg0, byte arg1) {
        if (arg1 != -102) {
            field1519 = true;
        }
        field1524++;
        return this.method477(63, this.field1523, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)I")
    public final int method487(byte arg0) {
        if (arg0 > -77) {
            return 88;
        } else {
            field1500++;
            return this.field1523;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLkc;BLkc;)V")
    public static final void method488(boolean arg0, class63 arg1, byte arg2, class63 arg3) {
        class119.field2546 = arg0;
        if (arg2 != 29) {
            method488(true, null, (byte) 32, null);
        }
        field1528++;
        class81.field1832 = arg3;
        class24.field497 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
    public final int method489(int arg0) {
        field1497++;
        if (arg0 != 18661) {
            method488(false, null, (byte) 29, null);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1523; var3++) {
            var2 = (this.field1488[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;)Z")
    public final boolean method490(int arg0, class69 arg1) {
        field1520++;
        if (arg0 < 116) {
            field1536 = null;
        }
        if (arg1.field1523 > this.field1523) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1523; var3++) {
            if (this.field1488[var3] != arg1.field1488[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public static void method491(int arg0) {
        field1518 = null;
        field1526 = null;
        field1539 = null;
        field1540 = null;
        field1508 = null;
        if (arg0 != -98) {
            method471(true, (byte) -75);
        }
        field1541 = null;
        field1537 = null;
        field1513 = null;
        field1536 = null;
        field1535 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)I")
    private final int method492(int arg0, int arg1, byte arg2) {
        if (arg2 != 47) {
            return 5;
        }
        field1532++;
        byte var4 = (byte) arg1;
        for (int var5 = arg0; var5 < this.field1523; var5++) {
            if (this.field1488[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lqd;I)V")
    public static final void method493(class99 arg0, int arg1) {
        field1522++;
        class70.field1565 = arg1;
        try {
            class103.field2236 = (class110) Class.forName("a").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            class32 var2 = arg0.method747(arg1 + 9834);
            if (var2 == null) {
                class103.field2236 = new class51(arg0);
            } else {
                class103.field2236 = new class37(arg0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(Z)Llc;")
    public final class69 method494(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field1487++;
        class69 var2 = new class69();
        var2.field1523 = this.field1523;
        var2.field1488 = new byte[this.field1523];
        for (int var3 = 0; var3 < this.field1523; var3++) {
            byte var4 = this.field1488[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1488[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BII)I")
    public final int method495(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class48.method316(this.field1488, arg0, arg2, arg4, arg3 - arg0);
        field1490++;
        if (arg1 <= 9) {
            this.method489(-116);
        }
        return arg3 - arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method496(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
