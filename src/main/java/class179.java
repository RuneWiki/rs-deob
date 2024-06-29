import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class179 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field2785 = -1;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1252(int arg0) {
        field2783++;
        if (class236.field3740) {
            return;
        }
        class58.field884 = true;
        if (class307.field5005) {
            class285.field4676 = (float) ((int) class285.field4676 - 17 & 0xFFFFFFF0);
        } else {
            class117.field1712 += (-12.0F - class117.field1712) / 2.0F;
        }
        class236.field3740 = true;
        if (arg0 != -29137) {
            field2787 = 81;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V", line = 45)
    public static final void method1253(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2788++;
        if (arg1 != -267496127) {
            method1254(-106, true, 53, 55);
        }
        int var5 = 0;
        class270.method1906(arg0, arg2 + arg4, arg2 - arg4, class306.field4998[arg3], 127);
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class306.field4998[arg3 + var6];
                int[] var10 = class306.field4998[arg3 - var6];
                int var11 = arg2 - var5;
                int var12 = arg2 + var5;
                class270.method1906(arg0, var12, var11, var9, arg1 ^ 0xF00E5535);
                class270.method1906(arg0, var12, var11, var10, 126);
            }
            int var13 = arg2 + var6;
            int[] var14 = class306.field4998[arg3 + var5];
            int var15 = arg2 - var6;
            int[] var16 = class306.field4998[arg3 - var5];
            class270.method1906(arg0, var13, var15, var14, 121);
            class270.method1906(arg0, var13, var15, var16, 124);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZII)I", line = 98)
    public static final int method1254(int arg0, boolean arg1, int arg2, int arg3) {
        field2784++;
        int var4 = class272.field4474[class67.method473(arg2, arg3)];
        if (arg0 > 0) {
            int var5 = class272.field4467.method412(103, arg0 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 <= 127) {
                    var6 = arg3 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) + ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) >> 8;
                }
            }
            int var9 = class272.field4467.method407(arg0 & 0xFFFF, (byte) 125);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = ((var10 & 0x2E00FF00) << 8) + (var12 >> 8) + (var11 & 0xFF00);
            }
        }
        if (arg1) {
            method1254(25, false, 61, -19);
        }
        return var4;
    }
}
