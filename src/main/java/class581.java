import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class581 extends class402 {

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field8223 = 0;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "Lmu;")
    public static class215 field8222;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "[B")
    private byte[] field8221;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILcd;I)V", line = 8)
    public static final void method3352(boolean arg0, int arg1, class22 arg2, int arg3) {
        class121.field1865[arg1][arg3] = arg2;
        if (arg0) {
            method3352(true, -67, null, 122);
        }
        field8217++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZB)V", line = 20)
    public final void method2228(int arg0, boolean arg1, byte arg2) {
        field8220++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        if (arg1) {
            field8223 = 61;
        }
        this.field8221[var4++] = -1;
        this.field8221[var4] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V", line = 36)
    public static final void method3353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8219++;
        if (arg0 <= 55) {
            method3352(false, 41, null, 8);
        }
        int var7 = arg3 + arg6;
        int var8 = arg1 - arg6;
        for (int var9 = arg3; var9 < var7; var9++) {
            class608.method3484(class77.field1131[var9], arg5, -7, arg4, arg2);
        }
        for (int var10 = arg1; var10 > var8; var10--) {
            class608.method3484(class77.field1131[var10], arg5, -7, arg4, arg2);
        }
        int var11 = arg5 + arg6;
        int var12 = arg2 - arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class77.field1131[var13];
            class608.method3484(var14, arg5, -7, arg4, var11);
            class608.method3484(var14, var12, -7, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIII)[B", line = 87)
    public final byte[] method3354(boolean arg0, int arg1, int arg2, int arg3) {
        field8218++;
        this.field8221 = new byte[arg2 * arg3 * arg1 * 2];
        this.method470(arg1, arg3, arg0, arg2);
        return this.field8221;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V", line = 98)
    public static void method3355(int arg0) {
        field8222 = null;
        if (arg0 != 852) {
            field8223 = 52;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 108)
    public class581() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
