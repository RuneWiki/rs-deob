import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class203 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[Lui;")
    public static class293[] field3087 = new class293[14];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[I")
    public static int[] field3091 = new int[2000];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "F")
    public static float field3089 = 0.0F;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lhi;")
    public static class323 field3088;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
    public static boolean field3094;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
    public static int[] field3090;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[Z")
    public static boolean[] field3082;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V", line = 6)
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3093++;
        if (arg2 == arg5) {
            class100.method635(true, arg2, arg4, arg0, arg3);
            return;
        }
        if ((arg0 - arg2) >= class337.field5389 && (arg0 + arg2) <= class344.field5460 && class244.field3844 <= (arg4 - arg5) && (arg4 + arg5) <= class2.field22) {
            class277.method1982(7798, arg4, arg2, arg5, arg0, arg3);
        } else {
            class4.method29(arg3, arg2, arg0, (byte) -23, arg4, arg5);
        }
        if (arg1 != -1) {
            method1418(15, (byte[]) null, -38);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BI)I", line = 44)
    public static final int method1418(int arg0, byte[] arg1, int arg2) {
        if (arg0 < 26) {
            field3087 = (class293[]) null;
        }
        field3092++;
        return class139.method955((byte) 58, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I", line = 57)
    public static final int method1419(int arg0, int arg1) {
        int var2 = 127 % ((arg0 - 67) / 55);
        field3084++;
        return (arg1 & 0x3FE79) >> 11;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 70)
    public static void method1420(int arg0) {
        field3087 = null;
        field3088 = null;
        if (arg0 != -1) {
            field3091 = (int[]) null;
        }
        field3082 = null;
        field3090 = null;
        field3091 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 89)
    public static final String method1421(byte[] arg0, int arg1, int arg2, int arg3) {
        field3085++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg3 != -1) {
            method1420(-63);
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class293.field4609[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
