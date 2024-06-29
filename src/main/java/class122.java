import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class122 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1904 = new String[100];

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
    public static boolean field1907 = false;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 7)
    public static void method882(boolean arg0) {
        if (!arg0) {
            field1904 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 25)
    public static final void method883(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (int var1 = 0; var1 < class230.field3476; var1++) {
            int var2 = class278.field4234[var1];
            class69 var3 = class187.field2788[var2];
            int var4 = class207.field3137.method1787(false);
            if ((var4 & 0x10) != 0) {
                var4 += class207.field3137.method1787(false) << 8;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class207.field3137.method1790(arg0 ^ 0xFFFFFF7F);
                int var6 = class207.field3137.method1790(128);
                var3.method700(var5, class304.field4641, arg0 ^ 0x71, var6);
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class207.field3137.method1849(105);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class207.field3137.method1835(false);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var9[var11] = var12;
                    var8[var11] = class207.field3137.method1787(false);
                    var10[var11] = class207.field3137.method1838((byte) 124);
                }
                class297.method2070(4, var9, var8, var10, var3);
            }
            if ((var4 & 0x4) != 0) {
                int var13 = class207.field3137.method1838((byte) -37);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class207.field3137.method1790(128);
                class159.method1126(var3, var14, arg0 - 116, var13);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field914.method389(false)) {
                    class38.method265(var3, -93);
                }
                var3.method458(arg0 ^ 0xFFFFFFEF, class235.method1615(class207.field3137.method1830((byte) -77), arg0 + 1129));
                var3.method698(var3.field914.field759, (byte) -76);
                var3.field1546 = var3.field914.field763;
                if (var3.field914.method389(false)) {
                    class5.method10(0, (byte) -128, var3.field1541[0], (class195) null, var3.field1516[0], class180.field2697, (class22) null, var3);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var15 = class207.field3137.method1830((byte) -77);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class207.field3137.method1788(18914);
                boolean var17 = true;
                if (var15 != -1 && var3.field1490 != -1 && class72.method468(class8.method31(var15, (byte) -126).field615, 48).field4158 < class72.method468(class8.method31(var3.field1490, (byte) -126).field615, arg0 + 15).field4158) {
                    var17 = false;
                }
                if (var17) {
                    var3.field1490 = var15;
                    var3.field1529 = 0;
                    var3.field1550 = 1;
                    var3.field1514 = class304.field4641 + (var16 & 0xFFFF);
                    var3.field1561 = var16 >> 16;
                    var3.field1563 = 0;
                    if (class304.field4641 < var3.field1514) {
                        var3.field1563 = -1;
                    }
                    if (var3.field1490 != -1 && class304.field4641 == var3.field1514) {
                        int var18 = class8.method31(var3.field1490, (byte) -126).field615;
                        if (var18 != -1) {
                            class272 var19 = class72.method468(var18, 32);
                            if (var19 != null && var19.field4160 != null) {
                                class167.method1170(var3.field1505, var19, 0, arg0 ^ 0x3F, var3.field1566, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var20 = class207.field3137.method1787(false);
                int var21 = class207.field3137.method1787(false);
                var3.method700(var20, class304.field4641, -118, var21);
                var3.field1532 = class304.field4641 + 300;
                var3.field1503 = class207.field3137.method1787(false);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1499 = class207.field3137.method1830((byte) -77);
                var3.field1545 = class207.field3137.method1835(false);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1508 = class207.field3137.method1794(-115);
                if (var3.field1508 == 65535) {
                    var3.field1508 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1526 = class207.field3137.method1801(arg0 ^ 0x7565);
                var3.field1511 = 100;
            }
        }
        field1910++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 209)
    public static final void method884(boolean arg0, String arg1) {
        field1911++;
        int var2 = class318.method2181((byte) -104, arg1);
        if (var2 != -1 && !arg0) {
            class243.method1651(true, class155.field2325.field2004[var2], class155.field2325.field2006[var2]);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 242)
    public static final void method885(byte arg0) {
        field1902++;
        if (class176.field2610 || class252.field3769 == 2) {
            return;
        }
        try {
            class25.method168("tbrefresh", class142.field2150, 118);
            if (arg0 >= -36) {
                field1909 = -58;
            }
        } catch (Throwable var2) {
        }
    }
}
