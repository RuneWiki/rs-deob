import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class4 extends class478 {

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    private int field45 = 4096;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    private int field50 = 0;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    private int field52 = 8192;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    private int field51 = 12288;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    private int field47 = 0;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    private int field55 = 2048;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    private int field56 = 2048;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 5)
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(III)Z", line = 10)
    private final boolean method31(int arg0, int arg1, int arg2) {
        ++field53;
        int var4 = (arg0 - -arg1) * this.field51 >> 12;
        int var5 = class609.field8517[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field51;
        int var7 = (var6 << 12) / this.field52;
        int var8 = this.field45 * var7 >> 12;
        if (arg2 != 1287983788) {
            this.field56 = 23;
        }
        return ~var8 < ~(arg0 - arg1) && -arg1 + arg0 > -var8;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(III)Z", line = 30)
    private final boolean method32(int arg0, int arg1, int arg2) {
        ++field49;
        if (arg1 > -84) {
            this.method34((byte) 69);
        }
        int var4 = (-arg2 + arg0) * this.field51 >> 12;
        int var5 = class609.field8517[(var4 * 255 & 1047947) >> 12];
        int var6 = (var5 << 12) / this.field51;
        int var7 = (var6 << 12) / this.field52;
        int var8 = this.field45 * var7 >> 12;
        return ~(arg0 + arg2) > ~var8 && arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILnp;I)V", line = 64)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field54;
        if (arg0 != 255) {
            this.method34((byte) 34);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field52 = arg1.method643((byte) -77);
                                }
                            } else {
                                this.field45 = arg1.method643((byte) -77);
                            }
                        } else {
                            this.field51 = arg1.method643((byte) -77);
                        }
                    } else {
                        this.field55 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field47 = arg1.method643((byte) -77);
                }
            } else {
                this.field50 = arg1.method643((byte) -77);
            }
        } else {
            this.field56 = arg1.method643((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V", line = 147)
    public final void method34(byte arg0) {
        class625.method3518(arg0 + -23);
        ++field46;
        if (arg0 != 23) {
            this.method33(-30, (class115) null, 106);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)[I", line = 158)
    public final int[] method35(int arg0, int arg1) {
        ++field48;
        int[] var3 = super.field6886.method789(arg0, (byte) -88);
        if (arg1 != -11323) {
            this.method34((byte) 47);
        }
        if (super.field6886.field1592) {
            int var4 = class695.field9740[arg0] - 2048;
            for (int var5 = 0; ~class436.field6154 < ~var5; ++var5) {
                int var6 = class684.field9645[var5] - 2048;
                int var7 = this.field56 + var6;
                int var8 = var7 < -2048 ? var7 - -4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                int var10 = this.field50 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var13 = this.field47 + var6;
                int var14 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field55 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 - -4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method32(var12, -90, var9) && !this.method31(var18, var15, 1287983788) ? 0 : 4096;
            }
        }
        return var3;
    }
}
