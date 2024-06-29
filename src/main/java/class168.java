import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class168 {

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public int field2264 = 128;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public int field2260 = 128;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2262 = 2;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "[I")
    public static int[] field2265 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "Lof;")
    public static class446 field2266 = new class446("M", "M", "M", "M");

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient;")
    public static client field2261;

    static {
        new class446("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([Ljava/lang/String;Z[S)V", line = 7)
    public static final void method1135(String[] arg0, boolean arg1, short[] arg2) {
        class325.method2056(arg2, arg0, 99, arg0.length - 1, 0);
        field2269++;
        if (arg1) {
            field2262 = 10;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I", line = 20)
    public static final int method1136(int arg0, int arg1, int arg2) {
        field2257++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg1 <= 31 ? -30 : (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lsr;", line = 44)
    public final class168 method1137(int arg0) {
        field2270++;
        if (arg0 <= 73) {
            this.method1138(null, 43);
        }
        return new class168(this.field2267, this.field2260, this.field2264, this.field2263, this.field2268, this.field2259);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lsr;I)V", line = 63)
    public final void method1138(class168 arg0, int arg1) {
        this.field2267 = arg0.field2267;
        this.field2264 = arg0.field2264;
        this.field2263 = arg0.field2263;
        this.field2260 = arg0.field2260;
        field2258++;
        if (arg1 != 32) {
            this.field2260 = 77;
        }
        this.field2259 = arg0.field2259;
        this.field2268 = arg0.field2268;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 86)
    public static void method1139(int arg0) {
        if (arg0 != -1) {
            method1139(125);
        }
        field2261 = null;
        field2265 = null;
        field2266 = null;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V", line = 113)
    public class168(int arg0) {
        this.field2267 = arg0;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIII)V", line = 137)
    private class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2259 = arg5;
        this.field2268 = arg4;
        this.field2260 = arg1;
        this.field2264 = arg2;
        this.field2267 = arg0;
        this.field2263 = arg3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIBI)I", line = 121)
    public static final int method1140(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 67) {
            return 22;
        }
        field2256++;
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg0 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg2) : arg0;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }
}
