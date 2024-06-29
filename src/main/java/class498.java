import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class498 extends class222 implements class68 {

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Lgs;")
    public class33 field7335;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Z")
    private boolean field7346;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method2967(byte arg0, int arg1) {
        if (class304.field4438 == null) {
            class304.field4438 = new byte[4][class398.field6071][class528.field7734];
        }
        ++field7343;
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; class398.field6071 > var3; ++var3) {
                for (int var4 = 0; ~var4 > ~class528.field7734; ++var4) {
                    class304.field4438[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 != 1024) {
            method2969(true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILqa;I)Lka;", line = 44)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 != 14221) {
            field7350 = -55;
        }
        ++field7351;
        return this.field7335.method280((byte) -25, 0, false, 0, false, arg0, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLqa;)V", line = 57)
    public final void method333(boolean arg0, class165 arg1) {
        this.field7335.method283(arg1, -116);
        ++field7342;
        if (!arg0) {
            this.method337(27, (class165) null, 37);
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)I", line = 68)
    public final int method338(int arg0) {
        if (arg0 < 75) {
            this.method1497(-30);
        }
        ++field7348;
        return this.field7335.field475;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I", line = 79)
    public final int method336(int arg0) {
        if (arg0 != -6130) {
            field7350 = -57;
        }
        ++field7337;
        return this.field7335.field492;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 90)
    public final void method334(int arg0) {
        if (arg0 != 29893) {
            this.field7335 = null;
        }
        ++field7341;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)I", line = 101)
    public final int method1497(int arg0) {
        if (arg0 < 61) {
            this.method332(114);
        }
        ++field7347;
        return this.field7335.method279(-1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lqa;I)V", line = 115)
    public final void method330(class165 arg0, int arg1) {
        this.field7335.method282(false, arg0);
        ++field7338;
        if (arg1 != 14470) {
            this.method1497(22);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)I", line = 127)
    public final int method332(int arg0) {
        ++field7339;
        if (arg0 != 6359) {
            this.field7335 = null;
        }
        return this.field7335.field486;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIILqa;)Z", line = 141)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field7349;
        class334 var5 = this.field7335.method280((byte) -25, super.field3091, false, super.field3087, false, 131072, arg3);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 < 121) {
                this.method336(-93);
            }
            class14 var6 = arg3.method751();
            var6.method141(super.field3087 - -super.field3101, super.field3095, super.field3091 - -super.field3105);
            return var5.method68(arg2, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z", line = 160)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            field7350 = 110;
        }
        ++field7352;
        return this.field7335.method278(-1);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZLqa;)V", line = 173)
    public final void method135(boolean arg0, class165 arg1) {
        ++field7345;
        class334 var3 = this.field7335.method280((byte) -25, super.field3091, arg0, super.field3087, true, 262144, arg1);
        if (var3 != null) {
            int var4 = super.field3087 >> 7;
            int var5 = super.field3091 >> 7;
            this.field7335.method285(var5, var4, var5, arg1, false, var3, 0, var4);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIZIIIIII)V", line = 193)
    public class498(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class321.method1999((byte) -32, arg11, arg12));
        this.field7335 = new class33(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field7346 = arg1.field2930 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILqa;)Lou;", line = 204)
    public final class437 method136(int arg0, class165 arg1) {
        ++field7344;
        class334 var3 = this.field7335.method280((byte) -25, super.field3091, false, super.field3087, true, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class14 var4 = arg1.method751();
            var4.method141(super.field3101 + super.field3087, super.field3095, super.field3091 - -super.field3105);
            class437 var5 = null;
            if (this.field7346) {
                var5 = class530.method3133(false, 1);
            }
            if (this.field7335.field474 == null) {
                var3.method53(var4, var5 == null ? null : var5.field6608[0], 0);
            } else {
                class137 var6 = this.field7335.field474.method1533();
                arg1.method840(var3, var6, var4, var5 == null ? null : var5.field6608[0], 0);
            }
            int var7 = super.field3087 >> 7;
            int var8 = super.field3091 >> 7;
            this.field7335.method285(var8, var7, var8, arg1, true, var3, arg0, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[[[Lsn;)V", line = 242)
    public static final void method2968(int arg0, class452[][][] arg1) {
        if (arg0 > -6) {
            field7350 = -4;
        }
        for (int var2 = 0; ~var2 > ~arg1.length; ++var2) {
            class452[][] var3 = arg1[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var3[var4].length > var5; ++var5) {
                    class452 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6801 instanceof class68) {
                            ((class68) var6.field6801).method334(29893);
                        }
                        if (var6.field6809 instanceof class68) {
                            ((class68) var6.field6809).method334(29893);
                        }
                        if (var6.field6815 instanceof class68) {
                            ((class68) var6.field6815).method334(29893);
                        }
                        if (var6.field6812 instanceof class68) {
                            ((class68) var6.field6812).method334(29893);
                        }
                        if (var6.field6797 instanceof class68) {
                            ((class68) var6.field6797).method334(29893);
                        }
                        for (class384 var7 = var6.field6814; var7 != null; var7 = var7.field5834) {
                            class140 var8 = var7.field5832;
                            if (var8 instanceof class68) {
                                ((class68) var8).method334(29893);
                            }
                        }
                    }
                }
            }
        }
        ++field7336;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(Z)Lfb;", line = 315)
    public static final class484 method2969(boolean arg0) {
        ++field7340;
        if (class12.field216 != null && class429.field6508 != null) {
            if (!arg0) {
                field7350 = 43;
            }
            for (class484 var1 = (class484) class429.field6508.method1041((byte) -76); var1 != null; var1 = (class484) class429.field6508.method1041((byte) -59)) {
                class38 var2 = class12.field210.method1851(36, var1.field7129);
                if (var2 != null && var2.field567 && var2.method320(class12.field207, (byte) 69)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V", line = 343)
    public static final void method2970(byte arg0) {
        if (arg0 >= -20) {
            method2970((byte) 1);
        }
        ++field7334;
        if (class461.field6896 == null) {
            Container var1;
            if (class286.field4195 == null) {
                var1 = class312.field4572.field7381;
            } else {
                var1 = class286.field4195;
            }
            class164.field2221 = var1.getSize().width;
            class360.field5522 = var1.getSize().height;
            if (class286.field4195 == var1) {
                Insets var2 = class286.field4195.getInsets();
                class360.field5522 -= var2.top + var2.bottom;
                class164.field2221 -= var2.right + var2.left;
            }
            if (~class325.method2014((byte) 77) != -2) {
                if (class230.field3289 < 96 && class378.field5771 == 0) {
                    int var3 = ~class164.field2221 < -1025 ? 1024 : class164.field2221;
                    class465.field6939 = (-var3 + class164.field2221) / 2;
                    class147.field1961 = var3;
                    int var4 = class360.field5522 <= 768 ? class360.field5522 : 768;
                    class110.field1551 = 0;
                    class107.field1525 = var4;
                } else {
                    class107.field1525 = class360.field5522;
                    class465.field6939 = 0;
                    class110.field1551 = 0;
                    class147.field1961 = class164.field2221;
                }
            } else {
                class110.field1551 = 0;
                class107.field1525 = class533.field7843;
                class147.field1961 = class162.field2117;
                class465.field6939 = (class164.field2221 - class162.field2117) / 2;
            }
            if (class476.field7072 != class116.field1601) {
                boolean var10000;
                if (~class147.field1961 > -1025 && class107.field1525 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class85.field1245.setSize(class147.field1961, class107.field1525);
            if (class400.field6090 != null) {
                class400.field6090.method791(class85.field1245);
            }
            if (class286.field4195 != var1) {
                class85.field1245.setLocation(class465.field6939, class110.field1551);
            } else {
                Insets var5 = class286.field4195.getInsets();
                class85.field1245.setLocation(class465.field6939 + var5.left, class110.field1551 + var5.top);
            }
            if (class337.field5232 != -1) {
                class404.method2490(51, true);
            }
            class164.method1105(255);
        }
    }
}
