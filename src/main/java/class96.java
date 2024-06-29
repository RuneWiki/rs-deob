import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class96 extends class228 {

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    private int field1620 = 0;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    private int field1618 = 1;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    private int field1616 = 0;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "Loa;")
    private static class99 field1619 = class221.method1463(2844, "Select");

    @OriginalMember(owner = "client!la", name = "db", descriptor = "I")
    public static int field1624 = 0;

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "Loa;")
    public static class99 field1625 = field1619;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "[I")
    public static int[] field1627 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "[Lpi;")
    public static class139[] field1617;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(B)V")
    public static final void method641(byte arg0) {
        class79.field1398 = false;
        class207.field3591 = 0;
        class65.field1107 = -3;
        class57.field966 = 0;
        class251.field4325 = -1;
        class78.field1386 = 1;
        ++field1621;
        class251.field4338 = 0;
        if (arg0 <= 116) {
            field1617 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static final void method642(int arg0) {
        if (arg0 == 255) {
            ++field1615;
            class59.method400(arg0 + -136);
            class117.method788((byte) 12);
            class206.method1384(false);
            class239.method1560((byte) 80);
            class270.method1782((byte) -108);
            class230.method1511(arg0 ^ 215);
            class63.method411((byte) -12);
            class205.method1375((byte) -124);
            class90.method613((byte) 126);
            class111.method762(113);
            class30.method258(false);
            class132.method885((byte) -38);
            class172.method1158(-74);
            class55.method373((byte) 78);
            class67.field1123.method1813(arg0 + -256);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        class129.method854((byte) -119);
        if (arg0 != -8) {
            this.method278(53);
        }
        ++field1622;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Led;IIIIILni;Lgi;)V")
    public static final void method643(class183 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class153 arg6, class156 arg7) {
        int var8 = 94 % ((arg2 - 46) / 33);
        ++field1623;
        class80 var9 = new class80();
        var9.field1409 = arg3;
        var9.field1424 = arg5 * 128;
        var9.field1415 = arg1 * 128;
        if (arg6 == null) {
            if (arg7 != null) {
                class257 var12 = arg7.field2793;
                var9.field1420 = arg7;
                if (var12.field4491 != null) {
                    var9.field1404 = true;
                    var12 = var12.method1667(-74);
                }
                if (var12 != null) {
                    var9.field1423 = (arg1 - -var12.field4469) * 128;
                    var9.field1408 = (arg5 - -var12.field4469) * 128;
                    var9.field1426 = class30.method255(99, arg7);
                    var9.field1410 = var12.field4462 * 128;
                }
                class111.field2002.method536(var9, (byte) 97);
            } else if (arg0 != null) {
                var9.field1403 = arg0;
                var9.field1408 = 128 * (arg0.method516((byte) -65) + arg5);
                var9.field1423 = (arg0.method516((byte) -65) + arg1) * 128;
                var9.field1426 = class281.method1852(true, arg0);
                var9.field1410 = arg0.field3245 * 128;
                class220.field3831.method1544((byte) 110, arg0.field3224.method697(-23666), var9);
            }
        } else {
            var9.field1426 = arg6.field2748;
            int var10 = arg6.field2717;
            var9.field1407 = arg6.field2694;
            var9.field1410 = arg6.field2732 * 128;
            var9.field1422 = arg6.field2742;
            var9.field1419 = arg6.field2697;
            int var11 = arg6.field2704;
            var9.field1411 = arg6;
            if (~arg4 == -2 || arg4 == 3) {
                var10 = arg6.field2704;
                var11 = arg6.field2717;
            }
            var9.field1423 = (arg1 + var11) * 128;
            var9.field1408 = (arg5 - -var10) * 128;
            if (arg6.field2696 != null) {
                var9.field1404 = true;
                var9.method554(-30438);
            }
            if (var9.field1407 != null) {
                var9.field1427 = (int) (Math.random() * (double) (-var9.field1422 + var9.field1419)) + var9.field1422;
            }
            class93.field1568.method536(var9, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1627 = null;
        field1617 = null;
        if (arg0 >= -32) {
            field1625 = null;
        }
        field1625 = null;
        field1619 = null;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field1614;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field1618 = arg1.method1693((byte) 80);
                }
            } else {
                this.field1616 = arg1.method1693((byte) 49);
            }
        } else {
            this.field1620 = arg1.method1693((byte) -104);
        }
        if (arg2 != -7618) {
            method641((byte) -55);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            ++field1613;
            int[] var3 = super.field3952.method1262(arg0, 7492);
            if (super.field3952.field3276) {
                int var4 = class54.field879[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class234.field4046 > var6; ++var6) {
                    int var7 = class281.field4923[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field1620 == -1) {
                        var9 = (-var4 + var7) * this.field1618;
                    } else {
                        int var10 = var8 * var8 - -(var5 * var5) >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field1618 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (~this.field1616 != -1) {
                        if (this.field1616 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class217.field3766[255 & var12 >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }
}
