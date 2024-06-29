import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lue;")
    public class141 field1598 = new class141();

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lkd;")
    public static class73 field1606 = class126.method1070((byte) -66, "Handel akzeptieren");

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lkd;")
    public static class73 field1602 = class126.method1070((byte) -66, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1599 = 0;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "[Lkd;")
    public static class73[] field1611 = new class73[1000];

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Ljb;")
    public static class64 field1597 = new class64(64);

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "[I")
    public static int[] field1614 = new int[5];

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lkd;")
    public static class73 field1616 = class126.method1070((byte) -66, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Lq;")
    public static class111 field1601;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lue;")
    private class141 field1610;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[[[B")
    public static byte[][][] field1615;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lue;Lue;B)V")
    public final void method508(class141 arg0, class141 arg1, byte arg2) {
        if (arg0.field3517 != null) {
            arg0.method1147((byte) -39);
        }
        arg0.field3517 = arg1.field3517;
        arg0.field3506 = arg1;
        field1592++;
        arg0.field3517.field3506 = arg0;
        if (arg2 == 106) {
            arg0.field3506.field3517 = arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public final void method509(byte arg0) {
        if (arg0 != 81) {
            return;
        }
        field1600++;
        while (true) {
            class141 var2 = this.field1598.field3506;
            if (this.field1598 == var2) {
                return;
            }
            var2.method1147((byte) -55);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILue;)V")
    public final void method510(int arg0, class141 arg1) {
        field1595++;
        if (arg1.field3517 != null) {
            arg1.method1147((byte) -37);
        }
        arg1.field3506 = this.field1598.field3506;
        if (arg0 != -29474) {
            field1602 = null;
        }
        arg1.field3517 = this.field1598;
        arg1.field3517.field3506 = arg1;
        arg1.field3506.field3517 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lq;Lq;ILq;)V")
    public static final void method511(class111 arg0, class111 arg1, int arg2, class111 arg3) {
        class76.field1950 = arg3;
        if (arg2 != -26702) {
            method520((byte) 124);
        }
        class30.field855 = arg0;
        field1609++;
        class82.field2077 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLmf;)V")
    public static final void method512(byte arg0, class89 arg1) {
        field1603++;
        if (arg1.field2223 == 0) {
            return;
        }
        int var2 = -88 / ((-arg0 - 49) / 37);
        if (arg1.field2266 != -1 && arg1.field2266 < 32768) {
            class9 var3 = class133.field3345[arg1.field2266];
            if (var3 != null) {
                int var4 = arg1.field2264 - var3.field2264;
                int var5 = arg1.field2277 - var3.field2277;
                if (var5 != 0 || var4 != 0) {
                    arg1.field2293 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2266 >= 32768) {
            int var6 = arg1.field2266 - 32768;
            if (class78.field1997 == var6) {
                var6 = 2047;
            }
            class118 var7 = class42.field1141[var6];
            if (var7 != null) {
                int var8 = arg1.field2277 - var7.field2277;
                int var9 = arg1.field2264 - var7.field2264;
                if (var8 != 0 || var9 != 0) {
                    arg1.field2293 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2289 != 0 || arg1.field2224 != 0) && (arg1.field2286 == 0 || arg1.field2237 > 0)) {
            int var10 = arg1.field2277 - (arg1.field2289 - class80.field2029 - class80.field2029) * 64;
            int var11 = arg1.field2264 - (arg1.field2224 - class121.field3093 - class121.field3093) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field2293 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field2289 = 0;
            arg1.field2224 = 0;
        }
        int var12 = arg1.field2293 - arg1.field2265 & 0x7FF;
        if (var12 == 0) {
            arg1.field2263 = 0;
            return;
        }
        arg1.field2263++;
        if (var12 <= 1024) {
            arg1.field2265 += arg1.field2223;
            boolean var13 = true;
            if (arg1.field2223 > var12 || 2048 - arg1.field2223 < var12) {
                var13 = false;
                arg1.field2265 = arg1.field2293;
            }
            if (arg1.field2258 == arg1.field2245 && (arg1.field2263 > 25 || var13)) {
                if (arg1.field2234 == -1) {
                    arg1.field2245 = arg1.field2276;
                } else {
                    arg1.field2245 = arg1.field2234;
                }
            }
        } else {
            arg1.field2265 -= arg1.field2223;
            boolean var14 = true;
            if (var12 < arg1.field2223 || var12 > 2048 - arg1.field2223) {
                var14 = false;
                arg1.field2265 = arg1.field2293;
            }
            if (arg1.field2258 == arg1.field2245 && (arg1.field2263 > 25 || var14)) {
                if (arg1.field2239 == -1) {
                    arg1.field2245 = arg1.field2276;
                } else {
                    arg1.field2245 = arg1.field2239;
                }
            }
        }
        arg1.field2265 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lue;")
    public final class141 method513(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        class141 var2 = this.field1598.field3506;
        field1612++;
        if (this.field1598 == var2) {
            return null;
        } else {
            var2.method1147((byte) -54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lue;")
    public final class141 method514(byte arg0) {
        field1613++;
        class141 var2 = this.field1598.field3506;
        if (this.field1598 == var2) {
            this.field1610 = null;
            return null;
        }
        this.field1610 = var2.field3506;
        if (arg0 != -79) {
            this.method518((byte) -24);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)Lue;")
    public final class141 method515(byte arg0) {
        if (arg0 <= 89) {
            this.field1610 = null;
        }
        field1596++;
        class141 var2 = this.field1598.field3517;
        if (this.field1598 == var2) {
            return null;
        } else {
            var2.method1147((byte) -121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lue;")
    public final class141 method516(int arg0) {
        field1591++;
        class141 var2 = this.field1610;
        if (this.field1598 == var2) {
            this.field1610 = null;
            return null;
        }
        if (arg0 != 10404) {
            field1599 = -6;
        }
        this.field1610 = var2.field3517;
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lue;")
    public final class141 method517(int arg0) {
        field1608++;
        class141 var2 = this.field1610;
        if (arg0 >= -44) {
            this.field1598 = null;
        }
        if (this.field1598 == var2) {
            this.field1610 = null;
            return null;
        } else {
            this.field1610 = var2.field3506;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)Lue;")
    public final class141 method518(byte arg0) {
        field1605++;
        if (arg0 != 90) {
            return null;
        }
        class141 var2 = this.field1598.field3517;
        if (this.field1598 == var2) {
            this.field1610 = null;
            return null;
        } else {
            this.field1610 = var2.field3517;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lue;I)V")
    public final void method519(class141 arg0, int arg1) {
        if (arg0.field3517 != null) {
            arg0.method1147((byte) -103);
        }
        arg0.field3506 = this.field1598;
        arg0.field3517 = this.field1598.field3517;
        field1593++;
        arg0.field3517.field3506 = arg0;
        if (arg1 != 13017) {
            field1615 = null;
        }
        arg0.field3506.field3517 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
    public static void method520(byte arg0) {
        if (arg0 != 87) {
            return;
        }
        field1597 = null;
        field1616 = null;
        field1601 = null;
        field1611 = null;
        field1606 = null;
        field1615 = null;
        field1602 = null;
        field1614 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class61() {
        this.field1598.field3506 = this.field1598;
        this.field1598.field3517 = this.field1598;
    }
}
