import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 extends class184 {

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    private int field232 = 12288;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    private int field236 = 2048;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    private int field237 = 2048;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    private int field234 = 8192;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    private int field240 = 4096;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    private int field239 = 0;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    private int field241 = 0;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)Z", line = 6)
    private final boolean method106(int arg0, byte arg1, int arg2) {
        ++field235;
        if (arg1 < 13) {
            this.field240 = 86;
        }
        int var4 = (arg0 + arg2) * this.field232 >> 12;
        int var5 = class108.field1360[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field232;
        int var7 = (var6 << 12) / this.field234;
        int var8 = this.field240 * var7 >> 12;
        return -arg0 + arg2 < var8 && ~(-var8) > ~(-arg0 + arg2);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 26)
    public final int[] method6(int arg0, int arg1) {
        ++field228;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0] + -2048;
            for (int var5 = 0; class245.field3167 > var5; ++var5) {
                int var6 = class347.field4461[var5] + -2048;
                int var7 = this.field236 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field241 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field239 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field237;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method107(arg1 + -585, var12, var9) && !this.method106(var15, (byte) 43, var18) ? 0 : 4096;
            }
        }
        return arg1 != 578 ? null : var3;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 76)
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(III)Z", line = 79)
    private final boolean method107(int arg0, int arg1, int arg2) {
        ++field230;
        int var4 = (-arg2 + arg1) * this.field232 >> 12;
        int var5 = -65 / ((arg0 - -88) / 32);
        int var6 = class108.field1360[255 & var4 * 255 >> 12];
        int var7 = (var6 << 12) / this.field232;
        int var8 = (var7 << 12) / this.field234;
        int var9 = this.field240 * var8 >> 12;
        return ~(arg1 + arg2) > ~var9 && -var9 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BILfh;)V", line = 107)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field238;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field234 = arg2.method2758((byte) 119);
                                }
                            } else {
                                this.field240 = arg2.method2758((byte) 87);
                            }
                        } else {
                            this.field232 = arg2.method2758((byte) 120);
                        }
                    } else {
                        this.field237 = arg2.method2758((byte) 96);
                    }
                } else {
                    this.field239 = arg2.method2758((byte) 118);
                }
            } else {
                this.field241 = arg2.method2758((byte) 116);
            }
        } else {
            this.field236 = arg2.method2758((byte) 106);
        }
        int var5 = -9 % ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 185)
    public static final void method108(int arg0) {
        ++field227;
        int var1 = 0;
        for (int var2 = 0; class452.field6526 > var2; ++var2) {
            for (int var4 = 0; var4 < class440.field6307; ++var4) {
                if (class424.method2491(class125.field1664, true, var2, 1, var4, var1)) {
                    ++var1;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 35 % ((arg0 - 51) / 43);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 225)
    public final void method109(boolean arg0) {
        ++field231;
        if (arg0) {
            this.method107(112, -61, -34);
        }
        class93.method721(4096);
    }
}
