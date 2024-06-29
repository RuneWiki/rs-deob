import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class103 extends class471 {

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    private int field1490 = -32768;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    private int field1482 = -1;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
    public boolean field1493 = false;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    private int field1481 = 0;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    private int field1500 = 0;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lnb;")
    private class181 field1496;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lcm;")
    public static class472 field1473 = new class472();

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "Z")
    public static boolean field1499 = false;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "J")
    public static long field1498 = -1L;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Loh;")
    private class256 field1475;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "[Ljd;")
    public static class139[] field1474;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Z", line = 4)
    public final boolean method17(int arg0) {
        if (arg0 != 7) {
            this.field1490 = -124;
        }
        ++field1483;
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lwm;B)V", line = 15)
    public final void method10(class364 arg0, byte arg1) {
        ++field1478;
        class456 var3 = this.method623(0, arg0, true);
        if (var3 != null) {
            this.method622(var3, arg0, false);
        }
        if (arg1 >= -48) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 32)
    public final void method8(int arg0) {
        if (arg0 > -74) {
            this.method627((byte) 10);
        }
        ++field1494;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgn;Lwm;Z)V", line = 45)
    private final void method622(class456 arg0, class364 arg1, boolean arg2) {
        ++field1495;
        class130[] var4 = arg0.method1839();
        class304[] var5 = arg0.method1845();
        if (arg2) {
            this.field1475 = null;
        }
        if ((this.field1475 == null || this.field1475.field3394) && (var4 != null || var5 != null)) {
            this.field1475 = new class256(class70.field968);
        }
        if (this.field1475 != null) {
            this.field1475.method1440(arg1, (long) class70.field968, var4, var5, false);
            this.field1475.method1444(super.field6502, super.field6500, super.field6505, super.field6491, super.field6497);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lwm;B)Lnf;", line = 75)
    public final class374 method3(class364 arg0, byte arg1) {
        ++field1479;
        class456 var3 = this.method623(1024, arg0, true);
        if (var3 == null) {
            return null;
        } else {
            class203 var4 = arg0.method1960();
            if (arg1 <= 99) {
                this.method14(53, -122, (byte) -16, (class364) null);
            }
            var4.method1029(super.field6501, super.field6503, super.field6507);
            if (this.field1475 != null) {
                class342 var5 = this.field1475.method1441();
                arg0.method2051(var3, var5, var4, (class478) null, 0);
            } else {
                var3.method1880(var4, (class478) null, 0);
            }
            this.field1490 = var3.method1871();
            this.method622(var3, arg0, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)I", line = 107)
    public final int method6(int arg0) {
        ++field1489;
        if (arg0 != 0) {
            this.field1496 = null;
        }
        return this.field1490;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILwm;Z)Lgn;", line = 118)
    private final class456 method623(int arg0, class364 arg1, boolean arg2) {
        ++field1485;
        class248 var4 = class302.field4030.method1394(this.field1477, -7290);
        if (!arg2) {
            this.field1481 = -13;
        }
        return this.field1493 ? var4.method1392(-1, 0, arg1, (byte) -109, arg0, class395.field5477, -1) : var4.method1392(this.field1482, this.field1500, arg1, (byte) -123, arg0, class395.field5477, this.field1481);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V", line = 131)
    public static void method624(byte arg0) {
        field1474 = null;
        if (arg0 == 66) {
            field1473 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V", line = 143)
    public static final void method625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1497;
        class203.field2751.field456 = 0;
        class203.field2751.method228(class419.field5694.field1076, 32);
        class203.field2751.method228(arg3, 32);
        class203.field2751.method228(arg4, 32);
        int var5 = 92 / ((6 - arg2) / 50);
        class203.field2751.method229(arg1, 1309449544);
        class203.field2751.method229(arg0, 1309449544);
        class128.field1893 = 0;
        class466.field6460 = 0;
        class293.field3922 = -3;
        class30.field400 = 1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 169)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        if (arg6) {
            ++field1487;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 181)
    public static final void method626(int arg0) {
        ++field1484;
        if (class94.field1398 == null) {
            Container var1;
            if (class492.field6883 == null) {
                var1 = class251.field3359.field3209;
            } else {
                var1 = class492.field6883;
            }
            class383.field5274 = var1.getSize().width;
            class152.field2139 = var1.getSize().height;
            if (class492.field6883 == var1) {
                Insets var2 = class492.field6883.getInsets();
                class152.field2139 -= var2.top + var2.bottom;
                class383.field5274 -= var2.right + var2.left;
            }
            if (~class6.method41((byte) -121) != -2) {
                if (class428.field5792 < 96 && ~class222.field2958 == -1) {
                    int var3 = ~class383.field5274 < -1025 ? 1024 : class383.field5274;
                    int var4 = ~class152.field2139 < -769 ? 768 : class152.field2139;
                    class424.field5738 = var3;
                    class178.field2416 = (-var3 + class383.field5274) / 2;
                    class145.field2091 = 0;
                    class72.field986 = var4;
                } else {
                    class72.field986 = class152.field2139;
                    class424.field5738 = class383.field5274;
                    class145.field2091 = 0;
                    class178.field2416 = 0;
                }
            } else {
                class72.field986 = class431.field5877;
                class424.field5738 = class153.field2153;
                class145.field2091 = 0;
                class178.field2416 = (class383.field5274 - class153.field2153) / 2;
            }
            if (class377.field5197 != class278.field3682) {
                boolean var10000;
                if (~class424.field5738 > -1025 && ~class72.field986 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class28.field378.setSize(class424.field5738, class72.field986);
            if (class98.field1432 != null) {
                class98.field1432.method1988();
            }
            if (arg0 != -12504) {
                method626(-120);
            }
            if (class492.field6883 != var1) {
                class28.field378.setLocation(class178.field2416, class145.field2091);
            } else {
                Insets var5 = class492.field6883.getInsets();
                class28.field378.setLocation(class178.field2416 + var5.left, var5.top - -class145.field2091);
            }
            if (~class196.field2674 != 0) {
                class73.method479(false, true);
            }
            class112.method718(-57);
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V", line = 276)
    public final void method627(byte arg0) {
        if (this.field1475 != null) {
            this.field1475.method1437();
        }
        int var2 = -65 % ((-45 - arg0) / 43);
        ++field1480;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 325)
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field1477 = arg0;
        this.field1476 = arg1 + arg2;
        int var12 = class302.field4030.method1394(this.field1477, -7290).field3310;
        if (~var12 != 0) {
            this.field1493 = false;
            this.field1496 = class395.field5477.method266(16107, var12);
        } else {
            this.field1493 = true;
        }
        if (this.field1476 == arg2) {
            class402.method2437(this.field1496, false, super.field6502, 14, super.field6501, super.field6507, this.field1481);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V", line = 295)
    public final void method628(int arg0, int arg1) {
        ++field1492;
        if (!this.field1493) {
            int var3 = 74 % ((arg1 - 62) / 33);
            this.field1500 += arg0;
            while (this.field1500 > this.field1496.field2466[this.field1481]) {
                this.field1500 -= this.field1496.field2466[this.field1481];
                ++this.field1481;
                if (~this.field1481 <= ~this.field1496.field2468.length) {
                    this.field1493 = true;
                    break;
                }
            }
            if (!this.field1493) {
                class402.method2437(this.field1496, false, super.field6502, 32, super.field6501, super.field6507, this.field1481);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(B)V", line = 350)
    public static final void method629(byte arg0) {
        ++field1488;
        if (!class446.field6074) {
            class82.field1094 = true;
            if (class488.field6789.field6670) {
                class270.field3610 = (float) ((int) class270.field3610 + 191 & -128);
            } else {
                class216.field2912 += (24.0F - class216.field2912) / 2.0F;
            }
            class446.field6074 = true;
            if (arg0 > -64) {
                method625(-30, -114, 33, -104, 102);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 374)
    protected final void finalize() {
        if (this.field1475 != null) {
            this.field1475.method1437();
        }
        ++field1501;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBLwm;)Z", line = 399)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 > -107) {
            this.method2(65, -43, -21, (class364) null, false, (class197) null, false);
        }
        ++field1486;
        return false;
    }
}
