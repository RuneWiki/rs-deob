import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class271 extends class56 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    private int field3194 = 4096;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
    private boolean field3198 = true;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "F")
    public static float field3192;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "[I")
    public static int[] field3197;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public static void method1597(int arg0) {
        int var1 = -28 / ((-64 - arg0) / 46);
        field3197 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field3193;
        if (arg0 >= -44) {
            this.method144((byte) -6, -87, (class403) null);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field3198 = arg2.method2396((byte) -105) == 1;
            }
        } else {
            this.field3194 = arg2.method2390((byte) 65);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public static final void method1598(int arg0, byte arg1) {
        ++field3196;
        class714 var2 = class350.method2072((long) arg0, 4, (byte) 115);
        var2.method4044((byte) -128);
        if (arg1 != -116) {
            field3195 = -41;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class271() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field3199;
        if (arg0 < 35) {
            field3197 = null;
        }
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[] var4 = this.method492(0, class75.field1037 & arg1 + -1, (byte) 115);
            int[] var5 = this.method492(0, arg1, (byte) 92);
            int[] var6 = this.method492(0, arg1 - -1 & class75.field1037, (byte) 74);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class642.field8759; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3194;
                int var12 = (var5[var10 + 1 & class446.field5990] + -var5[var10 + -1 & class446.field5990]) * this.field3194;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 + var15) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                }
                if (this.field3198) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }
}
