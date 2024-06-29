import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class116 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2170 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lkb;")
    public static class93 field2171 = class76.method390("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lkb;")
    public static class93 field2173 = class76.method390("Lade Konfiguration )2 ", 0);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lkb;")
    public static class93 field2172 = class76.method390("Welt", 0);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lkb;")
    public static class93 field2177 = class76.method390("W-=hlen Sie eine Welt", 0);

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lkb;")
    public static class93 field2179 = class76.method390("Anmelde)2Limit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Lhb;")
    public static class67 field2178;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[Lob;")
    public static class129[] field2175;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZLjg;ILjg;)Lef;")
    public static final class45 method642(int arg0, boolean arg1, class89 arg2, int arg3, class89 arg4) {
        field2176++;
        if (arg1) {
            return class139.method873(arg0, arg2, (byte) -59, arg3) ? class204.method1328(arg4.method461(arg3, (byte) 105, arg0), (byte) 119) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static void method643(boolean arg0) {
        field2171 = null;
        field2173 = null;
        field2172 = null;
        field2179 = null;
        if (!arg0) {
            field2177 = null;
            field2175 = null;
            field2178 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method644(int arg0) {
        class194 var1 = class203.field3915;
        synchronized (class203.field3915) {
            class111.field2003 = class182.field3594;
            if (class161.field3227 >= 0) {
                while (class18.field301 != class161.field3227) {
                    int var3 = class169.field3366[class18.field301];
                    class18.field301 = class18.field301 + 1 & 0x7F;
                    if (var3 < 0) {
                        class112.field2083[~var3] = false;
                    } else {
                        class112.field2083[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class112.field2083[var2] = false;
                }
                class161.field3227 = class18.field301;
            }
            if (arg0 >= -113) {
                return;
            }
            class182.field3594 = class205.field3976;
        }
        field2174++;
    }
}
