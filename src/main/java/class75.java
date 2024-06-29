import java.awt.Graphics;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class75 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "J")
    private long field1403 = -1L;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "J")
    private long field1424 = -1L;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    private int field1421 = 0;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lfh;")
    private class180 field1423;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "J")
    private long field1414;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "J")
    private long field1415;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "J")
    private long field1417;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "[B")
    private byte[] field1419;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "[B")
    private byte[] field1425;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lij;")
    private static class50 field1411 = class78.method578(125, "Created gameworld");

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lij;")
    public static class50 field1416 = field1411;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lae;")
    public static class36 field1427 = new class36();

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lod;")
    public static class127 field1428 = new class127(64);

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Lij;")
    public static class50 field1429 = class78.method578(124, ")4g");

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "J")
    private long field1404;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method559(int arg0) {
        field1416 = null;
        field1429 = null;
        field1411 = null;
        field1428 = null;
        field1427 = null;
        if (arg0 != 10227) {
            field1416 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    private final void method560(byte arg0) throws IOException {
        this.field1426 = 0;
        field1408++;
        if (this.field1417 != this.field1404) {
            this.field1423.method1224(10627, this.field1417);
            this.field1404 = this.field1417;
        }
        if (arg0 <= 112) {
            field1428 = null;
        }
        this.field1403 = this.field1417;
        while (this.field1425.length > this.field1426) {
            int var2 = this.field1425.length - this.field1426;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1423.method1225(this.field1426, this.field1425, var2, (byte) 38);
            if (var3 == -1) {
                break;
            }
            this.field1426 += var3;
            this.field1404 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public final void method561(byte arg0) throws IOException {
        this.method567((byte) 125);
        field1420++;
        if (arg0 <= -5) {
            this.field1423.method1227(107);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V")
    public final void method562(long arg0, int arg1) throws IOException {
        field1405++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method563(65));
        }
        this.field1417 = arg0;
        if (arg1 > -34) {
            this.method570((byte) -83);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method563(int arg0) {
        field1409++;
        int var2 = -99 % ((arg0 + 1) / 62);
        return this.field1423.method1228(0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLij;)V")
    public static final void method564(int arg0, boolean arg1, class50 arg2) {
        if (arg0 != -9117) {
            method559(-55);
        }
        field1422++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class36.field711.method1060(arg2, 250);
        int var7 = class36.field711.method1069(arg2, 250) * 13;
        class158.method1104(var4 - var3, -var3 + var5, var6 + var3 + var3, var3 + var3 + var7, 0);
        class158.method1119(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        class36.field711.method1059(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class2.method12(var7 + var3 + var3, -86, -var3 + var4, var5 - var3, var3 + var6 - -var3);
        if (!arg1) {
            class141.method989(107, var4, var6, var5, var7);
            return;
        }
        try {
            Graphics var8 = class228.field3834.getGraphics();
            class221.field3725.method455(0, 115, var8, 0);
        } catch (Exception var9) {
            class228.field3834.repaint();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1410++;
        int var8 = arg0 + arg3;
        int var9 = arg6 - arg3;
        int var10 = arg2 - arg3;
        int var11 = arg1 + arg3;
        for (int var12 = arg0; var12 < var8; var12++) {
            class155.method1090(class177.field2963[var12], arg1, arg5, 160, arg2);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class155.method1090(class177.field2963[var13], arg1, arg5, arg4 ^ 0xFFFFF6B3, arg2);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class177.field2963[var14];
            class155.method1090(var15, arg1, arg5, 160, var11);
            class155.method1090(var15, var11, arg7, 160, var10);
            class155.method1090(var15, var10, arg5, 160, arg2);
        }
        if (arg4 != -2541) {
            field1427 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BZ)V")
    public final void method566(byte[] arg0, boolean arg1) throws IOException {
        this.method568(arg0, (byte) -114, 0, arg0.length);
        field1406++;
        if (arg1) {
            method559(-77);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    private final void method567(byte arg0) throws IOException {
        if (arg0 != 125) {
            return;
        }
        if (this.field1424 != -1L) {
            if (this.field1424 != this.field1404) {
                this.field1423.method1224(10627, this.field1424);
                this.field1404 = this.field1424;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field1423.method1226(0, true, this.field1419, this.field1421);
            if (this.field1403 < (this.field1424 + ((long) this.field1421)) && (long) this.field1421 + this.field1424 <= (long) this.field1426 + this.field1403) {
                var4 = (long) this.field1421 + this.field1424;
            } else if (this.field1403 + ((long) this.field1426) > this.field1424 && (long) this.field1421 + this.field1424 >= this.field1403 - -((long) this.field1426)) {
                var4 = (long) this.field1426 + this.field1403;
            }
            this.field1404 += (long) this.field1421;
            if (this.field1403 <= this.field1424 && this.field1424 < (this.field1403 + ((long) this.field1426))) {
                var2 = this.field1424;
            } else if (this.field1403 >= this.field1424 && this.field1403 < (long) this.field1421 + this.field1424) {
                var2 = this.field1403;
            }
            if (this.field1404 > this.field1414) {
                this.field1414 = this.field1404;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class105.method792(this.field1419, (int) (var2 - this.field1424), this.field1425, (int) (var2 - this.field1403), var6);
            }
            this.field1424 = -1L;
            this.field1421 = 0;
        }
        field1412++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BBII)V")
    public final void method568(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field1413++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field1424 != -1L && this.field1417 >= this.field1424 && (long) this.field1421 + this.field1424 >= this.field1417 - -((long) arg3)) {
                class105.method792(this.field1419, (int) (this.field1417 - this.field1424), arg0, arg2, arg3);
                this.field1417 += (long) arg3;
                return;
            }
            long var5 = this.field1417;
            if (arg1 != -114) {
                method564(107, false, (class50) null);
            }
            int var7 = arg2;
            int var8 = arg3;
            if (this.field1403 <= this.field1417 && this.field1417 < ((long) this.field1426 + this.field1403)) {
                int var9 = (int) (this.field1403 + (long) this.field1426 - this.field1417);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class105.method792(this.field1425, (int) (this.field1417 - this.field1403), arg0, arg2, var9);
                arg2 += var9;
                this.field1417 += (long) var9;
            }
            if (arg3 > this.field1425.length) {
                this.field1423.method1224(10627, this.field1417);
                this.field1404 = this.field1417;
                while (arg3 > 0) {
                    int var10 = this.field1423.method1225(arg2, arg0, arg3, (byte) 38);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field1404 += (long) var10;
                    this.field1417 += (long) var10;
                    arg2 += var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method560((byte) 123);
                if (this.field1426 < arg3) {
                    var11 = this.field1426;
                }
                arg3 -= var11;
                class105.method792(this.field1425, 0, arg0, arg2, var11);
                arg2 += var11;
                this.field1417 += (long) var11;
            }
            if (this.field1424 != -1L) {
                if (this.field1424 > this.field1417 && arg3 > 0) {
                    int var12 = (int) (this.field1424 - this.field1417) + arg2;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        this.field1417++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (this.field1424 >= var5 && ((long) var8 + var5) > this.field1424) {
                    var13 = this.field1424;
                } else if (var5 >= this.field1424 && (long) this.field1421 + this.field1424 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field1421 + this.field1424) > var5 && (long) var8 + var5 >= (long) this.field1421 + this.field1424) {
                    var15 = (long) this.field1421 + this.field1424;
                } else if (this.field1424 < ((long) var8 + var5) && ((long) var8 + var5) <= ((long) this.field1421 + this.field1424)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class105.method792(this.field1419, (int) (var13 - this.field1424), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1417) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field1417));
                        this.field1417 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1404 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI[BI)V")
    public final void method569(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1418++;
        try {
            if (this.field1415 < (long) arg1 + this.field1417) {
                this.field1415 = (long) arg1 + this.field1417;
            }
            if (this.field1424 != -1L && (this.field1424 > this.field1417 || this.field1417 > this.field1424 + ((long) this.field1421))) {
                this.method567((byte) 125);
            }
            if (this.field1424 != -1L && (long) this.field1419.length + this.field1424 < (long) arg1 + this.field1417) {
                int var5 = (int) ((long) this.field1419.length + this.field1424 - this.field1417);
                class105.method792(arg2, arg3, this.field1419, (int) (this.field1417 - this.field1424), var5);
                arg3 += var5;
                arg1 -= var5;
                this.field1417 += (long) var5;
                this.field1421 = this.field1419.length;
                this.method567((byte) 125);
            }
            if (arg0 <= -28) {
                if (this.field1419.length < arg1) {
                    long var6 = -1L;
                    if (this.field1417 != this.field1404) {
                        this.field1423.method1224(10627, this.field1417);
                        this.field1404 = this.field1417;
                    }
                    this.field1423.method1226(arg3, true, arg2, arg1);
                    if (this.field1417 >= this.field1403 && (long) this.field1426 + this.field1403 > this.field1417) {
                        var6 = this.field1417;
                    } else if (this.field1417 <= this.field1403 && ((long) arg1 + this.field1417) > this.field1403) {
                        var6 = this.field1403;
                    }
                    this.field1404 += (long) arg1;
                    long var8 = -1L;
                    if (this.field1403 < (long) arg1 + this.field1417 && this.field1403 + ((long) this.field1426) >= (long) arg1 + this.field1417) {
                        var8 = (long) arg1 + this.field1417;
                    } else if (this.field1417 < (this.field1403 + ((long) this.field1426)) && (long) this.field1426 + this.field1403 <= this.field1417 - -((long) arg1)) {
                        var8 = (long) this.field1426 + this.field1403;
                    }
                    if (this.field1414 < this.field1404) {
                        this.field1414 = this.field1404;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class105.method792(arg2, (int) ((long) arg3 + var6 - this.field1417), this.field1425, (int) (var6 - this.field1403), var10);
                    }
                    this.field1417 += (long) arg1;
                } else if (arg1 > 0) {
                    if (this.field1424 == -1L) {
                        this.field1424 = this.field1417;
                    }
                    class105.method792(arg2, arg3, this.field1419, (int) (this.field1417 - this.field1424), arg1);
                    this.field1417 += (long) arg1;
                    if ((long) this.field1421 < this.field1417 - this.field1424) {
                        this.field1421 = (int) (this.field1417 - this.field1424);
                    }
                }
            }
        } catch (IOException var12) {
            this.field1404 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)J")
    public final long method570(byte arg0) {
        int var2 = 96 / ((-arg0 - 64) / 50);
        field1407++;
        return this.field1415;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lfh;II)V")
    public class75(class180 arg0, int arg1, int arg2) throws IOException {
        this.field1423 = arg0;
        this.field1415 = this.field1414 = arg0.method1223(-97);
        this.field1417 = 0L;
        this.field1419 = new byte[arg2];
        this.field1425 = new byte[arg1];
    }
}
