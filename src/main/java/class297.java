import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class297 extends class96 {

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    private int field3849 = 3216;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    private int field3850 = 4096;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    private int field3852 = 3216;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "[I")
    private int[] field3859 = new int[3];

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3851 = null;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
    public static int field3857 = 0;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "[I")
    public static int[] field3853 = new int[4096];

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 == -1) {
            ++field3861;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field3852 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field3849 = arg2.method568((byte) 110);
                }
            } else {
                this.field3850 = arg2.method568((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
    public static final void method1784(boolean arg0) {
        ++field3860;
        if (arg0) {
            if (~class295.field3838 < -1) {
                int var1 = 0;
                for (int var2 = 0; ~var2 > ~class99.field1384.length; ++var2) {
                    if (class99.field1384[var2].startsWith("--> ")) {
                        ++var1;
                        if (~class295.field3838 == ~var1) {
                            class268.field3398 = class99.field1384[var2].substring(4);
                            return;
                        }
                    }
                }
            } else {
                class268.field3398 = "";
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field3850 = -89;
        }
        ++field3858;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int var4 = class362.field4680 * this.field3850 >> 12;
            int[] var5 = this.method657(0, class380.field4948 & arg0 - 1, -1);
            int[] var6 = this.method657(0, arg0, -1);
            int[] var7 = this.method657(0, class380.field4948 & arg0 - -1, -1);
            for (int var8 = 0; class269.field3403 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class292.field3781] + -var6[class292.field3781 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class520.field7683[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field3859[0] * var16 >> 12;
                int var18 = this.field3859[1] * var15 >> 12;
                int var19 = this.field3859[2] * var14 >> 12;
                var3[var8] = var17 + var18 - -var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    public class297() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        if (arg0 <= 15) {
            this.method31(62, -64, (class88) null);
        }
        this.method1785((byte) -9);
        ++field3854;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(B)V")
    private final void method1785(byte arg0) {
        ++field3856;
        double var2 = Math.cos((double) ((float) this.field3852 / 4096.0F));
        this.field3859[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3849 / 4096.0F)) * var2);
        this.field3859[1] = (int) (Math.cos((double) ((float) this.field3849 / 4096.0F)) * var2 * 4096.0D);
        this.field3859[2] = (int) (Math.sin((double) ((float) this.field3852 / 4096.0F)) * 4096.0D);
        int var4 = this.field3859[0] * this.field3859[0] >> 12;
        int var5 = this.field3859[1] * this.field3859[1] >> 12;
        int var6 = this.field3859[2] * this.field3859[2] >> 12;
        if (arg0 != -9) {
            this.field3850 = 81;
        }
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (~var7 != -1) {
            this.field3859[0] = (this.field3859[0] << 12) / var7;
            this.field3859[2] = (this.field3859[2] << 12) / var7;
            this.field3859[1] = (this.field3859[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
    public static void method1786(int arg0) {
        field3851 = null;
        field3853 = null;
        if (arg0 != 4096) {
            method1784(false);
        }
    }
}
