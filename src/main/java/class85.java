import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 extends class24 {

    @OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lkc;")
    private static class67 field1997 = class19.method144("red:", 97);

    @OriginalMember(owner = "client!nc", name = "tb", descriptor = "Lkc;")
    public static class67 field1999 = field1997;

    @OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lkc;")
    private static class67 field2003 = class19.method144(" has logged in)3", 79);

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lkc;")
    public static class67 field1995 = field2003;

    @OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lkc;")
    public static class67 field2006 = class19.method144("Registrierter Benutzer", 126);

    @OriginalMember(owner = "client!nc", name = "zb", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!nc", name = "Db", descriptor = "Lkc;")
    public static class67 field2009 = class19.method144("(U(Y", 123);

    @OriginalMember(owner = "client!nc", name = "Gb", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!nc", name = "Bb", descriptor = "Lkc;")
    public static class67 field2007 = class19.method144("RuneScape wurde aktualisiert(Q", 117);

    @OriginalMember(owner = "client!nc", name = "Eb", descriptor = "Z")
    public static boolean field2010 = false;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!nc", name = "sb", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!nc", name = "ub", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!nc", name = "vb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!nc", name = "Cb", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!nc", name = "Fb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lac;")
    public static class4 field2004;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V", line = 10)
    public static final void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2000++;
        if (arg2 != 466) {
            return;
        }
        class54 var10 = null;
        for (class54 var11 = (class54) class49.field1174.method83(64); var11 != null; var11 = (class54) class49.field1174.method81(-79)) {
            if (var11.field1309 == arg1 && var11.field1287 == arg6 && var11.field1294 == arg4 && var11.field1299 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class54();
            var10.field1287 = arg6;
            var10.field1309 = arg1;
            var10.field1299 = arg0;
            var10.field1294 = arg4;
            class77.method619(96, var10);
            class49.field1174.method95((byte) 65, var10);
        }
        var10.field1292 = arg8;
        var10.field1288 = arg7;
        var10.field1302 = arg9;
        var10.field1301 = arg3;
        var10.field1286 = arg5;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V", line = 57)
    public static void method656(int arg0) {
        field2003 = null;
        field1997 = null;
        field1999 = null;
        field2004 = null;
        field2009 = null;
        field1995 = null;
        field2007 = null;
        if (arg0 != -9092) {
            method657(-12);
        }
        field2006 = null;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)Lfd;", line = 110)
    public final class39 method190(byte arg0) {
        if (arg0 == -93) {
            field1996++;
            return class55.method440(this.field1998, arg0 + 21560).method1010(true, arg0 + 21008, this.field2008);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "(I)V", line = 134)
    public static final void method657(int arg0) {
        field2011++;
        if (class75.field1796 != 0) {
            return;
        }
        class109.field2471[0] = class94.field2134;
        class55.field1323 = 1;
        class69.field1650[0] = 1006;
        if (class59.field1387 != -1) {
            class111.field2547 = -1;
            class71.field1677 = -1;
            class90.method695(class59.field1387, 765, 0, 503, 0, 0, (byte) -84, class138.field3298, class80.field1889);
            class115.field2716 = class111.field2547;
            class21.field438 = class71.field1677;
            return;
        }
        boolean var1 = false;
        class73.method595(-101);
        class111.field2547 = -1;
        class71.field1677 = -1;
        if (class138.field3298 > 4 && class80.field1889 > 4 && class138.field3298 < 516 && class80.field1889 < 338) {
            if (class96.field2163 == -1) {
                class38.method314(1);
            } else {
                class90.method695(class96.field2163, 516, 0, 338, 4, 4, (byte) -84, class138.field3298, class80.field1889);
            }
        }
        if (arg0 != 453) {
            method656(-95);
        }
        class21.field438 = class71.field1677;
        class71.field1677 = -1;
        class115.field2716 = class111.field2547;
        class111.field2547 = -1;
        if (class138.field3298 > 553 && class80.field1889 > 205 && class138.field3298 < 743 && class80.field1889 < 466) {
            if (class114.field2671 != -1) {
                class90.method695(class114.field2671, 743, 1, 466, 205, 553, (byte) -84, class138.field3298, class80.field1889);
            } else if (class122.field2894[class131.field3089] != -1) {
                class90.method695(class122.field2894[class131.field3089], 743, 1, 466, 205, 553, (byte) -84, class138.field3298, class80.field1889);
            }
        }
        if (class71.field1677 != class5.field97) {
            class5.field97 = class71.field1677;
            class121.field2849 = true;
        }
        if (class73.field1704 != class111.field2547) {
            class121.field2849 = true;
            class73.field1704 = class111.field2547;
        }
        class111.field2547 = -1;
        class71.field1677 = -1;
        if (class138.field3298 > 17 && class80.field1889 > 357 && class138.field3298 < 496 && class80.field1889 < 453) {
            if (class63.field1487 != -1) {
                class90.method695(class63.field1487, 496, 2, 453, 357, 17, (byte) -84, class138.field3298, class80.field1889);
            } else if (class49.field1177 != -1) {
                class90.method695(class49.field1177, 496, 3, 453, 357, 17, (byte) -84, class138.field3298, class80.field1889);
            } else if (class80.field1889 < 434 && class138.field3298 < 426) {
                class109.method829(class138.field3298 - 17, (byte) 106, class80.field1889 - 357);
            }
        }
        if ((class63.field1487 != -1 || class49.field1177 != -1) && class71.field1677 != class44.field1069) {
            class44.field1069 = class71.field1677;
            class138.field3304 = true;
        }
        if ((class63.field1487 != -1 || class49.field1177 != -1) && class140.field3357 != class111.field2547) {
            class140.field3357 = class111.field2547;
            class138.field3304 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class55.field1323 - 1; var2++) {
                if (class69.field1650[var2] < 1000 && class69.field1650[var2 + 1] > 1000) {
                    class67 var3 = class109.field2471[var2];
                    class109.field2471[var2] = class109.field2471[var2 + 1];
                    var1 = false;
                    class109.field2471[var2 + 1] = var3;
                    int var4 = class69.field1650[var2];
                    class69.field1650[var2] = class69.field1650[var2 + 1];
                    class69.field1650[var2 + 1] = var4;
                    int var5 = class71.field1698[var2];
                    class71.field1698[var2] = class71.field1698[var2 + 1];
                    class71.field1698[var2 + 1] = var5;
                    int var6 = class65.field1538[var2];
                    class65.field1538[var2] = class65.field1538[var2 + 1];
                    class65.field1538[var2 + 1] = var6;
                    int var7 = class29.field615[var2];
                    class29.field615[var2] = class29.field615[var2 + 1];
                    class29.field615[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLac;)V", line = 292)
    public static final void method658(byte arg0, class4 arg1) {
        class54.field1282 = arg1;
        field1994++;
        if (arg0 >= -32) {
            method659(1, 82, -119);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z", line = 311)
    public static final boolean method659(int arg0, int arg1, int arg2) {
        field2001++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (~arg0 <= arg2 && arg0 <= 8) {
            arg0 = 4;
        }
        class106 var3 = class2.method12(arg1, arg2 + 21882);
        return var3.method816(arg0, (byte) -125);
    }
}
