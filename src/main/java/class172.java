import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class172 extends class454 implements class614 {

    @OriginalMember(owner = "client!vp", name = "X", descriptor = "Z")
    private boolean field2460 = false;

    @OriginalMember(owner = "client!vp", name = "Y", descriptor = "Lkh;")
    public class15 field2461;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "Z")
    private boolean field2445;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2443 = new String[100];

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "I")
    public static int field2452 = 0;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!vp", name = "Q", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!vp", name = "R", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!vp", name = "S", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!vp", name = "T", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!vp", name = "U", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!vp", name = "V", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!vp", name = "W", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!vp", name = "Z", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!vp", name = "ab", descriptor = "Lnu;")
    private class548 field2463;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
    public final int method1171(byte arg0) {
        if (arg0 <= 39) {
            this.method1184(-42);
        }
        ++field2444;
        return this.field2461.method89(-99);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        if (arg6) {
            ++field2454;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lr;I)V")
    public final void method1172(class166 arg0, int arg1) {
        if (arg1 <= 26) {
            this.field2463 = null;
        }
        ++field2451;
        this.field2461.method88((byte) -101, arg0);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Lr;Z)Lkq;")
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field2458;
        class55 var3 = this.field2461.method87((byte) -97, false, arg0, 2048, arg1, super.field3029, super.field3024);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg0.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            class549 var5 = null;
            if (this.field2445) {
                var5 = class26.method321(1, 0);
            }
            this.field2461.method79(var3, super.field6521, super.field6526, var4, true, super.field6524, super.field6516, -1, arg0);
            if (class676.field9574) {
                var3.method495(var4, var5 == null ? null : var5.field7711[0], class341.field5008, 0);
            } else {
                var3.method513(var4, var5 != null ? var5.field7711[0] : null, 0);
            }
            if (this.field2461.field134 != null) {
                class499 var6 = this.field2461.field134.method339();
                if (class676.field9574) {
                    arg0.method165(var6, class341.field5008);
                } else {
                    arg0.method156(var6);
                }
            }
            this.field2460 = var3.method545() || this.field2461.field134 != null;
            if (this.field2463 == null) {
                this.field2463 = class149.method1060(super.field3029, super.field3024, var3, !arg1, super.field3018);
            } else {
                class525.method3017(var3, -104, this.field2463, super.field3018, super.field3029, super.field3024);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)V")
    public final void method1174(int arg0) {
        if (arg0 != -24082) {
            method1178((byte) -94);
        }
        ++field2455;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
    public final int method1175(int arg0) {
        if (arg0 != 24563) {
            this.method1172((class166) null, 13);
        }
        ++field2456;
        return this.field2461.field151;
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        ++field2446;
        int var2 = -127 % ((arg0 - -44) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lr;Z)V")
    public final void method1176(class166 arg0, boolean arg1) {
        if (arg1) {
            this.field2463 = null;
        }
        ++field2447;
        this.field2461.method91((byte) -119, arg0);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILr;)V")
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 != 0) {
            this.method947(6);
        }
        ++field2462;
        class55 var3 = this.field2461.method87((byte) -97, true, arg1, 262144, true, super.field3029, super.field3024);
        if (var3 != null) {
            class391 var4 = arg1.method130();
            var4.method252(super.field3024, super.field3018, super.field3029);
            this.field2461.method79(var3, super.field6521, super.field6526, var4, false, super.field6524, super.field6516, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        if (arg0 != -40) {
            field2452 = 116;
        }
        field2443 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)I")
    public final int method1179(boolean arg0) {
        ++field2442;
        if (!arg0) {
            this.method1172((class166) null, -117);
        }
        return this.field2461.field148;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
    public final boolean method1180(int arg0) {
        if (arg0 < 100) {
            return true;
        } else {
            ++field2441;
            return this.field2461.method81((byte) -121);
        }
    }

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "(I)Z")
    public final boolean method1181(int arg0) {
        ++field2453;
        return arg0 != -1 ? false : false;
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)I")
    public final int method1182(int arg0) {
        if (arg0 != -32768) {
            return 35;
        } else {
            ++field2448;
            return this.field2461.method84(true);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(ILr;)Lnu;")
    public final class548 method1183(int arg0, class166 arg1) {
        if (arg0 != 6433) {
            this.method1180(-14);
        }
        ++field2459;
        return this.field2463;
    }

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "(I)Z")
    public final boolean method1184(int arg0) {
        ++field2449;
        int var2 = -47 / ((-1 - arg0) / 59);
        return this.field2460;
    }

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        ++field2457;
        return arg0 > -26;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lr;Let;IIIIIZIIIIIII)V")
    public class172(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field7812 == -2, class664.method3672(arg12, arg13, (byte) -11));
        this.field2461 = new class15(arg0, arg1, arg12, arg13, super.field3019, arg3, arg4, arg6, arg7, arg14);
        this.field2445 = arg1.field7746 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field2440;
        class55 var5 = this.field2461.method87((byte) -97, false, arg2, 131072, false, super.field3029, super.field3024);
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            if (arg0 != -26798) {
                this.method1180(-19);
            }
            return !class676.field9574 ? var5.method529(arg3, arg1, var6, false) : var5.method492(arg3, arg1, var6, false, class341.field5008);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
    public final int method1186(int arg0) {
        ++field2450;
        return arg0 != -9960 ? 59 : this.field2461.field140;
    }
}
