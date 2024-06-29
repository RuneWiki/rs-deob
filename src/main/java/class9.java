import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 {

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lrd;")
    public static class173 field159 = class133.method843("Musik)2Engine vorbereitet)3", -86);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "[[B")
    public static byte[][] field163 = new byte[1000][];

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[J")
    public static long[] field168 = new long[32];

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Lrd;")
    public static class173 field164 = class133.method843("Fehler beim Laden Ihres Spielcharakters)3", -94);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lrd;")
    public static class173 field167 = class133.method843("Gegenstand f-Ur Mitglieder", 80);

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
    public static int[] field169 = new int[128];

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public static final void method59(int arg0, int arg1) {
        field162++;
        class174.method1164(104);
        class5.method39(false);
        int var2 = class48.method334((byte) -6, arg0).field4038;
        if (var2 == 0) {
            return;
        }
        int var3 = class45.field913[arg0];
        if (var2 == 1) {
            class15.field348 = var3;
            if (class15.field348 == 1) {
                class72.method438(0.9F);
            }
            if (class15.field348 == 2) {
                class72.method438(0.8F);
            }
            if (class15.field348 == 3) {
                class72.method438(0.7F);
            }
            if (class15.field348 == 4) {
                class72.method438(0.6F);
            }
            class191.method1274((byte) 125);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class211.field4079 != var4) {
                if (class211.field4079 == 0 && class170.field3282 != -1) {
                    class103.method642(false, class114.field2106, false, var4, 0, class170.field3282);
                    class138.field2588 = false;
                } else if (var4 == 0) {
                    class214.method1408((byte) -71);
                    class138.field2588 = false;
                } else {
                    class112.method679(var4, -15842);
                }
                class211.field4079 = var4;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class31.field667 = 127;
            }
            if (var3 == 1) {
                class31.field667 = 96;
            }
            if (var3 == 2) {
                class31.field667 = 64;
            }
            if (var3 == 3) {
                class31.field667 = 32;
            }
            if (var3 == 4) {
                class31.field667 = 0;
            }
        }
        if (var2 == 5) {
            class48.field1019 = var3;
        }
        if (var2 == 6) {
            class77.field1501 = var3;
        }
        if (arg1 == var2) {
            if (var3 == 0) {
                class7.field133 = 127;
            }
            if (var3 == 1) {
                class7.field133 = 96;
            }
            if (var3 == 2) {
                class7.field133 = 64;
            }
            if (var3 == 3) {
                class7.field133 = 32;
            }
            if (var3 == 4) {
                class7.field133 = 0;
            }
        }
        if (var2 == 9) {
            class188.field3669 = var3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public static final void method60(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1957 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILmb;Lna;B)V")
    public static final void method61(int arg0, class121 arg1, class130 arg2, byte arg3) {
        int var4 = 54 / ((49 - arg3) / 33);
        field160++;
        class199 var5 = new class199();
        var5.field3876 = arg1.method751((byte) 104);
        var5.field3883 = arg1.method776(72);
        var5.field3873 = new class222[var5.field3876];
        var5.field3878 = new byte[var5.field3876][][];
        var5.field3870 = new int[var5.field3876];
        var5.field3867 = new int[var5.field3876];
        var5.field3866 = new class222[var5.field3876];
        var5.field3872 = new int[var5.field3876];
        for (int var6 = 0; var6 < var5.field3876; var6++) {
            try {
                int var7 = arg1.method751((byte) -43);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var18 = new String(arg1.method746(-19941).method1135((byte) -60));
                    String var19 = new String(arg1.method746(-19941).method1135((byte) -31));
                    int var20 = 0;
                    if (var7 == 1) {
                        var20 = arg1.method776(62);
                    }
                    var5.field3872[var6] = var7;
                    var5.field3870[var6] = var20;
                    var5.field3866[var6] = arg2.method830(var19, class202.method1343(true, var18), -6752);
                } else if (var7 == 3 || var7 == 4) {
                    String var8 = new String(arg1.method746(-19941).method1135((byte) -65));
                    String var9 = new String(arg1.method746(-19941).method1135((byte) -88));
                    int var10 = arg1.method751((byte) 92);
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = new String(arg1.method746(-19941).method1135((byte) -23));
                    }
                    byte[][] var13 = new byte[var10][];
                    if (var7 == 3) {
                        for (int var14 = 0; var14 < var10; var14++) {
                            int var15 = arg1.method776(-76);
                            var13[var14] = new byte[var15];
                            arg1.method770(49152, var13[var14], 0, var15);
                        }
                    }
                    var5.field3872[var6] = var7;
                    Class[] var16 = new Class[var10];
                    for (int var17 = 0; var17 < var10; var17++) {
                        var16[var17] = class202.method1343(true, var11[var17]);
                    }
                    var5.field3873[var6] = arg2.method831((byte) -31, var9, class202.method1343(true, var8), var16);
                    var5.field3878[var6] = var13;
                }
            } catch (ClassNotFoundException var21) {
                var5.field3867[var6] = -1;
            } catch (SecurityException var22) {
                var5.field3867[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field3867[var6] = -3;
            } catch (Exception var24) {
                var5.field3867[var6] = -4;
            } catch (Throwable var25) {
                var5.field3867[var6] = -5;
            }
        }
        class140.field2617.method920(false, var5);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I")
    public static final int method62(int arg0, int arg1) {
        field161++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg1 != -1) {
            field159 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method63(int arg0) {
        field168 = null;
        field163 = null;
        if (arg0 != -7329) {
            field167 = null;
        }
        field164 = null;
        field159 = null;
        field167 = null;
        field169 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([Lrd;[SI)V")
    public static final void method64(class173[] arg0, short[] arg1, int arg2) {
        class204.method1360(0, arg0, arg1, arg0.length - 1, 1);
        if (arg2 != -27811) {
            field168 = null;
        }
        field165++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II[Lqf;)V")
    public static final void method65(int arg0, int arg1, class165[] arg2) {
        if (arg0 != 17644) {
            field170 = -114;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class165 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field3077 == 0) {
                    if (var4.field3067 != null) {
                        method65(17644, arg1, var4.field3067);
                    }
                    class157 var5 = (class157) client.field637.method677(-2755, (long) var4.field3132);
                    if (var5 != null) {
                        class31.method254(28, var5.field2940, arg1);
                    }
                }
                if (arg1 == 0 && var4.field3116 != null) {
                    class117 var6 = new class117();
                    var6.field2155 = var4;
                    var6.field2174 = var4.field3116;
                    class189.method1265(-3256, var6);
                }
                if (arg1 == 1 && var4.field3092 != null) {
                    if (var4.field3173 >= 0) {
                        class165 var7 = class103.method639(var4.field3132, true);
                        if (var7 == null || var7.field3067 == null || var7.field3067.length <= var4.field3173 || var7.field3067[var4.field3173] != var4) {
                            continue;
                        }
                    }
                    class117 var8 = new class117();
                    var8.field2155 = var4;
                    var8.field2174 = var4.field3092;
                    class189.method1265(-3256, var8);
                }
            }
        }
        field157++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class51.method350(arg5, arg4, (byte) -124, class107.field1998[arg1], arg2);
        field158++;
        int var9 = arg3 - 1;
        class51.method350(arg5, arg4, (byte) -117, class107.field1998[arg3], arg2);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class107.field1998[var6];
            var7[arg5] = var7[arg2] = arg4;
        }
        if (arg0 != 358345732) {
            field168 = null;
        }
    }
}
