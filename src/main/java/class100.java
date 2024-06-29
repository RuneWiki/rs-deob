import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class100 {

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lkh;")
    private class247 field1841 = new class247();

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    private int field1834;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lkj;")
    private class56 field1835;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1837 = -1;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[I")
    public static int[] field1842 = new int[128];

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field1848 = -1;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lij;")
    private static class50 field1850 = class78.method578(124, "Connecting to update server");

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lij;")
    public static class50 field1836 = field1850;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lij;")
    public static class50 field1852 = class78.method578(122, ")3");

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[S")
    public static short[] field1849 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lij;")
    public static class50 field1856 = class78.method578(124, "(U");

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public static int[] field1833;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "[[[I")
    public static int[][][] field1854;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IJ)V")
    public final void method761(int arg0, long arg1) {
        int var4 = -101 / ((arg0 + 23) / 39);
        field1851++;
        class68 var5 = (class68) this.field1835.method443(arg1, (byte) 102);
        if (var5 != null) {
            var5.method267(117);
            var5.method1693(63);
            this.field1847++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method762(byte arg0) {
        if (arg0 != 117) {
            field1833 = null;
        }
        for (class68 var2 = (class68) this.field1841.method1684(-1128); var2 != null; var2 = (class68) this.field1841.method1686(1784)) {
            if (var2.method523(true)) {
                var2.method267(-95);
                var2.method1693(arg0 ^ 0x4A);
                this.field1847++;
            }
        }
        field1844++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method763(int arg0) {
        if (arg0 == 0) {
            field1853++;
            this.field1841.method1687(-90);
            this.field1835.method437((byte) 19);
            this.field1847 = this.field1834;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method764(byte arg0, long arg1) {
        class68 var4 = (class68) this.field1835.method443(arg1, (byte) -32);
        field1845++;
        if (var4 == null) {
            return null;
        } else if (arg0 == 70) {
            Object var5 = var4.method525((byte) -81);
            if (var5 == null) {
                var4.method267(arg0 - 95);
                var4.method1693(63);
                this.field1847++;
                return null;
            }
            if (var4.method523(true)) {
                class162 var6 = new class162(var5);
                this.field1835.method445(64, var4.field635, var6);
                this.field1841.method1681(var6, -354669215);
                var6.field4309 = 0L;
                var4.method267(108);
                var4.method1693(63);
            } else {
                this.field1841.method1681(var4, -354669215);
                var4.field4309 = 0L;
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/Object;J)V")
    public final void method765(byte arg0, Object arg1, long arg2) {
        field1839++;
        this.method761(-78, arg2);
        if (arg0 > -119) {
            method769(56);
        }
        if (this.field1847 == 0) {
            class68 var5 = (class68) this.field1841.method1680(-354669215);
            var5.method267(-96);
            var5.method1693(63);
        } else {
            this.field1847--;
        }
        class162 var6 = new class162(arg1);
        this.field1835.method445(127, arg2, var6);
        this.field1841.method1681(var6, -354669215);
        var6.field4309 = 0L;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
    public static final void method766() {
        int var0 = class61.field1122[class20.field424];
        class255[] var1 = class61.field1131[class20.field424];
        class179.field2983 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class255 var3 = var1[var2];
            if (class208.field3459 != null) {
                for (int var4 = 0; var4 < class208.field3459.length; var4++) {
                    if (class208.field3459[var4] != -1000000 && (var3.field4409 <= class208.field3459[var4] || var3.field4405 <= class208.field3459[var4]) && (var3.field4430 <= class84.field1593[var4] || var3.field4407 <= class84.field1593[var4]) && (var3.field4430 >= class94.field1754[var4] || var3.field4407 >= class94.field1754[var4]) && (var3.field4416 <= class240.field4127[var4] || var3.field4401 <= class240.field4127[var4]) && (var3.field4416 >= class153.field2676[var4] || var3.field4401 >= class153.field2676[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field4422 == 1) {
                int var5 = var3.field4418 + class80.field1461 - class65.field1229;
                if (var5 >= 0 && var5 <= class80.field1461 + class80.field1461) {
                    int var6 = var3.field4427 + class80.field1461 - class136.field2363;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field4426 + class80.field1461 - class136.field2363;
                    if (var7 > class80.field1461 + class80.field1461) {
                        var7 = class80.field1461 + class80.field1461;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class210.field3497[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class97.field1815 - var3.field4430;
                        if (var9 > 32) {
                            var3.field4400 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field4400 = 2;
                            var9 = -var9;
                        }
                        var3.field4419 = (var3.field4416 - class108.field1934 << 8) / var9;
                        var3.field4412 = (var3.field4401 - class108.field1934 << 8) / var9;
                        var3.field4406 = (var3.field4409 - class17.field382 << 8) / var9;
                        var3.field4402 = (var3.field4405 - class17.field382 << 8) / var9;
                        class260.field4530[class179.field2983++] = var3;
                    }
                }
            } else if (var3.field4422 == 2) {
                int var10 = var3.field4427 + class80.field1461 - class136.field2363;
                if (var10 >= 0 && var10 <= class80.field1461 + class80.field1461) {
                    int var11 = var3.field4418 + class80.field1461 - class65.field1229;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field4423 + class80.field1461 - class65.field1229;
                    if (var12 > class80.field1461 + class80.field1461) {
                        var12 = class80.field1461 + class80.field1461;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class210.field3497[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class108.field1934 - var3.field4416;
                        if (var14 > 32) {
                            var3.field4400 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field4400 = 4;
                            var14 = -var14;
                        }
                        var3.field4414 = (var3.field4430 - class97.field1815 << 8) / var14;
                        var3.field4417 = (var3.field4407 - class97.field1815 << 8) / var14;
                        var3.field4406 = (var3.field4409 - class17.field382 << 8) / var14;
                        var3.field4402 = (var3.field4405 - class17.field382 << 8) / var14;
                        class260.field4530[class179.field2983++] = var3;
                    }
                }
            } else if (var3.field4422 == 4) {
                int var15 = var3.field4409 - class17.field382;
                if (var15 > 128) {
                    int var16 = var3.field4427 + class80.field1461 - class136.field2363;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field4426 + class80.field1461 - class136.field2363;
                    if (var17 > class80.field1461 + class80.field1461) {
                        var17 = class80.field1461 + class80.field1461;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field4418 + class80.field1461 - class65.field1229;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field4423 + class80.field1461 - class65.field1229;
                        if (var19 > class80.field1461 + class80.field1461) {
                            var19 = class80.field1461 + class80.field1461;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class210.field3497[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field4400 = 5;
                            var3.field4414 = (var3.field4430 - class97.field1815 << 8) / var15;
                            var3.field4417 = (var3.field4407 - class97.field1815 << 8) / var15;
                            var3.field4419 = (var3.field4416 - class108.field1934 << 8) / var15;
                            var3.field4412 = (var3.field4401 - class108.field1934 << 8) / var15;
                            class260.field4530[class179.field2983++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLij;)V")
    public static final void method767(boolean arg0, class50 arg1) {
        class144.field2505 = arg1;
        field1840++;
        if (class186.field3058.field2408 == null) {
            return;
        }
        try {
            class50 var2 = class236.field3955.method369(!arg0, class186.field3058.field2408);
            class50 var3 = class16.field370.method369(true, class186.field3058.field2408);
            if (!arg0) {
                class50 var4 = class80.method589(new class50[] { var2, class236.field3960, arg1, class209.field3469, var3 }, 28743);
                class50 var5;
                if (arg1.method396(1) == 0) {
                    var5 = class80.method589(new class50[] { var4, class45.field823 }, 28743);
                } else {
                    var5 = class80.method589(new class50[] { var4, class33.field648, class90.method700((byte) -124, class104.method785(-1) + 94608000000L), class235.field3934, class178.method1218(94608000L, !arg0) }, 28743);
                }
                class80.method589(new class50[] { class241.field4154, var5, class195.field3230 }, 28743).method392(class186.field3058.field2408, (byte) 79);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method768(int arg0, int arg1) {
        field1843++;
        if (class10.method67(arg1, (byte) -104)) {
            class118.method854(class137.field2380[arg1], arg0, arg0 - 6);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method769(int arg0) {
        field1849 = null;
        field1852 = null;
        field1842 = null;
        field1836 = null;
        field1833 = null;
        field1850 = null;
        if (arg0 != 0) {
            field1846 = 15;
        }
        field1856 = null;
        field1854 = null;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
    public class100(int arg0) {
        int var2 = 1;
        this.field1847 = arg0;
        this.field1834 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field1835 = new class56(var2);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public final void method770(boolean arg0, int arg1) {
        if (!arg0) {
            this.method764((byte) -115, -20L);
        }
        if (class89.field1703 != null) {
            for (class68 var3 = (class68) this.field1841.method1684(-1128); var3 != null; var3 = (class68) this.field1841.method1686(1784)) {
                if (var3.method523(true)) {
                    if (var3.method525((byte) -79) == null) {
                        var3.method267(-121);
                        var3.method1693(63);
                        this.field1847++;
                    }
                } else if (((long) arg1) < (++var3.field4309)) {
                    class68 var4 = class89.field1703.method573(0, var3);
                    this.field1835.method445(88, var3.field635, var4);
                    this.field1841.method1688(var3, (byte) 125, var4);
                    var3.method267(105);
                    var3.method1693(63);
                }
            }
        }
        field1838++;
    }
}
