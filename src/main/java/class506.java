import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class506 extends class766 {

    @OriginalMember(owner = "client!lia", name = "A", descriptor = "Ltm;")
    public class412 field7003 = new class412();

    @OriginalMember(owner = "client!lia", name = "D", descriptor = "Lbd;")
    public class67 field7006 = new class67();

    @OriginalMember(owner = "client!lia", name = "t", descriptor = "Ldr;")
    private class751 field6996;

    @OriginalMember(owner = "client!lia", name = "v", descriptor = "Z")
    public static boolean field6998 = false;

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!lia", name = "s", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!lia", name = "u", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!lia", name = "w", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!lia", name = "x", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!lia", name = "y", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!lia", name = "z", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!lia", name = "B", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!lia", name = "C", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V")
    public static final void method2929(int arg0, int arg1) {
        field7001++;
        if (arg1 == -1 || !class634.field8855[arg1]) {
            return;
        }
        class777.field10678.method2117(arg1, -200);
        class111.field1528[arg1] = null;
        class376.field5492[arg1] = null;
        class634.field8855[arg1] = false;
        if (arg0 <= 23) {
            method2931(null, -41);
        }
    }

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "()Lsia;")
    public final class766 method592() {
        field7005++;
        class191 var1;
        do {
            var1 = (class191) this.field7003.method2542(-119);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2549 == null);
        return var1.field2549;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIILsq;[I)V")
    private final void method2930(int arg0, int arg1, int arg2, int arg3, class191 arg4, int[] arg5) {
        if (arg0 != 262144) {
            this.method596(44);
        }
        field7000++;
        if ((this.field6996.field10378[arg4.field2551] & 0x4) != 0 && arg4.field2546 < 0) {
            int var7 = this.field6996.field10357[arg4.field2551] / class386.field5629;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2535) / var7;
                if (arg2 < var8) {
                    arg4.field2535 += arg2 * var7;
                    break;
                }
                arg4.field2549.method593(arg5, arg1, var8);
                arg4.field2535 += var7 * var8 - 1048576;
                arg1 += var8;
                arg2 -= var8;
                int var9 = class386.field5629 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class699 var11 = arg4.field2549;
                if (this.field6996.field10338[arg4.field2551] == 0) {
                    arg4.field2549 = class699.method3855(arg4.field2550, var11.method3883(), var11.method3868(), var11.method3886());
                } else {
                    arg4.field2549 = class699.method3855(arg4.field2550, var11.method3883(), 0, var11.method3886());
                    this.field6996.method4148(arg0 ^ 0x46148, arg4.field2547.field10328[arg4.field2528] < 0, arg4);
                    arg4.field2549.method3867(var9, var11.method3868());
                }
                if (arg4.field2547.field10328[arg4.field2528] < 0) {
                    arg4.field2549.method3888(-1);
                }
                var11.method3892(var9);
                var11.method593(arg5, arg1, arg3 - arg1);
                if (var11.method3893()) {
                    this.field7006.method598(var11);
                }
            }
        }
        arg4.field2549.method593(arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "()I")
    public final int method591() {
        field6997++;
        return 0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "([[[Ljd;I)V")
    public static final void method2931(class243[][][] arg0, int arg1) {
        field7002++;
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class243[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class243 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3280 instanceof class392) {
                            ((class392) var6.field3280).method25(14667);
                        }
                        if (var6.field3277 instanceof class392) {
                            ((class392) var6.field3277).method25(14667);
                        }
                        if (var6.field3274 instanceof class392) {
                            ((class392) var6.field3274).method25(14667);
                        }
                        if (var6.field3270 instanceof class392) {
                            ((class392) var6.field3270).method25(14667);
                        }
                        if (var6.field3269 instanceof class392) {
                            ((class392) var6.field3269).method25(14667);
                        }
                        for (class48 var7 = var6.field3272; var7 != null; var7 = var7.field726) {
                            class319 var8 = var7.field725;
                            if (var8 instanceof class392) {
                                ((class392) var8).method25(14667);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "([III)V")
    public final void method593(int[] arg0, int arg1, int arg2) {
        field6999++;
        this.field7006.method593(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field7003.method2551((byte) -108); var4 != null; var4 = (class191) this.field7003.method2542(-122)) {
            if (!this.field6996.method4172(var4, 29302)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2532 >= var5) {
                        this.method2930(262144, var6, var5, var5 + var6, var4, arg0);
                        var4.field2532 -= var5;
                        break;
                    }
                    this.method2930(262144, var6, var4.field2532, var5 + var6, var4, arg0);
                    var5 -= var4.field2532;
                    var6 += var4.field2532;
                } while (!this.field6996.method4183(var4, var6, arg0, var5, -12));
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "()Lsia;")
    public final class766 method595() {
        field7004++;
        class191 var1 = (class191) this.field7003.method2551((byte) -108);
        if (var1 == null) {
            return null;
        } else if (var1.field2549 == null) {
            return this.method592();
        } else {
            return var1.field2549;
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(IILsq;)V")
    private final void method2932(int arg0, int arg1, class191 arg2) {
        field6995++;
        if ((this.field6996.field10378[arg2.field2551] & 0x4) != 0 && arg2.field2546 < 0) {
            int var4 = this.field6996.field10357[arg2.field2551] / class386.field5629;
            int var5 = (var4 + 1048575 - arg2.field2535) / var4;
            arg2.field2535 = arg1 * var4 + arg2.field2535 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field6996.field10338[arg2.field2551] == 0) {
                    arg2.field2549 = class699.method3855(arg2.field2550, arg2.field2549.method3883(), arg2.field2549.method3868(), arg2.field2549.method3886());
                } else {
                    arg2.field2549 = class699.method3855(arg2.field2550, arg2.field2549.method3883(), 0, arg2.field2549.method3886());
                    this.field6996.method4148(24904, arg2.field2547.field10328[arg2.field2528] < 0, arg2);
                }
                if (arg2.field2547.field10328[arg2.field2528] < 0) {
                    arg2.field2549.method3888(-1);
                }
                arg1 = arg2.field2535 / var4;
            }
        }
        if (arg0 != 22981) {
            this.method595();
        }
        arg2.field2549.method596(arg1);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public final void method596(int arg0) {
        this.field7006.method596(arg0);
        field6994++;
        for (class191 var2 = (class191) this.field7003.method2551((byte) -108); var2 != null; var2 = (class191) this.field7003.method2542(-95)) {
            if (!this.field6996.method4172(var2, 29302)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2532) {
                        this.method2932(22981, var3, var2);
                        var2.field2532 -= var3;
                        break;
                    }
                    this.method2932(22981, var2.field2532, var2);
                    var3 -= var2.field2532;
                } while (!this.field6996.method4183(var2, 0, null, var3, -12));
            }
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Ldr;)V")
    public class506(class751 arg0) {
        this.field6996 = arg0;
    }
}
