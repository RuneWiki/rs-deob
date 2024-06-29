import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class161 extends class223 {

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public int field2269;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Ll;")
    public static class16 field2260;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Lfs;")
    public static class387 field2270;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field2277;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1136(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILya;I)Lt;", line = 23)
    public final class471 method1134(int arg0, class38 arg1, int arg2) {
        field2273++;
        int var4 = class185.field2596[this.field2266];
        if (var4 == 0) {
            class235 var11 = class344.method2079(this.field2267, this.field2259, this.field2264);
            if (var11 instanceof class220) {
                class220 var12 = (class220) var11;
                if (var12.field3163 != null) {
                    return ((class529) var12.field3163).method24(arg1, arg2, 113);
                }
            }
        } else if (var4 == 1) {
            class386 var9 = class510.method3040(this.field2267, this.field2259, this.field2264);
            if (var9 instanceof class209) {
                class209 var10 = (class209) var9;
                if (var10.field3024 != null) {
                    return ((class529) var10.field3024).method24(arg1, arg2, 123);
                }
            }
        } else if (var4 == 2) {
            class431 var5 = class262.method1683(this.field2267, this.field2259, this.field2264, field2277 == null ? (field2277 = method1136("f")) : field2277);
            if (var5 instanceof class450) {
                class450 var6 = (class450) var5;
                if (var6.field6628 != null) {
                    return ((class529) var6.field6628).method24(arg1, arg2, 115);
                }
            }
        } else if (var4 == 3) {
            class363 var7 = class282.method1802(this.field2267, this.field2259, this.field2264);
            if (var7 instanceof class70) {
                class70 var8 = (class70) var7;
                if (var8.field895 != null) {
                    return ((class529) var8.field895).method24(arg1, arg2, -118);
                }
            }
        }
        return arg0 == 1 ? null : null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 105)
    public static void method1135(int arg0) {
        field2260 = null;
        int var1 = 119 / ((-arg0 - 70) / 53);
        field2270 = null;
    }
}
