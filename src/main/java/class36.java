import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class36 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lbj;")
    public static class162 field544 = new class162(10, 0);

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 6)
    public static void method244(int arg0) {
        if (arg0 == -11168914) {
            field544 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(FIIF[FIIIIBI)V", line = 16)
    public static final void method245(float arg0, int arg1, int arg2, float arg3, float[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        int var11 = arg5 - arg7;
        int var12 = arg2 - arg1;
        field542++;
        int var13 = arg6 - arg8;
        float var14 = arg4[2] * (float) var12 + arg4[0] * (float) var11 + arg4[1] * (float) var13;
        float var15 = arg4[5] * (float) var12 + arg4[4] * (float) var13 + arg4[3] * (float) var11;
        float var16 = arg4[8] * (float) var12 + arg4[6] * (float) var11 + arg4[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != -105) {
            return;
        }
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg10 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg10 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg10 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class278.field4197 = var18;
        class484.field7127 = var17;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Z", line = 72)
    public static final boolean method246(int arg0, int arg1) {
        field546++;
        if (arg0 == -9) {
            return arg1 == 6 || arg1 == 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "([[BILh;)V", line = 83)
    public static final void method247(byte[][] arg0, int arg1, class474 arg2) {
        if (arg1 != 279141032) {
            return;
        }
        for (int var3 = 0; var3 < arg2.field1348; var3++) {
            class42.method255(-119);
            for (int var4 = 0; var4 < class339.field5099 >> 3; var4++) {
                for (int var5 = 0; var5 < class484.field7129 >> 3; var5++) {
                    int var6 = class162.field2598[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x373A563) >> 24;
                        if (!arg2.field1342 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFC) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class58.field1227.length; var12++) {
                                if (class58.field1227[var12] == var11 && arg0[var12] != null) {
                                    arg2.method2831((var10 & 0x7) * 8, arg0[var12], class262.field4006, (var9 & 0x7) * 8, var3, class67.field1367, 19178, var5 * 8, var7, var8, var4 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field543++;
    }
}
