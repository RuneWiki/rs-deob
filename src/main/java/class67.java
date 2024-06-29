import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class67 implements class107 {

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
    private boolean field1573 = true;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field1590 = 256;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lkc;")
    private static class67 field1565 = class19.method144("Please close the interface you have open before using (Wreport abuse(W", 114);

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Lkc;")
    public static class67 field1612 = class19.method144("Geben Sie Ihren Benutzernamen", 77);

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Lkc;")
    public static class67 field1608 = class19.method144("Lade Texturen )2 ", 92);

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lkc;")
    public static class67 field1591 = field1565;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lwd;")
    public static class140 field1585 = new class140(8);

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field1618 = 99;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "Lab;")
    public static class3 field1609;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "Lac;")
    public static class4 field1619;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "Lob;")
    public static class90 field1622;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1623;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[B")
    public byte[] field1597;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method554(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lkc;", line = 8)
    public final class67 method513(int arg0, byte arg1) {
        field1566++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg1 > -78) {
            return null;
        } else {
            class67 var3 = new class67();
            var3.field1597 = new byte[this.field1572 + 1];
            var3.field1572 = this.field1572 + 1;
            class43.method371(this.field1597, 0, var3.field1597, 0, this.field1572);
            var3.field1597[this.field1572] = (byte) arg0;
            return var3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 38)
    public final int method514(int arg0, int arg1) {
        if (arg0 != 32035) {
            this.method553(null, (byte) -36);
        }
        field1575++;
        return this.method546((byte) -110, 0, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)I", line = 53)
    public final int method515(int arg0, int arg1) {
        field1588++;
        if (arg1 != 255) {
            field1609 = null;
        }
        return this.field1597[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILkc;I)I", line = 68)
    private final int method516(int arg0, class67 arg1, int arg2) {
        int[] var4 = new int[arg1.field1572];
        field1586++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field1572];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field1572;
        }
        int var8 = -43 / ((81 - arg2) / 40);
        for (int var9 = 1; var9 <= arg1.field1572; var9++) {
            var4[var9 - 1] = (arg1.field1572 << 1) - var9;
            var5[class90.method693(255, arg1.field1597[var9 - 1])] = arg1.field1572 - var9;
        }
        int var10 = arg1.field1572 + 1;
        for (int var11 = arg1.field1572; var11 > 0; var11--) {
            var6[var11 - 1] = var10;
            while (arg1.field1572 >= var10 && arg1.field1597[var10 - 1] != arg1.field1597[var11 - 1]) {
                if (var4[var10 - 1] >= arg1.field1572 - var11) {
                    var4[var10 - 1] = arg1.field1572 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var10--;
        }
        int var12 = var10;
        int var13 = arg1.field1572 + 1 - var10;
        int var14 = 1;
        int var15 = 0;
        int var16 = 1;
        while (var16 <= var13) {
            var6[var16 - 1] = var15;
            while (var15 >= 1 && arg1.field1597[var15 - 1] != arg1.field1597[var16 - 1]) {
                var15 = var6[var15 - 1];
            }
            var16++;
            var15++;
        }
        while (arg1.field1572 > var12) {
            for (int var19 = var14; var19 <= var12; var19++) {
                if (arg1.field1572 + var12 - var19 <= var4[var19 + -1]) {
                    var4[var19 - 1] = var12 + arg1.field1572 - var19;
                }
            }
            var14 = var12 + 1;
            var12 = var12 + var13 - var6[var13 + -1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg0 + arg1.field1572 - 1; var17 < this.field1572; var17 += Math.max(var5[this.field1597[var17] & 0xFF], var4[var18])) {
            for (var18 = arg1.field1572 - 1; var18 >= 0 && this.field1597[var17] == arg1.field1597[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILkc;)Z", line = 184)
    public final boolean method517(int arg0, class67 arg1) {
        field1579++;
        if (arg0 <= 126) {
            return false;
        } else if (arg1.field1572 > this.field1572) {
            return false;
        } else {
            int var3 = this.field1572 - arg1.field1572;
            for (int var4 = 0; var4 < arg1.field1572; var4++) {
                if (this.field1597[var3 + var4] != arg1.field1597[var4]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI[BII)I", line = 214)
    public final int method518(byte arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class43.method371(this.field1597, arg3, arg2, arg4, arg1 - arg3);
        field1567++;
        int var6 = -112 % ((5 - arg0) / 36);
        return arg1 - arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBILac;)[Lnd;", line = 234)
    public static final class86[] method519(int arg0, byte arg1, int arg2, class4 arg3) {
        field1620++;
        if (arg1 > -100) {
            return null;
        } else if (class19.method151((byte) -100, arg3, arg2, arg0)) {
            return client.method168((byte) 40);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkc;I)I", line = 253)
    public final int method520(class67 arg0, int arg1) {
        if (arg1 == -10874) {
            field1604++;
            return this.method516(0, arg0, arg1 ^ 0x2A06);
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)Lkc;", line = 267)
    public final class67 method521(int arg0, int arg1) {
        field1611++;
        if (~arg0 >= arg1 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field1573) {
            this.field1589 = 0;
            if (this.field1597.length == this.field1572) {
                int var3;
                for (var3 = 1; var3 <= this.field1572; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class43.method371(this.field1597, 0, var4, 0, this.field1572);
                this.field1597 = var4;
            }
            this.field1597[this.field1572++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z", line = 304)
    public final boolean method522(boolean arg0) {
        if (arg0) {
            this.field1573 = false;
        }
        field1605++;
        return this.method536((byte) 126, 10);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I", line = 318)
    public final int method523(int arg0) {
        if (arg0 != 10) {
            field1585 = null;
        }
        field1580++;
        return this.method549(71, 10);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lkc;", line = 330)
    public final class67 method524(boolean arg0) {
        field1577++;
        if (!arg0) {
            this.field1572 = 105;
        }
        long var2 = this.method534(0);
        synchronized (field1623 == null ? (field1623 = method554("kc")) : field1623) {
            if (class130.field3049 == null) {
                class130.field3049 = new class59(4096);
            } else {
                for (class29 var5 = (class29) class130.field3049.method462(false, var2); var5 != null; var5 = (class29) class130.field3049.method464((byte) -63)) {
                    if (this.method533(var5.field610, (byte) -118)) {
                        return var5.field610;
                    }
                }
            }
            class29 var7 = new class29();
            this.field1573 = false;
            var7.field610 = this;
            class130.field3049.method469(-1, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Lkc;", line = 370)
    public final class67 method525(byte arg0) {
        field1621++;
        if (arg0 != 56) {
            this.method546((byte) 8, -38, -12);
        }
        int var2 = this.field1572;
        int var3;
        for (var3 = 0; var3 < this.field1572 && (this.field1597[var3] >= 0 && this.field1597[var3] <= 32 || (this.field1597[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field1597[var2 - 1] >= 0 && this.field1597[var2 - 1] <= 32 || (this.field1597[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field1572 == var2) {
            return this;
        }
        class67 var4 = new class67();
        var4.field1572 = var2 - var3;
        var4.field1597 = new byte[var4.field1572];
        for (int var5 = 0; var5 < var4.field1572; var5++) {
            var4.field1597[var5] = this.field1597[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lkc;", line = 407)
    public final class67 method526(byte arg0) {
        if (arg0 >= -71) {
            return null;
        }
        class67 var2 = new class67();
        var2.field1572 = this.field1572;
        field1581++;
        var2.field1597 = new byte[this.field1572];
        for (int var3 = 0; var3 < this.field1572; var3++) {
            var2.field1597[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lkc;", line = 431)
    public final class67 method527(int arg0) {
        field1615++;
        class67 var2 = new class67();
        var2.field1572 = this.field1572;
        var2.field1597 = new byte[this.field1572];
        for (int var3 = 0; var3 < this.field1572; var3++) {
            byte var4 = this.field1597[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1597[var3] = var4;
        }
        if (arg0 != -32632) {
            this.method538(false, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Lkc;", line = 465)
    public final class67 method528(byte arg0) {
        field1576++;
        class67 var2 = new class67();
        var2.field1572 = this.field1572;
        var2.field1597 = new byte[this.field1572];
        if (arg0 != -26) {
            return null;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1572; var4++) {
            byte var5 = this.field1597[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1597[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1597[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field1597[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lkc;", line = 511)
    public final class67 method529(int arg0, int arg1, int arg2) {
        field1614++;
        class67 var4 = new class67();
        if (arg2 != 17804) {
            this.method545(84, null);
        }
        var4.field1597 = new byte[arg1 - arg0];
        var4.field1572 = arg1 - arg0;
        class43.method371(this.field1597, arg0, var4.field1597, 0, var4.field1572);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)Lkc;", line = 531)
    public final class67 method530(byte arg0) {
        field1587++;
        if (arg0 != 59) {
            this.method543(123);
        }
        if (!this.field1573) {
            throw new IllegalArgumentException();
        }
        this.field1589 = 0;
        if (this.field1597.length != this.field1572) {
            byte[] var2 = new byte[this.field1572];
            class43.method371(this.field1597, 0, var2, 0, this.field1572);
            this.field1597 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Lkc;", line = 572)
    public final class67 method531(int arg0, int arg1) {
        field1569++;
        if (arg0 != 13401) {
            this.method539(-108);
        }
        return this.method529(arg1, this.field1572, 17804);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)J", line = 583)
    public final long method532(int arg0) {
        field1594++;
        if (arg0 > -59) {
            this.method531(23, 52);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1572 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1597[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lkc;B)Z", line = 624)
    public final boolean method533(class67 arg0, byte arg1) {
        field1584++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 > -97) {
            method548(1);
        }
        if (this.field1572 != arg0.field1572) {
            return false;
        }
        if (!this.field1573 || !arg0.field1573) {
            if (this.field1589 == 0) {
                this.field1589 = this.method552(-116);
                if (this.field1589 == 0) {
                    this.field1589 = 1;
                }
            }
            if (arg0.field1589 == 0) {
                arg0.field1589 = arg0.method552(-63);
                if (arg0.field1589 == 0) {
                    arg0.field1589 = 1;
                }
            }
            if (this.field1589 != arg0.field1589) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field1572; var3++) {
            if (this.field1597[var3] != arg0.field1597[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)J", line = 679)
    private final long method534(int arg0) {
        field1599++;
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field1572; var4++) {
            var2 = (var2 << 5) + (long) (this.field1597[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lkc;B)Z", line = 700)
    public final boolean method535(class67 arg0, byte arg1) {
        field1606++;
        if (arg0 == null) {
            return false;
        } else if (this.field1572 == arg0.field1572) {
            int var3 = -95 / ((16 - arg1) / 63);
            for (int var4 = 0; var4 < this.field1572; var4++) {
                byte var5 = this.field1597[var4];
                byte var6 = arg0.field1597[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z", line = 744)
    private final boolean method536(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 <= 119) {
            this.method549(-50, 123);
        }
        field1610++;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1572; var6++) {
            int var7 = this.field1597[var6] & 0xFF;
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
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)Lkc;", line = 825)
    public final class67 method537(int arg0) {
        field1617++;
        int var2 = -99 / ((-arg0 - 87) / 36);
        int var3 = 0;
        class67 var4 = new class67();
        var4.field1572 = 0;
        var4.field1597 = new byte[12];
        for (int var5 = 0; var5 < this.field1572; var5++) {
            if (this.field1597[var5] >= 65 && this.field1597[var5] <= 90) {
                var4.field1597[var3++] = (byte) (this.field1597[var5] + 32);
                var4.field1572 = var3;
            } else if (this.field1597[var5] >= 97 && this.field1597[var5] <= 122 || this.field1597[var5] >= 48 && this.field1597[var5] <= 57) {
                var4.field1597[var3++] = this.field1597[var5];
                var4.field1572 = var3;
            } else if (var3 > 0) {
                var4.field1597[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I", line = 870)
    public final int method538(boolean arg0, FontMetrics arg1) {
        field1574++;
        String var3;
        try {
            var3 = new String(this.field1597, 0, this.field1572, "ISO-8859-1");
            if (arg0) {
                this.method547(null, -32, 82, -1);
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1597, 0, this.field1572);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I", line = 900)
    public final int method539(int arg0) {
        if (arg0 != 2618) {
            this.field1597 = null;
        }
        field1582++;
        return this.field1572;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILkc;)Lkc;", line = 911)
    public final class67 method540(int arg0, int arg1, class67 arg2) {
        field1592++;
        if (!this.field1573) {
            throw new IllegalArgumentException();
        } else if (this.field1572 < arg1) {
            throw new IllegalArgumentException();
        } else {
            this.field1589 = arg0;
            if (arg2.field1572 + arg1 > this.field1597.length) {
                int var4;
                for (var4 = 1; var4 < arg2.field1572 + arg1; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class43.method371(this.field1597, 0, var5, 0, this.field1572);
                this.field1597 = var5;
            }
            class43.method371(arg2.field1597, 0, this.field1597, arg1, arg2.field1572);
            if (this.field1572 < arg2.field1572 + arg1) {
                this.field1572 = arg2.field1572 + arg1;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V", line = 962)
    public static void method541(int arg0) {
        field1609 = null;
        field1565 = null;
        field1622 = null;
        field1585 = null;
        field1591 = null;
        field1619 = null;
        if (arg0 <= 61) {
            method550(false, 78);
        }
        field1608 = null;
        field1612 = null;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V", line = 983)
    public static final void method542(int arg0) {
        class70.field1663.method378((byte) -82);
        field1578++;
        class74.field1751.method378((byte) -66);
        if (arg0 != -23464) {
            method541(-14);
        }
    }

    @OriginalMember(owner = "client!kc", name = "toString", descriptor = "()Ljava/lang/String;", line = 1008)
    public final String toString() {
        field1607++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)Lkc;", line = 1018)
    public final class67 method543(int arg0) {
        class67 var2 = new class67();
        field1564++;
        if (arg0 != 32) {
            this.method515(123, 110);
        }
        var2.field1572 = this.field1572;
        var2.field1597 = new byte[this.field1572];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1572; var4++) {
            byte var5 = this.field1597[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
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
            var2.field1597[var4] = var5;
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)[B", line = 1073)
    public final byte[] method544(int arg0) {
        byte[] var2 = new byte[this.field1572];
        if (arg0 != 16597) {
            field1618 = 54;
        }
        field1602++;
        class43.method371(this.field1597, 0, var2, 0, this.field1572);
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(ILkc;)I", line = 1090)
    public final int method545(int arg0, class67 arg1) {
        field1613++;
        int var3;
        if (arg1.field1572 < this.field1572) {
            var3 = arg1.field1572;
        } else {
            var3 = this.field1572;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field1597[var4] > this.field1597[var4]) {
                return -1;
            }
            if (this.field1597[var4] > arg1.field1597[var4]) {
                return 1;
            }
        }
        if (arg0 != -1) {
            this.field1572 = 125;
        }
        if (arg1.field1572 > this.field1572) {
            return -1;
        } else if (arg1.field1572 < this.field1572) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I", line = 1136)
    private final int method546(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        field1568++;
        for (int var5 = arg1; var5 < this.field1572; var5++) {
            if (this.field1597[var5] == var4) {
                return var5;
            }
        }
        int var6 = -76 / ((arg0 + 45) / 59);
        return -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 1178)
    public final void method547(Graphics arg0, int arg1, int arg2, int arg3) {
        field1593++;
        String var5;
        try {
            var5 = new String(this.field1597, 0, this.field1572, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1597, 0, this.field1572);
        }
        if (arg1 == 31689) {
            arg0.drawString(var5, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "(I)V", line = 1199)
    public static final void method548(int arg0) {
        class11.field239.method378((byte) -86);
        class83.field1967.method378((byte) -109);
        if (arg0 <= 53) {
            method548(-95);
        }
        field1596++;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(II)I", line = 1216)
    private final int method549(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        field1570++;
        if (arg0 <= 3) {
            return 95;
        }
        for (int var6 = 0; var6 < this.field1572; var6++) {
            int var7 = this.field1597[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
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
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "hashCode", descriptor = "()I", line = 1298)
    public final int hashCode() {
        field1603++;
        return this.method552(-123);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V", line = 1306)
    public static final void method550(boolean arg0, int arg1) {
        field1616++;
        if (!arg0) {
            field1618 = 13;
        }
        for (class29.field611 += arg1; class29.field611 >= class4.field55; class29.field611 -= class4.field55) {
            class31.field660 -= class31.field660 >> 2;
        }
        class31.field660 -= arg1 * 1000;
        if (class31.field660 < 0) {
            class31.field660 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(ILkc;)Lkc;", line = 1327)
    public final class67 method551(int arg0, class67 arg1) {
        if (arg0 >= -77) {
            field1590 = 109;
        }
        field1595++;
        if (!this.field1573) {
            throw new IllegalArgumentException();
        }
        this.field1589 = 0;
        if (this.field1572 + arg1.field1572 > this.field1597.length) {
            int var3;
            for (var3 = 1; var3 < this.field1572 + arg1.field1572; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class43.method371(this.field1597, 0, var4, 0, this.field1572);
            this.field1597 = var4;
        }
        class43.method371(arg1.field1597, 0, this.field1597, this.field1572, arg1.field1572);
        this.field1572 += arg1.field1572;
        return this;
    }

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "(I)I", line = 1381)
    public final int method552(int arg0) {
        field1583++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -29) {
            return -37;
        }
        while (this.field1572 > var3) {
            var2 = (this.field1597[var3] & 0xFF) + ((var2 << 5) - var2);
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1417)
    public final boolean equals(Object arg0) {
        field1601++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Lkc;B)Z", line = 1442)
    public final boolean method553(class67 arg0, byte arg1) {
        field1598++;
        if (arg1 != -64) {
            this.method538(true, null);
        }
        if (this.field1572 < arg0.field1572) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1572; var3++) {
            if (this.field1597[var3] != arg0.field1597[var3]) {
                return false;
            }
        }
        return true;
    }
}
