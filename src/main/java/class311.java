import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class311 extends class140 {

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    private int field4536 = -32768;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    private int field4525 = 0;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "Z")
    public boolean field4530 = false;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    private int field4546 = 0;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "I")
    private int field4549 = 0;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    private int field4545 = -1;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    private int field4535;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    private int field4532;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "Lvr;")
    private class91 field4540;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "Lni;")
    public static class367 field4541;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "Ljg;")
    private class228 field4538;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "[Laa;")
    public static class341[] field4548;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBLqa;)Lka;")
    private final class334 method1954(int arg0, int arg1, byte arg2, class165 arg3) {
        if (arg2 != -82) {
            this.field4538 = null;
        }
        ++field4539;
        class11 var5 = class239.field3360.method2836((byte) 70, arg1);
        class23 var6 = class414.field6317[super.field1866];
        class23 var7 = ~this.field4535 <= -4 ? null : class414.field6317[this.field4535 + 1];
        return !this.field4530 ? var5.method107(super.field1873, true, super.field1867, var7, this.field4545, class201.field2707, arg3, this.field4525, this.field4549, var6, -26047, super.field1862, arg0) : var5.method107(super.field1873, true, super.field1867, var7, -1, class201.field2707, arg3, -1, 0, var6, arg2 ^ 26095, super.field1862, arg0);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        ++field4534;
        if (!arg0) {
            this.field4552 = 88;
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4527;
        if (this.field4538 != null) {
            this.field4538.method1526();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field4544;
        if (arg0 <= 121) {
            this.finalize();
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field4552 = arg1 + arg2;
        this.field4546 = arg12;
        this.field4535 = arg4;
        this.field4532 = arg0;
        class11 var14 = class239.field3360.method2836((byte) -94, this.field4532);
        int var15 = var14.field192;
        if (var15 != -1) {
            this.field4540 = class201.field2707.method489(65, var15);
            this.field4530 = false;
        } else {
            this.field4530 = true;
        }
        if (~this.field4552 == ~arg2) {
            class441.method2669(false, this.field4540, super.field1866, this.field4525, super.field1867, super.field1862, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final void method1955(int arg0) {
        if (arg0 != -16964) {
            this.field4535 = 72;
        }
        ++field4550;
        if (this.field4538 != null) {
            this.field4538.method1526();
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        if (arg0) {
            this.method1958(true, (class334) null, (class165) null);
        }
        ++field4529;
        class334 var3 = this.method1954(0, this.field4532, (byte) -82, arg1);
        if (var3 != null) {
            this.method1958(false, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field4528;
        if (arg0 != 0) {
            this.method174((byte) -112);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
    public static int method1956(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)V")
    public static final void method1957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg3 + 1;
        class221.method1489(class466.field6955[arg3], arg0, arg1, (byte) -30, arg2);
        ++field4526;
        int var9 = arg5 - 1;
        class221.method1489(class466.field6955[arg5], arg0, arg1, (byte) -30, arg2);
        for (int var6 = var8; var9 >= var6; ++var6) {
            int[] var7 = class466.field6955[var6];
            var7[arg0] = var7[arg1] = arg2;
        }
        if (arg4 != -1) {
            field4548 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLka;Lqa;)V")
    private final void method1958(boolean arg0, class334 arg1, class165 arg2) {
        ++field4547;
        class392[] var4 = arg1.method72();
        class531[] var5 = arg1.method87();
        if (!arg0) {
            if ((this.field4538 == null || this.field4538.field3237) && (var4 != null || var5 != null)) {
                this.field4538 = new class228(class393.field6017);
            }
            if (this.field4538 != null) {
                this.field4538.method1531(arg2, (long) class393.field6017, var4, var5, false);
                this.field4538.method1530(super.field1866, super.field1868, super.field1871, super.field1863, super.field1874);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        if (arg2 < -4) {
            ++field4553;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)I")
    public final int method174(byte arg0) {
        if (arg0 >= -126) {
            return 72;
        } else {
            ++field4542;
            return this.field4536;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        ++field4537;
        class334 var3 = this.method1954(2048 | (~this.field4546 != -1 ? 5 : 0), this.field4532, (byte) -82, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (this.field4546 != arg0) {
                var3.method44(this.field4546 * 2048);
            }
            class14 var4 = arg1.method751();
            var4.method141(super.field1867, super.field1873, super.field1862);
            if (this.field4538 == null) {
                var3.method53(var4, (class302) null, 0);
            } else {
                class137 var5 = this.field4538.method1533();
                arg1.method840(var3, var5, var4, (class302) null, 0);
            }
            this.field4536 = var3.method77();
            this.method1958(false, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class353.method2267(arg4, -46);
        ++field4543;
        if (arg6 >= -38) {
            field4548 = null;
        }
        int var7 = 0;
        int var8 = -arg2 + arg4;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class463.field6924 <= arg5 && ~arg5 >= ~class369.field5628) {
            int[] var14 = class466.field6955[arg5];
            int var15 = class33.method289(261104, class377.field5760, class49.field701, -arg4 + arg3);
            int var16 = class33.method289(261104, class377.field5760, class49.field701, arg3 + arg4);
            int var17 = class33.method289(261104, class377.field5760, class49.field701, -var8 + arg3);
            int var18 = class33.method289(261104, class377.field5760, class49.field701, arg3 + var8);
            class221.method1489(var14, var15, var17, (byte) -30, arg1);
            class221.method1489(var14, var17, var18, (byte) -30, arg0);
            class221.method1489(var14, var18, var16, (byte) -30, arg1);
        }
        int var19 = -1;
        while (~var7 > ~var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (~var12 <= -1 && ~var11 <= -2) {
                --var11;
                var12 -= var11 << 1;
                class78.field1124[var11] = var7;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = arg5 - var9;
                int var21 = arg5 - -var9;
                if (~var21 <= ~class463.field6924 && ~class369.field5628 <= ~var20) {
                    if (var9 < var8) {
                        int var22 = class78.field1124[var9];
                        int var23 = class33.method289(261104, class377.field5760, class49.field701, arg3 + var7);
                        int var24 = class33.method289(261104, class377.field5760, class49.field701, -var7 + arg3);
                        int var25 = class33.method289(261104, class377.field5760, class49.field701, arg3 + var22);
                        int var26 = class33.method289(261104, class377.field5760, class49.field701, arg3 - var22);
                        if (var21 <= class369.field5628) {
                            int[] var27 = class466.field6955[var21];
                            class221.method1489(var27, var24, var26, (byte) -30, arg1);
                            class221.method1489(var27, var26, var25, (byte) -30, arg0);
                            class221.method1489(var27, var25, var23, (byte) -30, arg1);
                        }
                        if (~var20 <= ~class463.field6924) {
                            int[] var28 = class466.field6955[var20];
                            class221.method1489(var28, var24, var26, (byte) -30, arg1);
                            class221.method1489(var28, var26, var25, (byte) -30, arg0);
                            class221.method1489(var28, var25, var23, (byte) -30, arg1);
                        }
                    } else {
                        int var29 = class33.method289(261104, class377.field5760, class49.field701, arg3 + var7);
                        int var30 = class33.method289(261104, class377.field5760, class49.field701, -var7 + arg3);
                        if (class369.field5628 >= var21) {
                            class221.method1489(class466.field6955[var21], var30, var29, (byte) -30, arg1);
                        }
                        if (var20 >= class463.field6924) {
                            class221.method1489(class466.field6955[var20], var30, var29, (byte) -30, arg1);
                        }
                    }
                }
            }
            int var31 = -var7 + arg5;
            int var32 = arg5 + var7;
            if (class463.field6924 <= var32 && ~class369.field5628 <= ~var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (~class377.field5760 >= ~var33 && var34 <= class49.field701) {
                    int var35 = class33.method289(261104, class377.field5760, class49.field701, var33);
                    int var36 = class33.method289(261104, class377.field5760, class49.field701, var34);
                    if (~var7 > ~var8) {
                        int var37 = ~var11 > ~var7 ? class78.field1124[var7] : var11;
                        int var38 = class33.method289(261104, class377.field5760, class49.field701, arg3 + var37);
                        int var39 = class33.method289(261104, class377.field5760, class49.field701, -var37 + arg3);
                        if (~var32 >= ~class369.field5628) {
                            int[] var40 = class466.field6955[var32];
                            class221.method1489(var40, var36, var39, (byte) -30, arg1);
                            class221.method1489(var40, var39, var38, (byte) -30, arg0);
                            class221.method1489(var40, var38, var35, (byte) -30, arg1);
                        }
                        if (class463.field6924 <= var31) {
                            int[] var41 = class466.field6955[var31];
                            class221.method1489(var41, var36, var39, (byte) -30, arg1);
                            class221.method1489(var41, var39, var38, (byte) -30, arg0);
                            class221.method1489(var41, var38, var35, (byte) -30, arg1);
                        }
                    } else {
                        if (~class369.field5628 <= ~var32) {
                            class221.method1489(class466.field6955[var32], var36, var35, (byte) -30, arg1);
                        }
                        if (class463.field6924 <= var31) {
                            class221.method1489(class466.field6955[var31], var36, var35, (byte) -30, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V")
    public static final void method1960(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4533;
        class177 var5 = class344.method2229(4, arg4, (byte) 112);
        var5.method1191(arg1 + -9696);
        var5.field2372 = arg2;
        var5.field2374 = arg0;
        var5.field2369 = arg3;
        if (arg1 != 9788) {
            method1962(22);
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)V")
    public final void method1961(byte arg0, int arg1) {
        ++field4531;
        if (!this.field4530) {
            this.field4549 += arg1;
            while (this.field4549 > this.field4540.field1313[this.field4525]) {
                this.field4549 -= this.field4540.field1313[this.field4525];
                ++this.field4525;
                if (~this.field4540.field1315.length >= ~this.field4525) {
                    this.field4530 = true;
                    break;
                }
            }
            if (!this.field4530) {
                class441.method2669(false, this.field4540, super.field1866, this.field4525, super.field1867, super.field1862, false);
            }
            if (arg0 > -58) {
                this.field4538 = null;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method1962(int arg0) {
        int var1 = 119 % ((38 - arg0) / 35);
        field4541 = null;
        field4548 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lub;IBI)V")
    public static final void method1963(class17 arg0, int arg1, byte arg2, int arg3) {
        int var4 = -103 / ((-40 - arg2) / 49);
        ++field4551;
        if (~arg0.field3871 == ~arg3 && arg3 != -1) {
            class91 var5 = class201.field2707.method489(120, arg3);
            int var6 = var5.field1340;
            if (var6 == 1) {
                arg0.field3886 = arg1;
                arg0.field3880 = 0;
                arg0.field3877 = 1;
                arg0.field3851 = 0;
                arg0.field3842 = 0;
                class441.method2669(false, var5, arg0.field1866, arg0.field3842, arg0.field1867, arg0.field1862, false);
            }
            if (~var6 == -3) {
                arg0.field3851 = 0;
                return;
            }
        } else if (arg3 == -1 || arg0.field3871 == -1 || ~class201.field2707.method489(78, arg3).field1332 <= ~class201.field2707.method489(80, arg0.field3871).field1332) {
            arg0.field3851 = 0;
            arg0.field3871 = arg3;
            arg0.field3842 = 0;
            arg0.field3877 = 1;
            arg0.field3886 = arg1;
            arg0.field3880 = 0;
            arg0.field3910 = arg0.field3918;
            if (~arg0.field3871 == 0) {
                return;
            }
            class441.method2669(false, class201.field2707.method489(32, arg0.field3871), arg0.field1866, arg0.field3842, arg0.field1867, arg0.field1862, false);
        }
    }

    static {
        new class446("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field4541 = new class367(18, 11);
    }
}
