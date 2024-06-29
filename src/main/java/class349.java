import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class349 {

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "Z")
    public boolean field4926 = true;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "C")
    private char field4929;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "Ljava/lang/String;")
    public String field4931;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILek;Z)V", line = 5)
    private final void method2121(int arg0, class465 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field4929 = class409.method2446(arg1.method2712(-106), -18082);
        } else if (arg0 == 2) {
            this.field4922 = arg1.method2691((byte) -67);
        } else if (arg0 == 4) {
            this.field4926 = false;
        } else if (arg0 == 5) {
            this.field4931 = arg1.method2717(true);
        }
        field4927++;
        if (!arg2) {
            this.method2122((byte) 103);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)Z", line = 37)
    public final boolean method2122(byte arg0) {
        int var2 = 52 / ((61 - arg0) / 52);
        field4930++;
        return this.field4929 == 's';
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V", line = 47)
    public static final void method2123(byte arg0, int arg1) {
        field4925++;
        class449 var2 = class611.method3463(arg1, (byte) -125, 3);
        var2.method2614(36);
        if (arg0 < 30) {
            field4923 = -33;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLek;)V", line = 61)
    public final void method2124(byte arg0, class465 arg1) {
        field4924++;
        if (arg0 <= 49) {
            this.method2121(18, null, false);
        }
        while (true) {
            int var3 = arg1.method2705(-101);
            if (var3 == 0) {
                return;
            }
            this.method2121(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)I", line = 89)
    public static final int method2125(int arg0, byte arg1) {
        if (arg1 != 113) {
            field4923 = -104;
        }
        field4928++;
        return arg0 >>> 8;
    }
}
