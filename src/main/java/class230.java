import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class230 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
    public static boolean field3377 = false;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lcda;")
    public static class172 field3378;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JBIIZ)Ljava/lang/String;")
    public static final String method1543(long arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field3376++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (48 - (((int) arg0 * 10) - var11)));
            }
            var9.append(var6);
        }
        if (arg1 < 89) {
            method1544((byte) -77);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1544(byte arg0) {
        field3375++;
        if (arg0 < 97) {
            method1544((byte) -24);
        }
        class467 var1 = (class467) class264.field3741.method1195(0);
        boolean var2 = class609.field8613 != null || class189.field2871 > 0;
        int var3 = var1.method1794((byte) 124);
        int var4 = var1.method1793((byte) 106);
        if (var2) {
            class457.field6743 = 1;
        }
        if (var2) {
            class760.field10609 = class456.field6722;
        } else {
            class351.method2212(var4, (byte) -18, class456.field6722, var3);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static void method1545(byte arg0) {
        int var1 = 69 / ((arg0 - 8) / 32);
        field3378 = null;
    }
}
