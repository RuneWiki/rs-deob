import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class266 extends class237 {

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field4282 = new int[128];

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Z")
    public static boolean field4280 = false;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public int field4291;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public int field4293;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)V")
    public static final void method1789(long arg0, int arg1) {
        field4278++;
        if (class283.field4513 == 1 || class283.field4513 == 5) {
            class137.method946(7342, arg0);
        } else if (class283.field4513 == 2) {
            class57.method328(-123);
        } else {
            class101.method615(arg1 ^ 0x3E6B);
        }
        if (!class262.field4250) {
            class191.field3084[0] = class280.field4449;
            class155.field2423[0] = 1005;
            class78.field977[0] = "";
            class187.field2989[0] = class136.field2157;
            class34.field437 = 1;
            if (class129.field2069 != 0) {
                class273.field4369 = class200.field3168;
                class98.field1297 = class95.field1207;
            } else if (class90.field1119 == 0) {
                class98.field1297 = class113.field1623;
                class273.field4369 = class92.field1156;
            } else {
                class98.field1297 = class107.field1449;
                class273.field4369 = class214.field3435;
            }
        }
        if (class164.field2602 != -1) {
            class274.method1838(class164.field2602, true);
        }
        for (int var3 = 0; var3 < class221.field3561; var3++) {
            if (class21.field279[var3]) {
                class103.field1386[var3] = true;
            }
            class225.field3616[var3] = class21.field279[var3];
            class21.field279[var3] = false;
        }
        class28.field403 = null;
        class74.field929 = class73.field924;
        class195.field3116 = -1;
        if (arg1 != -11169) {
            method1794(9, true);
        }
        class36.field461 = null;
        class211.field3400 = -1;
        if (class164.field2602 != -1) {
            class221.field3561 = 0;
            client.method738((byte) 104);
        }
        class217.method1535();
        class136.method921(-1001);
        if (class262.field4250) {
            if (class164.field2607) {
                class297.method1989(true);
            } else {
                class57.method329(1000);
            }
        } else if (class28.field403 != null) {
            class171.method1164(class147.field2306, arg1 ^ 0xFFFFD45E, class171.field2715, class28.field403);
        } else if (class211.field3400 != -1) {
            class171.method1164(class211.field3400, 1, class195.field3116, (class123) null);
        }
        int var4 = class262.field4250 ? -1 : class129.method877((byte) -25);
        if (var4 == -1) {
            var4 = class81.field1007;
        }
        class122.method791(var4, (byte) -13);
        if (class203.field3204 == 1) {
            class203.field3204 = 2;
        }
        if (class116.field1654 == 1) {
            class116.field1654 = 2;
        }
        if (class244.field4005 == 3) {
            for (int var5 = 0; var5 < class221.field3561; var5++) {
                if (class225.field3616[var5]) {
                    class217.method1540(class233.field3858[var5], class148.field2328[var5], class180.field2869[var5], class256.field4160[var5], 16711935, 128);
                } else if (class103.field1386[var5]) {
                    class217.method1540(class233.field3858[var5], class148.field2328[var5], class180.field2869[var5], class256.field4160[var5], 16711680, 128);
                }
            }
        }
        class261.method1776(class244.field4011, class286.field4571.field3820, -7358, class286.field4571.field3818, class32.field427);
        class32.field427 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 0 && arg2 >= 0 && arg7 < 103 && arg2 < 103) {
            if (arg6 == 0) {
                class187 var8 = class4.method20(arg0, arg7, arg2);
                if (var8 != null) {
                    int var9 = (int) (var8.field2977 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field2983 = new class24(var9, 2, arg1 + 4, arg0, arg7, arg2, arg4, false, var8.field2983);
                        var8.field2990 = new class24(var9, 2, arg1 + 1 & 0x3, arg0, arg7, arg2, arg4, false, var8.field2990);
                    } else {
                        var8.field2983 = new class24(var9, arg5, arg1, arg0, arg7, arg2, arg4, false, var8.field2983);
                    }
                }
            }
            if (arg6 == 1) {
                class128 var10 = class285.method1914(arg0, arg7, arg2);
                if (var10 != null) {
                    int var11 = (int) (var10.field2051 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field2043 = new class24(var11, 4, arg1, arg0, arg7, arg2, arg4, false, var10.field2043);
                    } else if (arg5 == 6) {
                        var10.field2043 = new class24(var11, 4, arg1 + 4, arg0, arg7, arg2, arg4, false, var10.field2043);
                    } else if (arg5 == 7) {
                        var10.field2043 = new class24(var11, 4, (arg1 + 2 & 0x3) + 4, arg0, arg7, arg2, arg4, false, var10.field2043);
                    } else if (arg5 == 8) {
                        var10.field2043 = new class24(var11, 4, arg1 + 4, arg0, arg7, arg2, arg4, false, var10.field2043);
                        var10.field2061 = new class24(var11, 4, (arg1 + 2 & 0x3) + 4, arg0, arg7, arg2, arg4, false, var10.field2061);
                    }
                }
            }
            if (arg6 == 2) {
                class19 var12 = class74.method417(arg0, arg7, arg2);
                if (arg5 == 11) {
                    arg5 = 10;
                }
                if (var12 != null) {
                    var12.field234 = new class24((int) (var12.field244 >>> 32) & Integer.MAX_VALUE, arg5, arg1, arg0, arg7, arg2, arg4, false, var12.field234);
                }
            }
            if (arg6 == 3) {
                class11 var13 = class181.method1259(arg0, arg7, arg2);
                if (var13 != null) {
                    var13.field127 = new class24(Integer.MAX_VALUE & (int) (var13.field118 >>> 32), 22, arg1, arg0, arg7, arg2, arg4, false, var13.field127);
                }
            }
        }
        field4279++;
        if (arg3 != Integer.MAX_VALUE) {
            method1789(-122L, -93);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)Lnl;")
    public static final class216 method1791(int arg0, byte arg1) {
        field4276++;
        if (class294.field4667 && arg0 >= class44.field560 && arg0 <= class82.field1023) {
            if (arg1 != -65) {
                method1795((byte) -126, (String[]) null, (short[]) null);
            }
            return class84.field1046[arg0 - class44.field560];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method1792(int arg0, String arg1, char arg2) {
        field4284++;
        int var3 = 0;
        if (arg0 > -16) {
            field4282 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
    public static void method1793(byte arg0) {
        if (arg0 > -85) {
            field4282 = null;
        }
        field4282 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)V")
    public static final void method1794(int arg0, boolean arg1) {
        field4287++;
        class233 var2 = class114.method746(arg0, 1228126432, 6);
        var2.method1653(false);
        if (!arg1) {
            field4280 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B[Ljava/lang/String;[S)V")
    public static final void method1795(byte arg0, String[] arg1, short[] arg2) {
        field4288++;
        if (arg0 < -126) {
            class22.method127(arg1.length - 1, arg1, 0, (byte) 98, arg2);
        }
    }
}
