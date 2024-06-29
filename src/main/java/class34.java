import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 extends class136 {

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "Lbg;")
    public static class324 field394 = new class324(24, 6);

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "Z")
    public static boolean field396 = false;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field393;
        int var3 = -98 / ((67 - arg0) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            for (int var5 = 0; class467.field6889 > var5; ++var5) {
                this.method273(var5, arg1, (byte) -17);
                int[] var6 = this.method1033(class374.field5542, 0, 0);
                var4[var5] = var6[class373.field5536];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
    public static final void method270(int arg0, int arg1) {
        ++field392;
        class392.field5773 = arg1;
        class496.field7277 = -1;
        class509.field7504 = 3;
        if (arg0 < 116) {
            method270(25, -79);
        }
        class417.field6164 = 100;
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "(I)V")
    public static void method271(int arg0) {
        field394 = null;
        int var1 = -1 % ((arg0 - -53) / 54);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field391;
        if (arg0 < 33) {
            field396 = true;
        }
        int[][] var3 = super.field1952.method3127((byte) -122, arg1);
        if (super.field1952.field7770) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class467.field6889 < ~var7; ++var7) {
                this.method273(var7, arg1, (byte) -17);
                int[][] var8 = this.method1036(3, 0, class374.field5542);
                var4[var7] = var8[0][class373.field5536];
                var5[var7] = var8[1][class373.field5536];
                var6[var7] = var8[2][class373.field5536];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 == 4) {
            if (arg1 == 0) {
                super.field1966 = ~arg2.method577(255) == -2;
            }
            ++field395;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)V")
    private final void method273(int arg0, int arg1, byte arg2) {
        ++field390;
        int var4 = class453.field6672[arg0];
        int var5 = class290.field4168[arg1];
        if (arg2 == -17) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class373.field5536 = arg0;
                class374.field5542 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class374.field5542 = arg0;
                class373.field5536 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class373.field5536 = -arg1 + class467.field6889;
                class374.field5542 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class374.field5542 = -arg1 + class227.field3310;
                class373.field5536 = arg0;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class374.field5542 = -arg1 + class227.field3310;
                class373.field5536 = -arg0 + class467.field6889;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class373.field5536 = class467.field6889 - arg1;
                class374.field5542 = -arg0 + class227.field3310;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class373.field5536 = arg1;
                class374.field5542 = -arg0 + class227.field3310;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class374.field5542 = arg1;
                class373.field5536 = -arg0 + class467.field6889;
            }
            class373.field5536 &= class166.field2356;
            class374.field5542 &= class519.field7637;
        }
    }
}
