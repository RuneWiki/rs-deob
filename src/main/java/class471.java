import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class471 extends class252 {

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "F")
    private float field6737 = 0.0F;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Luk;")
    private class234 field6731;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "F")
    public static float field6736;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[[Lrga;")
    public static class215[][] field6741;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 3)
    public static final void method2772(int arg0) {
        if (arg0 < -127) {
            ++field6742;
            if (class498.field7058 == null) {
                class169 var1 = new class169();
                byte[] var2 = var1.method1164(74, 128, 128, 16);
                class498.field7058 = class62.method647((byte) 70, var2, false);
            }
            if (class111.field1688 == null) {
                class388 var3 = new class388();
                byte[] var4 = var3.method2394(128, (byte) 110, 128, 16);
                class111.field1688 = class62.method647((byte) 32, var4, false);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)I", line = 33)
    public static final int method2773(int arg0, boolean arg1) {
        if (arg1) {
            return -118;
        } else {
            ++field6738;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V", line = 44)
    public static void method2774(int arg0) {
        if (arg0 == 128) {
            field6741 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lbb;II)V", line = 55)
    public final void method790(class301 arg0, int arg1, int arg2) {
        super.field3884.method2337(false, arg0);
        ++field6744;
        if (arg2 != -1) {
            method2772(123);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V", line = 68)
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 >= -105) {
            this.method788(true);
        }
        ++field6735;
        super.field3884.method2351(0, 1);
        if ((arg1 & 128) == 0) {
            if (~(1 & arg0) == -2) {
                if (this.field6731.field3626) {
                    this.field6737 = (float) (super.field3884.field5688 % 4000) / 4000.0F;
                    super.field3884.method2337(false, this.field6731.field3634);
                } else {
                    int var4 = super.field3884.field5688 % 4000 * 16 / 4000;
                    super.field3884.method2337(false, this.field6731.field3627[var4]);
                }
            } else if (!this.field6731.field3626) {
                super.field3884.method2337(false, this.field6731.field3627[0]);
            } else {
                super.field3884.method2337(false, this.field6731.field3634);
            }
        } else {
            super.field3884.method2337(false, (class301) null);
        }
        super.field3884.method2351(0, 0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V", line = 113)
    public final void method794(boolean arg0, int arg1) {
        super.field3884.method2351(0, 1);
        ++field6739;
        super.field3884.method2339(class413.field6010, -32540, class190.field2740);
        super.field3884.method1881(true, class61.field1155, 0, -4016, false);
        super.field3884.method2360(0, class319.field4696, 1);
        super.field3884.method1918(-27, 0);
        super.field3884.method2351(0, 0);
        super.field3884.method2321(-16777216, 24);
        super.field3884.method2360(0, class124.field1869, 1);
        this.method1690(arg1);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lhea;Luk;)V", line = 132)
    public class471(class387 arg0, class234 arg1) {
        super(arg0);
        this.field6731 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 142)
    public final void method788(boolean arg0) {
        ++field6732;
        super.field3884.method2351(0, 1);
        super.field3884.method2339(class153.field2209, -32540, class153.field2209);
        super.field3884.method2324(0, class61.field1155, 1);
        super.field3884.method2360(0, class61.field1155, 1);
        super.field3884.method1918(-33, 1);
        super.field3884.method2337(false, (class301) null);
        if (arg0) {
            super.field3884.method2351(0, 0);
            super.field3884.method2360(0, class61.field1155, 1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)Z", line = 168)
    public final boolean method792(int arg0) {
        ++field6734;
        return arg0 != 6439 ? false : this.field6731.method1605(-27703);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(ZI)V", line = 179)
    public final void method791(boolean arg0, int arg1) {
        super.field3884.method2339(class153.field2209, arg1 + -32541, class190.field2740);
        ++field6733;
        if (arg1 != 1) {
            this.field6737 = 0.2326759F;
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V", line = 191)
    public final void method1690(int arg0) {
        ++field6743;
        if (super.field3884.method2331((byte) 124) == 0) {
            class21 var2 = super.field3884.method2350((byte) 101);
            super.field3884.method2351(0, 1);
            class21 var3 = super.field3884.method2327(true);
            var3.method274(var2);
            var3.method246(0.125F, 0.125F, 1.0F, 6652);
            var3.method265(0.0F, this.field6737, 73, 0.0F);
            super.field3884.method2356(0, class487.field6924);
            super.field3884.method2351(0, 0);
        }
        if (arg0 != -1) {
            field6736 = -1.5973289F;
        }
    }
}
