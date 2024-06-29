import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class83 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lja;")
    public static class62 field1990 = class30.method243(43, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lja;")
    private static class62 field1994 = class30.method243(43, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1993 = 127;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lja;")
    public static class62 field1991 = class30.method243(43, "");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lja;")
    public static class62 field1999 = field1991;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field2003 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lja;")
    public static class62 field1996 = field1994;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lja;")
    public static class62 field1987 = class30.method243(43, ")4l");

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field2005 = 10;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lja;")
    public static class62 field2012 = class30.method243(43, "<)4col> x");

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field2001 = 0;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Ljava/awt/Image;")
    public Image field2002;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[I")
    public int[] field2008;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[[[I")
    public static int[][][] field1989;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILpd;BZII)V")
    public static final void method645(int arg0, class108 arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        class90.field2143 = arg4;
        int var6 = -23 % ((-arg2 - 70) / 33);
        class62.field1535 = 10000;
        class22.field518 = arg5;
        class43.field1011 = 1;
        class93.field2179 = arg3;
        field2010++;
        class151.field3542 = arg0;
        class15.field368 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static final void method646(byte arg0) {
        field1997++;
        class69.field1750 = true;
        if (arg0 <= -109) {
            class144.field3361 = true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method647(boolean arg0) {
        field1998++;
        if (class7.field216 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class7.field216 > 768) {
                    class34.field811[var3] = class52.method360(class115.field2640[var3], (byte) -66, 1024 - class7.field216, class30.field738[var3]);
                } else if (class7.field216 > 256) {
                    class34.field811[var3] = class115.field2640[var3];
                } else {
                    class34.field811[var3] = class52.method360(class30.field738[var3], (byte) 96, 256 - class7.field216, class115.field2640[var3]);
                }
            }
        } else if (class40.field929 <= 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                class34.field811[var1] = class30.field738[var1];
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class40.field929 > 768) {
                    class34.field811[var2] = class52.method360(class22.field524[var2], (byte) 101, 1024 - class40.field929, class30.field738[var2]);
                } else if (class40.field929 > 256) {
                    class34.field811[var2] = class22.field524[var2];
                } else {
                    class34.field811[var2] = class52.method360(class30.field738[var2], (byte) -43, 256 - class40.field929, class22.field524[var2]);
                }
            }
        }
        short var4 = 256;
        class19.method141(0, 9, 128, var4 + 7);
        class110.field2518.method411(0, 0);
        int var5 = 0;
        class19.method142();
        int var6 = 6885;
        for (int var7 = 1; var7 < var4 - 1; var7++) {
            int var20 = (var4 - var7) * class98.field2297[var7] / var4;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class134.field3092[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = class105.field2419.field2008[var6];
                    int var26 = 256 - var23;
                    int var27 = class34.field811[var23];
                    class105.field2419.field2008[var6++] = class24.method192(-16711936, class24.method192(var25, 16711935) * var26 + class24.method192(var27, 16711935) * var23) + class24.method192(16711680, var26 * class24.method192(65280, var25) + var23 * class24.method192(var27, 65280)) >> 8;
                }
            }
            var6 += var21 + 637;
        }
        if (!arg0) {
            field1990 = null;
        }
        int var8 = 7546;
        class19.method141(637, 9, 765, var4 + 7);
        class57.field1389.method411(382, 0);
        class19.method142();
        int var9 = 0;
        for (int var10 = 1; var10 < var4 - 1; var10++) {
            int var11 = (var4 - var10) * class98.field2297[var10] / var4;
            int var12 = var8 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class134.field3092[var9++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var16 = 256 - var15;
                    int var18 = class105.field2419.field2008[var12];
                    int var19 = class34.field811[var15];
                    class105.field2419.field2008[var12++] = class24.method192(-16711936, class24.method192(var18, 16711935) * var16 + var15 * class24.method192(var19, 16711935)) + class24.method192(16711680, class24.method192(65280, var18) * var16 + class24.method192(var19, 65280) * var15) >> 8;
                }
            }
            var9 += 128 - var13;
            var8 = var12 + 765 - var13 - var11;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method83(int arg0, byte arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public static final boolean method648(int arg0, int arg1) {
        field1995++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class146.field3437[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1003) {
            return true;
        } else {
            return arg0 > -4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method84(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILja;Lhe;)Lja;")
    public static final class62 method649(int arg0, class62 arg1, class54 arg2) {
        field2007++;
        if (arg0 != 4) {
            return null;
        } else if (arg1.method467(class52.field1193, (byte) -120) == -1) {
            return arg1;
        } else {
            while (true) {
                int var3 = arg1.method467(class31.field763, (byte) -54);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method467(class88.field2078, (byte) -110);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method467(class79.field1928, (byte) -79);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method467(class118.field2697, (byte) -126);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method467(class22.field513, (byte) -94);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method467(class52.field1198, (byte) -111);
                                                        if (var8 == -1) {
                                                            return arg1;
                                                        }
                                                        class62 var9 = field1991;
                                                        if (class102.field2372 != null) {
                                                            var9 = class86.method670(0, class102.field2372.field475);
                                                            try {
                                                                if (class102.field2372.field473 != null) {
                                                                    byte[] var10 = ((String) class102.field2372.field473).getBytes("ISO-8859-1");
                                                                    var9 = class46.method330((byte) 42, var10, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class70.method594(new class62[] { arg1.method445(var8, (byte) -109, 0), var9, arg1.method471((byte) -110, var8 + 4) }, 1229);
                                                    }
                                                }
                                                arg1 = class70.method594(new class62[] { arg1.method445(var7, (byte) -118, 0), class22.method168(class138.method1104(4, arg2, -30), 4), arg1.method471((byte) -110, var7 + 2) }, 1229);
                                            }
                                        }
                                        arg1 = class70.method594(new class62[] { arg1.method445(var6, (byte) -78, 0), class22.method168(class138.method1104(3, arg2, arg0 ^ 0xFFFFFFE6), 4), arg1.method471((byte) -110, var6 + 2) }, arg0 ^ 0x4C9);
                                    }
                                }
                                arg1 = class70.method594(new class62[] { arg1.method445(var5, (byte) 126, 0), class22.method168(class138.method1104(2, arg2, arg0 - 34), 4), arg1.method471((byte) -110, var5 + 2) }, arg0 + 1225);
                            }
                        }
                        arg1 = class70.method594(new class62[] { arg1.method445(var4, (byte) 104, 0), class22.method168(class138.method1104(1, arg2, -30), 4), arg1.method471((byte) -110, var4 + 2) }, 1229);
                    }
                }
                arg1 = class70.method594(new class62[] { arg1.method445(var3, (byte) -72, 0), class22.method168(class138.method1104(0, arg2, -30), 4), arg1.method471((byte) -110, var3 + 2) }, arg0 + 1225);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1994 = null;
        field2012 = null;
        if (arg0 != 7) {
            return;
        }
        field1999 = null;
        field1996 = null;
        field1989 = null;
        field1991 = null;
        field1990 = null;
        field1987 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public final void method651(byte arg0) {
        if (arg0 != 114) {
            field1989 = null;
        }
        class19.method136(this.field2008, this.field2009, this.field2011);
        field1988++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method652(byte arg0, byte[] arg1) {
        field1992++;
        class128 var2 = new class128(arg1);
        int var3 = var2.method1025(arg0 + 192);
        if (arg0 != 63) {
            method645(96, null, (byte) -59, true, -38, 79);
        }
        int var4 = var2.method1037(arg0 + 18771);
        if (var4 < 0 || class57.field1428 != 0 && var4 > class57.field1428) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1034(var7, var4, 0, (byte) -18);
            return var7;
        } else {
            int var5 = var2.method1037(18834);
            if (var5 < 0 || class57.field1428 != 0 && var5 > class57.field1428) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class64.method491(var6, var5, arg1, var4, 9);
            } else {
                class96.field2238.method639(var2, var6, 13120);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method82(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    protected class83() {
    }
}
