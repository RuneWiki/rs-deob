import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class43 implements class444 {

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILlea;)V", line = 4)
    public static final void method325(int arg0, class573 arg1) {
        if (class769.field10621 == null) {
            class344 var2 = new class344();
            byte[] var3 = var2.method2106(16, 128, 128, (byte) 43);
            class769.field10621 = class381.method2301(var3, false, false);
        }
        field575++;
        if (class639.field9005 == null) {
            class16 var4 = new class16();
            byte[] var5 = var4.method173(128, (byte) -57, 16, 128);
            class639.field9005 = class381.method2301(var5, false, false);
        }
        class436 var6 = arg1.field8136;
        if (var6.method2604(arg0 + 3757) && class7.field92 == null) {
            byte[] var7 = class509.method2974(0.6F, 4.0F, arg0 + 3754, 16, 8, 16.0F, 128, 128, 4.0F, 0.5F, new class28(419684));
            class7.field92 = class381.method2301(var7, false, false);
        }
        if (arg0 != -3754) {
            method326(-23, 0.12456726F, (byte) 64, 76, null, 117, -73, 47, null, 8, -11);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IFBI[FIII[FII)V", line = 47)
    public static final void method326(int arg0, float arg1, byte arg2, int arg3, float[] arg4, int arg5, int arg6, int arg7, float[] arg8, int arg9, int arg10) {
        int var11 = arg5 - arg6;
        int var12 = arg7 - arg10;
        field576++;
        int var13 = arg3 - arg9;
        int var14 = -66 / ((-arg2 - 65) / 34);
        float var15 = arg8[2] * (float) var13 + arg8[1] * (float) var11 + arg8[0] * (float) var12;
        float var16 = arg8[5] * (float) var13 + arg8[4] * (float) var11 + arg8[3] * (float) var12;
        float var17 = arg8[8] * (float) var13 + arg8[6] * (float) var12 + arg8[7] * (float) var11;
        float var18 = (float) Math.sqrt((double) (var17 * var17 + var15 * var15 + var16 * var16));
        float var19 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        float var20 = (float) Math.asin((double) (var16 / var18)) / 3.1415927F + arg1 + 0.5F;
        if (arg0 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg0 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg0 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        arg4[0] = var19;
        arg4[1] = var20;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lhl;", line = 100)
    public final class353 method327(byte arg0) {
        field574++;
        if (arg0 < 51) {
            this.method327((byte) -92);
        }
        return class774.field10651;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(I)V", line = 110)
    public class43(int arg0) {
        this.field577 = arg0;
    }
}
