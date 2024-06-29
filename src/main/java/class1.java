import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 extends class337 implements class18 {

    @OriginalMember(owner = "client!is", name = "w", descriptor = "Lop;")
    public class262 field2;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "Z")
    private boolean field7;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field5 = -1;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "F")
    public static float field16 = 0.0F;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "Z")
    public static boolean field12 = true;

    @OriginalMember(owner = "client!is", name = "U", descriptor = "Lik;")
    public static class463 field25;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!is", name = "E", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!is", name = "S", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!is", name = "T", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "Lbl;")
    public static class211 field22;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Ldr;")
    public static class261 field14;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field24;
        int var2 = -111 / ((arg0 - -1) / 46);
        return this.field2.method1626(-27318);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        this.field2.method1628(arg1, (byte) -85);
        ++field9;
        if (arg0 != 76) {
            this.method11(105);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 > -3) {
            return -111;
        } else {
            ++field23;
            return this.field2.field4005;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIIIZIIII)V")
    public class1(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class424.method2617(arg3, arg2, 3));
        this.field2 = new class262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field7 = ~arg1.field1184 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field17;
        class292 var5 = this.field2.method1630(super.field5013, false, false, arg2, 105, 65536, super.field5017);
        if (arg3 != 2) {
            field22 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class361 var6 = arg2.method434();
            var6.method611(super.field5017 - -super.field5010, super.field5012, super.field5014 + super.field5013);
            return var5.method1297(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
    public static void method5(int arg0) {
        if (arg0 == 1) {
            field25 = null;
            field14 = null;
            field22 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        this.field2.method1633(true, arg0);
        ++field11;
        if (arg1 > -68) {
            this.method7(true);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            field5 = 116;
        }
        ++field3;
        return this.field2.field3998;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIB)I")
    public static final int method8(int arg0, int arg1, byte arg2) {
        ++field19;
        int var3 = 0;
        while (~arg0 < -1) {
            var3 = arg1 & 1 | var3 << 1;
            --arg0;
            arg1 >>>= 1;
        }
        int var4 = 77 / ((arg2 - 43) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field1;
        if (arg0 <= 26) {
            this.method16((byte) 38);
        }
        return this.field2.field3985;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field18;
        class292 var3 = this.field2.method1630(super.field5013, false, true, arg0, 118, 1024, super.field5017);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 7) {
                method13(-121, (byte) -84, 60);
            }
            class361 var4 = arg0.method434();
            var4.method611(super.field5017 + super.field5010, super.field5012, super.field5014 + super.field5013);
            class70 var5 = null;
            if (this.field7) {
                var5 = class383.method2309(78, 1);
            }
            if (this.field2.field3989 == null) {
                var3.method1282(var4, var5 != null ? var5.field899[0] : null, 0);
            } else {
                class439 var6 = this.field2.field3989.method2050();
                arg0.method369(var3, var6, var4, var5 != null ? var5.field899[0] : null, 0);
            }
            this.field2.method1623(super.field5017 >> 7, super.field5017 >> 7, super.field5013 >> 7, var3, (byte) 126, super.field5013 >> 7, arg0, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field13;
        if (arg0 != -21910) {
            method5(-119);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = -99 / ((arg2 - 46) / 47);
        ++field4;
        return this.field2.method1630(0, false, false, arg0, 122, arg1, 0);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBI)I")
    public static final int method13(int arg0, byte arg1, int arg2) {
        ++field21;
        if (arg1 >= -33) {
            field12 = true;
        }
        int var3 = arg2 - -(arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return 255 & var5 >> 19;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLiq;II)Lgo;")
    public static final class272 method14(byte arg0, class134 arg1, int arg2, int arg3) {
        ++field6;
        if (arg0 <= 105) {
            return null;
        } else {
            byte[] var4 = arg1.method823(arg3, -20334, arg2);
            return var4 == null ? null : new class272(var4);
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 > 114) {
            ++field15;
            class292 var3 = this.field2.method1630(super.field5013, false, true, arg0, 111, 131072, super.field5017);
            if (var3 != null) {
                this.field2.method1623(super.field5017 >> 7, super.field5017 >> 7, super.field5013 >> 7, var3, (byte) 114, super.field5013 >> 7, arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(B)I")
    public final int method16(byte arg0) {
        ++field8;
        if (arg0 >= -93) {
            this.method10((class261) null, 79);
        }
        return this.field2.method1631(-125);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
    public static final void method17(int arg0, long[] arg1, Object[] arg2, int arg3, int arg4) {
        if (arg4 < 73) {
            field12 = true;
        }
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var9;
            for (int var10 = arg3; arg0 > var10; ++var10) {
                if (arg1[var10] < (long) (1 & var10) + var7) {
                    long var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    Object var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var9;
            method17(var6 + -1, arg1, arg2, arg3, 88);
            method17(arg0, arg1, arg2, var6 + 1, 111);
        }
        ++field20;
    }

    static {
        new class151("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field25 = new class463("", 15);
    }
}
