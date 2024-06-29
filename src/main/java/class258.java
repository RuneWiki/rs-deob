import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class258 extends class148 {

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    private int field3811 = 4096;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "Z")
    public static boolean field3806 = false;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "Llt;")
    public static class475 field3809 = new class475("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!es", name = "J", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1715(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3810;
        if (arg2 != 104) {
            field3806 = false;
        }
        int var8 = class42.method249(class37.field393, arg7, (byte) -72, class509.field7436);
        int var9 = class42.method249(class37.field393, arg6, (byte) -72, class509.field7436);
        int var10 = class42.method249(class494.field7297, arg3, (byte) -72, class445.field6629);
        int var11 = class42.method249(class494.field7297, arg4, (byte) -72, class445.field6629);
        int var12 = class42.method249(class37.field393, arg5 + arg7, (byte) -72, class509.field7436);
        int var13 = class42.method249(class37.field393, -arg5 + arg6, (byte) -72, class509.field7436);
        for (int var14 = var8; ~var14 > ~var12; ++var14) {
            class415.method2491(var11, var10, class339.field4800[var14], arg1, -31541);
        }
        for (int var15 = var9; var15 > var13; --var15) {
            class415.method2491(var11, var10, class339.field4800[var15], arg1, arg2 ^ -31581);
        }
        int var16 = class42.method249(class494.field7297, arg3 + arg5, (byte) -72, class445.field6629);
        int var17 = class42.method249(class494.field7297, -arg5 + arg4, (byte) -72, class445.field6629);
        for (int var18 = var12; var13 >= var18; ++var18) {
            int[] var19 = class339.field4800[var18];
            class415.method2491(var16, var10, var19, arg1, arg2 ^ -31581);
            class415.method2491(var17, var16, var19, arg0, -31541);
            class415.method2491(var11, var17, var19, arg1, -31541);
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
    public static final void method1716(int arg0) {
        class33.field345.method1052(class242.field3576, class426.field6401.field1019 ? class357.field5492 + 256 << 0 : -1, 256);
        if (arg0 > 4) {
            ++field3807;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 >= -65) {
            return null;
        } else {
            ++field3803;
            int[] var3 = super.field2193.method497(arg1, false);
            if (super.field2193.field1312) {
                int[] var4 = this.method971(false, class39.field569 & arg1 + -1, 0);
                int[] var5 = this.method971(false, arg1, 0);
                int[] var6 = this.method971(false, arg1 + 1 & class39.field569, 0);
                for (int var7 = 0; class320.field4579 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field3811;
                    int var9 = (var5[class304.field4339 & var7 + 1] - var5[class304.field4339 & var7 + -1]) * this.field3811;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                    int var15 = var14 == 0 ? 0 : 16777216 / var14;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static void method1717(boolean arg0) {
        if (arg0) {
            method1717(false);
        }
        field3809 = null;
    }

    @OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
    public static final void method1718(int arg0) {
        class320.field4578 = new class12(8);
        ++field3804;
        class169.field2509 = 0;
        if (arg0 == -30235) {
            for (class201 var1 = (class201) class190.field2802.method1873((byte) -126); var1 != null; var1 = (class201) class190.field2802.method1880(-61)) {
                var1.method1372();
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field3811 = arg1.method1450((byte) 111);
        }
        int var4 = -15 % ((-88 - arg2) / 33);
        ++field3805;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, true);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1719(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field3808;
        int var7 = -arg2 + arg1;
        int var8 = arg6 - -arg2;
        for (int var9 = arg6; var8 > var9; ++var9) {
            class415.method2491(arg3, arg0, class339.field4800[var9], arg5, -31541);
        }
        int var10 = arg3 - arg2;
        for (int var11 = arg1; ~var11 < ~var7; --var11) {
            class415.method2491(arg3, arg0, class339.field4800[var11], arg5, -31541);
        }
        int var12 = arg0 + arg2;
        for (int var13 = var8; var7 >= var13; ++var13) {
            int[] var14 = class339.field4800[var13];
            class415.method2491(var12, arg0, var14, arg5, -31541);
            class415.method2491(arg3, var10, var14, arg5, -31541);
        }
        if (arg4 != -49) {
            field3806 = false;
        }
    }
}
