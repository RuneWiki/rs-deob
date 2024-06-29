import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class180 implements Runnable {

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Lmq;")
    private class358 field2576 = new class358();

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "Z")
    private boolean field2585 = false;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public int field2586 = 0;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2584;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1117(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field2580++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg6 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = 28 % ((-arg3 - 22) / 36);
        int var35 = (var22 - 3) * var20;
        int var36 = var28;
        int var37 = (arg6 - 1) * var27;
        int var38 = var30;
        if (class303.field4422 <= arg5 && class353.field5062 >= arg5) {
            int[] var39 = class112.field1523[arg5];
            int var40 = class539.method3173(arg1 - arg2, (byte) 73, class392.field5514, class518.field7624);
            int var41 = class539.method3173(arg1 + arg2, (byte) 45, class392.field5514, class518.field7624);
            int var42 = class539.method3173(arg1 - var11, (byte) 121, class392.field5514, class518.field7624);
            int var43 = class539.method3173(arg1 + var11, (byte) 65, class392.field5514, class518.field7624);
            class447.method2605(-7, var40, arg0, var42, var39);
            class447.method2605(-7, var42, arg7, var43, var39);
            class447.method2605(-7, var43, arg0, var41, var39);
        }
        int var44 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var45 = var9 <= var12;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var38;
                        var33 += var30;
                        var10++;
                        var38 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var38 += var30;
                }
                var25 += -var44;
                var26 += -var35;
                var44 -= var29;
                var35 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var36;
                    var8++;
                    var36 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var36;
                var23 += var31;
                var36 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var37;
            var32 -= var27;
            var37 -= var27;
            var9--;
            int var46 = arg5 - var9;
            int var47 = arg5 + var9;
            if (class303.field4422 <= var47 && class353.field5062 >= var46) {
                int var48 = class539.method3173(arg1 + var8, (byte) 11, class392.field5514, class518.field7624);
                int var49 = class539.method3173(arg1 - var8, (byte) 118, class392.field5514, class518.field7624);
                if (var45) {
                    int var50 = class539.method3173(arg1 + var10, (byte) 97, class392.field5514, class518.field7624);
                    int var51 = class539.method3173(arg1 - var10, (byte) 59, class392.field5514, class518.field7624);
                    if (var46 >= class303.field4422) {
                        int[] var52 = class112.field1523[var46];
                        class447.method2605(-7, var49, arg0, var51, var52);
                        class447.method2605(-7, var51, arg7, var50, var52);
                        class447.method2605(-7, var50, arg0, var48, var52);
                    }
                    if (class353.field5062 >= var47) {
                        int[] var53 = class112.field1523[var47];
                        class447.method2605(-7, var49, arg0, var51, var53);
                        class447.method2605(-7, var51, arg7, var50, var53);
                        class447.method2605(-7, var50, arg0, var48, var53);
                    }
                } else {
                    if (class303.field4422 <= var46) {
                        class447.method2605(-7, var49, arg0, var48, class112.field1523[var46]);
                    }
                    if (class353.field5062 >= var47) {
                        class447.method2605(-7, var49, arg0, var48, class112.field1523[var47]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILwk;I)Lep;")
    public final class294 method1118(int arg0, class97 arg1, int arg2) {
        field2574++;
        class294 var4 = new class294();
        var4.field4312 = 1;
        class358 var5 = this.field2576;
        synchronized (this.field2576) {
            class294 var6 = (class294) this.field2576.method2119(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field5164 && var6.field4311 == arg1 && var6.field4312 == 2) {
                    var4.field4307 = var6.field4307;
                    var4.field2496 = false;
                    return var4;
                }
                var6 = (class294) this.field2576.method2116((byte) 44);
            }
        }
        var4.field4307 = arg1.method686(arg2, true);
        var4.field2494 = true;
        if (arg0 == -11165) {
            var4.field2496 = false;
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lep;I)V")
    private final void method1119(class294 arg0, int arg1) {
        field2577++;
        if (arg1 <= 5) {
            this.field2585 = false;
        }
        class358 var3 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.method2118(arg0, true);
            this.field2586++;
            this.field2576.notifyAll();
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static final void method1120(boolean arg0) {
        field2581++;
        class189.method1206();
        if (!arg0) {
            field2579 = -59;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class143.field1877[var1].method231(-4);
        }
        class239.method1509(-27199);
        class366.method2160(8560);
        System.gc();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lwk;I[BI)Lep;")
    public final class294 method1121(class97 arg0, int arg1, byte[] arg2, int arg3) {
        field2578++;
        class294 var5 = new class294();
        var5.field4307 = arg2;
        var5.field4312 = arg3;
        var5.field4311 = arg0;
        var5.field2494 = false;
        var5.field5164 = arg1;
        this.method1119(var5, arg3 ^ 0x16);
        return var5;
    }

    @OriginalMember(owner = "client!kv", name = "run", descriptor = "()V")
    public final void run() {
        field2582++;
        while (!this.field2585) {
            class358 var1 = this.field2576;
            class294 var2;
            synchronized (this.field2576) {
                var2 = (class294) this.field2576.method2115((byte) -103);
                if (var2 == null) {
                    try {
                        this.field2576.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2586--;
            }
            try {
                if (var2.field4312 == 2) {
                    var2.field4311.method684((int) var2.field5164, var2.field4307, var2.field4307.length, 4);
                } else if (var2.field4312 == 3) {
                    var2.field4307 = var2.field4311.method686((int) var2.field5164, true);
                }
            } catch (Exception var6) {
                class406.method2409(3896, var6, null);
            }
            var2.field2496 = false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lwk;ZI)Lep;")
    public final class294 method1122(class97 arg0, boolean arg1, int arg2) {
        field2575++;
        class294 var4 = new class294();
        var4.field2494 = false;
        var4.field4311 = arg0;
        var4.field5164 = arg2;
        var4.field4312 = 3;
        if (arg1) {
            this.method1119(var4, 74);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final void method1123(byte arg0) {
        this.field2585 = true;
        field2583++;
        class358 var2 = this.field2576;
        synchronized (this.field2576) {
            this.field2576.notifyAll();
        }
        int var3 = -27 % ((18 - arg0) / 61);
        try {
            this.field2584.join();
        } catch (InterruptedException var4) {
        }
        this.field2584 = null;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lnt;)V")
    public class180(class151 arg0) {
        class370 var2 = arg0.method958((byte) 117, this, 5);
        while (var2.field5277 == 0) {
            class52.method411(10L, (byte) 114);
        }
        if (var2.field5277 == 2) {
            throw new RuntimeException();
        }
        this.field2584 = (Thread) var2.field5274;
    }
}
