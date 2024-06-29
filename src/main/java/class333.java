import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class333 extends class690 {

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "Lpea;")
    private class641 field4867;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Lcn;")
    private class322 field4861;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "[[Z")
    public static boolean[][] field4857 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lsaa;")
    public static class507 field4859 = new class507("LIVE", 0);

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "[[S")
    public static short[][] field4860;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 3)
    public static void method2126(int arg0) {
        field4860 = null;
        field4859 = null;
        if (arg0 >= 11) {
            field4857 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IFFFIIIIFLue;F[BI)V", line = 15)
    public static final void method2127(int arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float arg8, class531 arg9, float arg10, byte[] arg11, int arg12) {
        field4864++;
        if (arg6 != 1) {
            field4860 = null;
        }
        for (int var13 = 0; var13 < arg4; var13++) {
            class525.method2993(var13, arg7, arg0, 31664, arg1, arg12, arg3, arg8, arg9, arg5, arg10, arg2, arg4, arg11);
            arg7 += arg0 * arg12;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lcn;ILcn;F)Z", line = 35)
    public final boolean method2128(class322 arg0, int arg1, class322 arg2, float arg3) {
        field4866++;
        boolean var5 = true;
        class120 var6 = this.field4867.field9003;
        this.field4867.method1910(class377.field5413);
        this.field4867.method1984();
        this.field4867.method3566((byte) -68);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4861.field4716, this.field4861.field4716);
        this.field4867.method3569(false, -32);
        this.field4867.method3520((byte) 77, false);
        this.field4867.method3485((byte) -93, false);
        this.field4867.method3505(-783, false);
        this.field4867.method3530(-2, -110);
        this.field4867.method3488(1, (byte) 23);
        this.field4867.method3515(0.0F, -976, 0.0F, arg3, 0.0F);
        this.field4867.method3499(34165, 34161, 34165);
        if (arg1 <= 64) {
            return true;
        }
        this.field4867.method3553((byte) -121, arg2);
        this.field4867.method3488(0, (byte) 23);
        this.field4867.method3524(1, 14);
        this.field4867.method3553((byte) 118, arg0);
        this.field4867.method3541(var6, (byte) -13);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method729(var8, this.field4861, 0, 1201);
            var6.method734(0, (byte) 86);
            if (!var6.method737(100)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method738(-125, 0);
        this.field4867.method3522(var6, -14);
        this.field4867.method3488(1, (byte) 23);
        this.field4867.method3553((byte) 16, null);
        this.field4867.method3499(8448, 34161, 8448);
        this.field4867.method3488(0, (byte) 23);
        this.field4867.method3553((byte) -88, null);
        OpenGL.glPopAttrib();
        this.field4867.method1908(class377.field5413[0], class377.field5413[1], class377.field5413[2], class377.field5413[3]);
        if (var5 && !this.field4867.field9044) {
            this.field4861.method1595((byte) -99);
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)Lcn;", line = 237)
    public final class322 method1328(int arg0) {
        int var2 = -34 / ((-arg0 - 43) / 54);
        field4856++;
        return this.field4861;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)I", line = 247)
    public static final int method2129(int arg0) {
        if (arg0 == 33985) {
            field4862++;
            return class563.field7699;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)I", line = 260)
    public final int method2130(byte arg0) {
        if (arg0 == 22) {
            field4863++;
            return this.field4861.field4716;
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIILha;)V", line = 275)
    public static final void method2131(int arg0, int arg1, int arg2, int arg3, int arg4, class9 arg5) {
        field4858++;
        if (arg5.field83 == -1 && arg5.field79 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 < 23) {
            method2126(-111);
        }
        int var7 = class72.field935.field6526 * arg5.field90 >> 8;
        if (arg3 > arg5.field100) {
            var6 += arg3 - arg5.field100;
        } else if (arg5.field89 > arg3) {
            var6 += arg5.field89 - arg3;
        }
        if (arg2 > arg5.field94) {
            var6 += arg2 - arg5.field94;
        } else if (arg5.field102 > arg2) {
            var6 += arg5.field102 - arg2;
        }
        if (arg5.field86 == 0 || var6 - 256 > arg5.field86 || class72.field935.field6526 == 0 || arg5.field105 != arg0) {
            if (arg5.field106 != null) {
                class285.field3866.method3203(arg5.field106);
                arg5.field93 = null;
                arg5.field106 = null;
                arg5.field88 = null;
            }
            if (arg5.field82 != null) {
                class285.field3866.method3203(arg5.field82);
                arg5.field82 = null;
                arg5.field85 = null;
                arg5.field75 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg5.field86 - var6) * var7 / arg5.field86;
        if (arg5.field106 != null) {
            arg5.field106.method2726(var8);
        } else if (arg5.field83 >= 0) {
            if (arg5.field101) {
                if (arg5.field88 == null) {
                    arg5.field88 = class513.method2902(class16.field132, arg5.field83);
                }
                if (arg5.field88 != null) {
                    if (arg5.field93 == null) {
                        arg5.field93 = arg5.field88.method2905(new int[] { 22050 });
                    }
                    if (arg5.field93 != null) {
                        class491 var9 = class491.method2730(arg5.field93, 100, var8);
                        var9.method2760(-1);
                        class285.field3866.method3204(var9);
                        arg5.field106 = var9;
                    }
                }
            } else {
                class586 var10 = class586.method3280(class589.field8086, arg5.field83, 0);
                if (var10 != null) {
                    class53 var11 = var10.method3279().method302(class606.field8277);
                    class491 var12 = class491.method2730(var11, 100, var8);
                    var12.method2760(-1);
                    class285.field3866.method3204(var12);
                    arg5.field106 = var12;
                }
            }
        }
        if (arg5.field82 != null) {
            arg5.field82.method2726(var8);
            if (!arg5.field82.method174(64)) {
                arg5.field75 = null;
                arg5.field85 = null;
                arg5.field82 = null;
            }
        } else if (arg5.field79 != null && (arg5.field96 -= arg4) <= 0) {
            if (!arg5.field73) {
                int var13 = (int) (Math.random() * (double) arg5.field79.length);
                class586 var14 = class586.method3280(class589.field8086, arg5.field79[var13], 0);
                if (var14 != null) {
                    class53 var15 = var14.method3279().method302(class606.field8277);
                    class491 var16 = class491.method2730(var15, 100, var8);
                    var16.method2760(0);
                    class285.field3866.method3204(var16);
                    arg5.field82 = var16;
                    arg5.field96 = (int) (Math.random() * (double) (arg5.field91 - arg5.field99)) + arg5.field99;
                    return;
                }
                return;
            }
            if (arg5.field75 == null) {
                int var17 = (int) ((double) arg5.field79.length * Math.random());
                arg5.field75 = class513.method2902(class16.field132, arg5.field79[var17]);
            }
            if (arg5.field75 != null) {
                if (arg5.field85 == null) {
                    arg5.field85 = arg5.field75.method2905(new int[] { 22050 });
                }
                if (arg5.field85 != null) {
                    class491 var18 = class491.method2730(arg5.field85, 100, var8);
                    var18.method2760(0);
                    class285.field3866.method3204(var18);
                    arg5.field96 = (int) ((double) (arg5.field91 - arg5.field99) * Math.random()) + arg5.field99;
                    arg5.field82 = var18;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lpea;I)V", line = 478)
    public class333(class641 arg0, int arg1) {
        this.field4867 = arg0;
        this.field4861 = new class322(arg0, 6408, arg1);
    }
}
