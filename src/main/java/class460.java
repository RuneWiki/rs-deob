import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class460 extends class202 {

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    private int field7084 = 10;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "I")
    private int field7089 = 2048;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    private int field7090 = 0;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field7087 = -1;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "I")
    public static int field7096 = 100;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Ljava/util/Random;")
    public static Random field7086 = new Random();

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "I")
    public static int field7099 = -1;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "[Lms;")
    public static class34[] field7103 = new class34[2048];

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "Lbh;")
    public static class307 field7102;

    @OriginalMember(owner = "client!t", name = "W", descriptor = "[I")
    private int[] field7097;

    @OriginalMember(owner = "client!t", name = "X", descriptor = "[I")
    private int[] field7098;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    private final void method2889(byte arg0) {
        ++field7085;
        this.field7097 = new int[this.field7084 + 1];
        int var2 = 0;
        this.field7098 = new int[this.field7084 + 1];
        if (arg0 > -71) {
            this.method40((class208) null, (byte) -72, 14);
        }
        int var3 = 4096 / this.field7084;
        int var4 = this.field7089 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field7084; ++var5) {
            this.field7098[var5] = var2;
            this.field7097[var5] = var2 + var4;
            var2 += var3;
        }
        this.field7098[this.field7084] = 4096;
        this.field7097[this.field7084] = this.field7097[0] + 4096;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILza;)V")
    public static final void method2890(int arg0, class497 arg1) {
        ++field7093;
        if (class12.field121 != class358.field5565.field6419) {
            if (class217.field3699 != null) {
                if (arg0 == -1) {
                    if (class96.method653(arg1, arg0 ^ -122, class358.field5565.field6419)) {
                        class12.field121 = class358.field5565.field6419;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field7100;
        int var2 = -108 / ((arg0 - 80) / 46);
        this.method2889((byte) -97);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class460() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field7090 = arg0.method1445(60);
                }
            } else {
                this.field7089 = arg0.method1455(-3387);
            }
        } else {
            this.field7084 = arg0.method1445(82);
        }
        ++field7091;
        int var5 = -105 % ((arg1 - -46) / 50);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public static final void method2891(int arg0, int arg1, int arg2, int arg3) {
        ++field7094;
        if (~arg1 == -1) {
            ++class101.field1446;
            class81.method578((byte) 66, class241.field3918);
        }
        if (~arg1 == -2) {
            ++class405.field6113;
            class81.method578((byte) 66, class92.field1350);
        }
        class170.field2488.method1437(arg0 - -class126.field1718, arg2 ^ arg2);
        class170.field2488.method1437(class453.field7018 + arg3, 0);
        class170.field2488.method1479((byte) -116, !class36.field376.method927(82, -1234) ? 0 : 1);
        class535.field7842 = arg0;
        class454.field7026 = arg3;
        class253.field4100 = false;
        class304.method2051((byte) 109);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field7092;
        if (!arg1) {
            method2890(96, (class497) null);
        }
        int[] var3 = super.field3064.method2452((byte) 56, arg0);
        if (super.field3064.field5837) {
            int var4 = class521.field7716[arg0];
            if (this.field7090 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field7084; ++var6) {
                    if (~var4 <= ~this.field7098[var6] && ~this.field7098[var6 + 1] < ~var4) {
                        if (~this.field7097[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class324.method2167(var3, 0, class276.field4375, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class276.field4375; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class476.field7271[var7];
                    int var11 = this.field7090;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + var10 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field7084 < ~var12; ++var12) {
                        if (var8 >= this.field7098[var12] && this.field7098[var12 - -1] > var8) {
                            if (~this.field7097[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
    public static void method2892(int arg0) {
        field7102 = null;
        field7103 = null;
        field7086 = null;
        if (arg0 != 0) {
            method2891(25, 41, 35, -75);
        }
    }
}
