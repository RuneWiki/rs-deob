import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class139 extends class259 {

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    private int field2715 = 4096;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "Z")
    private boolean field2720 = true;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2712 = 1;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "Lmc;")
    public static class151 field2713;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Ldl;")
    public static class31 field2714;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[BI)I")
    public static final int method1048(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field2718;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; ++var5) {
            var4 = class137.field2674[(var4 ^ arg2[var5]) & 255] ^ var4 >>> 8;
        }
        if (arg3 != 0) {
            field2713 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2720 = ~arg2.method63((byte) 47) == -2;
            }
        } else {
            this.field2715 = arg2.method65((byte) 126);
        }
        if (arg1 != -1586849108) {
            method1048(72, -94, (byte[]) null, -94);
        }
        ++field2717;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        field2714 = null;
        if (arg0 != -108) {
            method1048(81, -29, (byte[]) null, 68);
        }
        field2713 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field2716;
        int[][] var3 = super.field4568.method241(-95, arg1);
        int var4 = -18 / ((-48 - arg0) / 42);
        if (super.field4568.field564) {
            int[] var5 = this.method1799(0, arg1 - 1 & class263.field4649, 114);
            int[] var6 = this.method1799(0, arg1, 111);
            int[] var7 = this.method1799(0, class263.field4649 & arg1 + 1, 118);
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class223.field3999; ++var11) {
                int var12 = (var6[class52.field1174 & var11 + 1] + -var6[class52.field1174 & var11 + -1]) * this.field2715;
                int var13 = (var7[var11] + -var5[var11]) * this.field2715;
                int var14 = var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 == -1) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = 16777216 / var18;
                    var21 = var13 / var18;
                    var19 = var12 / var18;
                }
                if (this.field2720) {
                    var20 = 2048 - -(var20 >> 1);
                    var21 = 2048 - -(var21 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var11] = var19;
                var8[var11] = var21;
                var10[var11] = var20;
            }
        }
        return var3;
    }
}
