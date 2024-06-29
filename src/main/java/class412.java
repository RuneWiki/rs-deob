import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class412 extends class311 implements class232 {

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "Lws;")
    public class238 field6067;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "Z")
    private boolean field6055;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "Lao;")
    public static class188 field6056 = new class188(6, 16);

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "[Ldn;")
    public static class357[] field6068 = new class357[14];

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field6071 = -2;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "Lao;")
    public static class188 field6070 = new class188(92, 2);

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I", line = 4)
    public final int method380(boolean arg0) {
        ++field6053;
        return !arg0 ? 38 : this.field6067.field3443;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Z", line = 15)
    public final boolean method121(int arg0) {
        if (arg0 != 26923) {
            method2545(-112, (byte[]) null, true);
        }
        ++field6058;
        return false;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILqa;IZLha;I)V", line = 30)
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field6059;
        if (arg3 <= 5) {
            this.method374((class162) null, -37);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILqa;)Lbw;", line = 41)
    public final class482 method114(int arg0, class162 arg1) {
        ++field6062;
        class121 var3 = this.field6067.method1549(super.field4457, 125, super.field4456, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else if (arg0 != -6796) {
            return null;
        } else {
            class413 var4 = arg1.method439();
            var4.method1008(super.field4456, super.field4451, super.field4457);
            class482 var5 = null;
            if (this.field6055) {
                var5 = class410.method2537((byte) -44, 1);
            }
            if (this.field6067.field3455 != null) {
                class492 var6 = this.field6067.field3455.method1519();
                arg1.method531(var3, var6, var4, var5 == null ? null : var5.field7079[0], 0);
            } else {
                var3.method910(var4, var5 != null ? var5.field7079[0] : null, 0);
            }
            int var7 = super.field4456 >> 7;
            int var8 = super.field4457 >> 7;
            this.field6067.method1551(var7, var8, var8, var3, true, var7, arg1, (byte) -105);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqa;I)V", line = 81)
    public final void method374(class162 arg0, int arg1) {
        this.field6067.method1544(0, arg0);
        if (arg1 != 28339) {
            field6068 = null;
        }
        ++field6066;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIZII)V", line = 93)
    public class412(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field7534, arg1.field7493);
        this.field6067 = new class238(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field6055 = arg1.field7491 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIBI)V", line = 103)
    public static final void method2542(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        class148.field2231 = 0L;
        ++field6064;
        int var5 = class428.method2611(1);
        if (~arg4 == -4 || var5 == 3) {
            arg1 = true;
        }
        if (arg3 <= 69) {
            method2545(61, (byte[]) null, false);
        }
        if (!class394.field5821.method524()) {
            arg1 = true;
        }
        class327.method2143(arg0, arg1, arg4, var5, false, arg2);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILqa;)Z", line = 126)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field6051;
        if (arg1 != -1) {
            return true;
        } else {
            class121 var5 = this.field6067.method1549(super.field4457, 127, super.field4456, false, arg3, 131072, false);
            if (var5 == null) {
                return false;
            } else {
                class413 var6 = arg3.method439();
                var6.method1008(super.field4456, super.field4451, super.field4457);
                return var5.method909(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)V", line = 146)
    public static void method2543(int arg0) {
        if (arg0 != 3) {
            method2543(-37);
        }
        field6068 = null;
        field6056 = null;
        field6070 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILqa;)Lc;", line = 158)
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        ++field6049;
        if (arg0 != 1584) {
            field6068 = null;
        }
        return this.field6067.method1549(0, 119, 0, false, arg2, arg1, false);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLbw;)V", line = 170)
    public static final void method2544(byte arg0, class482 arg1) {
        arg1.field7077 = null;
        ++field6065;
        if (arg0 == -49) {
            int var2 = arg1.field7079.length;
            for (int var3 = 0; var2 > var3; ++var3) {
                arg1.field7079[var3].field5443 = false;
            }
            class259[] var4 = class270.field3923;
            synchronized (class270.field3923) {
                if (~var2 > ~class270.field3923.length && ~class204.field2946[var2] > -201) {
                    class270.field3923[var2].method1637((byte) -76, arg1);
                    int var10002 = class204.field2946[var2]++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Lqa;I)V", line = 199)
    public final void method126(class162 arg0, int arg1) {
        if (arg1 >= -43) {
            this.field6055 = true;
        }
        ++field6052;
        class121 var3 = this.field6067.method1549(super.field4457, 110, super.field4456, true, arg0, 262144, true);
        if (var3 != null) {
            int var4 = super.field4456 >> 7;
            int var5 = super.field4457 >> 7;
            this.field6067.method1551(var4, var5, var5, var3, false, var4, arg0, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 220)
    public final void method117(int arg0) {
        ++field6050;
        if (arg0 >= -127) {
            field6070 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I", line = 231)
    public final int method379(byte arg0) {
        ++field6069;
        if (arg0 != -96) {
            this.method376(-51);
        }
        return this.field6067.field3469;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 244)
    public static final Object method2545(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 >= -123) {
            field6071 = -19;
        }
        ++field6063;
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < -137 && !class24.field434) {
                try {
                    class383 var3 = (class383) Class.forName("jc").newInstance();
                    var3.method1859(false, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class24.field434 = true;
                }
            }
            return arg2 ? class90.method735((byte) 115, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z", line = 279)
    public final boolean method377(int arg0) {
        if (arg0 > -27) {
            field6070 = null;
        }
        ++field6061;
        return this.field6067.method1545(-21741);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lqa;I)V", line = 294)
    public final void method373(class162 arg0, int arg1) {
        if (arg1 == -2304) {
            ++field6054;
            this.field6067.method1542(arg0, true);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I", line = 307)
    public final int method375(int arg0) {
        ++field6060;
        if (arg0 != -13015) {
            field6071 = 31;
        }
        return this.field6067.field3467;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 318)
    public final void method376(int arg0) {
        if (arg0 != 16931) {
            field6056 = null;
        }
        ++field6057;
    }
}
