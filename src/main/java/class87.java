import java.awt.Point;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class87 {

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Z")
    public boolean field1084;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lcb;")
    public static class318 field1075 = new class318(69, -2);

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lgo;")
    public class526 field1082;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Lgo;")
    public class526 field1083;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Z")
    public boolean field1078;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
    public final boolean method484(int arg0) {
        if (arg0 != 8) {
            field1079 = 0;
        }
        field1072++;
        return this.field1078 && !this.field1084;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILdw;IB)V")
    public static final void method485(int arg0, class676 arg1, int arg2, byte arg3) {
        int var4 = -1 / ((arg3 + 66) / 53);
        if (arg1.field459 == arg0 && arg0 != -1) {
            class463 var5 = class77.field971.method776(arg0, (byte) 60);
            int var6 = var5.field6314;
            if (var6 == 1) {
                arg1.field462 = 1;
                arg1.field457 = 0;
                arg1.field507 = 0;
                arg1.field492 = arg2;
                arg1.field433 = 0;
                class311.method1870(arg1.field457, arg1.field3917, (byte) 1, false, arg1.field3929, var5, arg1.field3925);
            }
            if (var6 == 2) {
                arg1.field433 = 0;
            }
        } else if (arg0 == -1 || arg1.field459 == -1 || class77.field971.method776(arg0, (byte) 59).field6334 >= class77.field971.method776(arg1.field459, (byte) 76).field6334) {
            arg1.field521 = arg1.field520;
            arg1.field462 = 1;
            arg1.field492 = arg2;
            arg1.field507 = 0;
            arg1.field459 = arg0;
            arg1.field457 = 0;
            arg1.field433 = 0;
            if (arg1.field459 != -1) {
                class311.method1870(arg1.field457, arg1.field3917, (byte) 1, false, arg1.field3929, class77.field971.method776(arg1.field459, (byte) 110), arg1.field3925);
            }
        }
        field1081++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1075 = null;
        if (arg0 != 22250) {
            field1079 = -46;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public final void method487(byte arg0) {
        field1080++;
        if (this.field1083 != null) {
            this.field1083.method1022((byte) 33);
        }
        int var2 = -118 / ((arg0 + 73) / 36);
        this.field1078 = false;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLpq;Lpq;Lpq;Lpq;)V")
    public static final void method488(byte arg0, class159 arg1, class159 arg2, class159 arg3, class159 arg4) {
        if (arg0 <= 30) {
            return;
        }
        field1076++;
        class422.field5876 = arg3;
        class502.field6786 = arg1;
        class547.field7490 = arg2;
        class145.field1844 = arg4;
        class328.field4799 = new class188[class422.field5876.method1074((byte) 101)][];
        class451.field6154 = new boolean[class422.field5876.method1074((byte) 114)];
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
    public static final void method489(int arg0, int arg1) {
        field1073++;
        int var2 = 110 / ((20 - arg0) / 44);
        if (!class72.field935.field6495) {
            arg1 = -1;
        }
        if (class228.field2982 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class681 var3 = class637.field8698.method1373(arg1, (byte) -112);
            class366 var4 = var3.method3760(false);
            if (var4 == null) {
                arg1 = -1;
            } else {
                class495.field6687.method627(var4.method2244(), new Point(var3.field9679, var3.field9678), class249.field3351, var4.method2243(), var4.method2255(), -11597);
                class228.field2982 = arg1;
            }
        }
        if (arg1 == -1 && class228.field2982 != -1) {
            class495.field6687.method627(-1, new Point(), class249.field3351, null, -1, -11597);
            class228.field2982 = -1;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
    public static final void method490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1074++;
        if (arg4 != -29041) {
            method489(56, -11);
        }
        for (int var5 = 0; var5 < class264.field3629; var5++) {
            Rectangle var6 = class121.field1564[var5];
            if (arg2 < var6.x + var6.width && (arg2 + arg3) > var6.x && var6.y + var6.height > arg1 && (arg0 + arg1) > var6.y) {
                class200.field2630[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IJ)V")
    public static final void method491(int arg0, long arg1) {
        field1077++;
        int var3 = class294.field3939;
        if (class243.field3277 != var3) {
            int var4 = var3 - class243.field3277;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var5 > var4) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            class243.field3277 += var5;
        }
        int var6 = class86.field1068;
        if (!class72.field935.field6535) {
            class620.field8432 += (float) arg1 * class690.field9748 / 40.0F * 8.0F;
            class283.field3826 += (float) arg1 * class74.field945 / 40.0F * 8.0F;
        }
        if (arg0 != 16218) {
            method490(-91, 63, 95, 100, -70);
        }
        if (class397.field5667 != var6) {
            int var7 = var6 - class397.field5667;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class397.field5667 += var8;
        }
        class425.method2455(1024);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Z)V")
    public class87(boolean arg0) {
        this.field1084 = arg0;
    }
}
