import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class218 extends class89 {

    @OriginalMember(owner = "client!mk", name = "R", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!mk", name = "Q", descriptor = "[I")
    public static int[] field3698 = new int[2000];

    @OriginalMember(owner = "client!mk", name = "S", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!mk", name = "W", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!mk", name = "T", descriptor = "Lwb;")
    public static class179 field3701;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lma;I)V")
    public static final void method1397(class105 arg0, int arg1) {
        class131.field2344 = arg0;
        ++field3702;
        int var2 = 69 % ((arg1 - -8) / 60);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field3704;
        int[] var3 = super.field1503.method229(arg0, (byte) -89);
        if (arg1) {
            field3698 = null;
        }
        if (super.field1503.field664) {
            int[] var4 = this.method645(103, 0, arg0);
            for (int var5 = 0; class65.field1070 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field3700;
        if (arg0 != -20503) {
            field3698 = null;
        }
        if (~arg2 == -1) {
            super.field1508 = ~arg1.method564((byte) 66) == -2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "(I)V")
    public static void method1398(int arg0) {
        field3701 = null;
        if (arg0 <= -48) {
            field3698 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        ++field3703;
        if (!arg0) {
            return null;
        } else {
            if (super.field1512.field2007) {
                int[][] var4 = this.method648(true, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var3[0];
                int[] var7 = var4[1];
                int[] var8 = var4[2];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class65.field1070; ++var11) {
                    var6[var11] = 4096 - var5[var11];
                    var9[var11] = -var7[var11] + 4096;
                    var10[var11] = -var8[var11] + 4096;
                }
            }
            return var3;
        }
    }
}
