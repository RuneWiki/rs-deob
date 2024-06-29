import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class157 extends class134 implements class107 {

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Lhk;")
    private class53 field1926 = new class53();

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Lnc;")
    private class18 field1931 = new class349();

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
    private boolean field1933 = false;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    private int field1932 = -1;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public int field1934 = 3;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public int field1939 = 8;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "[Ltj;")
    private class107[] field1944 = new class107[4];

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "Lwq;")
    private class92 field1943 = new class92();

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "Lwq;")
    private class92 field1945 = new class92();

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "Lwq;")
    private class92 field1946 = new class92();

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "Lwq;")
    private class92 field1947 = new class92();

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "Lwq;")
    private class92 field1948 = new class92();

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "Lwq;")
    private class92 field1949 = new class92();

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "Lwq;")
    private class92 field1950 = new class92();

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
    public int field1955 = 50;

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "F")
    public float field1959 = 3584.0F;

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "F")
    private float field1956 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "pb", descriptor = "I")
    public int field1970 = -1;

    @OriginalMember(owner = "client!ao", name = "yb", descriptor = "[F")
    private float[] field1979 = new float[4];

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "[F")
    private float[] field1957 = new float[4];

    @OriginalMember(owner = "client!ao", name = "Ab", descriptor = "I")
    private int field1981 = 0;

    @OriginalMember(owner = "client!ao", name = "dc", descriptor = "I")
    public int field2010 = -1;

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
    private int field1961 = 8448;

    @OriginalMember(owner = "client!ao", name = "kb", descriptor = "F")
    public float field1965 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "Nb", descriptor = "I")
    private int field1994 = 0;

    @OriginalMember(owner = "client!ao", name = "Vb", descriptor = "I")
    private int field2002 = -1;

    @OriginalMember(owner = "client!ao", name = "Sb", descriptor = "F")
    public float field1999 = 3584.0F;

    @OriginalMember(owner = "client!ao", name = "Wb", descriptor = "F")
    public float field2003 = -1.0F;

    @OriginalMember(owner = "client!ao", name = "kc", descriptor = "I")
    private int field2017 = 0;

    @OriginalMember(owner = "client!ao", name = "mc", descriptor = "I")
    private int field2019 = 0;

    @OriginalMember(owner = "client!ao", name = "uc", descriptor = "I")
    public int field2027 = 0;

    @OriginalMember(owner = "client!ao", name = "rc", descriptor = "I")
    private int field2024 = 0;

    @OriginalMember(owner = "client!ao", name = "Hb", descriptor = "F")
    private float field1988 = 0.0F;

    @OriginalMember(owner = "client!ao", name = "fc", descriptor = "I")
    public int field2012 = 512;

    @OriginalMember(owner = "client!ao", name = "mb", descriptor = "Z")
    private boolean field1967 = true;

    @OriginalMember(owner = "client!ao", name = "wc", descriptor = "I")
    public int field2029 = 0;

    @OriginalMember(owner = "client!ao", name = "sc", descriptor = "I")
    private int field2025 = 0;

    @OriginalMember(owner = "client!ao", name = "qb", descriptor = "[F")
    private float[] field1971 = new float[16];

    @OriginalMember(owner = "client!ao", name = "Lb", descriptor = "I")
    public int field1992 = -1;

    @OriginalMember(owner = "client!ao", name = "Ac", descriptor = "[F")
    private float[] field2033 = new float[4];

    @OriginalMember(owner = "client!ao", name = "Tb", descriptor = "F")
    public float field2000 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "qc", descriptor = "I")
    public int field2023 = 3584;

    @OriginalMember(owner = "client!ao", name = "nc", descriptor = "[F")
    public float[] field2020 = new float[4];

    @OriginalMember(owner = "client!ao", name = "Ib", descriptor = "I")
    private int field1989 = 8448;

    @OriginalMember(owner = "client!ao", name = "Kc", descriptor = "F")
    private float field2043 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "Lc", descriptor = "F")
    public float field2044 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "Dc", descriptor = "I")
    private int field2036 = -1;

    @OriginalMember(owner = "client!ao", name = "Rc", descriptor = "I")
    private int field2050 = 0;

    @OriginalMember(owner = "client!ao", name = "Oc", descriptor = "I")
    public int field2047 = 512;

    @OriginalMember(owner = "client!ao", name = "Tc", descriptor = "F")
    public float field2052 = -1.0F;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1923;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "Lul;")
    public class343 field1922;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ljaggl/context;")
    private context field1918;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Ljaggl/opengl;")
    public opengl field1927;

    @OriginalMember(owner = "client!ao", name = "vb", descriptor = "Z")
    public boolean field1976;

    @OriginalMember(owner = "client!ao", name = "Fb", descriptor = "I")
    public int field1986;

    @OriginalMember(owner = "client!ao", name = "Rb", descriptor = "Ljava/lang/String;")
    private String field1998;

    @OriginalMember(owner = "client!ao", name = "Bc", descriptor = "Ljava/lang/String;")
    private String field2034;

    @OriginalMember(owner = "client!ao", name = "zb", descriptor = "Z")
    private boolean field1980;

    @OriginalMember(owner = "client!ao", name = "ib", descriptor = "Z")
    public boolean field1963;

    @OriginalMember(owner = "client!ao", name = "Mb", descriptor = "Z")
    public boolean field1993;

    @OriginalMember(owner = "client!ao", name = "Ec", descriptor = "Z")
    public boolean field2037;

    @OriginalMember(owner = "client!ao", name = "ob", descriptor = "Z")
    private boolean field1969;

    @OriginalMember(owner = "client!ao", name = "jc", descriptor = "Z")
    public boolean field2016;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "Lcf;")
    public class361 field1921;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "Luf;")
    private class259 field1920;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "Ldf;")
    private class227 field1929;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Lpn;")
    private class446 field1924;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "[F")
    private static float[] field1919 = new float[4];

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "[I")
    private static int[] field1928 = new int[1000];

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "[F")
    private static float[] field1925 = new float[4];

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1930 = Boolean.FALSE;

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "F")
    public float field1953;

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "F")
    public float field1954;

    @OriginalMember(owner = "client!ao", name = "jb", descriptor = "F")
    private float field1964;

    @OriginalMember(owner = "client!ao", name = "lb", descriptor = "F")
    public float field1966;

    @OriginalMember(owner = "client!ao", name = "Kb", descriptor = "F")
    private float field1991;

    @OriginalMember(owner = "client!ao", name = "Qb", descriptor = "F")
    public float field1997;

    @OriginalMember(owner = "client!ao", name = "ac", descriptor = "F")
    public float field2007;

    @OriginalMember(owner = "client!ao", name = "tc", descriptor = "F")
    public float field2026;

    @OriginalMember(owner = "client!ao", name = "vc", descriptor = "F")
    public float field2028;

    @OriginalMember(owner = "client!ao", name = "zc", descriptor = "F")
    public float field2032;

    @OriginalMember(owner = "client!ao", name = "Hc", descriptor = "F")
    private float field2040;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public int field1936;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ao", name = "ub", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!ao", name = "xb", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!ao", name = "Gb", descriptor = "I")
    private int field1987;

    @OriginalMember(owner = "client!ao", name = "ec", descriptor = "I")
    private int field2011;

    @OriginalMember(owner = "client!ao", name = "gc", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!ao", name = "pc", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ao", name = "xc", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!ao", name = "Fc", descriptor = "I")
    private int field2038;

    @OriginalMember(owner = "client!ao", name = "Gc", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!ao", name = "Nc", descriptor = "I")
    private int field2046;

    @OriginalMember(owner = "client!ao", name = "Qc", descriptor = "I")
    private int field2049;

    @OriginalMember(owner = "client!ao", name = "Uc", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!ao", name = "Vc", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "J")
    private long field1952;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "Ltj;")
    private class107 field1935;

    @OriginalMember(owner = "client!ao", name = "tb", descriptor = "Lrn;")
    private class145 field1974;

    @OriginalMember(owner = "client!ao", name = "Jb", descriptor = "Lum;")
    private class307 field1990;

    @OriginalMember(owner = "client!ao", name = "wb", descriptor = "Lpm;")
    public class349 field1977;

    @OriginalMember(owner = "client!ao", name = "Sc", descriptor = "Lpm;")
    public class349 field2051;

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "Lrj;")
    public class354 field1958;

    @OriginalMember(owner = "client!ao", name = "Bb", descriptor = "Lrj;")
    public class354 field1982;

    @OriginalMember(owner = "client!ao", name = "Cc", descriptor = "Lrj;")
    public class354 field2035;

    @OriginalMember(owner = "client!ao", name = "hb", descriptor = "Lai;")
    public class357 field1962;

    @OriginalMember(owner = "client!ao", name = "rb", descriptor = "Lai;")
    public class357 field1972;

    @OriginalMember(owner = "client!ao", name = "Yb", descriptor = "Lai;")
    public class357 field2005;

    @OriginalMember(owner = "client!ao", name = "yc", descriptor = "Lai;")
    public class357 field2031;

    @OriginalMember(owner = "client!ao", name = "Ic", descriptor = "Lai;")
    public class357 field2041;

    @OriginalMember(owner = "client!ao", name = "Mc", descriptor = "Lai;")
    public class357 field2045;

    @OriginalMember(owner = "client!ao", name = "sb", descriptor = "Lfm;")
    private class438 field1973;

    @OriginalMember(owner = "client!ao", name = "nb", descriptor = "Lmg;")
    public class80 field1968;

    @OriginalMember(owner = "client!ao", name = "Db", descriptor = "Las;")
    private class84 field1984;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
    public boolean field1951;

    @OriginalMember(owner = "client!ao", name = "Cb", descriptor = "Z")
    public boolean field1983;

    @OriginalMember(owner = "client!ao", name = "Eb", descriptor = "Z")
    private boolean field1985;

    @OriginalMember(owner = "client!ao", name = "Ob", descriptor = "Z")
    public boolean field1995;

    @OriginalMember(owner = "client!ao", name = "Pb", descriptor = "Z")
    private boolean field1996;

    @OriginalMember(owner = "client!ao", name = "Xb", descriptor = "Z")
    private boolean field2004;

    @OriginalMember(owner = "client!ao", name = "Zb", descriptor = "Z")
    private boolean field2006;

    @OriginalMember(owner = "client!ao", name = "bc", descriptor = "Z")
    public boolean field2008;

    @OriginalMember(owner = "client!ao", name = "cc", descriptor = "Z")
    private boolean field2009;

    @OriginalMember(owner = "client!ao", name = "hc", descriptor = "Z")
    private boolean field2014;

    @OriginalMember(owner = "client!ao", name = "ic", descriptor = "Z")
    private boolean field2015;

    @OriginalMember(owner = "client!ao", name = "lc", descriptor = "Z")
    private boolean field2018;

    @OriginalMember(owner = "client!ao", name = "oc", descriptor = "Z")
    private boolean field2021;

    @OriginalMember(owner = "client!ao", name = "Jc", descriptor = "Z")
    private boolean field2042;

    @OriginalMember(owner = "client!ao", name = "Pc", descriptor = "Z")
    public boolean field2048;

    @OriginalMember(owner = "client!ao", name = "Ub", descriptor = "[Llp;")
    private class220[] field2001;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "()I", line = 8)
    public final int method670() {
        return this.field2023;
    }

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "()V", line = 12)
    private final void method937() {
        float[] var1 = this.field1971;
        float var2 = (float) (-this.field2029 * this.field1955) / (float) this.field2047;
        float var3 = (float) ((this.field1942 - this.field2029) * this.field1955) / (float) this.field2047;
        float var4 = (float) (this.field2027 * this.field1955) / (float) this.field2012;
        float var5 = (float) ((this.field2027 - this.field1938) * this.field1955) / (float) this.field2012;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field1955 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field1991 = (float) (-(this.field2023 + this.field1955)) / (float) (this.field2023 - this.field1955);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field2040 = -((float) this.field2023 * var6) / (float) (this.field2023 - this.field1955);
            var1[15] = 0.0F;
        }
        this.method941();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 66)
    public final void method618(int arg0) {
        this.method942();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lum;", line = 69)
    public final class307 method938(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class307) (this.field1980 && !arg2 || this.field1969 ? new class234(this, arg0, arg1, arg2) : new class398(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(FF)V", line = 77)
    public final void method939(float arg0, float arg1) {
        this.field2043 = arg0;
        this.field1988 = arg1;
        if (!this.field1951) {
            this.method999();
        }
    }

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "()Z", line = 84)
    public final boolean method615() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 88)
    public final void method619(int arg0, int arg1, int arg2) {
        if (!this.field1951) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field2002 = arg1;
        this.field1992 = arg2;
        this.method999();
        this.field1920.method1737((byte) 100, true, arg0);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIIII)V", line = 101)
    public final void method643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method983();
        this.method973(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1927.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1927.glBegin(1);
        this.field1927.glVertex2f(var6, var7);
        this.field1927.glVertex2f(var6, (float) arg2 + var7);
        this.field1927.glEnd();
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)I", line = 114)
    public final int method625(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "()V", line = 117)
    private final void method940() {
        this.field1966 = (float) (this.field2017 - this.field2029);
        this.field1953 = (float) (this.field1981 - this.field2029);
        this.field2026 = (float) (this.field1994 - this.field2027);
        this.field1997 = (float) (this.field2050 - this.field2027);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIII)V", line = 132)
    public final void method652(int arg0, int arg1, int arg2, int arg3) {
        this.field2029 = arg0;
        this.field2027 = arg1;
        this.field2047 = arg2;
        this.field2012 = arg3;
        this.method937();
        this.method940();
        if (this.field2049 == 3) {
            this.method1002();
        } else if (this.field2049 == 2) {
            this.method996();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IFFFFF)V", line = 150)
    public final void method640(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field2036 != arg0;
        if (var7 || this.field2003 != arg1 || this.field2052 != arg2) {
            this.field2036 = arg0;
            this.field2003 = arg1;
            this.field2052 = arg2;
            if (var7) {
                this.field2000 = (float) (this.field2036 & 0xFF0000) / 1.671168E7F;
                this.field1965 = (float) (this.field2036 & 0xFFFF) / 65535.0F;
                this.field2044 = (float) (this.field2036 & 0xFF) / 255.0F;
                this.method990();
            }
            this.method957();
        }
        if (this.field1979[0] == arg3 && this.field1979[1] == arg4 && this.field1979[2] == arg5) {
            return;
        }
        this.field1979[0] = arg3;
        this.field1979[1] = arg4;
        this.field1979[2] = arg5;
        this.field1957[0] = -arg3;
        this.field1957[1] = -arg4;
        this.field1957[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field2020[0] = arg3 * var8;
        this.field2020[1] = arg4 * var8;
        this.field2020[2] = arg5 * var8;
        this.field2033[0] = -this.field2020[0];
        this.field2033[1] = -this.field2020[1];
        this.field2033[2] = -this.field2020[2];
        this.method955();
        this.field2022 = (int) (arg3 * 256.0F / arg4);
        this.field2039 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "()F", line = 192)
    public final float method674() {
        return this.field2028;
    }

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "()Lnc;", line = 196)
    public final class18 method649() {
        return this.field1931;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIIII)Lgj;", line = 200)
    public final class381 method610(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class120(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 203)
    public final void method685(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 209)
    public final void method444() {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lbm;Lbm;FLbm;)Lbm;", line = 211)
    public final class59 method603(class59 arg0, class59 arg1, float arg2, class59 arg3) {
        if (arg0 != null && arg1 != null && this.field2008 && this.field2016) {
            class449 var5 = null;
            class438 var6 = (class438) arg0;
            class438 var7 = (class438) arg1;
            class206 var8 = var6.method1145((byte) 100);
            class206 var9 = var7.method1145((byte) 94);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2934 > var9.field2934 ? var8.field2934 : var9.field2934;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class449) {
                    class449 var11 = (class449) arg3;
                    if (var11.method2785((byte) 107) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class449(this, var10);
                }
                var5.method2786(var9, var8, arg2, (byte) -104);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "()V", line = 248)
    private final void method941() {
        if (this.field1954 == 0.0F) {
            this.field1971[10] = this.field1991;
            this.field1971[14] = this.field2040;
        } else {
            float var1 = this.field2028 / (this.field2028 + this.field1954);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field2040 * (1.0F - var1) / this.field1954;
            this.field1971[10] = this.field1991 + var3;
            this.field1971[14] = this.field2040 * var2;
        }
        this.field1959 = (this.field1971[14] - (float) this.field2023) / this.field1971[10];
        this.field1999 = (float) this.field2023 - this.field1954;
    }

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "()I", line = 275)
    public final int method621() {
        int var1 = this.field2054;
        this.field2054 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "()V", line = 281)
    private final void method942() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field1918.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class150.method907(1000L, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)V", line = 303)
    public final synchronized void method943(int arg0, int arg1) {
        class25 var3 = new class25(arg1);
        var3.field5855 = (long) arg0;
        this.field1946.method509((byte) 101, var3);
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)I", line = 309)
    public final int method944(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)V", line = 325)
    public final synchronized void method945(int arg0) {
        class25 var2 = new class25(arg0);
        this.field1947.method509((byte) 104, var2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lem;)V", line = 330)
    public final void method668(class122 arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V", line = 335)
    public final void method679(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2017 < arg0) {
            this.field2017 = arg0;
        }
        if (this.field1981 > arg2) {
            this.field1981 = arg2;
        }
        if (this.field1994 < arg1) {
            this.field1994 = arg1;
        }
        if (this.field2050 > arg3) {
            this.field2050 = arg3;
        }
        this.field1927.glEnable(3089);
        this.method940();
        this.method1005();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lbm;)V", line = 352)
    public final void method688(class59 arg0) {
        this.field1973 = (class438) arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lgm;)V", line = 355)
    public final void method630(class63 arg0) {
        this.field1926.method304(this, arg0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZZ)V", line = 359)
    public final void method946(int arg0, boolean arg1, boolean arg2) {
        if (this.field1978 != arg0) {
            if (arg0 < 0) {
                this.method956();
                this.method1003((class220) null);
                if (!this.field1951) {
                    this.field1920.method1738(0, arg2, 0, arg1);
                }
            } else {
                class354 var4 = this.field1921.method2330(arg0, 3553);
                class336 var5 = this.field1922.method1329((byte) -108, arg0);
                if (var5.field4767 == 0 && var5.field4772 == 0) {
                    this.method956();
                } else {
                    int var6 = var5.field4768 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method972((float) (this.field1941 % var7 * var5.field4767) / (float) var7, (float) (this.field1941 % var7 * var5.field4772) / (float) var7, 0.0F);
                }
                if (this.field1951) {
                    this.field1920.method1738(3, arg2, 0, arg1);
                    this.method1003(var4);
                } else {
                    this.field1920.method1738(var5.field4770, arg2, 0, arg1);
                    this.field1920.method1737((byte) 100, false, var5.field4779);
                    if (!this.field1920.method1739(Integer.MAX_VALUE, var4)) {
                        this.method1003(var4);
                    }
                }
            }
            this.field1978 = arg0;
        }
        this.field2030 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ltj;)V", line = 408)
    public final void method947(class107 arg0) {
        if (this.field1932 < 0 || this.field1944[this.field1932] != arg0) {
            throw new RuntimeException();
        }
        this.field1944[this.field1932--] = null;
        arg0.method444();
        if (this.field1932 >= 0) {
            this.field1935 = this.field1944[this.field1932];
            this.field1935.method450();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ltr;IIII)Lbk;", line = 421)
    public final class210 method605(class160 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class357(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(Z)V", line = 428)
    public final void method948(boolean arg0) {
        if (this.field1996 != arg0) {
            this.field1996 = arg0;
            this.method976();
            this.field2030 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "()Lnc;", line = 437)
    public final class18 method639() {
        return new class349();
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(Z)V", line = 440)
    public final void method949(boolean arg0) {
        if (this.field2009 != arg0) {
            this.field2009 = arg0;
            this.method995();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[Lqp;)V", line = 453)
    public final void method677(int arg0, class397[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class397 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field1925[0] = (float) var4.field5682;
            field1925[1] = (float) var4.field5680;
            field1925[2] = (float) var4.field5687;
            field1925[3] = 1.0F;
            this.field1927.glLightfv(var5, 4611, field1925, 0);
            int var6 = var4.field5690;
            float var7 = var4.field5688 / 255.0F;
            field1925[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field1925[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field1925[2] = (float) (var6 & 0xFF) * var7;
            this.field1927.glLightfv(var5, 4609, field1925, 0);
            this.field1927.glLightf(var5, 4617, 1.0F / (float) (var4.field5679 * var4.field5679));
            this.field1927.glEnable(var5);
        }
        while (var3 < this.field2025) {
            this.field1927.glDisable(var3 + 16386);
            var3++;
        }
        this.field2025 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "()Z", line = 489)
    public final boolean method590() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FF)V", line = 494)
    public final void method691(float arg0, float arg1) {
        if (this.field2028 == arg0 && this.field1954 == arg1) {
            return;
        }
        this.field2028 = arg0;
        this.field1954 = arg1;
        this.method941();
        if (this.field2049 == 3) {
            this.method1002();
        } else if (this.field2049 == 2) {
            this.method996();
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()V", line = 512)
    public final void method450() {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lbk;Lgm;Lnc;[Lkf;I)V", line = 517)
    public final void method642(class210[] arg0, class63 arg1, class18 arg2, class136[] arg3, int arg4) {
        this.method682(arg0, arg2, arg3, arg4);
        this.method630(arg1);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lpm;)V", line = 521)
    public final void method950(class349 arg0) {
        this.field1927.glPushMatrix();
        this.field1927.glMultMatrixf(arg0.method2234(87), 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILhb;II)V", line = 528)
    public final void method666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class433 arg6, int arg7, int arg8) {
        class90 var10 = (class90) arg6;
        class145 var11 = var10.field1089;
        this.method1004();
        this.method1003(var10.field1089);
        this.method973(arg5);
        this.method981(7681, 8448);
        this.method991(0, 34167, 768);
        float var12 = var11.field1788 / (float) var11.field1786;
        float var13 = var11.field1784 / (float) var11.field1785;
        this.field1927.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1927.glBegin(1);
        this.field1927.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field1927.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1927.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field1927.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1927.glEnd();
        this.method991(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([I)V", line = 550)
    public final void method659(int[] arg0) {
        arg0[0] = this.field2017;
        arg0[1] = this.field1994;
        arg0[2] = this.field1981;
        arg0[3] = this.field2050;
    }

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "()V", line = 556)
    private final void method951() {
        this.field1927.glLoadIdentity();
        this.field1927.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field1927.glMultMatrixf(this.field1977.method2234(-126), 0);
        this.method955();
    }

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "()Z", line = 564)
    public final boolean method667() {
        if (!this.field1924.method2735((byte) 91)) {
            if (!this.field1929.method1519(this.field1924)) {
                return false;
            }
            this.field1921.method2329((byte) 92);
        }
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[BIZ)Lum;", line = 576)
    public final class307 method952(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class307) (this.field1980 && !arg3 || this.field1969 ? new class234(this, arg0, arg1, arg2, arg3) : new class398(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)I", line = 584)
    public final int method953(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lth;[Lgo;Z)Lsj;", line = 597)
    public final class266 method613(class355 arg0, class375[] arg1, boolean arg2) {
        return new class67(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(II)V", line = 600)
    public final void method954(int arg0, int arg1) {
        this.field2019 = arg0;
        this.field2024 = arg1;
        this.field1927.glViewport(arg0, arg1, this.field1942, this.field1938);
        this.method1005();
    }

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "()V", line = 606)
    public final void method955() {
        this.field1927.glLightfv(16384, 4611, this.field2020, 0);
        this.field1927.glLightfv(16385, 4611, this.field2033, 0);
    }

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "()V", line = 610)
    private final void method956() {
        if (this.field2018) {
            this.field1927.glMatrixMode(5890);
            this.field1927.glLoadIdentity();
            this.field1927.glMatrixMode(5888);
            this.field2018 = false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lnc;)V", line = 622)
    public final void method628(class18 arg0) {
        this.field1977 = (class349) arg0;
        this.field2051.method2235((byte) 109, this.field1977);
        if (this.field2049 != 1) {
            this.method951();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I)Lhb;", line = 629)
    public final class433 method676(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class90.method496(14108, arg2, arg3, arg1, arg0, this);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIII)V", line = 634)
    public final void method622(int arg0, int arg1, int arg2, int arg3) {
        this.field1929.method1524(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "()I", line = 639)
    public final int method602() {
        return 4;
    }

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "()V", line = 643)
    private final void method957() {
        field1919[0] = this.field2003 * this.field2000;
        field1919[1] = this.field2003 * this.field1965;
        field1919[2] = this.field2044 * this.field2003;
        field1919[3] = 1.0F;
        this.field1927.glLightfv(16384, 4609, field1919, 0);
        field1919[0] = -this.field2052 * this.field2000;
        field1919[1] = -this.field2052 * this.field1965;
        field1919[2] = -this.field2052 * this.field2044;
        field1919[3] = 1.0F;
        this.field1927.glLightfv(16385, 4609, field1919, 0);
    }

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "()Lvk;", line = 657)
    public final class206 method958() {
        return this.field1973 == null ? null : this.field1973.method1145((byte) 100);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 662)
    public final void method601(int arg0) {
        this.method973(0);
        this.field1927.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field1927.glClear(16384);
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(Z)V", line = 667)
    public final void method959(boolean arg0) {
        if (this.field2006 != arg0) {
            this.field2006 = arg0;
            this.method993();
            this.field2030 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIII)V", line = 678)
    public final void method660(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field1942) {
            arg2 = this.field1942;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field1938) {
            arg3 = this.field1938;
        }
        this.field2017 = arg0;
        this.field1994 = arg1;
        this.field1981 = arg2;
        this.field2050 = arg3;
        this.field1927.glEnable(3089);
        this.method940();
        this.method1005();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 701)
    public final void method671(Rectangle[] arg0, int arg1) {
        this.method664();
    }

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "()V", line = 705)
    private final void method960() {
        try {
            this.field1918.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "(I)V", line = 715)
    public final synchronized void method961(int arg0) {
        class25 var2 = new class25(arg0);
        this.field1949.method509((byte) 121, var2);
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "()I", line = 719)
    public final int method629() {
        return this.field1955;
    }

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "()Z", line = 723)
    public final boolean method589() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "()V", line = 729)
    public final void method600() {
        this.method959(true);
        this.field1927.glClear(256);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()I", line = 736)
    public final int method451() {
        return this.field1938;
    }

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "()V", line = 739)
    private final void method962() {
        this.method979(-2);
        for (int var1 = this.field1960 - 1; var1 >= 0; var1--) {
            this.method1001(var1);
            this.method1003((class220) null);
            this.field1927.glTexEnvi(8960, 8704, 34160);
        }
        this.method981(8448, 8448);
        this.method991(2, 34168, 770);
        this.method956();
        this.field2013 = 1;
        this.field1927.glEnable(3042);
        this.field1927.glBlendFunc(770, 771);
        this.field2046 = 1;
        this.field1927.glEnable(3008);
        this.field1927.glAlphaFunc(516, 0.0F);
        this.field2015 = true;
        this.field1927.glColorMask(true, true, true, true);
        this.field2021 = true;
        this.method948(true);
        this.method969(true);
        this.method1009(true);
        this.method959(true);
        this.method984();
        this.field1927.setSwapInterval(0);
        this.field1927.glShadeModel(7425);
        this.field1927.glClearDepth(1.0F);
        this.field1927.glDepthFunc(515);
        this.field1927.glPolygonMode(1028, 6914);
        this.field1927.glEnable(2884);
        this.field1927.glCullFace(1029);
        this.field1927.glMatrixMode(5888);
        this.field1927.glLoadIdentity();
        this.field1927.glColorMaterial(1028, 5634);
        this.field1927.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field1927.glLightfv(var4, 4608, var2, 0);
            this.field1927.glLightf(var4, 4615, 0.0F);
            this.field1927.glLightf(var4, 4616, 0.0F);
        }
        this.field1927.glEnable(16384);
        this.field1927.glEnable(16385);
        this.field1927.glFogf(2914, 0.95F);
        this.field1927.glFogi(2917, 9729);
        this.field1927.glHint(3156, 4353);
        this.field2036 = this.field1970 = -1;
        this.method624();
    }

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "()V", line = 804)
    private final void method963() {
        if (this.field2049 != 3) {
            this.field2049 = 3;
            this.method1002();
            this.method951();
            this.field2030 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "()Z", line = 814)
    public final boolean method647() {
        return this.field1924.method2735((byte) 62);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(F)V", line = 821)
    public final void method964(float arg0) {
        if (this.field1956 != arg0) {
            this.field1956 = arg0;
            if (this.field2049 == 3) {
                this.method1002();
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "()F", line = 831)
    public final float method662() {
        return this.field1954;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([Lbk;Lnc;[Lkf;I)V", line = 836)
    public final void method682(class210[] arg0, class18 arg1, class136[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1416(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "()Z", line = 848)
    public final boolean method598() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(II)V", line = 853)
    public final synchronized void method965(int arg0, int arg1) {
        class25 var3 = new class25(arg1);
        var3.field5855 = (long) arg0;
        this.field1945.method509((byte) 124, var3);
    }

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "()V", line = 860)
    private final void method966() {
        this.field1977 = new class349();
        this.field2051 = new class349();
        this.field2001 = new class220[this.field1960];
        this.field1958 = new class354(this, 3553, 6408, 1, 1);
        this.field2035 = new class354(this, 3553, 6408, 1, 1);
        this.field1982 = new class354(this, 3553, 6408, 1, 1);
        this.field1972 = new class357(this);
        this.field1962 = new class357(this);
        this.field2045 = new class357(this);
        this.field2005 = new class357(this);
        this.field2031 = new class357(this);
        this.field2041 = new class357(this);
        if (this.field2016) {
            this.field1968 = new class80(this);
        }
        this.field1926.method307(this);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I[BIZ)Las;", line = 881)
    public final class84 method967(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class84) (this.field1980 && !arg3 || this.field1969 ? new class390(this, arg0, arg1, arg2, arg3) : new class283(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lgo;Z)Lgj;", line = 890)
    public final class381 method596(class375 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field5262 * arg0.field5261];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5265 == null) {
            for (int var8 = 0; var8 < arg0.field5262; var8++) {
                for (int var9 = 0; var9 < arg0.field5261; var9++) {
                    int var10 = arg0.field5267[arg0.field5266[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field5262; var6++) {
                for (int var7 = 0; var7 < arg0.field5261; var7++) {
                    var3[var5++] = arg0.field5265[var4] << 24 | arg0.field5267[arg0.field5266[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class381 var11 = this.method610(var3, 0, arg0.field5261, arg0.field5261, arg0.field5262);
        var11.method763(arg0.field5263, arg0.field5260, arg0.field5264, arg0.field5268);
        return var11;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Las;III)V", line = 945)
    public final void method968(class84 arg0, int arg1, int arg2, int arg3) {
        this.method977(arg0);
        arg0.method463(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)V", line = 953)
    public final void method687(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field1977.field4955 + (float) arg0 * this.field1977.field4950 + (float) arg1 * this.field1977.field4954 + this.field1977.field4951;
        if ((var5 < (float) this.field1955) || (var5 > (float) this.field2023)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field1977.field4959 + (float) arg0 * this.field1977.field4958 + (float) arg1 * this.field1977.field4960 + this.field1977.field4952) * (float) this.field2047 / var5);
        int var7 = (int) (((float) arg2 * this.field1977.field4957 + (float) arg0 * this.field1977.field4953 + (float) arg1 * this.field1977.field4948 + this.field1977.field4949) * (float) this.field2012 / var5);
        if ((float) var6 >= this.field1966 && (float) var6 <= this.field1953 && (float) var7 >= this.field2026 && (float) var7 <= this.field1997) {
            arg3[0] = (int) ((float) var6 - this.field1966);
            arg3[1] = (int) ((float) var7 - this.field2026);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 979)
    public final void method627(int arg0, int arg1) {
        if (this.field1970 == arg0 && this.field2010 == arg1) {
            return;
        }
        this.field1970 = arg0;
        this.field2010 = arg1;
        if (!this.field1951) {
            this.method999();
            this.method976();
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(Z)V", line = 993)
    public final void method969(boolean arg0) {
        if (this.field2014 != arg0) {
            this.field2014 = arg0;
            this.method995();
            this.field2030 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "()V", line = 1004)
    public final void method634() {
        if (this.field1924.method2735((byte) 40)) {
            this.field1929.method1522(this.field1924);
            this.field1921.method2329((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "()Ltj;", line = 1013)
    public final class107 method970() {
        return this.field1935;
    }

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "(I)V", line = 1017)
    public final synchronized void method971(int arg0) {
        class25 var2 = new class25(arg0);
        this.field1950.method509((byte) 101, var2);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(FFF)V", line = 1021)
    private final void method972(float arg0, float arg1, float arg2) {
        this.field1927.glMatrixMode(5890);
        if (this.field2018) {
            this.field1927.glLoadIdentity();
        }
        this.field1927.glTranslatef(arg0, arg1, arg2);
        this.field1927.glMatrixMode(5888);
        this.field2018 = true;
    }

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "(I)V", line = 1030)
    public final void method973(int arg0) {
        if (this.field2013 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field2021 != var3) {
            this.field1927.glColorMask(var3, var3, var3, true);
            this.field2021 = var3;
        }
        if (this.field2015 != var4) {
            if (var4) {
                this.field1927.glEnable(3008);
            } else {
                this.field1927.glDisable(3008);
            }
            this.field2015 = var4;
        }
        if (this.field2046 != var2) {
            if (var2 == 1) {
                this.field1927.glEnable(3042);
                this.field1927.glBlendEquation(32774);
                this.field1927.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field1927.glEnable(3042);
                this.field1927.glBlendEquation(32774);
                this.field1927.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field1927.glEnable(3042);
                this.field1927.glBlendEquation(32778);
                this.field1927.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field1927.glEnable(3042);
                this.field1927.glBlendEquation(32774);
                this.field1927.glBlendFunc(774, 1);
            } else {
                this.field1927.glDisable(3042);
            }
            this.field2046 = var2;
        }
        this.field2013 = arg0;
        this.field2030 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V", line = 1143)
    public final synchronized void method604(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1945.method504(false)) {
            class25 var4 = (class25) this.field1945.method513(-2);
            field1928[var2++] = (int) var4.field5855;
            this.field1936 -= var4.field311;
            if (var2 == 1000) {
                this.field1927.glDeleteBuffersARB(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1927.glDeleteBuffersARB(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1946.method504(false)) {
            class25 var5 = (class25) this.field1946.method513(-2);
            field1928[var2++] = (int) var5.field5855;
            this.field1937 -= var5.field311;
            if (var2 == 1000) {
                this.field1927.glDeleteTextures(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1927.glDeleteTextures(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1947.method504(false)) {
            class25 var6 = (class25) this.field1947.method513(-2);
            field1928[var2++] = var6.field311;
            if (var2 == 1000) {
                this.field1927.glDeleteFramebuffersEXT(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1927.glDeleteFramebuffersEXT(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1948.method504(false)) {
            class25 var7 = (class25) this.field1948.method513(-2);
            field1928[var2++] = (int) var7.field5855;
            this.field1940 -= var7.field311;
            if (var2 == 1000) {
                this.field1927.glDeleteRenderbuffersEXT(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1927.glDeleteRenderbuffersEXT(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1949.method504(false)) {
            class25 var8 = (class25) this.field1949.method513(-2);
            field1928[var2++] = (int) var8.field5855;
            if (var2 == 1000) {
                this.field1927.glDeleteProgramsARB(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1927.glDeleteProgramsARB(var2, field1928, 0);
            boolean var9 = false;
        }
        while (!this.field1943.method504(false)) {
            class25 var10 = (class25) this.field1943.method513(-2);
            this.field1927.glDeleteLists((int) var10.field5855, var10.field311);
        }
        while (!this.field1950.method504(false)) {
            class25 var11 = (class25) this.field1950.method513(-2);
            this.field1927.glDeleteObjectARB(var11.field311);
        }
        while (!this.field1943.method504(false)) {
            class25 var12 = (class25) this.field1943.method513(-2);
            this.field1927.glDeleteLists((int) var12.field5855, var12.field311);
        }
        if (this.method648() > 100663296 && class175.method1195(32) > this.field1952 + 60000L) {
            System.gc();
            this.field1952 = class175.method1195(104);
        }
        this.field1941 = var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII[BII)V", line = 1314)
    public final void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field1974 == null || this.field1974.field4987 < arg2 || this.field1974.field4986 < arg3) {
            this.field1974 = class145.method883(arg2, false, this, arg6, false, arg3, 6406, 6406);
            this.field1974.method2254(false, false);
            var10 = this.field1974.field1784;
            var11 = this.field1974.field1788;
        } else {
            this.field1974.method2252(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field1974.field1784 / (float) this.field1974.field4986;
            var11 = (float) arg2 * this.field1974.field1788 / (float) this.field1974.field4987;
        }
        this.method1004();
        this.method1003(this.field1974);
        this.method973(arg8);
        this.field1927.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method988(arg5);
        this.method981(34165, 34165);
        this.method991(0, 34166, 768);
        this.method991(2, 5890, 770);
        this.method989(0, 34166, 770);
        this.method989(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field1927.glBegin(7);
        this.field1927.glTexCoord2f(0.0F, 0.0F);
        this.field1927.glVertex2f(var12, var13);
        this.field1927.glTexCoord2f(0.0F, var11);
        this.field1927.glVertex2f(var12, var15);
        this.field1927.glTexCoord2f(var10, var11);
        this.field1927.glVertex2f(var14, var15);
        this.field1927.glTexCoord2f(var10, 0.0F);
        this.field1927.glVertex2f(var14, var13);
        this.field1927.glEnd();
        this.method991(0, 5890, 768);
        this.method991(2, 34166, 770);
        this.method989(0, 5890, 770);
        this.method989(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "()V", line = 1364)
    public final void method631() {
        this.field1942 = this.field1923.getWidth();
        this.field1938 = this.field1923.getHeight();
        this.field1927.glViewport(this.field2019, this.field2024, this.field1942, this.field1938);
        this.method984();
        this.method624();
    }

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "()Z", line = 1371)
    public final boolean method599() {
        return this.field1920.method1740(-90, 3);
    }

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "()V", line = 1374)
    public final void method974() {
        if (this.field2049 != 2) {
            this.field2049 = 2;
            this.method996();
            this.method951();
            this.field2030 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "()V", line = 1386)
    public final void method623() {
        this.field1929.method1521();
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIII)V", line = 1391)
    public final void method658(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method983();
        this.method973(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1927.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1927.glBegin(1);
        this.field1927.glVertex2f(var6, var7);
        this.field1927.glVertex2f((float) arg2 + var6, var7);
        this.field1927.glEnd();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lbk;Lgm;Lnc;Lkf;I)V", line = 1404)
    public final void method588(class210 arg0, class63 arg1, class18 arg2, class136 arg3, int arg4) {
        arg0.method1416(arg2, arg3, arg4);
        this.method630(arg1);
    }

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "(I)V", line = 1409)
    public final void method975(int arg0) {
        if (arg0 == 0) {
            this.method981(7681, 7681);
        } else if (arg0 == 1) {
            this.method981(8448, 8448);
        } else if (arg0 == 2) {
            this.method981(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "()V", line = 1422)
    private final void method976() {
        if (this.field1996 && this.field1951 | this.field2010 >= 0) {
            this.field1927.glEnable(2912);
        } else {
            this.field1927.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(Z)V", line = 1435)
    public final void method617(boolean arg0) {
        this.field1967 = arg0;
        this.method993();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 1442)
    public final void method633(int arg0, int arg1) {
        if (this.field1955 == arg0 && this.field2023 == arg1) {
            return;
        }
        this.field1955 = arg0;
        this.field2023 = arg1;
        this.method937();
        this.method999();
        if (this.field2049 == 3) {
            this.method1002();
        } else if (this.field2049 == 2) {
            this.method996();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Las;)V", line = 1459)
    public final void method977(class84 arg0) {
        if (this.field1984 != arg0 && this.field1980) {
            this.field1927.glBindBufferARB(34963, arg0.method461());
            this.field1984 = arg0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 1469)
    public final void method684(int arg0) {
        this.method960();
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(II)V", line = 1474)
    public final synchronized void method978(int arg0, int arg1) {
        class25 var3 = new class25(arg1);
        var3.field5855 = (long) arg0;
        this.field1947.method509((byte) 127, var3);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(IIIIII)Lbm;", line = 1479)
    public final class59 method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field2008 ? new class171(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V", line = 1482)
    public final void method654(boolean arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "(I)V", line = 1484)
    public final void method979(int arg0) {
        this.method992(arg0, true);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFF)V", line = 1489)
    public final void method591(float arg0, float arg1, float arg2) {
        class446.field6399 = arg0;
        class446.field6397 = arg1;
        class446.field6395 = arg2;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lum;)V", line = 1494)
    public final void method980(class307 arg0) {
        if (this.field1990 != arg0 && this.field1980) {
            this.field1927.glBindBufferARB(34962, arg0.method461());
            this.field1990 = arg0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "(II)V", line = 1502)
    public final void method981(int arg0, int arg1) {
        if (this.field2038 != 0) {
            this.field1927.glTexEnvi(8960, 34161, arg0);
            this.field1927.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field1989 != arg0) {
            this.field1927.glTexEnvi(8960, 34161, arg0);
            this.field1989 = arg0;
            var3 = true;
        }
        if (this.field1961 != arg1) {
            this.field1927.glTexEnvi(8960, 34162, arg1);
            this.field1961 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field2030 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "()V", line = 1538)
    public final void method664() {
        try {
            this.field1918.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "()V", line = 1549)
    public final void method624() {
        this.field2017 = 0;
        this.field1994 = 0;
        this.field1981 = this.field1942;
        this.field2050 = this.field1938;
        this.field1927.glDisable(3089);
        this.method940();
    }

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "()V", line = 1557)
    public final void method982() {
        if (this.field2030 == 8) {
            return;
        }
        this.method974();
        this.method948(true);
        this.method1009(true);
        this.method959(true);
        this.method973(1);
        this.method975(1);
        this.field2030 = 8;
    }

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "()V", line = 1570)
    private final void method983() {
        if (this.field2030 == 1) {
            return;
        }
        this.method997();
        this.method948(false);
        this.method969(false);
        this.method1009(false);
        this.method959(false);
        this.method1003((class220) null);
        this.method979(-2);
        this.method975(0);
        this.field2030 = 1;
    }

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "()V", line = 1586)
    public final void method984() {
        if (this.field2049 != 0) {
            this.field2049 = 0;
            this.field2030 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lhf;Lhf;Lhf;Lhf;)V", line = 1594)
    public final void method985(class224 arg0, class224 arg1, class224 arg2, class224 arg3) {
        if (arg0 == null) {
            this.field1927.glDisableClientState(32884);
        } else {
            this.field1927.glEnableClientState(32884);
            arg0.method1498(124);
        }
        if (arg1 == null) {
            this.field1927.glDisableClientState(32885);
        } else {
            this.field1927.glEnableClientState(32885);
            arg1.method1496(-31221);
        }
        if (arg2 == null) {
            this.field1927.glDisableClientState(32886);
        } else {
            this.field1927.glEnableClientState(32886);
            arg2.method1499((byte) 107);
        }
        if (arg3 == null) {
            this.field1927.glDisableClientState(32888);
        } else {
            this.field1927.glEnableClientState(32888);
            arg3.method1497(21953);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V", line = 1628)
    public final void method986(int arg0, int arg1, int arg2) {
        this.field1927.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "()V", line = 1634)
    public final void method987() {
        if (this.field2030 == 4) {
            return;
        }
        this.method997();
        this.method948(false);
        this.method969(false);
        this.method1009(false);
        this.method959(false);
        this.method979(-2);
        this.method973(1);
        this.method975(1);
        this.field2030 = 4;
    }

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "()Z", line = 1651)
    public final boolean method657() {
        return this.field1985;
    }

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "(I)V", line = 1655)
    public final void method988(int arg0) {
        field1919[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field1919[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field1919[2] = (float) (arg0 & 0xFF) / 255.0F;
        field1919[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field1927.glTexEnvfv(8960, 8705, field1919, 0);
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "()V", line = 1664)
    public final void method680() {
        this.field1920.method1738(0, false, 0, false);
        this.field1951 = false;
        this.method999();
        this.method976();
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(III)V", line = 1671)
    public final void method989(int arg0, int arg1, int arg2) {
        this.field1927.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field1927.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "()V", line = 1677)
    public final void method595() {
        if (this.field1942 <= 0 && this.field1938 <= 0) {
            return;
        }
        int var1 = this.field2017;
        int var2 = this.field1981;
        int var3 = this.field1994;
        int var4 = this.field2050;
        this.method624();
        this.field1927.glReadBuffer(1028);
        this.field1927.glDrawBuffer(1029);
        this.method984();
        this.method948(false);
        this.method969(false);
        this.method1009(false);
        this.method959(false);
        this.method1003((class220) null);
        this.method979(-2);
        this.method975(0);
        this.method973(0);
        this.field1927.glMatrixMode(5889);
        this.field1927.glLoadIdentity();
        this.field1927.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field1927.glMatrixMode(5888);
        this.field1927.glLoadIdentity();
        this.field1927.glRasterPos2i(0, 0);
        this.field1927.glCopyPixels(0, 0, this.field1942, this.field1938, 6144);
        this.field1927.glFlush();
        this.field1927.glReadBuffer(1029);
        this.field1927.glDrawBuffer(1029);
        this.method660(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(IIIIII)V", line = 1718)
    public final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method983();
        this.method973(arg5);
        this.field1927.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1985) {
            this.field1927.glDisable(32925);
        }
        this.field1927.glBegin(2);
        this.field1927.glVertex2f(var7, var8);
        this.field1927.glVertex2f(var7, var10);
        this.field1927.glVertex2f(var9, var10);
        this.field1927.glVertex2f(var9, var8);
        this.field1927.glEnd();
        if (this.field1985) {
            this.field1927.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[I[[IIII)Lgh;", line = 1742)
    public final class327 method655(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class228(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "()V", line = 1746)
    private final void method990() {
        field1919[0] = this.field2032 * this.field2000;
        field1919[1] = this.field2032 * this.field1965;
        field1919[2] = this.field2044 * this.field2032;
        field1919[3] = 1.0F;
        this.field1927.glLightModelfv(2899, field1919, 0);
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIIII)V", line = 1756)
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method983();
        this.method973(arg5);
        this.field1927.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1985) {
            this.field1927.glDisable(32925);
        }
        this.field1927.glBegin(7);
        this.field1927.glVertex2f(var7, var8);
        this.field1927.glVertex2f(var7, var10);
        this.field1927.glVertex2f(var9, var10);
        this.field1927.glVertex2f(var9, var8);
        this.field1927.glEnd();
        if (this.field1985) {
            this.field1927.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(III)V", line = 1780)
    public final void method991(int arg0, int arg1, int arg2) {
        this.field1927.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field1927.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V", line = 1785)
    public final void method992(int arg0, boolean arg1) {
        this.method946(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ao", name = "hb", descriptor = "()V", line = 1789)
    private final void method993() {
        this.field1927.glDepthMask(this.field2006 && this.field1967);
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "()Z", line = 1793)
    public final boolean method641() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "()I", line = 1801)
    public final int method648() {
        return this.field1937 + this.field1936 + this.field1940;
    }

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "()V", line = 1805)
    public final void method620() {
        if (this.field1927 != null) {
            try {
                this.field1929.method1518();
            } catch (Throwable var4) {
            }
            this.field1927 = null;
        }
        if (this.field1918 != null) {
            this.method960();
            try {
                this.field1918.destroy();
            } catch (Throwable var3) {
            }
            this.field1918 = null;
        }
        if (this.field1933) {
            class327.method2116(true, true, -26);
            this.field1933 = false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)V", line = 1836)
    public final void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ao", name = "ib", descriptor = "()I", line = 1840)
    private final int method994() {
        int var1 = 0;
        this.field1998 = this.field1927.glGetString(7936);
        this.field2034 = this.field1927.glGetString(7937);
        String var2 = this.field1998.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field1927.glGetString(7938);
        String[] var4 = class409.method2618(1, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class4.method29(var4[0], 10);
                int var6 = class4.method29(var4[1], 10);
                this.field1975 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field1975 < 12) {
            var1 |= 0x2;
        }
        if (!this.field1927.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field1927.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field1927.glGetIntegerv(34018, var8, 0);
        this.field1960 = var8[0];
        this.field1927.glGetIntegerv(34929, var8, 0);
        this.field1987 = var8[0];
        this.field1927.glGetIntegerv(34930, var8, 0);
        this.field2011 = var8[0];
        if (this.field1960 < 2 || this.field1987 < 2 || this.field2011 < 2) {
            var1 |= 0x10;
        }
        this.field2004 = class185.field2678 != null && class185.field2678.startsWith("mac");
        this.field1976 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field1980 = this.field1927.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field1985 = this.field1927.isExtensionAvailable("GL_ARB_multisample");
        this.field2048 = this.field1927.isExtensionAvailable("GL_ARB_vertex_program");
        this.field1927.isExtensionAvailable("GL_ARB_fragment_program");
        this.field1927.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field1983 = this.field1927.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field1963 = this.field1927.isExtensionAvailable("GL_EXT_texture3D");
        this.field2037 = this.field1927.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field2008 = this.field1927.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field1993 = this.field1927.isExtensionAvailable("GL_ARB_texture_float");
        this.field1995 = false;
        this.field2016 = this.field1927.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)Z", line = 1912)
    public final boolean method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field1977.field4955 + (float) arg0 * this.field1977.field4950 + (float) arg1 * this.field1977.field4954 + this.field1977.field4951;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field1977.field4955 + (float) arg3 * this.field1977.field4950 + (float) arg4 * this.field1977.field4954 + this.field1977.field4951;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field1955) || !(var8 < (float) this.field1955)) || !(!(var7 > (float) this.field2023) || !(var8 > (float) this.field2023))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field1977.field4959 + (float) arg0 * this.field1977.field4958 + (float) arg1 * this.field1977.field4960 + this.field1977.field4952) * (float) this.field2047 / var7);
        int var10 = (int) (((float) arg5 * this.field1977.field4959 + (float) arg3 * this.field1977.field4958 + (float) arg4 * this.field1977.field4960 + this.field1977.field4952) * (float) this.field2047 / var8);
        if ((float) var9 < this.field1966 && (float) var10 < this.field1966 || (float) var9 > this.field1953 && (float) var10 > this.field1953) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field1977.field4957 + (float) arg0 * this.field1977.field4953 + (float) arg1 * this.field1977.field4948 + this.field1977.field4949) * (float) this.field2012 / var7);
            int var12 = (int) (((float) arg5 * this.field1977.field4957 + (float) arg3 * this.field1977.field4953 + (float) arg4 * this.field1977.field4948 + this.field1977.field4949) * (float) this.field2012 / var8);
            return (!((float) var11 < this.field2026) || !((float) var12 < this.field2026)) && (!((float) var11 > this.field1997) || !((float) var12 > this.field1997));
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V", line = 1944)
    public final void method663(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)[I", line = 1951)
    public final int[] method635(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field1927.glReadPixels(arg0, this.field1938 - arg1 - var6, arg2, 1, 32993, this.field1986, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "()V", line = 1966)
    public final void method626() {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(F)V", line = 1970)
    public final void method644(float arg0) {
        if (this.field2032 != arg0) {
            this.field2032 = arg0;
            this.method990();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 1981)
    public final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1927.glLineWidth((float) arg5);
        this.method593(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field1927.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILhb;II)V", line = 1987)
    public final void method597(int arg0, class433 arg1, int arg2, int arg3) {
        class90 var5 = (class90) arg1;
        class145 var6 = var5.field1089;
        this.method1004();
        this.method1003(var5.field1089);
        this.method973(1);
        this.method981(7681, 8448);
        this.method991(0, 34167, 768);
        float var7 = var6.field1788 / (float) var6.field1786;
        float var8 = var6.field1784 / (float) var6.field1785;
        this.field1927.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field1927.glBegin(7);
        this.field1927.glTexCoord2f((float) (this.field2017 - arg2) * var7, (float) (this.field1994 - arg3) * var8);
        this.field1927.glVertex2i(this.field2017, this.field1994);
        this.field1927.glTexCoord2f((float) (this.field2017 - arg2) * var7, (float) (this.field2050 - arg3) * var8);
        this.field1927.glVertex2i(this.field2017, this.field2050);
        this.field1927.glTexCoord2f((float) (this.field1981 - arg2) * var7, (float) (this.field2050 - arg3) * var8);
        this.field1927.glVertex2i(this.field1981, this.field2050);
        this.field1927.glTexCoord2f((float) (this.field1981 - arg2) * var7, (float) (this.field1994 - arg3) * var8);
        this.field1927.glVertex2i(this.field1981, this.field1994);
        this.field1927.glEnd();
        this.method991(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 2015)
    public final void method637(boolean arg0) {
    }

    @OriginalMember(owner = "client!ao", name = "jb", descriptor = "()V", line = 2017)
    private final void method995() {
        if (this.field2014 && !this.field2009) {
            this.field1927.glEnable(2896);
        } else {
            this.field1927.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(II)I", line = 2026)
    public final int method689(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "()Z", line = 2030)
    public final boolean method678() {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "kb", descriptor = "()V", line = 2033)
    private final void method996() {
        this.field1927.glMatrixMode(5889);
        this.field1927.glLoadMatrixf(this.field1971, 0);
        this.field1927.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "()Z", line = 2038)
    public final boolean method650() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "lb", descriptor = "()V", line = 2053)
    private final void method997() {
        if (this.field2049 == 1) {
            return;
        }
        this.field1927.glMatrixMode(5889);
        this.field1927.glLoadIdentity();
        if (this.field1942 > 0 && this.field1938 > 0) {
            this.field1927.glOrtho(0.0D, (double) this.field1942, (double) this.field1938, 0.0D, -1.0D, 1.0D);
        }
        this.field1927.glMatrixMode(5888);
        this.field1927.glLoadIdentity();
        this.field2049 = 1;
        this.field2030 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIIIII)V", line = 2072)
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method983();
        this.method973(arg5);
        this.field1927.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1927.glBegin(2);
        this.field1927.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1927.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1927.glEnd();
    }

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "()Z", line = 2083)
    public final boolean method606() {
        return !this.field2004;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ltj;)V", line = 2086)
    public final void method998(class107 arg0) {
        if (this.field1932 >= 3) {
            throw new RuntimeException();
        }
        if (this.field1932 >= 0) {
            this.field1944[this.field1932].method444();
        }
        this.field1935 = this.field1944[++this.field1932] = arg0;
        this.field1935.method450();
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lul;IILrd;)V", line = 2602)
    public class157(Canvas arg0, class343 arg1, int arg2, int arg3, class185 arg4) {
        this.field1923 = arg0;
        this.field1922 = arg1;
        this.field1620 = arg2;
        int var6 = 0;
        while (!this.field1923.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class150.method907(1000L, (byte) -32);
        }
        this.field1923.setIgnoreRepaint(true);
        try {
            if (field1930 == null || !field1930) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field1930 = Boolean.TRUE;
                } else {
                    class315 var7 = arg4.method1274(false, this.getClass());
                    while (var7.field4498 == 0) {
                        class150.method907(100L, (byte) -32);
                    }
                    if (var7.field4498 == 1) {
                        field1930 = Boolean.TRUE;
                    }
                }
            }
            if (field1930 == null || !field1930) {
                throw new RuntimeException("");
            }
            this.field1918 = new context();
            if (!this.field1918.choosePixelFormat(this.field1923, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field1918.createContext()) {
                this.method942();
                this.field1927 = this.field1918.getGL();
                int var8 = this.method994();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field1986 = this.field1976 ? 33639 : 5121;
                String var9 = this.field1998.toLowerCase();
                String var10 = this.field2034.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class409.method2618(1, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class112.method700(10, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class112.method700(10, var16.substring(0, 4))) {
                                        var11 = class4.method29(var16.substring(0, 4), 10);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field1980 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field1963 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field1993 = false;
                    }
                    this.field2037 &= this.field1927.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field1969 = this.field1980;
                }
                if (var9.contains("intel")) {
                    this.field2016 = false;
                }
                if (this.field1980) {
                    try {
                        int[] var18 = new int[1];
                        this.field1927.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method998(this);
                this.method631();
                this.method966();
                new class387(this);
                this.field1921 = new class361(this, this.field1922);
                class69.method395(1089195052, true, true);
                this.field1933 = true;
                this.field1920 = new class259(this);
                this.field1929 = new class227(this);
                this.field1924 = new class446(this);
                this.method962();
                this.field1927.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field1918.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class150.method907(100L, (byte) -32);
                    }
                }
                this.field1927.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method620();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!ao", name = "mb", descriptor = "()V", line = 2102)
    private final void method999() {
        int var1;
        if (this.field1951) {
            this.field1927.glFogf(2915, 0.0F);
            this.field1927.glFogf(2916, 1.0F);
            var1 = this.field2002;
        } else {
            this.field1964 = (float) (this.field2023 - 256) - this.field1988;
            this.field2007 = this.field1964 - (float) this.field2010 * this.field2043;
            if (this.field2007 < (float) this.field1955) {
                this.field2007 = (float) this.field1955;
            }
            this.field1927.glFogf(2915, this.field2007);
            this.field1927.glFogf(2916, this.field1964);
            var1 = this.field1970;
        }
        field1919[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field1919[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field1919[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field1927.glFogfv(2918, field1919, 0);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFF)V", line = 2126)
    public final void method1000(float arg0, float arg1, float arg2, float arg3) {
        field1919[0] = arg0;
        field1919[1] = arg1;
        field1919[2] = arg2;
        field1919[3] = arg3;
        this.field1927.glTexEnvfv(8960, 8705, field1919, 0);
    }

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "(I)V", line = 2133)
    public final void method1001(int arg0) {
        if (this.field2038 != arg0) {
            this.field1927.glActiveTexture(arg0 + 33984);
            this.field2038 = arg0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "()Z", line = 2142)
    public final boolean method669() {
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V", line = 2147)
    public final void method690(int arg0, int arg1, int arg2) {
        this.field1951 = true;
        this.field2002 = arg1;
        this.field1992 = arg2;
        this.method999();
        this.method976();
        this.field1920.method1738(3, false, 0, false);
        this.field1920.method1737((byte) 114, true, arg0);
    }

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "()Z", line = 2156)
    public final boolean method672() {
        return this.field1924.method2772();
    }

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "()I", line = 2162)
    public final int method646() {
        int var1 = this.field2053;
        this.field2053 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIZ)Lgj;", line = 2167)
    public final class381 method614(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class120(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ao", name = "nb", descriptor = "()V", line = 2174)
    private final void method1002() {
        float var1 = (float) (-this.field2029) * this.field1956 / (float) this.field2047;
        float var2 = (float) (-this.field2027) * this.field1956 / (float) this.field2012;
        float var3 = (float) (this.field1942 - this.field2029) * this.field1956 / (float) this.field2047;
        float var4 = (float) (this.field1938 - this.field2027) * this.field1956 / (float) this.field2012;
        this.field1927.glMatrixMode(5889);
        this.field1927.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field1927.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field1955 - this.field1954), (double) ((float) this.field2023 - this.field1954));
        }
        this.field1927.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Llp;)V", line = 2190)
    public final void method1003(class220 arg0) {
        class220 var2 = this.field2001[this.field2038];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field1927.glDisable(var2.field3102);
            } else {
                if (var2 == null) {
                    this.field1927.glEnable(arg0.field3102);
                } else if (arg0.field3102 != var2.field3102) {
                    this.field1927.glDisable(var2.field3102);
                    this.field1927.glEnable(arg0.field3102);
                }
                this.field1927.glBindTexture(arg0.field3102, arg0.method1482());
            }
            this.field2001[this.field2038] = arg0;
        }
        this.field2030 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ao", name = "ob", descriptor = "()V", line = 2220)
    public final void method1004() {
        if (this.field2030 == 2) {
            return;
        }
        this.method997();
        this.method948(false);
        this.method969(false);
        this.method1009(false);
        this.method959(false);
        this.method979(-2);
        this.field2030 = 2;
    }

    @OriginalMember(owner = "client!ao", name = "pb", descriptor = "()V", line = 2238)
    private final void method1005() {
        if (this.field2017 <= this.field1981 && this.field1994 <= this.field2050) {
            this.field1927.glScissor(this.field2019 + this.field2017, this.field2024 + this.field1938 - this.field2050, this.field1981 - this.field2017, this.field2050 - this.field1994);
        } else {
            this.field1927.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "(I)I", line = 2255)
    public final int method1006(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)Lem;", line = 2289)
    public final class122 method656(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "qb", descriptor = "()V", line = 2292)
    public final void method1007() {
        this.field1927.glPopMatrix();
    }

    @OriginalMember(owner = "client!ao", name = "rb", descriptor = "()V", line = 2295)
    public final void method1008() {
        if (this.field2030 == 16) {
            return;
        }
        this.method963();
        this.method948(true);
        this.method1009(true);
        this.method959(true);
        this.method973(1);
        this.method975(1);
        this.field2030 = 16;
    }

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "(Z)V", line = 2309)
    public final void method1009(boolean arg0) {
        if (this.field2042 == arg0) {
            return;
        }
        if (arg0) {
            this.field1927.glEnable(2929);
        } else {
            this.field1927.glDisable(2929);
        }
        this.field2042 = arg0;
        this.field2030 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 2323)
    public final void method607(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "()Z", line = 2328)
    public final boolean method609() {
        return true;
    }
}
