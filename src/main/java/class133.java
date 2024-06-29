import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class133 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field1779 = new int[4096];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1782 = 50;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[Z")
    public static boolean[] field1783;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I", line = 3)
    public static final int method900(int arg0) {
        if (arg0 <= 14) {
            field1779 = null;
        }
        field1780++;
        try {
            if (class373.field5609 == 0) {
                if (class157.field2070 > (class55.method375(-3913) - 5000L)) {
                    return 0;
                }
                class117.field1581 = class361.field5285.method14(class344.field5042, (byte) 124, class10.field111);
                class134.field1791 = class55.method375(-3913);
                class373.field5609 = 1;
            }
            if (class134.field1791 + 30000L < class55.method375(-3913)) {
                return class372.method2460(1000, -46);
            }
            if (class373.field5609 == 1) {
                if (class117.field1581.field4259 == 2) {
                    return class372.method2460(1001, -56);
                }
                if (class117.field1581.field4259 != 1) {
                    return -1;
                }
                class159.field2079 = new class26((Socket) class117.field1581.field4262, class361.field5285);
                class117.field1581 = null;
                int var1 = 0;
                if (class349.field5180) {
                    var1 = class402.field5975;
                }
                class232.field3279.field3915 = 0;
                class232.field3279.method1707(102, 23);
                class232.field3279.method1704(var1, (byte) 125);
                class159.field2079.method245(119, class232.field3279.field3915, 0, class232.field3279.field3879);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                int var2 = class159.field2079.method235(-1707);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                if (var2 != 0) {
                    return class372.method2460(var2, -122);
                }
                class373.field5609 = 2;
            }
            if (class373.field5609 == 2) {
                if (class159.field2079.method241((byte) 17) < 2) {
                    return -1;
                }
                class100.field1355 = class159.field2079.method235(-1707);
                class100.field1355 <<= 0x8;
                class100.field1355 += class159.field2079.method235(-1707);
                class373.field5609 = 3;
                class329.field4717 = new byte[class100.field1355];
                class393.field5904 = 0;
            }
            if (class373.field5609 != 3) {
                return -1;
            }
            int var3 = class159.field2079.method241((byte) 17);
            if (var3 < 1) {
                return -1;
            }
            if (class100.field1355 - class393.field5904 < var3) {
                var3 = class100.field1355 - class393.field5904;
            }
            class159.field2079.method242(113, class393.field5904, class329.field4717, var3);
            class393.field5904 += var3;
            if (class393.field5904 < class100.field1355) {
                return -1;
            } else if (class80.method504(class329.field4717, 0)) {
                class234.field3291 = new class159[class444.field6470];
                int var4 = 0;
                for (int var5 = class307.field4393; var5 <= class407.field6099; var5++) {
                    class159 var6 = class104.method707(var5, (byte) 92);
                    if (var6 != null) {
                        class234.field3291[var4++] = var6;
                    }
                }
                class311.field4449 = null;
                class442.field6460 = 0;
                class159.field2079.method243(-1);
                class35.field578 = 0;
                class159.field2079 = null;
                class373.field5609 = 0;
                class329.field4717 = null;
                class157.field2070 = class55.method375(-3913);
                return 0;
            } else {
                return class372.method2460(1002, -72);
            }
        } catch (IOException var7) {
            return class372.method2460(1003, -66);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 139)
    public static void method901(int arg0) {
        if (arg0 > -33) {
            method902(false);
        }
        field1783 = null;
        field1779 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 156)
    public static final void method902(boolean arg0) {
        field1781++;
        if (class384.field5748 == 0) {
            return;
        }
        try {
            if ((++class442.field6455) > 1500) {
                if (class159.field2079 != null) {
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                }
                if (class328.field4709 >= 1) {
                    class384.field5748 = 0;
                    class276.field4043 = -5;
                    return;
                }
                class328.field4709++;
                if (class246.field3436 == class10.field111) {
                    class10.field111 = class161.field2106;
                } else {
                    class10.field111 = class246.field3436;
                }
                class442.field6455 = 0;
                class384.field5748 = 1;
            }
            if (class384.field5748 == 1) {
                class327.field4701 = class361.field5285.method14(class344.field5042, (byte) 125, class10.field111);
                class384.field5748 = 2;
            }
            if (class384.field5748 == 2) {
                if (class327.field4701.field4259 == 2) {
                    throw new IOException();
                }
                if (class327.field4701.field4259 != 1) {
                    return;
                }
                class159.field2079 = new class26((Socket) class327.field4701.field4262, class361.field5285);
                class327.field4701 = null;
                class159.field2079.method245(94, class232.field3279.field3915, 0, class232.field3279.field3879);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                int var1 = class159.field2079.method235(-1707);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                if (var1 != 101) {
                    class276.field4043 = var1;
                    class384.field5748 = 0;
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                    return;
                }
                class384.field5748 = 3;
            }
            if (class384.field5748 == 3) {
                if (class159.field2079.method241((byte) 17) >= 2) {
                    int var2 = class159.field2079.method235(-1707) << 8 | class159.field2079.method235(-1707);
                    class332.method2198(var2, 50000);
                    if (class163.field2123 == -1) {
                        class276.field4043 = 6;
                        class384.field5748 = 0;
                        class159.field2079.method243(-1);
                        class159.field2079 = null;
                    } else {
                        class384.field5748 = 0;
                        class159.field2079.method243(-1);
                        class159.field2079 = null;
                        class86.method536((byte) 116);
                    }
                }
            } else if (!arg0) {
                field1783 = null;
            }
        } catch (IOException var3) {
            if (class159.field2079 != null) {
                class159.field2079.method243(-1);
                class159.field2079 = null;
            }
            if (class328.field4709 >= 1) {
                class384.field5748 = 0;
                class276.field4043 = -4;
            } else {
                class442.field6455 = 0;
                if (class246.field3436 == class10.field111) {
                    class10.field111 = class161.field2106;
                } else {
                    class10.field111 = class246.field3436;
                }
                class384.field5748 = 1;
                class328.field4709++;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)V")
    public abstract void method777(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)[B")
    public abstract byte[] method776(byte arg0);
}
