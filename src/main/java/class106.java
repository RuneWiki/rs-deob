import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class106 extends class35 {

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "[Ldn;")
    public static class260[] field1822 = new class260[14];

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1836 = "Members object";

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[J")
    public static long[] field1840 = new long[32];

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field1846 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "Lab;")
    public static class279 field1825 = new class279(30);

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field1847 = 2;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "Lkl;")
    public class68 field1823;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "Lkl;")
    public class68 field1842;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "Ljava/lang/String;")
    public String field1832;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Z")
    public static boolean field1827;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Z")
    public boolean field1837;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "[Lfd;")
    public static class206[] field1834;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "[Ljava/lang/Object;")
    public Object[] field1841;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BZ)V", line = 20)
    public static final void method689(byte arg0, boolean arg1) {
        if (arg0 != -109) {
            field1827 = true;
        }
        field1828++;
        byte var2;
        byte[][] var3;
        if (class249.field3893 && arg1) {
            var2 = 1;
            var3 = client.field905;
        } else {
            var3 = class164.field2654;
            var2 = 4;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class268.method1782(true);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class99.field1748[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = (var8 & 0x35ED1FF) >> 24;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var8 & 0x6) >> 1;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var8 & 0xFFCE53) >> 14;
                            int var14 = (var13 / 8 << 8) + var12 / 8;
                            for (int var15 = 0; var15 < class95.field1708.length; var15++) {
                                if (class95.field1708[var15] == var14 && var3[var15] != null) {
                                    var9 = true;
                                    int[] var16 = class153.method994(var11, (byte) 101, var13, var6 * 8, var10, class326.field4990, var12, var7 * 8, var5, arg1, var3[var15]);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class85.method595(var7 * 8, 8, (byte) -118, var6 * 8, var5, 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class168.field2696 = -1;
            return;
        }
        class343.field5327 = var4[1];
        class164.field2640 = var4[2];
        class168.field2696 = var4[0];
        class252.field3942 = var4[4];
        class212.field3410 = var4[3];
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 132)
    public static void method690(int arg0) {
        field1840 = null;
        field1846 = null;
        field1825 = null;
        field1822 = null;
        field1836 = null;
        field1834 = null;
        if (arg0 <= 16) {
            field1827 = false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(JB)V", line = 147)
    public static final void method691(long arg0, byte arg1) {
        field1844++;
        try {
            if (arg1 != 8) {
                method689((byte) -70, true);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V", line = 172)
    public static final void method692(int arg0) {
        field1830++;
        int var1 = class112.field1966;
        int var2 = class343.field5328;
        int var3 = class42.field813;
        int var4 = 6116423;
        int var5 = class187.field3033;
        if (class249.field3893) {
            class115.method755(var1, var2, var3, var5, var4);
            class115.method755(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class115.method756(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        } else {
            class270.method1811(var1, var2, var3, var5, var4);
            class270.method1811(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class270.method1802(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        }
        class214.field3428.method2120(class330.field5059, var1 - arg0, var2 + 14, var4, -1);
        int var6 = class120.field2083;
        int var7 = class9.field196;
        for (int var8 = 0; var8 < class48.field999; var8++) {
            int var9 = (class48.field999 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class214.field3428.method2120(class50.method377(arg0 ^ 0x4407, var8), var1 + 3, var9, var10, 0);
        }
        class328.method2273(class42.field813, (byte) 123, class343.field5328, class187.field3033, class112.field1966);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Lon;", line = 230)
    public static final class327 method693(int arg0, int arg1) {
        field1826++;
        class327 var2 = (class327) class6.field133.method1881(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1566.method2036(34, arg0, (byte) 88);
        class327 var4 = new class327();
        if (var3 != null) {
            var4.method2267((byte) 74, arg0, new class202(var3));
        }
        class6.field133.method1880(var4, (long) arg0, arg1 ^ 0xFFFFFFC0);
        return arg1 == -2 ? var4 : (class327) null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V", line = 266)
    public static final void method694(Throwable arg0, String arg1, byte arg2) {
        field1839++;
        try {
            String var3 = "";
            if (arg2 > -79) {
                method693(1, -87);
            }
            if (arg0 != null) {
                var3 = class223.method1478(true, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class327.method2266(false, var3);
            String var4 = class33.method267(var3, ":", 17912, "%3a");
            String var5 = class33.method267(var4, "@", 17912, "%40");
            String var6 = class33.method267(var5, "&", 17912, "%26");
            String var7 = class33.method267(var6, "#", 17912, "%23");
            if (class224.field3528.field2139 == null) {
                return;
            }
            class107 var8 = class224.field3528.method821(new URL(class224.field3528.field2139.getCodeBase(), "clienterror.ws?c=" + class252.field3951 + "&u=" + class186.field3023 + "&v1=" + class124.field2133 + "&v2=" + class124.field2151 + "&e=" + var7), -4);
            while (var8.field1852 == 0) {
                class127.method843(-69, 1L);
            }
            if (var8.field1852 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1853;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
