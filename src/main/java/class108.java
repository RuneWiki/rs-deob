import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class141 {

    @OriginalMember(owner = "client!pd", name = "Bc", descriptor = "I")
    public static int field2259 = 50;

    @OriginalMember(owner = "client!pd", name = "Cc", descriptor = "Lpe;")
    public static class109 field2260 = class141.method1120("0(U", 0);

    @OriginalMember(owner = "client!pd", name = "Gc", descriptor = "Lpe;")
    public static class109 field2264 = class141.method1120("b12_full", 0);

    @OriginalMember(owner = "client!pd", name = "Ec", descriptor = "Lpe;")
    public static class109 field2262 = class141.method1120("scrollen:", 0);

    @OriginalMember(owner = "client!pd", name = "Jc", descriptor = "Lpe;")
    public static class109 field2267 = class141.method1120("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 0);

    @OriginalMember(owner = "client!pd", name = "zc", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!pd", name = "Ac", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!pd", name = "Dc", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!pd", name = "Ic", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!pd", name = "Kc", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!pd", name = "Hc", descriptor = "Lqb;")
    public class113 field2265;

    @OriginalMember(owner = "client!pd", name = "Fc", descriptor = "Lna;")
    public static class91 field2263;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Z")
    public final boolean method426(boolean arg0) {
        ++field2266;
        if (arg0) {
            return true;
        } else {
            return this.field2265 != null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)V")
    public static void method868(byte arg0) {
        if (arg0 > -118) {
            field2261 = -118;
        }
        field2264 = null;
        field2267 = null;
        field2260 = null;
        field2262 = null;
        field2263 = null;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static final void method869(int arg0) {
        if (arg0 != 10494) {
            method868((byte) -39);
        }
        if (class63.field1288 != null) {
            class62 var1 = class63.field1288;
            synchronized (class63.field1288) {
                class63.field1288 = null;
            }
        }
        ++field2257;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Lwb;")
    public final class155 method16(int arg0) {
        ++field2258;
        if (this.field2265 == null) {
            return null;
        } else {
            class6 var2 = ~super.field3124 != 0 && super.field3081 == 0 ? class27.method238(8, super.field3124) : null;
            class6 var3 = super.field3060 == -1 || ~super.field3113 == ~super.field3060 && var2 != null ? null : class27.method238(8, super.field3060);
            class155 var4 = this.field2265.method935(super.field3067, var2, (byte) 6, var3, super.field3122);
            if (var4 == null) {
                return null;
            } else if (arg0 != 9698) {
                return null;
            } else {
                var4.method1208();
                super.field3087 = var4.field1780;
                if (super.field3128 != -1 && super.field3065 != -1) {
                    class155 var5 = class85.method716((byte) 79, super.field3128).method712(super.field3065, 108);
                    if (var5 != null) {
                        var5.method1200(0, -super.field3062, 0);
                        class155[] var6 = new class155[] { var4, var5 };
                        var4 = new class155(var6, 2);
                    }
                }
                if (~this.field2265.field2490 == -2) {
                    var4.field3523 = true;
                }
                return var4;
            }
        }
    }
}
