import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class18 {

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
    private int field2083 = 0;

    @OriginalMember(owner = "client!m", name = "Mb", descriptor = "Z")
    private boolean field2104 = false;

    @OriginalMember(owner = "client!m", name = "yb", descriptor = "I")
    private int field2090 = 0;

    @OriginalMember(owner = "client!m", name = "ac", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!m", name = "Sb", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!m", name = "Db", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!m", name = "Yb", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
    private int field2086;

    @OriginalMember(owner = "client!m", name = "zb", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!m", name = "dc", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!m", name = "bc", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!m", name = "Ub", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!m", name = "Vb", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!m", name = "Eb", descriptor = "Lf;")
    private class36 field2096;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!m", name = "Cb", descriptor = "Lkd;")
    public static class73 field2094 = class126.method1070((byte) -66, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
    public static int field2087 = 0;

    @OriginalMember(owner = "client!m", name = "Ab", descriptor = "Lkd;")
    private static class73 field2092 = class126.method1070((byte) -66, "Loading textures )2 ");

    @OriginalMember(owner = "client!m", name = "Wb", descriptor = "Lkd;")
    private static class73 field2114 = class126.method1070((byte) -66, "flash1:");

    @OriginalMember(owner = "client!m", name = "Ib", descriptor = "Lkd;")
    public static class73 field2100 = class126.method1070((byte) -66, "titlebutton");

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "Lkd;")
    public static class73 field2082 = field2092;

    @OriginalMember(owner = "client!m", name = "Hb", descriptor = "Lkd;")
    public static class73 field2099 = field2114;

    @OriginalMember(owner = "client!m", name = "cc", descriptor = "Lkd;")
    public static class73 field2120 = field2114;

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "D")
    public double field2084;

    @OriginalMember(owner = "client!m", name = "Gb", descriptor = "D")
    private double field2098;

    @OriginalMember(owner = "client!m", name = "Kb", descriptor = "D")
    public double field2102;

    @OriginalMember(owner = "client!m", name = "Lb", descriptor = "D")
    private double field2103;

    @OriginalMember(owner = "client!m", name = "Ob", descriptor = "D")
    public double field2106;

    @OriginalMember(owner = "client!m", name = "Qb", descriptor = "D")
    private double field2108;

    @OriginalMember(owner = "client!m", name = "Tb", descriptor = "D")
    private double field2111;

    @OriginalMember(owner = "client!m", name = "Xb", descriptor = "D")
    private double field2115;

    @OriginalMember(owner = "client!m", name = "wb", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!m", name = "xb", descriptor = "I")
    private int field2089;

    @OriginalMember(owner = "client!m", name = "Bb", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!m", name = "Fb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!m", name = "Jb", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!m", name = "Nb", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!m", name = "Pb", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!m", name = "Rb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!m", name = "Zb", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "[Lde;")
    public static class27[] field2080;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIB)V")
    public static final void method701(int arg0, int arg1, int arg2, byte arg3) {
        field2109++;
        if (arg1 < 128 || arg0 < 128 || arg1 > 13056 || arg0 > 13056) {
            class11.field324 = -1;
            class42.field1136 = -1;
            return;
        }
        int var4 = class70.method585(class11.field320, arg1, arg0, (byte) 104) - arg2;
        int var5 = class29.field848[class122.field3118];
        int var6 = var4 - class23.field664;
        int var7 = arg1 - class30.field857;
        int var8 = class29.field833[class122.field3118];
        if (arg3 >= -20) {
            return;
        }
        int var9 = class29.field833[class42.field1128];
        int var10 = class29.field848[class42.field1128];
        int var11 = arg0 - class70.field1785;
        int var12 = var7 * var10 + var9 * var11 >> 16;
        int var13 = var10 * var11 - var7 * var9 >> 16;
        int var15 = var5 * var6 - var8 * var13 >> 16;
        int var16 = var5 * var13 + var6 * var8 >> 16;
        if (var16 < 50) {
            class42.field1136 = -1;
            class11.field324 = -1;
        } else {
            class11.field324 = (var12 << 9) / var16 + 256;
            class42.field1136 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        field2088++;
        class121 var2 = class72.method603(this.field2095, -1);
        class91 var3 = var2.method1037((byte) -123, this.field2083);
        if (arg0 != 11800) {
            method701(96, -34, 103, (byte) 43);
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method766(this.field2089);
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIII)V")
    public final void method702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2104) {
            double var6 = (double) (arg1 - this.field2086);
            double var8 = (double) (arg2 - this.field2121);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2102 = (double) this.field2119 * var6 / var10 + (double) this.field2086;
            this.field2084 = (double) this.field2119 * var8 / var10 + (double) this.field2121;
            this.field2106 = this.field2112;
        }
        field2117++;
        double var12 = (double) (this.field2118 + 1 - arg0);
        this.field2108 = ((double) arg2 - this.field2084) / var12;
        this.field2103 = ((double) arg1 - this.field2102) / var12;
        this.field2098 = Math.sqrt(this.field2108 * this.field2108 + this.field2103 * this.field2103);
        if (!this.field2104) {
            this.field2115 = -this.field2098 * Math.tan((double) this.field2110 * 0.02454369D);
        }
        if (arg4 <= 63) {
            this.field2121 = -98;
        }
        this.field2111 = ((double) arg3 - this.field2106 - this.field2115 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)V")
    public final void method703(boolean arg0, int arg1) {
        this.field2106 += this.field2111 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2115;
        this.field2115 += (double) arg1 * this.field2111;
        field2107++;
        this.field2104 = arg0;
        this.field2084 += (double) arg1 * this.field2108;
        this.field2102 += (double) arg1 * this.field2103;
        this.field2101 = (int) (Math.atan2(this.field2108, this.field2103) * 325.949D) + 1024 & 0x7FF;
        this.field2089 = (int) (Math.atan2(this.field2115, this.field2098) * 325.949D) & 0x7FF;
        if (this.field2096 == null) {
            return;
        }
        this.field2090 += arg1;
        while (true) {
            do {
                do {
                    if (this.field2096.field968[this.field2083] >= this.field2090) {
                        return;
                    }
                    this.field2090 -= this.field2096.field968[this.field2083];
                    this.field2083++;
                } while (this.field2083 < this.field2096.field976.length);
                this.field2083 -= this.field2096.field992;
            } while (this.field2083 >= 0 && this.field2083 < this.field2096.field976.length);
            this.field2083 = 0;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)Loc;")
    public static final class100 method704(byte arg0) {
        field2097++;
        try {
            if (arg0 != -5) {
                method704((byte) 45);
            }
            return (class100) Class.forName("o").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method705(int arg0) {
        field2100 = null;
        field2114 = null;
        if (arg0 <= 5) {
            return;
        }
        field2099 = null;
        field2080 = null;
        field2092 = null;
        field2094 = null;
        field2120 = null;
        field2082 = null;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    public static final void method706(byte arg0) {
        field2105++;
        for (class20 var1 = (class20) class58.field1538.method514((byte) -79); var1 != null; var1 = (class20) class58.field1538.method517(-107)) {
            if (class11.field320 != var1.field561 || var1.field547) {
                var1.method1147((byte) -58);
            } else if (class49.field1308 >= var1.field546) {
                var1.method165(-1, class125.field3166);
                if (var1.field547) {
                    var1.method1147((byte) -65);
                } else {
                    class34.field923.method48(var1.field561, var1.field560, var1.field571, var1.field551, 60, var1, 0, -1, false);
                }
            }
        }
        int var2 = 39 / ((-arg0 - 74) / 39);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2118 = arg6;
        this.field2110 = arg7;
        this.field2095 = arg0;
        this.field2116 = arg10;
        this.field2085 = arg5;
        this.field2086 = arg3;
        this.field2091 = arg9;
        this.field2121 = arg2;
        this.field2119 = arg8;
        this.field2112 = arg4;
        this.field2104 = false;
        this.field2113 = arg1;
        int var12 = class72.method603(this.field2095, -1).field3104;
        if (var12 == -1) {
            this.field2096 = null;
        } else {
            this.field2096 = class94.method782(-24669, var12);
        }
    }
}
