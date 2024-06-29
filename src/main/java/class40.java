import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class40 extends class95 implements class649 {

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "Z")
    private boolean field553 = false;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "Lmt;")
    public class410 field562;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Z")
    private boolean field565;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Lqk;")
    public static class148 field554 = new class148(30, 6);

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "[Lkc;")
    public static class655[] field563 = new class655[2048];

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "Lgp;")
    private class551 field572;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)V")
    public static void method266(boolean arg0) {
        if (arg0) {
            field563 = null;
        }
        field563 = null;
        field554 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Z")
    public static final boolean method267(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method280((int[]) null, (byte) 66, (class557) null, (class557) null);
        }
        ++field557;
        return (2048 & arg0) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            return 67;
        } else {
            ++field559;
            return this.field562.method2509(112);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        ++field560;
        if (arg0 != -17174) {
            field554 = null;
        }
        return this.field562.field5722;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lha;I)V")
    public final void method270(class545 arg0, int arg1) {
        if (arg1 == -6060) {
            ++field567;
            this.field562.method2507(28806, arg0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        ++field558;
        int var3 = -82 % ((arg0 - -15) / 57);
        class283 var4 = this.field562.method2500(262144, true, false, (byte) -28, arg1);
        if (var4 != null) {
            int var5 = super.field9490 >> 9;
            int var6 = super.field9489 >> 9;
            class723 var7 = arg1.method2087();
            var7.method848(super.field9490, super.field9502, super.field9489);
            this.field562.method2505(var5, var4, (byte) 14, var5, false, var6, var6, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILha;)V")
    public final void method272(int arg0, class545 arg1) {
        ++field561;
        if (arg0 != 24139) {
            this.method268(-122);
        }
        this.field562.method2504(arg1, -113);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        ++field569;
        class283 var5 = this.field562.method2500(131072, false, false, (byte) -28, arg0);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 != -1) {
                field563 = null;
            }
            class723 var6 = arg0.method2087();
            var6.method848(super.field9490 - -super.field1384, super.field9502, super.field1389 + super.field9489);
            return class286.field3774 ? var5.method1151(arg1, arg2, var6, false, 0, class527.field7375) : var5.method1155(arg1, arg2, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        ++field555;
        return arg0 != 0 ? null : this.field572;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)I")
    public final int method275(int arg0) {
        ++field552;
        if (arg0 != 24263) {
            this.method279((byte) -100);
        }
        return this.field562.field5711;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
    public final int method276(int arg0) {
        if (arg0 != -25963) {
            this.field565 = false;
        }
        ++field568;
        return this.field562.field5709;
    }

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        if (arg0 != 3) {
            this.method275(22);
        }
        ++field570;
        return false;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field556;
        class283 var3 = this.field562.method2500(2048, true, false, (byte) -28, arg0);
        if (var3 == null) {
            return null;
        } else {
            class723 var4 = arg0.method2087();
            var4.method848(super.field9490 - -super.field1384, super.field9502, super.field1389 + super.field9489);
            if (arg1 != 2274) {
                field554 = null;
            }
            class596 var5 = class589.method3502(1, this.field565, 0);
            int var6 = super.field9490 >> 9;
            int var7 = super.field9489 >> 9;
            this.field562.method2505(var6, var3, (byte) 14, var6, true, var7, var7, arg0, var4);
            if (!class286.field3774) {
                var3.method1168(var4, var5.field8579[0], 0);
            } else {
                var3.method1164(var4, var5.field8579[0], class527.field7375, 0);
            }
            if (this.field562.field5705 != null) {
                class347 var8 = this.field562.field5705.method1347();
                if (!class286.field3774) {
                    arg0.method2122(var8);
                } else {
                    arg0.method2112(var8, class527.field7375);
                }
            }
            this.field553 = var3.method1130() || this.field562.field5705 != null;
            if (this.field572 == null) {
                this.field572 = class477.method2821(-1, super.field9489, var3, super.field9502, super.field9490);
            } else {
                class111.method747(34165, var3, super.field9489, super.field9502, super.field9490, this.field572);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public final void method279(byte arg0) {
        ++field574;
        if (arg0 >= -4) {
            this.method277(-62);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIIIII)V")
    public class40(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field562 = new class410(arg0, arg1, arg10, arg11, super.field9501, arg3, this, arg7, arg12);
        this.field565 = arg1.field467 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IBLwu;Lwu;)V")
    public static final void method280(int[] arg0, byte arg1, class557 arg2, class557 arg3) {
        if (arg0 != null) {
            class586.field8431 = arg0;
        }
        class673.field9469 = arg3;
        class565.field8032 = arg2;
        if (arg1 != -32) {
            field554 = null;
        }
        ++field571;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)Z")
    public final boolean method281(boolean arg0) {
        ++field566;
        return !arg0 ? true : this.field562.method2508(true);
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        ++field564;
        if (arg0 != -1) {
            field554 = null;
        }
        return this.field562.method2498((byte) -67);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        ++field573;
        if (arg0 > -33) {
            this.field553 = false;
        }
        return this.field553;
    }
}
