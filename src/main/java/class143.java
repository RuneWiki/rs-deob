import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class143 extends class313 {

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field2611 = 4096;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    private int field2616 = 4096;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    private int field2619 = 4096;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[J")
    public static long[] field2608 = new long[1000];

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field2610 = -1;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[Ln;")
    public static class309[] field2614;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V", line = 4)
    public static void method1152(byte arg0) {
        field2614 = null;
        if (arg0 == 84) {
            field2608 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)I", line = 19)
    public static final int method1153(int arg0) {
        int var1 = 113 / ((30 - arg0) / 50);
        field2612++;
        return class295.field4715 && class97.field1572[81] && class293.field4708 > 2 ? class221.field3691[class293.field4708 - 2] : class221.field3691[class293.field4708 - 1];
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 32)
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILpi;)V", line = 36)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            method1156(21, -97, -116);
        }
        if (arg0 == 0) {
            this.field2616 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field2619 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field2611 = arg2.method2339((byte) -46);
        }
        field2613++;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V", line = 82)
    public static final void method1154(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class28.field385 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var7) {
                }
            }
            int var5 = 4 / ((-arg0 - 62) / 42);
        } catch (Exception var8) {
        }
        field2609++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V", line = 116)
    public static final void method1155(int arg0, byte arg1) {
        field2620++;
        if (arg1 >= 34) {
            class30 var2 = class99.method857((byte) 80, arg0, 7);
            var2.method276(0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I", line = 132)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            method1153(-101);
        }
        field2617++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 121);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var12 == var14) {
                    var8[var11] = this.field2616 * var13 >> 12;
                    var10[var11] = this.field2619 * var12 >> 12;
                    var9[var11] = this.field2611 * var14 >> 12;
                } else {
                    var8[var11] = this.field2616;
                    var10[var11] = this.field2619;
                    var9[var11] = this.field2611;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)J", line = 196)
    public static final long method1156(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4150; var4++) {
            class241 var5 = var3.field4147[var4];
            if ((var5.field3936 >> 29 & 0x3L) == 2L && var5.field3932 == arg1 && var5.field3929 == arg2) {
                return var5.field3936;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILqe;)I", line = 230)
    public static final int method1157(int arg0, class205 arg1) {
        int var2 = arg1.field3503;
        field2618++;
        class346 var3 = arg1.method980((byte) 73);
        if (arg0 != 14845) {
            field2614 = (class309[]) null;
        }
        if (arg1.field2000 == var3.field5521) {
            var2 = arg1.field3487;
        } else if (arg1.field2000 == var3.field5503 || arg1.field2000 == var3.field5506 || arg1.field2000 == var3.field5504 || arg1.field2000 == var3.field5499) {
            var2 = arg1.field3496;
        } else if (arg1.field2000 == var3.field5522 || arg1.field2000 == var3.field5527 || arg1.field2000 == var3.field5494 || arg1.field2000 == var3.field5518) {
            var2 = arg1.field3492;
        }
        return var2;
    }
}
