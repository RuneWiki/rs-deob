import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class494 {

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "Lqk;")
    public static class148 field6938 = new class148(94, 10);

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
    public static int field6945 = 0;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public int field6936;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public int field6941;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public int field6944;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "Ljava/lang/Thread;")
    public static Thread field6942;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lvj;I)V")
    public final void method2953(class26 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                field6939++;
                if (arg1 != -1) {
                    this.method2953(null, 112);
                    return;
                }
                return;
            }
            this.method2954(var3, 10, arg0);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IILvj;)V")
    private final void method2954(int arg0, int arg1, class26 arg2) {
        if (arg1 != 10) {
            field6945 = 113;
        }
        field6943++;
        if (arg0 == 1) {
            this.field6941 = arg2.method193(2);
            this.field6936 = arg2.method194((byte) 119);
            this.field6944 = arg2.method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
    public static final boolean method2955(int arg0) {
        if (arg0 != 10) {
            field6945 = 90;
        }
        field6937++;
        boolean var1 = true;
        if (class757.field10527 == null) {
            if (class323.field4156.method3340(0, class306.field3971)) {
                class757.field10527 = class320.method1861(class323.field4156, class306.field3971);
            } else {
                var1 = false;
            }
        }
        if (class204.field2928 == null) {
            if (class323.field4156.method3340(0, class269.field3633)) {
                class204.field2928 = class320.method1861(class323.field4156, class269.field3633);
            } else {
                var1 = false;
            }
        }
        if (class13.field188 == null) {
            if (class323.field4156.method3340(0, class637.field9057)) {
                class13.field188 = class320.method1861(class323.field4156, class637.field9057);
            } else {
                var1 = false;
            }
        }
        if (class430.field5924 == null) {
            if (class448.field6168.method3340(0, class698.field9726)) {
                class430.field5924 = class216.method1415(class448.field6168, (byte) 106, class698.field9726);
            } else {
                var1 = false;
            }
        }
        if (class173.field2367 == null) {
            if (class323.field4156.method3340(arg0 ^ 0xA, class698.field9726)) {
                class173.field2367 = class320.method1869(class323.field4156, class698.field9726);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZBI)V")
    public static final void method2956(boolean arg0, byte arg1, int arg2) {
        field6940++;
        if (arg0) {
            class120 var3 = class292.method1716(class608.field8668, true, class631.field8991);
            var3.field1653.method147((byte) 53, arg2);
            class471.method2805(97, var3);
        } else {
            class318.method1838(class446.field6098, arg2, -1);
        }
        if (arg1 > -48) {
            field6942 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
    public static void method2957(int arg0) {
        if (arg0 < -9) {
            field6938 = null;
            field6942 = null;
        }
    }
}
