import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class22 extends class220 {

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
    private int field356 = 1;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
    private int field362 = 204;

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
    private int field361 = 1;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field357 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)Lwp;", line = 4)
    public static final class246 method186(int arg0, int arg1) {
        ++field364;
        class246 var2 = (class246) class436.field6400.method209(arg1 + 115, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class122.field1623.method1472(arg0, 26, arg1 ^ arg1);
            class246 var4 = new class246();
            if (var3 != null) {
                var4.method1514(new class265(var3), (byte) -122);
            }
            class436.field6400.method202(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IJ)V", line = 27)
    public static final void method187(int arg0, long arg1) {
        ++field358;
        if (class343.field5032 != null) {
            if (~class5.field48 != -2 && ~class5.field48 != -6) {
                if (class5.field48 == 4) {
                    class368.method2428(arg1, (byte) 55);
                }
            } else {
                class108.method753(arg1, 2);
            }
        }
        class403.method2616((long) class50.field698, -127, class35.field574);
        if (~class404.field6020 != 0) {
            class336.method2231((byte) 17, class404.field6020);
        }
        for (int var3 = 0; ~class442.field6463 < ~var3; ++var3) {
            if (class85.field1178[var3]) {
                class159.field2084[var3] = true;
            }
            class234.field3286[var3] = class85.field1178[var3];
            class85.field1178[var3] = false;
        }
        class394.field5913 = class50.field698;
        if (class35.field574.method2112()) {
            class411.field6154 = true;
        }
        class363.field5308 = null;
        if (~class404.field6020 != 0) {
            class442.field6463 = 0;
            class74.method455((byte) -127);
        }
        class35.field574.method2034();
        class122.method841(class35.field574, 0);
        int var4 = class337.method2235(true);
        if (var4 == -1) {
            var4 = class45.field674;
        }
        class285.method1808(var4, 1);
        class288.method1818(class193.field2688, class175.field2280, 64, class100.field1350.field5298, class100.field1350.field5284);
        class175.field2280 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 224)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(B)V", line = 99)
    public static void method188(byte arg0) {
        if (arg0 >= -84) {
            method189(55, 9);
        }
        field357 = null;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(II)V", line = 109)
    public static final void method189(int arg0, int arg1) {
        int var2 = -8 / ((41 - arg1) / 44);
        ++field355;
        class446.method2803(110);
        class81.method514(true);
        class277.method1771(arg0, (byte) 32, true);
        class244.method1504(class247.field3446, -22073, class208.field2987, class35.field574);
        class100.method675(class35.field574, -31889, class247.field3446);
        class124.method853((byte) -48, class152.field1983);
        class23.method193((byte) -128);
        class176.method1075((byte) -125);
        if (~class137.field1815 != -11) {
            if (~class137.field1815 != -31) {
                if (class137.field1815 == 5) {
                    class236.method1441(-128, class35.field574, class247.field3446);
                    return;
                }
            } else {
                class199.method1251(25, (byte) -124);
            }
        } else {
            class398.method2596(false, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[I", line = 140)
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            method190((byte) 14);
        }
        ++field363;
        int[] var3 = super.field3125.method2005(arg1, (byte) -115);
        if (super.field3125.field4676) {
            for (int var4 = 0; ~class344.field5043 < ~var4; ++var4) {
                int var5 = class160.field2096[var4];
                int var6 = class58.field831[arg1];
                int var7 = this.field356 * var5 >> 12;
                int var8 = this.field361 * var6 >> 12;
                int var9 = var5 % (4096 / this.field356) * this.field356;
                int var10 = var6 % (4096 / this.field361) * this.field361;
                if (this.field362 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field362) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field362) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
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

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBLil;)V", line = 228)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg1 != -49) {
            field357 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field362 = arg2.method1685(8104);
                }
            } else {
                this.field361 = arg2.method1697(-74);
            }
        } else {
            this.field356 = arg2.method1697(93);
        }
        ++field359;
    }

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "(B)V", line = 275)
    public static final void method190(byte arg0) {
        if (arg0 <= -50) {
            for (class158 var1 = (class158) class269.field3933.method953(0); var1 != null; var1 = (class158) class269.field3933.method951(0)) {
                int var2 = var1.field2075;
                if (class126.method864((byte) -92, var2)) {
                    boolean var3 = true;
                    class249[] var4 = class119.field1607[var2];
                    for (int var5 = 0; ~var4.length < ~var5; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].field3522;
                            break;
                        }
                    }
                    if (!var3) {
                        int var6 = (int) var1.field5903;
                        class249 var7 = class107.method746(var6, -60);
                        if (var7 != null) {
                            class392.method2564(-104, var7);
                        }
                    }
                }
            }
            ++field360;
        }
    }
}
