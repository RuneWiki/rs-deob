import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class579 extends class297 {

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    private int field7941 = 4096;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private int field7945 = 16;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    private int field7946 = 0;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private int field7939 = 2000;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field7944 = 0;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lin;")
    public static class91 field7942;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        ++field7940;
        class45.method545(26188);
        if (arg0 < 108) {
            method3327((byte) -111);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)[Lfh;")
    public static final class652[] method3327(byte arg0) {
        if (arg0 < 86) {
            field7942 = null;
        }
        ++field7938;
        return new class652[] { class740.field9967, class79.field1419, class327.field4545, class746.field10327, class440.field6259, class755.field10543 };
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    public static void method3328(int arg0) {
        field7942 = null;
        if (arg0 != 0) {
            method3327((byte) -98);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field7947;
        if (arg2 != 31015) {
            this.field7941 = -29;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field7941 = arg0.method1478(842397944);
                        }
                    } else {
                        this.field7946 = arg0.method1478(842397944);
                    }
                } else {
                    this.field7945 = arg0.method1535(255);
                }
            } else {
                this.field7939 = arg0.method1478(842397944);
            }
        } else {
            this.field7944 = arg0.method1535(255);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7943;
        if (arg1 != 255) {
            this.method711(-48);
        }
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            int var4 = this.field7941 >> 1;
            int[][] var5 = super.field4165.method121((byte) 16);
            Random var6 = new Random((long) this.field7944);
            for (int var7 = 0; ~var7 > ~this.field7939; ++var7) {
                int var8 = ~this.field7941 < -1 ? this.field7946 + class37.method463((byte) 92, this.field7941, var6) + -var4 : this.field7946;
                int var9 = var8 >> 4 & 255;
                int var10 = class37.method463((byte) 81, class525.field7275, var6);
                int var11 = class37.method463((byte) 123, class128.field2169, var6);
                int var12 = var10 - -(class551.field7593[var9] * this.field7945 >> 12);
                int var13 = (class309.field4295[var9] * this.field7945 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class37.method463((byte) 90, 4096, var6) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var11 <= ~var13 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (var28 - var10) * var25 + var26 + 1024;
                        int var30 = class677.field9204 & var28;
                        int var31 = var21 & class319.field4394;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class579() {
        super(0, true);
    }
}
