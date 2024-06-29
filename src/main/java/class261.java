import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class261 extends class278 {

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "Z")
    public static boolean field3592 = false;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "Z")
    public static boolean field3589 = false;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "Z")
    public static boolean field3587 = false;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "Lvh;")
    public static class240 field3593;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZ)V", line = 10)
    private final void method1509(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3590 = 87;
        }
        ++field3594;
        int var4 = class192.field2736[arg1];
        int var5 = class454.field6637[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class215.field3060 = arg1;
            class33.field474 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class33.field474 = arg1;
            class215.field3060 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class33.field474 = arg1;
            class215.field3060 = -arg0 + class507.field7456;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class215.field3060 = arg1;
            class33.field474 = -arg0 + class307.field4211;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class33.field474 = -arg0 + class307.field4211;
            class215.field3060 = -arg1 + class507.field7456;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class215.field3060 = -arg0 + class507.field7456;
            class33.field474 = -arg1 + class307.field4211;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class215.field3060 = arg0;
            class33.field474 = -arg1 + class307.field4211;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class33.field474 = arg0;
            class215.field3060 = -arg1 + class507.field7456;
        }
        class215.field3060 &= class412.field6045;
        class33.field474 &= class40.field549;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)[I", line = 88)
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            field3589 = true;
        }
        ++field3586;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            for (int var4 = 0; ~class507.field7456 < ~var4; ++var4) {
                this.method1509(arg1, var4, false);
                int[] var5 = this.method1570(0, 0, class33.field474);
                var3[var4] = var5[class215.field3060];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Llh;II)V", line = 123)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field3754 = ~arg0.method2099(255) == -2;
        }
        ++field3591;
        if (arg1 != -30446) {
            field3589 = true;
        }
    }

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "(I)V", line = 139)
    public static void method1510(int arg0) {
        field3593 = null;
        if (arg0 != 2) {
            field3592 = true;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V", line = 150)
    public class261() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(B)V", line = 155)
    public static final void method1511(byte arg0) {
        if (arg0 == -21) {
            class9 var1 = class383.field5390;
            synchronized (class383.field5390) {
                class383.field5390.method65(false);
            }
            ++field3588;
            class9 var2 = class223.field3137;
            synchronized (class223.field3137) {
                class223.field3137.method65(false);
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)[[I", line = 182)
    public final int[][] method324(int arg0, int arg1) {
        ++field3595;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class507.field7456; ++var7) {
                this.method1509(arg1, var7, false);
                int[][] var8 = this.method1568(5426, 0, class33.field474);
                var4[var7] = var8[0][class215.field3060];
                var5[var7] = var8[1][class215.field3060];
                var6[var7] = var8[2][class215.field3060];
            }
        }
        if (arg0 <= 75) {
            field3590 = -18;
        }
        return var3;
    }
}
