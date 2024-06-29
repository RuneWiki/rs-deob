import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class223 extends class320 {

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
    public static boolean field3193 = false;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLmq;I)I", line = 5)
    public static final int method1476(byte arg0, class350 arg1, int arg2) {
        if (arg0 < 98) {
            method1479(78, 77, -105, -19, 15);
        }
        field3194++;
        if (!client.method1349(arg1).method1609(arg2, (byte) -31) && arg1.field5349 == null) {
            return -1;
        } else if (arg1.field5304 == null || arg1.field5304.length <= arg2) {
            return -1;
        } else {
            return arg1.field5304[arg2];
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[[I)V", line = 27)
    public static final void method1477(byte arg0, int[][] arg1) {
        if (arg0 != -97) {
            method1478(-102, -70, -58, 72, -127, 120, true, 35, 60, -124);
        }
        class21.field430 = arg1;
        field3190++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIZIII)V", line = 40)
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field3189++;
        if (arg6) {
            method1478(-78, 107, 10, 95, -95, 53, true, 127, 14, 70);
        }
        class408 var10 = null;
        for (class408 var11 = (class408) class431.field6415.method2427(109); var11 != null; var11 = (class408) class431.field6415.method2422(-91)) {
            if (var11.field6124 == arg9 && var11.field6126 == arg5 && var11.field6119 == arg8 && var11.field6115 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class408();
            var10.field6124 = arg9;
            var10.field6126 = arg5;
            var10.field6119 = arg8;
            var10.field6115 = arg0;
            if (arg5 >= 0 && arg8 >= 0 && arg5 < class33.field662 && arg8 < class121.field1966) {
                class47.method446(var10, (byte) 89);
            }
            class431.field6415.method2417(-121, var10);
        }
        var10.field6121 = arg2;
        var10.field6120 = arg1;
        var10.field6125 = arg7;
        var10.field6123 = arg4;
        var10.field6118 = arg3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V", line = 83)
    public static final void method1479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3196++;
        float var5 = (float) class509.field7504 / (float) class509.field7522;
        int var6 = arg4;
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg2 - (arg1 - var7) / 2;
        int var9 = arg3 - (arg4 - var6) / 2;
        class307.field4691 = arg0;
        class404.field6067 = class509.field7522 * var9 / var6;
        class151.field2403 = -1;
        class158.field2464 = class509.field7504 - class509.field7504 * var8 / var7;
        class216.method1443(true);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V", line = 107)
    public class223(int arg0, int arg1) {
        this.field3192 = arg1;
        this.field3191 = arg0;
    }
}
