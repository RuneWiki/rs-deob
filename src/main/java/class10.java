import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    private int field158 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "J")
    private long field168 = -1L;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "J")
    private long field152 = -1L;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lne;")
    private class91 field154;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "J")
    private long field150;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "J")
    private long field148;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "[B")
    private byte[] field155;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "J")
    private long field145;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "[B")
    private byte[] field157;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lrd;")
    private static class114 field149 = class84.method656(" million", (byte) 114);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lrd;")
    public static class114 field151 = class84.method656("", (byte) 118);

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lrd;")
    public static class114 field153 = class84.method656("nicht hergestellt werden)3", (byte) 116);

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lrd;")
    public static class114 field163 = field149;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "J")
    private long field159;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    private final void method75(int arg0) throws IOException {
        this.field169 = 0;
        if (this.field159 != this.field145) {
            this.field154.method704(this.field145, (byte) 80);
            this.field159 = this.field145;
        }
        int var2 = 121 % ((arg0 - 14) / 52);
        this.field168 = this.field145;
        field146++;
        while (this.field157.length > this.field169) {
            int var3 = this.field154.method702(0, this.field157, this.field169, this.field157.length - this.field169);
            if (var3 == -1) {
                break;
            }
            this.field159 += var3;
            this.field169 += var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIII)V")
    public final void method76(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -12112) {
            this.method78(100L, (byte) -78);
        }
        field161++;
        try {
            if (arg0.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg0.length);
            }
            if (this.field152 != -1L && this.field145 >= this.field152 && (long) this.field158 + this.field152 >= (long) arg3 + this.field145) {
                class35.method251(this.field155, (int) (this.field145 - this.field152), arg0, arg1, arg3);
                this.field145 += arg3;
                return;
            }
            long var5 = this.field145;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field168 <= this.field145 && this.field145 < (long) this.field169 + this.field168) {
                int var9 = (int) (this.field168 + (long) this.field169 - this.field145);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class35.method251(this.field157, (int) (this.field145 - this.field168), arg0, arg1, var9);
                arg1 += var9;
                this.field145 += var9;
            }
            if (arg3 > this.field157.length) {
                this.field154.method704(this.field145, (byte) 77);
                this.field159 = this.field145;
                while (arg3 > 0) {
                    int var10 = this.field154.method702(0, arg0, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field159 += var10;
                    arg3 -= var10;
                    arg1 += var10;
                    this.field145 += var10;
                }
            } else if (arg3 > 0) {
                this.method75(arg2 ^ 0xFFFFD0E9);
                int var11 = arg3;
                if (this.field169 < arg3) {
                    var11 = this.field169;
                }
                class35.method251(this.field157, 0, arg0, arg1, var11);
                arg1 += var11;
                arg3 -= var11;
                this.field145 += var11;
            }
            if (this.field152 != -1L) {
                if (this.field145 < this.field152 && arg3 > 0) {
                    int var12 = arg1 + (int) (this.field152 - this.field145);
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field145++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field152 >= var5 && (long) var8 + var5 > this.field152) {
                    var15 = this.field152;
                } else if (var5 >= this.field152 && var5 < (long) this.field158 + this.field152) {
                    var15 = var5;
                }
                if (var5 < (long) this.field158 + this.field152 && (long) var8 + var5 >= (long) this.field158 + this.field152) {
                    var13 = (long) this.field158 + this.field152;
                } else if (this.field152 < (long) var8 + var5 && this.field152 + (long) this.field158 >= (long) var8 + var5) {
                    var13 = (long) var8 + var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class35.method251(this.field155, (int) (var15 - this.field152), arg0, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field145) {
                        arg3 = (int) ((long) arg3 + this.field145 - var13);
                        this.field145 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field159 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIII)I")
    public static final int method77(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -39) {
            field149 = null;
        }
        field166++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(JB)V")
    public final void method78(long arg0, byte arg1) {
        field170++;
        if (arg0 >= 0L) {
            this.field145 = arg0;
            int var4 = 68 % ((-arg1 - 72) / 36);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)J")
    public final long method79(int arg0) {
        if (arg0 == 19398920) {
            field165++;
            return this.field148;
        } else {
            return 78L;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public static final boolean method80(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class39.field832[var12][var37] = 0;
                class122.field2847[var12][var37] = 99999999;
            }
        }
        field160++;
        class39.field832[arg2][arg1] = 99;
        int var13 = arg2;
        class122.field2847[arg2][arg1] = 0;
        byte var14 = 0;
        class34.field673[var14] = arg2;
        int var15 = arg1;
        int var16 = 32 / ((-arg8 - 46) / 36);
        int var17 = 0;
        int var38 = var14 + 1;
        class26.field516[var14] = arg1;
        boolean var18 = false;
        int var19 = class34.field673.length;
        int[][] var20 = class90.field2132[class20.field346].field1983;
        while (var38 != var17) {
            var15 = class26.field516[var17];
            var13 = class34.field673[var17];
            var17 = (var17 + 1) % var19;
            if (arg0 == var13 && arg5 == var15) {
                var18 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class90.field2132[class20.field346].method669(-359, var15, var13, arg10 - 1, arg0, arg9, arg5)) {
                    var18 = true;
                    break;
                }
                if (arg10 < 10 && class90.field2132[class20.field346].method675(arg0, var15, arg5, -103, arg9, arg10 - 1, var13)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg6 != 0 && class90.field2132[class20.field346].method682((byte) -122, arg11, arg0, arg5, var13, arg7, arg6, var15)) {
                var18 = true;
                break;
            }
            int var36 = class122.field2847[var13][var15] + 1;
            if (var13 > 0 && class39.field832[var13 - 1][var15] == 0 && (var20[var13 - 1][var15] & 0x1280108) == 0) {
                class34.field673[var38] = var13 - 1;
                class26.field516[var38] = var15;
                var38 = (var38 + 1) % var19;
                class39.field832[var13 - 1][var15] = 2;
                class122.field2847[var13 - 1][var15] = var36;
            }
            if (var13 < 103 && class39.field832[var13 + 1][var15] == 0 && (var20[var13 + 1][var15] & 0x1280180) == 0) {
                class34.field673[var38] = var13 + 1;
                class26.field516[var38] = var15;
                class39.field832[var13 + 1][var15] = 8;
                var38 = (var38 + 1) % var19;
                class122.field2847[var13 + 1][var15] = var36;
            }
            if (var15 > 0 && class39.field832[var13][var15 - 1] == 0 && (var20[var13][var15 - 1] & 0x1280102) == 0) {
                class34.field673[var38] = var13;
                class26.field516[var38] = var15 - 1;
                class39.field832[var13][var15 - 1] = 1;
                var38 = (var38 + 1) % var19;
                class122.field2847[var13][var15 - 1] = var36;
            }
            if (var15 < 103 && class39.field832[var13][var15 + 1] == 0 && (var20[var13][var15 + 1] & 0x1280120) == 0) {
                class34.field673[var38] = var13;
                class26.field516[var38] = var15 + 1;
                var38 = (var38 + 1) % var19;
                class39.field832[var13][var15 + 1] = 4;
                class122.field2847[var13][var15 + 1] = var36;
            }
            if (var13 > 0 && var15 > 0 && class39.field832[var13 - 1][var15 - 1] == 0 && (var20[var13 - 1][var15 - 1] & 0x128010E) == 0 && (var20[var13 - 1][var15] & 0x1280108) == 0 && (var20[var13][var15 - 1] & 0x1280102) == 0) {
                class34.field673[var38] = var13 - 1;
                class26.field516[var38] = var15 - 1;
                var38 = (var38 + 1) % var19;
                class39.field832[var13 - 1][var15 - 1] = 3;
                class122.field2847[var13 - 1][var15 - 1] = var36;
            }
            if (var13 < 103 && var15 > 0 && class39.field832[var13 + 1][var15 - 1] == 0 && (var20[var13 + 1][var15 - 1] & 0x1280183) == 0 && (var20[var13 + 1][var15] & 0x1280180) == 0 && (var20[var13][var15 - 1] & 0x1280102) == 0) {
                class34.field673[var38] = var13 + 1;
                class26.field516[var38] = var15 - 1;
                class39.field832[var13 + 1][var15 - 1] = 9;
                var38 = (var38 + 1) % var19;
                class122.field2847[var13 + 1][var15 - 1] = var36;
            }
            if (var13 > 0 && var15 < 103 && class39.field832[var13 - 1][var15 + 1] == 0 && (var20[var13 - 1][var15 + 1] & 0x1280138) == 0 && (var20[var13 - 1][var15] & 0x1280108) == 0 && (var20[var13][var15 + 1] & 0x1280120) == 0) {
                class34.field673[var38] = var13 - 1;
                class26.field516[var38] = var15 + 1;
                var38 = (var38 + 1) % var19;
                class39.field832[var13 - 1][var15 + 1] = 6;
                class122.field2847[var13 - 1][var15 + 1] = var36;
            }
            if (var13 < 103 && var15 < 103 && class39.field832[var13 + 1][var15 + 1] == 0 && (var20[var13 + 1][var15 + 1] & 0x12801E0) == 0 && (var20[var13 + 1][var15] & 0x1280180) == 0 && (var20[var13][var15 + 1] & 0x1280120) == 0) {
                class34.field673[var38] = var13 + 1;
                class26.field516[var38] = var15 + 1;
                var38 = (var38 + 1) % var19;
                class39.field832[var13 + 1][var15 + 1] = 12;
                class122.field2847[var13 + 1][var15 + 1] = var36;
            }
        }
        class16.field322 = 0;
        if (!var18) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg0 - var22; var24 <= arg0 + var22; var24++) {
                for (int var25 = arg5 - var22; var25 <= arg5 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class122.field2847[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg0) {
                            var26 = arg0 - var24;
                        } else if (arg0 + arg11 - 1 < var24) {
                            var26 = var24 + 1 - arg11 - arg0;
                        }
                        int var27 = 0;
                        if (arg5 > var25) {
                            var27 = arg5 - var25;
                        } else if (var25 > arg6 + arg5 - 1) {
                            var27 = var25 + 1 - arg5 - arg6;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class122.field2847[var24][var25] < var23) {
                            var15 = var25;
                            var23 = class122.field2847[var24][var25];
                            var21 = var28;
                            var13 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg1 == var15) {
                return false;
            }
            class16.field322 = 1;
        }
        byte var29 = 0;
        class34.field673[var29] = var13;
        int var39 = var29 + 1;
        class26.field516[var29] = var15;
        int var30;
        int var31 = var30 = class39.field832[var13][var15];
        while (arg2 != var13 || arg1 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class34.field673[var39] = var13;
                class26.field516[var39++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            var31 = class39.field832[var13][var15];
        }
        if (var39 > 0) {
            int var32 = var39;
            if (var39 > 25) {
                var32 = 25;
            }
            var39--;
            int var33 = class34.field673[var39];
            int var34 = class26.field516[var39];
            if (arg3 == 0) {
                class65.field1399++;
                class61.field1303.method1054(8, 9);
                class61.field1303.method478((byte) 114, var32 + var32 + 3);
            }
            if (arg3 == 1) {
                class61.field1303.method1054(8, 200);
                class127.field3040++;
                class61.field1303.method478((byte) 106, var32 + var32 + 3 + 14);
            }
            if (arg3 == 2) {
                class61.field1303.method1054(8, 239);
                class106.field2434++;
                class61.field1303.method478((byte) -49, var32 + var32 + 3);
            }
            class85.field1897 = class26.field516[0];
            class64.field1371 = class34.field673[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class61.field1303.method454(class34.field673[var39] - var33, -4);
                class61.field1303.method478((byte) 116, class26.field516[var39] - var34);
            }
            class61.field1303.method450(0, class101.field2339[82] ? 1 : 0);
            class61.field1303.method465(-19962, class65.field1408 + var34);
            class61.field1303.method496(class72.field1611 + var33, (byte) 100);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[BI)V")
    public final void method81(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 >= -30) {
            this.method78(-107L, (byte) 119);
        }
        field162++;
        try {
            if ((long) arg0 + this.field145 > this.field148) {
                this.field148 = (long) arg0 + this.field145;
            }
            if (this.field152 != -1L && (this.field152 > this.field145 || (long) this.field158 + this.field152 < this.field145)) {
                this.method84(true);
            }
            if (this.field152 != -1L && this.field145 + (long) arg0 > (long) this.field155.length + this.field152) {
                int var5 = (int) (this.field152 + (long) this.field155.length - this.field145);
                arg0 -= var5;
                class35.method251(arg2, arg1, this.field155, (int) (this.field145 - this.field152), var5);
                this.field145 += var5;
                arg1 += var5;
                this.field158 = this.field155.length;
                this.method84(true);
            }
            if (this.field155.length < arg0) {
                if (this.field159 != this.field145) {
                    this.field154.method704(this.field145, (byte) -62);
                    this.field159 = this.field145;
                }
                this.field154.method699(-126, arg0, arg2, arg1);
                this.field159 += arg0;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field150 < this.field159) {
                    this.field150 = this.field159;
                }
                if (this.field145 >= this.field168 && this.field145 < this.field168 + (long) this.field169) {
                    var6 = this.field145;
                } else if (this.field145 <= this.field168 && (long) arg0 + this.field145 > this.field168) {
                    var6 = this.field168;
                }
                if ((long) arg0 + this.field145 > this.field168 && (long) arg0 + this.field145 <= (long) this.field169 + this.field168) {
                    var8 = (long) arg0 + this.field145;
                } else if ((long) this.field169 + this.field168 > this.field145 && (long) this.field169 + this.field168 <= this.field145 - -((long) arg0)) {
                    var8 = (long) this.field169 + this.field168;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class35.method251(arg2, (int) ((long) arg1 + var6 - this.field145), this.field157, (int) (var6 - this.field168), var10);
                }
                this.field145 += arg0;
            } else if (arg0 > 0) {
                if (this.field152 == -1L) {
                    this.field152 = this.field145;
                }
                class35.method251(arg2, arg1, this.field155, (int) (this.field145 - this.field152), arg0);
                this.field145 += arg0;
                if (this.field145 - this.field152 > (long) this.field158) {
                    this.field158 = (int) (this.field145 - this.field152);
                }
            }
        } catch (IOException var12) {
            this.field159 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final void method82(byte arg0) throws IOException {
        this.method84(true);
        if (arg0 == -121) {
            field164++;
            this.field154.method700(70);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method83(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field149 = null;
        field153 = null;
        field151 = null;
        field163 = null;
        field167 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lne;II)V")
    public class10(class91 arg0, int arg1, int arg2) throws IOException {
        this.field154 = arg0;
        this.field148 = this.field150 = arg0.method701((byte) 122);
        this.field155 = new byte[arg2];
        this.field145 = 0L;
        this.field157 = new byte[arg1];
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    private final void method84(boolean arg0) throws IOException {
        field147++;
        if (!arg0) {
            method77((byte) -59, -54, 8, 83);
        }
        if (this.field152 == -1L) {
            return;
        }
        if (this.field159 != this.field152) {
            this.field154.method704(this.field152, (byte) 26);
            this.field159 = this.field152;
        }
        this.field154.method699(-82, this.field158, this.field155, 0);
        this.field159 += this.field158;
        long var2 = -1L;
        if (this.field168 <= this.field152 && this.field152 < (long) this.field169 + this.field168) {
            var2 = this.field152;
        } else if (this.field152 <= this.field168 && (long) this.field158 + this.field152 > this.field168) {
            var2 = this.field168;
        }
        if (this.field150 < this.field159) {
            this.field150 = this.field159;
        }
        long var4 = -1L;
        if (this.field168 < (long) this.field158 + this.field152 && (long) this.field158 + this.field152 <= (long) this.field169 + this.field168) {
            var4 = (long) this.field158 + this.field152;
        } else if (this.field152 < (long) this.field169 + this.field168 && this.field168 + (long) this.field169 <= (long) this.field158 + this.field152) {
            var4 = this.field168 + (long) this.field169;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class35.method251(this.field155, (int) (var2 - this.field152), this.field157, (int) (var2 - this.field168), var6);
        }
        this.field158 = 0;
        this.field152 = -1L;
    }
}
