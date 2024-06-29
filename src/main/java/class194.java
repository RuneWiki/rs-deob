import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class194 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "J")
    private long field3181 = -1L;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "J")
    private long field3179 = -1L;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field3186 = 0;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Lma;")
    private class301 field3176;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "J")
    private long field3193;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "J")
    private long field3196;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "[B")
    private byte[] field3192;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "J")
    private long field3187;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "[B")
    private byte[] field3188;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field3177 = -1;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    private int field3194;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "J")
    private long field3185;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "Lkb;")
    public static class39 field3195;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[BII)V", line = 6)
    public final void method1416(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3198++;
        try {
            if ((this.field3187 + ((long) arg3)) > this.field3196) {
                this.field3196 = this.field3187 + ((long) arg3);
            }
            if (this.field3179 != -1L && (this.field3187 < this.field3179 || this.field3187 > this.field3179 + ((long) this.field3186))) {
                this.method1418((byte) -15);
            }
            if (this.field3179 != -1L && (long) arg3 + this.field3187 > (long) this.field3188.length + this.field3179) {
                int var5 = (int) ((long) this.field3188.length + this.field3179 - this.field3187);
                arg3 -= var5;
                class213.method1552(arg1, arg2, this.field3188, (int) (this.field3187 - this.field3179), var5);
                arg2 += var5;
                this.field3187 += (long) var5;
                this.field3186 = this.field3188.length;
                this.method1418((byte) -15);
            }
            if (this.field3188.length >= arg3) {
                if (arg0 < 92) {
                    method1426(56, -117, -94);
                }
                if (arg3 > 0) {
                    if (this.field3179 == -1L) {
                        this.field3179 = this.field3187;
                    }
                    class213.method1552(arg1, arg2, this.field3188, (int) (this.field3187 - this.field3179), arg3);
                    this.field3187 += (long) arg3;
                    if (this.field3187 - this.field3179 > (long) this.field3186) {
                        this.field3186 = (int) (this.field3187 - this.field3179);
                    }
                }
            } else {
                if (this.field3187 != this.field3185) {
                    this.field3176.method2108(-2372, this.field3187);
                    this.field3185 = this.field3187;
                }
                this.field3176.method2105(arg3, false, arg2, arg1);
                this.field3185 += (long) arg3;
                if (this.field3185 > this.field3193) {
                    this.field3193 = this.field3185;
                }
                long var6 = -1L;
                if (this.field3181 <= this.field3187 && ((long) this.field3194 + this.field3181) > this.field3187) {
                    var6 = this.field3187;
                } else if (this.field3187 <= this.field3181 && this.field3181 < ((long) arg3 + this.field3187)) {
                    var6 = this.field3181;
                }
                long var8 = -1L;
                if (((long) arg3 + this.field3187) > this.field3181 && ((long) this.field3194 + this.field3181) >= (this.field3187 + ((long) arg3))) {
                    var8 = (long) arg3 + this.field3187;
                } else if (((long) this.field3194 + this.field3181) > this.field3187 && (this.field3187 + ((long) arg3)) >= (this.field3181 + ((long) this.field3194))) {
                    var8 = (long) this.field3194 + this.field3181;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class213.method1552(arg1, (int) (var6 + (long) arg2 - this.field3187), this.field3192, (int) (var6 - this.field3181), var10);
                }
                this.field3187 += (long) arg3;
            }
        } catch (IOException var12) {
            this.field3185 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 134)
    private final void method1417(byte arg0) throws IOException {
        if (arg0 != -109) {
            return;
        }
        field3178++;
        this.field3194 = 0;
        if (this.field3187 != this.field3185) {
            this.field3176.method2108(-2372, this.field3187);
            this.field3185 = this.field3187;
        }
        this.field3181 = this.field3187;
        while (this.field3194 < this.field3192.length) {
            int var2 = this.field3192.length - this.field3194;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3176.method2104(this.field3194, var2, -34, this.field3192);
            if (var3 == -1) {
                break;
            }
            this.field3194 += var3;
            this.field3185 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 186)
    private final void method1418(byte arg0) throws IOException {
        field3182++;
        if (this.field3179 != -1L) {
            if (this.field3185 != this.field3179) {
                this.field3176.method2108(-2372, this.field3179);
                this.field3185 = this.field3179;
            }
            long var2 = -1L;
            this.field3176.method2105(this.field3186, false, 0, this.field3188);
            long var4 = -1L;
            if (this.field3181 <= this.field3179 && this.field3179 < (long) this.field3194 + this.field3181) {
                var4 = this.field3179;
            } else if (this.field3179 <= this.field3181 && this.field3181 < ((long) this.field3186 + this.field3179)) {
                var4 = this.field3181;
            }
            this.field3185 += (long) this.field3186;
            if (this.field3185 > this.field3193) {
                this.field3193 = this.field3185;
            }
            if (((long) this.field3186 + this.field3179) > this.field3181 && ((long) this.field3186 + this.field3179) <= ((long) this.field3194 + this.field3181)) {
                var2 = this.field3179 + ((long) this.field3186);
            } else if ((long) this.field3194 + this.field3181 > this.field3179 && (long) this.field3186 + this.field3179 >= (long) this.field3194 + this.field3181) {
                var2 = (long) this.field3194 + this.field3181;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class213.method1552(this.field3188, (int) (var4 - this.field3179), this.field3192, (int) (var4 - this.field3181), var6);
            }
            this.field3186 = 0;
            this.field3179 = -1L;
        }
        if (arg0 != -15) {
            this.field3181 = -99L;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[BI)V", line = 270)
    public final void method1419(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3189++;
        try {
            if ((arg0 + arg3) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 - (arg2.length - arg0));
            }
            if (this.field3179 != -1L && this.field3187 >= this.field3179 && ((long) arg0 + this.field3187) <= (this.field3179 + ((long) this.field3186))) {
                class213.method1552(this.field3188, (int) (this.field3187 - this.field3179), arg2, arg3, arg0);
                this.field3187 += (long) arg0;
                return;
            }
            long var5 = this.field3187;
            int var7 = arg3;
            if (arg1 >= -122) {
                this.field3176 = (class301) null;
            }
            int var8 = arg0;
            if (this.field3181 <= this.field3187 && (long) this.field3194 + this.field3181 > this.field3187) {
                int var9 = (int) (this.field3181 + (long) this.field3194 - this.field3187);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class213.method1552(this.field3192, (int) (this.field3187 - this.field3181), arg2, arg3, var9);
                this.field3187 += (long) var9;
                arg0 -= var9;
                arg3 += var9;
            }
            if (this.field3192.length < arg0) {
                this.field3176.method2108(-2372, this.field3187);
                this.field3185 = this.field3187;
                while (arg0 > 0) {
                    int var10 = this.field3176.method2104(arg3, arg0, -37, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3185 += (long) var10;
                    arg3 += var10;
                    this.field3187 += (long) var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method1417((byte) -109);
                int var11 = arg0;
                if (this.field3194 < arg0) {
                    var11 = this.field3194;
                }
                arg0 -= var11;
                class213.method1552(this.field3192, 0, arg2, arg3, var11);
                this.field3187 += (long) var11;
                arg3 += var11;
            }
            if (this.field3179 != -1L) {
                if (this.field3179 > this.field3187 && arg0 > 0) {
                    int var12 = arg3 + ((int) (this.field3179 - this.field3187));
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field3187++;
                    }
                }
                long var13 = -1L;
                if ((long) this.field3186 + this.field3179 > var5 && (var5 + ((long) var8)) >= ((long) this.field3186 + this.field3179)) {
                    var13 = (long) this.field3186 + this.field3179;
                } else if ((long) var8 + var5 > this.field3179 && (long) this.field3186 + this.field3179 >= var5 - -((long) var8)) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (var5 <= this.field3179 && this.field3179 < (long) var8 + var5) {
                    var15 = this.field3179;
                } else if (var5 >= this.field3179 && var5 < ((long) this.field3186 + this.field3179)) {
                    var15 = var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class213.method1552(this.field3188, (int) (var15 - this.field3179), arg2, (int) (var15 - var5) + var7, var17);
                    if (this.field3187 < var13) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field3187));
                        this.field3187 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3185 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(JI)V", line = 454)
    public final void method1420(long arg0, int arg1) throws IOException {
        field3183++;
        if (arg1 >= -73) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1423((byte) 64));
        }
        this.field3187 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)Ltf;", line = 469)
    public static final class271 method1421(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3680; var4++) {
            class271 var5 = var3.field3687[var4];
            if ((var5.field4294 >> 29 & 0x3L) == 2L && var5.field4285 == arg1 && var5.field4297 == arg2) {
                class245.method1739(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BI)V", line = 498)
    public final void method1422(byte[] arg0, int arg1) throws IOException {
        this.method1419(arg0.length, -123, arg0, 0);
        field3180++;
        if (arg1 > -37) {
            method1424(true, -44);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)Ljava/io/File;", line = 510)
    private final File method1423(byte arg0) {
        if (arg0 == 64) {
            field3199++;
            return this.field3176.method2103((byte) -121);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lma;II)V", line = 665)
    public class194(class301 arg0, int arg1, int arg2) throws IOException {
        this.field3176 = arg0;
        this.field3196 = this.field3193 = arg0.method2107(1);
        this.field3192 = new byte[arg1];
        this.field3187 = 0L;
        this.field3188 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZI)V", line = 529)
    public static final void method1424(boolean arg0, int arg1) {
        if (arg1 < 6) {
            field3195 = (class39) null;
        }
        for (class197 var2 = (class197) class114.field1709.method1807((byte) 34); var2 != null; var2 = (class197) class114.field1709.method1808(18051)) {
            if (var2.field3232 != null) {
                class107.field1622.method739(var2.field3232);
                var2.field3232 = null;
            }
            if (var2.field3223 != null) {
                class107.field1622.method739(var2.field3223);
                var2.field3223 = null;
            }
            var2.method465((byte) -122);
        }
        field3197++;
        if (!arg0) {
            return;
        }
        for (class197 var3 = (class197) class287.field4526.method1807((byte) 50); var3 != null; var3 = (class197) class287.field4526.method1808(18051)) {
            if (var3.field3232 != null) {
                class107.field1622.method739(var3.field3232);
                var3.field3232 = null;
            }
            var3.method465((byte) -122);
        }
        for (class197 var4 = (class197) class55.field722.method1746((byte) -33); var4 != null; var4 = (class197) class55.field722.method1749((byte) -106)) {
            if (var4.field3232 != null) {
                class107.field1622.method739(var4.field3232);
                var4.field3232 = null;
            }
            var4.method465((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 599)
    public static final void method1425(int arg0, int arg1) {
        field3191++;
        if (arg0 <= arg1 && class231.field3700.length > arg1) {
            class231.field3700[arg1] = !class231.field3700[arg1];
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)Lmh;", line = 620)
    public static final class145 method1426(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class145 var4 = var3.field3678;
            var3.field3678 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)J", line = 632)
    public final long method1427(int arg0) {
        if (arg0 != -8962) {
            this.method1427(-100);
        }
        field3184++;
        return this.field3196;
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)V", line = 655)
    public static void method1428(byte arg0) {
        if (arg0 == 85) {
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(B)V", line = 685)
    public static final void method1429(byte arg0) {
        int var1 = 88 / ((24 - arg0) / 32);
        field3190++;
        class240.field3799.method1615(61);
        class218.field3501.method1615(71);
        class129.field1911.method1615(39);
    }
}
