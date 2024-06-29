import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class273 {

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4395 = "Continue";

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lhh;")
    public static class169 field4399 = new class169();

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "Z")
    public static boolean field4410 = true;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "[I")
    public static int[] field4411 = new int[32];

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field4408 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    private int field4409;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lek;", line = 4)
    public final class220 method1969(int arg0) {
        field4401++;
        if (arg0 >= -108) {
            method1970(true);
        }
        class220 var2 = (class220) class50.field705.method704((byte) 39, (long) this.field4409);
        if (var2 != null) {
            return var2;
        }
        class220 var3 = class88.method599(0, (byte) -86, this.field4409, class289.field4635);
        if (var3 != null) {
            class50.field705.method703(var3, (long) this.field4409, (byte) 88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1970(boolean arg0) {
        field4395 = null;
        field4411 = null;
        field4399 = null;
        if (!arg0) {
            method1974(-39, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 39)
    public static final void method1971(int arg0, int arg1) {
        field4407++;
        class165.field2743 = 20;
        int var2 = 41 / ((arg0 + 13) / 55);
        class304.field4758 = arg1;
        class69.field969 = 3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([SB)[S", line = 51)
    public static final short[] method1972(short[] arg0, byte arg1) {
        field4394++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        class9.method51(arg0, 0, var2, 0, arg0.length);
        if (arg1 > -103) {
            field4395 = (String) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 69)
    public static final void method1973(int arg0, int arg1) {
        field4406++;
        if (~class286.field4586 == arg0) {
            class211.field3459.method852(-16257, arg1);
        } else {
            class291.field4652 = arg1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)V", line = 84)
    public static final void method1974(int arg0, byte arg1) {
        if (arg1 == 37) {
            class94.field1286 = 1000 / arg0;
            field4393++;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjj;I)V", line = 96)
    public final void method1975(int arg0, class44 arg1, int arg2) {
        int var4 = -81 % ((arg0 + 61) / 44);
        while (true) {
            int var5 = arg1.method286((byte) -89);
            if (var5 == 0) {
                field4400++;
                return;
            }
            this.method1981(arg1, 2, arg2, var5);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lak;BLak;)V", line = 117)
    public static final void method1976(class172 arg0, byte arg1, class172 arg2) {
        if (arg1 < -2) {
            class298.field4705 = arg2;
            field4412++;
            class231.field3683 = arg0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IB)Z", line = 132)
    public static final boolean method1977(int arg0, byte arg1) {
        class236.field3767 = true;
        if (arg1 >= -7) {
            return false;
        } else {
            field4405++;
            class39.field502 = arg0 + 1 & 0xFFFF;
            return true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 150)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4403++;
        int var7 = 0;
        if (arg3 != -2087878879) {
            method1980(-125, 90, 94, (byte) -65, 16, -92, -82, 57, -17);
        }
        class225.method1599(arg2, 7);
        int var8 = arg2;
        int var9 = arg2 - arg6;
        int var10 = -arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        if (arg4 >= class98.field1410 && class279.field4497 >= arg4) {
            int[] var14 = class281.field4523[arg4];
            int var15 = class33.method178(class191.field3131, class336.field5249, arg0 - arg2, 87);
            int var16 = class33.method178(class191.field3131, class336.field5249, arg0 + arg2, 120);
            int var17 = class33.method178(class191.field3131, class336.field5249, arg0 - var9, 117);
            int var18 = class33.method178(class191.field3131, class336.field5249, arg0 + var9, 81);
            class80.method545(arg1, -112, var17, var15, var14);
            class80.method545(arg5, -100, var18, var17, var14);
            class80.method545(arg1, arg3 + 2087878792, var16, var18, var14);
        }
        int var19 = -1;
        while (var8 > var7) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class137.field2163[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            var10 += var13;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg4 - var8;
                int var21 = arg4 + var8;
                if (var21 >= class98.field1410 && var20 <= class279.field4497) {
                    if (var8 < var9) {
                        int var22 = class137.field2163[var8];
                        int var23 = class33.method178(class191.field3131, class336.field5249, arg0 + var7, 50);
                        int var24 = class33.method178(class191.field3131, class336.field5249, arg0 - var7, 124);
                        int var25 = class33.method178(class191.field3131, class336.field5249, arg0 + var22, arg3 ^ 0x838D7F00);
                        int var26 = class33.method178(class191.field3131, class336.field5249, arg0 - var22, 90);
                        if (class279.field4497 >= var21) {
                            int[] var27 = class281.field4523[var21];
                            class80.method545(arg1, -104, var26, var24, var27);
                            class80.method545(arg5, -81, var25, var26, var27);
                            class80.method545(arg1, -98, var23, var25, var27);
                        }
                        if (class98.field1410 <= var20) {
                            int[] var28 = class281.field4523[var20];
                            class80.method545(arg1, -66, var26, var24, var28);
                            class80.method545(arg5, -70, var25, var26, var28);
                            class80.method545(arg1, -106, var23, var25, var28);
                        }
                    } else {
                        int var29 = class33.method178(class191.field3131, class336.field5249, arg0 + var7, arg3 ^ 0x838D7F5B);
                        int var30 = class33.method178(class191.field3131, class336.field5249, arg0 - var7, 21);
                        if (var21 <= class279.field4497) {
                            class80.method545(arg1, -47, var29, var30, class281.field4523[var21]);
                        }
                        if (var20 >= class98.field1410) {
                            class80.method545(arg1, -118, var29, var30, class281.field4523[var20]);
                        }
                    }
                }
            }
            int var31 = arg4 - var7;
            int var32 = arg4 + var7;
            if (var32 >= class98.field1410 && class279.field4497 >= var31) {
                int var33 = arg0 + var8;
                int var34 = arg0 - var8;
                if (var33 >= class336.field5249 && var34 <= class191.field3131) {
                    int var35 = class33.method178(class191.field3131, class336.field5249, var33, 40);
                    int var36 = class33.method178(class191.field3131, class336.field5249, var34, 126);
                    if (var7 >= var9) {
                        if (class279.field4497 >= var32) {
                            class80.method545(arg1, arg3 ^ 0x7C728099, var35, var36, class281.field4523[var32]);
                        }
                        if (var31 >= class98.field1410) {
                            class80.method545(arg1, -69, var35, var36, class281.field4523[var31]);
                        }
                    } else {
                        int var37 = var7 > var11 ? class137.field2163[var7] : var11;
                        int var38 = class33.method178(class191.field3131, class336.field5249, arg0 + var37, 94);
                        int var39 = class33.method178(class191.field3131, class336.field5249, arg0 - var37, arg3 + 2087878923);
                        if (var32 <= class279.field4497) {
                            int[] var40 = class281.field4523[var32];
                            class80.method545(arg1, -86, var39, var36, var40);
                            class80.method545(arg5, -88, var38, var39, var40);
                            class80.method545(arg1, arg3 + 2087878825, var35, var38, var40);
                        }
                        if (class98.field1410 <= var31) {
                            int[] var41 = class281.field4523[var31];
                            class80.method545(arg1, -108, var39, var36, var41);
                            class80.method545(arg5, -94, var38, var39, var41);
                            class80.method545(arg1, -53, var35, var38, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Lck;", line = 338)
    public static final class79 method1979(int arg0, int arg1) {
        if (arg0 < 119) {
            method1978(80, -11, -47, -92, 126, 122, 20);
        }
        field4396++;
        class79 var2 = (class79) class33.field449.method704((byte) 97, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class194.field3171.method1287(arg1, 31, -1);
        class79 var4 = new class79();
        if (var3 != null) {
            var4.method536(new class44(var3), false, arg1);
        }
        class33.field449.method703(var4, (long) arg1, (byte) 40);
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIIIII)V", line = 367)
    public static final void method1980(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -50 / ((54 - arg3) / 63);
        field4402++;
        int var10 = arg5 - arg1;
        int var11 = arg8 - arg2;
        int var12 = (arg6 - arg4 << 16) / var10;
        int var13 = (arg7 - arg0 << 16) / var11;
        class268.method1900(arg1, 0, (byte) -17, var13, arg2, arg0, 0, arg5, arg4, var12, arg8);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljj;III)V", line = 396)
    private final void method1981(class44 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field4409 = arg0.method271(21081);
        } else if (arg3 == 2) {
            this.field4404 = arg0.method286((byte) -118);
            this.field4397 = arg0.method286((byte) -107);
        }
        if (arg1 == 2) {
            field4398++;
        }
    }
}
