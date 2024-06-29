import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class132 extends class263 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field1598 = -1;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[Lpp;")
    public static class365[] field1601 = new class365[2048];

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "F")
    public static float field1599;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
    public abstract int method851(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBIII)V")
    public static final void method852(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1605++;
        if (arg1 != -47) {
            field1599 = 0.52030224F;
        }
        if (class611.field8310.field8689 != 0 && arg4 != 0 && class141.field1697 < 50 && arg2 != -1) {
            class266.field3358[class141.field1697++] = new class175((byte) 1, arg2, arg4, arg3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILpfa;I)Lxa;")
    public static final class468 method853(int arg0, class275 arg1, int arg2) {
        if (arg0 != 0) {
            field1598 = 48;
        }
        field1600++;
        return class62.field767 ? class309.field3898.method402(class495.method2696(arg1, arg2), true) : class382.method2195(arg1.method1648(121, arg2), (byte) -76);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)J")
    public abstract long method854(int arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
    public abstract int method855(byte arg0);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static void method856(boolean arg0) {
        if (arg0) {
            method852(-117, (byte) -114, 111, -60, 9);
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)V")
    public static final void method857(byte arg0, int arg1) {
        field1602++;
        class243 var2 = class546.method2926(arg1, 14, true);
        if (arg0 <= 120) {
            field1599 = -0.019116107F;
        }
        var2.method1455(true);
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static final void method858(int arg0) {
        field1597++;
        class455.field5687.method1198(true);
        class161.method991(0);
        class675.field9221 = 0;
        class610.field8305 = null;
        class660.field8961 = null;
        class531.field6702 = null;
        class222.field2585.field7313 = 0;
        class295.field3741 = 0;
        class129.method838(8892);
        class348.field4476 = 0;
        class136.field1664 = null;
        class254.field3274 = 0;
        class485.field6032 = null;
        class284.field3600 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lpg;ILac;ILpp;III)V")
    public static final void method859(class687 arg0, int arg1, class506 arg2, int arg3, class365 arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 3) {
            return;
        }
        field1603++;
        class112 var8 = new class112();
        var8.field1391 = arg3;
        var8.field1398 = arg1 << 9;
        var8.field1409 = arg5 << 9;
        if (arg0 != null) {
            var8.field1404 = arg0;
            int var9 = arg0.field9459;
            int var10 = arg0.field9395;
            if (arg6 == 1 || arg6 == 3) {
                var9 = arg0.field9395;
                var10 = arg0.field9459;
            }
            var8.field1408 = arg1 + var9 << 9;
            var8.field1388 = arg0.field9430;
            var8.field1410 = arg0.field9387;
            var8.field1403 = arg0.field9427 << 9;
            var8.field1405 = arg0.field9390;
            var8.field1407 = arg5 + var10 << 9;
            var8.field1395 = arg0.field9453;
            var8.field1387 = arg0.field9416;
            var8.field1401 = arg0.field9460;
            var8.field1399 = arg0.field9380;
            if (arg0.field9421 != null) {
                var8.field1384 = true;
                var8.method776(121);
            }
            if (var8.field1401 != null) {
                var8.field1411 = (int) (Math.random() * (double) (var8.field1405 - var8.field1388)) + var8.field1388;
            }
            class578.field7755.method1904(var8, -117);
        } else if (arg2 != null) {
            var8.field1389 = arg2;
            class689 var11 = arg2.field6326;
            if (var11.field9546 != null) {
                var8.field1384 = true;
                var11 = var11.method3812(class327.field4084, -128);
            }
            if (var11 != null) {
                var8.field1407 = var11.field9495 + arg5 << 9;
                var8.field1408 = var11.field9495 + arg1 << 9;
                var8.field1399 = class294.method1774(-127, arg2);
                var8.field1387 = var11.field9525;
                var8.field1403 = var11.field9530 << 9;
                var8.field1410 = var11.field9511;
            }
            class16.field163.method1904(var8, -19);
        } else if (arg4 != null) {
            var8.field1392 = arg4;
            var8.field1408 = arg1 + arg4.method210(false) << 9;
            var8.field1407 = arg5 + arg4.method210(false) << 9;
            var8.field1399 = class78.method610(arg4, arg7 - 959874183);
            var8.field1403 = arg4.field4716 << 9;
            var8.field1410 = arg4.field4712;
            var8.field1387 = arg4.field4692;
            class664.field9022.method3832(var8, (long) arg4.field495, arg7 ^ 0x2F);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)I")
    public abstract int method860(boolean arg0);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)I")
    public abstract int method861(byte arg0);
}
