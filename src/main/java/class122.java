import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class122 extends class111 {

    @OriginalMember(owner = "client!laa", name = "Wh", descriptor = "Lro;")
    private class2 field2009 = new class2();

    @OriginalMember(owner = "client!laa", name = "li", descriptor = "Lro;")
    private class2 field2024 = new class2();

    @OriginalMember(owner = "client!laa", name = "oi", descriptor = "Lro;")
    private class2 field2027 = new class2();

    @OriginalMember(owner = "client!laa", name = "ti", descriptor = "Lro;")
    private class2 field2032 = new class2();

    @OriginalMember(owner = "client!laa", name = "ui", descriptor = "Lro;")
    private class2 field2033 = new class2();

    @OriginalMember(owner = "client!laa", name = "vi", descriptor = "Lro;")
    private class2 field2034 = new class2();

    @OriginalMember(owner = "client!laa", name = "wi", descriptor = "Lro;")
    private class2 field2035 = new class2();

    @OriginalMember(owner = "client!laa", name = "Ai", descriptor = "[Lgt;")
    private class459[] field2039 = new class459[16];

    @OriginalMember(owner = "client!laa", name = "yi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2037 = new MapBuffer();

    @OriginalMember(owner = "client!laa", name = "Gi", descriptor = "Ljaggl/MapBuffer;")
    public MapBuffer field2045 = new MapBuffer();

    @OriginalMember(owner = "client!laa", name = "Ri", descriptor = "I")
    private int field2056 = 0;

    @OriginalMember(owner = "client!laa", name = "Sg", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1953;

    @OriginalMember(owner = "client!laa", name = "Si", descriptor = "Ljava/lang/String;")
    private String field2057;

    @OriginalMember(owner = "client!laa", name = "Ni", descriptor = "Ljava/lang/String;")
    private String field2052;

    @OriginalMember(owner = "client!laa", name = "Li", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!laa", name = "Ii", descriptor = "Z")
    public boolean field2047;

    @OriginalMember(owner = "client!laa", name = "Qi", descriptor = "Z")
    private boolean field2055;

    @OriginalMember(owner = "client!laa", name = "Oi", descriptor = "Z")
    private boolean field2053;

    @OriginalMember(owner = "client!laa", name = "Mi", descriptor = "Z")
    public boolean field2051;

    @OriginalMember(owner = "client!laa", name = "Ki", descriptor = "Z")
    public boolean field2049;

    @OriginalMember(owner = "client!laa", name = "Ji", descriptor = "Z")
    public boolean field2048;

    @OriginalMember(owner = "client!laa", name = "Pi", descriptor = "[I")
    public int[] field2054;

    @OriginalMember(owner = "client!laa", name = "Hi", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!laa", name = "Jh", descriptor = "Z")
    public static boolean field1996 = false;

    @OriginalMember(owner = "client!laa", name = "Sh", descriptor = "Z")
    public static boolean field2005 = false;

    @OriginalMember(owner = "client!laa", name = "Gg", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!laa", name = "Hg", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!laa", name = "Ig", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!laa", name = "Jg", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!laa", name = "Kg", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!laa", name = "Lg", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!laa", name = "Mg", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!laa", name = "Ng", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!laa", name = "Og", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!laa", name = "Pg", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!laa", name = "Qg", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!laa", name = "Rg", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!laa", name = "Tg", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!laa", name = "Ug", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!laa", name = "Vg", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!laa", name = "Wg", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!laa", name = "Xg", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!laa", name = "Yg", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!laa", name = "Zg", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!laa", name = "ah", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!laa", name = "bh", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!laa", name = "ch", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!laa", name = "dh", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!laa", name = "eh", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!laa", name = "fh", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!laa", name = "gh", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!laa", name = "hh", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!laa", name = "ih", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!laa", name = "jh", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!laa", name = "kh", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!laa", name = "lh", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!laa", name = "mh", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!laa", name = "nh", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!laa", name = "oh", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!laa", name = "ph", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!laa", name = "qh", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!laa", name = "rh", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!laa", name = "sh", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!laa", name = "th", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!laa", name = "uh", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!laa", name = "vh", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!laa", name = "wh", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!laa", name = "xh", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!laa", name = "yh", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!laa", name = "zh", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!laa", name = "Ah", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!laa", name = "Bh", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!laa", name = "Ch", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!laa", name = "Dh", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!laa", name = "Eh", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!laa", name = "Fh", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!laa", name = "Gh", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!laa", name = "Hh", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!laa", name = "Ih", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!laa", name = "Kh", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!laa", name = "Lh", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!laa", name = "Mh", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!laa", name = "Nh", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!laa", name = "Oh", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!laa", name = "Ph", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!laa", name = "Qh", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!laa", name = "Rh", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!laa", name = "Th", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!laa", name = "Uh", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!laa", name = "Vh", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!laa", name = "Xh", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!laa", name = "Yh", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!laa", name = "Zh", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!laa", name = "ai", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!laa", name = "bi", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!laa", name = "ci", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!laa", name = "di", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!laa", name = "ei", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!laa", name = "fi", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!laa", name = "gi", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!laa", name = "hi", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!laa", name = "ii", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!laa", name = "ji", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!laa", name = "ki", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!laa", name = "mi", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!laa", name = "ni", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!laa", name = "pi", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!laa", name = "qi", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!laa", name = "ri", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!laa", name = "si", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!laa", name = "Fi", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!laa", name = "Ei", descriptor = "J")
    private long field2043;

    @OriginalMember(owner = "client!laa", name = "xi", descriptor = "Z")
    private boolean field2036;

    @OriginalMember(owner = "client!laa", name = "zi", descriptor = "Z")
    private boolean field2038;

    @OriginalMember(owner = "client!laa", name = "Bi", descriptor = "Z")
    private boolean field2040;

    @OriginalMember(owner = "client!laa", name = "Ci", descriptor = "Z")
    private boolean field2041;

    @OriginalMember(owner = "client!laa", name = "Di", descriptor = "Z")
    private boolean field2042;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "()Z")
    public final boolean method459() {
        ++field1946;
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lns;Lqda;I)Z")
    public final boolean method938(class408 arg0, class105 arg1, int arg2) {
        if (arg2 != 14) {
            this.field2036 = true;
        }
        ++field1966;
        return true;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(III)V")
    public final synchronized void method978(int arg0, int arg1, int arg2) {
        ++field1997;
        class651 var4 = new class651(arg1);
        if (arg0 != 16384) {
            this.method834((byte) 114);
        }
        var4.field8680 = (long) arg2;
        this.field2027.method11(var4, -123);
    }

    @OriginalMember(owner = "client!laa", name = "ya", descriptor = "()V")
    public final void method454() {
        this.method844((byte) 36, true);
        ++field1952;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(IIIID)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field1957;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public final void method822(Canvas arg0, int arg1, Object arg2) {
        if (arg1 != -1) {
            this.field2052 = null;
        }
        ++field1947;
        Long var4 = (Long) arg2;
        if (!this.field1953.setSurface(var4)) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILns;Lqda;)Z")
    public final boolean method827(int arg0, class408 arg1, class105 arg2) {
        if (arg0 != -3119) {
            this.method396();
        }
        ++field1956;
        return true;
    }

    @OriginalMember(owner = "client!laa", name = "na", descriptor = "(IIII)[I")
    public final int[] method473(int arg0, int arg1, int arg2, int arg3) {
        ++field1955;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, super.field1528 - var6 - 1 + -arg1, arg2, 1, 32993, this.field2046, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)V")
    public final void method848(byte arg0) {
        ++field2011;
        class281.field3985[0] = (float) class48.method346(super.field1776, 16711680) / 1.671168E7F;
        class281.field3985[3] = (float) (super.field1776 >>> 24) / 255.0F;
        class281.field3985[1] = (float) class48.method346(65280, super.field1776) / 65280.0F;
        class281.field3985[2] = (float) class48.method346(super.field1776, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class281.field3985, 0);
        if (arg0 > -91) {
            this.method891((byte) 92);
        }
    }

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "(I)V")
    public final void method907(int arg0) {
        for (int var2 = super.field1808 - 1; ~var2 <= -1; --var2) {
            OpenGL.glActiveTexture(var2 + 33984);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            OpenGL.glTexEnvi(8960, 34161, 8448);
            OpenGL.glTexEnvi(8960, 34178, 34166);
            OpenGL.glTexEnvi(8960, 34162, 8448);
            OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        ++field1951;
        OpenGL.glTexEnvi(8960, 34186, 34168);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        if (arg0 <= 77) {
            field2005 = false;
        }
        OpenGL.glAlphaFunc(516, 0.0F);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field1953.setSwapInterval(0);
        super.method907(89);
    }

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "(I)V")
    public final synchronized void method501(int arg0) {
        ++field1974;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field2024.method17(false)) {
            class651 var12 = (class651) this.field2024.method10(false);
            class314.field4490[var3++] = (int) var12.field8680;
            super.field1715 -= var12.field8636;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class314.field4490, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class314.field4490, 0);
            var3 = 0;
        }
        while (!this.field2027.method17(false)) {
            class651 var11 = (class651) this.field2027.method10(false);
            class314.field4490[var3++] = (int) var11.field8680;
            super.field1712 -= var11.field8636;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class314.field4490, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class314.field4490, 0);
            var3 = 0;
        }
        while (!this.field2032.method17(false)) {
            class651 var10 = (class651) this.field2032.method10(false);
            class314.field4490[var3++] = var10.field8636;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class314.field4490, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class314.field4490, 0);
            var3 = 0;
        }
        while (!this.field2033.method17(false)) {
            class651 var9 = (class651) this.field2033.method10(false);
            class314.field4490[var3++] = (int) var9.field8680;
            super.field1711 -= var9.field8636;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class314.field4490, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class314.field4490, 0);
            boolean var4 = false;
        }
        while (!this.field2009.method17(false)) {
            class651 var8 = (class651) this.field2009.method10(false);
            OpenGL.glDeleteLists((int) var8.field8680, var8.field8636);
        }
        while (!this.field2034.method17(false)) {
            class656 var7 = this.field2034.method10(false);
            OpenGL.glDeleteProgramARB((int) var7.field8680);
        }
        while (!this.field2035.method17(false)) {
            class656 var6 = this.field2035.method10(false);
            OpenGL.glDeleteObjectARB(var6.field8680);
        }
        while (!this.field2009.method17(false)) {
            class651 var5 = (class651) this.field2009.method10(false);
            OpenGL.glDeleteLists((int) var5.field8680, var5.field8636);
        }
        if (this.method488() > 100663296 && class375.method2193(116) > this.field2043 + 60000L) {
            System.gc();
            this.field2043 = class375.method2193(116);
        }
        super.method501(var2);
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "()V")
    public final void method511() {
        ++field1999;
    }

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "(I)V")
    public final void method837(int arg0) {
        if (super.field1783) {
            OpenGL.glEnable(2929);
        } else {
            OpenGL.glDisable(2929);
        }
        ++field1973;
        if (arg0 != 5481) {
            this.field2027 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(II)Lmj;")
    public final class655 method417(int arg0, int arg1) {
        ++field1967;
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "(Z)V")
    public final void method943(boolean arg0) {
        ++field1998;
        if (!arg0) {
            this.method403(0.59782726F, 0.6627364F, -0.16631359F);
        }
        this.method982(false);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public final void method456(boolean arg0) {
        ++field2023;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method446(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class149 {
        ++field1985;
        this.method465(arg2, arg3);
    }

    @OriginalMember(owner = "client!laa", name = "Y", descriptor = "(I)V")
    public final void method935(int arg0) {
        ++field1964;
        super.field1762 = (float) (-super.field1795 + super.field1736);
        super.field1743 = (float) (-super.field1730) + super.field1762;
        if ((float) super.field1745 > super.field1743) {
            super.field1743 = (float) super.field1745;
        }
        OpenGL.glFogf(2915, super.field1743);
        if (arg0 != 16) {
            this.field2033 = null;
        }
        OpenGL.glFogf(2916, super.field1762);
        class281.field3985[0] = (float) class48.method346(super.field1786, 16711680) / 1.671168E7F;
        class281.field3985[1] = (float) class48.method346(65280, super.field1786) / 65280.0F;
        class281.field3985[2] = (float) class48.method346(super.field1786, 255) / 255.0F;
        OpenGL.glFogfv(2918, class281.field3985, 0);
    }

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "(I)V")
    public final void method920(int arg0) {
        ++field2014;
        int var2 = -33 % ((-51 - arg0) / 62);
        if (super.field1848) {
            OpenGL.glEnable(3089);
        } else {
            OpenGL.glDisable(3089);
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(ZI)V")
    public final void method894(boolean arg0, int arg1) {
        if (arg0) {
            OpenGL.glEnable(32925);
        } else {
            OpenGL.glDisable(32925);
        }
        ++field1980;
        if (arg1 > -115) {
            this.method459();
        }
    }

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "(II)V")
    public final void method406(int arg0, int arg1) {
        ++field2031;
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(II)V")
    public final void method465(int arg0, int arg1) throws class149 {
        this.field1953.swapBuffers();
        ++field1971;
    }

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "()I")
    public final int method396() {
        ++field1982;
        return this.field2056;
    }

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "(B)V")
    public final void method891(byte arg0) {
        class281.field3985[1] = super.field1816 * super.field1796;
        class281.field3985[0] = super.field1816 * super.field1757;
        ++field1981;
        class281.field3985[2] = super.field1816 * super.field1774;
        class281.field3985[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class281.field3985, 0);
        class281.field3985[0] = -super.field1821 * super.field1757;
        class281.field3985[3] = 1.0F;
        if (arg0 <= -92) {
            class281.field3985[2] = -super.field1821 * super.field1774;
            class281.field3985[1] = -super.field1821 * super.field1796;
            OpenGL.glLightfv(16385, 4609, class281.field3985, 0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(B)V")
    public final void method834(byte arg0) {
        ++field1941;
        int var2 = -126 % ((arg0 - 40) / 63);
        if (!super.field1758) {
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
        } else {
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZLqda;IIB[F)Ltr;")
    public final class297 method838(int arg0, int arg1, boolean arg2, class105 arg3, int arg4, int arg5, byte arg6, float[] arg7) {
        int var9 = 113 / ((arg6 - -41) / 52);
        ++field2021;
        if (!this.field2053 && (!class538.method2993(arg5, -31218) || !class538.method2993(arg0, -31218))) {
            if (this.field2055) {
                return new class212(this, arg3, arg5, arg0, arg7, arg4, arg1);
            } else {
                class318 var10 = new class318(this, arg3, class408.field5672, class737.method4119(arg5, (byte) -128), class737.method4119(arg0, (byte) -128));
                var10.method1928(6408, arg7, arg3, arg0, 0, 0, arg4, arg5, arg1);
                return var10;
            }
        } else {
            return new class318(this, arg3, arg5, arg0, arg2, arg7, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!laa", name = "u", descriptor = "()V")
    public final void method475() {
        ++field1968;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Llm;)Lld;")
    public final class171 method899(byte arg0, class502[] arg1) {
        ++field2018;
        int var3 = 35 % ((arg0 - -66) / 53);
        return new class55(arg1);
    }

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "(B)V")
    public final void method939(byte arg0) {
        if (arg0 > -15) {
            this.field2041 = false;
        }
        ++field2000;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public final Object method917(byte arg0, Canvas arg1) {
        if (arg0 != 3) {
            this.field2045 = null;
        }
        ++field1944;
        long var3 = this.field1953.prepareSurface(arg1);
        if (~var3 == 0L) {
            throw new RuntimeException();
        } else {
            return new Long(var3);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIILqt;)V")
    public final void method824(boolean arg0, int arg1, int arg2, class637 arg3) {
        if (arg2 == 0) {
            OpenGL.glTexEnvi(8960, arg1 + 34184, class40.method308(arg3, arg2 ^ -14135));
            ++field1977;
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg0 ? 771 : 770);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lrh;Law;IIIII)V")
    public final void method900(class268 arg0, class76 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2030;
        if (arg6 != -229) {
            this.method838(-108, 4, false, (class105) null, -5, 63, (byte) -92, (float[]) null);
        }
        byte var8;
        int var9;
        if (class753.field10498 != arg1) {
            if (class511.field6786 == arg1) {
                var8 = 3;
                var9 = arg2 + 1;
            } else if (class322.field4583 == arg1) {
                var8 = 4;
                var9 = arg2 * 3;
            } else if (class76.field922 != arg1) {
                if (class235.field3312 != arg1) {
                    var8 = 0;
                    var9 = arg2;
                } else {
                    var9 = arg2 - -2;
                    var8 = 5;
                }
            } else {
                var8 = 6;
                var9 = arg2 + 2;
            }
        } else {
            var9 = arg2 * 2;
            var8 = 1;
        }
        class408 var10 = arg0.method589((byte) 81);
        class369 var11 = (class369) arg0;
        var11.method1106((byte) -67);
        OpenGL.glDrawElements(var8, var9, class53.method367(5126, var10), var11.method1102((byte) -110) - -((long) (var10.field5665 * arg3)));
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)V")
    public final synchronized void method979(int arg0, int arg1, int arg2) {
        ++field1988;
        class651 var4 = new class651(arg1);
        var4.field8680 = (long) arg0;
        if (arg2 != 0) {
            this.method943(false);
        }
        this.field2024.method11(var4, -109);
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "()Lkea;")
    public final class240 method397() {
        ++field2002;
        int var1 = -1;
        if (~this.field2057.indexOf("nvidia") == 0) {
            if (~this.field2057.indexOf("intel") == 0) {
                if (~this.field2057.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class240(var1, "OpenGL", this.field2050, this.field2052, 0L);
    }

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "(B)V")
    public final void method933(byte arg0) {
        ++field1972;
        OpenGL.glActiveTexture(33984 - -super.field1779);
        if (arg0 != -13) {
            this.method942(false);
        }
    }

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "(I)V")
    public final void method863(int arg0) {
        OpenGL.glViewport(super.field1797, super.field1822, super.field1559, super.field1528);
        ++field2019;
        if (arg0 != 26588) {
            this.method865((byte) -84);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public final void method895(Canvas arg0, byte arg1, Object arg2) {
        if (arg1 <= 33) {
            this.method911(102, 5, (class637) null, true, false);
        }
        ++field1994;
        Long var4 = (Long) arg2;
        this.field1953.releaseSurface(arg0, var4);
    }

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "(B)V")
    public final void method909(byte arg0) {
        if (arg0 != 107) {
            this.field2046 = 21;
        }
        ++field1961;
        this.field2042 = false;
        this.method982(false);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILam;)V")
    public final void method825(int arg0, int arg1, class633 arg2) {
        this.field2039[arg0] = (class459) arg2;
        if (arg1 != 8) {
            this.method397();
        }
        ++field2001;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;")
    public final class241 method429(class241 arg0, class241 arg1, float arg2, class241 arg3) {
        ++field1969;
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(IZ)Lrh;")
    public final class268 method818(int arg0, boolean arg1) {
        ++field1984;
        return arg0 != -23469 ? null : new class369(this, class408.field5669, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "(Z)V")
    public final void method942(boolean arg0) {
        OpenGL.glScissor(super.field1797 + super.field1780, super.field1822 - -super.field1528 + -super.field1726, -super.field1780 + super.field1739, -super.field1789 + super.field1726);
        if (arg0) {
            ++field1959;
        }
    }

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "()V")
    public final void method500() {
        OpenGL.glFinish();
        ++field1976;
    }

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "(I)V")
    public final void method869(int arg0) {
        OpenGL.glDepthMask(super.field1760 && super.field1791);
        ++field2017;
        if (arg0 > -57) {
            this.method869(26);
        }
    }

    @OriginalMember(owner = "client!laa", name = "C", descriptor = "(I)V")
    public final void method876(int arg0) {
        int var2 = 66 / ((arg0 - -35) / 49);
        ++field1954;
        OpenGL.glMatrixMode(5890);
        if (super.field1788[super.field1779] != class577.field7568) {
            OpenGL.glLoadMatrixf(super.field1741[super.field1779].method3369((byte) -110, class534.field7039), 0);
        } else {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "()V")
    public final void method439() {
        ++field2006;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(BI)V")
    public final void method915(byte arg0, int arg1) {
        ++field1960;
        if (arg0 != -109) {
            this.method505();
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[IIZIII)Ltr;")
    public final class297 method850(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field1945;
        if (arg6 >= -29) {
            return null;
        } else if (!this.field2053 && (!class538.method2993(arg2, -31218) || !class538.method2993(arg5, -31218))) {
            if (!this.field2055) {
                class318 var8 = new class318(this, class315.field4498, class408.field5668, class737.method4119(arg2, (byte) -128), class737.method4119(arg5, (byte) -128));
                var8.method596(0, arg4, 0, arg0, arg2, arg1, arg5, (byte) 74);
                return var8;
            } else {
                return new class212(this, arg2, arg5, arg1, arg0, arg4);
            }
        } else {
            return new class318(this, arg2, arg5, arg3, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Law;III)V")
    public final void method828(class76 arg0, int arg1, int arg2, int arg3) {
        ++field1993;
        if (arg3 != 0) {
            this.method911(4, 19, (class637) null, true, true);
        }
        int var5;
        byte var6;
        if (class753.field10498 == arg0) {
            var5 = arg1 * 2;
            var6 = 1;
        } else if (class511.field6786 != arg0) {
            if (class322.field4583 == arg0) {
                var6 = 4;
                var5 = arg1 * 3;
            } else if (class76.field922 != arg0) {
                if (class235.field3312 == arg0) {
                    var6 = 5;
                    var5 = arg1 + 2;
                } else {
                    var6 = 0;
                    var5 = arg1;
                }
            } else {
                var6 = 6;
                var5 = arg1 + 2;
            }
        } else {
            var6 = 3;
            var5 = arg1 - -1;
        }
        OpenGL.glDrawArrays(var6, arg2, var5);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
        ++field2028;
    }

    @OriginalMember(owner = "client!laa", name = "GA", descriptor = "(I)V")
    public final void method392(int arg0) {
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        ++field1942;
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(IZ)V")
    public final synchronized void method980(int arg0, boolean arg1) {
        ++field2025;
        if (!arg1) {
            this.field2053 = true;
        }
        class656 var3 = new class656();
        var3.field8680 = (long) arg0;
        this.field2034.method11(var3, -110);
    }

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "(I)F")
    public final float method853(int arg0) {
        if (arg0 > -37) {
            this.method895((Canvas) null, (byte) -110, (Object) null);
        }
        ++field1950;
        return 0.0F;
    }

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "(I)V")
    public final void method833(int arg0) {
        this.method897(22551);
        ++field2015;
        int var2;
        for (var2 = 0; ~var2 > ~super.field1761; ++var2) {
            class87 var3 = super.field1737[var2];
            int var4 = var3.method671(false);
            int var5 = var2 + 16386;
            float var6 = var3.method666((byte) 110) / 255.0F;
            class281.field3985[0] = (float) var3.method665(class712.method4000(arg0, 97));
            class281.field3985[1] = (float) var3.method669(-22096);
            class281.field3985[2] = (float) var3.method670((byte) -79);
            class281.field3985[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class281.field3985, 0);
            class281.field3985[0] = var6 * (float) class48.method346(var4 >> 16, 255);
            class281.field3985[1] = var6 * (float) (class48.method346(var4, 65421) >> 8);
            class281.field3985[2] = (float) class48.method346(var4, 255) * var6;
            class281.field3985[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, class281.field3985, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var3.method673(-15) * var3.method673(-53)));
            OpenGL.glEnable(var5);
        }
        while (~super.field1799 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        super.method833(arg0);
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V")
    public final void method831(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field1958;
        if (arg0 >= 104) {
            OpenGL.glLoadMatrixf(super.field1801, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!laa", name = "v", descriptor = "(B)V")
    public final void method945(byte arg0) {
        OpenGL.glTexEnvi(8960, 34162, class4.method72(122, super.field1820[super.field1779]));
        if (arg0 >= 113) {
            ++field1995;
        }
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(Z)V")
    public final void method841(boolean arg0) {
        if (!arg0) {
            this.method926(8);
        }
        if (super.field1770) {
            OpenGL.glEnable(3042);
        } else {
            OpenGL.glDisable(3042);
        }
        ++field2004;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILqda;IILns;)Ltr;")
    public final class297 method861(int arg0, class105 arg1, int arg2, int arg3, class408 arg4) {
        if (arg2 > -60) {
            this.method924(-127);
        }
        ++field2029;
        if (!this.field2053 && (!class538.method2993(arg3, -31218) || !class538.method2993(arg0, -31218))) {
            return !this.field2055 ? new class318(this, arg1, arg4, class737.method4119(arg3, (byte) -128), class737.method4119(arg0, (byte) -128)) : new class212(this, arg1, arg4, arg3, arg0);
        } else {
            return new class318(this, arg1, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(IZ)Lam;")
    public final class633 method904(int arg0, boolean arg1) {
        if (arg0 < 32) {
            this.field2049 = true;
        }
        ++field1990;
        return new class459(this, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BZ[[II)Lnp;")
    public final class493 method832(byte arg0, boolean arg1, int[][] arg2, int arg3) {
        ++field2020;
        if (arg0 >= -97) {
            this.method899((byte) 55, (class502[]) null);
        }
        return new class625(this, arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "()V")
    public final void method458() {
        super.method458();
        ++field1979;
        if (this.field1953 != null) {
            this.field1953.method3437();
            this.field1953.release();
            this.field1953 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
    public final void method815(boolean arg0) {
        if (arg0) {
            ++field2012;
            if (super.field1781 && super.field1807 && ~super.field1730 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BJ)V")
    public final synchronized void method981(byte arg0, long arg1) {
        if (arg0 > -53) {
            this.method891((byte) 30);
        }
        ++field1983;
        class656 var4 = new class656();
        var4.field8680 = arg1;
        this.field2035.method11(var4, -90);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II[BLqda;II)Lop;")
    public final class191 method905(int arg0, int arg1, byte[] arg2, class105 arg3, int arg4, int arg5) {
        if (arg0 != 22302) {
            this.method456(true);
        }
        ++field2010;
        return new class478(this, arg3, arg4, arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILku;)V")
    public final void method893(int arg0, class380 arg1) {
        if (arg0 > 107) {
            if (class680.field9501 != arg1) {
                int var3 = class444.method2552(84, arg1);
                OpenGL.glTexGeni(8192, 9472, var3);
                OpenGL.glEnable(3168);
                OpenGL.glTexGeni(8193, 9472, var3);
                OpenGL.glEnable(3169);
                OpenGL.glTexGeni(8194, 9472, var3);
                OpenGL.glEnable(3170);
            } else {
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
            }
            ++field2026;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(FFF)V")
    public final void method403(float arg0, float arg1, float arg2) {
        ++field1949;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public final void method901(Object arg0, Canvas arg1, int arg2) {
        ++field1989;
        Long var4 = (Long) arg0;
        this.field1953.surfaceResized(var4);
        int var5 = 69 / ((57 - arg2) / 58);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lnc;)V")
    public final void method444(class23 arg0) {
        ++field1978;
    }

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "()V")
    public final void method431() {
        ++field2008;
        if (~super.field1559 < -1 || super.field1528 > 0) {
            int var1 = super.field1780;
            int var2 = super.field1739;
            int var3 = super.field1789;
            int var4 = super.field1726;
            this.method435();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method892(-23496);
            this.method888(11073, false);
            this.method817(false, -8043);
            this.method923(false, 23394);
            this.method844((byte) 36, false);
            this.method823((class67) null, -8423);
            this.method856(-2, 78, false, false);
            this.method887((byte) 126, 1);
            this.method836(-129, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, super.field1559, super.field1528, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method419(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "(Z)V")
    public final void method932(boolean arg0) {
        ++field1943;
        if (class367.field5142 != super.field1766) {
            if (class35.field514 == super.field1766) {
                OpenGL.glBlendFunc(1, 1);
            } else if (class451.field6173 == super.field1766) {
                OpenGL.glBlendFunc(774, 1);
            }
        } else {
            OpenGL.glBlendFunc(770, 771);
        }
        if (arg0) {
            field2005 = true;
        }
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ljaggl/OpenGL;Ljava/awt/Canvas;JLd;Lwu;I)V")
    public class122(OpenGL arg0, Canvas arg1, long arg2, class152 arg3, class376 arg4, int arg5) {
        super(arg1, new Long(arg2), arg3, arg4, arg5, 1);
        try {
            this.field1953 = arg0;
            this.field1953.method3439();
            this.field2057 = OpenGL.glGetString(7936).toLowerCase();
            this.field2052 = OpenGL.glGetString(7937).toLowerCase();
            if (~this.field2057.indexOf("microsoft") == 0 && ~this.field2057.indexOf("brian paul") == 0 && ~this.field2057.indexOf("mesa") == 0) {
                String var8 = OpenGL.glGetString(7938);
                String[] var9 = class323.method1958(94, var8.replace('.', ' '), ' ');
                if (~var9.length <= -3) {
                    try {
                        int var10 = class397.method2337((byte) -119, var9[0]);
                        int var11 = class397.method2337((byte) -110, var9[1]);
                        this.field2050 = var10 * 10 + var11;
                    } catch (NumberFormatException var22) {
                        throw new RuntimeException("");
                    }
                    if (this.field2050 < 12) {
                        throw new RuntimeException("");
                    } else if (!this.field1953.method3438("GL_ARB_multitexture")) {
                        throw new RuntimeException("");
                    } else if (!this.field1953.method3438("GL_ARB_texture_env_combine")) {
                        throw new RuntimeException("");
                    } else {
                        int[] var12 = new int[1];
                        OpenGL.glGetIntegerv(34018, var12, 0);
                        super.field1808 = var12[0];
                        if (~super.field1808 > -3) {
                            throw new RuntimeException("");
                        } else {
                            super.field1764 = 8;
                            this.field2047 = this.field1953.method3438("GL_ARB_vertex_buffer_object");
                            super.field1749 = this.field1953.method3438("GL_ARB_multisample");
                            this.field2055 = this.field1953.method3438("GL_ARB_texture_rectangle");
                            super.field1811 = this.field1953.method3438("GL_ARB_texture_cube_map");
                            this.field2053 = this.field1953.method3438("GL_ARB_texture_non_power_of_two");
                            super.field1805 = this.field1953.method3438("GL_EXT_texture3D");
                            this.field2051 = this.field1953.method3438("GL_ARB_vertex_shader");
                            this.field2049 = this.field1953.method3438("GL_ARB_vertex_program");
                            this.field2048 = this.field1953.method3438("GL_ARB_fragment_shader");
                            this.field1953.method3438("GL_ARB_fragment_program");
                            this.field2054 = new int[super.field1808];
                            this.field2046 = !Stream.method3739() ? 5121 : 33639;
                            if (this.field2052.indexOf("radeon") != -1) {
                                int var13 = 0;
                                boolean var14 = false;
                                boolean var15 = false;
                                String[] var16 = class323.method1958(31, this.field2052.replace('/', ' '), ' ');
                                for (int var17 = 0; var16.length > var17; ++var17) {
                                    String var18 = var16[var17];
                                    try {
                                        if (var18.length() > 0) {
                                            if (~var18.charAt(0) == -121 && var18.length() >= 3 && class259.method1574(var18.substring(1, 3), 10)) {
                                                var18 = var18.substring(1);
                                                var15 = true;
                                            }
                                            if (var18.equals("hd")) {
                                                var14 = true;
                                            } else {
                                                if (var18.startsWith("hd")) {
                                                    var14 = true;
                                                    var18 = var18.substring(2);
                                                }
                                                if (var18.length() >= 4 && class259.method1574(var18.substring(0, 4), 10)) {
                                                    var13 = class397.method2337((byte) -109, var18.substring(0, 4));
                                                    break;
                                                }
                                            }
                                        }
                                    } catch (Exception var23) {
                                    }
                                }
                                if (!var15 && !var14) {
                                    if (var13 >= 7000 && ~var13 >= -9251) {
                                        super.field1805 = false;
                                    }
                                    if (~var13 <= -7001 && ~var13 >= -8000) {
                                        this.field2047 = false;
                                    }
                                }
                                this.field2055 &= this.field1953.method3438("GL_ARB_half_float_pixel");
                            }
                            this.field2057.indexOf("intel");
                            if (this.field2047) {
                                try {
                                    int[] var19 = new int[1];
                                    OpenGL.glGenBuffersARB(1, var19, 0);
                                } catch (Throwable var21) {
                                    throw new RuntimeException("");
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("");
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var24) {
            var24.printStackTrace();
            this.method487(104);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(B)V")
    public final void method865(byte arg0) {
        ++field1992;
        if (super.field1824 && !super.field1794) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 < 102) {
            this.field2039 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Lbba;")
    public final class115 method394(int arg0, int arg1) {
        ++field1965;
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IILqt;ZZ)V")
    public final void method911(int arg0, int arg1, class637 arg2, boolean arg3, boolean arg4) {
        OpenGL.glTexEnvi(8960, 34176 - -arg1, class40.method308(arg2, arg0 ^ 5157));
        if (arg0 != -8980) {
            this.method933((byte) -2);
        }
        ++field2003;
        if (!arg4) {
            OpenGL.glTexEnvi(8960, arg1 + 34192, arg3 ? 769 : 768);
        } else {
            OpenGL.glTexEnvi(8960, arg1 + 34192, !arg3 ? 770 : 771);
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(Z)V")
    public final void method854(boolean arg0) {
        if (!arg0) {
            this.field2040 = false;
        }
        class281.field3985[1] = super.field1796 * super.field1742;
        class281.field3985[0] = super.field1757 * super.field1742;
        ++field2007;
        class281.field3985[3] = 1.0F;
        class281.field3985[2] = super.field1774 * super.field1742;
        OpenGL.glLightModelfv(2899, class281.field3985, 0);
    }

    @OriginalMember(owner = "client!laa", name = "U", descriptor = "(I)V")
    public final void method926(int arg0) {
        ++field2016;
        int var2 = this.field2054[super.field1779];
        if (var2 != 0) {
            this.field2054[super.field1779] = 0;
            OpenGL.glBindTexture(var2, 0);
            OpenGL.glDisable(var2);
        }
        if (arg0 <= 91) {
            this.method848((byte) 47);
        }
    }

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "(II)Lul;")
    public final class573 method835(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        } else {
            ++field1962;
            if (~arg0 != -4) {
                if (~arg0 != -5) {
                    return arg0 == 8 ? new class363(this, super.field1680, super.field1699) : super.method835(arg0, 6);
                } else {
                    return new class251(this, super.field1680, super.field1699);
                }
            } else {
                return new class756(this, super.field1680);
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "()Z")
    public final boolean method505() {
        ++field2013;
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lld;B)V")
    public final void method898(class171 arg0, byte arg1) {
        ++field1991;
        class502[] var3 = ((class55) arg0).field660;
        int var4 = 0;
        boolean var5 = false;
        if (arg1 != -15) {
            this.field2042 = false;
        }
        boolean var6 = false;
        boolean var7 = false;
        for (int var8 = 0; ~var8 > ~var3.length; ++var8) {
            class502 var11 = var3[var8];
            class459 var12 = this.field2039[var8];
            int var13 = 0;
            int var14 = var12.method2608((byte) -109);
            long var15 = var12.method1102((byte) -110);
            var12.method1106((byte) -67);
            for (int var17 = 0; ~var11.method2825((byte) -98) < ~var17; ++var17) {
                class143 var18 = var11.method2827(arg1 ^ 24710, var17);
                if (class143.field2281 == var18) {
                    var7 = true;
                    OpenGL.glVertexPointer(3, 5126, var14, (long) var13 + var15);
                } else if (class143.field2282 == var18) {
                    var6 = true;
                    OpenGL.glNormalPointer(5126, var14, (long) var13 + var15);
                } else if (class143.field2283 != var18) {
                    if (class143.field2284 == var18) {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(1, 5126, var14, (long) var13 + var15);
                    } else if (class143.field2285 != var18) {
                        if (class143.field2286 == var18) {
                            OpenGL.glClientActiveTexture(var4++ + 33984);
                            OpenGL.glTexCoordPointer(3, 5126, var14, (long) var13 + var15);
                        } else if (class143.field2287 == var18) {
                            OpenGL.glClientActiveTexture(33984 - -(var4++));
                            OpenGL.glTexCoordPointer(4, 5126, var14, (long) var13 + var15);
                        }
                    } else {
                        OpenGL.glClientActiveTexture(var4++ + 33984);
                        OpenGL.glTexCoordPointer(2, 5126, var14, (long) var13 + var15);
                    }
                } else {
                    OpenGL.glColorPointer(4, 5121, var14, (long) var13 + var15);
                    var5 = true;
                }
                var13 += var18.field2277;
            }
        }
        if (this.field2041 != var7) {
            if (var7) {
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            this.field2041 = var7;
        }
        if (!this.field2038 == var6) {
            if (var6) {
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            this.field2038 = var6;
        }
        if (this.field2040 != var5) {
            if (var5) {
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            this.field2040 = var5;
        }
        if (var4 <= this.field2044) {
            if (~var4 > ~this.field2044) {
                for (int var9 = var4; var9 < this.field2044; ++var9) {
                    OpenGL.glClientActiveTexture(var9 + 33984);
                    OpenGL.glDisableClientState(32888);
                }
                this.field2044 = var4;
                return;
            }
        } else {
            for (int var10 = this.field2044; ~var4 < ~var10; ++var10) {
                OpenGL.glClientActiveTexture(var10 + 33984);
                OpenGL.glEnableClientState(32888);
            }
            this.field2044 = var4;
        }
    }

    @OriginalMember(owner = "client!laa", name = "T", descriptor = "(I)V")
    public final void method924(int arg0) {
        ++field1986;
        int var2 = 41 % ((arg0 - 35) / 36);
        if (!super.field1798) {
            OpenGL.glDisable(3008);
        } else {
            OpenGL.glEnable(3008);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lmj;Lbba;)Lnc;")
    public final class23 method463(class655 arg0, class115 arg1) {
        ++field1963;
        return null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZII[BLqda;II)Ltr;")
    public final class297 method890(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, class105 arg5, int arg6, int arg7) {
        ++field1948;
        if (arg7 >= -91) {
            return null;
        } else if (!this.field2053 && (!class538.method2993(arg2, -31218) || !class538.method2993(arg6, -31218))) {
            if (this.field2055) {
                return new class212(this, arg5, arg2, arg6, arg4, arg3, arg0);
            } else {
                class318 var9 = new class318(this, arg5, class408.field5668, class737.method4119(arg2, (byte) -128), class737.method4119(arg6, (byte) -128));
                var9.method593(arg0, arg5, arg2, (byte) -118, arg3, 0, arg6, 0, arg4);
                return var9;
            }
        } else {
            return new class318(this, arg5, arg2, arg6, arg1, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "(B)V")
    public final void method859(byte arg0) {
        ++field2022;
        OpenGL.glLightfv(16384, 4611, super.field1754, 0);
        OpenGL.glLightfv(16385, 4611, super.field1767, 0);
        if (arg0 != -124) {
            this.field2039 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "(Z)V")
    private final void method982(boolean arg0) {
        ++field1987;
        if (this.field2036) {
            OpenGL.glPopMatrix();
        }
        if (arg0) {
            this.field2040 = false;
        }
        if (!super.field1806.method1217((byte) 0)) {
            if (super.field1710) {
                OpenGL.glLoadIdentity();
                this.field2036 = false;
            } else {
                OpenGL.glLoadMatrixf(super.field1713.method3369((byte) 89, class534.field7039), 0);
                this.field2036 = false;
            }
        } else {
            if (!this.field2042) {
                OpenGL.glLoadMatrixf(super.field1721.method3369((byte) -119, class534.field7039), 0);
                this.field2042 = true;
                this.method859((byte) -124);
                this.method833(0);
            }
            if (super.field1710) {
                this.field2036 = false;
            } else {
                OpenGL.glPushMatrix();
                OpenGL.glMultMatrixf(super.field1713.method3369((byte) -125, class534.field7039), 0);
                this.field2036 = true;
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "(Z)V")
    public final void method931(boolean arg0) {
        if (arg0) {
            this.method501(-93);
        }
        ++field1975;
        OpenGL.glTexEnvi(8960, 34161, class4.method72(122, super.field1751[super.field1779]));
    }
}
