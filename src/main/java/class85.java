import java.applet.Applet;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 implements class120 {

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Z")
    private boolean field1554 = true;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1565 = 127;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jd", name = "ob", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!jd", name = "pb", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!jd", name = "qb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!jd", name = "rb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lpa;")
    private static class204 field1560;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jd", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field1607;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[B")
    public byte[] field1548;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[I")
    public static int[] field1567;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Ldi;")
    public static final class171 method579(int arg0, int arg1, int arg2) {
        field1550++;
        class171 var3 = (class171) class86.field1609.method1398(arg1 + 1, (long) arg2 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class171(arg0, arg2);
            class86.field1609.method1393(var3, var3.field4377, 817);
        }
        return arg1 == 0 ? var3 : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method580(boolean arg0, Applet arg1) throws Throwable {
        field1574++;
        String var3 = new String(this.field1548, 0, this.field1538);
        if (!arg0) {
            field1565 = 83;
        }
        Object var4 = class143.method939(arg1, -117, (Object[]) null, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class116.method817(var5.length, var5, (byte) -39, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjd;)I")
    public final int method581(byte arg0, class85 arg1) {
        field1546++;
        int var3 = 0;
        int var4 = this.field1538;
        int var5 = 0;
        int var6 = arg1.field1538;
        int var7 = this.field1538;
        int var8 = arg1.field1538;
        if (arg0 != 20) {
            field1567 = null;
        }
        int var9 = 0;
        int var10 = 0;
        while (var4 != 0 && var6 != 0) {
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = this.field1548[var9] & 0xFF;
                var9++;
            }
            if (class110.method755(var5, 123)) {
                var7++;
            } else {
                var4--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg1.field1548[var10] & 0xFF;
                var10++;
            }
            if (class110.method755(var3, 36)) {
                var8++;
            } else {
                var6--;
            }
            if (class82.field1495[var3] > class82.field1495[var5]) {
                return -1;
            }
            if (class82.field1495[var3] < class82.field1495[var5]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var8 < var7) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;I)Z")
    public final boolean method582(class85 arg0, int arg1) {
        field1563++;
        if (arg1 > -40) {
            this.method588(-34);
        }
        if (arg0 == null) {
            return false;
        } else if (this.field1538 == arg0.field1538) {
            for (int var3 = 0; var3 < this.field1538; var3++) {
                byte var4 = arg0.field1548[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field1548[var3];
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

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1557++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
    public final int method583(int arg0) {
        int var2 = 127 / ((8 - arg0) / 49);
        field1573++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1538; var4++) {
            var3 = (this.field1548[var4] & 0xFF) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public final void method584(boolean arg0) {
        field1556++;
        String var2;
        try {
            var2 = new String(this.field1548, 0, this.field1538, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field1548, 0, this.field1538);
        }
        if (!arg0) {
            this.field1548 = null;
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;BLjd;)Ljd;")
    public final class85 method585(class85 arg0, byte arg1, class85 arg2) {
        field1596++;
        int var4 = this.field1538;
        int var5 = arg2.field1538 - arg0.field1538;
        int var6 = 0;
        while (true) {
            int var7 = this.method634(var6, arg0, (byte) -109);
            if (var7 < 0) {
                int var8 = 0;
                class85 var9 = class58.method392(var4, (byte) -101);
                while (true) {
                    int var10 = this.method634(var8, arg0, (byte) 29);
                    if (var10 < 0) {
                        while (var8 < this.field1538) {
                            var9.method594(false, this.field1548[var8++] & 0xFF);
                        }
                        int var11 = 7 / ((-arg1 - 72) / 34);
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method594(false, this.field1548[var8++] & 0xFF);
                    }
                    var9.method638(arg2, 0);
                    var8 += arg0.field1538;
                }
            }
            var6 = arg0.field1538 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)I")
    public final int method586(boolean arg0) {
        if (!arg0) {
            method591(-41, (class68) null, -90);
        }
        field1577++;
        return this.field1538;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Ljd;")
    public final class85 method587(byte arg0) {
        field1606++;
        class85 var2 = new class85();
        if (arg0 >= -50) {
            return null;
        }
        var2.field1538 = this.field1538;
        var2.field1548 = new byte[this.field1538];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1538; var4++) {
            byte var5 = this.field1548[var4];
            if (var5 == 95) {
                var2.field1548[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1548[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field1548[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)[B")
    public final byte[] method588(int arg0) {
        field1595++;
        byte[] var2 = new byte[this.field1538];
        if (arg0 != 17473) {
            field1567 = null;
        }
        class248.method1724(this.field1548, 0, var2, 0, this.field1538);
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/applet/Applet;Z)V")
    public final void method589(Applet arg0, boolean arg1) throws Throwable {
        field1549++;
        if (arg1) {
            String var3 = new String(this.field1548, 0, this.field1538);
            class143.method940(arg0, 34, var3);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)I")
    public final int method590(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field1547++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = -122 / ((arg1 + 67) / 38);
        for (int var7 = 0; var7 < this.field1538; var7++) {
            int var8 = this.field1548[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
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
                throw new NumberFormatException();
            }
            if (arg0 <= var8) {
                throw new NumberFormatException();
            }
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg0 * var5 + var8;
            if (var9 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var3 = true;
            var5 = var9;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILge;I)Lfg;")
    public static final class12 method591(int arg0, class68 arg1, int arg2) {
        field1544++;
        if (class218.method1487(arg1, arg2, 508630)) {
            if (arg0 != 0) {
                method579(26, 14, 14);
            }
            return class30.method205(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/applet/Applet;)Ljd;")
    public final class85 method592(int arg0, Applet arg1) {
        String var3 = new String(this.field1548, 0, this.field1538);
        String var4 = arg1.getParameter(var3);
        field1539++;
        if (arg0 != 29698) {
            this.method612((byte) -125, (class85) null);
        }
        return var4 == null ? null : class83.method574(var4, -108);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)V")
    public static final void method593(boolean arg0) {
        field1555++;
        int var1 = 0;
        int[] var2 = new int[class116.field2081];
        for (int var3 = 0; var3 < class116.field2081; var3++) {
            class61 var5 = class32.method221(11649, var3);
            if (var5.field1135 >= 0 || var5.field1103 >= 0) {
                var2[var1++] = var3;
            }
        }
        class77.field1434 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class77.field1434[var4] = var2[var4];
        }
        if (arg0) {
            field1593 = -117;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)Ljd;")
    public final class85 method594(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        }
        field1575++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1554) {
            this.field1543 = 0;
            if (this.field1548.length == this.field1538) {
                int var3;
                for (var3 = 1; var3 <= this.field1538; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class248.method1724(this.field1548, 0, var4, 0, this.field1538);
                this.field1548 = var4;
            }
            this.field1548[this.field1538++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method595(byte arg0) {
        if (arg0 != -72) {
            method595((byte) 38);
        }
        class15.field217.method1262(17244);
        class68.field1268.method1262(arg0 ^ 0xFFFFBCE4);
        field1576++;
        class74.field1381.method1262(17244);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lck;Z)V")
    public static final void method596(class208 arg0, boolean arg1) {
        class18.field260.method116((byte) -121, arg0);
        while (true) {
            class208 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class208[][] var7;
            class208 var66;
            do {
                class208 var65;
                do {
                    class208 var64;
                    do {
                        class208 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class208) class18.field260.method115((byte) 121);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3649);
                                            var3 = var2.field3654;
                                            var4 = var2.field3659;
                                            var5 = var2.field3647;
                                            var6 = var2.field3658;
                                            var7 = class99.field1780[var5];
                                            if (!var2.field3645) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class208 var8 = class99.field1780[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3649) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class19.field275 && var3 > class54.field952) {
                                                    class208 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3649 && (var9.field3645 || (var2.field3638 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class19.field275 && var3 < class169.field2909 - 1) {
                                                    class208 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3649 && (var10.field3645 || (var2.field3638 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class152.field2602 && var4 > class114.field2048) {
                                                    class208 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3649 && (var11.field3645 || (var2.field3638 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class152.field2602 && var4 < class108.field1914 - 1) {
                                                    class208 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3649 && (var12.field3645 || (var2.field3638 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3645 = false;
                                            if (var2.field3651 != null) {
                                                class208 var13 = var2.field3651;
                                                if (var13.field3640 == null) {
                                                    if (var13.field3644 != null) {
                                                        if (class141.method925(0, var3, var4)) {
                                                            class232.method1553(var13.field3644, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, true);
                                                        } else {
                                                            class232.method1553(var13.field3644, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class141.method925(0, var3, var4)) {
                                                    class196.method1340(var13.field3640, 0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, true);
                                                } else {
                                                    class196.method1340(var13.field3640, 0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, false);
                                                }
                                                class233 var14 = var13.field3656;
                                                if (var14 != null) {
                                                    var14.field4040.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var14.field4039 - class221.field3877, var14.field4036 - class34.field528, var14.field4034 - class237.field4097, var14.field4028);
                                                }
                                                for (int var15 = 0; var15 < var13.field3646; var15++) {
                                                    class213 var16 = var13.field3650[var15];
                                                    if (var16 != null) {
                                                        var16.field3724.method1(var16.field3735, class190.field3268, class214.field3752, class171.field2962, class3.field29, var16.field3721 - class221.field3877, var16.field3739 - class34.field528, var16.field3736 - class237.field4097, var16.field3728);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3640 == null) {
                                                if (var2.field3644 != null) {
                                                    if (class141.method925(var6, var3, var4)) {
                                                        class232.method1553(var2.field3644, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class232.method1553(var2.field3644, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, false);
                                                    }
                                                }
                                            } else if (class141.method925(var6, var3, var4)) {
                                                class196.method1340(var2.field3640, var6, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3640.field3712 != 12345678 || class28.field436 && var5 <= class175.field3011) {
                                                    class196.method1340(var2.field3640, var6, class190.field3268, class214.field3752, class171.field2962, class3.field29, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class93 var18 = var2.field3653;
                                                if (var18 != null && (var18.field1708 & 0x80000000L) != 0L) {
                                                    var18.field1700.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var18.field1701 - class221.field3877, var18.field1698 - class34.field528, var18.field1704 - class237.field4097, var18.field1708);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class233 var21 = var2.field3656;
                                            class267 var22 = var2.field3641;
                                            if (var21 != null || var22 != null) {
                                                if (class19.field275 == var3) {
                                                    var19++;
                                                } else if (class19.field275 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class152.field2602 == var4) {
                                                    var19 += 3;
                                                } else if (class152.field2602 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class39.field599[var19];
                                                var2.field3635 = class253.field4361[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4029 & class117.field2091[var19]) == 0) {
                                                    var2.field3660 = 0;
                                                } else if (var21.field4029 == 16) {
                                                    var2.field3660 = 3;
                                                    var2.field3642 = class112.field1956[var19];
                                                    var2.field3637 = 3 - var2.field3642;
                                                } else if (var21.field4029 == 32) {
                                                    var2.field3660 = 6;
                                                    var2.field3642 = class64.field1184[var19];
                                                    var2.field3637 = 6 - var2.field3642;
                                                } else if (var21.field4029 == 64) {
                                                    var2.field3660 = 12;
                                                    var2.field3642 = class54.field962[var19];
                                                    var2.field3637 = 12 - var2.field3642;
                                                } else {
                                                    var2.field3660 = 9;
                                                    var2.field3642 = class219.field3857[var19];
                                                    var2.field3637 = 9 - var2.field3642;
                                                }
                                                if ((var21.field4029 & var20) != 0 && !class156.method1026(var6, var3, var4, var21.field4029)) {
                                                    var21.field4040.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var21.field4039 - class221.field3877, var21.field4036 - class34.field528, var21.field4034 - class237.field4097, var21.field4028);
                                                }
                                                if ((var21.field4030 & var20) != 0 && !class156.method1026(var6, var3, var4, var21.field4030)) {
                                                    var21.field4025.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var21.field4039 - class221.field3877, var21.field4036 - class34.field528, var21.field4034 - class237.field4097, var21.field4028);
                                                }
                                            }
                                            if (var22 != null && !class215.method1475(var6, var3, var4, var22.field4759.method6())) {
                                                if ((var22.field4755 & var20) != 0) {
                                                    var22.field4759.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var22.field4752 + var22.field4756 - class221.field3877, var22.field4758 - class34.field528, var22.field4746 + var22.field4750 - class237.field4097, var22.field4751);
                                                } else if (var22.field4755 == 256) {
                                                    int var23 = var22.field4752 - class221.field3877;
                                                    int var24 = var22.field4758 - class34.field528;
                                                    int var25 = var22.field4746 - class237.field4097;
                                                    int var26 = var22.field4754;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4759.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var22.field4756 + var23, var24, var22.field4750 + var25, var22.field4751);
                                                    } else if (var22.field4753 != null) {
                                                        var22.field4753.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var23, var24, var25, var22.field4751);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class93 var29 = var2.field3653;
                                                if (var29 != null && (var29.field1708 & 0x80000000L) == 0L) {
                                                    var29.field1700.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var29.field1701 - class221.field3877, var29.field1698 - class34.field528, var29.field1704 - class237.field4097, var29.field1708);
                                                }
                                                class167 var30 = var2.field3648;
                                                if (var30 != null && var30.field2874 == 0) {
                                                    if (var30.field2880 != null) {
                                                        var30.field2880.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var30.field2872 - class221.field3877, var30.field2870 - class34.field528, var30.field2881 - class237.field4097, var30.field2883);
                                                    }
                                                    if (var30.field2879 != null) {
                                                        var30.field2879.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var30.field2872 - class221.field3877, var30.field2870 - class34.field528, var30.field2881 - class237.field4097, var30.field2883);
                                                    }
                                                    if (var30.field2873 != null) {
                                                        var30.field2873.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var30.field2872 - class221.field3877, var30.field2870 - class34.field528, var30.field2881 - class237.field4097, var30.field2883);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3638;
                                            if (var31 != 0) {
                                                if (var3 < class19.field275 && (var31 & 0x4) != 0) {
                                                    class208 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3649) {
                                                        class18.field260.method116((byte) -121, var32);
                                                    }
                                                }
                                                if (var4 < class152.field2602 && (var31 & 0x2) != 0) {
                                                    class208 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3649) {
                                                        class18.field260.method116((byte) -121, var33);
                                                    }
                                                }
                                                if (var3 > class19.field275 && (var31 & 0x1) != 0) {
                                                    class208 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3649) {
                                                        class18.field260.method116((byte) -121, var34);
                                                    }
                                                }
                                                if (var4 > class152.field2602 && (var31 & 0x8) != 0) {
                                                    class208 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3649) {
                                                        class18.field260.method116((byte) -121, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3660 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3646; var37++) {
                                                if (class134.field2343 != var2.field3650[var37].field3723 && (var2.field3636[var37] & var2.field3660) == var2.field3642) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class233 var38 = var2.field3656;
                                                if (!class156.method1026(var6, var3, var4, var38.field4029)) {
                                                    var38.field4040.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var38.field4039 - class221.field3877, var38.field4036 - class34.field528, var38.field4034 - class237.field4097, var38.field4028);
                                                }
                                                var2.field3660 = 0;
                                            }
                                        }
                                        if (!var2.field3643) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3646;
                                            var2.field3643 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class213 var42 = var2.field3650[var41];
                                                if (class134.field2343 != var42.field3723) {
                                                    for (int var43 = var42.field3731; var43 <= var42.field3737; var43++) {
                                                        for (int var44 = var42.field3729; var44 <= var42.field3722; var44++) {
                                                            class208 var45 = var7[var43][var44];
                                                            if (var45.field3645) {
                                                                var2.field3643 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3660 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3731) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field3737) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3729) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3722) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3660) == var2.field3637) {
                                                                    var2.field3643 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class151.field2553[var40++] = var42;
                                                    int var47 = class19.field275 - var42.field3731;
                                                    int var48 = var42.field3737 - class19.field275;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class152.field2602 - var42.field3729;
                                                    int var50 = var42.field3722 - class152.field2602;
                                                    if (var50 > var49) {
                                                        var42.field3725 = var47 + var50;
                                                    } else {
                                                        var42.field3725 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class213 var54 = class151.field2553[var53];
                                                    if (class134.field2343 != var54.field3723) {
                                                        if (var54.field3725 > var51) {
                                                            var51 = var54.field3725;
                                                            var52 = var53;
                                                        } else if (var54.field3725 == var51) {
                                                            int var55 = var54.field3721 - class221.field3877;
                                                            int var56 = var54.field3736 - class237.field4097;
                                                            int var57 = class151.field2553[var52].field3721 - class221.field3877;
                                                            int var58 = class151.field2553[var52].field3736 - class237.field4097;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class213 var59 = class151.field2553[var52];
                                                var59.field3723 = class134.field2343;
                                                if (!class175.method1181(var6, var59.field3731, var59.field3737, var59.field3729, var59.field3722, var59.field3724.method6())) {
                                                    var59.field3724.method1(var59.field3735, class190.field3268, class214.field3752, class171.field2962, class3.field29, var59.field3721 - class221.field3877, var59.field3739 - class34.field528, var59.field3736 - class237.field4097, var59.field3728);
                                                }
                                                for (int var60 = var59.field3731; var60 <= var59.field3737; var60++) {
                                                    for (int var61 = var59.field3729; var61 <= var59.field3722; var61++) {
                                                        class208 var62 = var7[var60][var61];
                                                        if (var62.field3660 != 0) {
                                                            class18.field260.method116((byte) -121, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3649) {
                                                            class18.field260.method116((byte) -121, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3643) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3643 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3649);
                            } while (var2.field3660 != 0);
                            if (var3 > class19.field275 || var3 <= class54.field952) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3649);
                        if (var3 < class19.field275 || var3 >= class169.field2909 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3649);
                    if (var4 > class152.field2602 || var4 <= class114.field2048) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3649);
                if (var4 < class152.field2602 || var4 >= class108.field1914 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3649);
            var2.field3649 = false;
            class88.field1644--;
            class167 var67 = var2.field3648;
            if (var67 != null && var67.field2874 != 0) {
                if (var67.field2880 != null) {
                    var67.field2880.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var67.field2872 - class221.field3877, var67.field2870 - class34.field528 - var67.field2874, var67.field2881 - class237.field4097, var67.field2883);
                }
                if (var67.field2879 != null) {
                    var67.field2879.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var67.field2872 - class221.field3877, var67.field2870 - class34.field528 - var67.field2874, var67.field2881 - class237.field4097, var67.field2883);
                }
                if (var67.field2873 != null) {
                    var67.field2873.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var67.field2872 - class221.field3877, var67.field2870 - class34.field528 - var67.field2874, var67.field2881 - class237.field4097, var67.field2883);
                }
            }
            if (var2.field3635 != 0) {
                class267 var68 = var2.field3641;
                if (var68 != null && !class215.method1475(var6, var3, var4, var68.field4759.method6())) {
                    if ((var68.field4755 & var2.field3635) != 0) {
                        var68.field4759.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var68.field4752 + var68.field4756 - class221.field3877, var68.field4758 - class34.field528, var68.field4746 + var68.field4750 - class237.field4097, var68.field4751);
                    } else if (var68.field4755 == 256) {
                        int var69 = var68.field4752 - class221.field3877;
                        int var70 = var68.field4758 - class34.field528;
                        int var71 = var68.field4746 - class237.field4097;
                        int var72 = var68.field4754;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field4759.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var68.field4756 + var69, var70, var68.field4750 + var71, var68.field4751);
                        } else if (var68.field4753 != null) {
                            var68.field4753.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var69, var70, var71, var68.field4751);
                        }
                    }
                }
                class233 var75 = var2.field3656;
                if (var75 != null) {
                    if ((var75.field4030 & var2.field3635) != 0 && !class156.method1026(var6, var3, var4, var75.field4030)) {
                        var75.field4025.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var75.field4039 - class221.field3877, var75.field4036 - class34.field528, var75.field4034 - class237.field4097, var75.field4028);
                    }
                    if ((var75.field4029 & var2.field3635) != 0 && !class156.method1026(var6, var3, var4, var75.field4029)) {
                        var75.field4040.method1(0, class190.field3268, class214.field3752, class171.field2962, class3.field29, var75.field4039 - class221.field3877, var75.field4036 - class34.field528, var75.field4034 - class237.field4097, var75.field4028);
                    }
                }
            }
            if (var5 < class272.field4811 - 1) {
                class208 var76 = class99.field1780[var5 + 1][var3][var4];
                if (var76 != null && var76.field3649) {
                    class18.field260.method116((byte) -121, var76);
                }
            }
            if (var3 < class19.field275) {
                class208 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3649) {
                    class18.field260.method116((byte) -121, var77);
                }
            }
            if (var4 < class152.field2602) {
                class208 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3649) {
                    class18.field260.method116((byte) -121, var78);
                }
            }
            if (var3 > class19.field275) {
                class208 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3649) {
                    class18.field260.method116((byte) -121, var79);
                }
            }
            if (var4 > class152.field2602) {
                class208 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3649) {
                    class18.field260.method116((byte) -121, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;B)Z")
    public final boolean method597(class85 arg0, byte arg1) {
        field1590++;
        if (arg0.field1538 > this.field1538) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1538; var3++) {
            byte var5 = this.field1548[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            byte var6 = arg0.field1548[var3];
            if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                var6 = (byte) (var6 + 32);
            }
            if (var5 != var6) {
                return false;
            }
        }
        int var4 = 20 % ((arg1 + 35) / 49);
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method598(int arg0, int arg1, Graphics arg2, int arg3) {
        field1568++;
        String var5;
        try {
            var5 = new String(this.field1548, arg3, this.field1538, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1548, 0, this.field1538);
        }
        arg2.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljd;B)Z")
    public final boolean method599(class85 arg0, byte arg1) {
        field1551++;
        if (arg0.field1538 > this.field1538) {
            return false;
        }
        if (arg1 < 14) {
            field1567 = null;
        }
        int var3 = this.field1538 - arg0.field1538;
        for (int var4 = 0; var4 < arg0.field1538; var4++) {
            if (this.field1548[var3 + var4] != arg0.field1548[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Ljd;")
    public final class85 method600(int arg0) {
        field1558++;
        int var2 = -56 / ((arg0 + 46) / 34);
        long var3 = this.method628((byte) 127);
        synchronized (field1607 == null ? (field1607 = method640("jd")) : field1607) {
            if (field1560 == null) {
                field1560 = new class204(4096);
            } else {
                for (class79 var6 = (class79) field1560.method1398(1, var3); var6 != null; var6 = (class79) field1560.method1395(1)) {
                    if (this.method612((byte) 119, var6.field1444)) {
                        return var6.field1444;
                    }
                }
            }
            class79 var8 = new class79();
            this.field1554 = false;
            var8.field1444 = this;
            field1560.method1393(var8, var3, 817);
            return this;
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Ljd;")
    public final class85 method601(int arg0) {
        field1564++;
        int var2;
        for (var2 = 0; this.field1538 > var2 && (this.field1548[var2] >= 0 && this.field1548[var2] <= 32 || (this.field1548[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field1538; var2 < var3 && (this.field1548[var3 - 1] >= 0 && this.field1548[var3 - 1] <= 32 || (this.field1548[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (arg0 == var2 && this.field1538 == var3) {
            return this;
        }
        class85 var4 = new class85();
        var4.field1538 = var3 - var2;
        var4.field1548 = new byte[var4.field1538];
        for (int var5 = 0; var5 < var4.field1538; var5++) {
            var4.field1548[var5] = this.field1548[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)[B")
    public final byte[] method602(byte arg0) {
        field1561++;
        if (this.field1538 == 0) {
            return new byte[0];
        }
        int var2 = this.field1538 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (var2 - 2 >= this.field1538 || class123.method843(26, this.field1548[var2 - 2]) == -1) {
            var3 -= 2;
        } else if ((var2 - 1) >= this.field1538 || class123.method843(arg0 - 33, this.field1548[var2 + -1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        if (arg0 != 59) {
            this.method604((byte) 46, -96);
        }
        this.method623((byte) -92, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method603(byte arg0, Component arg1) {
        if (arg0 < 43) {
            return;
        }
        arg1.removeMouseListener(class168.field2886);
        arg1.removeMouseMotionListener(class168.field2886);
        arg1.removeFocusListener(class168.field2886);
        field1601++;
        class102.field1815 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[Ljd;")
    public final class85[] method604(byte arg0, int arg1) {
        field1585++;
        if (arg0 != 56) {
            this.method601(-127);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1538; var4++) {
            if (this.field1548[var4] == arg1) {
                var3++;
            }
        }
        class85[] var5 = new class85[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field1548[var6 + var9] != arg1; var9++) {
            }
            var5[var7++] = this.method636(var6 + var9, var6, true);
            var6 += var9 + 1;
        }
        var5[var3] = this.method636(this.field1538, var6, true);
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)I")
    public final int method605(int arg0, byte arg1) {
        field1540++;
        if (arg1 != 62) {
            this.method624(true);
        }
        int var3 = 0;
        byte var4 = (byte) arg0;
        for (int var5 = 0; var5 < this.field1538; var5++) {
            if (this.field1548[var5] == var4) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIILge;)[Lfg;")
    public static final class12[] method606(byte arg0, int arg1, int arg2, class68 arg3) {
        int var4 = -69 / ((-arg0 - 73) / 42);
        field1594++;
        return class253.method1750(arg1, arg3, (byte) 111, arg2) ? class232.method1550(false) : null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljd;Z)I")
    public final int method607(class85 arg0, boolean arg1) {
        if (arg1) {
            this.field1548 = null;
        }
        field1588++;
        return this.method634(0, arg0, (byte) -110);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)Z")
    public final boolean method608(byte arg0) {
        int var2 = -50 % ((50 - arg0) / 55);
        field1552++;
        return this.method629(-23171, 10);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Ljd;")
    public final class85 method609(int arg0) {
        field1562++;
        if (!this.field1554) {
            throw new IllegalArgumentException();
        }
        this.field1543 = 0;
        if (this.field1548.length != this.field1538) {
            byte[] var2 = new byte[this.field1538];
            class248.method1724(this.field1548, 0, var2, 0, this.field1538);
            this.field1548 = var2;
        }
        return arg0 >= -99 ? null : this;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)I")
    public final int method610(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        field1581++;
        for (int var5 = arg0; var5 < this.field1538; var5++) {
            if (this.field1548[var5] == var4) {
                return var5;
            }
        }
        if (arg1 != -25380) {
            field1565 = 41;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)Ljd;")
    public final class85 method611(byte arg0, int arg1) {
        if (arg0 != -97) {
            this.field1554 = true;
        }
        field1598++;
        return this.method636(this.field1538, arg1, true);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BLjd;)Z")
    public final boolean method612(byte arg0, class85 arg1) {
        field1602++;
        if (arg1 == null) {
            return false;
        } else if (this.field1538 == arg1.field1538) {
            if (!this.field1554 || !arg1.field1554) {
                if (this.field1543 == 0) {
                    this.field1543 = this.method583(-42);
                    if (this.field1543 == 0) {
                        this.field1543 = 1;
                    }
                }
                if (arg1.field1543 == 0) {
                    arg1.field1543 = arg1.method583(90);
                    if (arg1.field1543 == 0) {
                        arg1.field1543 = 1;
                    }
                }
                if (this.field1543 != arg1.field1543) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1538; var3++) {
                if (this.field1548[var3] != arg1.field1548[var3]) {
                    return false;
                }
            }
            if (arg0 <= 89) {
                field1593 = 37;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public final int method613(int arg0, int arg1) {
        int var3 = -11 / ((arg1 + 63) / 58);
        field1578++;
        return this.method610(0, -25380, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V")
    public static void method614(byte arg0) {
        field1560 = null;
        field1567 = null;
        int var1 = -54 % ((arg0 + 39) / 34);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ZI)I")
    public final int method615(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1538 = 81;
        }
        field1605++;
        return this.field1548[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjd;)I")
    public final int method616(boolean arg0, class85 arg1) {
        field1572++;
        int var3;
        if (this.field1538 > arg1.field1538) {
            var3 = arg1.field1538;
        } else {
            var3 = this.field1538;
        }
        int var4 = 0;
        if (!arg0) {
            return -92;
        }
        while (var3 > var4) {
            if ((arg1.field1548[var4] & 0xFF) > (this.field1548[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1548[var4] & 0xFF) > (arg1.field1548[var4] & 0xFF)) {
                return 1;
            }
            var4++;
        }
        if (arg1.field1538 > this.field1538) {
            return -1;
        } else if (arg1.field1538 < this.field1538) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)Ljd;")
    public final class85 method617(byte arg0) {
        field1597++;
        class85 var2 = new class85();
        var2.field1538 = this.field1538;
        var2.field1548 = new byte[this.field1538];
        if (arg0 != 33) {
            method595((byte) -34);
        }
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field1538; var4++) {
            byte var5 = this.field1548[var4];
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
            var2.field1548[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;")
    public final URL method618(int arg0, URL arg1) throws MalformedURLException {
        field1569++;
        return arg0 == 0 ? new URL(arg1, new String(this.field1548, 0, this.field1538)) : null;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(Ljd;B)Z")
    public final boolean method619(class85 arg0, byte arg1) {
        field1541++;
        if (this.field1538 < arg0.field1538) {
            return false;
        }
        if (arg1 != 74) {
            field1565 = 118;
        }
        for (int var3 = 0; var3 < arg0.field1538; var3++) {
            if (this.field1548[var3] != arg0.field1548[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(Z)Ljd;")
    public final class85 method620(boolean arg0) {
        field1587++;
        class85 var2 = class116.method814(this.method624(arg0), 117);
        return var2 == null ? class195.field3353 : var2;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(ZI)Ljd;")
    public final class85 method621(boolean arg0, int arg1) {
        field1571++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class85 var3 = new class85();
        var3.field1548 = new byte[this.field1538 + 1];
        var3.field1538 = this.field1538 + 1;
        if (arg0) {
            class248.method1724(this.field1548, 0, var3.field1548, 0, this.field1538);
            var3.field1548[this.field1538] = (byte) arg1;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BII)I")
    public final int method622(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field1591++;
        class248.method1724(this.field1548, arg3, arg2, arg4, arg0 - arg3);
        if (arg1 != 28690) {
            this.field1538 = -23;
        }
        return arg0 - arg3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI[B)I")
    private final int method623(byte arg0, int arg1, byte[] arg2) {
        field1586++;
        int var4 = arg1;
        if (arg0 != -92) {
            this.method639(-37);
        }
        for (int var5 = 0; var5 < this.field1538; var5 += 4) {
            int var6 = class123.method843(26, this.field1548[var5]);
            int var7 = this.field1538 <= var5 + 1 ? -1 : class123.method843(26, this.field1548[var5 + 1]);
            int var8 = this.field1538 > (var5 + 2) ? class123.method843(26, this.field1548[var5 + 2]) : -1;
            int var9 = this.field1538 > var5 + 3 ? class123.method843(26, this.field1548[var5 + 3]) : -1;
            arg2[arg1++] = (byte) class75.method528(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class75.method528(var8 >>> 2, class135.method899(15, var7) << 4);
            if (var9 == -1) {
                break;
            }
            arg2[arg1++] = (byte) class75.method528(var9, class135.method899(var8 << 6, 192));
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!jd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1592++;
        if (!arg0 instanceof class85) {
            throw new IllegalArgumentException();
        }
        return this.method612((byte) 94, (class85) arg0);
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(Z)J")
    public final long method624(boolean arg0) {
        if (arg0) {
            this.method615(false, -98);
        }
        field1603++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1538 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1548[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBILjd;)Ljd;")
    public final class85 method625(int arg0, byte arg1, int arg2, class85 arg3) {
        field1542++;
        if (!this.field1554) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0 && arg2 >= arg0 && arg2 <= arg3.field1538) {
            this.field1543 = 0;
            if ((this.field1538 + arg2 - arg0) > this.field1548.length) {
                int var5;
                for (var5 = 1; var5 < (this.field1538 + arg3.field1538); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class248.method1724(this.field1548, 0, var6, 0, this.field1538);
                this.field1548 = var6;
            }
            if (arg1 == -7) {
                class248.method1724(arg3.field1548, arg0, this.field1548, this.field1538, arg2 - arg0);
                this.field1538 += arg2 - arg0;
                return this;
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIILqb;JLqb;Lqb;)V")
    public static final void method626(int arg0, int arg1, int arg2, int arg3, class56 arg4, long arg5, class56 arg6, class56 arg7) {
        class167 var9 = new class167();
        var9.field2873 = arg4;
        var9.field2872 = arg1 * 128 + 64;
        var9.field2881 = arg2 * 128 + 64;
        var9.field2870 = arg3;
        var9.field2883 = arg5;
        var9.field2880 = arg6;
        var9.field2879 = arg7;
        int var10 = 0;
        class208 var11 = class99.field1780[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3646; var12++) {
                class213 var13 = var11.field3650[var12];
                if ((var13.field3728 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3724.method6();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2874 = -var10;
        if (class99.field1780[arg0][arg1][arg2] == null) {
            class99.field1780[arg0][arg1][arg2] = new class208(arg0, arg1, arg2);
        }
        class99.field1780[arg0][arg1][arg2].field3648 = var9;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIII)Ljd;")
    public static final class85 method627(boolean arg0, int arg1, int arg2, int arg3) {
        field1599++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg3;
            arg2 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        if (arg1 != 6213) {
            method614((byte) 55);
        }
        class85 var9 = new class85();
        var9.field1548 = var7;
        var9.field1538 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)J")
    public final long method628(byte arg0) {
        field1582++;
        if (arg0 <= 108) {
            return -59L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1538; var4++) {
            var2 = (var2 << 5) + (long) (this.field1548[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Z")
    private final boolean method629(int arg0, int arg1) {
        if (arg0 != -23171) {
            this.method619((class85) null, (byte) -2);
        }
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1580++;
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1538; var6++) {
            int var7 = this.field1548[var6] & 0xFF;
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
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var3 + var7;
            if (var8 / arg1 != var3) {
                return false;
            }
            var3 = var8;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lle;Z)V")
    public static final void method630(class41 arg0, boolean arg1) {
        class226.method1524(32768);
        field1589++;
        if (class39.field615 != null) {
            return;
        }
        if (!arg1) {
            field1560 = null;
        }
        if (!class129.field2266) {
            class240.method1636((byte) -102);
        } else if (class75.field1393 == 1) {
            int var2 = class122.field2171 / 5;
            int var3 = class13.field201 + var2 + 140;
            if (class99.field1784 >= var3 && var3 + 14 >= class99.field1784 && class175.field3008 >= class273.field4827 + 4 && class273.field4827 + 18 >= class175.field3008) {
                class56.method377(0, 1603, 0);
                return;
            }
            if (class99.field1784 >= var3 + 15 && var3 + 80 >= class99.field1784 && class175.field3008 >= (class273.field4827 + 4) && class273.field4827 + 18 >= class175.field3008) {
                class56.method377(1, 1603, 0);
                return;
            }
            int var4 = class13.field201 + var2 + 250;
            if (class99.field1784 >= var4 && class99.field1784 <= var4 + 14 && class273.field4827 + 4 <= class175.field3008 && (class273.field4827 + 18) >= class175.field3008) {
                class56.method377(0, 1603, 1);
                return;
            }
            if ((var4 + 15) <= class99.field1784 && (var4 + 80) >= class99.field1784 && (class273.field4827 + 4) <= class175.field3008 && (class273.field4827 + 18) >= class175.field3008) {
                class56.method377(1, 1603, 1);
                return;
            }
            int var5 = class13.field201 - (-var2 - 360);
            if (var5 <= class99.field1784 && var5 + 14 >= class99.field1784 && (class273.field4827 + 4) <= class175.field3008 && class175.field3008 <= (class273.field4827 + 18)) {
                class56.method377(0, 1603, 2);
                return;
            }
            if (class99.field1784 >= (var5 + 15) && class99.field1784 <= var5 + 80 && class175.field3008 >= (class273.field4827 + 4) && class175.field3008 <= class273.field4827 + 18) {
                class56.method377(1, 1603, 2);
                return;
            }
            int var6 = var2 + class13.field201 + 470;
            if (class99.field1784 >= var6 && class99.field1784 <= (var6 + 14) && class273.field4827 + 4 <= class175.field3008 && class175.field3008 <= (class273.field4827 + 18)) {
                class56.method377(0, 1603, 3);
                return;
            }
            if ((var6 + 15) <= class99.field1784 && class99.field1784 <= (var6 + 80) && class273.field4827 + 4 <= class175.field3008 && (class273.field4827 + 18) >= class175.field3008) {
                class56.method377(1, 1603, 3);
                return;
            }
            if (class93.field1699 != -1) {
                class112 var7 = class178.field3051[class93.field1699];
                if (class217.field3814 == var7.field1962) {
                    byte[] var8 = class172.method1150(new class85[] { var7.field1953, class272.field4812 }, 0).method588(17473);
                    class6.field70 = new String(var8, 0, var8.length);
                    class7.field78 = var7.field1951;
                    if (class133.field2312 != 0) {
                        class58.field1058 = class7.field78 + 50000;
                        class43.field751 = class7.field78 + 40000;
                        class239.field4128 = class43.field751;
                    }
                    if (class127.field2217 != null) {
                        class127.field2217.field4542 = true;
                        class16.method120((byte) -57, class127.field2217);
                    }
                    return;
                }
                class85 var9 = class247.field4282;
                if (class133.field2312 != 0) {
                    var9 = class172.method1150(new class85[] { class98.field1772, class68.method451(var7.field1951 + 7000, -12572) }, 0);
                }
                class85 var10 = class172.method1150(new class85[] { class202.field3512, var7.field1953, class272.field4812, var9, class19.field270, class68.method451(class128.field2249, -12572), class122.field2162, class68.method451(class245.field4191, -12572), class177.field3026, class68.method451(0, -12572), class207.field3614, class68.method451(class246.field4205, -12572), class253.field4375, class68.method451(class268.field4765, -12572) }, 0);
                try {
                    arg0.getAppletContext().showDocument(var10.method631(91), "_self");
                    return;
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Ljava/net/URL;")
    public final URL method631(int arg0) throws MalformedURLException {
        int var2 = -66 % ((-arg0 - 17) / 33);
        field1559++;
        return new URL(new String(this.field1548, 0, this.field1538));
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(BI)V")
    public final void method632(byte arg0, int arg1) {
        this.field1543 = 0;
        field1553++;
        if (!this.field1554) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 != 32) {
                this.method585((class85) null, (byte) -86, (class85) null);
            }
            if (this.field1548.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class248.method1724(this.field1548, 0, var4, 0, this.field1538);
                this.field1548 = var4;
            }
            for (int var5 = this.field1538; var5 < arg1; var5++) {
                this.field1548[var5] = 32;
            }
            this.field1538 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)Ljd;")
    public final class85 method633(int arg0) {
        field1579++;
        class85 var2 = new class85();
        var2.field1538 = this.field1538;
        var2.field1548 = new byte[this.field1538];
        if (arg0 != 90) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1538; var3++) {
            byte var4 = this.field1548[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1548[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjd;B)I")
    public final int method634(int arg0, class85 arg1, byte arg2) {
        field1570++;
        int[] var4 = new int[arg1.field1538];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field1538];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field1538;
        }
        for (int var8 = 1; var8 <= arg1.field1538; var8++) {
            var4[var8 - 1] = (arg1.field1538 << 1) - var8;
            var5[class135.method899(255, arg1.field1548[var8 - 1])] = arg1.field1538 - var8;
        }
        int var9 = arg1.field1538 + 1;
        int var10 = arg1.field1538;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field1538 && arg1.field1548[var10 - 1] != arg1.field1548[var9 - 1]) {
                if (arg1.field1538 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg1.field1538 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 58 / ((-arg2 - 52) / 48);
        int var13 = arg1.field1538 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field1548[var14 - 1] != arg1.field1548[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        int var16 = 1;
        while (arg1.field1538 > var11) {
            for (int var19 = var16; var19 <= var11; var19++) {
                if (var11 + arg1.field1538 - var19 <= var4[var19 + -1]) {
                    var4[var19 - 1] = arg1.field1538 + var11 - var19;
                }
            }
            var16 = var11 + 1;
            var11 += var13 - var6[var13 - 1];
            var13 = var6[var13 - 1];
        }
        int var18;
        for (int var17 = arg1.field1538 + arg0 - 1; var17 < this.field1538; var17 += Math.max(var5[this.field1548[var17] & 0xFF], var4[var18])) {
            for (var18 = arg1.field1538 - 1; var18 >= 0 && this.field1548[var17] == arg1.field1548[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method635(FontMetrics arg0, byte arg1) {
        field1600++;
        if (arg1 != 92) {
            return 85;
        }
        String var3;
        try {
            var3 = new String(this.field1548, 0, this.field1538, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1548, 0, this.field1538);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZ)Ljd;")
    public final class85 method636(int arg0, int arg1, boolean arg2) {
        field1584++;
        class85 var4 = new class85();
        if (arg2) {
            var4.field1548 = new byte[arg0 - arg1];
            var4.field1538 = arg0 - arg1;
            class248.method1724(this.field1548, arg1, var4.field1548, 0, var4.field1538);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Ljd;")
    public final class85 method637(int arg0) {
        field1566++;
        class85 var2 = new class85();
        var2.field1538 = this.field1538;
        var2.field1548 = new byte[var2.field1538];
        for (int var3 = arg0; var3 < this.field1538; var3++) {
            var2.field1548[this.field1538 - var3 - 1] = this.field1548[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljd;I)Ljd;")
    public final class85 method638(class85 arg0, int arg1) {
        field1583++;
        if (!this.field1554) {
            throw new IllegalArgumentException();
        }
        this.field1543 = 0;
        if (this.field1548.length < (this.field1538 + arg0.field1538)) {
            int var3;
            for (var3 = 1; var3 < this.field1538 + arg0.field1538; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class248.method1724(this.field1548, 0, var4, 0, this.field1538);
            this.field1548 = var4;
        }
        class248.method1724(arg0.field1548, arg1, this.field1548, this.field1538, arg0.field1538);
        this.field1538 += arg0.field1538;
        return this;
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)I")
    public final int method639(int arg0) {
        if (arg0 != 2) {
            field1593 = 96;
        }
        field1545++;
        return this.method590(10, (byte) 2);
    }

    @OriginalMember(owner = "client!jd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1604++;
        return this.method583(74);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method640(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
