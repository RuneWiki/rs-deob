import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class585 {

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Z")
    private boolean field8330 = false;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field8319 = 0;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public int field8337 = 0;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field8333 = 765;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field8329 = 0;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field8331 = 100;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field8318;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field8320;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field8323;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field8324;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field8326;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public int field8335;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public int field8336;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public int field8338;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public int field8340;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "J")
    public long field8327;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lnr;")
    public static class53 field8325;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lkl;")
    public static class70 field8317;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILie;)V", line = 5)
    public final void method3427(int arg0, class6 arg1) {
        field8321++;
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    this.method3429(-104, (byte) -60, null);
                    return;
                }
            }
            this.method3429(var3, (byte) -74, arg1);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ler;IIIB)Lcea;", line = 35)
    public static final class197 method3428(class92 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8332++;
        if (arg4 <= 124) {
            field8331 = -100;
        }
        if (!arg0.field1376 && (!class416.method2649(arg1, true) || !class416.method2649(arg3, true))) {
            return arg0.field1428 ? new class197(arg0, 34037, arg2, arg1, arg3) : new class197(arg0, arg2, arg1, arg3, class413.method2636(arg1, 127), class413.method2636(arg3, 127));
        } else {
            return new class197(arg0, 3553, arg2, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLie;)V", line = 76)
    private final void method3429(int arg0, byte arg1, class6 arg2) {
        if (arg0 == 1) {
            this.field8323 = arg2.method67(12021);
        } else if (arg0 == 2) {
            arg2.method70(-9059);
        } else if (arg0 == 3) {
            this.field8334 = arg2.method72(-40);
            this.field8340 = arg2.method72(-84);
            this.field8326 = arg2.method72(-28);
        } else if (arg0 == 4) {
            this.field8335 = arg2.method70(-9059);
            this.field8324 = arg2.method72(-55);
        } else if (arg0 == 6) {
            this.field8318 = arg2.method70(-9059);
        } else if (arg0 == 8) {
            this.field8319 = 1;
        } else if (arg0 == 9) {
            this.field8337 = 1;
        } else if (arg0 == 10) {
            this.field8330 = true;
        }
        field8322++;
        int var4 = 96 % ((arg1 - 82) / 35);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 135)
    public final void method3430(byte arg0) {
        field8328++;
        this.field8336 = class567.field8138[this.field8323 << 3];
        long var2 = (long) this.field8334;
        long var4 = (long) this.field8340;
        if (arg0 > -44) {
            this.field8330 = false;
        }
        long var6 = (long) this.field8326;
        this.field8320 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field8324 == 0) {
            this.field8324 = 1;
        }
        if (this.field8335 == 0) {
            this.field8327 = 2147483647L;
        } else if (this.field8335 == 1) {
            this.field8327 = (this.field8320 * 8 / this.field8324);
            this.field8327 *= this.field8327;
        } else if (this.field8335 == 2) {
            this.field8327 = (this.field8320 * 8 / this.field8324);
        }
        if (this.field8330) {
            this.field8320 *= -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 179)
    public static void method3431(boolean arg0) {
        field8325 = null;
        if (!arg0) {
            field8331 = 3;
        }
        field8317 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 198)
    public static final long method3432(String arg0, int arg1) {
        field8339++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = arg1; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }
}
