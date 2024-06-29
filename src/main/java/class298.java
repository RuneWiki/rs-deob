import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class298 extends class335 {

    @OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
    private int field3939 = 4096;

    @OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
    private int field3938 = 4096;

    @OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
    private int field3943 = 4096;

    @OriginalMember(owner = "client!jda", name = "H", descriptor = "Lfv;")
    public static class690 field3941 = new class690();

    @OriginalMember(owner = "client!jda", name = "B", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!jda", name = "G", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V", line = 4)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILio;I)V", line = 12)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field3940;
        if (arg2 != -66) {
            field3942 = 116;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field3938 = arg1.method963(-127);
                }
            } else {
                this.field3943 = arg1.method963(-121);
            }
        } else {
            this.field3939 = arg1.method963(-127);
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZ)[[I", line = 59)
    public final int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            method1752(false);
        }
        ++field3936;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class649.field8968; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field3939 * var12 >> 12;
                    var9[var11] = this.field3943 * var13 >> 12;
                    var10[var11] = this.field3938 * var14 >> 12;
                } else {
                    var8[var11] = this.field3939;
                    var9[var11] = this.field3943;
                    var10[var11] = this.field3938;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)Lto;", line = 122)
    public static final class229 method1751(int arg0) {
        ++field3937;
        if (arg0 < 60) {
            method1752(false);
        }
        class229 var1 = class259.method1564(-6);
        var1.field2966 = null;
        var1.field2969 = 0;
        var1.field2971 = new class537(5000);
        return var1;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)V", line = 145)
    public static void method1752(boolean arg0) {
        if (!arg0) {
            field3941 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V", line = 159)
    public static final void method1753(int arg0, int arg1) {
        class149.field2037 = arg0;
        ++field3944;
        class378.field5005 = 2;
        long var2 = 0L;
        if (arg1 == 504) {
            if (class14.field183 != null) {
                class157 var4 = new class157(class596.method3309(class475.method2737(-91, class14.field183), true));
                long var5 = var4.method953(true);
                class422.field5536 = var4.method953(true);
                class32.method195(true, arg1 ^ 11343, class339.method1979(0, var5), "");
            } else {
                class126.method747(35, (byte) 34);
            }
        }
    }
}
