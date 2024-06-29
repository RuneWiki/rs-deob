import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class471 extends class12 implements class267 {

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "Lji;")
    public class472 field7207;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "Z")
    private boolean field7192;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "Z")
    public static boolean field7200 = false;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[Lec;")
    public static class68[] field7209 = new class68[0];

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "Lbi;")
    public static class104 field7185 = new class104(84, 6);

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "Z")
    public static boolean field7211 = false;

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "Lbi;")
    public static class104 field7212 = null;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "F")
    public static float field7199;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "Lmn;")
    public static class162 field7197;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        ++field7188;
        class536 var5 = this.field7207.method2945(super.field120, 131072, false, (byte) -7, super.field129, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class205 var6 = arg3.method1231();
            if (arg1 != 32689) {
                field7200 = false;
            }
            var6.method158(super.field129, super.field126, super.field120);
            return var5.method298(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Ljd;")
    public static final class426 method2927(int arg0, int arg1) {
        ++field7190;
        class426[] var2 = class41.method254(-7);
        int var3 = -24 % ((-11 - arg0) / 47);
        for (int var4 = 0; ~var4 > ~var2.length; ++var4) {
            class426 var5 = var2[var4];
            if (~var5.field6443 == ~arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field7195;
        class536 var3 = this.field7207.method2945(super.field120, 262144, true, (byte) -7, super.field129, true, arg1);
        if (arg0 != -1) {
            this.field7207 = null;
        }
        if (var3 != null) {
            int var4 = super.field129 >> 7;
            int var5 = super.field120 >> 7;
            this.field7207.method2940(var4, var4, var5, arg1, var3, -114, var5, false);
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
    public static final void method2928(int arg0) {
        if (arg0 < -27) {
            for (class356 var1 = (class356) class518.field7685.method2616(255); var1 != null; var1 = (class356) class518.field7685.method2619(255)) {
                var1.method2355();
            }
            ++field7205;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        ++field7194;
        if (arg0) {
            this.method104((class497) null, 24);
        }
        return this.field7207.method2945(0, arg2, false, (byte) -7, 0, false, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        ++field7187;
        return arg0 < 53 ? 123 : this.field7207.field7227;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        ++field7204;
        int var8 = -75 % ((arg4 - 27) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (arg0) {
            field7200 = false;
        }
        ++field7201;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2929(boolean arg0, String arg1) {
        ++field7191;
        if (!arg0) {
            field7199 = -0.17690247F;
        }
        return class21.method138(10, true, false, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZI)V")
    public static final void method2930(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7189;
        if (arg0 >= 8000 && ~arg0 >= -48001) {
            class221.field3742 = arg0;
            class65.field1016 = arg1;
            class309.field4835 = arg2;
            if (arg3 != -16919) {
                field7200 = false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field7210;
        if (arg0 > -95) {
            this.method105(101, 46, 84, (class497) null);
        }
        return this.field7207.method2946(108);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        if (arg0 == 287) {
            ++field7186;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
    public static void method2931(int arg0) {
        field7212 = null;
        field7197 = null;
        field7185 = null;
        if (arg0 != 1751617831) {
            field7211 = true;
        }
        field7209 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lza;Loq;IIIIIZII)V")
    public class471(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field2120, arg1.field2106, arg1.field2086);
        this.field7207 = new class472(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field7192 = arg1.field2079 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        this.field7207.method2941(false, arg0);
        ++field7196;
        if (arg1 != 26768) {
            this.field7207 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        ++field7208;
        if (arg0) {
            this.method934(-61);
        }
        return false;
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V")
    public static final void method2932(byte arg0) {
        if (arg0 > -63) {
            field7211 = true;
        }
        ++field7206;
        if (~class46.field606 == -7) {
            class46.field606 = 7;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        if (arg0 <= 87) {
            return -93;
        } else {
            ++field7202;
            return this.field7207.field7233;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field7198;
        class536 var3 = this.field7207.method2945(super.field120, 2048, false, (byte) -7, super.field129, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            class205 var4 = arg1.method1231();
            var4.method158(super.field129, super.field126, super.field120);
            class514 var5 = null;
            if (this.field7192) {
                var5 = class104.method706(0, 1);
            }
            if (this.field7207.field7222 == null) {
                var3.method295(var4, var5 == null ? null : var5.field7629[0], 0);
            } else {
                class519 var6 = this.field7207.field7222.method2354();
                arg1.method1291(var3, var6, var4, var5 != null ? var5.field7629[0] : null, 0);
            }
            if (arg0 != 2) {
                method2931(-113);
            }
            int var7 = super.field129 >> 7;
            int var8 = super.field120 >> 7;
            this.field7207.method2940(var7, var7, var8, arg1, var3, -128, var8, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        ++field7193;
        this.field7207.method2938(-9, arg1);
        if (arg0 != -6682) {
            this.field7192 = false;
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        if (arg0 != 18) {
            return 84;
        } else {
            ++field7203;
            return this.field7207.field7232;
        }
    }
}
