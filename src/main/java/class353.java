import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class353 implements Runnable {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Lmg;")
    private class116 field5594 = new class116();

    @OriginalMember(owner = "client!io", name = "r", descriptor = "Z")
    private boolean field5607 = false;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public int field5610 = 0;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field5606;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "D")
    public static double field5595 = -1.0D;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field5596 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "Lln;")
    public static class117 field5609;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "Lcj;")
    public static class147 field5608;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "Lho;")
    public static class151 field5601;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "Z")
    public static boolean field5603;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "[[I")
    public static int[][] field5599;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 5)
    public static void method2491(int arg0) {
        field5609 = null;
        field5599 = (int[][]) null;
        field5608 = null;
        if (arg0 == 5) {
            field5601 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILja;)Ldj;", line = 19)
    public final class234 method2492(int arg0, int arg1, class302 arg2) {
        class234 var4 = new class234();
        field5592++;
        var4.field3891 = 1;
        class116 var5 = this.field5594;
        synchronized (this.field5594) {
            for (class234 var6 = (class234) this.field5594.method912(false); var6 != null; var6 = (class234) this.field5594.method909(-99)) {
                if (((long) arg0) == var6.field2754 && var6.field3890 == arg2 && var6.field3891 == 2) {
                    var4.field1434 = false;
                    var4.field3892 = var6.field3892;
                    return var4;
                }
            }
        }
        var4.field3892 = arg2.method2157(true, arg0);
        if (arg1 == 3) {
            var4.field1425 = true;
            var4.field1434 = false;
            return var4;
        } else {
            return (class234) null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ldj;I)V", line = 56)
    private final void method2493(class234 arg0, int arg1) {
        class116 var3 = this.field5594;
        synchronized (this.field5594) {
            this.field5594.method911(500, arg0);
            this.field5610++;
            this.field5594.notifyAll();
            if (arg1 != 12659) {
                field5595 = 0.5603809352330312D;
            }
        }
        field5600++;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIZI)V", line = 72)
    public static final void method2494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (!arg6) {
            method2495(-52, 77, -75, -66, -127);
        }
        field5612++;
        if (arg1 < 1 || arg7 < 1 || arg1 > 102 || arg7 > 102) {
            return;
        }
        if (!class215.method1621(25) && (class178.field2856[0][arg1][arg7] & 0x2) == 0) {
            int var8 = arg4;
            if ((class178.field2856[arg4][arg1][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class344.field5468 != var8) {
                return;
            }
        }
        int var9 = arg4;
        if (arg4 < 3 && (class178.field2856[1][arg1][arg7] & 0x2) == 2) {
            var9 = arg4 + 1;
        }
        class208.method1578(arg2, class32.field459[arg4], 2, var9, arg7, arg4, arg1);
        if (arg3 >= 0) {
            boolean var10 = class292.field4726;
            class292.field4726 = true;
            class134.method1023(arg3, false, 1, arg4, arg5, arg0, var9, arg7, arg1, false, class32.field459[arg4]);
            class292.field4726 = var10;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V", line = 123)
    public static final void method2495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5602++;
        class321 var5 = class46.method370(arg0, (byte) -106, arg1);
        var5.method2265(false);
        var5.field5109 = arg2;
        var5.field5101 = arg4;
        var5.field5112 = arg3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Laj;", line = 136)
    public static final class209 method2496(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field531; var4++) {
            class209 var5 = var3.field544[var4];
            if ((var5.field3279 >> 29 & 0x3L) == 2L && var5.field3283 == arg1 && var5.field3291 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lqm;Ljava/lang/String;I)I", line = 162)
    public static final int method2497(class227 arg0, String arg1, int arg2) {
        field5604++;
        int var3 = arg0.field3760;
        byte[] var4 = class177.method1398(-14084, arg1);
        arg0.method1746(var4.length, 65535);
        arg0.field3760 += class55.field903.method607(arg2 ^ 0xFFFF9996, arg2, var4, arg0.field3793, var4.length, arg0.field3760);
        return arg0.field3760 - var3;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lja;[BII)Ldj;", line = 177)
    public final class234 method2498(class302 arg0, byte[] arg1, int arg2, int arg3) {
        field5611++;
        if (arg2 > -16) {
            this.method2499(29, 89, (class302) null);
        }
        class234 var5 = new class234();
        var5.field1425 = false;
        var5.field2754 = (long) arg3;
        var5.field3892 = arg1;
        var5.field3891 = 2;
        var5.field3890 = arg0;
        this.method2493(var5, 12659);
        return var5;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IILja;)Ldj;", line = 198)
    public final class234 method2499(int arg0, int arg1, class302 arg2) {
        field5597++;
        class234 var4 = new class234();
        var4.field3890 = arg2;
        var4.field2754 = (long) arg0;
        if (arg1 > -84) {
            this.field5610 = 70;
        }
        var4.field3891 = 3;
        var4.field1425 = false;
        this.method2493(var4, 12659);
        return var4;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 275)
    public class353() {
        class192 var1 = class128.field2163.method1114((byte) 97, 5, this);
        while (var1.field3064 == 0) {
            class283.method2076((byte) -126, 10L);
        }
        if (var1.field3064 == 2) {
            throw new RuntimeException();
        }
        this.field5606 = (Thread) var1.field3066;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 230)
    public static final void method2500(int arg0) {
        field5591++;
        class206.field3257++;
        if (arg0 == 2) {
            class36.field520.method2228(193, 16547);
            class36.field520.method1712(0, -97);
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 244)
    public final void method2501(int arg0) {
        field5605++;
        this.field5607 = true;
        class116 var2 = this.field5594;
        synchronized (this.field5594) {
            if (arg0 != 16711935) {
                field5595 = -0.30096997401069864D;
            }
            this.field5594.notifyAll();
        }
        try {
            this.field5606.join();
        } catch (InterruptedException var5) {
        }
        this.field5606 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)I", line = 298)
    public static final int method2502(int arg0, boolean arg1) {
        field5598++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1) {
                method2502(79, true);
            }
            return class112.method854((byte) -80, arg0);
        }
    }

    @OriginalMember(owner = "client!io", name = "run", descriptor = "()V", line = 315)
    public final void run() {
        field5593++;
        while (!this.field5607) {
            class116 var1 = this.field5594;
            class234 var2;
            synchronized (this.field5594) {
                var2 = (class234) this.field5594.method914(-20217);
                if (var2 == null) {
                    try {
                        this.field5594.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5610--;
            }
            try {
                if (var2.field3891 == 2) {
                    var2.field3890.method2159(true, (int) var2.field2754, var2.field3892, var2.field3892.length);
                } else if (var2.field3891 == 3) {
                    var2.field3892 = var2.field3890.method2157(true, (int) var2.field2754);
                }
            } catch (Exception var6) {
                class285.method2079(var6, (byte) -16, (String) null);
            }
            var2.field1434 = false;
        }
    }
}
