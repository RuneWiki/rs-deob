import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class656 extends class349 {

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "Z")
    private boolean field9266 = true;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "Z")
    private boolean field9268 = true;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 5)
    public class656() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I", line = 9)
    public final int[][] method9(int arg0, byte arg1) {
        ++field9267;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = -112 / ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[][] var5 = this.method2180(0, 62, !this.field9266 ? arg0 : class4.field38 - arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            if (!this.field9268) {
                for (int var12 = 0; ~class39.field497 < ~var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; ~class39.field497 < ~var13; ++var13) {
                    var9[var13] = var6[-var13 + class144.field1839];
                    var10[var13] = var7[class144.field1839 - var13];
                    var11[var13] = var8[-var13 + class144.field1839];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILdga;)V", line = 76)
    public final void method5(int arg0, int arg1, class138 arg2) {
        ++field9264;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5100 = ~arg2.method957((byte) -101) == -2;
                }
            } else {
                this.field9266 = arg2.method957((byte) -125) == 1;
            }
        } else {
            this.field9268 = ~arg2.method957((byte) -128) == -2;
        }
        if (arg0 != 4095) {
            this.field9266 = false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(BI)[I", line = 122)
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -88 / ((arg0 - 56) / 41);
        ++field9265;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(0, -1090477337, !this.field9266 ? arg1 : class4.field38 - arg1);
            if (!this.field9268) {
                class657.method3636(var5, 0, var4, 0, class39.field497);
            } else {
                for (int var6 = 0; ~class39.field497 < ~var6; ++var6) {
                    var4[var6] = var5[class144.field1839 - var6];
                }
            }
        }
        return var4;
    }
}
