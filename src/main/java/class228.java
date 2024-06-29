import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class228 extends class84 {

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    private int field3660 = 81;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    private int field3663 = 1024;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    private int field3652 = 1024;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    private int field3659 = 0;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    private int field3668 = 4;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    private int field3669 = 409;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    private int field3673 = 204;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
    private int field3670 = 8;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Ljava/lang/String;")
    public static String field3654 = "flash3:";

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public static int field3671 = 0;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field3657 = 100;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    private int field3656;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "[I")
    private int[] field3676;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "[[I")
    private int[][] field3666;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "[[I")
    private int[][] field3672;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        if (arg0) {
            this.field3652 = -66;
        }
        ++field3674;
        this.method1631((byte) 49);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZLjava/lang/StringBuffer;C)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1628(int arg0, boolean arg1, StringBuffer arg2, char arg3) {
        ++field3655;
        if (arg1) {
            field3657 = -49;
        }
        int var4 = arg2.length();
        arg2.setLength(arg0);
        for (int var5 = var4; ~var5 > ~arg0; ++var5) {
            arg2.setCharAt(var5, arg3);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field3667;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 > -125) {
            method1629(true, (class86) null, (class86) null, 74);
        }
        if (super.field1228.field3651) {
            int var4 = 0;
            int var5;
            for (var5 = class26.field301[arg1] - -this.field3659; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field3670 < ~var4 && var5 >= this.field3676[var4]) {
                ++var4;
            }
            boolean var6 = (var4 & 1) == 0;
            int var7 = this.field3676[var4];
            int var8 = var4 + -1;
            int var9 = this.field3676[var4 + -1];
            if (this.field3664 + var9 < var5 && ~var5 > ~(-this.field3664 + var7)) {
                for (int var10 = 0; ~class20.field221 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field3652 : this.field3652;
                    int var13;
                    for (var13 = (this.field3661 * var12 >> 12) + class184.field2967[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field3668 && var13 >= this.field3672[var8][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field3672[var8][var11];
                    int var16 = this.field3672[var8][var14];
                    if (var13 > this.field3664 + var16 && ~var13 > ~(-this.field3664 + var15)) {
                        var3[var10] = this.field3666[var8][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class158.method1180(var3, 0, class20.field221, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLlc;Llc;I)V")
    public static final void method1629(boolean arg0, class86 arg1, class86 arg2, int arg3) {
        class110.field1583 = arg0;
        class21.field245 = arg2;
        class242.field3868 = arg1;
        if (arg3 == 22911) {
            ++field3662;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        if (arg0 <= 42) {
            method1628(82, true, (StringBuffer) null, (char) 65523);
        }
        field3654 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    private final void method1631(byte arg0) {
        ++field3675;
        Random var2 = new Random((long) this.field3670);
        this.field3666 = new int[this.field3670][this.field3668];
        this.field3656 = 4096 / this.field3670;
        this.field3676 = new int[this.field3670 + 1];
        this.field3661 = 4096 / this.field3668;
        this.field3676[0] = 0;
        this.field3664 = this.field3660 / 2;
        this.field3672 = new int[this.field3670][this.field3668 + 1];
        int var3 = this.field3656 / 2;
        int var4 = this.field3661 / 2;
        int var5 = -63 % ((-3 - arg0) / 47);
        for (int var6 = 0; this.field3670 > var6; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field3656;
                int var8 = (-2048 + class145.method1041(var2, (byte) 127, 4096)) * this.field3673 >> 12;
                int var9 = (var3 * var8 >> 12) + var7;
                this.field3676[var6] = this.field3676[var6 + -1] + var9;
            }
            this.field3672[var6][0] = 0;
            for (int var10 = 0; var10 < this.field3668; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field3661;
                    int var12 = (class145.method1041(var2, (byte) 126, 4096) - 2048) * this.field3669 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field3672[var6][var10] = this.field3672[var6][var10 - 1] + var13;
                }
                this.field3666[var6][var10] = ~this.field3663 >= -1 ? 4096 : -class145.method1041(var2, (byte) 125, this.field3663) + 4096;
            }
            this.field3672[var6][this.field3668] = 4096;
        }
        this.field3676[this.field3670] = 4096;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        ++field3665;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field3663 = arg0.method1126(false);
                                    }
                                } else {
                                    this.field3660 = arg0.method1126(false);
                                }
                            } else {
                                this.field3659 = arg0.method1126(false);
                            }
                        } else {
                            this.field3652 = arg0.method1126(false);
                        }
                    } else {
                        this.field3673 = arg0.method1126(false);
                    }
                } else {
                    this.field3669 = arg0.method1126(false);
                }
            } else {
                this.field3670 = arg0.method1111(255);
            }
        } else {
            this.field3668 = arg0.method1111(255);
        }
        if (arg1 < 87) {
            this.method31((class152) null, (byte) 97, 31);
        }
    }
}
