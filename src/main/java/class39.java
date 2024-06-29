import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 extends class170 {

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    private int field788 = 3216;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    private int field787 = 3216;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "[I")
    private int[] field792 = new int[3];

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    private int field783 = 4096;

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "Lqk;")
    public static class207 field789 = null;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "Lqk;")
    public static class207 field785 = class24.method212(255, "Jeter");

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "Lqk;")
    public static class207 field781 = class24.method212(255, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field787 = arg0.method1050(1272006568);
                }
            } else {
                this.field788 = arg0.method1050(arg1 ^ 1272009053);
            }
        } else {
            this.field783 = arg0.method1050(1272006568);
        }
        if (arg1 == 5877) {
            ++field790;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            this.field783 = -36;
        }
        int[] var3 = super.field3001.method1538(103, arg1);
        if (super.field3001.field3835) {
            int var4 = class167.field2943 * this.field783 >> 12;
            int[] var5 = this.method1226(0, arg1 + -1 & class233.field4294, -30);
            int[] var6 = this.method1226(0, arg1, arg0 + -30);
            int[] var7 = this.method1226(0, arg1 - -1 & class233.field4294, arg0 + 148);
            for (int var8 = 0; ~class88.field1595 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class94.field1684 & var8 - 1] + -var6[var8 - -1 & class94.field1684]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var13 = 255 & class120.field2084[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field792[0] * var16 >> 12;
                int var18 = this.field792[1] * var15 >> 12;
                int var19 = this.field792[2] * var14 >> 12;
                var3[var8] = var17 - (-var18 - var19);
            }
        }
        ++field793;
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.method300(true);
        ++field791;
        if (arg0 < 14) {
            this.field788 = -75;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V")
    private final void method300(boolean arg0) {
        ++field782;
        if (!arg0) {
            this.method31((byte) 13, -58);
        }
        double var2 = Math.cos((double) ((float) this.field787 / 4096.0F));
        this.field792[0] = (int) (Math.sin((double) ((float) this.field788 / 4096.0F)) * var2 * 4096.0D);
        this.field792[1] = (int) (4096.0D * Math.cos((double) ((float) this.field788 / 4096.0F)) * var2);
        this.field792[2] = (int) (4096.0D * Math.sin((double) ((float) this.field787 / 4096.0F)));
        int var4 = this.field792[1] * this.field792[1] >> 12;
        int var5 = this.field792[0] * this.field792[0] >> 12;
        int var6 = this.field792[2] * this.field792[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 - -var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field792[2] = (this.field792[2] << 12) / var7;
            this.field792[1] = (this.field792[1] << 12) / var7;
            this.field792[0] = (this.field792[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
    public static void method301(byte arg0) {
        field789 = null;
        field785 = null;
        int var1 = 26 % ((-64 - arg0) / 56);
        field781 = null;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class39() {
        super(1, true);
    }
}
