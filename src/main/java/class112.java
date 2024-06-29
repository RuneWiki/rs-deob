import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class112 extends class235 {

    @OriginalMember(owner = "client!kd", name = "sb", descriptor = "I")
    private int field1982 = 0;

    @OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
    private int field1999 = 0;

    @OriginalMember(owner = "client!kd", name = "wb", descriptor = "I")
    private int field1986 = -32768;

    @OriginalMember(owner = "client!kd", name = "Pb", descriptor = "Z")
    private boolean field2005 = false;

    @OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
    public int field1980;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!kd", name = "Ab", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    private int field1976;

    @OriginalMember(owner = "client!kd", name = "Ib", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!kd", name = "tb", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!kd", name = "yb", descriptor = "Lkg;")
    private class115 field1988;

    @OriginalMember(owner = "client!kd", name = "nb", descriptor = "Loc;")
    private static class151 field1977 = class137.method873(2, "flash2:");

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Loc;")
    public static class151 field1966 = field1977;

    @OriginalMember(owner = "client!kd", name = "Eb", descriptor = "Loc;")
    public static class151 field1994 = class137.method873(2, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "Loc;")
    public static class151 field1975 = field1977;

    @OriginalMember(owner = "client!kd", name = "xb", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!kd", name = "ob", descriptor = "Loh;")
    public static class156 field1978 = new class156(30);

    @OriginalMember(owner = "client!kd", name = "ub", descriptor = "D")
    private double field1984;

    @OriginalMember(owner = "client!kd", name = "Bb", descriptor = "D")
    public double field1991;

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "D")
    private double field1993;

    @OriginalMember(owner = "client!kd", name = "Kb", descriptor = "D")
    private double field2000;

    @OriginalMember(owner = "client!kd", name = "Lb", descriptor = "D")
    public double field2001;

    @OriginalMember(owner = "client!kd", name = "Mb", descriptor = "D")
    public double field2002;

    @OriginalMember(owner = "client!kd", name = "Nb", descriptor = "D")
    private double field2003;

    @OriginalMember(owner = "client!kd", name = "Ob", descriptor = "D")
    private double field2004;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
    private int field1981;

    @OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!kd", name = "zb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!kd", name = "Gb", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!kd", name = "Hb", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "[Lhh;")
    public static class84[] field1968;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "[Lhh;")
    public static class84[] field1970;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
    public final void method674(boolean arg0, int arg1) {
        this.field2002 += (double) arg1 * this.field1984;
        field1996++;
        this.field2005 = true;
        this.field2001 += (double) arg1 * this.field2000;
        this.field1991 += this.field1993 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2003;
        this.field2003 += (double) arg1 * this.field1993;
        this.field1972 = (int) (Math.atan2(this.field1984, this.field2000) * 325.949D) + 1024 & 0x7FF;
        this.field1981 = (int) (Math.atan2(this.field2003, this.field2004) * 325.949D) & 0x7FF;
        if (arg0 || this.field1988 == null) {
            return;
        }
        this.field1982 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1988.field2051[this.field1999] >= this.field1982) {
                        return;
                    }
                    this.field1982 -= this.field1988.field2051[this.field1999];
                    this.field1999++;
                } while (this.field1988.field2056.length > this.field1999);
                this.field1999 -= this.field1988.field2055;
            } while (this.field1999 >= 0 && this.field1988.field2056.length > this.field1999);
            this.field1999 = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static int method675(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class18 var11 = this.method677(-2744);
        field1997++;
        if (var11 != null) {
            var11.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1986 = var11.method74();
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)I")
    public static final int method676(int arg0, int arg1, int arg2) {
        field1989++;
        if (arg0 != -561200762) {
            method679(-79, null);
        }
        int var3 = class189.method1171((byte) 122, arg2 - 1, arg1 - 1) + class189.method1171((byte) 24, arg2 - 1, arg1 + 1) + class189.method1171((byte) 67, arg2 + 1, arg1 + -1) + class189.method1171((byte) 76, arg2 + 1, arg1 + 1);
        int var4 = class189.method1171((byte) 50, arg2, arg1 - 1) + class189.method1171((byte) 69, arg2, arg1 + 1) + class189.method1171((byte) 105, arg2 - 1, arg1) + class189.method1171((byte) 96, arg2 + 1, arg1);
        int var5 = class189.method1171((byte) 118, arg2, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
    public final int method74() {
        field1979++;
        return this.field1986;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lbf;")
    private final class18 method677(int arg0) {
        class52 var2 = class19.method166(this.field1965, 22883);
        if (arg0 != -2744) {
            method678(-20);
        }
        class18 var3 = var2.method359(false, this.field1999);
        field1995++;
        if (var3 == null) {
            return null;
        } else {
            var3.method160(this.field1981);
            return var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1977 = null;
        if (arg0 != 28920) {
            return;
        }
        field1994 = null;
        field1978 = null;
        field1975 = null;
        field1968 = null;
        field1966 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[B)V")
    public static final void method679(int arg0, byte[] arg1) {
        field1985++;
        int var2 = 0;
        if (arg0 != -1) {
            field1966 = null;
        }
        while (true) {
            while (var2 < arg1.length) {
                int var3 = (arg1[var2++] & 0xFF) * 64 - class63.field1228;
                int var4 = (arg1[var2++] & 0xFF) * 64 - class36.field759;
                if (var3 > 0 && var4 > 0 && class217.field3788 > var3 + 64 && class27.field581 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class27.field581 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class107.field1891[var5][var6] == null) {
                                    class107.field1891[var5][var6] = new byte[4096];
                                }
                                class107.field1891[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class180.field3264[var5][var6] == null) {
                                    class180.field3264[var5][var6] = new byte[4096];
                                }
                                class180.field3264[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public final void method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2005) {
            double var6 = (double) (arg0 - this.field1976);
            double var8 = (double) (arg4 - this.field1967);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2002 = (double) this.field1992 * var6 / var10 + (double) this.field1976;
            this.field1991 = this.field1990;
            this.field2001 = (double) this.field1992 * var8 / var10 + (double) this.field1967;
        }
        field1974++;
        if (arg2 >= -3) {
            return;
        }
        double var12 = (double) (this.field1973 + 1 - arg1);
        this.field2000 = ((double) arg4 - this.field2001) / var12;
        this.field1984 = ((double) arg0 - this.field2002) / var12;
        this.field2004 = Math.sqrt(this.field2000 * this.field2000 + this.field1984 * this.field1984);
        if (!this.field2005) {
            this.field2003 = -this.field2004 * Math.tan((double) this.field1969 * 0.02454369D);
        }
        this.field1993 = ((double) arg3 - this.field1991 - this.field2003 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1992 = arg8;
        this.field1980 = arg9;
        this.field2005 = false;
        this.field1967 = arg3;
        this.field1990 = arg4;
        this.field1965 = arg0;
        this.field1976 = arg2;
        this.field1998 = arg5;
        this.field1983 = arg10;
        this.field1973 = arg6;
        this.field1969 = arg7;
        this.field1971 = arg1;
        int var12 = class19.method166(this.field1965, 22883).field1062;
        if (var12 == -1) {
            this.field1988 = null;
        } else {
            this.field1988 = class197.method1233(93, var12);
        }
    }
}
