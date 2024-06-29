import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class638 extends class280 {

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Z")
    public boolean field9040;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "S")
    public short field9038;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "S")
    public short field9036;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "S")
    public short field9042;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "B")
    public byte field9032;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "S")
    public short field9035;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field9031 = -1;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "F")
    public static float field9039;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(B)Z", line = 5)
    public final boolean method92(byte arg0) {
        ++field9037;
        for (int var2 = this.field9038; this.field9036 >= var2; ++var2) {
            for (int var3 = this.field9035; ~this.field9042 <= ~var3; ++var3) {
                int var4 = class430.field6190 + var2 + -class613.field8757;
                if (var4 >= 0 && ~class437.field6237.length < ~var4) {
                    int var5 = -class140.field1915 + var3 + class430.field6190;
                    if (~var5 <= -1 && ~var5 > ~class437.field6237.length && class437.field6237[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        if (arg0 <= 16) {
            this.method90(-10, (class40[]) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V", line = 47)
    public static final void method3677(int arg0, int arg1, int arg2) {
        class375 var3 = class565.field8185[arg0][arg1][arg2];
        if (var3 != null) {
            class502.method3061(var3.field5431);
            class502.method3061(var3.field5427);
            if (var3.field5431 != null) {
                var3.field5431 = null;
            }
            if (var3.field5427 != null) {
                var3.field5427 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)Z", line = 70)
    public final boolean method88(int arg0) {
        if (arg0 != -1) {
            method3679(-88, 44, 27, 21, (class428) null);
        }
        ++field9033;
        return class3.method12(this.method595(32767), super.field3924, this.field9038, this.field9035, arg0, this.field9042, this.field9036);
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V", line = 81)
    public void method1308(int arg0) {
        if (arg0 != -680858839) {
            this.method92((byte) 86);
        }
        ++field9044;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)V", line = 91)
    public static final void method3678(boolean arg0, int arg1) {
        ++field9043;
        if (arg0) {
            if (class346.field4771 != -1) {
                class706.method3956(0, class346.field4771);
            }
            for (class182 var2 = (class182) class591.field8410.method4023((byte) -85); var2 != null; var2 = (class182) class591.field8410.method4021((byte) 80)) {
                if (!var2.method2657(false)) {
                    var2 = (class182) class591.field8410.method4023((byte) -59);
                    if (var2 == null) {
                        break;
                    }
                }
                class417.method2517(0, true, false, var2);
            }
            class346.field4771 = -1;
            class591.field8410 = new class715(8);
            class727.method4061(arg1);
            class346.field4771 = class119.field1638;
            class196.method1380(arg1 ^ -78, false);
            class328.method2021(-8586);
            class529.method3202(class346.field4771);
        }
        class669.field9541 = "";
        class505.field7344 = "";
        class496.field7143 = false;
        class743.method4136((byte) -59);
        class548.field7953 = arg1;
        class174.method1258((byte) 127, class718.field10132);
        class108.field1536 = new class639();
        class108.field1536.field3916 = class240.field3555 * 512 / 2;
        class108.field1536.field4646[0] = class184.field2546 / 2;
        class108.field1536.field3923 = class184.field2546 * 512 / 2;
        class123.field1698 = 0;
        class518.field7473 = 0;
        class108.field1536.field4645[0] = class240.field3555 / 2;
        if (~class165.field2351 == -3) {
            class123.field1698 = class136.field1875 << 9;
            class518.field7473 = class559.field8124 << 9;
        } else {
            class215.method1522((byte) 127);
        }
        class728.method4065(-1386);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILqq;)V", line = 161)
    public static final void method3679(int arg0, int arg1, int arg2, int arg3, class428 arg4) {
        ++field9041;
        long var5 = (long) (arg1 << 14 | arg3 << 28 | arg0);
        class340 var7 = (class340) class591.field8409.method4020(var5, (byte) -119);
        if (var7 == null) {
            class340 var8 = new class340();
            class591.field8409.method4022(var8, 96, var5);
            var8.field4685.method3559(arg4, (byte) 12);
        } else {
            class424 var9 = class425.field6147.method4144(arg4.field6169, 126);
            int var10 = var9.field6100;
            if (var9.field6064 == 1) {
                var10 = (arg4.field6171 - -1) * var10;
            }
            if (arg2 <= -21) {
                for (class428 var11 = (class428) var7.field4685.method3565(127); var11 != null; var11 = (class428) var7.field4685.method3561((byte) 118)) {
                    class424 var12 = class425.field6147.method4144(var11.field6169, 123);
                    int var13 = var12.field6100;
                    if (var12.field6064 == 1) {
                        var13 = (var11.field6171 + 1) * var13;
                    }
                    if (~var13 > ~var10) {
                        class527.method3191(arg4, var11, -117);
                        return;
                    }
                }
                var7.field4685.method3559(arg4, (byte) 12);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 212)
    public class638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field9040 = arg9;
        super.field3920 = (byte) arg0;
        super.field3923 = arg2;
        super.field3916 = arg4;
        this.field9038 = (short) arg5;
        super.field3924 = (byte) arg1;
        super.field3922 = arg3;
        this.field9036 = (short) arg6;
        this.field9042 = (short) arg8;
        this.field9032 = arg10;
        this.field9035 = (short) arg7;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[Lwh;)I", line = 231)
    public final int method90(int arg0, class40[] arg1) {
        ++field9034;
        int var3 = 0;
        label114: for (int var4 = this.field9038; this.field9036 >= var4; ++var4) {
            label112: for (int var5 = this.field9035; var5 <= this.field9042; ++var5) {
                long var6 = class72.field1096[super.field3920][var4][var5];
                long var8 = 0L;
                while (true) {
                    label107: while (true) {
                        if (~var8 < -49L) {
                            continue label112;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label112;
                        }
                        class187 var11 = class62.field1000[var10 + -1];
                        for (int var12 = 0; ~var12 > ~var3; ++var12) {
                            if (arg1[var12] == var11.field2630) {
                                var8 += 16L;
                                continue label107;
                            }
                        }
                        arg1[var3++] = var11.field2630;
                        if (var3 == 4) {
                            break label114;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg1[var13] = null;
        }
        if (~this.field9032 != arg0) {
            int var14 = -class613.field8757 + this.field9038;
            int var15 = this.field9035 - class140.field1915;
            short var16;
            int var17;
            int var18;
            short var19;
            if (this.field9032 == 1) {
                if (var15 > var14) {
                    var16 = this.field9035;
                    var17 = this.field9035 + -1;
                    var18 = this.field9038 - -1;
                    var19 = this.field9038;
                } else {
                    var17 = this.field9035 + 1;
                    var18 = this.field9038 + -1;
                    var19 = this.field9038;
                    var16 = this.field9035;
                }
            } else if (~(-var14) <= ~var15) {
                var17 = this.field9035 + 1;
                var19 = this.field9038;
                var16 = this.field9035;
                var18 = this.field9038 + 1;
            } else {
                var17 = this.field9035 + -1;
                var18 = this.field9038 - 1;
                var16 = this.field9035;
                var19 = this.field9038;
            }
            label78: for (int var20 = 0; var20 < var3; ++var20) {
                long var21 = class72.field1096[super.field3920][var19][var17];
                while (var21 != 0L) {
                    class187 var27 = class62.field1000[(int) ((var21 & 65535L) + -1L)];
                    var21 >>>= 16;
                    if (arg1[var20] == var27.field2630) {
                        continue label78;
                    }
                }
                long var23 = class72.field1096[super.field3920][var18][var16];
                while (~var23 != -1L) {
                    class187 var26 = class62.field1000[(int) ((var23 & 65535L) + -1L)];
                    var23 >>>= 16;
                    if (arg1[var20] == var26.field2630) {
                        continue label78;
                    }
                }
                for (int var25 = var20; ~(var3 + -1) < ~var25; ++var25) {
                    arg1[var25] = arg1[var25 + 1];
                }
                --var3;
            }
        }
        return var3;
    }
}
