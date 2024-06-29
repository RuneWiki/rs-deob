import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class63 implements class67 {

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Z")
    private boolean field1626 = true;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1589 = 0;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Lgg;")
    public static class63 field1609 = class116.method911(43, " ");

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "[Lbc;")
    public static class14[] field1617 = new class14[16];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
    public static boolean field1587 = false;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "J")
    public static volatile long field1629 = 0L;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Lbg;")
    public static class18 field1621;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field1633;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[B")
    public byte[] field1602;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;B)Z")
    public final boolean method568(class63 arg0, byte arg1) {
        field1583++;
        if (arg0 == null) {
            return false;
        } else if (this.field1628 == arg0.field1628) {
            if (!this.field1626 || !arg0.field1626) {
                if (this.field1599 == 0) {
                    this.field1599 = this.method587((byte) -39);
                    if (this.field1599 == 0) {
                        this.field1599 = 1;
                    }
                }
                if (arg0.field1599 == 0) {
                    arg0.field1599 = arg0.method587((byte) -39);
                    if (arg0.field1599 == 0) {
                        arg0.field1599 = 1;
                    }
                }
                if (this.field1599 != arg0.field1599) {
                    return false;
                }
            }
            if (arg1 != -127) {
                this.method570((byte) 66, null);
            }
            for (int var3 = 0; var3 < this.field1628; var3++) {
                if (this.field1602[var3] != arg0.field1602[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    public final int method569(int arg0, int arg1, int arg2) {
        field1606++;
        byte var4 = (byte) arg2;
        if (arg0 != -1) {
            field1589 = -48;
        }
        for (int var5 = arg1; var5 < this.field1628; var5++) {
            if (this.field1602[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLgg;)Lgg;")
    public final class63 method570(byte arg0, class63 arg1) {
        field1632++;
        if (!this.field1626) {
            throw new IllegalArgumentException();
        }
        this.field1599 = 0;
        if (this.field1628 + arg1.field1628 > this.field1602.length) {
            int var3;
            for (var3 = 1; var3 < this.field1628 + arg1.field1628; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class102.method847(this.field1602, 0, var4, 0, this.field1628);
            this.field1602 = var4;
        }
        if (arg0 < 111) {
            return null;
        } else {
            class102.method847(arg1.field1602, 0, this.field1602, this.field1628, arg1.field1628);
            this.field1628 += arg1.field1628;
            return this;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Ljava/net/URL;")
    public final URL method571(int arg0) throws MalformedURLException {
        if (arg0 != 0) {
            field1621 = null;
        }
        field1627++;
        return new URL(new String(this.field1602, 0, this.field1628));
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public final void method572(byte arg0, int arg1, int arg2, Graphics arg3) {
        field1596++;
        if (arg0 != -99) {
            this.field1626 = false;
        }
        String var5;
        try {
            var5 = new String(this.field1602, 0, this.field1628, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1602, 0, this.field1628);
        }
        arg3.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    public final int method573(int arg0, int arg1) {
        if (arg0 == 255) {
            field1615++;
            return this.field1602[arg1] & 0xFF;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Lgg;")
    public final class63 method574(byte arg0) {
        field1586++;
        if (!this.field1626) {
            throw new IllegalArgumentException();
        }
        if (arg0 < 93) {
            this.method578(true);
        }
        this.field1599 = 0;
        if (this.field1602.length != this.field1628) {
            byte[] var2 = new byte[this.field1628];
            class102.method847(this.field1602, 0, var2, 0, this.field1628);
            this.field1602 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILgg;)Z")
    public final boolean method575(int arg0, class63 arg1) {
        field1582++;
        if (this.field1628 < arg1.field1628) {
            return false;
        }
        int var3 = this.field1628 - arg1.field1628;
        int var4 = 0;
        if (arg0 != 97) {
            field1587 = true;
        }
        while (var4 < arg1.field1628) {
            if (this.field1602[var3 + var4] != arg1.field1602[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Lgg;")
    public final class63 method576(byte arg0) {
        if (arg0 != 32) {
            method591(null, true, 92);
        }
        field1598++;
        class63 var2 = new class63();
        var2.field1628 = this.field1628;
        var2.field1602 = new byte[this.field1628];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1628; var4++) {
            byte var5 = this.field1602[var4];
            if (var5 == 95) {
                var2.field1602[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1602[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field1602[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method577(byte arg0, FontMetrics arg1) {
        if (arg0 != 80) {
            field1621 = null;
        }
        field1624++;
        String var3;
        try {
            var3 = new String(this.field1602, 0, this.field1628, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1602, 0, this.field1628);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Lgg;")
    public final class63 method578(boolean arg0) {
        int var2;
        for (var2 = 0; var2 < this.field1628 && (this.field1602[var2] >= 0 && this.field1602[var2] <= 32 || (this.field1602[var2] & 0xFF) == 160); var2++) {
        }
        field1588++;
        int var3;
        for (var3 = this.field1628; var2 < var3 && (this.field1602[var3 - 1] >= 0 && this.field1602[var3 - 1] <= 32 || (this.field1602[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field1628 == var3) {
            return this;
        } else if (arg0) {
            return null;
        } else {
            class63 var4 = new class63();
            var4.field1628 = var3 - var2;
            var4.field1602 = new byte[var4.field1628];
            for (int var5 = 0; var5 < var4.field1628; var5++) {
                var4.field1602[var5] = this.field1602[var2 + var5];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;IZ)I")
    public final int method579(class63 arg0, int arg1, boolean arg2) {
        field1613++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg0.field1628];
        int[] var6 = new int[arg0.field1628];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg0.field1628;
        }
        if (!arg2) {
            this.field1602 = null;
        }
        for (int var8 = 1; var8 <= arg0.field1628; var8++) {
            var5[var8 - 1] = (arg0.field1628 << 1) - var8;
            var4[class110.method881(255, arg0.field1602[var8 - 1])] = arg0.field1628 - var8;
        }
        int var9 = arg0.field1628 + 1;
        for (int var10 = arg0.field1628; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg0.field1628 >= var9 && arg0.field1602[var9 - 1] != arg0.field1602[var10 - 1]) {
                if (var5[var9 - 1] >= arg0.field1628 - var10) {
                    var5[var9 - 1] = arg0.field1628 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = 0;
        int var14 = arg0.field1628 + 1 - var9;
        for (int var15 = 1; var15 <= var14; var15++) {
            var6[var15 - 1] = var13;
            while (var13 >= 1 && arg0.field1602[var13 - 1] != arg0.field1602[var15 - 1]) {
                var13 = var6[var13 - 1];
            }
            var13++;
        }
        while (arg0.field1628 > var11) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= arg0.field1628 + var11 - var18) {
                    var5[var18 - 1] = arg0.field1628 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg0.field1628 + arg1 - 1; var16 < this.field1628; var16 += Math.max(var4[this.field1602[var16] & 0xFF], var5[var17])) {
            for (var17 = arg0.field1628 - 1; var17 >= 0 && this.field1602[var16] == arg0.field1602[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Lgg;")
    public final class63 method580(int arg0, int arg1) {
        field1620++;
        if (arg1 != 25153) {
            field1587 = false;
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1626) {
            this.field1599 = 0;
            if (this.field1602.length == this.field1628) {
                int var3;
                for (var3 = 1; var3 <= this.field1628; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class102.method847(this.field1602, 0, var4, 0, this.field1628);
                this.field1602 = var4;
            }
            this.field1602[this.field1628++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1621 = null;
        field1617 = null;
        if (arg0 == 32) {
            field1609 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
    public final int method582(int arg0) {
        if (arg0 > -47) {
            this.method604((byte) -29);
        }
        field1625++;
        return this.field1628;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIIII)I")
    public final int method583(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1616++;
        class102.method847(this.field1602, arg4, arg0, arg1, arg2 - arg4);
        if (arg3 != -24173) {
            this.method573(94, 116);
        }
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Lgg;")
    public final class63 method584(byte arg0) {
        field1581++;
        if (arg0 != -123) {
            field1617 = null;
        }
        class63 var2 = new class63();
        var2.field1628 = this.field1628;
        var2.field1602 = new byte[this.field1628];
        for (int var3 = 0; var3 < this.field1628; var3++) {
            byte var4 = this.field1602[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1602[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ILgg;)I")
    public final int method585(int arg0, class63 arg1) {
        int var3 = 53 % ((41 - arg0) / 46);
        field1595++;
        return this.method579(arg1, 0, true);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Lgg;")
    public final class63 method586(int arg0) {
        if (arg0 < 43) {
            this.field1602 = null;
        }
        field1608++;
        class63 var2 = new class63();
        var2.field1628 = this.field1628;
        var2.field1602 = new byte[this.field1628];
        for (int var3 = 0; var3 < this.field1628; var3++) {
            var2.field1602[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
    public final int method587(byte arg0) {
        if (arg0 != -39) {
            return 22;
        }
        field1603++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1628; var3++) {
            var2 = (var2 << 5) + (this.field1602[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)Lgg;")
    public final class63 method588(byte arg0) {
        field1614++;
        long var2 = this.method603(113);
        synchronized (field1633 == null ? (field1633 = method606("gg")) : field1633) {
            if (class117.field2625 == null) {
                class117.field2625 = new class78(4096);
            } else {
                for (class101 var5 = (class101) class117.field2625.method694(-23979, var2); var5 != null; var5 = (class101) class117.field2625.method695(false)) {
                    if (this.method568(var5.field2367, (byte) -127)) {
                        return var5.field2367;
                    }
                }
            }
            if (arg0 != 116) {
                this.field1602 = null;
            }
            class101 var7 = new class101();
            var7.field2367 = this;
            this.field1626 = false;
            class117.field2625.method702((byte) 121, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;I)I")
    public final int method589(class63 arg0, int arg1) {
        field1623++;
        int var3;
        if (arg0.field1628 < this.field1628) {
            var3 = arg0.field1628;
        } else {
            var3 = this.field1628;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class28.field643[this.field1602[var4] & 0xFF] < class28.field643[arg0.field1602[var4] & 0xFF]) {
                return -1;
            }
            if (class28.field643[arg0.field1602[var4] & 0xFF] < class28.field643[this.field1602[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field1628 > this.field1628) {
            return -1;
        }
        if (arg1 != -1669) {
            field1609 = null;
        }
        if (this.field1628 > arg0.field1628) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)J")
    public final long method590(int arg0) {
        field1607++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -98) {
            this.method578(false);
        }
        while (this.field1628 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var5 = this.field1602[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1631++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BZI)I")
    public static final int method591(byte[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method581(-1);
        }
        field1590++;
        return class187.method1227(arg0, 0, -1, arg2);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Lgg;")
    public final class63 method592(boolean arg0, int arg1) {
        field1593++;
        if (arg0) {
            this.method569(14, -46, 107);
        }
        return this.method596(arg1, this.field1628, -76);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lgg;I)Z")
    public final boolean method593(class63 arg0, int arg1) {
        field1612++;
        if (this.field1628 < arg0.field1628) {
            return false;
        } else if (arg1 == -22331) {
            for (int var3 = 0; var3 < arg0.field1628; var3++) {
                if (this.field1602[var3] != arg0.field1602[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)Lgg;")
    public final class63 method594(byte arg0) {
        field1594++;
        if (arg0 >= -31) {
            this.field1628 = 119;
        }
        return class89.method770(this.method590(-98), false);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)I")
    public final int method595(int arg0, int arg1) {
        field1597++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        if (arg0 != -19752) {
            this.field1599 = 38;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1628; var6++) {
            int var7 = this.field1602[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)Lgg;")
    public final class63 method596(int arg0, int arg1, int arg2) {
        field1600++;
        class63 var4 = new class63();
        var4.field1628 = arg1 - arg0;
        var4.field1602 = new byte[arg1 - arg0];
        if (arg2 > -50) {
            this.field1602 = null;
        }
        class102.method847(this.field1602, arg0, var4.field1602, 0, var4.field1628);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1592++;
        if (!(arg0 instanceof class63)) {
            throw new IllegalArgumentException();
        }
        return this.method568((class63) arg0, (byte) -127);
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z")
    public final boolean method597(int arg0) {
        field1622++;
        int var2 = 121 / ((55 - arg0) / 46);
        return this.method602(9, 10);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lgg;")
    public final class63 method598(int arg0, int arg1) {
        field1630++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class63 var3 = new class63();
        var3.field1602 = new byte[this.field1628 + 1];
        int var4 = 27 / ((81 - arg0) / 39);
        var3.field1628 = this.field1628 + 1;
        class102.method847(this.field1602, 0, var3.field1602, 0, this.field1628);
        var3.field1602[this.field1628] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lgg;")
    public final class63 method599(int arg0) {
        field1610++;
        class63 var2 = new class63();
        var2.field1628 = this.field1628;
        var2.field1602 = new byte[this.field1628];
        byte var3 = 2;
        if (arg0 != 967) {
            field1629 = 6L;
        }
        for (int var4 = 0; var4 < this.field1628; var4++) {
            byte var5 = this.field1602[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1602[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
    public final int method600(boolean arg0) {
        if (arg0) {
            field1621 = null;
        }
        field1604++;
        return this.method595(-19752, 10);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(ILgg;)Z")
    public final boolean method601(int arg0, class63 arg1) {
        field1591++;
        if (arg1 == null) {
            return false;
        } else if (this.field1628 == arg1.field1628) {
            if (arg0 != 13117) {
                field1617 = null;
            }
            for (int var3 = 0; var3 < this.field1628; var3++) {
                byte var4 = this.field1602[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1602[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)Z")
    private final boolean method602(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = -81 / ((66 - arg0) / 34);
        field1584++;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field1628; var7++) {
            int var8 = this.field1602[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var8) {
                return false;
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var6 + var8;
            if (var9 / arg1 != var6) {
                return false;
            }
            var6 = var9;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)J")
    private final long method603(int arg0) {
        field1611++;
        int var2 = -45 % ((arg0 - 39) / 62);
        long var3 = 0L;
        for (int var5 = 0; var5 < this.field1628; var5++) {
            var3 = (var3 << 5) + (long) (this.field1602[var5] & 0xFF) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(B)[B")
    public final byte[] method604(byte arg0) {
        field1585++;
        int var2 = 13 % ((22 - arg0) / 45);
        byte[] var3 = new byte[this.field1628];
        class102.method847(this.field1602, 0, var3, 0, this.field1628);
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1605++;
        return this.method587((byte) -39);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(ILgg;)I")
    public final int method605(int arg0, class63 arg1) {
        field1618++;
        int var3;
        if (arg1.field1628 >= this.field1628) {
            var3 = this.field1628;
        } else {
            var3 = arg1.field1628;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field1602[var4] & 0xFF) > (this.field1602[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field1602[var4] & 0xFF) < (this.field1602[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0 != -11) {
            this.method603(-5);
        }
        if (arg1.field1628 > this.field1628) {
            return -1;
        } else if (arg1.field1628 < this.field1628) {
            return 1;
        } else {
            return 0;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method606(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
