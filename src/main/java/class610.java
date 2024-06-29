import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class610 extends class220 {

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    public static int field8467 = -2;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "Lr;")
    public static class166 field8463;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qp", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field8469;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "[B")
    private byte[] field8466;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "[Lwl;")
    public static class374[] field8464;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V")
    public static void method3419(int arg0) {
        if (arg0 != -1) {
            field8464 = null;
        }
        field8463 = null;
        field8464 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3420(int arg0, int arg1, int arg2, int arg3) {
        field8461++;
        int var5 = -44 % (arg3 / 32);
        this.field8466 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1792(arg2, (byte) -124, arg0, arg1);
        return this.field8466;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIILjava/lang/Class;)Ltg;")
    public static final class210 method3421(int arg0, int arg1, int arg2, Class arg3) {
        class390 var4 = class295.field4051[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class467 var5 = var4.field5536; var5 != null; var5 = var5.field6421) {
            class210 var6 = var5.field6419;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2972 == arg1 && var6.field2963 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class610() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIB)V")
    public final void method513(byte arg0, int arg1, byte arg2) {
        if (arg0 != 115) {
            return;
        }
        field8465++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field8466[var10001] = (byte) (var5 * 3 >> 5);
        this.field8466[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8468++;
        if (arg3 > -4) {
            field8464 = null;
        }
        if (arg7 < 0 || arg0 < 0 || arg7 >= (class401.field5620 - 1) || (class257.field3508 - 1) <= arg0) {
            return;
        }
        if (class295.field4051 == null) {
            return;
        }
        if (arg2 == 0) {
            class526 var8 = (class526) class119.method848(arg5, arg7, arg0);
            class526 var9 = (class526) class390.method2292(arg5, arg7, arg0);
            if (var8 != null && arg1 != 2) {
                if (var8 instanceof class73) {
                    ((class73) var8).field973.method2808(arg6, (byte) 1);
                } else {
                    class340.method1989(arg7, arg6, (byte) -107, arg5, arg1, arg4, arg0, arg2, var8.method211((byte) -28));
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class73)) {
                    class340.method1989(arg7, arg6, (byte) 123, arg5, arg1, arg4, arg0, arg2, var9.method211((byte) -30));
                    return;
                }
                ((class73) var9).field973.method2808(arg6, (byte) 1);
                return;
            }
            return;
        }
        if (arg2 == 1) {
            class526 var10 = (class526) class41.method365(arg5, arg7, arg0);
            if (var10 != null) {
                if (!(var10 instanceof class255)) {
                    int var11 = var10.method211((byte) -122);
                    if (arg1 != 4 && arg1 != 5) {
                        if (arg1 != 6) {
                            if (arg1 == 7) {
                                class340.method1989(arg7, arg6, (byte) -106, arg5, 4, (arg4 + 2 & 0x3) + 4, arg0, arg2, var11);
                            } else if (arg1 == 8) {
                                class340.method1989(arg7, arg6, (byte) -83, arg5, 4, arg4 + 4, arg0, arg2, var11);
                                class340.method1989(arg7, arg6, (byte) -18, arg5, 4, (arg4 + 2 & 0x3) + 4, arg0, arg2, var11);
                                return;
                            }
                            return;
                        }
                        class340.method1989(arg7, arg6, (byte) -15, arg5, 4, arg4 + 4, arg0, arg2, var11);
                        return;
                    }
                    class340.method1989(arg7, arg6, (byte) 127, arg5, 4, arg4, arg0, arg2, var11);
                    return;
                }
                ((class255) var10).field3482.method2808(arg6, (byte) 1);
                return;
            }
            return;
        }
        if (arg2 == 2) {
            class526 var12 = (class526) method3421(arg5, arg7, arg0, field8469 == null ? (field8469 = method3423("kj")) : field8469);
            if (var12 != null) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (var12 instanceof class540) {
                    ((class540) var12).field7289.method2808(arg6, (byte) 1);
                    return;
                }
                class340.method1989(arg7, arg6, (byte) -107, arg5, arg1, arg4, arg0, arg2, var12.method211((byte) -62));
                return;
            }
            return;
        }
        if (arg2 != 3) {
            return;
        }
        class526 var13 = (class526) class423.method2445(arg5, arg7, arg0);
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class20) {
            ((class20) var13).field213.method2808(arg6, (byte) 1);
            return;
        }
        class340.method1989(arg7, arg6, (byte) -78, arg5, arg1, arg4, arg0, arg2, var13.method211((byte) -125));
        return;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3423(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
