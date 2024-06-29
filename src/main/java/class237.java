import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class237 extends class209 {

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public int field3742 = 0;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field3738 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3735 = "white:";

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3746 = 0;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Z")
    public static boolean field3745;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILha;)V")
    public static final void method1619(int arg0, class31 arg1) {
        field3741++;
        if ((arg1.field560.length - arg1.field541) < 1) {
            return;
        }
        int var2 = arg1.method265(-128);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field560.length - arg1.field541)) {
            return;
        }
        class150.field2228 = arg1.method265(-83);
        if (class150.field2228 < 1) {
            class150.field2228 = 1;
        } else if (class150.field2228 > 4) {
            class150.field2228 = 4;
        }
        class129.method958(0, arg1.method265(-114) == 1);
        class109.field1685 = arg1.method265(-115) == 1;
        class292.field4536 = arg1.method265(-126) == 1;
        class201.field3105 = arg1.method265(-108) == 1;
        class140.field2089 = arg1.method265(-127) == 1;
        class178.field2730 = arg1.method265(-92) == 1;
        class106.field1665 = arg1.method265(-105) == 1;
        class216.field3309 = arg1.method265(-126) == 1;
        client.field2386 = arg1.method265(-89);
        if (client.field2386 > 2) {
            client.field2386 = 2;
        }
        if (var2 < 2) {
            class142.field2111 = arg1.method265(-125) == 1;
            arg1.method265(-99);
        } else {
            class142.field2111 = arg1.method265(-115) == 1;
        }
        class218.field3335 = arg1.method265(-93) == 1;
        class40.field678 = arg1.method265(-100) == 1;
        class94.field1483 = arg1.method265(-119);
        if (class94.field1483 > 2) {
            class94.field1483 = 2;
        }
        class52.field825 = class94.field1483;
        class189.field2971 = arg1.method265(-128) == 1;
        class174.field2684 = arg1.method265(-93);
        if (class174.field2684 > 127) {
            class174.field2684 = 127;
        }
        class85.field1274 = arg1.method265(-89);
        class70.field1106 = arg1.method265(-127);
        if (class70.field1106 > 127) {
            class70.field1106 = 127;
        }
        if (var2 >= 1) {
            class296.field4688 = arg1.method260((byte) -67);
            class164.field2472 = arg1.method260((byte) -67);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method265(-84);
        }
        if (var2 >= 4) {
            int var4 = arg1.method265(-119);
            if (class49.field805 < 96) {
                var4 = 0;
            }
            class249.method1684(var4);
        }
        if (var2 >= 5) {
            class48.field793 = arg1.method300((byte) -30);
        }
        if (var2 >= 6) {
            class42.field709 = arg1.method265(-94);
        }
        if (var2 >= 7) {
            class57.field897 = arg1.method265(-107) == 1;
        }
        if (var2 >= 8) {
            class189.field2972 = arg1.method265(-86) == 1;
        }
        if (arg0 >= -60) {
            field3748 = -26;
        }
        if (var2 >= 9) {
            class84.field1259 = arg1.method265(-105);
        }
        if (var2 >= 10) {
            class58.field904 = arg1.method265(-111) != 0;
        }
        if (var2 >= 11) {
            class230.field3648 = arg1.method265(-120) != 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lha;II)V")
    private final void method1620(class31 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            this.field3742 = arg0.method260((byte) -67);
        }
        if (arg2 != 1710) {
            this.method1621((byte) 18, (class31) null);
        }
        field3747++;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLha;)V")
    public final void method1621(byte arg0, class31 arg1) {
        int var3 = -6 / ((arg0 + 6) / 60);
        while (true) {
            int var4 = arg1.method265(-85);
            if (var4 == 0) {
                field3740++;
                return;
            }
            this.method1620(arg1, var4, 1710);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lub;I)V")
    public static final void method1622(class92 arg0, int arg1) {
        field3736++;
        int var2 = -94 % ((arg1 - 45) / 53);
        class63.field998 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lva;")
    public static final class35 method1623(int arg0, int arg1) {
        field3739++;
        class35 var2 = (class35) class234.field3689.method1173((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class264.field4182.method721((byte) -117, 34, arg1);
        if (arg0 != 1) {
            return null;
        }
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method332(arg1, new class31(var3), 9396);
        }
        class234.field3689.method1167((byte) -127, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public static void method1624(int arg0) {
        if (arg0 != 31953) {
            method1625(20, 61);
        }
        field3735 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1625(int arg0, int arg1) {
        if (arg0 != 0) {
            method1625(-74, -127);
        }
        field3743++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class304.field4886 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class156.field2337 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
