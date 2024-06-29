import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class378 extends class214 {

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    private int field5681 = 0;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    private int field5690 = 0;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    private int field5694 = 0;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "F")
    public static float field5685;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
    private int field5686;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    private int field5689;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    private int field5691;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
    private int field5693;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "Lhw;")
    public static class613 field5677;

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class378() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5694 = (arg1.method1984(4) << 12) / 100;
                }
            } else {
                this.field5690 = (arg1.method1984(4) << 12) / 100;
            }
        } else {
            this.field5681 = arg1.method1977((byte) 70);
        }
        if (arg0 < 92) {
            this.method59(-61, (class301) null, -122);
        }
        ++field5688;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != -256) {
            method2384(-4, 31, -59);
        }
        ++field5687;
        int[][] var3 = super.field3545.method2996((byte) 121, arg0);
        if (super.field3545.field7147) {
            int[][] var4 = this.method1539(true, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class626.field8787; ++var11) {
                this.method2387(var5[var11], var6[var11], (byte) -20, var7[var11]);
                this.field5691 += this.field5690;
                this.field5689 += this.field5694;
                for (this.field5693 += this.field5681; ~this.field5693 > -1; this.field5693 += 4096) {
                }
                if (~this.field5691 > -1) {
                    this.field5691 = 0;
                }
                while (this.field5693 > 4096) {
                    this.field5693 -= 4096;
                }
                if (this.field5691 > 4096) {
                    this.field5691 = 4096;
                }
                if (~this.field5689 > -1) {
                    this.field5689 = 0;
                }
                if (~this.field5689 < -4097) {
                    this.field5689 = 4096;
                }
                this.method2383((byte) 114, this.field5689, this.field5693, this.field5691);
                var8[var11] = this.field5678;
                var9[var11] = this.field5684;
                var10[var11] = this.field5686;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BIII)V")
    private final void method2383(byte arg0, int arg1, int arg2, int arg3) {
        ++field5683;
        int var5 = arg1 <= 2048 ? (4096 - -arg3) * arg1 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg1 + arg1;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field5684 = var7;
                                    this.field5686 = var15;
                                    this.field5678 = var5;
                                }
                            } else {
                                this.field5684 = var7;
                                this.field5686 = var5;
                                this.field5678 = var14;
                            }
                        } else {
                            this.field5684 = var15;
                            this.field5678 = var7;
                            this.field5686 = var5;
                        }
                    } else {
                        this.field5678 = var7;
                        this.field5686 = var14;
                        this.field5684 = var5;
                    }
                } else {
                    this.field5678 = var15;
                    this.field5684 = var5;
                    this.field5686 = var7;
                }
            } else {
                this.field5686 = var7;
                this.field5678 = var5;
                this.field5684 = var14;
            }
        } else {
            this.field5678 = this.field5684 = this.field5686 = arg1;
        }
        int var17 = 0 % ((43 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)Llo;")
    public static final class114 method2384(int arg0, int arg1, int arg2) {
        if (class488.field7062[arg0][arg1][arg2] == null) {
            boolean var3 = class488.field7062[0][arg1][arg2] != null && class488.field7062[0][arg1][arg2].field1776 != null;
            if (var3 && arg0 >= class386.field5782 - 1) {
                return null;
            }
            class736.method4107(arg0, arg1, arg2);
        }
        return class488.field7062[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "(I)V")
    public static void method2385(int arg0) {
        if (arg0 == 12288) {
            field5677 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZLul;)V")
    public static final void method2386(int arg0, boolean arg1, class363 arg2) {
        class109.field1694.method868(false, arg2);
        ++field5680;
        if (arg1) {
            class472.method2875(class621.field8730, (byte) 115, class431.field6296, class518.field7495, class109.field1694, arg2);
        }
        if (arg0 != 1) {
            method2385(-100);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBI)V")
    private final void method2387(int arg0, int arg1, byte arg2, int arg3) {
        ++field5692;
        int var5 = ~arg0 >= ~arg1 ? arg1 : arg0;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = arg1 <= arg0 ? arg1 : arg0;
        int var8 = var7 > arg3 ? arg3 : var7;
        this.field5689 = (var6 + var8) / 2;
        if (arg2 != -20) {
            this.field5690 = 122;
        }
        int var9 = var6 - var8;
        if (this.field5689 > 0 && ~this.field5689 > -4097) {
            this.field5691 = (var9 << 12) / (~this.field5689 >= -2049 ? this.field5689 * 2 : 8192 - this.field5689 * 2);
        } else {
            this.field5691 = 0;
        }
        if (~var9 < -1) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg0 == ~var6) {
                this.field5693 = ~arg1 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg1 == var6) {
                this.field5693 = ~arg3 == ~var8 ? 4096 - -var10 : -var12 + 12288;
            } else {
                this.field5693 = arg0 == var8 ? var11 + 12288 : 20480 - var10;
            }
            this.field5693 /= 6;
        } else {
            this.field5693 = 0;
        }
    }
}
