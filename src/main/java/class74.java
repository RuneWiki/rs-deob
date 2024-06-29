import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class74 extends class19 {

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Lkc;")
    public static class67 field1752 = class19.method144("hitmarks", 114);

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "Lkc;")
    private static class67 field1756 = class19.method144("Hidden", 68);

    @OriginalMember(owner = "client!ld", name = "kb", descriptor = "Lkc;")
    private static class67 field1766 = class19.method144("Enter message to send to ", 110);

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lkc;")
    public static class67 field1760 = field1766;

    @OriginalMember(owner = "client!ld", name = "ib", descriptor = "Lkc;")
    public static class67 field1764 = field1756;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Lgd;")
    public static class44 field1751 = new class44(100);

    @OriginalMember(owner = "client!ld", name = "ob", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ld", name = "nb", descriptor = "Lbb;")
    public static class10 field1769 = new class10();

    @OriginalMember(owner = "client!ld", name = "tb", descriptor = "Lkc;")
    public static class67 field1775 = class19.method144("Wen m-Ochten Sie der Liste hinzuf-Ugen?", 95);

    @OriginalMember(owner = "client!ld", name = "rb", descriptor = "[I")
    public static int[] field1773 = new int[50];

    @OriginalMember(owner = "client!ld", name = "vb", descriptor = "Lkc;")
    private static class67 field1777 = class19.method144("Create a free account", 90);

    @OriginalMember(owner = "client!ld", name = "qb", descriptor = "Lkc;")
    public static class67 field1772 = field1777;

    @OriginalMember(owner = "client!ld", name = "sb", descriptor = "I")
    public static int field1774 = 5063219;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ld", name = "gb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ld", name = "hb", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ld", name = "jb", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!ld", name = "lb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ld", name = "mb", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ld", name = "ub", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ld", name = "wb", descriptor = "J")
    public static long field1778;

    @OriginalMember(owner = "client!ld", name = "pb", descriptor = "[I")
    public static int[] field1771;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 4)
    public static final void method599(int arg0) {
        field1761++;
        class12 var1 = class94.field2156;
        synchronized (class94.field2156) {
            class24.field505 = class7.field154;
            if (arg0 >= -118) {
                field1764 = null;
            }
            if (class85.field2005 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class75.field1792[var2] = false;
                }
                class85.field2005 = class54.field1284;
            } else {
                while (class85.field2005 != class54.field1284) {
                    int var3 = class108.field2461[class54.field1284];
                    class54.field1284 = class54.field1284 + 1 & 0x7F;
                    if (var3 < 0) {
                        class75.field1792[~var3] = false;
                    } else {
                        class75.field1792[var3] = true;
                    }
                }
            }
            class7.field154 = field1770;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILwd;I)V", line = 47)
    private final void method600(int arg0, class140 arg1, int arg2) {
        field1763++;
        if (arg2 == 1) {
            this.field1755 = arg1.method1072(99);
            this.field1759 = arg1.method1105(255);
            this.field1765 = arg1.method1105(255);
        }
        if (arg0 != 6186) {
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILwd;)V", line = 67)
    public final void method601(int arg0, class140 arg1) {
        if (arg0 >= -49) {
            return;
        }
        field1753++;
        while (true) {
            int var3 = arg1.method1105(255);
            if (var3 == 0) {
                return;
            }
            this.method600(6186, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JB)V", line = 97)
    public static final void method602(long arg0, byte arg1) {
        field1757++;
        if (arg0 == 0L) {
            return;
        }
        if (class128.field3003 >= 100) {
            class50.method412(class96.field2171, false, 0, class127.field2976);
            return;
        }
        class67 var3 = class137.method1065(arg0, (byte) -25).method528((byte) -26);
        for (int var4 = 0; var4 < class128.field3003; var4++) {
            if (class5.field112[var4] == arg0) {
                class50.method412(class63.method479(new class67[] { var3, class78.field1850 }, 0), false, 0, class127.field2976);
                return;
            }
        }
        int var5 = 0;
        if (arg1 < 11) {
            return;
        }
        while (class9.field188 > var5) {
            if (class31.field650[var5] == arg0) {
                class50.method412(class63.method479(new class67[] { class104.field2341, var3, class22.field489 }, 0), false, 0, class127.field2976);
                return;
            }
            var5++;
        }
        if (var3.method533(class69.field1640.field2329, (byte) -98)) {
            return;
        }
        class5.field112[class128.field3003++] = arg0;
        class121.field2849 = true;
        class54.field1295.method713(503, 163);
        class90.field2080++;
        class54.field1295.method1083((byte) -110, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)I", line = 178)
    public static final int method603(int arg0, int arg1, int arg2) {
        field1754++;
        int var3 = class12.method103(arg0 + arg1, (byte) -42, arg2 - 1) + class12.method103(arg0 - 1, (byte) -42, arg2 + 1) + class12.method103(arg0 - -1, (byte) -42, arg2 + -1) + class12.method103(arg0 + 1, (byte) -42, arg2 + 1);
        int var4 = class12.method103(arg0, (byte) -42, arg2 - 1) + class12.method103(arg0, (byte) -42, arg2 + 1) + class12.method103(arg0 - 1, (byte) -42, arg2) + class12.method103(arg0 + 1, (byte) -42, arg2);
        int var5 = class12.method103(arg0, (byte) -42, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLed;)Z", line = 193)
    public static final boolean method604(byte arg0, class33 arg1) {
        field1762++;
        int var2 = arg1.field764;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class42.field1036++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class44.method379(50, 0, 0, class63.method479(new class67[] { class46.field1120, class55.field1349[var2] }, 0), 0, class63.field1470, (byte) 42);
            class130.field3044++;
            class44.method379(44, 0, 0, class63.method479(new class67[] { class46.field1120, class55.field1349[var2] }, 0), 0, class75.field1784, (byte) 89);
            return true;
        }
        if (arg0 != 16) {
            method607(21, null);
        }
        if (var2 >= 401 && var2 <= 500) {
            class100.field2251++;
            class44.method379(28, 0, 0, class63.method479(new class67[] { class46.field1120, arg1.field737 }, 0), 0, class63.field1470, (byte) 110);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)V", line = 238)
    public static void method605(int arg0) {
        field1769 = null;
        field1756 = null;
        field1764 = null;
        field1772 = null;
        field1773 = null;
        field1777 = null;
        field1752 = null;
        if (arg0 != 701) {
            field1752 = null;
        }
        field1760 = null;
        field1771 = null;
        field1751 = null;
        field1775 = null;
        field1766 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLhd;)V", line = 265)
    public static final void method606(boolean arg0, class50 arg1) {
        arg1.field1233 = arg1.field1254;
        field1767++;
        if (arg1.field1201 == 0) {
            arg1.field1189 = 0;
            return;
        }
        if (arg1.field1216 != -1 && arg1.field1207 == 0) {
            class112 var2 = class70.method576(12, arg1.field1216);
            if (arg1.field1246 > 0 && var2.field2582 == 0) {
                arg1.field1189++;
                return;
            }
            if (arg1.field1246 <= 0 && var2.field2572 == 0) {
                arg1.field1189++;
                return;
            }
        }
        int var3 = arg1.field1260;
        int var4 = arg1.field1190;
        int var5 = arg1.field1263[arg1.field1201 - 1] * 128 + arg1.field1208 * 64;
        int var6 = arg1.field1198[arg1.field1201 - 1] * 128 + arg1.field1208 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg1.field1190 = var5;
            arg1.field1260 = var6;
            return;
        }
        if (var3 < var6) {
            if (var4 < var5) {
                arg1.field1218 = 1280;
            } else if (var5 < var4) {
                arg1.field1218 = 1792;
            } else {
                arg1.field1218 = 1536;
            }
        } else if (var6 >= var3) {
            if (var4 < var5) {
                arg1.field1218 = 1024;
            } else if (var5 < var4) {
                arg1.field1218 = 0;
            }
        } else if (var4 < var5) {
            arg1.field1218 = 768;
        } else if (var4 > var5) {
            arg1.field1218 = 256;
        } else {
            arg1.field1218 = 512;
        }
        int var7 = arg1.field1218 - arg1.field1199 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = 4;
        if (arg1.field1218 != arg1.field1199 && arg1.field1200 == -1 && arg1.field1249 != 0) {
            var8 = 2;
        }
        int var9 = arg1.field1204;
        if (arg1.field1201 > 2) {
            var8 = 6;
        }
        if (arg1.field1201 > 3) {
            var8 = 8;
        }
        if (arg1.field1189 > 0 && arg1.field1201 > 1) {
            var8 = 8;
            arg1.field1189--;
        }
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg1.field1237;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg1.field1221;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg1.field1231;
        }
        if (var9 == -1) {
            var9 = arg1.field1237;
        }
        if (!arg0) {
            field1776 = 47;
        }
        arg1.field1233 = var9;
        if (arg1.field1226[arg1.field1201 - 1]) {
            var8 <<= 0x1;
        }
        if (var3 < var6) {
            arg1.field1260 += var8;
            if (var6 < arg1.field1260) {
                arg1.field1260 = var6;
            }
        } else if (var6 < var3) {
            arg1.field1260 -= var8;
            if (var6 > arg1.field1260) {
                arg1.field1260 = var6;
            }
        }
        if (var8 >= 8 && arg1.field1237 == arg1.field1233 && arg1.field1196 != -1) {
            arg1.field1233 = arg1.field1196;
        }
        if (var4 < var5) {
            arg1.field1190 += var8;
            if (arg1.field1190 > var5) {
                arg1.field1190 = var5;
            }
        } else if (var5 < var4) {
            arg1.field1190 -= var8;
            if (arg1.field1190 < var5) {
                arg1.field1190 = var5;
            }
        }
        if (arg1.field1260 != var6 || arg1.field1190 != var5) {
            return;
        }
        arg1.field1201--;
        if (arg1.field1246 > 0) {
            arg1.field1246--;
            return;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILkc;)V", line = 452)
    public static final void method607(int arg0, class67 arg1) {
        field1768++;
        if (arg1 == null || arg1.method539(arg0 + 31550) == 0) {
            class141.field3388 = 0;
            return;
        }
        class67 var2 = arg1;
        if (arg0 != -28932) {
            field1777 = null;
        }
        class67[] var3 = new class67[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method514(32035, 32);
            if (var5 == -1) {
                class67 var6 = var2.method525((byte) 56);
                if (var6.method539(2618) > 0) {
                    var3[var4++] = var6.method527(-32632);
                }
                class141.field3388 = 0;
                label51: for (int var7 = 0; var7 < class135.field3248; var7++) {
                    class131 var8 = class55.method440(var7, 21467);
                    if (var8.field3085 == -1 && var8.field3103 != null) {
                        class67 var9 = var8.field3103.method527(arg0 ^ 0xE74);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method520(var3[var10], -10874) == -1) {
                                continue label51;
                            }
                        }
                        class78.field1846[class141.field3388] = var9;
                        class126.field2941[class141.field3388] = var7;
                        class141.field3388++;
                        if (class78.field1846.length <= class141.field3388) {
                            return;
                        }
                    }
                }
                return;
            }
            class67 var11 = var2.method529(0, var5, 17804).method525((byte) 56);
            if (var11.method539(2618) > 0) {
                var3[var4++] = var11.method527(-32632);
            }
            var2 = var2.method531(13401, var5 + 1);
        }
    }
}
