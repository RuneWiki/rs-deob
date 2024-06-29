import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class493 {

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lfba;")
    private class348 field7104 = new class348(64);

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lfba;")
    private class348 field7106 = new class348(100);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lla;")
    private class423 field7102;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Lqk;")
    public static class146 field7098 = null;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Ldj;")
    public static class703 field7097 = new class703(14, 0, 4, 1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static final void method2998(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class157.field2258[var1] = false;
        }
        field7099++;
        class749.field10449 = 0;
        class188.field2635 = class564.field8174;
        class571.field8234 = class179.field2487;
        class165.field2351 = 5;
        class506.field7354 = class279.field3904;
        class729.field10234 = -1;
        if (arg0 != 3) {
            method3002(-89, null);
        }
        class616.field8773 = -1;
        class539.field7824 = -1;
        class405.field5770 = 0;
        class78.field1133 = class703.field9918;
        class442.field6292 = class123.field1698;
        class429.field6175 = class518.field7473;
        class39.field674 = -1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)Lvo;")
    public final class131 method2999(int arg0, boolean arg1) {
        field7101++;
        class348 var3 = this.field7104;
        class131 var4;
        synchronized (this.field7104) {
            var4 = (class131) this.field7104.method2216(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            method3003(-126, 110, -124, (byte) -64, -101);
        }
        class423 var5 = this.field7102;
        byte[] var6;
        synchronized (this.field7102) {
            var6 = this.field7102.method2600(0, class743.method4138(-28197, arg0), class282.method1802(arg0, 0));
        }
        class131 var7 = new class131();
        var7.field1809 = this;
        var7.field1799 = arg0;
        if (var6 != null) {
            var7.method922(new class479(var6), -1);
        }
        var7.method918(-102);
        class348 var8 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2213((byte) -16, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 3162) {
            method3000(-31, 83, -99, 11, 99, -43, 40, -104, -54, 42);
        }
        if (arg6 == arg7 && arg2 == arg4 && arg1 == arg5 && arg0 == arg8) {
            class207.method1479(arg7, arg9, (byte) 92, arg5, arg2, arg0);
        } else {
            int var10 = arg7;
            int var11 = arg2;
            int var12 = arg7 * 3;
            int var13 = arg2 * 3;
            int var14 = arg6 * 3;
            int var15 = arg4 * 3;
            int var16 = arg1 * 3;
            int var17 = arg8 * 3;
            int var18 = var14 + arg5 - arg7 - var16;
            int var19 = arg0 - var17 - (-var15 - -arg2);
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 - var15 - (-var13 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg7;
                int var34 = arg2 + (var28 + var30 + var32 >> 12);
                class207.method1479(var10, arg9, (byte) 108, var33, var11, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        field7093++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public static void method3001(boolean arg0) {
        if (arg0) {
            method3002(-97, null);
        }
        field7097 = null;
        field7098 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILha;)V")
    public static final void method3002(int arg0, class543 arg1) {
        if (arg0 != 3) {
            return;
        }
        field7095++;
        if (class147.field2154) {
            class399.method2418(0, arg1);
        } else {
            class274.method1775(arg0 ^ 0x7F, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBI)V")
    public static final void method3003(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7094++;
        if (arg3 != 11) {
            return;
        }
        if (arg0 < arg2) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class193.field2839[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class193.field2839[var6][arg1] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public final void method3004(byte arg0) {
        field7092++;
        class348 var2 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2219(-5300);
        }
        class348 var3 = this.field7106;
        synchronized (this.field7106) {
            this.field7106.method2219(-5300);
        }
        if (arg0 < 14) {
            this.field7104 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lgba;")
    public final class700 method3005(int arg0, int arg1) {
        field7105++;
        class348 var3 = this.field7106;
        synchronized (this.field7106) {
            class700 var4 = (class700) this.field7106.method2216(0, (long) arg0);
            if (arg1 != 14344) {
                this.method3005(-103, -43);
            }
            if (var4 == null) {
                var4 = new class700(arg0);
                this.field7106.method2213((byte) -16, (long) arg0, var4);
            }
            return var4.method3932((byte) -62) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
    public final void method3006(byte arg0) {
        field7100++;
        class348 var2 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2220(false);
        }
        class348 var3 = this.field7106;
        synchronized (this.field7106) {
            this.field7106.method2220(false);
        }
        if (arg0 != 34) {
            this.method3006((byte) -128);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IZ)V")
    public final void method3007(int arg0, boolean arg1) {
        class348 var3 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2207(arg0, 1);
        }
        field7096++;
        class348 var4 = this.field7106;
        synchronized (this.field7106) {
            if (!arg1) {
                this.field7106.method2207(arg0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lmp;ILla;Lla;Lla;)V")
    public class493(class315 arg0, int arg1, class423 arg2, class423 arg3, class423 arg4) {
        this.field7102 = arg2;
        if (this.field7102 != null) {
            int var6 = this.field7102.method2623(-1) - 1;
            this.field7102.method2616(var6, 0);
        }
        class402.method2442(arg3, arg4, -31302, 2);
    }
}
