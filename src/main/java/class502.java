import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class502 extends class148 {

    @OriginalMember(owner = "client!dw", name = "S", descriptor = "I")
    private int field7375 = -1;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "Z")
    public static boolean field7366 = false;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!dw", name = "T", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "[I")
    public static int[] field7373;

    @OriginalMember(owner = "client!dw", name = "U", descriptor = "[I")
    public int[] field7377;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)[[I")
    public int[][] method27(boolean arg0, int arg1) {
        ++field7368;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033 && this.method2996((byte) 125)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field7369 * (~class238.field3506 == ~this.field7370 ? arg1 : this.field7370 * arg1 / class238.field3506);
            if (class320.field4579 != this.field7369) {
                for (int var8 = 0; ~var8 > ~class320.field4579; ++var8) {
                    int var9 = this.field7369 * var8 / class320.field4579;
                    int var10 = this.field7377[var7 + var9];
                    var6[var8] = class286.method1847(var10, 255) << 4;
                    var5[var8] = class286.method1847(4080, var10 >> 4);
                    var4[var8] = class286.method1847(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class320.field4579 > var11; ++var11) {
                    int var12 = this.field7377[var7++];
                    var6[var11] = class286.method1847(4080, var12 << 4);
                    var5[var11] = class286.method1847(var12, 65280) >> 4;
                    var4[var11] = class286.method1847(16711680, var12) >> 12;
                }
            }
        }
        if (!arg0) {
            this.field7377 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)Z")
    public final boolean method2996(byte arg0) {
        ++field7376;
        if (arg0 < 123) {
            return false;
        } else if (this.field7377 != null) {
            return true;
        } else if (this.field7375 >= 0) {
            class408 var2 = ~class371.field5670 <= -1 ? class408.method2459(class67.field1032, class371.field5670, this.field7375) : class408.method2461(class67.field1032, this.field7375);
            var2.method2457();
            this.field7377 = var2.method2456();
            this.field7370 = var2.field6151;
            this.field7369 = var2.field6147;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)V")
    public final void method424(byte arg0) {
        ++field7371;
        super.method424((byte) 104);
        this.field7377 = null;
        int var2 = -76 / ((-41 - arg0) / 39);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
    public final int method973(byte arg0) {
        ++field7374;
        if (arg0 != 35) {
            this.method2996((byte) 59);
        }
        return this.field7375;
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(B)V")
    public static void method2997(byte arg0) {
        if (arg0 > -38) {
            field7366 = false;
        }
        field7373 = null;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
    public class502() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field7375 = arg1.method1450((byte) 126);
        }
        ++field7372;
        int var4 = 103 % ((-88 - arg2) / 33);
    }
}
