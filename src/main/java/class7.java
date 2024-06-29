import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class7 extends class210 {

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    private int field97 = 0;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    private int field94 = 0;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    private int field100 = 0;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
    public static boolean field101 = false;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lct;B)V", line = 10)
    public static final void method53(class104 arg0, byte arg1) {
        if (arg1 != 20) {
            method53((class104) null, (byte) 52);
        }
        class318.field4674 = arg0;
        ++field91;
        class417.field6023 = class318.field4674.method734(82, 19);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)V", line = 22)
    public static final void method54(int arg0, boolean arg1) {
        ++field105;
        if (!arg1) {
            field101 = true;
        }
        class125 var2 = class56.method428(arg0, 9, -3636);
        var2.method847(109);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V", line = 35)
    private final void method55(int arg0, int arg1, int arg2, int arg3) {
        ++field99;
        int var5 = 25 % ((arg0 - 6) / 54);
        int var6 = ~arg1 < -2049 ? arg2 - (arg1 * arg2 >> 12) + arg1 : (arg2 + 4096) * arg1 >> 12;
        if (var6 > 0) {
            int var7 = arg3 * 6;
            int var8 = arg1 + arg1 + -var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = -(var10 << 12) + var7;
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var6;
            if (var10 == 0) {
                this.field89 = var6;
                this.field98 = var8;
                this.field95 = var15;
                return;
            }
            if (~var10 == -2) {
                this.field95 = var6;
                this.field98 = var8;
                this.field89 = var16;
                return;
            }
            if (~var10 == -3) {
                this.field98 = var15;
                this.field95 = var6;
                this.field89 = var8;
                return;
            }
            if (~var10 == -4) {
                this.field95 = var16;
                this.field89 = var8;
                this.field98 = var6;
                return;
            }
            if (~var10 == -5) {
                this.field98 = var6;
                this.field89 = var15;
                this.field95 = var8;
                return;
            }
            if (~var10 == -6) {
                this.field89 = var6;
                this.field95 = var8;
                this.field98 = var16;
                return;
            }
        } else {
            this.field89 = this.field95 = this.field98 = arg1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 342)
    public class7() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILat;)V", line = 149)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            this.method59(38, -10, 40, 43);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field97 = (arg2.method1728((byte) 85) << 12) / 100;
                }
            } else {
                this.field94 = (arg2.method1728((byte) 83) << 12) / 100;
            }
        } else {
            this.field100 = arg2.method1747((byte) 12);
        }
        ++field103;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZIII)V", line = 193)
    public static final void method57(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field104;
        if (arg1) {
            if (~class372.field5437 != -1 && arg2 != 0 && ~class32.field447 > -51 && ~arg3 != 0) {
                class78.field985[class32.field447] = arg3;
                class265.field3933[class32.field447] = arg2;
                class146.field1979[class32.field447] = arg0;
                class411.field5901[class32.field447] = null;
                class226.field3389[class32.field447] = 0;
                class301.field4391[class32.field447] = arg4;
                ++class32.field447;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[[I", line = 217)
    public final int[][] method58(int arg0, int arg1) {
        ++field102;
        if (arg1 <= 94) {
            field101 = true;
        }
        int[][] var3 = super.field2967.method1572(127, arg0);
        if (super.field2967.field3454) {
            int[][] var4 = this.method1444(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class202.field2852; ++var11) {
                this.method59(2, var6[var11], var5[var11], var7[var11]);
                this.field96 += this.field94;
                this.field92 += this.field97;
                for (this.field90 += this.field100; this.field90 < 0; this.field90 += 4096) {
                }
                if (~this.field96 > -1) {
                    this.field96 = 0;
                }
                while (~this.field90 < -4097) {
                    this.field90 -= 4096;
                }
                if (this.field96 > 4096) {
                    this.field96 = 4096;
                }
                if (~this.field92 > -1) {
                    this.field92 = 0;
                }
                if (this.field92 > 4096) {
                    this.field92 = 4096;
                }
                this.method55(119, this.field92, this.field96, this.field90);
                var8[var11] = this.field89;
                var9[var11] = this.field95;
                var10[var11] = this.field98;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIII)V", line = 291)
    private final void method59(int arg0, int arg1, int arg2, int arg3) {
        ++field93;
        int var5 = ~arg1 > ~arg2 ? arg2 : arg1;
        int var6 = arg1 <= arg2 ? arg1 : arg2;
        int var7 = ~arg3 >= ~var5 ? var5 : arg3;
        int var8 = var6 <= arg3 ? var6 : arg3;
        int var9 = -var8 + var7;
        this.field92 = (var7 + var8) / arg0;
        if (~this.field92 < -1 && this.field92 < 4096) {
            this.field96 = (var9 << 12) / (~this.field92 < -2049 ? 8192 - this.field92 * 2 : this.field92 * 2);
        } else {
            this.field96 = 0;
        }
        if (var9 <= 0) {
            this.field90 = 0;
        } else {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (var7 - arg1 << 12) / var9;
            int var12 = (-arg3 + var7 << 12) / var9;
            if (~arg2 != ~var7) {
                if (~arg1 == ~var7) {
                    this.field90 = ~arg3 == ~var8 ? 4096 - -var10 : 12288 - var12;
                } else {
                    this.field90 = arg2 == var8 ? 12288 - -var11 : -var10 + 20480;
                }
            } else {
                this.field90 = arg1 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field90 /= 6;
        }
    }
}
