import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class235 {

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "J")
    private long field4198 = -1L;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
    private long field4181 = -1L;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field4205 = 0;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Lo;")
    private class171 field4206;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "J")
    private long field4196;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "J")
    private long field4182;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "[B")
    private byte[] field4207;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[B")
    private byte[] field4188;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "J")
    private long field4190;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lsg;")
    public static class30 field4189 = class167.method1221((byte) 33, ")1");

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
    public static int[] field4193 = new int[2];

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lsg;")
    public static class30 field4191 = class167.method1221((byte) 33, "m");

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lsg;")
    public static class30 field4194 = class167.method1221((byte) 33, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "[I")
    public static int[] field4202 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "J")
    private long field4185;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[I")
    public static int[] field4187;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method1664(int arg0, int arg1, int arg2) {
        field4192++;
        if (arg2 != -22923) {
            field4189 = null;
        }
        class68 var3 = class103.method830(arg0, 4, 12);
        var3.method608(false);
        var3.field1484 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    private final void method1665(int arg0) throws IOException {
        this.field4197 = 0;
        if (this.field4190 != this.field4185) {
            this.field4206.method1259(this.field4190, (byte) -65);
            this.field4185 = this.field4190;
        }
        this.field4181 = this.field4190;
        if (arg0 != -200000001) {
            method1664(106, -60, -75);
        }
        field4203++;
        while (this.field4207.length > this.field4197) {
            int var2 = this.field4207.length - this.field4197;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4206.method1260(var2, -1, this.field4207, this.field4197);
            if (var3 == -1) {
                break;
            }
            this.field4197 += var3;
            this.field4185 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[B)V")
    public final void method1666(int arg0, byte[] arg1) throws IOException {
        this.method1672(arg0, arg1, arg1.length, true);
        field4199++;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method1667(int arg0) {
        field4189 = null;
        if (arg0 != -1) {
            return;
        }
        field4194 = null;
        field4202 = null;
        field4187 = null;
        field4193 = null;
        field4191 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)J")
    public final long method1668(int arg0) {
        int var2 = -38 % ((arg0 - 7) / 41);
        field4200++;
        return this.field4182;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
    public static final void method1669(int arg0, byte arg1) {
        field4183++;
        class109 var2 = (class109) class208.field3730.method1168(-3, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        int var4 = 4 / ((arg1 - 22) / 49);
        while (var2.field2195.length > var3) {
            var2.field2195[var3] = -1;
            var2.field2199[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public final void method1670(byte arg0) throws IOException {
        field4209++;
        if (arg0 != -75) {
            this.method1674(122);
        }
        this.method1676(0);
        this.field4206.method1258(arg0 ^ 0xFFFFEFCB);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class231 var20 = new class231(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class71.field1613[var21][arg1][arg2] == null) {
                    class71.field1613[var21][arg1][arg2] = new class195(var21, arg1, arg2);
                }
            }
            class71.field1613[arg0][arg1][arg2].field3535 = var20;
        } else if (arg3 == 1) {
            class231 var22 = new class231(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class71.field1613[var23][arg1][arg2] == null) {
                    class71.field1613[var23][arg1][arg2] = new class195(var23, arg1, arg2);
                }
            }
            class71.field1613[arg0][arg1][arg2].field3535 = var22;
        } else {
            class10 var24 = new class10(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class71.field1613[var25][arg1][arg2] == null) {
                    class71.field1613[var25][arg1][arg2] = new class195(var25, arg1, arg2);
                }
            }
            class71.field1613[arg0][arg1][arg2].field3521 = var24;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BIZ)V")
    public final void method1672(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field4208++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field4198 != -1L && this.field4190 >= this.field4198 && (this.field4198 + ((long) this.field4205)) >= (this.field4190 + ((long) arg2))) {
                class26.method235(this.field4188, (int) (this.field4190 - this.field4198), arg1, arg0, arg2);
                this.field4190 += (long) arg2;
                return;
            }
            int var5 = arg0;
            if (!arg3) {
                return;
            }
            long var6 = this.field4190;
            int var8 = arg2;
            if (this.field4181 <= this.field4190 && this.field4181 + ((long) this.field4197) > this.field4190) {
                int var9 = (int) ((long) this.field4197 + this.field4181 - this.field4190);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class26.method235(this.field4207, (int) (this.field4190 - this.field4181), arg1, arg0, var9);
                arg2 -= var9;
                this.field4190 += (long) var9;
                arg0 += var9;
            }
            if (this.field4207.length < arg2) {
                this.field4206.method1259(this.field4190, (byte) -65);
                this.field4185 = this.field4190;
                while (arg2 > 0) {
                    int var11 = this.field4206.method1260(arg2, -1, arg1, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field4190 += (long) var11;
                    this.field4185 += (long) var11;
                    arg0 += var11;
                }
            } else if (arg2 > 0) {
                this.method1665(-200000001);
                int var10 = arg2;
                if (arg2 > this.field4197) {
                    var10 = this.field4197;
                }
                arg2 -= var10;
                class26.method235(this.field4207, 0, arg1, arg0, var10);
                this.field4190 += (long) var10;
                arg0 += var10;
            }
            if (this.field4198 != -1L) {
                if (this.field4198 > this.field4190 && arg2 > 0) {
                    int var12 = arg0 + ((int) (this.field4198 - this.field4190));
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg2--;
                        arg1[arg0++] = 0;
                        this.field4190++;
                    }
                }
                long var13 = -1L;
                if (this.field4198 >= var6 && (long) var8 + var6 > this.field4198) {
                    var13 = this.field4198;
                } else if (this.field4198 <= var6 && ((long) this.field4205 + this.field4198) > var6) {
                    var13 = var6;
                }
                long var15 = -1L;
                if (var6 < (long) this.field4205 + this.field4198 && this.field4198 + ((long) this.field4205) <= (long) var8 + var6) {
                    var15 = (long) this.field4205 + this.field4198;
                } else if (this.field4198 < (long) var8 + var6 && ((long) this.field4205 + this.field4198) >= ((long) var8 + var6)) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class26.method235(this.field4188, (int) (var13 - this.field4198), arg1, (int) (var13 - var6) + var5, var17);
                    if (this.field4190 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field4190));
                        this.field4190 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4185 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)V")
    public static final void method1673(long arg0, int arg1) {
        field4210++;
        if (arg0 == 0L) {
            return;
        }
        if (class141.field2730 >= 100) {
            class268.method1838(0, -1, class122.field2396, class55.field1203);
            return;
        }
        class30 var3 = class197.method1422(arg0, -127).method256(arg1 + 79);
        for (int var4 = 0; var4 < class141.field2730; var4++) {
            if (class254.field4485[var4] == arg0) {
                class268.method1838(0, -1, class160.method1188(new class30[] { var3, class141.field2727 }, 0), class55.field1203);
                return;
            }
        }
        for (int var5 = 0; var5 < class117.field2307; var5++) {
            if (class103.field2083[var5] == arg0) {
                class268.method1838(0, -1, class160.method1188(new class30[] { class93.field1868, var3, class61.field1318 }, 0), class55.field1203);
                return;
            }
        }
        if (var3.method267(-52, class247.field4394.field2349)) {
            class268.method1838(0, -1, class276.field4819, class55.field1203);
            return;
        }
        class175.field3264++;
        class254.field4485[class141.field2730] = arg0;
        class230.field4093[class141.field2730++] = class197.method1422(arg0, class186.method1344(arg1, 125));
        if (arg1 == -1) {
            class210.field3781 = class14.field308;
            class196.field3553.method1267(214, -9);
            class196.field3553.method72(-1033389592, arg0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method1674(int arg0) {
        if (arg0 >= -108) {
            method1667(-65);
        }
        field4195++;
        return this.field4206.method1261((byte) -17);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB[BI)V")
    public final void method1675(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field4180++;
        try {
            if (this.field4182 < (long) arg3 + this.field4190) {
                this.field4182 = (long) arg3 + this.field4190;
            }
            if (this.field4198 != -1L && (this.field4198 > this.field4190 || ((long) this.field4205 + this.field4198) < this.field4190)) {
                this.method1676(0);
            }
            if (arg1 <= -115) {
                if (this.field4198 != -1L && (long) this.field4188.length + this.field4198 < (long) arg3 + this.field4190) {
                    int var5 = (int) ((long) this.field4188.length - (this.field4190 - this.field4198));
                    class26.method235(arg2, arg0, this.field4188, (int) (this.field4190 - this.field4198), var5);
                    this.field4190 += (long) var5;
                    this.field4205 = this.field4188.length;
                    arg0 += var5;
                    arg3 -= var5;
                    this.method1676(0);
                }
                if (this.field4188.length < arg3) {
                    if (this.field4190 != this.field4185) {
                        this.field4206.method1259(this.field4190, (byte) -65);
                        this.field4185 = this.field4190;
                    }
                    long var6 = -1L;
                    this.field4206.method1262(arg2, (byte) 19, arg0, arg3);
                    if (this.field4190 >= this.field4181 && ((long) this.field4197 + this.field4181) > this.field4190) {
                        var6 = this.field4190;
                    } else if (this.field4181 >= this.field4190 && this.field4190 + ((long) arg3) > this.field4181) {
                        var6 = this.field4181;
                    }
                    this.field4185 += (long) arg3;
                    if (this.field4185 > this.field4196) {
                        this.field4196 = this.field4185;
                    }
                    long var8 = -1L;
                    if ((long) arg3 + this.field4190 > this.field4181 && ((long) arg3 + this.field4190) <= ((long) this.field4197 + this.field4181)) {
                        var8 = (long) arg3 + this.field4190;
                    } else if (this.field4190 < (this.field4181 + ((long) this.field4197)) && ((long) arg3 + this.field4190) >= ((long) this.field4197 + this.field4181)) {
                        var8 = this.field4181 + ((long) this.field4197);
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class26.method235(arg2, (int) ((long) arg0 + var6 - this.field4190), this.field4207, (int) (var6 - this.field4181), var10);
                    }
                    this.field4190 += (long) arg3;
                } else if (arg3 > 0) {
                    if (this.field4198 == -1L) {
                        this.field4198 = this.field4190;
                    }
                    class26.method235(arg2, arg0, this.field4188, (int) (this.field4190 - this.field4198), arg3);
                    this.field4190 += (long) arg3;
                    if (this.field4190 - this.field4198 > (long) this.field4205) {
                        this.field4205 = (int) (this.field4190 - this.field4198);
                    }
                }
            }
        } catch (IOException var12) {
            this.field4185 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    private final void method1676(int arg0) throws IOException {
        field4184++;
        if (arg0 != 0) {
            this.field4207 = null;
        }
        if (this.field4198 == -1L) {
            return;
        }
        if (this.field4198 != this.field4185) {
            this.field4206.method1259(this.field4198, (byte) -65);
            this.field4185 = this.field4198;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field4206.method1262(this.field4188, (byte) 126, 0, this.field4205);
        if (this.field4198 + ((long) this.field4205) > this.field4181 && ((long) this.field4197 + this.field4181) >= ((long) this.field4205 + this.field4198)) {
            var4 = (long) this.field4205 + this.field4198;
        } else if ((this.field4181 + ((long) this.field4197)) > this.field4198 && (long) this.field4205 + this.field4198 >= (long) this.field4197 + this.field4181) {
            var4 = (long) this.field4197 + this.field4181;
        }
        if (this.field4181 <= this.field4198 && this.field4198 < ((long) this.field4197 + this.field4181)) {
            var2 = this.field4198;
        } else if (this.field4198 <= this.field4181 && ((long) this.field4205 + this.field4198) > this.field4181) {
            var2 = this.field4181;
        }
        this.field4185 += (long) this.field4205;
        if (this.field4185 > this.field4196) {
            this.field4196 = this.field4185;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class26.method235(this.field4188, (int) (var2 - this.field4198), this.field4207, (int) (var2 - this.field4181), var6);
        }
        this.field4205 = 0;
        this.field4198 = -1L;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
    public final void method1677(int arg0, long arg1) throws IOException {
        field4186++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1674(-110));
        }
        this.field4190 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lo;II)V")
    public class235(class171 arg0, int arg1, int arg2) throws IOException {
        this.field4206 = arg0;
        this.field4182 = this.field4196 = arg0.method1257(true);
        this.field4207 = new byte[arg1];
        this.field4188 = new byte[arg2];
        this.field4190 = 0L;
    }
}
