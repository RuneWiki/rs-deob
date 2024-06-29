import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class7 extends class346 {

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "Z")
    public static boolean field91 = false;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "Ljava/lang/String;")
    public static String field102 = "Cancel";

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field89 = new String[100];

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field97 = "rating: ";

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)V")
    public static void method35(byte arg0) {
        field89 = null;
        field97 = null;
        field102 = null;
        if (arg0 <= 27) {
            field93 = 112;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILps;IIII)V")
    public static final void method36(int arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field101;
        if (arg1 != 90) {
            field96 = 44;
        }
        class264.method1774(arg4, arg2.field5921, arg0, 0, arg6, arg3, arg5, -2, arg2.field5930);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lqc;I)I")
    public static final int method37(class163 arg0, int arg1) {
        ++field92;
        class189 var2 = arg0.field2206;
        if (var2.field2575 != null) {
            var2 = var2.method1253(-1);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 <= 41) {
            return -39;
        } else {
            int var3 = var2.field2624;
            class290 var4 = arg0.method1084(-24211);
            if (!arg0.field2178) {
                if (arg0.field2143 != var4.field4385 && arg0.field2143 != var4.field4363 && arg0.field2143 != var4.field4381 && ~arg0.field2143 != ~var4.field4372) {
                    if (~arg0.field2143 == ~var4.field4373 || ~arg0.field2143 == ~var4.field4343 || arg0.field2143 == var4.field4345 || ~arg0.field2143 == ~var4.field4352) {
                        var3 = var2.field2609;
                    }
                } else {
                    var3 = var2.field2607;
                }
            } else {
                var3 = var2.field2606;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field105 = -124;
        }
        if (~arg2 == -1) {
            this.field94 = (arg0.method2233((byte) 104) << 12) / 255;
        }
        ++field86;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
    public static final void method39(int arg0) {
        class92.field1263.method334((byte) -120);
        ++field98;
        for (int var1 = 0; var1 < 32; ++var1) {
            class296.field4466[var1] = 0L;
        }
        if (arg0 != -15898) {
            method37((class163) null, 119);
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class406.field5914[var2] = 0L;
        }
        class422.field6131 = 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V")
    public static final void method40(boolean arg0, int arg1) {
        ++field100;
        if (arg1 == -29254) {
            class236.field3294 = arg0;
            class322.field4803 = !class226.method1467(0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field103;
        if (~arg0 == ~arg7) {
            class126.method893(arg3, arg4, arg0, arg1, -1, arg5, arg6);
        } else {
            if (arg2 != 23188) {
                field97 = null;
            }
            if (-arg0 + arg5 >= class240.field3368 && class136.field1769 >= arg0 + arg5 && ~(-arg7 + arg1) <= ~class157.field1981 && ~(arg1 + arg7) >= ~class312.field4602) {
                class385.method2498(arg5, arg0, arg7, arg6, arg1, arg4, arg3, (byte) -21);
            } else {
                class60.method537(arg0, arg6, arg3, false, arg5, arg7, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V")
    public static final void method42(int arg0, byte arg1) {
        ++field90;
        if (arg1 >= -90) {
            method40(true, 10);
        }
        if (class338.method2195(arg0, 6173)) {
            class325.method2133(class4.field71[arg0], true, -1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIILtj;ILqb;IBII)Lqb;")
    public static final class257 method43(int arg0, int arg1, int arg2, int arg3, class298 arg4, int arg5, class257 arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field87;
        long var11 = (long) arg2;
        class257 var13 = (class257) class415.field6013.method378((byte) 28, var11);
        short var14 = 1031;
        if (var13 == null) {
            class9 var15 = class393.method2524(class115.field1497, 0, arg2, (byte) -111);
            if (var15 == null) {
                return null;
            }
            var13 = arg4.method468(var15, var14, class178.field2390, 64, 768);
            class415.field6013.method367(var11, var13, true);
        }
        if (arg8 < 73) {
            return null;
        } else {
            class257 var16 = var13.method1676((byte) 2, var14, true);
            if (arg10 != 0) {
                var16.method1673(arg10);
            }
            if (arg9 != 0) {
                var16.method1687(arg9);
            }
            if (~arg1 != -1) {
                var16.method1693(arg1);
            }
            if (arg7 != 0) {
                var16.method1659(0, arg7, 0);
            }
            return var16;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
    public class7() {
        this(4096);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IC)Z")
    public static final boolean method44(int arg0, char arg1) {
        ++field99;
        if (arg0 > -57) {
            return false;
        } else {
            return arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && ~arg1 >= -123;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field95;
            int[] var3 = super.field5152.method1409((byte) 48, arg0);
            if (super.field5152.field3004) {
                class206.method1356(var3, 0, class134.field1753, this.field94);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
    public class7(int arg0) {
        super(0, true);
        this.field94 = 4096;
        this.field94 = arg0;
    }
}
