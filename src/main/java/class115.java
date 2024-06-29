import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class115 extends class292 {

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "Lve;")
    public static class255 field1958 = class87.method607(25, "Fertigkeit:");

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "Lve;")
    public static class255 field1961 = class87.method607(32, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "[I")
    public static int[] field1964 = new int[5];

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lrg;")
    public static class88 field1955;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Lrg;")
    public static class88 field1963;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "[Ldm;")
    public static class273[] field1954;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "[[[Lsc;")
    public static class249[][][] field1956;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 4)
    public static void method875(int arg0) {
        if (arg0 >= -84) {
            method877(-46);
        }
        field1958 = null;
        field1964 = null;
        field1955 = null;
        field1954 = null;
        field1961 = null;
        field1956 = (class249[][][]) null;
        field1963 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIZIBII)Z", line = 20)
    public static final boolean method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, byte arg9, int arg10, int arg11) {
        field1959++;
        if (class276.field4742.method1680(-118) == 2) {
            return class282.method1990(10, arg2, arg6, arg7, arg8, arg1, arg11, arg3, arg10, arg4, arg0, arg5);
        } else if (class276.field4742.method1680(-114) > 2) {
            return class113.method858(arg6, arg7, arg8, arg3, arg1, arg2, arg11, true, arg10, arg4, arg0, class276.field4742.method1680(-127), arg5);
        } else if (arg9 >= -6) {
            return true;
        } else {
            return class20.method112(arg1, arg2, arg5, 1, arg10, arg6, arg7, arg0, arg4, arg3, arg8, arg11);
        }
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V", line = 80)
    public static final void method877(int arg0) {
        class156.field2657 = 2;
        class262.field4447 = 0;
        class93.field1597 = 0;
        if (arg0 <= 116) {
            field1957 = 60;
        }
        class73.field1202 = null;
        field1952++;
        class88.field1432 = 0;
        class269.field4623 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V", line = 100)
    public static final void method878(int arg0) {
        field1960++;
        if (class51.field767 != null || class300.field5110 != null || arg0 != 20425) {
            return;
        }
        int var1 = class119.field1994;
        if (class156.field2651) {
            if (var1 != 1) {
                int var2 = class2.field31;
                int var3 = class67.field994;
                if (var2 < class249.field4172 - 10 || var2 > (class249.field4172 + class173.field2864 + 10) || class184.field2974 - 10 > var3 || var3 > (class184.field2974 - (-class148.field2507 - 10))) {
                    class156.field2651 = false;
                    class124.method915(class249.field4172, class148.field2507, -2, class184.field2974, class173.field2864);
                }
            }
            if (var1 == 1) {
                int var4 = class184.field2973;
                int var5 = class184.field2974;
                int var6 = class249.field4172;
                int var7 = -1;
                int var8 = class173.field2864;
                int var9 = field1953;
                for (int var10 = 0; var10 < class136.field2272; var10++) {
                    int var11 = (class136.field2272 - var10 - 1) * 15 + var5 + 31;
                    if (var6 < var4 && var6 + var8 > var4 && var9 > (var11 - 13) && (var11 + 3) > var9) {
                        var7 = var10;
                    }
                }
                if (var7 != -1) {
                    class271.method1893((byte) -128, var7);
                }
                class156.field2651 = false;
                class124.method915(class249.field4172, class148.field2507, -2, class184.field2974, class173.field2864);
            }
            return;
        }
        if (var1 == 1 && class136.field2272 > 0) {
            short var12 = class264.field4466[class136.field2272 - 1];
            if (var12 == 13 || var12 == 36 || var12 == 32 || var12 == 5 || var12 == 44 || var12 == 9 || var12 == 22 || var12 == 39 || var12 == 28 || var12 == 20 || var12 == 29 || var12 == 1003) {
                int var13 = class295.field5063[class136.field2272 - 1];
                int var14 = class287.field4910[class136.field2272 - 1];
                class197 var15 = class58.method353(var14, (byte) 66);
                if (class120.method894(client.method1673(var15), (byte) 120) || class16.method79((byte) -112, client.method1673(var15))) {
                    class114.field1926 = 0;
                    class223.field3748 = false;
                    if (class51.field767 != null) {
                        class108.method834((byte) 49, class51.field767);
                    }
                    class51.field767 = class58.method353(var14, (byte) 112);
                    class274.field4703 = field1953;
                    class79.field1287 = class184.field2973;
                    class47.field704 = var13;
                    class108.method834((byte) 49, class51.field767);
                    return;
                }
            }
        }
        if (var1 == 1 && (class195.field3220 == 1 && class136.field2272 > 2 || class125.method922(class136.field2272 - 1, -48))) {
            var1 = 2;
        }
        if (var1 == 2 && class136.field2272 > 0 || class166.field2795 == 1) {
            class108.method837((byte) -111);
        }
        if (var1 == 1 && class136.field2272 > 0 || class166.field2795 == 2) {
            class38.method226(-710);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)[[I", line = 231)
    public final int[][] method13(boolean arg0, int arg1) {
        field1965++;
        if (!arg0) {
            method877(-42);
        }
        int[][] var3 = this.field4418.method35(arg1, 96);
        if (this.field4418.field94 && this.method2065((byte) -108)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field5017 * this.field5017;
            for (int var8 = 0; var8 < class92.field1576; var8++) {
                int var9 = this.field5018[var8 % this.field5015 + var7];
                var6[var8] = class154.method1134(4080, var9 << 4);
                var5[var8] = class154.method1134(var9 >> 4, 4080);
                var4[var8] = class154.method1134(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lpb;Lfk;IB)V", line = 279)
    public static final void method879(class70 arg0, class40 arg1, int arg2, byte arg3) {
        if (arg3 != -69) {
            method879((class70) null, (class40) null, 108, (byte) -52);
        }
        field1962++;
        class280 var4 = new class280();
        var4.field4805 = arg0.method481(0);
        var4.field4802 = arg0.method469(arg3 ^ 0xFFFFFFDF);
        var4.field4808 = new class169[var4.field4805];
        var4.field4793 = new int[var4.field4805];
        var4.field4797 = new int[var4.field4805];
        var4.field4788 = new class169[var4.field4805];
        var4.field4804 = new int[var4.field4805];
        var4.field4796 = new byte[var4.field4805][][];
        for (int var5 = 0; var5 < var4.field4805; var5++) {
            try {
                int var6 = arg0.method481(0);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var17 = 0;
                    String var18 = new String(arg0.method479(-1).method1742((byte) -28));
                    String var19 = new String(arg0.method479(-1).method1742((byte) -28));
                    if (var6 == 1) {
                        var17 = arg0.method469(80);
                    }
                    var4.field4797[var5] = var6;
                    var4.field4804[var5] = var17;
                    var4.field4808[var5] = arg1.method250(true, class123.method913(false, var18), var19);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method479(-1).method1742((byte) -28));
                    String var8 = new String(arg0.method479(-1).method1742((byte) -28));
                    int var9 = arg0.method481(arg3 + 69);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method479(-1).method1742((byte) -28));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method469(116);
                            var12[var13] = new byte[var14];
                            arg0.method447(var12[var13], -122, var14, 0);
                        }
                    }
                    var4.field4797[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class123.method913(false, var10[var16]);
                    }
                    var4.field4788[var5] = arg1.method233(class123.method913(false, var7), var15, var8, (byte) -27);
                    var4.field4796[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4793[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4793[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4793[var5] = -3;
            } catch (Exception var28) {
                var4.field4793[var5] = -4;
            } catch (Throwable var29) {
                var4.field4793[var5] = -5;
            }
        }
        class80.field1302.method1472(true, var4);
    }
}
