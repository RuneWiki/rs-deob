import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class436 extends class422 {

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    private int field6380 = 0;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Ljj;")
    private class76 field6378 = new class76();

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Z")
    public static boolean field6386 = false;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[S")
    public static short[] field6381 = new short[] { 58, 13, 10, 12, 5, 57, 17, 20 };

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Lvl;")
    public static class11 field6392;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[Ll;")
    public static class16[] field6393;

    static {
        new class331("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 4)
    public final void method1203(int arg0) {
        ++field6382;
        if (arg0 != 5000) {
            field6395 = -34;
        }
        while (super.field6238 != super.field6235) {
            this.method2642(-5001);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 17)
    public static void method2640(byte arg0) {
        if (arg0 == -91) {
            field6392 = null;
            field6393 = null;
            field6381 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V", line = 40)
    public static final void method2641(int arg0) {
        class109.field1547.method2919(arg0 + -20379);
        ++field6387;
        class500.field7422.method1945(7);
        class104.field1458.method547(false);
        class384.field5645.method783((byte) 72);
        class515.field7587.method1207((byte) 107);
        class270.field3995.method5(36);
        class153.field2169.method1580(-16517);
        class151.field2145.method2113(64);
        class29.field357.method1684((byte) 7);
        class276.field4060.method2831(16);
        class284.field4134.method2498(-26);
        class504.field7479.method2013((byte) -127);
        class175.field2483.method845(arg0 + 6028);
        class11.field128.method1564(false);
        class215.field3100.method2737(false);
        class428.field6311.method2699((byte) 54);
        class172.field2451.method1352(2);
        class171.field2434.method3019(true);
        class387.field5733.method1178(64);
        class348.field4829.method63(-2049);
        class376.method2309((byte) -60);
        class500.method2997((byte) 25);
        class332.method2035((byte) 30);
        class453.method2732((byte) -57);
        if (arg0 == 20378) {
            class405.field6027.method1119(87);
            class87.field1180.method1119(arg0 ^ 20465);
            class265.field3912.method1119(97);
            class400.field5935.method1119(124);
            class41.field485.method1119(127);
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 79)
    private final void method2642(int arg0) {
        ++field6388;
        int var2 = super.field6235++;
        if (~super.field6235 <= arg0) {
            super.field6235 = 0;
        }
        this.field6380 = super.field6236[var2];
        Object var3 = super.field6237[var2];
        super.field6237[var2] = null;
        if (~this.field6380 == -22) {
            class410.method2510(this.field6378, (class148) var3);
        } else if (this.field6380 != 20) {
            if (~this.field6380 <= -31 && this.field6380 <= 33) {
                class442.field6561.method319(3000.0F, super.field6241[var2] * 1.5F);
                ((class142) var3).method429(class321.field4527, class209.field3040, class385.field5672, class350.field4844, ~(this.field6380 + -30) == -1);
            } else if (~this.field6380 <= -41 && ~this.field6380 >= -44) {
                class442.field6561.method319(3000.0F, super.field6241[var2] * 1.5F);
                ((class142) var3).method429(class321.field4527, class209.field3040, class385.field5672, class89.field1221, ~(this.field6380 + -40) == -1);
            } else {
                if (~this.field6380 != -23) {
                    if (~this.field6380 == -24) {
                        class442.field6561.method328();
                        return;
                    }
                    if (this.field6380 == 24) {
                        class442.field6561.method291(0, (class124[]) null);
                        return;
                    }
                } else {
                    class442.field6561.method295(-1, 1583160, 40, 127);
                }
            }
        } else {
            class148 var4 = (class148) var3;
            if (var4.field2098 != null) {
                var4.field2098.method35(class442.field6561, 57);
            }
            if (var4.field2078 != null) {
                var4.field2078.method35(class442.field6561, 115);
            }
            if (var4.field2079 != null) {
                var4.field2079.method35(class442.field6561, 85);
            }
            if (var4.field2085 != null) {
                var4.field2085.method35(class442.field6561, 115);
            }
            if (var4.field2082 != null) {
                var4.field2082.method35(class442.field6561, 111);
            }
            for (class480 var5 = var4.field2086; var5 != null; var5 = var5.field7058) {
                var5.field7054.method35(class442.field6561, arg0 ^ -5102);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZLta;FB)V", line = 171)
    public final void method1197(int arg0, boolean arg1, class142 arg2, float arg3, byte arg4) {
        ++field6390;
        super.field6236[super.field6238] = (byte) (!arg1 ? arg0 + 30 : arg0 + 40);
        super.field6237[super.field6238] = arg2;
        super.field6241[super.field6238] = arg3;
        if (arg4 == 46) {
            ++super.field6238;
            if (~super.field6238 <= -5001) {
                super.field6238 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V", line = 188)
    public final void method1193(byte arg0, int arg1) {
        super.field6236[super.field6238] = (byte) arg1;
        ++field6391;
        ++super.field6238;
        int var3 = 34 % ((-81 - arg0) / 34);
        if (super.field6238 >= 5000) {
            super.field6238 = 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lnt;B)V", line = 205)
    public final void method1202(class148 arg0, byte arg1) {
        ++field6385;
        super.field6236[super.field6238] = 20;
        if (arg1 != -39) {
            this.method1197(88, false, (class142) null, -0.11426636F, (byte) 32);
        }
        super.field6237[super.field6238] = arg0;
        ++super.field6238;
        if (super.field6238 >= 5000) {
            super.field6238 = 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLnt;)V", line = 221)
    public final void method1196(byte arg0, class148 arg1) {
        --super.field6235;
        ++field6379;
        if (super.field6235 < 0) {
            super.field6235 = 4999;
        }
        super.field6236[super.field6235] = 21;
        super.field6237[super.field6235] = arg1;
        if (arg0 > -29) {
            field6395 = -8;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lnt;I)V", line = 241)
    public final void method1201(class148 arg0, int arg1) {
        super.field6236[super.field6238] = 21;
        ++field6384;
        super.field6237[super.field6238] = arg0;
        if (arg1 != 0) {
            this.field6380 = -35;
        }
        ++super.field6238;
        if (~super.field6238 <= -5001) {
            super.field6238 = 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 268)
    public final void method1204(int arg0, int arg1) {
        ++field6394;
        if (arg1 != 5000) {
            this.method1202((class148) null, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 280)
    public final void method1199(int arg0) {
        ++field6389;
        int var2 = -105 % ((arg0 - -73) / 50);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 294)
    public static final void method2643(int arg0) {
        ++field6383;
        int var1 = 0;
        if (arg0 != -29238) {
            method2643(-8);
        }
        for (int var2 = 0; var2 < class397.field5828; ++var2) {
            for (int var3 = 0; ~class457.field6713 < ~var3; ++var3) {
                if (class133.method1013(var2, true, arg0 + 61820, var3, var1, class422.field6240)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
    }
}
