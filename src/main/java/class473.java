import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class473 extends class598 implements class269 {

    @OriginalMember(owner = "client!jw", name = "N", descriptor = "Llo;")
    public class640 field6621;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "Z")
    private boolean field6618;

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "[B")
    public static byte[] field6620 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "Lrg;")
    public static class548 field6612 = new class548(74, 4);

    @OriginalMember(owner = "client!jw", name = "ab", descriptor = "Z")
    public static boolean field6634 = false;

    @OriginalMember(owner = "client!jw", name = "cb", descriptor = "[I")
    public static int[] field6636 = new int[2];

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!jw", name = "L", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!jw", name = "O", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!jw", name = "P", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!jw", name = "Q", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!jw", name = "R", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!jw", name = "S", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!jw", name = "T", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!jw", name = "U", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!jw", name = "V", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!jw", name = "W", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!jw", name = "X", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!jw", name = "Y", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!jw", name = "Z", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!jw", name = "I", descriptor = "Lso;")
    private class398 field6616;

    @OriginalMember(owner = "client!jw", name = "bb", descriptor = "[I")
    public static int[] field6635;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(ILqa;)Lso;")
    public final class398 method328(int arg0, class206 arg1) {
        ++field6625;
        return arg0 != 12 ? null : this.field6616;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Llp;IIIII)V")
    public static final void method2754(class329 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4296 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field4293[var6] != null) {
                ++arg0.field4296;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field4296; ++var7) {
            long var8 = class209.field2558[arg1][arg2][arg3];
            while (var8 != 0L) {
                class328 var14 = class602.field8699[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field4293[var7] == var14.field4282) {
                    continue label50;
                }
            }
            long var10 = class209.field2558[arg1][arg4][arg5];
            while (var10 != 0L) {
                class328 var13 = class602.field8699[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field4293[var7] == var13.field4282) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field4296 - 1; ++var12) {
                arg0.field4293[var12] = arg0.field4293[var12 + 1];
            }
            --arg0.field4296;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
    public final int method333(byte arg0) {
        ++field6611;
        return arg0 != 70 ? 41 : this.field6621.field9207;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lqa;Lcn;IIIIIZIIIIIII)V")
    public class473(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field6007 == -2, class603.method3470(arg12, arg13, 2));
        this.field6621 = new class640(arg0, arg1, arg12, arg13, super.field8660, arg3, arg4, arg6, arg7, arg14);
        this.field6618 = arg1.field5972 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        int var2 = 117 % ((arg0 - 1) / 49);
        ++field6614;
        return this.field6621.method3675(false);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLet;)V")
    public static final void method2755(byte arg0, class509 arg1) {
        int var2 = 27 % ((-57 - arg0) / 45);
        if (~arg1.field7197 == -6 && ~arg1.field7082 != 0) {
            class514.method2951(class210.field2560, -16777216, arg1);
        }
        ++field6628;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field6617;
        class157 var5 = this.field6621.method3668(false, false, 131072, super.field8652, arg1, super.field8661, -3);
        if (var5 == null) {
            return false;
        } else {
            class163 var6 = arg1.method1126();
            if (arg0 != -21851) {
                field6635 = null;
            }
            var6.method661(super.field8661, super.field8649, super.field8652);
            return var5.method91(arg2, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)I")
    public final int method322(int arg0) {
        ++field6615;
        if (arg0 != 64) {
            field6636 = null;
        }
        return this.field6621.method3671(-29019);
    }

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "(I)V")
    public static void method2756(int arg0) {
        field6612 = null;
        if (arg0 == 65535) {
            field6620 = null;
            field6636 = null;
            field6635 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lqa;Z)V")
    public final void method341(class206 arg0, boolean arg1) {
        ++field6630;
        if (arg1) {
            field6620 = null;
        }
        this.field6621.method3669(arg0, 262144);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZLqa;)V")
    public final void method336(boolean arg0, class206 arg1) {
        this.field6621.method3677(arg0, arg1);
        ++field6631;
    }

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
    public final void method339(byte arg0) {
        ++field6629;
        if (arg0 >= -114) {
            this.method317(-86);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILqa;)V")
    public final void method326(int arg0, class206 arg1) {
        ++field6622;
        class157 var3 = this.field6621.method3668(true, true, 262144, super.field8652, arg1, super.field8661, -3);
        if (arg0 != 29657) {
            this.method326(44, (class206) null);
        }
        if (var3 != null) {
            this.field6621.method3674(super.field8663, var3, arg0 ^ 25216, arg1, super.field8654, false, super.field8650, super.field8653);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)I")
    public final int method337(boolean arg0) {
        if (!arg0) {
            field6634 = false;
        }
        ++field6623;
        return this.field6621.field9228;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZLoe;ILqa;III)V")
    public final void method312(boolean arg0, class170 arg1, int arg2, class206 arg3, int arg4, int arg5, int arg6) {
        ++field6624;
        if (arg5 != 13915) {
            this.method318(111, (class206) null, -33, -50);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V")
    public final void method314(byte arg0) {
        ++field6627;
        if (arg0 <= 23) {
            method2754((class329) null, 18, -60, -76, -26, 50);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(ILqa;)Loj;")
    public final class318 method320(int arg0, class206 arg1) {
        ++field6619;
        class157 var3 = this.field6621.method3668(false, true, 2048, super.field8652, arg1, super.field8661, arg0 + -2);
        if (var3 == null) {
            return null;
        } else {
            class163 var4 = arg1.method1126();
            var4.method661(super.field8661, super.field8649, super.field8652);
            class318 var5 = null;
            if (this.field6618) {
                var5 = class143.method788(~arg0, 1);
            }
            if (this.field6621.field9229 != null) {
                class400 var6 = this.field6621.field9229.method2650();
                arg1.method1177(var3, var6, var4, var5 == null ? null : var5.field4059[0], 0);
            } else {
                var3.method69(var4, var5 != null ? var5.field4059[0] : null, 0);
            }
            if (this.field6616 != null) {
                class642.method3698(super.field8649, this.field6616, super.field8652, var3, (byte) 117, super.field8661);
            } else {
                this.field6616 = class533.method3049(super.field8649, super.field8661, (byte) -127, var3, super.field8652);
            }
            this.field6621.method3674(super.field8663, var3, 4441, arg1, super.field8654, true, super.field8650, super.field8653);
            if (arg0 != -1) {
                this.method328(-116, (class206) null);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            field6636 = null;
        }
        ++field6613;
        return this.field6621.method3668(false, false, arg0, 0, arg1, 0, -3);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
    public final int method342(int arg0) {
        if (arg0 != -2329) {
            this.method326(77, (class206) null);
        }
        ++field6610;
        return this.field6621.field9237;
    }

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "(I)Z")
    public final boolean method317(int arg0) {
        if (arg0 != 64) {
            this.field6618 = true;
        }
        ++field6626;
        return false;
    }
}
