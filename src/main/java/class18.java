import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class99 {

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public int field424 = 0;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public int field416 = -1;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "Z")
    public boolean field429 = true;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "I")
    public int field435 = -1;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "Laf;")
    public static class7 field414 = class48.method406(40, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "[[B")
    public static byte[][] field419 = new byte[50][];

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "[Lnb;")
    public static class92[] field425 = new class92[2048];

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "Laf;")
    public static class7 field412 = class48.method406(40, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "Laf;")
    private static class7 field426 = class48.method406(40, "Welcome to RuneScape");

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "Laf;")
    public static class7 field433 = class48.method406(40, "mapscene");

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Laf;")
    public static class7 field410 = field426;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "Lr;")
    public static class118 field430;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "[I")
    public static int[] field423;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIILrd;)V")
    private final void method168(boolean arg0, int arg1, int arg2, class122 arg3) {
        field431++;
        if (arg0) {
            method170(true);
        }
        if (arg2 == 1) {
            this.field424 = arg3.method953(87);
        } else if (arg2 == 2) {
            this.field435 = arg3.method931((byte) 124);
        } else if (arg2 == 5) {
            this.field429 = false;
        } else if (arg2 == 7) {
            this.field416 = arg3.method953(12);
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static void method169(int arg0) {
        field433 = null;
        field419 = null;
        field412 = null;
        field423 = null;
        field425 = null;
        field430 = null;
        field414 = null;
        field410 = null;
        field426 = null;
        if (arg0 != 0) {
            method174(-106, 105, 60, 85);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static final void method170(boolean arg0) {
        field415++;
        class141.field3332.method131((byte) 57);
        for (int var1 = 0; var1 < 32; var1++) {
            class96.field2285[var1] = 0L;
        }
        int var2 = 0;
        if (arg0) {
            method169(-61);
        }
        while (var2 < 32) {
            class153.field3579[var2] = 0L;
            var2++;
        }
        class49.field1180 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIBILr;I)V")
    public static final void method171(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class118 arg5, int arg6) {
        long var7 = (long) ((arg4 << 16) + arg0);
        field434++;
        if (arg2 != 21028) {
            method169(56);
        }
        class109 var9 = (class109) class89.field2068.method126(var7, (byte) -122);
        if (var9 != null) {
            return;
        }
        class109 var10 = (class109) class10.field255.method126(var7, (byte) 22);
        if (var10 != null) {
            return;
        }
        class109 var11 = (class109) class108.field2631.method126(var7, (byte) -94);
        if (var11 == null) {
            if (!arg1) {
                class109 var12 = (class109) client.field551.method126(var7, (byte) 104);
                if (var12 != null) {
                    return;
                }
            }
            class109 var13 = new class109();
            var13.field2663 = arg3;
            var13.field2654 = arg5;
            var13.field2652 = arg6;
            if (arg1) {
                class89.field2068.method130(arg2 ^ 0x5279, var13, var7);
                class64.field1418++;
            } else {
                class7.field143.method256(var13, (byte) -58);
                class108.field2631.method130(56, var13, var7);
                class83.field1943++;
            }
        } else if (arg1) {
            var11.method818((byte) -116);
            class89.field2068.method130(75, var11, var7);
            class83.field1943--;
            class64.field1418++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILrd;)V")
    public final void method172(int arg0, int arg1, class122 arg2) {
        field418++;
        while (true) {
            int var4 = arg2.method931((byte) 124);
            if (var4 == 0) {
                if (arg1 == -10385) {
                    return;
                } else {
                    method171(-59, true, -69, (byte) -96, -125, null, 35);
                    return;
                }
            }
            this.method168(false, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public final void method173(int arg0) {
        field408++;
        if (this.field416 != -1) {
            this.method175(this.field416, 120);
            this.field422 = this.field409;
            this.field420 = this.field428;
            this.field417 = this.field413;
        }
        if (arg0 != -24845) {
            this.method175(-37, 119);
        }
        this.method175(this.field424, 116);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)I")
    public static final int method174(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 7157) {
            method171(46, false, 107, (byte) -82, -4, null, -30);
        }
        int var4 = arg3 / arg0;
        int var5 = arg0 - 1 & arg3;
        field407++;
        int var6 = arg2 / arg0;
        int var7 = arg2 & arg0 - 1;
        int var8 = class99.method817(var6, var4, (byte) -126);
        int var9 = class99.method817(var6, var4 + 1, (byte) 107);
        int var10 = class99.method817(var6 + 1, var4, (byte) -38);
        int var11 = class99.method817(var6 + 1, var4 - -1, (byte) 86);
        int var12 = class120.method925(var5, arg0, var8, var9, (byte) 15);
        int var13 = class120.method925(var5, arg0, var10, var11, (byte) 15);
        return class120.method925(var7, arg0, var12, var13, (byte) 15);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
    private final void method175(int arg0, int arg1) {
        field411++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        double var13 = 0.0D;
        if (var3 > var5) {
            var11 = var3;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        int var17 = -29 % ((arg1 - 44) / 51);
        double var18 = (var9 + var11) / 2.0D;
        this.field413 = (int) (var18 * 256.0D);
        if (this.field413 < 0) {
            this.field413 = 0;
        } else if (this.field413 > 255) {
            this.field413 = 255;
        }
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var20 = var13 / 6.0D;
        this.field409 = (int) (var15 * 256.0D);
        this.field428 = (int) (var20 * 256.0D);
        if (this.field409 < 0) {
            this.field409 = 0;
        } else if (this.field409 > 255) {
            this.field409 = 255;
            return;
        }
    }
}
