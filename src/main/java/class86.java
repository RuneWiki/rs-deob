import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 implements class94 {

    @OriginalMember(owner = "client!jd", name = "ob", descriptor = "Z")
    private boolean field1714 = true;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "J")
    public static long field1665 = 0L;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Ljd;")
    public static class86 field1666 = class122.method868("cookieprefix", true);

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1703 = 99;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "[[[B")
    public static byte[][][] field1693 = new byte[4][104][104];

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "Ljd;")
    public static class86 field1689 = class122.method868(" )2> <col=ffffff>", true);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jd", name = "pb", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Lbj;")
    public static class151 field1673;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Leb;")
    public static class230 field1668;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jd", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field1716;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "[B")
    public byte[] field1670;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjd;)Ljd;")
    public final class86 method582(int arg0, class86 arg1) {
        field1656++;
        if (!this.field1714) {
            throw new IllegalArgumentException();
        }
        this.field1676 = 0;
        if (this.field1704 + arg1.field1704 > this.field1670.length) {
            int var3;
            for (var3 = 1; var3 < this.field1704 + arg1.field1704; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class250.method1687(this.field1670, 0, var4, 0, this.field1704);
            this.field1670 = var4;
        }
        class250.method1687(arg1.field1670, 0, this.field1670, this.field1704, arg1.field1704);
        this.field1704 += arg1.field1704;
        if (arg0 != -1) {
            field1689 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
    public final URL method583(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 >= -3) {
            return null;
        } else {
            field1705++;
            return new URL(arg0, new String(this.field1670, 0, this.field1704));
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Ljava/net/URL;")
    public final URL method584(byte arg0) throws MalformedURLException {
        if (arg0 < 44) {
            return null;
        } else {
            field1674++;
            return new URL(new String(this.field1670, 0, this.field1704));
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Ljd;")
    public final class86 method585(int arg0) {
        field1672++;
        class86 var2 = new class86();
        var2.field1704 = this.field1704;
        var2.field1670 = new byte[this.field1704];
        if (arg0 != 33) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1704; var3++) {
            byte var4 = this.field1670[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1670[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Ljd;")
    public final class86 method586(int arg0) {
        if (arg0 < 107) {
            field1689 = null;
        }
        field1678++;
        class86 var2 = class202.method1440(this.method622(-2), (byte) 58);
        return var2 == null ? class189.field3362 : var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII)I")
    public final int method587(boolean arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        field1659++;
        for (int var5 = arg2; var5 < this.field1704; var5++) {
            if (this.field1670[var5] == var4) {
                return var5;
            }
        }
        return arg0 ? -98 : -1;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1701++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Ljd;")
    public final class86 method588(int arg0) {
        int var2;
        for (var2 = 0; this.field1704 > var2 && (this.field1670[var2] >= 0 && this.field1670[var2] <= 32 || (this.field1670[var2] & 0xFF) == 160); var2++) {
        }
        field1654++;
        int var3;
        for (var3 = this.field1704; var2 < var3 && (this.field1670[var3 - 1] >= 0 && this.field1670[var3 - 1] <= 32 || (this.field1670[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (arg0 != -1) {
            return null;
        } else if (var2 == 0 && this.field1704 == var3) {
            return this;
        } else {
            class86 var4 = new class86();
            var4.field1704 = var3 - var2;
            var4.field1670 = new byte[var4.field1704];
            for (int var5 = 0; var5 < var4.field1704; var5++) {
                var4.field1670[var5] = this.field1670[var2 + var5];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Ljd;")
    public final class86 method589(int arg0) {
        field1695++;
        if (arg0 >= -68) {
            return null;
        }
        class86 var2 = new class86();
        var2.field1704 = this.field1704;
        var2.field1670 = new byte[this.field1704];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field1704; var4++) {
            byte var5 = this.field1670[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var2.field1670[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILjd;)Z")
    public final boolean method590(int arg0, class86 arg1) {
        field1711++;
        if (arg1.field1704 > this.field1704) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field1704; var3++) {
            byte var4 = arg1.field1670[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = this.field1670[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
    public final int method591(boolean arg0, FontMetrics arg1) {
        if (!arg0) {
            field1703 = -88;
        }
        field1698++;
        String var3;
        try {
            var3 = new String(this.field1670, 0, this.field1704, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1670, 0, this.field1704);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BBI)I")
    public final int method592(int arg0, int arg1, byte[] arg2, byte arg3, int arg4) {
        if (arg3 > -105) {
            return 67;
        } else {
            class250.method1687(this.field1670, arg0, arg2, arg1, arg4 - arg0);
            field1692++;
            return arg4 - arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lmc;")
    public static final class190 method593(int arg0, boolean arg1) {
        if (arg1) {
            field1666 = null;
        }
        field1712++;
        class190 var2 = (class190) class263.field4665.method701((byte) -125, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field284.method1084((byte) -120, 4, arg0);
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1307(86, arg0, new class200(var3));
        }
        class263.field4665.method696((long) arg0, var4, (byte) -96);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjd;Ljd;)Ljd;")
    public final class86 method594(int arg0, class86 arg1, class86 arg2) {
        field1700++;
        if (arg0 != 3883) {
            field1689 = null;
        }
        int var4 = this.field1704;
        int var5 = arg2.field1704 - arg1.field1704;
        int var6 = 0;
        while (true) {
            int var7 = this.method603((byte) 4, arg1, var6);
            if (var7 < 0) {
                int var8 = 0;
                class86 var9 = class106.method758(var4, 0);
                while (true) {
                    int var10 = this.method603((byte) 4, arg1, var8);
                    if (var10 < 0) {
                        while (var8 < this.field1704) {
                            var9.method620(this.field1670[var8++] & 0xFF, (byte) -41);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method620(this.field1670[var8++] & 0xFF, (byte) -41);
                    }
                    var9.method582(-1, arg2);
                    var8 += arg1.field1704;
                }
            }
            var6 = arg1.field1704 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lbj;I)V")
    public static final void method595(class151 arg0, int arg1) {
        if (arg1 == 25586) {
            class2.field20 = arg0;
            field1680++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)Ljd;")
    public final class86 method596(boolean arg0) {
        field1683++;
        if (!arg0) {
            method595((class151) null, 121);
        }
        long var2 = this.method626(arg0);
        synchronized (field1716 == null ? (field1716 = method634("jd")) : field1716) {
            if (class16.field461 == null) {
                class16.field461 = new class252(4096);
            } else {
                for (class232 var5 = (class232) class16.field461.method1698(var2, (byte) -113); var5 != null; var5 = (class232) class16.field461.method1708((byte) -27)) {
                    if (this.method625((byte) 74, var5.field4205)) {
                        return var5.field4205;
                    }
                }
            }
            class232 var7 = new class232();
            this.field1714 = false;
            var7.field4205 = this;
            class16.field461.method1699(-28407, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;I)Z")
    public final boolean method597(class86 arg0, int arg1) {
        field1687++;
        if (arg0.field1704 > this.field1704) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1704; var3++) {
            if (this.field1670[var3] != arg0.field1670[var3]) {
                return false;
            }
        }
        int var4 = -117 / ((-arg1 - 63) / 60);
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)I")
    public final int method598(int arg0) {
        field1702++;
        if (arg0 != 26) {
            field1703 = -43;
        }
        return this.method600(10, arg0 ^ 0x21);
    }

    @OriginalMember(owner = "client!jd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1710++;
        if (!arg0 instanceof class86) {
            throw new IllegalArgumentException();
        }
        return this.method625((byte) -116, (class86) arg0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Z")
    public final boolean method599(byte arg0) {
        field1696++;
        if (arg0 != -64) {
            field1664 = -52;
        }
        return this.method609(127, 10);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public final int method600(int arg0, int arg1) {
        field1669++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != 59) {
            field1689 = null;
        }
        for (int var6 = 0; var6 < this.field1704; var6++) {
            int var7 = this.field1670[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if ((var8 / arg0) != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var8;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;B)Z")
    public final boolean method601(class86 arg0, byte arg1) {
        field1655++;
        if (this.field1704 < arg0.field1704) {
            return false;
        }
        int var3 = this.field1704 - arg0.field1704;
        if (arg1 != -109) {
            return true;
        }
        for (int var4 = 0; var4 < arg0.field1704; var4++) {
            if (this.field1670[var3 + var4] != arg0.field1670[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/applet/Applet;)V")
    public final void method602(byte arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field1670, 0, this.field1704);
        if (arg0 != -69) {
            this.field1670 = null;
        }
        field1675++;
        class182.method1265(3418, arg1, var3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjd;I)I")
    public final int method603(byte arg0, class86 arg1, int arg2) {
        field1684++;
        int[] var4 = new int[arg1.field1704];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field1704];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field1704;
        }
        if (arg0 != 4) {
            this.method606(-60, 81);
        }
        for (int var8 = 1; var8 <= arg1.field1704; var8++) {
            var4[var8 - 1] = (arg1.field1704 << 1) - var8;
            var5[class1.method5(arg1.field1670[var8 - 1], 255)] = arg1.field1704 - var8;
        }
        int var9 = arg1.field1704 + 1;
        for (int var10 = arg1.field1704; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field1704 && arg1.field1670[var10 - 1] != arg1.field1670[var9 - 1]) {
                if (var4[var9 - 1] >= arg1.field1704 - var10) {
                    var4[var9 - 1] = arg1.field1704 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field1704 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field1670[var15 - 1] != arg1.field1670[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (arg1.field1704 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg1.field1704 + var11 - var18) {
                    var4[var18 - 1] = arg1.field1704 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg1.field1704 + arg2 - 1; var16 < this.field1704; var16 += Math.max(var5[this.field1670[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field1704 - 1; var17 >= 0 && this.field1670[var16] == arg1.field1670[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;Z)I")
    public final int method604(class86 arg0, boolean arg1) {
        if (!arg1) {
            this.method612((byte) -108);
        }
        field1651++;
        return this.method603((byte) 4, arg0, 0);
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)I")
    public final int method605(int arg0) {
        field1707++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field1704; var3++) {
            var2 = (var2 << 5) + (this.field1670[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[Ljd;")
    public final class86[] method606(int arg0, int arg1) {
        field1715++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1704; var4++) {
            if (this.field1670[var4] == arg1) {
                var3++;
            }
        }
        class86[] var5 = new class86[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        if (arg0 != -3762) {
            return null;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1670[var6 + var9] != arg1; var9++) {
            }
            var5[var7++] = this.method610(var6, var6 + var9, (byte) -81);
            var6 += var9 + 1;
        }
        var5[var3] = this.method610(var6, this.field1704, (byte) -81);
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)I")
    public final int method607(boolean arg0, int arg1) {
        byte var3 = (byte) arg1;
        field1658++;
        if (!arg0) {
            field1666 = null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1704; var5++) {
            if (this.field1670[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Ljd;")
    public final class86 method608(byte arg0) {
        class86 var2 = new class86();
        field1653++;
        var2.field1704 = this.field1704;
        var2.field1670 = new byte[this.field1704];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1704; var4++) {
            byte var5 = this.field1670[var4];
            if (var5 == 95) {
                var2.field1670[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1670[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field1670[var4] = var5;
            }
        }
        if (arg0 <= 3) {
            field1666 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Z")
    private final boolean method609(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1671++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 24 / ((77 - arg0) / 40);
        for (int var7 = 0; var7 < this.field1704; var7++) {
            int var8 = this.field1670[var7] & 0xFF;
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
            if (var8 >= arg1) {
                return false;
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var5 + var8;
            if ((var9 / arg1) != var5) {
                return false;
            }
            var4 = true;
            var5 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)Ljd;")
    public final class86 method610(int arg0, int arg1, byte arg2) {
        field1667++;
        class86 var4 = new class86();
        var4.field1704 = arg1 - arg0;
        var4.field1670 = new byte[arg1 - arg0];
        if (arg2 != -81) {
            this.method627(33, 82);
        }
        class250.method1687(this.field1670, arg0, var4.field1670, 0, var4.field1704);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)I")
    public final int method611(int arg0, int arg1) {
        field1648++;
        return arg0 == 48 ? this.field1670[arg1] & 0xFF : -103;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
    public final int method612(byte arg0) {
        if (arg0 <= 50) {
            return 23;
        } else {
            field1690++;
            return this.field1704;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
    public final Object method613(Applet arg0, int arg1) throws Throwable {
        int var3 = -12 / ((12 - arg1) / 44);
        field1691++;
        String var4 = new String(this.field1670, 0, this.field1704);
        Object var5 = class182.method1266(-6863, var4, arg0, (Object[]) null);
        if (var5 instanceof String) {
            byte[] var6 = ((String) var5).getBytes();
            var5 = class102.method733((byte) 6, var6.length, 0, var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public final void method614(int arg0) {
        String var2;
        try {
            var2 = new String(this.field1670, 0, this.field1704, "ISO-8859-1");
            if (arg0 < 16) {
                this.toString();
            }
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field1670, 0, this.field1704);
        }
        field1657++;
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;IIB)Ljd;")
    public final class86 method615(class86 arg0, int arg1, int arg2, byte arg3) {
        field1699++;
        if (!this.field1714) {
            throw new IllegalArgumentException();
        } else if (arg1 >= 0 && arg2 >= arg1 && arg2 <= arg0.field1704) {
            this.field1676 = 0;
            if ((this.field1704 + arg2 - arg1) > this.field1670.length) {
                int var5;
                for (var5 = 1; var5 < (this.field1704 + arg0.field1704); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class250.method1687(this.field1670, 0, var6, 0, this.field1704);
                this.field1670 = var6;
            }
            class250.method1687(arg0.field1670, arg1, this.field1670, this.field1704, arg2 - arg1);
            if (arg3 != -50) {
                this.field1714 = false;
            }
            this.field1704 += arg2 - arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)V")
    public static void method616(int arg0) {
        field1689 = null;
        field1693 = null;
        field1668 = null;
        field1673 = null;
        if (arg0 <= 48) {
            method621(57, (int[]) null, -51, (byte) -101, (int[]) null);
        }
        field1666 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public final void method617(int arg0, byte arg1) {
        this.field1676 = 0;
        field1681++;
        if (!this.field1714) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field1670.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class250.method1687(this.field1670, 0, var4, 0, this.field1704);
                this.field1670 = var4;
            }
            if (arg1 != 97) {
                this.field1714 = false;
            }
            for (int var5 = this.field1704; var5 < arg0; var5++) {
                this.field1670[var5] = 32;
            }
            this.field1704 = arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljd;Z)I")
    public final int method618(class86 arg0, boolean arg1) {
        int var3;
        if (arg0.field1704 < this.field1704) {
            var3 = arg0.field1704;
        } else {
            var3 = this.field1704;
        }
        field1650++;
        if (arg1) {
            field1689 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field1670[var4] & 0xFF) < (arg0.field1670[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field1670[var4] & 0xFF) < (this.field1670[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field1704 > this.field1704) {
            return -1;
        } else if (arg0.field1704 < this.field1704) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)[B")
    public final byte[] method619(byte arg0) {
        field1663++;
        byte[] var2 = new byte[this.field1704];
        class250.method1687(this.field1670, 0, var2, 0, this.field1704);
        if (arg0 != 65) {
            field1665 = -2L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)Ljd;")
    public final class86 method620(int arg0, byte arg1) {
        field1662++;
        if (arg1 != -41) {
            return null;
        } else if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1714) {
            this.field1676 = 0;
            if (this.field1670.length == this.field1704) {
                int var3;
                for (var3 = 1; var3 <= this.field1704; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class250.method1687(this.field1670, 0, var4, 0, this.field1704);
                this.field1670 = var4;
            }
            this.field1670[this.field1704++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[IIB[I)V")
    public static final void method621(int arg0, int[] arg1, int arg2, byte arg3, int[] arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg4[var5];
            int var7 = arg0;
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var6;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (var6 + (var9 & 0x1) < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg4[arg2] = arg4[var7];
            arg4[var7] = var6;
            arg1[arg2] = arg1[var7];
            arg1[var7] = var8;
            method621(arg0, arg1, var7 - 1, (byte) -91, arg4);
            method621(var7 + 1, arg1, arg2, (byte) -112, arg4);
        }
        if (arg3 >= -56) {
            method595((class151) null, -91);
        }
        field1685++;
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)J")
    public final long method622(int arg0) {
        if (arg0 != -2) {
            field1693 = null;
        }
        field1661++;
        long var2 = 0L;
        for (int var4 = 0; this.field1704 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1670[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 - 21);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1649++;
        return this.method605(0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljd;I)I")
    public final int method623(class86 arg0, int arg1) {
        field1688++;
        int var3 = 0;
        int var4 = this.field1704;
        int var5 = 0;
        int var6 = arg0.field1704;
        int var7 = this.field1704;
        int var8 = arg0.field1704;
        int var9 = 0;
        int var10 = 0;
        if (arg1 != -14154) {
            field1666 = null;
        }
        while (var4 != 0 && var8 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field1670[var9] & 0xFF;
                var9++;
            }
            if (class202.method1442(223, var3)) {
                var7++;
            } else {
                var4--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg0.field1670[var10] & 0xFF;
                var10++;
            }
            if (class202.method1442(223, var5)) {
                var6++;
            } else {
                var8--;
            }
            if (class144.field2729[var5] > class144.field2729[var3]) {
                return -1;
            }
            if (class144.field2729[var5] < class144.field2729[var3]) {
                return 1;
            }
        }
        if (var7 < var6) {
            return -1;
        } else if (var6 < var7) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method624(int arg0, byte arg1, int arg2, Graphics arg3) {
        field1686++;
        String var5;
        try {
            var5 = new String(this.field1670, 0, this.field1704, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1670, 0, this.field1704);
        }
        if (arg1 > -9) {
            this.field1676 = -95;
        }
        arg3.drawString(var5, arg2, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjd;)Z")
    public final boolean method625(byte arg0, class86 arg1) {
        field1682++;
        if (arg1 == null) {
            return false;
        } else if (this.field1704 == arg1.field1704) {
            if (!this.field1714 || !arg1.field1714) {
                if (this.field1676 == 0) {
                    this.field1676 = this.method605(0);
                    if (this.field1676 == 0) {
                        this.field1676 = 1;
                    }
                }
                if (arg1.field1676 == 0) {
                    arg1.field1676 = arg1.method605(0);
                    if (arg1.field1676 == 0) {
                        arg1.field1676 = 1;
                    }
                }
                if (this.field1676 != arg1.field1676) {
                    return false;
                }
            }
            int var3 = 85 / ((-arg0 - 66) / 41);
            for (int var4 = 0; var4 < this.field1704; var4++) {
                if (this.field1670[var4] != arg1.field1670[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)J")
    public final long method626(boolean arg0) {
        long var2 = 0L;
        field1652++;
        if (arg0) {
            for (int var4 = 0; var4 < this.field1704; var4++) {
                var2 = (var2 << 5) + (long) (this.field1670[var4] & 0xFF) - var2;
            }
            return var2;
        } else {
            return 38L;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)Ljd;")
    public final class86 method627(int arg0, int arg1) {
        field1706++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class86 var3 = new class86();
        var3.field1670 = new byte[this.field1704 + arg0];
        var3.field1704 = this.field1704 + 1;
        class250.method1687(this.field1670, 0, var3.field1670, 0, this.field1704);
        var3.field1670[this.field1704] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)Ljd;")
    public final class86 method628(int arg0) {
        field1697++;
        if (!this.field1714) {
            throw new IllegalArgumentException();
        }
        this.field1676 = 0;
        if (this.field1670.length != this.field1704) {
            byte[] var2 = new byte[this.field1704];
            class250.method1687(this.field1670, 0, var2, 0, this.field1704);
            this.field1670 = var2;
        }
        if (arg0 != -2836) {
            field1666 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(II)I")
    public static final int method629(int arg0, int arg1) {
        field1713++;
        int var2 = -103 % ((arg0 + 87) / 32);
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljava/applet/Applet;I)Ljd;")
    public final class86 method630(Applet arg0, int arg1) {
        field1708++;
        String var3 = new String(this.field1670, arg1, this.field1704);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class210.method1492(0, var4);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(ILjd;)Z")
    public final boolean method631(int arg0, class86 arg1) {
        field1677++;
        if (arg1 == null) {
            return false;
        } else if (this.field1704 == arg1.field1704) {
            for (int var3 = 0; var3 < this.field1704; var3++) {
                byte var4 = this.field1670[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1670[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 12508) {
                field1703 = -107;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "(I)Ljd;")
    public final class86 method632(int arg0) {
        field1660++;
        class86 var2 = new class86();
        var2.field1704 = this.field1704;
        if (arg0 != 2777) {
            return null;
        }
        var2.field1670 = new byte[var2.field1704];
        for (int var3 = 0; var3 < this.field1704; var3++) {
            var2.field1670[this.field1704 - var3 - 1] = this.field1670[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(IB)Ljd;")
    public final class86 method633(int arg0, byte arg1) {
        field1679++;
        if (arg1 != 61) {
            this.method604((class86) null, true);
        }
        return this.method610(arg0, this.field1704, (byte) -81);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method634(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
