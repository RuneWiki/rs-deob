import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class73 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
    public static int[] field1054 = new int[14];

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    public static int[] field1059 = new int[5];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIII)V")
    public static final void method498(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            method499(-79);
        }
        field1053++;
        class38 var4 = class231.field3256[arg2][arg1];
        class180.method1180(var4 == null ? class335.field4590 : var4, arg3, -16304);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method499(int arg0) {
        if (arg0 == 30976) {
            field1059 = null;
            field1054 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
    public static final int method500(int arg0, int arg1, int arg2) {
        field1060++;
        int var3 = class485.method2847(arg1 - 1, (byte) 106, arg2 - 1) + class485.method2847(arg1 - 1, (byte) 113, arg2 + 1) - (-class485.method2847(arg1 + 1, (byte) 126, arg2 + -1) + -class485.method2847(arg1 + 1, (byte) 113, arg2 + 1));
        int var4 = class485.method2847(arg1, (byte) 123, arg2 - 1) - (-class485.method2847(arg1, (byte) 118, arg2 + 1) - (class485.method2847(arg1 - 1, (byte) 112, arg2) + class485.method2847(arg1 + 1, (byte) 125, arg2)));
        if (arg0 >= -98) {
            return 74;
        } else {
            int var5 = class485.method2847(arg1, (byte) 111, arg2);
            return var3 / 16 + var5 / 4 + (var4 / 8);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/String;I[SZI)V")
    public static final void method501(String[] arg0, int arg1, short[] arg2, boolean arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method501(arg0, arg1, arg2, arg3, var6 - 1);
            method501(arg0, var6 + 1, arg2, arg3, arg4);
        }
        field1056++;
        if (arg3) {
            field1058 = -63;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([[BLuq;B)V")
    public static final void method502(byte[][] arg0, class115 arg1, byte arg2) {
        if (arg2 < 54) {
            return;
        }
        field1057++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class425 var11 = new class425(var10);
                int var12 = class490.field6908[var5] >> 8;
                int var13 = class490.field6908[var5] & 0xFF;
                int var14 = var12 * 64 - class153.field2204;
                int var15 = var13 * 64 - class325.field4472;
                class172.method1155(15547);
                arg1.method166(var15, (byte) 62, class153.field2204, var11, class308.field4209, class325.field4472, var14);
                arg1.method726(class338.field4636, -10076, var3, var14, var15, var11);
                if (!arg1.field352 && (class182.field2643 / 8) == var12 && class275.field3810 / 8 == var13) {
                    if (var3[0] == -1) {
                        class444.field6124 = null;
                    } else {
                        class444.field6124 = class487.field6864.method2535(class191.field2725, var3[0], var3[1], var3[2], (byte) 9, var3[3]);
                        class78.field1182 = var3[4];
                    }
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class490.field6908[var6] >> 8) * 64 - class153.field2204;
            int var8 = (class490.field6908[var6] & 0xFF) * 64 - class325.field4472;
            byte[] var9 = arg0[var6];
            if (var9 == null && class275.field3810 < 800) {
                class172.method1155(15547);
                arg1.method175(var7, var8, (byte) -108, 64, 64);
            }
        }
    }
}
