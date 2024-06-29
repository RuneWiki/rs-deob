import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class429 extends class179 {

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public volatile int field6294 = -1;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field6295;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "Lbg;")
    public static class310 field6297 = new class310(40, 3);

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
    public static boolean field6301 = false;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "J")
    public static long field6299 = -1L;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lnc;")
    public static class21 field6302;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
    public static int[] field6298;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILtq;I)V")
    public static final void method2523(byte arg0, int arg1, class427 arg2, int arg3) {
        if (arg0 != -44) {
            field6301 = true;
        }
        field6300++;
        if (class450.field6931 != null || class381.field5555 || arg2 == null || class211.method1298(arg2, 127) == null) {
            return;
        }
        class450.field6931 = arg2;
        class332.field4974 = class211.method1298(arg2, 80);
        class446.field6867 = arg1;
        class123.field2031 = arg3;
        class362.field5343 = 0;
        class178.field2790 = false;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class429(String arg0) {
        this.field6295 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public static void method2524(int arg0) {
        field6298 = null;
        field6302 = null;
        field6297 = null;
        if (arg0 != 17402) {
            method2524(0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static final void method2525(int arg0) {
        for (class286 var1 = (class286) class14.field204.method8((byte) -98); var1 != null; var1 = (class286) class14.field204.method17((byte) -111)) {
            if (var1.field4339) {
                var1.method1743(25996);
            }
        }
        int var2 = -85 % ((-arg0 - 33) / 38);
        field6296++;
        for (class286 var3 = (class286) class414.field5999.method8((byte) -98); var3 != null; var3 = (class286) class414.field5999.method17((byte) -72)) {
            if (var3.field4339) {
                var3.method1743(25996);
            }
        }
    }
}
