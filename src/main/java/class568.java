import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class568 extends class525 implements class628 {

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "Z")
    public static boolean field8385 = false;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public static int field8374 = 0;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field8379 = 0;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[Lha;")
    public static class53[] field8377;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3389(int arg0, String arg1) {
        class336.method2053("", "", 0, 55, 0, arg1);
        field8380++;
        int var2 = -48 / ((-arg0 - 47) / 54);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIILlp;I)Ljava/awt/Frame;")
    public static final Frame method3390(int arg0, int arg1, int arg2, int arg3, class331 arg4, int arg5) {
        field8384++;
        if (!arg4.method2005((byte) -100)) {
            return null;
        }
        if (arg0 == 0) {
            class142[] var6 = class106.method788(arg4, -24188);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2003 == arg2 && var6[var8].field1999 == arg5 && (arg1 == 0 || var6[var8].field1998 == arg1) && (!var7 || var6[var8].field1995 > arg0)) {
                    arg0 = var6[var8].field1995;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        int var9 = 72 % ((-arg3 - 5) / 57);
        class21 var10 = arg4.method2017(arg2, 78, arg5, arg0, arg1);
        while (var10.field202 == 0) {
            class236.method1513(true, 10L);
        }
        Frame var11 = (Frame) var10.field201;
        if (var11 == null) {
            return null;
        } else if (var10.field202 == 2) {
            class145.method993(var11, arg4, 0);
            return null;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lag;Z)V")
    public class568(class587 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIB)Z")
    public final boolean method1866(int arg0, int arg1, byte arg2) {
        super.method287(-83, arg0);
        field8375++;
        return arg2 >= -84 ? true : true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method282(int arg0, boolean arg1) {
        field8383++;
        return arg0 == -13803 ? super.method282(-13803, arg1) : null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(FFIIIIIF[FIIII)V")
    public static final void method3391(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float[] arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg4 - arg6;
        if (arg3 >= -106) {
            field8377 = null;
        }
        int var14 = arg11 - arg2;
        int var15 = arg5 - arg9;
        field8387++;
        float var16 = arg8[2] * (float) var14 + arg8[0] * (float) var13 + arg8[1] * (float) var15;
        float var17 = arg8[5] * (float) var14 + arg8[4] * (float) var15 + arg8[3] * (float) var13;
        float var18 = arg8[8] * (float) var14 + arg8[6] * (float) var13 + arg8[7] * (float) var15;
        float var19;
        float var20;
        if (arg12 == 0) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg7 + 0.5F - var18;
        } else if (arg12 == 1) {
            var19 = arg0 + var16 + 0.5F;
            var20 = arg7 + var18 + 0.5F;
        } else if (arg12 == 2) {
            var19 = arg0 + 0.5F - var16;
            var20 = arg1 + 0.5F - var17;
        } else if (arg12 == 3) {
            var20 = arg1 + 0.5F - var17;
            var19 = arg0 + var16 + 0.5F;
        } else if (arg12 == 4) {
            var19 = arg7 + var18 + 0.5F;
            var20 = arg1 + 0.5F - var17;
        } else {
            var19 = arg7 + 0.5F - var18;
            var20 = arg1 + 0.5F - var17;
        }
        if (arg10 == 1) {
            float var22 = var19;
            var19 = -var20;
            var20 = var22;
        } else if (arg10 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var21 = var19;
            var19 = var20;
            var20 = -var21;
        }
        class55.field648 = var19;
        class520.field7416 = var20;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lgba;I)V")
    public static final void method3392(class574 arg0, int arg1) {
        arg0.method3416(8);
        field8382++;
        int var2 = class183.field2758;
        class373 var3 = class541.field8119 = class293.field4036[var2] = new class373();
        var3.field1904 = var2;
        int var4 = arg0.method3417(30, (byte) -86);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field1957[0] = var6 - class473.field6687;
        var3.field8496 = (var3.field1957[0] << 7) + (var3.method940(-1) << 6);
        var3.field1955[0] = var7 - class38.field463;
        var3.field8500 = (var3.field1955[0] << 7) + (var3.method940(-1) << 6);
        class89.field1339 = var3.field8501 = var5;
        if (class110.field1568[var2] != null) {
            var3.method2229(-20966, class110.field1568[var2]);
        }
        class551.field8224 = 0;
        class314.field4332[class551.field8224++] = var2;
        class316.field4347[var2] = 0;
        class527.field7664 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method3417(18, (byte) -86);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFF1F) >> 8;
                int var12 = var9 & 0xFF;
                class115 var13 = class163.field2573[var8] = new class115();
                var13.field1612 = false;
                var13.field1616 = -1;
                var13.field1618 = 0;
                var13.field1622 = (var10 << 28) + (var11 << 14) + var12;
                class185.field2775[class527.field7664++] = var8;
                class316.field4347[var8] = 0;
            }
        }
        arg0.method3421(125);
        if (arg1 < 56) {
            method3389(75, null);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
    public final boolean method280(int arg0) {
        field8376++;
        return arg0 == 28596 ? this.method280(arg0) : false;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
    public final int method288(int arg0) {
        field8378++;
        if (arg0 != 247) {
            field8374 = 103;
        }
        return super.method288(247);
    }

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V")
    public static void method3393(int arg0) {
        field8377 = null;
        if (arg0 != 8) {
            field8377 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method1867(int arg0, int arg1, Source arg2, int arg3) {
        if (arg3 <= 52) {
            this.method281((byte) 83);
        }
        field8386++;
        super.method3093(arg2, (byte) -63, arg1);
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
    public final void method281(byte arg0) {
        field8381++;
        super.method281((byte) 99);
        if (arg0 <= 34) {
            method3390(-45, -59, 23, -119, null, -4);
        }
    }
}
