import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class453 extends class349 {

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    private int field6180 = 4096;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    private int field6177 = 4096;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    private int field6184 = 4096;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field6186 = 0;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "Lim;")
    public static class675 field6179;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "[Z")
    public static boolean[] field6183;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(B)V", line = 4)
    public static void method2574(byte arg0) {
        if (arg0 <= 111) {
            method2576(3, -63);
        }
        field6183 = null;
        field6179 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V", line = 17)
    public class453() {
        super(1, false);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILdga;)V", line = 20)
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field6182;
        if (arg0 != 4095) {
            field6183 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field6180 = arg2.method922((byte) -113);
                }
            } else {
                this.field6177 = arg2.method922((byte) -116);
            }
        } else {
            this.field6184 = arg2.method922((byte) -115);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 66)
    public static final String method2575(String arg0, String arg1, String arg2, byte arg3) {
        ++field6178;
        if (arg3 != -21) {
            return null;
        } else {
            for (int var4 = arg2.indexOf(arg0); ~var4 != 0; var4 = arg2.indexOf(arg0, arg1.length() + var4)) {
                arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(arg0.length() + var4);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I", line = 85)
    public static final int method2576(int arg0, int arg1) {
        ++field6181;
        if (~arg1 == -16711936) {
            return -1;
        } else {
            if (arg0 <= 108) {
                field6179 = null;
            }
            return class349.method2183((byte) 116, arg1);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I", line = 104)
    public final int[][] method9(int arg0, byte arg1) {
        ++field6185;
        int var3 = 43 % ((-32 - arg1) / 47);
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 92, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class39.field497; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && var14 == var15) {
                    var9[var12] = this.field6184 * var13 >> 12;
                    var10[var12] = this.field6177 * var14 >> 12;
                    var11[var12] = this.field6180 * var15 >> 12;
                } else {
                    var9[var12] = this.field6184;
                    var10[var12] = this.field6177;
                    var11[var12] = this.field6180;
                }
            }
        }
        return var4;
    }
}
