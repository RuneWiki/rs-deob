import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class87 {

    @OriginalMember(owner = "client!od", name = "s", descriptor = "B")
    private byte field1463;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field1450 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[[S")
    public static short[][] field1446 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Ldf;")
    public static class51 field1456 = class46.method233("Nehmen", 100);

    @OriginalMember(owner = "client!od", name = "p", descriptor = "[I")
    public static int[] field1460 = new int[100];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lwc;")
    public static class213 field1457;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "Lp;")
    public static class262 field1461;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[[[I")
    public static int[][][] field1454;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static void method662(boolean arg0) {
        field1460 = null;
        field1454 = null;
        field1461 = null;
        field1456 = null;
        field1457 = null;
        field1446 = null;
        if (arg0) {
            field1454 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public final int method663(int arg0) {
        field1447++;
        if (arg0 != 7) {
            method666(-22, -23, (byte) 52, 66, 47, 47, 10, -12);
        }
        return this.field1463 & 0x7;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
    public static final void method664(boolean arg0) {
        if (arg0) {
            class172.field2820 = field1454;
            class27.field395 = class53.field897;
        } else {
            class172.field2820 = class101.field1682;
            class27.field395 = class37.field574;
        }
        class52.field895 = class27.field395.length;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class28.field408 <= arg3 - arg2 && arg2 + arg3 <= class115.field1954 && class36.field542 <= (arg0 - arg2) && arg0 + arg2 <= class175.field2867) {
            class6.method24(arg3, -73, arg4, arg2, arg0);
        } else {
            class193.method1376(arg4, arg1 + 31710, arg0, arg3, arg2);
        }
        field1451++;
        if (arg1 != -31835) {
            method664(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method666(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 119) {
            field1446 = null;
        }
        field1459++;
        if (arg7 < 0 || arg3 < 0 || arg7 >= 103 || arg3 >= 103) {
            return;
        }
        if (arg4 == 0) {
            class241 var8 = class185.method1308(arg6, arg7, arg3);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field4176 >>> 32);
                if (arg0 == 2) {
                    var8.field4183 = new class22(var9, 2, arg1 + 4, arg6, arg7, arg3, arg5, false, var8.field4183);
                    var8.field4187 = new class22(var9, 2, arg1 + 1 & 0x3, arg6, arg7, arg3, arg5, false, var8.field4187);
                } else {
                    var8.field4183 = new class22(var9, arg0, arg1, arg6, arg7, arg3, arg5, false, var8.field4183);
                }
            }
        }
        if (arg4 == 1) {
            class195 var10 = client.method1062(arg6, arg7, arg3);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field3273 >>> 32);
                if (arg0 == 4 || arg0 == 5) {
                    var10.field3252 = new class22(var11, 4, arg1, arg6, arg7, arg3, arg5, false, var10.field3252);
                } else if (arg0 == 6) {
                    var10.field3252 = new class22(var11, 4, arg1 + 4, arg6, arg7, arg3, arg5, false, var10.field3252);
                } else if (arg0 == 7) {
                    var10.field3252 = new class22(var11, 4, (arg1 + 2 & 0x3) + 4, arg6, arg7, arg3, arg5, false, var10.field3252);
                } else if (arg0 == 8) {
                    var10.field3252 = new class22(var11, 4, arg1 + 4, arg6, arg7, arg3, arg5, false, var10.field3252);
                    var10.field3268 = new class22(var11, 4, (arg1 + 2 & 0x3) + 4, arg6, arg7, arg3, arg5, false, var10.field3268);
                }
            }
        }
        if (arg4 == 2) {
            if (arg0 == 11) {
                arg0 = 10;
            }
            class33 var12 = class154.method1109(arg6, arg7, arg3);
            if (var12 != null) {
                var12.field488 = new class22(Integer.MAX_VALUE & (int) (var12.field477 >>> 32), arg0, arg1, arg6, arg7, arg3, arg5, false, var12.field488);
            }
        }
        if (arg4 != 3) {
            return;
        }
        class162 var13 = class39.method197(arg6, arg7, arg3);
        if (var13 != null) {
            var13.field2655 = new class22(Integer.MAX_VALUE & (int) (var13.field2660 >>> 32), 22, arg1, arg6, arg7, arg3, arg5, false, var13.field2655);
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)Z")
    public static final boolean method667(int arg0, int arg1, int arg2, int arg3) {
        if (class177.method1238(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class218.method1500(var4 + 1, class172.field2820[arg0][arg1][arg2] + arg3, var5 + 1) && class218.method1500(var4 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class218.method1500(var4 + 128 - 1, class172.field2820[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class218.method1500(var4 + 1, class172.field2820[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
    public final int method668(int arg0) {
        if (arg0 != 26299) {
            field1454 = null;
        }
        field1453++;
        return (this.field1463 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class87() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Llb;)V")
    public class87(class121 arg0) {
        this.field1463 = arg0.method912((byte) -90);
        this.field1445 = arg0.method876(false);
        this.field1452 = arg0.method865((byte) 8);
        this.field1458 = arg0.method865((byte) 8);
        this.field1462 = arg0.method865((byte) 8);
        this.field1449 = arg0.method865((byte) 8);
    }
}
