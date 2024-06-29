import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class238 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lik;")
    public class149 field3442;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field3437 = -1;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Z")
    public static boolean field3440 = true;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3445 = "cyan:";

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "J")
    public static long field3444 = 0L;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIZ)V", line = 17)
    public static final void method1693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            method1693(36, 57, 62, -8, -20, 66, false);
        }
        if (arg0 >= class245.field3574 && class321.field4722 >= arg5 && arg2 >= class207.field2937 && class25.field292 >= arg4) {
            if (arg3 == 1) {
                class302.method2117(-1, arg1, arg0, arg5, arg2, arg4);
            } else {
                class95.method687(0, arg1, arg0, arg4, arg5, arg3, arg2);
            }
        } else if (arg3 == 1) {
            class160.method1222(arg5, (byte) -83, arg4, arg2, arg1, arg0);
        } else {
            class191.method1387(arg5, arg1, arg3, arg0, (byte) -9, arg2, arg4);
        }
        field3436++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 55)
    public static void method1694(int arg0) {
        if (arg0 >= -47) {
            method1693(58, -57, -61, 71, -64, 3, true);
        }
        field3445 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIII)V", line = 68)
    public class238(int arg0, int arg1, int arg2, int arg3) {
        class149 var5 = class270.method1841(0, arg0);
        this.field3438 = arg3;
        this.field3446 = arg2;
        this.field3447 = arg1;
        if (class47.field623 || var5.field2107 == -1) {
            this.field3442 = var5;
        } else {
            this.field3442 = class270.method1841(0, var5.field2107);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lik;III)V", line = 87)
    public class238(class149 arg0, int arg1, int arg2, int arg3) {
        this.field3447 = arg1;
        this.field3442 = arg0;
        this.field3438 = arg3;
        this.field3446 = arg2;
    }
}
