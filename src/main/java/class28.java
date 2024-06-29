import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class28 extends class264 {

    @OriginalMember(owner = "client!cd", name = "nc", descriptor = "I")
    public int field412 = 0;

    @OriginalMember(owner = "client!cd", name = "xc", descriptor = "I")
    public int field422 = -1;

    @OriginalMember(owner = "client!cd", name = "jc", descriptor = "I")
    public int field408 = -1;

    @OriginalMember(owner = "client!cd", name = "rc", descriptor = "I")
    public int field416 = -1;

    @OriginalMember(owner = "client!cd", name = "Hc", descriptor = "I")
    public int field432 = -1;

    @OriginalMember(owner = "client!cd", name = "Bc", descriptor = "B")
    private byte field426 = 0;

    @OriginalMember(owner = "client!cd", name = "Dc", descriptor = "I")
    public int field428 = 0;

    @OriginalMember(owner = "client!cd", name = "Lc", descriptor = "Z")
    public boolean field436 = false;

    @OriginalMember(owner = "client!cd", name = "oc", descriptor = "I")
    public int field413 = -1;

    @OriginalMember(owner = "client!cd", name = "Ac", descriptor = "I")
    public int field425 = -1;

    @OriginalMember(owner = "client!cd", name = "Ic", descriptor = "I")
    public int field433 = 0;

    @OriginalMember(owner = "client!cd", name = "Tc", descriptor = "I")
    public int field444 = 0;

    @OriginalMember(owner = "client!cd", name = "Oc", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "client!cd", name = "Gc", descriptor = "I")
    public int field431 = 0;

    @OriginalMember(owner = "client!cd", name = "Qc", descriptor = "I")
    public int field441 = 255;

    @OriginalMember(owner = "client!cd", name = "mc", descriptor = "Ljava/lang/String;")
    public static String field411 = "Loading textures - ";

    @OriginalMember(owner = "client!cd", name = "sc", descriptor = "[Ljava/lang/String;")
    public static String[] field417 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!cd", name = "wc", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "client!cd", name = "Kc", descriptor = "Ljava/lang/String;")
    public static String field435 = "Opened title screen";

    @OriginalMember(owner = "client!cd", name = "Rc", descriptor = "Z")
    public static boolean field442 = false;

    @OriginalMember(owner = "client!cd", name = "Xc", descriptor = "Ljava/lang/String;")
    public static String field448 = "Loading defaults - ";

    @OriginalMember(owner = "client!cd", name = "kc", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!cd", name = "lc", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cd", name = "pc", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!cd", name = "qc", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!cd", name = "tc", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cd", name = "uc", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!cd", name = "vc", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!cd", name = "zc", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!cd", name = "Cc", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cd", name = "Ec", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!cd", name = "Fc", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!cd", name = "Jc", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cd", name = "Mc", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!cd", name = "Sc", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!cd", name = "Uc", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!cd", name = "Wc", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!cd", name = "Nc", descriptor = "Lag;")
    public static class188 field438;

    @OriginalMember(owner = "client!cd", name = "Pc", descriptor = "Lvl;")
    public class242 field440;

    @OriginalMember(owner = "client!cd", name = "yc", descriptor = "Lhl;")
    public static class40 field423;

    @OriginalMember(owner = "client!cd", name = "Vc", descriptor = "Ljava/lang/String;")
    public String field446;

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field418;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
    public final int method218(byte arg0) {
        if (arg0 != -51) {
            return 35;
        } else {
            ++field427;
            return super.field4203;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIIIILrg;ILgj;II)V")
    private final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class233 arg11, int arg12, class240 arg13, int arg14, int arg15) {
        int var17 = arg9 * arg9 - -(arg10 * arg10);
        ++field419;
        if (~var17 <= -17 && arg3 >= var17) {
            if (arg12 != 24226) {
                this.method223();
            }
            int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg9, (double) arg10));
            class233 var19 = class48.method395(super.field4187, 113, arg11, var18, super.field4123, super.field4176, arg7);
            if (var19 != null) {
                var19.method225(0, arg4, arg2, arg6, arg0, arg8, arg1, arg14, -1L, arg15, arg13);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lf;B)V")
    public final void method220(class37 arg0, byte arg1) {
        arg0.field588 = 0;
        ++field443;
        int var3 = arg0.method333((byte) -59);
        int var4 = var3 & 1;
        boolean var5 = ~(var3 & 4) != -1;
        if (arg1 < -37) {
            int var6 = super.method226((byte) -97);
            this.method1804((byte) -45, ((var3 & 61) >> 3) + 1);
            this.field426 = (byte) ((219 & var3) >> 6);
            super.field4176 += (-var6 + this.method226((byte) -97)) * 64;
            super.field4123 += (-var6 + this.method226((byte) -97)) * 64;
            this.field408 = arg0.method322((byte) 66);
            this.field439 = arg0.method322((byte) 66);
            this.field433 = 0;
            int var7 = -1;
            int[] var8 = new int[12];
            for (int var9 = 0; var9 < 12; ++var9) {
                int var10 = arg0.method333((byte) -59);
                if (var10 == 0) {
                    var8[var9] = 0;
                } else {
                    int var11 = arg0.method333((byte) -59);
                    int var12 = (var10 << 8) + var11;
                    if (~var9 == -1 && ~var12 == -65536) {
                        var7 = arg0.method293(-115);
                        this.field433 = arg0.method333((byte) -59);
                        break;
                    }
                    if (var12 >= 32768) {
                        int var25 = class9.field194[var12 - 32768];
                        var8[var9] = class115.method840(1073741824, var25);
                        int var26 = class32.method260(var25, true).field1927;
                        if (var26 != 0) {
                            this.field433 = var26;
                        }
                    } else {
                        var8[var9] = class115.method840(var12 + -256, Integer.MIN_VALUE);
                    }
                }
            }
            int[] var13 = new int[5];
            for (int var14 = 0; var14 < 5; ++var14) {
                int var24 = arg0.method333((byte) -59);
                if (var24 < 0 || ~var24 <= ~class247.field3817[var14].length) {
                    var24 = 0;
                }
                var13[var14] = var24;
            }
            super.field4203 = arg0.method293(-61);
            long var15 = arg0.method315(1744669920);
            this.field446 = class288.method1938(var15, 27);
            this.field428 = arg0.method333((byte) -59);
            if (!var5) {
                this.field431 = 0;
                this.field412 = arg0.method333((byte) -59);
                this.field425 = arg0.method333((byte) -59);
                if (this.field425 == 255) {
                    this.field425 = -1;
                }
            } else {
                this.field431 = arg0.method293(-122);
                this.field425 = -1;
                this.field412 = this.field428;
            }
            int var17 = this.field444;
            this.field444 = arg0.method333((byte) -59);
            if (~this.field444 != -1) {
                int var18 = this.field416;
                int var19 = this.field432;
                int var20 = this.field413;
                int var21 = this.field422;
                int var22 = this.field441;
                this.field416 = arg0.method293(117);
                this.field422 = arg0.method293(89);
                this.field432 = arg0.method293(106);
                this.field413 = arg0.method293(-121);
                this.field441 = arg0.method333((byte) -59);
                if (~this.field444 != ~var17 || this.field416 != var18 || ~this.field422 != ~var21 || this.field432 != var19 || ~this.field413 != ~var20 || ~this.field441 != ~var22) {
                    class258.method1711((byte) -92, this);
                }
            } else {
                class143.method986(this, 0);
            }
            if (this.field440 == null) {
                this.field440 = new class242();
            }
            int var23 = this.field440.field3755;
            this.field440.method1633(var7, (byte) 98, var4 == 1, var13, super.field4203, var8);
            if (var7 != var23) {
                super.field4176 = super.field4204[0] * 128 + 64 * this.method226((byte) -97);
                super.field4123 = super.field4143[0] * 128 - -(64 * this.method226((byte) -97));
            }
            if (super.field4144 != null) {
                super.field4144.method1624();
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZIB)V")
    public final void method221(int arg0, boolean arg1, int arg2, byte arg3) {
        super.method1803(arg2, this.method226((byte) -97), arg0, arg1, 118);
        ++field409;
        if (arg3 >= -96) {
            field438 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method222(int arg0) {
        ++field434;
        String var2 = this.field446;
        if (class254.field3899 != null) {
            var2 = class254.field3899[this.field426] + var2;
        }
        if (class222.field3480 != null) {
            var2 = var2 + class222.field3480[this.field426];
        }
        if (arg0 != 0) {
            this.field440 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public final int method223() {
        ++field430;
        return super.field4177;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lql;")
    public static final class223 method224(int arg0, int arg1) {
        ++field414;
        class223 var2 = (class223) class247.field3822.method1780((long) arg0, (byte) -126);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 <= 50) {
                method224(-62, 1);
            }
            byte[] var3 = class251.field3851.method1163(class107.method813(arg0, (byte) 122), class141.method974(arg0, 1), 48);
            class223 var4 = new class223();
            var4.field3492 = arg0;
            if (var3 != null) {
                var4.method1488(new class37(var3), 78);
            }
            var4.method1497(-25536);
            class247.field3822.method1784(var4, false, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        ++field429;
        if (this.field440 != null) {
            class223 var13 = ~super.field4210 != 0 && ~super.field4179 == -1 ? method224(super.field4210, 71) : null;
            class223 var14 = super.field4148 == -1 || this.field436 || ~super.field4148 == ~this.method1801((byte) 114).field142 && var13 != null ? null : method224(super.field4148, 90);
            class233 var15 = this.field440.method1640(var14, var13, 5118, super.field4185, super.field4164, super.field4196, super.field4215, true, super.field4194, super.field4192, super.field4175);
            int var16 = class121.method863(91);
            if (~class210.field3258 != -1 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (~class42.field683 > ~var17) {
                    class136.field2114[class42.field683] = new byte[102400];
                    ++class42.field683;
                }
                while (class42.field683 > var17) {
                    --class42.field683;
                    class136.field2114[class42.field683] = null;
                }
            }
            if (var15 != null) {
                super.field4177 = var15.method223();
                if (class272.field4299 && (this.field440.field3755 == -1 || class253.method1689(this.field440.field3755, -22396).field3350)) {
                    class233 var18 = class263.method1786(super.field4176, super.field4187, 0, var14 != null ? super.field4164 : super.field4185, 0, var15, super.field4157, super.field4123, 16777215, 160, var14 == null ? var13 : var14, 240, arg0, 1);
                    var18.method225(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class240) null);
                }
                if (class261.field4058 == this) {
                    for (int var19 = class217.field3360.length + -1; var19 >= 0; --var19) {
                        class25 var20 = class217.field3360[var19];
                        if (var20 != null && ~var20.field376 != 0) {
                            if (~var20.field385 == -2 && ~var20.field371 <= -1 && ~var20.field371 > ~class72.field1144.length) {
                                class32 var21 = class72.field1144[var20.field371];
                                if (var21 != null) {
                                    int var22 = var21.field4176 / 32 + -(class261.field4058.field4176 / 32);
                                    int var23 = var21.field4123 / 32 + -(class261.field4058.field4123 / 32);
                                    this.method219(arg4, arg6, arg2, 360000, arg1, arg0, arg3, var20.field376, arg5, var22, var23, var15, 24226, (class240) null, arg7, arg9);
                                }
                            }
                            if (~var20.field385 == -3) {
                                int var24 = (var20.field377 - class129.field2008) * 4 + -(class261.field4058.field4123 / 32) + 2;
                                int var25 = (-class118.field1828 + var20.field375) * 4 - -2 + -(class261.field4058.field4176 / 32);
                                int var26 = var20.field378 * 4;
                                int var27 = var26 * var26;
                                this.method219(arg4, arg6, arg2, var27, arg1, arg0, arg3, var20.field376, arg5, var25, var24, var15, 24226, (class240) null, arg7, arg9);
                            }
                            if (~var20.field385 == -11 && ~var20.field371 <= -1 && class41.field675.length > var20.field371) {
                                class28 var28 = class41.field675[var20.field371];
                                if (var28 != null) {
                                    int var29 = var28.field4176 / 32 + -(class261.field4058.field4176 / 32);
                                    int var30 = var28.field4123 / 32 + -(class261.field4058.field4123 / 32);
                                    this.method219(arg4, arg6, arg2, 360000, arg1, arg0, arg3, var20.field376, arg5, var29, var30, var15, 24226, (class240) null, arg7, arg9);
                                }
                            }
                        }
                    }
                }
                class233 var31 = null;
                this.method1800(var15, -12);
                this.method1802(arg0, 0, var15);
                if (!this.field436 && ~super.field4135 != 0 && super.field4188 != -1) {
                    class259 var32 = class23.method189(super.field4135, (byte) -125);
                    var31 = var32.method1717(super.field4206, super.field4136, super.field4188, -29868);
                    if (var31 != null) {
                        var31.method1549(0, -super.field4137, 0);
                        if (var32.field3960) {
                            if (~class271.field4283 != -1) {
                                var31.method1553(class271.field4283);
                            }
                            if (class253.field3892 != 0) {
                                var31.method1546(class253.field3892);
                            }
                            if (class257.field3947 != 0) {
                                var31.method1549(0, class257.field3947, 0);
                            }
                        }
                    }
                }
                class233 var33 = null;
                if (!this.field436 && super.field4138 != null) {
                    if (~super.field4186 >= ~class267.field4256) {
                        super.field4138 = null;
                    }
                    if (~class267.field4256 <= ~super.field4129 && class267.field4256 < super.field4186) {
                        if (super.field4138 instanceof class296) {
                            var33 = (class233) ((class296) super.field4138).method1985(-1);
                        } else {
                            var33 = (class233) super.field4138;
                        }
                        var33.method1549(-super.field4176 + super.field4216, -super.field4187 + super.field4195, -super.field4123 + super.field4134);
                        if (~super.field4199 == -513) {
                            var33.method1540();
                        } else if (super.field4199 == 1024) {
                            var33.method1530();
                        } else if (super.field4199 == 1536) {
                            var33.method1528();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class281) var15).method1891(var31);
                }
                if (var33 != null) {
                    var15 = ((class281) var15).method1891(var33);
                }
                var15.field3609 = true;
                var15.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4144);
                if (var33 != null) {
                    if (super.field4199 != 512) {
                        if (~super.field4199 != -1025) {
                            if (super.field4199 == 1536) {
                                var33.method1540();
                            }
                        } else {
                            var33.method1530();
                        }
                    } else {
                        var33.method1528();
                    }
                    var33.method1549(super.field4176 - super.field4216, -super.field4195 + super.field4187, -super.field4134 + super.field4123);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != -97) {
            this.field444 = -86;
        }
        ++field447;
        return this.field440 != null && this.field440.field3755 != -1 ? class253.method1689(this.field440.field3755, -22396).field3352 : super.method226((byte) -97);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field410;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static void method228(int arg0) {
        field411 = null;
        field435 = null;
        field417 = null;
        field423 = null;
        field438 = null;
        field448 = null;
        if (arg0 != -993017304) {
            method224(62, -121);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Z")
    public final boolean method229(int arg0) {
        ++field420;
        if (this.field440 == null) {
            return false;
        } else {
            if (arg0 != -18109) {
                this.method229(-124);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILud;)V")
    public static final void method230(boolean arg0, int arg1, class2 arg2) {
        ++field437;
        if (arg0) {
            int var3 = class277.field4369;
            int var4 = var3 * 956 / 503;
            class264.field4163.method39((-var4 + class35.field573) / 2, 0, var4, var3);
            class83.field1370.method1117(class35.field573 / 2 + -(class83.field1370.field2670 / 2), 18);
        }
        arg2.method12(class297.field4692, class35.field573 / 2, class277.field4369 / 2 + -26, 16777215, -1);
        int var5 = class277.field4369 / 2 + -18;
        class201.method1340(class35.field573 / 2 + -152, var5, 304, 34, 9179409);
        class201.method1340(class35.field573 / 2 - 151, var5 - -1, 302, 32, 0);
        if (arg1 != 2332) {
            field415 = 51;
        }
        class201.method1333(class35.field573 / 2 + -150, var5 - -2, class139.field2137 * 3, 30, 9179409);
        class201.method1333(class35.field573 / 2 + class139.field2137 * 3 + -150, var5 + 2, -(class139.field2137 * 3) + 300, 30, 0);
        arg2.method12(class33.field526, class35.field573 / 2, class277.field4369 / 2 + 4, 16777215, -1);
    }
}
