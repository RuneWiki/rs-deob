import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class427 extends class115 {

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    private int field6208 = 2048;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    private int field6211 = 3072;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    private int field6218 = 1024;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "Ljava/lang/String;")
    public static String field6213 = "white:";

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "[I")
    public static int[] field6214 = new int[14];

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "Ljava/lang/String;")
    public static String field6209 = "glow3:";

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method144(int arg0, int arg1) {
        ++field6216;
        int[][] var3 = super.field1342.method2530(arg0, (byte) 96);
        int var4 = 119 / ((arg1 - -80) / 45);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class218.field2979 > var12; ++var12) {
                var9[var12] = (var6[var12] * this.field6208 >> 12) + this.field6218;
                var10[var12] = (var7[var12] * this.field6208 >> 12) + this.field6218;
                var11[var12] = this.field6218 - -(var8[var12] * this.field6208 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILra;)V", line = 52)
    public static final void method2661(int arg0, class57 arg1) {
        ++field6217;
        class339.field5014 = arg1;
        class218.field2987 = class339.field5014.method352(arg0, (byte) -75);
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 62)
    public final void method140(int arg0) {
        ++field6212;
        if (arg0 == 0) {
            this.field6208 = -this.field6218 + this.field6211;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 73)
    public class427() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 84)
    public static void method2662(boolean arg0) {
        if (arg0) {
            field6213 = null;
            field6214 = null;
            field6209 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)[I", line = 109)
    public final int[] method57(int arg0, int arg1) {
        ++field6210;
        int[] var3 = super.field1340.method14(78, arg0);
        if (arg1 != 0) {
            this.method57(8, 70);
        }
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            for (int var5 = 0; ~class218.field2979 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field6208 >> 12) + this.field6218;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLbk;I)V", line = 150)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 < 83) {
            field6214 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1347 = ~arg1.method1342((byte) -126) == -2;
                }
            } else {
                this.field6211 = arg1.method1355(32136);
            }
        } else {
            this.field6218 = arg1.method1355(32136);
        }
        ++field6215;
    }
}
