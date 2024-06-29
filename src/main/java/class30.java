import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class30 extends InputStream {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lda;")
    public static class275 field450 = class255.method1672(97, "(Y");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lda;")
    public static class275 field452 = class255.method1672(97, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lda;")
    private static class275 field456 = class255.method1672(102, "flash1:");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lda;")
    public static class275 field461 = class255.method1672(125, "compass");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lda;")
    public static class275 field454 = field456;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "[I")
    public static int[] field449 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lda;")
    public static class275 field451 = field456;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field464 = -1;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Lma;")
    public static class105 field463;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(J[IIB)Lda;")
    public static final class275 method175(long arg0, int[] arg1, int arg2, byte arg3) {
        field457++;
        if (arg3 >= -99) {
            method180(true, -60, (class275) null);
        }
        if (class147.field2557 != null) {
            class275 var5 = class147.field2557.method166((byte) 111, arg0, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return arg2 == 5 ? class181.method1212(0, arg0).method1850(97) : class203.method1329(1, arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lcf;")
    public static final class23 method176(int arg0, int arg1) {
        if (arg0 != -3) {
            method179(55);
        }
        field453++;
        class23 var2 = (class23) class53.field887.method990((long) arg1, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class174.field3019.method775(class71.method465((byte) 118, arg1), class234.method1521(arg1, arg0 - 122), -24799);
        class23 var4 = new class23();
        var4.field392 = arg1;
        if (var3 != null) {
            var4.method149(true, new class85(var3));
        }
        var4.method148(0);
        class53.field887.method986(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3) {
        field455++;
        class184 var4 = class147.method1044(4, (byte) 68, arg0);
        var4.method1226((byte) 26);
        var4.field3151 = arg2;
        if (arg3 != -30873) {
            field451 = null;
        }
        var4.field3145 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method178(boolean arg0) {
        field462++;
        if (class137.field2407 == 0) {
            return;
        }
        try {
            if ((++class93.field1597) > 1500) {
                if (class52.field866 != null) {
                    class52.field866.method1402(1);
                    class52.field866 = null;
                }
                if (class180.field3095 >= 1) {
                    class137.field2407 = 0;
                    class119.field2140 = -5;
                    return;
                }
                class93.field1597 = 0;
                class180.field3095++;
                class137.field2407 = 1;
                if (class243.field4249 == class125.field2233) {
                    class243.field4249 = class66.field1086;
                } else {
                    class243.field4249 = class125.field2233;
                }
            }
            if (class137.field2407 == 1) {
                class162.field2838 = class3.field24.method373(0, class243.field4249, class80.field1314);
                class137.field2407 = 2;
            }
            if (!arg0) {
                if (class137.field2407 == 2) {
                    if (class162.field2838.field4623 == 2) {
                        throw new IOException();
                    }
                    if (class162.field2838.field4623 != 1) {
                        return;
                    }
                    class52.field866 = new class219((Socket) class162.field2838.field4625, class3.field24);
                    class162.field2838 = null;
                    class52.field866.method1400(class149.field2597.field1381, 0, 5000, class149.field2597.field1392);
                    if (class72.field1166 != null) {
                        class72.field1166.method880(86);
                    }
                    if (class120.field2160 != null) {
                        class120.field2160.method880(51);
                    }
                    int var1 = class52.field866.method1399(arg0);
                    if (class72.field1166 != null) {
                        class72.field1166.method880(72);
                    }
                    if (class120.field2160 != null) {
                        class120.field2160.method880(86);
                    }
                    if (var1 != 101) {
                        class137.field2407 = 0;
                        class119.field2140 = var1;
                        class52.field866.method1402(1);
                        class52.field866 = null;
                        return;
                    }
                    class137.field2407 = 3;
                }
                if (class137.field2407 == 3 && class52.field866.method1404(-1048) >= 2) {
                    int var2 = class52.field866.method1399(false) << 8 | class52.field866.method1399(arg0);
                    class196.method1274(1933, var2);
                    if (class108.field1880 == -1) {
                        class119.field2140 = 6;
                        class137.field2407 = 0;
                        class52.field866.method1402(1);
                        class52.field866 = null;
                    } else {
                        class137.field2407 = 0;
                        class52.field866.method1402(1);
                        class52.field866 = null;
                        class81.method528(true);
                    }
                }
            }
        } catch (IOException var3) {
            if (class52.field866 != null) {
                class52.field866.method1402(1);
                class52.field866 = null;
            }
            if (class180.field3095 < 1) {
                if (class243.field4249 == class125.field2233) {
                    class243.field4249 = class66.field1086;
                } else {
                    class243.field4249 = class125.field2233;
                }
                class137.field2407 = 1;
                class93.field1597 = 0;
                class180.field3095++;
            } else {
                class119.field2140 = -4;
                class137.field2407 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method179(int arg0) {
        field450 = null;
        field454 = null;
        field451 = null;
        field452 = null;
        field461 = null;
        field449 = null;
        if (arg0 != 2) {
            method175(-23L, (int[]) null, -52, (byte) -108);
        }
        field463 = null;
        field456 = null;
    }

    @OriginalMember(owner = "client!g", name = "read", descriptor = "()I")
    public final int read() {
        class250.method1640(30000L, 126);
        field448++;
        return -1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILda;)V")
    public static final void method180(boolean arg0, int arg1, class275 arg2) {
        field459++;
        class275 var3 = arg2.method1831((byte) -117);
        int var4 = 0;
        short[] var5 = new short[16];
        if (arg1 != -30042) {
            field456 = null;
        }
        for (int var6 = 0; var6 < class11.field159; var6++) {
            class245 var9 = class210.method1352(arg1 ^ 0xFFFF8AEF, var6);
            if ((!arg0 || var9.field4305) && var9.field4311 == -1 && var9.field4329 == -1 && var9.field4278 == 0 && var9.field4322.method1831((byte) -67).method1818(19701, var3) != -1) {
                if (var4 >= 250) {
                    class248.field4366 = null;
                    class86.field1447 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class248.field4366 = var5;
        class86.field1447 = var4;
        class207.field3485 = 0;
        class275[] var7 = new class275[class86.field1447];
        for (int var8 = 0; var8 < class86.field1447; var8++) {
            var7[var8] = class210.method1352(arg1 + 30157, var5[var8]).field4322;
        }
        class77.method506(var7, 0, class248.field4366);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(SB)Z")
    public static final boolean method181(short arg0, byte arg1) {
        field458++;
        if (arg1 != 60) {
            method179(74);
        }
        if (arg0 == 37 || arg0 == 9 || arg0 == 14 || arg0 == 18 || arg0 == 21 || arg0 == 22 || arg0 == 24 || arg0 == 38) {
            return true;
        } else if (arg0 == 3 || arg0 == 34 || arg0 == 1002 || arg0 == 1001) {
            return true;
        } else if (arg0 == 36 || arg0 == 57 || arg0 == 17 || arg0 == 45 || arg0 == 25) {
            return true;
        } else {
            return arg0 == 47 || arg0 == 8 || arg0 == 39 || arg0 == 23 || arg0 == 1 || arg0 == 11;
        }
    }
}
