import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class96 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1520 = 0;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
    public static boolean field1521 = true;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lbb;")
    public static class92[] field1524;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lfg;III)V", line = 4)
    public static final void method722(class176 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class120.field2000) {
            class245 var4 = class120.field2010[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4085 != null && var4.field4085.field5073.method1310()) {
                arg0.method1307(var4.field4085.field5073, 128, 0, 0, true);
            }
        }
        if (arg3 < class120.field2000) {
            class245 var5 = class120.field2010[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4085 != null && var5.field4085.field5073.method1310()) {
                arg0.method1307(var5.field4085.field5073, 0, 0, 128, true);
            }
        }
        if (arg2 < class120.field2000 && arg3 < class78.field1244) {
            class245 var6 = class120.field2010[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4085 != null && var6.field4085.field5073.method1310()) {
                arg0.method1307(var6.field4085.field5073, 128, 0, 128, true);
            }
        }
        if (arg2 < class120.field2000 && arg3 > 0) {
            class245 var7 = class120.field2010[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4085 != null && var7.field4085.field5073.method1310()) {
                arg0.method1307(var7.field4085.field5073, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILae;I)V", line = 51)
    public static final void method723(int arg0, int arg1, int arg2, class119 arg3, int arg4) {
        field1526++;
        if (class231.field3803 >= 400) {
            return;
        }
        if (arg3.field1958 != null) {
            arg3 = arg3.method890(958);
        }
        if (arg3 == null || !arg3.field1956) {
            return;
        }
        if (arg4 != 1) {
            field1521 = true;
        }
        class59 var5 = arg3.field1959;
        if (arg3.field1982 != 0) {
            var5 = class233.method1630(new class59[] { var5, class90.method666(arg3.field1982, class286.field4920.field1658, -46), class294.field5019, class114.field1853, class81.method619((byte) -111, arg3.field1982), class11.field147 }, -2883);
        }
        if (class11.field138 == 1) {
            class179.field2925++;
            class120.method896((long) arg1, (short) 59, (byte) 125, class233.method1630(new class59[] { class211.field3464, class23.field308, var5 }, arg4 ^ 0xFFFFF4BC), arg2, class146.field2385, arg0);
        } else if (!class219.field3556) {
            class59[] var6 = arg3.field1929;
            class238.field3968++;
            if (class31.field434) {
                var6 = class143.method1044(-992, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class86.field1360 != 0 || !var6[var7].method472(class213.field3490, 90))) {
                        class157.field2568++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 2;
                        }
                        if (var7 == 1) {
                            var8 = 37;
                        }
                        if (var7 == 2) {
                            var8 = 13;
                        }
                        if (var7 == 3) {
                            var8 = 10;
                        }
                        if (var7 == 4) {
                            var8 = 43;
                        }
                        class120.method896((long) arg1, var8, (byte) 107, class233.method1630(new class59[] { class197.field3247, var5 }, -2883), arg2, var6[var7], arg0);
                    }
                }
            }
            if (class86.field1360 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method472(class213.field3490, 90)) {
                        class87.field1376++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 2;
                        }
                        if (arg3.field1982 > class286.field4920.field1658) {
                            var10 = 2000;
                        }
                        if (var9 == 1) {
                            var11 = 37;
                        }
                        if (var9 == 2) {
                            var11 = 13;
                        }
                        if (var9 == 3) {
                            var11 = 10;
                        }
                        if (var9 == 4) {
                            var11 = 43;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class120.method896((long) arg1, var11, (byte) 108, class233.method1630(new class59[] { class197.field3247, var5 }, -2883), arg2, var6[var9], arg0);
                    }
                }
            }
            class120.method896((long) arg1, (short) 1005, (byte) 121, class233.method1630(new class59[] { class197.field3247, var5 }, -2883), arg2, class187.field3138, arg0);
        } else if ((class59.field908 & 0x2) == 2) {
            class313.field5304++;
            class120.method896((long) arg1, (short) 38, (byte) 105, class233.method1630(new class59[] { class231.field3792, class23.field308, var5 }, -2883), arg2, class249.field4141, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 196)
    public static void method724(int arg0) {
        if (arg0 > -61) {
            method725((byte) 123, -40L);
        }
        field1524 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BJ)V", line = 206)
    public static final void method725(byte arg0, long arg1) {
        field1519++;
        class234.field3888.field2787 = 0;
        class234.field3888.method1219(92, true);
        if (arg0 != -121) {
            field1524 = (class92[]) null;
        }
        class234.field3888.method1206(arg1, false);
        class90.field1405 = -3;
        class238.field3977 = 1;
        class165.field2678 = 0;
        class265.field4576 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBII)V", line = 235)
    public static final void method726(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 > -75) {
            return;
        }
        field1525++;
        if (class69.field1061 <= arg1 && arg2 <= class153.field2504 && class28.field369 <= arg4 && arg0 <= class62.field957) {
            class139.method1014(arg2, arg4, arg1, arg5, arg0, 0);
        } else {
            class72.method581(arg5, arg0, arg4, -1, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLme;)Z", line = 262)
    public static final boolean method727(int arg0, byte arg1, class295 arg2) {
        byte[] var3 = arg2.method2037((byte) 67, arg0);
        field1523++;
        if (var3 == null) {
            return false;
        } else {
            class111.method806(var3, -124);
            int var4 = -34 % ((-arg1 - 77) / 37);
            return true;
        }
    }
}
