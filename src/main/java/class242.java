import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class242 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
    public static int[] field4251 = new int[25];

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lpj;")
    private static class237 field4256 = class33.method353("Please wait)3)3)3", 96);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Lpj;")
    public static class237 field4252 = field4256;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lfa;")
    public static class239 field4254;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method1677(int arg0) {
        field4252 = null;
        field4251 = null;
        field4254 = null;
        field4256 = null;
        if (arg0 <= 65) {
            method1677(-6);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class89.field1637 <= arg3 && arg5 <= class94.field1676 && arg7 >= class13.field215 && arg6 <= class34.field727) {
            class114.method841(-22332, arg6, arg1, arg7, arg0, arg4, arg3, arg5);
        } else {
            class240.method1671(arg0, arg3, -2048, arg6, arg5, arg4, arg7, arg1);
        }
        field4255++;
        if (arg2 >= -78) {
            field4252 = null;
        }
    }
}
