import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class227 {

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
    private int field103 = 585;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Lho;")
    public static class103 field107 = new class103(60, 8);

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Lqh;")
    public static class50 field109 = new class50(16);

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V", line = 5)
    public static void method58(int arg0) {
        field109 = null;
        field107 = null;
        if (arg0 != -7481) {
            field109 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V", line = 54)
    public class9() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V", line = 20)
    public static final void method59(int arg0, int arg1) {
        ++field108;
        if (class372.method2199(-37, arg1)) {
            class450[] var2 = class339.field4491[arg1];
            int var3 = 0;
            if (arg0 != 2048) {
                method60(127, (byte) -124);
            }
            while (var2.length > var3) {
                class450 var4 = var2[var3];
                if (var4 != null) {
                    var4.field6590 = 0;
                    var4.field6575 = 0;
                    var4.field6577 = 1;
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(IB)V", line = 57)
    public static final void method60(int arg0, byte arg1) {
        ++field104;
        class184 var2 = class277.method1682(arg0, 3, arg1 + -134);
        var2.method1075((byte) 104);
        if (arg1 != 24) {
            method59(93, -11);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lug;II)V", line = 73)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field103 = arg0.method2386(arg1 ^ -487197780);
        }
        if (arg1 != 487215116) {
            field109 = null;
        }
        ++field106;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I", line = 100)
    public final int[] method62(int arg0, int arg1) {
        ++field105;
        int[] var3 = super.field3068.method1970(arg1, (byte) 55);
        if (arg0 != 15811) {
            method59(-76, -16);
        }
        if (super.field3068.field4480) {
            int var4 = class190.field2457[arg1];
            for (int var5 = 0; ~var5 > ~class446.field6486; ++var5) {
                int var6 = class4.field37[var5];
                if (this.field103 < var6 && -this.field103 + 4096 > var6 && ~var4 < ~(-this.field103 + 2048) && this.field103 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field103 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field103 + 2048) && 2048 - -this.field103 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field103;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field103);
                } else if (~var4 <= ~this.field103 && -this.field103 + 4096 >= var4) {
                    if (this.field103 <= var6 && ~(-this.field103 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field103 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field103;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field103);
                }
            }
        }
        return var3;
    }
}
