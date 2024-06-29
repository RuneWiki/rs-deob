import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1898 = 0;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
    public static int[] field1909 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lqf;")
    private static class117 field1908 = class72.method514(119, "Error connecting to server)3");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lqf;")
    public static class117 field1899 = field1908;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZBLjb;ILjb;)Lg;")
    public static final class43 method648(boolean arg0, byte arg1, class64 arg2, int arg3, class64 arg4) {
        field1904++;
        int var5 = 8 / ((arg1 - 11) / 53);
        boolean var6 = true;
        int[] var7 = arg4.method457(arg3, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg4.method441(arg3, var7[var8], -25850);
            if (var9 == null) {
                var6 = false;
            } else {
                int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
                byte[] var11;
                if (arg0) {
                    var11 = arg2.method441(0, var10, -25850);
                } else {
                    var11 = arg2.method441(var10, 0, -25850);
                }
                if (var11 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class43(arg4, arg2, arg3, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lv;Z)V")
    public static final void method649(class143 arg0, boolean arg1) {
        field1905++;
        if (!arg1) {
            field1900 = -60;
        }
        if (class133.field3142 != 1) {
            return;
        }
        short var2 = 280;
        if (class153.field3788 >= var2 && class153.field3788 <= var2 + 14 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(0, 20041, 0);
            return;
        }
        if (class153.field3788 >= var2 + 15 && class153.field3788 <= var2 + 80 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(0, 20041, 1);
            return;
        }
        short var3 = 390;
        if (class153.field3788 >= var3 && var3 + 14 >= class153.field3788 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(1, 20041, 0);
            return;
        }
        if (var3 + 15 <= class153.field3788 && class153.field3788 <= var3 + 80 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(1, 20041, 1);
            return;
        }
        short var4 = 500;
        if (var4 <= class153.field3788 && class153.field3788 <= var4 + 14 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(2, 20041, 0);
            return;
        }
        if (var4 + 15 <= class153.field3788 && class153.field3788 <= var4 + 80 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(2, 20041, 1);
            return;
        }
        short var5 = 610;
        if (var5 <= class153.field3788 && var5 + 14 >= class153.field3788 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(3, 20041, 0);
            return;
        }
        if (var5 + 15 <= class153.field3788 && class153.field3788 <= var5 + 80 && class102.field2462 >= 4 && class102.field2462 <= 18) {
            class44.method308(3, 20041, 1);
            return;
        }
        if (class153.field3788 >= 708 && class102.field2462 >= 4 && class153.field3788 <= 758 && class102.field2462 <= 20) {
            class26.field507 = false;
            class100.field2425.method676(0, 0);
            class76.field1667.method676(382, 0);
            class134.field3208.method951(382 - class134.field3208.field2835 / 2, 18);
            return;
        }
        if (class68.field1411 == -1) {
            return;
        }
        class32 var6 = class20.field336[class68.field1411];
        if (class146.field3569 == var6.field684) {
            byte[] var7 = class73.method530((byte) -83, new class117[] { var6.field682, class5.field89 }).method940(123);
            class122.field2906 = new String(var7, 0, var7.length);
            class26.field507 = false;
            class56.field1152 = var6.field697;
            if (class89.field2135 != 0) {
                class85.field1938 = 43594;
                class125.field2943 = 43594;
                class89.field2135 = 0;
                class16.field248 = 443;
            }
            class100.field2425.method676(0, 0);
            class76.field1667.method676(382, 0);
            class134.field3208.method951(382 - class134.field3208.field2835 / 2, 18);
            return;
        }
        class117 var8 = class73.method530((byte) -83, new class117[] { class132.field3136, var6.field682, class5.field89, class141.field3411, class58.field1188, class79.method614(15591, class20.field334 ? 1 : 0), class65.field1366, class79.method614(15591, class19.field299), class104.field2505, class79.method614(15591, class29.field567) });
        try {
            arg0.getAppletContext().showDocument(var8.method916(24861), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method650(byte arg0) {
        field1909 = null;
        field1899 = null;
        field1908 = null;
        if (arg0 < 25) {
            field1906 = 77;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method651(int arg0) {
        field1910++;
        for (int var1 = 0; var1 < class91.field2225; var1++) {
            int var2 = class56.field1151[var1];
            class58 var3 = class72.field1533[var2];
            int var4 = class96.field2338.method570((byte) 123);
            if ((var4 & 0x40) != 0) {
                var3.field2014 = class96.field2338.method589((byte) -128);
                int var5 = class96.field2338.method572(120);
                var3.field1974 = (var5 & 0xFFFF) + class43.field856;
                var3.field1977 = 0;
                if (var3.field2014 == 65535) {
                    var3.field2014 = -1;
                }
                var3.field1981 = var5 >> 16;
                var3.field1961 = 0;
                if (var3.field1974 > class43.field856) {
                    var3.field1961 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1172 = class99.method776(9, class96.field2338.method597(arg0 + 120));
                var3.field2019 = var3.field1172.field3190;
                var3.field1946 = var3.field1172.field3177;
                var3.field1956 = var3.field1172.field3182;
                var3.field1954 = var3.field1172.field3165;
                var3.field2009 = var3.field1172.field3199;
                var3.field1991 = var3.field1172.field3203;
                var3.field1975 = var3.field1172.field3197;
                var3.field1982 = var3.field1172.field3198;
                var3.field1972 = var3.field1172.field3170;
            }
            if ((var4 & 0x20) != 0) {
                var3.field2022 = class96.field2338.method589((byte) -128);
                var3.field1985 = class96.field2338.method597(35);
            }
            if ((var4 & 0x4) != 0) {
                int var6 = class96.field2338.method559((byte) -73);
                int var7 = class96.field2338.method559((byte) -73);
                var3.method688(var7, class43.field856, (byte) 102, var6);
                var3.field1990 = class43.field856 + 300;
                var3.field1984 = class96.field2338.method570((byte) 123);
                var3.field1945 = class96.field2338.method596(arg0 ^ 0x71);
            }
            if ((var4 & 0x10) != 0) {
                var3.field1996 = class96.field2338.method587(false);
                if (var3.field1996 == 65535) {
                    var3.field1996 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class96.field2338.method551(arg0 + 122);
                int var9 = class96.field2338.method551(123);
                var3.method688(var9, class43.field856, (byte) 102, var8);
                var3.field1990 = class43.field856 + 300;
                var3.field1984 = class96.field2338.method559((byte) -73);
                var3.field1945 = class96.field2338.method551(117);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1957 = class96.field2338.method577(-110);
                var3.field2001 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class96.field2338.method574((byte) -109);
                int var11 = class96.field2338.method559((byte) -73);
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var3.field2017 == var10 && var10 != -1) {
                    int var12 = class130.method1013(var10, arg0 ^ 0xFFFFFF83).field2319;
                    if (var12 == 1) {
                        var3.field2010 = 0;
                        var3.field1994 = var11;
                        var3.field2015 = 0;
                        var3.field1952 = 0;
                    }
                    if (var12 == 2) {
                        var3.field2010 = 0;
                    }
                } else if (var10 == -1 || var3.field2017 == -1 || class130.method1013(var10, -111).field2342 >= class130.method1013(var3.field2017, -120).field2342) {
                    var3.field1952 = 0;
                    var3.field1955 = var3.field1963;
                    var3.field1994 = var11;
                    var3.field2015 = 0;
                    var3.field2017 = var10;
                    var3.field2010 = 0;
                }
            }
        }
        if (arg0 != 2) {
            field1908 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)I")
    public static final int method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg3 - class12.field177[arg4 * 1024 / arg2] >> 1;
        field1912++;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lm;)V")
    public class83(class83 arg0) {
        this.field1902 = arg0.field1902;
        this.field1903 = arg0.field1903;
        this.field1907 = arg0.field1907;
        this.field1914 = arg0.field1914;
    }
}
