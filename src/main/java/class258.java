import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class258 extends class45 {

    @OriginalMember(owner = "client!es", name = "J", descriptor = "I")
    private int field3741 = 8192;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    private int field3745 = 0;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    private int field3739 = 12288;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "I")
    private int field3749 = 4096;

    @OriginalMember(owner = "client!es", name = "T", descriptor = "I")
    private int field3751 = 0;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "I")
    private int field3747 = 2048;

    @OriginalMember(owner = "client!es", name = "S", descriptor = "I")
    private int field3750 = 2048;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "Liv;")
    public static class64 field3746 = new class64(35, 12);

    @OriginalMember(owner = "client!es", name = "U", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!es", name = "V", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(BII)Z")
    private final boolean method1668(byte arg0, int arg1, int arg2) {
        if (arg0 != 113) {
            this.field3747 = -64;
        }
        ++field3743;
        int var4 = (arg1 + arg2) * this.field3739 >> 12;
        int var5 = class57.field1002[(var4 * 255 & 1045080) >> 12];
        int var6 = (var5 << 12) / this.field3739;
        int var7 = (var6 << 12) / this.field3741;
        int var8 = this.field3749 * var7 >> 12;
        return var8 > -arg1 + arg2 && -arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
    public static void method1669(int arg0) {
        field3746 = null;
        if (arg0 != 0) {
            field3752 = 11;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field3744;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field3741 = arg0.method1069((byte) -71);
                                }
                            } else {
                                this.field3749 = arg0.method1069((byte) -48);
                            }
                        } else {
                            this.field3739 = arg0.method1069((byte) -25);
                        }
                    } else {
                        this.field3750 = arg0.method1069((byte) -100);
                    }
                } else {
                    this.field3751 = arg0.method1069((byte) -72);
                }
            } else {
                this.field3745 = arg0.method1069((byte) -13);
            }
        } else {
            this.field3747 = arg0.method1069((byte) -45);
        }
        if (arg1 != -26471) {
            field3752 = 45;
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(III)Z")
    private final boolean method1670(int arg0, int arg1, int arg2) {
        ++field3742;
        int var4 = (arg1 - arg0) * this.field3739 >> 12;
        int var5 = -127 % ((arg2 - 60) / 53);
        int var6 = class57.field1002[(1047362 & var4 * 255) >> 12];
        int var7 = (var6 << 12) / this.field3739;
        int var8 = (var7 << 12) / this.field3741;
        int var9 = this.field3749 * var8 >> 12;
        return ~var9 < ~(arg0 + arg1) && arg0 + arg1 > -var9;
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
    public class258() {
        super(0, true);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3748;
        if (arg0 != 0) {
            this.method1670(-111, -25, 78);
        }
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int var4 = class433.field6429[arg1] + -2048;
            for (int var5 = 0; ~class259.field3768 < ~var5; ++var5) {
                int var6 = class69.field1199[var5] + -2048;
                int var7 = this.field3747 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field3745 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = this.field3751 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = this.field3750 + var4;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method1670(var9, var12, class125.method953(arg0, -102)) && !this.method1668((byte) 113, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    public final void method38(int arg0) {
        ++field3740;
        if (arg0 != 4095) {
            this.method37((class145) null, -89, -94);
        }
        class416.method2523(4096);
    }
}
