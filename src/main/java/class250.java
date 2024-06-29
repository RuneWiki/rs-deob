import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class250 extends class210 {

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    private int field3671 = 8192;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    private int field3670 = 2048;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    private int field3675 = 4096;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    private int field3679 = 0;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    private int field3680 = 12288;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    private int field3673 = 0;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    private int field3682 = 2048;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Lhr;")
    public static final class127 method1655(int arg0, int arg1) {
        ++field3672;
        class127 var2 = (class127) class440.field6409.method2310((byte) -126, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class411.field5907.method715(arg1, (byte) 46, arg0);
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method855(63, new class256(var3), arg1);
            }
            class440.field6409.method2299(true, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            method1657(15);
        }
        ++field3674;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3671 = arg2.method1767(1930493576);
                                }
                            } else {
                                this.field3675 = arg2.method1767(1930493576);
                            }
                        } else {
                            this.field3680 = arg2.method1767(arg1 + 1930505517);
                        }
                    } else {
                        this.field3670 = arg2.method1767(arg1 ^ -1930481709);
                    }
                } else {
                    this.field3679 = arg2.method1767(1930493576);
                }
            } else {
                this.field3673 = arg2.method1767(1930493576);
            }
        } else {
            this.field3682 = arg2.method1767(1930493576);
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public final void method363(int arg0) {
        class51.method392(arg0);
        ++field3676;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        if (arg1 != -38) {
            return null;
        } else {
            ++field3683;
            int[] var3 = super.field2950.method1892(arg0, (byte) -115);
            if (super.field2950.field4111) {
                int var4 = class331.field4911[arg0] + -2048;
                for (int var5 = 0; class202.field2852 > var5; ++var5) {
                    int var6 = class430.field6250[var5] + -2048;
                    int var7 = this.field3682 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = var8 > 2048 ? var8 + -4096 : var8;
                    int var10 = var4 - -this.field3673;
                    int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                    int var12 = ~var11 < -2049 ? var11 - 4096 : var11;
                    int var13 = this.field3679 + var6;
                    int var14 = var13 < -2048 ? var13 + 4096 : var13;
                    int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                    int var16 = this.field3670 + var4;
                    int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method1658(var12, var9, -3) && !this.method1656(arg1 + 293, var15, var18) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(III)Z")
    private final boolean method1656(int arg0, int arg1, int arg2) {
        ++field3677;
        int var4 = (arg1 + arg2) * this.field3680 >> 12;
        int var5 = class311.field4580[(1045736 & arg0 * var4) >> 12];
        int var6 = (var5 << 12) / this.field3680;
        int var7 = (var6 << 12) / this.field3671;
        int var8 = this.field3675 * var7 >> 12;
        return ~var8 < ~(arg2 - arg1) && -var8 < -arg1 + arg2;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public static final void method1657(int arg0) {
        if (arg0 == 4) {
            class359.method2285();
            ++field3678;
            for (int var1 = 0; var1 < 4; ++var1) {
                class382.field5610[var1].method1221((byte) -97);
            }
            class83.method554(-122);
            class446.method2748(-119);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(III)Z")
    private final boolean method1658(int arg0, int arg1, int arg2) {
        ++field3681;
        int var4 = (arg0 - arg1) * this.field3680 >> 12;
        int var5 = class311.field4580[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field3680;
        int var7 = (var6 << 12) / this.field3671;
        if (arg2 != -3) {
            this.method363(42);
        }
        int var8 = this.field3675 * var7 >> 12;
        return ~(arg0 + arg1) > ~var8 && -var8 < arg1 - -arg0;
    }
}
