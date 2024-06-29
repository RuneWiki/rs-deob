import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class95 extends class23 {

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    private int field1670 = 0;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    private int field1660 = 2048;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    private int field1665 = 10;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "[S")
    public static short[] field1668 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "Lbb;")
    public static class14 field1673 = new class14(64);

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "Ldc;")
    public static class37 field1677 = class185.method1233((byte) 86, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "[I")
    public static int[] field1661;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "[I")
    private int[] field1664;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "[I")
    private int[] field1672;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "[[[B")
    public static byte[][][] field1676;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public static final void method635(int arg0) {
        if (arg0 != -11211) {
            field1673 = null;
        }
        for (class50 var1 = (class50) class238.field4337.method1338(0); var1 != null; var1 = (class50) class238.field4337.method1332((byte) -89)) {
            if (var1.field996 != null) {
                class49.field969.method1452(var1.field996);
                var1.field996 = null;
            }
            if (var1.field1000 != null) {
                class49.field969.method1452(var1.field1000);
                var1.field1000 = null;
            }
        }
        ++field1663;
        class238.field4337.method1336(101);
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    private final void method636(int arg0) {
        this.field1664 = new int[this.field1665 + 1];
        ++field1671;
        int var2 = 0;
        if (arg0 != 22464) {
            field1668 = null;
        }
        this.field1672 = new int[this.field1665 + 1];
        int var3 = 4096 / this.field1665;
        int var4 = this.field1660 * var3 >> 12;
        for (int var5 = 0; this.field1665 > var5; ++var5) {
            this.field1672[var5] = var2;
            this.field1664[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1672[this.field1665] = 4096;
        this.field1664[this.field1665] = 4096 - -this.field1664[0];
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
    public static void method637(byte arg0) {
        field1673 = null;
        field1677 = null;
        field1661 = null;
        field1676 = null;
        if (arg0 > 9) {
            field1668 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
    public static final void method638(int arg0, int arg1, int arg2, int arg3) {
        ++field1667;
        class136 var4 = class229.method1485(arg2, arg3, (byte) -27);
        if (var4 != null && var4.field2536 != null) {
            class51 var5 = new class51();
            var5.field1042 = var4.field2536;
            var5.field1031 = var4;
            class210.method1397(var5, (byte) -127);
        }
        class24.field418 = arg1;
        class30.field600 = true;
        if (arg0 == 5087) {
            class16.field258 = arg2;
            class152.field2883 = arg3;
            class210.method1395((byte) 29, var4);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -21746) {
            field1668 = null;
        }
        ++field1675;
        this.method636(22464);
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V")
    public static final void method639(int arg0) {
        Object var1 = class52.field1046;
        synchronized (class52.field1046) {
            if (arg0 < 99) {
                method635(-11);
            }
            if (class54.field1061 != 0) {
                class54.field1061 = 1;
                try {
                    class52.field1046.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        ++field1666;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1665 = -71;
        }
        ++field1662;
        int[] var3 = super.field405.method1461(arg1, (byte) -107);
        if (super.field405.field4114) {
            int var4 = class167.field3196[arg1];
            if (~this.field1670 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field1665; ++var6) {
                    if (~this.field1672[var6] >= ~var4 && ~this.field1672[var6 + 1] < ~var4) {
                        if (~var4 > ~this.field1664[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class4.method32(var3, 0, class199.field3705, var5);
            } else {
                for (int var7 = 0; ~class199.field3705 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class133.field2477[var7];
                    int var11 = this.field1670;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field1665; ++var12) {
                        if (var8 >= this.field1672[var12] && ~var8 > ~this.field1672[var12 + 1]) {
                            if (this.field1664[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1000) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1670 = arg0.method215(arg2 + -1797814752);
                    }
                } else {
                    this.field1660 = arg0.method230((byte) -111);
                }
            } else {
                this.field1665 = arg0.method215(arg2 + -1797814752);
            }
            ++field1659;
        }
    }
}
