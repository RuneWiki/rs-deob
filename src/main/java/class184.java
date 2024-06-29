import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class184 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lcea;")
    public static class180 field2227 = new class180("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2230 = -1;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "F")
    public static float field2229 = 1.0F;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lvj;")
    public static class373 field2228 = new class373(95, 1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Ldn;")
    public static class438 field2233;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Z")
    public static boolean field2231;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IBIIIII)Lmv;")
    public static final class313 method1007(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2232++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg3 * 986053L ^ (long) arg5 * 97549L ^ (long) arg4 * 67481L ^ (long) arg2 * 475427L ^ (long) arg6 * 32147369L;
        class313 var9 = (class313) class172.field2092.method3682(0, var7);
        if (var9 != null) {
            return var9;
        }
        class313 var10 = class512.field7236.method1136(arg4, arg5, arg2, arg3, arg6, arg0);
        if (arg1 == 17) {
            class172.field2092.method3684(var10, 0, var7);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        field2225++;
        if (arg0 != -26898) {
            method1010((byte) -47);
        }
        for (class416 var1 = (class416) class645.field9394.method1050((byte) 73); var1 != null; var1 = (class416) class645.field9394.method1047(-7962)) {
            if (var1.field5411) {
                var1.method2375(arg0 + 26898);
            }
        }
        for (class416 var2 = (class416) class542.field7916.method1050((byte) 73); var2 != null; var2 = (class416) class542.field7916.method1047(-7962)) {
            if (var2.field5411) {
                var2.method2375(0);
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Los;I)Lvu;")
    public static final class282 method1009(class374 arg0, int arg1) {
        if (arg1 < 93) {
            field2228 = null;
        }
        field2226++;
        return new class282(arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2089(true), arg0.method2128(true), arg0.method2128(true), arg0.method2129(-91));
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        field2233 = null;
        field2227 = null;
        if (arg0 > -80) {
            method1009(null, -27);
        }
        field2228 = null;
    }
}
