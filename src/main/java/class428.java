import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class428 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
    public boolean field5536 = true;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5544 = new String[8];

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[F")
    public static float[] field5547 = new float[4];

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5543 = null;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "C")
    private char field5540;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public int field5546;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/String;")
    public String field5541;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
    public static final void method2455(boolean arg0) {
        field5545++;
        class692.field9454 = new class364();
        if (!arg0) {
            field5544 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfd;BI)V")
    private final void method2456(class418 arg0, byte arg1, int arg2) {
        if (arg1 != 10) {
            this.field5540 = '^';
        }
        field5542++;
        if (arg2 == 1) {
            this.field5540 = class103.method778(arg1 + 12260, arg0.method2387((byte) -108));
        } else if (arg2 == 2) {
            this.field5546 = arg0.method2355(97);
        } else if (arg2 == 4) {
            this.field5536 = false;
        } else if (arg2 == 5) {
            this.field5541 = arg0.method2394(arg1 - 6);
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfd;B)V")
    public final void method2457(class418 arg0, byte arg1) {
        field5538++;
        while (true) {
            int var3 = arg0.method2396(103);
            if (var3 == 0) {
                if (arg1 < 53) {
                    this.field5546 = 18;
                    return;
                } else {
                    return;
                }
            }
            this.method2456(arg0, (byte) 10, var3);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
    public static final int method2458(int arg0) {
        field5548++;
        int var1 = 127 / ((-arg0 - 9) / 46);
        return 19;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lfc;[III[II)Lod;")
    public static final class677 method2459(class575 arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field5549++;
        if (arg5 != 7412) {
            return null;
        } else if (arg0.method222(class228.field3042, (byte) 102, class6.field48)) {
            byte[] var10 = new byte[arg2 * arg3];
            for (int var11 = 0; var11 < arg2; var11++) {
                int var12 = arg3 * var11 + arg4[var11];
                for (int var13 = 0; var13 < arg1[var11]; var13++) {
                    var10[var12++] = -1;
                }
            }
            return new class677(arg0, arg3, arg2, var10);
        } else {
            int[] var6 = new int[arg2 * arg3];
            for (int var7 = 0; var7 < arg2; var7++) {
                int var8 = arg3 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg1[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class677(arg0, arg3, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
    public final boolean method2460(int arg0) {
        if (arg0 == -28741) {
            field5539++;
            return this.field5540 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2461(int arg0, int arg1, String arg2) {
        field5537++;
        int var3 = class260.field3508;
        if (arg1 != 4) {
            method2462(60, null, -54, (byte) 123, 108, -73);
        }
        int[] var4 = class135.field1779;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class193 var7 = class592.field8019[var4[var6]];
            if (var7 != null && class233.field3130 != var7 && var7.field2492 != null && var7.field2492.equalsIgnoreCase(arg2)) {
                var5 = true;
                if (arg0 == 1) {
                    class472.field6149++;
                    class11 var12 = class130.method931(class649.field9035, (byte) 54, class160.field2002);
                    var12.field114.method2360(0, -72);
                    var12.field114.method2386(var4[var6], 1103587288);
                    class100.method760(var12, -111);
                } else if (arg0 == 4) {
                    class476.field6212++;
                    class11 var8 = class130.method931(class649.field9035, (byte) 54, class287.field3713);
                    var8.field114.method2361(0, true);
                    var8.field114.method2385(var4[var6], arg1 ^ 0xFFFFF9F8);
                    class100.method760(var8, arg1 ^ 0xFFFFFF9F);
                } else if (arg0 == 5) {
                    class275.field3608++;
                    class11 var11 = class130.method931(class649.field9035, (byte) 54, class692.field9462);
                    var11.field114.method2414(false, var4[var6]);
                    var11.field114.method2360(0, -113);
                    class100.method760(var11, -116);
                } else if (arg0 == 6) {
                    class62.field847++;
                    class11 var9 = class130.method931(class649.field9035, (byte) 54, class275.field3612);
                    var9.field114.method2360(0, -72);
                    var9.field114.method2395(var4[var6], (byte) -104);
                    class100.method760(var9, arg1 ^ 0x50);
                } else if (arg0 == 7) {
                    class83.field1126++;
                    class11 var10 = class130.method931(class649.field9035, (byte) 54, class485.field6463);
                    var10.field114.method2386(var4[var6], arg1 ^ 0x41C767DC);
                    var10.field114.method2404(128, 0);
                    class100.method760(var10, arg1 + 48);
                }
                break;
            }
        }
        if (!var5) {
            class433.method2476(class604.field8145.method3280((byte) -68, class144.field1890) + arg2, false, 4);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method2462(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class655.field9110++;
        class352.field4518 = 0;
        for (int var6 = class62.field848; var6 < class20.field223; var6++) {
            class530[][] var15 = class483.field6438[var6];
            for (int var16 = class603.field8119; var16 < class337.field4360; var16++) {
                for (int var17 = class244.field3272; var17 < class120.field1551; var17++) {
                    class530 var18 = var15[var16][var17];
                    if (var18 != null) {
                        if (class505.field6641[var16 + class703.field9809 - class658.field9175][var17 + class703.field9809 - class659.field9178] && arg1 == null || var6 < arg2 || arg1[var6][var16][var17] != arg3) {
                            var18.field6894 = true;
                            var18.field6885 = true;
                            if (var18.field6887 == null) {
                                var18.field6892 = false;
                            } else {
                                var18.field6892 = true;
                            }
                            class352.field4518++;
                        } else {
                            var18.field6894 = false;
                            var18.field6885 = false;
                            var18.field6881 = 0;
                            if (var16 >= class658.field9175 - 16 && var16 <= class658.field9175 + 16 && var17 >= class659.field9178 - 16 && var17 <= class659.field9178 + 16 && (var18.field6879 != null || var18.field6886 != null || var18.field6895 != null || var18.field6893 != null || var18.field6878 != null || var18.field6887 != null)) {
                                class89.field1174.method881(var18, 125);
                            }
                        }
                    }
                }
            }
        }
        for (int var7 = class62.field848; var7 < class20.field223; var7++) {
            if (class273.field3602.method340() && var7 >= arg2 && arg1 != null) {
                int var8 = class505.field6641.length;
                if (class505.field6641.length + class603.field8119 > class590.field8010) {
                    var8 -= class505.field6641.length + class603.field8119 - class590.field8010;
                }
                int var9 = class505.field6641[0].length;
                if (class505.field6641[0].length + class244.field3272 > class151.field1933) {
                    var9 -= class505.field6641[0].length + class244.field3272 - class151.field1933;
                }
                int var10 = class649.field9047;
                while (true) {
                    if (var10 >= var8) {
                        class89.field1174.method879(true, (byte) -105, class392.field4997[var7], var7);
                        break;
                    }
                    int var11 = class603.field8119 + var10 - class649.field9047;
                    for (int var12 = class122.field1570; var12 < var9; var12++) {
                        class294.field3808[var10][var12] = false;
                        if (class505.field6641[var10][var12]) {
                            int var13 = class244.field3272 + var12 - class122.field1570;
                            for (int var14 = var7; var14 >= 0; var14--) {
                                if (class483.field6438[var14][var11][var13] != null && class483.field6438[var14][var11][var13].field6897 == var7) {
                                    class294.field3808[var10][var12] = class483.field6438[var14][var11][var13].field6894;
                                    break;
                                }
                            }
                        }
                    }
                    var10++;
                }
            } else {
                class89.field1174.method879(false, (byte) 108, class392.field4997[var7], var7);
            }
            class89.field1174.method877((byte) -9);
        }
        if (!class369.method2121(true)) {
            class369.method2121(false);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static void method2463(int arg0) {
        field5547 = null;
        if (arg0 != 17871) {
            field5544 = null;
        }
        field5543 = null;
        field5544 = null;
    }
}
