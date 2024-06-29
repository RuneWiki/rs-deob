import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class733 {

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "Lvu;")
    private class680 field10178 = new class680();

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    private int field10167;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "I")
    private int field10180;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Lbaa;")
    private class130 field10173;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "[Z")
    public static boolean[] field10177 = new boolean[8];

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "Lst;")
    public static class335 field10170 = new class335(22, 6);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method4079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10165++;
        int var6 = arg3 - arg1;
        if (arg4 != -16192) {
            method4081((byte) 32, -55);
        }
        int var7 = arg0 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class268.method1823(arg2, arg5, arg0, arg1, 6257);
            }
        } else if (var7 == 0) {
            class30.method163(arg1, arg5, arg2, arg3, arg4 + 16191);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg1 < class607.field8185) {
                var11 = class607.field8185;
                var10 = (class607.field8185 * var8 >> 12) + var9;
            } else if (class726.field10064 < arg1) {
                var10 = var9 + (class726.field10064 * var8 >> 12);
                var11 = class726.field10064;
            } else {
                var10 = arg5;
                var11 = arg1;
            }
            int var12;
            int var13;
            if (class607.field8185 > arg3) {
                var12 = var9 + (class607.field8185 * var8 >> 12);
                var13 = class607.field8185;
            } else if (arg3 > class726.field10064) {
                var13 = class726.field10064;
                var12 = (class726.field10064 * var8 >> 12) + var9;
            } else {
                var12 = arg0;
                var13 = arg3;
            }
            if (var12 < class291.field4181) {
                var13 = (class291.field4181 - var9 << 12) / var8;
                var12 = class291.field4181;
            } else if (class262.field3848 < var12) {
                var13 = (class262.field3848 - var9 << 12) / var8;
                var12 = class262.field3848;
            }
            if (var10 < class291.field4181) {
                var10 = class291.field4181;
                var11 = (class291.field4181 - var9 << 12) / var8;
            } else if (class262.field3848 < var10) {
                var11 = (class262.field3848 - var9 << 12) / var8;
                var10 = class262.field3848;
            }
            class388.method2440(var11, arg2, var10, -65, var13, var12);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILcr;)V", line = 108)
    private final void method4080(int arg0, class294 arg1) {
        field10169++;
        long var3 = arg1.method982((byte) -117);
        class704 var5 = (class704) this.field10173.method812(114, var3);
        if (arg0 < 70) {
            this.field10180 = 60;
        }
        while (var5 != null) {
            if (var5.field9799.method981(arg1, 18498)) {
                this.method4087(-1416439380, var5);
                return;
            }
            var5 = (class704) this.field10173.method815((byte) 63);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)V", line = 137)
    public static final void method4081(byte arg0, int arg1) {
        for (class71 var2 = class444.field6171.method821((byte) 127); var2 != null; var2 = class444.field6171.method818(123)) {
            if (((long) arg1) == (var2.field1079 >> 48 & 0xFFFFL)) {
                var2.method549(6410);
            }
        }
        if (arg0 != -41) {
            field10177 = null;
        }
        field10179++;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 162)
    public static void method4082(int arg0) {
        field10177 = null;
        field10170 = null;
        if (arg0 != -1837581008) {
            method4082(80);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V", line = 173)
    public final void method4083(int arg0, int arg1) {
        if (class324.field4479 != null) {
            for (class704 var3 = (class704) this.field10178.method3828(91); var3 != null; var3 = (class704) this.field10178.method3829(-29202)) {
                if (var3.method2598(true)) {
                    if (var3.method2597(0) == null) {
                        var3.method549(6410);
                        var3.method21(123);
                        this.field10167 += var3.field9796;
                    }
                } else if ((++var3.field40) > ((long) arg1)) {
                    class704 var4 = class324.field4479.method806((byte) -127, var3);
                    this.field10173.method820(var3.field1079, (byte) -42, var4);
                    class175.method1108(var3, var4, 107);
                    var3.method549(6410);
                    var3.method21(123);
                }
            }
        }
        int var5 = 114 % ((-arg0 - 13) / 49);
        field10172++;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 225)
    public static final Object method4084(boolean arg0, int arg1, byte[] arg2) {
        field10175++;
        if (arg1 != 824028812) {
            method4081((byte) -11, -50);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class7.field61) {
            try {
                class483 var3 = (class483) Class.forName("rha").getDeclaredConstructor().newInstance();
                var3.method2942(arg2, -121);
                return var3;
            } catch (Throwable var4) {
                class7.field61 = true;
            }
        }
        return arg0 ? class605.method3446(3, arg2) : arg2;
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)I", line = 257)
    public final int method4085(int arg0) {
        if (arg0 != 1) {
            this.method4086((byte) 122);
        }
        field10176++;
        return this.field10180;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 268)
    public final void method4086(byte arg0) {
        this.field10178.method3833(20975);
        field10166++;
        this.field10173.method819(23738);
        if (arg0 <= 24) {
            method4084(false, -4, null);
        }
        this.field10167 = this.field10180;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILmha;)V", line = 294)
    private final void method4087(int arg0, class704 arg1) {
        if (arg0 != -1416439380) {
            method4084(false, -14, null);
        }
        field10171++;
        if (arg1 != null) {
            arg1.method549(6410);
            arg1.method21(109);
            this.field10167 += arg1.field9796;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lcr;Ljava/lang/Object;B)V", line = 314)
    public final void method4088(class294 arg0, Object arg1, byte arg2) {
        field10181++;
        this.method4092(1, 0, arg1, arg0);
        int var4 = -92 / ((arg2 - 24) / 59);
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)I", line = 324)
    public final int method4089(byte arg0) {
        if (arg0 > -59) {
            this.field10180 = 38;
        }
        field10174++;
        return this.field10167;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(I)V", line = 340)
    public class733(int arg0) {
        this.field10167 = arg0;
        this.field10180 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field10173 = new class130(var2);
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lcr;I)Ljava/lang/Object;", line = 355)
    public final Object method4090(class294 arg0, int arg1) {
        field10183++;
        long var3 = arg0.method982((byte) -117);
        if (arg1 != 0) {
            this.field10178 = null;
        }
        for (class704 var5 = (class704) this.field10173.method812(arg1 ^ 0x75, var3); var5 != null; var5 = (class704) this.field10173.method815((byte) -103)) {
            if (var5.field9799.method981(arg0, arg1 + 18498)) {
                Object var6 = var5.method2597(0);
                if (var6 != null) {
                    if (var5.method2598(true)) {
                        class419 var7 = new class419(arg0, var6, var5.field9796);
                        this.field10173.method820(var5.field1079, (byte) -42, var7);
                        this.field10178.method3827(56, var7);
                        var7.field40 = 0L;
                        var5.method549(6410);
                        var5.method21(111);
                    } else {
                        this.field10178.method3827(-87, var5);
                        var5.field40 = 0L;
                    }
                    return var6;
                }
                var5.method549(6410);
                var5.method21(arg1 ^ 0x63);
                this.field10167 += var5.field9796;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)V", line = 409)
    public final void method4091(byte arg0) {
        field10168++;
        if (arg0 <= 112) {
            return;
        }
        for (class704 var2 = (class704) this.field10178.method3828(98); var2 != null; var2 = (class704) this.field10178.method3829(-29202)) {
            if (var2.method2598(true)) {
                var2.method549(6410);
                var2.method21(123);
                this.field10167 += var2.field9796;
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILjava/lang/Object;Lcr;)V", line = 434)
    private final void method4092(int arg0, int arg1, Object arg2, class294 arg3) {
        field10182++;
        if (this.field10180 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method4080(arg1 + 118, arg3);
        this.field10167 -= arg0;
        while (this.field10167 < 0) {
            class704 var6 = (class704) this.field10178.method3834((byte) 115);
            this.method4087(arg1 ^ 0xAB92D9AC, var6);
        }
        class419 var5 = new class419(arg3, arg2, arg0);
        this.field10173.method820(arg3.method982((byte) -117), (byte) -42, var5);
        this.field10178.method3827(84, var5);
        var5.field40 = arg1;
    }
}
