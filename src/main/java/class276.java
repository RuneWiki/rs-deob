import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class276 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lsf;")
    private static class108 field4826 = class140.method973(255, "Loaded wordpack");

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lsf;")
    public static class108 field4829 = field4826;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lsf;")
    public static class108 field4830 = class140.method973(255, "Card:");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    public static int[] field4831 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILqj;)V", line = 7)
    public static final void method1989(int arg0, class256 arg1) {
        int var2 = arg1.field4519 - class116.field2000;
        field4827++;
        int var3 = arg1.field4507 * 128 + (arg1.method363((byte) 97) * arg0);
        int var4 = arg1.field4485 * 128 + (arg1.method363((byte) -67) * 64);
        arg1.field4457 += (var4 - arg1.field4457) / var2;
        arg1.field4515 = 0;
        arg1.field4452 += (var3 - arg1.field4452) / var2;
        if (arg1.field4478 == 0) {
            arg1.field4486 = 1024;
        }
        if (arg1.field4478 == 1) {
            arg1.field4486 = 1536;
        }
        if (arg1.field4478 == 2) {
            arg1.field4486 = 0;
        }
        if (arg1.field4478 == 3) {
            arg1.field4486 = 512;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 41)
    public static void method1990(byte arg0) {
        field4829 = null;
        field4826 = null;
        if (arg0 <= 13) {
            field4830 = (class108) null;
        }
        field4831 = null;
        field4830 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIILma;Lma;IIIIJ)V", line = 55)
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, class290 arg4, class290 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class36 var12 = new class36();
        var12.field502 = arg10;
        var12.field496 = arg1 * 128 + 64;
        var12.field501 = arg2 * 128 + 64;
        var12.field498 = arg3;
        var12.field513 = arg4;
        var12.field510 = arg5;
        var12.field495 = arg6;
        var12.field503 = arg7;
        var12.field497 = arg8;
        var12.field507 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class99.field1759[var13][arg1][arg2] == null) {
                class99.field1759[var13][arg1][arg2] = new class74(var13, arg1, arg2);
            }
        }
        class99.field1759[arg0][arg1][arg2].field1140 = var12;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BD)V", line = 92)
    public static final void method1992(byte arg0, double arg1) {
        if (class281.field4929 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class81.field1272[var3] = var4 > 255 ? 255 : var4;
            }
            class281.field4929 = arg1;
        }
        field4828++;
        int var5 = -18 % ((66 - arg0) / 39);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B[BI[Loj;IZ)V", line = 122)
    public static final void method1993(byte arg0, byte[] arg1, int arg2, class328[] arg3, int arg4, boolean arg5) {
        field4832++;
        int var6 = 103 / ((53 - arg0) / 42);
        int var7 = -1;
        class249 var8 = new class249(arg1);
        while (true) {
            int var9 = var8.method1710((byte) -124);
            if (var9 == 0) {
                return;
            }
            var7 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var8.method1739((byte) -100);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var8.method1731(true);
                int var16 = var15 >> 2;
                int var17 = arg2 + var13;
                int var18 = arg4 + var12;
                int var19 = var15 & 0x3;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class328 var20 = null;
                    if (!arg5) {
                        int var21 = var14;
                        if ((class166.field2980[1][var17][var18] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class312.method2173(var7, var19, var20, var14, var14, var18, arg5, !arg5, var16, 0, var17);
                }
            }
        }
    }
}
