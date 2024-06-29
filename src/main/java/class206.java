import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class206 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public int field3154 = 0;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public int field3155 = 0;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public int field3166 = 2048;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public int field3164 = 2048;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3158 = "purple:";

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3165 = "Loading defaults - ";

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[Z")
    public static boolean[] field3159 = new boolean[8];

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3153++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class205.field3138 = -1;
            class335.field5220 = -1;
            return;
        }
        if (arg4 >= -9) {
            field3165 = (String) null;
        }
        int var8 = class328.method2291(class265.field4112, arg2, arg0, 117) - arg5;
        int var9 = class164.field2650[class193.field3015];
        int var10 = var8 - class7.field111;
        int var11 = arg0 - class190.field2976;
        int var12 = arg2 - class197.field3028;
        int var13 = class164.field2664[class193.field3015];
        int var14 = class164.field2650[class200.field3047];
        int var15 = class164.field2664[class200.field3047];
        int var16 = var12 * var14 + (var11 * var15) >> 16;
        int var17 = var12 * var15 - (var11 * var14) >> 16;
        int var19 = var10 * var13 - var9 * var17 >> 16;
        int var20 = var9 * var10 + var13 * var17 >> 16;
        if (var20 < 50) {
            class335.field5220 = -1;
            class205.field3138 = -1;
        } else if (class73.field1058) {
            int var22 = arg3 * 512 >> 8;
            int var23 = arg7 * 512 >> 8;
            class205.field3138 = var19 * var23 / var20 + arg6;
            class335.field5220 = var16 * var22 / var20 + arg1;
        } else {
            class335.field5220 = (var16 << 9) / var20 + arg1;
            class205.field3138 = (var19 << 9) / var20 + arg6;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILwm;)Lta;", line = 76)
    public static final class87 method1485(int arg0, class254 arg1) {
        if (arg0 == -1122712439) {
            field3160++;
            return new class87(arg1.method1768(65536), arg1.method1768(65536), arg1.method1768(65536), arg1.method1768(65536), arg1.method1758((byte) 59), arg1.method1758((byte) 77), arg1.method1774((byte) -126));
        } else {
            return (class87) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 90)
    public static void method1486(boolean arg0) {
        field3165 = null;
        field3159 = null;
        field3158 = null;
        if (arg0) {
            field3159 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLwm;II)V", line = 114)
    private final void method1487(byte arg0, class254 arg1, int arg2, int arg3) {
        field3163++;
        if (arg3 == 1) {
            this.field3155 = arg1.method1774((byte) -110);
        } else if (arg3 == 2) {
            this.field3164 = arg1.method1755(false);
        } else if (arg3 == 3) {
            this.field3166 = arg1.method1755(false);
        } else if (arg3 == 4) {
            this.field3154 = arg1.method1768(65536);
        }
        if (arg0 != 100) {
            method1485(-21, (class254) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILwm;)V", line = 142)
    public final void method1488(int arg0, int arg1, class254 arg2) {
        if (arg1 != 32118) {
            this.field3166 = 33;
        }
        field3157++;
        while (true) {
            int var4 = arg2.method1774((byte) -92);
            if (var4 == 0) {
                return;
            }
            this.method1487((byte) 100, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 168)
    public static final void method1489(int arg0) {
        if (arg0 != 25834) {
            method1489(74);
        }
        field3162++;
        int var1 = class176.field2818;
        int var2 = class135.field2052;
        int var3 = class242.field3687 - class215.field3300 - var2;
        int var4 = class312.field4843 - var1 - class151.field2281;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class170.field2747 != null) {
                var6 = class170.field2747;
            } else if (class254.field3878 == null) {
                var6 = class330.field5074.field95;
            } else {
                var6 = class254.field3878;
            }
            int var7 = 0;
            if (class254.field3878 == var6) {
                Insets var8 = class254.field3878.getInsets();
                var5 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var7, var1, class242.field3687);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var7, class312.field4843, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class312.field4843 + var5 - var4, var7, var4, class242.field3687);
            }
            if (var3 > 0) {
                var9.fillRect(var5, var7 + class242.field3687 - var3, class312.field4843, var3);
            }
        } catch (Exception var11) {
        }
    }
}
