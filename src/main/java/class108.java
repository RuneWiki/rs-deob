import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class46 {

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "[Loa;")
    public class98[] field2465;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field2447 = 50;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "[[B")
    public static byte[][] field2448 = new byte[1000][];

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field2454 = 0;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "[I")
    public static int[] field2451 = new int[4000];

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "Lsc;")
    public static class128 field2461 = class129.method1017(false, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "Lsc;")
    public static class128 field2462 = class129.method1017(false, "http:)4)4");

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lsc;")
    public static class128 field2458 = class129.method1017(false, "title_mute");

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Lsc;")
    public static class128 field2463 = class129.method1017(false, "Titelbild geladen)3");

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "Lsc;")
    public static class128 field2467 = class129.method1017(false, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lsc;")
    public static class128 field2456 = class129.method1017(false, "<col=ff7000>");

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "Lsc;")
    public static class128 field2468 = class129.method1017(false, "au");

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Li;")
    public static class56 field2455;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lae;")
    public static class6 field2446;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIILmc;I)V")
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, int arg7) {
        if (arg1 >= 0 && arg1 < 104 && arg2 >= 0 && arg2 < 104) {
            class110.field2485[arg5][arg1][arg2] = 0;
            while (true) {
                int var8 = arg6.method646(-15447);
                if (var8 == 0) {
                    if (arg5 == 0) {
                        class55.field1229[0][arg1][arg2] = -class152.method1206(arg1 + arg4 + 932731, 556238 - -arg0 + arg2, (byte) -64) * 8;
                    } else {
                        class55.field1229[arg5][arg1][arg2] = class55.field1229[arg5 - 1][arg1][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg6.method646(arg7 + 10144);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class55.field1229[0][arg1][arg2] = -var9 * 8;
                    } else {
                        class55.field1229[arg5][arg1][arg2] = class55.field1229[arg5 - 1][arg1][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class16.field305[arg5][arg1][arg2] = arg6.method667(-1);
                    class106.field2418[arg5][arg1][arg2] = (byte) ((var8 - 2) / 4);
                    class156.field3585[arg5][arg1][arg2] = (byte) class25.method224(3, var8 + arg3 - 2);
                } else if (var8 <= 81) {
                    class110.field2485[arg5][arg1][arg2] = (byte) (var8 - 49);
                } else {
                    class9.field139[arg5][arg1][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method646(-15447);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg6.method646(arg7 ^ 0x5FA0);
                    break;
                }
                if (var10 <= 49) {
                    arg6.method646(arg7 + 10144);
                }
            }
        }
        if (arg7 != -25591) {
            method835(68, -109);
        }
        field2452++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
    public static final void method835(int arg0, int arg1) {
        field2460++;
        for (class110 var2 = (class110) class152.field3495.method970(true); var2 != null; var2 = (class110) class152.field3495.method968(127)) {
            if ((var2.field365 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method172(-2658);
            }
        }
        if (arg0 != 1576156720) {
            field2461 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lhe;ILsc;)Lsc;")
    public static final class128 method836(class54 arg0, int arg1, class128 arg2) {
        field2449++;
        if (arg1 == ~arg2.method986(class124.field2801, (byte) -65)) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method986(class41.field761, (byte) -101);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method986(class46.field859, (byte) -42);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method986(class117.field2647, (byte) -126);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method986(class42.field784, (byte) -83);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method986(class151.field3464, (byte) -122);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method986(class72.field1621, (byte) 126);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class128 var9 = class18.field323;
                                                    if (class2.field26 != null) {
                                                        var9 = class58.method444(class2.field26.field1318, false);
                                                        try {
                                                            if (class2.field26.field1319 != null) {
                                                                byte[] var10 = ((String) class2.field26.field1319).getBytes("ISO-8859-1");
                                                                var9 = class46.method337(arg1 ^ 0x3E8, 0, var10.length, var10);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var8), var9, arg2.method998((byte) 53, var8 + 4) }, false);
                                                }
                                            }
                                            arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var7), class93.method730(class147.method1183(true, arg0, 4), arg1 ^ 0x3B9AC9FF), arg2.method998((byte) 89, var7 + 2) }, false);
                                        }
                                    }
                                    arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var6), class93.method730(class147.method1183(true, arg0, 3), 999999999), arg2.method998((byte) 98, var6 + 2) }, false);
                                }
                            }
                            arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var5), class93.method730(class147.method1183(true, arg0, 2), arg1 + 999999999), arg2.method998((byte) 103, var5 + 2) }, false);
                        }
                    }
                    arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var4), class93.method730(class147.method1183(true, arg0, 1), arg1 + 999999999), arg2.method998((byte) 118, var4 + 2) }, false);
                }
            }
            arg2 = class51.method395(new class128[] { arg2.method974(0, (byte) -11, var3), class93.method730(class147.method1183(true, arg0, 0), arg1 ^ 0x3B9AC9FF), arg2.method998((byte) 66, var3 + 2) }, false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static void method837(int arg0) {
        if (arg0 != 2) {
            method840(null, (byte) -88);
        }
        field2463 = null;
        field2448 = null;
        field2467 = null;
        field2455 = null;
        field2468 = null;
        field2451 = null;
        field2456 = null;
        field2458 = null;
        field2446 = null;
        field2461 = null;
        field2462 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)Z")
    public final boolean method838(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        } else {
            field2450++;
            return this.field2465[arg1].field2270;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static final void method839(byte arg0) {
        class115.field2582.method919((byte) -104);
        field2453++;
        if (arg0 > -124) {
            field2456 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;B)V")
    public static final void method840(class50 arg0, byte arg1) {
        if (class29.field554 == arg0.field1014 || arg0.field981 == -1 || arg0.field970 != 0 || arg0.field957 + 1 > class70.method527(12, arg0.field981).field3162[arg0.field973]) {
            int var2 = arg0.field1014 - arg0.field949;
            int var3 = class29.field554 - arg0.field949;
            int var4 = arg0.field971 * 128 + arg0.field960 * 64;
            int var5 = arg0.field982 * 128 + arg0.field960 * 64;
            int var6 = arg0.field974 * 128 + arg0.field960 * 64;
            arg0.field975 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var7 = arg0.field969 * 128 + arg0.field960 * 64;
            arg0.field987 = ((var2 - var3) * var7 + var3 * var6) / var2;
        }
        arg0.field995 = 0;
        if (arg0.field988 == 0) {
            arg0.field985 = 1024;
        }
        if (arg0.field988 == 1) {
            arg0.field985 = 1536;
        }
        int var8 = 108 % ((arg1 + 11) / 42);
        field2464++;
        if (arg0.field988 == 2) {
            arg0.field985 = 0;
        }
        if (arg0.field988 == 3) {
            arg0.field985 = 512;
        }
        arg0.field1012 = arg0.field985;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lsc;Lsc;ILsf;)Lb;")
    public static final class8 method841(class128 arg0, class128 arg1, int arg2, class131 arg3) {
        field2466++;
        if (arg2 != -2) {
            method839((byte) -108);
        }
        int var4 = arg3.method1036(arg1, (byte) -103);
        int var5 = arg3.method1031(var4, arg0, (byte) -74);
        return class50.method385(arg3, var4, var5, -2021);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(ZI)V")
    public static final void method842(boolean arg0, int arg1) {
        field2459++;
        if (class92.field2083 == null) {
            return;
        }
        if (arg1 != -2727) {
            field2451 = null;
        }
        try {
            class86 var2 = new class86(4);
            var2.method653(arg0 ? 2 : 3, 0);
            var2.method626(0, (byte) -113);
            class92.field2083.method496(true, var2.field1920, 4, 0);
        } catch (IOException var4) {
            try {
                class92.field2083.method502((byte) -1);
            } catch (Exception var3) {
            }
            class27.field525++;
            class92.field2083 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lsf;Lsf;IZ)V")
    public class108(class131 arg0, class131 arg1, int arg2, boolean arg3) {
        class121 var5 = new class121();
        int var6 = arg0.method1022(33, arg2);
        this.field2465 = new class98[var6];
        int[] var7 = arg0.method1043(arg2, -20);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1023(var7[var8], arg2, (byte) -35);
            class142 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class142 var12 = (class142) var5.method920((byte) 126); var12 != null; var12 = (class142) var5.method932(-6)) {
                if (var12.field3332 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1024(var11, 0, true);
                } else {
                    var13 = arg1.method1024(0, var11, true);
                }
                var10 = new class142(var11, var13);
                var5.method926(5569, var10);
            }
            this.field2465[var7[var8]] = new class98(var9, var10);
        }
    }
}
