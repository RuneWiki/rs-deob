import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class173 extends class168 implements class164 {

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lgp;")
    public class36 field2577;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Z")
    private boolean field2592;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lak;")
    public static class234 field2590 = new class234("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lya;Z)V", line = 4)
    public final void method25(class38 arg0, boolean arg1) {
        ++field2579;
        class475 var3 = this.field2577.method249(super.field2481, super.field2483, 262144, true, arg0, (byte) -105, arg1);
        if (var3 != null) {
            int var4 = super.field2481 >> 7;
            int var5 = super.field2483 >> 7;
            this.field2577.method243(arg0, var4, var5, var3, false, var4, -23689, var5);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I", line = 25)
    public final int method624(byte arg0) {
        ++field2583;
        return arg0 >= -119 ? -124 : this.field2577.field405;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 36)
    public static final String method1166(int arg0, boolean arg1, int arg2, int arg3) {
        ++field2575;
        if (~arg0 <= -3 && ~arg0 >= -37) {
            if (arg1 && arg3 >= 0) {
                int var4 = 2;
                int var5 = arg3 / arg0;
                while (var5 != 0) {
                    var5 /= arg0;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                int var7 = 125 % ((arg2 - -65) / 61);
                for (int var8 = var4 + -1; var8 > 0; --var8) {
                    int var9 = arg3;
                    arg3 /= arg0;
                    int var10 = var9 - arg0 * arg3;
                    if (var10 >= 10) {
                        var6[var8] = (char) (var10 + 87);
                    } else {
                        var6[var8] = (char) (var10 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg3, arg0);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "(I)V", line = 85)
    public static void method1167(int arg0) {
        if (arg0 != 48) {
            field2593 = -1;
        }
        field2590 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B)[B", line = 95)
    public static final byte[] method1168(int arg0, byte[] arg1) {
        ++field2582;
        if (arg0 >= -38) {
            return null;
        } else {
            class217 var2 = new class217(arg1);
            int var3 = var2.method1515((byte) 126);
            int var4 = var2.method1556(101);
            if (var4 >= 0 && (class393.field5870 == 0 || ~class393.field5870 <= ~var4)) {
                if (~var3 == -1) {
                    byte[] var5 = new byte[var4];
                    var2.method1540(0, var5, var4, 115);
                    return var5;
                } else {
                    int var6 = var2.method1556(111);
                    if (var6 >= 0 && (~class393.field5870 == -1 || var6 <= class393.field5870)) {
                        byte[] var7 = new byte[var6];
                        if (~var3 == -2) {
                            class250.method1688(var7, var6, arg1, var4, 9);
                        } else {
                            class171.field2547.method2626(var7, var2, (byte) -119);
                        }
                        return var7;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 148)
    public final void method616(int arg0) {
        if (arg0 == 23504) {
            ++field2587;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lya;ZI)Lt;", line = 158)
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        ++field2585;
        return arg1 ? null : this.field2577.method249(0, 0, arg2, false, arg0, (byte) -73, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLya;)V", line = 170)
    public final void method619(boolean arg0, class38 arg1) {
        this.field2577.method245(arg1, 73);
        if (!arg0) {
            this.field2577 = null;
        }
        ++field2576;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLya;II)Z", line = 181)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        ++field2589;
        class475 var5 = this.field2577.method249(super.field2481, super.field2483, 131072, false, arg1, (byte) -114, false);
        if (arg0 > -119) {
            this.method27((byte) 2, (class38) null, 79, -38);
        }
        if (var5 == null) {
            return false;
        } else {
            class125 var6 = arg1.method296();
            var6.method206(super.field2486 + super.field2481, super.field2480, super.field2488 + super.field2483);
            return var5.method440(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILya;)V", line = 201)
    public final void method623(int arg0, class38 arg1) {
        this.field2577.method251(arg1, 1);
        if (arg0 <= 125) {
            this.method616(73);
        }
        ++field2586;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lya;Ljt;IIIIIZIIIIII)V", line = 212)
    public class173(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class428.method2667(-96, arg11, arg12));
        this.field2577 = new class36(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field2592 = arg1.field922 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Z", line = 222)
    public static final boolean method1169(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field2584;
            return class60.field718 != 0 ? true : class448.field6563.method1871(-108);
        }
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)I", line = 240)
    public final int method1079(int arg0) {
        ++field2591;
        return arg0 != 0 ? 3 : this.field2577.method242((byte) 78);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lya;I)Lag;", line = 255)
    public final class484 method29(class38 arg0, int arg1) {
        if (arg1 <= 22) {
            field2593 = -59;
        }
        ++field2578;
        class475 var3 = this.field2577.method249(super.field2481, super.field2483, 2048, true, arg0, (byte) -77, false);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method296();
            var4.method206(super.field2486 + super.field2481, super.field2480, super.field2483 - -super.field2488);
            class484 var5 = null;
            if (this.field2592) {
                var5 = class133.method971(1, 0);
            }
            if (this.field2577.field406 != null) {
                class341 var6 = this.field2577.field406.method2221();
                arg0.method311(var3, var6, var4, var5 != null ? var5.field6964[0] : null, 0);
            } else {
                var3.method439(var4, var5 != null ? var5.field6964[0] : null, 0);
            }
            int var7 = super.field2481 >> 7;
            int var8 = super.field2483 >> 7;
            this.field2577.method243(arg0, var7, var8, var3, true, var7, -23689, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I", line = 296)
    public final int method621(int arg0) {
        if (arg0 != 3021) {
            return 121;
        } else {
            ++field2588;
            return this.field2577.field416;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I", line = 308)
    public final int method627(int arg0) {
        ++field2580;
        if (arg0 != 23326) {
            method1169(true);
        }
        return this.field2577.field427;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z", line = 319)
    public final boolean method614(int arg0) {
        ++field2581;
        if (arg0 != -1086) {
            field2590 = null;
        }
        return this.field2577.method240(13227);
    }
}
