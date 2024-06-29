import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    private int field1426 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
    private long field1421 = -1L;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "J")
    private long field1430 = -1L;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ll;")
    private class76 field1417;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "J")
    private long field1448;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "J")
    private long field1437;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "J")
    private long field1429;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "[B")
    private byte[] field1420;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[B")
    private byte[] field1419;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lhe;")
    private static class54 field1428 = class6.method58("Your friend list is full)3 Max of 100 for free users)1 and 200 for members", false);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1422 = -1;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Z")
    public static boolean field1434 = false;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lhe;")
    private static class54 field1415 = class6.method58("Members only world", false);

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Lhe;")
    public static class54 field1442 = field1428;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Lhe;")
    public static class54 field1440 = class6.method58("::clientdrop", false);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lhe;")
    public static class54 field1441 = class6.method58("Bitte versuchen Sie es in ", false);

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field1443 = 500;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Lhe;")
    public static class54 field1447 = field1415;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "B")
    public static byte field1431;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "J")
    private long field1425;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method441(byte arg0) throws IOException {
        field1432++;
        this.method442(255);
        this.field1417.method584(0);
        if (arg0 > -26) {
            method448(122);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    private final void method442(int arg0) throws IOException {
        if (arg0 != 255) {
            return;
        }
        field1449++;
        if (this.field1421 == -1L) {
            return;
        }
        if (this.field1425 != this.field1421) {
            this.field1417.method586(arg0 ^ 0x80, this.field1421);
            this.field1425 = this.field1421;
        }
        this.field1417.method587(0, this.field1420, this.field1426, true);
        this.field1425 += this.field1426;
        if (this.field1448 < this.field1425) {
            this.field1448 = this.field1425;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field1430 <= this.field1421 && (long) this.field1433 + this.field1430 > this.field1421) {
            var2 = this.field1421;
        } else if (this.field1430 >= this.field1421 && (long) this.field1426 + this.field1421 > this.field1430) {
            var2 = this.field1430;
        }
        if ((long) this.field1426 + this.field1421 > this.field1430 && (long) this.field1433 + this.field1430 >= (long) this.field1426 + this.field1421) {
            var4 = this.field1421 + (long) this.field1426;
        } else if (this.field1421 < this.field1430 + (long) this.field1433 && (long) this.field1433 + this.field1430 <= (long) this.field1426 + this.field1421) {
            var4 = (long) this.field1433 + this.field1430;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class45.method333(this.field1420, (int) (var2 - this.field1421), this.field1419, (int) (var2 - this.field1430), var6);
        }
        this.field1421 = -1L;
        this.field1426 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method443(byte arg0) {
        if (arg0 < 38) {
            this.method443((byte) -76);
        }
        field1438++;
        return this.field1417.method583((byte) 79);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)J")
    public final long method444(int arg0) {
        if (arg0 != 31549) {
            method450(-85, null, null, true);
        }
        field1439++;
        return this.field1437;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1423++;
        class43 var10 = (class43) class120.field2789.method979(arg0 - 126);
        class43 var11 = null;
        while (var10 != null) {
            if (var10.field1110 == arg9 && var10.field1102 == arg2 && var10.field1099 == arg7 && var10.field1108 == arg4) {
                var11 = var10;
                break;
            }
            var10 = (class43) class120.field2789.method983(18485);
        }
        if (var11 == null) {
            var11 = new class43();
            var11.field1108 = arg4;
            var11.field1099 = arg7;
            var11.field1110 = arg9;
            var11.field1102 = arg2;
            class53.method375(var11, 18278);
            class120.field2789.method976(var11, (byte) -123);
        }
        var11.field1101 = arg6;
        if (arg0 == -1) {
            var11.field1095 = arg3;
            var11.field1100 = arg5;
            var11.field1098 = arg1;
            var11.field1103 = arg8;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII)V")
    public final void method446(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1435++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (arg1 != 2094) {
                field1442 = null;
            }
            if (this.field1421 != -1L && this.field1429 >= this.field1421 && (long) this.field1426 + this.field1421 >= this.field1429 - -((long) arg2)) {
                class45.method333(this.field1420, (int) (this.field1429 - this.field1421), arg0, arg3, arg2);
                this.field1429 += arg2;
                return;
            }
            long var5 = this.field1429;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field1429 >= this.field1430 && this.field1429 < (long) this.field1433 + this.field1430) {
                int var9 = (int) ((long) this.field1433 + this.field1430 - this.field1429);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class45.method333(this.field1419, (int) (this.field1429 - this.field1430), arg0, arg3, var9);
                this.field1429 += var9;
                arg2 -= var9;
                arg3 += var9;
            }
            if (arg2 > this.field1419.length) {
                this.field1417.method586(87, this.field1429);
                this.field1425 = this.field1429;
                while (arg2 > 0) {
                    int var11 = this.field1417.method585((byte) -100, arg3, arg0, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field1425 += var11;
                    this.field1429 += var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method447((byte) -106);
                int var10 = arg2;
                if (this.field1433 < arg2) {
                    var10 = this.field1433;
                }
                arg2 -= var10;
                class45.method333(this.field1419, 0, arg0, arg3, var10);
                this.field1429 += var10;
                arg3 += var10;
            }
            if (this.field1421 != -1L) {
                if (this.field1429 < this.field1421 && arg2 > 0) {
                    int var12 = arg3 + (int) (this.field1421 - this.field1429);
                    if (arg2 + arg3 < var12) {
                        var12 = arg3 + arg2;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        arg2--;
                        this.field1429++;
                    }
                }
                long var13 = -1L;
                if (this.field1421 >= var5 && this.field1421 < (long) var8 + var5) {
                    var13 = this.field1421;
                } else if (this.field1421 <= var5 && this.field1421 + (long) this.field1426 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1426 + this.field1421 && (long) this.field1426 + this.field1421 <= (long) var8 + var5) {
                    var15 = (long) this.field1426 + this.field1421;
                } else if (this.field1421 < (long) var8 + var5 && (long) this.field1426 + this.field1421 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class45.method333(this.field1420, (int) (var13 - this.field1421), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field1429 < var15) {
                        arg2 = (int) ((long) arg2 + this.field1429 - var15);
                        this.field1429 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1425 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    private final void method447(byte arg0) throws IOException {
        this.field1433 = 0;
        if (this.field1429 != this.field1425) {
            this.field1417.method586(114, this.field1429);
            this.field1425 = this.field1429;
        }
        if (arg0 != -106) {
            return;
        }
        this.field1430 = this.field1429;
        field1416++;
        while (this.field1419.length > this.field1433) {
            int var2 = this.field1417.method585((byte) -100, this.field1433, this.field1419, this.field1419.length - this.field1433);
            if (var2 == -1) {
                break;
            }
            this.field1425 += var2;
            this.field1433 += var2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method448(int arg0) {
        field1441 = null;
        field1428 = null;
        if (arg0 <= 76) {
            method450(7, null, null, false);
        }
        field1415 = null;
        field1440 = null;
        field1447 = null;
        field1442 = null;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([BIII)V")
    public final void method449(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1446++;
        try {
            if (this.field1437 < (long) arg2 + this.field1429) {
                this.field1437 = (long) arg2 + this.field1429;
            }
            if (this.field1421 != -1L && (this.field1421 > this.field1429 || (long) this.field1426 + this.field1421 < this.field1429)) {
                this.method442(255);
            }
            if (this.field1421 != -1L && this.field1429 + (long) arg2 > (long) this.field1420.length + this.field1421) {
                int var5 = (int) (this.field1421 + (long) this.field1420.length - this.field1429);
                class45.method333(arg0, arg3, this.field1420, (int) (this.field1429 - this.field1421), var5);
                arg3 += var5;
                this.field1429 += var5;
                this.field1426 = this.field1420.length;
                arg2 -= var5;
                this.method442(255);
            }
            if (arg2 > this.field1420.length) {
                long var6 = -1L;
                if (this.field1429 != this.field1425) {
                    this.field1417.method586(101, this.field1429);
                    this.field1425 = this.field1429;
                }
                long var8 = -1L;
                this.field1417.method587(arg3, arg0, arg2, true);
                this.field1425 += arg2;
                if (this.field1425 > this.field1448) {
                    this.field1448 = this.field1425;
                }
                if (this.field1430 < this.field1429 + (long) arg2 && (long) this.field1433 + this.field1430 >= (long) arg2 + this.field1429) {
                    var8 = (long) arg2 + this.field1429;
                } else if ((long) this.field1433 + this.field1430 > this.field1429 && (long) arg2 + this.field1429 >= (long) this.field1433 + this.field1430) {
                    var8 = this.field1430 + (long) this.field1433;
                }
                if (this.field1429 >= this.field1430 && (long) this.field1433 + this.field1430 > this.field1429) {
                    var6 = this.field1429;
                } else if (this.field1430 >= this.field1429 && (long) arg2 + this.field1429 > this.field1430) {
                    var6 = this.field1430;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class45.method333(arg0, (int) (var6 + (long) arg3 - this.field1429), this.field1419, (int) (var6 - this.field1430), var10);
                }
                this.field1429 += arg2;
            } else if (~arg2 < arg1) {
                if (this.field1421 == -1L) {
                    this.field1421 = this.field1429;
                }
                class45.method333(arg0, arg3, this.field1420, (int) (this.field1429 - this.field1421), arg2);
                this.field1429 += arg2;
                if (this.field1429 - this.field1421 > (long) this.field1426) {
                    this.field1426 = (int) (this.field1429 - this.field1421);
                }
            }
        } catch (IOException var12) {
            this.field1425 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILef;Lef;Z)V")
    public static final void method450(int arg0, class35 arg1, class35 arg2, boolean arg3) {
        class39.field1014 = arg2;
        client.field609 = arg1;
        if (arg0 != -1) {
            method450(-41, null, null, false);
        }
        class83.field2032 = arg3;
        field1424++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BJ)V")
    public final void method451(byte arg0, long arg1) throws IOException {
        if (arg0 > -43) {
            return;
        }
        field1427++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method443((byte) 45));
        }
        this.field1429 = arg1;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ll;II)V")
    public class57(class76 arg0, int arg1, int arg2) throws IOException {
        this.field1417 = arg0;
        this.field1437 = this.field1448 = arg0.method582(-29248);
        this.field1429 = 0L;
        this.field1420 = new byte[arg2];
        this.field1419 = new byte[arg1];
    }
}
