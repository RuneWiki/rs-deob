import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class405 implements class427 {

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field5760 = 0;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
    public static boolean field5762 = false;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lkd;")
    public static class190 field5763;

    @OriginalMember(owner = "client!kj", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field5764++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILsg;I)V", line = 22)
    public static final void method2415(int arg0, int arg1, class279 arg2, int arg3) {
        field5761++;
        if (arg1 != 0) {
            field5763 = null;
        }
        if (arg2.field274 == arg0 && arg0 != -1) {
            class183 var4 = class96.field1526.method2717(arg1 ^ 0xFFFFFF98, arg0);
            int var5 = var4.field2687;
            if (var5 == 1) {
                arg2.field243 = 0;
                arg2.field251 = 1;
                arg2.field261 = arg3;
                arg2.field269 = 0;
                arg2.field320 = 0;
                class511.method2983(arg2.field6961, arg2.field320, arg2.field6965, -64, false, var4, arg2.field6956);
            }
            if (var5 == 2) {
                arg2.field269 = 0;
                return;
            }
        } else if (arg0 == -1 || arg2.field274 == -1 || class96.field1526.method2717(-117, arg0).field2688 >= class96.field1526.method2717(-126, arg2.field274).field2688) {
            arg2.field274 = arg0;
            arg2.field251 = 1;
            arg2.field320 = 0;
            arg2.field261 = arg3;
            arg2.field335 = arg2.field333;
            arg2.field269 = 0;
            arg2.field243 = 0;
            if (arg2.field274 == -1) {
                return;
            }
            class511.method2983(arg2.field6961, arg2.field320, arg2.field6965, -64, false, class96.field1526.method2717(arg1 ^ 0xFFFFFFA4, arg2.field274), arg2.field6956);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lba;IIIIZLqa;)V", line = 80)
    public static final void method2416(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class167 arg6) {
        if (arg3 <= 80) {
            field5763 = null;
        }
        if (arg5) {
            class387.field5510.method2175((class50.field927 - class387.field5510.method376()) / 2, (class76.field1247 - class387.field5510.method374()) / 2);
            class490.field7069.method2175((class50.field927 - class490.field7069.method376()) / 2, 18);
        }
        field5765++;
        String var7 = "";
        if (client.field3115 == class14.field163) {
            var7 = class500.field7226.method426(class503.field7255, 39);
        } else if (class167.field2519 == class14.field163) {
            var7 = class355.field5166.method426(class503.field7255, 122);
        }
        arg0.method1746(false, arg2, class50.field927 / 2, class76.field1247 / 2 - 26, var7, -1);
        int var8 = class76.field1247 / 2 - 18;
        arg6.method327(class50.field927 / 2 - 152, var8, 304, 34, arg4, 0);
        arg6.method327(class50.field927 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg6.method215(class50.field927 / 2 - 150, var8 - -2, class490.field7071 * 3, 30, arg1, 0);
        arg6.method215(class50.field927 / 2 + (class490.field7071 * 3) - 150, var8 - -2, 300 - (class490.field7071 * 3), 30, 0, 0);
        arg0.method1746(false, arg2, class50.field927 / 2, class76.field1247 / 2 + 4, class90.field1447, -1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 114)
    public static final void method2417(int arg0) {
        if (arg0 < 70) {
            method2418(101);
        }
        class513.field7461 = 0;
        class220.field3372 = 0;
        class289.field4292 = 0;
        class238.field3597 = 0;
        field5759++;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 130)
    public class405(String arg0, int arg1) {
        this.field5766 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 140)
    public static void method2418(int arg0) {
        field5763 = null;
        if (arg0 != -2034) {
            method2417(100);
        }
    }
}
