import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class461 {

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Luaa;")
    private class395 field6677 = new class395(64);

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "Lgp;")
    private class561 field6681;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Luaa;")
    public static class395 field6670 = new class395(260);

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lml;")
    public static class36 field6673 = new class36("WTI", 5);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    public final void method2697(int arg0, int arg1) {
        field6674++;
        class395 var3 = this.field6677;
        synchronized (this.field6677) {
            if (arg0 < 11) {
                field6670 = null;
            }
            this.field6677.method2406(-127);
            this.field6677 = new class395(arg1);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lhn;IIII)V")
    public static final void method2698(class85 arg0, int arg1, int arg2, int arg3, int arg4) {
        field6671++;
        class298 var5 = arg0.method772(0);
        if (arg2 != -24469) {
            field6670 = null;
        }
        int var6 = arg0.field1558 - arg0.field1557.field1751 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg0.field1496 > 25) {
                if (arg1 < 0 && var5.field4306 != -1) {
                    arg0.field1531 = var5.field4306;
                } else if (arg1 <= 0 || var5.field4309 == -1) {
                    arg0.field1531 = var5.field4321;
                } else {
                    arg0.field1531 = var5.field4309;
                }
                arg0.field1489 = false;
            } else if (!arg0.field1489 || !var5.method1868(arg0.field1531, (byte) -23)) {
                arg0.field1531 = var5.method1866(-1);
                arg0.field1489 = arg0.field1531 != -1;
            }
        } else if (arg0.field1526 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class243.field3518[arg3] - arg0.field1557.field1751 & 0x3FFF;
            if (arg4 == 2 && var5.field4275 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4297 != -1) {
                    arg0.field1531 = var5.field4297;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4305 != -1) {
                    arg0.field1531 = var5.field4305;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4301 == -1) {
                    arg0.field1531 = var5.field4275;
                } else {
                    arg0.field1531 = var5.field4301;
                }
            } else if (arg4 == 0 && var5.field4310 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4300 != -1) {
                    arg0.field1531 = var5.field4300;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4282 != -1) {
                    arg0.field1531 = var5.field4282;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4283 == -1) {
                    arg0.field1531 = var5.field4310;
                } else {
                    arg0.field1531 = var5.field4283;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4320 != -1) {
                arg0.field1531 = var5.field4320;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4290 != -1) {
                arg0.field1531 = var5.field4290;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4313 == -1) {
                arg0.field1531 = var5.field4321;
            } else {
                arg0.field1531 = var5.field4313;
            }
            arg0.field1489 = false;
        } else if (var6 == 0 && arg0.field1496 <= 25) {
            if (arg4 == 2 && var5.field4275 != -1) {
                arg0.field1531 = var5.field4275;
            } else if (arg4 == 0 && var5.field4310 != -1) {
                arg0.field1531 = var5.field4310;
            } else {
                arg0.field1531 = var5.field4321;
            }
            arg0.field1489 = false;
        } else {
            arg0.field1489 = false;
            if (arg4 == 2 && var5.field4275 != -1) {
                if (arg1 < 0 && var5.field4291 != -1) {
                    arg0.field1531 = var5.field4291;
                } else if (arg1 <= 0 || var5.field4319 == -1) {
                    arg0.field1531 = var5.field4275;
                } else {
                    arg0.field1531 = var5.field4319;
                }
            } else if (arg4 == 0 && var5.field4310 != -1) {
                if (arg1 < 0 && var5.field4278 != -1) {
                    arg0.field1531 = var5.field4278;
                } else if (arg1 <= 0 || var5.field4302 == -1) {
                    arg0.field1531 = var5.field4310;
                } else {
                    arg0.field1531 = var5.field4302;
                }
            } else if (arg1 < 0 && var5.field4286 != -1) {
                arg0.field1531 = var5.field4286;
            } else if (arg1 <= 0 || var5.field4298 == -1) {
                arg0.field1531 = var5.field4321;
            } else {
                arg0.field1531 = var5.field4298;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFIILvo;FIFIB)[B")
    public static final byte[] method2699(float arg0, float arg1, float arg2, int arg3, int arg4, class433 arg5, float arg6, int arg7, float arg8, int arg9, byte arg10) {
        field6678++;
        byte[] var11 = new byte[arg3 * arg4 * arg9];
        if (arg10 != -23) {
            field6670 = null;
        }
        class144.method1062(arg8, arg4, arg6, var11, 0, arg7, (byte) -117, arg0, arg2, arg1, arg9, arg3, arg5);
        return var11;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static final void method2700(byte arg0) {
        field6675++;
        if (arg0 != 2) {
            method2700((byte) 121);
        }
        if (class307.field4425) {
            return;
        }
        class521.field7236 = true;
        if (class202.field2854.field7903) {
            class523.field7256 = ((int) class523.field7256 - 65 & 0xFFFFFF80);
        } else {
            class563.field8074 += (-class563.field8074 - 24.0F) / 2.0F;
        }
        class307.field4425 = true;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)Lea;")
    public final class148 method2701(byte arg0, int arg1) {
        field6676++;
        class395 var3 = this.field6677;
        class148 var4;
        synchronized (this.field6677) {
            var4 = (class148) this.field6677.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == 85) {
            class561 var5 = this.field6681;
            byte[] var6;
            synchronized (this.field6681) {
                var6 = this.field6681.method3175(class173.method1188((byte) 127, arg1), (byte) -53, class582.method3335(arg1, -1200298902));
            }
            class148 var7 = new class148();
            if (var6 != null) {
                var7.method1073(104, new class268(var6));
            }
            class395 var8 = this.field6677;
            synchronized (this.field6677) {
                this.field6677.method2408(var7, (long) arg1, -117);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
    public final void method2702(byte arg0) {
        field6680++;
        int var2 = 53 % ((arg0 + 58) / 44);
        class395 var3 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2406(108);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
    public final void method2703(int arg0, int arg1) {
        field6679++;
        class395 var3 = this.field6677;
        synchronized (this.field6677) {
            if (arg1 > -20) {
                this.field6677 = null;
            }
            this.field6677.method2397(arg0, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method2704(int arg0) {
        field6670 = null;
        if (arg0 == -1) {
            field6673 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class461(class584 arg0, int arg1, class561 arg2) {
        this.field6681 = arg2;
        if (this.field6681 != null) {
            int var4 = this.field6681.method3185(-25) - 1;
            this.field6681.method3164(var4, true);
        }
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V")
    public final void method2705(byte arg0) {
        if (arg0 != -100) {
            return;
        }
        field6672++;
        class395 var2 = this.field6677;
        synchronized (this.field6677) {
            this.field6677.method2404((byte) -91);
        }
    }
}
