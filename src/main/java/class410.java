import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class410 extends class362 {

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljava/lang/String;")
    public String field5964;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Lmu;")
    public static class303 field5966 = new class303(97, 0);

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field5968 = 1;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2537(byte arg0) {
        if (class3.field26 != null) {
            try {
                class3.field26.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 > -33) {
            method2541(-73, 3, 6);
        }
        field5963++;
        class3.field26 = null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V", line = 26)
    public static void method2538(byte arg0) {
        if (arg0 != -80) {
            method2542(-26, null);
        }
        field5966 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lha;B)V", line = 38)
    public static final void method2539(class59 arg0, byte arg1) {
        if (arg1 > -108) {
            method2541(19, 60, 108);
        }
        field5967++;
        if (class511.field7109 != class58.field1147.field5926 && class649.field8928 != null && class423.method2595(class58.field1147.field5926, arg0, true)) {
            class511.field7109 = class58.field1147.field5926;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljb;Z)V", line = 60)
    public static final void method2540(class494 arg0, boolean arg1) {
        for (int var2 = arg0.field6831; var2 <= arg0.field6839; var2++) {
            for (int var3 = arg0.field6838; var3 <= arg0.field6835; var3++) {
                class384 var4 = class649.field8928[arg0.field5926][var2][var3];
                if (var4 != null) {
                    class474 var5 = var4.field5567;
                    class474 var6 = null;
                    while (var5 != null) {
                        if (var5.field6623 == arg0) {
                            if (var6 == null) {
                                var4.field5567 = var5.field6621;
                            } else {
                                var6.field6621 = var5.field6621;
                            }
                            var5.method2792((byte) -106);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field6621;
                    }
                }
            }
        }
        if (!arg1) {
            class468.method2749(arg0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Les;", line = 109)
    public static final class384 method2541(int arg0, int arg1, int arg2) {
        if (class649.field8928[arg0][arg1][arg2] == null) {
            boolean var3 = class649.field8928[0][arg1][arg2] != null && class649.field8928[0][arg1][arg2].field5571 != null;
            if (var3 && arg0 >= class510.field7094 - 1) {
                return null;
            }
            class681.method3821(arg0, arg1, arg2);
        }
        return class649.field8928[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILcea;)Lum;", line = 122)
    public static final class524 method2542(int arg0, class215 arg1) {
        field5962++;
        class140 var2 = class30.method412((byte) -125, arg1);
        int var3 = arg1.method1478(arg0 ^ 0x3235F8F8);
        int var4 = arg1.method1478(842397944);
        if (arg0 != 0) {
            field5966 = null;
        }
        int var5 = arg1.method1478(842397944);
        int var6 = arg1.method1478(arg0 + 842397944);
        int var7 = arg1.method1478(842397944);
        int var8 = arg1.method1478(842397944);
        return new class524(var2.field2322, var2.field2327, var2.field2324, var2.field2313, var2.field2325, var2.field2317, var2.field2320, var2.field2319, var2.field2315, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 154)
    public class410() {
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 156)
    public class410(String arg0, int arg1) {
        this.field5964 = arg0;
    }
}
