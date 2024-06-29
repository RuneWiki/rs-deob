import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class146 extends class196 {

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field2429 = -32768;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[I")
    public static int[] field2425 = new int[1000];

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Ljh;")
    public static class259 field2428;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1101(byte arg0, int arg1) {
        class196.field3150[2] = (float) class276.method1923(arg1, 255) / 255.0F;
        field2424++;
        class196.field3150[0] = (float) (class276.method1923(arg1, 16771477) >> 16) / 255.0F;
        class196.field3150[1] = (float) (class276.method1923(arg1, 65430) >> 8) / 255.0F;
        class34.method292(17530, 3);
        class34.method292(17530, 4);
        if (arg0 >= -75) {
            method1102(-59);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 20)
    public static void method1102(int arg0) {
        field2425 = null;
        field2428 = null;
        if (arg0 != 0) {
            field2425 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 41)
    public final int method74() {
        field2430++;
        return this.field2429;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 52)
    public static final void method1103(int arg0) {
        int var1 = class110.field1921;
        field2422++;
        int var2 = class33.field663;
        if (arg0 != 0) {
            field2428 = (class259) null;
        }
        int var3 = class59.field1139 - class112.field1945 - var1;
        int var4 = class182.field2955 - class73.field1287 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class271.field4503 != null) {
                var5 = class271.field4503;
            } else if (class106.field1867 == null) {
                var5 = class275.field4573.field1876;
            } else {
                var5 = class106.field1867;
            }
            int var6 = 0;
            int var7 = 0;
            if (class106.field1867 == var5) {
                Insets var8 = class106.field1867.getInsets();
                var6 = var8.top;
                var7 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class182.field2955);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class59.field1139, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class59.field1139 + var7 - var3, var6, var3, class182.field2955);
            }
            if (var4 > 0) {
                var9.fillRect(var7, class182.field2955 + var6 - var4, class59.field1139, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIJ)V", line = 124)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2421++;
        class266 var11 = class165.method1243(-101, this.field2423).method1943(-18401, (class300) null, 0, this.field2427);
        if (var11 != null) {
            var11.method77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2429 = var11.method74();
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(DZ)V", line = 144)
    public static final void method1104(double arg0, boolean arg1) {
        if (class238.field3924 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class207.field3310[var3] = var4 <= 255 ? var4 : 255;
            }
            class238.field3924 = arg0;
        }
        if (!arg1) {
            field2426++;
        }
    }
}
