import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class260 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lcc;")
    public static class327 field3769 = new class327(100);

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "[I")
    public static int[] field3775 = new int[25];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lpo;")
    public static class10 field3764;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[Lwe;")
    public static class232[] field3773;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;IIIZ)V", line = 17)
    public void method962(class260 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3768++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()Z", line = 24)
    public boolean method950() {
        field3771++;
        return false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Lvc;", line = 32)
    public class260 method943(int arg0, int arg1, int arg2) {
        field3770++;
        return this;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 44)
    public static void method1791(byte arg0) {
        field3764 = null;
        if (arg0 > -32) {
            method1792(-104, false, (class352) null, -23, (class287) null);
        }
        field3775 = null;
        field3769 = null;
        field3773 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLfg;ILho;)V", line = 58)
    public static final void method1792(int arg0, boolean arg1, class352 arg2, int arg3, class287 arg4) {
        field3767++;
        if (arg4.field4123 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg4.field4123.length];
            for (int var7 = 0; var7 < (var6.length / 2); var7++) {
                int var8 = arg4.field4123[var7 * 2] + arg2.field5503;
                int var9 = arg2.field5504 - arg4.field4123[var7 * 2 + 1];
                int var10 = var6[var7 * 2] = (class38.field476 - class38.field475) * (var8 - class38.field483) / (class38.field481 - class38.field483) + class38.field475;
                int var11 = var6[var7 * 2 + 1] = (class38.field479 - class38.field472) * (var9 - class38.field471) / (class38.field468 - class38.field471) + class38.field472;
                if (class38.field475 < var10 && var10 < class38.field476 && class38.field472 < var11 && var11 < class38.field479) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class174.method1277(var6, arg4.field4138, arg4.field4138 >>> 24);
            for (int var12 = 0; var12 < var6.length / 2 - 1; var12++) {
                class37.method256(var6[var12 * 2], var6[var12 * 2 + 1], var6[(var12 + 1) * 2], var6[(var12 + 1) * 2 + 1], arg4.field4113, arg4.field4113 >>> 24);
            }
            class37.method256(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg4.field4113, arg4.field4113 >>> 24);
        } else if (arg2.field5498) {
            return;
        }
        if (arg1) {
            field3775 = (int[]) null;
        }
        class65 var13 = new class65(arg2);
        class153 var14 = null;
        if (arg4.field4129 != -1) {
            if (arg2.field5492 && arg4.field4147 != -1) {
                var14 = (class153) arg4.method1969(true, arg1, true);
            } else {
                var14 = (class153) arg4.method1969(false, false, true);
            }
            if (var14 != null) {
                if (class308.field4544 > 0 && (class144.field2014 != -1 && class144.field2014 == arg2.field5493 || class130.field1774 != -1 && class130.field1774 == arg4.field4139)) {
                    int var15;
                    if (class193.field2672 <= 50) {
                        var15 = class193.field2672 * 3;
                    } else {
                        var15 = 300 - class193.field2672 * 3;
                    }
                    class37.method232(arg2.field5501, arg2.field5497, var14.field2024 / 2 + 7, 16776960, var15);
                    class37.method232(arg2.field5501, arg2.field5497, var14.field2024 / 2 + 5, 16776960, var15);
                    class37.method232(arg2.field5501, arg2.field5497, var14.field2024 / 2 + 3, 16776960, var15);
                    class37.method232(arg2.field5501, arg2.field5497, var14.field2024 / 2 + 1, 16776960, var15);
                    class37.method232(arg2.field5501, arg2.field5497, var14.field2024 / 2, 16776960, var15);
                }
                var14.method937(arg2.field5501 - (var14.field2024 >> 1), arg2.field5497 - (var14.field2029 >> 1));
                var13.field821 = (var14.field2029 >> 1) + arg3 + arg2.field5497;
                var13.field817 = arg0 + arg2.field5501 - (var14.field2024 >> 1);
                var13.field822 = (var14.field2024 >> 1) + arg0 + arg2.field5501;
                var13.field819 = arg2.field5497 + arg3 - (var14.field2029 >> 1);
            }
        }
        if (arg4.field4136 != null) {
            if (var14 == null) {
                class97.method698(arg2, arg0, 0, arg3, true, 0, var13, arg4);
            } else {
                class97.method698(arg2, arg0, (var14.field2029 >> 1) + 5, arg3, false, 0, var13, arg4);
            }
        }
        if (var13.method470(class105.field1361, -101, class80.field1028) && arg4.field4132 != null) {
            if (arg4.field4132[4] != null) {
                class148.method1140((long) arg2.field5493, arg4.field4139, 0, arg4.field4130, arg4.field4132[4], (short) 1011, -1, (byte) -120);
            }
            if (arg4.field4132[3] != null) {
                class148.method1140((long) arg2.field5493, arg4.field4139, 0, arg4.field4130, arg4.field4132[3], (short) 1003, -1, (byte) -56);
            }
            if (arg4.field4132[2] != null) {
                class148.method1140((long) arg2.field5493, arg4.field4139, 0, arg4.field4130, arg4.field4132[2], (short) 1008, -1, (byte) -119);
            }
            if (arg4.field4132[1] != null) {
                class148.method1140((long) arg2.field5493, arg4.field4139, 0, arg4.field4130, arg4.field4132[1], (short) 1002, -1, (byte) 28);
            }
            if (arg4.field4132[0] != null) {
                class148.method1140((long) arg2.field5493, arg4.field4139, 0, arg4.field4130, arg4.field4132[0], (short) 1012, -1, (byte) -54);
            }
        }
        class287.field4140.method415((byte) -121, var13);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILwf;I)V", line = 193)
    public static final void method1793(int arg0, int arg1, class333 arg2, int arg3) {
        field3765++;
        if (arg2.field5164 == 0) {
            arg2.field5188 = arg2.field5128;
        } else if (arg2.field5164 == 1) {
            arg2.field5188 = (arg0 - arg2.field5056) / 2 + arg2.field5128;
        } else if (arg2.field5164 == 2) {
            arg2.field5188 = arg0 - arg2.field5056 - arg2.field5128;
        } else if (arg2.field5164 == 3) {
            arg2.field5188 = arg2.field5128 * arg0 >> 14;
        } else if (arg2.field5164 == 4) {
            arg2.field5188 = (arg2.field5128 * arg0 >> 14) + (arg0 - arg2.field5056) / 2;
        } else {
            arg2.field5188 = arg0 - (arg2.field5128 * arg0 >> 14) - arg2.field5056;
        }
        if (arg2.field5130 == 0) {
            arg2.field5045 = arg2.field5174;
        } else if (arg2.field5130 == 1) {
            arg2.field5045 = (arg1 - arg2.field5172) / 2 + arg2.field5174;
        } else if (arg2.field5130 == 2) {
            arg2.field5045 = arg1 - arg2.field5172 - arg2.field5174;
        } else if (arg2.field5130 == 3) {
            arg2.field5045 = arg2.field5174 * arg1 >> 14;
        } else if (arg2.field5130 == 4) {
            arg2.field5045 = (arg2.field5174 * arg1 >> 14) + (arg1 - arg2.field5172) / 2;
        } else {
            arg2.field5045 = arg1 - (arg2.field5174 * arg1 >> 14) - arg2.field5172;
        }
        if (arg3 < 92 || !class40.field503 || !(client.method891(arg2).field1981 != 0 || arg2.field5105 == 0)) {
            return;
        }
        if (arg2.field5045 < 0) {
            arg2.field5045 = 0;
        } else if ((arg2.field5172 + arg2.field5045) > arg1) {
            arg2.field5045 = arg1 - arg2.field5172;
        }
        if (arg2.field5188 < 0) {
            arg2.field5188 = 0;
        } else if (arg0 < arg2.field5188 + arg2.field5056) {
            arg2.field5188 = arg0 - arg2.field5056;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lfh;I)V", line = 270)
    public static final void method1794(class140 arg0, int arg1) {
        class289.field4183 = arg0;
        field3772++;
        if (arg1 != 2) {
            method1792(-63, false, (class352) null, -6, (class287) null);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJILne;)V")
    public abstract void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public abstract void method573(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
    public abstract int method583();
}
