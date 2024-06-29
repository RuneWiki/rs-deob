import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class41 extends class379 {

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    public static int[] field572 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lhj;")
    public static class596 field575 = new class596(96, 7);

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lhj;")
    public static class596 field579 = new class596(46, -2);

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 6)
    public static void method338(byte arg0) {
        if (arg0 > -103) {
            field578 = -18;
        }
        field579 = null;
        field572 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 24)
    public static final void method339(byte arg0) {
        field577++;
        if (arg0 != -11) {
            method339((byte) 30);
        }
        if (!class506.method3034(arg0 ^ 0x1B66)) {
            return;
        }
        if (class75.field1041 == null) {
            class113.method903(11931);
        }
        class761.field10523 = true;
        class491.field6850 = 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIZI)V", line = 46)
    public static final void method340(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field576++;
        long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg1);
        class430 var8 = (class430) class691.field9420.method2121(51, var6);
        if (arg3 != -1) {
            return;
        }
        if (var8 == null) {
            var8 = new class430();
            class691.field9420.method2112(var8, (byte) 6, var6);
        }
        if (var8.field5670.length <= arg5) {
            int[] var9 = new int[arg5 + 1];
            int[] var10 = new int[arg5 + 1];
            for (int var11 = 0; var11 < var8.field5670.length; var11++) {
                var9[var11] = var8.field5670[var11];
                var10[var11] = var8.field5667[var11];
            }
            for (int var12 = var8.field5670.length; var12 < arg5; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field5670 = var9;
            var8.field5667 = var10;
        }
        var8.field5670[arg5] = arg2;
        var8.field5667[arg5] = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 104)
    public static final void method341(int arg0) {
        if (arg0 > -25) {
            method339((byte) -117);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class255.field2977[var1] = true;
        }
        field573++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JZIBI)Ljava/lang/String;", line = 123)
    public static final String method342(long arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field574++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                if (arg3 <= 60) {
                    field575 = null;
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Loga;I)V")
    public abstract void method331(class500 arg0, int arg1);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILes;)V")
    public abstract void method329(int arg0, class403 arg1);
}
