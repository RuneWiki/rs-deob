import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class222 extends class747 {

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field3007 = -1;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "Z")
    public static boolean field3009 = false;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method688(int arg0, int arg1) {
        int var3 = -77 % ((35 - arg0) / 58);
        ++field3006;
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[][] var5 = this.method4158(0, arg1, 2);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class73.field1095 < ~var12; ++var12) {
                var9[var12] = -var6[var12] + 4096;
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ldc;II)V", line = 50)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            super.field10281 = arg0.method505((byte) -119) == 1;
        }
        ++field3008;
        if (arg1 != 11608) {
            method1319((class63) null, -72);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ldc;I)Ldca;", line = 64)
    public static final class549 method1319(class63 arg0, int arg1) {
        ++field3004;
        int var2 = arg0.method482(arg1 + -772591672);
        class557 var3 = client.method2746(arg1 + arg1)[arg0.method505((byte) -119)];
        class125 var4 = class146.method947(-123)[arg0.method505((byte) -119)];
        int var5 = arg0.method496(-21);
        int var6 = arg0.method496(-102);
        return new class549(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 83)
    public class222() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[I", line = 89)
    public final int[] method182(int arg0, int arg1) {
        ++field3005;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 > -89) {
            field3009 = false;
        }
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(-123, arg0, 0);
            for (int var5 = 0; ~var5 > ~class73.field1095; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }
}
