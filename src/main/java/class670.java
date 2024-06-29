import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class670 implements class496 {

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "Ljava/lang/String;")
    private String field9384;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "Lae;")
    private class283 field9380;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "[F")
    public static float[] field9382 = new float[4];

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)V", line = 6)
    public static void method3824(byte arg0) {
        if (arg0 < -20) {
            field9382 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)Ljea;", line = 16)
    public final class248 method693(int arg0) {
        if (arg0 <= 103) {
            return null;
        } else {
            field9383++;
            return class248.field3691;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILsha;Lda;Lhw;IIILjava/lang/String;Laa;BI)V", line = 30)
    public static final void method3825(int arg0, int arg1, class115 arg2, class442 arg3, class300 arg4, int arg5, int arg6, int arg7, String arg8, class87 arg9, byte arg10, int arg11) {
        field9379++;
        int var12;
        if (class695.field9691 == 4) {
            var12 = (int) class702.field9790 & 0x3FFF;
        } else {
            var12 = (int) class702.field9790 + class703.field9795 & 0x3FFF;
        }
        int var13 = Math.max(arg2.field1560 / 2, arg2.field1517 / 2) + 10;
        int var14 = arg5 * arg5 + arg7 * arg7;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class448.field6265[var12];
        int var16 = class448.field6270[var12];
        if (class695.field9691 != 4) {
            var15 = var15 * 256 / (class686.field9577 + 256);
            var16 = var16 * 256 / (class686.field9577 + 256);
        }
        if (arg10 >= -63) {
            method3824((byte) 119);
        }
        int var17 = arg5 * var16 + arg7 * var15 >> 14;
        int var18 = arg7 * var16 - (arg5 * var15) >> 14;
        int var19 = arg4.method1957(0, 100, null, arg8);
        int var20 = var17 - var19 / 2;
        int var21 = arg4.method1954(false, arg8, 100, 0, null);
        if (var20 >= -arg2.field1560 && var20 <= arg2.field1560 && var18 >= -arg2.field1517 && arg2.field1517 >= var18) {
            arg3.method2643(arg0 + (arg2.field1517 / 2) - arg11 - var21 - var18, arg0, 0, arg2.field1560 / 2 + var20 + arg1, 1, var19, 50, null, arg8, arg6, (byte) -33, arg9, 0, 0, arg1, null);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method3826(boolean arg0) {
        field9381++;
        if (class661.field9305 != null) {
            return;
        }
        if (!arg0) {
            method3824((byte) -54);
        }
        int var1 = class339.field4915;
        int var2 = class424.field5890;
        int var3 = class20.field163 - class742.field10226 - var1;
        int var4 = class277.field3991 - class249.field3700 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class43.field453 != null) {
                var5 = class43.field453;
            } else if (class511.field7007 == null) {
                var5 = class785.field10774;
            } else {
                var5 = class511.field7007;
            }
            int var6 = 0;
            int var7 = 0;
            if (class43.field453 == var5) {
                Insets var8 = class43.field453.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class277.field3991);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class20.field163, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class20.field163 + var6 - var3, var7, var3, class277.field3991);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 - (var4 - class277.field3991), class20.field163, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)I", line = 153)
    public final int method690(byte arg0) {
        if (arg0 > -7) {
            this.field9380 = null;
        }
        field9378++;
        return this.field9380.method1859(0, this.field9384) ? 100 : 0;
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lae;Ljava/lang/String;)V", line = 168)
    public class670(class283 arg0, String arg1) {
        this.field9384 = arg1;
        this.field9380 = arg0;
    }
}
