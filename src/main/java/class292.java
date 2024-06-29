import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class292 extends class430 {

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Ljava/lang/String;")
    public String field4020;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        field4017++;
        if (class675.field9608) {
            return;
        }
        class675.field9608 = true;
        if (arg0 != 31726) {
            method1835(75, -59, -55, 49, 108, -74);
        }
        class201.field2980 += (12.0F - class201.field2980) / 2.0F;
        class275.field3877 = true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1835(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4021++;
        if (arg3 == arg5) {
            class523.method3186(arg0, arg5, arg1, arg4, 5120);
            return;
        }
        if (arg2 != -10168) {
            method1836((byte) 73);
        }
        if (class200.field2976 <= arg0 - arg5 && (arg0 + arg5) <= class204.field3061 && class377.field5458 <= (arg4 - arg3) && arg3 + arg4 <= class362.field5291) {
            class646.method3730(arg1, arg5, arg3, arg0, arg4, (byte) -100);
        } else {
            class32.method164(arg0, arg4, true, arg5, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static final void method1836(byte arg0) {
        field4019++;
        class348 var1 = class11.field100;
        synchronized (class11.field100) {
            if (arg0 != -113) {
                method1835(-32, 115, 112, -90, -80, 78);
            }
            class11.field100.method2219(-5300);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class292() {
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class292(String arg0, int arg1) {
        this.field4020 = arg0;
    }
}
