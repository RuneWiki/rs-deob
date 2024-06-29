import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class104 extends class161 {

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[Llc;")
    public static class385[] field1457 = new class385[5];

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1463;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
    public static boolean field1464;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
    public static boolean field1467;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Lgl;")
    public static class356 field1466;

    static {
        for (int var0 = 0; var0 < field1457.length; var0++) {
            field1457[var0] = new class385();
        }
        field1463 = "Prepared sound engine";
        field1464 = false;
        field1467 = false;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V", line = 5)
    public static final void method788(byte arg0) {
        class52 var1 = class410.field6080;
        synchronized (class410.field6080) {
            class410.field6080.method336(arg0 + 42);
        }
        field1456++;
        if (arg0 != 51) {
            field1466 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII)I", line = 19)
    public static final int method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        int var8 = arg3 & arg0;
        field1455++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 1 + 7 - arg1 - arg4;
        } else if (var8 == 2) {
            return 1 + 7 - arg6 - arg2;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIIILne;II)V", line = 48)
    public static final void method790(int arg0, byte arg1, int arg2, int arg3, int arg4, class172 arg5, int arg6, int arg7) {
        field1458++;
        if (arg5.field2707 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg5.field2697; var11++) {
                for (int var12 = 0; var12 < arg5.field2692; var12++) {
                    int var13 = (arg5.field2783 + 32) * var12 + arg4;
                    int var14 = (arg5.field2862 + 32) * var11 + arg7;
                    if (var10 < 20) {
                        var14 += arg5.field2729[var10];
                        var13 += arg5.field2846[var10];
                    }
                    if (arg5.field2858[var10] > 0 && (var13 + 32 > arg0 && arg3 > var13 && arg2 < (var14 + 32) && var14 < arg6 || class129.field2037 == arg5 && class92.field1132 == var10)) {
                        if (var8 > var10) {
                            var8 = var10;
                        }
                        if (var10 > var9) {
                            var9 = var10;
                        }
                    }
                    var10++;
                }
            }
            class117.method855(var8, var9, class284.field4547, arg5, -82);
        } else if (arg5.field2707 == 5 && arg5.field2691 != -1) {
            class358.method2332(class284.field4547, (byte) 10, arg5);
        }
        if (arg1 <= 50) {
            method792(-82, -2);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Le;B)V", line = 120)
    public static final void method791(class312 arg0, byte arg1) {
        field1462++;
        if (class262.field4214) {
            class390.method2462((byte) 49, arg0);
        } else {
            class447.method2789(110, arg0);
        }
        if (arg1 != 124) {
            field1465 = -14;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Z", line = 135)
    public static final boolean method792(int arg0, int arg1) {
        field1460++;
        if (arg0 == 41 || arg0 == 50 || arg0 == 19 || arg0 == 49 || arg0 == 1008) {
            return true;
        } else {
            if (arg1 != 20308) {
                method791((class312) null, (byte) -9);
            }
            return arg0 == 33 || arg0 == 9 || arg0 == 1001;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V", line = 158)
    public static void method793(int arg0) {
        field1463 = null;
        field1466 = null;
        if (arg0 == -4706) {
            field1457 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II)V", line = 171)
    public class104(int arg0, int arg1) {
        this.field1459 = arg1;
        this.field1461 = arg0;
    }
}
