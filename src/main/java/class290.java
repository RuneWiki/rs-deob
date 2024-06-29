import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class290 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lnf;")
    public static class162 field4508 = new class162(64);

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4512 = "Loading world list data";

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4510 = new String[1000];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Ljh;")
    public static class302 field4513;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Z")
    public static boolean field4514;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILga;)V")
    public static final void method1928(int arg0, class177 arg1) {
        field4507++;
        if (arg1.field2726 != null) {
            arg1.field2726.field600 = 0;
        }
        arg1.field2725 = false;
        if (arg0 != 31833) {
            method1929(42);
        }
        for (class177 var2 = arg1.method160(); var2 != null; var2 = arg1.method152()) {
            method1928(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1929(int arg0) {
        field4508 = null;
        field4512 = null;
        if (arg0 == 63) {
            field4510 = null;
            field4513 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field4509++;
        int var10 = arg5 - arg3;
        int var11 = arg9 - arg1;
        int var12 = (arg0 - arg7 << 16) / var11;
        int var13 = (arg4 - arg2 << 16) / var10;
        class72.method569(var13, arg8, arg5, arg1, 0, 0, arg3, arg9, arg7, arg2, var12, arg6);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1931(int arg0, byte[] arg1, int arg2, int arg3) {
        field4511++;
        class31 var4 = new class31(arg1);
        if (arg3 != -1550013982) {
            method1929(-113);
        }
        int var5 = -1;
        boolean var6 = true;
        label58: while (true) {
            int var7 = var4.method298(78);
            if (var7 == 0) {
                return var6;
            }
            int var8 = 0;
            boolean var9 = false;
            var5 += var7;
            while (true) {
                while (!var9) {
                    int var11 = var4.method276((byte) 33);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = (var8 & 0xFC8) >> 6;
                    int var14 = var4.method265(arg3 + 1550013878) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class295 var17 = class166.method1209(119, var5);
                        if (var14 != 22 || class292.field4536 || var17.field4588 != 0 || var17.field4621 == 1 || var17.field4580) {
                            var9 = true;
                            if (!var17.method1951((byte) 76)) {
                                var6 = false;
                                class3.field54++;
                            }
                        }
                    }
                }
                int var10 = var4.method276((byte) 42);
                if (var10 == 0) {
                    break;
                }
                var4.method265(-84);
            }
        }
    }
}
