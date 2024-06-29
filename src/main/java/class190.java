import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class190 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Ldf;")
    private static class51 field3180 = class46.method233("Members object", 100);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Z")
    public static boolean field3182 = true;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Ldf;")
    public static class51 field3187 = field3180;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lcg;")
    public static class156 field3178;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field3187 = null;
        field3178 = null;
        field3180 = null;
        if (arg0 != 17514) {
            method1363((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILu;)Lpc;")
    public static final class21 method1359(int arg0, int arg1, class111 arg2) {
        if (arg0 == 205) {
            field3186++;
            byte[] var3 = arg2.method832(arg1, 4625);
            return var3 == null ? null : new class21(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public static final void method1361(int arg0) {
        if (class37.field571 != null) {
            class37.field571.method1211(3);
        }
        if (class198.field3300 != null) {
            class198.field3300.method1211(arg0 - 202);
        }
        field3185++;
        if (arg0 != 205) {
            method1362((class213) null, 54);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwc;I)Z")
    public static final boolean method1362(class213 arg0, int arg1) {
        field3181++;
        if (arg0.field3640 == 205) {
            class78.field1252 = 250;
            return true;
        } else {
            int var2 = -57 % ((-arg1 - 22) / 59);
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lag;")
    public static final class174 method1363(byte arg0) {
        field3179++;
        if (arg0 < 80) {
            field3182 = false;
        }
        try {
            return (class174) Class.forName("pa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Llb;I)Lha;")
    public static final class30 method1364(class121 arg0, int arg1) {
        int var2 = -117 / ((arg1 + 16) / 43);
        field3184++;
        return new class30(arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method884(14513), arg0.method891((byte) -125), arg0.method897(114));
    }
}
