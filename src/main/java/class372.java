import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class372 implements class354 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "[F")
    public float[] field5358;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "S")
    public static short field5360 = 1;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Z")
    public static boolean field5368;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[Lsf;")
    public static class547[] field5364;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2305(int arg0) {
        class596.field8414 = 0;
        class37.field556 = arg0;
        field5362++;
        for (int var1 = 0; var1 < class526.field7491; var1++) {
            int var2 = class606.field8522 * var1;
            for (int var3 = 0; var3 < class606.field8522; var3++) {
                int var4 = var2 + var3;
                class519.field7409[var4].method3617(class692.field9768 * var3, class637.field8968 * var1, class692.field9768, class637.field8968, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 35)
    public static final String method2306(int arg0, boolean arg1, int arg2, int arg3) {
        field5363++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (!arg1 || arg2 < 0) {
            return Integer.toString(arg2, arg3);
        } else if (arg0 == -10722) {
            int var4 = 2;
            for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)Z", line = 84)
    public static final boolean method2307(byte arg0) {
        field5361++;
        if (class757.field10456 < 1) {
            return false;
        } else {
            if (arg0 != 45) {
                method2305(-66);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZIIIIIIIIIII)V", line = 99)
    public static final void method2308(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (!arg0) {
            method2307((byte) -69);
        }
        field5365++;
        if (!class420.method2512((byte) 43, arg6)) {
            return;
        }
        if (class222.field3192[arg6] == null) {
            client.method2047(class110.field1382[arg6], -1, arg3, arg4, arg9, arg1, arg7, arg5, arg8, arg10, arg2, arg11);
        } else {
            client.method2047(class222.field3192[arg6], -1, arg3, arg4, arg9, arg1, arg7, arg5, arg8, arg10, arg2, arg11);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Z", line = 120)
    public static final boolean method2309(int arg0, int arg1) {
        if (arg0 != 30615) {
            method2305(48);
        }
        field5359++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V", line = 133)
    public static void method2310(int arg0) {
        field5364 = null;
        if (arg0 <= 125) {
            method2308(false, 92, -40, -108, -68, 32, -48, -99, 87, -56, -86, -4);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V", line = 145)
    public class372(int arg0, int arg1) {
        this.field5358 = new float[arg0 * arg1];
        this.field5367 = arg1;
        this.field5366 = arg0;
    }
}
