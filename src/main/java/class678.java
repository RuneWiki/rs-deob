import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class678 extends class45 {

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
    public long field9635;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lnq;")
    public static class650 field9636 = new class650("stellardawn", 1);

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Ltt;")
    public static class338 field9637 = new class338(32, 8);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[IIIII)Z", line = 7)
    public static final boolean method3867(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class6.field65 < arg0) {
            arg0 = class6.field65;
        }
        if (arg6 < 0) {
            arg6 = 0;
        }
        field9634++;
        if (arg2 != -16800) {
            field9637 = null;
        }
        if (arg0 <= arg6) {
            return true;
        }
        int var8 = arg6 * arg7 + arg1;
        int var9 = arg6 + arg4 - 1;
        int var10 = arg0 - arg6 >> 2;
        int var10000;
        if (class585.field8079 == 1) {
            class469.field6278 += var10;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var15 = arg0 - arg6 & 0x3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            return true;
                        }
                        var10000 = ~var8;
                        var9++;
                        if (var10000 > ~arg3[var9]) {
                            arg3[var9] = var8;
                        }
                        var8 += arg7;
                    }
                }
                var9++;
                if (arg3[var9] > var8) {
                    arg3[var9] = var8;
                }
                int var16 = arg7 + var8;
                var9++;
                if (var16 < arg3[var9]) {
                    arg3[var9] = var16;
                }
                int var17 = arg7 + var16;
                var9++;
                if (arg3[var9] > var17) {
                    arg3[var9] = var17;
                }
                int var18 = arg7 + var17;
                var10000 = ~var18;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    arg3[var9] = var18;
                }
                var8 = arg7 + var18;
            }
        } else {
            var8 -= 15360;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var11 = arg0 - arg6 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10000 = ~var8;
                        var9++;
                        if (var10000 > ~arg3[var9]) {
                            return false;
                        }
                        var8 += arg7;
                    }
                }
                var10000 = ~var8;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                int var12 = arg7 + var8;
                var9++;
                if (arg3[var9] > var12) {
                    return false;
                }
                int var13 = arg7 + var12;
                var9++;
                if (var13 < arg3[var9]) {
                    return false;
                }
                int var14 = arg7 + var13;
                var9++;
                if (arg3[var9] > var14) {
                    return false;
                }
                var8 = arg7 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 104)
    public class678() {
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(J)V", line = 107)
    public class678(long arg0) {
        this.field9635 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 115)
    public static void method3868(boolean arg0) {
        field9636 = null;
        field9637 = null;
        if (arg0) {
            method3868(true);
        }
    }
}
