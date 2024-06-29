import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class94 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "J")
    private long field1380 = -1L;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "J")
    private long field1388 = -1L;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    private int field1394 = 0;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Lhg;")
    private class220 field1395;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "J")
    private long field1387;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "J")
    private long field1399;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[B")
    private byte[] field1401;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[B")
    private byte[] field1381;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "J")
    private long field1393;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lok;")
    public static class41 field1386 = class137.method956("(U1", 45);

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lok;")
    public static class41 field1384 = class137.method956("gr-Un:", 45);

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Lok;")
    public static class41 field1392 = class137.method956("::qa_op_test", 45);

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Lok;")
    public static class41 field1389 = null;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "J")
    public static long field1382 = 0L;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Lok;")
    public static class41 field1397 = class137.method956("blaugr-Un:", 45);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "J")
    private long field1385;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 4)
    private final void method666(byte arg0) throws IOException {
        this.field1398 = 0;
        if (arg0 < 86) {
            method672(41);
        }
        field1376++;
        if (this.field1393 != this.field1385) {
            this.field1395.method1581((byte) -71, this.field1393);
            this.field1385 = this.field1393;
        }
        this.field1388 = this.field1393;
        while (this.field1398 < this.field1381.length) {
            int var2 = this.field1381.length - this.field1398;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1395.method1583(this.field1381, this.field1398, var2, true);
            if (var3 == -1) {
                break;
            }
            this.field1398 += var3;
            this.field1385 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI[BI)V", line = 55)
    public final void method667(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1391++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field1380 != -1L && this.field1393 >= this.field1380 && ((long) arg3 + this.field1393) <= (this.field1380 + ((long) this.field1394))) {
                class21.method144(this.field1401, (int) (this.field1393 - this.field1380), arg2, arg1, arg3);
                this.field1393 += (long) arg3;
                return;
            }
            long var5 = this.field1393;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field1388 <= this.field1393 && this.field1393 < (long) this.field1398 + this.field1388) {
                int var9 = (int) ((long) this.field1398 - (this.field1393 - this.field1388));
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class21.method144(this.field1381, (int) (this.field1393 - this.field1388), arg2, arg1, var9);
                arg1 += var9;
                arg3 -= var9;
                this.field1393 += (long) var9;
            }
            if (arg0) {
                method676(117);
            }
            if (arg3 > this.field1381.length) {
                this.field1395.method1581((byte) -71, this.field1393);
                this.field1385 = this.field1393;
                while (arg3 > 0) {
                    int var10 = this.field1395.method1583(arg2, arg1, arg3, true);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1393 += (long) var10;
                    arg3 -= var10;
                    this.field1385 += (long) var10;
                    arg1 += var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method666((byte) 126);
                if (this.field1398 < arg3) {
                    var11 = this.field1398;
                }
                arg3 -= var11;
                class21.method144(this.field1381, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field1393 += (long) var11;
            }
            if (this.field1380 != -1L) {
                if (this.field1393 < this.field1380 && arg3 > 0) {
                    int var12 = (int) (this.field1380 - this.field1393) + arg1;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg2[arg1++] = 0;
                        arg3--;
                        this.field1393++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field1380 && ((long) var8 + var5) > this.field1380) {
                    var13 = this.field1380;
                } else if (this.field1380 <= var5 && (long) this.field1394 + this.field1380 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field1394 + this.field1380) > var5 && (long) var8 + var5 >= (long) this.field1394 + this.field1380) {
                    var15 = (long) this.field1394 + this.field1380;
                } else if (this.field1380 < ((long) var8 + var5) && var5 + ((long) var8) <= (long) this.field1394 + this.field1380) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class21.method144(this.field1401, (int) (var13 - this.field1380), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1393) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field1393));
                        this.field1393 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1385 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 238)
    private final void method668(int arg0) throws IOException {
        if (arg0 > -100) {
            field1382 = 46L;
        }
        field1378++;
        if (this.field1380 == -1L) {
            return;
        }
        if (this.field1385 != this.field1380) {
            this.field1395.method1581((byte) -71, this.field1380);
            this.field1385 = this.field1380;
        }
        long var2 = -1L;
        this.field1395.method1579(16235, this.field1394, this.field1401, 0);
        long var4 = -1L;
        if ((long) this.field1394 + this.field1380 > this.field1388 && ((long) this.field1398 + this.field1388) >= ((long) this.field1394 + this.field1380)) {
            var4 = (long) this.field1394 + this.field1380;
        } else if (this.field1380 < ((long) this.field1398 + this.field1388) && ((long) this.field1394 + this.field1380) >= (this.field1388 + ((long) this.field1398))) {
            var4 = (long) this.field1398 + this.field1388;
        }
        this.field1385 += (long) this.field1394;
        if (this.field1385 > this.field1387) {
            this.field1387 = this.field1385;
        }
        if (this.field1380 >= this.field1388 && this.field1380 < this.field1388 + ((long) this.field1398)) {
            var2 = this.field1380;
        } else if (this.field1388 >= this.field1380 && (long) this.field1394 + this.field1380 > this.field1388) {
            var2 = this.field1388;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class21.method144(this.field1401, (int) (var2 - this.field1380), this.field1381, (int) (var2 - this.field1388), var6);
        }
        this.field1394 = 0;
        this.field1380 = -1L;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lhg;II)V", line = 704)
    public class94(class220 arg0, int arg1, int arg2) throws IOException {
        this.field1395 = arg0;
        this.field1399 = this.field1387 = arg0.method1578((byte) 126);
        this.field1401 = new byte[arg2];
        this.field1381 = new byte[arg1];
        this.field1393 = 0L;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lbc;I)Lbc;", line = 353)
    public static final class302 method669(class302 arg0, int arg1) {
        field1379++;
        if (arg0.field4999 != -1) {
            return class165.method1157(false, arg0.field4999);
        }
        int var2 = arg0.field4910 >>> 16;
        if (arg1 != 0) {
            return (class302) null;
        }
        class141 var3 = new class141(class113.field1658);
        for (class187 var4 = (class187) var3.method987((byte) -50); var4 != null; var4 = (class187) var3.method988(-6969)) {
            if (var4.field3052 == var2) {
                return class165.method1157(false, (int) var4.field844);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)J", line = 388)
    public final long method670(int arg0) {
        if (arg0 != 0) {
            this.method670(-88);
        }
        field1400++;
        return this.field1399;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V", line = 407)
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg5;
        int var8 = arg0 - arg5;
        field1375++;
        int var9 = arg4 + arg5;
        int var10 = arg3 - arg5;
        if (arg2 != 0) {
            method672(57);
        }
        for (int var11 = arg1; var11 < var7; var11++) {
            class269.method1908(19, class239.field3829[var11], arg6, arg3, arg4);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class269.method1908(19, class239.field3829[var12], arg6, arg3, arg4);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class239.field3829[var13];
            class269.method1908(19, var14, arg6, var9, arg4);
            class269.method1908(19, var14, arg6, arg3, var10);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Ltb;", line = 464)
    public static final class199 method672(int arg0) {
        field1390++;
        int var1 = class69.field1040[0] * class173.field2812[0];
        byte[] var2 = class223.field3562[0];
        if (arg0 > -106) {
            return (class199) null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class312.field5263[class217.method1563(255, var2[var4])];
        }
        class199 var5;
        if (class166.field2625) {
            var5 = new class17(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], var3);
        } else {
            var5 = new class72(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], var3);
        }
        class286.method2005((byte) -9);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)V", line = 506)
    public final void method673(int arg0, byte[] arg1) throws IOException {
        field1404++;
        this.method667(false, 0, arg1, arg1.length);
        if (arg0 != -1) {
            this.field1401 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 520)
    public final void method674(int arg0) throws IOException {
        this.method668(arg0 ^ 0xFFFFFF7A);
        this.field1395.method1580(-3810);
        field1383++;
        if (arg0 != 255) {
            field1392 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)V", line = 532)
    public final void method675(int arg0, long arg1) throws IOException {
        field1403++;
        if (arg0 > -97) {
            this.field1395 = (class220) null;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method678(-1));
        }
        this.field1393 = arg1;
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 546)
    public static void method676(int arg0) {
        field1392 = null;
        field1397 = null;
        field1384 = null;
        field1389 = null;
        field1386 = null;
        if (arg0 != -22860) {
            field1386 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BIIZ)V", line = 564)
    public final void method677(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field1402++;
        if (arg3) {
            this.method678(-19);
        }
        try {
            if (this.field1393 + ((long) arg2) > this.field1399) {
                this.field1399 = this.field1393 + ((long) arg2);
            }
            if (this.field1380 != -1L && (this.field1380 > this.field1393 || this.field1393 > ((long) this.field1394 + this.field1380))) {
                this.method668(-114);
            }
            if (this.field1380 != -1L && ((long) this.field1401.length + this.field1380) < ((long) arg2 + this.field1393)) {
                int var5 = (int) ((long) this.field1401.length - (this.field1393 - this.field1380));
                arg2 -= var5;
                class21.method144(arg0, arg1, this.field1401, (int) (this.field1393 - this.field1380), var5);
                arg1 += var5;
                this.field1393 += (long) var5;
                this.field1394 = this.field1401.length;
                this.method668(-118);
            }
            if (this.field1401.length < arg2) {
                if (this.field1393 != this.field1385) {
                    this.field1395.method1581((byte) -71, this.field1393);
                    this.field1385 = this.field1393;
                }
                this.field1395.method1579(16235, arg2, arg0, arg1);
                long var6 = -1L;
                if (this.field1393 >= this.field1388 && this.field1393 < ((long) this.field1398 + this.field1388)) {
                    var6 = this.field1393;
                } else if (this.field1388 >= this.field1393 && (long) arg2 + this.field1393 > this.field1388) {
                    var6 = this.field1388;
                }
                long var8 = -1L;
                this.field1385 += (long) arg2;
                if (this.field1387 < this.field1385) {
                    this.field1387 = this.field1385;
                }
                if (((long) arg2 + this.field1393) > this.field1388 && ((long) this.field1398 + this.field1388) >= ((long) arg2 + this.field1393)) {
                    var8 = (long) arg2 + this.field1393;
                } else if ((long) this.field1398 + this.field1388 > this.field1393 && ((long) arg2 + this.field1393) >= ((long) this.field1398 + this.field1388)) {
                    var8 = (long) this.field1398 + this.field1388;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class21.method144(arg0, (int) ((long) arg1 + var6 - this.field1393), this.field1381, (int) (var6 - this.field1388), var10);
                }
                this.field1393 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1380 == -1L) {
                    this.field1380 = this.field1393;
                }
                class21.method144(arg0, arg1, this.field1401, (int) (this.field1393 - this.field1380), arg2);
                this.field1393 += (long) arg2;
                if (this.field1393 - this.field1380 > (long) this.field1394) {
                    this.field1394 = (int) (this.field1393 - this.field1380);
                }
            }
        } catch (IOException var12) {
            this.field1385 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)Ljava/io/File;", line = 690)
    private final File method678(int arg0) {
        if (arg0 != -1) {
            method672(37);
        }
        field1396++;
        return this.field1395.method1582((byte) -112);
    }
}
