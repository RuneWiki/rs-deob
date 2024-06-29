import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class79 extends class20 {

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Lsc;")
    public static class128 field1751 = class129.method1017(false, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lsc;")
    public static class128 field1767 = class129.method1017(false, " )2>");

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Lsc;")
    public static class128 field1760 = class129.method1017(false, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lsc;")
    public static class128 field1776 = class129.method1017(false, "<col=ff0000>");

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "Lsc;")
    private static class128 field1777 = class129.method1017(false, "Your account has been disabled)3");

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "Lsc;")
    public static class128 field1754 = field1777;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Lsc;")
    public static class128 field1759 = class129.method1017(false, "(Y");

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field1768 = new Random();

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "[Z")
    public static boolean[] field1781 = new boolean[5];

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "Lsc;")
    private static class128 field1783 = class129.method1017(false, "Malformed login packet)3");

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "Lsc;")
    public static class128 field1782 = field1783;

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public int field1774;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Lpc;")
    public class107 field1757;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Lpc;")
    public class107 field1761;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lsf;")
    public static class131 field1755;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "Lsf;")
    public static class131 field1772;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Lnd;")
    public class94 field1763;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "[I")
    public static int[] field1753;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "[I")
    public int[] field1771;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILsf;IIZI)V")
    public static final void method595(int arg0, class131 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class126.field2851 = arg3;
        class27.field530 = arg2;
        class21.field410 = 10000;
        class20.field381 = arg1;
        field1762++;
        class5.field55 = arg4;
        class30.field606 = arg0;
        class49.field882 = arg5;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1776 = null;
        field1759 = null;
        field1754 = null;
        field1755 = null;
        field1782 = null;
        field1767 = null;
        field1783 = null;
        field1777 = null;
        field1772 = null;
        field1781 = null;
        field1768 = null;
        field1753 = null;
        field1751 = null;
        if (arg0 != 127) {
            field1770 = -36;
        }
        field1760 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZII)V")
    public static final void method597(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1756++;
        if (class105.field2392 == 0 && !class65.field1459) {
            class121.method921(class156.field3575, 46, arg4 - arg0, (byte) -70, arg3 - arg1, 0, class18.field323);
            class9.field144++;
        }
        int var5 = -1;
        for (int var6 = 0; var6 < class78.field1740; var6++) {
            int var7 = class78.field1722[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class154.field3553.method102(class29.field553, var8, var9, var7) >= 0) {
                    class94 var12 = class147.method1185(-2, var11);
                    if (var12.field2164 != null) {
                        var12 = var12.method735(-65);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class105.field2392 == 1) {
                        class5.field53++;
                        class121.method921(class14.field273, 2, var9, (byte) -70, var8, var7, class51.method395(new class128[] { class53.field1067, class104.field2355, var12.field2178 }, false));
                    } else if (!class65.field1459) {
                        class70.field1579++;
                        class128[] var13 = var12.field2182;
                        if (class112.field2526) {
                            var13 = class121.method924((byte) -126, var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class150.field3447++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 49;
                                    }
                                    if (var14 == 1) {
                                        var15 = 5;
                                    }
                                    if (var14 == 2) {
                                        var15 = 38;
                                    }
                                    if (var14 == 3) {
                                        var15 = 7;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1005;
                                    }
                                    class121.method921(var13[var14], var15, var9, (byte) -70, var8, var7, class51.method395(new class128[] { class86.field1957, var12.field2178 }, false));
                                }
                            }
                        }
                        class121.method921(class19.field357, 1001, var9, (byte) -70, var8, var12.field2169 << 14, class51.method395(new class128[] { class86.field1957, var12.field2178 }, false));
                    } else if ((class153.field3526 & 0x4) == 4) {
                        class121.method921(class110.field2486, 21, var9, (byte) -70, var8, var7, class51.method395(new class128[] { class35.field656, class104.field2355, var12.field2178 }, false));
                        class5.field46++;
                    }
                }
                if (var10 == 1) {
                    class51 var16 = class92.field2104[var11];
                    if (var16.field1028.field1290 == 1 && (var16.field975 & 0x7F) == 64 && (var16.field987 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class41.field767; var17++) {
                            class51 var20 = class92.field2104[class68.field1528[var17]];
                            if (var20 != null && var16 != var20 && var20.field1028.field1290 == 1 && var16.field975 == var20.field975 && var16.field987 == var20.field987) {
                                class37.method267(var9, var20.field1028, var8, class68.field1528[var17], (byte) 54);
                            }
                        }
                        for (int var18 = 0; var18 < class134.field3151; var18++) {
                            class53 var19 = class106.field2421[class65.field1441[var18]];
                            if (var19 != null && var16.field975 == var19.field975 && var16.field987 == var19.field987) {
                                class49.method375(var9, var8, -125, class65.field1441[var18], var19);
                            }
                        }
                    }
                    class37.method267(var9, var16.field1028, var8, var11, (byte) 54);
                }
                if (var10 == 0) {
                    class53 var21 = class106.field2421[var11];
                    if ((var21.field975 & 0x7F) == 64 && (var21.field987 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class41.field767; var22++) {
                            class51 var25 = class92.field2104[class68.field1528[var22]];
                            if (var25 != null && var25.field1028.field1290 == 1 && var21.field975 == var25.field975 && var21.field987 == var25.field987) {
                                class37.method267(var9, var25.field1028, var8, class68.field1528[var22], (byte) 54);
                            }
                        }
                        for (int var23 = 0; var23 < class134.field3151; var23++) {
                            class53 var24 = class106.field2421[class65.field1441[var23]];
                            if (var24 != null && var21 != var24 && var21.field975 == var24.field975 && var21.field987 == var24.field987) {
                                class49.method375(var9, var8, -121, class65.field1441[var23], var24);
                            }
                        }
                    }
                    class49.method375(var9, var8, -103, var11, var21);
                }
                if (var10 == 3) {
                    class121 var26 = class124.field2796[class29.field553][var8][var9];
                    if (var26 != null) {
                        for (class1 var27 = (class1) var26.method925(6230); var27 != null; var27 = (class1) var26.method922(0)) {
                            class64 var28 = class27.method230((byte) -44, var27.field4);
                            if (class105.field2392 == 1) {
                                class121.method921(class14.field273, 24, var9, (byte) -70, var8, var27.field4, class51.method395(new class128[] { class53.field1067, class148.field3421, var28.field1378 }, false));
                                class105.field2390++;
                            } else if (!class65.field1459) {
                                class147.field3398++;
                                class128[] var29 = var28.field1364;
                                if (class112.field2526) {
                                    var29 = class121.method924((byte) -126, var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class152.field3496++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 23;
                                        }
                                        if (var30 == 1) {
                                            var31 = 14;
                                        }
                                        if (var30 == 2) {
                                            var31 = 26;
                                        }
                                        if (var30 == 3) {
                                            var31 = 37;
                                        }
                                        if (var30 == 4) {
                                            var31 = 50;
                                        }
                                        class121.method921(var29[var30], var31, var9, (byte) -70, var8, var27.field4, class51.method395(new class128[] { class87.field1986, var28.field1378 }, arg2));
                                    } else if (var30 == 2) {
                                        class154.field3528++;
                                        class121.method921(class29.field560, 26, var9, (byte) -70, var8, var27.field4, class51.method395(new class128[] { class87.field1986, var28.field1378 }, arg2));
                                    }
                                }
                                class121.method921(class19.field357, 1003, var9, (byte) -70, var8, var27.field4, class51.method395(new class128[] { class87.field1986, var28.field1378 }, false));
                            } else if ((class153.field3526 & 0x1) == 1) {
                                class69.field1560++;
                                class121.method921(class110.field2486, 18, var9, (byte) -70, var8, var27.field4, class51.method395(new class128[] { class35.field656, class148.field3421, var28.field1378 }, false));
                            }
                        }
                    }
                }
            }
        }
        if (arg2) {
            method595(39, null, 96, -87, false, 112);
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        field1780++;
        if (arg0 >= -104) {
            this.method598((byte) -89);
        }
        int var2 = this.field1764;
        class94 var3 = this.field1763.method735(-50);
        if (var3 == null) {
            this.field1771 = null;
            this.field1752 = 0;
            this.field1775 = 0;
            this.field1765 = 0;
            this.field1764 = -1;
        } else {
            this.field1764 = var3.field2151;
            this.field1752 = var3.field2209;
            this.field1771 = var3.field2167;
            this.field1765 = var3.field2158;
            this.field1775 = var3.field2198 * 128;
        }
        if (this.field1764 != var2 && this.field1761 != null) {
            class92.field2088.method434(this.field1761);
            this.field1761 = null;
        }
    }
}
