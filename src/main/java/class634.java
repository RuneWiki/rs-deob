import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class634 {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Ltf;")
    public static class269 field9107 = new class269();

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Ljava/lang/Object;")
    public static volatile Object field9112 = null;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "Ljv;")
    public static class71 field9110 = new class71();

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "[Las;")
    public static class138[] field9114 = new class138[14];

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field9113;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method3613(int arg0) {
        field9114 = null;
        field9110 = null;
        field9113 = null;
        if (arg0 < -43) {
            field9107 = null;
            field9112 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(III)Z")
    public static final boolean method3614(int arg0, int arg1, int arg2) {
        field9108++;
        return arg2 > -79 ? true : ((arg1 & 0x2000) != 0 | class594.method3395(arg0, arg1, false) | class113.method1013(arg0, arg1, (byte) 49)) & class109.method984(arg1, arg0, (byte) -37);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIBI)V")
    public static final void method3615(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field9106++;
        class19 var5 = class373.method2355(126, arg4, 8);
        if (arg3 != -97) {
            method3616(-44, -89, 37, 19, 8);
        }
        var5.method432(arg3 ^ 0xFFFFFFE0);
        var5.field829 = arg1;
        var5.field833 = arg0;
        var5.field827 = arg2;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIII)V")
    public static final void method3616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9109++;
        if (arg3 < arg4) {
            class705.method3938(arg4, arg2, 30336, arg3, class582.field8429[arg0]);
        } else {
            class705.method3938(arg3, arg2, 30336, arg4, class582.field8429[arg0]);
        }
        int var5 = 106 / ((-arg1 - 60) / 54);
    }
}
