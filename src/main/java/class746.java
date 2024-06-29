import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class746 extends class524 implements class706 {

    @OriginalMember(owner = "client!wga", name = "bb", descriptor = "Z")
    private boolean field10375 = false;

    @OriginalMember(owner = "client!wga", name = "hb", descriptor = "Lwca;")
    public class676 field10381;

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "Z")
    private boolean field10363;

    @OriginalMember(owner = "client!wga", name = "U", descriptor = "Ldv;")
    public static class657 field10368 = new class657(128);

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!wga", name = "R", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!wga", name = "S", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!wga", name = "T", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!wga", name = "V", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!wga", name = "W", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!wga", name = "X", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!wga", name = "Y", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!wga", name = "Z", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!wga", name = "ab", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!wga", name = "cb", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!wga", name = "db", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!wga", name = "eb", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!wga", name = "gb", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!wga", name = "ib", descriptor = "I")
    public static int field10382;

    @OriginalMember(owner = "client!wga", name = "jb", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!wga", name = "kb", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!wga", name = "lb", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!wga", name = "fb", descriptor = "Lkj;")
    private class566 field10379;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)Z")
    public final boolean method746(int arg0) {
        if (arg0 > -106) {
            this.field10379 = null;
        }
        ++field10378;
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljb;III)V")
    public static final void method4151(class493 arg0, int arg1, int arg2, int arg3) {
        class623.field8673 = arg3;
        ++field10371;
        class481.field6799 = arg0;
        if (arg2 > -50) {
            field10368 = null;
        }
        class759.field10549 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)I")
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            return 13;
        } else {
            ++field10361;
            return this.field10381.field9228;
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        ++field10369;
        if (arg0 > -103) {
            this.method751(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "(I)I")
    public final int method749(int arg0) {
        ++field10370;
        return arg0 != 32767 ? 99 : this.field10381.method3760((byte) -111);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BLha;)V")
    public final void method753(byte arg0, class58 arg1) {
        ++field10364;
        int var3 = 70 % ((arg0 - 18) / 40);
        class471 var4 = this.field10381.method3765(true, -16386, true, arg1, 262144);
        if (var4 != null) {
            class513 var5 = arg1.method439();
            var5.method339(super.field1264, super.field1255, super.field1250);
            this.field10381.method3768(var4, super.field7413, false, arg1, (byte) 117, var5, super.field7409, super.field7415, super.field7418);
        }
    }

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "(B)I")
    public final int method750(byte arg0) {
        ++field10383;
        return arg0 != 14 ? 49 : this.field10381.method3766(-95);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        if (arg0 != 30374) {
            return -26;
        } else {
            ++field10374;
            return this.field10381.field9223;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZLha;IILkba;II)V")
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        ++field10362;
        if (arg5 != 22501) {
            this.method746(12);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "(I)V")
    public static void method4152(int arg0) {
        field10368 = null;
        if (arg0 != -28097) {
            field10368 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(B)I")
    public final int method868(byte arg0) {
        ++field10365;
        if (arg0 != -10) {
            this.method865(-116);
        }
        return this.field10381.field9227;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILha;)V")
    public final void method860(int arg0, class58 arg1) {
        this.field10381.method3763(-1, arg1);
        if (arg0 >= 15) {
            ++field10385;
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(ILha;)Lkj;")
    public final class566 method744(int arg0, class58 arg1) {
        ++field10366;
        if (arg0 != 0) {
            this.field10375 = true;
        }
        return this.field10379;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIIIIIII)V")
    public class746(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field203 == 1, class738.method4124(arg12, arg13, -110));
        this.field10381 = new class676(arg0, arg1, arg12, arg13, super.field1266, arg3, this, arg7, arg14);
        this.field10363 = ~arg1.field207 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(BLha;)Lml;")
    public final class387 method755(byte arg0, class58 arg1) {
        ++field10382;
        if (arg0 != -127) {
            this.field10375 = true;
        }
        class471 var3 = this.field10381.method3765(false, -16386, true, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class513 var4 = arg1.method439();
            var4.method339(super.field1264, super.field1255, super.field1250);
            class387 var5 = class65.method544(this.field10363, 1, 24824);
            this.field10381.method3768(var3, super.field7413, true, arg1, (byte) 65, var4, super.field7409, super.field7415, super.field7418);
            if (class180.field2409) {
                var3.method262(var4, var5.field5482[0], class516.field7361, 0);
            } else {
                var3.method221(var4, var5.field5482[0], 0);
            }
            if (this.field10381.field9231 != null) {
                class50 var6 = this.field10381.field9231.method3116();
                if (!class180.field2409) {
                    arg1.method381(var6);
                } else {
                    arg1.method379(var6, class516.field7361);
                }
            }
            this.field10375 = var3.method224() || this.field10381.field9231 != null;
            if (this.field10379 == null) {
                this.field10379 = class654.method3596(super.field1255, var3, super.field1264, super.field1250, (byte) 14);
            } else {
                class555.method3208(this.field10379, super.field1255, super.field1250, super.field1264, (byte) -73, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "(I)V")
    public final void method614(int arg0) {
        if (arg0 == 26062) {
            ++field10377;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field10384;
        class471 var5 = this.field10381.method3765(false, -16386, false, arg0, 131072);
        if (var5 == null) {
            return false;
        } else {
            class513 var6 = arg0.method439();
            if (arg1 != 0) {
                return false;
            } else {
                var6.method339(super.field1264, super.field1255, super.field1250);
                return class180.field2409 ? var5.method229(arg3, arg2, var6, false, 0, class516.field7361) : var5.method233(arg3, arg2, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
    public final boolean method867(byte arg0) {
        if (arg0 <= 82) {
            this.field10375 = true;
        }
        ++field10376;
        return this.field10381.method3758(100);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (arg0) {
            method4151((class493) null, 127, 80, 28);
        }
        ++field10380;
        return this.field10375;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V")
    public static final void method4153(int arg0, int arg1, int arg2) {
        ++field10373;
        if (!(class678.field9281 < class678.field9282)) {
            if (class678.field9282 < class678.field9281) {
                class678.field9281 = (float) ((double) class678.field9281 - (double) class678.field9281 / 30.0D);
                if (class678.field9281 < class678.field9282) {
                    class678.field9281 = class678.field9282;
                }
                class82.method633((byte) 56);
                class678.field9275 = (int) class678.field9281 >> 1;
                class678.field9277 = class668.method3642(class678.field9275, (byte) 87);
            }
        } else {
            class678.field9281 = (float) ((double) class678.field9281 / 30.0D + (double) class678.field9281);
            if (class678.field9281 > class678.field9282) {
                class678.field9281 = class678.field9282;
            }
            class82.method633((byte) 56);
            class678.field9275 = (int) class678.field9281 >> 1;
            class678.field9277 = class668.method3642(class678.field9275, (byte) 87);
        }
        if (~class625.field8690 != arg1 && ~class206.field2719 != 0) {
            int var3 = -class299.field4217 + class625.field8690;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class193.field2580 + class206.field2719;
            if (~var4 > -3 || var4 > 2) {
                var4 /= 8;
            }
            class299.field4217 += var3;
            class193.field2580 += var4;
            if (var3 == 0 && ~var4 == -1) {
                class206.field2719 = -1;
                class625.field8690 = -1;
            }
            class82.method633((byte) 56);
        }
        if (class236.field3170 > 0) {
            --class322.field4447;
            if (class322.field4447 == 0) {
                class322.field4447 = 100;
                --class236.field3170;
            }
        } else {
            class106.field1270 = -1;
            class515.field7342 = -1;
        }
        if (class391.field5527 && class724.field10104 != null) {
            for (class547 var5 = (class547) class724.field10104.method2765(-12261); var5 != null; var5 = (class547) class724.field10104.method2759(-15361)) {
                class344 var6 = class678.field9273.method3088((byte) -91, var5.field7640.field7257);
                if (!var5.method3172((byte) 11, arg0, arg2)) {
                    if (var5.field7640.field7254) {
                        var5.field7640.field7254 = false;
                        class241.method1539(class333.field4660, var5.field7640.field7257, var6.field4807);
                    }
                } else {
                    if (var6.field4799 != null) {
                        if (var6.field4799[4] != null) {
                            class635.method3531(false, 0, -1, var6.field4799[4], false, -1, true, 1012, (long) var5.field7640.field7257, (long) var5.field7640.field7257, var6.field4836, var6.field4807, arg1);
                        }
                        if (var6.field4799[3] != null) {
                            class635.method3531(false, 0, -1, var6.field4799[3], false, -1, true, 1009, (long) var5.field7640.field7257, (long) var5.field7640.field7257, var6.field4836, var6.field4807, 0);
                        }
                        if (var6.field4799[2] != null) {
                            class635.method3531(false, 0, -1, var6.field4799[2], false, -1, true, 1003, (long) var5.field7640.field7257, (long) var5.field7640.field7257, var6.field4836, var6.field4807, 0);
                        }
                        if (var6.field4799[1] != null) {
                            class635.method3531(false, 0, -1, var6.field4799[1], false, -1, true, 1007, (long) var5.field7640.field7257, (long) var5.field7640.field7257, var6.field4836, var6.field4807, 0);
                        }
                        if (var6.field4799[0] != null) {
                            class635.method3531(false, 0, -1, var6.field4799[0], false, -1, true, 1010, (long) var5.field7640.field7257, (long) var5.field7640.field7257, var6.field4836, var6.field4807, 0);
                        }
                    }
                    if (!var5.field7640.field7254) {
                        var5.field7640.field7254 = true;
                        class241.method1539(class389.field5509, var5.field7640.field7257, var6.field4807);
                    }
                    if (var5.field7640.field7254) {
                        class241.method1539(class20.field311, var5.field7640.field7257, var6.field4807);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)V")
    public final void method866(byte arg0) {
        ++field10367;
        if (arg0 != -62) {
            this.method752((class58) null, -108, 24, -87);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lha;B)V")
    public final void method864(class58 arg0, byte arg1) {
        this.field10381.method3764(3, arg0);
        if (arg1 != -73) {
            this.field10381 = null;
        }
        ++field10372;
    }
}
