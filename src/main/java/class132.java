import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class132 extends class269 implements class202 {

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Lfh;")
    private class391 field1922 = new class391();

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "Ls;")
    private class154 field1927 = new class257();

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    private int field1934 = -1;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public int field1936 = 8;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public int field1933 = 3;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "Z")
    private boolean field1939 = false;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "[Leh;")
    private class202[] field1941 = new class202[4];

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "Lkn;")
    private class442 field1935 = new class442();

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "Lkn;")
    private class442 field1942 = new class442();

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "Lkn;")
    private class442 field1943 = new class442();

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "Lkn;")
    private class442 field1944 = new class442();

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Lkn;")
    private class442 field1945 = new class442();

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "Lkn;")
    private class442 field1946 = new class442();

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "Lkn;")
    private class442 field1947 = new class442();

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "F")
    public float field1951 = -1.0F;

    @OriginalMember(owner = "client!ig", name = "Ib", descriptor = "I")
    private int field1982 = 0;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "F")
    public float field1957 = 1.0F;

    @OriginalMember(owner = "client!ig", name = "Wb", descriptor = "I")
    public int field1996 = 512;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "F")
    public float field1949 = -1.0F;

    @OriginalMember(owner = "client!ig", name = "Gb", descriptor = "I")
    private int field1980 = 0;

    @OriginalMember(owner = "client!ig", name = "Qb", descriptor = "Z")
    private boolean field1990 = true;

    @OriginalMember(owner = "client!ig", name = "Ab", descriptor = "F")
    public float field1974 = 1.0F;

    @OriginalMember(owner = "client!ig", name = "Pb", descriptor = "I")
    private int field1989 = 0;

    @OriginalMember(owner = "client!ig", name = "hc", descriptor = "I")
    public int field2007 = 512;

    @OriginalMember(owner = "client!ig", name = "Lb", descriptor = "I")
    private int field1985 = 0;

    @OriginalMember(owner = "client!ig", name = "nc", descriptor = "F")
    private float field2013 = 0.0F;

    @OriginalMember(owner = "client!ig", name = "Fb", descriptor = "F")
    public float field1979 = 3584.0F;

    @OriginalMember(owner = "client!ig", name = "sc", descriptor = "I")
    private int field2018 = -1;

    @OriginalMember(owner = "client!ig", name = "fc", descriptor = "F")
    private float field2005 = 1.0F;

    @OriginalMember(owner = "client!ig", name = "bc", descriptor = "I")
    public int field2001 = 0;

    @OriginalMember(owner = "client!ig", name = "rc", descriptor = "I")
    public int field2017 = -1;

    @OriginalMember(owner = "client!ig", name = "yb", descriptor = "I")
    private int field1972 = -1;

    @OriginalMember(owner = "client!ig", name = "Jb", descriptor = "I")
    public int field1983 = 3584;

    @OriginalMember(owner = "client!ig", name = "vc", descriptor = "F")
    public float field2021 = 1.0F;

    @OriginalMember(owner = "client!ig", name = "ic", descriptor = "I")
    public int field2008 = -1;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    private int field1954 = 0;

    @OriginalMember(owner = "client!ig", name = "yc", descriptor = "[F")
    private float[] field2024 = new float[4];

    @OriginalMember(owner = "client!ig", name = "Hb", descriptor = "I")
    private int field1981 = 8448;

    @OriginalMember(owner = "client!ig", name = "mc", descriptor = "[F")
    private float[] field2012 = new float[16];

    @OriginalMember(owner = "client!ig", name = "oc", descriptor = "[F")
    private float[] field2014 = new float[4];

    @OriginalMember(owner = "client!ig", name = "Ec", descriptor = "I")
    private int field2030 = 0;

    @OriginalMember(owner = "client!ig", name = "Kc", descriptor = "I")
    public int field2036 = 50;

    @OriginalMember(owner = "client!ig", name = "Kb", descriptor = "[F")
    private float[] field1984 = new float[4];

    @OriginalMember(owner = "client!ig", name = "Gc", descriptor = "F")
    public float field2032 = 3584.0F;

    @OriginalMember(owner = "client!ig", name = "Sc", descriptor = "I")
    public int field2044 = 0;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    private int field1959 = 8448;

    @OriginalMember(owner = "client!ig", name = "ac", descriptor = "I")
    public int field2000 = -1;

    @OriginalMember(owner = "client!ig", name = "wb", descriptor = "I")
    private int field1970 = 0;

    @OriginalMember(owner = "client!ig", name = "Mc", descriptor = "F")
    private float field2038 = 1.0F;

    @OriginalMember(owner = "client!ig", name = "Xc", descriptor = "[F")
    public float[] field2049 = new float[4];

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1919;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lbk;")
    public class211 field1915;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "Ljaggl/context;")
    private context field1923;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ljaggl/opengl;")
    public opengl field1918;

    @OriginalMember(owner = "client!ig", name = "Yb", descriptor = "Z")
    public boolean field1998;

    @OriginalMember(owner = "client!ig", name = "Hc", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ig", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field2045;

    @OriginalMember(owner = "client!ig", name = "Dc", descriptor = "Ljava/lang/String;")
    private String field2029;

    @OriginalMember(owner = "client!ig", name = "qc", descriptor = "Z")
    private boolean field2016;

    @OriginalMember(owner = "client!ig", name = "tb", descriptor = "Z")
    public boolean field1967;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "Z")
    public boolean field1953;

    @OriginalMember(owner = "client!ig", name = "cc", descriptor = "Z")
    public boolean field2002;

    @OriginalMember(owner = "client!ig", name = "tc", descriptor = "Z")
    private boolean field2019;

    @OriginalMember(owner = "client!ig", name = "vb", descriptor = "Z")
    public boolean field1969;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lvb;")
    public class107 field1921;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lgf;")
    private class151 field1924;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "Lgk;")
    private class279 field1926;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "Ldg;")
    private class237 field1920;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[F")
    private static float[] field1917 = new float[4];

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[F")
    private static float[] field1916 = new float[4];

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field1925 = Boolean.FALSE;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
    private static int[] field1928 = new int[1000];

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "F")
    public float field1950;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "F")
    private float field1961;

    @OriginalMember(owner = "client!ig", name = "sb", descriptor = "F")
    public float field1966;

    @OriginalMember(owner = "client!ig", name = "Eb", descriptor = "F")
    public float field1978;

    @OriginalMember(owner = "client!ig", name = "Nb", descriptor = "F")
    public float field1987;

    @OriginalMember(owner = "client!ig", name = "jc", descriptor = "F")
    public float field2009;

    @OriginalMember(owner = "client!ig", name = "pc", descriptor = "F")
    public float field2015;

    @OriginalMember(owner = "client!ig", name = "Fc", descriptor = "F")
    private float field2031;

    @OriginalMember(owner = "client!ig", name = "Nc", descriptor = "F")
    public float field2039;

    @OriginalMember(owner = "client!ig", name = "Oc", descriptor = "F")
    private float field2040;

    @OriginalMember(owner = "client!ig", name = "Pc", descriptor = "F")
    public float field2041;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public int field1930;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public int field1938;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!ig", name = "zb", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!ig", name = "Bb", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!ig", name = "Vb", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!ig", name = "Xb", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!ig", name = "Zb", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!ig", name = "dc", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!ig", name = "Ac", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!ig", name = "Yc", descriptor = "I")
    private int field2050;

    @OriginalMember(owner = "client!ig", name = "Zc", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!ig", name = "Wc", descriptor = "J")
    private long field2048;

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "Lja;")
    private class152 field1965;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Leh;")
    private class202 field1929;

    @OriginalMember(owner = "client!ig", name = "Tb", descriptor = "Lhf;")
    public class225 field1993;

    @OriginalMember(owner = "client!ig", name = "Bc", descriptor = "Lhf;")
    public class225 field2027;

    @OriginalMember(owner = "client!ig", name = "Vc", descriptor = "Lhf;")
    public class225 field2047;

    @OriginalMember(owner = "client!ig", name = "lc", descriptor = "Lrk;")
    private class22 field2011;

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "Los;")
    public class257 field1964;

    @OriginalMember(owner = "client!ig", name = "uc", descriptor = "Los;")
    public class257 field2020;

    @OriginalMember(owner = "client!ig", name = "wc", descriptor = "Lis;")
    private class292 field2022;

    @OriginalMember(owner = "client!ig", name = "xb", descriptor = "Lda;")
    public class37 field1971;

    @OriginalMember(owner = "client!ig", name = "Cb", descriptor = "Lda;")
    public class37 field1976;

    @OriginalMember(owner = "client!ig", name = "ec", descriptor = "Lda;")
    public class37 field2004;

    @OriginalMember(owner = "client!ig", name = "zc", descriptor = "Lda;")
    public class37 field2025;

    @OriginalMember(owner = "client!ig", name = "Ic", descriptor = "Lda;")
    public class37 field2034;

    @OriginalMember(owner = "client!ig", name = "Uc", descriptor = "Lda;")
    public class37 field2046;

    @OriginalMember(owner = "client!ig", name = "Ub", descriptor = "Lmp;")
    private class454 field1994;

    @OriginalMember(owner = "client!ig", name = "Qc", descriptor = "Lgg;")
    public class95 field2042;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "Z")
    private boolean field1948;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "Z")
    public boolean field1958;

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "Z")
    private boolean field1963;

    @OriginalMember(owner = "client!ig", name = "ub", descriptor = "Z")
    public boolean field1968;

    @OriginalMember(owner = "client!ig", name = "Db", descriptor = "Z")
    public boolean field1977;

    @OriginalMember(owner = "client!ig", name = "Mb", descriptor = "Z")
    private boolean field1986;

    @OriginalMember(owner = "client!ig", name = "Ob", descriptor = "Z")
    public boolean field1988;

    @OriginalMember(owner = "client!ig", name = "Rb", descriptor = "Z")
    private boolean field1991;

    @OriginalMember(owner = "client!ig", name = "Sb", descriptor = "Z")
    private boolean field1992;

    @OriginalMember(owner = "client!ig", name = "gc", descriptor = "Z")
    private boolean field2006;

    @OriginalMember(owner = "client!ig", name = "kc", descriptor = "Z")
    private boolean field2010;

    @OriginalMember(owner = "client!ig", name = "xc", descriptor = "Z")
    private boolean field2023;

    @OriginalMember(owner = "client!ig", name = "Cc", descriptor = "Z")
    public boolean field2028;

    @OriginalMember(owner = "client!ig", name = "Jc", descriptor = "Z")
    private boolean field2035;

    @OriginalMember(owner = "client!ig", name = "Lc", descriptor = "Z")
    private boolean field2037;

    @OriginalMember(owner = "client!ig", name = "Rc", descriptor = "[Lee;")
    private class404[] field2043;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(II)I")
    public final int method863(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "()Z")
    public final boolean method864() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "()V")
    private final void method865() {
        this.field2020 = new class257();
        this.field1964 = new class257();
        this.field2043 = new class404[this.field1975];
        this.field2047 = new class225(this, 3553, 6408, 1, 1);
        this.field1993 = new class225(this, 3553, 6408, 1, 1);
        this.field2027 = new class225(this, 3553, 6408, 1, 1);
        this.field2034 = new class37(this);
        this.field2025 = new class37(this);
        this.field1971 = new class37(this);
        this.field1976 = new class37(this);
        this.field2046 = new class37(this);
        this.field2004 = new class37(this);
        if (this.field1969) {
            this.field2042 = new class95(this);
        }
        this.field1922.method2468(this);
    }

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "()F")
    public final float method866() {
        return this.field1966;
    }

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "()V")
    private final void method867() {
        if (this.field1955 == 1) {
            return;
        }
        this.field1918.glMatrixMode(5889);
        this.field1918.glLoadIdentity();
        if (this.field1937 > 0 && this.field1938 > 0) {
            this.field1918.glOrtho(0.0D, (double) this.field1937, (double) this.field1938, 0.0D, -1.0D, 1.0D);
        }
        this.field1918.glMatrixMode(5888);
        this.field1918.glLoadIdentity();
        this.field1955 = 1;
        this.field1962 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(Z)V")
    public final void method868(boolean arg0) {
        if (this.field2006 != arg0) {
            this.field2006 = arg0;
            this.method951();
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(IIIIII)V")
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1021();
        this.method972(arg5);
        this.field1918.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1918.glBegin(2);
        this.field1918.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1918.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1918.glEnd();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lk;Z)Lvj;")
    public final class256 method870(class337 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field4888 * arg0.field4886];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4885 == null) {
            for (int var8 = 0; var8 < arg0.field4888; var8++) {
                for (int var9 = 0; var9 < arg0.field4886; var9++) {
                    int var10 = arg0.field4881[arg0.field4884[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field4888; var6++) {
                for (int var7 = 0; var7 < arg0.field4886; var7++) {
                    var3[var5++] = arg0.field4885[var4] << 24 | arg0.field4881[arg0.field4884[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class256 var11 = this.method876(var3, 0, arg0.field4886, arg0.field4886, arg0.field4888);
        var11.method85(arg0.field4883, arg0.field4880, arg0.field4887, arg0.field4882);
        return var11;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILsg;II)V")
    public final void method871(int arg0, class226 arg1, int arg2, int arg3) {
        class133 var5 = (class133) arg1;
        class22 var6 = var5.field2052;
        this.method889();
        this.method888(var5.field2052);
        this.method972(1);
        this.method926(7681, 8448);
        this.method949(0, 34167, 768);
        float var7 = var6.field279 / (float) var6.field278;
        float var8 = var6.field276 / (float) var6.field277;
        this.field1918.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field1918.glBegin(7);
        this.field1918.glTexCoord2f((float) (this.field2030 - arg2) * var7, (float) (this.field1954 - arg3) * var8);
        this.field1918.glVertex2i(this.field2030, this.field1954);
        this.field1918.glTexCoord2f((float) (this.field2030 - arg2) * var7, (float) (this.field1985 - arg3) * var8);
        this.field1918.glVertex2i(this.field2030, this.field1985);
        this.field1918.glTexCoord2f((float) (this.field1980 - arg2) * var7, (float) (this.field1985 - arg3) * var8);
        this.field1918.glVertex2i(this.field1980, this.field1985);
        this.field1918.glTexCoord2f((float) (this.field1980 - arg2) * var7, (float) (this.field1954 - arg3) * var8);
        this.field1918.glVertex2i(this.field1980, this.field1954);
        this.field1918.glEnd();
        this.method949(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Leh;)V")
    public final void method872(class202 arg0) {
        if (this.field1934 >= 3) {
            throw new RuntimeException();
        }
        if (this.field1934 >= 0) {
            this.field1941[this.field1934].method561();
        }
        this.field1929 = this.field1941[++this.field1934] = arg0;
        this.field1929.method556();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IFFFFF)V")
    public final void method873(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field2018 != arg0;
        if (var7 || this.field1949 != arg1 || this.field1951 != arg2) {
            this.field2018 = arg0;
            this.field1949 = arg1;
            this.field1951 = arg2;
            if (var7) {
                this.field2021 = (float) (this.field2018 & 0xFF0000) / 1.671168E7F;
                this.field1957 = (float) (this.field2018 & 0xFFFF) / 65535.0F;
                this.field1974 = (float) (this.field2018 & 0xFF) / 255.0F;
                this.method878();
            }
            this.method954();
        }
        if (this.field1984[0] == arg3 && this.field1984[1] == arg4 && this.field1984[2] == arg5) {
            return;
        }
        this.field1984[0] = arg3;
        this.field1984[1] = arg4;
        this.field1984[2] = arg5;
        this.field2024[0] = -arg3;
        this.field2024[1] = -arg4;
        this.field2024[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field2049[0] = arg3 * var8;
        this.field2049[1] = arg4 * var8;
        this.field2049[2] = arg5 * var8;
        this.field2014[0] = -this.field2049[0];
        this.field2014[1] = -this.field2049[1];
        this.field2014[2] = -this.field2049[2];
        this.method1001();
        this.field1960 = (int) (arg3 * 256.0F / arg4);
        this.field1997 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
    public final void method874(boolean arg0) {
        this.field1990 = arg0;
        this.method941();
    }

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "()Lwl;")
    public final class234 method875() {
        return this.field1965 == null ? null : this.field1965.method456(-32077);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([IIIII)Lvj;")
    public final class256 method876(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class14(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
    public final void method877(boolean arg0) {
    }

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "()V")
    private final void method878() {
        field1917[0] = this.field2039 * this.field2021;
        field1917[1] = this.field2039 * this.field1957;
        field1917[2] = this.field2039 * this.field1974;
        field1917[3] = 1.0F;
        this.field1918.glLightModelfv(2899, field1917, 0);
    }

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "()V")
    public final void method879() {
    }

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "()Z")
    public final boolean method880() {
        return this.field1920.method1620();
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)V")
    public final synchronized void method881(int arg0) {
        class24 var2 = new class24(arg0);
        this.field1947.method2756(-55, var2);
    }

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "()V")
    public final void method882() {
        try {
            this.field1923.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(F)V")
    public final void method883(float arg0) {
        if (this.field2039 != arg0) {
            this.field2039 = arg0;
            this.method878();
        }
    }

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "()Ls;")
    public final class154 method884() {
        return this.field1927;
    }

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "()V")
    private final void method885() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field1923.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class259.method1790((byte) -122, 1000L);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
    public final void method886(int arg0) {
        this.method972(0);
        this.field1918.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field1918.glClear(16384);
    }

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "()Z")
    public final boolean method887() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lee;)V")
    public final void method888(class404 arg0) {
        class404 var2 = this.field2043[this.field1956];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field1918.glDisable(var2.field5663);
            } else {
                if (var2 == null) {
                    this.field1918.glEnable(arg0.field5663);
                } else if (arg0.field5663 != var2.field5663) {
                    this.field1918.glDisable(var2.field5663);
                    this.field1918.glEnable(arg0.field5663);
                }
                this.field1918.glBindTexture(arg0.field5663, arg0.method2530());
            }
            this.field2043[this.field1956] = arg0;
        }
        this.field1962 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "()V")
    public final void method889() {
        if (this.field1962 == 2) {
            return;
        }
        this.method867();
        this.method942(false);
        this.method996(false);
        this.method938(false);
        this.method969(false);
        this.method977(-2);
        this.field1962 = 2;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public final void method890(int arg0) {
        this.method885();
    }

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "()Z")
    public final boolean method891() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "()I")
    public final int method892() {
        return this.field2036;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
    public final void method893(int arg0, int arg1, int arg2) {
        if (!this.field1958) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field1972 = arg1;
        this.field2017 = arg2;
        this.method994();
        this.field1924.method1124(arg0, true, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZZ)V")
    public final void method894(int arg0, boolean arg1, boolean arg2) {
        if (this.field2026 != arg0) {
            if (arg0 < 0) {
                this.method921();
                this.method888((class404) null);
                if (!this.field1958) {
                    this.field1924.method1122(-113, arg1, arg2, 0);
                }
            } else {
                class225 var4 = this.field1921.method628(-26292, arg0);
                class287 var5 = this.field1915.method1475(arg0, 17673);
                if (var5.field4174 == 0 && var5.field4168 == 0) {
                    this.method921();
                } else {
                    int var6 = var5.field4164 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method943((float) (this.field1930 % var7 * var5.field4174) / (float) var7, (float) (this.field1930 % var7 * var5.field4168) / (float) var7, 0.0F);
                }
                if (this.field1958) {
                    this.field1924.method1122(-123, arg1, arg2, 3);
                    this.method888(var4);
                } else {
                    this.field1924.method1122(-93, arg1, arg2, var5.field4165);
                    this.field1924.method1124(var5.field4177, false, false);
                    if (!this.field1924.method1125((byte) -88, var4)) {
                        this.method888(var4);
                    }
                }
            }
            this.field2026 = arg0;
        }
        this.field1962 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "()I")
    public final int method895() {
        return this.field1932 + this.field1931 + this.field1940;
    }

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "()I")
    public final int method896() {
        int var1 = this.field2051;
        this.field2051 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "()V")
    public final void method897() {
        this.method969(true);
        this.field1918.glClear(256);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(IIII)[I")
    public final int[] method898(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field1918.glReadPixels(arg0, this.field1938 - arg1 - var6, arg2, 1, 32993, this.field2033, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "()V")
    private final void method899() {
        if (this.field1955 != 3) {
            this.field1955 = 3;
            this.method1000();
            this.method991();
            this.field1962 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
    public final void method900() {
        this.field1926.method1928();
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(IIIII)V")
    public final void method901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)I")
    public final int method902(int arg0) {
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

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
    public final void method903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1918.glLineWidth((float) arg5);
        this.method869(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field1918.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([I)V")
    public final void method904(int[] arg0) {
        arg0[0] = this.field2030;
        arg0[1] = this.field1954;
        arg0[2] = this.field1980;
        arg0[3] = this.field1985;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqf;IIII)Lni;")
    public final class305 method905(class406 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class37(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "()I")
    public final int method906() {
        return this.field1983;
    }

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "()I")
    private final int method907() {
        int var1 = 0;
        this.field2045 = this.field1918.glGetString(7936);
        this.field2029 = this.field1918.glGetString(7937);
        String var2 = this.field2045.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field1918.glGetString(7938);
        String[] var4 = class190.method1362(var3.replace('.', ' '), ' ', (byte) 126);
        if (var4.length >= 2) {
            try {
                int var5 = class333.method2184(-1, var4[0]);
                int var6 = class333.method2184(-1, var4[1]);
                this.field1952 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field1952 < 12) {
            var1 |= 0x2;
        }
        if (!this.field1918.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field1918.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field1918.glGetIntegerv(34018, var8, 0);
        this.field1975 = var8[0];
        this.field1918.glGetIntegerv(34929, var8, 0);
        this.field2003 = var8[0];
        this.field1918.glGetIntegerv(34930, var8, 0);
        this.field1973 = var8[0];
        if (this.field1975 < 2 || this.field2003 < 2 || this.field1973 < 2) {
            var1 |= 0x10;
        }
        this.field1991 = class219.field3150 != null && class219.field3150.startsWith("mac");
        this.field1998 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field2016 = this.field1918.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field2010 = this.field1918.isExtensionAvailable("GL_ARB_multisample");
        this.field2028 = this.field1918.isExtensionAvailable("GL_ARB_vertex_program");
        this.field1918.isExtensionAvailable("GL_ARB_fragment_program");
        this.field1918.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field1988 = this.field1918.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field1967 = this.field1918.isExtensionAvailable("GL_EXT_texture3D");
        this.field2002 = this.field1918.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field1968 = this.field1918.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field1953 = this.field1918.isExtensionAvailable("GL_ARB_texture_float");
        this.field1977 = false;
        this.field1969 = this.field1918.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
    public final void method556() {
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()I")
    public final int method565() {
        return this.field1938;
    }

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "()V")
    public final void method908() {
        if (this.field1955 != 2) {
            this.field1955 = 2;
            this.method947();
            this.method991();
            this.field1962 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Los;)V")
    public final void method909(class257 arg0) {
        this.field1918.glPushMatrix();
        this.field1918.glMultMatrixf(arg0.method1780(5), 0);
    }

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "()V")
    private final void method910() {
        try {
            this.field1923.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "()V")
    public final void method911() {
        if (this.field1937 <= 0 && this.field1938 <= 0) {
            return;
        }
        int var1 = this.field2030;
        int var2 = this.field1980;
        int var3 = this.field1954;
        int var4 = this.field1985;
        this.method931();
        this.field1918.glReadBuffer(1028);
        this.field1918.glDrawBuffer(1029);
        this.method979();
        this.method942(false);
        this.method996(false);
        this.method938(false);
        this.method969(false);
        this.method888((class404) null);
        this.method977(-2);
        this.method913(0);
        this.method972(0);
        this.field1918.glMatrixMode(5889);
        this.field1918.glLoadIdentity();
        this.field1918.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field1918.glMatrixMode(5888);
        this.field1918.glLoadIdentity();
        this.field1918.glRasterPos2i(0, 0);
        this.field1918.glCopyPixels(0, 0, this.field1937, this.field1938, 6144);
        this.field1918.glFlush();
        this.field1918.glReadBuffer(1029);
        this.field1918.glDrawBuffer(1029);
        this.method937(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "(I)I")
    public final int method912(int arg0) {
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

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "(I)V")
    public final void method913(int arg0) {
        if (arg0 == 0) {
            this.method926(7681, 7681);
        } else if (arg0 == 1) {
            this.method926(8448, 8448);
        } else if (arg0 == 2) {
            this.method926(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III[I)V")
    public final void method914(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field2020.field3812 + (float) arg0 * this.field2020.field3801 + (float) arg1 * this.field2020.field3803 + this.field2020.field3806;
        if ((var5 < (float) this.field2036) || (var5 > (float) this.field1983)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field2020.field3808 + (float) arg0 * this.field2020.field3805 + (float) arg1 * this.field2020.field3811 + this.field2020.field3809) * (float) this.field1996 / var5);
        int var7 = (int) (((float) arg2 * this.field2020.field3810 + (float) arg0 * this.field2020.field3800 + (float) arg1 * this.field2020.field3807 + this.field2020.field3804) * (float) this.field2007 / var5);
        if ((float) var6 >= this.field2041 && (float) var6 <= this.field1978 && (float) var7 >= this.field1987 && (float) var7 <= this.field2015) {
            arg3[0] = (int) ((float) var6 - this.field2041);
            arg3[1] = (int) ((float) var7 - this.field1987);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[BIZ)Lmp;")
    public final class454 method915(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class454) (this.field2016 && !arg3 || this.field2019 ? new class313(this, arg0, arg1, arg2, arg3) : new class7(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(II)V")
    public final synchronized void method916(int arg0, int arg1) {
        class24 var3 = new class24(arg1);
        var3.field6070 = (long) arg0;
        this.field1942.method2756(62, var3);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lni;Ls;[Lrh;I)V")
    public final void method917(class305[] arg0, class154 arg1, class144[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method230(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "()Z")
    public final boolean method918() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "()V")
    public final void method919() {
        if (this.field1962 == 8) {
            return;
        }
        this.method908();
        this.method942(true);
        this.method938(true);
        this.method969(true);
        this.method972(1);
        this.method913(1);
        this.field1962 = 8;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "()Z")
    public final boolean method920() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "()V")
    private final void method921() {
        if (this.field2035) {
            this.field1918.glMatrixMode(5890);
            this.field1918.glLoadIdentity();
            this.field1918.glMatrixMode(5888);
            this.field2035 = false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lmp;")
    public final class454 method922(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class454) (this.field2016 && !arg2 || this.field2019 ? new class313(this, arg0, arg1, arg2) : new class7(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
    public final void method923(int arg0, boolean arg1) {
        this.method894(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIII)V")
    public final void method924(int arg0, int arg1, int arg2, int arg3) {
        this.field1926.method1921(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "(I)V")
    public final synchronized void method925(int arg0) {
        class24 var2 = new class24(arg0);
        this.field1944.method2756(-75, var2);
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(II)V")
    public final void method926(int arg0, int arg1) {
        if (this.field1956 != 0) {
            this.field1918.glTexEnvi(8960, 34161, arg0);
            this.field1918.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field1959 != arg0) {
            this.field1918.glTexEnvi(8960, 34161, arg0);
            this.field1959 = arg0;
            var3 = true;
        }
        if (this.field1981 != arg1) {
            this.field1918.glTexEnvi(8960, 34162, arg1);
            this.field1981 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field1962 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(II)V")
    public final void method927(int arg0, int arg1) {
        this.field1982 = arg0;
        this.field1989 = arg1;
        this.field1918.glViewport(arg0, arg1, this.field1937, this.field1938);
        this.method1009();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lrm;)V")
    public final void method928(class235 arg0) {
        this.field1922.method2466(this, arg0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFFF)V")
    public final void method929(float arg0, float arg1, float arg2, float arg3) {
        field1917[0] = arg0;
        field1917[1] = arg1;
        field1917[2] = arg2;
        field1917[3] = arg3;
        this.field1918.glTexEnvfv(8960, 8705, field1917, 0);
    }

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "()Z")
    public final boolean method930() {
        return this.field1924.method1123(47, 3);
    }

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "()V")
    public final void method931() {
        this.field2030 = 0;
        this.field1954 = 0;
        this.field1980 = this.field1937;
        this.field1985 = this.field1938;
        this.field1918.glDisable(3089);
        this.method940();
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "()V")
    public final void method932() {
        if (this.field1920.method163(0)) {
            this.field1926.method1926(this.field1920);
            this.field1921.method629(88);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIILsg;II)V")
    public final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class226 arg6, int arg7, int arg8) {
        class133 var10 = (class133) arg6;
        class22 var11 = var10.field2052;
        this.method889();
        this.method888(var10.field2052);
        this.method972(arg5);
        this.method926(7681, 8448);
        this.method949(0, 34167, 768);
        float var12 = var11.field279 / (float) var11.field278;
        float var13 = var11.field276 / (float) var11.field277;
        this.field1918.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field1918.glBegin(1);
        this.field1918.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field1918.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field1918.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field1918.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field1918.glEnd();
        this.method949(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lbc;")
    public final class205 method934(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "()V")
    private final void method935() {
        float[] var1 = this.field2012;
        float var2 = (float) (-this.field2044 * this.field2036) / (float) this.field1996;
        float var3 = (float) ((this.field1937 - this.field2044) * this.field2036) / (float) this.field1996;
        float var4 = (float) (this.field2036 * this.field2001) / (float) this.field2007;
        float var5 = (float) ((this.field2001 - this.field1938) * this.field2036) / (float) this.field2007;
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
            float var6 = (float) this.field2036 * 2.0F;
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
            var1[10] = this.field1961 = (float) (-(this.field2036 + this.field1983)) / (float) (this.field1983 - this.field2036);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field2031 = -((float) this.field1983 * var6) / (float) (this.field1983 - this.field2036);
            var1[15] = 0.0F;
        }
        this.method1023();
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public final void method936(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(IIII)V")
    public final void method937(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field1937) {
            arg2 = this.field1937;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field1938) {
            arg3 = this.field1938;
        }
        this.field2030 = arg0;
        this.field1954 = arg1;
        this.field1980 = arg2;
        this.field1985 = arg3;
        this.field1918.glEnable(3089);
        this.method940();
        this.method1009();
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(Z)V")
    public final void method938(boolean arg0) {
        if (this.field1986 == arg0) {
            return;
        }
        if (arg0) {
            this.field1918.glEnable(2929);
        } else {
            this.field1918.glDisable(2929);
        }
        this.field1986 = arg0;
        this.field1962 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "()V")
    private final void method939() {
        this.method977(-2);
        for (int var1 = this.field1975 - 1; var1 >= 0; var1--) {
            this.method1002(var1);
            this.method888((class404) null);
            this.field1918.glTexEnvi(8960, 8704, 34160);
        }
        this.method926(8448, 8448);
        this.method949(2, 34168, 770);
        this.method921();
        this.field1995 = 1;
        this.field1918.glEnable(3042);
        this.field1918.glBlendFunc(770, 771);
        this.field1999 = 1;
        this.field1918.glEnable(3008);
        this.field1918.glAlphaFunc(516, 0.0F);
        this.field2037 = true;
        this.field1918.glColorMask(true, true, true, true);
        this.field1992 = true;
        this.method942(true);
        this.method996(true);
        this.method938(true);
        this.method969(true);
        this.method979();
        this.field1918.setSwapInterval(0);
        this.field1918.glShadeModel(7425);
        this.field1918.glClearDepth(1.0F);
        this.field1918.glDepthFunc(515);
        this.field1918.glPolygonMode(1028, 6914);
        this.field1918.glEnable(2884);
        this.field1918.glCullFace(1029);
        this.field1918.glMatrixMode(5888);
        this.field1918.glLoadIdentity();
        this.field1918.glColorMaterial(1028, 5634);
        this.field1918.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field1918.glLightfv(var4, 4608, var2, 0);
            this.field1918.glLightf(var4, 4615, 0.0F);
            this.field1918.glLightf(var4, 4616, 0.0F);
        }
        this.field1918.glEnable(16384);
        this.field1918.glEnable(16385);
        this.field1918.glFogf(2914, 0.95F);
        this.field1918.glFogi(2917, 9729);
        this.field1918.glHint(3156, 4353);
        this.field2018 = this.field2000 = -1;
        this.method931();
    }

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "()V")
    private final void method940() {
        this.field2041 = (float) (this.field2030 - this.field2044);
        this.field1978 = (float) (this.field1980 - this.field2044);
        this.field1987 = (float) (this.field1954 - this.field2001);
        this.field2015 = (float) (this.field1985 - this.field2001);
    }

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "()V")
    private final void method941() {
        this.field1918.glDepthMask(this.field1948 && this.field1990);
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(Z)V")
    public final void method942(boolean arg0) {
        if (this.field2023 != arg0) {
            this.field2023 = arg0;
            this.method1018();
            this.field1962 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(FFF)V")
    private final void method943(float arg0, float arg1, float arg2) {
        this.field1918.glMatrixMode(5890);
        if (this.field2035) {
            this.field1918.glLoadIdentity();
        }
        this.field1918.glTranslatef(arg0, arg1, arg2);
        this.field1918.glMatrixMode(5888);
        this.field2035 = true;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)I")
    public final int method944(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I[Lpc;)V")
    public final void method945(int arg0, class402[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class402 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field1916[0] = (float) var4.field5644;
            field1916[1] = (float) var4.field5643;
            field1916[2] = (float) var4.field5647;
            field1916[3] = 1.0F;
            this.field1918.glLightfv(var5, 4611, field1916, 0);
            int var6 = var4.field5641;
            float var7 = var4.field5640 / 255.0F;
            field1916[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field1916[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field1916[2] = (float) (var6 & 0xFF) * var7;
            this.field1918.glLightfv(var5, 4609, field1916, 0);
            this.field1918.glLightf(var5, 4617, 1.0F / (float) (var4.field5639 * var4.field5639));
            this.field1918.glEnable(var5);
        }
        while (var3 < this.field1970) {
            this.field1918.glDisable(var3 + 16386);
            var3++;
        }
        this.field1970 = arg0;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIIII)V")
    public final void method946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1021();
        this.method972(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1918.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1918.glBegin(1);
        this.field1918.glVertex2f(var6, var7);
        this.field1918.glVertex2f(var6, (float) arg2 + var7);
        this.field1918.glEnd();
    }

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "()V")
    private final void method947() {
        this.field1918.glMatrixMode(5889);
        this.field1918.glLoadMatrixf(this.field2012, 0);
        this.field1918.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
    public final void method561() {
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lro;)V")
    public final void method948(class1 arg0) {
        this.field1965 = (class152) arg0;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)V")
    public final void method949(int arg0, int arg1, int arg2) {
        this.field1918.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field1918.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "()V")
    public final void method950() {
        this.field1937 = this.field1919.getWidth();
        this.field1938 = this.field1919.getHeight();
        this.field1918.glViewport(this.field1982, this.field1989, this.field1937, this.field1938);
        this.method979();
        this.method931();
    }

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "()V")
    private final void method951() {
        if (this.field1963 && !this.field2006) {
            this.field1918.glEnable(2896);
        } else {
            this.field1918.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "()Z")
    public final boolean method952() {
        if (!this.field1920.method163(0)) {
            if (!this.field1926.method1924(this.field1920)) {
                return false;
            }
            this.field1921.method629(56);
        }
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "()I")
    public final int method953() {
        return 4;
    }

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "()V")
    private final void method954() {
        field1917[0] = this.field2021 * this.field1949;
        field1917[1] = this.field1957 * this.field1949;
        field1917[2] = this.field1974 * this.field1949;
        field1917[3] = 1.0F;
        this.field1918.glLightfv(16384, 4609, field1917, 0);
        field1917[0] = -this.field1951 * this.field2021;
        field1917[1] = -this.field1951 * this.field1957;
        field1917[2] = -this.field1951 * this.field1974;
        field1917[3] = 1.0F;
        this.field1918.glLightfv(16385, 4609, field1917, 0);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field2011 == null || this.field2011.field3366 < arg2 || this.field2011.field3367 < arg3) {
            this.field2011 = class22.method121(this, (byte) -124, 6406, arg6, 6406, arg2, arg3, false);
            this.field2011.method1580(false, false);
            var10 = this.field2011.field276;
            var11 = this.field2011.field279;
        } else {
            this.field2011.method1577(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field2011.field276 / (float) this.field2011.field3367;
            var11 = (float) arg2 * this.field2011.field279 / (float) this.field2011.field3366;
        }
        this.method889();
        this.method888(this.field2011);
        this.method972(arg8);
        this.field1918.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method987(arg5);
        this.method926(34165, 34165);
        this.method949(0, 34166, 768);
        this.method949(2, 5890, 770);
        this.method958(0, 34166, 770);
        this.method958(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field1918.glBegin(7);
        this.field1918.glTexCoord2f(0.0F, 0.0F);
        this.field1918.glVertex2f(var12, var13);
        this.field1918.glTexCoord2f(0.0F, var11);
        this.field1918.glVertex2f(var12, var15);
        this.field1918.glTexCoord2f(var10, var11);
        this.field1918.glVertex2f(var14, var15);
        this.field1918.glTexCoord2f(var10, 0.0F);
        this.field1918.glVertex2f(var14, var13);
        this.field1918.glEnd();
        this.method949(0, 5890, 768);
        this.method949(2, 34166, 770);
        this.method958(0, 5890, 770);
        this.method958(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FF)V")
    public final void method956(float arg0, float arg1) {
        if (this.field1950 == arg0 && this.field1966 == arg1) {
            return;
        }
        this.field1950 = arg0;
        this.field1966 = arg1;
        this.method1023();
        if (this.field1955 == 3) {
            this.method1000();
        } else if (this.field1955 == 2) {
            this.method947();
        }
    }

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "()Z")
    public final boolean method957() {
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(III)V")
    public final void method958(int arg0, int arg1, int arg2) {
        this.field1918.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field1918.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "()I")
    public final int method959() {
        int var1 = this.field2050;
        this.field2050 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "()Z")
    public final boolean method960() {
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lwi;Lwi;Lwi;Lwi;)V")
    public final void method961(class273 arg0, class273 arg1, class273 arg2, class273 arg3) {
        if (arg0 == null) {
            this.field1918.glDisableClientState(32884);
        } else {
            this.field1918.glEnableClientState(32884);
            arg0.method1861((byte) 31);
        }
        if (arg1 == null) {
            this.field1918.glDisableClientState(32885);
        } else {
            this.field1918.glEnableClientState(32885);
            arg1.method1860((byte) 103);
        }
        if (arg2 == null) {
            this.field1918.glDisableClientState(32886);
        } else {
            this.field1918.glEnableClientState(32886);
            arg2.method1863((byte) 37);
        }
        if (arg3 == null) {
            this.field1918.glDisableClientState(32888);
        } else {
            this.field1918.glEnableClientState(32888);
            arg3.method1862(116);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lis;)V")
    public final void method962(class292 arg0) {
        if (this.field2022 != arg0 && this.field2016) {
            this.field1918.glBindBufferARB(34963, arg0.method34());
            this.field2022 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "(II)V")
    public final synchronized void method963(int arg0, int arg1) {
        class24 var3 = new class24(arg1);
        var3.field6070 = (long) arg0;
        this.field1943.method2756(-87, var3);
    }

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "()Z")
    public final boolean method964() {
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(FFF)V")
    public final void method965(float arg0, float arg1, float arg2) {
        class237.field3480 = arg0;
        class237.field3478 = arg1;
        class237.field3479 = arg2;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Leh;)V")
    public final void method966(class202 arg0) {
        if (this.field1934 < 0 || this.field1941[this.field1934] != arg0) {
            throw new RuntimeException();
        }
        this.field1941[this.field1934--] = null;
        arg0.method561();
        if (this.field1934 >= 0) {
            this.field1929 = this.field1941[this.field1934];
            this.field1929.method556();
        }
    }

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "()V")
    public final void method967() {
        this.field1924.method1122(-100, false, false, 0);
        this.field1958 = false;
        this.method994();
        this.method1018();
    }

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "()V")
    public final void method968() {
        if (this.field1962 == 4) {
            return;
        }
        this.method867();
        this.method942(false);
        this.method996(false);
        this.method938(false);
        this.method969(false);
        this.method977(-2);
        this.method972(1);
        this.method913(1);
        this.field1962 = 4;
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(Z)V")
    public final void method969(boolean arg0) {
        if (this.field1948 != arg0) {
            this.field1948 = arg0;
            this.method941();
            this.field1962 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "()V")
    public final void method970() {
        if (this.field1918 != null) {
            try {
                this.field1926.method1925();
            } catch (Throwable var4) {
            }
            this.field1918 = null;
        }
        if (this.field1923 != null) {
            this.method910();
            try {
                this.field1923.destroy();
            } catch (Throwable var3) {
            }
            this.field1923 = null;
        }
        if (this.field1939) {
            class247.method1723(true, -18668, true);
            this.field1939 = false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "()Z")
    public final boolean method971() {
        return this.field1920.method163(0);
    }

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "(I)V")
    public final void method972(int arg0) {
        if (this.field1995 == arg0) {
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
        if (this.field1992 != var3) {
            this.field1918.glColorMask(var3, var3, var3, true);
            this.field1992 = var3;
        }
        if (this.field2037 != var4) {
            if (var4) {
                this.field1918.glEnable(3008);
            } else {
                this.field1918.glDisable(3008);
            }
            this.field2037 = var4;
        }
        if (this.field1999 != var2) {
            if (var2 == 1) {
                this.field1918.glEnable(3042);
                this.field1918.glBlendEquation(32774);
                this.field1918.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field1918.glEnable(3042);
                this.field1918.glBlendEquation(32774);
                this.field1918.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field1918.glEnable(3042);
                this.field1918.glBlendEquation(32778);
                this.field1918.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field1918.glEnable(3042);
                this.field1918.glBlendEquation(32774);
                this.field1918.glBlendFunc(774, 1);
            } else {
                this.field1918.glDisable(3042);
            }
            this.field1999 = var2;
        }
        this.field1995 = arg0;
        this.field1962 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ls;)V")
    public final void method973(class154 arg0) {
        this.field2020 = (class257) arg0;
        this.field1964.method1781(1, this.field2020);
        if (this.field1955 != 1) {
            this.method991();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lmp;)V")
    public final void method974(class454 arg0) {
        if (this.field1994 != arg0 && this.field2016) {
            this.field1918.glBindBufferARB(34962, arg0.method34());
            this.field1994 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "(II)V")
    public final synchronized void method975(int arg0, int arg1) {
        class24 var3 = new class24(arg1);
        var3.field6070 = (long) arg0;
        this.field1944.method2756(-55, var3);
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "()Z")
    public final boolean method976() {
        return !this.field1991;
    }

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "(I)V")
    public final void method977(int arg0) {
        this.method923(arg0, true);
    }

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "()Leh;")
    public final class202 method978() {
        return this.field1929;
    }

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "()V")
    public final void method979() {
        if (this.field1955 != 0) {
            this.field1955 = 0;
            this.field1962 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public final void method980(int arg0, int arg1) {
        if (this.field2036 == arg0 && this.field1983 == arg1) {
            return;
        }
        this.field2036 = arg0;
        this.field1983 = arg1;
        this.method935();
        this.method994();
        if (this.field1955 == 3) {
            this.method1000();
        } else if (this.field1955 == 2) {
            this.method947();
        }
    }

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "(I)V")
    public final synchronized void method981(int arg0) {
        class24 var2 = new class24(arg0);
        this.field1946.method2756(-84, var2);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lis;III)V")
    public final void method982(class292 arg0, int arg1, int arg2, int arg3) {
        this.method962(arg0);
        arg0.method1979(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(IIIIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1021();
        this.method972(arg5);
        this.field1918.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2010) {
            this.field1918.glDisable(32925);
        }
        this.field1918.glBegin(2);
        this.field1918.glVertex2f(var7, var8);
        this.field1918.glVertex2f(var7, var10);
        this.field1918.glVertex2f(var9, var10);
        this.field1918.glVertex2f(var9, var8);
        this.field1918.glEnd();
        if (this.field2010) {
            this.field1918.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I[BIZ)Lis;")
    public final class292 method986(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class292) (this.field2016 && !arg3 || this.field2019 ? new class453(this, arg0, arg1, arg2, arg3) : new class437(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "(I)V")
    public final void method987(int arg0) {
        field1917[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field1917[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field1917[2] = (float) (arg0 & 0xFF) / 255.0F;
        field1917[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field1918.glTexEnvfv(8960, 8705, field1917, 0);
    }

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "()F")
    public final float method988() {
        return this.field1950;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(II)V")
    public final void method989(int arg0, int arg1) {
        if (this.field2000 == arg0 && this.field2008 == arg1) {
            return;
        }
        this.field2000 = arg0;
        this.field2008 = arg1;
        if (!this.field1958) {
            this.method994();
            this.method1018();
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIII)V")
    public final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1021();
        this.method972(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field1918.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field1918.glBegin(1);
        this.field1918.glVertex2f(var6, var7);
        this.field1918.glVertex2f((float) arg2 + var6, var7);
        this.field1918.glEnd();
    }

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "()V")
    private final void method991() {
        this.field1918.glLoadIdentity();
        this.field1918.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field1918.glMultMatrixf(this.field2020.method1780(5), 0);
        this.method1001();
    }

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "()V")
    public final void method992() {
        if (this.field1962 == 16) {
            return;
        }
        this.method899();
        this.method942(true);
        this.method938(true);
        this.method969(true);
        this.method972(1);
        this.method913(1);
        this.field1962 = 16;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lro;Lro;FLro;)Lro;")
    public final class1 method993(class1 arg0, class1 arg1, float arg2, class1 arg3) {
        if (arg0 != null && arg1 != null && this.field1968 && this.field1969) {
            class76 var5 = null;
            class152 var6 = (class152) arg0;
            class152 var7 = (class152) arg1;
            class234 var8 = var6.method456(-32077);
            class234 var9 = var7.method456(-32077);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3452 > var9.field3452 ? var8.field3452 : var9.field3452;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class76) {
                    class76 var11 = (class76) arg3;
                    if (var11.method454(1) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class76(this, var10);
                }
                var5.method455(0, var9, arg2, var8);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "()V")
    private final void method994() {
        int var1;
        if (this.field1958) {
            this.field1918.glFogf(2915, 0.0F);
            this.field1918.glFogf(2916, 1.0F);
            var1 = this.field1972;
        } else {
            this.field2040 = (float) (this.field1983 - 256) - this.field2013;
            this.field2009 = this.field2040 - (float) this.field2008 * this.field2005;
            if (this.field2009 < (float) this.field2036) {
                this.field2009 = (float) this.field2036;
            }
            this.field1918.glFogf(2915, this.field2009);
            this.field1918.glFogf(2916, this.field2040);
            var1 = this.field2000;
        }
        field1917[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field1917[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field1917[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field1918.glFogfv(2918, field1917, 0);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(F)V")
    public final void method995(float arg0) {
        if (this.field2038 != arg0) {
            this.field2038 = arg0;
            if (this.field1955 == 3) {
                this.method1000();
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(Z)V")
    public final void method996(boolean arg0) {
        if (this.field1963 != arg0) {
            this.field1963 = arg0;
            this.method951();
            this.field1962 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[[I[[IIII)Luh;")
    public final class92 method997(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class55(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIII)Z")
    public final boolean method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field2020.field3812 + (float) arg0 * this.field2020.field3801 + (float) arg1 * this.field2020.field3803 + this.field2020.field3806;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field2020.field3812 + (float) arg3 * this.field2020.field3801 + (float) arg4 * this.field2020.field3803 + this.field2020.field3806;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field2036) || !(var8 < (float) this.field2036)) || !(!(var7 > (float) this.field1983) || !(var8 > (float) this.field1983))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field2020.field3808 + (float) arg0 * this.field2020.field3805 + (float) arg1 * this.field2020.field3811 + this.field2020.field3809) * (float) this.field1996 / var7);
        int var10 = (int) (((float) arg5 * this.field2020.field3808 + (float) arg3 * this.field2020.field3805 + (float) arg4 * this.field2020.field3811 + this.field2020.field3809) * (float) this.field1996 / var8);
        if ((float) var9 < this.field2041 && (float) var10 < this.field2041 || (float) var9 > this.field1978 && (float) var10 > this.field1978) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field2020.field3810 + (float) arg0 * this.field2020.field3800 + (float) arg1 * this.field2020.field3807 + this.field2020.field3804) * (float) this.field2007 / var7);
            int var12 = (int) (((float) arg5 * this.field2020.field3810 + (float) arg3 * this.field2020.field3800 + (float) arg4 * this.field2020.field3807 + this.field2020.field3804) * (float) this.field2007 / var8);
            return (!((float) var11 < this.field1987) || !((float) var12 < this.field1987)) && (!((float) var11 > this.field2015) || !((float) var12 > this.field2015));
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lbc;)V")
    public final void method999(class205 arg0) {
    }

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "()V")
    private final void method1000() {
        float var1 = (float) (-this.field2044) * this.field2038 / (float) this.field1996;
        float var2 = (float) (-this.field2001) * this.field2038 / (float) this.field2007;
        float var3 = (float) (this.field1937 - this.field2044) * this.field2038 / (float) this.field1996;
        float var4 = (float) (this.field1938 - this.field2001) * this.field2038 / (float) this.field2007;
        this.field1918.glMatrixMode(5889);
        this.field1918.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field1918.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field2036 - this.field1966), (double) ((float) this.field1983 - this.field1966));
        }
        this.field1918.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "()V")
    public final void method1001() {
        this.field1918.glLightfv(16384, 4611, this.field2049, 0);
        this.field1918.glLightfv(16385, 4611, this.field2014, 0);
    }

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "(I)V")
    public final void method1002(int arg0) {
        if (this.field1956 != arg0) {
            this.field1918.glActiveTexture(arg0 + 33984);
            this.field1956 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
    public final void method1003(int arg0, int arg1, int arg2, int arg3) {
        this.field2044 = arg0;
        this.field2001 = arg1;
        this.field1996 = arg2;
        this.field2007 = arg3;
        this.method935();
        this.method940();
        if (this.field1955 == 3) {
            this.method1000();
        } else if (this.field1955 == 2) {
            this.method947();
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(IIII)V")
    public final void method1004(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2030 < arg0) {
            this.field2030 = arg0;
        }
        if (this.field1980 > arg2) {
            this.field1980 = arg2;
        }
        if (this.field1954 < arg1) {
            this.field1954 = arg1;
        }
        if (this.field1985 > arg3) {
            this.field1985 = arg3;
        }
        this.field1918.glEnable(3089);
        this.method940();
        this.method1009();
    }

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V")
    public final void method1005(int arg0) {
        this.method910();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public final void method1006(int arg0, int arg1, int arg2) {
        this.field1958 = true;
        this.field1972 = arg1;
        this.field2017 = arg2;
        this.method994();
        this.method1018();
        this.field1924.method1122(-88, false, false, 3);
        this.field1924.method1124(arg0, true, false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public final synchronized void method1007(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1942.method2759(-1)) {
            class24 var4 = (class24) this.field1942.method2748(-113);
            field1928[var2++] = (int) var4.field6070;
            this.field1932 -= var4.field299;
            if (var2 == 1000) {
                this.field1918.glDeleteBuffersARB(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1918.glDeleteBuffersARB(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1943.method2759(-1)) {
            class24 var5 = (class24) this.field1943.method2748(-104);
            field1928[var2++] = (int) var5.field6070;
            this.field1931 -= var5.field299;
            if (var2 == 1000) {
                this.field1918.glDeleteTextures(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1918.glDeleteTextures(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1944.method2759(-1)) {
            class24 var6 = (class24) this.field1944.method2748(-115);
            field1928[var2++] = var6.field299;
            if (var2 == 1000) {
                this.field1918.glDeleteFramebuffersEXT(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1918.glDeleteFramebuffersEXT(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1945.method2759(-1)) {
            class24 var7 = (class24) this.field1945.method2748(-106);
            field1928[var2++] = (int) var7.field6070;
            this.field1940 -= var7.field299;
            if (var2 == 1000) {
                this.field1918.glDeleteRenderbuffersEXT(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1918.glDeleteRenderbuffersEXT(var2, field1928, 0);
            var2 = 0;
        }
        while (!this.field1946.method2759(-1)) {
            class24 var8 = (class24) this.field1946.method2748(-117);
            field1928[var2++] = (int) var8.field6070;
            if (var2 == 1000) {
                this.field1918.glDeleteProgramsARB(var2, field1928, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field1918.glDeleteProgramsARB(var2, field1928, 0);
            boolean var9 = false;
        }
        while (!this.field1935.method2759(-1)) {
            class24 var10 = (class24) this.field1935.method2748(-103);
            this.field1918.glDeleteLists((int) var10.field6070, var10.field299);
        }
        while (!this.field1947.method2759(-1)) {
            class24 var11 = (class24) this.field1947.method2748(-96);
            this.field1918.glDeleteObjectARB(var11.field299);
        }
        while (!this.field1935.method2759(-1)) {
            class24 var12 = (class24) this.field1935.method2748(-124);
            this.field1918.glDeleteLists((int) var12.field6070, var12.field299);
        }
        if (this.method895() > 100663296 && class18.method107(-16145) > this.field2048 + 60000L) {
            System.gc();
            this.field2048 = class18.method107(-16145);
        }
        this.field1930 = var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lni;Lrm;Ls;[Lrh;I)V")
    public final void method1008(class305[] arg0, class235 arg1, class154 arg2, class144[] arg3, int arg4) {
        this.method917(arg0, arg2, arg3, arg4);
        this.method928(arg1);
    }

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "()V")
    private final void method1009() {
        if (this.field2030 <= this.field1980 && this.field1954 <= this.field1985) {
            this.field1918.glScissor(this.field2030 + this.field1982, this.field1989 + this.field1938 - this.field1985, this.field1980 - this.field2030, this.field1985 - this.field1954);
        } else {
            this.field1918.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "()V")
    public final void method1010() {
        this.field1918.glPopMatrix();
    }

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "()Z")
    public final boolean method1011() {
        return this.field2010;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
    public final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1021();
        this.method972(arg5);
        this.field1918.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field2010) {
            this.field1918.glDisable(32925);
        }
        this.field1918.glBegin(7);
        this.field1918.glVertex2f(var7, var8);
        this.field1918.glVertex2f(var7, var10);
        this.field1918.glVertex2f(var9, var10);
        this.field1918.glVertex2f(var9, var8);
        this.field1918.glEnd();
        if (this.field2010) {
            this.field1918.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lni;Lrm;Ls;Lrh;I)V")
    public final void method1013(class305 arg0, class235 arg1, class154 arg2, class144 arg3, int arg4) {
        arg0.method230(arg2, arg3, arg4);
        this.method928(arg1);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(IIIIII)Lro;")
    public final class1 method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field1968 ? new class375(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "(I)I")
    public final int method1015(int arg0) {
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

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "()Ls;")
    public final class154 method1016() {
        return new class257();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1017(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "()V")
    private final void method1018() {
        if (this.field2023 && this.field1958 | this.field2008 >= 0) {
            this.field1918.glEnable(2912);
        } else {
            this.field1918.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(FF)V")
    public final void method1019(float arg0, float arg1) {
        this.field2005 = arg0;
        this.field2013 = arg1;
        if (!this.field1958) {
            this.method994();
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(III)V")
    public final void method1020(int arg0, int arg1, int arg2) {
        this.field1918.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "()V")
    private final void method1021() {
        if (this.field1962 == 1) {
            return;
        }
        this.method867();
        this.method942(false);
        this.method996(false);
        this.method938(false);
        this.method969(false);
        this.method888((class404) null);
        this.method977(-2);
        this.method913(0);
        this.field1962 = 1;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[I[I)Lsg;")
    public final class226 method1022(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class133.method1028((byte) 38, arg0, arg2, arg3, arg1, this);
    }

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "()V")
    private final void method1023() {
        if (this.field1966 == 0.0F) {
            this.field2012[10] = this.field1961;
            this.field2012[14] = this.field2031;
        } else {
            float var1 = this.field1950 / (this.field1966 + this.field1950);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field2031 * (1.0F - var1) / this.field1966;
            this.field2012[10] = this.field1961 + var3;
            this.field2012[14] = this.field2031 * var2;
        }
        this.field2032 = (this.field2012[14] - (float) this.field1983) / this.field2012[10];
        this.field1979 = (float) this.field1983 - this.field1966;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lbb;[Lk;Z)Lug;")
    public final class335 method1024(class182 arg0, class337[] arg1, boolean arg2) {
        return new class362(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1025(Rectangle[] arg0, int arg1) {
        this.method882();
    }

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "()Z")
    public final boolean method1026() {
        return true;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIZ)Lvj;")
    public final class256 method1027(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class14(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lbk;IILml;)V")
    public class132(Canvas arg0, class211 arg1, int arg2, int arg3, class219 arg4) {
        this.field1919 = arg0;
        this.field1915 = arg1;
        this.field3936 = arg2;
        int var6 = 0;
        while (!this.field1919.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class259.method1790((byte) -128, 1000L);
        }
        this.field1919.setIgnoreRepaint(true);
        try {
            if (field1925 == null || !field1925) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field1925 = Boolean.TRUE;
                } else {
                    class156 var7 = arg4.method1545(this.getClass(), (byte) -107);
                    while (var7.field2298 == 0) {
                        class259.method1790((byte) -73, 100L);
                    }
                    if (var7.field2298 == 1) {
                        field1925 = Boolean.TRUE;
                    }
                }
            }
            if (field1925 == null || !field1925) {
                throw new RuntimeException("");
            }
            this.field1923 = new context();
            if (!this.field1923.choosePixelFormat(this.field1919, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field1923.createContext()) {
                this.method885();
                this.field1918 = this.field1923.getGL();
                int var8 = this.method907();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field2033 = this.field1998 ? 33639 : 5121;
                String var9 = this.field2045.toLowerCase();
                String var10 = this.field2029.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class190.method1362(var10.replace('/', ' '), ' ', (byte) 126);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class376.method2398(153949057, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class376.method2398(153949057, var16.substring(0, 4))) {
                                        var11 = class333.method2184(-1, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field2016 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field1967 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field1953 = false;
                    }
                    this.field2002 &= this.field1918.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field2019 = this.field2016;
                }
                if (var9.contains("intel")) {
                    this.field1969 = false;
                }
                if (this.field2016) {
                    try {
                        int[] var18 = new int[1];
                        this.field1918.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method872(this);
                this.method950();
                this.method865();
                new class208(this);
                this.field1921 = new class107(this, this.field1915);
                class34.method190(true, false, true);
                this.field1939 = true;
                this.field1924 = new class151(this);
                this.field1926 = new class279(this);
                this.field1920 = new class237(this);
                this.method939();
                this.field1918.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field1923.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class259.method1790((byte) -80, 100L);
                    }
                }
                this.field1918.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method970();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
