import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class377 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Ldh;")
    public static class321 field5284 = new class321("", 15);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILge;)V")
    public static final void method2302(int arg0, class551 arg1) {
        field5288++;
        if (arg0 != 16353) {
            field5284 = null;
        }
        byte[] var2 = new byte[24];
        if (class254.field3161 != null) {
            try {
                class254.field3161.method3685(arg0 ^ 0x3A51, 0L);
                class254.field3161.method3688(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method3063(var2, 957, 0, 24);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2303(int arg0, String arg1) {
        field5285++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = arg0; var2 < class447.field6284; var2++) {
            if (arg1.equalsIgnoreCase(class395.field5457[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static void method2304(byte arg0) {
        field5284 = null;
        if (arg0 <= 84) {
            field5284 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILaa;)Laa;")
    public abstract class100 method864(int arg0, class100 arg1);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILraa;Lov;IILqa;Lbl;)V")
    public static final void method2305(int arg0, int arg1, class625 arg2, class346 arg3, int arg4, int arg5, class167 arg6, class297 arg7) {
        field5287++;
        if (arg5 != 11079) {
            method2304((byte) 2);
        }
        int var8 = arg2.field9042 - (arg0 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg7.field3867 != 0) {
            arg6.method974(arg7.field3867, arg5 - 11078, -var9 + arg4 - (-(arg1 * arg3.method2166()) - 1), var8, arg0 + 10, var9);
        }
        if (arg7.field3892 != 0) {
            arg6.method919(var8, arg4 + (arg1 * arg3.method2166()) - (var9 + -1), arg0 + 10, (byte) 0, arg7.field3892, var9);
        }
        int var10 = arg7.field3861;
        if (arg2.field9043 && arg7.field3879 != -1) {
            var10 = arg7.field3879;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class148.field1909[var11];
            if (var11 < arg1 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method2164(arg6, var12, arg2.field9042, arg4, var10, true);
            arg4 += arg3.method2166();
        }
    }
}
