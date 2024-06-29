import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class192 extends class561 {

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "Z")
    public boolean field2504 = true;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
    public static int field2503 = -2;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "Lmr;")
    public static class207 field2492;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "Lbo;")
    public class227 field2486;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "[I")
    private int[] field2490;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "[I")
    public int[] field2505;

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field2495;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "[[I")
    private int[][] field2493;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lge;B)Ljava/lang/String;")
    public final String method1226(class551 arg0, byte arg1) {
        if (arg1 != 12) {
            this.field2504 = true;
        }
        field2491++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2490 != null) {
            for (int var4 = 0; var4 < this.field2490.length; var4++) {
                var3.append(this.field2495[var4]);
                var3.append(this.field2486.method1439(this.method1232(0, var4), this.field2493[var4], arg0.method3074(class623.method3592(this.field2490[var4], (byte) -128).field5171, false), (byte) -75));
            }
        }
        var3.append(this.field2495[this.field2495.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)I")
    public final int method1227(int arg0, int arg1, int arg2) {
        field2500++;
        if (this.field2490 == null || arg0 < 0 || arg0 > this.field2490.length) {
            return -1;
        } else if (this.field2493[arg0] == null || arg2 < 0 || this.field2493[arg0].length < arg2) {
            return -1;
        } else {
            if (arg1 != 21206) {
                this.field2493 = null;
            }
            return this.field2493[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method1228(int arg0) {
        field2499++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2495 == null) {
            return "";
        }
        var2.append(this.field2495[0]);
        if (arg0 < 12) {
            this.method1236(null, 87);
        }
        for (int var3 = 1; var3 < this.field2495.length; var3++) {
            var2.append("...");
            var2.append(this.field2495[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILge;)V")
    private final void method1229(int arg0, int arg1, class551 arg2) {
        if (arg0 != 60) {
            return;
        }
        field2497++;
        if (arg1 == 1) {
            this.field2495 = class455.method2637('<', (byte) 76, arg2.method3077(-20739));
        } else if (arg1 == 2) {
            int var4 = arg2.method3045(arg0 - 185);
            this.field2505 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2505[var5] = arg2.method3090(-93);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method3045(-127);
            this.field2493 = new int[var6][];
            this.field2490 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method3090(-92);
                class371 var9 = class623.method3592(var8, (byte) -124);
                if (var9 != null) {
                    this.field2490[var7] = var8;
                    this.field2493[var7] = new int[var9.field5168];
                    for (int var10 = 0; var10 < var9.field5168; var10++) {
                        this.field2493[var7][var10] = arg2.method3090(-89);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field2504 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V")
    public static void method1230(boolean arg0) {
        field2492 = null;
        if (!arg0) {
            method1237(-107, 23, 97, 125, 69, 120, -54, 13);
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)I")
    public final int method1231(int arg0) {
        field2494++;
        if (this.field2490 == null) {
            return 0;
        } else {
            if (arg0 != -2231) {
                field2492 = null;
            }
            return this.field2490.length;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Lbn;")
    public final class371 method1232(int arg0, int arg1) {
        if (arg0 == 0) {
            field2489++;
            return this.field2490 == null || arg1 < 0 || arg1 > this.field2490.length ? null : class623.method3592(this.field2490[arg1], (byte) -127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V")
    public static final void method1233(int arg0) {
        field2502++;
        if (!class60.field835) {
            return;
        }
        class55.field731 = null;
        class60.field835 = false;
        if (arg0 >= -25) {
            field2492 = null;
        }
        class354.field4959 = null;
    }

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "(I)V")
    public final void method1234(int arg0) {
        if (this.field2505 != null) {
            for (int var2 = 0; var2 < this.field2505.length; var2++) {
                this.field2505[var2] = class292.method1790(this.field2505[var2], 32768);
            }
        }
        if (arg0 != 16568) {
            this.method1232(92, 115);
        }
        field2488++;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lge;[II)V")
    public final void method1235(class551 arg0, int[] arg1, int arg2) {
        field2501++;
        if (this.field2490 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 != -8439) {
            return;
        }
        while (this.field2490.length > var4) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method1232(0, var4).field5167;
            if (var5 > 0) {
                arg0.method3068(false, var5, (long) arg1[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lge;I)V")
    public final void method1236(class551 arg0, int arg1) {
        field2496++;
        while (true) {
            int var3 = arg0.method3045(-127);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    method1233(-59);
                    return;
                }
            }
            this.method1229(60, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 22566) {
            field2492 = null;
        }
        field2498++;
        if (arg6 >= class594.field8575 && class355.field4972 >= arg2 && class535.field7467 <= arg4 && arg3 <= class113.field1453) {
            class118.method648(arg5, arg6, arg3, arg1, arg0, (byte) 4, arg2, arg4);
        } else {
            class59.method337(arg1, arg6, arg5, arg0, (byte) -115, arg4, arg2, arg3);
        }
    }
}
