import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class51 extends class230 {

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method405(int arg0) {
        ++field623;
        int var1 = class158.field2368 * 128 + 64;
        int var2 = class218.field3160 * 128 + 64;
        int var3 = class488.method2817(var1, true, var2, class320.field4627) - class485.field6763;
        if (~class254.field3756 <= -101) {
            class515.field7596 = class218.field3160 * 128 - -64;
            class478.field6654 = class158.field2368 * 128 - -64;
            field619 = class488.method2817(class478.field6654, true, class515.field7596, class320.field4627) + -class485.field6763;
        } else {
            if (class478.field6654 < var1) {
                class478.field6654 += class308.field4478 - -((-class478.field6654 + var1) * class254.field3756 / 1000);
                if (class478.field6654 > var1) {
                    class478.field6654 = var1;
                }
            }
            if (var3 > field619) {
                field619 += (var3 - field619) * class254.field3756 / 1000 + class308.field4478;
                if (~var3 > ~field619) {
                    field619 = var3;
                }
            }
            if (~class478.field6654 < ~var1) {
                class478.field6654 -= (class478.field6654 - var1) * class254.field3756 / 1000 + class308.field4478;
                if (var1 > class478.field6654) {
                    class478.field6654 = var1;
                }
            }
            if (~var2 < ~class515.field7596) {
                class515.field7596 += (var2 - class515.field7596) * class254.field3756 / 1000 + class308.field4478;
                if (~class515.field7596 < ~var2) {
                    class515.field7596 = var2;
                }
            }
            if (var3 < field619) {
                field619 -= (field619 - var3) * class254.field3756 / 1000 + class308.field4478;
                if (field619 < var3) {
                    field619 = var3;
                }
            }
            if (var2 < class515.field7596) {
                class515.field7596 -= (class515.field7596 - var2) * class254.field3756 / 1000 + class308.field4478;
                if (class515.field7596 < var2) {
                    class515.field7596 = var2;
                }
            }
        }
        int var4 = class69.field873 * 128 + 64;
        int var5 = class531.field7779 * 128 + 64;
        int var6 = class488.method2817(var4, true, var5, class320.field4627) + -class377.field5347;
        int var7 = var4 - class478.field6654;
        int var8 = -field619 + var6;
        int var9 = -class515.field7596 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 - -(var9 * var9)));
        if (arg0 <= -115) {
            int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 16383;
            if (var11 < 1024) {
                var11 = 1024;
            }
            int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 16383;
            if (var11 > 3072) {
                var11 = 3072;
            }
            if (var11 > class41.field450) {
                class41.field450 += (-class41.field450 + var11 >> 3) * class363.field5199 / 1000 + class350.field5036 << 3;
                if (~var11 > ~class41.field450) {
                    class41.field450 = var11;
                }
            }
            if (~var11 > ~class41.field450) {
                class41.field450 -= class350.field5036 - -((class41.field450 - var11 >> 3) * class363.field5199 / 1000) << 3;
                if (var11 > class41.field450) {
                    class41.field450 = var11;
                }
            }
            int var13 = -class8.field122 + var12;
            if (~var13 < -8193) {
                var13 -= 16384;
            }
            if (var13 < -8192) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (~var14 < -1) {
                class8.field122 += class363.field5199 * var14 / 1000 + class350.field5036 << 3;
                class8.field122 &= 16383;
            }
            if (~var14 > -1) {
                class8.field122 -= -var14 * class363.field5199 / 1000 + class350.field5036 << 3;
                class8.field122 &= 16383;
            }
            int var15 = var12 - class8.field122;
            if (~var15 < -8193) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            if (var15 < 0 && ~var14 < -1 || ~var15 < -1 && ~var14 > -1) {
                class8.field122 = var12;
            }
            class194.field2743 = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIIII)V", line = 167)
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field621 = arg2;
        this.field622 = arg3;
        this.field626 = arg0;
        this.field624 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V", line = 180)
    public final void method406(int arg0, int arg1, int arg2) {
        ++field617;
        int var4 = this.field626 * arg2 >> 12;
        if (arg0 == 0) {
            int var5 = this.field621 * arg2 >> 12;
            int var6 = this.field624 * arg1 >> 12;
            int var7 = this.field622 * arg1 >> 12;
            class91.method650(var6, var5, var7, var4, super.field3394, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z", line = 203)
    public static final boolean method407(int arg0, int arg1) {
        if (arg1 != 1024) {
            field619 = 92;
        }
        ++field625;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 215)
    public final void method408(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field620;
            int var4 = this.field626 * arg1 >> 12;
            int var5 = this.field621 * arg1 >> 12;
            int var6 = this.field624 * arg0 >> 12;
            int var7 = this.field622 * arg0 >> 12;
            class489.method2821(super.field3389, var6, arg2 + -2, var5, var7, super.field3391, var4);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V", line = 234)
    public final void method409(int arg0, int arg1, byte arg2) {
        ++field618;
        if (arg2 == -85) {
            int var4 = this.field626 * arg1 >> 12;
            int var5 = this.field621 * arg1 >> 12;
            int var6 = this.field624 * arg0 >> 12;
            int var7 = this.field622 * arg0 >> 12;
            class106.method722(false, var7, var4, super.field3391, super.field3389, var6, super.field3394, var5);
        }
    }
}
