import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class124 extends class162 {

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Ljava/lang/String;")
    private String field1910 = "null";

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "Z")
    public static boolean field1894 = false;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "C")
    public char field1898;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "C")
    public char field1907;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lfd;")
    private class130 field1888;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lfd;")
    public class130 field1897;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILma;)V")
    private final void method813(int arg0, int arg1, class202 arg2) {
        field1895++;
        if (arg1 == 1) {
            this.field1907 = class6.method34(-106, arg2.method1457((byte) -126));
        } else if (arg1 == 2) {
            this.field1898 = class6.method34(-116, arg2.method1457((byte) -118));
        } else if (arg1 == 3) {
            this.field1910 = arg2.method1403(-123);
        } else if (arg1 == 4) {
            this.field1911 = arg2.method1440(20404);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1419(117);
            this.field1897 = new class130(class257.method1792(var4, (byte) 0));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1440(20404);
                class134 var7;
                if (arg1 == 5) {
                    var7 = new class128(arg2.method1403(-123));
                } else {
                    var7 = new class221(arg2.method1440(20404));
                }
                this.field1897.method857(false, var7, (long) var6);
            }
        }
        int var8 = -11 % ((-arg0 - 2) / 55);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BZILjava/awt/Color;Ljava/lang/String;)V")
    public static final void method814(byte arg0, boolean arg1, int arg2, Color arg3, String arg4) {
        try {
            Graphics var5 = class113.field1701.getGraphics();
            if (class147.field2307 == null) {
                class147.field2307 = new Font("Helvetica", 1, 13);
                class106.field1649 = class113.field1701.getFontMetrics(class147.field2307);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class169.field2644, class79.field1254);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 != 94) {
                field1902 = 91;
            }
            try {
                if (class68.field986 == null) {
                    class68.field986 = class113.field1701.createImage(304, 34);
                }
                Graphics var6 = class68.field986.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class147.field2307);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class106.field1649.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class68.field986, class169.field2644 / 2 - 152, class79.field1254 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class169.field2644 / 2 - 152;
                int var8 = class79.field1254 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 + (arg2 * 3) + 2, var8 + 2, 300 - (arg2 * 3), 30);
                var5.setFont(class147.field2307);
                var5.setColor(Color.white);
                var5.drawString(arg4, var7 + (304 - class106.field1649.stringWidth(arg4)) / 2, var8 + 22);
            }
            if (class37.field487 != null) {
                var5.setFont(class147.field2307);
                var5.setColor(Color.white);
                var5.drawString(class37.field487, class169.field2644 / 2 - class106.field1649.stringWidth(class37.field487) / 2, class79.field1254 / 2 + -26);
            }
        } catch (Exception var10) {
            class113.field1701.repaint();
        }
        field1905++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method815(boolean arg0, String arg1) {
        field1899++;
        if (this.field1897 == null) {
            return false;
        }
        if (this.field1888 == null) {
            this.method821(112);
        }
        if (!arg0) {
            this.field1910 = null;
        }
        for (class86 var3 = (class86) this.field1888.method872((byte) -108, class313.method2119(arg1, (byte) -14)); var3 != null; var3 = (class86) this.field1888.method864(-1)) {
            if (var3.field1351.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    private final void method816(int arg0) {
        field1896++;
        this.field1888 = new class130(this.field1897.method859(80));
        for (class221 var2 = (class221) this.field1897.method871(-36); var2 != null; var2 = (class221) this.field1897.method869(-14210)) {
            class221 var3 = new class221((int) var2.field2102);
            this.field1888.method857(false, var3, (long) var2.field3542);
        }
        if (arg0 != 33) {
            this.method825(16, 25);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method817(int arg0, int arg1) {
        field1901++;
        if (arg1 != -20599) {
            method814((byte) -94, true, 38, (Color) null, (String) null);
        }
        class36 var2 = class161.method1067(14, arg0, (byte) 81);
        var2.method220(arg1 + 20723);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lma;I)V")
    public final void method818(class202 arg0, int arg1) {
        field1908++;
        if (arg1 != -14625) {
            return;
        }
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method813(108, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V")
    public static final void method819(int arg0, int arg1, int arg2) {
        field1889++;
        if (arg1 != 30) {
            method819(-20, -29, 51);
        }
        class36 var3 = class161.method1067(1, arg2, (byte) 81);
        var3.method219(arg1 ^ 0xFFFFFFB2);
        var3.field465 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public static final void method820(int arg0) {
        if (arg0 != -2) {
            field1909 = 47;
        }
        class258.field4247.method144(0);
        field1900++;
    }

    @OriginalMember(owner = "client!m", name = "i", descriptor = "(I)V")
    private final void method821(int arg0) {
        this.field1888 = new class130(this.field1897.method859(80));
        field1887++;
        if (arg0 <= 87) {
            field1894 = false;
        }
        for (class128 var2 = (class128) this.field1897.method871(-36); var2 != null; var2 = (class128) this.field1897.method869(-14210)) {
            class86 var3 = new class86(var2.field1979, (int) var2.field2102);
            this.field1888.method857(false, var3, class313.method2119(var2.field1979, (byte) -14));
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    public static final int method822(int arg0, int arg1) {
        if (arg0 <= 27) {
            field1894 = true;
        }
        field1890++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfa;I)Z")
    public static final boolean method823(int arg0, class273 arg1, int arg2) {
        if (arg0 != 2) {
            field1892 = -63;
        }
        field1893++;
        byte[] var3 = arg1.method1884(arg2, (byte) -121);
        if (var3 == null) {
            return false;
        } else {
            class313.method2122(1, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)I")
    public final int method824(int arg0, int arg1) {
        field1906++;
        if (this.field1897 == null) {
            return this.field1911;
        } else if (arg0 <= 79) {
            return 14;
        } else {
            class221 var3 = (class221) this.field1897.method872((byte) -88, (long) arg1);
            return var3 == null ? this.field1911 : var3.field3542;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(II)Z")
    public final boolean method825(int arg0, int arg1) {
        field1891++;
        if (this.field1897 == null) {
            return false;
        }
        if (this.field1888 == null) {
            this.method816(33);
        }
        class221 var3 = (class221) this.field1888.method872((byte) -105, (long) arg1);
        if (arg0 != 19697) {
            field1892 = -72;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!m", name = "j", descriptor = "(I)V")
    public static final void method826(int arg0) {
        class44.field608 = null;
        field1912++;
        class180.field2792 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method827(int arg0, byte arg1) {
        if (arg1 != 40) {
            this.method821(105);
        }
        field1904++;
        if (this.field1897 == null) {
            return this.field1910;
        } else {
            class128 var3 = (class128) this.field1897.method872((byte) -124, (long) arg0);
            return var3 == null ? this.field1910 : var3.field1979;
        }
    }
}
