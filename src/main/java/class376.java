import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class376 extends class30 {

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    private int field5681 = -1;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Ljava/util/Random;")
    public static Random field5680 = new Random();

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "[I")
    public static int[] field5691 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "[[I")
    public static int[][] field5689 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field5686 = 0;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
    private int[] field5685;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "[[B")
    public static byte[][] field5690;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "[[B")
    public static byte[][] field5693;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V", line = 6)
    public static void method2399(boolean arg0) {
        field5689 = null;
        if (!arg0) {
            field5686 = -17;
        }
        field5680 = null;
        field5693 = null;
        field5691 = null;
        field5690 = null;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V", line = 24)
    public final void method207(byte arg0) {
        super.method207(arg0);
        ++field5682;
        this.field5685 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)I", line = 33)
    public final int method201(byte arg0) {
        if (arg0 >= -18) {
            this.method207((byte) 33);
        }
        ++field5692;
        return this.field5681;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 92)
    public class376() {
        super(0, false);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljg;II)V", line = 50)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field5688;
        if (arg2 == 0) {
            this.field5681 = arg0.method1272((byte) -106);
        }
        if (arg1 != 6456) {
            field5689 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V", line = 65)
    public final void method202(byte arg0, int arg1, int arg2) {
        ++field5687;
        super.method202(arg0, arg1, arg2);
        if (this.field5681 >= 0 && class111.field1545 != null) {
            int var4 = !class111.field1545.method989(this.field5681, (byte) 109).field4282 ? 128 : 64;
            this.field5685 = class111.field1545.method983(this.field5681, 1.0F, var4, false, -28113, var4);
            this.field5679 = var4;
            this.field5678 = var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLne;)Ljava/lang/String;", line = 107)
    public static final String method2400(byte arg0, class172 arg1) {
        if (arg0 != 79) {
            field5691 = null;
        }
        ++field5683;
        if (~client.method1149(arg1).method353(127) == -1) {
            return null;
        } else if (arg1.field2817 != null && arg1.field2817.trim().length() != 0) {
            return arg1.field2817;
        } else {
            return class80.field1000 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[[I", line = 132)
    public final int[][] method203(byte arg0, int arg1) {
        ++field5684;
        if (arg0 != -93) {
            this.method203((byte) -14, -30);
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int var4 = this.field5679 * (~class312.field4921 == ~this.field5678 ? arg1 : this.field5678 * arg1 / class312.field4921);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class369.field5610 == ~this.field5679) {
                for (int var8 = 0; class369.field5610 > var8; ++var8) {
                    int var9 = this.field5685[var4++];
                    var7[var8] = class37.method242(255, var9) << 4;
                    var6[var8] = class37.method242(var9 >> 4, 4080);
                    var5[var8] = class37.method242(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class369.field5610 > var10; ++var10) {
                    int var11 = this.field5679 * var10 / class369.field5610;
                    int var12 = this.field5685[var4 + var11];
                    var7[var10] = class37.method242(255, var12) << 4;
                    var6[var10] = class37.method242(4080, var12 >> 4);
                    var5[var10] = class37.method242(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }
}
