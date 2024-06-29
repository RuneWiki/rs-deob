import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class85 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "J")
    private long field1401 = -1L;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "J")
    private long field1405 = -1L;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    private int field1414 = 0;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lai;")
    private class210 field1406;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "J")
    private long field1412;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "J")
    private long field1413;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "J")
    private long field1408;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "[B")
    private byte[] field1400;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "[B")
    private byte[] field1403;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1404 = "Checking for updates - ";

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "[Z")
    public static boolean[] field1415 = new boolean[100];

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "J")
    private long field1402;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method578(int arg0) {
        if (arg0 != -1) {
            method578(125);
        }
        field1404 = null;
        field1415 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[BII)V")
    public final void method579(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1416++;
        if (arg0 > -89) {
            this.field1402 = 98L;
        }
        try {
            if (this.field1413 < ((long) arg2 + this.field1408)) {
                this.field1413 = (long) arg2 + this.field1408;
            }
            if (this.field1405 != -1L && (this.field1405 > this.field1408 || this.field1408 > this.field1405 + ((long) this.field1414))) {
                this.method582(true);
            }
            if (this.field1405 != -1L && ((long) this.field1403.length + this.field1405) < (this.field1408 + ((long) arg2))) {
                int var5 = (int) ((long) this.field1403.length + this.field1405 - this.field1408);
                class157.method1074(arg1, arg3, this.field1403, (int) (this.field1408 - this.field1405), var5);
                arg3 += var5;
                arg2 -= var5;
                this.field1408 += (long) var5;
                this.field1414 = this.field1403.length;
                this.method582(true);
            }
            if (arg2 > this.field1403.length) {
                long var6 = -1L;
                if (this.field1408 != this.field1402) {
                    this.field1406.method1459(this.field1408, (byte) 114);
                    this.field1402 = this.field1408;
                }
                this.field1406.method1460(arg2, arg3, 0, arg1);
                this.field1402 += (long) arg2;
                long var8 = -1L;
                if ((this.field1408 + ((long) arg2)) > this.field1401 && (long) arg2 + this.field1408 <= (long) this.field1398 + this.field1401) {
                    var8 = (long) arg2 + this.field1408;
                } else if (this.field1408 < (long) this.field1398 + this.field1401 && ((long) arg2 + this.field1408) >= (this.field1401 + ((long) this.field1398))) {
                    var8 = (long) this.field1398 + this.field1401;
                }
                if (this.field1412 < this.field1402) {
                    this.field1412 = this.field1402;
                }
                if (this.field1401 <= this.field1408 && (this.field1401 + ((long) this.field1398)) > this.field1408) {
                    var6 = this.field1408;
                } else if (this.field1401 >= this.field1408 && (long) arg2 + this.field1408 > this.field1401) {
                    var6 = this.field1401;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class157.method1074(arg1, (int) (var6 + (long) arg3 - this.field1408), this.field1400, (int) (var6 - this.field1401), var10);
                }
                this.field1408 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1405 == -1L) {
                    this.field1405 = this.field1408;
                }
                class157.method1074(arg1, arg3, this.field1403, (int) (this.field1408 - this.field1405), arg2);
                this.field1408 += (long) arg2;
                if (this.field1408 - this.field1405 > (long) this.field1414) {
                    this.field1414 = (int) (this.field1408 - this.field1405);
                }
            }
        } catch (IOException var12) {
            this.field1402 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZJ)V")
    public final void method580(boolean arg0, long arg1) throws IOException {
        field1411++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method586(65280));
        }
        this.field1408 = arg1;
        if (arg0) {
            field1415 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B[B)V")
    public final void method581(byte arg0, byte[] arg1) throws IOException {
        if (arg0 == 0) {
            field1396++;
            this.method585(0, arg1, -1, arg1.length);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    private final void method582(boolean arg0) throws IOException {
        if (this.field1405 != -1L) {
            if (this.field1405 != this.field1402) {
                this.field1406.method1459(this.field1405, (byte) 114);
                this.field1402 = this.field1405;
            }
            this.field1406.method1460(this.field1414, 0, 0, this.field1403);
            long var2 = -1L;
            this.field1402 += (long) this.field1414;
            long var4 = -1L;
            if (this.field1402 > this.field1412) {
                this.field1412 = this.field1402;
            }
            if (((long) this.field1414 + this.field1405) > this.field1401 && ((long) this.field1414 + this.field1405) <= ((long) this.field1398 + this.field1401)) {
                var2 = (long) this.field1414 + this.field1405;
            } else if (this.field1405 < ((long) this.field1398 + this.field1401) && ((long) this.field1398 + this.field1401) <= (this.field1405 + ((long) this.field1414))) {
                var2 = (long) this.field1398 + this.field1401;
            }
            if (this.field1401 <= this.field1405 && (long) this.field1398 + this.field1401 > this.field1405) {
                var4 = this.field1405;
            } else if (this.field1401 >= this.field1405 && ((long) this.field1414 + this.field1405) > this.field1401) {
                var4 = this.field1401;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class157.method1074(this.field1403, (int) (var4 - this.field1405), this.field1400, (int) (var4 - this.field1401), var6);
            }
            this.field1414 = 0;
            this.field1405 = -1L;
        }
        field1407++;
        if (!arg0) {
            this.method584(120);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
    private final void method583(int arg0) throws IOException {
        if (arg0 < 83) {
            field1409 = 94;
        }
        field1417++;
        this.field1398 = 0;
        if (this.field1408 != this.field1402) {
            this.field1406.method1459(this.field1408, (byte) 114);
            this.field1402 = this.field1408;
        }
        this.field1401 = this.field1408;
        while (this.field1398 < this.field1400.length) {
            int var2 = this.field1400.length - this.field1398;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1406.method1464(false, this.field1400, var2, this.field1398);
            if (var3 == -1) {
                break;
            }
            this.field1398 += var3;
            this.field1402 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)J")
    public final long method584(int arg0) {
        if (arg0 == -1) {
            field1397++;
            return this.field1413;
        } else {
            return -80L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[BII)V")
    public final void method585(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1399++;
        try {
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field1405 != -1L && this.field1408 >= this.field1405 && ((long) this.field1414 + this.field1405) >= ((long) arg3 + this.field1408)) {
                class157.method1074(this.field1403, (int) (this.field1408 - this.field1405), arg1, arg0, arg3);
                this.field1408 += (long) arg3;
                return;
            }
            long var5 = this.field1408;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field1408 >= this.field1401 && ((long) this.field1398 + this.field1401) > this.field1408) {
                int var9 = (int) (this.field1401 + (long) this.field1398 - this.field1408);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class157.method1074(this.field1400, (int) (this.field1408 - this.field1401), arg1, arg0, var9);
                this.field1408 += (long) var9;
                arg0 += var9;
            }
            if (this.field1400.length < arg3) {
                this.field1406.method1459(this.field1408, (byte) 114);
                this.field1402 = this.field1408;
                while (arg3 > 0) {
                    int var10 = this.field1406.method1464(false, arg1, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1402 += (long) var10;
                    this.field1408 += (long) var10;
                    arg3 -= var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method583(86);
                if (arg3 > this.field1398) {
                    var11 = this.field1398;
                }
                class157.method1074(this.field1400, 0, arg1, arg0, var11);
                arg0 += var11;
                arg3 -= var11;
                this.field1408 += (long) var11;
            }
            if ((long) arg2 != this.field1405) {
                if (this.field1405 > this.field1408 && arg3 > 0) {
                    int var12 = (int) (this.field1405 - this.field1408) + arg0;
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field1408++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < ((long) this.field1414 + this.field1405) && ((long) this.field1414 + this.field1405) <= ((long) var7 + var5)) {
                    var15 = (long) this.field1414 + this.field1405;
                } else if ((var5 + ((long) var7)) > this.field1405 && (long) var7 + var5 <= this.field1405 - -((long) this.field1414)) {
                    var15 = (long) var7 + var5;
                }
                if (var5 <= this.field1405 && (long) var7 + var5 > this.field1405) {
                    var13 = this.field1405;
                } else if (this.field1405 <= var5 && (this.field1405 + ((long) this.field1414)) > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class157.method1074(this.field1403, (int) (var13 - this.field1405), arg1, var8 + ((int) (var13 - var5)), var17);
                    if (this.field1408 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field1408));
                        this.field1408 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1402 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method586(int arg0) {
        if (arg0 != 65280) {
            this.field1405 = -32L;
        }
        field1410++;
        return this.field1406.method1461(111);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lai;II)V")
    public class85(class210 arg0, int arg1, int arg2) throws IOException {
        this.field1406 = arg0;
        this.field1413 = this.field1412 = arg0.method1463(1);
        this.field1408 = 0L;
        this.field1400 = new byte[arg1];
        this.field1403 = new byte[arg2];
    }
}
