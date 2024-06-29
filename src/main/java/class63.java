import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class63 extends class219 {

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    private int field866 = -1;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "I")
    private int field870 = -1;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    private int field878 = -32768;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lwe;")
    private class15 field865 = null;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
    private boolean field873 = false;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field889;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lsi;")
    private class198 field869;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    private int field890;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "Ljava/lang/String;")
    public static String field877 = "red:";

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lrh;")
    public static class46 field867 = new class46();

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Ldl;")
    public static class123 field887;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "Ldl;")
    public static class123 field892;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lql;")
    private class217 field885;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    private final void method436(int arg0, int arg1, int arg2) {
        int var4 = -37 % ((-arg0 - 57) / 57);
        field862++;
        if (this.field869 == null) {
            return;
        }
        int var5 = class111.field1684 - this.field890;
        if (var5 > 100 && this.field869.field3079 > 0) {
            int var6 = this.field869.field3107.length - this.field869.field3079;
            while (var6 > this.field860 && this.field869.field3080[this.field860] < var5) {
                var5 -= this.field869.field3080[this.field860];
                this.field860++;
            }
            if (this.field860 >= var6) {
                int var7 = 0;
                for (int var8 = var6; var8 < this.field869.field3107.length; var8++) {
                    var7 += this.field869.field3080[var8];
                }
                var5 %= var7;
            }
            this.field863 = this.field860 + 1;
            if (this.field869.field3107.length <= this.field863) {
                this.field863 -= this.field869.field3079;
                if (this.field863 < 0 || this.field863 >= this.field869.field3107.length) {
                    this.field863 = -1;
                }
            }
        }
        while (this.field869.field3080[this.field860] < var5) {
            class279.method1870((byte) 65, false, this.field869, this.field860, arg1, arg2);
            var5 -= this.field869.field3080[this.field860];
            this.field860++;
            if (this.field869.field3107.length <= this.field860) {
                this.field860 -= this.field869.field3079;
                if (this.field860 < 0 || this.field860 >= this.field869.field3107.length) {
                    this.field869 = null;
                    break;
                }
            }
            this.field863 = this.field860 + 1;
            if (this.field863 >= this.field869.field3107.length) {
                this.field863 -= this.field869.field3079;
                if (this.field863 < 0 || this.field869.field3107.length <= this.field863) {
                    this.field863 = -1;
                }
            }
        }
        this.field890 = class111.field1684 - var5;
        this.field868 = var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method437(byte arg0, String arg1) {
        field871++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 != -120) {
            method439(-12, 52);
        }
        while (var4 < var2) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var5, 16) + " in CharSequence");
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10) {
        field882++;
        class219 var13 = this.method441((byte) -112);
        if (var13 != null) {
            var13.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field885);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method438(int arg0) {
        field887 = null;
        field867 = null;
        if (arg0 != -1) {
            field888 = -23;
        }
        field877 = null;
        field892 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method439(int arg0, int arg1) {
        if (arg0 != 26419) {
            field888 = -55;
        }
        field880++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
    public final int method363() {
        field861++;
        return this.field878;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field876++;
        this.method436(123, arg3, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)Lhi;")
    private final class219 method440(int arg0, boolean arg1) {
        field879++;
        boolean var3 = class200.field3128 != class198.field3108;
        class181 var4 = class25.method224(this.field891, 0);
        int var5 = var4.field2809;
        if (var4.field2803 != null) {
            var4 = var4.method1268(256);
        }
        if (var4 == null) {
            return null;
        }
        if (class80.field1151 != 0 && this.field873 && (this.field869 == null || this.field869 != null && this.field869.field3087 != var4.field2809)) {
            int var6 = var4.field2809;
            if (var4.field2809 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field869 = null;
            } else {
                this.field869 = class104.method688(var6, 30091);
            }
            if (this.field869 != null) {
                if (var4.field2846 && this.field869.field3079 != -1) {
                    this.field860 = (int) ((double) this.field869.field3107.length * Math.random());
                    this.field890 -= (int) ((double) this.field869.field3080[this.field860] * Math.random());
                } else {
                    this.field890 = class111.field1684 - 1;
                    this.field860 = 0;
                }
            }
        }
        int var7 = this.field881 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field2813;
            var9 = var4.field2829;
        } else {
            var8 = var4.field2829;
            var9 = var4.field2813;
        }
        int var10 = (var8 + 1 >> 1) + this.field875;
        int var11 = (var8 >> 1) + this.field875;
        int var12 = this.field874 + (var9 >> 1);
        int var13 = (var9 + 1 >> 1) + this.field874;
        this.method436(121, var11 * 128, var12 * 128);
        boolean var14 = !var3 && var4.field2870 && (this.field866 != var4.field2872 || (this.field870 != this.field860 || this.field869 != null && (this.field869.field3083 || class200.field3132) && this.field863 != this.field860) && class65.field912 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class200.field3128[this.field889];
        int var16 = var15[var11][var12] + var15[var10][var12] - (-var15[var10][var13] + -var15[var11][var13]) >> 2;
        int var17 = (this.field875 << 7) + (var8 << 6);
        int var18 = (this.field874 << 7) + (var9 << 6);
        int var19 = 61 / ((arg0 + 92) / 34);
        int[][] var20 = null;
        boolean var21 = this.field865 == null;
        if (var3) {
            var20 = class198.field3108[0];
        } else if (this.field889 < 3) {
            var20 = class200.field3128[this.field889 + 1];
        }
        class141 var22;
        if (this.field869 == null) {
            var22 = var4.method1269(this.field886, var14, false, this.field881, var18, var17, var15, var16, 2, var21 ? class155.field2303 : this.field865, var20);
        } else {
            var22 = var4.method1271(var14, this.field869, var18, this.field886, this.field868, var16, var17, var20, this.field863, this.field860, var21 ? class155.field2303 : this.field865, var15, this.field881, (byte) -28);
        }
        return var22 == null ? null : var22.field2073;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Lhi;")
    public final class219 method441(byte arg0) {
        if (arg0 > -70) {
            method439(-87, 71);
        }
        field884++;
        return this.method440(70, false);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIIIIZLhi;)V")
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class219 arg8) {
        this.field874 = arg5;
        this.field875 = arg4;
        this.field891 = arg0;
        this.field881 = arg2;
        this.field889 = arg3;
        this.field886 = arg1;
        if (arg6 != -1) {
            this.field869 = class104.method688(arg6, 30091);
            this.field860 = 0;
            if (this.field869.field3107.length <= 1) {
                this.field863 = 0;
            } else {
                this.field863 = 1;
            }
            this.field890 = class111.field1684 - 1;
            this.field868 = 1;
            if (this.field869.field3086 == 0 && arg8 != null && arg8 instanceof class63) {
                class63 var10 = (class63) arg8;
                if (this.field869 == var10.field869) {
                    this.field860 = var10.field860;
                    this.field863 = var10.field863;
                    this.field890 = var10.field890;
                    this.field868 = var10.field868;
                    return;
                }
            }
            if (arg7 && this.field869.field3079 != -1) {
                this.field860 = (int) ((double) this.field869.field3107.length * Math.random());
                this.field863 = this.field860 + 1;
                if (this.field869.field3107.length <= this.field863) {
                    this.field863 -= this.field869.field3079;
                    if (this.field863 < 0 || this.field863 >= this.field869.field3107.length) {
                        this.field863 = -1;
                    }
                }
                this.field868 = (int) (Math.random() * (double) this.field869.field3080[this.field860]) + 1;
                this.field890 = class111.field1684 - this.field868;
            }
        }
        if (arg8 == null) {
            class181 var11 = class25.method224(this.field891, 0);
            if (var11.field2803 != null) {
                this.field873 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field893++;
    }
}
