import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class115 implements Runnable {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lja;")
    private class61 field1748 = new class61();

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
    private boolean field1758 = false;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field1759 = 0;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1761;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[[I")
    public static int[][] field1747 = new int[5][5000];

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1755 = "Loading - please wait.";

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lnm;")
    public static class113 field1753;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lwb;")
    public static class28 field1756;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILki;I)Lpf;")
    public final class310 method793(int arg0, class64 arg1, int arg2) {
        class310 var4 = new class310();
        field1760++;
        var4.field5015 = arg2;
        var4.field5011 = arg1;
        var4.field2462 = false;
        var4.field4135 = (long) arg0;
        this.method799(var4, (byte) -118);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lki;IB)Lpf;")
    public final class310 method794(class64 arg0, int arg1, byte arg2) {
        field1754++;
        class310 var4 = new class310();
        var4.field5015 = 1;
        class61 var5 = this.field1748;
        synchronized (this.field1748) {
            class310 var6 = (class310) this.field1748.method391((byte) -103);
            while (true) {
                if (var6 == null) {
                    int var8 = -56 / ((56 - arg2) / 32);
                    break;
                }
                if ((long) arg1 == var6.field4135 && var6.field5011 == arg0 && var6.field5015 == 2) {
                    var4.field5014 = var6.field5014;
                    var4.field2461 = false;
                    return var4;
                }
                var6 = (class310) this.field1748.method394((byte) 80);
            }
        }
        var4.field5014 = arg0.method424(arg1, 7);
        var4.field2461 = false;
        var4.field2462 = true;
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lki;I[BI)Lpf;")
    public final class310 method795(class64 arg0, int arg1, byte[] arg2, int arg3) {
        class310 var5 = new class310();
        var5.field2462 = false;
        var5.field5014 = arg2;
        var5.field4135 = (long) arg3;
        var5.field5015 = 2;
        var5.field5011 = arg0;
        if (arg1 != 10129) {
            method798(false);
        }
        field1751++;
        this.method799(var5, (byte) -123);
        return var5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lsa;IIIIIIZ)V")
    public static final void method796(class283 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4595.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field4595[var9] - class35.field567;
            int var23 = arg0.field4599[var9] - class251.field4123;
            int var24 = arg0.field4598[var9] - class280.field4561;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field4579 != null) {
                class283.field4584[var9] = var25;
                class283.field4591[var9] = var28;
                class283.field4590[var9] = var29;
            }
            class283.field4578[var9] = (var25 << 9) / var29 + class136.field2199;
            class283.field4588[var9] = (var28 << 9) / var29 + class136.field2194;
        }
        class136.field2197 = 0;
        int var10 = arg0.field4589.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field4589[var11];
            int var13 = arg0.field4597[var11];
            int var14 = arg0.field4583[var11];
            int var15 = class283.field4578[var12];
            int var16 = class283.field4578[var13];
            int var17 = class283.field4578[var14];
            int var18 = class283.field4588[var12];
            int var19 = class283.field4588[var13];
            int var20 = class283.field4588[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class24.field449 && class249.method1692(class79.field1274 + class136.field2199, class23.field431 + class136.field2194, var18, var19, var20, var15, var16, var17)) {
                    class134.field2179 = arg5;
                    class33.field548 = arg6;
                }
                if (!arg7) {
                    class136.field2206 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class136.field2195 || var16 > class136.field2195 || var17 > class136.field2195) {
                        class136.field2206 = true;
                    }
                    if (arg0.field4579 == null || arg0.field4579[var11] == -1) {
                        if (arg0.field4581[var11] != 12345678) {
                            class136.method936(var18, var19, var20, var15, var16, var17, arg0.field4581[var11], arg0.field4592[var11], arg0.field4585[var11]);
                        }
                    } else if (!class4.field95) {
                        int var21 = class136.field2196.method1027((byte) 91, arg0.field4579[var11]);
                        class136.method936(var18, var19, var20, var15, var16, var17, class287.method1953(var21, arg0.field4581[var11]), class287.method1953(var21, arg0.field4592[var11]), class287.method1953(var21, arg0.field4585[var11]));
                    } else if (arg0.field4582) {
                        class136.method947(var18, var19, var20, var15, var16, var17, arg0.field4581[var11], arg0.field4592[var11], arg0.field4585[var11], class283.field4584[0], class283.field4584[1], class283.field4584[3], class283.field4591[0], class283.field4591[1], class283.field4591[3], class283.field4590[0], class283.field4590[1], class283.field4590[3], arg0.field4579[var11]);
                    } else {
                        class136.method947(var18, var19, var20, var15, var16, var17, arg0.field4581[var11], arg0.field4592[var11], arg0.field4585[var11], class283.field4584[var12], class283.field4584[var13], class283.field4584[var14], class283.field4591[var12], class283.field4591[var13], class283.field4591[var14], class283.field4590[var12], class283.field4590[var13], class283.field4590[var14], arg0.field4579[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "run", descriptor = "()V")
    public final void run() {
        field1749++;
        while (!this.field1758) {
            class61 var1 = this.field1748;
            class310 var2;
            synchronized (this.field1748) {
                var2 = (class310) this.field1748.method396(0);
                if (var2 == null) {
                    try {
                        this.field1748.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1759--;
            }
            try {
                if (var2.field5015 == 2) {
                    var2.field5011.method426(var2.field5014, (byte) -123, (int) var2.field4135, var2.field5014.length);
                } else if (var2.field5015 == 3) {
                    var2.field5014 = var2.field5011.method424((int) var2.field4135, 7);
                }
            } catch (Exception var6) {
                class284.method1930(-107, (String) null, var6);
            }
            var2.field2461 = false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public final void method797(byte arg0) {
        this.field1758 = true;
        class61 var2 = this.field1748;
        synchronized (this.field1748) {
            this.field1748.notifyAll();
        }
        try {
            this.field1761.join();
            if (arg0 > -60) {
                field1756 = null;
            }
        } catch (InterruptedException var3) {
        }
        this.field1761 = null;
        field1752++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method798(boolean arg0) {
        if (!arg0) {
            method798(false);
        }
        field1755 = null;
        field1747 = null;
        field1753 = null;
        field1756 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lpf;B)V")
    private final void method799(class310 arg0, byte arg1) {
        class61 var3 = this.field1748;
        synchronized (this.field1748) {
            this.field1748.method388(arg0, false);
            this.field1759++;
            this.field1748.notifyAll();
        }
        field1757++;
        if (arg1 >= -116) {
            this.field1759 = 20;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class115() {
        class301 var1 = class44.field659.method487(-20349, 5, this);
        while (var1.field4929 == 0) {
            class33.method250(10L, 256);
        }
        if (var1.field4929 == 2) {
            throw new RuntimeException();
        }
        this.field1761 = (Thread) var1.field4930;
    }
}
