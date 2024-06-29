import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class511 extends class739 {

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "[I")
    public static int[] field7194 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "[Lsl;")
    public static class461[] field7199 = new class461[2048];

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    public static int field7195 = 0;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lsl;II)V", line = 5)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            if (~arg1 == -1) {
                super.field10297 = ~arg0.method2600((byte) -126) == -2;
            }
            ++field7197;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZII)V", line = 23)
    public static final void method2984(String arg0, String arg1, boolean arg2, int arg3, int arg4) {
        class667.method3753(arg1, true, -1, arg3, arg0, arg2, true);
        if (arg4 < -20) {
            ++field7193;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V", line = 34)
    public class511() {
        super(3, false);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 38)
    public static void method2985(byte arg0) {
        field7199 = null;
        int var1 = 90 / ((arg0 - -18) / 52);
        field7194 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method215(int arg0, int arg1) {
        if (arg0 != -23347) {
            method2984((String) null, (String) null, false, -126, 24);
        }
        ++field7198;
        int[] var3 = super.field10311.method2116(arg1, (byte) 111);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-118, arg1, 0);
            int[] var5 = this.method4115(-118, arg1, 1);
            int[] var6 = this.method4115(-125, arg1, 2);
            for (int var7 = 0; ~var7 > ~class29.field523; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)[[I", line = 104)
    public final int[][] method223(byte arg0, int arg1) {
        ++field7196;
        if (arg0 <= 26) {
            field7195 = 123;
        }
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[] var4 = this.method4115(-124, arg1, 2);
            int[][] var5 = this.method4119(2, 0, arg1);
            int[][] var6 = this.method4119(2, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class29.field523; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }
}
