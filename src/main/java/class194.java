import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class194 extends class84 {

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    private int field3122 = 2048;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    private int field3125 = 10;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    private int field3118 = 0;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "Z")
    public static boolean field3128 = false;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "[I")
    private int[] field3119;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3124;
        if (arg1 <= 87) {
            method1441((byte) -64, -89);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3118 = arg0.method1111(255);
                }
            } else {
                this.field3122 = arg0.method1126(false);
            }
        } else {
            this.field3125 = arg0.method1111(255);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        ++field3121;
        this.method1439(2);
        if (arg0) {
            this.method1439(-9);
        }
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)V")
    private final void method1439(int arg0) {
        int var2 = 4096 / this.field3125;
        this.field3119 = new int[this.field3125 - -1];
        ++field3120;
        int var3 = 0;
        this.field3127 = new int[this.field3125 + 1];
        if (arg0 == 2) {
            int var4 = this.field3122 * var2 >> 12;
            for (int var5 = 0; ~var5 > ~this.field3125; ++var5) {
                this.field3127[var5] = var3;
                this.field3119[var5] = var3 - -var4;
                var3 += var2;
            }
            this.field3127[this.field3125] = 4096;
            this.field3119[this.field3125] = 4096 - -this.field3119[0];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
    public static final void method1440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -7) {
            field3128 = false;
        }
        for (int var5 = 0; class115.field1664 > var5; ++var5) {
            if (~(class10.field93[var5] - -class55.field783[var5]) < ~arg2 && ~class10.field93[var5] > ~(arg2 - -arg4) && ~arg1 > ~(class188.field3047[var5] + class138.field2240[var5]) && ~class188.field3047[var5] > ~(arg0 + arg1)) {
                class190.field3070[var5] = true;
            }
        }
        ++field3117;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)I")
    public static final int method1441(byte arg0, int arg1) {
        ++field3126;
        return arg0 >= -1 ? -76 : 255 & arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 >= -125) {
            this.field3127 = null;
        }
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = class26.field301[arg1];
            if (~this.field3118 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3125; ++var6) {
                    if (~var4 <= ~this.field3127[var6] && ~this.field3127[var6 + 1] < ~var4) {
                        if (var4 < this.field3119[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class158.method1180(var3, 0, class20.field221, var5);
            } else {
                for (int var7 = 0; var7 < class20.field221; ++var7) {
                    short var8 = 0;
                    int var9 = 0;
                    int var10 = class184.field2967[var7];
                    int var11 = this.field3118;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var9 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var9 = var10;
                    }
                    for (int var12 = 0; var12 < this.field3125; ++var12) {
                        if (var9 >= this.field3127[var12] && ~var9 > ~this.field3127[var12 + 1]) {
                            if (~var9 > ~this.field3119[var12]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var8;
                }
            }
        }
        ++field3123;
        return var3;
    }
}
