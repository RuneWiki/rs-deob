import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class86 extends class237 {

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    private final int field1632;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    private final int field1619;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    private final int field1618;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    private final int field1624;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field1617 = 127;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field1623 = 0;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "[J")
    public static long[] field1631 = new long[1000];

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Lkh;")
    private static class117 field1633 = class224.method1450((byte) -120, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "Lkh;")
    public static class117 field1620 = field1633;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "Lr;")
    public static class186 field1628;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(BII)V")
    public final void method595(byte arg0, int arg1, int arg2) {
        ++field1615;
        if (arg0 >= -13) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
    public final void method596(byte arg0, int arg1, int arg2) {
        ++field1629;
        int var4 = -31 % ((39 - arg0) / 59);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1631 = null;
        field1620 = null;
        field1633 = null;
        field1628 = null;
        if (arg0 != 127) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
    public final void method598(int arg0, int arg1, int arg2) {
        int var4 = this.field1632 * arg0 >> 12;
        if (arg2 == -18503) {
            int var5 = this.field1624 * arg1 >> 12;
            int var6 = this.field1618 * arg0 >> 12;
            ++field1621;
            int var7 = this.field1619 * arg1 >> 12;
            class172.method1207((byte) -106, var5, var4, var6, var7, super.field4291);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1632 = arg1;
        this.field1619 = arg2;
        this.field1618 = arg3;
        this.field1624 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static final void method599(byte arg0) {
        ++field1630;
        for (class73 var1 = (class73) class11.field371.method456((byte) 117); var1 != null; var1 = (class73) class11.field371.method459((byte) -87)) {
            int var2 = var1.field1397;
            if (class223.method1446(var2, 6)) {
                class9[] var3 = class90.field1675[var2];
                boolean var4 = true;
                for (int var5 = 0; var3.length > var5; ++var5) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field249;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field389;
                    class9 var7 = class119.method837((byte) 96, var6);
                    if (var7 != null) {
                        class62.method457(var7, 0);
                    }
                }
            }
        }
        if (arg0 < 51) {
            method599((byte) 53);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkh;I)V")
    public static final void method600(class117 arg0, int arg1) {
        ++field1616;
        if (~class172.field3106 <= arg1) {
            if (arg0.method789(class208.field3734, -106)) {
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class14.method129((class117) null, class36.method316((byte) -34, new class117[] { class226.field4069, class42.method358(var4, (byte) 34), class71.field1357 }), 0, 0);
            }
            if (arg0.method789(class51.field1053, arg1 + -120)) {
                class141.method961(-1);
            }
            if (arg0.method789(class156.field2836, -96)) {
                class10.field356 = true;
            }
            if (arg0.method789(class172.field3110, arg1 ^ 112)) {
                class10.field356 = false;
            }
            arg0.method789(class44.field962, -125);
            arg0.method789(class182.field3290, -92);
            if (arg0.method789(class151.field2746, -104)) {
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    for (int var6 = 1; ~var6 > -104; ++var6) {
                        for (int var7 = 1; ~var7 > -104; ++var7) {
                            class173.field3123[var5].field45[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method822(arg1 ^ -36, class199.field3564) && ~class30.field723 != -1) {
                class10.method111(arg0.method802(6, arg1 + 1176819749).method825((byte) -96), false);
            }
            if (arg0.method789(class139.field2534, arg1 ^ 94) && ~class30.field723 == -3) {
                throw new RuntimeException();
            }
            if (arg0.method822(33, class13.field426)) {
                class93.field1711 = arg0.method802(12, arg1 ^ -1176819745).method798((byte) 113).method825((byte) -71);
                class14.method129((class117) null, class36.method316((byte) -34, new class117[] { class102.field1860, class42.method358(class93.field1711, (byte) 34) }), 0, 0);
            }
            if (arg0.method789(class98.field1801, -96)) {
                class103.field1882 = true;
            }
        }
        class105.field1911.method400(175, arg1 ^ -11);
        ++class93.field1710;
        class105.field1911.method1002(false, -1 + arg0.method819((byte) -95));
        class105.field1911.method1027(arg1 ^ -32771, arg0.method802(2, arg1 + 1176819749));
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1627;
        if (class223.method1446(arg4, 6)) {
            class12.method122(arg7, (byte) 19, arg0, arg3, -1, arg5, arg2, arg1, class90.field1675[arg4]);
            int var8 = -24 % ((arg6 - -17) / 40);
        }
    }
}
