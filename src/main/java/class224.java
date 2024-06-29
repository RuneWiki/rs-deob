import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class224 {

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field3741 = 0;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lbe;")
    private class235 field3749;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lda;")
    public static class143 field3739;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Ljm;")
    private class151 field3744;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lai;")
    public static class258 field3748;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1620(boolean arg0) {
        if (arg0) {
            field3739 = (class143) null;
        }
        field3739 = null;
        field3748 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Ljm;", line = 24)
    public final class151 method1621(int arg0) {
        field3743++;
        this.field3741 = arg0;
        return this.method1624(true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V", line = 45)
    public static final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 2) {
            method1623((byte) -32);
        }
        field3740++;
        if (arg0 < 0 || arg7 < 0 || arg0 >= 103 || arg7 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class273 var8 = class156.method1211(arg2, arg0, arg7);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field4526 >>> 32);
                if (arg4 == 2) {
                    var8.field4527 = new class302(var9, 2, arg5 + 4, arg2, arg0, arg7, arg1, false, var8.field4527);
                    var8.field4534 = new class302(var9, 2, arg5 + 1 & 0x3, arg2, arg0, arg7, arg1, false, var8.field4534);
                } else {
                    var8.field4527 = new class302(var9, arg4, arg5, arg2, arg0, arg7, arg1, false, var8.field4527);
                }
            }
        }
        if (arg3 == 1) {
            class138 var10 = class156.method1213(arg2, arg0, arg7);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field2461 >>> 32);
                if (arg4 == 4 || arg4 == 5) {
                    var10.field2459 = new class302(var11, 4, arg5, arg2, arg0, arg7, arg1, false, var10.field2459);
                } else if (arg4 == 6) {
                    var10.field2459 = new class302(var11, 4, arg5 + 4, arg2, arg0, arg7, arg1, false, var10.field2459);
                } else if (arg4 == 7) {
                    var10.field2459 = new class302(var11, 4, (arg5 + 2 & 0x3) + 4, arg2, arg0, arg7, arg1, false, var10.field2459);
                } else if (arg4 == 8) {
                    var10.field2459 = new class302(var11, 4, arg5 + 4, arg2, arg0, arg7, arg1, false, var10.field2459);
                    var10.field2468 = new class302(var11, 4, (arg5 + 2 & 0x3) + 4, arg2, arg0, arg7, arg1, false, var10.field2468);
                }
            }
        }
        if (arg3 == 2) {
            if (arg4 == 11) {
                arg4 = 10;
            }
            class43 var12 = class112.method899(arg2, arg0, arg7);
            if (var12 != null) {
                var12.field712 = new class302((int) (var12.field697 >>> 32) & Integer.MAX_VALUE, arg4, arg5, arg2, arg0, arg7, arg1, false, var12.field712);
            }
        }
        if (arg3 == 3) {
            class147 var13 = class46.method336(arg2, arg0, arg7);
            if (var13 != null) {
                var13.field2659 = new class302((int) (var13.field2656 >>> 32) & Integer.MAX_VALUE, 22, arg5, arg2, arg0, arg7, arg1, false, var13.field2659);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 139)
    public static final void method1623(byte arg0) {
        field3738++;
        int var1 = -103 % ((-arg0 - 50) / 32);
        class233.field3888.method1529(false);
        class216.field3612.method1529(false);
        class90.field1600.method1529(false);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)Ljm;", line = 154)
    public final class151 method1624(boolean arg0) {
        if (!arg0) {
            field3747 = 109;
        }
        field3742++;
        if (this.field3741 > 0 && this.field3749.field3922[this.field3741 - 1] != this.field3744) {
            class151 var2 = this.field3744;
            this.field3744 = var2.field2707;
            return var2;
        }
        class151 var3;
        do {
            if (this.field3741 >= this.field3749.field3939) {
                return null;
            }
            var3 = this.field3749.field3922[this.field3741++].field2707;
        } while (this.field3749.field3922[this.field3741 - 1] == var3);
        this.field3744 = var3.field2707;
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lbe;)V", line = 194)
    public class224(class235 arg0) {
        this.field3749 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)I", line = 203)
    public static final int method1625(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 9) {
            return -121;
        }
        int var4 = arg3 & 0x3;
        field3745++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }
}
