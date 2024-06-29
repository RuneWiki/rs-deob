import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class325 {

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
    private int[] field4407 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Lufa;")
    public static class740 field4403 = new class740(8, 5);

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field4417 = 0;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Lraa;")
    public class353 field4414;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Loi;")
    public static class694 field4415;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[I")
    private int[] field4402;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[S")
    private short[] field4400;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[S")
    private short[] field4404;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "[S")
    private short[] field4406;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[S")
    private short[] field4412;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLsl;)V", line = 3)
    public final void method2005(boolean arg0, class479 arg1) {
        field4410++;
        if (arg0) {
            this.method2005(true, null);
        }
        while (true) {
            int var3 = arg1.method2886(!arg0);
            if (var3 == 0) {
                return;
            }
            this.method2012(arg1, 115, var3);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lfu;", line = 25)
    public final class637 method2006(int arg0) {
        field4413++;
        class637[] var2 = new class637[5];
        int var3 = arg0;
        class423 var4 = this.field4414.field5223;
        synchronized (this.field4414.field5223) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4407[var5] != -1) {
                    var2[var3++] = class565.method3379(126, this.field4414.field5223, this.field4407[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field8978 < 13) {
                var2[var6].method3663(false, 2);
            }
        }
        class637 var7 = new class637(var2, var3);
        if (this.field4406 != null) {
            for (int var8 = 0; var8 < this.field4406.length; var8++) {
                var7.method3667((byte) 92, this.field4412[var8], this.field4406[var8]);
            }
        }
        if (this.field4404 != null) {
            for (int var9 = 0; var9 < this.field4404.length; var9++) {
                var7.method3671(this.field4404[var9], this.field4400[var9], false);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2007(int arg0) throws class360 {
        if (arg0 != 8) {
            return;
        }
        if (class270.field3833 == 1) {
            class301.field4129.method1257(class72.field1098, class677.field9619);
        } else {
            class301.field4129.method1257(0, 0);
        }
        field4409++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Lfu;", line = 108)
    public final class637 method2008(boolean arg0) {
        field4416++;
        if (this.field4402 == null) {
            return null;
        }
        class637[] var2 = new class637[this.field4402.length];
        class423 var3 = this.field4414.field5223;
        synchronized (this.field4414.field5223) {
            int var4 = 0;
            while (true) {
                if (this.field4402.length <= var4) {
                    break;
                }
                var2[var4] = class565.method3379(66, this.field4414.field5223, this.field4402[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field4402.length; var5++) {
            if (var2[var5].field8978 < 13) {
                var2[var5].method3663(false, 2);
            }
        }
        if (!arg0) {
            return null;
        }
        class637 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class637(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4406 != null) {
            for (int var7 = 0; var7 < this.field4406.length; var7++) {
                var6.method3667((byte) -118, this.field4412[var7], this.field4406[var7]);
            }
        }
        if (this.field4404 != null) {
            for (int var8 = 0; var8 < this.field4404.length; var8++) {
                var6.method3671(this.field4404[var8], this.field4400[var8], !arg0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V", line = 191)
    public static void method2009(int arg0) {
        field4415 = null;
        if (arg0 < 93) {
            method2009(22);
        }
        field4403 = null;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z", line = 208)
    public final boolean method2010(int arg0) {
        field4411++;
        if (this.field4402 == null) {
            return true;
        }
        boolean var2 = true;
        class423 var3 = this.field4414.field5223;
        synchronized (this.field4414.field5223) {
            for (int var4 = arg0; var4 < this.field4402.length; var4++) {
                if (!this.field4414.field5223.method2613(0, this.field4402[var4], -75)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILha;B)Ltd;", line = 236)
    public static final class515 method2011(int arg0, class543 arg1, byte arg2) {
        field4408++;
        if (arg2 >= -113) {
            return null;
        }
        class394 var3 = (class394) class186.field2611.method4020((long) arg0, (byte) -60);
        if (var3 != null) {
            class94 var4 = var3.field5658.method3998(10);
            var3.field5660 = true;
            if (var4 != null) {
                return var4.method733(arg1, 8);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lsl;II)V", line = 262)
    private final void method2012(class479 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            arg0.method2886(true);
        } else if (arg2 == 2) {
            int var4 = arg0.method2886(true);
            this.field4402 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4402[var5] = arg0.method2882(-1);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method2886(true);
                this.field4412 = new short[var6];
                this.field4406 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4406[var7] = (short) arg0.method2882(-1);
                    this.field4412[var7] = (short) arg0.method2882(-1);
                }
            } else if (arg2 == 41) {
                int var8 = arg0.method2886(true);
                this.field4404 = new short[var8];
                this.field4400 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4404[var9] = (short) arg0.method2882(-1);
                    this.field4400[var9] = (short) arg0.method2882(-1);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field4407[arg2 - 60] = arg0.method2882(-1);
            }
        }
        if (arg1 >= 109) {
            field4405++;
        }
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z", line = 343)
    public final boolean method2013(int arg0) {
        field4401++;
        boolean var2 = true;
        class423 var3 = this.field4414.field5223;
        synchronized (this.field4414.field5223) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field4407[var4] != -1 && !this.field4414.field5223.method2613(0, this.field4407[var4], -85)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
