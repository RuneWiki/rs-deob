import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class199 {

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lpa;")
    public static class123 field3569;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[I")
    public static int[] field3572;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V")
    public static final void method1426(int arg0, int arg1, int arg2, int arg3) {
        if (class215.field3928 != 0 && arg0 != 0 && class40.field671 < 50 && arg1 != -1) {
            class9.field153[class40.field671] = arg1;
            class193.field3520[class40.field671] = arg0;
            class204.field3694[class40.field671] = arg3;
            class4.field87[class40.field671] = null;
            class107.field2046[class40.field671] = 0;
            class40.field671++;
        }
        if (arg2 <= 41) {
            method1430(false, (class123) null, 39, (class123) null, (class184) null);
        }
        field3575++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1427(int arg0) {
        field3572 = null;
        if (arg0 != 0) {
            method1429(-14, (byte) 58);
        }
        field3569 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII)V")
    public static final void method1428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3567++;
        class206.method1466(arg2, arg0, arg2 + arg4, arg0 - -arg3);
        class206.method1483(arg2, arg0, arg4, arg3, 0);
        if (class160.field2947 < 100) {
            return;
        }
        if (class239.field4245 == null || class239.field4245.field1336 != arg4 || class239.field4245.field1337 != arg3) {
            class105 var5 = new class105(arg4, arg3);
            class206.method1468(var5.field2012, arg4, arg3);
            class114.method904(0, 0, class58.field952, arg3, 0, class124.field2395, arg4, (byte) -61, 0);
            class239.field4245 = var5;
            class128.field2496.method700(arg1 ^ 0x63);
        }
        class239.field4245.method106(arg2, arg0);
        int var6 = arg2 + (class90.field1653 * arg4 / class124.field2395);
        int var7 = arg0 + (class33.field511 * arg3 / class58.field952);
        int var8 = class135.field2607 * arg4 / class124.field2395;
        int var9 = class134.field2591 * arg3 / class58.field952;
        class206.method1461(var6, var7, var8, var9, 16711680, 128);
        class206.method1471(var6, var7, var8, var9, 16711680);
        if (arg1 != 50) {
            method1426(-118, 84, -1, -31);
        }
        if (class229.field4125 <= 0 || (class229.field4125 % 10) >= 5) {
            return;
        }
        for (class31 var10 = (class31) class40.field662.method1017(62); var10 != null; var10 = (class31) class40.field662.method1016((byte) -31)) {
            if (class18.field272 == var10.field490) {
                int var11 = arg2 + (var10.field479 * arg4 / class124.field2395);
                int var12 = var10.field483 * arg3 / class58.field952 + arg0;
                class206.method1483(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)V")
    public static final void method1429(int arg0, byte arg1) {
        if (arg1 >= -118) {
            field3572 = null;
        }
        field3568++;
        if (arg0 == -1 && !class123.field2360) {
            class192.method1405(1);
        } else if (arg0 != -1 && (client.field1987 != arg0 || !class245.method1688(-1)) && class77.field1453 != 0 && !class123.field2360) {
            class126.method1002(false, arg0, 0, class59.field969, 35, 2, class77.field1453);
        }
        client.field1987 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLpa;ILpa;Lki;)V")
    public static final void method1430(boolean arg0, class123 arg1, int arg2, class123 arg3, class184 arg4) {
        class109.field2057 = arg1;
        field3570++;
        class20.field326 = arg3;
        if (arg2 >= 96) {
            class21.field345 = arg0;
            int var5 = class20.field326.method967(-28151) - 1;
            class75.field1407 = var5 * 256 + class20.field326.method971(var5, 0);
            class203.field3691 = arg4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method1431(KeyEvent arg0, byte arg1) {
        field3571++;
        int var2 = arg0.getKeyChar();
        if (arg1 > -77) {
            field3572 = null;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }
}
