import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class131 {

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Let;")
    private class428 field1763 = new class428();

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Let;")
    private class428 field1767 = new class428();

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Let;")
    private class428 field1770 = new class428();

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Let;")
    private class428 field1771 = new class428();

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "Lnj;")
    private class164 field1775 = new class164(4);

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "B")
    private byte field1776 = 0;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public volatile int field1777 = 0;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public volatile int field1778 = 0;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "Lnj;")
    private class164 field1779 = new class164(8);

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lni;")
    public static class367 field1750 = new class367(22, 3);

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Lwh;")
    public static class101 field1768 = new class101("LIVE", 0);

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Lps;")
    public static class63 field1769 = new class63();

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    private int field1772;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "J")
    private long field1773;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "Lov;")
    private class125 field1774;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "Lhk;")
    private class67 field1780;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 3)
    public final void method885(byte arg0) {
        field1759++;
        try {
            this.field1774.method855((byte) 54);
        } catch (Exception var2) {
        }
        this.field1778 = -1;
        this.field1777++;
        this.field1776 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1774 = null;
        if (arg0 != -39) {
            this.method886(false, null, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLov;B)V", line = 22)
    public final void method886(boolean arg0, class125 arg1, byte arg2) {
        if (this.field1774 != null) {
            try {
                this.field1774.method855((byte) 50);
            } catch (Exception var8) {
            }
            this.field1774 = null;
        }
        field1758++;
        this.field1774 = arg1;
        this.method895(0);
        this.method899(0, arg0);
        this.field1779.field2185 = 0;
        this.field1780 = null;
        if (arg2 >= -29) {
            this.method890((byte) -127);
        }
        while (true) {
            class67 var4 = (class67) this.field1767.method2612(-6261);
            if (var4 == null) {
                while (true) {
                    class67 var5 = (class67) this.field1771.method2612(-6261);
                    if (var5 == null) {
                        if (this.field1776 != 0) {
                            try {
                                this.field1775.field2185 = 0;
                                this.field1775.method1072((byte) 102, 4);
                                this.field1775.method1072((byte) 102, this.field1776);
                                this.field1775.method1114(0, 97);
                                this.field1774.method856(0, 5000, 4, this.field1775.field2219);
                            } catch (IOException var7) {
                                try {
                                    this.field1774.method855((byte) 76);
                                } catch (Exception var6) {
                                }
                                this.field1774 = null;
                                this.field1777++;
                                this.field1778 = -2;
                            }
                        }
                        this.field1772 = 0;
                        this.field1773 = class58.method427((byte) -19);
                        return;
                    }
                    this.field1770.method2613(3, var5);
                }
            }
            this.field1763.method2613(3, var4);
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z", line = 92)
    public final boolean method887(byte arg0) {
        field1752++;
        if (arg0 != -78) {
            this.field1770 = null;
        }
        return this.method889((byte) 94) >= 20;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z", line = 105)
    public final boolean method888(int arg0) {
        field1761++;
        if (this.field1774 != null) {
            long var2 = class58.method427((byte) -19);
            int var4 = (int) (var2 - this.field1773);
            this.field1773 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1772 += var4;
            if (this.field1772 > 30000) {
                try {
                    this.field1774.method855((byte) 113);
                } catch (Exception var27) {
                }
                this.field1774 = null;
            }
        }
        if (this.field1774 == null) {
            return this.method889((byte) -81) == 0 && this.method901(0) == 0;
        }
        try {
            this.field1774.method854(-4900);
            class67 var5 = (class67) this.field1763.method2611((byte) 58);
            if (arg0 < 7) {
                return true;
            }
            while (var5 != null) {
                this.field1775.field2185 = 0;
                this.field1775.method1072((byte) 102, 1);
                this.field1775.method1115(65280, (int) var5.field1579);
                this.field1774.method856(0, 5000, 4, this.field1775.field2219);
                this.field1767.method2613(3, var5);
                var5 = (class67) this.field1763.method2615(-13153);
            }
            for (class67 var6 = (class67) this.field1770.method2611((byte) 84); var6 != null; var6 = (class67) this.field1770.method2615(-13153)) {
                this.field1775.field2185 = 0;
                this.field1775.method1072((byte) 102, 0);
                this.field1775.method1115(65280, (int) var6.field1579);
                this.field1774.method856(0, 5000, 4, this.field1775.field2219);
                this.field1771.method2613(3, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1774.method853(true);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1772 = 0;
                byte var9 = 0;
                if (this.field1780 == null) {
                    var9 = 8;
                } else if (this.field1780.field948 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1780.field951.field2219.length - this.field1780.field947;
                    int var11 = 512 - this.field1780.field948;
                    if (var11 > (var10 - this.field1780.field951.field2185)) {
                        var11 = var10 - this.field1780.field951.field2185;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field1774.method860(var11, this.field1780.field951.field2185, this.field1780.field951.field2219, (byte) 113);
                    if (this.field1776 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1780.field951.field2219[this.field1780.field951.field2185 + var12] = (byte) class28.method251(this.field1780.field951.field2219[this.field1780.field951.field2185 + var12], this.field1776);
                        }
                    }
                    this.field1780.field948 += var11;
                    this.field1780.field951.field2185 += var11;
                    if (this.field1780.field951.field2185 == var10) {
                        this.field1780.method705(6511);
                        this.field1780.field2342 = false;
                        this.field1780 = null;
                    } else if (this.field1780.field948 == 512) {
                        this.field1780.field948 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1779.field2185;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field1774.method860(var13, this.field1779.field2185, this.field1779.field2219, (byte) -67);
                    if (this.field1776 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1779.field2219[this.field1779.field2185 + var14] = (byte) class28.method251(this.field1779.field2219[this.field1779.field2185 + var14], this.field1776);
                        }
                    }
                    this.field1779.field2185 += var13;
                    if (var9 <= this.field1779.field2185) {
                        if (this.field1780 == null) {
                            this.field1779.field2185 = 0;
                            int var15 = this.field1779.method1087(false);
                            int var16 = this.field1779.method1074(-635989152);
                            int var17 = this.field1779.method1087(false);
                            int var18 = this.field1779.method1099(40);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class67 var24;
                            if (var20) {
                                for (var24 = (class67) this.field1771.method2611((byte) 44); var24 != null && var24.field1579 != var21; var24 = (class67) this.field1771.method2615(-13153)) {
                                }
                            } else {
                                for (var24 = (class67) this.field1767.method2611((byte) 54); var24 != null && var24.field1579 != var21; var24 = (class67) this.field1767.method2615(-13153)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field1780 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1780.field951 = new class164(this.field1780.field947 + var18 + var25);
                            this.field1780.field951.method1072((byte) 102, var19);
                            this.field1780.field951.method1073(326170192, var18);
                            this.field1780.field948 = 8;
                            this.field1779.field2185 = 0;
                        } else if (this.field1780.field948 != 0) {
                            throw new IOException();
                        } else if (this.field1779.field2219[0] == -1) {
                            this.field1780.field948 = 1;
                            this.field1779.field2185 = 0;
                        } else {
                            this.field1780 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1774.method855((byte) 124);
            } catch (Exception var26) {
            }
            this.field1777++;
            this.field1774 = null;
            this.field1778 = -2;
            return this.method889((byte) 120) == 0 && this.method901(0) == 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)I", line = 379)
    public final int method889(byte arg0) {
        field1765++;
        int var2 = -30 / ((arg0 + 15) / 60);
        return this.field1763.method2616(0) + this.field1767.method2616(0);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)Z", line = 389)
    public final boolean method890(byte arg0) {
        field1762++;
        if (arg0 >= -84) {
            this.method897((byte) 23);
        }
        return this.method901(0) >= 20;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIBII)Lhk;", line = 402)
    public final class67 method891(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1755++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class67 var8 = new class67();
        var8.field2344 = arg0;
        var8.field947 = arg2;
        var8.field1579 = var6;
        if (arg1 != 0) {
            return null;
        }
        if (arg0) {
            if (this.method889((byte) 123) >= 20) {
                throw new RuntimeException();
            }
            this.field1763.method2613(3, var8);
        } else if (this.method901(arg1) < 20) {
            this.field1770.method2613(arg1 ^ 0x3, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLga;)Ljava/lang/String;", line = 446)
    public static final String method892(int arg0, byte arg1, class282 arg2) {
        field1754++;
        if (!client.method1348(arg2).method2702(arg0, arg1 - 132) && arg2.field4007 == null) {
            return null;
        } else if (arg2.field4136 == null || arg2.field4136.length <= arg0 || arg2.field4136[arg0] == null || arg2.field4136[arg0].trim().length() == 0) {
            return class215.field3038 ? "Hidden-" + arg0 : null;
        } else {
            if (arg1 != 26) {
                method892(-49, (byte) -105, null);
            }
            return arg2.field4136[arg0];
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lga;ZI)V", line = 470)
    public static final void method893(class282 arg0, boolean arg1, int arg2) {
        field1749++;
        int var3 = arg0.field4086 == 0 ? arg0.field3991 : arg0.field4086;
        int var4 = arg0.field4096 == 0 ? arg0.field4043 : arg0.field4096;
        class337.method2184(arg0.field4029, var3, class263.field3690[arg0.field4029 >> 16], var4, arg1, arg2 ^ 0x543DB8F1);
        if (arg2 != 1413331184) {
            method893(null, true, 73);
        }
        if (arg0.field4108 != null) {
            class337.method2184(arg0.field4029, var3, arg0.field4108, var4, arg1, 1);
        }
        class436 var5 = (class436) class312.field4570.method1747((long) arg0.field4029, false);
        if (var5 != null) {
            class365.method2332(var4, arg1, arg2 - 1413341471, var3, var5.field6598);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()V", line = 497)
    public static final void method894() {
        for (int var0 = 0; var0 < class527.field7728; var0++) {
            class140 var1 = class1.field8[var0];
            class211.method1451(var1);
            class1.field8[var0] = null;
        }
        class527.field7728 = 0;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 511)
    private final void method895(int arg0) {
        field1757++;
        if (this.field1774 == null) {
            return;
        }
        try {
            this.field1775.field2185 = arg0;
            this.field1775.method1072((byte) 102, 6);
            this.field1775.method1115(65280, 3);
            this.field1774.method856(0, 5000, 4, this.field1775.field2219);
        } catch (IOException var3) {
            try {
                this.field1774.method855((byte) 101);
            } catch (Exception var2) {
            }
            this.field1778 = -2;
            this.field1774 = null;
            this.field1777++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V", line = 540)
    public final void method896(byte arg0) {
        if (arg0 > 117) {
            field1751++;
            if (this.field1774 != null) {
                this.field1774.method857(1);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(B)V", line = 554)
    public final void method897(byte arg0) {
        field1756++;
        if (this.field1774 == null) {
            return;
        }
        try {
            this.field1775.field2185 = 0;
            this.field1775.method1072((byte) 102, 7);
            this.field1775.method1115(65280, 0);
            this.field1774.method856(0, 5000, 4, this.field1775.field2219);
            if (arg0 <= 2) {
                method898((byte) -81);
            }
        } catch (IOException var3) {
            try {
                this.field1774.method855((byte) 19);
            } catch (Exception var2) {
            }
            this.field1778 = -2;
            this.field1777++;
            this.field1774 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "(B)V", line = 588)
    public static void method898(byte arg0) {
        field1750 = null;
        int var1 = -38 / ((arg0 + 39) / 45);
        field1769 = null;
        field1768 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)V", line = 599)
    public final void method899(int arg0, boolean arg1) {
        field1753++;
        if (this.field1774 == null) {
            return;
        }
        try {
            this.field1775.field2185 = 0;
            this.field1775.method1072((byte) 102, arg1 ? 2 : 3);
            this.field1775.method1115(65280, arg0);
            this.field1774.method856(0, 5000, 4, this.field1775.field2219);
        } catch (IOException var4) {
            try {
                this.field1774.method855((byte) 23);
            } catch (Exception var3) {
            }
            this.field1777++;
            this.field1778 = -2;
            this.field1774 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 623)
    public final void method900(int arg0) {
        if (this.field1774 != null) {
            this.field1774.method855((byte) 15);
        }
        if (arg0 != -1) {
            this.field1778 = 97;
        }
        field1766++;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)I", line = 640)
    private final int method901(int arg0) {
        field1760++;
        if (arg0 != 0) {
            this.method890((byte) -86);
        }
        return this.field1770.method2616(0) + this.field1771.method2616(0);
    }
}
