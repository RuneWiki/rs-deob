import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class433 extends class195 implements class83 {

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "Z")
    private boolean field6257 = false;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "Lui;")
    public class210 field6263;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "Z")
    private boolean field6260;

    @OriginalMember(owner = "client!bg", name = "lb", descriptor = "Lsb;")
    public static class266 field6272 = new class266(26, 6);

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!bg", name = "eb", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!bg", name = "gb", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!bg", name = "hb", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!bg", name = "ib", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!bg", name = "jb", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!bg", name = "kb", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!bg", name = "mb", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!bg", name = "nb", descriptor = "Lmq;")
    public static class472 field6274;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "Lbm;")
    private class98 field6249;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2631(int arg0, byte[] arg1) {
        ++field6265;
        class61 var2 = new class61(arg1);
        int var3 = var2.method732(-559537960);
        int var4 = var2.method730(-92);
        if (arg0 > -12) {
            method2632((class167) null, 26);
        }
        if (var4 >= 0 && (~class27.field927 == -1 || var4 <= class27.field927)) {
            if (var3 == 0) {
                byte[] var8 = new byte[var4];
                var2.method704(0, var4, var8, 0);
                return var8;
            } else {
                int var5 = var2.method730(-40);
                if (var5 < 0 || ~class27.field927 != -1 && class27.field927 < var5) {
                    throw new RuntimeException();
                } else {
                    byte[] var6 = new byte[var5];
                    if (~var3 != -2) {
                        class124 var7 = class153.field2601;
                        synchronized (class153.field2601) {
                            class153.field2601.method1068(var2, var6, (byte) 11);
                        }
                    } else {
                        class197.method1417(var6, var5, arg1, var4, 9);
                    }
                    return var6;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        if (!arg0) {
            return 50;
        } else {
            ++field6262;
            return this.field6263.method1472(120);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lr;I)V")
    public static final void method2632(class167 arg0, int arg1) {
        class542.field7569 = class673.method3796(arg0, true, (byte) -50, class34.field972);
        if (arg1 == -1) {
            ++field6252;
            class79.field1581 = class422.method2571(arg0, class34.field972, (byte) -123);
            class363.field5394 = class673.method3796(arg0, true, (byte) 105, class545.field7727);
            class612.field8916 = class422.method2571(arg0, class545.field7727, (byte) -72);
            class367.field5445 = class673.method3796(arg0, true, (byte) -120, class224.field3362);
            class141.field2478 = class422.method2571(arg0, class224.field3362, (byte) -58);
        }
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(B)V")
    public static void method2633(byte arg0) {
        field6274 = null;
        if (arg0 != -86) {
            method2632((class167) null, 102);
        }
        field6272 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field6266;
        class55 var3 = this.field6263.method1470(262144, (byte) 85, super.field9815, arg1, arg0, true, super.field9806);
        if (var3 != null) {
            int var4 = super.field9806 >> 9;
            int var5 = super.field9815 >> 9;
            class396 var6 = arg1.method53();
            var6.method905(super.field9806, super.field9809, super.field9815);
            this.field6263.method1473(var4, var4, var5, arg1, var6, var5, var3, 0, false);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        ++field6264;
        if (!arg1) {
            this.field6263.method1464(arg0, -1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (arg0 != -29645) {
            field6271 = 74;
        }
        ++field6273;
        return this.field6249;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        if (arg0 < 73) {
            this.method841((byte) 20);
        }
        ++field6270;
        return this.field6263.method1468((byte) 86);
    }

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field6254;
        return arg0 >= -38 ? 26 : this.field6263.method1467(0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        if (arg0 != 52) {
            return 111;
        } else {
            ++field6250;
            return this.field6263.field3212;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        ++field6247;
        if (!arg0) {
            field6271 = 102;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field6258;
        class55 var5 = this.field6263.method1470(131072, (byte) 72, super.field9815, arg0, false, false, super.field9806);
        int var6 = -106 / ((-30 - arg1) / 36);
        if (var5 == null) {
            return false;
        } else {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806 - -super.field3063, super.field9809, super.field3061 + super.field9815);
            return !class7.field521 ? var5.method358(arg2, arg3, var7, false) : var5.method318(arg2, arg3, var7, false, class477.field6857);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field6259;
        class55 var3 = this.field6263.method1470(2048, (byte) 81, super.field9815, arg1, false, true, super.field9806);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 92160000) {
                field6274 = null;
            }
            class396 var4 = arg1.method53();
            var4.method905(super.field9806 - -super.field3063, super.field9809, super.field9815 - -super.field3061);
            class531 var5 = null;
            if (this.field6260) {
                var5 = class370.method2347(1, (byte) -125);
            }
            int var6 = super.field9806 >> 9;
            int var7 = super.field9815 >> 9;
            this.field6263.method1473(var6, var6, var7, arg1, var4, var7, var3, 0, true);
            if (!class7.field521) {
                var3.method334(var4, var5 == null ? null : var5.field7451[0], 0);
            } else {
                var3.method317(var4, var5 != null ? var5.field7451[0] : null, class477.field6857, 0);
            }
            if (this.field6263.field3222 != null) {
                class518 var8 = this.field6263.field3222.method582();
                if (class7.field521) {
                    arg1.method72(var8, class477.field6857);
                } else {
                    arg1.method123(var8);
                }
            }
            this.field6257 = var3.method363() || this.field6263.field3222 != null;
            if (this.field6249 != null) {
                class653.method3724(super.field9806, super.field9809, arg0 + -92129045, var3, this.field6249, super.field9815);
            } else {
                this.field6249 = class86.method857(super.field9815, -1, super.field9809, var3, super.field9806);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = -101 / ((43 - arg0) / 44);
        ++field6267;
        return this.field6263.field3193;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        ++field6253;
        int var2 = 63 / ((arg0 - -36) / 53);
        return this.field6257;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        ++field6269;
        if (arg0 != -105) {
            this.field6263 = null;
        }
        return this.field6263.field3203;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIIIII)V")
    public class433(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field6263 = new class210(arg0, arg1, arg10, arg11, super.field9814, arg3, arg4, arg6, arg7, arg12);
        this.field6260 = ~arg1.field1290 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        ++field6248;
        if (arg0 != -36) {
            this.method846((byte) 75);
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2634(String[] arg0, int arg1) {
        ++field6268;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg1 >= -117) {
            method2633((byte) -56);
        }
        while (~var3 > -6) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            ++var3;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        ++field6261;
        this.field6263.method1463(false, arg1);
        if (arg0 <= 60) {
            field6251 = 92;
        }
    }
}
