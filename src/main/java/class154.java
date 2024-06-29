import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class154 implements Runnable {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lma;")
    private class274 field2633 = new class274();

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public int field2634 = 0;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Z")
    private boolean field2635 = false;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field2636;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lve;")
    private static class255 field2621 = class87.method607(59, " has logged out)3");

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Z")
    public static boolean field2628 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lve;")
    public static class255 field2625 = field2621;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "F")
    public static float field2626;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[[S")
    public static short[][] field2631;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILch;B)Lql;", line = 6)
    public final class16 method1131(int arg0, class131 arg1, byte arg2) {
        class16 var4 = new class16();
        field2630++;
        var4.field238 = arg1;
        var4.field4903 = (long) arg0;
        if (arg2 < 18) {
            this.method1138((byte) -128, (class16) null);
        }
        var4.field242 = 3;
        var4.field3739 = false;
        this.method1138((byte) -58, var4);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V", line = 31)
    public final void run() {
        field2627++;
        while (!this.field2635) {
            class274 var1 = this.field2633;
            class16 var2;
            synchronized (this.field2633) {
                var2 = (class16) this.field2633.method1920((byte) 11);
                if (var2 == null) {
                    try {
                        this.field2633.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2634--;
            }
            try {
                if (var2.field242 == 2) {
                    var2.field238.method968(var2.field228.length, -1, (int) var2.field4903, var2.field228);
                } else if (var2.field242 == 3) {
                    var2.field228 = var2.field238.method969(15318, (int) var2.field4903);
                }
            } catch (Exception var6) {
                class195.method1393(var6, 0, (String) null);
            }
            var2.field3742 = false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILt;III)V", line = 75)
    public static final void method1132(int arg0, class242 arg1, int arg2, int arg3, int arg4) {
        field2617++;
        if (class276.field4742 == arg1 || class136.field2272 >= 400 || arg2 > -67) {
            return;
        }
        class255 var5;
        if (arg1.field4044 == 0) {
            boolean var6 = true;
            if (class276.field4742.field4045 != -1 && arg1.field4045 != -1) {
                int var7 = arg1.field4074 >= class276.field4742.field4074 ? arg1.field4074 : class276.field4742.field4074;
                int var8 = arg1.field4045 <= class276.field4742.field4045 ? arg1.field4045 : class276.field4742.field4045;
                int var9 = class276.field4742.field4074 - arg1.field4074;
                int var10 = var7 * 10 / 100 + var8 + 5;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var10 < var9) {
                    var6 = false;
                }
            }
            if (arg1.field4085 > arg1.field4074) {
                var5 = class3.method14(new class255[] { arg1.method1688(-62), class199.field3422, class210.field3581, class75.field1236, var6 ? class111.method846(class276.field4742.field4074, 50, arg1.field4074) : class129.field2127, class215.method1532(arg1.field4074, true), class195.field3214, class215.method1532(arg1.field4085 - arg1.field4074, true), class172.field2844 }, (byte) -107);
            } else {
                var5 = class3.method14(new class255[] { arg1.method1688(-67), class199.field3422, class210.field3581, class75.field1236, var6 ? class111.method846(class276.field4742.field4074, 50, arg1.field4074) : class129.field2127, class215.method1532(arg1.field4074, true), class174.field2874 }, (byte) -56);
            }
        } else {
            var5 = class3.method14(new class255[] { arg1.method1688(-80), class199.field3422, class309.field5252, class75.field1236, class215.method1532(arg1.field4044, true), class172.field2844 }, (byte) -58);
        }
        if (class72.field1182 == 1) {
            class153.field2590++;
            class186.method1298((short) 23, class3.method14(new class255[] { class123.field2044, class59.field911, var5 }, (byte) -75), arg0, (byte) 67, (long) arg3, class33.field527, arg4);
        } else if (!class42.field653) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class251.field4237[var11] != null) {
                    class282.field4857++;
                    short var12 = 0;
                    boolean var13 = false;
                    if (class245.field4123 == 0 && class251.field4237[var11].method1779(-12, class275.field4729)) {
                        if (class276.field4742.field4074 < arg1.field4074) {
                            var12 = 2000;
                        }
                        if (class276.field4742.field4079 != 0 && arg1.field4079 != 0) {
                            if (class276.field4742.field4079 == arg1.field4079) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class305.field5213[var11]) {
                        var12 = 2000;
                    }
                    short var14 = class174.field2887[var11];
                    short var15 = (short) (var12 + var14);
                    class186.method1298(var15, class3.method14(new class255[] { class129.field2127, var5 }, (byte) -71), arg0, (byte) 67, (long) arg3, class251.field4237[var11], arg4);
                }
            }
        } else if ((class41.field645 & 0x8) == 8) {
            class90.field1503++;
            class186.method1298((short) 24, class3.method14(new class255[] { class254.field4285, class59.field911, var5 }, (byte) -84), arg0, (byte) 67, (long) arg3, class82.field1342, arg4);
        }
        for (int var16 = 0; var16 < class136.field2272; var16++) {
            if (class264.field4466[var16] == 6) {
                class44.field684[var16] = class3.method14(new class255[] { class129.field2127, var5 }, (byte) -127);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 208)
    public static final void method1133(int arg0, int arg1) {
        field2624++;
        class107.field1807 = 1000 / arg0;
        if (arg1 <= 67) {
            method1136((byte) -69);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)I", line = 222)
    public static int method1134(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 229)
    public final void method1135(boolean arg0) {
        field2616++;
        if (arg0) {
            method1136((byte) 40);
        }
        this.field2635 = true;
        class274 var2 = this.field2633;
        synchronized (this.field2633) {
            this.field2633.notifyAll();
        }
        try {
            this.field2636.join();
        } catch (InterruptedException var5) {
        }
        this.field2636 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 250)
    public static void method1136(byte arg0) {
        field2625 = null;
        field2631 = (short[][]) null;
        if (arg0 != -57) {
            method1132(-54, (class242) null, -29, -52, -36);
        }
        field2621 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIBIII)V", line = 269)
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var9 = arg7 - arg8;
        field2620++;
        int var10 = (arg1 - arg2 << 16) / var9;
        int var11 = arg3 - arg0;
        int var12 = (arg4 - arg6 << 16) / var11;
        int var13 = -32 / ((-arg5 - 20) / 37);
        class155.method1143(arg6, 0, arg0, arg3, arg7, var10, -1, 0, var12, arg8, arg2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLql;)V", line = 286)
    private final void method1138(byte arg0, class16 arg1) {
        field2618++;
        class274 var3 = this.field2633;
        synchronized (this.field2633) {
            this.field2633.method1923(-8121, arg1);
            this.field2634++;
            if (arg0 >= -5) {
                this.method1140(103, (byte) -118, (class131) null);
            }
            this.field2633.notifyAll();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lch;[BZI)Lql;", line = 311)
    public final class16 method1139(class131 arg0, byte[] arg1, boolean arg2, int arg3) {
        class16 var5 = new class16();
        var5.field242 = 2;
        if (!arg2) {
            this.method1135(false);
        }
        field2622++;
        var5.field3739 = false;
        var5.field238 = arg0;
        var5.field4903 = (long) arg3;
        var5.field228 = arg1;
        this.method1138((byte) -106, var5);
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLch;)Lql;", line = 332)
    public final class16 method1140(int arg0, byte arg1, class131 arg2) {
        class16 var4 = new class16();
        var4.field242 = 1;
        int var5 = 78 / ((arg1 + 48) / 53);
        field2629++;
        class274 var6 = this.field2633;
        synchronized (this.field2633) {
            class16 var7 = (class16) this.field2633.method1919(false);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if (((long) arg0) == var7.field4903 && var7.field238 == arg2 && var7.field242 == 2) {
                    var4.field228 = var7.field228;
                    var4.field3742 = false;
                    return var4;
                }
                var7 = (class16) this.field2633.method1917(-1);
            }
        }
        var4.field228 = arg2.method969(15318, arg0);
        var4.field3742 = false;
        var4.field3739 = true;
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 376)
    public class154() {
        class169 var1 = class221.field3728.method241(8851, 5, this);
        while (var1.field2833 == 0) {
            class137.method1027(10L, 0);
        }
        if (var1.field2833 == 2) {
            throw new RuntimeException();
        }
        this.field2636 = (Thread) var1.field2832;
    }
}
