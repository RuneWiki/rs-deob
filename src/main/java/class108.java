import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class108 extends class175 {

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "I")
    private int field1513 = 204;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "I")
    private int field1514 = 1;

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    private int field1515 = 1;

    @OriginalMember(owner = "client!qfa", name = "K", descriptor = "S")
    public static short field1518 = 205;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!qfa", name = "J", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field1517;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field2310.method91(0, arg1);
            if (super.field2310.field169) {
                for (int var4 = 0; ~var4 > ~class598.field8136; ++var4) {
                    int var5 = class693.field9221[var4];
                    int var6 = class456.field6536[arg1];
                    int var7 = this.field1514 * var5 >> 12;
                    int var8 = this.field1515 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field1514) * this.field1514;
                    int var10 = var6 % (4096 / this.field1515) * this.field1515;
                    if (~this.field1513 < ~var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var9 > ~this.field1513) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field1513 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1513 = arg1.method1728((byte) 80);
                }
            } else {
                this.field1515 = arg1.method1731((byte) 64);
            }
        } else {
            this.field1514 = arg1.method1731((byte) 64);
        }
        ++field1516;
        if (arg2) {
            field1518 = 29;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FIFFI)F")
    public static final float method808(float arg0, int arg1, float arg2, float arg3, int arg4) {
        if (arg1 != 1) {
            method808(-0.70175266F, 83, 0.5948563F, -1.2044399F, 96);
        }
        ++field1512;
        float[] var5 = class68.field945[arg4];
        return var5[2] * arg3 + var5[0] * arg2 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
    public class108() {
        super(0, true);
    }
}
