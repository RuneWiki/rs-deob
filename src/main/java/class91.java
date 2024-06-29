import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class91 {

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lm;")
    private class72 field2009 = new class72();

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lda;")
    private class20 field2015 = new class20();

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    private int field2014;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lld;")
    private class70 field2012;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[I")
    public static int[] field1998 = new int[50];

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lec;")
    public static class28 field2007 = class28.method210(-46, "flash3:");

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lec;")
    public static class28 field1999 = class28.method210(-46, "::fpsoff");

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lvb;")
    public static class122 field2000;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method659(int arg0) {
        while (true) {
            class72 var2 = this.field2015.method138(false);
            if (var2 == null) {
                if (arg0 != 1000) {
                    this.field2009 = null;
                }
                this.field2014 = this.field2011;
                field2008++;
                return;
            }
            var2.method319((byte) -126);
            var2.method569(false);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)Lm;")
    public final class72 method660(int arg0, long arg1) {
        field2010++;
        class72 var4 = (class72) this.field2012.method551(arg1, arg0 + 25240);
        if (var4 != null) {
            this.field2015.method131(var4, arg0 + 2);
        }
        if (arg0 != -2) {
            this.method659(78);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method661(int arg0) {
        field1997++;
        try {
            if (class12.field204 == arg0) {
                class106.field2239 = null;
                class129.field2773 = false;
                class90.field1973 = null;
                class45.field964 = 0;
                class12.field204 = 1;
            }
            if (class12.field204 == 1) {
                if (class90.field1973 == null) {
                    class90.field1973 = class30.field652.method628(class70.field1566, (byte) -125);
                }
                if (class90.field1973.field2157 == 2) {
                    throw new IOException();
                }
                if (class90.field1973.field2157 == 1) {
                    class106.field2239 = new class18((Socket) class90.field1973.field2154, class30.field652);
                    class90.field1973 = null;
                    class12.field204 = 2;
                }
            }
            if (class12.field204 == 2) {
                long var1 = class30.field641 = class21.field459.method237(arg0 ^ 0xF0);
                class5.field85.field2554 = 0;
                class5.field85.method888(14, -102);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class5.field85.method888(var3, arg0 + 56);
                class106.field2239.method110(class5.field85.field2531, 0, (byte) -77, 2);
                class12.field204 = 3;
                class56.field1282.field2554 = 0;
            }
            if (class12.field204 == 3) {
                int var4 = class106.field2239.method101(true);
                if (var4 != 0) {
                    class69.method542(22858, var4);
                    return;
                }
                class56.field1282.field2554 = 0;
                class12.field204 = 4;
            }
            if (class12.field204 == 4) {
                if (class56.field1282.field2554 < 8) {
                    int var5 = class106.field2239.method106(-1);
                    if (8 - class56.field1282.field2554 < var5) {
                        var5 = 8 - class56.field1282.field2554;
                    }
                    if (var5 > 0) {
                        class106.field2239.method112(-1527, class56.field1282.field2554, var5, class56.field1282.field2531);
                        class56.field1282.field2554 += var5;
                    }
                }
                if (class56.field1282.field2554 == 8) {
                    class56.field1282.field2554 = 0;
                    class32.field682 = class56.field1282.method890((byte) 68);
                    class12.field204 = 5;
                }
            }
            if (class12.field204 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class32.field682 >> 32), (int) class32.field682 };
                class5.field85.field2554 = 0;
                class5.field85.method888(10, 59);
                class5.field85.method898(var6[0], -1202576);
                class5.field85.method898(var6[1], -1202576);
                class5.field85.method898(var6[2], -1202576);
                class5.field85.method898(var6[3], -1202576);
                class5.field85.method898(class30.field652.field1872, -1202576);
                class5.field85.method854(false, class21.field459.method237(240));
                class5.field85.method867((byte) 112, class21.field477);
                class5.field85.method860(class30.field647, class32.field675, 17460);
                class125.field2716.field2554 = 0;
                if (class114.field2444 == 40) {
                    class125.field2716.method888(18, 123);
                } else {
                    class125.field2716.method888(16, -122);
                }
                class125.field2716.method888(class5.field85.field2554 + 53, 99);
                class125.field2716.method898(402, arg0 ^ 0xFFEDA670);
                class125.field2716.method888(class72.field1591 ? 1 : 0, arg0 - 126);
                class125.field2716.method898(class56.field1285.field2616, arg0 ^ 0xFFEDA670);
                class125.field2716.method898(class4.field61.field2616, -1202576);
                class125.field2716.method898(class23.field522.field2616, arg0 ^ 0xFFEDA670);
                class125.field2716.method898(class55.field1258.field2616, -1202576);
                class125.field2716.method898(class117.field2491.field2616, -1202576);
                class125.field2716.method898(class7.field101.field2616, arg0 - 1202576);
                class125.field2716.method898(class61.field1344.field2616, -1202576);
                class125.field2716.method898(class95.field2094.field2616, arg0 ^ 0xFFEDA670);
                class125.field2716.method898(class46.field1044.field2616, -1202576);
                class125.field2716.method898(class109.field2309.field2616, -1202576);
                class125.field2716.method898(class72.field1596.field2616, -1202576);
                class125.field2716.method898(client.field380.field2616, -1202576);
                class125.field2716.method870(class5.field85.field2554, 0, class5.field85.field2531, (byte) -109);
                class106.field2239.method110(class125.field2716.field2531, 0, (byte) -77, class125.field2716.field2554);
                class5.field85.method156(arg0 + 6, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class56.field1282.method156(arg0 ^ 0x6, var6);
                class12.field204 = 6;
            }
            if (class12.field204 == 6 && class106.field2239.method106(-1) > 0) {
                int var8 = class106.field2239.method101(true);
                if (var8 == 21 && class114.field2444 == 20) {
                    class12.field204 = 7;
                } else if (var8 == 2) {
                    class12.field204 = 9;
                } else if (var8 == 15 && class114.field2444 == 40) {
                    class37.method308(120);
                    return;
                } else if (var8 == 23 && class123.field2686 < 1) {
                    class12.field204 = 0;
                    class123.field2686++;
                } else {
                    class69.method542(22858, var8);
                    return;
                }
            }
            if (class12.field204 == 7 && class106.field2239.method106(arg0 - 1) > 0) {
                class34.field781 = class106.field2239.method101(true) * 60 + 180;
                class12.field204 = 8;
            }
            if (class12.field204 == 8) {
                class45.field964 = 0;
                class25.method175(class94.field2063, class68.method537(arg0 ^ 0x1, new class28[] { class40.field870, class5.method25(6366, class34.field781 / 60) }), -126);
                if (--class34.field781 <= 0) {
                    class12.field204 = 0;
                }
            } else {
                if (class12.field204 == 9 && class106.field2239.method106(-1) >= 8) {
                    class32.field691 = class106.field2239.method101(true);
                    class63.field1410 = class106.field2239.method101(true) == 1;
                    class32.field674 = class106.field2239.method101(true);
                    class32.field674 <<= 0x8;
                    class32.field674 += class106.field2239.method101(true);
                    class96.field2130 = class106.field2239.method101(true);
                    class106.field2239.method112(arg0 - 1527, 0, 1, class56.field1282.field2531);
                    class56.field1282.field2554 = 0;
                    class25.field545 = class56.field1282.method154(arg0 ^ 0xFFFFAA46);
                    class106.field2239.method112(-1527, 0, 2, class56.field1282.field2531);
                    class56.field1282.field2554 = 0;
                    class76.field1692 = class56.field1282.method903(arg0 ^ 0x2);
                    class12.field204 = 10;
                }
                if (class12.field204 != 10) {
                    class45.field964++;
                    if (class45.field964 > 2000) {
                        if (class123.field2686 < 1) {
                            class12.field204 = 0;
                            class123.field2686++;
                            if (class70.field1566 == class49.field1143) {
                                class70.field1566 = class95.field2114;
                            } else {
                                class70.field1566 = class49.field1143;
                            }
                        } else {
                            class69.method542(22858, -3);
                        }
                    }
                } else if (class106.field2239.method106(arg0 - 1) >= class76.field1692) {
                    class56.field1282.field2554 = 0;
                    class106.field2239.method112(-1527, 0, class76.field1692, class56.field1282.field2531);
                    class17.method97((byte) 16);
                    class90.field1994 = -1;
                    class1.method2(true, false);
                    class25.field545 = -1;
                }
            }
        } catch (IOException var9) {
            if (class123.field2686 < 1) {
                if (class70.field1566 == class49.field1143) {
                    class70.field1566 = class95.field2114;
                } else {
                    class70.field1566 = class49.field1143;
                }
                class12.field204 = 0;
                class123.field2686++;
            } else {
                class69.method542(22858, -2);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method662(int arg0, String arg1) throws ClassNotFoundException {
        field2013++;
        if (arg0 != -23097) {
            method661(-45);
        }
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1998 = null;
        if (arg0 < 40) {
            method663(88);
        }
        field2007 = null;
        field1999 = null;
        field2000 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static final void method664(byte arg0) {
        int var1 = class28.field625 * 128 + 64;
        field2001++;
        int var2 = class90.field1990 * 128 + 64;
        int var3 = class18.method107(var2, var1, arg0 ^ 0xFFFFF7FE, class122.field2657) - class79.field1838;
        if (class88.field1966 < var1) {
            class88.field1966 += (var1 - class88.field1966) * class103.field2203 / 1000 + class56.field1300;
            if (var1 < class88.field1966) {
                class88.field1966 = var1;
            }
        }
        if (class94.field2079 < var2) {
            class94.field2079 += class56.field1300 + (var2 - class94.field2079) * class103.field2203 / 1000;
            if (class94.field2079 > var2) {
                class94.field2079 = var2;
            }
        }
        if (class94.field2079 > var2) {
            class94.field2079 -= (class94.field2079 - var2) * class103.field2203 / 1000 + class56.field1300;
            if (class94.field2079 < var2) {
                class94.field2079 = var2;
            }
        }
        if (class88.field1966 > var1) {
            class88.field1966 -= (class88.field1966 - var1) * class103.field2203 / 1000 + class56.field1300;
            if (class88.field1966 < var1) {
                class88.field1966 = var1;
            }
        }
        int var4 = class93.field2049 * 128 + 64;
        int var5 = class20.field436 * 128 + 64;
        if (class64.field1423 < var3) {
            class64.field1423 += (var3 - class64.field1423) * class103.field2203 / 1000 + class56.field1300;
            if (class64.field1423 > var3) {
                class64.field1423 = var3;
            }
        }
        if (class64.field1423 > var3) {
            class64.field1423 -= (class64.field1423 - var3) * class103.field2203 / 1000 + class56.field1300;
            if (class64.field1423 < var3) {
                class64.field1423 = var3;
            }
        }
        int var6 = class18.method107(var4, var5, -2049, class122.field2657) - class103.field2200;
        int var7 = var4 - class94.field2079;
        int var8 = var6 - class64.field1423;
        int var9 = var5 - class88.field1966;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var7) * -325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class12.field196;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class4.field72) {
            class4.field72 += (var11 - class4.field72) * class126.field2733 / 1000 + class127.field2749;
            if (var11 < class4.field72) {
                class4.field72 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (arg0 != 1) {
            return;
        }
        if (class4.field72 > var11) {
            class4.field72 -= (class4.field72 - var11) * class126.field2733 / 1000 + class127.field2749;
            if (var11 > class4.field72) {
                class4.field72 = var11;
            }
        }
        if (var13 > 0) {
            class12.field196 += class126.field2733 * var13 / 1000 + class127.field2749;
            class12.field196 &= 0x7FF;
        }
        if (var13 < 0) {
            class12.field196 -= -var13 * class126.field2733 / 1000 + class127.field2749;
            class12.field196 &= 0x7FF;
        }
        int var14 = var12 - class12.field196;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class12.field196 = var12;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V")
    public final void method665(long arg0, byte arg1) {
        field2006++;
        if (arg1 < 38) {
            this.field2012 = null;
        }
        class72 var4 = (class72) this.field2012.method551(arg0, 25238);
        if (var4 != null) {
            var4.method319((byte) -128);
            var4.method569(false);
            this.field2014++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLm;J)V")
    public final void method666(boolean arg0, class72 arg1, long arg2) {
        if (arg0) {
            this.field2014 = 15;
        }
        field2002++;
        if (this.field2014 == 0) {
            class72 var5 = this.field2015.method138(false);
            var5.method319((byte) -126);
            var5.method569(false);
            if (this.field2009 == var5) {
                class72 var6 = this.field2015.method138(false);
                var6.method319((byte) -128);
                var6.method569(arg0);
            }
        } else {
            this.field2014--;
        }
        this.field2012.method548(-68, arg2, arg1);
        this.field2015.method131(arg1, 0);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        this.field2011 = arg0;
        this.field2014 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2012 = new class70(var2);
    }
}
