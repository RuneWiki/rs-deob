import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class177 extends class114 {

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2371 = null;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "F")
    public static float field2360;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "F")
    public static float field2361;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Ljava/lang/String;")
    public String field2367;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 4)
    public static final void method1185(int arg0) {
        ++field2368;
        class369.method2345((byte) 15);
        if (arg0 <= -79) {
            class523.method3104((byte) -1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 17)
    public static final void method1186(byte arg0) {
        ++field2363;
        if (arg0 <= 71) {
            method1192((byte) 116);
        }
        int var1 = class203.field2716.method16(class378.field5771, -95);
        if (~var1 != -1) {
            if (var1 == 1) {
                class498.method2967((byte) 0, 1024);
                class21.method201((byte) -66, 512);
                if (class178.field2382 != null) {
                    class424.method2588((byte) 121);
                }
            } else {
                class498.method2967((byte) (255 & class206.field2765 + -4), 1024);
                class21.method201((byte) -65, 2);
            }
        } else {
            class304.field4438 = null;
            class21.method201((byte) -70, 0);
        }
        class348.field5380 = class367.field5618;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V", line = 53)
    public static void method1187(byte arg0) {
        if (arg0 != -122) {
            field2361 = 0.041189536F;
        }
        field2371 = null;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V", line = 63)
    public static final void method1188(byte arg0) {
        class75.field1103 = -1;
        ++field2364;
        class207.field2819 = 0;
        class309.field4501 = -1;
        if (arg0 < 3) {
            method1185(-128);
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)J", line = 76)
    public final long method1189(byte arg0) {
        if (arg0 != 97) {
            method1186((byte) 56);
        }
        ++field2362;
        return super.field1579 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I", line = 87)
    public final int method1190(int arg0) {
        if (arg0 >= -8) {
            field2371 = null;
        }
        ++field2359;
        return (int) (255L & super.field35 >>> 32);
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)V", line = 100)
    public final void method1191(int arg0) {
        super.field1579 |= Long.MIN_VALUE;
        ++field2366;
        int var2 = 93 / ((40 - arg0) / 48);
        if (this.method1189((byte) 97) == 0L) {
            class411.field6247.method2613(3, this);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V", line = 114)
    public static final void method1192(byte arg0) {
        ++field2370;
        int var1 = class486.field7194 * 128 + 64;
        int var2 = class24.field355 * 128 + 64;
        int var3 = class352.method2264(-116, class367.field5618, var2, var1) - class425.field6474;
        if (~class350.field5391 <= -101) {
            class199.field2646 = class486.field7194 * 128 - -64;
            class140.field1869 = class24.field355 * 128 + 64;
            class26.field384 = class352.method2264(-92, class367.field5618, class140.field1869, class199.field2646) - class425.field6474;
        } else {
            if (class199.field2646 < var1) {
                class199.field2646 += class388.field5936 - -((-class199.field2646 + var1) * class350.field5391 / 1000);
                if (var1 < class199.field2646) {
                    class199.field2646 = var1;
                }
            }
            if (~var1 > ~class199.field2646) {
                class199.field2646 -= class388.field5936 - -((-var1 + class199.field2646) * class350.field5391 / 1000);
                if (var1 > class199.field2646) {
                    class199.field2646 = var1;
                }
            }
            if (var3 > class26.field384) {
                class26.field384 += (var3 - class26.field384) * class350.field5391 / 1000 + class388.field5936;
                if (~var3 > ~class26.field384) {
                    class26.field384 = var3;
                }
            }
            if (~var3 > ~class26.field384) {
                class26.field384 -= (-var3 + class26.field384) * class350.field5391 / 1000 + class388.field5936;
                if (~class26.field384 > ~var3) {
                    class26.field384 = var3;
                }
            }
            if (~var2 < ~class140.field1869) {
                class140.field1869 += class388.field5936 - -((-class140.field1869 + var2) * class350.field5391 / 1000);
                if (~var2 > ~class140.field1869) {
                    class140.field1869 = var2;
                }
            }
            if (class140.field1869 > var2) {
                class140.field1869 -= (-var2 + class140.field1869) * class350.field5391 / 1000 + class388.field5936;
                if (var2 > class140.field1869) {
                    class140.field1869 = var2;
                }
            }
        }
        int var4 = class503.field7423 * 128 + 64;
        int var5 = class360.field5524 * 128 - -64;
        int var6 = class352.method2264(-95, class367.field5618, var4, var5) - class354.field5477;
        int var7 = -class199.field2646 + var5;
        int var8 = var6 - class26.field384;
        int var9 = -class140.field1869 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = 16383 & (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D);
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 16383;
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (class296.field4378 < var11) {
            class296.field4378 += (-class296.field4378 + var11 >> 3) * class174.field2332 / 1000 + class507.field7462 << 3;
            if (class296.field4378 > var11) {
                class296.field4378 = var11;
            }
        }
        if (var11 < class296.field4378) {
            class296.field4378 -= class507.field7462 - -((-var11 + class296.field4378 >> 3) * class174.field2332 / 1000) << 3;
            if (var11 > class296.field4378) {
                class296.field4378 = var11;
            }
        }
        int var13 = var12 - class49.field702;
        int var14 = -117 % ((60 - arg0) / 42);
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var15 = var13 >> 3;
        if (var15 > 0) {
            class49.field702 += class507.field7462 - -(class174.field2332 * var15 / 1000) << 3;
            class49.field702 &= 16383;
        }
        if (~var15 > -1) {
            class49.field702 -= -var15 * class174.field2332 / 1000 + class507.field7462 << 3;
            class49.field702 &= 16383;
        }
        int var16 = -class49.field702 + var12;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (~var16 > 8191) {
            var16 += 16384;
        }
        class334.field5197 = 0;
        if (var16 < 0 && ~var15 < -1 || ~var16 < -1 && ~var15 > -1) {
            class49.field702 = var12;
        }
    }

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "(I)I", line = 267)
    public final int method1193(int arg0) {
        if (arg0 != 23030) {
            this.method1194(-54);
        }
        ++field2365;
        return (int) super.field35;
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V", line = 278)
    public final void method1194(int arg0) {
        ++field2373;
        super.field1579 = class58.method427((byte) -19) + 500L | Long.MIN_VALUE & super.field1579;
        if (arg0 >= -31) {
            this.field2374 = 123;
        }
        class18.field298.method2613(3, this);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V", line = 305)
    public class177(int arg0, int arg1) {
        super.field35 = (long) arg1 | (long) arg0 << 32;
    }
}
