import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class90 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "J")
    public static long field936 = 20000000L;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Ljl;")
    public static class270 field939 = new class270(64);

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Lefa;")
    public static class183 field937;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 5)
    public static void method615(byte arg0) {
        field937 = null;
        if (arg0 > 0) {
            field936 = -90L;
        }
        field939 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[ILpk;I)V", line = 26)
    public static final void method616(int arg0, int[] arg1, class197 arg2, int arg3) {
        field935++;
        if (arg2.field7152 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field7152.length; var5++) {
                if (arg2.field7152[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field7145 != -1) {
                class25 var6 = class637.field9158.method1905(118, arg2.field7145);
                int var7 = var6.field250;
                if (var7 == 1) {
                    arg2.field7074 = 1;
                    arg2.field7132 = arg3;
                    arg2.field7161 = 0;
                    arg2.field7089 = 0;
                    arg2.field7115 = 0;
                    if (!arg2.field7108) {
                        class629.method3607(arg2, var6, -115, arg2.field7089);
                    }
                }
                if (var7 == 2) {
                    arg2.field7161 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field7152 == null || arg2.field7152[var9] == -1 || class637.field9158.method1905(91, arg1[var9]).field272 >= class637.field9158.method1905(121, arg2.field7152[var9]).field272) {
                arg2.field7152 = arg1;
                arg2.field7188 = arg2.field7184;
                arg2.field7132 = arg3;
            }
        }
        if (var8) {
            arg2.field7152 = arg1;
            arg2.field7188 = arg2.field7184;
            arg2.field7132 = arg3;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)I", line = 113)
    public static final int method617(int arg0, int arg1, int arg2) {
        if (arg0 < 80) {
            return 5;
        } else {
            field938++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg2 - var3;
        }
    }
}
