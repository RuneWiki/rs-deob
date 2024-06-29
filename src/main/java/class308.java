import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class308 extends class666 {

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    private int field4005 = 4096;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "[S")
    public static short[] field4006 = new short[] { 13, 48, 21, 17, 8, 16, 57, 60 };

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "[I")
    public static int[] field4002 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method1755(byte arg0) {
        if (arg0 != -98) {
            method1757((byte) 18);
        }
        field4006 = null;
        field4002 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field4001;
        int[] var3 = super.field9466.method1811(arg1, 107);
        if (super.field9466.field4172) {
            int[] var4 = this.method3739(0, -127, class515.field7357 & arg1 - 1);
            int[] var5 = this.method3739(0, -128, arg1);
            int[] var6 = this.method3739(0, -121, arg1 + 1 & class515.field7357);
            for (int var7 = 0; var7 < class501.field7222; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field4005;
                int var9 = (var5[var7 + 1 & class507.field7299] + -var5[class507.field7299 & var7 - 1]) * this.field4005;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg0 > -21) {
            this.field4005 = -119;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILfj;Lfj;)V")
    public static final void method1756(int arg0, int arg1, int arg2, class599 arg3, class599 arg4) {
        class287 var5 = class396.method2161(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3678 = arg3;
            var5.field3677 = arg4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 == -1) {
            this.field4005 = arg1.method2574(-1758460248);
        }
        if (!arg2) {
            this.field4005 = 71;
        }
        ++field4004;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Lob;")
    public static final class672 method1757(byte arg0) {
        ++field4003;
        return arg0 != 90 ? null : class637.field9015;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class308() {
        super(1, true);
    }
}
