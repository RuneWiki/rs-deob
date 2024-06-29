import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class149 extends class285 {

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lve;")
    public static class255 field2510 = class87.method607(54, "Stufe:");

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lve;")
    public class255 field2519;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "[Ldm;")
    public static class273[] field2525;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[[B")
    public static byte[][] field2511;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[[[B")
    public static byte[][][] field2514;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)Z", line = 4)
    public final boolean method1101(byte arg0) {
        if (arg0 == -11) {
            field2528++;
            return this.field2518 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILpb;)V", line = 26)
    private final void method1102(int arg0, int arg1, class70 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field2518 = arg2.method481(0);
        } else if (arg0 == 2) {
            this.field2515 = arg2.method469(86);
        } else if (arg0 == 5) {
            this.field2519 = arg2.method479(-1);
        }
        field2521++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lpb;I)V", line = 50)
    public final void method1103(class70 arg0, int arg1) {
        field2517++;
        if (arg1 != -1) {
            this.method1103((class70) null, -3);
        }
        while (true) {
            int var3 = arg0.method481(~arg1);
            if (var3 == 0) {
                return;
            }
            this.method1102(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lrg;B)V", line = 81)
    public static final void method1104(class88 arg0, byte arg1) {
        field2527++;
        if (arg1 == 89) {
            class150.field2552 = arg0.method619(class13.field173, 20053);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIZI)V", line = 94)
    public static final void method1105(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2523++;
        class19.field318 = 0L;
        int var5 = class261.method1820((byte) 91);
        boolean var6 = arg0;
        if (arg4 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (arg4 > 0 == var5 <= 0) {
            var6 = true;
        }
        if (class40.field619.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg3 && arg4 > 0) {
            var6 = true;
        }
        class150.method1115(arg3, arg4, arg1, var6, arg2, 111, var5);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)[Lpc;", line = 124)
    public static final class83[] method1106(int arg0) {
        class83[] var1 = new class83[class109.field1850];
        field2524++;
        for (int var2 = arg0; var2 < class109.field1850; var2++) {
            byte[] var3 = class282.field4849[var2];
            int var4 = class187.field3027[var2] * class132.field2173[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class18.field296[class154.method1134(var3[var6], 255)];
            }
            var1[var2] = new class83(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], var5);
        }
        class111.method850(-3);
        return var1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBZZZ)Lrg;", line = 164)
    public static final class88 method1107(int arg0, byte arg1, boolean arg2, boolean arg3, boolean arg4) {
        field2516++;
        if (arg1 != 113) {
            field2525 = (class273[]) null;
        }
        class131 var5 = null;
        if (class87.field1410 != null) {
            var5 = new class131(arg0, class87.field1410, class300.field5109[arg0], 1000000);
        }
        class187.field3024[arg0] = class268.field4594.method2054(var5, arg0, (byte) -20, class54.field838);
        if (arg4) {
            class187.field3024[arg0].method103(arg1 + 142);
        }
        return new class88(class187.field3024[arg0], arg2, arg3);
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 193)
    public static void method1108(int arg0) {
        field2510 = null;
        int var1 = -126 / ((arg0 + 62) / 43);
        field2511 = (byte[][]) null;
        field2514 = (byte[][][]) null;
        field2525 = null;
    }
}
