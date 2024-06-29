import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class744 {

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Lfba;")
    private class348 field10386 = new class348(64);

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Lfba;")
    public class348 field10400 = new class348(50);

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lfaa;")
    public class32 field10401 = new class32(250);

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "Lcd;")
    private class22 field10402 = new class22();

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Lcn;")
    private class306 field10404;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lla;")
    private class423 field10395;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field10380;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Z")
    private boolean field10388;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lla;")
    public class423 field10383;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field10379;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field10406;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field10403;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field10382;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public int field10405;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V")
    public final void method4141(boolean arg0, int arg1) {
        field10397++;
        if (this.field10388 == arg0) {
            return;
        }
        this.field10388 = arg0;
        this.method4143(13);
        if (arg1 <= 125) {
            this.field10395 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public static final void method4142() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class186.field2604.length; var1++) {
                if (class186.field2604[var1].method830()) {
                    class453.field6474[var1] = class186.field2604[var1].method826();
                } else {
                    synchronized (class186.field2604[var1]) {
                        class186.field2604[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class186.field2604[class186.field2604.length - 1].method825();
                class135.method967(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class186.field2604.length - 1; var4++) {
                        if (!class186.field2604[var4].method830()) {
                            synchronized (class186.field2604[var4]) {
                                class186.field2604[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class186.field2604.length - 2; var6++) {
                            class186.field2604[var6].method825();
                        }
                        class135.method967(2);
                        while (!class186.field2604[0].method830()) {
                            synchronized (class186.field2604[0]) {
                                class186.field2604[0].notify();
                            }
                            try {
                                class363.method2283(1L, -24244);
                            } catch (Exception var9) {
                            }
                        }
                        class186.field2604[0].method825();
                        return;
                    }
                    try {
                        class363.method2283(1L, -24244);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class363.method2283(1L, -24244);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method4143(int arg0) {
        field10396++;
        class348 var2 = this.field10386;
        synchronized (this.field10386) {
            this.field10386.method2220(false);
        }
        class348 var3 = this.field10400;
        synchronized (this.field10400) {
            this.field10400.method2220(false);
        }
        if (arg0 == 13) {
            class32 var4 = this.field10401;
            synchronized (this.field10401) {
                this.field10401.method161(-128);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lbr;")
    public final class424 method4144(int arg0, int arg1) {
        field10393++;
        class348 var3 = this.field10386;
        class424 var4;
        synchronized (this.field10386) {
            var4 = (class424) this.field10386.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field10395;
        byte[] var6;
        synchronized (this.field10395) {
            var6 = this.field10395.method2600(0, class627.method3611((byte) -104, arg0), class465.method2816(-96, arg0));
        }
        if (arg1 <= 122) {
            this.method4156((byte) -74);
        }
        class424 var7 = new class424();
        var7.field6068 = arg0;
        var7.field6077 = this;
        var7.field6139 = new String[] { null, null, class608.field8627.method3543(-24350, this.field10380), null, null };
        var7.field6141 = new String[] { null, null, null, null, class608.field8628.method3543(-24350, this.field10380) };
        if (var6 != null) {
            var7.method2638(new class479(var6), (byte) -103);
        }
        var7.method2641(16220);
        if (var7.field6131 != -1) {
            var7.method2642(true, this.method4144(var7.field6087, 123), this.method4144(var7.field6131, 126));
        }
        if (var7.field6092 != -1) {
            var7.method2639(5465, this.method4144(var7.field6092, 124), this.method4144(var7.field6112, 125));
        }
        if (!this.field10388 && var7.field6108) {
            var7.field6070 = class608.field8625.method3543(-24350, this.field10380);
            var7.field6139 = this.field10406;
            var7.field6117 = null;
            var7.field6104 = 0;
            var7.field6141 = this.field10403;
            var7.field6076 = false;
            if (var7.field6065 != null) {
                boolean var8 = false;
                for (class430 var9 = var7.field6065.method4023((byte) -68); var9 != null; var9 = var7.field6065.method4021((byte) 80)) {
                    class167 var10 = this.field10404.method1901(-4115, (int) var9.field6188);
                    if (var10.field2370) {
                        var9.method2656((byte) 121);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field6065 = null;
                }
            }
        }
        class348 var11 = this.field10386;
        synchronized (this.field10386) {
            this.field10386.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method4145(long arg0, byte arg1) {
        field10391++;
        if (arg1 != -46) {
            return null;
        }
        class99.field1419.setTime(new Date(arg0));
        int var3 = class99.field1419.get(7);
        int var4 = class99.field1419.get(5);
        int var5 = class99.field1419.get(2);
        int var6 = class99.field1419.get(1);
        int var7 = class99.field1419.get(11);
        int var8 = class99.field1419.get(12);
        int var9 = class99.field1419.get(13);
        return class683.field9699[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class504.field7321[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILjr;IILha;I)Ltd;")
    public final class515 method4146(int arg0, int arg1, int arg2, class132 arg3, int arg4, int arg5, class543 arg6, int arg7) {
        this.field10402.field199 = arg5;
        this.field10402.field203 = arg4;
        this.field10402.field206 = arg7;
        field10398++;
        if (arg0 != -20951) {
            this.field10405 = -78;
        }
        this.field10402.field202 = arg2;
        this.field10402.field201 = arg3 != null;
        this.field10402.field207 = arg1;
        this.field10402.field205 = arg6.field7874;
        return (class515) this.field10401.method169(this.field10402, (byte) 100);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method4147(boolean arg0) {
        if (arg0) {
            return null;
        }
        field10399++;
        String var1 = "www";
        if (class507.field7370 == class25.field223) {
            var1 = "www-wtrc";
        } else if (class382.field5535 == class25.field223) {
            var1 = "www-wtqa";
        } else if (class711.field10014 == class25.field223) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class565.field8191 != null) {
            var2 = "/p=" + class565.field8191;
        }
        return "http://" + var1 + "." + class528.field7683.field4260 + ".com/l=" + class45.field748 + "/a=" + class50.field813 + var2 + "/";
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lda;IIIILjr;Lha;Lha;ZBIZ)Ltd;")
    public final class515 method4148(class400 arg0, int arg1, int arg2, int arg3, int arg4, class132 arg5, class543 arg6, class543 arg7, boolean arg8, byte arg9, int arg10, boolean arg11) {
        field10390++;
        class515 var13 = this.method4146(arg9 ^ 0x51B6, arg3, arg4, arg5, arg10, arg2, arg7, arg1);
        if (var13 != null) {
            return var13;
        }
        class424 var14 = this.method4144(arg1, arg9 ^ 0xFFFFFFE2);
        if (arg9 != -97) {
            this.field10379 = 27;
        }
        if (arg4 > 1 && var14.field6142 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg4 >= var14.field6094[var16] && var14.field6094[var16] != 0) {
                    var15 = var14.field6142[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method4144(var15, 126);
            }
        }
        int[] var17 = var14.method2636(arg11, arg2, arg6, arg3, arg4, arg5, arg10, arg0, arg9 + 13, arg7);
        if (var17 == null) {
            return null;
        }
        class515 var18;
        if (arg8) {
            var18 = arg6.method3265(var17, 32, 36, 36, 0, (byte) 50);
        } else {
            var18 = arg7.method3265(var17, 32, 36, 36, 0, (byte) 50);
        }
        if (!arg8) {
            class22 var19 = new class22();
            var19.field203 = arg10;
            var19.field199 = arg2;
            var19.field206 = arg1;
            var19.field202 = arg4;
            var19.field205 = arg7.field7874;
            var19.field201 = arg5 != null;
            var19.field207 = arg3;
            this.field10401.method172(var19, var18, arg9 ^ 0x31);
        }
        return var18;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method4149(byte arg0) {
        class32 var2 = this.field10401;
        synchronized (this.field10401) {
            if (arg0 > -102) {
                this.method4143(-35);
            }
            this.field10401.method161(-126);
        }
        field10387++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public final void method4150(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field10404 = null;
        }
        field10382++;
        this.field10405 = arg0;
        class348 var3 = this.field10400;
        synchronized (this.field10400) {
            this.field10400.method2220(false);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
    public final void method4151(boolean arg0) {
        field10389++;
        class348 var2 = this.field10400;
        synchronized (this.field10400) {
            if (arg0) {
                this.method4141(true, 87);
            }
            this.field10400.method2220(arg0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBIII)I")
    public static final int method4152(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field10381++;
        if ((arg6 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg0 & 0x3;
        if (arg3 <= 81) {
            method4153(null, (byte) -28);
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 - arg4 - (arg5 + -1);
        } else if (var8 == 2) {
            return 7 + 1 - (arg2 + arg1);
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lsl;B)Lbba;")
    public static final class548 method4153(class479 arg0, byte arg1) {
        field10377++;
        int var2 = arg0.method2882(-1);
        class14 var3 = class176.method1266(24)[arg0.method2886(true)];
        if (arg1 > -111) {
            field10392 = 52;
        }
        class141 var4 = class501.method3050(true)[arg0.method2886(true)];
        int var5 = arg0.method2870(-11395);
        int var6 = arg0.method2870(-11395);
        return new class548(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
    public final void method4154(int arg0, boolean arg1) {
        class348 var3 = this.field10386;
        synchronized (this.field10386) {
            this.field10386.method2207(arg0, 1);
            if (arg1) {
                this.method4154(127, true);
            }
        }
        field10378++;
        class348 var4 = this.field10400;
        synchronized (this.field10400) {
            this.field10400.method2207(arg0, 1);
        }
        class32 var5 = this.field10401;
        synchronized (this.field10401) {
            this.field10401.method167(arg0, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)I")
    public static final int method4155(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 10) {
            method4152(33, -108, -35, (byte) -42, -29, 64, -14);
        }
        int var4 = arg2 & 0x3;
        field10394++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 4095 - arg1;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public final void method4156(byte arg0) {
        field10385++;
        class348 var2 = this.field10386;
        synchronized (this.field10386) {
            this.field10386.method2219(-5300);
        }
        class348 var3 = this.field10400;
        synchronized (this.field10400) {
            this.field10400.method2219(-5300);
        }
        int var4 = 62 % ((arg0 - 80) / 38);
        class32 var5 = this.field10401;
        synchronized (this.field10401) {
            this.field10401.method166((byte) -35);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lmp;IZLcn;Lla;Lla;)V")
    public class744(class315 arg0, int arg1, boolean arg2, class306 arg3, class423 arg4, class423 arg5) {
        this.field10404 = arg3;
        this.field10395 = arg4;
        this.field10380 = arg1;
        this.field10388 = arg2;
        this.field10383 = arg5;
        if (this.field10395 == null) {
            this.field10379 = 0;
        } else {
            int var7 = this.field10395.method2623(-1) - 1;
            this.field10379 = this.field10395.method2616(var7, 0) + var7 * 256;
        }
        this.field10406 = new String[] { null, null, class608.field8627.method3543(-24350, this.field10380), null, null };
        this.field10403 = new String[] { null, null, null, null, class608.field8628.method3543(-24350, this.field10380) };
    }
}
