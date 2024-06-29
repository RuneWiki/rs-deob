import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class290 extends class87 {

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    private int field4574;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public static int[] field4566 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4572 = "Opened title screen";

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lpl;")
    public static class293 field4567;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZI)V")
    public final void method553(int arg0, boolean arg1, int arg2) {
        ++field4576;
        int var4 = this.field4570 * arg0 >> 12;
        int var5 = this.field4579 * arg2 >> 12;
        if (arg1) {
            int var6 = this.field4575 * arg2 >> 12;
            int var7 = this.field4574 * arg0 >> 12;
            class171.method1118(super.field1186, var4, var6, 25478, var7, var5);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method1948(int arg0) {
        if (arg0 != 0) {
            field4567 = null;
        }
        field4572 = null;
        field4567 = null;
        field4566 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
    public static final int method1949(int arg0, int arg1) {
        ++field4569;
        if (arg0 != 127) {
            field4566 = null;
        }
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
    public final void method552(int arg0, int arg1, int arg2) {
        ++field4580;
        if (arg1 <= 94) {
            this.field4570 = -68;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIII)V")
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4574 = arg2;
        this.field4570 = arg0;
        this.field4579 = arg3;
        this.field4575 = arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public final void method548(int arg0, int arg1, int arg2) {
        ++field4578;
        if (arg0 >= -62) {
            method1952((byte) -9);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static final void method1950(int arg0) {
        ++field4573;
        if (!class286.field4521 && ~class34.field533 != -3) {
            try {
                class259.method1722("tbrefresh", 3787, class250.field3826);
            } catch (Throwable var1) {
            }
            if (arg0 <= 68) {
                method1951((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)I")
    public static final int method1951(byte arg0) {
        ++field4568;
        try {
            if (~class251.field3844 == -1) {
                if (class42.field630 > -5000L + class223.method1433((byte) 125)) {
                    return 0;
                }
                class32.field498 = class200.field2784.method1637(class251.field3835, false, class141.field1960);
                class278.field4318 = class223.method1433((byte) -110);
                class251.field3844 = 1;
            }
            if (~(class278.field4318 - -30000L) > ~class223.method1433((byte) 122)) {
                return class38.method253(1000, 0);
            } else {
                int var1 = -69 % ((-71 - arg0) / 50);
                if (class251.field3844 == 1) {
                    if (class32.field498.field1663 == 2) {
                        return class38.method253(1001, 0);
                    }
                    if (class32.field498.field1663 != 1) {
                        return -1;
                    }
                    field4567 = new class293((Socket) class32.field498.field1665, class200.field2784);
                    int var2 = 0;
                    class32.field498 = null;
                    if (class257.field3927) {
                        var2 = class231.field3506;
                    }
                    class281.field4359.field3402 = 0;
                    class281.field4359.method1447(23, 17363472);
                    class281.field4359.method1435(-104, var2);
                    field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                    if (class139.field1933 != null) {
                        class139.field1933.method857((byte) -36);
                    }
                    if (class234.field3537 != null) {
                        class234.field3537.method857((byte) -36);
                    }
                    int var3 = field4567.method1959(-99);
                    if (class139.field1933 != null) {
                        class139.field1933.method857((byte) -36);
                    }
                    if (class234.field3537 != null) {
                        class234.field3537.method857((byte) -36);
                    }
                    if (~var3 != -1) {
                        return class38.method253(var3, 0);
                    }
                    class251.field3844 = 2;
                }
                if (class251.field3844 == 2) {
                    if (field4567.method1960(-1) < 2) {
                        return -1;
                    }
                    class104.field1445 = field4567.method1959(-85);
                    class104.field1445 <<= 8;
                    class104.field1445 += field4567.method1959(-95);
                    class251.field3844 = 3;
                    class108.field1514 = new byte[class104.field1445];
                    class44.field659 = 0;
                }
                if (class251.field3844 == 3) {
                    int var4 = field4567.method1960(-1);
                    if (var4 < 1) {
                        return -1;
                    } else {
                        if (~var4 < ~(-class44.field659 + class104.field1445)) {
                            var4 = -class44.field659 + class104.field1445;
                        }
                        field4567.method1963(var4, class108.field1514, class44.field659, false);
                        class44.field659 += var4;
                        if (~class44.field659 > ~class104.field1445) {
                            return -1;
                        } else if (!class71.method443(class108.field1514, -124)) {
                            return class38.method253(1002, 0);
                        } else {
                            class17.field178 = new class245[class95.field1348];
                            int var5 = 0;
                            for (int var6 = class232.field3509; ~var6 >= ~class276.field4282; ++var6) {
                                class245 var7 = class235.method1549(false, var6);
                                if (var7 != null) {
                                    class17.field178[var5++] = var7;
                                }
                            }
                            field4567.method1958(5000);
                            class224.field3407 = 0;
                            class251.field3844 = 0;
                            class108.field1514 = null;
                            field4567 = null;
                            class42.field630 = class223.method1433((byte) 4);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var8) {
            return class38.method253(1003, 0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static final void method1952(byte arg0) {
        if (arg0 == 41) {
            ++field4571;
            class50.field720.method544(false);
            class240.field3663.method544(false);
            class208.field2942.method544(false);
        }
    }
}
