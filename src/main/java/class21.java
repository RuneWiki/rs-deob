import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lna;")
    private class31 field391 = new class31();

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Z")
    private boolean field394 = false;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field392 = 0;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field393;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lp;")
    public static class280 field381 = class18.method140((byte) -124, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lfd;")
    public static class121 field378 = null;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "Lbb;")
    public static class90 field383 = new class90();

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lp;")
    public static class280 field396 = class18.method140((byte) -118, "Titelbild geladen)3");

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "Lp;")
    public static class280 field397 = class18.method140((byte) -121, "brillant3:");

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        field377++;
        while (!this.field394) {
            class31 var1 = this.field391;
            class207 var2;
            synchronized (this.field391) {
                var2 = (class207) this.field391.method267(-119);
                if (var2 == null) {
                    try {
                        this.field391.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field392--;
            }
            try {
                if (var2.field3576 == 2) {
                    var2.field3582.method1416((int) var2.field865, var2.field3587.length, var2.field3587, 0);
                } else if (var2.field3576 == 3) {
                    var2.field3587 = var2.field3582.method1414((byte) 38, (int) var2.field865);
                }
            } catch (Exception var6) {
                class207.method1398((String) null, -125, var6);
            }
            var2.field721 = false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method161(byte arg0) {
        field397 = null;
        if (arg0 == -97) {
            field378 = null;
            field396 = null;
            field381 = null;
            field383 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpa;BI)Lcc;")
    public final class207 method162(class211 arg0, byte arg1, int arg2) {
        field395++;
        class207 var4 = new class207();
        var4.field3576 = 1;
        class31 var5 = this.field391;
        synchronized (this.field391) {
            class207 var6 = (class207) this.field391.method274((byte) 21);
            while (true) {
                if (var6 == null) {
                    if (arg1 > -57) {
                        this.method164((class207) null, (byte) -15);
                    }
                    break;
                }
                if (((long) arg2) == var6.field865 && var6.field3582 == arg0 && var6.field3576 == 2) {
                    var4.field721 = false;
                    var4.field3587 = var6.field3587;
                    return var4;
                }
                var6 = (class207) this.field391.method272(true);
            }
        }
        var4.field3587 = arg0.method1414((byte) 38, arg2);
        var4.field721 = false;
        var4.field719 = true;
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILug;Ljava/awt/Component;)Lig;")
    public static final class9 method163(int arg0, int arg1, int arg2, class198 arg3, Component arg4) {
        field388++;
        if (class204.field3549 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class9 var5 = (class9) Class.forName("uf").getDeclaredConstructor().newInstance();
                var5.field226 = arg1;
                var5.field214 = new int[(class283.field4981 ? 2 : 1) * 256];
                var5.method91(arg4);
                var5.field222 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field222 > 16384) {
                    var5.field222 = 16384;
                }
                var5.method95(var5.field222);
                if (class245.field4299 > 0 && class200.field3498 == null) {
                    class200.field3498 = new class80();
                    class200.field3498.field1310 = arg3;
                    arg3.method1361(class200.field3498, 4, class245.field4299);
                }
                if (class200.field3498 != null) {
                    if (class200.field3498.field1311[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class200.field3498.field1311[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg2 != -25872) {
                    method161((byte) 89);
                }
                try {
                    class216 var6 = new class216(arg3, arg0);
                    var6.field226 = arg1;
                    var6.field214 = new int[(class283.field4981 ? 2 : 1) * 256];
                    var6.method91(arg4);
                    var6.field222 = 16384;
                    var6.method95(var6.field222);
                    if (class245.field4299 > 0 && class200.field3498 == null) {
                        class200.field3498 = new class80();
                        class200.field3498.field1310 = arg3;
                        arg3.method1361(class200.field3498, 4, class245.field4299);
                    }
                    if (class200.field3498 != null) {
                        if (class200.field3498.field1311[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class200.field3498.field1311[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class9();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lcc;B)V")
    private final void method164(class207 arg0, byte arg1) {
        field379++;
        class31 var3 = this.field391;
        synchronized (this.field391) {
            this.field391.method273(0, arg0);
            if (arg1 <= 21) {
                this.method162((class211) null, (byte) -93, -39);
            }
            this.field392++;
            this.field391.notifyAll();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162.method1151(arg0 + arg3, arg1, -90, arg0 - arg3, class91.field1484[arg5]);
        field387++;
        int var6 = arg2;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = var9 - (var12 - 1) * var11;
        int var14 = var8 << 2;
        int var15 = (1 - var12) * var8 + var10;
        int var16 = var9 << 2;
        int var17 = ((arg4 << 1) - 3) * var11;
        int var18 = ((arg2 << 1) + 3) * var10;
        int var19 = (arg4 - 1) * var14;
        int var20 = (arg2 + 1) * var16;
        while (var7 > 0) {
            var7--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var15 += var18;
                    var13 += var20;
                    var20 += var16;
                    var18 += var16;
                    var6++;
                }
            }
            if (var13 < 0) {
                var6++;
                var15 += var18;
                var13 += var20;
                var18 += var16;
                var20 += var16;
            }
            var15 += -var19;
            var19 -= var14;
            int var21 = arg5 - var7;
            var13 += -var17;
            var17 -= var14;
            int var22 = arg5 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class162.method1151(var23, arg1, 111, var24, class91.field1484[var21]);
            class162.method1151(var23, arg1, 105, var24, class91.field1484[var22]);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 > -46) {
            method163(-128, 26, 91, (class198) null, (Component) null);
        }
        field386++;
        if (arg0 < 0 || arg3 < 0 || arg0 >= 103 || arg3 >= 103) {
            return;
        }
        if (arg2 == 0) {
            class163 var8 = class244.method1662(arg4, arg0, arg3);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field2869 >>> 32);
                if (arg1 == 2) {
                    var8.field2870 = new class234(var9, 2, arg6 + 4, arg4, arg0, arg3, arg7, false, var8.field2870);
                    var8.field2865 = new class234(var9, 2, arg6 + 1 & 0x3, arg4, arg0, arg3, arg7, false, var8.field2865);
                } else {
                    var8.field2870 = new class234(var9, arg1, arg6, arg4, arg0, arg3, arg7, false, var8.field2870);
                }
            }
        }
        if (arg2 == 1) {
            class49 var10 = class74.method548(arg4, arg0, arg3);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field807 >>> 32);
                if (arg1 == 4 || arg1 == 5) {
                    var10.field800 = new class234(var11, 4, arg6, arg4, arg0, arg3, arg7, false, var10.field800);
                } else if (arg1 == 6) {
                    var10.field800 = new class234(var11, 4, arg6 + 4, arg4, arg0, arg3, arg7, false, var10.field800);
                } else if (arg1 == 7) {
                    var10.field800 = new class234(var11, 4, (arg6 + 2 & 0x3) + 4, arg4, arg0, arg3, arg7, false, var10.field800);
                } else if (arg1 == 8) {
                    var10.field800 = new class234(var11, 4, arg6 + 4, arg4, arg0, arg3, arg7, false, var10.field800);
                    var10.field798 = new class234(var11, 4, (arg6 + 2 & 0x3) + 4, arg4, arg0, arg3, arg7, false, var10.field798);
                }
            }
        }
        if (arg2 == 2) {
            if (arg1 == 11) {
                arg1 = 10;
            }
            class160 var12 = class180.method1229(arg4, arg0, arg3);
            if (var12 != null) {
                var12.field2811 = new class234((int) (var12.field2805 >>> 32) & Integer.MAX_VALUE, arg1, arg6, arg4, arg0, arg3, arg7, false, var12.field2811);
            }
        }
        if (arg2 != 3) {
            return;
        }
        class245 var13 = class11.method105(arg4, arg0, arg3);
        if (var13 != null) {
            var13.field4301 = new class234(Integer.MAX_VALUE & (int) (var13.field4303 >>> 32), 22, arg6, arg4, arg0, arg3, arg7, false, var13.field4301);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method167(int arg0) {
        class205.field3561 = null;
        class12.field251 = null;
        class153.field2657 = null;
        field380++;
        class159.field2786 = null;
        class25.field465 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field396 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public final void method168(int arg0) {
        field385++;
        this.field394 = true;
        class31 var2 = this.field391;
        synchronized (this.field391) {
            if (arg0 != 10) {
                return;
            }
            this.field391.notifyAll();
        }
        try {
            this.field393.join();
        } catch (InterruptedException var5) {
        }
        this.field393 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BLpa;II)Lcc;")
    public final class207 method169(byte[] arg0, class211 arg1, int arg2, int arg3) {
        field384++;
        class207 var5 = new class207();
        var5.field3582 = arg1;
        var5.field719 = false;
        var5.field3587 = arg0;
        var5.field3576 = arg3;
        var5.field865 = (long) arg2;
        this.method164(var5, (byte) 24);
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpa;II)Lcc;")
    public final class207 method170(class211 arg0, int arg1, int arg2) {
        field390++;
        class207 var4 = new class207();
        var4.field865 = (long) arg1;
        var4.field3582 = arg0;
        var4.field719 = false;
        var4.field3576 = 3;
        this.method164(var4, (byte) 111);
        if (arg2 != 8579) {
            this.field392 = 114;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field389++;
        int var10 = arg4 + 1;
        class162.method1151(arg0, arg2, -60, arg3, class91.field1484[arg4]);
        int var9 = arg1 - 1;
        class162.method1151(arg0, arg2, 103, arg3, class91.field1484[arg1]);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var7 = class91.field1484[var6];
            var7[arg3] = var7[arg0] = arg2;
        }
        if (arg5) {
            field381 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class21() {
        class174 var1 = class118.field2117.method1361(this, 4, 5);
        while (var1.field3025 == 0) {
            class159.method1130(10L, 0);
        }
        if (var1.field3025 == 2) {
            throw new RuntimeException();
        }
        this.field393 = (Thread) var1.field3028;
    }
}
