import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class569 extends class482 implements class437 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    private int field7874;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
    public static volatile boolean field7877 = true;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 4)
    public static final void method3208(int arg0, int arg1, int arg2) {
        ++field7882;
        class19 var3 = class364.method2236(1248116640, arg2, arg1);
        var3.method110(arg1 + 12141);
        var3.field171 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 17)
    public final void method2685(boolean arg0) {
        ++field7879;
        if (!arg0) {
            super.field6487.method3493(126, this);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BIB)V", line = 29)
    public final void method2513(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 >= -85) {
            field7877 = true;
        }
        ++field7873;
        this.method2686(arg0, true, arg1);
        this.field7874 = arg2;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lpea;ILjaclib/memory/Buffer;IZ)V", line = 43)
    public class569(class641 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7874 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I", line = 51)
    public final int method2514(int arg0) {
        ++field7876;
        if (arg0 >= -89) {
            method3212(61, false, (String) null);
        }
        return super.field6483;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)J", line = 62)
    public final long method2515(byte arg0) {
        ++field7881;
        return arg0 >= -72 ? -123L : 0L;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lpea;I[BIZ)V", line = 74)
    public class569(class641 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7874 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ldga;I)Ljt;", line = 82)
    public static final class308 method3209(class138 arg0, int arg1) {
        if (arg1 != 3069) {
            field7877 = false;
        }
        ++field7871;
        return new class308(arg0.method924(arg1 ^ 3071), arg0.method924(2), arg0.method924(2), arg0.method924(2), arg0.method904(arg1 + -2947), arg0.method904(117), arg0.method957((byte) -109));
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BZILjava/lang/String;)I", line = 93)
    public static final int method3210(byte[] arg0, boolean arg1, int arg2, String arg3) {
        ++field7880;
        int var4 = arg2;
        int var5 = arg3.length();
        if (arg1) {
            method3211((byte[]) null, 19, -87, -113, -57, -50, (byte[]) null, -95, -105);
        }
        for (int var6 = 0; ~var5 < ~var6; var6 += 4) {
            int var7 = class637.method3472(-1, arg3.charAt(var6));
            int var8 = ~var5 < ~(var6 + 1) ? class637.method3472(-1, arg3.charAt(var6 + 1)) : -1;
            int var9 = var6 + 2 < var5 ? class637.method3472(-1, arg3.charAt(var6 + 2)) : -1;
            int var10 = var5 > var6 - -3 ? class637.method3472(-1, arg3.charAt(var6 - -3)) : -1;
            arg0[arg2++] = (byte) class288.method1722(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class288.method1722(class230.method1424(240, var8 << 4), var9 >>> 2);
            if (~var10 == 0) {
                break;
            }
            arg0[arg2++] = (byte) class288.method1722(var10, class230.method1424(3, var9) << 6);
        }
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIIIII[BII)V", line = 135)
    public static final void method3211(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7883;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 3);
        for (int var11 = -arg5; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg3++;
                arg6[var10001] += arg0[arg2++];
                int var14 = arg3++;
                arg6[var14] += arg0[arg2++];
                int var15 = arg3++;
                arg6[var15] += arg0[arg2++];
                int var16 = arg3++;
                arg6[var16] += arg0[arg2++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg3++;
                arg6[var10001] += arg0[arg2++];
            }
            arg3 += arg8;
            arg2 += arg1;
        }
        if (arg7 < 48) {
            field7877 = false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 179)
    public static final void method3212(int arg0, boolean arg1, String arg2) {
        ++field7878;
        if (arg2 != null) {
            if (~class641.field8818 <= -101) {
                class365.method2239(4, 19074, class243.field3250.method1491(class350.field5121, (byte) 126));
            } else {
                String var3 = class303.method1825(arg2, 1);
                if (var3 != null) {
                    if (arg0 == 4) {
                        for (int var4 = 0; ~var4 > ~class641.field8818; ++var4) {
                            String var8 = class303.method1825(class353.field5147[var4], 1);
                            if (var8 != null && var8.equals(var3)) {
                                class365.method2239(4, 19074, arg2 + class243.field3251.method1491(class350.field5121, (byte) 126));
                                return;
                            }
                            if (class291.field3892[var4] != null) {
                                String var9 = class303.method1825(class291.field3892[var4], 1);
                                if (var9 != null && var9.equals(var3)) {
                                    class365.method2239(4, 19074, arg2 + class243.field3251.method1491(class350.field5121, (byte) 127));
                                    return;
                                }
                            }
                        }
                        for (int var5 = 0; ~var5 > ~class110.field1323; ++var5) {
                            String var6 = class303.method1825(class320.field4711[var5], 1);
                            if (var6 != null && var6.equals(var3)) {
                                class365.method2239(4, 19074, class243.field3256.method1491(class350.field5121, (byte) 126) + arg2 + class243.field3257.method1491(class350.field5121, (byte) 126));
                                return;
                            }
                            if (class248.field3335[var5] != null) {
                                String var7 = class303.method1825(class248.field3335[var5], 1);
                                if (var7 != null && var7.equals(var3)) {
                                    class365.method2239(4, 19074, class243.field3256.method1491(class350.field5121, (byte) 125) + arg2 + class243.field3257.method1491(class350.field5121, (byte) 127));
                                    return;
                                }
                            }
                        }
                        if (class303.method1825(class596.field8164.field7191, 1).equals(var3)) {
                            class365.method2239(4, 19074, class243.field3253.method1491(class350.field5121, (byte) 125));
                        } else {
                            ++class65.field861;
                            class389.method2326((byte) 118, class658.field9273);
                            class253.field3491.method951((byte) -82, 1 + class500.method2820(1, arg2));
                            class253.field3491.method905(arg2, -18);
                            class253.field3491.method951((byte) -82, !arg1 ? 0 : 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I", line = 279)
    public final int method2516(int arg0) {
        if (arg0 != -18831) {
            this.method2513(-11, (byte[]) null, 104, (byte) 65);
        }
        ++field7875;
        return this.field7874;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)I", line = 297)
    public static final int method3213(int arg0, byte arg1, int arg2) {
        if (arg1 != 56) {
            method3209((class138) null, 1);
        }
        ++field7872;
        return arg0 != 1 && arg0 != 3 ? class299.field3999[arg2 & 3] : class309.field4146[3 & arg2];
    }
}
