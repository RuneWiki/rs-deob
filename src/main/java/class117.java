import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class117 {

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lfk;")
    private class266 field1775 = new class266();

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lma;")
    public static class5 field1771 = class12.method119(" loggt sich aus)3", (byte) 80);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lma;")
    public static class5 field1773 = class12.method119("::tele ", (byte) 62);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lma;")
    public static class5 field1778 = class12.method119("sl_arrows", (byte) 74);

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
    public static boolean field1781 = true;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lfk;")
    private class266 field1780;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 6)
    public static void method780(int arg0) {
        field1778 = null;
        field1771 = null;
        if (arg0 != -28796) {
            method790(51);
        }
        field1773 = null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Lfk;", line = 26)
    public final class266 method781(int arg0) {
        if (arg0 != -1) {
            method790(84);
        }
        field1765++;
        class266 var2 = this.field1775.field4546;
        if (this.field1775 == var2) {
            this.field1780 = null;
            return null;
        } else {
            this.field1780 = var2.field4546;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 48)
    public final void method782(int arg0) {
        field1774++;
        while (true) {
            class266 var2 = this.field1775.field4546;
            if (this.field1775 == var2) {
                if (arg0 != -18590) {
                    this.field1775 = (class266) null;
                }
                this.field1780 = null;
                return;
            }
            var2.method1828(-108);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I", line = 70)
    public static final int method783(int arg0, int arg1) {
        field1779++;
        if (arg1 < 0) {
            return 0;
        }
        class255 var2 = (class255) class300.field5062.method1372(false, (long) arg1);
        if (var2 == null) {
            return class210.method1383(true, arg1).field4175;
        }
        int var3 = 0;
        if (arg0 <= 8) {
            field1778 = (class5) null;
        }
        for (int var4 = 0; var4 < var2.field4355.length; var4++) {
            if (var2.field4355[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class210.method1383(true, arg1).field4175 - var2.field4355.length);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 105)
    public static final void method784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 2) {
            field1778 = (class5) null;
        }
        int var5 = 0;
        field1770++;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class76.method533(class57.field899, arg1 + arg3, true, class301.field5073);
        int var10 = class76.method533(class57.field899, arg1 - arg3, true, class301.field5073);
        class239.method1690(var10, 23267, var9, class137.field2032[arg4], arg0);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class294.field4956 && var11 <= class101.field1505) {
                    int var13 = class76.method533(class57.field899, arg1 + var5, true, class301.field5073);
                    int var14 = class76.method533(class57.field899, arg1 - var5, true, class301.field5073);
                    if (var12 <= class101.field1505) {
                        class239.method1690(var14, 23267, var13, class137.field2032[var12], arg0);
                    }
                    if (class294.field4956 <= var11) {
                        class239.method1690(var14, 23267, var13, class137.field2032[var11], arg0);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class294.field4956 <= var16 && class101.field1505 >= var15) {
                int var17 = class76.method533(class57.field899, arg1 + var6, true, class301.field5073);
                int var18 = class76.method533(class57.field899, arg1 - var6, true, class301.field5073);
                if (class101.field1505 >= var16) {
                    class239.method1690(var18, 23267, var17, class137.field2032[var16], arg0);
                }
                if (class294.field4956 <= var15) {
                    class239.method1690(var18, 23267, var17, class137.field2032[var15], arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Lfk;", line = 183)
    public final class266 method785(int arg0) {
        int var2 = -124 % ((arg0 - 17) / 55);
        class266 var3 = this.field1775.field4546;
        field1768++;
        if (this.field1775 == var3) {
            return null;
        } else {
            var3.method1828(-128);
            return var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lfk;I)V", line = 212)
    public final void method786(class266 arg0, int arg1) {
        field1777++;
        if (arg0.field4544 != null) {
            arg0.method1828(-82);
        }
        arg0.field4544 = this.field1775.field4544;
        arg0.field4546 = this.field1775;
        arg0.field4544.field4546 = arg0;
        arg0.field4546.field4544 = arg0;
        if (arg1 != 0) {
            this.method788(16, (class266) null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 240)
    public static final void method787(byte arg0) {
        if (arg0 != 119) {
            field1771 = (class5) null;
        }
        class23.field404.method523(126);
        field1767++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILfk;)V", line = 260)
    public final void method788(int arg0, class266 arg1) {
        if (arg0 < 37) {
            this.field1780 = (class266) null;
        }
        if (arg1.field4544 != null) {
            arg1.method1828(-79);
        }
        field1769++;
        arg1.field4544 = this.field1775;
        arg1.field4546 = this.field1775.field4546;
        arg1.field4544.field4546 = arg1;
        arg1.field4546.field4544 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Lfk;", line = 280)
    public final class266 method789(byte arg0) {
        class266 var2 = this.field1780;
        if (arg0 < 18) {
            this.field1780 = (class266) null;
        }
        field1766++;
        if (this.field1775 == var2) {
            this.field1780 = null;
            return null;
        } else {
            this.field1780 = var2.field4546;
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 311)
    public class117() {
        this.field1775.field4546 = this.field1775;
        this.field1775.field4544 = this.field1775;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 323)
    public static final void method790(int arg0) {
        field1782++;
        while (class200.field3184.method1386(class171.field2625, 13327) >= 27) {
            int var1 = class200.field3184.method1387(true, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class119.field1804[var1] == null) {
                class119.field1804[var1] = new class177();
                var2 = true;
            }
            class177 var3 = class119.field1804[var1];
            class73.field1153[class129.field1940++] = var1;
            var3.field217 = class50.field784;
            int var4 = class200.field3184.method1387(true, 5);
            int var5 = class200.field3184.method1387(true, 1);
            if (var5 == 1) {
                class156.field2320[class287.field4838++] = var1;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class114.field1699[class200.field3184.method1387(true, 3)];
            if (var2) {
                var3.field215 = var3.field174 = var6;
            }
            int var7 = class200.field3184.method1387(true, 1);
            int var8 = class200.field3184.method1387(true, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field2699 = class186.method1230(29, class200.field3184.method1387(true, 14));
            var3.field226 = var3.field2699.field4905;
            var3.field201 = var3.field2699.field4853;
            var3.field230 = var3.field2699.field4875;
            var3.field233 = var3.field2699.field4902;
            var3.field218 = var3.field2699.field4852;
            var3.field229 = var3.field2699.field4888;
            if (var3.field218 == 0) {
                var3.field174 = 0;
            }
            var3.field202 = var3.field2699.field4903;
            var3.field210 = var3.field2699.field4856;
            var3.field206 = var3.field2699.field4857;
            var3.method121(class151.field2183.field175[0] + var4, var7 == 1, -22763, class151.field2183.field186[0] + var8);
            if (var3.field2699.method1949(true)) {
                class230.method1642(var3.field186[0], var3, class276.field4701, (class91) null, 0, 0, var3.field175[0], (class185) null);
            }
        }
        class200.field3184.method1391(2);
        if (arg0 != -9984) {
            field1772 = -54;
        }
    }
}
