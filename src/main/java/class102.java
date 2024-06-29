import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 extends class200 {

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
    private boolean field1790 = true;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    private int field1793 = 4096;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lve;")
    public static class189 field1795 = new class189(64);

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lid;")
    public static class149 field1797 = class60.method382("loginscreen", (byte) 35);

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lve;")
    public static class189 field1796 = new class189(30);

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "Lid;")
    public static class149 field1799 = class60.method382(":assistreq:", (byte) 102);

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "Laj;")
    public static class47 field1801 = null;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "[[[Lra;")
    public static class231[][][] field1798;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 67);
        ++field1791;
        if (!arg0) {
            return null;
        } else {
            if (super.field3632.field2550) {
                int[] var4 = this.method1368(0, arg1 - 1 & class191.field3436, !arg0);
                int[] var5 = this.method1368(0, arg1, false);
                int[] var6 = this.method1368(0, arg1 + 1 & class191.field3436, false);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~var10 > ~class137.field2515; ++var10) {
                    int var11 = (var5[class261.field4667 & var10 + 1] - var5[class261.field4667 & var10 - 1]) * this.field1793;
                    int var12 = (var6[var10] + -var4[var10]) * this.field1793;
                    int var13 = var11 >> 12;
                    int var14 = var12 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    } else {
                        var18 = 0;
                        var20 = 0;
                        var19 = 0;
                    }
                    if (this.field1790) {
                        var20 = (var20 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                    }
                    var7[var10] = var18;
                    var8[var10] = var20;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1790 = ~arg0.method489((byte) 111) == -2;
            }
        } else {
            this.field1793 = arg0.method485(-2386);
        }
        if (!arg1) {
            field1801 = null;
        }
        ++field1794;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1797 = null;
        field1795 = null;
        field1798 = null;
        field1801 = null;
        if (arg0 != 2048) {
            field1798 = null;
        }
        field1799 = null;
        field1796 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILug;JZ)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3, class199 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class100 var8 = new class100();
            var8.field1764 = arg4;
            var8.field1767 = arg1 * 128 + 64;
            var8.field1761 = arg2 * 128 + 64;
            var8.field1772 = arg3;
            var8.field1765 = arg5;
            if (class261.field4664[arg0][arg1][arg2] == null) {
                class261.field4664[arg0][arg1][arg2] = new class231(arg0, arg1, arg2);
            }
            class261.field4664[arg0][arg1][arg2].field4048 = var8;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, false);
    }
}
