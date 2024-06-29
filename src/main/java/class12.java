import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field207 = 2;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field211 = 0;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field210 = 128;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lfh;")
    public static class129 field204 = new class129();

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILw;)Lpj;")
    public static final class237 method117(int arg0, int arg1, class141 arg2) {
        if (arg0 != 0) {
            method118(25);
        }
        field205++;
        if (!class46.method432(client.method1042(arg2), arg0 ^ 0xFFFFFF83, arg1) && arg2.field2466 == null) {
            return null;
        } else if (arg2.field2538 == null || arg1 >= arg2.field2538.length || arg2.field2538[arg1] == null || arg2.field2538[arg1].method1605(false).method1588(false) == 0) {
            return class215.field3731 ? class238.method1626(new class237[] { class229.field3915, class14.method130(arg1, (byte) 117) }, -84) : null;
        } else {
            return arg2.field2538[arg1];
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method118(int arg0) {
        field206++;
        if (class182.field3203 == 0) {
            return;
        }
        try {
            if ((++class63.field1259) > 2000) {
                if (class127.field2219 != null) {
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                }
                if (class207.field3534 >= 1) {
                    class45.field974 = -5;
                    class182.field3203 = 0;
                    return;
                }
                class182.field3203 = 1;
                if (class96.field1714 == class258.field4433) {
                    class96.field1714 = class56.field1162;
                } else {
                    class96.field1714 = class258.field4433;
                }
                class63.field1259 = 0;
                class207.field3534++;
            }
            if (class182.field3203 == 1) {
                class52.field1100 = class268.field4572.method543(class174.field3042, class96.field1714, (byte) -106);
                class182.field3203 = 2;
            }
            if (class182.field3203 == 2) {
                if (class52.field1100.field1823 == 2) {
                    throw new IOException();
                }
                if (class52.field1100.field1823 != 1) {
                    return;
                }
                class127.field2219 = new class214((Socket) class52.field1100.field1826, class268.field4572);
                class52.field1100 = null;
                class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(-112);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(119);
                }
                int var1 = class127.field2219.method1437((byte) 85);
                if (class79.field1485 != null) {
                    class79.field1485.method1079(117);
                }
                if (class131.field2312 != null) {
                    class131.field2312.method1079(123);
                }
                if (var1 != 21) {
                    class182.field3203 = 0;
                    class45.field974 = var1;
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    return;
                }
                class182.field3203 = 3;
            }
            if (class182.field3203 == 3) {
                if (class127.field2219.method1438(12) < 1) {
                    return;
                }
                class227.field3887 = new class237[class127.field2219.method1437((byte) 85)];
                class182.field3203 = 4;
            }
            if (class182.field3203 == 4) {
                if (class127.field2219.method1438(12) < class227.field3887.length * 8) {
                    return;
                }
                class65.field1288.field647 = 0;
                class127.field2219.method1435(0, 18461, class227.field3887.length * 8, class65.field1288.field644);
                for (int var2 = 0; var2 < class227.field3887.length; var2++) {
                    class227.field3887[var2] = class146.method995(270, class65.field1288.method298((byte) 124));
                }
                class182.field3203 = 0;
                class45.field974 = 21;
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
                return;
            }
        } catch (IOException var3) {
            if (class127.field2219 != null) {
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
            }
            if (class207.field3534 >= 1) {
                class182.field3203 = 0;
                class45.field974 = -4;
            } else {
                class63.field1259 = 0;
                class182.field3203 = 1;
                if (class96.field1714 == class258.field4433) {
                    class96.field1714 = class56.field1162;
                } else {
                    class96.field1714 = class258.field4433;
                }
                class207.field3534++;
            }
        }
        if (arg0 >= -39) {
            method120((byte) 26);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
    public static final int method119(int arg0, int arg1, int arg2) {
        if (arg2 != -19341) {
            method120((byte) 43);
        }
        field209++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field204 = null;
        if (arg0 > -125) {
            field212 = -81;
        }
    }
}
