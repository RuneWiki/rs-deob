import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class186 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "B")
    public byte field2505;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "B")
    public byte field2508;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "S")
    public short field2507;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Lqea;")
    public class126 field2509;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lrq;")
    public static class350 field2504 = new class350("LIVE", 0);

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "Lik;")
    public static class207 field2510 = new class207();

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "Z")
    public static boolean field2511 = false;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIBII[II)Z", line = 14)
    public static final boolean method1170(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (arg5 > class454.field6415) {
            arg5 = class454.field6415;
        }
        field2506++;
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg5 <= arg2) {
            return true;
        }
        int var8 = arg5 - arg2 >> 2;
        int var9 = arg1 * arg2 + arg0;
        int var10 = arg2 + arg7 - 1;
        int var11 = -49 % ((-arg3 - 5) / 38);
        int var10000;
        if (class546.field7623 == 1) {
            class744.field10348 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var17 = arg5 - arg2 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var10000 = ~var9;
                        var10++;
                        if (var10000 > ~arg6[var10]) {
                            arg6[var10] = var9;
                        }
                        var9 += arg1;
                    }
                }
                var10000 = ~var9;
                var10++;
                if (var10000 > ~arg6[var10]) {
                    arg6[var10] = var9;
                }
                int var18 = arg1 + var9;
                var10++;
                if (arg6[var10] > var18) {
                    arg6[var10] = var18;
                }
                int var19 = arg1 + var18;
                var10++;
                if (var19 < arg6[var10]) {
                    arg6[var10] = var19;
                }
                int var20 = arg1 + var19;
                var10++;
                if (var20 < arg6[var10]) {
                    arg6[var10] = var20;
                }
                var9 = arg1 + var20;
            }
        } else {
            int var12 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var13 = arg5 - arg2 & 0x3;
                    while (true) {
                        var13--;
                        if (var13 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg6[var10] > var12) {
                            return false;
                        }
                        var12 += arg1;
                    }
                }
                var10000 = ~var12;
                var10++;
                if (var10000 > ~arg6[var10]) {
                    return false;
                }
                int var14 = arg1 + var12;
                var10++;
                if (arg6[var10] > var14) {
                    return false;
                }
                int var15 = arg1 + var14;
                var10000 = ~var15;
                var10++;
                if (var10000 > ~arg6[var10]) {
                    return false;
                }
                int var16 = arg1 + var15;
                var10++;
                if (var16 < arg6[var10]) {
                    return false;
                }
                var12 = arg1 + var16;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lqea;III)V", line = 107)
    public class186(class126 arg0, int arg1, int arg2, int arg3) {
        this.field2505 = (byte) arg3;
        this.field2508 = (byte) arg2;
        this.field2507 = (short) arg1;
        this.field2509 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V", line = 118)
    public static void method1171(int arg0) {
        if (arg0 != 20816) {
            field2511 = false;
        }
        field2504 = null;
        field2510 = null;
    }
}
