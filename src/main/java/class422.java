import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class422 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
    private boolean field5294 = false;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field5299 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field5295 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lil;")
    public static class68 field5307 = new class68(32);

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lrga;")
    public static class280 field5309 = new class280(71, 11);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field5297;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field5298;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    private int field5301;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "J")
    public long field5305;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Ljava/applet/Applet;")
    public static Applet field5308;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public final void method2240(byte arg0) {
        this.field5297 = class453.field5811[this.field5301 << 3];
        field5293++;
        long var2 = (long) this.field5302;
        long var4 = (long) this.field5303;
        long var6 = (long) this.field5292;
        this.field5304 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (this.field5296 == 0) {
            this.field5296 = 1;
        }
        if (this.field5300 == 0) {
            this.field5305 = 2147483647L;
        } else if (this.field5300 == 1) {
            this.field5305 = (this.field5304 * 8 / this.field5296);
            this.field5305 *= this.field5305;
        } else if (this.field5300 == 2) {
            this.field5305 = (this.field5304 * 8 / this.field5296);
        }
        if (arg0 < 47) {
            method2243(null, -30, 37);
        }
        if (this.field5294) {
            this.field5304 *= -1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2241(int arg0) {
        field5309 = null;
        field5307 = null;
        if (arg0 == 0) {
            field5308 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Les;IB)V")
    private final void method2242(class630 arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            this.field5304 = 54;
        }
        if (arg1 == 1) {
            this.field5301 = arg0.method3470(13111);
        } else if (arg1 == 2) {
            arg0.method3501(-9268);
        } else if (arg1 == 3) {
            this.field5302 = arg0.method3483(86);
            this.field5303 = arg0.method3483(arg2 ^ 0xFFFFFFC9);
            this.field5292 = arg0.method3483(arg2 ^ 0xFFFFFFFD);
        } else if (arg1 == 4) {
            this.field5300 = arg0.method3501(-9268);
            this.field5296 = arg0.method3483(124);
        } else if (arg1 == 6) {
            this.field5290 = arg0.method3501(-9268);
        } else if (arg1 == 8) {
            this.field5295 = 1;
        } else if (arg1 == 9) {
            this.field5299 = 1;
        } else if (arg1 == 10) {
            this.field5294 = true;
        }
        field5289++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lni;II)V")
    public static final void method2243(class687 arg0, int arg1, int arg2) {
        field5306++;
        int var3 = -1;
        int var4 = arg2;
        if (class133.field1735 < arg0.field9740) {
            class365.method2003((byte) -87, arg0);
        } else if (arg0.field9665 >= class133.field1735) {
            class270.method1558((byte) 95, arg0);
        } else {
            class377.method2047(false, arg0, (byte) 78);
            var4 = class480.field6388;
            var3 = class454.field5820;
        }
        if (arg0.field6461 < 512 || arg0.field6464 < 512 || (class431.field5395 - 1) * 512 <= arg0.field6461 || ((class452.field5802 - 1) * 512) <= arg0.field6464) {
            arg0.field9665 = 0;
            arg0.field9740 = 0;
            var3 = -1;
            arg0.field9669 = -1;
            arg0.field9687 = -1;
            var4 = 0;
            arg0.field9691 = null;
            arg0.field9689 = -1;
            arg0.field6461 = arg0.field9758[0] * 512 + (arg0.method2785(-1) * 256);
            arg0.field6464 = arg0.field9754[0] * 512 + arg0.method2785(-1) * 256;
            arg0.method3862(arg2);
        }
        if (class376.field4748 == arg0 && (arg0.field6461 < 6144 || arg0.field6464 < 6144 || class431.field5395 * 512 - 6144 <= arg0.field6461 || (class452.field5802 - 12) * 512 <= arg0.field6464)) {
            var4 = 0;
            arg0.field9665 = 0;
            var3 = -1;
            arg0.field9691 = null;
            arg0.field9689 = -1;
            arg0.field9740 = 0;
            arg0.field9669 = -1;
            arg0.field9687 = -1;
            arg0.field6461 = arg0.field9758[0] * 512 + arg0.method2785(-1) * 256;
            arg0.field6464 = arg0.field9754[0] * 512 + arg0.method2785(-1) * 256;
            arg0.method3862(0);
        }
        int var5 = class594.method3267((byte) 117, arg0);
        class523.method2852(var5, var3, arg0, arg2 ^ 0xFFFF983D, var4);
        class81.method470(-6855, arg0, var3);
        class377.method2050(arg0, (byte) 87);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLes;)V")
    public final void method2244(byte arg0, class630 arg1) {
        field5291++;
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                if (arg0 > -35) {
                    method2243(null, -22, 98);
                    return;
                } else {
                    return;
                }
            }
            this.method2242(arg1, var3, (byte) -99);
        }
    }
}
