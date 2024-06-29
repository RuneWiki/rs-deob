import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class231 extends class336 {

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    private int field3465 = -32768;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    private int field3471 = 0;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "Z")
    public boolean field3461 = false;

    @OriginalMember(owner = "client!er", name = "U", descriptor = "I")
    private int field3477 = -1;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "I")
    private int field3478 = 0;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    private int field3464;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "Ltp;")
    private class196 field3473;

    @OriginalMember(owner = "client!er", name = "Z", descriptor = "Z")
    public static boolean field3482;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!er", name = "W", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!er", name = "X", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!er", name = "Y", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!er", name = "ab", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "Lct;")
    public static class104 field3462;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "Ldj;")
    private class314 field3459;

    static {
        new class409("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        new class409("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field3482 = true;
        new class409(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 4)
    public final void method33(int arg0) {
        if (arg0 < 109) {
            this.field3471 = -65;
        }
        ++field3458;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() {
        if (this.field3459 != null) {
            this.field3459.method2077();
        }
        ++field3481;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfp;Lbi;I)V", line = 27)
    private final void method1574(class9 arg0, class143 arg1, int arg2) {
        ++field3468;
        class133[] var4 = arg1.method945();
        class226[] var5 = arg1.method951();
        if (arg2 != 3) {
            this.field3473 = null;
        }
        if ((this.field3459 == null || this.field3459.field4599) && (var4 != null || var5 != null)) {
            this.field3459 = new class314(class388.field5665);
        }
        if (this.field3459 != null) {
            this.field3459.method2072(arg0, (long) class388.field5665, var4, var5, false);
            this.field3459.method2073(super.field4960, super.field4961, super.field4957, super.field4959, super.field4950);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfp;III)Z", line = 50)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field3474;
        if (arg2 != -754) {
            this.field3457 = -18;
        }
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 63)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 <= -31) {
            ++field3460;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)Z", line = 75)
    public final boolean method34(byte arg0) {
        int var2 = -27 / ((-19 - arg0) / 44);
        ++field3467;
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIBIII)V", line = 85)
    public static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        ++field3483;
        if (arg6 < 5) {
            method1575(30, -127, -104, 108, -54, -56, (byte) 20, 33, -118, -101);
        }
        if (~arg1 == ~arg2 && ~arg4 == ~arg5 && ~arg3 == ~arg7 && arg0 == arg9) {
            class452.method2806(arg5, arg2, (byte) 76, arg8, arg9, arg7);
        } else {
            int var10 = arg2;
            int var11 = arg5;
            int var12 = arg2 * 3;
            int var13 = arg5 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg3 * 3;
            int var17 = arg0 * 3;
            int var18 = -arg2 + -var16 + arg7 + var14;
            int var19 = -arg5 + var15 + arg9 - var17;
            int var20 = -var14 - -var12 + (var16 - var14);
            int var21 = var17 - var15 + -var15 - -var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 - -(var27 - (-var29 - var31) >> 12);
                int var34 = (var28 - -var30 + var32 >> 12) + arg5;
                class452.method2806(var11, var10, (byte) 76, arg8, var34, var33);
                var10 = var33;
                var11 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(B)I", line = 160)
    public final int method268(byte arg0) {
        if (arg0 > -101) {
            return 122;
        } else {
            ++field3463;
            return this.field3465;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ILfp;)V", line = 174)
    public final void method14(int arg0, class9 arg1) {
        ++field3472;
        class143 var3 = this.method1580(arg1, 0, -1);
        if (arg0 != -7561) {
            this.method1580((class9) null, -1, -8);
        }
        if (var3 != null) {
            this.method1574(arg1, var3, 3);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 189)
    public final void method1576(int arg0) {
        if (this.field3459 != null) {
            this.field3459.method2077();
        }
        ++field3476;
        if (arg0 != 0) {
            this.field3461 = true;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 227)
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3464 = arg0;
        this.field3457 = arg2 - -arg1;
        int var12 = class332.method2169(256, this.field3464).field4422;
        if (~var12 != 0) {
            this.field3461 = false;
            this.field3473 = class83.method556(var12, 93);
        } else {
            this.field3461 = true;
        }
        if (~this.field3457 == ~arg2) {
            class446.method2739(this.field3473, false, super.field4960, this.field3478, -49, super.field4954, super.field4951);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V", line = 208)
    public static final void method1577(int arg0, int arg1) {
        class215.field3047.method2300(arg1, true);
        ++field3479;
        class403.field5830.method2300(arg1, true);
        if (arg0 != 0) {
            field3482 = true;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 249)
    public static void method1578(int arg0) {
        if (arg0 != 3) {
            method1581(-15, 69, -39);
        }
        field3462 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)V", line = 259)
    public final void method1579(int arg0, boolean arg1) {
        ++field3470;
        if (!this.field3461) {
            this.field3471 += arg0;
            if (arg1) {
                while (this.field3471 > this.field3473.field2763[this.field3478]) {
                    this.field3471 -= this.field3473.field2763[this.field3478];
                    ++this.field3478;
                    if (this.field3478 >= this.field3473.field2784.length) {
                        this.field3461 = true;
                        break;
                    }
                }
                if (!this.field3461) {
                    class446.method2739(this.field3473, false, super.field4960, this.field3478, -49, super.field4954, super.field4951);
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lfp;II)Lbi;", line = 290)
    private final class143 method1580(class9 arg0, int arg1, int arg2) {
        ++field3469;
        if (arg2 != -1) {
            this.field3478 = 100;
        }
        class302 var4 = class332.method2169(arg2 + 257, this.field3464);
        return this.field3461 ? var4.method2013(arg1, -1, 0, -1, (byte) -121, arg0) : var4.method2013(arg1, this.field3477, this.field3471, this.field3478, (byte) -121, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V", line = 304)
    public static final void method1581(int arg0, int arg1, int arg2) {
        ++field3466;
        int var3 = -61 / ((arg2 - 14) / 41);
        class296 var4 = class99.method653(arg1, -121);
        int var5 = var4.field4311;
        int var6 = var4.field4314;
        int var7 = var4.field4312;
        int var8 = class32.field442[-var6 + var7];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        class337.method2182(var5, 466, var9 & arg0 << var6 | class31.field426[var5] & ~var9);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILfp;)Luq;", line = 337)
    public final class241 method2(int arg0, class9 arg1) {
        ++field3475;
        class143 var3 = this.method1580(arg1, 1024, -1);
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            if (arg0 > -125) {
                return null;
            } else {
                var4.method831(super.field4954, super.field4952, super.field4951);
                if (this.field3459 == null) {
                    var3.method947(var4, (class396) null, 0);
                } else {
                    class400 var5 = this.field3459.method2076();
                    arg1.method166(var3, var5, var4, (class396) null, 0);
                }
                this.field3465 = var3.method950();
                this.method1574(arg1, var3, 3);
                return null;
            }
        }
    }
}
