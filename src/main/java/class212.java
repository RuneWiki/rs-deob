import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class212 extends class87 {

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    private int field3125 = 1;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    private int field3124 = 204;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    private int field3133 = 1;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field3118 = -1;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Z")
    public static boolean field3123 = false;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field3119 = -1;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field3127 = -1;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
    public static final void method1487(int arg0) {
        class219.field3202 = null;
        class243.field3584 = null;
        class36.field459 = null;
        if (arg0 != -458444052) {
            field3123 = true;
        }
        class227.field3335 = null;
        class192.field2847 = null;
        class126.field2128 = null;
        class252.field3802 = null;
        class261.field4034 = null;
        class297.field4770 = null;
        ++field3132;
        class123.field2042 = null;
        class210.field3108 = null;
        class263.field4208 = null;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public static final void method1488(int arg0) {
        ++class229.field3374;
        class144.field2338.method683(true, 86);
        ++field3122;
        int var1 = 34 % ((40 - arg0) / 46);
        class144.field2338.method360(class227.method1570(70), 25759);
        class144.field2338.method376(class179.field2677, false);
        class144.field2338.method376(class137.field2230, false);
        class144.field2338.method360(class146.field2351, 25759);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class212() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLlc;)V")
    public static final void method1489(byte arg0, class270 arg1) {
        class287.field4601 = arg1.method1884("titlebg", (byte) 12);
        class1.field15 = arg1.method1884("logo", (byte) -75);
        ++field3130;
        if (arg0 >= -126) {
            method1489((byte) -107, (class270) null);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        ++field3117;
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (super.field1378.field733) {
            for (int var4 = 0; ~class206.field3032 < ~var4; ++var4) {
                int var5 = class138.field2254[var4];
                int var6 = class140.field2272[arg0];
                int var7 = this.field3133 * var5 >> 12;
                int var8 = this.field3125 * var6 >> 12;
                int var9 = var6 % (4096 / this.field3125) * this.field3125;
                int var10 = var5 % (4096 / this.field3133) * this.field3133;
                if (~this.field3124 < ~var9) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field3124) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field3124 > var10) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1490(int arg0, byte arg1) {
        ++field3126;
        if (arg1 <= 80) {
            method1491(14);
        }
        if (~arg0 > -100001) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            return ~arg0 > -10000001 ? "<col=ffffff>" + arg0 / 1000 + class182.field2731 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class100.field1707 + "</col>";
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public static final void method1491(int arg0) {
        class106.field1815 = 0;
        ++field3120;
        class284.field4574 = 0;
        class268.method1850((byte) -28);
        class59.method434(arg0 ^ -5509);
        class306.method2077((byte) -60);
        for (int var1 = 0; var1 < class106.field1815; ++var1) {
            int var3 = class287.field4605[var1];
            if (~class199.field2930 != ~class255.field3856[var3].field3749) {
                if (class255.field3856[var3].field137.method804((byte) -98)) {
                    class287.method1966(class255.field3856[var3], -113);
                }
                class255.field3856[var3].method90(-1, (class102) null);
                class255.field3856[var3] = null;
            }
        }
        if (arg0 != -5612) {
            method1490(4, (byte) -33);
        }
        if (class162.field2510 != class92.field1488.field735) {
            throw new RuntimeException("gnp1 pos:" + class92.field1488.field735 + " psize:" + class162.field2510);
        } else {
            for (int var2 = 0; ~var2 > ~class12.field135; ++var2) {
                if (class255.field3856[class14.field159[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class12.field135);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (arg2 == 25645) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field3124 = arg0.method331(-89);
                    }
                } else {
                    this.field3125 = arg0.method366(arg2 ^ -9302);
                }
            } else {
                this.field3133 = arg0.method366(-16505);
            }
            ++field3131;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public static final void method1492(int arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg1 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 63) + "," + (63 & arg0);
        System.out.println(var4);
        ++field3121;
        if (arg2 == 16946) {
            class279.method1937((byte) -12, var4);
        }
    }
}
