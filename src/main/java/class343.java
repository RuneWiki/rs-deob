import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class343 extends class377 {

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "Lcga;")
    public static class449 field4368 = new class449(20, -1);

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field4370 = 0;

    @OriginalMember(owner = "client!bfa", name = "J", descriptor = "I")
    public static int field4374 = 2;

    @OriginalMember(owner = "client!bfa", name = "K", descriptor = "I")
    public static int field4375 = -1;

    @OriginalMember(owner = "client!bfa", name = "z", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!bfa", name = "A", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!bfa", name = "G", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!bfa", name = "I", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field4373;
        int[] var3 = super.field4842.method2772(arg0, (byte) -113);
        int var4 = 21 % ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            for (int var5 = 0; ~var5 > ~class528.field6661; ++var5) {
                this.method1958(var5, false, arg0);
                int[] var6 = this.method2174(0, class27.field320, (byte) 100);
                var3[var5] = var6[class580.field7773];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method1956(Object arg0, boolean arg1, int arg2) {
        ++field4367;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class51.method296(var3, 102) : var3;
        } else if (arg2 != 0) {
            return null;
        } else if (arg0 instanceof class29) {
            class29 var4 = (class29) arg0;
            return var4.method178((byte) -122);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "(B)V")
    public static void method1957(byte arg0) {
        field4368 = null;
        if (arg0 < 46) {
            method1956((Object) null, false, 36);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = 115 % ((arg1 - 13) / 55);
        if (arg0 == 0) {
            super.field4853 = arg2.method3097((byte) 12) == 1;
        }
        ++field4371;
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
    public class343() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        ++field4366;
        int[][] var3 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class528.field6661 < ~var7; ++var7) {
                this.method1958(var7, false, arg0);
                int[][] var8 = this.method2173(1, class27.field320, 0);
                var4[var7] = var8[0][class580.field7773];
                var5[var7] = var8[1][class580.field7773];
                var6[var7] = var8[2][class580.field7773];
            }
        }
        int var9 = -39 / ((arg1 - 31) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZI)V")
    private final void method1958(int arg0, boolean arg1, int arg2) {
        ++field4372;
        int var4 = class136.field1654[arg0];
        int var5 = class596.field8003[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class580.field7773 = arg0;
            class27.field320 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class27.field320 = arg0;
            class580.field7773 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class580.field7773 = class528.field6661 - arg2;
            class27.field320 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class580.field7773 = arg0;
            class27.field320 = -arg2 + class383.field4916;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class27.field320 = class383.field4916 - arg2;
            class580.field7773 = -arg0 + class528.field6661;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class580.field7773 = -arg2 + class528.field6661;
            class27.field320 = -arg0 + class383.field4916;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class27.field320 = -arg0 + class383.field4916;
            class580.field7773 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class580.field7773 = -arg0 + class528.field6661;
            class27.field320 = arg2;
        }
        class580.field7773 &= class376.field4836;
        if (arg1) {
            this.method27(-72, -1, (class572) null);
        }
        class27.field320 &= class251.field3236;
    }
}
