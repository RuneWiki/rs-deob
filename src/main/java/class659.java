import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class659 implements class48 {

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "Loh;")
    private class404 field9412;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Ljava/lang/String;")
    private String field9417;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field9407 = -2;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field9409 = 0;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "Lfca;")
    public static class84 field9413;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)Lvca;", line = 3)
    public final class279 method279(byte arg0) {
        field9414++;
        if (arg0 != -127) {
            this.method278(false);
        }
        return class279.field3424;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BIII)I", line = 14)
    public static final int method3752(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -86) {
            method3756(null, -86);
        }
        field9406++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V", line = 38)
    public static final void method3753(int arg0) {
        if (arg0 != 0) {
            field9409 = -20;
        }
        field9416++;
        class559.field7984 = new class289();
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V", line = 50)
    public static void method3754(int arg0) {
        field9413 = null;
        if (arg0 != -19897) {
            method3752((byte) -57, -127, 117, 68);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)I", line = 64)
    public final int method278(boolean arg0) {
        field9415++;
        if (this.field9412.method2466(this.field9417, -120)) {
            return 100;
        } else {
            if (!arg0) {
                this.field9412 = null;
            }
            return this.field9412.method2476(!arg0, this.field9417);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Loh;BLgh;)V", line = 81)
    public static final void method3755(class404 arg0, byte arg1, class546 arg2) {
        field9411++;
        if (arg1 != 4) {
            return;
        }
        class211.field2486 = "";
        class519.field7383 = arg0;
        class70.field742 = arg2;
        if (class228.field2621.startsWith("win")) {
            class211.field2486 = class211.field2486 + "windows/";
        } else if (class228.field2621.startsWith("linux")) {
            class211.field2486 = class211.field2486 + "linux/";
        } else if (class228.field2621.startsWith("mac")) {
            class211.field2486 = class211.field2486 + "macos/";
        }
        if (class70.field742.field7847) {
            class211.field2486 = class211.field2486 + "msjava/";
        } else if (class228.field2629.startsWith("amd64") || class228.field2629.startsWith("x86_64")) {
            class211.field2486 = class211.field2486 + "x86_64/";
        } else if (class228.field2629.startsWith("i386") || class228.field2629.startsWith("i486") || class228.field2629.startsWith("i586") || class228.field2629.startsWith("x86")) {
            class211.field2486 = class211.field2486 + "x86/";
        } else if (class228.field2629.startsWith("ppc")) {
            class211.field2486 = class211.field2486 + "ppc/";
        } else {
            class211.field2486 = class211.field2486 + "universal/";
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([II)Ljava/lang/String;", line = 142)
    public static final String method3756(int[] arg0, int arg1) {
        field9408++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class502.field7057;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class284 var5 = class579.field8200.method2110(false, arg0[var4]);
            if (var5.field3463 != -1) {
                class131 var6 = (class131) class634.field9110.method3538((long) var5.field3463, 0);
                if (var6 == null) {
                    class155 var7 = class155.method953(class394.field5410, var5.field3463, 0);
                    if (var7 != null) {
                        var6 = class275.field3370.method434(var7, true);
                        class634.field9110.method3537(77, (long) var5.field3463, var6);
                    }
                }
                if (var6 != null) {
                    class126.field1322[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg1 <= 11) {
            method3753(124);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Loh;Ljava/lang/String;)V", line = 190)
    public class659(class404 arg0, String arg1) {
        this.field9412 = arg0;
        this.field9417 = arg1;
    }
}
