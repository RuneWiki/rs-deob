import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class66 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    private int field976 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    private int field983 = -1;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "Lum;")
    private class347 field987 = new class347();

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Z")
    public boolean field991 = false;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    private int field981;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[[I")
    private int[][] field979;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[Lpl;")
    private class443[] field980;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Lwl;")
    public static class269 field982 = new class269(8192);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "Ltc;")
    public static class224 field989;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Lii;")
    public static class371 field990;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lev;")
    public static class469 field988;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method460(int arg0) {
        field978++;
        for (int var2 = 0; var2 < this.field986; var2++) {
            this.field979[var2] = null;
        }
        this.field979 = null;
        this.field980 = null;
        this.field987.method2089(328);
        int var3 = 0 / ((-arg0 - 72) / 34);
        this.field987 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)[[I")
    public final int[][] method461(int arg0) {
        field974++;
        if (this.field986 != this.field981) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field986; var2++) {
            this.field980[var2] = class315.field4624;
        }
        if (arg0 != 10466) {
            this.method460(23);
        }
        return this.field979;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public static final void method462(int arg0) {
        for (int var1 = 0; var1 < class124.field1611; var1++) {
            class147 var2 = class415.field6150[var1];
            boolean var3 = false;
            if (var2.field1907 == null) {
                var2.field1915--;
                if (var2.field1915 < (var2.field1908 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field1908 == 1 && var2.field1914 == null) {
                        var2.field1914 = class264.method1629(class238.field3338, var2.field1912, 0);
                        if (var2.field1914 == null) {
                            continue;
                        }
                        var2.field1915 += var2.field1914.method1627();
                    } else if (var2.field1908 == 2 && (var2.field1910 == null || var2.field1906 == null)) {
                        if (var2.field1910 == null) {
                            var2.field1910 = class401.method2393(class469.field6782, var2.field1912);
                        }
                        if (var2.field1910 == null) {
                            continue;
                        }
                        if (var2.field1906 == null) {
                            var2.field1906 = var2.field1910.method2391(new int[] { 22050 });
                            if (var2.field1906 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field1915 < 0) {
                        int var4;
                        if (var2.field1905 == 0) {
                            var4 = class118.field1533.field6912 * var2.field1904 >> 8;
                        } else {
                            int var5 = (var2.field1905 & 0x3E70905) >> 24;
                            if (class415.field6145.field2956 == var5) {
                                int var6 = (var2.field1905 & 0xFF) << 7;
                                int var7 = var2.field1905 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class415.field6145.field2959;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field1905 & 0xFF3A) >> 8;
                                int var10 = (var9 << 7) + 64 - class415.field6145.field2966;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var10 + var8 - 128;
                                if (var6 < var11) {
                                    var2.field1915 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class118.field1533.field6903 * var2.field1904 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class80 var12 = null;
                            if (var2.field1908 == 1) {
                                var12 = var2.field1914.method1626().method518(class222.field3135);
                            } else if (var2.field1908 == 2) {
                                var12 = var2.field1906;
                            }
                            class462 var13 = var2.field1907 = class462.method2681(var12, 100, var4);
                            var13.method2685(var2.field1903 - 1);
                            class375.field5607.method640(var13);
                        }
                    }
                }
            } else if (!var2.field1907.method542((byte) -57)) {
                var3 = true;
            }
            if (var3) {
                class124.field1611--;
                for (int var14 = var1; var14 < class124.field1611; var14++) {
                    class415.field6150[var14] = class415.field6150[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -2474) {
            field982 = null;
        }
        field984++;
        if (class286.field4089 && !class417.method2479(21125)) {
            if (class118.field1533.field6899 != 0 && class153.field1966 != -1) {
                class13.method99(false, class118.field1533.field6899, 0, 10083, class153.field1966, class389.field5781);
            }
            class286.field4089 = false;
        } else if (class118.field1533.field6899 != 0 && class153.field1966 != -1 && !class417.method2479(arg0 + 23599)) {
            class386.method2321(true, class202.field2804);
            class76.field1074++;
            class79.field1108.method969(19869, class153.field1966);
            class153.field1966 = -1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static void method463(int arg0) {
        field990 = null;
        if (arg0 == 0) {
            field988 = null;
            field989 = null;
            field982 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIB)V")
    public static final void method464(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 2) {
            method466(-43, true, -29, -22, false);
        }
        if (class118.field1533.field6912 != 0 && arg3 != 0 && class124.field1611 < 50 && arg2 != -1) {
            class415.field6150[class124.field1611++] = new class147((byte) 2, arg2, arg3, arg0, arg1, 0);
        }
        field985++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
    public final int[] method465(int arg0, int arg1) {
        if (arg1 < 94) {
            return null;
        }
        field977++;
        if (this.field986 == this.field981) {
            this.field991 = this.field980[arg0] == null;
            this.field980[arg0] = class315.field4624;
            return this.field979[arg0];
        } else if (this.field986 == 1) {
            this.field991 = this.field983 != arg0;
            this.field983 = arg0;
            return this.field979[0];
        } else {
            class443 var3 = this.field980[arg0];
            if (var3 == null) {
                this.field991 = true;
                if (this.field986 > this.field976) {
                    var3 = new class443(arg0, this.field976);
                    this.field976++;
                } else {
                    class443 var4 = (class443) this.field987.method2094(8);
                    var3 = new class443(arg0, var4.field6467);
                    this.field980[var4.field6468] = null;
                    var4.method536(false);
                }
                this.field980[arg0] = var3;
            } else {
                this.field991 = false;
            }
            this.field987.method2092(-122, var3);
            return this.field979[var3.field6467];
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZIIZ)V")
    public static final void method466(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class378.method2291(0, class345.field4994.length - 1, arg2, arg1, arg3, arg0 ^ 0x6B69, arg4);
        field975++;
        class415.field6148 = 0;
        if (arg0 != 27402) {
            field982 = null;
        }
        class112.field1468 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(III)V")
    public class66(int arg0, int arg1, int arg2) {
        this.field986 = arg0;
        this.field981 = arg1;
        this.field979 = new int[this.field986][arg2];
        this.field980 = new class443[this.field981];
    }
}
