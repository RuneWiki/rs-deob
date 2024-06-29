import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class492 extends class665 {

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[J")
    public static long[] field7001 = new long[32];

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    public static int[] field7000 = new int[3];

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lnea;")
    public static class664 field7003 = new class664(81, 3);

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method2853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7005++;
        int var7 = arg1 - arg5;
        if (arg0 != 4) {
            return;
        }
        int var8 = arg4 + arg5;
        for (int var9 = arg4; var9 < var8; var9++) {
            class58.method623(arg2, arg6, 23309, class651.field9125[var9], arg3);
        }
        int var10 = arg6 - arg5;
        for (int var11 = arg1; var11 > var7; var11--) {
            class58.method623(arg2, arg6, 23309, class651.field9125[var11], arg3);
        }
        int var12 = arg3 + arg5;
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class651.field9125[var13];
            class58.method623(arg2, var12, 23309, var14, arg3);
            class58.method623(arg2, arg6, 23309, var14, var10);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 55)
    public static void method2854(int arg0) {
        if (arg0 > 67) {
            field7003 = null;
            field7000 = null;
            field7001 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 70)
    public static final void method2855(int arg0) {
        field7004++;
        if (arg0 != 3) {
            return;
        }
        class184.method1233();
        for (int var1 = 0; var1 < 4; var1++) {
            class423.field6155[var1].method3749(false);
        }
        class575.method3262(-1);
        class242.method1643(-19585);
        System.gc();
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)Ldw;", line = 91)
    public static final class668 method2856(boolean arg0) {
        if (arg0) {
            field7003 = null;
        }
        field7002++;
        try {
            return (class668) Class.forName("oca").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
