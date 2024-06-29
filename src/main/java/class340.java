import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class340 extends class501 {

    @OriginalMember(owner = "client!wu", name = "Gb", descriptor = "[I")
    public static int[] field4556 = new int[500];

    @OriginalMember(owner = "client!wu", name = "Nb", descriptor = "Z")
    public static boolean field4563 = false;

    @OriginalMember(owner = "client!wu", name = "Db", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wu", name = "Eb", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wu", name = "Fb", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!wu", name = "Hb", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!wu", name = "Ib", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!wu", name = "Jb", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!wu", name = "Kb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wu", name = "Lb", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!wu", name = "Mb", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z[Lin;I)V")
    public static final void method1986(boolean arg0, class78[] arg1, int arg2) {
        if (!arg0) {
            for (int var3 = 0; ~var3 > ~arg1.length; ++var3) {
                class78 var4 = arg1[var3];
                if (var4 != null) {
                    if (var4.field1075 == 0) {
                        if (var4.field1046 != null) {
                            method1986(false, var4.field1046, arg2);
                        }
                        class685 var5 = (class685) class4.field26.method970((byte) 89, (long) var4.field1129);
                        if (var5 != null) {
                            class295.method1799((byte) -68, var5.field9776, arg2);
                        }
                    }
                    if (~arg2 == -1 && var4.field1089 != null) {
                        class368 var6 = new class368();
                        var6.field4957 = var4;
                        var6.field4962 = var4.field1089;
                        class97.method708(var6);
                    }
                    if (~arg2 == -2 && var4.field1030 != null) {
                        if (~var4.field1034 <= -1) {
                            class78 var7 = class582.method3319((byte) -36, var4.field1129);
                            if (var7 == null || var7.field1046 == null || ~var7.field1046.length >= ~var4.field1034 || var7.field1046[var4.field1034] != var4) {
                                continue;
                            }
                        }
                        class368 var8 = new class368();
                        var8.field4962 = var4.field1030;
                        var8.field4957 = var4;
                        class97.method708(var8);
                    }
                }
            }
            ++field4557;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(FI)V")
    public final void method1987(float arg0, int arg1) {
        ++field4560;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6855[super.field6892++] = (byte) (var3 >> 24);
        super.field6855[super.field6892++] = (byte) (var3 >> 16);
        if (arg1 != -368862280) {
            field4563 = false;
        }
        super.field6855[super.field6892++] = (byte) (var3 >> 8);
        super.field6855[super.field6892++] = (byte) var3;
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(Z)V")
    public static void method1988(boolean arg0) {
        field4556 = null;
        if (!arg0) {
            field4561 = -24;
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
    public class340(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method1989(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4562;
        int var9 = -75 / ((68 - arg2) / 51);
        if (arg0 >= 1 && arg6 >= 1 && class401.field5620 + -2 >= arg0 && class257.field3508 + -2 >= arg6) {
            int var10 = arg3;
            if (arg3 < 3 && class467.method2640(arg0, arg6, (byte) -80)) {
                var10 = arg3 + 1;
            }
            if (!class366.field4875.method537(class503.field6917, 0) && !class659.method3701(class540.field7305, var10, arg0, (byte) -51, arg6)) {
                return;
            }
            if (class295.field4051 == null) {
                return;
            }
            class138.field1953.method3526(arg0, -18, class151.field2218[arg3], arg7, arg6, arg3, class334.field4506);
            if (~arg8 <= -1) {
                boolean var11 = class366.field4875.field9373;
                class366.field4875.field9373 = true;
                class138.field1953.method3523(arg6, arg0, 2, arg1, arg4, class334.field4506, arg5, arg8, var10, arg3, class151.field2218[arg3]);
                class366.field4875.field9373 = var11;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z")
    public static final boolean method1990(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field4556 = null;
        }
        ++field4559;
        return (33 & arg1) != 0;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1991(byte arg0, String arg1) {
        ++field4558;
        int var2 = arg1.length();
        int var3 = -66 / ((arg0 - -16) / 62);
        if (~var2 == -1) {
            return new byte[0];
        } else {
            int var4 = var2 - -3 & -4;
            int var5 = var4 / 4 * 3;
            if (var4 + -2 < var2 && ~class469.method2657(14198, arg1.charAt(var4 + -2)) != 0) {
                if (var4 + -1 >= var2 || ~class469.method2657(14198, arg1.charAt(var4 - 1)) == 0) {
                    --var5;
                }
            } else {
                var5 -= 2;
            }
            byte[] var6 = new byte[var5];
            class410.method2392(0, false, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(FI)V")
    public final void method1992(float arg0, int arg1) {
        ++field4554;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field6855[super.field6892++] = (byte) var3;
        super.field6855[super.field6892++] = (byte) (var3 >> 8);
        super.field6855[super.field6892++] = (byte) (var3 >> 16);
        super.field6855[super.field6892++] = (byte) (var3 >> 24);
        if (arg1 != 23507) {
            method1988(false);
        }
    }
}
