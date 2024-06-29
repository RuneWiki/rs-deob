import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class181 extends class326 {

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    private int field2941 = 0;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    private int field2948 = 1;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    private int field2945 = 0;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Z")
    public static boolean field2938 = false;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field2935 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2940 = "";

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Lrm;")
    public static class184 field2942 = new class184(64);

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "[[B")
    public static byte[][] field2933;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V", line = 11)
    public static final void method1330(int arg0) {
        field2944++;
        if (class216.field3402 != -1) {
            class26.method245(-1, class216.field3402, false, -1);
            class216.field3402 = -1;
        }
        if (arg0 < 64) {
            field2933 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 29)
    public static final void method1331(int arg0, int arg1) {
        int var2 = -83 % ((-arg0 - 1) / 33);
        class9.field169.method1353(-1, arg1);
        field2936++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V", line = 38)
    public static final void method1332(boolean arg0) {
        field2937++;
        if (!arg0) {
            class344.field5345.method1359(63);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbk;IBIII)V", line = 56)
    public static final void method1333(class166 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2932++;
        if (arg0.field2740 == -1 && arg0.field2727 == null) {
            return;
        }
        int var6 = class10.field183 * arg0.field2738 >> 8;
        int var7 = 0;
        if (arg4 > arg0.field2726) {
            var7 += arg4 - arg0.field2726;
        } else if (arg4 < arg0.field2714) {
            var7 += arg0.field2714 - arg4;
        }
        if (arg1 > arg0.field2717) {
            var7 += arg1 - arg0.field2717;
        } else if (arg1 < arg0.field2739) {
            var7 += arg0.field2739 - arg1;
        }
        if (arg0.field2720 == 0 || arg0.field2720 < (var7 - 64) || class10.field183 == 0 || arg0.field2728 != arg3) {
            if (arg0.field2721 != null) {
                class86.field1174.method1313(arg0.field2721);
                arg0.field2721 = null;
            }
            if (arg0.field2729 != null) {
                class86.field1174.method1313(arg0.field2729);
                arg0.field2729 = null;
            }
            return;
        }
        int var8 = -73 / ((-arg2 - 9) / 50);
        var7 -= 64;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = (arg0.field2720 - var7) * var6 / arg0.field2720;
        if (arg0.field2721 != null) {
            arg0.field2721.method154(var9);
        } else if (arg0.field2740 >= 0) {
            class324 var10 = class324.method2279(class18.field301, arg0.field2740, 0);
            if (var10 != null) {
                class266 var11 = var10.method2282().method1898(class120.field1671);
                class17 var12 = class17.method183(var11, 100, var9);
                var12.method185(-1);
                class86.field1174.method1314(var12);
                arg0.field2721 = var12;
            }
        }
        if (arg0.field2729 != null) {
            arg0.field2729.method154(var9);
            if (!arg0.field2729.method2027(3)) {
                arg0.field2729 = null;
            }
        } else if (arg0.field2727 != null && (arg0.field2723 -= arg5) <= 0) {
            int var13 = (int) ((double) arg0.field2727.length * Math.random());
            class324 var14 = class324.method2279(class18.field301, arg0.field2727[var13], 0);
            if (var14 != null) {
                class266 var15 = var14.method2282().method1898(class120.field1671);
                class17 var16 = class17.method183(var15, 100, var9);
                var16.method185(0);
                class86.field1174.method1314(var16);
                arg0.field2729 = var16;
                arg0.field2723 = (int) ((double) (arg0.field2713 - arg0.field2732) * Math.random()) + arg0.field2732;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)V", line = 181)
    public static void method1334(boolean arg0) {
        if (!arg0) {
            field2942 = null;
            field2940 = null;
            field2933 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 198)
    public final int[] method103(int arg0, int arg1) {
        field2946++;
        if (arg0 > -25) {
            method1332(true);
        }
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int var4 = class34.field508[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class166.field2731; var6++) {
                int var7 = class110.field1527[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2941 == 0) {
                    var11 = (var7 - var4) * this.field2948;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2948 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2945 == 0) {
                    var12 = class333.field5184[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2945 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 349)
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLvl;)V", line = 270)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field2941 = arg2.method58(-288140008);
        } else if (arg0 == 1) {
            this.field2945 = arg2.method58(-288140008);
        } else if (arg0 == 3) {
            this.field2948 = arg2.method58(-288140008);
        }
        field2943++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)V", line = 340)
    public static final void method1335(int arg0, byte arg1) {
        field2934++;
        class272.field4215 = 1000 / arg0;
        int var2 = -15 / ((arg1 + 29) / 52);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(B)V", line = 360)
    public final void method99(byte arg0) {
        if (arg0 != 31) {
            this.field2948 = -86;
        }
        class59.method480(true);
        field2947++;
    }
}
