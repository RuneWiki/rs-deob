import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "J")
    private long field167 = -1L;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "J")
    private long field181 = -1L;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    private int field198 = 0;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Lwe;")
    private class151 field183;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "J")
    private long field194;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "J")
    private long field196;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[B")
    private byte[] field177;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[B")
    private byte[] field179;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "J")
    private long field186;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[B")
    public static byte[] field168 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lwd;")
    public static class150 field185 = class2.method9(true, "Privater Chat");

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lwd;")
    public static class150 field172 = class2.method9(true, " ");

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    public static int[] field170 = new int[25];

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Lwd;")
    private static class150 field197 = class2.method9(true, "flash3:");

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lwd;")
    public static class150 field180 = class2.method9(true, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lwd;")
    public static class150 field174 = field197;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lwd;")
    public static class150 field189 = field197;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lwd;")
    public static class150 field199 = class2.method9(true, " loggt sich ein)3");

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "J")
    public static long field182;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "J")
    private long field184;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    private final void method39(int arg0) throws IOException {
        if (this.field167 != -1L) {
            if (this.field184 != this.field167) {
                this.field183.method1217(this.field167, 0);
                this.field184 = this.field167;
            }
            this.field183.method1214(0, this.field179, (byte) -113, this.field198);
            long var2 = -1L;
            this.field184 += this.field198;
            long var4 = -1L;
            if (this.field181 <= this.field167 && (long) this.field193 + this.field181 > this.field167) {
                var2 = this.field167;
            } else if (this.field167 <= this.field181 && this.field181 < (long) this.field198 + this.field167) {
                var2 = this.field181;
            }
            if (this.field167 + (long) this.field198 > this.field181 && (long) this.field193 + this.field181 >= (long) this.field198 + this.field167) {
                var4 = (long) this.field198 + this.field167;
            } else if ((long) this.field193 + this.field181 > this.field167 && (long) this.field198 + this.field167 >= (long) this.field193 + this.field181) {
                var4 = (long) this.field193 + this.field181;
            }
            if (this.field184 > this.field194) {
                this.field194 = this.field184;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class79.method577(this.field179, (int) (var2 - this.field167), this.field177, (int) (var2 - this.field181), var6);
            }
            this.field198 = 0;
            this.field167 = -1L;
        }
        if (arg0 > -2) {
            method47((byte) -99);
        }
        field173++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)Lef;")
    public static final class35 method40(int arg0, boolean arg1) {
        field171++;
        class35 var2 = (class35) class40.field1055.method440((long) arg0, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field2410.method315(arg0, arg1, 5);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method268(new class148(var3), (byte) -17);
        }
        class40.field1055.method433(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwd;ILwd;Lff;ZB)V")
    public static final void method41(class150 arg0, int arg1, class150 arg2, class42 arg3, boolean arg4, byte arg5) {
        field195++;
        if (arg5 <= -98) {
            int var6 = arg3.method310((byte) 14, arg0);
            int var7 = arg3.method323((byte) 16, var6, arg2);
            class63.method501((byte) 117, arg1, var7, arg3, var6, arg4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III[B)V")
    public final void method42(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field169++;
        try {
            if (arg1 != -16078) {
                this.field167 = 82L;
            }
            if ((long) arg2 + this.field186 > this.field196) {
                this.field196 = this.field186 + (long) arg2;
            }
            if (this.field167 != -1L && (this.field186 < this.field167 || (long) this.field198 + this.field167 < this.field186)) {
                this.method39(-19);
            }
            if (this.field167 != -1L && (long) arg2 + this.field186 > (long) this.field179.length + this.field167) {
                int var5 = (int) (this.field167 + (long) this.field179.length - this.field186);
                class79.method577(arg3, arg0, this.field179, (int) (this.field186 - this.field167), var5);
                arg0 += var5;
                arg2 -= var5;
                this.field186 += var5;
                this.field198 = this.field179.length;
                this.method39(arg1 ^ 0x3EAB);
            }
            if (arg2 > this.field179.length) {
                long var6 = -1L;
                if (this.field186 != this.field184) {
                    this.field183.method1217(this.field186, 0);
                    this.field184 = this.field186;
                }
                long var8 = -1L;
                this.field183.method1214(arg0, arg3, (byte) -118, arg2);
                this.field184 += arg2;
                if (this.field181 <= this.field186 && this.field186 < (long) this.field193 + this.field181) {
                    var6 = this.field186;
                } else if (this.field181 >= this.field186 && this.field181 < (long) arg2 + this.field186) {
                    var6 = this.field181;
                }
                if (this.field184 > this.field194) {
                    this.field194 = this.field184;
                }
                if ((long) arg2 + this.field186 > this.field181 && (long) this.field193 + this.field181 >= (long) arg2 + this.field186) {
                    var8 = (long) arg2 + this.field186;
                } else if (this.field186 < this.field181 + (long) this.field193 && (long) this.field193 + this.field181 <= (long) arg2 + this.field186) {
                    var8 = (long) this.field193 + this.field181;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class79.method577(arg3, (int) ((long) arg0 + var6 - this.field186), this.field177, (int) (var6 - this.field181), var10);
                }
                this.field186 += arg2;
            } else if (arg2 > 0) {
                if (this.field167 == -1L) {
                    this.field167 = this.field186;
                }
                class79.method577(arg3, arg0, this.field179, (int) (this.field186 - this.field167), arg2);
                this.field186 += arg2;
                if (this.field186 - this.field167 > (long) this.field198) {
                    this.field198 = (int) (this.field186 - this.field167);
                }
            }
        } catch (IOException var12) {
            this.field184 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II[BI)V")
    public final void method43(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field200++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field167 != -1L && this.field186 >= this.field167 && (long) arg3 + this.field186 <= this.field167 - -((long) this.field198)) {
                class79.method577(this.field179, (int) (this.field186 - this.field167), arg2, arg1, arg3);
                this.field186 += arg3;
                return;
            }
            if (arg0 != -6592) {
                this.method46(-123L, true);
            }
            long var5 = this.field186;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field186 >= this.field181 && this.field181 + (long) this.field193 > this.field186) {
                int var9 = (int) (this.field181 + (long) this.field193 - this.field186);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class79.method577(this.field177, (int) (this.field186 - this.field181), arg2, arg1, var9);
                arg1 += var9;
                this.field186 += var9;
            }
            if (this.field177.length < arg3) {
                this.field183.method1217(this.field186, 0);
                this.field184 = this.field186;
                while (arg3 > 0) {
                    int var10 = this.field183.method1213(-1, arg2, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field184 += var10;
                    arg3 -= var10;
                    this.field186 += var10;
                    arg1 += var10;
                }
            } else if (arg3 > 0) {
                this.method44(-8506);
                int var11 = arg3;
                if (this.field193 < arg3) {
                    var11 = this.field193;
                }
                arg3 -= var11;
                class79.method577(this.field177, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field186 += var11;
            }
            if (this.field167 != -1L) {
                if (this.field186 < this.field167 && arg3 > 0) {
                    int var12 = arg1 + (int) (this.field167 - this.field186);
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg2[arg1++] = 0;
                        this.field186++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (this.field167 >= var5 && this.field167 < (long) var8 + var5) {
                    var13 = this.field167;
                } else if (this.field167 <= var5 && (long) this.field198 + this.field167 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field167 + (long) this.field198 > var5 && (long) this.field198 + this.field167 <= var5 - -((long) var8)) {
                    var15 = (long) this.field198 + this.field167;
                } else if (this.field167 < var5 + (long) var8 && (long) this.field198 + this.field167 >= (long) var8 + var5) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class79.method577(this.field179, (int) (var13 - this.field167), arg2, var7 + (int) (var13 - var5), var17);
                    if (this.field186 < var15) {
                        arg3 = (int) ((long) arg3 + this.field186 - var15);
                        this.field186 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field184 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    private final void method44(int arg0) throws IOException {
        if (arg0 != -8506) {
            return;
        }
        this.field193 = 0;
        field178++;
        if (this.field186 != this.field184) {
            this.field183.method1217(this.field186, 0);
            this.field184 = this.field186;
        }
        this.field181 = this.field186;
        while (this.field193 < this.field177.length) {
            int var2 = this.field183.method1213(arg0 ^ 0x2139, this.field177, this.field193, this.field177.length - this.field193);
            if (var2 == -1) {
                break;
            }
            this.field184 += var2;
            this.field193 += var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static void method45(int arg0) {
        field172 = null;
        field168 = null;
        field180 = null;
        field199 = null;
        field189 = null;
        field197 = null;
        if (arg0 <= 71) {
            field172 = null;
        }
        field170 = null;
        field185 = null;
        field174 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JZ)V")
    public final void method46(long arg0, boolean arg1) {
        field190++;
        if (arg0 >= 0L) {
            if (!arg1) {
                method41(null, 74, null, null, true, (byte) -62);
            }
            this.field186 = arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method47(byte arg0) {
        field176++;
        class107.method744(-12);
        if (class90.field2094 == 1) {
            class127.field2975[class76.field1892 / 100].method398(class3.field64 - 4 - 8, class63.field1635 - 8 - 4);
        }
        if (class90.field2094 == 2) {
            class127.field2975[class76.field1892 / 100 + 4].method398(class3.field64 - 8 - 4, class63.field1635 + -8 + -4);
        }
        if (class78.field1916 != -1) {
            class58.method445((byte) -31, class78.field1916);
            class148.method1135(0, class78.field1916, (byte) 116, 512, 4, 0, 334);
        }
        if (class107.field2436 != -1) {
            class58.method445((byte) -31, class107.field2436);
            class148.method1135(0, class107.field2436, (byte) 113, 512, 0, 0, 334);
        }
        class80.method580(-3157);
        if (!class145.field3517) {
            class42.method311(false);
            class101.method688(arg0 + 16878);
        } else if (class12.field305 == 0) {
            class135.method1004(-83);
        }
        if (arg0 != -42) {
            return;
        }
        if (class135.field3175 == 1) {
            class9.field231.method398(472, 296);
        }
        if (class2.field48) {
            short var1 = 507;
            byte var2 = 20;
            class22.field646.method1034(class111.method786((byte) 38, new class150[] { class66.field1672, class29.method239(1000, class66.field1692) }), var1, var2, 16776960);
            Runtime var3 = Runtime.getRuntime();
            int var9 = var2 + 15;
            int var4 = 16776960;
            int var5 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            if (var5 > 32768 && class20.field517) {
                var4 = 16711680;
            }
            if (var5 > 65536 && !class20.field517) {
                var4 = 16711680;
            }
            class22.field646.method1034(class111.method786((byte) -107, new class150[] { class11.field270, class29.method239(1000, var5), class107.field2430 }), var1, var9, var4);
            var9 += 15;
            if (class91.field2130) {
                class22.field646.method1034(class55.field1436, var1, var9, 16711680);
                var9 += 15;
                class91.field2130 = false;
            }
            if (class135.field3186) {
                class22.field646.method1034(class37.field1021, var1, var9, 16711680);
                var9 += 15;
                class135.field3186 = false;
            }
            if (class18.field487) {
                class22.field646.method1034(class99.field2257, var1, var9, 16711680);
                class18.field487 = false;
                var9 += 15;
            }
        }
        if (class65.field1647 == 0) {
            return;
        }
        int var6 = class65.field1647 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 < 10) {
            class22.field646.method1053(class111.method786((byte) 11, new class150[] { class16.field420, class29.method239(1000, var7), class101.field2291, class29.method239(1000, var8) }), 4, 329, 16776960);
        } else {
            class22.field646.method1053(class111.method786((byte) -128, new class150[] { class16.field420, class29.method239(arg0 ^ 0xFFFFFC3E, var7), class43.field1199, class29.method239(1000, var8) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)J")
    public final long method48(int arg0) {
        if (arg0 == -16777216) {
            field188++;
            return this.field196;
        } else {
            return 83L;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    public final void method49(int arg0) throws IOException {
        int var2 = -109 / ((-arg0 - 12) / 38);
        this.method39(-34);
        field191++;
        this.field183.method1212((byte) 127);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lwe;II)V")
    public class8(class151 arg0, int arg1, int arg2) throws IOException {
        this.field183 = arg0;
        this.field196 = this.field194 = arg0.method1216((byte) -87);
        this.field177 = new byte[arg1];
        this.field179 = new byte[arg2];
        this.field186 = 0L;
    }
}
