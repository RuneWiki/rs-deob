import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class217 extends class197 implements class115 {

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Lwc;")
    public class58 field3096;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
    private boolean field3079;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lej;")
    public static class104 field3086 = new class104("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lii;")
    public static class474 field3080;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Lnk;")
    private class611 field3077;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "[[[J")
    public static long[][][] field3091;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field3085;
        return arg0 != -23611 ? true : this.field3096.method527((byte) -99);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field3097;
        if (arg1 != 21) {
            this.field3096 = null;
        }
        class157 var3 = this.field3096.method526(super.field2794, 262144, true, arg0, super.field2791, 0, true);
        if (var3 != null) {
            int var4 = super.field2794 >> 7;
            int var5 = super.field2791 >> 7;
            this.field3096.method517(var4, var5, var3, arg0, var5, false, var4, (byte) -42);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field3092;
        this.field3096.method528(true, arg1);
        if (arg0 > -50) {
            method1405(-81, (byte) 31, (class74) null, 66);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        ++field3088;
        if (arg0 <= 88) {
            method1404(70);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        this.field3096.method518(arg1, 8821);
        ++field3089;
        if (arg0 >= 0) {
            field3091 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        ++field3082;
        if (!arg0) {
            this.method747(67);
        }
        return this.field3096.field1016;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3086 = null;
        field3091 = null;
        field3080 = null;
        if (arg0 >= -4) {
            field3086 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLfca;I)Lfh;")
    public static final class560 method1405(int arg0, byte arg1, class74 arg2, int arg3) {
        ++field3076;
        if (arg1 != 54) {
            field3080 = null;
        }
        int var4 = arg2.field1185 | arg0 << 8;
        class560 var5 = (class560) class8.field95.method1880((byte) 123, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class49.field960.method242(class49.field960.method245(-110, var4), (byte) -116);
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class560 var7 = class491.method2850(arg1 + -32652, var6);
                    var7.field7750 = arg2;
                    class8.field95.method1882((long) var4 << 16, var7, arg1 ^ -3046);
                    return var7;
                }
            } else {
                int var8 = arg3 + 65536 << 8 | arg2.field1185;
                class560 var9 = (class560) class8.field95.method1880((byte) 123, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class49.field960.method242(class49.field960.method245(-116, var8), (byte) -119);
                    if (var10 != null) {
                        if (~var10.length >= -2) {
                            return null;
                        } else {
                            class560 var11 = class491.method2850(-32598, var10);
                            var11.field7750 = arg2;
                            class8.field95.method1882((long) var8 << 16, var11, -3028);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg2.field1185;
                        class560 var13 = (class560) class8.field95.method1880((byte) 123, (long) var12 << 16);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class49.field960.method242(class49.field960.method245(-100, var12), (byte) -127);
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class560 var15 = class491.method2850(-32598, var14);
                                    var15.field7750 = arg2;
                                    class8.field95.method1882((long) var12 << 16, var15, -3028);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field3081;
        class157 var3 = this.field3096.method526(super.field2794, 2048, true, arg1, super.field2791, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1344();
            var4.method1054(super.field2794, super.field2799, super.field2791);
            class254 var5 = null;
            if (this.field3079) {
                var5 = class110.method772(1, 1);
            }
            if (this.field3096.field1034 == null) {
                var3.method154(var4, var5 == null ? null : var5.field3525[0], 0);
            } else {
                class274 var6 = this.field3096.field1034.method2768();
                arg1.method1366(var3, var6, var4, var5 != null ? var5.field3525[0] : null, 0);
            }
            if (this.field3077 != null) {
                class510.method2947(var3, super.field2791, 0, this.field3077, super.field2794, super.field2799);
            } else {
                this.field3077 = class563.method3213(super.field2799, var3, super.field2794, super.field2791, true);
            }
            int var7 = super.field2794 >> 7;
            int var8 = super.field2791 >> 7;
            this.field3096.method517(var7, var8, var3, arg1, var8, arg0, var7, (byte) -115);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        ++field3087;
        return arg0 ? null : this.field3077;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            this.field3077 = null;
        }
        ++field3090;
        return this.field3096.field1031;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        ++field3083;
        if (arg2 < 79) {
            this.method748(true);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        ++field3078;
        int var4 = 28 % ((arg0 - -54) / 60);
        return this.field3096.method526(0, arg2, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field3093;
        if (arg0 != 1) {
            this.field3077 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lqa;Lss;IIIIIZII)V")
    public class217(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field4883, arg1.field4954, arg1.field4912);
        this.field3096 = new class58(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3079 = arg1.field4881 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field3098;
        if (arg0 != 24194) {
            this.method747(107);
        }
        return this.field3096.field1038;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        ++field3084;
        return arg0 != 1 ? false : false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.method748(false);
        }
        ++field3094;
        class157 var5 = this.field3096.method526(super.field2794, 131072, false, arg0, super.field2791, arg3 + -1, false);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field2794, super.field2799, super.field2791);
            return var5.method143(arg1, arg2, var6, false);
        }
    }
}
