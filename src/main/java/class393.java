import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class393 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5623 = "Drop";

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "Lps;")
    public static class394 field5624 = null;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field5628 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Lwl;")
    public static class273 field5626;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Llm;")
    public static class347 field5629;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Ljava/lang/String;")
    public String field5625;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([II[III)V", line = 18)
    public static final void method2514(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field5630++;
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg1; var9 < arg4; var9++) {
                if (var7 + (var9 & 0x1) > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method2514(arg0, arg1, arg2, -83, var6 - 1);
            method2514(arg0, var6 + 1, arg2, -93, arg4);
        }
        if (arg3 >= -75) {
            field5624 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 80)
    public static final void method2515(int arg0) {
        class185.field2507.method5(-6445, 195);
        int var1 = 100 / ((arg0 - 57) / 42);
        field5631++;
        class394.field5744++;
        class185.field2507.method1346(0, 32767);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 107)
    public static void method2516(byte arg0) {
        field5623 = null;
        field5629 = null;
        field5624 = null;
        field5626 = null;
        if (arg0 != 93) {
            field5628 = 84;
        }
    }
}
