import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class195 extends class508 {

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2532 = null;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "[I")
    public static int[] field2531 = new int[99];

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Lpi;")
    public static class340 field2534;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Leo;")
    public class423 field2516;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Leo;")
    public class423 field2518;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Ljava/lang/String;")
    public String field2533;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Z")
    public boolean field2524;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field2523;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2531[var1] = var0 / 4;
        }
        field2534 = new class340(27, 8);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Llk;IIZLlk;IZ)I", line = 13)
    public static final int method1260(class311 arg0, int arg1, int arg2, boolean arg3, class311 arg4, int arg5, boolean arg6) {
        field2525++;
        int var7 = class228.method1445(false, arg1, arg4, arg0, arg6);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (~arg2 == arg5) {
            return 0;
        } else {
            int var8 = class228.method1445(false, arg2, arg4, arg0, arg3);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lfp;", line = 50)
    public static final class432 method1261(int arg0, int arg1) {
        field2527++;
        if (arg1 != 27) {
            field2532 = null;
        }
        class432 var2 = (class432) class513.field7548.method78((long) arg0, (byte) -127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field3145.method1313((byte) -108, 0, arg0);
        class432 var4 = new class432();
        if (var3 != null) {
            var4.method2554((byte) -84, new class88(var3), arg0);
        }
        class513.field7548.method88((long) arg0, arg1 ^ 0x54, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 81)
    public static void method1262(byte arg0) {
        if (arg0 >= -5) {
            method1260(null, 22, -14, true, null, 73, true);
        }
        field2532 = null;
        field2534 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V", line = 94)
    public static final void method1263(byte arg0) {
        class11 var1 = class65.field826;
        synchronized (class65.field826) {
            class65.field826.method90((byte) -27);
        }
        field2519++;
        if (arg0 <= 55) {
            field2531 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V", line = 111)
    public static final void method1264(int arg0, int arg1, int arg2, int arg3) {
        field2526++;
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg1 != 0) {
            field2531 = null;
        }
        System.out.println(var4);
        class418.method2457(-97, true, var4);
    }
}
