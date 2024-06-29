import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class135 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lsu;")
    private class143 field2065 = new class143();

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Z")
    private boolean field2069 = false;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public int field2070 = 0;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field2071;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[Z")
    public static boolean[] field2055 = new boolean[200];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Ltr;")
    public static class195 field2058 = new class195(0, -1);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "S")
    public static short field2066;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lei;")
    public static class120 field2067;

    static {
        new class234(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field2066 = 32767;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 4)
    public final void method982(int arg0) {
        this.field2069 = true;
        field2056++;
        class143 var2 = this.field2065;
        synchronized (this.field2065) {
            if (arg0 != -4) {
                field2067 = null;
            }
            this.field2065.notifyAll();
        }
        try {
            this.field2071.join();
        } catch (InterruptedException var3) {
        }
        this.field2071 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Leo;BI)Lio;", line = 28)
    public final class304 method983(class196 arg0, byte arg1, int arg2) {
        field2057++;
        class304 var4 = new class304();
        var4.field4585 = 1;
        class143 var5 = this.field2065;
        synchronized (this.field2065) {
            class304 var6 = (class304) this.field2065.method1024((byte) 90);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field6596 && var6.field4586 == arg0 && var6.field4585 == 2) {
                    var4.field4591 = var6.field4591;
                    var4.field3927 = false;
                    return var4;
                }
                var6 = (class304) this.field2065.method1022(-3);
            }
        }
        int var8 = 78 / ((-arg1 - 56) / 57);
        var4.field4591 = arg0.method1368((byte) -100, arg2);
        var4.field3926 = true;
        var4.field3927 = false;
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILio;)V", line = 63)
    private final void method984(int arg0, class304 arg1) {
        class143 var3 = this.field2065;
        synchronized (this.field2065) {
            this.field2065.method1021(arg1, -110);
            this.field2070++;
            this.field2065.notifyAll();
            if (arg0 != 3) {
                field2055 = null;
            }
        }
        field2064++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lod;Lhp;IB)V", line = 78)
    public static final void method985(class352 arg0, class217 arg1, int arg2, byte arg3) {
        field2061++;
        class233 var4 = new class233();
        var4.field3765 = arg1.method1515((byte) 126);
        var4.field3755 = arg1.method1556(112);
        var4.field3758 = new class449[var4.field3765];
        var4.field3767 = new int[var4.field3765];
        var4.field3760 = new int[var4.field3765];
        var4.field3761 = new int[var4.field3765];
        if (arg3 < 70) {
            field2066 = -117;
        }
        var4.field3766 = new class449[var4.field3765];
        var4.field3757 = new byte[var4.field3765][][];
        for (int var5 = 0; var5 < var4.field3765; var5++) {
            try {
                int var6 = arg1.method1515((byte) 125);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg1.method1550((byte) 28);
                    String var18 = arg1.method1550((byte) 28);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg1.method1556(105);
                    }
                    var4.field3760[var5] = var6;
                    var4.field3767[var5] = var19;
                    var4.field3766[var5] = arg0.method2183(class215.method1492(0, var17), var18, 25556);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg1.method1550((byte) 28);
                    String var8 = arg1.method1550((byte) 28);
                    int var9 = arg1.method1515((byte) 126);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg1.method1550((byte) 28);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg1.method1556(127);
                            var12[var13] = new byte[var14];
                            arg1.method1540(0, var12[var13], var14, -84);
                        }
                    }
                    var4.field3760[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class215.method1492(0, var10[var16]);
                    }
                    var4.field3758[var5] = arg0.method2198(class215.method1492(0, var7), var8, var15, true);
                    var4.field3757[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3761[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3761[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3761[var5] = -3;
            } catch (Exception var23) {
                var4.field3761[var5] = -4;
            } catch (Throwable var24) {
                var4.field3761[var5] = -5;
            }
        }
        class295.field4504.method994(var4, -3610);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BLeo;IZ)Lio;", line = 191)
    public final class304 method986(byte[] arg0, class196 arg1, int arg2, boolean arg3) {
        field2060++;
        class304 var5 = new class304();
        var5.field4585 = 2;
        var5.field6596 = arg2;
        var5.field3926 = arg3;
        var5.field4586 = arg1;
        var5.field4591 = arg0;
        this.method984(3, var5);
        return var5;
    }

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V", line = 213)
    public final void run() {
        field2068++;
        while (!this.field2069) {
            class143 var1 = this.field2065;
            class304 var2;
            synchronized (this.field2065) {
                var2 = (class304) this.field2065.method1019(65408);
                if (var2 == null) {
                    try {
                        this.field2065.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field2070--;
            }
            try {
                if (var2.field4585 == 2) {
                    var2.field4586.method1366(var2.field4591.length, var2.field4591, -1, (int) var2.field6596);
                } else if (var2.field4585 == 3) {
                    var2.field4591 = var2.field4586.method1368((byte) -117, (int) var2.field6596);
                }
            } catch (Exception var6) {
                class88.method727(var6, 113, null);
            }
            var2.field3927 = false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V", line = 262)
    public static final void method987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 82 / ((-arg3 - 64) / 50);
        field2062++;
        class211 var6 = class452.method2749(8, -124, arg2);
        var6.method1463(0);
        var6.field3440 = arg0;
        var6.field3446 = arg1;
        var6.field3441 = arg4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 282)
    public static void method988(byte arg0) {
        field2067 = null;
        field2058 = null;
        int var1 = -30 % ((arg0 + 31) / 61);
        field2055 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lod;)V", line = 327)
    public class135(class352 arg0) {
        class449 var2 = arg0.method2195(5, 0, this);
        while (var2.field6570 == 0) {
            class434.method2690(10, 10L);
        }
        if (var2.field6570 == 2) {
            throw new RuntimeException();
        }
        this.field2071 = (Thread) var2.field6569;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILeo;B)Lio;", line = 307)
    public final class304 method989(int arg0, class196 arg1, byte arg2) {
        field2063++;
        class304 var4 = new class304();
        var4.field3926 = false;
        var4.field4585 = 3;
        var4.field4586 = arg1;
        int var5 = 83 / ((arg2 - 40) / 44);
        var4.field6596 = arg0;
        this.method984(3, var4);
        return var4;
    }
}
