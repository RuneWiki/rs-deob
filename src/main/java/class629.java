import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class629 extends class362 {

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
    private int field8738 = 10;

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "I")
    private int field8735 = 2048;

    @OriginalMember(owner = "client!kfa", name = "H", descriptor = "I")
    private int field8743 = 0;

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!kfa", name = "E", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!kfa", name = "I", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "[I")
    private int[] field8736;

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "[I")
    private int[] field8742;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lfca;II)V", line = 4)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field8737;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field8743 = arg0.method793((byte) 62);
                }
            } else {
                this.field8735 = arg0.method763(97);
            }
        } else {
            this.field8738 = arg0.method793((byte) 9);
        }
        if (arg2 != -1) {
            field8746 = -22;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V", line = 110)
    public class629() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 53)
    public final void method160(int arg0) {
        this.method3533((byte) -126);
        ++field8745;
        if (arg0 != -996226836) {
            this.method3533((byte) -48);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V", line = 64)
    private final void method3533(byte arg0) {
        ++field8740;
        int var2 = 0;
        this.field8742 = new int[this.field8738 - -1];
        this.field8736 = new int[this.field8738 - -1];
        int var3 = 4096 / this.field8738;
        if (arg0 <= -124) {
            int var4 = this.field8735 * var3 >> 12;
            for (int var5 = 0; ~var5 > ~this.field8738; ++var5) {
                this.field8742[var5] = var2;
                this.field8736[var5] = var2 + var4;
                var2 += var3;
            }
            this.field8742[this.field8738] = 4096;
            this.field8736[this.field8738] = this.field8736[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IBI)Z", line = 100)
    public static final boolean method3534(int arg0, byte arg1, int arg2) {
        ++field8739;
        int var3 = 74 / ((-30 - arg1) / 52);
        return (34 & arg0) != 0;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)[I", line = 118)
    public final int[] method156(int arg0, int arg1) {
        if (arg0 != -2026769311) {
            this.field8738 = 66;
        }
        ++field8744;
        int[] var3 = super.field4927.method808(-126, arg1);
        if (super.field4927.field1471) {
            int var4 = class135.field2287[arg1];
            if (~this.field8743 != -1) {
                for (int var5 = 0; ~class769.field10597 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class172.field2750[var5];
                    int var9 = this.field8743;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field8738 > var10; ++var10) {
                        if (~var6 <= ~this.field8742[var10] && this.field8742[var10 + 1] > var6) {
                            if (this.field8736[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field8738; ++var12) {
                    if (this.field8742[var12] <= var4 && ~this.field8742[var12 + 1] < ~var4) {
                        if (~var4 > ~this.field8736[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class275.method1772(var3, 0, class769.field10597, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 237)
    public static final void method3535(String arg0, int arg1, int arg2) {
        if (arg2 != -2309) {
            method3535((String) null, -26, -81);
        }
        ++field8741;
        class648.method3634(arg1, arg0, (byte) -13, "", "", 0, "");
    }
}
