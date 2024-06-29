import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 extends class238 {

    @OriginalMember(owner = "client!dj", name = "rb", descriptor = "Z")
    private volatile boolean field933 = false;

    @OriginalMember(owner = "client!dj", name = "vb", descriptor = "Z")
    private boolean field937 = false;

    @OriginalMember(owner = "client!dj", name = "Hb", descriptor = "I")
    private int field949 = -1;

    @OriginalMember(owner = "client!dj", name = "qb", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!dj", name = "Gb", descriptor = "Lci;")
    private class32 field948;

    @OriginalMember(owner = "client!dj", name = "xb", descriptor = "Lci;")
    private class32 field939;

    @OriginalMember(owner = "client!dj", name = "nb", descriptor = "Ldc;")
    public static class37 field929 = class185.method1233((byte) 86, ")1j");

    @OriginalMember(owner = "client!dj", name = "Eb", descriptor = "Ldc;")
    private static class37 field946 = class185.method1233((byte) 86, "Started 3d library");

    @OriginalMember(owner = "client!dj", name = "Cb", descriptor = "[I")
    public static int[] field944 = new int[25];

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!dj", name = "Ab", descriptor = "Ldc;")
    public static class37 field942 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!dj", name = "yb", descriptor = "Ldc;")
    public static class37 field940 = class185.method1233((byte) 86, "(U");

    @OriginalMember(owner = "client!dj", name = "Ib", descriptor = "Ldc;")
    public static class37 field950 = null;

    @OriginalMember(owner = "client!dj", name = "tb", descriptor = "Ldc;")
    public static class37 field935 = field946;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!dj", name = "sb", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!dj", name = "ub", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!dj", name = "wb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!dj", name = "zb", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!dj", name = "Bb", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!dj", name = "Db", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!dj", name = "Fb", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!dj", name = "Jb", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "[Z")
    private volatile boolean[] field925;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lci;Lci;IZZZ)V")
    public class44(class32 arg0, class32 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field932 = arg2;
        this.field937 = arg5;
        this.field948 = arg0;
        this.field939 = arg1;
        class75.method524(this.field932, 5, this);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
    public final void method381(int arg0, byte arg1) {
        ++field951;
        if (this.method1565(arg0, -1)) {
            class160.method1080(-5, arg0, this.field932);
            if (arg1 <= 64) {
                this.method391(false, -7);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(III)V")
    public final void method382(int arg0, int arg1, int arg2) {
        this.field930 = arg2;
        this.field931 = arg0;
        ++field945;
        if (this.field939 == null) {
            class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
        } else {
            class83.method571(this.field939, 122, this.field932, this);
        }
        if (arg1 < 26) {
            this.method389(true);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static void method383(boolean arg0) {
        field950 = null;
        field942 = null;
        field935 = null;
        if (arg0) {
            field940 = null;
        }
        field944 = null;
        field940 = null;
        field946 = null;
        field929 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
    public static final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++class231.field4224;
        class159.method1070((byte) 107, true);
        class224.method1472((byte) 14, true);
        ++field941;
        class159.method1070((byte) 71, false);
        class224.method1472((byte) 84, false);
        class138.method961(60);
        class114.method801((byte) 32);
        if (!class28.field499) {
            int var5 = class242.field4445;
            int var6 = 2047 & class82.field1454 + class8.field98;
            if (var5 < class58.field1082 / 256) {
                var5 = class58.field1082 / 256;
            }
            if (class233.field4246[4] && class174.field3323[4] + 128 > var5) {
                var5 = class174.field3323[4] + 128;
            }
            class127.method892(class3.field28, var5, -50 + class145.method1008(class125.field2246, class238.field4382.field3505, class238.field4382.field3490, (byte) -33), var6, var5 * 3 + 600, -31127, class159.field3006, arg2);
        }
        int var7;
        if (class28.field499) {
            var7 = class16.method115(false);
        } else {
            var7 = class96.method642(-175122297);
        }
        int var8 = class6.field71;
        int var9 = class166.field3169;
        int var10 = class118.field2112;
        int var11 = class25.field434;
        int var12 = class92.field1587;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class233.field4246[var13]) {
                int var20 = (int) ((double) (class171.field3275[var13] * 2 + 1) * Math.random() - (double) class171.field3275[var13] + Math.sin((double) class170.field3244[var13] / 100.0D * (double) class80.field1418[var13]) * (double) class174.field3323[var13]);
                if (~var13 == -3) {
                    class118.field2112 += var20;
                }
                if (var13 == 3) {
                    class25.field434 = class25.field434 + var20 & 2047;
                }
                if (var13 == 0) {
                    class6.field71 += var20;
                }
                if (var13 == 4) {
                    class92.field1587 += var20;
                    if (class92.field1587 < 128) {
                        class92.field1587 = 128;
                    }
                    if (class92.field1587 > 383) {
                        class92.field1587 = 383;
                    }
                }
                if (~var13 == -2) {
                    class166.field3169 += var20;
                }
            }
        }
        class48.method408(arg1, arg3, arg1 - -arg0, arg3 - -arg2);
        class169.method1128();
        int var14 = class235.field4271;
        int var15 = class80.field1416;
        if (arg1 <= var15 && ~var15 > ~(arg1 - -arg0) && var14 >= arg3 && ~var14 > ~(arg2 + arg3)) {
            int var16 = class105.field1827;
            class153.field2888 = 0;
            class221.field4106 = true;
            int var17 = class41.field857;
            int var18 = class228.field4195;
            client.field681 = (-arg3 + class235.field4271) * (-var18 + var17) / arg2 - -var18;
            int var19 = class52.field1043;
            class106.field1842 = (var19 - var16) * (-arg1 + class80.field1416) / arg0 + var16;
        } else {
            class221.field4106 = false;
            class153.field2888 = 0;
        }
        class108.method707((byte) 97);
        class48.method420(arg1, arg3, arg0, arg2, 0);
        class99.method657(class6.field71, class166.field3169, class118.field2112, class92.field1587, class25.field434, var7, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 0, (byte) 0);
        class108.method707((byte) 123);
        class230.method1492();
        class237.method1530(arg2, arg3, (byte) -68, 256, arg1, arg0, 256);
        class62.method461(256, arg3, arg1, arg0, arg2, -2265, 256);
        ((class189) class169.field3224).method1258(class201.field3749, true);
        class12.method79(arg0, arg3, arg2, -2, arg1);
        class6.field71 = var8;
        class92.field1587 = var12;
        class25.field434 = var11;
        class166.field3169 = var9;
        class118.field2112 = var10;
        if (class196.field3663 && ~class218.method1441(true, false, false) == -1) {
            class196.field3663 = false;
        }
        if (class196.field3663) {
            class48.method420(arg1, arg3, arg0, arg2, 0);
            class192.method1279(class136.field2649, false, false);
        }
        if (!class196.field3663 && !class118.field2114 && ~var15 <= ~arg1 && ~var15 > ~(arg0 + arg1) && ~var14 <= ~arg3 && var14 < arg3 - -arg2) {
            class8.method54(arg3, arg2, var15, arg1, (byte) 37, arg0, var14);
        }
        if (arg4 != 1920) {
            field950 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZILci;[BI)V")
    public final void method385(boolean arg0, int arg1, class32 arg2, byte[] arg3, int arg4) {
        ++field936;
        int var6 = -41 / ((-21 - arg4) / 59);
        if (this.field939 != arg2) {
            if (!arg0 && this.field949 == arg1) {
                this.field933 = true;
            }
            if (arg3 == null || ~arg3.length >= -3) {
                this.field925[arg1] = false;
                if (this.field937 || arg0) {
                    class65.method480(super.field4351[arg1], 6024, arg0, arg1, (byte) 2, this, this.field932);
                }
                return;
            }
            class161.field3045.reset();
            class161.field3045.update(arg3, 0, arg3.length + -2);
            int var7 = (int) class161.field3045.getValue();
            int var8 = (65280 & arg3[arg3.length + -2] << 8) - -(arg3[arg3.length + -1] & 255);
            if (super.field4351[arg1] != var7 || ~super.field4357[arg1] != ~var8) {
                this.field925[arg1] = false;
                if (this.field937 || arg0) {
                    class65.method480(super.field4351[arg1], 6024, arg0, arg1, (byte) 2, this, this.field932);
                }
                return;
            }
            this.field925[arg1] = true;
            if (arg0) {
                super.field4356[arg1] = class139.method968(arg3, true, false);
                return;
            }
        } else {
            if (this.field933) {
                throw new RuntimeException();
            }
            if (arg3 == null) {
                class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
                return;
            }
            class161.field3045.reset();
            class161.field3045.update(arg3, 0, arg3.length);
            int var9 = (int) class161.field3045.getValue();
            if (~this.field930 != ~var9) {
                class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
                return;
            }
            class28 var10;
            try {
                var10 = new class28(class149.method1027(0, arg3));
            } catch (RuntimeException var13) {
                class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
                return;
            }
            int var11 = var10.method215(-1797813752);
            if (~var11 != -6 && var11 != 6) {
                class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
                return;
            }
            int var12 = 0;
            if (var11 >= 6) {
                var12 = var10.method226(-116);
            }
            if (~this.field931 != ~var12) {
                class65.method480(this.field930, 6024, true, this.field932, (byte) 0, this, 255);
                return;
            }
            this.method1553((byte) -98, arg3);
            this.method389(true);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIZZ[B)V")
    public final void method386(boolean arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4) {
        if (!arg2) {
            method388(112);
        }
        ++field926;
        if (!arg0) {
            arg4[arg4.length + -2] = (byte) (super.field4357[arg1] >> 8);
            arg4[arg4.length + -1] = (byte) super.field4357[arg1];
            if (this.field948 != null) {
                class135.method938(0, arg1, this.field948, arg4);
                this.field925[arg1] = true;
            }
            if (arg3) {
                super.field4356[arg1] = class139.method968(arg4, true, false);
                return;
            }
        } else {
            if (this.field933) {
                throw new RuntimeException();
            }
            if (this.field939 != null) {
                class135.method938(0, this.field932, this.field939, arg4);
            }
            this.method1553((byte) -98, arg4);
            this.method389(arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I")
    public final int method387(int arg0) {
        ++field928;
        if (arg0 != 31890) {
            this.field933 = true;
        }
        if (this.field933) {
            return 100;
        } else if (super.field4356 != null) {
            return 99;
        } else {
            int var2 = class160.method1076(this.field932, 255, arg0 + -31889);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
    public static final boolean method388(int arg0) {
        ++field947;
        class72 var1 = class94.field1647;
        synchronized (class94.field1647) {
            if (class41.field845 == class236.field4294) {
                return false;
            } else {
                class198.field3700 = class88.field1545[class236.field4294];
                if (arg0 != 25014) {
                    return false;
                } else {
                    class118.field2107 = class17.field260[class236.field4294];
                    class236.field4294 = 127 & class236.field4294 + 1;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
    private final void method389(boolean arg0) {
        this.field925 = new boolean[super.field4356.length];
        for (int var2 = 0; ~var2 > ~this.field925.length; ++var2) {
            this.field925[var2] = false;
        }
        if (!arg0) {
            this.method387(-24);
        }
        ++field943;
        if (this.field948 == null) {
            this.field933 = true;
        } else {
            this.field949 = -1;
            for (int var3 = 0; ~var3 > ~this.field925.length; ++var3) {
                if (super.field4324[var3] > 0) {
                    class123.method840(91, var3, this.field948, this);
                    this.field949 = var3;
                }
            }
            if (~this.field949 == 0) {
                this.field933 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I")
    public final int method390(int arg0, int arg1) {
        ++field938;
        if (!this.method1565(arg0, -1)) {
            return 0;
        } else if (super.field4356[arg0] != null) {
            return 100;
        } else if (this.field925[arg0]) {
            return 100;
        } else {
            if (arg1 != -13574) {
                method388(27);
            }
            return class160.method1076(arg0, this.field932, 1);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V")
    public final void method391(boolean arg0, int arg1) {
        ++field934;
        if (arg0) {
            method383(true);
        }
        if (this.method1565(arg1, -1)) {
            if (this.field948 != null && this.field925 != null && this.field925[arg1]) {
                class83.method571(this.field948, 111, arg1, this);
            } else {
                class65.method480(super.field4351[arg1], 6024, true, arg1, (byte) 2, this, this.field932);
            }
        }
    }
}
