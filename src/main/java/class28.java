import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class28 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lte;")
    public static class244 field396 = new class244(64);

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[B")
    public static byte[] field401;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    public static int[] field402;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lwb;")
    public static class123 field403;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Leh;")
    public static class137 field397;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ltd;")
    public static class175 field400;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method163(int arg0) {
        field396 = null;
        field402 = null;
        if (arg0 != -12106) {
            method165(-101, -86, 46, -65, 71, (class264) null, -28, 85L, false);
        }
        field401 = null;
        field397 = null;
        field403 = null;
        field400 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Leh;ILeh;Z)V")
    public static final void method164(class137 arg0, int arg1, class137 arg2, boolean arg3) {
        field399++;
        class137.field2200 = arg2;
        class263.field4251 = arg3;
        class40.field498 = arg0;
        if (arg1 != -9118) {
            method164((class137) null, 111, (class137) null, false);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIILpb;IJZ)Z")
    public static final boolean method165(int arg0, int arg1, int arg2, int arg3, int arg4, class264 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class255.method1746(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static final void method166(int arg0) {
        field398++;
        class138.field2215.method1701((byte) 72);
        class17.field201.method1701((byte) 120);
        if (arg0 != -7531) {
            field402 = null;
        }
    }

    static {
        int var0 = 0;
        field401 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field401[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field402 = new int[5];
        field403 = null;
    }
}
