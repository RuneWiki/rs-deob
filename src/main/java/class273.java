import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class273 extends class154 {

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lpj;")
    public static class132 field3860;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[Ll;")
    public static class18[] field3857;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIF)V")
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)I")
    public static final int method1664(int arg0, int arg1) {
        return class144.field2144 != null ? class144.field2144[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
    public static void method1665(byte arg0) {
        int var1 = -87 % ((arg0 - -42) / 37);
        field3860 = null;
        field3857 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(FB)V")
    public final void method1082(float arg0, byte arg1) {
        if (arg1 == 87) {
            ++field3858;
            super.field2314 = arg0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
        super.field2318 = arg0;
        if (arg1 != 4671) {
            this.method1078(-93, -86, -49, -111);
        }
        ++field3859;
        super.field2320 = arg2;
        super.field2321 = arg3;
    }
}
