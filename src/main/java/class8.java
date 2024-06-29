import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class8 extends class165 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
    public static int[] field116 = new int[50];

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field117 = 0;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field111 = 5063219;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Z")
    public static boolean field123 = true;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Z")
    public static boolean field124 = false;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "J")
    public long field109;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lak;")
    public static class172 field112;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Lsi;")
    public static class336 field120;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "Lvg;")
    public class8 field114;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "Lvg;")
    public class8 field115;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILog;)V", line = 33)
    public static final void method41(int arg0, int arg1, int arg2, class157 arg3) {
        field110++;
        if (arg3.field2560 == 0) {
            arg3.field2519 = arg3.field2461;
        } else if (arg3.field2560 == 1) {
            arg3.field2519 = (arg1 - arg3.field2468) / 2 + arg3.field2461;
        } else if (arg3.field2560 == 2) {
            arg3.field2519 = arg1 - arg3.field2468 - arg3.field2461;
        } else if (arg3.field2560 == 3) {
            arg3.field2519 = arg3.field2461 * arg1 >> 14;
        } else if (arg3.field2560 == 4) {
            arg3.field2519 = (arg1 - arg3.field2468) / 2 + (arg3.field2461 * arg1 >> 14);
        } else {
            arg3.field2519 = arg1 - (arg3.field2461 * arg1 >> 14) - arg3.field2468;
        }
        if (arg3.field2431 == arg2) {
            arg3.field2517 = arg3.field2469;
        } else if (arg3.field2431 == 1) {
            arg3.field2517 = (arg0 - arg3.field2520) / 2 + arg3.field2469;
        } else if (arg3.field2431 == 2) {
            arg3.field2517 = arg0 - arg3.field2520 - arg3.field2469;
        } else if (arg3.field2431 == 3) {
            arg3.field2517 = arg3.field2469 * arg0 >> 14;
        } else if (arg3.field2431 == 4) {
            arg3.field2517 = (arg0 - arg3.field2520) / 2 + (arg3.field2469 * arg0 >> 14);
        } else {
            arg3.field2517 = arg0 - (arg3.field2469 * arg0 >> 14) - arg3.field2520;
        }
        if (!class301.field4727 || !(client.method766(arg3).field4503 != 0 || arg3.field2478 == 0)) {
            return;
        }
        if (arg3.field2517 < 0) {
            arg3.field2517 = 0;
        } else if (arg0 < (arg3.field2520 + arg3.field2517)) {
            arg3.field2517 = arg0 - arg3.field2520;
        }
        if (arg3.field2519 < 0) {
            arg3.field2519 = 0;
        } else if (arg1 < (arg3.field2519 + arg3.field2468)) {
            arg3.field2519 = arg1 - arg3.field2468;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 103)
    public final void method42(byte arg0) {
        if (arg0 > -40) {
            this.method42((byte) 89);
        }
        field122++;
        if (this.field115 != null) {
            this.field115.field114 = this.field114;
            this.field114.field115 = this.field115;
            this.field114 = null;
            this.field115 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIII)V", line = 124)
    public static final void method43(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class343.field5341 = (long) arg2;
        field113++;
        int var5 = class204.method1490((byte) 59);
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        boolean var6 = false;
        if (var5 > 0 == arg0 <= 0) {
            var6 = true;
        }
        if (class124.field1932.startsWith("mac") && arg0 > 0) {
            arg1 = true;
        }
        if (arg1 && arg0 > 0) {
            var6 = true;
        }
        class15.method84(arg4, 6976, arg3, arg1, var6, var5, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V", line = 165)
    public static void method44(int arg0) {
        if (arg0 != 0) {
            field121 = -116;
        }
        field116 = null;
        field112 = null;
        field120 = null;
    }
}
