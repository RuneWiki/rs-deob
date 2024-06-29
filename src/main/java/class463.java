import jaggl.OpenGL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class463 extends class753 implements class627 {

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    private int field6298;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    private int field6292;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field6303 = new String[200];

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6291 = new CRC32();

    @OriginalMember(owner = "client!io", name = "M", descriptor = "F")
    public static float field6305 = 0.25F;

    @OriginalMember(owner = "client!io", name = "P", descriptor = "Luca;")
    public static class540 field6308 = new class540();

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!io", name = "O", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IF)F", line = 3)
    public final float method2669(int arg0, float arg1) {
        ++field6300;
        if (arg0 != 31463) {
            field6307 = 63;
        }
        return arg1 / (float) this.field6298;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I", line = 14)
    public final int method2670(int arg0) {
        if (arg0 != -17271) {
            return -121;
        } else {
            ++field6306;
            return this.field6292;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([IIIIIIII)V", line = 25)
    public final void method2671(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6299;
        super.field10392.method3090(this, (byte) -106);
        if (arg2 != 9842) {
            field6303 = null;
        }
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Di(super.field10396, 0, arg3, arg1, arg7, arg6, 32993, super.field10392.field1590, arg0, arg5);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([BIIILul;IIII)V", line = 40)
    public final void method2672(byte[] arg0, int arg1, int arg2, int arg3, class599 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6296;
        super.field10392.method3090(this, (byte) 76);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field10396, 0, arg1, arg3, arg8, arg2, class298.method1917(arg5 + -32291, arg4), 5121, arg0, arg6);
        OpenGL.glPixelStorei(3314, 0);
        if (arg5 != 32216) {
            method2677(-84);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II[FLul;IIIIB)V", line = 57)
    public final void method2673(int arg0, int arg1, float[] arg2, class599 arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field6301;
        super.field10392.method3090(this, arg8);
        OpenGL.glPixelStorei(3314, arg4);
        OpenGL.glTexSubImage2Df(super.field10396, 0, arg0, arg5, arg7, arg1, class298.method1917(-113, arg3), 5121, arg2, arg6);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V", line = 70)
    public static void method2674(int arg0) {
        field6303 = null;
        if (arg0 == 5121) {
            field6308 = null;
            field6291 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(FB)F", line = 82)
    public final float method2675(float arg0, byte arg1) {
        ++field6294;
        return arg1 <= 92 ? 0.09455049F : arg0 / (float) this.field6292;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIZI[III)V", line = 93)
    public final void method2676(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6) {
        ++field6295;
        int[] var8 = new int[this.field6298 * this.field6292];
        super.field10392.method3090(this, (byte) -119);
        OpenGL.glGetTexImagei(super.field10396, 0, 32993, 5121, var8, 0);
        if (!arg2) {
            method2677(77);
        }
        for (int var9 = 0; ~arg6 < ~var9; ++var9) {
            class275.method1770(var8, (arg6 - (1 - arg0 + var9)) * this.field6292, arg4, arg1 * var9 + arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Loia;IIZ[III)V", line = 118)
    public class463(class97 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class530.field7176, class497.field6799, arg1 * arg2, arg3);
        this.field6298 = arg2;
        this.field6292 = arg1;
        super.field10392.method3090(this, (byte) 56);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method4177(arg4, arg1, super.field10396, arg2, 1);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field10396, 0, 6408, this.field6292, this.field6298, 0, 32993, super.field10392.field1590, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V", line = 138)
    public static final void method2677(int arg0) {
        ++field6297;
        int var1 = 32 % ((73 - arg0) / 43);
        int var2 = 0;
        if (~class111.field1911.field6749.method2258((byte) 85) == -2) {
            int var3 = var2 | 1;
            int var4 = var3 | 16;
            int var5 = var4 | 32;
            int var6 = var5 | 2;
            var2 = var6 | 4;
        }
        if (~class111.field1911.field6743.method3385((byte) 74) == -1) {
            var2 |= 64;
        }
        class187.method1383((byte) 86, var2);
        class414.field5670.method2318(21141, var2);
        class143.field2427.method1409(var2, 32);
        class495.field6783.method2000((byte) 113, var2);
        class707.field9727.method2145(var2, -99);
        class382.method2323((byte) 62, var2);
        class367.method2239(var2, -1424827508);
        class634.method3545(false, var2);
        class452.method2617(var2, (byte) -115);
        class234.method1579(-97);
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I", line = 179)
    public final int method2678(byte arg0) {
        if (arg0 != 31) {
            return -15;
        } else {
            ++field6304;
            return this.field6298;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Loia;Lul;IIZ[FII)V", line = 191)
    public class463(class97 arg0, class599 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class497.field6803, arg2 * arg3, arg4);
        this.field6292 = arg2;
        this.field6298 = arg3;
        super.field10392.method3090(this, (byte) 118);
        if (!arg4 && arg7 == 0 && ~arg6 == -1) {
            this.method4180(34836, arg3, arg5, arg2, super.field10396);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field10396, 0, this.method4178(6409), arg2, arg3, 0, class298.method1917(-125, super.field10382), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZZI)V", line = 211)
    public final void method2679(boolean arg0, boolean arg1, int arg2) {
        ++field6302;
        super.field10392.method3090(this, (byte) 78);
        if (arg2 == -17383) {
            OpenGL.glTexParameteri(super.field10396, 10242, arg1 ? 10497 : 33071);
            OpenGL.glTexParameteri(super.field10396, 10243, !arg0 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(B)Z", line = 224)
    public final boolean method2680(byte arg0) {
        ++field6293;
        if (arg0 <= 84) {
            field6308 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Loia;Lul;Lso;II)V", line = 238)
    public class463(class97 arg0, class599 arg1, class497 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field6292 = arg3;
        this.field6298 = arg4;
        super.field10392.method3090(this, (byte) -90);
        OpenGL.glTexImage2Dub(super.field10396, 0, this.method4178(6409), arg3, arg4, 0, class298.method1917(-125, super.field10382), class383.method2325(true, super.field10390), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Loia;Lul;IIZ[BII)V", line = 255)
    public class463(class97 arg0, class599 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class497.field6799, arg2 * arg3, arg4);
        this.field6292 = arg2;
        this.field6298 = arg3;
        super.field10392.method3090(this, (byte) -31);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method4176(arg5, arg2, super.field10396, arg3, false);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field10396, 0, this.method4178(6409), arg2, arg3, 0, class298.method1917(-104, super.field10382), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }
}
