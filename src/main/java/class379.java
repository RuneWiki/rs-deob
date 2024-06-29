import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class379 extends class646 {

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
    public static boolean field4849 = true;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field4851 = new String[100];

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "Lme;")
    public static class668 field4852 = new class668(4);

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "[Lvt;")
    public static class687[] field4854;

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lpe;Lpe;Lpv;)V", line = 3)
    public class379(class615 arg0, class615 arg1, class167 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIIIII)V", line = 12)
    public static final void method2165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4848;
        if (arg0 != 10) {
            field4852 = null;
        }
        if (class152.method1106(115, arg6)) {
            if (class160.field2005[arg6] == null) {
                client.method712(class322.field4179[arg6], -1, arg7, arg5, arg3, arg1, arg2, arg8, arg9, arg4);
            } else {
                client.method712(class160.field2005[arg6], -1, arg7, arg5, arg3, arg1, arg2, arg8, arg9, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lpe;Lpe;ZLuga;Lpe;)Z", line = 35)
    public static final boolean method2166(class615 arg0, class615 arg1, boolean arg2, class552 arg3, class615 arg4) {
        ++field4853;
        class359.field4658 = arg3;
        class558.field7282 = arg0;
        class680.field9380 = arg1;
        class101.field1354 = arg4;
        return arg2;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V", line = 53)
    public static void method2167(byte arg0) {
        field4854 = null;
        field4851 = null;
        field4852 = null;
        if (arg0 != -53) {
            field4852 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V", line = 70)
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4850;
        int var6 = super.field9010.method602();
        int var7 = 31 / ((arg0 - 68) / 32);
        int var8 = ((class167) super.field6043).field2091 * class499.method2702(true) / 10 % var6;
        super.field9010.method2756(arg1 - -var8 + -var6, arg3, arg4 + var6 - var8, arg2);
    }
}
