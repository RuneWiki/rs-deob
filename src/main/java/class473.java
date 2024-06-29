import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class473 implements Runnable {

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Lvv;")
    private class298 field6992 = new class523();

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Lvv;")
    private class298 field7006 = null;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field7005 = -1;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Lhga;")
    public static class158 field6989 = new class158(27, 11);

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field7015 = 0;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "Z")
    public static boolean field7017 = false;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    private int field7007;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    private int field7009;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "J")
    private long field7011;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "J")
    private long field7016;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "Lfl;")
    private class687 field7014;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "Ljava/lang/String;")
    private String field7013;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "Z")
    private volatile boolean field6998;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "Z")
    private boolean field7000;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method2927(int arg0) {
        if (arg0 != 6429) {
            field7001 = -43;
        }
        field6989 = null;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method2928(byte arg0) {
        field7010++;
        if (arg0 != -77) {
            this.field6998 = false;
        }
        return this.field7013;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)Lfl;")
    public final class687 method2929(int arg0) {
        if (arg0 != 0) {
            this.field7011 = 7L;
        }
        field6995++;
        return this.field7014;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)I")
    public final int method2930(byte arg0) {
        field6991++;
        if (arg0 != -36) {
            this.method2935((byte) 123, null);
        }
        return this.field7009;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)J")
    public final long method2931(int arg0) {
        field7002++;
        if (arg0 != 0) {
            field7005 = 119;
        }
        return this.field7016;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lie;B)Lrc;")
    public static final class499 method2932(class6 arg0, byte arg1) {
        field6996++;
        class254 var2 = class411.method2620(0)[arg0.method70(-9059)];
        if (arg1 > -29) {
            return null;
        }
        class395 var3 = class129.method1125(0)[arg0.method70(-9059)];
        int var4 = arg0.method45(-8652);
        int var5 = arg0.method45(-8652);
        int var6 = arg0.method67(12021);
        int var7 = arg0.method67(12021);
        int var8 = arg0.method45(-8652);
        int var9 = arg0.method72(-113);
        int var10 = arg0.method72(-18);
        return new class499(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
    public final synchronized void method2933(int arg0) {
        if (arg0 != 27) {
            this.method2937((byte) 58);
        }
        this.field7000 = true;
        field7008++;
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I")
    public final int method2934(int arg0) {
        field7004++;
        if (this.field7014 == null) {
            return 0;
        }
        int var2 = this.field7014.method3899(arg0 + 5243);
        if (this.field7014.field9628 && this.field7014.field9624 > this.field7009) {
            return this.field7009 + 1;
        } else if (var2 >= 0 && var2 < class652.field9132.length - 1) {
            if (arg0 != -5144) {
                this.field7013 = null;
            }
            return this.field7014.field9634 == this.field7009 ? this.field7014.field9624 : this.field7014.field9634;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLvv;)V")
    public final synchronized void method2935(byte arg0, class298 arg1) {
        this.field7006 = this.field6992;
        field6994++;
        this.field6992 = arg1;
        this.field7011 = class112.method1033(-11752);
        int var3 = -88 % ((arg0 + 8) / 56);
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)Z")
    public final synchronized boolean method2936(int arg0) {
        if (arg0 != 1) {
            this.field7013 = null;
        }
        field6999++;
        return this.field6992.method2065(26711, this.field7011);
    }

    @OriginalMember(owner = "client!jq", name = "run", descriptor = "()V")
    public final void run() {
        field7003++;
        while (!this.field6998) {
            long var1 = class112.method1033(-11752);
            synchronized (this) {
                try {
                    if (this.field6992 instanceof class523) {
                        this.field6992.method2069(true, this.field7000);
                    } else {
                        this.field7007++;
                        long var4 = class112.method1033(-11752);
                        if (class627.field8857 == null || this.field7006 == null || this.field7006.method2067(3185) == 0 || this.field7011 < var4 - ((long) this.field7006.method2067(3185))) {
                            if (this.field7006 != null) {
                                this.field7000 = true;
                                this.field7006.method2068(8553);
                                this.field7006 = null;
                            }
                            if (this.field7000) {
                                class502.method3057(-9629);
                                if (class627.field8857 != null) {
                                    class627.field8857.method121(0);
                                }
                            }
                            this.field6992.method2069(true, this.field7000 || class627.field8857 != null && class627.field8857.method261());
                        } else {
                            int var6 = (int) ((var4 - this.field7011) * 255L / (long) this.field7006.method2067(3185));
                            int var7 = 255 - var6;
                            class502.method3057(-9629);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class627.field8857.method121(0);
                            class702 var10 = class627.field8857.method350(class56.field732, class259.field4147, true);
                            class627.field8857.method1346(124, var10);
                            this.field7006.method2069(true, true);
                            class627.field8857.method176();
                            var10.method1086(0, 0, 0, var8, 1);
                            class627.field8857.method1346(115, var10);
                            class627.field8857.method121(0);
                            this.field6992.method2069(true, true);
                            class627.field8857.method176();
                            var10.method1086(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class627.field8857 != null && !(this.field6992 instanceof class523)) {
                                class627.field8857.method122();
                            }
                        } catch (class529 var17) {
                            class660.method3790(10216, var17, var17.getMessage() + " (Recovered) " + class157.field2684.method1941(-107));
                            class265.method1878(0, -14473);
                        }
                    }
                    this.field7000 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class112.method1033(-11752);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class549.method3313((long) var14, 126);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)V")
    public final void method2937(byte arg0) {
        this.field6998 = true;
        if (arg0 >= -122) {
            field7005 = -78;
        }
        field6990++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILfl;JILjava/lang/String;)V")
    public final synchronized void method2938(int arg0, class687 arg1, long arg2, int arg3, String arg4) {
        this.field7013 = arg4;
        this.field7014 = arg1;
        field6997++;
        this.field7016 = arg2;
        this.field7009 = arg0;
        if (arg3 != -24436) {
            field7005 = 89;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)I")
    public final int method2939(int arg0) {
        int var2 = 15 % ((-arg0 - 21) / 57);
        field7012++;
        return this.field7007;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method2940(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field6993++;
        int var8 = class160.method1320(0, arg6, class545.field7931, class585.field8331);
        int var9 = class160.method1320(0, arg4, class545.field7931, class585.field8331);
        int var10 = class160.method1320(0, arg3, class576.field8218, class340.field5510);
        int var11 = class160.method1320(0, arg0, class576.field8218, class340.field5510);
        int var12 = class160.method1320(0, arg2 + arg6, class545.field7931, class585.field8331);
        int var13 = class160.method1320(0, arg4 - arg2, class545.field7931, class585.field8331);
        if (!arg5) {
            field7001 = 41;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class367.method2427(3803, arg7, var11, class39.field527[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class367.method2427(3803, arg7, var11, class39.field527[var15], var10);
        }
        int var16 = class160.method1320(0, arg2 + arg3, class576.field8218, class340.field5510);
        int var17 = class160.method1320(0, arg0 - arg2, class576.field8218, class340.field5510);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class39.field527[var18];
            class367.method2427(3803, arg7, var16, var19, var10);
            class367.method2427(3803, arg1, var17, var19, var16);
            class367.method2427(3803, arg7, var11, var19, var17);
        }
    }
}
