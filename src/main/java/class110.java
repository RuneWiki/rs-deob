import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class110 extends class255 {

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    private int field1978 = 0;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Z")
    private boolean field1979 = false;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    private int field1991 = -32768;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    private int field1998 = 0;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    private int field1963;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    private int field1990;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    private int field1983;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "Leg;")
    private class142 field1995;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field1973 = 0;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "Lbd;")
    public static class162 field1989 = class17.method142(0, "M");

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field1999 = 0;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "D")
    private double field1968;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "D")
    private double field1969;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "D")
    public double field1974;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "D")
    private double field1975;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "D")
    private double field1984;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "D")
    public double field1988;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "D")
    public double field2001;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "D")
    private double field2002;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLpm;)V", line = 14)
    public static final void method886(boolean arg0, class99 arg1) {
        field1980++;
        short var2 = 256;
        for (int var3 = 0; var3 < class10.field120.length; var3++) {
            class10.field120[var3] = 0;
        }
        if (!arg0) {
            field1977 = 42;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class10.field120[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class208.field3513[var9] = (class10.field120[var9 - 1] + class10.field120[var9 - 128] + class10.field120[var9 + 1] + class10.field120[var9 - -128]) / 4;
                }
            }
            int[] var10 = class10.field120;
            class10.field120 = class208.field3513;
            class208.field3513 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field557; var12++) {
            for (int var13 = 0; var13 < arg1.field556; var13++) {
                if (arg1.field1789[var11++] != 0) {
                    int var14 = arg1.field545 + var13 + 16;
                    int var15 = var12 + arg1.field543 + 16;
                    int var16 = var14 + (var15 << 7);
                    class10.field120[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I", line = 113)
    public static int method887(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V", line = 130)
    public static final void method888(int arg0, int arg1, int arg2, int arg3) {
        class63 var4 = class46.method332(11, arg1, -12770);
        field1982++;
        var4.method430(false);
        var4.field971 = arg0;
        var4.field980 = arg3;
        int var5 = 33 % ((arg2 + 30) / 49);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()I", line = 148)
    public final int method46() {
        field1993++;
        return this.field1991;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V", line = 160)
    public final void method889(int arg0, int arg1) {
        this.field1974 += this.field1969 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2002;
        this.field1988 += (double) arg1 * this.field1984;
        this.field1979 = true;
        this.field2002 += (double) arg1 * this.field1969;
        field1986++;
        this.field2001 += (double) arg1 * this.field1968;
        this.field1987 = (int) (Math.atan2(this.field1968, this.field1984) * 325.949D) + 1024 & 0x7FF;
        this.field1965 = (int) (Math.atan2(this.field2002, this.field1975) * 325.949D) & 0x7FF;
        if (this.field1995 != null) {
            this.field1998 += arg1;
            label30: while (true) {
                do {
                    do {
                        if (this.field1995.field2527[this.field1978] >= this.field1998) {
                            break label30;
                        }
                        this.field1998 -= this.field1995.field2527[this.field1978];
                        this.field1978++;
                    } while (this.field1978 < this.field1995.field2522.length);
                    this.field1978 -= this.field1995.field2530;
                } while (this.field1978 >= 0 && this.field1978 < this.field1995.field2522.length);
                this.field1978 = 0;
            }
        }
        if (arg0 >= -71) {
            this.method46();
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 306)
    public class110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1963 = arg4;
        this.field1990 = arg2;
        this.field1970 = arg9;
        this.field1997 = arg1;
        this.field1979 = false;
        this.field1992 = arg0;
        this.field1971 = arg6;
        this.field1967 = arg8;
        this.field1983 = arg7;
        this.field1996 = arg3;
        this.field1966 = arg5;
        this.field1964 = arg10;
        int var12 = class297.method2038(-67, this.field1992).field674;
        if (var12 == -1) {
            this.field1995 = null;
        } else {
            this.field1995 = class139.method1084(-127, var12);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 211)
    public static void method890(int arg0) {
        field1989 = null;
        if (arg0 <= 78) {
            method890(-93);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Lhi;", line = 228)
    private final class176 method891(int arg0) {
        if (arg0 != 0) {
            this.field1984 = -0.4276271847044733D;
        }
        class42 var2 = class297.method2038(arg0 - 112, this.field1992);
        field1976++;
        class176 var3 = var2.method316(this.field1978, true);
        if (var3 == null) {
            return null;
        } else {
            var3.method64(this.field1965);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 247)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class176 var11 = this.method891(0);
        field2000++;
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1991 = var11.method46();
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIBI)V", line = 275)
    public final void method892(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1985++;
        if (!this.field1979) {
            double var6 = (double) (arg2 - this.field1990);
            double var8 = (double) (arg1 - this.field1996);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1974 = (double) this.field1963;
            this.field2001 = (double) this.field1967 * var6 / var10 + (double) this.field1990;
            this.field1988 = (double) this.field1967 * var8 / var10 + (double) this.field1996;
        }
        double var12 = (double) (this.field1971 + 1 - arg0);
        this.field1968 = ((double) arg2 - this.field2001) / var12;
        this.field1984 = ((double) arg1 - this.field1988) / var12;
        this.field1975 = Math.sqrt(this.field1984 * this.field1984 + this.field1968 * this.field1968);
        if (!this.field1979) {
            this.field2002 = -this.field1975 * Math.tan((double) this.field1983 * 0.02454369D);
        }
        if (arg3 != 127) {
            field1973 = 26;
        }
        this.field1969 = ((double) arg4 - this.field1974 - this.field2002 * var12) * 2.0D / (var12 * var12);
    }
}
