import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class208 extends class459 implements class302 {

    @OriginalMember(owner = "client!jda", name = "fb", descriptor = "Z")
    private boolean field3486 = false;

    @OriginalMember(owner = "client!jda", name = "R", descriptor = "Lfb;")
    public class626 field3472;

    @OriginalMember(owner = "client!jda", name = "M", descriptor = "Z")
    private boolean field3467;

    @OriginalMember(owner = "client!jda", name = "bb", descriptor = "[I")
    public static int[] field3482 = new int[5];

    @OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!jda", name = "N", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!jda", name = "O", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!jda", name = "P", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!jda", name = "Q", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!jda", name = "S", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!jda", name = "T", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!jda", name = "V", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!jda", name = "W", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!jda", name = "X", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!jda", name = "Y", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!jda", name = "Z", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!jda", name = "ab", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!jda", name = "cb", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!jda", name = "eb", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!jda", name = "gb", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!jda", name = "hb", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jda", name = "ib", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!jda", name = "db", descriptor = "Lll;")
    private class334 field3484;

    @OriginalMember(owner = "client!jda", name = "U", descriptor = "Lri;")
    public static class97 field3475;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "(I)V")
    public static void method1589(int arg0) {
        if (arg0 >= 121) {
            field3475 = null;
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)I")
    public final int method394(byte arg0) {
        int var2 = -21 % ((-14 - arg0) / 51);
        ++field3487;
        return this.field3472.field8854;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Z")
    public final boolean method395(int arg0) {
        if (arg0 != -29400) {
            return false;
        } else {
            ++field3466;
            return this.field3472.method3657((byte) -114);
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(B)I")
    public final int method401(byte arg0) {
        ++field3483;
        if (arg0 <= 50) {
            this.field3484 = null;
        }
        return this.field3472.field8837;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILr;)V")
    public final void method396(int arg0, class167 arg1) {
        ++field3488;
        this.field3472.method3652((byte) 71, arg1);
        if (arg0 != -32646) {
            this.method394((byte) 43);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public final void method409(int arg0) {
        if (arg0 == -7728) {
            ++field3489;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I")
    public final int method413(byte arg0) {
        if (arg0 != 11) {
            this.method401((byte) -69);
        }
        ++field3465;
        return this.field3472.field8846;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lr;I)V")
    public final void method407(class167 arg0, int arg1) {
        ++field3469;
        int var3 = -2 / ((arg1 - -10) / 40);
        this.field3472.method3648((byte) -109, arg0);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLr;)Lll;")
    public final class334 method408(byte arg0, class167 arg1) {
        ++field3463;
        if (arg0 != 111) {
            this.method395(-26);
        }
        return this.field3484;
    }

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "(B)I")
    public final int method406(byte arg0) {
        ++field3485;
        if (arg0 < 108) {
            method1592(60, 110, -85);
        }
        return this.field3472.method3651(30556);
    }

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
    public final boolean method414(int arg0) {
        if (arg0 != 0) {
            this.field3467 = true;
        }
        ++field3470;
        return false;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lr;Llr;IIIIIZIIIIIII)V")
    public class208(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9786 == -2, class416.method2646(arg12, (byte) 43, arg13));
        this.field3472 = new class626(arg0, arg1, arg12, arg13, super.field9695, arg3, this, arg7, arg14);
        this.field3467 = ~arg1.field9830 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILri;Lri;B)V")
    public static final void method1590(int arg0, class97 arg1, class97 arg2, byte arg3) {
        if (arg3 > -113) {
            method1589(-101);
        }
        class56.field729 = arg2;
        ++field3479;
        class122.field2040 = arg1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZILr;I)Z")
    public final boolean method392(boolean arg0, int arg1, class167 arg2, int arg3) {
        ++field3474;
        class55 var5 = this.field3472.method3647(arg2, arg0, false, -1, 131072);
        if (var5 == null) {
            return false;
        } else {
            class393 var6 = arg2.method339();
            var6.method503(super.field9696, super.field9701, super.field9705);
            return class534.field7778 ? var5.method598(arg3, arg1, var6, false, class609.field8652) : var5.method648(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "(I)I")
    public final int method393(int arg0) {
        if (arg0 != 0) {
            this.field3486 = false;
        }
        ++field3477;
        return this.field3472.method3654(111);
    }

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "(B)V")
    public final void method404(byte arg0) {
        if (arg0 >= -40) {
            method1589(-118);
        }
        ++field3468;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(B)Z")
    public final boolean method398(byte arg0) {
        ++field3481;
        if (arg0 > -92) {
            this.method407((class167) null, -53);
        }
        return false;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lr;Z)V")
    public final void method412(class167 arg0, boolean arg1) {
        if (!arg1) {
            ++field3478;
            class55 var3 = this.field3472.method3647(arg0, true, true, -1, 262144);
            if (var3 != null) {
                class393 var4 = arg0.method339();
                var4.method503(super.field9696, super.field9701, super.field9705);
                this.field3472.method3646(var3, super.field6865, super.field6869, super.field6871, false, arg0, super.field6870, (byte) -118, var4);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(ILr;)Lod;")
    public final class468 method403(int arg0, class167 arg1) {
        ++field3464;
        class55 var3 = this.field3472.method3647(arg1, false, true, -1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class393 var4 = arg1.method339();
            var4.method503(super.field9696, super.field9701, super.field9705);
            class468 var5 = null;
            if (this.field3467) {
                var5 = class429.method2720(1, 0);
            }
            this.field3472.method3646(var3, super.field6865, super.field6869, super.field6871, true, arg1, super.field6870, (byte) -101, var4);
            if (arg0 >= -38) {
                return null;
            } else {
                if (class534.field7778) {
                    var3.method613(var4, var5 == null ? null : var5.field6948[0], class609.field8652, 0);
                } else {
                    var3.method606(var4, var5 == null ? null : var5.field6948[0], 0);
                }
                if (this.field3472.field8836 != null) {
                    class79 var6 = this.field3472.field8836.method3250();
                    if (!class534.field7778) {
                        arg1.method354(var6);
                    } else {
                        arg1.method320(var6, class609.field8652);
                    }
                }
                this.field3486 = var3.method614() || this.field3472.field8836 != null;
                if (this.field3484 != null) {
                    class251.method1789(this.field3484, 76, super.field9701, super.field9696, var3, super.field9705);
                } else {
                    this.field3484 = class166.method1342(var3, super.field9705, super.field9696, super.field9701, 30640);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "(B)V")
    public static final void method1591(byte arg0) {
        ++field3476;
        if (~class125.field2054 != -1) {
            try {
                if (++class528.field7708 > 2000) {
                    if (class499.field7329 != null) {
                        class499.field7329.method588(24331);
                        class499.field7329 = null;
                    }
                    if (~class166.field2784 <= -3) {
                        class205.field3403 = -5;
                        class125.field2054 = 0;
                        return;
                    }
                    class464.field6931.method2919((byte) -100);
                    class125.field2054 = 1;
                    ++class166.field2784;
                    class528.field7708 = 0;
                }
                if (arg0 >= -22) {
                    method1590(41, (class97) null, (class97) null, (byte) 15);
                }
                if (class125.field2054 == 1) {
                    class161.field2737 = class464.field6931.method2917((byte) 88, class402.field6207);
                    class125.field2054 = 2;
                }
                if (~class125.field2054 == -3) {
                    if (~class161.field2737.field9884 == -3) {
                        throw new IOException();
                    }
                    if (~class161.field2737.field9884 != -2) {
                        return;
                    }
                    class499.field7329 = class581.method3411((Socket) class161.field2737.field9885, true, 7500);
                    class161.field2737 = null;
                    class132.method1151(0);
                    class125.field2054 = 4;
                }
                if (~class125.field2054 == -5) {
                    if (!class499.field7329.method593(1, -120)) {
                        return;
                    }
                    class499.field7329.method589(106, class558.field8066.field96, 1, 0);
                    int var1 = 255 & class558.field8066.field96[0];
                    if (var1 != 21) {
                        class205.field3403 = var1;
                        class125.field2054 = 0;
                        class499.field7329.method588(24331);
                        class499.field7329 = null;
                        return;
                    }
                    class125.field2054 = 5;
                }
                if (~class125.field2054 == -6) {
                    if (!class499.field7329.method593(1, -119)) {
                        return;
                    }
                    class499.field7329.method589(73, class558.field8066.field96, 1, 0);
                    class125.field2054 = 6;
                    class395.field6147 = new String[255 & class558.field8066.field96[0]];
                }
                if (class125.field2054 == 6) {
                    if (class499.field7329.method593(class395.field6147.length * 8, -125)) {
                        class558.field8066.field57 = 0;
                        class499.field7329.method589(-112, class558.field8066.field96, class395.field6147.length * 8, 0);
                        for (int var2 = 0; var2 < class395.field6147.length; ++var2) {
                            class395.field6147[var2] = class357.method2398(class558.field8066.method69(1282265952), -15775);
                        }
                        class205.field3403 = 21;
                        class125.field2054 = 0;
                        class499.field7329.method588(24331);
                        class499.field7329 = null;
                    }
                }
            } catch (IOException var3) {
                if (class499.field7329 != null) {
                    class499.field7329.method588(24331);
                    class499.field7329 = null;
                }
                if (~class166.field2784 <= -3) {
                    class205.field3403 = -4;
                    class125.field2054 = 0;
                } else {
                    class464.field6931.method2919((byte) -100);
                    ++class166.field2784;
                    class528.field7708 = 0;
                    class125.field2054 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)V")
    public static final void method1592(int arg0, int arg1, int arg2) {
        if (arg2 != -5) {
            method1592(20, 106, 6);
        }
        ++field3480;
        class413 var3 = class674.method3852(6, arg0, 124);
        var3.method2633(16777215);
        var3.field6337 = arg1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIILr;ZILpn;)V")
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        ++field3471;
        if (arg2 != 1) {
            this.method407((class167) null, -65);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Z")
    public final boolean method402(int arg0) {
        if (arg0 != 623404585) {
            this.method394((byte) -13);
        }
        ++field3473;
        return this.field3486;
    }
}
