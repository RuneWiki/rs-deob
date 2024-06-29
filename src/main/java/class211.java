import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class211 extends class84 {

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    private int field3379 = 4096;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "[I")
    private int[] field3382 = new int[3];

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    private int field3381 = 3216;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    private int field3387 = 3216;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Z")
    public static boolean field3380 = true;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3384 = -1;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field3386 = 100;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lqi;")
    public static class131 field3390 = null;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, true);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1535(byte arg0) {
        if (arg0 <= 90) {
            method1535((byte) 22);
        }
        field3390 = null;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        this.method1537(arg0);
        ++field3385;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static final int method1536(int arg0, int arg1) {
        if (arg0 != 32740) {
            return 35;
        } else {
            ++field3378;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)V")
    private final void method1537(boolean arg0) {
        ++field3383;
        double var2 = Math.cos((double) ((float) this.field3381 / 4096.0F));
        this.field3382[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3387 / 4096.0F)) * var2);
        this.field3382[1] = (int) (4096.0D * Math.cos((double) ((float) this.field3387 / 4096.0F)) * var2);
        if (arg0) {
            method1535((byte) 25);
        }
        this.field3382[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3381 / 4096.0F)));
        int var4 = this.field3382[1] * this.field3382[1] >> 12;
        int var5 = this.field3382[0] * this.field3382[0] >> 12;
        int var6 = this.field3382[2] * this.field3382[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field3382[1] = (this.field3382[1] << 12) / var7;
            this.field3382[0] = (this.field3382[0] << 12) / var7;
            this.field3382[2] = (this.field3382[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field3389;
        if (arg0 >= -125) {
            return null;
        } else {
            int[] var3 = super.field1228.method1627(-1, arg1);
            if (super.field1228.field3651) {
                int var4 = class213.field3407 * this.field3379 >> 12;
                int[] var5 = this.method612(0, arg1 + -1 & class58.field822, false);
                int[] var6 = this.method612(0, arg1, false);
                int[] var7 = this.method612(0, arg1 + 1 & class58.field822, false);
                for (int var8 = 0; ~class20.field221 < ~var8; ++var8) {
                    int var9 = (var6[var8 + -1 & class36.field497] + -var6[class36.field497 & var8 - -1]) * var4 >> 12;
                    int var10 = var9 >> 4;
                    int var11 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    if (~var10 > -1) {
                        var10 = -var10;
                    }
                    if (var10 > 255) {
                        var10 = 255;
                    }
                    int var12 = var11 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class128.field1911[var10 - -((var12 + 1) * var12 >> 1)];
                    int var14 = var11 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = this.field3382[1] * var14 >> 12;
                    int var17 = this.field3382[2] * var15 >> 12;
                    int var18 = var9 * var13 >> 8;
                    int var19 = this.field3382[0] * var18 >> 12;
                    var3[var8] = var17 + var19 + var16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3381 = arg0.method1126(false);
                }
            } else {
                this.field3387 = arg0.method1126(false);
            }
        } else {
            this.field3379 = arg0.method1126(false);
        }
        ++field3388;
        if (arg1 <= 87) {
            this.field3387 = -37;
        }
    }
}
