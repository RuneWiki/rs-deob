import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class304 extends class522 {

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "Z")
    public boolean field4524 = false;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    private int field4523 = 0;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    private int field4536 = -1;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    private int field4526 = 0;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    private int field4545 = 0;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    private int field4544 = -32768;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "Llc;")
    private class520 field4530;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!bn", name = "Z", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bn", name = "ab", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!bn", name = "bb", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "Lli;")
    private class387 field4537;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[[B[I[BI[[B[I)I")
    public static final int method1892(int arg0, int arg1, byte[][] arg2, int[] arg3, byte[] arg4, int arg5, byte[][] arg6, int[] arg7) {
        ++field4531;
        int var8 = arg7[arg5];
        int var9 = arg3[arg5] + var8;
        int var10 = arg7[arg1];
        if (arg0 >= -62) {
            method1893(92, 28, -112, 44, (byte[]) null, -11, (byte[]) null, 40, -77);
        }
        int var11 = arg3[arg1] + var10;
        int var12 = var8;
        if (~var8 > ~var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var11 > ~var9) {
            var13 = var11;
        }
        int var14 = 255 & arg4[arg5];
        if (~(arg4[arg1] & 255) > ~var14) {
            var14 = arg4[arg1] & 255;
        }
        byte[] var15 = arg2[arg5];
        byte[] var16 = arg6[arg1];
        int var17 = -var8 + var12;
        int var18 = -var10 + var12;
        for (int var19 = var12; ~var19 > ~var13; ++var19) {
            int var20 = var15[var17++] - -var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII[BI[BII)V")
    public static final void method1893(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = -107 % ((45 - arg1) / 50);
        ++field4529;
        int var10 = -(arg2 >> 2);
        int var11 = -(3 & arg2);
        for (int var12 = -arg7; ~var12 > -1; ++var12) {
            int var10001;
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg4[arg0++]);
                int var15 = arg8++;
                arg6[var15] = (byte) (arg6[var15] + -arg4[arg0++]);
                int var16 = arg8++;
                arg6[var16] = (byte) (arg6[var16] + -arg4[arg0++]);
                int var17 = arg8++;
                arg6[var17] = (byte) (arg6[var17] + -arg4[arg0++]);
            }
            for (int var14 = var11; var14 < 0; ++var14) {
                var10001 = arg8++;
                arg6[var10001] = (byte) (arg6[var10001] + -arg4[arg0++]);
            }
            arg0 += arg5;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public final void method1894(int arg0) {
        if (this.field4537 != null) {
            this.field4537.method2323();
        }
        ++field4525;
        if (arg0 != 3) {
            this.field4537 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        ++field4527;
        if (arg0 < -38) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != -22611) {
            this.method1900(108, 64, 27, (class11) null);
        }
        ++field4543;
        return false;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lht;B)V")
    public static final void method1895(class461 arg0, byte arg1) {
        ++field4540;
        if (arg1 == -98) {
            class262.field3908 = arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)V")
    public final void method1896(byte arg0, int arg1) {
        ++field4539;
        if (!this.field4524) {
            this.field4545 += arg1;
            if (arg0 > -56) {
                this.method1900(-41, 30, -102, (class11) null);
            }
            while (~this.field4530.field7645[this.field4523] > ~this.field4545) {
                this.field4545 -= this.field4530.field7645[this.field4523];
                ++this.field4523;
                if (this.field4523 >= this.field4530.field7630.length) {
                    this.field4524 = true;
                    break;
                }
            }
            if (!this.field4524) {
                class283.method1761(this.field4530, false, super.field7671, -54, super.field7686, super.field7681, this.field4523);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
    public static final void method1897(int arg0) {
        if (arg0 >= 82) {
            if (class516.field7573 > 0) {
                int var1 = 0;
                for (int var2 = 0; class100.field1522.length > var2; ++var2) {
                    if (class100.field1522[var2].startsWith("--> ")) {
                        ++var1;
                        if (class516.field7573 == var1) {
                            class159.field2395 = class100.field1522[var2].substring(4);
                            break;
                        }
                    }
                }
            } else {
                class159.field2395 = "";
            }
            ++field4533;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field4546;
        class398 var3 = this.method1900((this.field4526 == 0 ? 0 : 5) | 2048, 0, this.field4541, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field4526 != arg1) {
                var3.method650(this.field4526 * 2048);
            }
            class511 var4 = arg0.method66();
            var4.method1307(super.field7681, super.field7689, super.field7671);
            if (this.field4537 == null) {
                var3.method640(var4, (class518) null, 0);
            } else {
                class46 var5 = this.field4537.method2316();
                arg0.method73(var3, var5, var4, (class518) null, 0);
            }
            this.field4544 = var3.method635();
            this.method1899(var3, arg0, arg1 ^ -4);
            return null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)I")
    public final int method236(int arg0) {
        if (arg0 != 0) {
            return -92;
        } else {
            ++field4548;
            return this.field4544;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        if (arg2 != 2) {
            this.field4545 = 19;
        }
        ++field4528;
        return false;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        int var8 = 70 % ((24 - arg5) / 62);
        ++field4550;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            this.method1894(-102);
        }
        ++field4534;
        class398 var3 = this.method1900(0, 0, this.field4541, arg0);
        if (var3 != null) {
            this.method1899(var3, arg0, 3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field4537 != null) {
            this.field4537.method2323();
        }
        ++field4549;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lok;IIIBZI)V")
    public static final void method1898(class74 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        if (arg4 < -22) {
            class509.field7487 = arg2;
            class413.field6239 = arg5;
            ++field4538;
            class148.field2242 = arg6;
            class210.field3032 = arg1;
            class274.field4095 = 1;
            class531.field7825 = arg3;
            class525.field7766 = arg0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field4532 = arg1 + arg2;
        this.field4526 = arg12;
        this.field4542 = arg4;
        this.field4541 = arg0;
        class270 var14 = class443.field6509.method2022(30, this.field4541);
        int var15 = var14.field4013;
        if (var15 == -1) {
            this.field4524 = true;
        } else {
            this.field4530 = class510.field7490.method575(var15, -88);
            this.field4524 = false;
        }
        if (this.field4532 == arg2) {
            class283.method1761(this.field4530, false, super.field7671, -15, super.field7686, super.field7681, this.field4523);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lt;Lya;I)V")
    private final void method1899(class398 arg0, class11 arg1, int arg2) {
        ++field4535;
        class165[] var4 = arg0.method606();
        class254[] var5 = arg0.method616();
        if (arg2 != 3) {
            this.method233(10, (class11) null, 3, -124);
        }
        if ((this.field4537 == null || this.field4537.field5837) && (var4 != null || var5 != null)) {
            this.field4537 = new class387(class86.field1350);
        }
        if (this.field4537 != null) {
            this.field4537.method2318(arg1, (long) class86.field1350, var4, var5, false);
            this.field4537.method2324(super.field7686, super.field7687, super.field7683, super.field7676, super.field7673);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILya;)Lt;")
    private final class398 method1900(int arg0, int arg1, int arg2, class11 arg3) {
        if (arg1 != 0) {
            this.field4544 = -23;
        }
        ++field4547;
        class270 var5 = class443.field6509.method2022(arg1 + 30, arg2);
        class337 var6 = class213.field3048[super.field7686];
        class337 var7 = this.field4542 < 3 ? class213.field3048[this.field4542 + 1] : null;
        return !this.field4524 ? var5.method1680(class510.field7490, this.field4545, 112, this.field4523, super.field7689, super.field7671, this.field4536, var7, arg3, arg0, super.field7681, true, var6) : var5.method1680(class510.field7490, 0, -40, -1, super.field7689, super.field7671, -1, var7, arg3, arg0, super.field7681, true, var6);
    }
}
