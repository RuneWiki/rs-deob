import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class184 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[[[I")
    public static int[][][] field2964 = new int[2][][];

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
    public static int[] field2966 = new int[128];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIB)V", line = 5)
    public static final void method1264(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 94) {
            field2964 = (int[][][]) ((int[][][]) null);
        }
        if (arg0 == 0) {
            class21.field313.method1541(-85, 58);
            class21.field313.method1365(-32769, 5);
            class238.field3760++;
        }
        field2967++;
        if (arg0 == 1) {
            class144.field2157++;
            class21.field313.method1541(58, 219);
            class21.field313.method1365(-32769, 19);
        }
        class21.field313.method1401(class181.field2925 + arg2, -16384);
        class21.field313.method1406(class333.field5177[82] ? 1 : 0, (byte) 122);
        class21.field313.method1361(class24.field351 + arg1, -488903776);
        class300.field4690 = arg1;
        class174.field2784 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lii;", line = 36)
    public static final class228 method1265(int arg0, int arg1) {
        class228 var2 = (class228) class17.field225.method768((long) arg0, false);
        field2965++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class305.field4757.method250(true, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class228 var4 = new class228();
        int var5 = -103 / ((arg1 + 6) / 42);
        class192 var6 = new class192(var3);
        var6.field3129 = var6.field3128.length - 2;
        int var7 = var6.method1396(-81);
        int var8 = var6.field3128.length - (var7 + 2 + 12);
        var6.field3129 = var8;
        int var9 = var6.method1354((byte) -113);
        var4.field3608 = var6.method1396(-48);
        var4.field3610 = var6.method1396(-19);
        var4.field3617 = var6.method1396(-29);
        var4.field3615 = var6.method1396(-99);
        int var10 = var6.method1399(-1172389784);
        if (var10 > 0) {
            var4.field3614 = new class246[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method1396(-83);
                class246 var13 = new class246(class290.method2032(42, var12));
                var4.field3614[var11] = var13;
                while ((var12--) > 0) {
                    int var14 = var6.method1354((byte) 9);
                    int var15 = var6.method1354((byte) -125);
                    var13.method1750(new class310(var15), (byte) 120, (long) var14);
                }
            }
        }
        var6.field3129 = 0;
        var4.field3613 = var6.method1383(14334);
        int var16 = 0;
        var4.field3609 = new String[var9];
        var4.field3616 = new int[var9];
        var4.field3612 = new int[var9];
        while (var8 > var6.field3129) {
            int var17 = var6.method1396(-117);
            if (var17 == 3) {
                var4.field3609[var16] = var6.method1355((byte) 38).intern();
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field3612[var16] = var6.method1399(-1172389784);
            } else {
                var4.field3612[var16] = var6.method1354((byte) -115);
            }
            var4.field3616[var16++] = var17;
        }
        class17.field225.method770(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 127)
    public static final String method1266(int arg0, long arg1) {
        field2960++;
        class305.field4765.setTime(new Date(arg1));
        int var3 = class305.field4765.get(7);
        int var4 = class305.field4765.get(5);
        int var5 = class305.field4765.get(2);
        int var6 = class305.field4765.get(1);
        int var7 = class305.field4765.get(11);
        if (arg0 == 23225) {
            int var8 = class305.field4765.get(12);
            int var9 = class305.field4765.get(13);
            return class116.field1749[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class45.field610[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V", line = 155)
    public static final void method1267(int arg0, int arg1, int arg2) {
        if (arg1 != -12676) {
            field2964 = (int[][][]) ((int[][][]) null);
        }
        field2961++;
        int var3 = class13.field164 * arg0 >> 8;
        if (arg2 == -1 && !class334.field5181) {
            class263.method1876(arg1 ^ 0x10A2);
        } else if (arg2 != -1 && (class59.field771 != arg2 || !class36.method232(arg1 + 12564)) && var3 != 0 && !class334.field5181) {
            class274.method1954(2, arg2, 1, false, 0, var3, class139.field2077);
        }
        class59.field771 = arg2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 183)
    public static final void method1268(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field2962++;
        class160 var5 = class241.method1709(arg0, arg3 + 88, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2440 != null) {
            class247 var6 = new class247();
            var6.field3924 = arg4;
            var6.field3925 = var5.field2440;
            var6.field3927 = arg1;
            var6.field3931 = var5;
            class69.method455(var6, (byte) -64);
        }
        boolean var7 = true;
        if (var5.field2461 > 0) {
            var7 = class339.method2335(var5, true);
        }
        if (!var7 || !client.method1913(var5).method1171(arg3 ^ 0xC, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class21.field313.method1541(115, 143);
            class21.field313.method1350(arg2, -82);
            class21.field313.method1368(arg0, 4796);
            class255.field4042++;
        }
        if (arg4 == 2) {
            class127.field1895++;
            class21.field313.method1541(-84, 246);
            class21.field313.method1350(arg2, -50);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 3) {
            class21.field313.method1541(-82, 164);
            class21.field313.method1350(arg2, arg3 ^ 0xFFFFFFA1);
            class21.field313.method1368(arg0, 4796);
            class309.field4822++;
        }
        if (arg3 == arg4) {
            class296.field4652++;
            class21.field313.method1541(-69, 54);
            class21.field313.method1350(arg2, -108);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 5) {
            class3.field25++;
            class21.field313.method1541(-58, 192);
            class21.field313.method1350(arg2, -103);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 6) {
            class21.field313.method1541(46, 128);
            class258.field4086++;
            class21.field313.method1350(arg2, -126);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 7) {
            class288.field4547++;
            class21.field313.method1541(arg3 ^ 0xFFFFFFC3, 73);
            class21.field313.method1350(arg2, arg3 ^ 0xFFFFFF9A);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 8) {
            class21.field313.method1541(-98, 232);
            class94.field1451++;
            class21.field313.method1350(arg2, -74);
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 9) {
            class21.field313.method1541(-119, 40);
            class21.field313.method1350(arg2, -76);
            class229.field3658++;
            class21.field313.method1368(arg0, 4796);
        }
        if (arg4 == 10) {
            class260.field4146++;
            class21.field313.method1541(arg3 ^ 0xFFFFFFC2, 29);
            class21.field313.method1350(arg2, -70);
            class21.field313.method1368(arg0, arg3 + 4792);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 305)
    public static void method1269(byte arg0) {
        if (arg0 >= -17) {
            field2966 = (int[]) null;
        }
        field2966 = null;
        field2964 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V", line = 317)
    public static final void method1270(byte arg0) {
        field2963++;
        if (class218.method1598(7829) != 2) {
            return;
        }
        byte var1 = (byte) (class162.field2649 - 4 & 0xFF);
        int var2 = class162.field2649 % 104;
        if (arg0 <= 24) {
            return;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class280.field4416[var3][var2][var4] = var1;
            }
        }
        if (class148.field2209 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class58.field764[var5] = -1000000;
            class308.field4819[var5] = 1000000;
            class69.field902[var5] = 0;
            class60.field789[var5] = 1000000;
            class232.field3712[var5] = 0;
        }
        if (class282.field4461 != 1) {
            int var6 = class227.method1653(class74.field983, class27.field388, -12282, class148.field2209);
            if ((var6 - class161.field2644) < 800 && (class81.field1229[class148.field2209][class74.field983 >> 7][class27.field388 >> 7] & 0x4) != 0) {
                class271.method1934(class74.field983 >> 7, class27.field388 >> 7, false, (byte) -84, 1, class251.field3996);
            }
            return;
        }
        if ((class81.field1229[class148.field2209][class13.field159.field1980 >> 7][class13.field159.field1944 >> 7] & 0x4) != 0) {
            class271.method1934(class13.field159.field1980 >> 7, class13.field159.field1944 >> 7, false, (byte) -84, 0, class251.field3996);
        }
        if (class281.field4425 >= 310) {
            return;
        }
        int var7 = class13.field159.field1980 >> 7;
        int var8 = class74.field983 >> 7;
        int var9 = class27.field388 >> 7;
        int var10 = class13.field159.field1944 >> 7;
        int var11;
        if (var10 > var9) {
            var11 = var10 - var9;
        } else {
            var11 = var9 - var10;
        }
        int var12;
        if (var7 > var8) {
            var12 = var7 - var8;
        } else {
            var12 = var8 - var7;
        }
        if (var12 == 0 && var11 == 0 || var12 <= -104 || var12 >= 104 || var11 <= -104 || var11 >= 104) {
            class314.method2186("RC: " + var8 + "," + var9 + " " + var7 + "," + var10 + " " + class181.field2925 + "," + class24.field351, 120, (Throwable) null);
            return;
        }
        if (var12 <= var11) {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var9 != var10) {
                if (var9 < var10) {
                    var9++;
                } else if (var10 < var9) {
                    var9--;
                }
                if ((class81.field1229[class148.field2209][var8][var9] & 0x4) != 0) {
                    class271.method1934(var8, var9, false, (byte) -84, 1, class251.field3996);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var7 > var8) {
                        var8++;
                    } else if (var7 < var8) {
                        var8--;
                    }
                    if ((class81.field1229[class148.field2209][var8][var9] & 0x4) != 0) {
                        class271.method1934(var8, var9, false, (byte) -84, 1, class251.field3996);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var11 * 65536 / var12;
        int var14 = 32768;
        while (var7 != var8) {
            if (var7 > var8) {
                var8++;
            } else if (var8 > var7) {
                var8--;
            }
            if ((class81.field1229[class148.field2209][var8][var9] & 0x4) != 0) {
                class271.method1934(var8, var9, false, (byte) -84, 1, class251.field3996);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var9 < var10) {
                    var9++;
                } else if (var9 > var10) {
                    var9--;
                }
                var14 -= 65536;
                if ((class81.field1229[class148.field2209][var8][var9] & 0x4) != 0) {
                    class271.method1934(var8, var9, false, (byte) -84, 1, class251.field3996);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLth;)Lth;")
    public abstract class93 method912(boolean arg0, class93 arg1);
}
