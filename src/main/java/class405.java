import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class405 extends class337 {

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field5375 = 100;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    public static int field5377 = 0;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "Z")
    public static boolean field5382 = false;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Lwm;")
    public static class30 field5379;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 9)
    public static void method2359(byte arg0) {
        field5379 = null;
        int var1 = -57 / ((78 - arg0) / 38);
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BZI)V", line = 22)
    public static final void method2360(byte arg0, boolean arg1, int arg2) {
        if (arg0 < 79) {
            method2361(null, -45);
        }
        if (arg1) {
            class13 var3 = class659.method3587(class68.field909, 98, class374.field4581);
            var3.field130.method1541(374, arg2);
            class116.method679(var3, 0);
        } else {
            class760.method4149(class599.field7618, arg2, -1);
        }
        field5381++;
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V", line = 44)
    public class405() {
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([II)Ljava/lang/String;", line = 50)
    public static final String method2361(int[] arg0, int arg1) {
        field5374++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class17.field165;
        for (int var4 = arg1; var4 < arg0.length; var4++) {
            class57 var5 = class55.field713.method1804(-6396, arg0[var4]);
            if (var5.field762 != -1) {
                class772 var6 = (class772) class450.field5877.method2931((long) var5.field762, (byte) -69);
                if (var6 == null) {
                    class388 var7 = class388.method2232(class172.field2270, var5.field762, 0);
                    if (var7 != null) {
                        var6 = class576.field7320.method977(var7, true);
                        class450.field5877.method2918((long) var5.field762, var6, 102);
                    }
                }
                if (var6 != null) {
                    class269.field3556[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(I)V", line = 98)
    public class405(int arg0) {
        this.field5378 = arg0;
    }
}
