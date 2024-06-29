import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class325 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field4340 = -1;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Lhq;")
    public static class365 field4342;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
    public static int[] field4337;

    static {
        new class72((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field4342 = new class365(2);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZLbo;IB)V", line = 3)
    public static final void method2038(int arg0, int arg1, boolean arg2, class156 arg3, int arg4, byte arg5) {
        field4339++;
        if (class420.field5754 >= 50 || arg3 == null || arg3.field1818 == null || arg4 >= arg3.field1818.length || arg3.field1818[arg4] == null) {
            return;
        }
        int var6 = arg3.field1818[arg4][0];
        if (arg5 != -100) {
            field4337 = null;
        }
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xED) >> 5;
        int var9 = var6 & 0x1F;
        if (arg3.field1818[arg4].length > 1) {
            int var10 = (int) ((double) arg3.field1818[arg4].length * Math.random());
            if (var10 > 0) {
                var7 = arg3.field1818[arg4][var10];
            }
        }
        if (var9 == 0) {
            if (arg2) {
                class390.method2424(var8, var7, 255, 0, -1);
            }
        } else if (class330.field4500 != 0) {
            class107.field1286[class420.field5754] = var7;
            class195.field2317[class420.field5754] = var8;
            class30.field329[class420.field5754] = 0;
            class92.field1074[class420.field5754] = null;
            class330.field4504[class420.field5754] = 255;
            int var11 = (arg0 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            class186.field2158[class420.field5754] = (var11 << 16) + (var12 << 8) + var9;
            class420.field5754++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([B[[B[[B[III[II)I", line = 72)
    public static final int method2039(byte[] arg0, byte[][] arg1, byte[][] arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
        field4334++;
        int var8 = arg3[arg5];
        int var9 = arg6[arg5] + var8;
        int var10 = arg3[arg7];
        int var11 = arg6[arg7] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg5] & 0xFF;
        if ((arg4 & arg0[arg7]) < var14) {
            var14 = arg0[arg7] & 0xFF;
        }
        byte[] var15 = arg1[arg5];
        byte[] var16 = arg2[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z", line = 126)
    public static final boolean method2040(int arg0) {
        field4338++;
        if (class314.field4219) {
            try {
                if ((Boolean) class443.method2743(class401.field5525.field6077, -24425, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -1860952312) {
            field4340 = -1;
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 146)
    public static void method2041(int arg0) {
        if (arg0 <= 86) {
            method2038(-123, -40, false, (class156) null, -107, (byte) 107);
        }
        field4342 = null;
        field4337 = null;
    }
}
