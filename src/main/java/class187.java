import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class187 {

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2842 = "Please remove ";

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Z")
    public static boolean field2843 = true;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2841 = 10;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "J")
    public long field2852;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lsn;")
    public class187 field2846;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "Lsn;")
    public class187 field2850;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)Z", line = 7)
    public final boolean method1280(boolean arg0) {
        field2853++;
        if (!arg0) {
            method1281(-9, 3, -42, -96, -36, -24, 72, 69);
        }
        return this.field2850 != null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIIII)Z", line = 22)
    public static final boolean method1281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2849++;
        long var8 = class126.method848(arg4, arg1 + arg0, arg5 + arg7);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x39B45F) >> 20;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            int var12 = ((int) var8 & 0x7DABC) >> 14;
            class17 var13 = class277.method1819((byte) 126, var11);
            if (var13.field192 == -1) {
                int var14 = arg2;
                if (var8 > 0L) {
                    var14 = arg6;
                }
                int[] var15 = class57.field797;
                int var16 = 24624 - (-((52736 - (arg7 * 512)) * 4) - (arg1 * 4));
                if (var12 == 0 || var12 == 2) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var12 == 3) {
                    if (var10 == 0) {
                        var15[var16] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var12 == 2) {
                    if (var10 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var10 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var10 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var10 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1536 + 1] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else if (!class320.method2170(0, arg1, var10, var13, arg7, arg5, arg0)) {
                return false;
            }
        }
        long var17 = class97.method668(arg4, arg0 + arg1, arg5 + arg7);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class17 var21 = class277.method1819((byte) -5, var20);
            int var22 = (int) var17 >> 14 & 0x1F;
            if (var21.field192 == -1) {
                if (var22 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var24 = (103 - arg7) * 4 * 512 + arg1 * 4 + 24624;
                    int[] var25 = class57.field797;
                    if (var19 == 0 || var19 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1024 + 1] = var23;
                        var25[var24 + 514] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 1 + 512] = var23;
                        var25[var24 + 1024 + 2] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class320.method2170(0, arg1, var19, var21, arg7, arg5, arg0)) {
                return false;
            }
        }
        int var26 = -117 % ((arg3 + 64) / 32);
        long var27 = class338.method2341(arg4, arg0 + arg1, arg7 - -arg5);
        if (var27 != 0L) {
            int var29 = (int) (var27 >>> 32) & Integer.MAX_VALUE;
            int var30 = (int) var27 >> 20 & 0x3;
            class17 var31 = class277.method1819((byte) 126, var29);
            if (var31.field192 != -1 && !class320.method2170(0, arg1, var30, var31, arg7, arg5, arg0)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V", line = 237)
    public static void method1282(boolean arg0) {
        field2842 = null;
        if (!arg0) {
            field2841 = 88;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lwf;I)V", line = 252)
    public static final void method1283(class306 arg0, int arg1) {
        class81.field1197 = class259.method1734(class218.field3478, arg0, arg1, 0);
        field2851++;
        class117.field1803 = class248.method1685(class272.field4182, arg0, (byte) -91, 0);
        class339.field5246 = class248.method1685(class183.field2808, arg0, (byte) 77, 0);
        class234.field3765 = class248.method1685(class156.field2445, arg0, (byte) 107, 0);
        class69.field1030 = class248.method1685(class253.field3960, arg0, (byte) -70, 0);
        class221.field3509 = class248.method1685(class138.field2135, arg0, (byte) 75, 0);
        class68.field1014 = class248.method1685(class306.field4827, arg0, (byte) -83, 0);
        class169.field2576 = class196.method1329(arg0, 0, (byte) 95, class97.field1491);
        class256.field3998 = class170.method1150(0, class89.field1360, arg0, 708774124);
        class26.field342 = class170.method1150(0, class274.field4217, arg0, 708774124);
        class87.field1305 = class266.method1762(0, class272.field4171, arg0, 375096908);
        class192.field2904 = class266.method1762(0, class218.field3464, arg0, 375096908);
        class342.field5329.method1232(class192.field2904, (int[]) null);
        class179.field2736.method1232(class192.field2904, (int[]) null);
        class286.field4380.method1232(class192.field2904, (int[]) null);
        if (class333.field5166) {
            class11.field109 = class54.method364(arg0, class71.field1065, 0, arg1 ^ 0x623B);
            for (int var2 = 0; var2 < class11.field109.length; var2++) {
                class11.field109[var2].method158();
            }
        }
        class178 var3 = class320.method2173(class34.field443, 0, arg0, 17136);
        var3.method1216();
        if (class333.field5166) {
            class332.field5133 = new class186(var3);
        } else {
            class332.field5133 = var3;
        }
        class178[] var4 = class259.method1734(class260.field4039, arg0, 0, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1216();
        }
        if (class333.field5166) {
            class237.field3798 = new class245[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class237.field3798[var6] = new class186(var4[var6]);
            }
        } else {
            class237.field3798 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class81.field1197.length; var11++) {
            class81.field1197[var11].method1215(var9 + var10, var7 - -var10, var8 + var10);
        }
        if (class333.field5166) {
            class83.field1252 = new class245[class81.field1197.length];
            for (int var12 = 0; var12 < class81.field1197.length; var12++) {
                class83.field1252[var12] = new class186(class81.field1197[var12]);
            }
        } else {
            class83.field1252 = class81.field1197;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 347)
    public final void method1284(int arg0) {
        field2845++;
        if (this.field2850 == null) {
            return;
        }
        if (arg0 != 0) {
            this.method1280(false);
        }
        this.field2850.field2846 = this.field2846;
        this.field2846.field2850 = this.field2850;
        this.field2850 = null;
        this.field2846 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIII)I", line = 374)
    public static final int method1285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2848++;
        if (arg1 > -112) {
            method1285(109, -81, -103, 125, 5);
        }
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg4 : arg2;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg4 : arg3);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z", line = 398)
    public static final boolean method1286(int arg0, int arg1, int arg2) {
        int var3 = class160.field2484[arg0][arg1][arg2];
        if (-class329.field5085 == var3) {
            return false;
        } else if (class329.field5085 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class89.method610(var4 + 1, client.field2034[arg0][arg1][arg2], var5 + 1) && class89.method610(var4 + 128 - 1, client.field2034[arg0][arg1 + 1][arg2], var5 + 1) && class89.method610(var4 + 128 - 1, client.field2034[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class89.method610(var4 + 1, client.field2034[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class160.field2484[arg0][arg1][arg2] = class329.field5085;
                return true;
            } else {
                class160.field2484[arg0][arg1][arg2] = -class329.field5085;
                return false;
            }
        }
    }
}
