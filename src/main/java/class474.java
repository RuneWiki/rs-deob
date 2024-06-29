import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class474 extends class139 {

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    private int field6656 = 4096;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
    private int[] field6661 = new int[3];

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field6660 = 3216;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    private int field6665 = 3216;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lck;IB)V")
    public static final void method2779(class419 arg0, int arg1, byte arg2) {
        if (arg2 == -65) {
            class201.field2946 = 0;
            ++field6662;
            class132.field1735 = false;
            class279.method1767(0, arg0);
            class414.method2444(arg0, (byte) 120);
            if (class132.field1735) {
                System.out.println("---endgpp---");
            }
            if (arg0.field4021 != arg1) {
                throw new RuntimeException("gpi1 pos:" + arg0.field4021 + " psize:" + arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 == -45) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field6660 = arg0.method1729(arg1 ^ -65325);
                    }
                } else {
                    this.field6665 = arg0.method1729(65280);
                }
            } else {
                this.field6656 = arg0.method1729(65280);
            }
            ++field6663;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class474() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            return null;
        } else {
            ++field6658;
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                int var4 = class476.field6685 * this.field6656 >> 12;
                int[] var5 = this.method879((byte) -29, arg0 - 1 & class388.field5511, 0);
                int[] var6 = this.method879((byte) -29, arg0, 0);
                int[] var7 = this.method879((byte) -29, arg0 - -1 & class388.field5511, 0);
                for (int var8 = 0; class356.field5147 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 - 1 & class414.field5822] + -var6[class414.field5822 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class256.field3751[((var12 - -1) * var12 >> 1) + var11];
                    int var14 = var10 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field6661[0] * var14 >> 12;
                    int var18 = this.field6661[2] * var15 >> 12;
                    int var19 = this.field6661[1] * var16 >> 12;
                    var3[var8] = var17 + var19 + var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        this.method2780(38);
        if (arg0 != 7) {
            this.field6656 = -88;
        }
        ++field6659;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    private final void method2780(int arg0) {
        ++field6657;
        double var2 = Math.cos((double) ((float) this.field6660 / 4096.0F));
        this.field6661[0] = (int) (Math.sin((double) ((float) this.field6665 / 4096.0F)) * var2 * 4096.0D);
        this.field6661[1] = (int) (var2 * Math.cos((double) ((float) this.field6665 / 4096.0F)) * 4096.0D);
        this.field6661[2] = (int) (4096.0D * Math.sin((double) ((float) this.field6660 / 4096.0F)));
        if (arg0 <= 37) {
            this.method22(54, -55);
        }
        int var4 = this.field6661[0] * this.field6661[0] >> 12;
        int var5 = this.field6661[1] * this.field6661[1] >> 12;
        int var6 = this.field6661[2] * this.field6661[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field6661[1] = (this.field6661[1] << 12) / var7;
            this.field6661[2] = (this.field6661[2] << 12) / var7;
            this.field6661[0] = (this.field6661[0] << 12) / var7;
        }
    }
}
