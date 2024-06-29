import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class255 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4226 = 0;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Z")
    public static boolean field4223 = false;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lbd;")
    private static class162 field4229 = class17.method142(0, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Lbd;")
    public static class162 field4224 = field4229;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lbd;")
    public static class162 field4227 = class17.method142(0, "1");

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
    public static int[] field4225;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[I")
    public static int[] field4231;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIBI)V", line = 9)
    public void method1763(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -5) {
            field4232++;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIII)V", line = 20)
    public static final void method1764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4230++;
        if (class12.method104(arg4, 571329488) && arg6 == -1803) {
            client.method857(class95.field1739[arg4], -1, arg5, arg1, arg2, arg0, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lrk;IIIZ)V", line = 51)
    public void method797(class255 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4228++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()Z", line = 77)
    public boolean method824() {
        field4221++;
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Lrk;", line = 91)
    public class255 method831(int arg0, int arg1, int arg2) {
        field4222++;
        return this;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 119)
    public static void method1765(byte arg0) {
        field4229 = null;
        field4227 = null;
        if (arg0 > 69) {
            field4231 = null;
            field4224 = null;
            field4225 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()I")
    public abstract int method46();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
