import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class708 {

    @OriginalMember(owner = "client!io", name = "g", descriptor = "Lbh;")
    private class538 field9894 = new class538(64);

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Lbh;")
    public class538 field9900 = new class538(60);

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Lwu;")
    public class557 field9896;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lwu;")
    private class557 field9897;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
    public static int[] field9888 = new int[5];

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field9899 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public int field9901;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public final void method3980(int arg0) {
        field9898++;
        class538 var2 = this.field9894;
        synchronized (this.field9894) {
            this.field9894.method3210(false);
        }
        class538 var3 = this.field9900;
        synchronized (this.field9900) {
            this.field9900.method3210(false);
            if (arg0 >= -80) {
                method3985((byte) -80, null);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
    public final void method3981(int arg0, int arg1) {
        field9889++;
        this.field9901 = arg1;
        if (arg0 != 6495) {
            this.method3987(true, -24);
        }
        class538 var3 = this.field9900;
        synchronized (this.field9900) {
            this.field9900.method3210(false);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method3982(byte arg0) {
        if (arg0 <= 114) {
            field9899 = 79;
        }
        field9888 = null;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
    public final void method3983(byte arg0) {
        int var2 = -23 % ((arg0 - 29) / 35);
        class538 var3 = this.field9894;
        synchronized (this.field9894) {
            this.field9894.method3202((byte) 127);
        }
        field9895++;
        class538 var4 = this.field9900;
        synchronized (this.field9900) {
            this.field9900.method3202((byte) 127);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([ILkc;[II[I)V")
    public static final void method3984(int[] arg0, class655 arg1, int[] arg2, int arg3, int[] arg4) {
        field9890++;
        int var5 = 0;
        if (arg3 != 1) {
            field9888 = null;
        }
        while (var5 < arg2.length) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field8394.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field8394[var9] = null;
                    } else {
                        class103 var10 = class274.field3684.method1881((byte) -80, var6);
                        int var11 = var10.field1476;
                        class696 var12 = arg1.field8394[var9];
                        if (var12 != null) {
                            if (var12.field9715 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field8394[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9714 = var8;
                                    var12.field9711 = 0;
                                    var12.field9713 = 0;
                                    var12.field9709 = 0;
                                    var12.field9716 = 1;
                                    if (!arg1.field8312) {
                                        class694.method3941(0, var10, arg1, true);
                                    }
                                } else if (var11 == 2) {
                                    var12.field9709 = 0;
                                }
                            } else if (var10.field1490 >= class274.field3684.method1881((byte) -80, var12.field9715).field1490) {
                                var12 = arg1.field8394[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class696 var13 = arg1.field8394[var9] = new class696();
                            var13.field9713 = 0;
                            var13.field9711 = 0;
                            var13.field9709 = 0;
                            var13.field9715 = var6;
                            var13.field9714 = var8;
                            var13.field9716 = 1;
                            if (!arg1.field8312) {
                                class694.method3941(0, var10, arg1, true);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BLvj;)Lida;")
    public static final class271 method3985(byte arg0, class26 arg1) {
        field9891++;
        int var2 = arg1.method194((byte) 119);
        class92 var3 = class327.method1910((byte) -17)[arg1.method194((byte) 119)];
        class482 var4 = class488.method2860((byte) 107)[arg1.method194((byte) 119)];
        int var5 = arg1.method173(-3);
        int var6 = arg1.method173(-3);
        int var7 = arg1.method193(2);
        int var8 = arg1.method193(arg0 + 71);
        int var9 = arg1.method189(255);
        if (arg0 != -69) {
            field9888 = null;
        }
        int var10 = arg1.method189(255);
        int var11 = arg1.method189(255);
        boolean var12 = arg1.method194((byte) 119) == 1;
        return new class271(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lbq;")
    public final class42 method3986(int arg0, int arg1) {
        field9892++;
        if (arg0 != -1) {
            return null;
        }
        class538 var3 = this.field9894;
        class42 var4;
        synchronized (this.field9894) {
            var4 = (class42) this.field9894.method3200((long) arg1, arg0 - 19982);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field9897;
        byte[] var6;
        synchronized (this.field9897) {
            var6 = this.field9897.method3322(class452.method2723(arg1, 1), class487.method2852(arg1, arg0 + 5), (byte) 85);
        }
        class42 var7 = new class42();
        var7.field592 = this;
        var7.field587 = arg1;
        if (var6 != null) {
            var7.method291(new class26(var6), 123);
        }
        class538 var8 = this.field9894;
        synchronized (this.field9894) {
            this.field9894.method3199((byte) 78, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V")
    public final void method3987(boolean arg0, int arg1) {
        field9893++;
        class538 var3 = this.field9894;
        synchronized (this.field9894) {
            this.field9894.method3204((byte) -76, arg1);
        }
        class538 var4 = this.field9900;
        synchronized (this.field9900) {
            if (!arg0) {
                this.field9901 = -63;
            }
            this.field9900.method3204((byte) -105, arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lwj;ILwu;Lwu;)V")
    public class708(class121 arg0, int arg1, class557 arg2, class557 arg3) {
        this.field9896 = arg3;
        this.field9897 = arg2;
        int var5 = this.field9897.method3341((byte) 111) - 1;
        this.field9897.method3333(var5, 3443);
    }
}
