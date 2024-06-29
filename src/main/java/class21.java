import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class21 {

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Lmb;")
    private class238 field194 = new class238();

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "Lmb;")
    private class238 field196;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "[I")
    public static int[] field185;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Lmb;")
    public final class238 method83(int arg0) {
        field192++;
        class238 var2 = this.field194.field3008;
        if (arg0 >= -102) {
            field195 = 55;
        }
        if (this.field194 == var2) {
            this.field196 = null;
            return null;
        } else {
            this.field196 = var2.field3008;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLiaa;)Lhs;")
    public static final class294 method84(byte arg0, class452 arg1) {
        if (arg0 >= -27) {
            field195 = 20;
        }
        field193++;
        return new class294(arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2524(3), arg1.method2541(117));
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public final void method85(int arg0) {
        field187++;
        while (true) {
            class238 var2 = this.field194.field3007;
            if (this.field194 == var2) {
                if (arg0 != 25042) {
                    method84((byte) 72, null);
                }
                this.field196 = null;
                return;
            }
            var2.method1374((byte) -55);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII[I[ILap;)Leca;")
    public static final class690 method86(byte arg0, int arg1, int arg2, int[] arg3, int[] arg4, class435 arg5) {
        field183++;
        byte[] var6 = new byte[arg1 * arg2];
        if (arg0 != -1) {
            return null;
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg2 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class690(arg5, arg2, arg1, var6);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILmb;)V")
    public final void method87(int arg0, class238 arg1) {
        field191++;
        if (arg1.field3008 != null) {
            arg1.method1374((byte) -118);
        }
        arg1.field3007 = this.field194;
        arg1.field3008 = this.field194.field3008;
        arg1.field3008.field3007 = arg1;
        arg1.field3007.field3008 = arg1;
        if (arg0 <= 69) {
            method84((byte) -21, null);
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public static void method88(int arg0) {
        if (arg0 != 0) {
            method84((byte) 6, null);
        }
        field185 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Lmb;")
    public final class238 method89(byte arg0) {
        field188++;
        if (arg0 <= 126) {
            this.field194 = null;
        }
        class238 var2 = this.field194.field3007;
        if (this.field194 == var2) {
            return null;
        } else {
            var2.method1374((byte) -67);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
    public final int method90(boolean arg0) {
        field186++;
        int var2 = 0;
        if (!arg0) {
            return -12;
        }
        class238 var3 = this.field194.field3007;
        while (this.field194 != var3) {
            var3 = var3.field3007;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
    public final boolean method91(int arg0) {
        if (arg0 != 0) {
            field185 = null;
        }
        field184++;
        return this.field194.field3007 == this.field194;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)Lmb;")
    public final class238 method92(int arg0) {
        if (arg0 != 0) {
            this.field196 = null;
        }
        field189++;
        class238 var2 = this.field196;
        if (this.field194 == var2) {
            this.field196 = null;
            return null;
        } else {
            this.field196 = var2.field3007;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Lmb;")
    public final class238 method93(byte arg0) {
        field190++;
        class238 var2 = this.field194.field3007;
        if (this.field194 == var2) {
            this.field196 = null;
            return null;
        } else {
            this.field196 = var2.field3007;
            return arg0 <= 53 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class21() {
        this.field194.field3008 = this.field194;
        this.field194.field3007 = this.field194;
    }
}
