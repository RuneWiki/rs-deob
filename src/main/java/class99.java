import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class99 {

    @OriginalMember(owner = "client!di", name = "h", descriptor = "J")
    private long field1330 = -1L;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field1328 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "J")
    private long field1329 = -1L;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Luj;")
    private class264 field1339;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "J")
    private long field1350;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "J")
    private long field1349;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[B")
    private byte[] field1333;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[B")
    private byte[] field1336;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "J")
    private long field1334;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field1347 = 2;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "S")
    public static short field1348 = 256;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "J")
    private long field1342;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method596(String arg0, byte arg1) {
        field1341++;
        if (class38.field455 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class60.method370((byte) -8, arg0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class38.field455.length && class38.field455[var2].field4489 != var3) {
            var2++;
        }
        if (class38.field455.length <= var2 || class38.field455[var2] == null) {
            return;
        }
        class271.field3970++;
        class94.field1259.method592(222, false);
        if (arg1 <= 73) {
            field1348 = -9;
        }
        class94.field1259.method1379(-107, class38.field455[var2].field4489);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method597(int arg0) {
        if (arg0 > -1) {
            this.method597(-54);
        }
        field1332++;
        return this.field1339.method1686((byte) -110);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != -7533) {
            field1347 = 21;
        }
        field1338++;
        for (int var6 = arg5; var6 <= arg4; var6++) {
            class76.method463(arg1, 0, arg2, arg0, class268.field3919[var6]);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    private final void method599(int arg0) throws IOException {
        this.field1346 = 0;
        if (this.field1342 != this.field1334) {
            this.field1339.method1690(-65, this.field1334);
            this.field1342 = this.field1334;
        }
        int var2 = 18 / ((arg0 - 3) / 55);
        this.field1330 = this.field1334;
        while (this.field1346 < this.field1336.length) {
            int var3 = this.field1336.length - this.field1346;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field1339.method1689(this.field1346, this.field1336, var3, -1);
            if (var4 == -1) {
                break;
            }
            this.field1342 += (long) var4;
            this.field1346 += var4;
        }
        field1326++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static final void method600(byte arg0) {
        if (arg0 <= 112) {
            method598(-95, 124, 122, -70, 112, -108);
        }
        class234.field3376.method67((byte) 32);
        field1335++;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    private final void method601(int arg0) throws IOException {
        if (arg0 < 25) {
            field1331 = 107;
        }
        if (this.field1329 != -1L) {
            if (this.field1342 != this.field1329) {
                this.field1339.method1690(-99, this.field1329);
                this.field1342 = this.field1329;
            }
            this.field1339.method1687(false, this.field1328, 0, this.field1333);
            this.field1342 += (long) this.field1328;
            long var2 = -1L;
            long var4 = -1L;
            if (this.field1350 < this.field1342) {
                this.field1350 = this.field1342;
            }
            if (this.field1329 >= this.field1330 && this.field1329 < ((long) this.field1346 + this.field1330)) {
                var4 = this.field1329;
            } else if (this.field1330 >= this.field1329 && (long) this.field1328 + this.field1329 > this.field1330) {
                var4 = this.field1330;
            }
            if (this.field1330 < (long) this.field1328 + this.field1329 && ((long) this.field1328 + this.field1329) <= (this.field1330 + ((long) this.field1346))) {
                var2 = this.field1329 + ((long) this.field1328);
            } else if (this.field1329 < (long) this.field1346 + this.field1330 && (long) this.field1346 + this.field1330 <= (long) this.field1328 + this.field1329) {
                var2 = (long) this.field1346 + this.field1330;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class194.method1260(this.field1333, (int) (var4 - this.field1329), this.field1336, (int) (var4 - this.field1330), var6);
            }
            this.field1329 = -1L;
            this.field1328 = 0;
        }
        field1345++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B[BII)V")
    public final void method602(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1337++;
        try {
            if (arg3 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (this.field1329 != -1L && this.field1334 >= this.field1329 && (long) this.field1328 + this.field1329 >= (long) arg2 + this.field1334) {
                class194.method1260(this.field1333, (int) (this.field1334 - this.field1329), arg1, arg3, arg2);
                this.field1334 += (long) arg2;
                return;
            }
            int var5 = arg3;
            if (arg0 > -1) {
                this.field1334 = -69L;
            }
            long var6 = this.field1334;
            int var8 = arg2;
            if (this.field1334 >= this.field1330 && (this.field1330 + ((long) this.field1346)) > this.field1334) {
                int var9 = (int) ((long) this.field1346 - (this.field1334 - this.field1330));
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class194.method1260(this.field1336, (int) (this.field1334 - this.field1330), arg1, arg3, var9);
                this.field1334 += (long) var9;
                arg3 += var9;
            }
            if (arg2 > this.field1336.length) {
                this.field1339.method1690(-106, this.field1334);
                this.field1342 = this.field1334;
                while (arg2 > 0) {
                    int var10 = this.field1339.method1689(arg3, arg1, arg2, -1);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field1334 += (long) var10;
                    this.field1342 += (long) var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method599(93);
                if (this.field1346 < arg2) {
                    var11 = this.field1346;
                }
                arg2 -= var11;
                class194.method1260(this.field1336, 0, arg1, arg3, var11);
                arg3 += var11;
                this.field1334 += (long) var11;
            }
            if (this.field1329 != -1L) {
                if (this.field1329 > this.field1334 && arg2 > 0) {
                    int var12 = (int) (this.field1329 - this.field1334) + arg3;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg1[arg3++] = 0;
                        this.field1334++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field1329 >= var6 && ((long) var8 + var6) > this.field1329) {
                    var15 = this.field1329;
                } else if (var6 >= this.field1329 && var6 < this.field1329 + ((long) this.field1328)) {
                    var15 = var6;
                }
                if (var6 < (long) this.field1328 + this.field1329 && ((long) this.field1328 + this.field1329) <= (var6 + ((long) var8))) {
                    var13 = (long) this.field1328 + this.field1329;
                } else if (this.field1329 < ((long) var8 + var6) && var6 + ((long) var8) <= (long) this.field1328 + this.field1329) {
                    var13 = (long) var8 + var6;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class194.method1260(this.field1333, (int) (var15 - this.field1329), arg1, (int) (var15 - var6) + var5, var17);
                    if (this.field1334 < var13) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field1334));
                        this.field1334 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1342 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)J")
    public final long method603(byte arg0) {
        field1344++;
        if (arg0 <= 20) {
            method596((String) null, (byte) -23);
        }
        return this.field1349;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[BII)V")
    public final void method604(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1343++;
        try {
            if (this.field1349 < (long) arg2 + this.field1334) {
                this.field1349 = (long) arg2 + this.field1334;
            }
            if (this.field1329 != -1L && (this.field1334 < this.field1329 || (this.field1329 + ((long) this.field1328)) < this.field1334)) {
                this.method601(127);
            }
            if (this.field1329 != -1L && ((long) this.field1333.length + this.field1329) < ((long) arg2 + this.field1334)) {
                int var5 = (int) ((long) this.field1333.length + this.field1329 - this.field1334);
                arg2 -= var5;
                class194.method1260(arg1, arg0, this.field1333, (int) (this.field1334 - this.field1329), var5);
                this.field1334 += (long) var5;
                this.field1328 = this.field1333.length;
                arg0 += var5;
                this.method601(arg3 ^ 0xBD);
            }
            if (this.field1333.length < arg2) {
                if (this.field1342 != this.field1334) {
                    this.field1339.method1690(-54, this.field1334);
                    this.field1342 = this.field1334;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field1339.method1687(false, arg2, arg0, arg1);
                if (this.field1330 <= this.field1334 && ((long) this.field1346 + this.field1330) > this.field1334) {
                    var6 = this.field1334;
                } else if (this.field1334 <= this.field1330 && this.field1330 < (long) arg2 + this.field1334) {
                    var6 = this.field1330;
                }
                if (((long) arg2 + this.field1334) > this.field1330 && (long) arg2 + this.field1334 <= (long) this.field1346 + this.field1330) {
                    var8 = (long) arg2 + this.field1334;
                } else if (((long) this.field1346 + this.field1330) > this.field1334 && (long) this.field1346 + this.field1330 <= (long) arg2 + this.field1334) {
                    var8 = (long) this.field1346 + this.field1330;
                }
                this.field1342 += (long) arg2;
                if (this.field1342 > this.field1350) {
                    this.field1350 = this.field1342;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class194.method1260(arg1, (int) ((long) arg0 + var6 - this.field1334), this.field1336, (int) (var6 - this.field1330), var10);
                }
                this.field1334 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1329 == -1L) {
                    this.field1329 = this.field1334;
                }
                class194.method1260(arg1, arg0, this.field1333, (int) (this.field1334 - this.field1329), arg2);
                this.field1334 += (long) arg2;
                if ((this.field1334 - this.field1329) > ((long) this.field1328)) {
                    this.field1328 = (int) (this.field1334 - this.field1329);
                }
            } else if (arg3 != 255) {
                method607((byte) -36, 2);
            }
        } catch (IOException var12) {
            this.field1342 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZJ)V")
    public final void method605(boolean arg0, long arg1) throws IOException {
        field1324++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method597(-72));
        }
        if (arg0) {
            method600((byte) 31);
        }
        this.field1334 = arg1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)V")
    public final void method606(int arg0, byte[] arg1) throws IOException {
        if (arg0 >= -62) {
            this.field1330 = 81L;
        }
        this.method602((byte) -32, arg1, arg1.length, 0);
        field1325++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)I")
    public static final int method607(byte arg0, int arg1) {
        field1340++;
        if (arg0 < 101) {
            field1327 = -48;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Luj;II)V")
    public class99(class264 arg0, int arg1, int arg2) throws IOException {
        this.field1339 = arg0;
        this.field1349 = this.field1350 = arg0.method1691((byte) 124);
        this.field1333 = new byte[arg2];
        this.field1336 = new byte[arg1];
        this.field1334 = 0L;
    }
}
