import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
    public boolean field1990 = true;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field1991;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lwd;")
    private static class150 field2000 = class2.method9(true, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lwd;")
    public static class150 field1987 = field2000;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lwd;")
    public static class150 field2004 = class2.method9(true, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lld;")
    public static class80 field1986 = new class80();

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lwd;")
    private static class150 field2007 = class2.method9(true, "Cancel");

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lwd;")
    public static class150 field2008 = class2.method9(true, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lwd;")
    public static class150 field2011 = class2.method9(true, "(U4");

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lwd;")
    public static class150 field2006 = field2007;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lwd;")
    private static class150 field2013 = class2.method9(true, "On");

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Lwd;")
    public static class150 field2014 = field2013;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lwd;")
    private static class150 field2012 = class2.method9(true, "Type");

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Lwd;")
    public static class150 field2010 = field2012;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lqd;")
    public static class114 field1995;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Lsd;")
    public static class126 field2015;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[I")
    public static int[] field2009;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)I")
    public static final int method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
        }
        field1997++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg0;
        } else {
            int var9 = 13 % ((-arg3 - 10) / 60);
            return 7 + 1 - arg2 - arg4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method599(boolean arg0) {
        field1993++;
        if (!arg0) {
            method605((byte) -128, 34, -11, -76);
        }
        while (class121.field2783.method973(5618, class76.field1870) >= 27) {
            int var1 = class121.field2783.method967(15, false);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class37.field1013[var1] == null) {
                class37.field1013[var1] = new class18();
                var2 = true;
            }
            class18 var3 = class37.field1013[var1];
            class101.field2309[class133.field3128++] = var1;
            var3.field2965 = class11.field280;
            int var4 = class121.field2783.method967(1, false);
            int var5 = class121.field2783.method967(1, false);
            if (var5 == 1) {
                class17.field468[class111.field2577++] = var1;
            }
            int var6 = class121.field2783.method967(5, false);
            int var7 = class121.field2783.method967(5, false);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.field478 = class24.method192(class121.field2783.method967(13, false), (byte) -99);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class9.field221[class121.field2783.method967(3, false)];
            var3.field2978 = var3.field478.field2736;
            var3.field2930 = var3.field478.field2729;
            var3.field2952 = var3.field478.field2715;
            if (var2) {
                var3.field2971 = var8;
            }
            var3.field2969 = var3.field478.field2689;
            var3.field2993 = var3.field478.field2725;
            var3.field2948 = var3.field478.field2726;
            var3.field2947 = var3.field478.field2731;
            var3.field2943 = var3.field478.field2688;
            var3.field2956 = var3.field478.field2713;
            if (var3.field2956 == 0) {
                var3.field2971 = 0;
            }
            var3.method957(class46.field1244.field2963[0] + var7, 20, class46.field1244.field2934[0] + var6, var4 == 1);
        }
        class121.field2783.method972(-4);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method600(int arg0) {
        try {
            Graphics var1 = class142.field3439.getGraphics();
            class69.field1734.method287(var1, true, 357, 17);
        } catch (Exception var2) {
            class142.field3439.repaint();
        }
        field1998++;
        if (arg0 != 15164) {
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method601(byte arg0) {
        field1994++;
        class63.method504(16711680);
        class1.method3(arg0 - 148);
        class124.method944(arg0 ^ 0x4FC8);
        class26.method209((byte) 19);
        class56.method436((byte) 126);
        client.method178(4);
        class148.method1112(false);
        class21.method158(1);
        class63.method500((byte) -71);
        class4.method25((byte) -112);
        if (arg0 != 38) {
            return;
        }
        method602(arg0 - 39);
        class37.method275((byte) -46);
        ((class43) class60.field1532).method336((byte) 127);
        class101.field2294.method431(0);
        class131.field3099.method324(arg0 + 1608);
        class111.field2572.method324(arg0 ^ 0x648);
        class127.field2994.method324(1646);
        class107.field2437.method324(arg0 + 1608);
        class9.field201.method324(1646);
        class30.field912.method324(1646);
        class35.field979.method324(1646);
        class66.field1677.method324(1646);
        class141.field3329.method324(1646);
        class43.field1202.method324(1646);
        class40.field1068.method324(1646);
        class4.field87.method324(arg0 + 1608);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    private static final void method602(int arg0) {
        field2001++;
        if (arg0 != -1) {
            field2012 = null;
        }
        class43.field1198.method431(0);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[Lme;II[BLsa;)V")
    public static final void method603(int arg0, class88[] arg1, int arg2, int arg3, byte[] arg4, class123 arg5) {
        field1992++;
        class148 var6 = new class148(arg4);
        if (arg3 != 0) {
            return;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1144(arg3 ^ 0xFFFFFF81);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1144(-128);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1137(255);
                int var15 = var14 & 0x3;
                int var16 = arg0 + var12;
                int var17 = var14 >> 2;
                int var18 = arg2 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    int var19 = var13;
                    class88 var20 = null;
                    if ((class131.field3097[1][var16][var18] & 0x2) == 2) {
                        var19 = var13 - 1;
                    }
                    if (var19 >= 0) {
                        var20 = arg1[var19];
                    }
                    class1.method6(var16, true, var13, var20, var17, arg5, var15, var18, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static void method604(boolean arg0) {
        field2012 = null;
        if (arg0) {
            field2015 = null;
        }
        field1986 = null;
        field1995 = null;
        field2000 = null;
        field2010 = null;
        field2014 = null;
        field2007 = null;
        field2009 = null;
        field2008 = null;
        field2011 = null;
        field1987 = null;
        field2006 = null;
        field2015 = null;
        field2004 = null;
        field2013 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIII)I")
    public static final int method605(byte arg0, int arg1, int arg2, int arg3) {
        field1996++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else {
            int var5 = -68 % ((83 - arg0) / 36);
            return var4 == 2 ? 7 - arg2 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1989 = arg3;
        this.field1991 = arg2;
        this.field2005 = arg0;
        this.field1988 = arg4;
        this.field2003 = arg1;
        this.field1999 = arg5;
        this.field1990 = arg6;
    }
}
