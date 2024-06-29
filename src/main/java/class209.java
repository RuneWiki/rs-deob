import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class209 extends InputStream {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2816 = " from your friend list first.";

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
    public static int[] field2818 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ltc;")
    public static class196 field2814 = new class196();

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ljs;")
    public static class181 field2821;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lek;III[Z)V", line = 3)
    public static final void method1358(class294 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class435.field6248 == class249.field3456) {
            return;
        }
        int var5 = class156.field2213[arg1].method278(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class156 var7 = class156.field2213[var6];
                if (var7 != null) {
                    var7.method273(arg0, arg2, var5 - var7.method278(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 29)
    public static void method1359(int arg0) {
        field2814 = null;
        field2816 = null;
        field2821 = null;
        int var1 = 32 / ((arg0 - 40) / 41);
        field2818 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lrg;BIILlf;IILtm;)V", line = 45)
    public static final void method1360(class383 arg0, byte arg1, int arg2, int arg3, class130 arg4, int arg5, int arg6, class220 arg7) {
        field2822++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class123.field1731 == 4) {
            var8 = (int) class6.field98 & 0x3FFF;
        } else {
            var8 = (int) class6.field98 + class390.field5737 & 0x3FFF;
        }
        if (arg1 >= -13) {
            field2816 = null;
        }
        int var9 = Math.max(arg0.field5431 / 2, arg0.field5491 / 2) + 10;
        int var10 = arg2 * arg2 + arg3 * arg3;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class362.field5083[var8];
        int var12 = class362.field5082[var8];
        if (class123.field1731 != 4) {
            var12 = var12 * 256 / (class23.field312 + 256);
            var11 = var11 * 256 / (class23.field312 + 256);
        }
        int var13 = arg2 * var12 + arg3 * var11 >> 15;
        int var14 = arg3 * var12 - (arg2 * var11) >> 15;
        arg4.method805(arg5 - (arg4.method874() / 2 - (arg0.field5431 / 2) - var13), arg0.field5491 / 2 + arg6 - (var14 + arg4.method877() / 2), arg7, arg5, arg6);
    }

    @OriginalMember(owner = "client!he", name = "read", descriptor = "()I", line = 92)
    public final int read() {
        field2820++;
        class4.method28(30000L, -111);
        return -1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V", line = 109)
    public static final void method1361(int arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        field2817++;
        if (arg3 <= 12) {
            method1359(-83);
        }
        if (arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        Object var8 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (((var9 & 0x1) + var7) > arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                Object var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var8;
        method1361(arg0, var6 - 1, arg2, 47, arg4);
        method1361(var6 + 1, arg1, arg2, 52, arg4);
    }
}
