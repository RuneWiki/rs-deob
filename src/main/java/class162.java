import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class162 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2229 = 0;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field2230 = 0;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lqg;")
    public static class465 field2227;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
    public static final boolean method1132(int arg0, int arg1) {
        if (arg1 != 23093) {
            field2227 = null;
        }
        field2228++;
        return arg0 != 1 && arg0 != 7;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1133(int arg0) {
        if (arg0 != -9287) {
            method1135(-125, -122, (byte) 114, null);
        }
        field2227 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
    public static final int method1134(byte arg0) {
        field2232++;
        if (arg0 < 69) {
            field2230 = -66;
        }
        class534 var1 = class28.field500;
        synchronized (class28.field500) {
            return class28.field500.method3073((byte) -66);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBLria;)V")
    public static final void method1135(int arg0, int arg1, byte arg2, class288 arg3) {
        field2231++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field3735 != null) {
            class694 var4 = new class694();
            var4.field9635 = arg3;
            var4.field9645 = arg3.field3735;
            class188.method1262(var4);
        }
        class8.field103 = true;
        class740.field10331 = arg3.field3723;
        class702.field9767 = arg3.field3682;
        class100.field1388 = arg3.field3740;
        class27.field489 = arg3.field3696;
        if (arg2 > -33) {
            field2227 = null;
        }
        class718.field10004 = arg3.field3700;
        class599.field8349 = arg0;
        class565.field7935 = arg1;
        class207.method1332((byte) -125, arg3);
    }
}
