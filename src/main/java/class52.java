import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class52 extends class139 {

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    private int field709 = 4;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    private int field716 = 4;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field714;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int var4 = class356.field5147 / this.field716;
            int var5 = class241.field3615 / this.field709;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method882(0, class241.field3615 * var6 / var5, 1);
            } else {
                var7 = this.method882(0, 0, 1);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class356.field5147; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class356.field5147 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        if (arg0 >= -67) {
            method335(-27);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method333(int arg0, int arg1, String arg2) {
        ++field715;
        return arg1 != -21872 ? -34 : class282.method1781(true, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field710;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field709 = arg0.method1701(-23121);
            }
        } else {
            this.field716 = arg0.method1701(-23121);
        }
        if (arg1 != -45) {
            this.field709 = 74;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)I")
    public static final int method334(int arg0, int arg1) {
        ++field711;
        return arg1 != 255 ? -45 : arg0 & 255;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field713;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            this.field709 = 111;
        }
        if (super.field1844.field5045) {
            int var4 = class356.field5147 / this.field716;
            int var5 = class241.field3615 / this.field709;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method879((byte) -29, class241.field3615 * var6 / var5, 0);
            } else {
                var7 = this.method879((byte) -29, 0, 0);
            }
            for (int var8 = 0; class356.field5147 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class356.field5147 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public static final void method335(int arg0) {
        if (arg0 != 0) {
            method334(38, 107);
        }
        for (class97 var1 = (class97) class460.field6451.method1449(113); var1 != null; var1 = (class97) class460.field6451.method1450(0)) {
            var1.method555();
        }
        ++field712;
    }
}
