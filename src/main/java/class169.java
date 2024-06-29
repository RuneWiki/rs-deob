import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class169 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ltl;")
    public static class59 field2720 = class85.method639("leuchten2:", 9588);

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lgb;")
    public static class212 field2722 = new class212(4);

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field2725 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field2726 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field2727 = new int[256];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILtl;)I", line = 6)
    public static final int method1190(int arg0, class59 arg1) {
        field2723++;
        if (arg0 != 21735) {
            field2727 = (int[]) null;
        }
        return arg1.method495(arg0 ^ 0x54C0) + 1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 66)
    public static final void method1191(Object[] arg0, int arg1, long[] arg2) {
        field2721++;
        if (arg1 != 2) {
            field2725 = 79;
        }
        class193.method1410(arg0, arg2, 6859, arg2.length - 1, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 130)
    public static void method1192(int arg0) {
        field2722 = null;
        if (arg0 != -1) {
            field2726 = (int[]) null;
        }
        field2720 = null;
        field2726 = null;
        field2727 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIBIIII)V", line = 203)
    public static final void method1193(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2724++;
        if (arg5 < 128 || arg4 < 128 || arg5 > 13056 || arg4 > 13056) {
            class13.field181 = -1;
            class292.field4992 = -1;
            return;
        }
        int var8 = class73.method589(class247.field4119, true, arg5, arg4) - arg0;
        int var9 = arg4 - class216.field3528;
        int var10 = arg5 - class226.field3640;
        int var11 = var8 - class185.field3109;
        if (arg3 >= -69) {
            method1194(108, 55, -126);
        }
        int var12 = class298.field5095[class100.field1627];
        int var13 = class298.field5095[class58.field853];
        int var14 = class298.field5094[class100.field1627];
        int var15 = class298.field5094[class58.field853];
        int var16 = var9 * var13 + var10 * var15 >> 16;
        int var17 = var9 * var15 - (var10 * var13) >> 16;
        int var19 = var11 * var14 - (var12 * var17) >> 16;
        int var20 = var11 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class292.field4992 = -1;
            class13.field181 = -1;
        } else if (class55.field815) {
            int var22 = arg6 * 512 >> 8;
            class292.field4992 = var19 * var22 / var20 + arg1;
            int var23 = arg2 * 512 >> 8;
            class13.field181 = var16 * var23 / var20 + arg7;
        } else {
            class292.field4992 = (var19 << 9) / var20 + arg1;
            class13.field181 = (var16 << 9) / var20 + arg7;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Lb;", line = 331)
    public static final class83 method1194(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class83 var4 = var3.field4097;
            var3.field4097 = null;
            return var4;
        }
    }
}
