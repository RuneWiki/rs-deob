import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "J")
    public static long field2747 = 0L;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lje;")
    public static class67 field2748 = class85.method592(255, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLna;IIIII)V")
    public static final void method960(int arg0, byte arg1, class91 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= 0 && arg4 < 104 && arg7 >= 0 && arg7 < 104) {
            class82.field1809[arg6][arg4][arg7] = 0;
            while (true) {
                int var8 = arg2.method649(false);
                if (var8 == 0) {
                    if (arg6 == 0) {
                        class142.field3253[0][arg4][arg7] = -class98.method761(arg1 - 84, arg4 - -arg5 + 932731, arg7 + arg0 + 556238) * 8;
                    } else {
                        class142.field3253[arg6][arg4][arg7] = class142.field3253[arg6 - 1][arg4][arg7] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method649(false);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg6 == 0) {
                        class142.field3253[0][arg4][arg7] = -var9 * 8;
                    } else {
                        class142.field3253[arg6][arg4][arg7] = class142.field3253[arg6 - 1][arg4][arg7] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class59.field1185[arg6][arg4][arg7] = arg2.method667((byte) -37);
                    class27.field491[arg6][arg4][arg7] = (byte) ((var8 - 2) / 4);
                    class40.field713[arg6][arg4][arg7] = (byte) class34.method213(3, var8 + arg3 - 2);
                } else if (var8 <= 81) {
                    class82.field1809[arg6][arg4][arg7] = (byte) (var8 - 49);
                } else {
                    class79.field1745[arg6][arg4][arg7] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method649(false);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method649(false);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method649(false);
                }
            }
        }
        if (arg1 == -29) {
            field2744++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lof;")
    public static final class103 method961(int arg0, int arg1) {
        field2746++;
        class103 var2 = (class103) class114.field2580.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class66.field1288.method267((byte) -124, arg0, 10);
        class103 var4 = new class103();
        var4.field2317 = arg0;
        if (var3 != null) {
            var4.method810(new class91(var3), (byte) 44);
        }
        var4.method815(0);
        if (arg1 != 1658) {
            return null;
        }
        if (var4.field2290 != -1) {
            var4.method819(method961(var4.field2290, arg1), (byte) -36, method961(var4.field2347, 1658));
        }
        if (!class149.field3426 && var4.field2309) {
            var4.field2306 = 0;
            var4.field2302 = class135.field3071;
            var4.field2353 = null;
            var4.field2303 = null;
        }
        class114.field2580.method765((long) arg0, var4, (byte) -80);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method962(int arg0) {
        field2739++;
        if (class104.field2367 != null) {
            class104.field2367.method847(100);
            class104.field2367 = null;
        }
        class144.method1108(10625);
        class134.field3044.method354();
        int var1 = 76 % ((arg0 - 31) / 60);
        for (int var2 = 0; var2 < 4; var2++) {
            class86.field1900[var2].method223(24495);
        }
        System.gc();
        class30.method193((byte) -100, 2);
        class105.field2404 = false;
        class97.field2171 = -1;
        class17.method118((byte) -126);
        class27.method181(10, -47);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method963(int arg0) {
        class133.field2981.method767(1);
        field2742++;
        if (arg0 <= 30) {
            method963(116);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public static void method964(int arg0) {
        field2748 = null;
        if (arg0 != 7344) {
            method963(-90);
        }
    }
}
