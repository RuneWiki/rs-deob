import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class214 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[Lok;")
    public static class146[] field3525 = new class146[500];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3529 = 0;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lok;")
    public static class146 field3539 = class235.method1724(-12908, " s(West connect-B)3");

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3535 = -1;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lok;")
    public static class146 field3538 = class235.method1724(-12908, "Continuer");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[I")
    public static int[] field3533 = new int[1000];

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "J")
    public static long field3541 = 0L;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lok;")
    private static class146 field3536 = class235.method1724(-12908, "slide:");

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lok;")
    public static class146 field3527 = field3536;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lok;")
    public static class146 field3540 = field3536;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lqc;")
    public static class4 field3531;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[B")
    public static byte[] field3537;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 21)
    public static void method1594(int arg0) {
        field3539 = null;
        field3531 = null;
        field3533 = null;
        field3525 = null;
        field3537 = null;
        field3540 = null;
        field3527 = null;
        field3536 = null;
        field3538 = null;
        if (arg0 != -1643851351) {
            method1597(78, -53, -89, 90, -34, 27, 110, -32);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 222)
    public static final Class method1595(String arg0, int arg1) throws ClassNotFoundException {
        field3530++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg1 != -31652) {
            return (Class) null;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIB[Ljava/lang/Object;)V", line = 267)
    public static final void method1596(int[] arg0, int arg1, int arg2, byte arg3, Object[] arg4) {
        if (arg3 <= 18) {
            method1596((int[]) null, 63, 18, (byte) -34, (Object[]) null);
        }
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg0[var5];
            int var7 = arg2;
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var6;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if ((var9 & 0x1) + var6 > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg0[arg1] = arg0[var7];
            arg0[var7] = var6;
            arg4[arg1] = arg4[var7];
            arg4[var7] = var8;
            method1596(arg0, var7 - 1, arg2, (byte) 78, arg4);
            method1596(arg0, arg1, var7 + 1, (byte) 68, arg4);
        }
        field3532++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V", line = 343)
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3528++;
        if (arg5 < 128 || arg0 < 128 || arg5 > 13056 || arg0 > 13056) {
            class303.field5207 = -1;
            class51.field920 = -1;
            return;
        }
        int var8 = class19.method141(arg5, class203.field3387, arg0, 125) - arg7;
        int var9 = class109.field1750[class63.field1088];
        int var10 = arg5 - class107.field1742;
        int var11 = arg0 - class161.field2719;
        int var12 = class109.field1757[class63.field1088];
        int var13 = var8 - class151.field2572;
        int var14 = class109.field1750[class79.field1269];
        int var15 = class109.field1757[class79.field1269];
        if (arg2 != -304494096) {
            return;
        }
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        int var19 = var12 * var13 - (var9 * var17) >> 16;
        int var20 = var9 * var13 + (var12 * var17) >> 16;
        if (var20 < 50) {
            class303.field5207 = -1;
            class51.field920 = -1;
        } else if (class271.field4640) {
            int var22 = arg1 * 512 >> 8;
            int var23 = arg6 * 512 >> 8;
            class303.field5207 = var19 * var22 / var20 + arg3;
            class51.field920 = var16 * var23 / var20 + arg4;
        } else {
            class51.field920 = arg4 + ((var16 << 9) / var20);
            class303.field5207 = arg3 + ((var19 << 9) / var20);
        }
    }
}
