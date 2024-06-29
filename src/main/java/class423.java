import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class423 {

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "Lel;")
    public class510 field6120;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "S")
    public short field6122;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "B")
    public byte field6119;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "B")
    public byte field6114;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6117 = 0;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "Lqfa;")
    public static class85 field6121 = new class85(46, 0);

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static final void method2576(byte arg0) {
        field6116++;
        class601.method3433(0);
        class126.field2299.field1393 = 0;
        class635.field9123 = null;
        class25.field911 = null;
        class547.field7769 = null;
        class445.field6405 = 0;
        class158.field2698 = null;
        class482.field6915 = 0;
        class478.field6872 = 0;
        class295.method1964(arg0 - 72);
        class590.method3365((byte) -14);
        int var1 = 0;
        if (arg0 != -56) {
            method2576((byte) -109);
        }
        while (var1 < 2048) {
            class59.field1341[var1] = null;
            var1++;
        }
        class532.field7456 = null;
        for (int var2 = 0; var2 < class39.field1062; var2++) {
            class22 var4 = class459.field6542[var2].field6298;
            if (var4 != null) {
                var4.field8770 = -1;
            }
        }
        class24.method475(0);
        field6123 = 1;
        class488.field6995 = -1;
        class266.field3950 = -1;
        class118.method1038(10, arg0 ^ 0xFFFFFFC9);
        for (int var3 = 0; var3 < 100; var3++) {
            class248.field3731[var3] = true;
        }
        class37.method546(arg0 + 12711);
        class385.field5659 = null;
        class674.field9595 = 0L;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Lps;")
    public static final class82 method2577(int arg0, int arg1, int arg2) {
        class370 var3 = class257.field3792[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class82 var4 = var3.field5495;
            var3.field5495 = null;
            class104.method965(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z[[BLdw;)V")
    public static final void method2578(boolean arg0, byte[][] arg1, class669 arg2) {
        field6115++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        if (arg0) {
            field6123 = -47;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class61 var11 = new class61(var10);
                int var12 = class335.field5019[var5] >> 8;
                int var13 = class335.field5019[var5] & 0xFF;
                int var14 = var12 * 64 - class33.field967;
                int var15 = var13 * 64 - class323.field4749;
                class418.method2539(false);
                arg2.method1073(112, var11, var14, class33.field967, class223.field3352, class323.field4749, var15);
                arg2.method3779(var11, var15, var14, true, class623.field9017, var3);
                if (!arg2.field2265 && (class287.field4278 / 8) == var12 && class32.field961 / 8 == var13 && var3[0] != -1) {
                    class2.field378 = class475.field6813.method1516(var3[3], var3[2], var3[1], 115, var3[0], class92.field1672);
                    class124.field2246 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class335.field5019[var6] >> 8) * 64 - class33.field967;
            int var8 = (class335.field5019[var6] & 0xFF) * 64 - class323.field4749;
            byte[] var9 = arg1[var6];
            if (var9 == null && class32.field961 < 800) {
                class418.method2539(false);
                arg2.method1075(64, -114, var7, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([[[BIIIIIIIIILr;II)V")
    public static final void method2579(byte[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class167 arg10, int arg11, int arg12) {
        field6118++;
        if (arg8 == 0 || arg12 == 0) {
            return;
        }
        if (arg8 == 9) {
            arg5 = arg5 + 1 & 0x3;
            arg8 = 1;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg5 = arg5 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg8 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        arg10.method76(arg2, arg1, arg4, arg3, arg6, arg7, arg0[arg8 - 1][arg5], arg12, arg9);
        if (arg11 != 980) {
            method2576((byte) -103);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
    public static void method2580(int arg0) {
        if (arg0 < 16) {
            method2578(true, null, null);
        }
        field6121 = null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lel;III)V")
    public class423(class510 arg0, int arg1, int arg2, int arg3) {
        this.field6120 = arg0;
        this.field6122 = (short) arg1;
        this.field6119 = (byte) arg3;
        this.field6114 = (byte) arg2;
    }
}
