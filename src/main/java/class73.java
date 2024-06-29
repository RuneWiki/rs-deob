import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lmc;")
    private class86 field1764 = new class86(256);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lmc;")
    private class86 field1773 = new class86(256);

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lie;")
    private class61 field1771;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Lie;")
    private class61 field1770;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lid;")
    private static class60 field1756 = class11.method72("Location", (byte) -16);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lid;")
    public static class60 field1752 = class11.method72("Lade Wordpack )2 ", (byte) 108);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lid;")
    public static class60[] field1763 = new class60[8];

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Lid;")
    public static class60 field1767 = field1756;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lid;")
    public static class60 field1759 = class11.method72("Clientscript error )2 check log for details", (byte) 122);

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lid;")
    public static class60 field1772 = class11.method72("Hierhin gehen", (byte) -121);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static void method553(byte arg0) {
        field1759 = null;
        field1756 = null;
        field1767 = null;
        field1752 = null;
        field1763 = null;
        field1772 = null;
        int var1 = 123 % ((-arg0 - 22) / 63);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 12 % ((arg0 - 21) / 45);
        for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class77.field1889[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        class113.field2711[0][var7][var6] = class113.field2711[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < 103) {
                        class113.field2711[0][var7][var6] = class113.field2711[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        class113.field2711[0][var7][var6] = class113.field2711[0][var7][var6 - 1];
                    }
                    if (arg1 + arg2 == var6 && var6 < 103) {
                        class113.field2711[0][var7][var6] = class113.field2711[0][var7][var6 + 1];
                    }
                }
            }
        }
        field1760++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIBI)Lm;")
    private final class83 method555(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg1 ^ (arg3 >>> 12 | (arg3 & 0xC0000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        field1754++;
        class83 var9 = (class83) this.field1773.method716((byte) 115, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class134 var10 = class134.method1055(this.field1771, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class83 var11 = var10.method1053();
            this.field1773.method712(var7, var11, (byte) 47);
            if (arg0 != null) {
                arg0[0] -= var11.field2071.length;
            }
            int var12 = 105 % ((-arg2 - 2) / 55);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
    public static final void method556(long arg0, int arg1) {
        field1755++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class133.field3044; var3++) {
            if (class44.field1169[var3] == arg0) {
                class31.field726++;
                class133.field3044--;
                for (int var4 = var3; var4 < class133.field3044; var4++) {
                    class44.field1169[var4] = class44.field1169[var4 + 1];
                }
                class42.field1112 = class78.field1921;
                class22.field519.method1214(189, 0);
                class22.field519.method830(arg0, 52);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I)Lm;")
    public final class83 method557(int arg0, int arg1, int[] arg2) {
        if (arg0 != -1192542204) {
            method554(-8, -127, 113, -47, -58);
        }
        field1766++;
        if (this.field1771.method468((byte) -117) == 1) {
            return this.method555(arg2, arg1, (byte) -58, 0);
        } else if (this.field1771.method479(arg1, (byte) -98) == 1) {
            return this.method555(arg2, 0, (byte) 114, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method558(int arg0, String arg1, Throwable arg2) {
        field1751++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class9.method58((byte) -90, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            if (arg0 != -1) {
                method556(38L, -98);
            }
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class28.field653.field632 != null) {
                class138 var8 = class28.field653.method203(new URL(class28.field653.field632.getCodeBase(), "clienterror.ws?c=" + class17.field411 + "&u=" + class128.field2925 + "&v1=" + class26.field625 + "&v2=" + class26.field631 + "&e=" + var7), arg0 + 10);
                while (var8.field3145 == 0) {
                    class128.method1007((byte) 75, 1L);
                }
                if (var8.field3145 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3144;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
    public static final boolean method559(byte arg0) {
        if (arg0 != -43) {
            return false;
        }
        field1768++;
        try {
            if (class106.field2626 == 2) {
                if (class50.field1289 == null) {
                    class50.field1289 = class68.method515(class113.field2710, class41.field1102, class22.field524);
                    if (class50.field1289 == null) {
                        return false;
                    }
                }
                if (class17.field418 == null) {
                    class17.field418 = new class73(class75.field1816, class140.field3186);
                }
                if (class23.field567.method97(class155.field3529, 22050, class17.field418, arg0 ^ 0xFFFFFFD5, class50.field1289)) {
                    class23.field567.method103(false);
                    class23.field567.method122(class14.field291, false);
                    class23.field567.method98(false, class50.field1289, class87.field2193);
                    class113.field2710 = null;
                    class50.field1289 = null;
                    class106.field2626 = 0;
                    class17.field418 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class23.field567.method118(-15881);
            class50.field1289 = null;
            class106.field2626 = 0;
            class17.field418 = null;
            class113.field2710 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lof;Lid;I)I")
    public static final int method560(class103 arg0, class60 arg1, int arg2) {
        field1757++;
        int var3 = arg0.field2501;
        arg0.method838(arg1.field1474, -32769);
        arg0.field2501 += class109.field2662.method256(arg1.field1474, arg0.field2501, arg0.field2498, arg1.field1453, 7, arg2);
        return arg0.field2501 - var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIZ)Lm;")
    public final class83 method561(int[] arg0, int arg1, boolean arg2) {
        field1761++;
        if (this.field1770.method468((byte) -112) == 1) {
            return this.method563(0, arg1, arg0, -1);
        } else if (this.field1770.method479(arg1, (byte) -98) == 1) {
            return this.method563(arg1, 0, arg0, -1);
        } else {
            if (!arg2) {
                method560(null, null, 91);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lwa;")
    public static final class154 method562(int arg0, byte arg1) {
        field1769++;
        class154 var2 = (class154) class131.field2964.method918(126, (long) arg0);
        if (arg1 != 103) {
            field1752 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class145.field3269.method473((byte) 113, 9, arg0);
        class154 var4 = new class154();
        var4.field3465 = arg0;
        if (var3 != null) {
            var4.method1174(new class103(var3), (byte) -123);
        }
        var4.method1172((byte) 108);
        class131.field2964.method914(var4, (long) arg0, (byte) 46);
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[II)Lm;")
    private final class83 method563(int arg0, int arg1, int[] arg2, int arg3) {
        field1758++;
        int var5 = arg1 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class83 var9 = (class83) this.field1773.method716((byte) 41, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg3 != -1) {
            field1752 = null;
        }
        if (arg2 != null && arg2[0] <= 0) {
            return null;
        }
        class156 var10 = (class156) this.field1764.method716((byte) 29, var7);
        if (var10 == null) {
            var10 = class156.method1193(this.field1770, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            this.field1764.method712(var7, var10, (byte) 74);
        }
        class83 var11 = var10.method1202(arg2);
        if (var11 == null) {
            return null;
        } else {
            var10.method1009((byte) 76);
            this.field1773.method712(var7, var11, (byte) 98);
            return var11;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lie;Lie;)V")
    private class73(class61 arg0, class61 arg1) {
        this.field1771 = arg0;
        this.field1770 = arg1;
    }
}
