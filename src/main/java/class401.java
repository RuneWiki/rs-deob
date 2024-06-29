import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class401 {

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "Ltq;")
    private class536 field5315 = new class536(128);

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "Ltq;")
    public class536 field5317 = new class536(64);

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lwm;")
    public class30 field5308;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lwm;")
    private class30 field5313;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lut;")
    public static class719 field5305 = new class719();

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static void method2319(int arg0) {
        field5305 = null;
        int var1 = -96 / ((arg0 - 4) / 60);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2320(byte arg0, int arg1) {
        if (arg0 >= -110) {
            return null;
        } else {
            field5316++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF9A69) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIBIII)V")
    public static final void method2321(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5309++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        if (arg2 != -26) {
            return;
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (arg4 >= class80.field1131 && class405.field5375 >= arg4) {
            int var21 = class774.method4226(class498.field6390, (byte) -49, class30.field274, arg1 + arg3);
            int var22 = class774.method4226(class498.field6390, (byte) -115, class30.field274, arg3 - arg1);
            class54.method333(var21, class207.field2840[arg4], 7, var22, arg5);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (var24 >= class80.field1131 && var23 <= class405.field5375) {
                int var25 = class774.method4226(class498.field6390, (byte) -87, class30.field274, arg3 + var6);
                int var26 = class774.method4226(class498.field6390, (byte) -68, class30.field274, arg3 - var6);
                if (var23 >= class80.field1131) {
                    class54.method333(var25, class207.field2840[var23], 7, var26, arg5);
                }
                if (var24 <= class405.field5375) {
                    class54.method333(var25, class207.field2840[var24], 7, var26, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZII)V")
    public final void method2322(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.method2326(-81);
        }
        field5312++;
        this.field5315 = new class536(arg1);
        this.field5317 = new class536(arg2);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)Lek;")
    public final class624 method2323(int arg0, boolean arg1) {
        field5306++;
        class536 var3 = this.field5315;
        class624 var4;
        synchronized (this.field5315) {
            var4 = (class624) this.field5315.method2931((long) arg0, (byte) -78);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1) {
            class30 var5 = this.field5313;
            byte[] var6;
            synchronized (this.field5313) {
                var6 = this.field5313.method139(36, (byte) -94, arg0);
            }
            class624 var7 = new class624();
            var7.field7907 = this;
            var7.field7954 = arg0;
            if (var6 != null) {
                var7.method3338((byte) 61, new class234(var6));
            }
            var7.method3341(113);
            class536 var8 = this.field5315;
            synchronized (this.field5315) {
                this.field5315.method2918((long) arg0, var7, 93);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public final void method2324(int arg0) {
        field5304++;
        class536 var2 = this.field5315;
        synchronized (this.field5315) {
            this.field5315.method2919(0);
        }
        class536 var3 = this.field5317;
        synchronized (this.field5317) {
            int var4 = -97 % ((48 - arg0) / 36);
            this.field5317.method2919(0);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IB)V")
    public final void method2325(int arg0, byte arg1) {
        if (arg1 != -115) {
            return;
        }
        class536 var3 = this.field5315;
        synchronized (this.field5315) {
            this.field5315.method2928(true, arg0);
        }
        field5310++;
        class536 var4 = this.field5317;
        synchronized (this.field5317) {
            this.field5317.method2928(true, arg0);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
    public final void method2326(int arg0) {
        class536 var2 = this.field5315;
        synchronized (this.field5315) {
            this.field5315.method2932((byte) 80);
        }
        field5311++;
        class536 var3 = this.field5317;
        synchronized (this.field5317) {
            if (arg0 != -8014) {
                this.field5315 = null;
            }
            this.field5317.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
    public static final void method2327(int arg0) {
        if (class669.field8692 < 0) {
            class490.field6304 = -1;
            class669.field8692 = 0;
            class774.field10556 = -1;
        }
        field5307++;
        if (class402.field5356 < class669.field8692) {
            class774.field10556 = -1;
            class669.field8692 = class402.field5356;
            class490.field6304 = -1;
        }
        if (arg0 < ~class238.field3238) {
            class238.field3238 = 0;
            class490.field6304 = -1;
            class774.field10556 = -1;
        }
        if (class402.field5342 < class238.field3238) {
            class774.field10556 = -1;
            class490.field6304 = -1;
            class238.field3238 = class402.field5342;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
    public static final void method2328(int arg0, int arg1) {
        field5314++;
        class774.field10556 = -1;
        if (arg0 == 37) {
            class402.field5336 = 3.0F;
        } else if (arg0 == 50) {
            class402.field5336 = 4.0F;
        } else if (arg0 == 75) {
            class402.field5336 = 6.0F;
        } else if (arg0 == 100) {
            class402.field5336 = 8.0F;
        } else if (arg0 == 200) {
            class402.field5336 = 16.0F;
        }
        class774.field10556 = -1;
        if (arg1 > -86) {
            method2319(-22);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lega;ILwm;Lwm;)V")
    public class401(class473 arg0, int arg1, class30 arg2, class30 arg3) {
        this.field5308 = arg3;
        this.field5313 = arg2;
        this.field5313.method138(0, 36);
    }
}
