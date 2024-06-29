import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class71 extends class413 {

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    private int field948 = 0;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "Lrm;")
    private class79 field962 = new class79();

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "Luv;")
    public static class2 field951 = new class2(97, 8);

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field960 = 1406;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "Ldp;")
    public static class347 field961 = new class347("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "Luv;")
    public static class2 field963 = new class2(27, 8);

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "Lok;")
    public static class74 field964;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V", line = 3)
    public final void method499(int arg0, int arg1) {
        ++field947;
        if (arg1 != 1) {
            method503(false, -63);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZFLta;II)V", line = 18)
    public final void method490(boolean arg0, float arg1, class337 arg2, int arg3, int arg4) {
        super.field6228[super.field6224] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
        if (arg4 <= 120) {
            this.method491(38, -31);
        }
        ++field949;
        super.field6231[super.field6224] = arg2;
        super.field6232[super.field6224] = arg1;
        ++super.field6224;
        if (super.field6224 >= 5000) {
            super.field6224 = 0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Lrr;I)V", line = 35)
    public final void method489(class306 arg0, int arg1) {
        super.field6228[super.field6224] = 21;
        ++field950;
        super.field6231[super.field6224] = arg0;
        ++super.field6224;
        if (super.field6224 >= 5000) {
            super.field6224 = 0;
        }
        if (arg1 != 0) {
            this.method500((class306) null, -47);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V", line = 60)
    public final void method491(int arg0, int arg1) {
        if (arg1 == 1048576) {
            super.field6228[super.field6224] = (byte) arg0;
            ++field958;
            ++super.field6224;
            if (~super.field6224 <= -5001) {
                super.field6224 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lrr;I)V", line = 77)
    public final void method500(class306 arg0, int arg1) {
        ++field957;
        --super.field6233;
        if (super.field6233 < 0) {
            super.field6233 = 4999;
        }
        super.field6228[super.field6233] = 21;
        if (arg1 <= -55) {
            super.field6231[super.field6233] = arg0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 95)
    private final void method501(int arg0) {
        ++field959;
        int var2 = super.field6233++;
        if (~super.field6233 <= -5001) {
            super.field6233 = 0;
        }
        this.field948 = super.field6228[var2];
        Object var3 = super.field6231[var2];
        super.field6231[var2] = null;
        if (arg0 != 28548) {
            field960 = -61;
        }
        if (this.field948 == 21) {
            class51.method381(this.field962, (class306) var3);
        } else if (this.field948 != 20) {
            if (~this.field948 <= -31 && ~this.field948 >= -34) {
                class521.field7669.method154(3000.0F, super.field6232[var2] * 1.5F);
                ((class337) var3).method711(class487.field7256, class301.field4475, class489.field7290, class522.field7677, ~(this.field948 + -30) == -1);
            } else if (~this.field948 <= -41 && this.field948 <= 43) {
                class521.field7669.method154(3000.0F, super.field6232[var2] * 1.5F);
                ((class337) var3).method711(class487.field7256, class301.field4475, class489.field7290, class283.field4278, this.field948 + -40 == 0);
            } else {
                if (this.field948 != 22) {
                    if (this.field948 == 23) {
                        class521.field7669.method62();
                        return;
                    }
                    if (~this.field948 == -25) {
                        class521.field7669.method114(0, (class531[]) null);
                        return;
                    }
                } else {
                    class521.field7669.method104(-1, 1583160, 40, 127);
                }
            }
        } else {
            class306 var4 = (class306) var3;
            if (var4.field4596 != null) {
                var4.field4596.method234(class521.field7669, 28007);
            }
            if (var4.field4582 != null) {
                var4.field4582.method234(class521.field7669, 28007);
            }
            if (var4.field4592 != null) {
                var4.field4592.method234(class521.field7669, 28007);
            }
            if (var4.field4586 != null) {
                var4.field4586.method234(class521.field7669, 28007);
            }
            if (var4.field4577 != null) {
                var4.field4577.method234(class521.field7669, 28007);
            }
            for (class17 var5 = var4.field4589; var5 != null; var5 = var5.field281) {
                var5.field279.method234(class521.field7669, 28007);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILrr;)V", line = 190)
    public final void method488(int arg0, class306 arg1) {
        super.field6228[super.field6224] = 20;
        ++field952;
        if (arg0 >= -109) {
            this.method501(-53);
        }
        super.field6231[super.field6224] = arg1;
        ++super.field6224;
        if (~super.field6224 <= -5001) {
            super.field6224 = 0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 209)
    public static void method502(int arg0) {
        field961 = null;
        field951 = null;
        field963 = null;
        if (arg0 == 5000) {
            field964 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V", line = 226)
    public static final void method503(boolean arg0, int arg1) {
        if (!arg0) {
            field961 = null;
        }
        class341.field5244 = 3;
        class14.field191 = arg1;
        class154.field2331 = -1;
        ++field956;
        class197.field2888 = 100;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V", line = 243)
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class521.field7668 != null) {
            class521.field7668[arg0][arg1] = -16777216 | arg2;
        }
        if (class364.field5563 != null) {
            class364.field5563[arg0][arg1] = (short) arg3;
        }
        if (class282.field4269 != null) {
            class282.field4269[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;IZLok;)Lhp;", line = 257)
    public static final class290 method505(String arg0, int arg1, boolean arg2, class74 arg3) {
        ++field955;
        int var4 = arg3.method539((byte) 27, arg0);
        if (~var4 == 0) {
            return new class290(0);
        } else {
            int[] var5 = arg3.method522(0, var4);
            class290 var6 = new class290(var5.length);
            if (arg1 != 10392) {
                return null;
            } else {
                int var7 = 0;
                int var8 = 0;
                while (true) {
                    while (var6.field4349 > var7) {
                        class468 var9 = new class468(arg3.method541(var5[var8++], var4, (byte) -122));
                        int var10 = var9.method2722(false);
                        int var11 = var9.method2727((byte) 43);
                        int var12 = var9.method2765(127);
                        if (!arg2 && var12 == 1) {
                            --var6.field4349;
                        } else {
                            var6.field4348[var7] = var10;
                            var6.field4350[var7] = var11;
                            ++var7;
                        }
                    }
                    return var6;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 303)
    public final void method493(int arg0) {
        if (arg0 != 0) {
            this.field962 = null;
        }
        while (super.field6233 != super.field6224) {
            this.method501(28548);
        }
        ++field954;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 317)
    public final void method496(int arg0) {
        ++field953;
        if (arg0 != 0) {
            this.method501(60);
        }
    }
}
