import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class135 extends class185 {

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Ls;")
    public class190 field2419 = new class190();

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Laj;")
    public class11 field2427 = new class11();

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lsb;")
    private class192 field2410;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Ldj;")
    public static class44 field2417 = class89.method650(255, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Ls;")
    public static class190 field2412 = new class190();

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field2422 = -1;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Ldj;")
    private static class44 field2425 = class89.method650(255, "Members only world");

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Ldj;")
    private static class44 field2424 = class89.method650(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Ldj;")
    public static class44 field2420 = field2424;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Ldj;")
    public static class44 field2426 = field2425;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lad;")
    public static class5 field2409;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public static final void method908(int arg0, boolean arg1) {
        if (arg0 != -105) {
            return;
        }
        if (class96.field1774.field2260 >> 7 == class198.field3511 && class96.field1774.field2195 >> 7 == class38.field668) {
            class198.field3511 = 0;
        }
        field2421++;
        int var2 = class90.field1702;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class24 var6;
            if (arg1) {
                var6 = class96.field1774;
                var4 = 8791798054912L;
            } else {
                var4 = (long) class45.field858[var3] << 32;
                var6 = class122.field2168[class45.field858[var3]];
            }
            if (var6 != null && var6.method171(2047)) {
                var6.field410 = false;
                int var7 = var6.field2260 >> 7;
                int var8 = var6.field2195 >> 7;
                if ((class33.field583 && class90.field1702 > 50 || class90.field1702 > 200) && !arg1 && var6.field2264 == var6.field2196) {
                    var6.field410 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field415 == null || var6.field408 > class46.field868 || var6.field418 <= class46.field868) {
                        if ((var6.field2260 & 0x7F) == 64 && (var6.field2195 & 0x7F) == 64) {
                            if (class58.field1085[var7][var8] == class42.field785) {
                                continue;
                            }
                            class58.field1085[var7][var8] = class42.field785;
                        }
                        var6.field2206 = class40.method278(var6.field2195, class194.field3403, var6.field2260, (byte) 101);
                        class183.method1149(class194.field3403, var6.field2260, var6.field2195, var6.field2206, 60, var6, var6.field2224, var4, var6.field2213);
                    } else {
                        var6.field410 = false;
                        var6.field2206 = class40.method278(var6.field2195, class194.field3403, var6.field2260, (byte) 101);
                        class109.method785(class194.field3403, var6.field2260, var6.field2195, var6.field2206, var6, var6.field2224, var4, var6.field398, var6.field404, var6.field414, var6.field402);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[ILjg;III)V")
    private final void method909(int arg0, int[] arg1, class105 arg2, int arg3, int arg4, int arg5) {
        if ((this.field2410.field3307[arg2.field1906] & 0x4) != arg4 && arg2.field1914 < 0) {
            int var7 = this.field2410.field3365[arg2.field1906] / class170.field2935;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1912) / var7;
                if (var8 > arg0) {
                    arg2.field1912 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg2.field1919.method100(arg1, arg5, var8);
                arg5 += var8;
                arg2.field1912 += var7 * var8 - 1048576;
                int var9 = 262144 / var7;
                int var10 = class170.field2935 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                class100 var11 = arg2.field1919;
                if (this.field2410.field3311[arg2.field1906] == 0) {
                    arg2.field1919 = class100.method745(arg2.field1928, var11.method744(), var11.method712(), var11.method736());
                } else {
                    arg2.field1919 = class100.method745(arg2.field1928, var11.method744(), 0, var11.method736());
                    this.field2410.method1215(arg2.field1911.field2292[arg2.field1913] < 0, arg4 ^ 0xFFFFFFFE, arg2);
                    arg2.field1919.method708(var10, var11.method712());
                }
                if (arg2.field1911.field2292[arg2.field1913] < 0) {
                    arg2.field1919.method716(-1);
                }
                var11.method720(var10);
                var11.method100(arg1, arg5, arg3 - arg5);
                if (var11.method718()) {
                    this.field2427.method104(var11);
                }
            }
        }
        arg2.field1919.method100(arg1, arg5, arg0);
        field2414++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljg;ZI)V")
    private final void method910(class105 arg0, boolean arg1, int arg2) {
        field2407++;
        if (arg1) {
            return;
        }
        if ((this.field2410.field3307[arg0.field1906] & 0x4) != 0 && arg0.field1914 < 0) {
            int var4 = this.field2410.field3365[arg0.field1906] / class170.field2935;
            int var5 = (var4 + 1048575 - arg0.field1912) / var4;
            arg0.field1912 = arg2 * var4 + arg0.field1912 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field2410.field3311[arg0.field1906] == 0) {
                    arg0.field1919 = class100.method745(arg0.field1928, arg0.field1919.method744(), arg0.field1919.method712(), arg0.field1919.method736());
                } else {
                    arg0.field1919 = class100.method745(arg0.field1928, arg0.field1919.method744(), 0, arg0.field1919.method736());
                    this.field2410.method1215(arg0.field1911.field2292[arg0.field1913] < 0, -2, arg0);
                }
                if (arg0.field1911.field2292[arg0.field1913] < 0) {
                    arg0.field1919.method716(-1);
                }
                arg2 = arg0.field1912 / var4;
            }
        }
        arg0.field1919.method99(arg2);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public final int method110() {
        field2406++;
        return 0;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()Lrd;")
    public final class185 method107() {
        field2418++;
        class105 var1;
        do {
            var1 = (class105) this.field2419.method1192((byte) -79);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1919 == null);
        return var1.field1919;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method911(boolean arg0) {
        field2424 = null;
        field2417 = null;
        field2420 = null;
        if (!arg0) {
            field2412 = null;
            field2425 = null;
            field2426 = null;
            field2409 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        this.field2427.method99(arg0);
        for (class105 var2 = (class105) this.field2419.method1189(0); var2 != null; var2 = (class105) this.field2419.method1192((byte) -92)) {
            if (!this.field2410.method1202(var2, (byte) -89)) {
                int var3 = arg0;
                do {
                    if (var2.field1926 >= var3) {
                        this.method910(var2, false, var3);
                        var2.field1926 -= var3;
                        break;
                    }
                    this.method910(var2, false, var2.field1926);
                    var3 -= var2.field1926;
                } while (!this.field2410.method1226(0, -66, var3, var2, null));
            }
        }
        field2416++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()Lrd;")
    public final class185 method105() {
        field2408++;
        class105 var1 = (class105) this.field2419.method1189(0);
        if (var1 == null) {
            return null;
        } else if (var1.field1919 == null) {
            return this.method107();
        } else {
            return var1.field1919;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([III)V")
    public final void method100(int[] arg0, int arg1, int arg2) {
        field2415++;
        this.field2427.method100(arg0, arg1, arg2);
        for (class105 var4 = (class105) this.field2419.method1189(0); var4 != null; var4 = (class105) this.field2419.method1192((byte) -121)) {
            if (!this.field2410.method1202(var4, (byte) 68)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1926 >= var6) {
                        this.method909(var6, arg0, var4, var5 + var6, 0, var5);
                        var4.field1926 -= var6;
                        break;
                    }
                    this.method909(var4.field1926, arg0, var4, var5 + var6, 0, var5);
                    var5 += var4.field1926;
                    var6 -= var4.field1926;
                } while (!this.field2410.method1226(var5, 75, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JIII)Z")
    public static final boolean method912(long arg0, int arg1, int arg2, int arg3) {
        int var5 = -48 / ((22 - arg1) / 43);
        field2411++;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = (int) arg0 >> 14 & 0x1F;
        int var8 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class39 var9 = class40.method281(true, var8);
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var9.field725;
                var10 = var9.field698;
            } else {
                var10 = var9.field725;
                var11 = var9.field698;
            }
            int var12 = var9.field692;
            if (var6 != 0) {
                var12 = (var12 >> 4 - var6) + (var12 << var6 & 0xF);
            }
            class129.method884(var12, class96.field1774.field2240[0], 2, 0, -129, class96.field1774.field2235[0], true, arg3, arg2, 0, var11, var10);
        } else {
            class129.method884(0, class96.field1774.field2240[0], 2, var7 + 1, -129, class96.field1774.field2235[0], true, arg3, arg2, var6, 0, 0);
        }
        class202.field3617 = 0;
        class1.field9 = 2;
        class87.field1661 = class102.field1860;
        class218.field3951 = class180.field3108;
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
    public static final int method913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2413++;
        int var5 = arg2 - class206.field3700[arg3 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lsb;)V")
    public class135(class192 arg0) {
        this.field2410 = arg0;
    }
}
