import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class140 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Llc;")
    public static class143 field2434 = class66.method374("vert:", -1);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Llc;")
    public static class143 field2433 = class66.method374("Spielwelt erstellt)3", -1);

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field2440 = -1;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Lli;")
    public static class191 field2446 = new class191();

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "J")
    public long field2437;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lqk;")
    public class51 field2445;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lgf;")
    public static class7 field2439;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[Lvg;")
    public static class230[] field2442;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lgf;III)Lvg;")
    public static final class230 method836(class7 arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -62) {
            field2433 = null;
        }
        field2436++;
        return class189.method1223(arg0, arg2, 121, arg1) ? class258.method1706(-123) : null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method837(int arg0) {
        field2434 = null;
        field2442 = null;
        field2446 = null;
        if (arg0 >= -90) {
            method836((class7) null, 80, 118, 71);
        }
        field2439 = null;
        field2433 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method838(byte arg0, Component arg1) {
        arg1.addMouseListener(class221.field4004);
        field2435++;
        arg1.addMouseMotionListener(class221.field4004);
        if (arg0 <= 69) {
            field2439 = null;
        }
        arg1.addFocusListener(class221.field4004);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method839(byte arg0) {
        field2438++;
        class289.method1933(-22398);
        class10.method84((byte) -52);
        int var1 = 108 / ((arg0 - 40) / 49);
        class21.method148((byte) 73);
        class247.method1640(true);
        class223.method1534((byte) -111);
        class48.method290((byte) -104);
        class267.method1776((byte) 106);
        class248.method1646((byte) 47);
        class184.method1200(4212);
        class144.method919(13620);
        class3.method11(5415);
        class39.method256(false);
        class290.method1943((byte) -90);
        class136.method819(true);
        class5.field74.method824(-125);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        field2432++;
        int var6 = -arg1;
        int var7 = arg1;
        int var8 = arg0;
        int var9 = class83.method476(true, class31.field481, arg1 + arg2, class9.field173);
        int var10 = class83.method476(true, class31.field481, arg2 - arg1, class9.field173);
        class289.method1927(class15.field268[arg4], arg3, var10, arg0 - 69, var9);
        while (var7 > var5) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                var6 -= var7 << 1;
                int var11 = arg4 - var7;
                int var12 = arg4 + var7;
                if (var12 >= class188.field3398 && class239.field4321 >= var11) {
                    int var13 = class83.method476(true, class31.field481, arg2 + var5, class9.field173);
                    int var14 = class83.method476(true, class31.field481, arg2 - var5, class9.field173);
                    if (class239.field4321 >= var12) {
                        class289.method1927(class15.field268[var12], arg3, var14, -64, var13);
                    }
                    if (class188.field3398 <= var11) {
                        class289.method1927(class15.field268[var11], arg3, var14, arg0 ^ 0x70, var13);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class188.field3398 <= var16 && var15 <= class239.field4321) {
                int var17 = class83.method476(true, class31.field481, arg2 + var7, class9.field173);
                int var18 = class83.method476(true, class31.field481, arg2 - var7, class9.field173);
                if (var16 <= class239.field4321) {
                    class289.method1927(class15.field268[var16], arg3, var18, -81, var17);
                }
                if (var15 >= class188.field3398) {
                    class289.method1927(class15.field268[var15], arg3, var18, -82, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lgf;I)V")
    public static final void method841(class7 arg0, int arg1) {
        field2449++;
        class14.field265 = arg0;
        if (arg1 >= -107) {
            method843(-3, -127, -12, -7, 102, -44, -116, 32);
        }
        class208.field3828 = class14.field265.method60(-74, 16);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method842(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2444++;
        class249 var10 = null;
        for (class249 var11 = (class249) class57.field1107.method1294(false); var11 != null; var11 = (class249) class57.field1107.method1292((byte) 39)) {
            if (var11.field4491 == arg5 && var11.field4502 == arg8 && var11.field4494 == arg0 && var11.field4500 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class249();
            var10.field4494 = arg0;
            var10.field4491 = arg5;
            var10.field4502 = arg8;
            var10.field4500 = arg7;
            class112.method672(var10, true);
            class57.field1107.method1290((byte) -44, var10);
        }
        var10.field4486 = arg9;
        var10.field4495 = arg6;
        var10.field4496 = arg1;
        var10.field4489 = arg3;
        int var12 = 15 / ((-arg2 - 56) / 44);
        var10.field4492 = arg4;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method843(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2448++;
        if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
            if (!class21.method149((byte) -57) && (class231.field4225[0][arg6][arg1] & 0x2) == 0) {
                int var8 = arg5;
                if ((class231.field4225[arg5][arg6][arg1] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class225.field4075 != var8) {
                    return;
                }
            }
            int var9 = arg5;
            if (arg5 < 3 && (class231.field4225[1][arg6][arg1] & 0x2) == 2) {
                var9 = arg5 + 1;
            }
            class97.method571(class171.field3052[arg5], (byte) -106, arg5, var9, arg1, arg4, arg6);
            if (arg7 >= 0) {
                boolean var10 = class225.field4083;
                class225.field4083 = true;
                class129.method781(false, arg1, arg5, class171.field3052[arg5], -29969, arg6, arg7, arg0, arg2, var9, false);
                class225.field4083 = var10;
            }
        }
        int var11 = 108 / ((arg3 - 47) / 42);
    }
}
