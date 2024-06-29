import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class119 extends class264 {

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    private int field1645 = 3216;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    private int field1646 = 3216;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "[I")
    private int[] field1650 = new int[3];

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    private int field1652 = 4096;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Lae;")
    public static class172 field1648 = null;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Lde;")
    public static class257 field1654;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method90(int arg0, int arg1) {
        ++field1644;
        if (arg1 != 21034) {
            this.method95(-127);
        }
        int[] var3 = super.field3808.method958((byte) 114, arg0);
        if (super.field3808.field1732) {
            int var4 = class96.field1354 * this.field1652 >> 12;
            int[] var5 = this.method1788(class301.field4265 & arg0 + -1, (byte) -16, 0);
            int[] var6 = this.method1788(arg0, (byte) -38, 0);
            int[] var7 = this.method1788(arg0 + 1 & class301.field4265, (byte) -92, 0);
            for (int var8 = 0; ~class478.field6792 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class205.field3007 & var8 + -1] - var6[class205.field3007 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class47.field722[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1650[0] * var15 >> 12;
                int var18 = this.field1650[2] * var16 >> 12;
                int var19 = this.field1650[1] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 80)
    public class119() {
        super(1, true);
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V", line = 85)
    public static void method923(int arg0) {
        field1654 = null;
        field1648 = null;
        if (arg0 != 0) {
            method923(60);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 115)
    private final void method924(byte arg0) {
        ++field1653;
        if (arg0 > -47) {
            this.field1652 = -39;
        }
        double var2 = Math.cos((double) ((float) this.field1646 / 4096.0F));
        this.field1650[0] = (int) (Math.sin((double) ((float) this.field1645 / 4096.0F)) * var2 * 4096.0D);
        this.field1650[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1645 / 4096.0F)) * var2);
        this.field1650[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1646 / 4096.0F)));
        int var4 = this.field1650[0] * this.field1650[0] >> 12;
        int var5 = this.field1650[1] * this.field1650[1] >> 12;
        int var6 = this.field1650[2] * this.field1650[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field1650[2] = (this.field1650[2] << 12) / var7;
            this.field1650[1] = (this.field1650[1] << 12) / var7;
            this.field1650[0] = (this.field1650[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLkk;I)V", line = 146)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 < 31) {
            field1655 = 126;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1646 = arg1.method1134(-16848);
                }
            } else {
                this.field1645 = arg1.method1134(-16848);
            }
        } else {
            this.field1652 = arg1.method1134(-16848);
        }
        ++field1651;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V", line = 189)
    public final void method95(int arg0) {
        if (arg0 != -8) {
            this.method90(11, -59);
        }
        ++field1647;
        this.method924((byte) -60);
    }
}
