import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class338 extends class106 {

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Lpo;")
    private class389 field5095;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "Lsc;")
    private class229 field5089;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "[I")
    public static int[] field5094 = new int[50];

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "[I")
    public static int[] field5098 = new int[200];

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Lpi;")
    public static class342 field5084 = new class342("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IJBIZ)Ljava/lang/String;", line = 6)
    public static final String method2164(int arg0, long arg1, byte arg2, int arg3, boolean arg4) {
        ++field5088;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (~arg1 > -1L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; ~arg3 < ~var10; ++var10) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 + -((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        if (arg2 >= -57) {
            field5094 = null;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (48 - -var13 + -((int) arg1 * 10)));
            if (~arg1 == -1L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IBI)V", line = 86)
    public final void method347(int arg0, byte arg1, int arg2) {
        ++field5087;
        float var4 = (float) ((3 & arg0) + 1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 25) >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field1770.method1929(1, (byte) 110);
        boolean var7 = ~(128 & arg0) != -1;
        if (var7) {
            class41.field739[3] = 0.0F;
            class41.field739[1] = 0.0F;
            class41.field739[0] = var6;
            class41.field739[2] = 0.0F;
        } else {
            class41.field739[3] = 0.0F;
            class41.field739[0] = 0.0F;
            class41.field739[1] = 0.0F;
            class41.field739[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class41.field739, 0);
        class41.field739[3] = (float) super.field1770.field4490 * var4 % 1.0F;
        class41.field739[0] = 0.0F;
        class41.field739[1] = var6;
        class41.field739[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class41.field739, 0);
        if (!this.field5095.field5850) {
            int var8 = (int) ((float) super.field1770.field4490 * var5 * 16.0F);
            super.field1770.method1990(this.field5095.field5848[var8 % 16], 11864);
        } else {
            class41.field739[0] = 0.0F;
            class41.field739[2] = 0.0F;
            class41.field739[3] = (float) super.field1770.field4490 * var5 % 1.0F;
            class41.field739[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class41.field739, 0);
        }
        super.field1770.method1929(0, (byte) 78);
        if (arg1 != 43) {
            method2169(113, -22);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I", line = 142)
    public static final int method2165(int arg0, int arg1) {
        ++field5093;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg1 != 1006) {
            field5094 = null;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V", line = 162)
    public final void method343(boolean arg0, int arg1) {
        ++field5097;
        this.field5089.method1494('\u0000', false);
        if (this.field5095.field5850) {
            super.field1770.method1929(1, (byte) 117);
            super.field1770.method1990(this.field5095.field5857, 11864);
            super.field1770.method1929(0, (byte) 66);
        }
        if (arg1 != 1) {
            this.method347(96, (byte) 26, -34);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z", line = 180)
    public final boolean method348(int arg0) {
        if (arg0 != -22884) {
            return false;
        } else {
            ++field5096;
            return true;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 194)
    public final void method342(int arg0) {
        this.field5089.method1494('\u0001', false);
        if (arg0 != 3) {
            method2167((String) null, -27L, -13, 60, 28, false, (String) null, false, 56, 64, -107);
        }
        ++field5083;
        super.field1770.method1929(1, (byte) 121);
        super.field1770.method1990((class492) null, 11864);
        super.field1770.method1929(0, (byte) 93);
    }

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "(I)V", line = 209)
    public static void method2166(int arg0) {
        if (arg0 != -30221) {
            method2169(17, 8);
        }
        field5084 = null;
        field5098 = null;
        field5094 = null;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lvj;Lpo;)V", line = 222)
    public class338(class303 arg0, class389 arg1) {
        super(arg0);
        this.field5095 = arg1;
        this.field5089 = new class229(arg0, 2);
        this.field5089.method1495(0, (byte) -115);
        super.field1770.method1929(1, (byte) 89);
        if (this.field5095.field5850) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field1770.method1929(0, (byte) 83);
        this.field5089.method1493((byte) -101);
        this.field5089.method1495(1, (byte) -115);
        super.field1770.method1929(1, (byte) 112);
        if (this.field5095.field5850) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field1770.method1929(0, (byte) 76);
        this.field5089.method1493((byte) -97);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILih;)V", line = 256)
    public final void method346(int arg0, int arg1, class492 arg2) {
        ++field5086;
        super.field1770.method1990(arg2, 11864);
        if (arg0 != 128) {
            this.method348(90);
        }
        super.field1770.method1989(-24145, arg1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;JIIIZLjava/lang/String;ZIII)V", line = 269)
    public static final void method2167(String arg0, long arg1, int arg2, int arg3, int arg4, boolean arg5, String arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field5085;
        if (!class197.field2903 && class363.field5500 < 500) {
            if (arg3 == 1) {
                int var12 = arg2 == -1 ? class245.field3518 : arg2;
                class208 var13 = new class208(arg6, arg0, var12, arg10, arg9, arg1, arg8, arg4, arg5, arg7);
                class339.field5122.method2417(-121, var13);
                ++class363.field5500;
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZB)V", line = 290)
    public final void method344(boolean arg0, byte arg1) {
        ++field5090;
        if (arg1 < 102) {
            field5084 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V", line = 305)
    public static final void method2168(int arg0, int arg1, int arg2) {
        ++field5092;
        class54 var3 = class442.method2651(arg0, arg1, -13208);
        var3.method480(0);
        var3.field934 = arg2;
    }

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(II)Z", line = 320)
    public static final boolean method2169(int arg0, int arg1) {
        ++field5091;
        if (~arg0 != -6 && ~arg0 != -46 && arg0 != 21 && ~arg0 != -48 && arg0 != 1006) {
            if (arg1 != 46) {
                return false;
            } else {
                return arg0 == 60 || arg0 == 1011;
            }
        } else {
            return true;
        }
    }
}
