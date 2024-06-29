import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class419 extends class402 {

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    private int field6301 = 0;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    private int field6299 = 0;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private int field6309 = 0;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Z")
    public boolean field6307 = false;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    private int field6325 = -1;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field6318 = -32768;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field6319;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    private int field6300;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Ljv;")
    private class57 field6305;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field6303 = 0;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field6312 = 0;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Lph;")
    public static class459 field6311;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Loi;")
    private class53 field6313;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "[[Lgh;")
    public static class388[][] field6326;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
    public final boolean method19(byte arg0) {
        if (arg0 < 121) {
            field6311 = null;
        }
        ++field6302;
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field6310;
        if (this.field6313 != null) {
            this.field6313.method499();
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6319 = arg0;
        this.field6300 = arg4;
        this.field6309 = arg12;
        this.field6308 = arg2 - -arg1;
        class533 var14 = class514.field7469.method595(-12186, this.field6319);
        int var15 = var14.field7734;
        if (~var15 != 0) {
            this.field6305 = class422.field6355.method236(var15, (byte) 70);
            this.field6307 = false;
        } else {
            this.field6307 = true;
        }
        if (this.field6308 == arg2) {
            class433.method2602(this.field6305, super.field6073, super.field6078, (byte) 60, super.field6084, this.field6301, false);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLza;II)Z")
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field6323;
        if (arg0) {
            this.field6301 = -99;
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBILvs;Lza;ZI)V")
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (arg1 == 93) {
            ++field6314;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public final void method2560(int arg0) {
        if (arg0 != 0) {
            field6311 = null;
        }
        if (this.field6313 != null) {
            this.field6313.method499();
        }
        ++field6324;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    public static final boolean method2561(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field6304;
            return ~(arg2 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method2562(byte arg0) {
        field6326 = null;
        if (arg0 >= -47) {
            method2562((byte) 11);
        }
        field6311 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)V")
    public final void method2563(int arg0, byte arg1) {
        ++field6322;
        if (!this.field6307) {
            this.field6299 += arg0;
            while (~this.field6305.field1210[this.field6301] > ~this.field6299) {
                this.field6299 -= this.field6305.field1210[this.field6301];
                ++this.field6301;
                if (~this.field6305.field1202.length >= ~this.field6301) {
                    this.field6307 = true;
                    break;
                }
            }
            if (arg1 == -22) {
                if (!this.field6307) {
                    class433.method2602(this.field6305, super.field6073, super.field6078, (byte) 96, super.field6084, this.field6301, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)I")
    public final int method8(int arg0) {
        if (arg0 != 0) {
            this.method19((byte) 25);
        }
        ++field6306;
        return this.field6318;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lza;I)Lnd;")
    public final class385 method15(class288 arg0, int arg1) {
        ++field6317;
        class374 var3 = this.method2564(this.field6319, false, 2048 | (this.field6309 != 0 ? 5 : 0), arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 2) {
                method2562((byte) -95);
            }
            if (~this.field6309 != -1) {
                var3.method769(this.field6309 * 2048);
            }
            class124 var4 = arg0.method364();
            var4.method835(super.field6073, super.field6083, super.field6078);
            if (this.field6313 != null) {
                class502 var5 = this.field6313.method490();
                arg0.method298(var3, var5, var4, (class313) null, 0);
            } else {
                var3.method723(var4, (class313) null, 0);
            }
            this.field6318 = var3.method736();
            this.method2565(arg0, false, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLza;)V")
    public final void method9(byte arg0, class288 arg1) {
        ++field6320;
        if (arg0 > -98) {
            this.method19((byte) -105);
        }
        class374 var3 = this.method2564(this.field6319, false, 0, arg1);
        if (var3 != null) {
            this.method2565(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZILza;)Le;")
    private final class374 method2564(int arg0, boolean arg1, int arg2, class288 arg3) {
        if (arg1) {
            this.method18(80, (byte) 8, 95, (class421) null, (class288) null, true, 88);
        }
        ++field6315;
        class533 var5 = class514.field7469.method595(-12186, arg0);
        class38 var6 = class531.field7727[super.field6084];
        class38 var7 = ~this.field6300 <= -4 ? null : class531.field7727[this.field6300 + 1];
        return this.field6307 ? var5.method3145(-1, arg2, true, var7, super.field6078, -1, -31180, 0, arg3, var6, class422.field6355, super.field6073, super.field6083) : var5.method3145(this.field6325, arg2, true, var7, super.field6078, this.field6301, -31180, this.field6299, arg3, var6, class422.field6355, super.field6073, super.field6083);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lza;ZLe;)V")
    private final void method2565(class288 arg0, boolean arg1, class374 arg2) {
        ++field6316;
        class393[] var4 = arg2.method737();
        if (!arg1) {
            class13[] var5 = arg2.method720();
            if ((this.field6313 == null || this.field6313.field1131) && (var4 != null || var5 != null)) {
                this.field6313 = new class53(class62.field1268);
            }
            if (this.field6313 != null) {
                this.field6313.method501(arg0, (long) class62.field1268, var4, var5, false);
                this.field6313.method493(super.field6084, super.field6082, super.field6081, super.field6077, super.field6075);
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public final void method12(int arg0) {
        ++field6321;
        int var2 = 120 % ((-35 - arg0) / 44);
        throw new IllegalStateException();
    }
}
