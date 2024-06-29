import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class387 extends class466 {

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "Lcba;")
    public static class471 field5193 = new class471(101, -1);

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "S")
    public static short field5195 = 32767;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field5194 = 0;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field5189;
        int[][] var3 = super.field6569.method828((byte) 43, arg0);
        if (arg1) {
            field5193 = null;
        }
        if (super.field6569.field1934) {
            int[][] var4 = this.method2719(0, arg0, 5);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class312.field4207; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field5191;
        int[] var3 = super.field6557.method565(arg0, arg1 + -24728);
        if (arg1 != 0) {
            field5193 = null;
        }
        if (super.field6557.field1163) {
            int[] var4 = this.method2721(0, arg0, arg1 ^ 2);
            for (int var5 = 0; ~class312.field4207 < ~var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
    public static final String method2264(boolean arg0, int[] arg1) {
        ++field5190;
        StringBuffer var2 = new StringBuffer();
        int var3 = class15.field204;
        if (!arg0) {
            method2266(41, false, 109);
        }
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            class81 var5 = class630.field9230.method2774(arg1[var4], 115);
            if (var5.field1314 != -1) {
                class52 var6 = (class52) class35.field674.method3252((long) var5.field1314, (byte) 36);
                if (var6 == null) {
                    class38 var7 = class38.method399(class645.field9371, var5.field1314, 0);
                    if (var7 != null) {
                        var6 = class69.field1165.method1332(var7, true);
                        class35.field674.method3243(var6, (long) var5.field1314, -90);
                    }
                }
                if (var6 != null) {
                    class160.field2344[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
    public static void method2265(int arg0) {
        field5193 = null;
        if (arg0 != 10352) {
            field5195 = -71;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class387() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            method2264(true, (int[]) null);
        }
        if (~arg2 == -1) {
            super.field6565 = arg0.method110((byte) 29) == 1;
        }
        ++field5192;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)I")
    public static final int method2266(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field5193 = null;
        }
        ++field5188;
        int var3 = arg2 - -(arg0 * 57);
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (133704883 & var5) >> 19;
    }
}
